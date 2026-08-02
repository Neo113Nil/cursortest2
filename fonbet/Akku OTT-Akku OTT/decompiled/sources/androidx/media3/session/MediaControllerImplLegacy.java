package androidx.media3.session;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.session.MediaController;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.FlagSet;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Rating;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.Util;
import androidx.media3.session.LegacyConversions;
import androidx.media3.session.MediaController;
import androidx.media3.session.MediaControllerImplLegacy;
import androidx.media3.session.legacy.MediaBrowserCompat;
import androidx.media3.session.legacy.MediaControllerCompat;
import androidx.media3.session.legacy.MediaMetadataCompat;
import androidx.media3.session.legacy.MediaSessionCompat;
import androidx.media3.session.legacy.PlaybackStateCompat;
import com.google.common.collect.G;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
class MediaControllerImplLegacy implements MediaController.MediaControllerImpl {
    private static final String TAG = "MCImplLegacy";
    private static final long WAIT_TIME_MS_FOR_COMPAT_EXTRA_BINDER = 500;
    private final androidx.media3.common.util.BitmapLoader bitmapLoader;

    @Nullable
    private MediaBrowserCompat browserCompat;
    private final com.google.common.collect.G<CommandButton> commandButtonsForMediaItems;
    private boolean connected;
    private final Bundle connectionHints;
    final Context context;

    @Nullable
    private MediaControllerCompat controllerCompat;
    private final ControllerCompatCallback controllerCompatCallback;
    private boolean hasPendingExtrasChange;
    private final MediaController instance;
    private final ListenerSet<Player.Listener> listeners;
    private final long platformSessionCallbackAggregationTimeoutMs;
    private boolean released;
    private final SessionToken token;
    private LegacyPlayerInfo legacyPlayerInfo = new LegacyPlayerInfo();
    private LegacyPlayerInfo pendingLegacyPlayerInfo = new LegacyPlayerInfo();
    private ControllerInfo controllerInfo = new ControllerInfo();
    private long currentPositionMs = -9223372036854775807L;
    private long lastSetPlayWhenReadyCalledTimeMs = -9223372036854775807L;

    public class ConnectionCallback extends MediaBrowserCompat.ConnectionCallback {
        private ConnectionCallback() {
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.ConnectionCallback
        public void onConnected() {
            MediaBrowserCompat browserCompat = MediaControllerImplLegacy.this.getBrowserCompat();
            if (browserCompat != null) {
                MediaControllerImplLegacy.this.connectToSession(browserCompat.getSessionToken());
            }
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.ConnectionCallback
        public void onConnectionFailed() {
            MediaControllerImplLegacy.this.getInstance().release();
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.ConnectionCallback
        public void onConnectionSuspended() {
            MediaControllerImplLegacy.this.getInstance().release();
        }
    }

    public final class ControllerCompatCallback extends MediaControllerCompat.Callback {
        private static final int MSG_HANDLE_PENDING_UPDATES = 1;
        private final Handler pendingChangesHandler;

        public ControllerCompatCallback(Looper looper) {
            this.pendingChangesHandler = new Handler(looper, new Handler.Callback() { // from class: androidx.media3.session.c2
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    boolean lambda$new$0;
                    lambda$new$0 = MediaControllerImplLegacy.ControllerCompatCallback.this.lambda$new$0(message);
                    return lambda$new$0;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean lambda$new$0(Message message) {
            if (message.what == 1) {
                MediaControllerImplLegacy mediaControllerImplLegacy = MediaControllerImplLegacy.this;
                mediaControllerImplLegacy.handleNewLegacyParameters(false, mediaControllerImplLegacy.pendingLegacyPlayerInfo);
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptioningEnabledChanged$2(boolean z, MediaController.Listener listener) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("androidx.media3.session.ARGUMENT_CAPTIONING_ENABLED", z);
            MediaControllerImplLegacy.ignoreFuture(listener.onCustomCommand(MediaControllerImplLegacy.this.getInstance(), new SessionCommand("androidx.media3.session.SESSION_COMMAND_ON_CAPTIONING_ENABLED_CHANGED", Bundle.EMPTY), bundle));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onSessionEvent$1(String str, Bundle bundle, MediaController.Listener listener) {
            MediaController mediaControllerImplLegacy = MediaControllerImplLegacy.this.getInstance();
            Bundle bundle2 = Bundle.EMPTY;
            SessionCommand sessionCommand = new SessionCommand(str, bundle2);
            if (bundle == null) {
                bundle = bundle2;
            }
            MediaControllerImplLegacy.ignoreFuture(listener.onCustomCommand(mediaControllerImplLegacy, sessionCommand, bundle));
        }

        private void startWaitingForPendingChanges() {
            if (this.pendingChangesHandler.hasMessages(1)) {
                return;
            }
            this.pendingChangesHandler.sendEmptyMessageDelayed(1, MediaControllerImplLegacy.this.platformSessionCallbackAggregationTimeoutMs);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.Callback
        public void onAudioInfoChanged(@Nullable MediaControllerCompat.PlaybackInfo playbackInfo) {
            MediaControllerImplLegacy mediaControllerImplLegacy = MediaControllerImplLegacy.this;
            mediaControllerImplLegacy.pendingLegacyPlayerInfo = mediaControllerImplLegacy.pendingLegacyPlayerInfo.copyWithPlaybackInfoCompat(playbackInfo);
            startWaitingForPendingChanges();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.Callback
        public void onCaptioningEnabledChanged(final boolean z) {
            MediaControllerImplLegacy.this.getInstance().notifyControllerListener(new Consumer() { // from class: androidx.media3.session.b2
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    MediaControllerImplLegacy.ControllerCompatCallback.this.lambda$onCaptioningEnabledChanged$2(z, (MediaController.Listener) obj);
                }
            });
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.Callback
        public void onExtrasChanged(@Nullable Bundle bundle) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            MediaControllerImplLegacy mediaControllerImplLegacy = MediaControllerImplLegacy.this;
            mediaControllerImplLegacy.pendingLegacyPlayerInfo = mediaControllerImplLegacy.pendingLegacyPlayerInfo.copyWithSessionExtras(bundle);
            MediaControllerImplLegacy.this.hasPendingExtrasChange = true;
            startWaitingForPendingChanges();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.Callback
        public void onMetadataChanged(@Nullable MediaMetadataCompat mediaMetadataCompat) {
            MediaControllerImplLegacy mediaControllerImplLegacy = MediaControllerImplLegacy.this;
            mediaControllerImplLegacy.pendingLegacyPlayerInfo = mediaControllerImplLegacy.pendingLegacyPlayerInfo.copyWithMediaMetadataCompat(mediaMetadataCompat);
            startWaitingForPendingChanges();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.Callback
        public void onPlaybackStateChanged(@Nullable PlaybackStateCompat playbackStateCompat) {
            MediaControllerImplLegacy mediaControllerImplLegacy = MediaControllerImplLegacy.this;
            mediaControllerImplLegacy.pendingLegacyPlayerInfo = mediaControllerImplLegacy.pendingLegacyPlayerInfo.copyWithPlaybackStateCompat(MediaControllerImplLegacy.convertToSafePlaybackStateCompat(playbackStateCompat));
            startWaitingForPendingChanges();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.Callback
        public void onQueueChanged(@Nullable List<MediaSessionCompat.QueueItem> list) {
            MediaControllerImplLegacy mediaControllerImplLegacy = MediaControllerImplLegacy.this;
            mediaControllerImplLegacy.pendingLegacyPlayerInfo = mediaControllerImplLegacy.pendingLegacyPlayerInfo.copyWithQueue(MediaControllerImplLegacy.convertToNonNullQueueItemList(list));
            startWaitingForPendingChanges();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.Callback
        public void onQueueTitleChanged(@Nullable CharSequence charSequence) {
            MediaControllerImplLegacy mediaControllerImplLegacy = MediaControllerImplLegacy.this;
            mediaControllerImplLegacy.pendingLegacyPlayerInfo = mediaControllerImplLegacy.pendingLegacyPlayerInfo.copyWithQueueTitle(charSequence);
            startWaitingForPendingChanges();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.Callback
        public void onRepeatModeChanged(int i) {
            MediaControllerImplLegacy mediaControllerImplLegacy = MediaControllerImplLegacy.this;
            mediaControllerImplLegacy.pendingLegacyPlayerInfo = mediaControllerImplLegacy.pendingLegacyPlayerInfo.copyWithRepeatMode(i);
            startWaitingForPendingChanges();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.Callback
        public void onSessionDestroyed() {
            MediaControllerImplLegacy.this.getInstance().release();
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.Callback
        public void onSessionEvent(@Nullable final String str, @Nullable final Bundle bundle) {
            if (str == null) {
                return;
            }
            MediaControllerImplLegacy.this.getInstance().notifyControllerListener(new Consumer() { // from class: androidx.media3.session.d2
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    MediaControllerImplLegacy.ControllerCompatCallback.this.lambda$onSessionEvent$1(str, bundle, (MediaController.Listener) obj);
                }
            });
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.Callback
        public void onSessionReady() {
            if (!MediaControllerImplLegacy.this.connected) {
                MediaControllerImplLegacy.this.onConnected();
                return;
            }
            MediaControllerImplLegacy mediaControllerImplLegacy = MediaControllerImplLegacy.this;
            mediaControllerImplLegacy.pendingLegacyPlayerInfo = mediaControllerImplLegacy.pendingLegacyPlayerInfo.copyWithExtraBinderGetters(MediaControllerImplLegacy.convertToSafePlaybackStateCompat(MediaControllerImplLegacy.this.controllerCompat.getPlaybackState()), MediaControllerImplLegacy.this.controllerCompat.getRepeatMode(), MediaControllerImplLegacy.this.controllerCompat.getShuffleMode());
            onCaptioningEnabledChanged(MediaControllerImplLegacy.this.controllerCompat.isCaptioningEnabled());
            this.pendingChangesHandler.removeMessages(1);
            MediaControllerImplLegacy mediaControllerImplLegacy2 = MediaControllerImplLegacy.this;
            mediaControllerImplLegacy2.handleNewLegacyParameters(false, mediaControllerImplLegacy2.pendingLegacyPlayerInfo);
        }

        @Override // androidx.media3.session.legacy.MediaControllerCompat.Callback
        public void onShuffleModeChanged(int i) {
            MediaControllerImplLegacy mediaControllerImplLegacy = MediaControllerImplLegacy.this;
            mediaControllerImplLegacy.pendingLegacyPlayerInfo = mediaControllerImplLegacy.pendingLegacyPlayerInfo.copyWithShuffleMode(i);
            startWaitingForPendingChanges();
        }

        public void release() {
            this.pendingChangesHandler.removeCallbacksAndMessages(null);
        }
    }

    public MediaControllerImplLegacy(Context context, MediaController mediaController, SessionToken sessionToken, Bundle bundle, Looper looper, androidx.media3.common.util.BitmapLoader bitmapLoader, long j) {
        this.listeners = new ListenerSet<>(looper, Clock.DEFAULT, new V1(this));
        this.context = context;
        this.instance = mediaController;
        this.controllerCompatCallback = new ControllerCompatCallback(looper);
        this.token = sessionToken;
        this.connectionHints = bundle;
        this.bitmapLoader = bitmapLoader;
        this.platformSessionCallbackAggregationTimeoutMs = j;
        G.b bVar = com.google.common.collect.G.b;
        this.commandButtonsForMediaItems = com.google.common.collect.i0.e;
    }

    private void addQueueItems(final List<MediaItem> list, final int i) {
        final ArrayList arrayList = new ArrayList();
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        Runnable runnable = new Runnable() { // from class: androidx.media3.session.W1
            @Override // java.lang.Runnable
            public final void run() {
                MediaControllerImplLegacy.this.lambda$addQueueItems$4(atomicInteger, list, arrayList, i);
            }
        };
        for (int i2 = 0; i2 < list.size(); i2++) {
            byte[] bArr = list.get(i2).mediaMetadata.artworkData;
            if (bArr == null) {
                arrayList.add(null);
                runnable.run();
            } else {
                com.google.common.util.concurrent.u<Bitmap> decodeBitmap = this.bitmapLoader.decodeBitmap(bArr);
                arrayList.add(decodeBitmap);
                Handler handler = getInstance().applicationHandler;
                Objects.requireNonNull(handler);
                decodeBitmap.addListener(runnable, new androidx.browser.customtabs.f(handler));
            }
        }
    }

    private static ControllerInfo buildNewControllerInfo(boolean z, LegacyPlayerInfo legacyPlayerInfo, ControllerInfo controllerInfo, LegacyPlayerInfo legacyPlayerInfo2, @Nullable String str, long j, boolean z2, int i, long j2, @Nullable String str2, boolean z3, Context context) {
        int findQueueItemIndex;
        MediaMetadata mediaMetadata;
        SessionCommands convertToSessionCommands;
        com.google.common.collect.G<CommandButton> convertToMediaButtonPreferences;
        int i2;
        List<MediaSessionCompat.QueueItem> list = legacyPlayerInfo.queue;
        List<MediaSessionCompat.QueueItem> list2 = legacyPlayerInfo2.queue;
        boolean z4 = list != list2;
        QueueTimeline create = z4 ? QueueTimeline.create(list2) : ((QueueTimeline) controllerInfo.playerInfo.timeline).copy();
        boolean z5 = legacyPlayerInfo.mediaMetadataCompat != legacyPlayerInfo2.mediaMetadataCompat || z;
        long activeQueueId = getActiveQueueId(legacyPlayerInfo.playbackStateCompat);
        long activeQueueId2 = getActiveQueueId(legacyPlayerInfo2.playbackStateCompat);
        boolean z6 = activeQueueId != activeQueueId2 || z;
        long convertToDurationMs = LegacyConversions.convertToDurationMs(legacyPlayerInfo2.mediaMetadataCompat);
        boolean z7 = z4;
        if (z5 || z6 || z7) {
            boolean z8 = z5;
            findQueueItemIndex = findQueueItemIndex(legacyPlayerInfo2.queue, activeQueueId2);
            MediaMetadataCompat mediaMetadataCompat = legacyPlayerInfo2.mediaMetadataCompat;
            boolean z9 = mediaMetadataCompat != null;
            MediaMetadata convertToMediaMetadata = (z9 && z8) ? LegacyConversions.convertToMediaMetadata(mediaMetadataCompat, i) : (z9 || !z6) ? controllerInfo.playerInfo.mediaMetadata : findQueueItemIndex == -1 ? MediaMetadata.EMPTY : LegacyConversions.convertToMediaMetadata(legacyPlayerInfo2.queue.get(findQueueItemIndex).getDescription(), i);
            if (findQueueItemIndex != -1 || !z8) {
                if (findQueueItemIndex != -1) {
                    create = create.copyWithClearedFakeMediaItem();
                    if (z9) {
                        create = create.copyWithNewMediaItem(findQueueItemIndex, LegacyConversions.convertToMediaItem(((MediaItem) Assertions.checkNotNull(create.getMediaItemAt(findQueueItemIndex))).mediaId, legacyPlayerInfo2.mediaMetadataCompat, i), convertToDurationMs);
                    }
                    mediaMetadata = convertToMediaMetadata;
                }
                findQueueItemIndex = 0;
                mediaMetadata = convertToMediaMetadata;
            } else if (z9) {
                Log.w(TAG, "Adding a fake MediaItem at the end of the list because there's no QueueItem with the active queue id and current Timeline should have currently playing MediaItem.");
                create = create.copyWithFakeMediaItem(LegacyConversions.convertToMediaItem(legacyPlayerInfo2.mediaMetadataCompat, i), convertToDurationMs);
                findQueueItemIndex = create.getWindowCount() - 1;
                mediaMetadata = convertToMediaMetadata;
            } else {
                create = create.copyWithClearedFakeMediaItem();
                findQueueItemIndex = 0;
                mediaMetadata = convertToMediaMetadata;
            }
        } else {
            PlayerInfo playerInfo = controllerInfo.playerInfo;
            findQueueItemIndex = playerInfo.sessionPositionInfo.positionInfo.mediaItemIndex;
            mediaMetadata = playerInfo.mediaMetadata;
        }
        QueueTimeline queueTimeline = create;
        int i3 = findQueueItemIndex;
        MediaControllerCompat.PlaybackInfo playbackInfo = legacyPlayerInfo2.playbackInfoCompat;
        Player.Commands convertToPlayerCommands = LegacyConversions.convertToPlayerCommands(legacyPlayerInfo2.playbackStateCompat, playbackInfo != null ? playbackInfo.getVolumeControl() : 0, j, z2);
        CharSequence charSequence = legacyPlayerInfo.queueTitle;
        CharSequence charSequence2 = legacyPlayerInfo2.queueTitle;
        MediaMetadata convertToMediaMetadata2 = charSequence == charSequence2 ? controllerInfo.playerInfo.playlistMetadata : LegacyConversions.convertToMediaMetadata(charSequence2);
        int convertToRepeatMode = LegacyConversions.convertToRepeatMode(legacyPlayerInfo2.repeatMode);
        boolean convertToShuffleModeEnabled = LegacyConversions.convertToShuffleModeEnabled(legacyPlayerInfo2.shuffleMode);
        PlaybackStateCompat playbackStateCompat = legacyPlayerInfo.playbackStateCompat;
        PlaybackStateCompat playbackStateCompat2 = legacyPlayerInfo2.playbackStateCompat;
        if (playbackStateCompat != playbackStateCompat2 || z3) {
            convertToSessionCommands = LegacyConversions.convertToSessionCommands(playbackStateCompat2, z2);
            convertToMediaButtonPreferences = LegacyConversions.convertToMediaButtonPreferences(legacyPlayerInfo2.playbackStateCompat, convertToPlayerCommands, legacyPlayerInfo2.sessionExtras);
        } else {
            convertToSessionCommands = controllerInfo.availableSessionCommands;
            convertToMediaButtonPreferences = controllerInfo.mediaButtonPreferences;
        }
        SessionCommands sessionCommands = convertToSessionCommands;
        com.google.common.collect.G<CommandButton> g = convertToMediaButtonPreferences;
        PlaybackException convertToPlaybackException = LegacyConversions.convertToPlaybackException(legacyPlayerInfo2.playbackStateCompat, context);
        SessionError convertToSessionError = LegacyConversions.convertToSessionError(legacyPlayerInfo2.playbackStateCompat, context);
        long convertToCurrentPositionMs = LegacyConversions.convertToCurrentPositionMs(legacyPlayerInfo2.playbackStateCompat, legacyPlayerInfo2.mediaMetadataCompat, j2);
        long convertToBufferedPositionMs = LegacyConversions.convertToBufferedPositionMs(legacyPlayerInfo2.playbackStateCompat, legacyPlayerInfo2.mediaMetadataCompat, j2);
        int convertToBufferedPercentage = LegacyConversions.convertToBufferedPercentage(legacyPlayerInfo2.playbackStateCompat, legacyPlayerInfo2.mediaMetadataCompat, j2);
        long convertToTotalBufferedDurationMs = LegacyConversions.convertToTotalBufferedDurationMs(legacyPlayerInfo2.playbackStateCompat, legacyPlayerInfo2.mediaMetadataCompat, j2);
        boolean convertToIsPlayingAd = LegacyConversions.convertToIsPlayingAd(legacyPlayerInfo2.mediaMetadataCompat);
        PlaybackParameters convertToPlaybackParameters = LegacyConversions.convertToPlaybackParameters(legacyPlayerInfo2.playbackStateCompat);
        AudioAttributes convertToAudioAttributes = LegacyConversions.convertToAudioAttributes(legacyPlayerInfo2.playbackInfoCompat);
        boolean convertToPlayWhenReady = LegacyConversions.convertToPlayWhenReady(legacyPlayerInfo2.playbackStateCompat);
        try {
            i2 = LegacyConversions.convertToPlaybackState(legacyPlayerInfo2.playbackStateCompat, legacyPlayerInfo2.mediaMetadataCompat, j2);
        } catch (LegacyConversions.ConversionException unused) {
            Log.e(TAG, "Received invalid playback state " + legacyPlayerInfo2.playbackStateCompat.getState() + " from package " + str + ". Keeping the previous state.");
            i2 = controllerInfo.playerInfo.playbackState;
        }
        int i4 = i2;
        boolean convertToIsPlaying = LegacyConversions.convertToIsPlaying(legacyPlayerInfo2.playbackStateCompat);
        DeviceInfo convertToDeviceInfo = LegacyConversions.convertToDeviceInfo(legacyPlayerInfo2.playbackInfoCompat, str2);
        int convertToDeviceVolume = LegacyConversions.convertToDeviceVolume(legacyPlayerInfo2.playbackInfoCompat);
        boolean convertToIsDeviceMuted = LegacyConversions.convertToIsDeviceMuted(legacyPlayerInfo2.playbackInfoCompat);
        PlayerInfo playerInfo2 = controllerInfo.playerInfo;
        return createControllerInfo(queueTimeline, mediaMetadata, i3, convertToMediaMetadata2, convertToRepeatMode, convertToShuffleModeEnabled, sessionCommands, convertToPlayerCommands, g, legacyPlayerInfo2.sessionExtras, convertToPlaybackException, convertToSessionError, convertToDurationMs, convertToCurrentPositionMs, convertToBufferedPositionMs, convertToBufferedPercentage, convertToTotalBufferedDurationMs, convertToIsPlayingAd, convertToPlaybackParameters, convertToAudioAttributes, convertToPlayWhenReady, i4, convertToIsPlaying, convertToDeviceInfo, convertToDeviceVolume, convertToIsDeviceMuted, playerInfo2.seekBackIncrementMs, playerInfo2.seekForwardIncrementMs, playerInfo2.maxSeekToPreviousPositionMs);
    }

    private static int calculateCurrentItemIndexAfterAddItems(int i, int i2, int i3) {
        return i < i2 ? i : i + i3;
    }

    private static int calculateCurrentItemIndexAfterRemoveItems(int i, int i2, int i3) {
        int i4 = i3 - i2;
        if (i < i2) {
            return i;
        }
        if (i < i3) {
            return -1;
        }
        return i - i4;
    }

    private static Pair<Integer, Integer> calculateDiscontinuityAndTransitionReason(LegacyPlayerInfo legacyPlayerInfo, ControllerInfo controllerInfo, LegacyPlayerInfo legacyPlayerInfo2, ControllerInfo controllerInfo2, long j) {
        Integer num = 3;
        Integer num2 = 0;
        boolean isEmpty = controllerInfo.playerInfo.timeline.isEmpty();
        boolean isEmpty2 = controllerInfo2.playerInfo.timeline.isEmpty();
        if (!isEmpty || !isEmpty2) {
            if (!isEmpty || isEmpty2) {
                MediaItem mediaItem = (MediaItem) Assertions.checkStateNotNull(controllerInfo.playerInfo.getCurrentMediaItem());
                if (!((QueueTimeline) controllerInfo2.playerInfo.timeline).contains(mediaItem)) {
                    num2 = 4;
                } else if (mediaItem.equals(controllerInfo2.playerInfo.getCurrentMediaItem())) {
                    long convertToCurrentPositionMs = LegacyConversions.convertToCurrentPositionMs(legacyPlayerInfo.playbackStateCompat, legacyPlayerInfo.mediaMetadataCompat, j);
                    long convertToCurrentPositionMs2 = LegacyConversions.convertToCurrentPositionMs(legacyPlayerInfo2.playbackStateCompat, legacyPlayerInfo2.mediaMetadataCompat, j);
                    if (convertToCurrentPositionMs2 == 0 && controllerInfo2.playerInfo.repeatMode == 1) {
                        num = num2;
                    } else if (Math.abs(convertToCurrentPositionMs - convertToCurrentPositionMs2) > 100) {
                        num2 = 5;
                        num = null;
                    }
                } else {
                    num = 1;
                }
            }
            return Pair.create(num2, num);
        }
        num = null;
        num2 = null;
        return Pair.create(num2, num);
    }

    private void connectToService() {
        getInstance().runOnApplicationLooper(new Runnable() { // from class: androidx.media3.session.S1
            @Override // java.lang.Runnable
            public final void run() {
                MediaControllerImplLegacy.this.lambda$connectToService$3();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectToSession(final MediaSessionCompat.Token token) {
        getInstance().runOnApplicationLooper(new Runnable() { // from class: androidx.media3.session.O1
            @Override // java.lang.Runnable
            public final void run() {
                MediaControllerImplLegacy.this.lambda$connectToSession$1(token);
            }
        });
        getInstance().applicationHandler.postDelayed(new Runnable() { // from class: androidx.media3.session.U1
            @Override // java.lang.Runnable
            public final void run() {
                MediaControllerImplLegacy.this.lambda$connectToSession$2();
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<MediaSessionCompat.QueueItem> convertToNonNullQueueItemList(@Nullable List<MediaSessionCompat.QueueItem> list) {
        return list == null ? Collections.EMPTY_LIST : MediaUtils.removeNullElements(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static PlaybackStateCompat convertToSafePlaybackStateCompat(@Nullable PlaybackStateCompat playbackStateCompat) {
        if (playbackStateCompat == null) {
            return null;
        }
        if (playbackStateCompat.getPlaybackSpeed() > 0.0f) {
            return playbackStateCompat;
        }
        Log.w(TAG, "Adjusting playback speed to 1.0f because negative playback speed isn't supported.");
        return new PlaybackStateCompat.Builder(playbackStateCompat).setState(playbackStateCompat.getState(), playbackStateCompat.getPosition(), 1.0f, playbackStateCompat.getLastPositionUpdateTime()).build();
    }

    private static ControllerInfo createControllerInfo(QueueTimeline queueTimeline, MediaMetadata mediaMetadata, int i, MediaMetadata mediaMetadata2, int i2, boolean z, SessionCommands sessionCommands, Player.Commands commands, com.google.common.collect.G<CommandButton> g, Bundle bundle, @Nullable PlaybackException playbackException, @Nullable SessionError sessionError, long j, long j2, long j3, int i3, long j4, boolean z2, PlaybackParameters playbackParameters, AudioAttributes audioAttributes, boolean z3, int i4, boolean z4, DeviceInfo deviceInfo, int i5, boolean z5, long j5, long j6, long j7) {
        SessionPositionInfo sessionPositionInfo = new SessionPositionInfo(createPositionInfo(i, queueTimeline.getMediaItemAt(i), j2, z2), z2, SystemClock.elapsedRealtime(), j, j3, i3, j4, -9223372036854775807L, j, j3);
        Player.PositionInfo positionInfo = SessionPositionInfo.DEFAULT_POSITION_INFO;
        return new ControllerInfo(new PlayerInfo(playbackException, 0, sessionPositionInfo, positionInfo, positionInfo, 0, playbackParameters, i2, z, VideoSize.UNKNOWN, queueTimeline, 0, mediaMetadata2, 1.0f, audioAttributes, CueGroup.EMPTY_TIME_ZERO, deviceInfo, i5, z5, z3, 1, 0, i4, z4, false, mediaMetadata, j5, j6, j7, Tracks.EMPTY, TrackSelectionParameters.DEFAULT), sessionCommands, commands, g, bundle, sessionError);
    }

    private static Player.PositionInfo createPositionInfo(int i, @Nullable MediaItem mediaItem, long j, boolean z) {
        return new Player.PositionInfo(null, i, mediaItem, null, i, j, j, z ? 0 : -1, z ? 0 : -1);
    }

    private static SessionPositionInfo createSessionPositionInfo(Player.PositionInfo positionInfo, boolean z, long j, long j2, int i, long j3) {
        return new SessionPositionInfo(positionInfo, z, SystemClock.elapsedRealtime(), j, j2, i, j3, -9223372036854775807L, j, j2);
    }

    private static int findQueueItemIndex(@Nullable List<MediaSessionCompat.QueueItem> list, long j) {
        if (list != null && j != -1) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getQueueId() == j) {
                    return i;
                }
            }
        }
        return -1;
    }

    private static long getActiveQueueId(@Nullable PlaybackStateCompat playbackStateCompat) {
        if (playbackStateCompat == null) {
            return -1L;
        }
        return playbackStateCompat.getActiveQueueItemId();
    }

    private static Bundle getOrEmptyBundle(@Nullable Bundle bundle) {
        return bundle == null ? Bundle.EMPTY : bundle;
    }

    @Nullable
    private static String getRoutingControllerId(MediaControllerCompat mediaControllerCompat) {
        MediaController.PlaybackInfo playbackInfo;
        String volumeControlId;
        if (Build.VERSION.SDK_INT < 30 || (playbackInfo = ((android.media.session.MediaController) mediaControllerCompat.getMediaController()).getPlaybackInfo()) == null) {
            return null;
        }
        volumeControlId = playbackInfo.getVolumeControlId();
        return volumeControlId;
    }

    private void handleBitmapFuturesAllCompletedAndAddQueueItems(List<com.google.common.util.concurrent.u<Bitmap>> list, List<MediaItem> list2, int i) {
        Bitmap bitmap;
        for (int i2 = 0; i2 < list.size(); i2++) {
            com.google.common.util.concurrent.u<Bitmap> uVar = list.get(i2);
            if (uVar != null) {
                try {
                    bitmap = (Bitmap) com.google.common.util.concurrent.o.b(uVar);
                } catch (CancellationException | ExecutionException e) {
                    Log.d(TAG, "Failed to get bitmap", e);
                }
                this.controllerCompat.addQueueItem(LegacyConversions.convertToMediaDescriptionCompat(list2.get(i2), bitmap), i + i2);
            }
            bitmap = null;
            this.controllerCompat.addQueueItem(LegacyConversions.convertToMediaDescriptionCompat(list2.get(i2), bitmap), i + i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleNewLegacyParameters(boolean z, final LegacyPlayerInfo legacyPlayerInfo) {
        if (this.released || !this.connected) {
            return;
        }
        ControllerInfo buildNewControllerInfo = buildNewControllerInfo(z, this.legacyPlayerInfo, this.controllerInfo, legacyPlayerInfo, this.controllerCompat.getPackageName(), this.controllerCompat.getFlags(), this.controllerCompat.isSessionReady(), this.controllerCompat.getRatingType(), getInstance().getTimeDiffMs(), getRoutingControllerId(this.controllerCompat), this.hasPendingExtrasChange, this.context);
        Pair<Integer, Integer> calculateDiscontinuityAndTransitionReason = calculateDiscontinuityAndTransitionReason(this.legacyPlayerInfo, this.controllerInfo, legacyPlayerInfo, buildNewControllerInfo, getInstance().getTimeDiffMs());
        updateControllerInfo(z, legacyPlayerInfo, true, buildNewControllerInfo, (Integer) calculateDiscontinuityAndTransitionReason.first, (Integer) calculateDiscontinuityAndTransitionReason.second);
        if (this.hasPendingExtrasChange) {
            this.hasPendingExtrasChange = false;
            getInstance().notifyControllerListener(new Consumer() { // from class: androidx.media3.session.T1
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    MediaControllerImplLegacy.this.lambda$handleNewLegacyParameters$5(legacyPlayerInfo, (MediaController.Listener) obj);
                }
            });
        }
    }

    private boolean hasMedia() {
        return !this.controllerInfo.playerInfo.timeline.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void ignoreFuture(Future<T> future) {
    }

    private void initializeLegacyPlaylist() {
        Timeline.Window window = new Timeline.Window();
        Assertions.checkState(isPrepared() && hasMedia());
        PlayerInfo playerInfo = this.controllerInfo.playerInfo;
        QueueTimeline queueTimeline = (QueueTimeline) playerInfo.timeline;
        int i = playerInfo.sessionPositionInfo.positionInfo.mediaItemIndex;
        MediaItem mediaItem = queueTimeline.getWindow(i, window).mediaItem;
        if (queueTimeline.getQueueId(i) == -1) {
            MediaItem.RequestMetadata requestMetadata = mediaItem.requestMetadata;
            if (requestMetadata.mediaUri != null) {
                if (this.controllerInfo.playerInfo.playWhenReady) {
                    MediaControllerCompat.TransportControls transportControls = this.controllerCompat.getTransportControls();
                    MediaItem.RequestMetadata requestMetadata2 = mediaItem.requestMetadata;
                    transportControls.playFromUri(requestMetadata2.mediaUri, getOrEmptyBundle(requestMetadata2.extras));
                } else {
                    MediaControllerCompat.TransportControls transportControls2 = this.controllerCompat.getTransportControls();
                    MediaItem.RequestMetadata requestMetadata3 = mediaItem.requestMetadata;
                    transportControls2.prepareFromUri(requestMetadata3.mediaUri, getOrEmptyBundle(requestMetadata3.extras));
                }
            } else if (requestMetadata.searchQuery != null) {
                if (this.controllerInfo.playerInfo.playWhenReady) {
                    MediaControllerCompat.TransportControls transportControls3 = this.controllerCompat.getTransportControls();
                    MediaItem.RequestMetadata requestMetadata4 = mediaItem.requestMetadata;
                    transportControls3.playFromSearch(requestMetadata4.searchQuery, getOrEmptyBundle(requestMetadata4.extras));
                } else {
                    MediaControllerCompat.TransportControls transportControls4 = this.controllerCompat.getTransportControls();
                    MediaItem.RequestMetadata requestMetadata5 = mediaItem.requestMetadata;
                    transportControls4.prepareFromSearch(requestMetadata5.searchQuery, getOrEmptyBundle(requestMetadata5.extras));
                }
            } else if (this.controllerInfo.playerInfo.playWhenReady) {
                this.controllerCompat.getTransportControls().playFromMediaId(mediaItem.mediaId, getOrEmptyBundle(mediaItem.requestMetadata.extras));
            } else {
                this.controllerCompat.getTransportControls().prepareFromMediaId(mediaItem.mediaId, getOrEmptyBundle(mediaItem.requestMetadata.extras));
            }
        } else if (this.controllerInfo.playerInfo.playWhenReady) {
            this.controllerCompat.getTransportControls().play();
        } else {
            this.controllerCompat.getTransportControls().prepare();
        }
        if (this.controllerInfo.playerInfo.sessionPositionInfo.positionInfo.positionMs != 0) {
            this.controllerCompat.getTransportControls().seekTo(this.controllerInfo.playerInfo.sessionPositionInfo.positionInfo.positionMs);
        }
        if (getAvailableCommands().contains(20)) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < queueTimeline.getWindowCount(); i2++) {
                if (i2 != i && queueTimeline.getQueueId(i2) == -1) {
                    arrayList.add(queueTimeline.getWindow(i2, window).mediaItem);
                }
            }
            addQueueItems(arrayList, 0);
        }
    }

    private boolean isPrepared() {
        return this.controllerInfo.playerInfo.playbackState != 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addQueueItems$4(AtomicInteger atomicInteger, List list, List list2, int i) {
        if (atomicInteger.incrementAndGet() == list.size()) {
            handleBitmapFuturesAllCompletedAndAddQueueItems(list2, list, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$connectToService$3() {
        MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(this.context, this.token.getComponentName(), new ConnectionCallback(), this.instance.getConnectionHints());
        this.browserCompat = mediaBrowserCompat;
        mediaBrowserCompat.connect();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$connectToSession$1(MediaSessionCompat.Token token) {
        MediaControllerCompat mediaControllerCompat = new MediaControllerCompat(this.context, token);
        this.controllerCompat = mediaControllerCompat;
        mediaControllerCompat.registerCallback(this.controllerCompatCallback, getInstance().applicationHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$connectToSession$2() {
        if (this.released || this.controllerCompat.isSessionReady()) {
            return;
        }
        onConnected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleNewLegacyParameters$5(LegacyPlayerInfo legacyPlayerInfo, MediaController.Listener listener) {
        listener.onExtrasChanged(getInstance(), legacyPlayerInfo.sessionExtras);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(Player.Listener listener, FlagSet flagSet) {
        listener.onEvents(getInstance(), new Player.Events(flagSet));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateControllerInfo$10(ControllerInfo controllerInfo, ControllerInfo controllerInfo2, Integer num, Player.Listener listener) {
        listener.onPositionDiscontinuity(controllerInfo.playerInfo.sessionPositionInfo.positionInfo, controllerInfo2.playerInfo.sessionPositionInfo.positionInfo, num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateControllerInfo$11(ControllerInfo controllerInfo, Integer num, Player.Listener listener) {
        listener.onMediaItemTransition(controllerInfo.playerInfo.getCurrentMediaItem(), num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateControllerInfo$14(Player.Listener listener) {
        listener.onMediaMetadataChanged(this.controllerInfo.playerInfo.mediaMetadata);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateControllerInfo$15(ControllerInfo controllerInfo, Player.Listener listener) {
        listener.onPlaybackStateChanged(controllerInfo.playerInfo.playbackState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateControllerInfo$16(ControllerInfo controllerInfo, Player.Listener listener) {
        listener.onPlayWhenReadyChanged(controllerInfo.playerInfo.playWhenReady, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateControllerInfo$17(ControllerInfo controllerInfo, Player.Listener listener) {
        listener.onIsPlayingChanged(controllerInfo.playerInfo.isPlaying);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateControllerInfo$18(ControllerInfo controllerInfo, Player.Listener listener) {
        listener.onPlaybackParametersChanged(controllerInfo.playerInfo.playbackParameters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateControllerInfo$19(ControllerInfo controllerInfo, Player.Listener listener) {
        listener.onRepeatModeChanged(controllerInfo.playerInfo.repeatMode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateControllerInfo$20(ControllerInfo controllerInfo, Player.Listener listener) {
        listener.onShuffleModeEnabledChanged(controllerInfo.playerInfo.shuffleModeEnabled);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateControllerInfo$21(ControllerInfo controllerInfo, Player.Listener listener) {
        listener.onAudioAttributesChanged(controllerInfo.playerInfo.audioAttributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateControllerInfo$22(ControllerInfo controllerInfo, Player.Listener listener) {
        listener.onDeviceInfoChanged(controllerInfo.playerInfo.deviceInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateControllerInfo$23(ControllerInfo controllerInfo, Player.Listener listener) {
        PlayerInfo playerInfo = controllerInfo.playerInfo;
        listener.onDeviceVolumeChanged(playerInfo.deviceVolume, playerInfo.deviceMuted);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateControllerInfo$24(ControllerInfo controllerInfo, Player.Listener listener) {
        listener.onAvailableCommandsChanged(controllerInfo.availablePlayerCommands);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateControllerInfo$25(ControllerInfo controllerInfo, MediaController.Listener listener) {
        listener.onAvailableSessionCommandsChanged(getInstance(), controllerInfo.availableSessionCommands);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateControllerInfo$26(ControllerInfo controllerInfo, MediaController.Listener listener) {
        ignoreFuture(listener.onSetCustomLayout(getInstance(), controllerInfo.mediaButtonPreferences));
        listener.onCustomLayoutChanged(getInstance(), controllerInfo.mediaButtonPreferences);
        listener.onMediaButtonPreferencesChanged(getInstance(), controllerInfo.mediaButtonPreferences);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateControllerInfo$27(ControllerInfo controllerInfo, MediaController.Listener listener) {
        listener.onError(getInstance(), controllerInfo.sessionError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateControllerInfo$6(ControllerInfo controllerInfo, MediaController.Listener listener) {
        ignoreFuture(listener.onSetCustomLayout(getInstance(), controllerInfo.mediaButtonPreferences));
        listener.onCustomLayoutChanged(getInstance(), controllerInfo.mediaButtonPreferences);
        listener.onMediaButtonPreferencesChanged(getInstance(), controllerInfo.mediaButtonPreferences);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateControllerInfo$7(final ControllerInfo controllerInfo) {
        getInstance().notifyControllerListener(new Consumer() { // from class: androidx.media3.session.R1
            @Override // androidx.media3.common.util.Consumer
            public final void accept(Object obj) {
                MediaControllerImplLegacy.this.lambda$updateControllerInfo$6(controllerInfo, (MediaController.Listener) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateControllerInfo$8(ControllerInfo controllerInfo, Player.Listener listener) {
        PlayerInfo playerInfo = controllerInfo.playerInfo;
        listener.onTimelineChanged(playerInfo.timeline, playerInfo.timelineChangeReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateControllerInfo$9(ControllerInfo controllerInfo, Player.Listener listener) {
        listener.onPlaylistMetadataChanged(controllerInfo.playerInfo.playlistMetadata);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void seekToInternal(int i, long j) {
        Integer num;
        Integer num2;
        int i2;
        long j2;
        long j3;
        long j4;
        PlayerInfo copyWithSessionPositionInfo;
        int i3 = i;
        long j5 = j;
        Assertions.checkArgument(i3 >= 0);
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        Timeline timeline = this.controllerInfo.playerInfo.timeline;
        if ((timeline.isEmpty() || i3 < timeline.getWindowCount()) && !isPlayingAd()) {
            if (i3 != currentMediaItemIndex) {
                long queueId = ((QueueTimeline) this.controllerInfo.playerInfo.timeline).getQueueId(i3);
                if (queueId != -1) {
                    this.controllerCompat.getTransportControls().skipToQueueItem(queueId);
                    num = 2;
                    long currentPosition = getCurrentPosition();
                    if (j5 != -9223372036854775807L) {
                        num2 = null;
                        j5 = currentPosition;
                    } else {
                        this.controllerCompat.getTransportControls().seekTo(j5);
                        num2 = 1;
                    }
                    if (num != null) {
                        long bufferedPosition = getBufferedPosition();
                        long duration = getDuration();
                        long max = j5 < currentPosition ? j5 : Math.max(j5, bufferedPosition);
                        j2 = max;
                        i2 = duration == -9223372036854775807L ? 0 : (int) ((100 * max) / duration);
                        j3 = max - j5;
                        j4 = duration;
                    } else {
                        i2 = 0;
                        j2 = 0;
                        j3 = 0;
                        j4 = -9223372036854775807L;
                    }
                    copyWithSessionPositionInfo = this.controllerInfo.playerInfo.copyWithSessionPositionInfo(createSessionPositionInfo(createPositionInfo(i3, timeline.isEmpty() ? timeline.getWindow(i3, new Timeline.Window()).mediaItem : null, j5, false), false, j4, j2, i2, j3));
                    if (copyWithSessionPositionInfo.playbackState != 1) {
                        copyWithSessionPositionInfo = copyWithSessionPositionInfo.copyWithPlaybackState(2, null);
                    }
                    PlayerInfo playerInfo = copyWithSessionPositionInfo;
                    ControllerInfo controllerInfo = this.controllerInfo;
                    updateStateMaskedControllerInfo(new ControllerInfo(playerInfo, controllerInfo.availableSessionCommands, controllerInfo.availablePlayerCommands, controllerInfo.mediaButtonPreferences, controllerInfo.sessionExtras, null), num2, num);
                }
                androidx.compose.runtime.collection.a.c(i3, "Cannot seek to new media item due to the missing queue Id at media item, mediaItemIndex=", TAG);
            }
            i3 = currentMediaItemIndex;
            num = null;
            long currentPosition2 = getCurrentPosition();
            if (j5 != -9223372036854775807L) {
            }
            if (num != null) {
            }
            copyWithSessionPositionInfo = this.controllerInfo.playerInfo.copyWithSessionPositionInfo(createSessionPositionInfo(createPositionInfo(i3, timeline.isEmpty() ? timeline.getWindow(i3, new Timeline.Window()).mediaItem : null, j5, false), false, j4, j2, i2, j3));
            if (copyWithSessionPositionInfo.playbackState != 1) {
            }
            PlayerInfo playerInfo2 = copyWithSessionPositionInfo;
            ControllerInfo controllerInfo2 = this.controllerInfo;
            updateStateMaskedControllerInfo(new ControllerInfo(playerInfo2, controllerInfo2.availableSessionCommands, controllerInfo2.availablePlayerCommands, controllerInfo2.mediaButtonPreferences, controllerInfo2.sessionExtras, null), num2, num);
        }
    }

    private void updateControllerInfo(boolean z, LegacyPlayerInfo legacyPlayerInfo, boolean z2, final ControllerInfo controllerInfo, @Nullable Integer num, @Nullable Integer num2) {
        LegacyPlayerInfo legacyPlayerInfo2 = this.legacyPlayerInfo;
        ControllerInfo controllerInfo2 = this.controllerInfo;
        if (legacyPlayerInfo2 != legacyPlayerInfo) {
            this.legacyPlayerInfo = new LegacyPlayerInfo(legacyPlayerInfo);
        }
        if (z2) {
            this.pendingLegacyPlayerInfo = this.legacyPlayerInfo;
        }
        this.controllerInfo = controllerInfo;
        if (z) {
            getInstance().notifyAccepted();
            if (controllerInfo2.mediaButtonPreferences.equals(controllerInfo.mediaButtonPreferences)) {
                return;
            }
            getInstance().applicationHandler.post(new X1(0, this, controllerInfo));
            return;
        }
        if (!controllerInfo2.playerInfo.timeline.equals(controllerInfo.playerInfo.timeline)) {
            this.listeners.queueEvent(0, new H0(controllerInfo, 1));
        }
        if (!Objects.equals(legacyPlayerInfo2.queueTitle, legacyPlayerInfo.queueTitle)) {
            this.listeners.queueEvent(15, new I0(controllerInfo, 1));
        }
        if (num != null) {
            this.listeners.queueEvent(11, new C0578t(controllerInfo2, controllerInfo, num));
        }
        if (num2 != null) {
            this.listeners.queueEvent(1, new P1(controllerInfo, num2));
        }
        if (!MediaUtils.areEqualError(legacyPlayerInfo2.playbackStateCompat, legacyPlayerInfo.playbackStateCompat)) {
            PlaybackException convertToPlaybackException = LegacyConversions.convertToPlaybackException(legacyPlayerInfo.playbackStateCompat, this.context);
            this.listeners.queueEvent(10, new M0(convertToPlaybackException, 1));
            if (convertToPlaybackException != null) {
                this.listeners.queueEvent(10, new N0(convertToPlaybackException, 1));
            }
        }
        if (legacyPlayerInfo2.mediaMetadataCompat != legacyPlayerInfo.mediaMetadataCompat) {
            this.listeners.queueEvent(14, new O0(this, 1));
        }
        if (controllerInfo2.playerInfo.playbackState != controllerInfo.playerInfo.playbackState) {
            this.listeners.queueEvent(4, new ListenerSet.Event() { // from class: androidx.media3.session.Q1
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    MediaControllerImplLegacy.lambda$updateControllerInfo$15(MediaControllerImplLegacy.ControllerInfo.this, (Player.Listener) obj);
                }
            });
        }
        if (controllerInfo2.playerInfo.playWhenReady != controllerInfo.playerInfo.playWhenReady) {
            this.listeners.queueEvent(5, new C0608y(controllerInfo, 1));
        }
        if (controllerInfo2.playerInfo.isPlaying != controllerInfo.playerInfo.isPlaying) {
            this.listeners.queueEvent(7, new Y1(controllerInfo));
        }
        if (!controllerInfo2.playerInfo.playbackParameters.equals(controllerInfo.playerInfo.playbackParameters)) {
            this.listeners.queueEvent(12, new H(controllerInfo));
        }
        if (controllerInfo2.playerInfo.repeatMode != controllerInfo.playerInfo.repeatMode) {
            this.listeners.queueEvent(8, new ListenerSet.Event() { // from class: androidx.media3.session.Z1
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    MediaControllerImplLegacy.lambda$updateControllerInfo$19(MediaControllerImplLegacy.ControllerInfo.this, (Player.Listener) obj);
                }
            });
        }
        if (controllerInfo2.playerInfo.shuffleModeEnabled != controllerInfo.playerInfo.shuffleModeEnabled) {
            this.listeners.queueEvent(9, new ListenerSet.Event() { // from class: androidx.media3.session.a2
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    MediaControllerImplLegacy.lambda$updateControllerInfo$20(MediaControllerImplLegacy.ControllerInfo.this, (Player.Listener) obj);
                }
            });
        }
        if (!controllerInfo2.playerInfo.audioAttributes.equals(controllerInfo.playerInfo.audioAttributes)) {
            this.listeners.queueEvent(20, new B0(controllerInfo, 1));
        }
        if (!controllerInfo2.playerInfo.deviceInfo.equals(controllerInfo.playerInfo.deviceInfo)) {
            this.listeners.queueEvent(29, new C0(controllerInfo, 1));
        }
        PlayerInfo playerInfo = controllerInfo2.playerInfo;
        int i = playerInfo.deviceVolume;
        PlayerInfo playerInfo2 = controllerInfo.playerInfo;
        if (i != playerInfo2.deviceVolume || playerInfo.deviceMuted != playerInfo2.deviceMuted) {
            this.listeners.queueEvent(30, new D0(controllerInfo, 1));
        }
        if (!controllerInfo2.availablePlayerCommands.equals(controllerInfo.availablePlayerCommands)) {
            this.listeners.queueEvent(13, new E0(controllerInfo, 1));
        }
        if (!controllerInfo2.availableSessionCommands.equals(controllerInfo.availableSessionCommands)) {
            getInstance().notifyControllerListener(new M1(this, controllerInfo));
        }
        if (!controllerInfo2.mediaButtonPreferences.equals(controllerInfo.mediaButtonPreferences)) {
            getInstance().notifyControllerListener(new Consumer() { // from class: androidx.media3.session.N1
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    MediaControllerImplLegacy.this.lambda$updateControllerInfo$26(controllerInfo, (MediaController.Listener) obj);
                }
            });
        }
        if (controllerInfo.sessionError != null) {
            getInstance().notifyControllerListener(new C0566r(2, this, controllerInfo));
        }
        this.listeners.flushEvents();
    }

    private void updateStateMaskedControllerInfo(ControllerInfo controllerInfo, @Nullable Integer num, @Nullable Integer num2) {
        updateControllerInfo(false, this.legacyPlayerInfo, false, controllerInfo, num, num2);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void addListener(Player.Listener listener) {
        this.listeners.add(listener);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void addMediaItem(MediaItem mediaItem) {
        addMediaItems(Integer.MAX_VALUE, Collections.singletonList(mediaItem));
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void addMediaItems(List<MediaItem> list) {
        addMediaItems(Integer.MAX_VALUE, list);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void clearMediaItems() {
        removeMediaItems(0, Integer.MAX_VALUE);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void clearVideoSurface() {
        Log.w(TAG, "Session doesn't support clearing Surface");
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void clearVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder) {
        Log.w(TAG, "Session doesn't support clearing SurfaceHolder");
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void clearVideoSurfaceView(@Nullable SurfaceView surfaceView) {
        Log.w(TAG, "Session doesn't support clearing SurfaceView");
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void clearVideoTextureView(@Nullable TextureView textureView) {
        Log.w(TAG, "Session doesn't support clearing TextureView");
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void connect() {
        if (this.token.getType() == 0) {
            connectToSession((MediaSessionCompat.Token) Assertions.checkStateNotNull(this.token.getBinder()));
        } else {
            connectToService();
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    @Deprecated
    public void decreaseDeviceVolume() {
        decreaseDeviceVolume(1);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public AudioAttributes getAudioAttributes() {
        return this.controllerInfo.playerInfo.audioAttributes;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public Player.Commands getAvailableCommands() {
        return this.controllerInfo.availablePlayerCommands;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public SessionCommands getAvailableSessionCommands() {
        return this.controllerInfo.availableSessionCommands;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    @Nullable
    public IMediaController getBinder() {
        return null;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    @Nullable
    public MediaBrowserCompat getBrowserCompat() {
        return this.browserCompat;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getBufferedPercentage() {
        return this.controllerInfo.playerInfo.sessionPositionInfo.bufferedPercentage;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getBufferedPosition() {
        return this.controllerInfo.playerInfo.sessionPositionInfo.bufferedPositionMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public com.google.common.collect.G<CommandButton> getCommandButtonsForMediaItem(MediaItem mediaItem) {
        return this.commandButtonsForMediaItems;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    @Nullable
    public SessionToken getConnectedToken() {
        if (this.connected) {
            return this.token;
        }
        return null;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public Bundle getConnectionHints() {
        return this.connectionHints;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getContentBufferedPosition() {
        return getBufferedPosition();
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getContentDuration() {
        return getDuration();
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getContentPosition() {
        return getCurrentPosition();
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public Context getContext() {
        return this.context;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getCurrentAdGroupIndex() {
        return -1;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getCurrentAdIndexInAdGroup() {
        return -1;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public CueGroup getCurrentCues() {
        Log.w(TAG, "Session doesn't support getting Cue");
        return CueGroup.EMPTY_TIME_ZERO;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getCurrentLiveOffset() {
        return -9223372036854775807L;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getCurrentMediaItemIndex() {
        return this.controllerInfo.playerInfo.sessionPositionInfo.positionInfo.mediaItemIndex;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getCurrentPeriodIndex() {
        return getCurrentMediaItemIndex();
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getCurrentPosition() {
        long updatedCurrentPositionMs = MediaUtils.getUpdatedCurrentPositionMs(this.controllerInfo.playerInfo, this.currentPositionMs, this.lastSetPlayWhenReadyCalledTimeMs, getInstance().getTimeDiffMs());
        this.currentPositionMs = updatedCurrentPositionMs;
        return updatedCurrentPositionMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public Timeline getCurrentTimeline() {
        return this.controllerInfo.playerInfo.timeline;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public Tracks getCurrentTracks() {
        return Tracks.EMPTY;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public com.google.common.collect.G<CommandButton> getCustomLayout() {
        return this.controllerInfo.mediaButtonPreferences;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public DeviceInfo getDeviceInfo() {
        return this.controllerInfo.playerInfo.deviceInfo;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getDeviceVolume() {
        PlayerInfo playerInfo = this.controllerInfo.playerInfo;
        if (playerInfo.deviceInfo.playbackType == 1) {
            return playerInfo.deviceVolume;
        }
        MediaControllerCompat mediaControllerCompat = this.controllerCompat;
        if (mediaControllerCompat != null) {
            return LegacyConversions.convertToDeviceVolume(mediaControllerCompat.getPlaybackInfo());
        }
        return 0;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getDuration() {
        return this.controllerInfo.playerInfo.sessionPositionInfo.durationMs;
    }

    public MediaController getInstance() {
        return this.instance;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getMaxSeekToPreviousPosition() {
        return this.controllerInfo.playerInfo.maxSeekToPreviousPositionMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public com.google.common.collect.G<CommandButton> getMediaButtonPreferences() {
        return this.controllerInfo.mediaButtonPreferences;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public MediaMetadata getMediaMetadata() {
        MediaItem currentMediaItem = this.controllerInfo.playerInfo.getCurrentMediaItem();
        return currentMediaItem == null ? MediaMetadata.EMPTY : currentMediaItem.mediaMetadata;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getNextMediaItemIndex() {
        return -1;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean getPlayWhenReady() {
        return this.controllerInfo.playerInfo.playWhenReady;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public PlaybackParameters getPlaybackParameters() {
        return this.controllerInfo.playerInfo.playbackParameters;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getPlaybackState() {
        return this.controllerInfo.playerInfo.playbackState;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getPlaybackSuppressionReason() {
        return 0;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    @Nullable
    public PlaybackException getPlayerError() {
        return this.controllerInfo.playerInfo.playerError;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public MediaMetadata getPlaylistMetadata() {
        return this.controllerInfo.playerInfo.playlistMetadata;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getPreviousMediaItemIndex() {
        return -1;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getRepeatMode() {
        return this.controllerInfo.playerInfo.repeatMode;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getSeekBackIncrement() {
        return this.controllerInfo.playerInfo.seekBackIncrementMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getSeekForwardIncrement() {
        return this.controllerInfo.playerInfo.seekForwardIncrementMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    @Nullable
    public PendingIntent getSessionActivity() {
        return this.controllerCompat.getSessionActivity();
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public Bundle getSessionExtras() {
        return this.controllerInfo.sessionExtras;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean getShuffleModeEnabled() {
        return this.controllerInfo.playerInfo.shuffleModeEnabled;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public Size getSurfaceSize() {
        Log.w(TAG, "Session doesn't support getting VideoSurfaceSize");
        return Size.UNKNOWN;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getTotalBufferedDuration() {
        return this.controllerInfo.playerInfo.sessionPositionInfo.totalBufferedDurationMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public TrackSelectionParameters getTrackSelectionParameters() {
        return TrackSelectionParameters.DEFAULT;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public VideoSize getVideoSize() {
        Log.w(TAG, "Session doesn't support getting VideoSize");
        return VideoSize.UNKNOWN;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public float getVolume() {
        return 1.0f;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean hasNextMediaItem() {
        return this.connected;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean hasPreviousMediaItem() {
        return this.connected;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    @Deprecated
    public void increaseDeviceVolume() {
        increaseDeviceVolume(1);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean isConnected() {
        return this.connected;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean isDeviceMuted() {
        PlayerInfo playerInfo = this.controllerInfo.playerInfo;
        if (playerInfo.deviceInfo.playbackType == 1) {
            return playerInfo.deviceMuted;
        }
        MediaControllerCompat mediaControllerCompat = this.controllerCompat;
        return mediaControllerCompat != null && LegacyConversions.convertToIsDeviceMuted(mediaControllerCompat.getPlaybackInfo());
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean isLoading() {
        return false;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean isPlaying() {
        return this.controllerInfo.playerInfo.isPlaying;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean isPlayingAd() {
        return this.controllerInfo.playerInfo.sessionPositionInfo.isPlayingAd;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void moveMediaItem(int i, int i2) {
        moveMediaItems(i, i + 1, i2);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void moveMediaItems(int i, int i2, int i3) {
        Assertions.checkArgument(i >= 0 && i <= i2 && i3 >= 0);
        QueueTimeline queueTimeline = (QueueTimeline) this.controllerInfo.playerInfo.timeline;
        int windowCount = queueTimeline.getWindowCount();
        int min = Math.min(i2, windowCount);
        int i4 = min - i;
        int i5 = windowCount - i4;
        int i6 = i5 - 1;
        int min2 = Math.min(i3, i5);
        if (i >= windowCount || i == min || i == min2) {
            return;
        }
        int calculateCurrentItemIndexAfterRemoveItems = calculateCurrentItemIndexAfterRemoveItems(getCurrentMediaItemIndex(), i, min);
        if (calculateCurrentItemIndexAfterRemoveItems == -1) {
            calculateCurrentItemIndexAfterRemoveItems = Util.constrainValue(i, 0, i6);
            Log.w(TAG, "Currently playing item will be removed and added back to mimic move. Assumes item at " + calculateCurrentItemIndexAfterRemoveItems + " would be the new current item");
        }
        PlayerInfo copyWithTimelineAndMediaItemIndex = this.controllerInfo.playerInfo.copyWithTimelineAndMediaItemIndex(queueTimeline.copyWithMovedMediaItems(i, min, min2), calculateCurrentItemIndexAfterAddItems(calculateCurrentItemIndexAfterRemoveItems, min2, i4), 0);
        ControllerInfo controllerInfo = this.controllerInfo;
        updateStateMaskedControllerInfo(new ControllerInfo(copyWithTimelineAndMediaItemIndex, controllerInfo.availableSessionCommands, controllerInfo.availablePlayerCommands, controllerInfo.mediaButtonPreferences, controllerInfo.sessionExtras, null), null, null);
        if (isPrepared()) {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < i4; i7++) {
                arrayList.add(this.legacyPlayerInfo.queue.get(i));
                this.controllerCompat.removeQueueItem(this.legacyPlayerInfo.queue.get(i).getDescription());
            }
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                this.controllerCompat.addQueueItem(((MediaSessionCompat.QueueItem) arrayList.get(i8)).getDescription(), i8 + min2);
            }
        }
    }

    public void onConnected() {
        if (this.released || this.connected) {
            return;
        }
        this.connected = true;
        handleNewLegacyParameters(true, new LegacyPlayerInfo(this.controllerCompat.getPlaybackInfo(), convertToSafePlaybackStateCompat(this.controllerCompat.getPlaybackState()), this.controllerCompat.getMetadata(), convertToNonNullQueueItemList(this.controllerCompat.getQueue()), this.controllerCompat.getQueueTitle(), this.controllerCompat.getRepeatMode(), this.controllerCompat.getShuffleMode(), this.controllerCompat.getExtras()));
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void pause() {
        setPlayWhenReady(false);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void play() {
        setPlayWhenReady(true);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void prepare() {
        PlayerInfo playerInfo = this.controllerInfo.playerInfo;
        if (playerInfo.playbackState != 1) {
            return;
        }
        PlayerInfo copyWithPlaybackState = playerInfo.copyWithPlaybackState(playerInfo.timeline.isEmpty() ? 4 : 2, null);
        ControllerInfo controllerInfo = this.controllerInfo;
        updateStateMaskedControllerInfo(new ControllerInfo(copyWithPlaybackState, controllerInfo.availableSessionCommands, controllerInfo.availablePlayerCommands, controllerInfo.mediaButtonPreferences, controllerInfo.sessionExtras, null), null, null);
        if (hasMedia()) {
            initializeLegacyPlaylist();
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void release() {
        if (this.released) {
            return;
        }
        this.released = true;
        MediaBrowserCompat mediaBrowserCompat = this.browserCompat;
        if (mediaBrowserCompat != null) {
            mediaBrowserCompat.disconnect();
            this.browserCompat = null;
        }
        MediaControllerCompat mediaControllerCompat = this.controllerCompat;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.unregisterCallback(this.controllerCompatCallback);
            this.controllerCompatCallback.release();
            this.controllerCompat = null;
        }
        this.connected = false;
        this.listeners.release();
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void removeListener(Player.Listener listener) {
        this.listeners.remove(listener);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void removeMediaItem(int i) {
        removeMediaItems(i, i + 1);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void removeMediaItems(int i, int i2) {
        Assertions.checkArgument(i >= 0 && i2 >= i);
        int windowCount = getCurrentTimeline().getWindowCount();
        int min = Math.min(i2, windowCount);
        if (i >= windowCount || i == min) {
            return;
        }
        QueueTimeline copyWithRemovedMediaItems = ((QueueTimeline) this.controllerInfo.playerInfo.timeline).copyWithRemovedMediaItems(i, min);
        int calculateCurrentItemIndexAfterRemoveItems = calculateCurrentItemIndexAfterRemoveItems(getCurrentMediaItemIndex(), i, min);
        if (calculateCurrentItemIndexAfterRemoveItems == -1) {
            calculateCurrentItemIndexAfterRemoveItems = Util.constrainValue(i, 0, copyWithRemovedMediaItems.getWindowCount() - 1);
            Log.w(TAG, "Currently playing item is removed. Assumes item at " + calculateCurrentItemIndexAfterRemoveItems + " is the new current item");
        }
        PlayerInfo copyWithTimelineAndMediaItemIndex = this.controllerInfo.playerInfo.copyWithTimelineAndMediaItemIndex(copyWithRemovedMediaItems, calculateCurrentItemIndexAfterRemoveItems, 0);
        ControllerInfo controllerInfo = this.controllerInfo;
        updateStateMaskedControllerInfo(new ControllerInfo(copyWithTimelineAndMediaItemIndex, controllerInfo.availableSessionCommands, controllerInfo.availablePlayerCommands, controllerInfo.mediaButtonPreferences, controllerInfo.sessionExtras, null), null, null);
        if (isPrepared()) {
            while (i < min && i < this.legacyPlayerInfo.queue.size()) {
                this.controllerCompat.removeQueueItem(this.legacyPlayerInfo.queue.get(i).getDescription());
                i++;
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void replaceMediaItem(int i, MediaItem mediaItem) {
        replaceMediaItems(i, i + 1, com.google.common.collect.G.n(mediaItem));
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void replaceMediaItems(int i, int i2, List<MediaItem> list) {
        Assertions.checkArgument(i >= 0 && i <= i2);
        int windowCount = ((QueueTimeline) this.controllerInfo.playerInfo.timeline).getWindowCount();
        if (i > windowCount) {
            return;
        }
        int min = Math.min(i2, windowCount);
        addMediaItems(min, list);
        removeMediaItems(i, min);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekBack() {
        this.controllerCompat.getTransportControls().rewind();
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekForward() {
        this.controllerCompat.getTransportControls().fastForward();
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekTo(long j) {
        seekToInternal(getCurrentMediaItemIndex(), j);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekToDefaultPosition() {
        seekToInternal(getCurrentMediaItemIndex(), 0L);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekToNext() {
        this.controllerCompat.getTransportControls().skipToNext();
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekToNextMediaItem() {
        this.controllerCompat.getTransportControls().skipToNext();
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekToPrevious() {
        this.controllerCompat.getTransportControls().skipToPrevious();
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekToPreviousMediaItem() {
        this.controllerCompat.getTransportControls().skipToPrevious();
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public com.google.common.util.concurrent.u<SessionResult> sendCustomCommand(SessionCommand sessionCommand, Bundle bundle) {
        if (this.controllerInfo.availableSessionCommands.contains(sessionCommand)) {
            this.controllerCompat.getTransportControls().sendCustomAction(sessionCommand.customAction, bundle);
            return com.google.common.util.concurrent.o.d(new SessionResult(0));
        }
        final com.google.common.util.concurrent.x xVar = new com.google.common.util.concurrent.x();
        this.controllerCompat.sendCommand(sessionCommand.customAction, bundle, new ResultReceiver(getInstance().applicationHandler) { // from class: androidx.media3.session.MediaControllerImplLegacy.1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle2) {
                com.google.common.util.concurrent.x xVar2 = xVar;
                if (bundle2 == null) {
                    bundle2 = Bundle.EMPTY;
                }
                xVar2.set(new SessionResult(i, bundle2));
            }
        });
        return xVar;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setAudioAttributes(AudioAttributes audioAttributes, boolean z) {
        Log.w(TAG, "Legacy session doesn't support setting audio attributes remotely");
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    @Deprecated
    public void setDeviceMuted(boolean z) {
        setDeviceMuted(z, 1);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    @Deprecated
    public void setDeviceVolume(int i) {
        setDeviceVolume(i, 1);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setMediaItem(MediaItem mediaItem) {
        setMediaItem(mediaItem, -9223372036854775807L);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setMediaItems(List<MediaItem> list) {
        setMediaItems(list, 0, -9223372036854775807L);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setPlayWhenReady(boolean z) {
        PlayerInfo playerInfo = this.controllerInfo.playerInfo;
        if (playerInfo.playWhenReady == z) {
            return;
        }
        this.currentPositionMs = MediaUtils.getUpdatedCurrentPositionMs(playerInfo, this.currentPositionMs, this.lastSetPlayWhenReadyCalledTimeMs, getInstance().getTimeDiffMs());
        this.lastSetPlayWhenReadyCalledTimeMs = SystemClock.elapsedRealtime();
        PlayerInfo copyWithPlayWhenReady = this.controllerInfo.playerInfo.copyWithPlayWhenReady(z, 1, 0);
        ControllerInfo controllerInfo = this.controllerInfo;
        updateStateMaskedControllerInfo(new ControllerInfo(copyWithPlayWhenReady, controllerInfo.availableSessionCommands, controllerInfo.availablePlayerCommands, controllerInfo.mediaButtonPreferences, controllerInfo.sessionExtras, null), null, null);
        if (isPrepared() && hasMedia()) {
            if (z) {
                this.controllerCompat.getTransportControls().play();
            } else {
                this.controllerCompat.getTransportControls().pause();
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        if (!playbackParameters.equals(getPlaybackParameters())) {
            PlayerInfo copyWithPlaybackParameters = this.controllerInfo.playerInfo.copyWithPlaybackParameters(playbackParameters);
            ControllerInfo controllerInfo = this.controllerInfo;
            updateStateMaskedControllerInfo(new ControllerInfo(copyWithPlaybackParameters, controllerInfo.availableSessionCommands, controllerInfo.availablePlayerCommands, controllerInfo.mediaButtonPreferences, controllerInfo.sessionExtras, null), null, null);
        }
        this.controllerCompat.getTransportControls().setPlaybackSpeed(playbackParameters.speed);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setPlaybackSpeed(float f) {
        if (f != getPlaybackParameters().speed) {
            PlayerInfo copyWithPlaybackParameters = this.controllerInfo.playerInfo.copyWithPlaybackParameters(new PlaybackParameters(f));
            ControllerInfo controllerInfo = this.controllerInfo;
            updateStateMaskedControllerInfo(new ControllerInfo(copyWithPlaybackParameters, controllerInfo.availableSessionCommands, controllerInfo.availablePlayerCommands, controllerInfo.mediaButtonPreferences, controllerInfo.sessionExtras, null), null, null);
        }
        this.controllerCompat.getTransportControls().setPlaybackSpeed(f);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setPlaylistMetadata(MediaMetadata mediaMetadata) {
        Log.w(TAG, "Session doesn't support setting playlist metadata");
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public com.google.common.util.concurrent.u<SessionResult> setRating(String str, Rating rating) {
        if (str.equals(this.legacyPlayerInfo.mediaMetadataCompat.getString(MediaMetadataCompat.METADATA_KEY_MEDIA_ID))) {
            this.controllerCompat.getTransportControls().setRating(LegacyConversions.convertToRatingCompat(rating));
        }
        return com.google.common.util.concurrent.o.d(new SessionResult(0));
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setRepeatMode(int i) {
        if (i != getRepeatMode()) {
            PlayerInfo copyWithRepeatMode = this.controllerInfo.playerInfo.copyWithRepeatMode(i);
            ControllerInfo controllerInfo = this.controllerInfo;
            updateStateMaskedControllerInfo(new ControllerInfo(copyWithRepeatMode, controllerInfo.availableSessionCommands, controllerInfo.availablePlayerCommands, controllerInfo.mediaButtonPreferences, controllerInfo.sessionExtras, null), null, null);
        }
        this.controllerCompat.getTransportControls().setRepeatMode(LegacyConversions.convertToPlaybackStateCompatRepeatMode(i));
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setShuffleModeEnabled(boolean z) {
        if (z != getShuffleModeEnabled()) {
            PlayerInfo copyWithShuffleModeEnabled = this.controllerInfo.playerInfo.copyWithShuffleModeEnabled(z);
            ControllerInfo controllerInfo = this.controllerInfo;
            updateStateMaskedControllerInfo(new ControllerInfo(copyWithShuffleModeEnabled, controllerInfo.availableSessionCommands, controllerInfo.availablePlayerCommands, controllerInfo.mediaButtonPreferences, controllerInfo.sessionExtras, null), null, null);
        }
        this.controllerCompat.getTransportControls().setShuffleMode(LegacyConversions.convertToPlaybackStateCompatShuffleMode(z));
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters) {
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setVideoSurface(@Nullable Surface surface) {
        Log.w(TAG, "Session doesn't support setting Surface");
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder) {
        Log.w(TAG, "Session doesn't support setting SurfaceHolder");
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setVideoSurfaceView(@Nullable SurfaceView surfaceView) {
        Log.w(TAG, "Session doesn't support setting SurfaceView");
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setVideoTextureView(@Nullable TextureView textureView) {
        Log.w(TAG, "Session doesn't support setting TextureView");
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setVolume(float f) {
        Log.w(TAG, "Session doesn't support setting player volume");
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void stop() {
        PlayerInfo playerInfo = this.controllerInfo.playerInfo;
        if (playerInfo.playbackState == 1) {
            return;
        }
        SessionPositionInfo sessionPositionInfo = playerInfo.sessionPositionInfo;
        Player.PositionInfo positionInfo = sessionPositionInfo.positionInfo;
        long j = sessionPositionInfo.durationMs;
        long j2 = positionInfo.positionMs;
        PlayerInfo copyWithSessionPositionInfo = playerInfo.copyWithSessionPositionInfo(createSessionPositionInfo(positionInfo, false, j, j2, MediaUtils.calculateBufferedPercentage(j2, j), 0L));
        PlayerInfo playerInfo2 = this.controllerInfo.playerInfo;
        if (playerInfo2.playbackState != 1) {
            copyWithSessionPositionInfo = copyWithSessionPositionInfo.copyWithPlaybackState(1, playerInfo2.playerError);
        }
        PlayerInfo playerInfo3 = copyWithSessionPositionInfo;
        ControllerInfo controllerInfo = this.controllerInfo;
        updateStateMaskedControllerInfo(new ControllerInfo(playerInfo3, controllerInfo.availableSessionCommands, controllerInfo.availablePlayerCommands, controllerInfo.mediaButtonPreferences, controllerInfo.sessionExtras, null), null, null);
        this.controllerCompat.getTransportControls().stop();
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void addMediaItem(int i, MediaItem mediaItem) {
        addMediaItems(i, Collections.singletonList(mediaItem));
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void addMediaItems(int i, List<MediaItem> list) {
        Assertions.checkArgument(i >= 0);
        if (list.isEmpty()) {
            return;
        }
        QueueTimeline queueTimeline = (QueueTimeline) this.controllerInfo.playerInfo.timeline;
        if (queueTimeline.isEmpty()) {
            setMediaItems(list);
            return;
        }
        int min = Math.min(i, getCurrentTimeline().getWindowCount());
        PlayerInfo copyWithTimelineAndMediaItemIndex = this.controllerInfo.playerInfo.copyWithTimelineAndMediaItemIndex(queueTimeline.copyWithNewMediaItems(min, list), calculateCurrentItemIndexAfterAddItems(getCurrentMediaItemIndex(), min, list.size()), 0);
        ControllerInfo controllerInfo = this.controllerInfo;
        updateStateMaskedControllerInfo(new ControllerInfo(copyWithTimelineAndMediaItemIndex, controllerInfo.availableSessionCommands, controllerInfo.availablePlayerCommands, controllerInfo.mediaButtonPreferences, controllerInfo.sessionExtras, null), null, null);
        if (isPrepared()) {
            addQueueItems(list, min);
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void clearVideoSurface(@Nullable Surface surface) {
        Log.w(TAG, "Session doesn't support clearing Surface");
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void decreaseDeviceVolume(int i) {
        int deviceVolume = getDeviceVolume() - 1;
        if (deviceVolume >= getDeviceInfo().minVolume) {
            PlayerInfo copyWithDeviceVolume = this.controllerInfo.playerInfo.copyWithDeviceVolume(deviceVolume, isDeviceMuted());
            ControllerInfo controllerInfo = this.controllerInfo;
            updateStateMaskedControllerInfo(new ControllerInfo(copyWithDeviceVolume, controllerInfo.availableSessionCommands, controllerInfo.availablePlayerCommands, controllerInfo.mediaButtonPreferences, controllerInfo.sessionExtras, null), null, null);
        }
        this.controllerCompat.adjustVolume(-1, i);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void increaseDeviceVolume(int i) {
        int deviceVolume = getDeviceVolume();
        int i2 = getDeviceInfo().maxVolume;
        if (i2 == 0 || deviceVolume + 1 <= i2) {
            PlayerInfo copyWithDeviceVolume = this.controllerInfo.playerInfo.copyWithDeviceVolume(deviceVolume + 1, isDeviceMuted());
            ControllerInfo controllerInfo = this.controllerInfo;
            updateStateMaskedControllerInfo(new ControllerInfo(copyWithDeviceVolume, controllerInfo.availableSessionCommands, controllerInfo.availablePlayerCommands, controllerInfo.mediaButtonPreferences, controllerInfo.sessionExtras, null), null, null);
        }
        this.controllerCompat.adjustVolume(1, i);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekTo(int i, long j) {
        seekToInternal(i, j);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekToDefaultPosition(int i) {
        seekToInternal(i, 0L);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setDeviceMuted(boolean z, int i) {
        if (z != isDeviceMuted()) {
            PlayerInfo copyWithDeviceVolume = this.controllerInfo.playerInfo.copyWithDeviceVolume(getDeviceVolume(), z);
            ControllerInfo controllerInfo = this.controllerInfo;
            updateStateMaskedControllerInfo(new ControllerInfo(copyWithDeviceVolume, controllerInfo.availableSessionCommands, controllerInfo.availablePlayerCommands, controllerInfo.mediaButtonPreferences, controllerInfo.sessionExtras, null), null, null);
        }
        this.controllerCompat.adjustVolume(z ? -100 : 100, i);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setDeviceVolume(int i, int i2) {
        DeviceInfo deviceInfo = getDeviceInfo();
        int i3 = deviceInfo.minVolume;
        int i4 = deviceInfo.maxVolume;
        if (i3 <= i && (i4 == 0 || i <= i4)) {
            PlayerInfo copyWithDeviceVolume = this.controllerInfo.playerInfo.copyWithDeviceVolume(i, isDeviceMuted());
            ControllerInfo controllerInfo = this.controllerInfo;
            updateStateMaskedControllerInfo(new ControllerInfo(copyWithDeviceVolume, controllerInfo.availableSessionCommands, controllerInfo.availablePlayerCommands, controllerInfo.mediaButtonPreferences, controllerInfo.sessionExtras, null), null, null);
        }
        this.controllerCompat.setVolumeTo(i, i2);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setMediaItem(MediaItem mediaItem, long j) {
        setMediaItems(com.google.common.collect.G.n(mediaItem), 0, j);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setMediaItems(List<MediaItem> list, boolean z) {
        setMediaItems(list);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setMediaItem(MediaItem mediaItem, boolean z) {
        setMediaItem(mediaItem);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setMediaItems(List<MediaItem> list, int i, long j) {
        if (list.isEmpty()) {
            clearMediaItems();
            return;
        }
        PlayerInfo copyWithTimelineAndSessionPositionInfo = this.controllerInfo.playerInfo.copyWithTimelineAndSessionPositionInfo(QueueTimeline.DEFAULT.copyWithNewMediaItems(0, list), createSessionPositionInfo(createPositionInfo(i, list.get(i), j == -9223372036854775807L ? 0L : j, false), false, -9223372036854775807L, 0L, 0, 0L), 0);
        ControllerInfo controllerInfo = this.controllerInfo;
        updateStateMaskedControllerInfo(new ControllerInfo(copyWithTimelineAndSessionPositionInfo, controllerInfo.availableSessionCommands, controllerInfo.availablePlayerCommands, controllerInfo.mediaButtonPreferences, controllerInfo.sessionExtras, null), null, null);
        if (isPrepared()) {
            initializeLegacyPlaylist();
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public com.google.common.util.concurrent.u<SessionResult> setRating(Rating rating) {
        this.controllerCompat.getTransportControls().setRating(LegacyConversions.convertToRatingCompat(rating));
        return com.google.common.util.concurrent.o.d(new SessionResult(0));
    }

    public static class ControllerInfo {
        public final Player.Commands availablePlayerCommands;
        public final SessionCommands availableSessionCommands;
        public final com.google.common.collect.G<CommandButton> mediaButtonPreferences;
        public final PlayerInfo playerInfo;

        @Nullable
        public final SessionError sessionError;
        public final Bundle sessionExtras;

        public ControllerInfo() {
            this.playerInfo = PlayerInfo.DEFAULT.copyWithTimeline(QueueTimeline.DEFAULT);
            this.availableSessionCommands = SessionCommands.EMPTY;
            this.availablePlayerCommands = Player.Commands.EMPTY;
            G.b bVar = com.google.common.collect.G.b;
            this.mediaButtonPreferences = com.google.common.collect.i0.e;
            this.sessionExtras = Bundle.EMPTY;
            this.sessionError = null;
        }

        public ControllerInfo(PlayerInfo playerInfo, SessionCommands sessionCommands, Player.Commands commands, com.google.common.collect.G<CommandButton> g, @Nullable Bundle bundle, @Nullable SessionError sessionError) {
            this.playerInfo = playerInfo;
            this.availableSessionCommands = sessionCommands;
            this.availablePlayerCommands = commands;
            this.mediaButtonPreferences = g;
            this.sessionExtras = bundle == null ? Bundle.EMPTY : bundle;
            this.sessionError = sessionError;
        }
    }

    public static final class LegacyPlayerInfo {

        @Nullable
        public final MediaMetadataCompat mediaMetadataCompat;

        @Nullable
        public final MediaControllerCompat.PlaybackInfo playbackInfoCompat;

        @Nullable
        public final PlaybackStateCompat playbackStateCompat;
        public final List<MediaSessionCompat.QueueItem> queue;

        @Nullable
        public final CharSequence queueTitle;
        public final int repeatMode;
        public final Bundle sessionExtras;
        public final int shuffleMode;

        public LegacyPlayerInfo() {
            this.playbackInfoCompat = null;
            this.playbackStateCompat = null;
            this.mediaMetadataCompat = null;
            this.queue = Collections.EMPTY_LIST;
            this.queueTitle = null;
            this.repeatMode = 0;
            this.shuffleMode = 0;
            this.sessionExtras = Bundle.EMPTY;
        }

        @CheckResult
        public LegacyPlayerInfo copyWithExtraBinderGetters(@Nullable PlaybackStateCompat playbackStateCompat, int i, int i2) {
            return new LegacyPlayerInfo(this.playbackInfoCompat, playbackStateCompat, this.mediaMetadataCompat, this.queue, this.queueTitle, i, i2, this.sessionExtras);
        }

        @CheckResult
        public LegacyPlayerInfo copyWithMediaMetadataCompat(@Nullable MediaMetadataCompat mediaMetadataCompat) {
            return new LegacyPlayerInfo(this.playbackInfoCompat, this.playbackStateCompat, mediaMetadataCompat, this.queue, this.queueTitle, this.repeatMode, this.shuffleMode, this.sessionExtras);
        }

        @CheckResult
        public LegacyPlayerInfo copyWithPlaybackInfoCompat(@Nullable MediaControllerCompat.PlaybackInfo playbackInfo) {
            return new LegacyPlayerInfo(playbackInfo, this.playbackStateCompat, this.mediaMetadataCompat, this.queue, this.queueTitle, this.repeatMode, this.shuffleMode, this.sessionExtras);
        }

        @CheckResult
        public LegacyPlayerInfo copyWithPlaybackStateCompat(@Nullable PlaybackStateCompat playbackStateCompat) {
            return new LegacyPlayerInfo(this.playbackInfoCompat, playbackStateCompat, this.mediaMetadataCompat, this.queue, this.queueTitle, this.repeatMode, this.shuffleMode, this.sessionExtras);
        }

        @CheckResult
        public LegacyPlayerInfo copyWithQueue(List<MediaSessionCompat.QueueItem> list) {
            return new LegacyPlayerInfo(this.playbackInfoCompat, this.playbackStateCompat, this.mediaMetadataCompat, list, this.queueTitle, this.repeatMode, this.shuffleMode, this.sessionExtras);
        }

        @CheckResult
        public LegacyPlayerInfo copyWithQueueTitle(@Nullable CharSequence charSequence) {
            return new LegacyPlayerInfo(this.playbackInfoCompat, this.playbackStateCompat, this.mediaMetadataCompat, this.queue, charSequence, this.repeatMode, this.shuffleMode, this.sessionExtras);
        }

        @CheckResult
        public LegacyPlayerInfo copyWithRepeatMode(int i) {
            return new LegacyPlayerInfo(this.playbackInfoCompat, this.playbackStateCompat, this.mediaMetadataCompat, this.queue, this.queueTitle, i, this.shuffleMode, this.sessionExtras);
        }

        @CheckResult
        public LegacyPlayerInfo copyWithSessionExtras(Bundle bundle) {
            return new LegacyPlayerInfo(this.playbackInfoCompat, this.playbackStateCompat, this.mediaMetadataCompat, this.queue, this.queueTitle, this.repeatMode, this.shuffleMode, bundle);
        }

        @CheckResult
        public LegacyPlayerInfo copyWithShuffleMode(int i) {
            return new LegacyPlayerInfo(this.playbackInfoCompat, this.playbackStateCompat, this.mediaMetadataCompat, this.queue, this.queueTitle, this.repeatMode, i, this.sessionExtras);
        }

        public LegacyPlayerInfo(@Nullable MediaControllerCompat.PlaybackInfo playbackInfo, @Nullable PlaybackStateCompat playbackStateCompat, @Nullable MediaMetadataCompat mediaMetadataCompat, List<MediaSessionCompat.QueueItem> list, @Nullable CharSequence charSequence, int i, int i2, @Nullable Bundle bundle) {
            this.playbackInfoCompat = playbackInfo;
            this.playbackStateCompat = playbackStateCompat;
            this.mediaMetadataCompat = mediaMetadataCompat;
            this.queue = (List) Assertions.checkNotNull(list);
            this.queueTitle = charSequence;
            this.repeatMode = i;
            this.shuffleMode = i2;
            this.sessionExtras = bundle == null ? Bundle.EMPTY : bundle;
        }

        public LegacyPlayerInfo(LegacyPlayerInfo legacyPlayerInfo) {
            this.playbackInfoCompat = legacyPlayerInfo.playbackInfoCompat;
            this.playbackStateCompat = legacyPlayerInfo.playbackStateCompat;
            this.mediaMetadataCompat = legacyPlayerInfo.mediaMetadataCompat;
            this.queue = legacyPlayerInfo.queue;
            this.queueTitle = legacyPlayerInfo.queueTitle;
            this.repeatMode = legacyPlayerInfo.repeatMode;
            this.shuffleMode = legacyPlayerInfo.shuffleMode;
            this.sessionExtras = legacyPlayerInfo.sessionExtras;
        }
    }
}
