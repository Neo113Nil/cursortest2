package androidx.media3.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.annotation.CheckResult;
import androidx.annotation.FloatRange;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaLibraryInfo;
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
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.session.MediaSession;
import androidx.media3.session.MediaSessionImpl;
import androidx.media3.session.PlayerInfo;
import androidx.media3.session.SequencedFutureManager;
import androidx.media3.session.legacy.MediaSessionCompat;
import androidx.media3.session.legacy.MediaSessionManager;
import com.google.common.collect.G;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
class MediaSessionImpl {
    private static final String ANDROID_AUTOMOTIVE_LAUNCHER_PACKAGE_NAME = "com.android.car.carlauncher";
    private static final String ANDROID_AUTOMOTIVE_MEDIA_PACKAGE_NAME = "com.android.car.media";
    private static final String ANDROID_AUTO_PACKAGE_NAME = "com.google.android.projection.gearhead";
    private static final long DEFAULT_SESSION_POSITION_UPDATE_DELAY_MS = 3000;
    private static final SessionResult RESULT_WHEN_CLOSED = new SessionResult(1);
    private static final String SYSTEM_UI_PACKAGE_NAME = "com.android.systemui";
    public static final String TAG = "MediaSessionImpl";
    private static final String WRONG_THREAD_ERROR_MESSAGE = "Player callback method is called from a wrong thread. See javadoc of MediaSession for details.";
    private final Handler applicationHandler;
    private final androidx.media3.common.util.BitmapLoader bitmapLoader;

    @Nullable
    @GuardedBy("lock")
    private MediaSessionServiceLegacyStub browserServiceLegacyStub;
    private final MediaSession.Callback callback;

    @GuardedBy("lock")
    private boolean closed;
    private final com.google.common.collect.G<CommandButton> commandButtonsForMediaItems;
    private final Context context;

    @Nullable
    private MediaSession.ControllerInfo controllerForCurrentRequest;
    private com.google.common.collect.G<CommandButton> customLayout;
    private final MediaSession instance;
    private boolean isMediaNotificationControllerConnected;
    private final boolean isPeriodicPositionUpdateEnabled;
    private final Object lock = new Object();
    private final Handler mainHandler;
    private com.google.common.collect.G<CommandButton> mediaButtonPreferences;
    private final MediaPlayPauseKeyHandler mediaPlayPauseKeyHandler;

    @Nullable
    private MediaSession.Listener mediaSessionListener;
    private final PlayerInfoChangedHandler onPlayerInfoChangedHandler;
    private final Runnable periodicSessionPositionInfoUpdateRunnable;
    private final boolean playIfSuppressed;

    @Nullable
    private PlaybackException playbackException;
    private PlayerInfo playerInfo;

    @Nullable
    private PlayerListener playerListener;
    private PlayerWrapper playerWrapper;

    @Nullable
    private PendingIntent sessionActivity;
    private Bundle sessionExtras;
    private final String sessionId;
    private final MediaSessionLegacyStub sessionLegacyStub;
    private long sessionPositionUpdateDelayMs;
    private final MediaSessionStub sessionStub;
    private final SessionToken sessionToken;
    private final Uri sessionUri;

    /* renamed from: androidx.media3.session.MediaSessionImpl$1, reason: invalid class name */
    public class AnonymousClass1 implements com.google.common.util.concurrent.n<MediaSession.MediaItemsWithStartPosition> {
        final /* synthetic */ boolean val$callOnPlayerInteractionFinished;
        final /* synthetic */ MediaSession.ControllerInfo val$controllerForRequest;
        final /* synthetic */ Player.Commands val$playCommand;

        public AnonymousClass1(MediaSession.ControllerInfo controllerInfo, boolean z, Player.Commands commands) {
            this.val$controllerForRequest = controllerInfo;
            this.val$callOnPlayerInteractionFinished = z;
            this.val$playCommand = commands;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onSuccess$0(MediaSession.MediaItemsWithStartPosition mediaItemsWithStartPosition, boolean z, MediaSession.ControllerInfo controllerInfo, Player.Commands commands) {
            MediaUtils.setMediaItemsWithStartIndexAndPosition(MediaSessionImpl.this.playerWrapper, mediaItemsWithStartPosition);
            Util.handlePlayButtonAction(MediaSessionImpl.this.playerWrapper);
            if (z) {
                MediaSessionImpl.this.onPlayerInteractionFinishedOnHandler(controllerInfo, commands);
            }
        }

        @Override // com.google.common.util.concurrent.n
        public void onFailure(Throwable th) {
            if (th instanceof UnsupportedOperationException) {
                Log.w(MediaSessionImpl.TAG, "UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService.", th);
            } else {
                Log.e(MediaSessionImpl.TAG, "Failure calling MediaSession.Callback.onPlaybackResumption(): " + th.getMessage(), th);
            }
            Util.handlePlayButtonAction(MediaSessionImpl.this.playerWrapper);
            if (this.val$callOnPlayerInteractionFinished) {
                MediaSessionImpl.this.onPlayerInteractionFinishedOnHandler(this.val$controllerForRequest, this.val$playCommand);
            }
        }

        @Override // com.google.common.util.concurrent.n
        public void onSuccess(final MediaSession.MediaItemsWithStartPosition mediaItemsWithStartPosition) {
            MediaSessionImpl mediaSessionImpl = MediaSessionImpl.this;
            final MediaSession.ControllerInfo controllerInfo = this.val$controllerForRequest;
            final boolean z = this.val$callOnPlayerInteractionFinished;
            final Player.Commands commands = this.val$playCommand;
            mediaSessionImpl.callWithControllerForCurrentRequestSet(controllerInfo, new Runnable() { // from class: androidx.media3.session.A3
                @Override // java.lang.Runnable
                public final void run() {
                    MediaSessionImpl.AnonymousClass1.this.lambda$onSuccess$0(mediaItemsWithStartPosition, z, controllerInfo, commands);
                }
            }).run();
        }
    }

    public class MediaPlayPauseKeyHandler extends Handler {

        @Nullable
        private Runnable playPauseTask;

        public MediaPlayPauseKeyHandler(Looper looper) {
            super(looper);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setPendingPlayPauseTask$0(MediaSession.ControllerInfo controllerInfo, KeyEvent keyEvent) {
            if (MediaSessionImpl.this.isMediaNotificationController(controllerInfo)) {
                MediaSessionImpl.this.applyMediaButtonKeyEvent(keyEvent, false, false);
            } else {
                MediaSessionImpl.this.sessionLegacyStub.handleMediaPlayPauseOnHandler((MediaSessionManager.RemoteUserInfo) Assertions.checkNotNull(controllerInfo.getRemoteUserInfo()));
            }
            this.playPauseTask = null;
        }

        @Nullable
        public Runnable clearPendingPlayPauseTask() {
            Runnable runnable = this.playPauseTask;
            if (runnable == null) {
                return null;
            }
            removeCallbacks(runnable);
            Runnable runnable2 = this.playPauseTask;
            this.playPauseTask = null;
            return runnable2;
        }

        public void flush() {
            Runnable clearPendingPlayPauseTask = clearPendingPlayPauseTask();
            if (clearPendingPlayPauseTask != null) {
                Util.postOrRun(this, clearPendingPlayPauseTask);
            }
        }

        public boolean hasPendingPlayPauseTask() {
            return this.playPauseTask != null;
        }

        public void setPendingPlayPauseTask(MediaSession.ControllerInfo controllerInfo, KeyEvent keyEvent) {
            RunnableC0593v2 runnableC0593v2 = new RunnableC0593v2(this, controllerInfo, keyEvent, 1);
            this.playPauseTask = runnableC0593v2;
            postDelayed(runnableC0593v2, ViewConfiguration.getDoubleTapTimeout());
        }
    }

    public class PlayerInfoChangedHandler extends Handler {
        private static final int MSG_PLAYER_INFO_CHANGED = 1;
        private boolean excludeTimeline;
        private boolean excludeTracks;

        public PlayerInfoChangedHandler(Looper looper) {
            super(looper);
            this.excludeTimeline = true;
            this.excludeTracks = true;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                throw new IllegalStateException("Invalid message what=" + message.what);
            }
            MediaSessionImpl mediaSessionImpl = MediaSessionImpl.this;
            mediaSessionImpl.playerInfo = mediaSessionImpl.playerInfo.copyWithTimelineAndSessionPositionInfo(MediaSessionImpl.this.getPlayerWrapper().getCurrentTimelineWithCommandCheck(), MediaSessionImpl.this.getPlayerWrapper().createSessionPositionInfo(), MediaSessionImpl.this.playerInfo.timelineChangeReason);
            MediaSessionImpl mediaSessionImpl2 = MediaSessionImpl.this;
            mediaSessionImpl2.dispatchOnPlayerInfoChanged(mediaSessionImpl2.playerInfo, this.excludeTimeline, this.excludeTracks);
            this.excludeTimeline = true;
            this.excludeTracks = true;
        }

        public boolean hasPendingPlayerInfoChangedUpdate() {
            return hasMessages(1);
        }

        public void sendPlayerInfoChangedMessage(boolean z, boolean z2) {
            boolean z3 = false;
            this.excludeTimeline = this.excludeTimeline && z;
            if (this.excludeTracks && z2) {
                z3 = true;
            }
            this.excludeTracks = z3;
            if (hasMessages(1)) {
                return;
            }
            sendEmptyMessage(1);
        }
    }

    public static class PlayerListener implements Player.Listener {
        private final WeakReference<PlayerWrapper> player;
        private final WeakReference<MediaSessionImpl> session;

        public PlayerListener(MediaSessionImpl mediaSessionImpl, PlayerWrapper playerWrapper) {
            this.session = new WeakReference<>(mediaSessionImpl);
            this.player = new WeakReference<>(playerWrapper);
        }

        @Nullable
        private MediaSessionImpl getSession() {
            return this.session.get();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onPlaybackStateChanged$4(int i, PlayerWrapper playerWrapper, MediaSession.ControllerCb controllerCb, int i2) throws RemoteException {
            controllerCb.onPlaybackStateChanged(i2, i, playerWrapper.getPlayerError());
        }

        @Override // androidx.media3.common.Player.Listener
        public void onAudioAttributesChanged(AudioAttributes audioAttributes) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithAudioAttributes(audioAttributes);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new C0561q0(audioAttributes, 2));
        }

        @Override // androidx.media3.common.Player.Listener
        public void onAvailableCommandsChanged(Player.Commands commands) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.handleAvailablePlayerCommandsChanged(commands);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onCues(CueGroup cueGroup) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = new PlayerInfo.Builder(session.playerInfo).setCues(cueGroup).build();
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onDeviceInfoChanged(final DeviceInfo deviceInfo) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithDeviceInfo(deviceInfo);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.D3
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(MediaSession.ControllerCb controllerCb, int i) {
                    controllerCb.onDeviceInfoChanged(i, DeviceInfo.this);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onDeviceVolumeChanged(final int i, final boolean z) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithDeviceVolume(i, z);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.N3
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(MediaSession.ControllerCb controllerCb, int i2) {
                    controllerCb.onDeviceVolumeChanged(i2, i, z);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onIsLoadingChanged(final boolean z) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithIsLoading(z);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.B3
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(MediaSession.ControllerCb controllerCb, int i) {
                    controllerCb.onIsLoadingChanged(i, z);
                }
            });
            session.schedulePeriodicSessionPositionInfoChanges();
        }

        @Override // androidx.media3.common.Player.Listener
        public void onIsPlayingChanged(final boolean z) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithIsPlaying(z);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.I3
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(MediaSession.ControllerCb controllerCb, int i) {
                    controllerCb.onIsPlayingChanged(i, z);
                }
            });
            session.schedulePeriodicSessionPositionInfoChanges();
        }

        @Override // androidx.media3.common.Player.Listener
        public void onMaxSeekToPreviousPositionChanged(long j) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithMaxSeekToPreviousPositionMs(j);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onMediaItemTransition(@Nullable final MediaItem mediaItem, final int i) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithMediaItemTransitionReason(i);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.M3
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(MediaSession.ControllerCb controllerCb, int i2) {
                    controllerCb.onMediaItemTransition(i2, MediaItem.this, i);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithMediaMetadata(mediaMetadata);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new C0591v0(mediaMetadata));
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlayWhenReadyChanged(final boolean z, final int i) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithPlayWhenReady(z, i, session.playerInfo.playbackSuppressionReason);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.Q3
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(MediaSession.ControllerCb controllerCb, int i2) {
                    controllerCb.onPlayWhenReadyChanged(i2, z, i);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithPlaybackParameters(playbackParameters);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new C0573s0(playbackParameters));
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlaybackStateChanged(final int i) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            final PlayerWrapper playerWrapper = this.player.get();
            if (playerWrapper == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithPlaybackState(i, playerWrapper.getPlayerError());
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.F3
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(MediaSession.ControllerCb controllerCb, int i2) {
                    MediaSessionImpl.PlayerListener.lambda$onPlaybackStateChanged$4(i, playerWrapper, controllerCb, i2);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlaybackSuppressionReasonChanged(final int i) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithPlayWhenReady(session.playerInfo.playWhenReady, session.playerInfo.playWhenReadyChangeReason, i);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.R3
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(MediaSession.ControllerCb controllerCb, int i2) {
                    controllerCb.onPlaybackSuppressionReasonChanged(i2, i);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlayerError(PlaybackException playbackException) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithPlayerError(playbackException);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new C0(playbackException, 2));
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            session.playerInfo = session.playerInfo.copyWithPlaylistMetadata(mediaMetadata);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new C0599w2(mediaMetadata));
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPositionDiscontinuity(final Player.PositionInfo positionInfo, final Player.PositionInfo positionInfo2, final int i) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithPositionInfos(positionInfo, positionInfo2, i);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.P3
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(MediaSession.ControllerCb controllerCb, int i2) {
                    controllerCb.onPositionDiscontinuity(i2, Player.PositionInfo.this, positionInfo2, i);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onRenderedFirstFrame() {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            ConnectedControllersManager<IBinder> connectedControllersManager = session.sessionStub.getConnectedControllersManager();
            com.google.common.collect.G<MediaSession.ControllerInfo> connectedControllers = connectedControllersManager.getConnectedControllers();
            for (int i = 0; i < connectedControllers.size(); i++) {
                MediaSession.ControllerInfo controllerInfo = connectedControllers.get(i);
                if (connectedControllersManager.getPlaybackException(controllerInfo) == null) {
                    session.dispatchRemoteControllerTaskWithoutReturn(controllerInfo, new L3());
                }
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public void onRepeatModeChanged(final int i) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithRepeatMode(i);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.J3
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(MediaSession.ControllerCb controllerCb, int i2) {
                    controllerCb.onRepeatModeChanged(i2, i);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onSeekBackIncrementChanged(final long j) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithSeekBackIncrement(j);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.O3
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(MediaSession.ControllerCb controllerCb, int i) {
                    controllerCb.onSeekBackIncrementChanged(i, j);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onSeekForwardIncrementChanged(final long j) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithSeekForwardIncrement(j);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.K3
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(MediaSession.ControllerCb controllerCb, int i) {
                    controllerCb.onSeekForwardIncrementChanged(i, j);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onShuffleModeEnabledChanged(boolean z) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithShuffleModeEnabled(z);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new C3(z));
        }

        @Override // androidx.media3.common.Player.Listener
        public void onTimelineChanged(final Timeline timeline, final int i) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            PlayerWrapper playerWrapper = this.player.get();
            if (playerWrapper == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithTimelineAndSessionPositionInfo(timeline, playerWrapper.createSessionPositionInfo(), i);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(false, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.G3
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(MediaSession.ControllerCb controllerCb, int i2) {
                    controllerCb.onTimelineChanged(i2, Timeline.this, i);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithTrackSelectionParameters(trackSelectionParameters);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskWithoutReturn(new C0525k0(trackSelectionParameters));
        }

        @Override // androidx.media3.common.Player.Listener
        public void onTracksChanged(Tracks tracks) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            if (this.player.get() == null) {
                return;
            }
            session.playerInfo = session.playerInfo.copyWithCurrentTracks(tracks);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, false);
            session.dispatchRemoteControllerTaskWithoutReturn(new E3(tracks));
        }

        @Override // androidx.media3.common.Player.Listener
        public void onVideoSizeChanged(VideoSize videoSize) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            session.playerInfo = session.playerInfo.copyWithVideoSize(videoSize);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new E0(videoSize, 2));
        }

        @Override // androidx.media3.common.Player.Listener
        public void onVolumeChanged(@FloatRange(from = 0.0d, to = 1.0d) final float f) {
            MediaSessionImpl session = getSession();
            if (session == null) {
                return;
            }
            session.verifyApplicationThread();
            session.playerInfo = session.playerInfo.copyWithVolume(f);
            session.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
            session.dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.H3
                @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                public final void run(MediaSession.ControllerCb controllerCb, int i) {
                    controllerCb.onVolumeChanged(i, f);
                }
            });
        }
    }

    public interface RemoteControllerTask {
        void run(MediaSession.ControllerCb controllerCb, int i) throws RemoteException;
    }

    public MediaSessionImpl(MediaSession mediaSession, Context context, String str, Player player, @Nullable PendingIntent pendingIntent, com.google.common.collect.G<CommandButton> g, com.google.common.collect.G<CommandButton> g2, com.google.common.collect.G<CommandButton> g3, MediaSession.Callback callback, Bundle bundle, Bundle bundle2, androidx.media3.common.util.BitmapLoader bitmapLoader, boolean z, boolean z2) {
        Log.i(TAG, "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + Util.DEVICE_DEBUG_INFO + "]");
        this.instance = mediaSession;
        this.context = context;
        this.sessionId = str;
        this.sessionActivity = pendingIntent;
        this.customLayout = g;
        this.mediaButtonPreferences = g2;
        this.commandButtonsForMediaItems = g3;
        this.callback = callback;
        this.sessionExtras = bundle2;
        this.bitmapLoader = bitmapLoader;
        this.playIfSuppressed = z;
        this.isPeriodicPositionUpdateEnabled = z2;
        MediaSessionStub mediaSessionStub = new MediaSessionStub(this);
        this.sessionStub = mediaSessionStub;
        this.mainHandler = new Handler(Looper.getMainLooper());
        Looper applicationLooper = player.getApplicationLooper();
        Handler handler = new Handler(applicationLooper);
        this.applicationHandler = handler;
        this.playerInfo = PlayerInfo.DEFAULT;
        this.onPlayerInfoChangedHandler = new PlayerInfoChangedHandler(applicationLooper);
        this.mediaPlayPauseKeyHandler = new MediaPlayPauseKeyHandler(applicationLooper);
        Uri build = new Uri.Builder().scheme(MediaSessionImpl.class.getName()).appendPath(str).appendPath(String.valueOf(SystemClock.elapsedRealtime())).build();
        this.sessionUri = build;
        MediaSession.ConnectionResult build2 = new MediaSession.ConnectionResult.AcceptedResultBuilder(mediaSession).build();
        MediaSessionLegacyStub mediaSessionLegacyStub = new MediaSessionLegacyStub(this, build, handler, bundle, z, g, g2, build2.availableSessionCommands, build2.availablePlayerCommands, bundle2);
        this.sessionLegacyStub = mediaSessionLegacyStub;
        this.sessionToken = new SessionToken(Process.myUid(), 0, MediaLibraryInfo.VERSION_INT, 5, context.getPackageName(), mediaSessionStub, bundle, mediaSessionLegacyStub.getSessionCompat().getSessionToken().getToken());
        final PlayerWrapper playerWrapper = new PlayerWrapper(player);
        this.playerWrapper = playerWrapper;
        Util.postOrRun(handler, new Runnable() { // from class: androidx.media3.session.w3
            @Override // java.lang.Runnable
            public final void run() {
                MediaSessionImpl.this.setPlayerInternal(null, playerWrapper);
            }
        });
        this.sessionPositionUpdateDelayMs = 3000L;
        this.periodicSessionPositionInfoUpdateRunnable = new Runnable() { // from class: androidx.media3.session.x3
            @Override // java.lang.Runnable
            public final void run() {
                MediaSessionImpl.this.notifyPeriodicSessionPositionInfoChangesOnHandler();
            }
        };
        Util.postOrRun(handler, new Runnable() { // from class: androidx.media3.session.y3
            @Override // java.lang.Runnable
            public final void run() {
                MediaSessionImpl.this.schedulePeriodicSessionPositionInfoChanges();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean applyMediaButtonKeyEvent(KeyEvent keyEvent, boolean z, boolean z2) {
        Runnable runnableC0521j3;
        final MediaSession.ControllerInfo controllerInfo = (MediaSession.ControllerInfo) Assertions.checkNotNull(this.instance.getMediaNotificationControllerInfo());
        int keyCode = keyEvent.getKeyCode();
        if ((keyCode == 85 || keyCode == 79) && z) {
            keyCode = 87;
        }
        if (keyCode == 126) {
            runnableC0521j3 = new RunnableC0521j3(0, this, controllerInfo);
        } else if (keyCode != 127) {
            if (keyCode != 272) {
                if (keyCode != 273) {
                    switch (keyCode) {
                        case 85:
                            if (!getPlayerWrapper().getPlayWhenReady()) {
                                runnableC0521j3 = new Runnable() { // from class: androidx.media3.session.i3
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        MediaSessionImpl.this.lambda$applyMediaButtonKeyEvent$25(controllerInfo);
                                    }
                                };
                                break;
                            } else {
                                runnableC0521j3 = new Runnable() { // from class: androidx.media3.session.g3
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        MediaSessionImpl.this.lambda$applyMediaButtonKeyEvent$24(controllerInfo);
                                    }
                                };
                                break;
                            }
                        case 86:
                            runnableC0521j3 = new Runnable() { // from class: androidx.media3.session.p3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    MediaSessionImpl.this.lambda$applyMediaButtonKeyEvent$32(controllerInfo);
                                }
                            };
                            break;
                        case 87:
                            break;
                        case 88:
                            break;
                        case 89:
                            runnableC0521j3 = new Runnable() { // from class: androidx.media3.session.o3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    MediaSessionImpl.this.lambda$applyMediaButtonKeyEvent$31(controllerInfo);
                                }
                            };
                            break;
                        case 90:
                            runnableC0521j3 = new Runnable() { // from class: androidx.media3.session.n3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    MediaSessionImpl.this.lambda$applyMediaButtonKeyEvent$30(controllerInfo);
                                }
                            };
                            break;
                        default:
                            return false;
                    }
                }
                runnableC0521j3 = new Runnable() { // from class: androidx.media3.session.m3
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSessionImpl.this.lambda$applyMediaButtonKeyEvent$29(controllerInfo);
                    }
                };
            }
            runnableC0521j3 = new Runnable() { // from class: androidx.media3.session.l3
                @Override // java.lang.Runnable
                public final void run() {
                    MediaSessionImpl.this.lambda$applyMediaButtonKeyEvent$28(controllerInfo);
                }
            };
        } else {
            runnableC0521j3 = new Runnable() { // from class: androidx.media3.session.k3
                @Override // java.lang.Runnable
                public final void run() {
                    MediaSessionImpl.this.lambda$applyMediaButtonKeyEvent$27(controllerInfo);
                }
            };
        }
        Util.postOrRun(getApplicationHandler(), new RunnableC0564q3(this, z2, controllerInfo, runnableC0521j3));
        return true;
    }

    @Nullable
    public static Player.Commands createPlayerCommandsForCustomErrorState(@Nullable Player.Commands commands) {
        if (commands == null) {
            return null;
        }
        Player.Commands.Builder buildUpon = Player.Commands.EMPTY.buildUpon();
        if (commands.contains(16)) {
            buildUpon.add(16);
        }
        if (commands.contains(17)) {
            buildUpon.add(17);
        }
        if (commands.contains(18)) {
            buildUpon.add(18);
        }
        if (commands.contains(21)) {
            buildUpon.add(21);
        }
        if (commands.contains(22)) {
            buildUpon.add(22);
        }
        if (commands.contains(23)) {
            buildUpon.add(23);
        }
        if (commands.contains(30)) {
            buildUpon.add(30);
        }
        if (commands.contains(32)) {
            buildUpon.add(32);
        }
        return buildUpon.build();
    }

    public static PlayerInfo createPlayerInfoForCustomPlaybackException(PlayerInfo playerInfo, PlaybackException playbackException) {
        PlayerInfo copyWithPlaybackState = playerInfo.copyWithPlaybackState(1, playbackException);
        SessionPositionInfo sessionPositionInfo = playerInfo.sessionPositionInfo;
        return copyWithPlaybackState.copyWithSessionPositionInfo(new SessionPositionInfo(sessionPositionInfo.positionInfo, sessionPositionInfo.isPlayingAd, sessionPositionInfo.eventTimeMs, sessionPositionInfo.durationMs, 0L, 0, 0L, sessionPositionInfo.currentLiveOffsetMs, sessionPositionInfo.contentDurationMs, 0L));
    }

    private void dispatchOnPeriodicSessionPositionInfoChanged(final SessionPositionInfo sessionPositionInfo) {
        ConnectedControllersManager<IBinder> connectedControllersManager = this.sessionStub.getConnectedControllersManager();
        com.google.common.collect.G<MediaSession.ControllerInfo> connectedControllers = connectedControllersManager.getConnectedControllers();
        for (int i = 0; i < connectedControllers.size(); i++) {
            final MediaSession.ControllerInfo controllerInfo = connectedControllers.get(i);
            if (connectedControllersManager.getPlaybackException(controllerInfo) == null) {
                final boolean isPlayerCommandAvailable = connectedControllersManager.isPlayerCommandAvailable(controllerInfo, 16);
                final boolean isPlayerCommandAvailable2 = connectedControllersManager.isPlayerCommandAvailable(controllerInfo, 17);
                dispatchRemoteControllerTaskWithoutReturn(controllerInfo, new RemoteControllerTask() { // from class: androidx.media3.session.u3
                    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
                    public final void run(MediaSession.ControllerCb controllerCb, int i2) {
                        MediaSessionImpl.lambda$dispatchOnPeriodicSessionPositionInfoChanged$21(SessionPositionInfo.this, isPlayerCommandAvailable, isPlayerCommandAvailable2, controllerInfo, controllerCb, i2);
                    }
                });
            }
        }
        try {
            this.sessionLegacyStub.getControllerLegacyCbForBroadcast().onPeriodicSessionPositionInfoChanged(0, sessionPositionInfo, true, true, 0);
        } catch (RemoteException e) {
            Log.e(TAG, "Exception in using media1 API", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchOnPlayerInfoChanged(PlayerInfo playerInfo, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        int i;
        PlayerInfo generateAndCacheUniqueTrackGroupIds = this.sessionStub.generateAndCacheUniqueTrackGroupIds(playerInfo);
        com.google.common.collect.G<MediaSession.ControllerInfo> connectedControllers = this.sessionStub.getConnectedControllersManager().getConnectedControllers();
        int i2 = 0;
        while (i2 < connectedControllers.size()) {
            MediaSession.ControllerInfo controllerInfo = connectedControllers.get(i2);
            try {
                ConnectedControllersManager<IBinder> connectedControllersManager = this.sessionStub.getConnectedControllersManager();
                SequencedFutureManager sequencedFutureManager = connectedControllersManager.getSequencedFutureManager(controllerInfo);
                if (sequencedFutureManager != null) {
                    i = sequencedFutureManager.obtainNextSequenceNumber();
                } else if (!isConnected(controllerInfo)) {
                    return;
                } else {
                    i = 0;
                }
                PlayerInfo playerInfoForPlaybackException = connectedControllersManager.getPlayerInfoForPlaybackException(controllerInfo);
                if (playerInfoForPlaybackException != null) {
                    z3 = z;
                    z4 = z2;
                } else {
                    PlaybackException playbackException = connectedControllersManager.getPlaybackException(controllerInfo);
                    if (playbackException != null) {
                        playerInfoForPlaybackException = createPlayerInfoForCustomPlaybackException(generateAndCacheUniqueTrackGroupIds, playbackException);
                        connectedControllersManager.setPlayerInfoForPlaybackException(controllerInfo, playerInfoForPlaybackException);
                    }
                    z3 = z;
                    z4 = z2;
                    try {
                        ((MediaSession.ControllerCb) Assertions.checkStateNotNull(controllerInfo.getControllerCb())).onPlayerInfoChanged(i, playerInfoForPlaybackException == null ? generateAndCacheUniqueTrackGroupIds : playerInfoForPlaybackException, MediaUtils.intersect(connectedControllersManager.getAvailablePlayerCommands(controllerInfo), getPlayerWrapper().getAvailableCommands()), z3, z4);
                    } catch (DeadObjectException unused) {
                        onDeadObjectException(controllerInfo);
                        i2++;
                        z = z3;
                        z2 = z4;
                    } catch (RemoteException e) {
                        e = e;
                        Log.w(TAG, "Exception in " + controllerInfo, e);
                        i2++;
                        z = z3;
                        z2 = z4;
                    }
                }
            } catch (DeadObjectException unused2) {
                z3 = z;
                z4 = z2;
            } catch (RemoteException e2) {
                e = e2;
                z3 = z;
                z4 = z2;
            }
            i2++;
            z = z3;
            z2 = z4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private com.google.common.util.concurrent.u<SessionResult> dispatchRemoteControllerTask(MediaSession.ControllerInfo controllerInfo, RemoteControllerTask remoteControllerTask) {
        int i;
        com.google.common.util.concurrent.r rVar;
        try {
            SequencedFutureManager sequencedFutureManager = this.sessionStub.getConnectedControllersManager().getSequencedFutureManager(controllerInfo);
            if (sequencedFutureManager != null) {
                SequencedFutureManager.SequencedFuture createSequencedFuture = sequencedFutureManager.createSequencedFuture(RESULT_WHEN_CLOSED);
                i = createSequencedFuture.getSequenceNumber();
                rVar = createSequencedFuture;
            } else {
                if (!isConnected(controllerInfo)) {
                    return com.google.common.util.concurrent.o.d(new SessionResult(-100));
                }
                i = 0;
                rVar = com.google.common.util.concurrent.o.d(new SessionResult(0));
            }
            MediaSession.ControllerCb controllerCb = controllerInfo.getControllerCb();
            if (controllerCb != null) {
                remoteControllerTask.run(controllerCb, i);
            }
            return rVar;
        } catch (DeadObjectException unused) {
            onDeadObjectException(controllerInfo);
            return com.google.common.util.concurrent.o.d(new SessionResult(-100));
        } catch (RemoteException e) {
            Log.w(TAG, "Exception in " + controllerInfo, e);
            return com.google.common.util.concurrent.o.d(new SessionResult(-1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchRemoteControllerTaskToLegacyStub(RemoteControllerTask remoteControllerTask) {
        try {
            remoteControllerTask.run(this.sessionLegacyStub.getControllerLegacyCbForBroadcast(), 0);
        } catch (RemoteException e) {
            Log.e(TAG, "Exception in using media1 API", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleAvailablePlayerCommandsChanged(Player.Commands commands) {
        this.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(false, false);
        dispatchRemoteControllerTaskWithoutReturn(new C0618z3(commands));
        dispatchRemoteControllerTaskToLegacyStub(new C0497g0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyMediaButtonKeyEvent$24(MediaSession.ControllerInfo controllerInfo) {
        this.sessionStub.pauseForControllerInfo(controllerInfo, Integer.MIN_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyMediaButtonKeyEvent$25(MediaSession.ControllerInfo controllerInfo) {
        this.sessionStub.playForControllerInfo(controllerInfo, Integer.MIN_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyMediaButtonKeyEvent$26(MediaSession.ControllerInfo controllerInfo) {
        this.sessionStub.playForControllerInfo(controllerInfo, Integer.MIN_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyMediaButtonKeyEvent$27(MediaSession.ControllerInfo controllerInfo) {
        this.sessionStub.pauseForControllerInfo(controllerInfo, Integer.MIN_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyMediaButtonKeyEvent$28(MediaSession.ControllerInfo controllerInfo) {
        this.sessionStub.seekToNextForControllerInfo(controllerInfo, Integer.MIN_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyMediaButtonKeyEvent$29(MediaSession.ControllerInfo controllerInfo) {
        this.sessionStub.seekToPreviousForControllerInfo(controllerInfo, Integer.MIN_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyMediaButtonKeyEvent$30(MediaSession.ControllerInfo controllerInfo) {
        this.sessionStub.seekForwardForControllerInfo(controllerInfo, Integer.MIN_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyMediaButtonKeyEvent$31(MediaSession.ControllerInfo controllerInfo) {
        this.sessionStub.seekBackForControllerInfo(controllerInfo, Integer.MIN_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyMediaButtonKeyEvent$32(MediaSession.ControllerInfo controllerInfo) {
        this.sessionStub.stopForControllerInfo(controllerInfo, Integer.MIN_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyMediaButtonKeyEvent$33(boolean z, MediaSession.ControllerInfo controllerInfo, Runnable runnable) {
        if (z) {
            Bundle bundle = Bundle.EMPTY;
            sendCustomCommand(controllerInfo, new SessionCommand(MediaNotification.NOTIFICATION_DISMISSED_EVENT_KEY, bundle), bundle);
        }
        runnable.run();
        this.sessionStub.getConnectedControllersManager().flushCommandQueue(controllerInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$callWithControllerForCurrentRequestSet$3(MediaSession.ControllerInfo controllerInfo, Runnable runnable) {
        this.controllerForCurrentRequest = controllerInfo;
        runnable.run();
        this.controllerForCurrentRequest = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$dispatchOnPeriodicSessionPositionInfoChanged$21(SessionPositionInfo sessionPositionInfo, boolean z, boolean z2, MediaSession.ControllerInfo controllerInfo, MediaSession.ControllerCb controllerCb, int i) throws RemoteException {
        controllerCb.onPeriodicSessionPositionInfoChanged(i, sessionPositionInfo, z, z2, controllerInfo.getInterfaceVersion());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleAvailablePlayerCommandsChanged$23(MediaSession.ControllerCb controllerCb, int i) throws RemoteException {
        controllerCb.onDeviceInfoChanged(i, this.playerInfo.deviceInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onNotificationRefreshRequired$19() {
        MediaSession.Listener listener = this.mediaSessionListener;
        if (listener != null) {
            listener.onNotificationRefreshRequired(this.instance);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onPlayRequested$20(com.google.common.util.concurrent.x xVar) {
        xVar.set(Boolean.valueOf(onPlayRequested()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$2() {
        PlayerListener playerListener = this.playerListener;
        if (playerListener != null) {
            this.playerWrapper.removeListener(playerListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyPeriodicSessionPositionInfoChangesOnHandler() {
        synchronized (this.lock) {
            try {
                if (this.closed) {
                    return;
                }
                SessionPositionInfo createSessionPositionInfo = this.playerWrapper.createSessionPositionInfo();
                if (!this.onPlayerInfoChangedHandler.hasPendingPlayerInfoChangedUpdate() && MediaUtils.areSessionPositionInfosInSamePeriodOrAd(createSessionPositionInfo, this.playerInfo.sessionPositionInfo)) {
                    dispatchOnPeriodicSessionPositionInfoChanged(createSessionPositionInfo);
                }
                schedulePeriodicSessionPositionInfoChanges();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void onDeadObjectException(MediaSession.ControllerInfo controllerInfo) {
        this.sessionStub.getConnectedControllersManager().removeController(controllerInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOrRunOnApplicationHandler(Runnable runnable) {
        Util.postOrRun(getApplicationHandler(), runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void schedulePeriodicSessionPositionInfoChanges() {
        this.applicationHandler.removeCallbacks(this.periodicSessionPositionInfoUpdateRunnable);
        if (!this.isPeriodicPositionUpdateEnabled || this.sessionPositionUpdateDelayMs <= 0) {
            return;
        }
        if (this.playerWrapper.isPlaying() || this.playerWrapper.isLoading()) {
            this.applicationHandler.postDelayed(this.periodicSessionPositionInfoUpdateRunnable, this.sessionPositionUpdateDelayMs);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerInternal(@Nullable final PlayerWrapper playerWrapper, final PlayerWrapper playerWrapper2) {
        this.playerWrapper = playerWrapper2;
        if (playerWrapper != null) {
            playerWrapper.removeListener((Player.Listener) Assertions.checkStateNotNull(this.playerListener));
        }
        PlayerListener playerListener = new PlayerListener(this, playerWrapper2);
        playerWrapper2.addListener(playerListener);
        this.playerListener = playerListener;
        dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.b3
            @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
            public final void run(MediaSession.ControllerCb controllerCb, int i) {
                controllerCb.onPlayerChanged(i, PlayerWrapper.this, playerWrapper2);
            }
        });
        if (playerWrapper == null) {
            this.sessionLegacyStub.start();
        }
        this.playerInfo = playerWrapper2.createInitialPlayerInfo();
        handleAvailablePlayerCommandsChanged(playerWrapper2.getAvailableCommands());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void verifyApplicationThread() {
        if (Looper.myLooper() != this.applicationHandler.getLooper()) {
            throw new IllegalStateException(WRONG_THREAD_ERROR_MESSAGE);
        }
    }

    public void broadcastCustomCommand(final SessionCommand sessionCommand, final Bundle bundle) {
        dispatchRemoteControllerTaskWithoutReturn(new RemoteControllerTask() { // from class: androidx.media3.session.d3
            @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
            public final void run(MediaSession.ControllerCb controllerCb, int i) {
                controllerCb.sendCustomCommand(i, SessionCommand.this, bundle);
            }
        });
    }

    @CheckResult
    public Runnable callWithControllerForCurrentRequestSet(@Nullable final MediaSession.ControllerInfo controllerInfo, final Runnable runnable) {
        return new Runnable() { // from class: androidx.media3.session.r3
            @Override // java.lang.Runnable
            public final void run() {
                MediaSessionImpl.this.lambda$callWithControllerForCurrentRequestSet$3(controllerInfo, runnable);
            }
        };
    }

    public boolean canResumePlaybackOnStart() {
        return this.sessionLegacyStub.canResumePlaybackOnStart();
    }

    public void clearMediaSessionListener() {
        this.mediaSessionListener = null;
    }

    public void connectFromService(IMediaController iMediaController, MediaSession.ControllerInfo controllerInfo) {
        this.sessionStub.connect(iMediaController, controllerInfo);
    }

    public MediaSessionServiceLegacyStub createLegacyBrowserService(MediaSessionCompat.Token token) {
        MediaSessionServiceLegacyStub mediaSessionServiceLegacyStub = new MediaSessionServiceLegacyStub(this);
        mediaSessionServiceLegacyStub.initialize(token);
        return mediaSessionServiceLegacyStub;
    }

    public void dispatchRemoteControllerTaskWithoutReturn(RemoteControllerTask remoteControllerTask) {
        com.google.common.collect.G<MediaSession.ControllerInfo> connectedControllers = this.sessionStub.getConnectedControllersManager().getConnectedControllers();
        for (int i = 0; i < connectedControllers.size(); i++) {
            dispatchRemoteControllerTaskWithoutReturn(connectedControllers.get(i), remoteControllerTask);
        }
        try {
            remoteControllerTask.run(this.sessionLegacyStub.getControllerLegacyCbForBroadcast(), 0);
        } catch (RemoteException e) {
            Log.e(TAG, "Exception in using media1 API", e);
        }
    }

    public Handler getApplicationHandler() {
        return this.applicationHandler;
    }

    public androidx.media3.common.util.BitmapLoader getBitmapLoader() {
        return this.bitmapLoader;
    }

    public com.google.common.collect.G<CommandButton> getCommandButtonsForMediaItems() {
        return this.commandButtonsForMediaItems;
    }

    public List<MediaSession.ControllerInfo> getConnectedControllers() {
        com.google.common.collect.G<MediaSession.ControllerInfo> connectedControllers = this.sessionStub.getConnectedControllersManager().getConnectedControllers();
        com.google.common.collect.G<MediaSession.ControllerInfo> connectedControllers2 = this.sessionLegacyStub.getConnectedControllersManager().getConnectedControllers();
        G.a i = com.google.common.collect.G.i(connectedControllers2.size() + connectedControllers.size());
        if (!this.isMediaNotificationControllerConnected) {
            i.e(connectedControllers);
            i.e(connectedControllers2);
            return i.g();
        }
        for (int i2 = 0; i2 < connectedControllers.size(); i2++) {
            MediaSession.ControllerInfo controllerInfo = connectedControllers.get(i2);
            if (!isSystemUiController(controllerInfo)) {
                i.c(controllerInfo);
            }
        }
        for (int i3 = 0; i3 < connectedControllers2.size(); i3++) {
            MediaSession.ControllerInfo controllerInfo2 = connectedControllers2.get(i3);
            if (!isSystemUiController(controllerInfo2)) {
                i.c(controllerInfo2);
            }
        }
        return i.g();
    }

    public Context getContext() {
        return this.context;
    }

    @Nullable
    public MediaSession.ControllerInfo getControllerForCurrentRequest() {
        MediaSession.ControllerInfo controllerInfo = this.controllerForCurrentRequest;
        if (controllerInfo != null) {
            return resolveControllerInfoForCallback(controllerInfo);
        }
        return null;
    }

    public com.google.common.collect.G<CommandButton> getCustomLayout() {
        return this.customLayout;
    }

    public String getId() {
        return this.sessionId;
    }

    @Nullable
    public MediaSessionServiceLegacyStub getLegacyBrowserService() {
        MediaSessionServiceLegacyStub mediaSessionServiceLegacyStub;
        synchronized (this.lock) {
            mediaSessionServiceLegacyStub = this.browserServiceLegacyStub;
        }
        return mediaSessionServiceLegacyStub;
    }

    @Nullable
    public IBinder getLegacyBrowserServiceBinder() {
        MediaSessionServiceLegacyStub mediaSessionServiceLegacyStub;
        synchronized (this.lock) {
            try {
                if (this.browserServiceLegacyStub == null) {
                    this.browserServiceLegacyStub = createLegacyBrowserService(this.sessionLegacyStub.getSessionCompat().getSessionToken());
                }
                mediaSessionServiceLegacyStub = this.browserServiceLegacyStub;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaSessionServiceLegacyStub.onBind(new Intent("android.media.browse.MediaBrowserService"));
    }

    public com.google.common.collect.G<CommandButton> getMediaButtonPreferences() {
        return this.mediaButtonPreferences;
    }

    @Nullable
    public MediaSession.ControllerInfo getMediaNotificationControllerInfo() {
        com.google.common.collect.G<MediaSession.ControllerInfo> connectedControllers = this.sessionStub.getConnectedControllersManager().getConnectedControllers();
        for (int i = 0; i < connectedControllers.size(); i++) {
            MediaSession.ControllerInfo controllerInfo = connectedControllers.get(i);
            if (isMediaNotificationController(controllerInfo)) {
                return controllerInfo;
            }
        }
        return null;
    }

    public MediaSessionLegacyStub getMediaSessionLegacyStub() {
        return this.sessionLegacyStub;
    }

    public MediaSession.Token getPlatformToken() {
        return this.sessionLegacyStub.getSessionCompat().getSessionToken().getToken();
    }

    @Nullable
    public PlaybackException getPlaybackException() {
        return this.playbackException;
    }

    public PlayerInfo getPlayerInfo() {
        return this.playerInfo;
    }

    public PlayerWrapper getPlayerWrapper() {
        return this.playerWrapper;
    }

    @Nullable
    public PendingIntent getSessionActivity() {
        return this.sessionActivity;
    }

    public Bundle getSessionExtras() {
        return this.sessionExtras;
    }

    @Nullable
    public MediaSession.ControllerInfo getSystemUiControllerInfo() {
        com.google.common.collect.G<MediaSession.ControllerInfo> connectedControllers = this.sessionLegacyStub.getConnectedControllersManager().getConnectedControllers();
        for (int i = 0; i < connectedControllers.size(); i++) {
            MediaSession.ControllerInfo controllerInfo = connectedControllers.get(i);
            if (isSystemUiController(controllerInfo)) {
                return controllerInfo;
            }
        }
        com.google.common.collect.G<MediaSession.ControllerInfo> connectedControllers2 = this.sessionStub.getConnectedControllersManager().getConnectedControllers();
        for (int i2 = 0; i2 < connectedControllers2.size(); i2++) {
            MediaSession.ControllerInfo controllerInfo2 = connectedControllers2.get(i2);
            if (isSystemUiController(controllerInfo2)) {
                return controllerInfo2;
            }
        }
        return null;
    }

    public SessionToken getToken() {
        return this.sessionToken;
    }

    public Uri getUri() {
        return this.sessionUri;
    }

    public void handleMediaControllerPlayRequest(MediaSession.ControllerInfo controllerInfo, boolean z) {
        if (onPlayRequested()) {
            boolean z2 = this.playerWrapper.isCommandAvailable(16) && this.playerWrapper.getCurrentMediaItem() != null;
            boolean z3 = this.playerWrapper.isCommandAvailable(31) || this.playerWrapper.isCommandAvailable(20);
            MediaSession.ControllerInfo resolveControllerInfoForCallback = resolveControllerInfoForCallback(controllerInfo);
            Player.Commands build = new Player.Commands.Builder().add(1).build();
            if (!z2 && z3) {
                com.google.common.util.concurrent.o.a((com.google.common.util.concurrent.u) Assertions.checkNotNull(this.callback.onPlaybackResumption(this.instance, resolveControllerInfoForCallback), "Callback.onPlaybackResumption must return a non-null future"), new AnonymousClass1(resolveControllerInfoForCallback, z, build), new Executor() { // from class: androidx.media3.session.v3
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        MediaSessionImpl.this.postOrRunOnApplicationHandler(runnable);
                    }
                });
                return;
            }
            if (!z2) {
                Log.w(TAG, "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
            }
            Util.handlePlayButtonAction(this.playerWrapper);
            if (z) {
                onPlayerInteractionFinishedOnHandler(resolveControllerInfoForCallback, build);
            }
        }
    }

    public boolean isAutoCompanionController(MediaSession.ControllerInfo controllerInfo) {
        return controllerInfo.getPackageName().equals(ANDROID_AUTO_PACKAGE_NAME);
    }

    public boolean isAutomotiveController(MediaSession.ControllerInfo controllerInfo) {
        return controllerInfo.getPackageName().equals(ANDROID_AUTOMOTIVE_MEDIA_PACKAGE_NAME) || controllerInfo.getPackageName().equals(ANDROID_AUTOMOTIVE_LAUNCHER_PACKAGE_NAME);
    }

    public boolean isConnected(MediaSession.ControllerInfo controllerInfo) {
        return this.sessionStub.getConnectedControllersManager().isConnected(controllerInfo) || this.sessionLegacyStub.getConnectedControllersManager().isConnected(controllerInfo);
    }

    public boolean isMediaNotificationController(MediaSession.ControllerInfo controllerInfo) {
        return Objects.equals(controllerInfo.getPackageName(), this.context.getPackageName()) && controllerInfo.getControllerVersion() != 0 && controllerInfo.getConnectionHints().getBoolean(MediaController.KEY_MEDIA_NOTIFICATION_CONTROLLER_FLAG, false);
    }

    public boolean isMediaNotificationControllerConnected() {
        return this.isMediaNotificationControllerConnected;
    }

    public boolean isReleased() {
        boolean z;
        synchronized (this.lock) {
            z = this.closed;
        }
        return z;
    }

    public boolean isSystemUiController(@Nullable MediaSession.ControllerInfo controllerInfo) {
        return controllerInfo != null && Objects.equals(controllerInfo.getPackageName(), SYSTEM_UI_PACKAGE_NAME);
    }

    public com.google.common.util.concurrent.u<List<MediaItem>> onAddMediaItemsOnHandler(MediaSession.ControllerInfo controllerInfo, List<MediaItem> list) {
        return (com.google.common.util.concurrent.u) Assertions.checkNotNull(this.callback.onAddMediaItems(this.instance, resolveControllerInfoForCallback(controllerInfo), list), "Callback.onAddMediaItems must return a non-null future");
    }

    public MediaSession.ConnectionResult onConnectOnHandler(MediaSession.ControllerInfo controllerInfo) {
        if (this.isMediaNotificationControllerConnected && isSystemUiController(controllerInfo)) {
            return this.sessionLegacyStub.getPlatformConnectionResult(this.instance);
        }
        MediaSession.ConnectionResult connectionResult = (MediaSession.ConnectionResult) Assertions.checkNotNull(this.callback.onConnect(this.instance, controllerInfo), "Callback.onConnect must return non-null future");
        if (isMediaNotificationController(controllerInfo) && connectionResult.isAccepted) {
            this.isMediaNotificationControllerConnected = true;
            com.google.common.collect.G<CommandButton> g = connectionResult.mediaButtonPreferences;
            if (g == null) {
                g = this.instance.getMediaButtonPreferences();
            }
            if (g.isEmpty()) {
                MediaSessionLegacyStub mediaSessionLegacyStub = this.sessionLegacyStub;
                com.google.common.collect.G<CommandButton> g2 = connectionResult.customLayout;
                if (g2 == null) {
                    g2 = this.instance.getCustomLayout();
                }
                mediaSessionLegacyStub.setPlatformCustomLayout(g2);
            } else {
                this.sessionLegacyStub.setPlatformMediaButtonPreferences(g);
            }
            this.sessionLegacyStub.setAvailableCommands(connectionResult.availableSessionCommands, connectionResult.availablePlayerCommands);
        }
        return connectionResult;
    }

    public com.google.common.util.concurrent.u<SessionResult> onCustomCommandOnHandler(MediaSession.ControllerInfo controllerInfo, SessionCommand sessionCommand, Bundle bundle) {
        return (com.google.common.util.concurrent.u) Assertions.checkNotNull(this.callback.onCustomCommand(this.instance, resolveControllerInfoForCallback(controllerInfo), sessionCommand, bundle), "Callback.onCustomCommandOnHandler must return non-null future");
    }

    public void onDisconnectedOnHandler(MediaSession.ControllerInfo controllerInfo) {
        if (this.isMediaNotificationControllerConnected) {
            if (isSystemUiController(controllerInfo)) {
                return;
            }
            if (isMediaNotificationController(controllerInfo)) {
                this.isMediaNotificationControllerConnected = false;
            }
        }
        this.callback.onDisconnected(this.instance, controllerInfo);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onMediaButtonEvent(MediaSession.ControllerInfo controllerInfo, Intent intent) {
        boolean z;
        KeyEvent keyEvent = DefaultActionFactory.getKeyEvent(intent);
        ComponentName component = intent.getComponent();
        if (!Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") || ((component != null && !Objects.equals(component.getPackageName(), this.context.getPackageName())) || keyEvent == null || keyEvent.getAction() != 0)) {
            return false;
        }
        verifyApplicationThread();
        if (this.callback.onMediaButtonEvent(this.instance, controllerInfo, intent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        boolean hasSystemFeature = this.context.getPackageManager().hasSystemFeature("android.software.leanback");
        if (keyCode != 79 && keyCode != 85) {
            this.mediaPlayPauseKeyHandler.flush();
        } else {
            if (!hasSystemFeature && controllerInfo.getControllerVersion() == 0 && keyEvent.getRepeatCount() == 0) {
                if (!this.mediaPlayPauseKeyHandler.hasPendingPlayPauseTask()) {
                    this.mediaPlayPauseKeyHandler.setPendingPlayPauseTask(controllerInfo, keyEvent);
                    return true;
                }
                this.mediaPlayPauseKeyHandler.clearPendingPlayPauseTask();
                z = true;
                if (!isMediaNotificationControllerConnected()) {
                    return applyMediaButtonKeyEvent(keyEvent, z, intent.getBooleanExtra(MediaNotification.NOTIFICATION_DISMISSED_EVENT_KEY, false));
                }
                if ((keyCode == 85 || keyCode == 79) && z) {
                    this.sessionLegacyStub.onSkipToNext();
                    return true;
                }
                if (controllerInfo.getControllerVersion() == 0) {
                    return false;
                }
                this.sessionLegacyStub.getSessionCompat().getController().dispatchMediaButtonEvent(keyEvent);
                return true;
            }
            this.mediaPlayPauseKeyHandler.flush();
        }
        z = false;
        if (!isMediaNotificationControllerConnected()) {
        }
    }

    public void onNotificationRefreshRequired() {
        Util.postOrRun(this.mainHandler, new Runnable() { // from class: androidx.media3.session.f3
            @Override // java.lang.Runnable
            public final void run() {
                MediaSessionImpl.this.lambda$onNotificationRefreshRequired$19();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onPlayRequested() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            MediaSession.Listener listener = this.mediaSessionListener;
            if (listener != null) {
                return listener.onPlayRequested(this.instance);
            }
            return true;
        }
        final com.google.common.util.concurrent.x xVar = new com.google.common.util.concurrent.x();
        this.mainHandler.post(new Runnable() { // from class: androidx.media3.session.t3
            @Override // java.lang.Runnable
            public final void run() {
                MediaSessionImpl.this.lambda$onPlayRequested$20(xVar);
            }
        });
        try {
            return ((Boolean) xVar.get()).booleanValue();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    public int onPlayerCommandRequestOnHandler(MediaSession.ControllerInfo controllerInfo, int i) {
        return this.callback.onPlayerCommandRequest(this.instance, resolveControllerInfoForCallback(controllerInfo), i);
    }

    public void onPlayerInteractionFinishedOnHandler(MediaSession.ControllerInfo controllerInfo, Player.Commands commands) {
        this.callback.onPlayerInteractionFinished(this.instance, resolveControllerInfoForCallback(controllerInfo), commands);
    }

    public void onPostConnectOnHandler(MediaSession.ControllerInfo controllerInfo) {
        if (this.isMediaNotificationControllerConnected && isSystemUiController(controllerInfo)) {
            return;
        }
        this.callback.onPostConnect(this.instance, controllerInfo);
    }

    public com.google.common.util.concurrent.u<MediaSession.MediaItemsWithStartPosition> onSetMediaItemsOnHandler(MediaSession.ControllerInfo controllerInfo, List<MediaItem> list, int i, long j) {
        return (com.google.common.util.concurrent.u) Assertions.checkNotNull(this.callback.onSetMediaItems(this.instance, resolveControllerInfoForCallback(controllerInfo), list, i, j), "Callback.onSetMediaItems must return a non-null future");
    }

    public com.google.common.util.concurrent.u<SessionResult> onSetRatingOnHandler(MediaSession.ControllerInfo controllerInfo, String str, Rating rating) {
        return (com.google.common.util.concurrent.u) Assertions.checkNotNull(this.callback.onSetRating(this.instance, resolveControllerInfoForCallback(controllerInfo), str, rating), "Callback.onSetRating must return non-null future");
    }

    public void release() {
        Log.i(TAG, "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + Util.DEVICE_DEBUG_INFO + "] [" + MediaLibraryInfo.registeredModules() + "]");
        synchronized (this.lock) {
            try {
                if (this.closed) {
                    return;
                }
                this.closed = true;
                this.mediaPlayPauseKeyHandler.clearPendingPlayPauseTask();
                this.applicationHandler.removeCallbacksAndMessages(null);
                try {
                    Util.postOrRun(this.applicationHandler, new Runnable() { // from class: androidx.media3.session.h3
                        @Override // java.lang.Runnable
                        public final void run() {
                            MediaSessionImpl.this.lambda$release$2();
                        }
                    });
                } catch (Exception e) {
                    Log.w(TAG, "Exception thrown while closing", e);
                }
                this.sessionLegacyStub.release();
                this.sessionStub.release();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public MediaSession.ControllerInfo resolveControllerInfoForCallback(MediaSession.ControllerInfo controllerInfo) {
        return (this.isMediaNotificationControllerConnected && isSystemUiController(controllerInfo)) ? (MediaSession.ControllerInfo) Assertions.checkNotNull(getMediaNotificationControllerInfo()) : controllerInfo;
    }

    public com.google.common.util.concurrent.u<SessionResult> sendCustomCommand(MediaSession.ControllerInfo controllerInfo, SessionCommand sessionCommand, Bundle bundle) {
        return dispatchRemoteControllerTask(controllerInfo, new P0(sessionCommand, bundle));
    }

    public void sendError(MediaSession.ControllerInfo controllerInfo, SessionError sessionError) {
        if (controllerInfo.getControllerVersion() == 0 || controllerInfo.getInterfaceVersion() >= 4) {
            if (isMediaNotificationController(controllerInfo) || controllerInfo.getControllerVersion() == 0) {
                dispatchRemoteControllerTaskToLegacyStub(new V1(sessionError));
            } else {
                dispatchRemoteControllerTaskWithoutReturn(controllerInfo, new C0486e3(sessionError));
            }
        }
    }

    public void setAvailableCommands(MediaSession.ControllerInfo controllerInfo, SessionCommands sessionCommands, Player.Commands commands) {
        if (!this.sessionStub.getConnectedControllersManager().isConnected(controllerInfo)) {
            if (controllerInfo.getControllerVersion() == 0) {
                this.sessionLegacyStub.getConnectedControllersManager().updateCommandsFromSession(controllerInfo, sessionCommands, commands);
                return;
            }
            return;
        }
        if (isMediaNotificationController(controllerInfo)) {
            this.sessionLegacyStub.setAvailableCommands(sessionCommands, commands);
            MediaSession.ControllerInfo systemUiControllerInfo = getSystemUiControllerInfo();
            if (systemUiControllerInfo != null) {
                (systemUiControllerInfo.getControllerVersion() == 0 ? this.sessionLegacyStub.getConnectedControllersManager() : this.sessionStub.getConnectedControllersManager()).updateCommandsFromSession(systemUiControllerInfo, sessionCommands, commands);
            }
        }
        this.sessionStub.getConnectedControllersManager().updateCommandsFromSession(controllerInfo, sessionCommands, commands);
        Player.Commands availablePlayerCommands = this.sessionStub.getConnectedControllersManager().getAvailablePlayerCommands(controllerInfo);
        if (availablePlayerCommands != null) {
            dispatchRemoteControllerTaskWithoutReturn(controllerInfo, new C0539m2(sessionCommands, availablePlayerCommands));
            this.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(false, false);
        }
    }

    public com.google.common.util.concurrent.u<SessionResult> setCustomLayout(MediaSession.ControllerInfo controllerInfo, com.google.common.collect.G<CommandButton> g) {
        if (isMediaNotificationController(controllerInfo)) {
            this.sessionLegacyStub.setPlatformCustomLayout(g);
            this.sessionLegacyStub.updateLegacySessionPlaybackState(this.playerWrapper);
        }
        return dispatchRemoteControllerTask(controllerInfo, new C0556p1(g));
    }

    public void setLegacyControllerConnectionTimeoutMs(long j) {
        this.sessionLegacyStub.setLegacyControllerDisconnectTimeoutMs(j);
    }

    public com.google.common.util.concurrent.u<SessionResult> setMediaButtonPreferences(MediaSession.ControllerInfo controllerInfo, com.google.common.collect.G<CommandButton> g) {
        if (isMediaNotificationController(controllerInfo)) {
            this.sessionLegacyStub.setPlatformMediaButtonPreferences(g);
            this.sessionLegacyStub.updateLegacySessionPlaybackState(this.playerWrapper);
        }
        return dispatchRemoteControllerTask(controllerInfo, new O0(g, 2));
    }

    public void setMediaSessionListener(MediaSession.Listener listener) {
        this.mediaSessionListener = listener;
    }

    public void setPlaybackException(MediaSession.ControllerInfo controllerInfo, @Nullable PlaybackException playbackException) {
        ConnectedControllersManager<IBinder> connectedControllersManager = this.sessionStub.getConnectedControllersManager();
        PlaybackException playbackException2 = connectedControllersManager.getPlaybackException(controllerInfo);
        if (!connectedControllersManager.isConnected(controllerInfo) || PlaybackException.areErrorInfosEqual(playbackException, playbackException2)) {
            return;
        }
        Player.Commands availablePlayerCommands = playbackException2 == null ? connectedControllersManager.getAvailablePlayerCommands(controllerInfo) : connectedControllersManager.getPlayerCommandsBeforePlaybackException(controllerInfo);
        if (isMediaNotificationController(controllerInfo)) {
            this.sessionLegacyStub.setPlaybackException(playbackException, playbackException != null ? createPlayerCommandsForCustomErrorState(availablePlayerCommands) : null);
        }
        Player.Commands createPlayerCommandsForCustomErrorState = playbackException != null ? createPlayerCommandsForCustomErrorState(availablePlayerCommands) : connectedControllersManager.getPlayerCommandsBeforePlaybackException(controllerInfo);
        SessionCommands availableSessionCommands = connectedControllersManager.getAvailableSessionCommands(controllerInfo);
        if (createPlayerCommandsForCustomErrorState == null || availableSessionCommands == null) {
            return;
        }
        connectedControllersManager.resetPlaybackException(controllerInfo);
        setAvailableCommands(controllerInfo, availableSessionCommands, createPlayerCommandsForCustomErrorState);
        if (playbackException != null) {
            connectedControllersManager.setPlaybackException(controllerInfo, playbackException, (Player.Commands) Assertions.checkNotNull(availablePlayerCommands));
        }
    }

    public void setPlayer(Player player) {
        if (player == this.playerWrapper.getWrappedPlayer()) {
            return;
        }
        setPlayerInternal(this.playerWrapper, new PlayerWrapper(player));
    }

    @UnstableApi
    public void setSessionActivity(@Nullable PendingIntent pendingIntent) {
        this.sessionActivity = pendingIntent;
        com.google.common.collect.G<MediaSession.ControllerInfo> connectedControllers = this.sessionStub.getConnectedControllersManager().getConnectedControllers();
        for (int i = 0; i < connectedControllers.size(); i++) {
            setSessionActivity(connectedControllers.get(i), pendingIntent);
        }
    }

    public void setSessionExtras(Bundle bundle) {
        this.sessionExtras = bundle;
        dispatchRemoteControllerTaskWithoutReturn(new C0569r2(bundle));
    }

    public void setSessionPositionUpdateDelayMsOnHandler(long j) {
        verifyApplicationThread();
        this.sessionPositionUpdateDelayMs = j;
        schedulePeriodicSessionPositionInfoChanges();
    }

    public boolean shouldPlayIfSuppressed() {
        return this.playIfSuppressed;
    }

    public void triggerPlayerInfoUpdate() {
        this.onPlayerInfoChangedHandler.sendPlayerInfoChangedMessage(true, true);
    }

    public void setSessionExtras(MediaSession.ControllerInfo controllerInfo, Bundle bundle) {
        if (this.sessionStub.getConnectedControllersManager().isConnected(controllerInfo)) {
            dispatchRemoteControllerTaskWithoutReturn(controllerInfo, new V(bundle));
            if (isMediaNotificationController(controllerInfo)) {
                dispatchRemoteControllerTaskToLegacyStub(new C0538m1(bundle));
            }
        }
    }

    public com.google.common.util.concurrent.u<SessionResult> onSetRatingOnHandler(MediaSession.ControllerInfo controllerInfo, Rating rating) {
        return (com.google.common.util.concurrent.u) Assertions.checkNotNull(this.callback.onSetRating(this.instance, resolveControllerInfoForCallback(controllerInfo), rating), "Callback.onSetRating must return non-null future");
    }

    public void setCustomLayout(com.google.common.collect.G<CommandButton> g) {
        this.customLayout = g;
        this.sessionLegacyStub.setPlatformCustomLayout(g);
        dispatchRemoteControllerTaskWithoutReturn(new C0455a0(g));
    }

    public void setMediaButtonPreferences(final com.google.common.collect.G<CommandButton> g) {
        this.mediaButtonPreferences = g;
        this.sessionLegacyStub.setPlatformMediaButtonPreferences(g);
        dispatchRemoteControllerTaskWithoutReturn(new RemoteControllerTask() { // from class: androidx.media3.session.s3
            @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
            public final void run(MediaSession.ControllerCb controllerCb, int i) {
                controllerCb.setMediaButtonPreferences(i, com.google.common.collect.G.this);
            }
        });
    }

    @UnstableApi
    public void setSessionActivity(MediaSession.ControllerInfo controllerInfo, @Nullable PendingIntent pendingIntent) {
        if (controllerInfo.getControllerVersion() < 3 || !this.sessionStub.getConnectedControllersManager().isConnected(controllerInfo)) {
            return;
        }
        dispatchRemoteControllerTaskWithoutReturn(controllerInfo, new C0614z(pendingIntent));
        if (isMediaNotificationController(controllerInfo)) {
            dispatchRemoteControllerTaskToLegacyStub(new A(pendingIntent));
        }
    }

    public void sendError(final SessionError sessionError) {
        com.google.common.collect.G<MediaSession.ControllerInfo> connectedControllers = this.sessionStub.getConnectedControllersManager().getConnectedControllers();
        for (int i = 0; i < connectedControllers.size(); i++) {
            MediaSession.ControllerInfo controllerInfo = connectedControllers.get(i);
            if (!isMediaNotificationController(controllerInfo)) {
                sendError(controllerInfo, sessionError);
            }
        }
        dispatchRemoteControllerTaskToLegacyStub(new RemoteControllerTask() { // from class: androidx.media3.session.c3
            @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
            public final void run(MediaSession.ControllerCb controllerCb, int i2) {
                controllerCb.onError(i2, SessionError.this);
            }
        });
    }

    public void dispatchRemoteControllerTaskWithoutReturn(MediaSession.ControllerInfo controllerInfo, RemoteControllerTask remoteControllerTask) {
        int i;
        try {
            SequencedFutureManager sequencedFutureManager = this.sessionStub.getConnectedControllersManager().getSequencedFutureManager(controllerInfo);
            if (sequencedFutureManager != null) {
                i = sequencedFutureManager.obtainNextSequenceNumber();
            } else if (!isConnected(controllerInfo)) {
                return;
            } else {
                i = 0;
            }
            MediaSession.ControllerCb controllerCb = controllerInfo.getControllerCb();
            if (controllerCb != null) {
                remoteControllerTask.run(controllerCb, i);
            }
        } catch (DeadObjectException unused) {
            onDeadObjectException(controllerInfo);
        } catch (RemoteException e) {
            Log.w(TAG, "Exception in " + controllerInfo, e);
        }
    }

    public void setPlaybackException(@Nullable PlaybackException playbackException) {
        this.playbackException = playbackException;
        com.google.common.collect.G<MediaSession.ControllerInfo> connectedControllers = this.sessionStub.getConnectedControllersManager().getConnectedControllers();
        for (int i = 0; i < connectedControllers.size(); i++) {
            setPlaybackException(connectedControllers.get(i), playbackException);
        }
    }
}
