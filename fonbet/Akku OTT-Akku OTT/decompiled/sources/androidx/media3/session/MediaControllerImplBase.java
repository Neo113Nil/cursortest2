package androidx.media3.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import androidx.collection.ArraySet;
import androidx.fragment.app.FragmentTransaction;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.BundleListRetriever;
import androidx.media3.common.C0338w;
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
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.Util;
import androidx.media3.session.IMediaSession;
import androidx.media3.session.IMediaSessionService;
import androidx.media3.session.MediaController;
import androidx.media3.session.MediaControllerImplBase;
import androidx.media3.session.PlayerInfo;
import androidx.media3.session.SequencedFutureManager;
import androidx.media3.session.legacy.MediaBrowserCompat;
import com.google.common.collect.G;
import com.google.common.collect.I;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
class MediaControllerImplBase implements MediaController.MediaControllerImpl {
    private static final long RELEASE_TIMEOUT_MS = 30000;
    public static final String TAG = "MCImplBase";
    private com.google.common.collect.I<String, CommandButton> commandButtonsForMediaItemsMap;

    @Nullable
    private SessionToken connectedToken;
    private final Bundle connectionHints;
    private final Context context;
    protected final MediaControllerStub controllerStub;
    private long currentPositionMs;
    private com.google.common.collect.G<CommandButton> customLayoutOriginal;
    private final IBinder.DeathRecipient deathRecipient;
    private final Handler fallbackPlaybackInfoUpdateHandler;
    private final FlushCommandQueueHandler flushCommandQueueHandler;

    @Nullable
    private IMediaSession iSession;
    private final MediaController instance;
    private Player.Commands intersectedPlayerCommands;
    private long lastSetPlayWhenReadyCalledTimeMs;
    private final ListenerSet<Player.Listener> listeners;
    private com.google.common.collect.G<CommandButton> mediaButtonPreferencesOriginal;
    private final ArraySet<Integer> pendingMaskingSequencedFutureNumbers;

    @Nullable
    private PlayerInfo pendingPlayerInfo;

    @Nullable
    private android.media.session.MediaController platformController;
    private Player.Commands playerCommandsFromPlayer;
    private Player.Commands playerCommandsFromSession;
    private boolean released;
    private com.google.common.collect.G<CommandButton> resolvedCustomLayout;
    private com.google.common.collect.G<CommandButton> resolvedMediaButtonPreferences;
    protected final SequencedFutureManager sequencedFutureManager;

    @Nullable
    private SessionServiceConnection serviceConnection;

    @Nullable
    private PendingIntent sessionActivity;
    private Bundle sessionExtras;
    private final SurfaceCallback surfaceCallback;
    private final SessionToken token;

    @Nullable
    private Surface videoSurface;

    @Nullable
    private SurfaceHolder videoSurfaceHolder;

    @Nullable
    private TextureView videoTextureView;
    private PlayerInfo playerInfo = PlayerInfo.DEFAULT;
    private Size surfaceSize = Size.UNKNOWN;
    private SessionCommands sessionCommands = SessionCommands.EMPTY;

    public class FlushCommandQueueHandler {
        private static final int MSG_FLUSH_COMMAND_QUEUE = 1;
        private final Handler handler;

        public FlushCommandQueueHandler(Looper looper) {
            this.handler = new Handler(looper, new Handler.Callback() { // from class: androidx.media3.session.J1
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    boolean handleMessage;
                    handleMessage = MediaControllerImplBase.FlushCommandQueueHandler.this.handleMessage(message);
                    return handleMessage;
                }
            });
        }

        private void flushCommandQueue() {
            try {
                MediaControllerImplBase.this.iSession.flushCommandQueue(MediaControllerImplBase.this.controllerStub);
            } catch (RemoteException unused) {
                Log.w(MediaControllerImplBase.TAG, "Error in sending flushCommandQueue");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                flushCommandQueue();
            }
            return true;
        }

        public void release() {
            if (this.handler.hasMessages(1)) {
                flushCommandQueue();
            }
            this.handler.removeCallbacksAndMessages(null);
        }

        public void sendFlushCommandQueueMessage() {
            if (MediaControllerImplBase.this.iSession == null || this.handler.hasMessages(1)) {
                return;
            }
            this.handler.sendEmptyMessage(1);
        }
    }

    public static final class PeriodInfo {
        private final int index;
        private final long periodPositionUs;

        public PeriodInfo(int i, long j) {
            this.index = i;
            this.periodPositionUs = j;
        }

        public static /* synthetic */ int access$100(PeriodInfo periodInfo) {
            return periodInfo.index;
        }

        public static /* synthetic */ long access$200(PeriodInfo periodInfo) {
            return periodInfo.periodPositionUs;
        }
    }

    public interface RemoteSessionTask {
        void run(IMediaSession iMediaSession, int i) throws RemoteException;
    }

    public class SessionServiceConnection implements ServiceConnection {
        private final Bundle connectionHints;

        public SessionServiceConnection(Bundle bundle) {
            this.connectionHints = bundle;
        }

        @Override // android.content.ServiceConnection
        public void onBindingDied(ComponentName componentName) {
            MediaController mediaControllerImplBase = MediaControllerImplBase.this.getInstance();
            MediaController mediaControllerImplBase2 = MediaControllerImplBase.this.getInstance();
            Objects.requireNonNull(mediaControllerImplBase2);
            mediaControllerImplBase.runOnApplicationLooper(new E5(mediaControllerImplBase2, 1));
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            MediaController mediaControllerImplBase;
            E5 e5;
            try {
                try {
                    if (MediaControllerImplBase.this.token.getPackageName().equals(componentName.getPackageName())) {
                        IMediaSessionService asInterface = IMediaSessionService.Stub.asInterface(iBinder);
                        if (asInterface != null) {
                            asInterface.connect(MediaControllerImplBase.this.controllerStub, new ConnectionRequest(MediaControllerImplBase.this.getContext().getPackageName(), Process.myPid(), this.connectionHints, MediaControllerImplBase.this.instance.getMaxCommandsForMediaItems()).toBundle());
                            return;
                        } else {
                            Log.e(MediaControllerImplBase.TAG, "Service interface is missing.");
                            mediaControllerImplBase = MediaControllerImplBase.this.getInstance();
                            MediaController mediaControllerImplBase2 = MediaControllerImplBase.this.getInstance();
                            Objects.requireNonNull(mediaControllerImplBase2);
                            e5 = new E5(mediaControllerImplBase2, 1);
                        }
                    } else {
                        Log.e(MediaControllerImplBase.TAG, "Expected connection to " + MediaControllerImplBase.this.token.getPackageName() + " but is connected to " + componentName);
                        mediaControllerImplBase = MediaControllerImplBase.this.getInstance();
                        MediaController mediaControllerImplBase3 = MediaControllerImplBase.this.getInstance();
                        Objects.requireNonNull(mediaControllerImplBase3);
                        e5 = new E5(mediaControllerImplBase3, 1);
                    }
                } catch (RemoteException unused) {
                    Log.w(MediaControllerImplBase.TAG, "Service " + componentName + " has died prematurely");
                    mediaControllerImplBase = MediaControllerImplBase.this.getInstance();
                    MediaController mediaControllerImplBase4 = MediaControllerImplBase.this.getInstance();
                    Objects.requireNonNull(mediaControllerImplBase4);
                    e5 = new E5(mediaControllerImplBase4, 1);
                }
                mediaControllerImplBase.runOnApplicationLooper(e5);
            } catch (Throwable th) {
                MediaController mediaControllerImplBase5 = MediaControllerImplBase.this.getInstance();
                MediaController mediaControllerImplBase6 = MediaControllerImplBase.this.getInstance();
                Objects.requireNonNull(mediaControllerImplBase6);
                mediaControllerImplBase5.runOnApplicationLooper(new E5(mediaControllerImplBase6, 1));
                throw th;
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            MediaController mediaControllerImplBase = MediaControllerImplBase.this.getInstance();
            MediaController mediaControllerImplBase2 = MediaControllerImplBase.this.getInstance();
            Objects.requireNonNull(mediaControllerImplBase2);
            mediaControllerImplBase.runOnApplicationLooper(new E5(mediaControllerImplBase2, 1));
        }
    }

    public class SurfaceCallback implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
        private SurfaceCallback() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onSurfaceTextureAvailable$2(IMediaSession iMediaSession, int i) throws RemoteException {
            MediaControllerImplBase mediaControllerImplBase = MediaControllerImplBase.this;
            iMediaSession.setVideoSurface(mediaControllerImplBase.controllerStub, i, mediaControllerImplBase.videoSurface);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onSurfaceTextureDestroyed$3(IMediaSession iMediaSession, int i) throws RemoteException {
            iMediaSession.setVideoSurface(MediaControllerImplBase.this.controllerStub, i, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$surfaceCreated$0(IMediaSession iMediaSession, int i) throws RemoteException {
            MediaControllerImplBase mediaControllerImplBase = MediaControllerImplBase.this;
            iMediaSession.setVideoSurface(mediaControllerImplBase.controllerStub, i, mediaControllerImplBase.videoSurface);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$surfaceDestroyed$1(IMediaSession iMediaSession, int i) throws RemoteException {
            iMediaSession.setVideoSurface(MediaControllerImplBase.this.controllerStub, i, null);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            if (MediaControllerImplBase.this.videoTextureView == null || MediaControllerImplBase.this.videoTextureView.getSurfaceTexture() != surfaceTexture) {
                return;
            }
            MediaControllerImplBase.this.videoSurface = new Surface(surfaceTexture);
            MediaControllerImplBase.this.dispatchRemoteSessionTaskWithPlayerCommandAndWaitForFuture(new C0609y0(this));
            MediaControllerImplBase.this.maybeNotifySurfaceSizeChanged(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            if (MediaControllerImplBase.this.videoTextureView != null && MediaControllerImplBase.this.videoTextureView.getSurfaceTexture() == surfaceTexture) {
                MediaControllerImplBase.this.videoSurface = null;
                MediaControllerImplBase.this.dispatchRemoteSessionTaskWithPlayerCommandAndWaitForFuture(new RemoteSessionTask() { // from class: androidx.media3.session.K1
                    @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                    public final void run(IMediaSession iMediaSession, int i) {
                        MediaControllerImplBase.SurfaceCallback.this.lambda$onSurfaceTextureDestroyed$3(iMediaSession, i);
                    }
                });
                MediaControllerImplBase.this.maybeNotifySurfaceSizeChanged(0, 0);
            }
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            if (MediaControllerImplBase.this.videoTextureView == null || MediaControllerImplBase.this.videoTextureView.getSurfaceTexture() != surfaceTexture) {
                return;
            }
            MediaControllerImplBase.this.maybeNotifySurfaceSizeChanged(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            if (MediaControllerImplBase.this.videoSurfaceHolder != surfaceHolder) {
                return;
            }
            MediaControllerImplBase.this.maybeNotifySurfaceSizeChanged(i2, i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (MediaControllerImplBase.this.videoSurfaceHolder != surfaceHolder) {
                return;
            }
            MediaControllerImplBase.this.videoSurface = surfaceHolder.getSurface();
            MediaControllerImplBase.this.dispatchRemoteSessionTaskWithPlayerCommandAndWaitForFuture(new C0597w0(this));
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            MediaControllerImplBase.this.maybeNotifySurfaceSizeChanged(surfaceFrame.width(), surfaceFrame.height());
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (MediaControllerImplBase.this.videoSurfaceHolder != surfaceHolder) {
                return;
            }
            MediaControllerImplBase.this.videoSurface = null;
            MediaControllerImplBase.this.dispatchRemoteSessionTaskWithPlayerCommandAndWaitForFuture(new C0603x0(this));
            MediaControllerImplBase.this.maybeNotifySurfaceSizeChanged(0, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MediaControllerImplBase(Context context, MediaController mediaController, SessionToken sessionToken, Bundle bundle, Looper looper) {
        G.b bVar = com.google.common.collect.G.b;
        com.google.common.collect.i0 i0Var = com.google.common.collect.i0.e;
        this.customLayoutOriginal = i0Var;
        this.mediaButtonPreferencesOriginal = i0Var;
        this.resolvedMediaButtonPreferences = i0Var;
        this.resolvedCustomLayout = i0Var;
        this.commandButtonsForMediaItemsMap = com.google.common.collect.j0.i;
        Player.Commands commands = Player.Commands.EMPTY;
        this.playerCommandsFromSession = commands;
        this.playerCommandsFromPlayer = commands;
        this.intersectedPlayerCommands = createIntersectedCommandsEnsuringCommandReleaseAvailable(commands, commands);
        this.listeners = new ListenerSet<>(looper, Clock.DEFAULT, new C0526k1(this));
        this.fallbackPlaybackInfoUpdateHandler = new Handler(looper);
        this.instance = mediaController;
        Assertions.checkNotNull(context, "context must not be null");
        Assertions.checkNotNull(sessionToken, "token must not be null");
        this.context = context;
        this.sequencedFutureManager = new SequencedFutureManager();
        this.controllerStub = new MediaControllerStub(this);
        this.pendingMaskingSequencedFutureNumbers = new ArraySet<>();
        this.token = sessionToken;
        this.connectionHints = bundle;
        this.deathRecipient = new IBinder.DeathRecipient() { // from class: androidx.media3.session.l1
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                MediaControllerImplBase.this.lambda$new$1();
            }
        };
        this.surfaceCallback = new SurfaceCallback();
        this.sessionExtras = Bundle.EMPTY;
        this.serviceConnection = sessionToken.getType() != 0 ? new SessionServiceConnection(bundle) : null;
        this.flushCommandQueueHandler = new FlushCommandQueueHandler(looper);
        this.currentPositionMs = -9223372036854775807L;
        this.lastSetPlayWhenReadyCalledTimeMs = -9223372036854775807L;
    }

    private void addMediaItemsInternal(int i, List<MediaItem> list) {
        if (list.isEmpty()) {
            return;
        }
        if (this.playerInfo.timeline.isEmpty()) {
            setMediaItemsInternal(list, -1, -9223372036854775807L, false);
        } else {
            updatePlayerInfo(maskPlayerInfoForAddedItems(this.playerInfo, Math.min(i, this.playerInfo.timeline.getWindowCount()), list, getCurrentPosition(), getContentPosition()), 0, null, null, this.playerInfo.timeline.isEmpty() ? 3 : null);
        }
    }

    private void clearSurfacesAndCallbacks() {
        TextureView textureView = this.videoTextureView;
        if (textureView != null) {
            textureView.setSurfaceTextureListener(null);
            this.videoTextureView = null;
        }
        SurfaceHolder surfaceHolder = this.videoSurfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.surfaceCallback);
            this.videoSurfaceHolder = null;
        }
        if (this.videoSurface != null) {
            this.videoSurface = null;
        }
    }

    private static int convertRepeatModeForNavigation(int i) {
        if (i == 1) {
            return 0;
        }
        return i;
    }

    private static Player.Commands createIntersectedCommandsEnsuringCommandReleaseAvailable(Player.Commands commands, Player.Commands commands2) {
        Player.Commands intersect = MediaUtils.intersect(commands, commands2);
        return intersect.contains(32) ? intersect : intersect.buildUpon().add(32).build();
    }

    private static Timeline createMaskingTimeline(List<Timeline.Window> list, List<Timeline.Period> list2) {
        G.a aVar = new G.a();
        aVar.e(list);
        com.google.common.collect.i0 g = aVar.g();
        G.a aVar2 = new G.a();
        aVar2.e(list2);
        return new Timeline.RemotableTimeline(g, aVar2.g(), MediaUtils.generateUnshuffledIndices(list.size()));
    }

    private static Timeline.Period createNewPeriod(int i) {
        return new Timeline.Period().set(null, null, i, -9223372036854775807L, 0L, AdPlaybackState.NONE, true);
    }

    private static Timeline.Window createNewWindow(MediaItem mediaItem) {
        return new Timeline.Window().set(0, mediaItem, null, 0L, 0L, 0L, true, false, null, 0L, -9223372036854775807L, -1, -1, 0L);
    }

    private com.google.common.util.concurrent.u<SessionResult> dispatchRemoteSessionTask(@Nullable IMediaSession iMediaSession, RemoteSessionTask remoteSessionTask, boolean z) {
        if (iMediaSession == null) {
            return com.google.common.util.concurrent.o.d(new SessionResult(-4));
        }
        SequencedFutureManager.SequencedFuture createSequencedFuture = this.sequencedFutureManager.createSequencedFuture(new SessionResult(1));
        int sequenceNumber = createSequencedFuture.getSequenceNumber();
        if (z) {
            if (this.pendingMaskingSequencedFutureNumbers.isEmpty()) {
                this.pendingPlayerInfo = this.playerInfo;
            }
            this.pendingMaskingSequencedFutureNumbers.add(Integer.valueOf(sequenceNumber));
        }
        try {
            remoteSessionTask.run(iMediaSession, sequenceNumber);
            return createSequencedFuture;
        } catch (RemoteException e) {
            Log.w(TAG, "Cannot connect to the service or the session is gone", e);
            this.pendingMaskingSequencedFutureNumbers.remove(Integer.valueOf(sequenceNumber));
            this.sequencedFutureManager.setFutureResult(sequenceNumber, new SessionResult(-100));
            return createSequencedFuture;
        }
    }

    private void dispatchRemoteSessionTaskWithPlayerCommand(RemoteSessionTask remoteSessionTask) {
        this.flushCommandQueueHandler.sendFlushCommandQueueMessage();
        dispatchRemoteSessionTask(this.iSession, remoteSessionTask, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchRemoteSessionTaskWithPlayerCommandAndWaitForFuture(RemoteSessionTask remoteSessionTask) {
        this.flushCommandQueueHandler.sendFlushCommandQueueMessage();
        com.google.common.util.concurrent.u<SessionResult> dispatchRemoteSessionTask = dispatchRemoteSessionTask(this.iSession, remoteSessionTask, true);
        try {
            LegacyConversions.getFutureResult(dispatchRemoteSessionTask, 3000L);
        } catch (ExecutionException e) {
            throw new IllegalStateException(e);
        } catch (TimeoutException e2) {
            if (dispatchRemoteSessionTask instanceof SequencedFutureManager.SequencedFuture) {
                int sequenceNumber = ((SequencedFutureManager.SequencedFuture) dispatchRemoteSessionTask).getSequenceNumber();
                this.pendingMaskingSequencedFutureNumbers.remove(Integer.valueOf(sequenceNumber));
                this.sequencedFutureManager.setFutureResult(sequenceNumber, new SessionResult(-1));
            }
            Log.w(TAG, "Synchronous command takes too long on the session side.", e2);
        }
    }

    private com.google.common.util.concurrent.u<SessionResult> dispatchRemoteSessionTaskWithSessionCommand(int i, RemoteSessionTask remoteSessionTask) {
        return dispatchRemoteSessionTaskWithSessionCommandInternal(i, null, remoteSessionTask);
    }

    private com.google.common.util.concurrent.u<SessionResult> dispatchRemoteSessionTaskWithSessionCommandInternal(int i, @Nullable SessionCommand sessionCommand, RemoteSessionTask remoteSessionTask) {
        return dispatchRemoteSessionTask(sessionCommand != null ? getSessionInterfaceWithSessionCommandIfAble(sessionCommand) : getSessionInterfaceWithSessionCommandIfAble(i), remoteSessionTask, false);
    }

    private static int getCurrentMediaItemIndexInternal(PlayerInfo playerInfo) {
        int i = playerInfo.sessionPositionInfo.positionInfo.mediaItemIndex;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    private static int getNewPeriodIndexWithoutRemovedPeriods(Timeline timeline, int i, int i2, int i3) {
        if (i == -1) {
            return i;
        }
        while (i2 < i3) {
            Timeline.Window window = new Timeline.Window();
            timeline.getWindow(i2, window);
            i -= (window.lastPeriodIndex - window.firstPeriodIndex) + 1;
            i2++;
        }
        return i;
    }

    @Nullable
    private PeriodInfo getPeriodInfo(Timeline timeline, int i, long j) {
        if (timeline.isEmpty()) {
            return null;
        }
        Timeline.Window window = new Timeline.Window();
        Timeline.Period period = new Timeline.Period();
        if (i == -1 || i >= timeline.getWindowCount()) {
            i = timeline.getFirstWindowIndex(getShuffleModeEnabled());
            j = timeline.getWindow(i, window).getDefaultPositionMs();
        }
        return getPeriodInfo(timeline, window, period, i, Util.msToUs(j));
    }

    private static Timeline.Period getPeriodWithNewWindowIndex(Timeline timeline, int i, int i2) {
        Timeline.Period period = new Timeline.Period();
        timeline.getPeriod(i, period);
        period.windowIndex = i2;
        return period;
    }

    private boolean isPlayerCommandAvailable(int i) {
        if (this.intersectedPlayerCommands.contains(i)) {
            return true;
        }
        androidx.compose.runtime.collection.a.c(i, "Controller isn't allowed to call command= ", TAG);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addMediaItem$30(MediaItem mediaItem, IMediaSession iMediaSession, int i) throws RemoteException {
        iMediaSession.addMediaItem(this.controllerStub, i, mediaItem.toBundleIncludeLocalConfiguration());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addMediaItem$31(int i, MediaItem mediaItem, IMediaSession iMediaSession, int i2) throws RemoteException {
        iMediaSession.addMediaItemWithIndex(this.controllerStub, i2, i, mediaItem.toBundleIncludeLocalConfiguration());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addMediaItems$32(List list, IMediaSession iMediaSession, int i) throws RemoteException {
        iMediaSession.addMediaItems(this.controllerStub, i, new BundleListRetriever(BundleCollectionUtil.toBundleList(list, new A1())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addMediaItems$33(int i, List list, IMediaSession iMediaSession, int i2) throws RemoteException {
        iMediaSession.addMediaItemsWithIndex(this.controllerStub, i2, i, new BundleListRetriever(BundleCollectionUtil.toBundleList(list, new A1())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$clearMediaItems$36(IMediaSession iMediaSession, int i) throws RemoteException {
        iMediaSession.clearMediaItems(this.controllerStub, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$clearVideoSurface$69(IMediaSession iMediaSession, int i) throws RemoteException {
        iMediaSession.setVideoSurface(this.controllerStub, i, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$decreaseDeviceVolume$59(IMediaSession iMediaSession, int i) throws RemoteException {
        iMediaSession.decreaseDeviceVolume(this.controllerStub, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$decreaseDeviceVolume$60(int i, Player.Listener listener) {
        listener.onDeviceVolumeChanged(i, this.playerInfo.deviceMuted);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$decreaseDeviceVolume$61(int i, IMediaSession iMediaSession, int i2) throws RemoteException {
        iMediaSession.decreaseDeviceVolumeWithFlags(this.controllerStub, i2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$decreaseDeviceVolume$62(int i, Player.Listener listener) {
        listener.onDeviceVolumeChanged(i, this.playerInfo.deviceMuted);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$increaseDeviceVolume$55(IMediaSession iMediaSession, int i) throws RemoteException {
        iMediaSession.increaseDeviceVolume(this.controllerStub, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$increaseDeviceVolume$56(int i, Player.Listener listener) {
        listener.onDeviceVolumeChanged(i, this.playerInfo.deviceMuted);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$increaseDeviceVolume$57(int i, IMediaSession iMediaSession, int i2) throws RemoteException {
        iMediaSession.increaseDeviceVolumeWithFlags(this.controllerStub, i2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$increaseDeviceVolume$58(int i, Player.Listener listener) {
        listener.onDeviceVolumeChanged(i, this.playerInfo.deviceMuted);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$moveMediaItem$37(int i, int i2, IMediaSession iMediaSession, int i3) throws RemoteException {
        iMediaSession.moveMediaItem(this.controllerStub, i3, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$moveMediaItems$38(int i, int i2, int i3, IMediaSession iMediaSession, int i4) throws RemoteException {
        iMediaSession.moveMediaItems(this.controllerStub, i4, i, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(Player.Listener listener, FlagSet flagSet) {
        listener.onEvents(getInstance(), new Player.Events(flagSet));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1() {
        MediaController mediaControllerImplBase = getInstance();
        MediaController mediaControllerImplBase2 = getInstance();
        Objects.requireNonNull(mediaControllerImplBase2);
        mediaControllerImplBase.runOnApplicationLooper(new E5(mediaControllerImplBase2, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$100(PlayerInfo playerInfo, Player.Listener listener) {
        listener.onSeekBackIncrementChanged(playerInfo.seekBackIncrementMs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$101(PlayerInfo playerInfo, Player.Listener listener) {
        listener.onSeekForwardIncrementChanged(playerInfo.seekForwardIncrementMs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$102(PlayerInfo playerInfo, Player.Listener listener) {
        listener.onMaxSeekToPreviousPositionChanged(playerInfo.maxSeekToPreviousPositionMs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$103(PlayerInfo playerInfo, Player.Listener listener) {
        listener.onTrackSelectionParametersChanged(playerInfo.trackSelectionParameters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$77(PlayerInfo playerInfo, Integer num, Player.Listener listener) {
        listener.onTimelineChanged(playerInfo.timeline, num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$78(PlayerInfo playerInfo, Integer num, Player.Listener listener) {
        listener.onPositionDiscontinuity(playerInfo.oldPositionInfo, playerInfo.newPositionInfo, num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$79(MediaItem mediaItem, Integer num, Player.Listener listener) {
        listener.onMediaItemTransition(mediaItem, num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$82(PlayerInfo playerInfo, Player.Listener listener) {
        listener.onTracksChanged(playerInfo.currentTracks);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$83(PlayerInfo playerInfo, Player.Listener listener) {
        listener.onMediaMetadataChanged(playerInfo.mediaMetadata);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$84(PlayerInfo playerInfo, Player.Listener listener) {
        listener.onIsLoadingChanged(playerInfo.isLoading);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$85(PlayerInfo playerInfo, Player.Listener listener) {
        listener.onPlaybackStateChanged(playerInfo.playbackState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$86(PlayerInfo playerInfo, Integer num, Player.Listener listener) {
        listener.onPlayWhenReadyChanged(playerInfo.playWhenReady, num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$87(PlayerInfo playerInfo, Player.Listener listener) {
        listener.onPlaybackSuppressionReasonChanged(playerInfo.playbackSuppressionReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$88(PlayerInfo playerInfo, Player.Listener listener) {
        listener.onIsPlayingChanged(playerInfo.isPlaying);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$89(PlayerInfo playerInfo, Player.Listener listener) {
        listener.onPlaybackParametersChanged(playerInfo.playbackParameters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$90(PlayerInfo playerInfo, Player.Listener listener) {
        listener.onRepeatModeChanged(playerInfo.repeatMode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$91(PlayerInfo playerInfo, Player.Listener listener) {
        listener.onShuffleModeEnabledChanged(playerInfo.shuffleModeEnabled);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$92(PlayerInfo playerInfo, Player.Listener listener) {
        listener.onPlaylistMetadataChanged(playerInfo.playlistMetadata);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$93(PlayerInfo playerInfo, Player.Listener listener) {
        listener.onVolumeChanged(playerInfo.volume);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$94(PlayerInfo playerInfo, Player.Listener listener) {
        listener.onAudioAttributesChanged(playerInfo.audioAttributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$95(PlayerInfo playerInfo, Player.Listener listener) {
        listener.onCues(playerInfo.cueGroup.cues);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$96(PlayerInfo playerInfo, Player.Listener listener) {
        listener.onCues(playerInfo.cueGroup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$97(PlayerInfo playerInfo, Player.Listener listener) {
        listener.onDeviceInfoChanged(playerInfo.deviceInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$98(PlayerInfo playerInfo, Player.Listener listener) {
        listener.onDeviceVolumeChanged(playerInfo.deviceVolume, playerInfo.deviceMuted);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$99(PlayerInfo playerInfo, Player.Listener listener) {
        listener.onVideoSizeChanged(playerInfo.videoSize);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAvailableCommandsChangedFromPlayer$113(Player.Listener listener) {
        listener.onAvailableCommandsChanged(this.intersectedPlayerCommands);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAvailableCommandsChangedFromPlayer$114(MediaController.Listener listener) {
        listener.onCustomLayoutChanged(getInstance(), this.resolvedCustomLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAvailableCommandsChangedFromPlayer$115(MediaController.Listener listener) {
        listener.onMediaButtonPreferencesChanged(getInstance(), this.resolvedMediaButtonPreferences);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAvailableCommandsChangedFromSession$109(Player.Listener listener) {
        listener.onAvailableCommandsChanged(this.intersectedPlayerCommands);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAvailableCommandsChangedFromSession$110(SessionCommands sessionCommands, MediaController.Listener listener) {
        listener.onAvailableSessionCommandsChanged(getInstance(), sessionCommands);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAvailableCommandsChangedFromSession$111(MediaController.Listener listener) {
        listener.onCustomLayoutChanged(getInstance(), this.resolvedCustomLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAvailableCommandsChangedFromSession$112(MediaController.Listener listener) {
        listener.onMediaButtonPreferencesChanged(getInstance(), this.resolvedMediaButtonPreferences);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCustomCommand$108(SessionCommand sessionCommand, Bundle bundle, int i, MediaController.Listener listener) {
        sendControllerResultWhenReady(i, (com.google.common.util.concurrent.u) Assertions.checkNotNull(listener.onCustomCommand(getInstance(), sessionCommand, bundle), "ControllerCallback#onCustomCommand() must not return null"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onError$120(SessionError sessionError, MediaController.Listener listener) {
        listener.onError(getInstance(), sessionError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onExtrasChanged$118(Bundle bundle, boolean z, boolean z2, MediaController.Listener listener) {
        listener.onExtrasChanged(getInstance(), bundle);
        if (z) {
            listener.onCustomLayoutChanged(getInstance(), this.resolvedCustomLayout);
        }
        if (z2) {
            listener.onMediaButtonPreferencesChanged(getInstance(), this.resolvedMediaButtonPreferences);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSetCustomLayout$116(boolean z, boolean z2, int i, MediaController.Listener listener) {
        com.google.common.util.concurrent.u<SessionResult> uVar = (com.google.common.util.concurrent.u) Assertions.checkNotNull(listener.onSetCustomLayout(getInstance(), this.resolvedCustomLayout), "MediaController.Listener#onSetCustomLayout() must not return null");
        if (z) {
            listener.onCustomLayoutChanged(getInstance(), this.resolvedCustomLayout);
        }
        if (z2) {
            listener.onMediaButtonPreferencesChanged(getInstance(), this.resolvedMediaButtonPreferences);
        }
        sendControllerResultWhenReady(i, uVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSetMediaButtonPreferences$117(boolean z, boolean z2, int i, MediaController.Listener listener) {
        com.google.common.util.concurrent.u<SessionResult> uVar = (com.google.common.util.concurrent.u) Assertions.checkNotNull(listener.onSetCustomLayout(getInstance(), this.resolvedCustomLayout), "MediaController.Listener#onSetCustomLayout() must not return null");
        if (z) {
            listener.onCustomLayoutChanged(getInstance(), this.resolvedCustomLayout);
        }
        if (z2) {
            listener.onMediaButtonPreferencesChanged(getInstance(), this.resolvedMediaButtonPreferences);
        }
        sendControllerResultWhenReady(i, uVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSetSessionActivity$119(PendingIntent pendingIntent, MediaController.Listener listener) {
        listener.onSessionActivityChanged(getInstance(), pendingIntent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pause$6(IMediaSession iMediaSession, int i) throws RemoteException {
        iMediaSession.pause(this.controllerStub, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$play$5(IMediaSession iMediaSession, int i) throws RemoteException {
        iMediaSession.play(this.controllerStub, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepare$7(IMediaSession iMediaSession, int i) throws RemoteException {
        iMediaSession.prepare(this.controllerStub, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$4() {
        SessionServiceConnection sessionServiceConnection = this.serviceConnection;
        if (sessionServiceConnection != null) {
            this.context.unbindService(sessionServiceConnection);
            this.serviceConnection = null;
        }
        this.controllerStub.destroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeMediaItem$34(int i, IMediaSession iMediaSession, int i2) throws RemoteException {
        iMediaSession.removeMediaItem(this.controllerStub, i2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeMediaItems$35(int i, int i2, IMediaSession iMediaSession, int i3) throws RemoteException {
        iMediaSession.removeMediaItems(this.controllerStub, i3, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$replaceMediaItem$39(int i, MediaItem mediaItem, IMediaSession iMediaSession, int i2) throws RemoteException {
        if (((SessionToken) Assertions.checkNotNull(this.connectedToken)).getInterfaceVersion() >= 2) {
            iMediaSession.replaceMediaItem(this.controllerStub, i2, i, mediaItem.toBundleIncludeLocalConfiguration());
        } else {
            iMediaSession.addMediaItemWithIndex(this.controllerStub, i2, i + 1, mediaItem.toBundleIncludeLocalConfiguration());
            iMediaSession.removeMediaItem(this.controllerStub, i2, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$replaceMediaItems$40(List list, int i, int i2, IMediaSession iMediaSession, int i3) throws RemoteException {
        BundleListRetriever bundleListRetriever = new BundleListRetriever(BundleCollectionUtil.toBundleList(list, new A1()));
        if (((SessionToken) Assertions.checkNotNull(this.connectedToken)).getInterfaceVersion() >= 2) {
            iMediaSession.replaceMediaItems(this.controllerStub, i3, i, i2, bundleListRetriever);
        } else {
            iMediaSession.addMediaItemsWithIndex(this.controllerStub, i3, i2, bundleListRetriever);
            iMediaSession.removeMediaItems(this.controllerStub, i3, i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$seekBack$12(IMediaSession iMediaSession, int i) throws RemoteException {
        iMediaSession.seekBack(this.controllerStub, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$seekForward$13(IMediaSession iMediaSession, int i) throws RemoteException {
        iMediaSession.seekForward(this.controllerStub, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$seekTo$10(long j, IMediaSession iMediaSession, int i) throws RemoteException {
        iMediaSession.seekTo(this.controllerStub, i, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$seekTo$11(int i, long j, IMediaSession iMediaSession, int i2) throws RemoteException {
        iMediaSession.seekToWithMediaItemIndex(this.controllerStub, i2, i, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$seekToDefaultPosition$8(IMediaSession iMediaSession, int i) throws RemoteException {
        iMediaSession.seekToDefaultPosition(this.controllerStub, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$seekToDefaultPosition$9(int i, IMediaSession iMediaSession, int i2) throws RemoteException {
        iMediaSession.seekToDefaultPositionWithMediaItemIndex(this.controllerStub, i2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$seekToNext$44(IMediaSession iMediaSession, int i) throws RemoteException {
        iMediaSession.seekToNext(this.controllerStub, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$seekToNextMediaItem$42(IMediaSession iMediaSession, int i) throws RemoteException {
        iMediaSession.seekToNextMediaItem(this.controllerStub, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$seekToPrevious$43(IMediaSession iMediaSession, int i) throws RemoteException {
        iMediaSession.seekToPrevious(this.controllerStub, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$seekToPreviousMediaItem$41(IMediaSession iMediaSession, int i) throws RemoteException {
        iMediaSession.seekToPreviousMediaItem(this.controllerStub, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$sendControllerResultWhenReady$107(com.google.common.util.concurrent.u uVar, int i) {
        SessionResult sessionResult;
        try {
            sessionResult = (SessionResult) Assertions.checkNotNull((SessionResult) uVar.get(), "SessionResult must not be null");
        } catch (InterruptedException e) {
            e = e;
            Log.w(TAG, "Session operation failed", e);
            sessionResult = new SessionResult(-1);
        } catch (CancellationException e2) {
            Log.w(TAG, "Session operation cancelled", e2);
            sessionResult = new SessionResult(1);
        } catch (ExecutionException e3) {
            e = e3;
            Log.w(TAG, "Session operation failed", e);
            sessionResult = new SessionResult(-1);
        }
        sendControllerResult(i, sessionResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendCustomCommand$21(SessionCommand sessionCommand, Bundle bundle, IMediaSession iMediaSession, int i) throws RemoteException {
        iMediaSession.onCustomCommand(this.controllerStub, i, sessionCommand.toBundle(), bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAudioAttributes$67(AudioAttributes audioAttributes, boolean z, IMediaSession iMediaSession, int i) throws RemoteException {
        iMediaSession.setAudioAttributes(this.controllerStub, i, audioAttributes.toBundle(), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setDeviceMuted$63(boolean z, IMediaSession iMediaSession, int i) throws RemoteException {
        iMediaSession.setDeviceMuted(this.controllerStub, i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setDeviceMuted$64(boolean z, Player.Listener listener) {
        listener.onDeviceVolumeChanged(this.playerInfo.deviceVolume, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setDeviceMuted$65(boolean z, int i, IMediaSession iMediaSession, int i2) throws RemoteException {
        iMediaSession.setDeviceMutedWithFlags(this.controllerStub, i2, z, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setDeviceMuted$66(boolean z, Player.Listener listener) {
        listener.onDeviceVolumeChanged(this.playerInfo.deviceVolume, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setDeviceVolume$51(int i, IMediaSession iMediaSession, int i2) throws RemoteException {
        iMediaSession.setDeviceVolume(this.controllerStub, i2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setDeviceVolume$52(int i, Player.Listener listener) {
        listener.onDeviceVolumeChanged(i, this.playerInfo.deviceMuted);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setDeviceVolume$53(int i, int i2, IMediaSession iMediaSession, int i3) throws RemoteException {
        iMediaSession.setDeviceVolumeWithFlags(this.controllerStub, i3, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setDeviceVolume$54(int i, Player.Listener listener) {
        listener.onDeviceVolumeChanged(i, this.playerInfo.deviceMuted);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setFutureResult$105() {
        PlayerInfo playerInfo = this.pendingPlayerInfo;
        if (playerInfo != null) {
            onPlayerInfoChanged(playerInfo, PlayerInfo.BundlingExclusions.NONE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setFutureResult$106(int i) {
        this.pendingMaskingSequencedFutureNumbers.remove(Integer.valueOf(i));
        SessionToken sessionToken = this.connectedToken;
        if (sessionToken == null || sessionToken.getInterfaceVersion() >= 5 || !this.pendingMaskingSequencedFutureNumbers.isEmpty()) {
            return;
        }
        this.fallbackPlaybackInfoUpdateHandler.postDelayed(new Runnable() { // from class: androidx.media3.session.i1
            @Override // java.lang.Runnable
            public final void run() {
                MediaControllerImplBase.this.lambda$setFutureResult$105();
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMediaItem$22(MediaItem mediaItem, IMediaSession iMediaSession, int i) throws RemoteException {
        iMediaSession.setMediaItem(this.controllerStub, i, mediaItem.toBundleIncludeLocalConfiguration());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMediaItem$23(MediaItem mediaItem, long j, IMediaSession iMediaSession, int i) throws RemoteException {
        iMediaSession.setMediaItemWithStartPosition(this.controllerStub, i, mediaItem.toBundleIncludeLocalConfiguration(), j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMediaItem$24(MediaItem mediaItem, boolean z, IMediaSession iMediaSession, int i) throws RemoteException {
        iMediaSession.setMediaItemWithResetPosition(this.controllerStub, i, mediaItem.toBundleIncludeLocalConfiguration(), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMediaItems$25(List list, IMediaSession iMediaSession, int i) throws RemoteException {
        iMediaSession.setMediaItems(this.controllerStub, i, new BundleListRetriever(BundleCollectionUtil.toBundleList(list, new A1())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMediaItems$26(List list, boolean z, IMediaSession iMediaSession, int i) throws RemoteException {
        iMediaSession.setMediaItemsWithResetPosition(this.controllerStub, i, new BundleListRetriever(BundleCollectionUtil.toBundleList(list, new A1())), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMediaItems$27(List list, int i, long j, IMediaSession iMediaSession, int i2) throws RemoteException {
        iMediaSession.setMediaItemsWithStartIndex(this.controllerStub, i2, new BundleListRetriever(BundleCollectionUtil.toBundleList(list, new A1())), i, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setPlayWhenReady$14(boolean z, IMediaSession iMediaSession, int i) throws RemoteException {
        iMediaSession.setPlayWhenReady(this.controllerStub, i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setPlaybackParameters$15(PlaybackParameters playbackParameters, IMediaSession iMediaSession, int i) throws RemoteException {
        iMediaSession.setPlaybackParameters(this.controllerStub, i, playbackParameters.toBundle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setPlaybackSpeed$17(float f, IMediaSession iMediaSession, int i) throws RemoteException {
        iMediaSession.setPlaybackSpeed(this.controllerStub, i, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setPlaylistMetadata$28(MediaMetadata mediaMetadata, IMediaSession iMediaSession, int i) throws RemoteException {
        iMediaSession.setPlaylistMetadata(this.controllerStub, i, mediaMetadata.toBundle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setRating$19(String str, Rating rating, IMediaSession iMediaSession, int i) throws RemoteException {
        iMediaSession.setRatingWithMediaId(this.controllerStub, i, str, rating.toBundle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setRating$20(Rating rating, IMediaSession iMediaSession, int i) throws RemoteException {
        iMediaSession.setRating(this.controllerStub, i, rating.toBundle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setRepeatMode$45(int i, IMediaSession iMediaSession, int i2) throws RemoteException {
        iMediaSession.setRepeatMode(this.controllerStub, i2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setShuffleModeEnabled$47(boolean z, IMediaSession iMediaSession, int i) throws RemoteException {
        iMediaSession.setShuffleModeEnabled(this.controllerStub, i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTrackSelectionParameters$75(TrackSelectionParameters trackSelectionParameters, IMediaSession iMediaSession, int i) throws RemoteException {
        iMediaSession.setTrackSelectionParameters(this.controllerStub, i, trackSelectionParameters.toBundle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setVideoSurface$70(Surface surface, IMediaSession iMediaSession, int i) throws RemoteException {
        iMediaSession.setVideoSurface(this.controllerStub, i, surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setVideoSurfaceHolder$71(Surface surface, IMediaSession iMediaSession, int i) throws RemoteException {
        iMediaSession.setVideoSurface(this.controllerStub, i, surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setVideoSurfaceHolder$72(IMediaSession iMediaSession, int i) throws RemoteException {
        iMediaSession.setVideoSurface(this.controllerStub, i, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setVideoTextureView$73(IMediaSession iMediaSession, int i) throws RemoteException {
        iMediaSession.setVideoSurface(this.controllerStub, i, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setVideoTextureView$74(IMediaSession iMediaSession, int i) throws RemoteException {
        iMediaSession.setVideoSurface(this.controllerStub, i, this.videoSurface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setVolume$49(float f, IMediaSession iMediaSession, int i) throws RemoteException {
        iMediaSession.setVolume(this.controllerStub, i, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stop$2(IMediaSession iMediaSession, int i) throws RemoteException {
        iMediaSession.stop(this.controllerStub, i);
    }

    private static PlayerInfo maskPlayerInfoForAddedItems(PlayerInfo playerInfo, int i, List<MediaItem> list, long j, long j2) {
        int size;
        Timeline timeline = playerInfo.timeline;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        for (int i3 = 0; i3 < timeline.getWindowCount(); i3++) {
            arrayList.add(timeline.getWindow(i3, new Timeline.Window()));
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            arrayList.add(i4 + i, createNewWindow(list.get(i4)));
        }
        rebuildPeriods(timeline, arrayList, arrayList2);
        Timeline createMaskingTimeline = createMaskingTimeline(arrayList, arrayList2);
        if (playerInfo.timeline.isEmpty()) {
            size = 0;
        } else {
            int i5 = playerInfo.sessionPositionInfo.positionInfo.mediaItemIndex;
            i2 = i5 >= i ? list.size() + i5 : i5;
            int i6 = playerInfo.sessionPositionInfo.positionInfo.periodIndex;
            size = i6 >= i ? list.size() + i6 : i6;
        }
        return maskTimelineAndPositionInfo(playerInfo, createMaskingTimeline, i2, size, j, j2, 5);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static PlayerInfo maskPlayerInfoForRemovedItems(PlayerInfo playerInfo, int i, int i2, boolean z, long j, long j2) {
        int i3;
        Timeline timeline;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        PlayerInfo maskTimelineAndPositionInfo;
        Timeline timeline2 = playerInfo.timeline;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < timeline2.getWindowCount(); i10++) {
            if (i10 < i || i10 >= i2) {
                arrayList.add(timeline2.getWindow(i10, new Timeline.Window()));
            }
        }
        rebuildPeriods(timeline2, arrayList, arrayList2);
        Timeline createMaskingTimeline = createMaskingTimeline(arrayList, arrayList2);
        int i11 = 0;
        int currentMediaItemIndexInternal = getCurrentMediaItemIndexInternal(playerInfo);
        int i12 = playerInfo.sessionPositionInfo.positionInfo.periodIndex;
        Timeline.Window window = new Timeline.Window();
        boolean z2 = currentMediaItemIndexInternal >= i && currentMediaItemIndexInternal < i2;
        if (createMaskingTimeline.isEmpty()) {
            i3 = currentMediaItemIndexInternal;
            timeline = timeline2;
            i4 = i;
            i5 = i2;
            i7 = -1;
        } else {
            if (z2) {
                int resolveSubsequentMediaItemIndex = resolveSubsequentMediaItemIndex(playerInfo.repeatMode, playerInfo.shuffleModeEnabled, currentMediaItemIndexInternal, timeline2, i, i2);
                i3 = currentMediaItemIndexInternal;
                timeline = timeline2;
                i4 = i;
                i5 = i2;
                if (resolveSubsequentMediaItemIndex == -1) {
                    resolveSubsequentMediaItemIndex = createMaskingTimeline.getFirstWindowIndex(playerInfo.shuffleModeEnabled);
                } else if (resolveSubsequentMediaItemIndex >= i5) {
                    resolveSubsequentMediaItemIndex -= i5 - i4;
                }
                i8 = resolveSubsequentMediaItemIndex;
                i11 = createMaskingTimeline.getWindow(i8, window).firstPeriodIndex;
            } else {
                i3 = currentMediaItemIndexInternal;
                timeline = timeline2;
                i4 = i;
                i5 = i2;
                if (i3 < i5) {
                    i6 = i12;
                    i7 = i3;
                    if (z2) {
                        i9 = 4;
                        maskTimelineAndPositionInfo = maskTimelineAndPositionInfo(playerInfo, createMaskingTimeline, i7, i6, j, j2, 4);
                    } else if (i7 == -1) {
                        maskTimelineAndPositionInfo = maskTimelineAndPositionInfo(playerInfo, createMaskingTimeline, SessionPositionInfo.DEFAULT_POSITION_INFO, SessionPositionInfo.DEFAULT, 4);
                        i9 = 4;
                    } else if (z) {
                        i9 = 4;
                        maskTimelineAndPositionInfo = maskTimelineAndPositionInfo(playerInfo, createMaskingTimeline, i7, i6, j, j2, 4);
                    } else {
                        i9 = 4;
                        Timeline.Window window2 = createMaskingTimeline.getWindow(i7, new Timeline.Window());
                        long defaultPositionMs = window2.getDefaultPositionMs();
                        long durationMs = window2.getDurationMs();
                        Player.PositionInfo positionInfo = new Player.PositionInfo(null, i7, window2.mediaItem, null, i6, defaultPositionMs, defaultPositionMs, -1, -1);
                        maskTimelineAndPositionInfo = maskTimelineAndPositionInfo(playerInfo, createMaskingTimeline, positionInfo, new SessionPositionInfo(positionInfo, false, SystemClock.elapsedRealtime(), durationMs, defaultPositionMs, MediaUtils.calculateBufferedPercentage(defaultPositionMs, durationMs), 0L, -9223372036854775807L, durationMs, defaultPositionMs), 4);
                    }
                    int i13 = maskTimelineAndPositionInfo.playbackState;
                    return i13 != 1 ? maskTimelineAndPositionInfo : maskTimelineAndPositionInfo;
                }
                i8 = i3 - (i5 - i4);
                i11 = getNewPeriodIndexWithoutRemovedPeriods(timeline, i12, i4, i5);
            }
            i7 = i8;
        }
        i6 = i11;
        if (z2) {
        }
        int i132 = maskTimelineAndPositionInfo.playbackState;
        return i132 != 1 ? maskTimelineAndPositionInfo : maskTimelineAndPositionInfo;
    }

    private PlayerInfo maskPositionInfo(PlayerInfo playerInfo, Timeline timeline, PeriodInfo periodInfo) {
        int i = playerInfo.sessionPositionInfo.positionInfo.periodIndex;
        int i2 = periodInfo.index;
        Timeline.Period period = new Timeline.Period();
        timeline.getPeriod(i, period);
        Timeline.Period period2 = new Timeline.Period();
        timeline.getPeriod(i2, period2);
        boolean z = i != i2;
        long j = periodInfo.periodPositionUs;
        long msToUs = Util.msToUs(getCurrentPosition()) - period.getPositionInWindowUs();
        if (!z && j == msToUs) {
            return playerInfo;
        }
        Assertions.checkState(playerInfo.sessionPositionInfo.positionInfo.adGroupIndex == -1);
        Player.PositionInfo positionInfo = new Player.PositionInfo(null, period.windowIndex, playerInfo.sessionPositionInfo.positionInfo.mediaItem, null, i, Util.usToMs(period.positionInWindowUs + msToUs), Util.usToMs(period.positionInWindowUs + msToUs), -1, -1);
        timeline.getPeriod(i2, period2);
        Timeline.Window window = new Timeline.Window();
        timeline.getWindow(period2.windowIndex, window);
        long usToMs = Util.usToMs(period2.positionInWindowUs + j);
        Player.PositionInfo positionInfo2 = new Player.PositionInfo(null, period2.windowIndex, window.mediaItem, null, i2, usToMs, usToMs, -1, -1);
        PlayerInfo copyWithPositionInfos = playerInfo.copyWithPositionInfos(positionInfo, positionInfo2, 1);
        if (z || j < msToUs) {
            return copyWithPositionInfos.copyWithSessionPositionInfo(new SessionPositionInfo(positionInfo2, false, SystemClock.elapsedRealtime(), window.getDurationMs(), usToMs, MediaUtils.calculateBufferedPercentage(usToMs, window.getDurationMs()), 0L, -9223372036854775807L, -9223372036854775807L, usToMs));
        }
        long max = Math.max(0L, Util.msToUs(copyWithPositionInfos.sessionPositionInfo.totalBufferedDurationMs) - (j - msToUs));
        long usToMs2 = Util.usToMs(period2.positionInWindowUs + j + max);
        return copyWithPositionInfos.copyWithSessionPositionInfo(new SessionPositionInfo(positionInfo2, false, SystemClock.elapsedRealtime(), window.getDurationMs(), usToMs2, MediaUtils.calculateBufferedPercentage(usToMs2, window.getDurationMs()), Util.usToMs(max), -9223372036854775807L, -9223372036854775807L, usToMs2));
    }

    private static PlayerInfo maskTimelineAndPositionInfo(PlayerInfo playerInfo, Timeline timeline, int i, int i2, long j, long j2, int i3) {
        MediaItem mediaItem = timeline.getWindow(i, new Timeline.Window()).mediaItem;
        Player.PositionInfo positionInfo = playerInfo.sessionPositionInfo.positionInfo;
        Player.PositionInfo positionInfo2 = new Player.PositionInfo(null, i, mediaItem, null, i2, j, j2, positionInfo.adGroupIndex, positionInfo.adIndexInAdGroup);
        boolean z = playerInfo.sessionPositionInfo.isPlayingAd;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        SessionPositionInfo sessionPositionInfo = playerInfo.sessionPositionInfo;
        return maskTimelineAndPositionInfo(playerInfo, timeline, positionInfo2, new SessionPositionInfo(positionInfo2, z, elapsedRealtime, sessionPositionInfo.durationMs, sessionPositionInfo.bufferedPositionMs, sessionPositionInfo.bufferedPercentage, sessionPositionInfo.totalBufferedDurationMs, sessionPositionInfo.currentLiveOffsetMs, sessionPositionInfo.contentDurationMs, sessionPositionInfo.contentBufferedPositionMs), i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeNotifySurfaceSizeChanged(final int i, final int i2) {
        if (this.surfaceSize.getWidth() == i && this.surfaceSize.getHeight() == i2) {
            return;
        }
        this.surfaceSize = new Size(i, i2);
        this.listeners.sendEvent(24, new ListenerSet.Event() { // from class: androidx.media3.session.B
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((Player.Listener) obj).onSurfaceSizeChanged(i, i2);
            }
        });
    }

    private void moveMediaItemsInternal(int i, int i2, int i3) {
        int i4;
        int i5;
        Timeline timeline = this.playerInfo.timeline;
        int windowCount = timeline.getWindowCount();
        int min = Math.min(i2, windowCount);
        int i6 = min - i;
        int min2 = Math.min(i3, windowCount - i6);
        if (i >= windowCount || i == min || i == min2) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < windowCount; i7++) {
            arrayList.add(timeline.getWindow(i7, new Timeline.Window()));
        }
        Util.moveItems(arrayList, i, min, min2);
        rebuildPeriods(timeline, arrayList, arrayList2);
        Timeline createMaskingTimeline = createMaskingTimeline(arrayList, arrayList2);
        if (createMaskingTimeline.isEmpty()) {
            return;
        }
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        if (currentMediaItemIndex >= i && currentMediaItemIndex < min) {
            i5 = (currentMediaItemIndex - i) + min2;
        } else if (min <= currentMediaItemIndex && min2 > currentMediaItemIndex) {
            i5 = currentMediaItemIndex - i6;
        } else {
            if (min <= currentMediaItemIndex || min2 > currentMediaItemIndex) {
                i4 = currentMediaItemIndex;
                Timeline.Window window = new Timeline.Window();
                updatePlayerInfo(maskTimelineAndPositionInfo(this.playerInfo, createMaskingTimeline, i4, createMaskingTimeline.getWindow(i4, window).firstPeriodIndex + (this.playerInfo.sessionPositionInfo.positionInfo.periodIndex - timeline.getWindow(currentMediaItemIndex, window).firstPeriodIndex), getCurrentPosition(), getContentPosition(), 5), 0, null, null, null);
            }
            i5 = currentMediaItemIndex + i6;
        }
        i4 = i5;
        Timeline.Window window2 = new Timeline.Window();
        updatePlayerInfo(maskTimelineAndPositionInfo(this.playerInfo, createMaskingTimeline, i4, createMaskingTimeline.getWindow(i4, window2).firstPeriodIndex + (this.playerInfo.sessionPositionInfo.positionInfo.periodIndex - timeline.getWindow(currentMediaItemIndex, window2).firstPeriodIndex), getCurrentPosition(), getContentPosition(), 5), 0, null, null, null);
    }

    private void notifyPlayerInfoListenersWithReasons(PlayerInfo playerInfo, final PlayerInfo playerInfo2, @Nullable final Integer num, @Nullable Integer num2, @Nullable final Integer num3, @Nullable Integer num4) {
        if (num != null) {
            this.listeners.queueEvent(0, new ListenerSet.Event() { // from class: androidx.media3.session.o0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$77(PlayerInfo.this, num, (Player.Listener) obj);
                }
            });
        }
        if (num3 != null) {
            this.listeners.queueEvent(11, new ListenerSet.Event() { // from class: androidx.media3.session.z0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$78(PlayerInfo.this, num3, (Player.Listener) obj);
                }
            });
        }
        MediaItem currentMediaItem = playerInfo2.getCurrentMediaItem();
        if (num4 != null) {
            this.listeners.queueEvent(1, new C0566r(1, currentMediaItem, num4));
        }
        PlaybackException playbackException = playerInfo.playerError;
        PlaybackException playbackException2 = playerInfo2.playerError;
        if (playbackException != playbackException2 && (playbackException == null || !playbackException.errorInfoEquals(playbackException2))) {
            this.listeners.queueEvent(10, new I0(playbackException2, 0));
            if (playbackException2 != null) {
                this.listeners.queueEvent(10, new J0(playbackException2));
            }
        }
        if (!playerInfo.currentTracks.equals(playerInfo2.currentTracks)) {
            this.listeners.queueEvent(2, new L0(playerInfo2));
        }
        if (!playerInfo.mediaMetadata.equals(playerInfo2.mediaMetadata)) {
            this.listeners.queueEvent(14, new M0(playerInfo2, 0));
        }
        if (playerInfo.isLoading != playerInfo2.isLoading) {
            this.listeners.queueEvent(3, new N0(playerInfo2, 0));
        }
        if (playerInfo.playbackState != playerInfo2.playbackState) {
            this.listeners.queueEvent(4, new O0(playerInfo2, 0));
        }
        if (num2 != null) {
            this.listeners.queueEvent(5, new P0(playerInfo2, num2));
        }
        if (playerInfo.playbackSuppressionReason != playerInfo2.playbackSuppressionReason) {
            this.listeners.queueEvent(6, new ListenerSet.Event() { // from class: androidx.media3.session.p0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$87(PlayerInfo.this, (Player.Listener) obj);
                }
            });
        }
        if (playerInfo.isPlaying != playerInfo2.isPlaying) {
            this.listeners.queueEvent(7, new C0561q0(playerInfo2, 0));
        }
        if (!playerInfo.playbackParameters.equals(playerInfo2.playbackParameters)) {
            this.listeners.queueEvent(12, new C0567r0(playerInfo2));
        }
        if (playerInfo.repeatMode != playerInfo2.repeatMode) {
            this.listeners.queueEvent(8, new C0573s0(playerInfo2));
        }
        if (playerInfo.shuffleModeEnabled != playerInfo2.shuffleModeEnabled) {
            this.listeners.queueEvent(9, new C0579t0(playerInfo2));
        }
        if (!playerInfo.playlistMetadata.equals(playerInfo2.playlistMetadata)) {
            this.listeners.queueEvent(15, new ListenerSet.Event() { // from class: androidx.media3.session.u0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$92(PlayerInfo.this, (Player.Listener) obj);
                }
            });
        }
        if (playerInfo.volume != playerInfo2.volume) {
            this.listeners.queueEvent(22, new C0591v0(playerInfo2));
        }
        if (!playerInfo.audioAttributes.equals(playerInfo2.audioAttributes)) {
            this.listeners.queueEvent(20, new C0597w0(playerInfo2));
        }
        if (!playerInfo.cueGroup.cues.equals(playerInfo2.cueGroup.cues)) {
            this.listeners.queueEvent(27, new C0603x0(playerInfo2));
            this.listeners.queueEvent(27, new C0609y0(playerInfo2));
        }
        if (!playerInfo.deviceInfo.equals(playerInfo2.deviceInfo)) {
            this.listeners.queueEvent(29, new B0(playerInfo2, 0));
        }
        if (playerInfo.deviceVolume != playerInfo2.deviceVolume || playerInfo.deviceMuted != playerInfo2.deviceMuted) {
            this.listeners.queueEvent(30, new C0(playerInfo2, 0));
        }
        if (!playerInfo.videoSize.equals(playerInfo2.videoSize)) {
            this.listeners.queueEvent(25, new D0(playerInfo2, 0));
        }
        if (playerInfo.seekBackIncrementMs != playerInfo2.seekBackIncrementMs) {
            this.listeners.queueEvent(16, new E0(playerInfo2, 0));
        }
        if (playerInfo.seekForwardIncrementMs != playerInfo2.seekForwardIncrementMs) {
            this.listeners.queueEvent(17, new ListenerSet.Event() { // from class: androidx.media3.session.F0
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$101(PlayerInfo.this, (Player.Listener) obj);
                }
            });
        }
        if (playerInfo.maxSeekToPreviousPositionMs != playerInfo2.maxSeekToPreviousPositionMs) {
            this.listeners.queueEvent(18, new G0(playerInfo2));
        }
        if (!playerInfo.trackSelectionParameters.equals(playerInfo2.trackSelectionParameters)) {
            this.listeners.queueEvent(19, new H0(playerInfo2, 0));
        }
        this.listeners.flushEvents();
    }

    private static void rebuildPeriods(Timeline timeline, List<Timeline.Window> list, List<Timeline.Period> list2) {
        for (int i = 0; i < list.size(); i++) {
            Timeline.Window window = list.get(i);
            int i2 = window.firstPeriodIndex;
            int i3 = window.lastPeriodIndex;
            if (i2 == -1 || i3 == -1) {
                window.firstPeriodIndex = list2.size();
                window.lastPeriodIndex = list2.size();
                list2.add(createNewPeriod(i));
            } else {
                window.firstPeriodIndex = list2.size();
                window.lastPeriodIndex = (i3 - i2) + list2.size();
                while (i2 <= i3) {
                    list2.add(getPeriodWithNewWindowIndex(timeline, i2, i));
                    i2++;
                }
            }
        }
    }

    private void removeMediaItemsInternal(int i, int i2) {
        int windowCount = this.playerInfo.timeline.getWindowCount();
        int min = Math.min(i2, windowCount);
        if (i >= windowCount || i == min || windowCount == 0) {
            return;
        }
        boolean z = getCurrentMediaItemIndex() >= i && getCurrentMediaItemIndex() < min;
        PlayerInfo maskPlayerInfoForRemovedItems = maskPlayerInfoForRemovedItems(this.playerInfo, i, min, false, getCurrentPosition(), getContentPosition());
        int i3 = this.playerInfo.sessionPositionInfo.positionInfo.mediaItemIndex;
        updatePlayerInfo(maskPlayerInfoForRemovedItems, 0, null, z ? 4 : null, i3 >= i && i3 < min ? 3 : null);
    }

    private void replaceMediaItemsInternal(int i, int i2, List<MediaItem> list) {
        int windowCount = this.playerInfo.timeline.getWindowCount();
        if (i > windowCount) {
            return;
        }
        if (this.playerInfo.timeline.isEmpty()) {
            setMediaItemsInternal(list, -1, -9223372036854775807L, false);
            return;
        }
        int min = Math.min(i2, windowCount);
        PlayerInfo maskPlayerInfoForRemovedItems = maskPlayerInfoForRemovedItems(maskPlayerInfoForAddedItems(this.playerInfo, min, list, getCurrentPosition(), getContentPosition()), i, min, true, getCurrentPosition(), getContentPosition());
        int i3 = this.playerInfo.sessionPositionInfo.positionInfo.mediaItemIndex;
        boolean z = i3 >= i && i3 < min;
        updatePlayerInfo(maskPlayerInfoForRemovedItems, 0, null, z ? 4 : null, z ? 3 : null);
    }

    private boolean requestConnectToService() {
        int i = Build.VERSION.SDK_INT >= 29 ? FragmentTransaction.TRANSIT_FRAGMENT_OPEN : 1;
        Intent intent = new Intent(MediaSessionService.SERVICE_INTERFACE);
        intent.setClassName(this.token.getPackageName(), this.token.getServiceName());
        try {
            if (this.context.bindService(intent, this.serviceConnection, i)) {
                return true;
            }
            Log.w(TAG, "bind to " + this.token + " failed");
            return false;
        } catch (SecurityException e) {
            Log.w(TAG, "bind to " + this.token + " not allowed", e);
            return false;
        }
    }

    private boolean requestConnectToSession(Bundle bundle) {
        try {
            IMediaSession.Stub.asInterface((IBinder) Assertions.checkStateNotNull(this.token.getBinder())).connect(this.controllerStub, this.sequencedFutureManager.obtainNextSequenceNumber(), new ConnectionRequest(this.context.getPackageName(), Process.myPid(), bundle, this.instance.getMaxCommandsForMediaItems()).toBundle());
            return true;
        } catch (RemoteException e) {
            Log.w(TAG, "Failed to call connection request.", e);
            return false;
        }
    }

    private static com.google.common.collect.G<CommandButton> resolveCustomLayout(List<CommandButton> list, List<CommandButton> list2, Bundle bundle, SessionCommands sessionCommands, Player.Commands commands) {
        if (!list2.isEmpty()) {
            return CommandButton.copyWithUnavailableButtonsDisabled(list2, sessionCommands, commands);
        }
        boolean z = false;
        boolean z2 = (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS") || commands.containsAny(6, 7)) ? false : true;
        if (!bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT") && !commands.containsAny(8, 9)) {
            z = true;
        }
        return CommandButton.getCustomLayoutFromMediaButtonPreferences(list, z2, z);
    }

    private static com.google.common.collect.G<CommandButton> resolveMediaButtonPreferences(List<CommandButton> list, List<CommandButton> list2, SessionCommands sessionCommands, Player.Commands commands, Bundle bundle) {
        if (list.isEmpty()) {
            list = CommandButton.getMediaButtonPreferencesFromCustomLayout(list2, commands, bundle);
        }
        return CommandButton.copyWithUnavailableButtonsDisabled(list, sessionCommands, commands);
    }

    private static int resolveSubsequentMediaItemIndex(int i, boolean z, int i2, Timeline timeline, int i3, int i4) {
        int windowCount = timeline.getWindowCount();
        for (int i5 = 0; i5 < windowCount && (i2 = timeline.getNextWindowIndex(i2, i, z)) != -1; i5++) {
            if (i2 < i3 || i2 >= i4) {
                return i2;
            }
        }
        return -1;
    }

    private void seekToInternal(int i, long j) {
        int i2;
        int i3;
        PlayerInfo maskPositionInfo;
        Timeline timeline = this.playerInfo.timeline;
        if ((timeline.isEmpty() || i < timeline.getWindowCount()) && !isPlayingAd()) {
            int i4 = getPlaybackState() == 1 ? 1 : 2;
            PlayerInfo playerInfo = this.playerInfo;
            PlayerInfo copyWithPlaybackState = playerInfo.copyWithPlaybackState(i4, playerInfo.playerError);
            PeriodInfo periodInfo = getPeriodInfo(timeline, i, j);
            if (periodInfo == null) {
                i2 = 1;
                i3 = 2;
                Player.PositionInfo positionInfo = new Player.PositionInfo(null, i, null, null, i, j == -9223372036854775807L ? 0L : j, j == -9223372036854775807L ? 0L : j, -1, -1);
                PlayerInfo playerInfo2 = this.playerInfo;
                Timeline timeline2 = playerInfo2.timeline;
                boolean z = this.playerInfo.sessionPositionInfo.isPlayingAd;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                SessionPositionInfo sessionPositionInfo = this.playerInfo.sessionPositionInfo;
                maskPositionInfo = maskTimelineAndPositionInfo(playerInfo2, timeline2, positionInfo, new SessionPositionInfo(positionInfo, z, elapsedRealtime, sessionPositionInfo.durationMs, j == -9223372036854775807L ? 0L : j, 0, 0L, sessionPositionInfo.currentLiveOffsetMs, sessionPositionInfo.contentDurationMs, j == -9223372036854775807L ? 0L : j), 1);
            } else {
                i2 = 1;
                i3 = 2;
                maskPositionInfo = maskPositionInfo(copyWithPlaybackState, timeline, periodInfo);
            }
            int i5 = (this.playerInfo.timeline.isEmpty() || maskPositionInfo.sessionPositionInfo.positionInfo.mediaItemIndex == this.playerInfo.sessionPositionInfo.positionInfo.mediaItemIndex) ? 0 : i2;
            if (i5 == 0 && maskPositionInfo.sessionPositionInfo.positionInfo.positionMs == this.playerInfo.sessionPositionInfo.positionInfo.positionMs) {
                return;
            }
            updatePlayerInfo(maskPositionInfo, null, null, Integer.valueOf(i2), i5 != 0 ? Integer.valueOf(i3) : null);
        }
    }

    private void seekToInternalByOffset(long j) {
        long currentPosition = getCurrentPosition() + j;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        seekToInternal(getCurrentMediaItemIndex(), Math.max(currentPosition, 0L));
    }

    private void sendControllerResult(int i, SessionResult sessionResult) {
        IMediaSession iMediaSession = this.iSession;
        if (iMediaSession == null) {
            return;
        }
        try {
            iMediaSession.onControllerResult(this.controllerStub, i, sessionResult.toBundle());
        } catch (RemoteException unused) {
            Log.w(TAG, "Error in sending");
        }
    }

    private void sendControllerResultWhenReady(final int i, final com.google.common.util.concurrent.u<SessionResult> uVar) {
        uVar.addListener(new Runnable() { // from class: androidx.media3.session.j1
            @Override // java.lang.Runnable
            public final void run() {
                MediaControllerImplBase.this.lambda$sendControllerResultWhenReady$107(uVar, i);
            }
        }, com.google.common.util.concurrent.j.a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r26v0 ??, still in use, count: 1, list:
          (r26v0 ?? I:androidx.media3.common.Player$PositionInfo) from 0x0133: CONSTRUCTOR (r25v0 ?? I:androidx.media3.session.SessionPositionInfo) = 
          (r26v0 ?? I:androidx.media3.common.Player$PositionInfo)
          (r27v0 ?? I:boolean)
          (r28v0 ?? I:long)
          (r30v0 ?? I:long)
          (r32v0 ?? I:long)
          (r34v0 ?? I:int)
          (r35v0 ?? I:long)
          (r37v0 ?? I:long)
          (r39v0 ?? I:long)
          (r41v0 ?? I:long)
         A[MD:(androidx.media3.common.Player$PositionInfo, boolean, long, long, long, int, long, long, long, long):void (m)] (LINE:308) call: androidx.media3.session.SessionPositionInfo.<init>(androidx.media3.common.Player$PositionInfo, boolean, long, long, long, int, long, long, long, long):void type: CONSTRUCTOR
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    private void setMediaItemsInternal(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r26v0 ??, still in use, count: 1, list:
          (r26v0 ?? I:androidx.media3.common.Player$PositionInfo) from 0x0133: CONSTRUCTOR (r25v0 ?? I:androidx.media3.session.SessionPositionInfo) = 
          (r26v0 ?? I:androidx.media3.common.Player$PositionInfo)
          (r27v0 ?? I:boolean)
          (r28v0 ?? I:long)
          (r30v0 ?? I:long)
          (r32v0 ?? I:long)
          (r34v0 ?? I:int)
          (r35v0 ?? I:long)
          (r37v0 ?? I:long)
          (r39v0 ?? I:long)
          (r41v0 ?? I:long)
         A[MD:(androidx.media3.common.Player$PositionInfo, boolean, long, long, long, int, long, long, long, long):void (m)] (LINE:308) call: androidx.media3.session.SessionPositionInfo.<init>(androidx.media3.common.Player$PositionInfo, boolean, long, long, long, int, long, long, long, long):void type: CONSTRUCTOR
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r44v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    private void updatePlayerInfo(PlayerInfo playerInfo, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        PlayerInfo playerInfo2 = this.playerInfo;
        this.playerInfo = playerInfo;
        notifyPlayerInfoListenersWithReasons(playerInfo2, playerInfo, num, num2, num3, num4);
    }

    private void updateSessionPositionInfoIfNeeded(SessionPositionInfo sessionPositionInfo) {
        if (this.pendingMaskingSequencedFutureNumbers.isEmpty()) {
            SessionPositionInfo sessionPositionInfo2 = this.playerInfo.sessionPositionInfo;
            if (sessionPositionInfo2.eventTimeMs >= sessionPositionInfo.eventTimeMs || !MediaUtils.areSessionPositionInfosInSamePeriodOrAd(sessionPositionInfo, sessionPositionInfo2)) {
                return;
            }
            this.playerInfo = this.playerInfo.copyWithSessionPositionInfo(sessionPositionInfo);
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void addListener(Player.Listener listener) {
        this.listeners.add(listener);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void addMediaItem(final MediaItem mediaItem) {
        if (isPlayerCommandAvailable(20)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new RemoteSessionTask() { // from class: androidx.media3.session.A0
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(IMediaSession iMediaSession, int i) {
                    MediaControllerImplBase.this.lambda$addMediaItem$30(mediaItem, iMediaSession, i);
                }
            });
            addMediaItemsInternal(getCurrentTimeline().getWindowCount(), Collections.singletonList(mediaItem));
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void addMediaItems(final List<MediaItem> list) {
        if (isPlayerCommandAvailable(20)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new RemoteSessionTask() { // from class: androidx.media3.session.X
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(IMediaSession iMediaSession, int i) {
                    MediaControllerImplBase.this.lambda$addMediaItems$32(list, iMediaSession, i);
                }
            });
            addMediaItemsInternal(getCurrentTimeline().getWindowCount(), list);
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void clearMediaItems() {
        if (isPlayerCommandAvailable(20)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new C0498g1(this));
            removeMediaItemsInternal(0, Integer.MAX_VALUE);
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void clearVideoSurface() {
        if (isPlayerCommandAvailable(27)) {
            clearSurfacesAndCallbacks();
            dispatchRemoteSessionTaskWithPlayerCommandAndWaitForFuture(new C0469c0(this));
            maybeNotifySurfaceSizeChanged(0, 0);
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void clearVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder) {
        if (isPlayerCommandAvailable(27) && surfaceHolder != null && this.videoSurfaceHolder == surfaceHolder) {
            clearVideoSurface();
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void clearVideoSurfaceView(@Nullable SurfaceView surfaceView) {
        if (isPlayerCommandAvailable(27)) {
            clearVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void clearVideoTextureView(@Nullable TextureView textureView) {
        if (isPlayerCommandAvailable(27) && textureView != null && this.videoTextureView == textureView) {
            clearVideoSurface();
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void connect() {
        boolean requestConnectToService;
        if (this.token.getType() == 0) {
            this.serviceConnection = null;
            requestConnectToService = requestConnectToSession(this.connectionHints);
        } else {
            this.serviceConnection = new SessionServiceConnection(this.connectionHints);
            requestConnectToService = requestConnectToService();
        }
        if (requestConnectToService) {
            return;
        }
        MediaController mediaControllerImplBase = getInstance();
        MediaController mediaControllerImplBase2 = getInstance();
        Objects.requireNonNull(mediaControllerImplBase2);
        mediaControllerImplBase.runOnApplicationLooper(new E5(mediaControllerImplBase2, 1));
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    @Deprecated
    public void decreaseDeviceVolume() {
        if (isPlayerCommandAvailable(26)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new L(this));
            final int i = this.playerInfo.deviceVolume - 1;
            if (i >= getDeviceInfo().minVolume) {
                PlayerInfo playerInfo = this.playerInfo;
                this.playerInfo = playerInfo.copyWithDeviceVolume(i, playerInfo.deviceMuted);
                this.listeners.queueEvent(30, new ListenerSet.Event() { // from class: androidx.media3.session.M
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(Object obj) {
                        MediaControllerImplBase.this.lambda$decreaseDeviceVolume$60(i, (Player.Listener) obj);
                    }
                });
                this.listeners.flushEvents();
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public AudioAttributes getAudioAttributes() {
        return this.playerInfo.audioAttributes;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public Player.Commands getAvailableCommands() {
        return this.intersectedPlayerCommands;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public SessionCommands getAvailableSessionCommands() {
        return this.sessionCommands;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public IMediaController getBinder() {
        return this.controllerStub;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    @Nullable
    public MediaBrowserCompat getBrowserCompat() {
        return null;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getBufferedPercentage() {
        return this.playerInfo.sessionPositionInfo.bufferedPercentage;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getBufferedPosition() {
        return this.playerInfo.sessionPositionInfo.bufferedPositionMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public com.google.common.collect.G<CommandButton> getCommandButtonsForMediaItem(MediaItem mediaItem) {
        SessionCommand sessionCommand;
        com.google.common.collect.G<String> g = mediaItem.mediaMetadata.supportedCommands;
        SessionCommands availableSessionCommands = getAvailableSessionCommands();
        G.a aVar = new G.a();
        for (int i = 0; i < g.size(); i++) {
            CommandButton commandButton = this.commandButtonsForMediaItemsMap.get(g.get(i));
            if (commandButton != null && (sessionCommand = commandButton.sessionCommand) != null && availableSessionCommands.contains(sessionCommand)) {
                aVar.c(commandButton);
            }
        }
        return aVar.g();
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    @Nullable
    public SessionToken getConnectedToken() {
        return this.connectedToken;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public Bundle getConnectionHints() {
        return this.connectionHints;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getContentBufferedPosition() {
        return this.playerInfo.sessionPositionInfo.contentBufferedPositionMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getContentDuration() {
        return this.playerInfo.sessionPositionInfo.contentDurationMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getContentPosition() {
        SessionPositionInfo sessionPositionInfo = this.playerInfo.sessionPositionInfo;
        return !sessionPositionInfo.isPlayingAd ? getCurrentPosition() : sessionPositionInfo.positionInfo.contentPositionMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public Context getContext() {
        return this.context;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getCurrentAdGroupIndex() {
        return this.playerInfo.sessionPositionInfo.positionInfo.adGroupIndex;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getCurrentAdIndexInAdGroup() {
        return this.playerInfo.sessionPositionInfo.positionInfo.adIndexInAdGroup;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public CueGroup getCurrentCues() {
        return this.playerInfo.cueGroup;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getCurrentLiveOffset() {
        return this.playerInfo.sessionPositionInfo.currentLiveOffsetMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getCurrentMediaItemIndex() {
        return getCurrentMediaItemIndexInternal(this.playerInfo);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getCurrentPeriodIndex() {
        return this.playerInfo.sessionPositionInfo.positionInfo.periodIndex;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getCurrentPosition() {
        long updatedCurrentPositionMs = MediaUtils.getUpdatedCurrentPositionMs(this.playerInfo, this.currentPositionMs, this.lastSetPlayWhenReadyCalledTimeMs, getInstance().getTimeDiffMs());
        this.currentPositionMs = updatedCurrentPositionMs;
        return updatedCurrentPositionMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public Timeline getCurrentTimeline() {
        return this.playerInfo.timeline;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public Tracks getCurrentTracks() {
        return this.playerInfo.currentTracks;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public com.google.common.collect.G<CommandButton> getCustomLayout() {
        return this.resolvedCustomLayout;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public DeviceInfo getDeviceInfo() {
        return this.playerInfo.deviceInfo;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getDeviceVolume() {
        return this.playerInfo.deviceVolume;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getDuration() {
        return this.playerInfo.sessionPositionInfo.durationMs;
    }

    public MediaController getInstance() {
        return this.instance;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getMaxSeekToPreviousPosition() {
        return this.playerInfo.maxSeekToPreviousPositionMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public com.google.common.collect.G<CommandButton> getMediaButtonPreferences() {
        return this.resolvedMediaButtonPreferences;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public MediaMetadata getMediaMetadata() {
        return this.playerInfo.mediaMetadata;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getNextMediaItemIndex() {
        if (this.playerInfo.timeline.isEmpty()) {
            return -1;
        }
        return this.playerInfo.timeline.getNextWindowIndex(getCurrentMediaItemIndex(), convertRepeatModeForNavigation(this.playerInfo.repeatMode), this.playerInfo.shuffleModeEnabled);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean getPlayWhenReady() {
        return this.playerInfo.playWhenReady;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public PlaybackParameters getPlaybackParameters() {
        return this.playerInfo.playbackParameters;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getPlaybackState() {
        return this.playerInfo.playbackState;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getPlaybackSuppressionReason() {
        return this.playerInfo.playbackSuppressionReason;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    @Nullable
    public PlaybackException getPlayerError() {
        return this.playerInfo.playerError;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public MediaMetadata getPlaylistMetadata() {
        return this.playerInfo.playlistMetadata;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getPreviousMediaItemIndex() {
        if (this.playerInfo.timeline.isEmpty()) {
            return -1;
        }
        return this.playerInfo.timeline.getPreviousWindowIndex(getCurrentMediaItemIndex(), convertRepeatModeForNavigation(this.playerInfo.repeatMode), this.playerInfo.shuffleModeEnabled);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getRepeatMode() {
        return this.playerInfo.repeatMode;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getSeekBackIncrement() {
        return this.playerInfo.seekBackIncrementMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getSeekForwardIncrement() {
        return this.playerInfo.seekForwardIncrementMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public PendingIntent getSessionActivity() {
        return this.sessionActivity;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public Bundle getSessionExtras() {
        return this.sessionExtras;
    }

    @Nullable
    public IMediaSession getSessionInterfaceWithSessionCommandIfAble(int i) {
        Assertions.checkArgument(i != 0);
        if (this.sessionCommands.contains(i)) {
            return this.iSession;
        }
        androidx.compose.runtime.collection.a.c(i, "Controller isn't allowed to call command, commandCode=", TAG);
        return null;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean getShuffleModeEnabled() {
        return this.playerInfo.shuffleModeEnabled;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public Size getSurfaceSize() {
        return this.surfaceSize;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getTotalBufferedDuration() {
        return this.playerInfo.sessionPositionInfo.totalBufferedDurationMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public TrackSelectionParameters getTrackSelectionParameters() {
        return this.playerInfo.trackSelectionParameters;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public VideoSize getVideoSize() {
        return this.playerInfo.videoSize;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public float getVolume() {
        return this.playerInfo.volume;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean hasNextMediaItem() {
        return getNextMediaItemIndex() != -1;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean hasPreviousMediaItem() {
        return getPreviousMediaItemIndex() != -1;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    @Deprecated
    public void increaseDeviceVolume() {
        if (isPlayerCommandAvailable(26)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new C0455a0(this));
            final int i = this.playerInfo.deviceVolume + 1;
            int i2 = getDeviceInfo().maxVolume;
            if (i2 == 0 || i <= i2) {
                PlayerInfo playerInfo = this.playerInfo;
                this.playerInfo = playerInfo.copyWithDeviceVolume(i, playerInfo.deviceMuted);
                this.listeners.queueEvent(30, new ListenerSet.Event() { // from class: androidx.media3.session.r1
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(Object obj) {
                        MediaControllerImplBase.this.lambda$increaseDeviceVolume$56(i, (Player.Listener) obj);
                    }
                });
                this.listeners.flushEvents();
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean isConnected() {
        return this.iSession != null;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean isDeviceMuted() {
        return this.playerInfo.deviceMuted;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean isLoading() {
        return this.playerInfo.isLoading;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean isPlaying() {
        return this.playerInfo.isPlaying;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean isPlayingAd() {
        return this.playerInfo.sessionPositionInfo.isPlayingAd;
    }

    public boolean isReleased() {
        return this.released;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void moveMediaItem(final int i, final int i2) {
        if (isPlayerCommandAvailable(20)) {
            Assertions.checkArgument(i >= 0 && i2 >= 0);
            dispatchRemoteSessionTaskWithPlayerCommand(new RemoteSessionTask() { // from class: androidx.media3.session.D
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(IMediaSession iMediaSession, int i3) {
                    MediaControllerImplBase.this.lambda$moveMediaItem$37(i, i2, iMediaSession, i3);
                }
            });
            moveMediaItemsInternal(i, i + 1, i2);
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void moveMediaItems(final int i, final int i2, final int i3) {
        if (isPlayerCommandAvailable(20)) {
            Assertions.checkArgument(i >= 0 && i <= i2 && i3 >= 0);
            dispatchRemoteSessionTaskWithPlayerCommand(new RemoteSessionTask() { // from class: androidx.media3.session.Z0
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(IMediaSession iMediaSession, int i4) {
                    MediaControllerImplBase.this.lambda$moveMediaItems$38(i, i2, i3, iMediaSession, i4);
                }
            });
            moveMediaItemsInternal(i, i2, i3);
        }
    }

    public void notifyPeriodicSessionPositionInfoChanged(SessionPositionInfo sessionPositionInfo) {
        if (isConnected()) {
            updateSessionPositionInfoIfNeeded(sessionPositionInfo);
        }
    }

    public void onAvailableCommandsChangedFromPlayer(Player.Commands commands) {
        boolean z;
        boolean z2;
        if (isConnected() && !Objects.equals(this.playerCommandsFromPlayer, commands)) {
            this.playerCommandsFromPlayer = commands;
            Player.Commands commands2 = this.intersectedPlayerCommands;
            Player.Commands createIntersectedCommandsEnsuringCommandReleaseAvailable = createIntersectedCommandsEnsuringCommandReleaseAvailable(this.playerCommandsFromSession, commands);
            this.intersectedPlayerCommands = createIntersectedCommandsEnsuringCommandReleaseAvailable;
            if (Objects.equals(createIntersectedCommandsEnsuringCommandReleaseAvailable, commands2)) {
                z = false;
                z2 = false;
            } else {
                com.google.common.collect.G<CommandButton> g = this.resolvedMediaButtonPreferences;
                com.google.common.collect.G<CommandButton> g2 = this.resolvedCustomLayout;
                com.google.common.collect.G<CommandButton> resolveMediaButtonPreferences = resolveMediaButtonPreferences(this.mediaButtonPreferencesOriginal, this.customLayoutOriginal, this.sessionCommands, this.intersectedPlayerCommands, this.sessionExtras);
                this.resolvedMediaButtonPreferences = resolveMediaButtonPreferences;
                this.resolvedCustomLayout = resolveCustomLayout(resolveMediaButtonPreferences, this.customLayoutOriginal, this.sessionExtras, this.sessionCommands, this.intersectedPlayerCommands);
                z = !this.resolvedMediaButtonPreferences.equals(g);
                z2 = !this.resolvedCustomLayout.equals(g2);
                this.listeners.sendEvent(13, new C0608y(this, 0));
            }
            if (z2) {
                getInstance().notifyControllerListener(new C0614z(this));
            }
            if (z) {
                getInstance().notifyControllerListener(new A(this));
            }
        }
    }

    public void onAvailableCommandsChangedFromSession(final SessionCommands sessionCommands, Player.Commands commands) {
        boolean z;
        boolean z2;
        if (isConnected()) {
            boolean equals = Objects.equals(this.playerCommandsFromSession, commands);
            boolean equals2 = Objects.equals(this.sessionCommands, sessionCommands);
            if (equals && equals2) {
                return;
            }
            this.sessionCommands = sessionCommands;
            boolean z3 = false;
            if (equals) {
                z = false;
            } else {
                this.playerCommandsFromSession = commands;
                Player.Commands commands2 = this.intersectedPlayerCommands;
                Player.Commands createIntersectedCommandsEnsuringCommandReleaseAvailable = createIntersectedCommandsEnsuringCommandReleaseAvailable(commands, this.playerCommandsFromPlayer);
                this.intersectedPlayerCommands = createIntersectedCommandsEnsuringCommandReleaseAvailable;
                z = !Objects.equals(createIntersectedCommandsEnsuringCommandReleaseAvailable, commands2);
            }
            if (!equals2 || z) {
                com.google.common.collect.G<CommandButton> g = this.resolvedMediaButtonPreferences;
                com.google.common.collect.G<CommandButton> g2 = this.resolvedCustomLayout;
                com.google.common.collect.G<CommandButton> resolveMediaButtonPreferences = resolveMediaButtonPreferences(this.mediaButtonPreferencesOriginal, this.customLayoutOriginal, sessionCommands, this.intersectedPlayerCommands, this.sessionExtras);
                this.resolvedMediaButtonPreferences = resolveMediaButtonPreferences;
                this.resolvedCustomLayout = resolveCustomLayout(resolveMediaButtonPreferences, this.customLayoutOriginal, this.sessionExtras, sessionCommands, this.intersectedPlayerCommands);
                z2 = !this.resolvedMediaButtonPreferences.equals(g);
                z3 = !this.resolvedCustomLayout.equals(g2);
            } else {
                z2 = false;
            }
            if (z) {
                this.listeners.sendEvent(13, new C0561q0(this, 1));
            }
            if (!equals2) {
                getInstance().notifyControllerListener(new Consumer() { // from class: androidx.media3.session.H1
                    @Override // androidx.media3.common.util.Consumer
                    public final void accept(Object obj) {
                        MediaControllerImplBase.this.lambda$onAvailableCommandsChangedFromSession$110(sessionCommands, (MediaController.Listener) obj);
                    }
                });
            }
            if (z3) {
                getInstance().notifyControllerListener(new C0573s0(this));
            }
            if (z2) {
                getInstance().notifyControllerListener(new C0579t0(this));
            }
        }
    }

    public void onConnected(ConnectionState connectionState) {
        if (this.iSession != null) {
            Log.e(TAG, "Cannot be notified about the connection result many times. Probably a bug or malicious app.");
            getInstance().release();
            return;
        }
        this.iSession = connectionState.sessionBinder;
        this.sessionActivity = connectionState.sessionActivity;
        this.sessionCommands = connectionState.sessionCommands;
        Player.Commands commands = connectionState.playerCommandsFromSession;
        this.playerCommandsFromSession = commands;
        Player.Commands commands2 = connectionState.playerCommandsFromPlayer;
        this.playerCommandsFromPlayer = commands2;
        Player.Commands createIntersectedCommandsEnsuringCommandReleaseAvailable = createIntersectedCommandsEnsuringCommandReleaseAvailable(commands, commands2);
        this.intersectedPlayerCommands = createIntersectedCommandsEnsuringCommandReleaseAvailable;
        com.google.common.collect.G<CommandButton> g = connectionState.customLayout;
        this.customLayoutOriginal = g;
        com.google.common.collect.G<CommandButton> g2 = connectionState.mediaButtonPreferences;
        this.mediaButtonPreferencesOriginal = g2;
        com.google.common.collect.G<CommandButton> resolveMediaButtonPreferences = resolveMediaButtonPreferences(g2, g, this.sessionCommands, createIntersectedCommandsEnsuringCommandReleaseAvailable, connectionState.sessionExtras);
        this.resolvedMediaButtonPreferences = resolveMediaButtonPreferences;
        this.resolvedCustomLayout = resolveCustomLayout(resolveMediaButtonPreferences, this.customLayoutOriginal, connectionState.sessionExtras, this.sessionCommands, this.intersectedPlayerCommands);
        I.a aVar = new I.a(4);
        for (int i = 0; i < connectionState.commandButtonsForMediaItems.size(); i++) {
            CommandButton commandButton = connectionState.commandButtonsForMediaItems.get(i);
            SessionCommand sessionCommand = commandButton.sessionCommand;
            if (sessionCommand != null && sessionCommand.commandCode == 0) {
                aVar.d(sessionCommand.customAction, commandButton);
            }
        }
        this.commandButtonsForMediaItemsMap = aVar.a(true);
        this.playerInfo = connectionState.playerInfo;
        MediaSession.Token token = connectionState.platformToken;
        if (token == null) {
            token = this.token.getPlatformToken();
        }
        MediaSession.Token token2 = token;
        if (token2 != null) {
            this.platformController = new android.media.session.MediaController(this.context, token2);
        }
        try {
            connectionState.sessionBinder.asBinder().linkToDeath(this.deathRecipient, 0);
            this.connectedToken = new SessionToken(this.token.getUid(), 0, connectionState.libraryVersion, connectionState.sessionInterfaceVersion, this.token.getPackageName(), connectionState.sessionBinder, connectionState.tokenExtras, token2);
            this.sessionExtras = connectionState.sessionExtras;
            getInstance().notifyAccepted();
        } catch (RemoteException unused) {
            getInstance().release();
        }
    }

    public void onCustomCommand(final int i, final SessionCommand sessionCommand, final Bundle bundle) {
        if (isConnected()) {
            getInstance().notifyControllerListener(new Consumer() { // from class: androidx.media3.session.n1
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    this.lambda$onCustomCommand$108(sessionCommand, bundle, i, (MediaController.Listener) obj);
                }
            });
        }
    }

    public void onError(int i, final SessionError sessionError) {
        if (isConnected()) {
            getInstance().notifyControllerListener(new Consumer() { // from class: androidx.media3.session.G1
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    MediaControllerImplBase.this.lambda$onError$120(sessionError, (MediaController.Listener) obj);
                }
            });
        }
    }

    public void onExtrasChanged(final Bundle bundle) {
        if (isConnected()) {
            com.google.common.collect.G<CommandButton> g = this.resolvedMediaButtonPreferences;
            com.google.common.collect.G<CommandButton> g2 = this.resolvedCustomLayout;
            this.sessionExtras = bundle;
            com.google.common.collect.G<CommandButton> resolveMediaButtonPreferences = resolveMediaButtonPreferences(this.mediaButtonPreferencesOriginal, this.customLayoutOriginal, this.sessionCommands, this.intersectedPlayerCommands, bundle);
            this.resolvedMediaButtonPreferences = resolveMediaButtonPreferences;
            this.resolvedCustomLayout = resolveCustomLayout(resolveMediaButtonPreferences, this.customLayoutOriginal, this.sessionExtras, this.sessionCommands, this.intersectedPlayerCommands);
            final boolean z = !this.resolvedMediaButtonPreferences.equals(g);
            final boolean z2 = !this.resolvedCustomLayout.equals(g2);
            getInstance().notifyControllerListener(new Consumer() { // from class: androidx.media3.session.Q0
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    MediaControllerImplBase.this.lambda$onExtrasChanged$118(bundle, z2, z, (MediaController.Listener) obj);
                }
            });
        }
    }

    public void onPlayerInfoChanged(PlayerInfo playerInfo, PlayerInfo.BundlingExclusions bundlingExclusions) {
        if (isConnected()) {
            PlayerInfo playerInfo2 = this.pendingPlayerInfo;
            if (playerInfo2 != null) {
                this.pendingPlayerInfo = MediaUtils.mergePlayerInfo(playerInfo2, playerInfo, bundlingExclusions, this.intersectedPlayerCommands);
                if (!this.pendingMaskingSequencedFutureNumbers.isEmpty()) {
                    return;
                }
                playerInfo = this.pendingPlayerInfo;
                bundlingExclusions = PlayerInfo.BundlingExclusions.NONE;
                this.pendingPlayerInfo = null;
            }
            PlayerInfo playerInfo3 = this.playerInfo;
            PlayerInfo mergePlayerInfo = MediaUtils.mergePlayerInfo(playerInfo3, playerInfo, bundlingExclusions, this.intersectedPlayerCommands);
            this.playerInfo = mergePlayerInfo;
            Integer valueOf = (playerInfo3.oldPositionInfo.equals(playerInfo.oldPositionInfo) && playerInfo3.newPositionInfo.equals(playerInfo.newPositionInfo)) ? null : Integer.valueOf(mergePlayerInfo.discontinuityReason);
            Integer valueOf2 = !Objects.equals(playerInfo3.getCurrentMediaItem(), mergePlayerInfo.getCurrentMediaItem()) ? Integer.valueOf(mergePlayerInfo.mediaItemTransitionReason) : null;
            Integer valueOf3 = !playerInfo3.timeline.equals(mergePlayerInfo.timeline) ? Integer.valueOf(mergePlayerInfo.timelineChangeReason) : null;
            int i = playerInfo3.playWhenReadyChangeReason;
            int i2 = mergePlayerInfo.playWhenReadyChangeReason;
            notifyPlayerInfoListenersWithReasons(playerInfo3, mergePlayerInfo, valueOf3, (i == i2 && playerInfo3.playWhenReady == mergePlayerInfo.playWhenReady) ? null : Integer.valueOf(i2), valueOf, valueOf2);
        }
    }

    public void onRenderedFirstFrame() {
        this.listeners.sendEvent(26, new C0338w());
    }

    public void onSetCustomLayout(final int i, List<CommandButton> list) {
        if (isConnected()) {
            com.google.common.collect.G<CommandButton> g = this.resolvedMediaButtonPreferences;
            com.google.common.collect.G<CommandButton> g2 = this.resolvedCustomLayout;
            this.customLayoutOriginal = com.google.common.collect.G.j(list);
            com.google.common.collect.G<CommandButton> resolveMediaButtonPreferences = resolveMediaButtonPreferences(this.mediaButtonPreferencesOriginal, list, this.sessionCommands, this.intersectedPlayerCommands, this.sessionExtras);
            this.resolvedMediaButtonPreferences = resolveMediaButtonPreferences;
            this.resolvedCustomLayout = resolveCustomLayout(resolveMediaButtonPreferences, list, this.sessionExtras, this.sessionCommands, this.intersectedPlayerCommands);
            final boolean z = !this.resolvedMediaButtonPreferences.equals(g);
            final boolean z2 = !this.resolvedCustomLayout.equals(g2);
            getInstance().notifyControllerListener(new Consumer() { // from class: androidx.media3.session.s1
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    MediaControllerImplBase.this.lambda$onSetCustomLayout$116(z2, z, i, (MediaController.Listener) obj);
                }
            });
        }
    }

    public void onSetMediaButtonPreferences(final int i, List<CommandButton> list) {
        if (isConnected()) {
            com.google.common.collect.G<CommandButton> g = this.resolvedMediaButtonPreferences;
            com.google.common.collect.G<CommandButton> g2 = this.resolvedCustomLayout;
            this.mediaButtonPreferencesOriginal = com.google.common.collect.G.j(list);
            com.google.common.collect.G<CommandButton> resolveMediaButtonPreferences = resolveMediaButtonPreferences(list, this.customLayoutOriginal, this.sessionCommands, this.intersectedPlayerCommands, this.sessionExtras);
            this.resolvedMediaButtonPreferences = resolveMediaButtonPreferences;
            this.resolvedCustomLayout = resolveCustomLayout(resolveMediaButtonPreferences, this.customLayoutOriginal, this.sessionExtras, this.sessionCommands, this.intersectedPlayerCommands);
            final boolean z = !this.resolvedMediaButtonPreferences.equals(g);
            final boolean z2 = !this.resolvedCustomLayout.equals(g2);
            getInstance().notifyControllerListener(new Consumer() { // from class: androidx.media3.session.c1
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    MediaControllerImplBase.this.lambda$onSetMediaButtonPreferences$117(z2, z, i, (MediaController.Listener) obj);
                }
            });
        }
    }

    public void onSetSessionActivity(int i, @Nullable final PendingIntent pendingIntent) {
        if (!isConnected() || Objects.equals(this.sessionActivity, pendingIntent)) {
            return;
        }
        this.sessionActivity = pendingIntent;
        getInstance().notifyControllerListener(new Consumer() { // from class: androidx.media3.session.h1
            @Override // androidx.media3.common.util.Consumer
            public final void accept(Object obj) {
                MediaControllerImplBase.this.lambda$onSetSessionActivity$119(pendingIntent, (MediaController.Listener) obj);
            }
        });
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void pause() {
        if (isPlayerCommandAvailable(1)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new C0556p1(this));
            setPlayWhenReady(false, 1);
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void play() {
        android.media.session.MediaController mediaController;
        if (!isPlayerCommandAvailable(1)) {
            Log.w(TAG, "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
            return;
        }
        if (Build.VERSION.SDK_INT >= 31 && (mediaController = this.platformController) != null) {
            mediaController.getTransportControls().sendCustomAction("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST", (Bundle) null);
        }
        dispatchRemoteSessionTaskWithPlayerCommand(new RemoteSessionTask() { // from class: androidx.media3.session.x1
            @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
            public final void run(IMediaSession iMediaSession, int i) {
                MediaControllerImplBase.this.lambda$play$5(iMediaSession, i);
            }
        });
        setPlayWhenReady(true, 1);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void prepare() {
        if (isPlayerCommandAvailable(2)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new RemoteSessionTask() { // from class: androidx.media3.session.B1
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(IMediaSession iMediaSession, int i) {
                    MediaControllerImplBase.this.lambda$prepare$7(iMediaSession, i);
                }
            });
            PlayerInfo playerInfo = this.playerInfo;
            if (playerInfo.playbackState == 1) {
                updatePlayerInfo(playerInfo.copyWithPlaybackState(playerInfo.timeline.isEmpty() ? 4 : 2, null), null, null, null, null);
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void release() {
        IMediaSession iMediaSession = this.iSession;
        if (this.released) {
            return;
        }
        this.released = true;
        this.connectedToken = null;
        this.fallbackPlaybackInfoUpdateHandler.removeCallbacksAndMessages(null);
        this.flushCommandQueueHandler.release();
        this.iSession = null;
        if (iMediaSession != null) {
            int obtainNextSequenceNumber = this.sequencedFutureManager.obtainNextSequenceNumber();
            try {
                iMediaSession.asBinder().unlinkToDeath(this.deathRecipient, 0);
                iMediaSession.release(this.controllerStub, obtainNextSequenceNumber);
            } catch (RemoteException unused) {
            }
        }
        this.listeners.release();
        this.sequencedFutureManager.lazyRelease(30000L, new Runnable() { // from class: androidx.media3.session.W0
            @Override // java.lang.Runnable
            public final void run() {
                MediaControllerImplBase.this.lambda$release$4();
            }
        });
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void removeListener(Player.Listener listener) {
        this.listeners.remove(listener);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void removeMediaItem(final int i) {
        if (isPlayerCommandAvailable(20)) {
            Assertions.checkArgument(i >= 0);
            dispatchRemoteSessionTaskWithPlayerCommand(new RemoteSessionTask() { // from class: androidx.media3.session.d1
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(IMediaSession iMediaSession, int i2) {
                    MediaControllerImplBase.this.lambda$removeMediaItem$34(i, iMediaSession, i2);
                }
            });
            removeMediaItemsInternal(i, i + 1);
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void removeMediaItems(final int i, final int i2) {
        if (isPlayerCommandAvailable(20)) {
            Assertions.checkArgument(i >= 0 && i2 >= i);
            dispatchRemoteSessionTaskWithPlayerCommand(new RemoteSessionTask() { // from class: androidx.media3.session.n0
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(IMediaSession iMediaSession, int i3) {
                    MediaControllerImplBase.this.lambda$removeMediaItems$35(i, i2, iMediaSession, i3);
                }
            });
            removeMediaItemsInternal(i, i2);
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void replaceMediaItem(final int i, final MediaItem mediaItem) {
        if (isPlayerCommandAvailable(20)) {
            Assertions.checkArgument(i >= 0);
            dispatchRemoteSessionTaskWithPlayerCommand(new RemoteSessionTask() { // from class: androidx.media3.session.W
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(IMediaSession iMediaSession, int i2) {
                    MediaControllerImplBase.this.lambda$replaceMediaItem$39(i, mediaItem, iMediaSession, i2);
                }
            });
            replaceMediaItemsInternal(i, i + 1, com.google.common.collect.G.n(mediaItem));
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void replaceMediaItems(final int i, final int i2, final List<MediaItem> list) {
        if (isPlayerCommandAvailable(20)) {
            Assertions.checkArgument(i >= 0 && i <= i2);
            dispatchRemoteSessionTaskWithPlayerCommand(new RemoteSessionTask() { // from class: androidx.media3.session.q1
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(IMediaSession iMediaSession, int i3) {
                    MediaControllerImplBase.this.lambda$replaceMediaItems$40(list, i, i2, iMediaSession, i3);
                }
            });
            replaceMediaItemsInternal(i, i2, list);
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekBack() {
        if (isPlayerCommandAvailable(11)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new C0538m1(this));
            seekToInternalByOffset(-getSeekBackIncrement());
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekForward() {
        if (isPlayerCommandAvailable(12)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new RemoteSessionTask() { // from class: androidx.media3.session.d0
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(IMediaSession iMediaSession, int i) {
                    MediaControllerImplBase.this.lambda$seekForward$13(iMediaSession, i);
                }
            });
            seekToInternalByOffset(getSeekForwardIncrement());
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekTo(final long j) {
        if (isPlayerCommandAvailable(5)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new RemoteSessionTask() { // from class: androidx.media3.session.b0
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(IMediaSession iMediaSession, int i) {
                    MediaControllerImplBase.this.lambda$seekTo$10(j, iMediaSession, i);
                }
            });
            seekToInternal(getCurrentMediaItemIndex(), j);
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekToDefaultPosition() {
        if (isPlayerCommandAvailable(4)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new RemoteSessionTask() { // from class: androidx.media3.session.m0
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(IMediaSession iMediaSession, int i) {
                    MediaControllerImplBase.this.lambda$seekToDefaultPosition$8(iMediaSession, i);
                }
            });
            seekToInternal(getCurrentMediaItemIndex(), -9223372036854775807L);
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekToNext() {
        if (isPlayerCommandAvailable(9)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new O(this));
            Timeline currentTimeline = getCurrentTimeline();
            if (currentTimeline.isEmpty() || isPlayingAd()) {
                return;
            }
            if (hasNextMediaItem()) {
                seekToInternal(getNextMediaItemIndex(), -9223372036854775807L);
                return;
            }
            Timeline.Window window = currentTimeline.getWindow(getCurrentMediaItemIndex(), new Timeline.Window());
            if (window.isDynamic && window.isLive()) {
                seekToInternal(getCurrentMediaItemIndex(), -9223372036854775807L);
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekToNextMediaItem() {
        if (isPlayerCommandAvailable(8)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new H(this));
            if (getNextMediaItemIndex() != -1) {
                seekToInternal(getNextMediaItemIndex(), -9223372036854775807L);
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekToPrevious() {
        if (isPlayerCommandAvailable(7)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new RemoteSessionTask() { // from class: androidx.media3.session.e1
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(IMediaSession iMediaSession, int i) {
                    MediaControllerImplBase.this.lambda$seekToPrevious$43(iMediaSession, i);
                }
            });
            Timeline currentTimeline = getCurrentTimeline();
            if (currentTimeline.isEmpty() || isPlayingAd()) {
                return;
            }
            boolean hasPreviousMediaItem = hasPreviousMediaItem();
            Timeline.Window window = currentTimeline.getWindow(getCurrentMediaItemIndex(), new Timeline.Window());
            if (window.isDynamic && window.isLive()) {
                if (hasPreviousMediaItem) {
                    seekToInternal(getPreviousMediaItemIndex(), -9223372036854775807L);
                }
            } else if (!hasPreviousMediaItem || getCurrentPosition() > getMaxSeekToPreviousPosition()) {
                seekToInternal(getCurrentMediaItemIndex(), 0L);
            } else {
                seekToInternal(getPreviousMediaItemIndex(), -9223372036854775807L);
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekToPreviousMediaItem() {
        if (isPlayerCommandAvailable(6)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new K0(this));
            if (getPreviousMediaItemIndex() != -1) {
                seekToInternal(getPreviousMediaItemIndex(), -9223372036854775807L);
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public com.google.common.util.concurrent.u<SessionResult> sendCustomCommand(final SessionCommand sessionCommand, final Bundle bundle) {
        return dispatchRemoteSessionTaskWithSessionCommand(sessionCommand, new RemoteSessionTask() { // from class: androidx.media3.session.l0
            @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
            public final void run(IMediaSession iMediaSession, int i) {
                MediaControllerImplBase.this.lambda$sendCustomCommand$21(sessionCommand, bundle, iMediaSession, i);
            }
        });
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setAudioAttributes(final AudioAttributes audioAttributes, final boolean z) {
        if (isPlayerCommandAvailable(35)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new RemoteSessionTask() { // from class: androidx.media3.session.T
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(IMediaSession iMediaSession, int i) {
                    MediaControllerImplBase.this.lambda$setAudioAttributes$67(audioAttributes, z, iMediaSession, i);
                }
            });
            if (this.playerInfo.audioAttributes.equals(audioAttributes)) {
                return;
            }
            this.playerInfo = this.playerInfo.copyWithAudioAttributes(audioAttributes);
            this.listeners.queueEvent(20, new V(audioAttributes));
            this.listeners.flushEvents();
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    @Deprecated
    public void setDeviceMuted(final boolean z) {
        if (isPlayerCommandAvailable(26)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new RemoteSessionTask() { // from class: androidx.media3.session.C1
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(IMediaSession iMediaSession, int i) {
                    MediaControllerImplBase.this.lambda$setDeviceMuted$63(z, iMediaSession, i);
                }
            });
            PlayerInfo playerInfo = this.playerInfo;
            if (playerInfo.deviceMuted != z) {
                this.playerInfo = playerInfo.copyWithDeviceVolume(playerInfo.deviceVolume, z);
                this.listeners.queueEvent(30, new ListenerSet.Event() { // from class: androidx.media3.session.D1
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(Object obj) {
                        MediaControllerImplBase.this.lambda$setDeviceMuted$64(z, (Player.Listener) obj);
                    }
                });
                this.listeners.flushEvents();
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    @Deprecated
    public void setDeviceVolume(final int i) {
        if (isPlayerCommandAvailable(25)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new RemoteSessionTask() { // from class: androidx.media3.session.J
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(IMediaSession iMediaSession, int i2) {
                    MediaControllerImplBase.this.lambda$setDeviceVolume$51(i, iMediaSession, i2);
                }
            });
            DeviceInfo deviceInfo = getDeviceInfo();
            PlayerInfo playerInfo = this.playerInfo;
            if (playerInfo.deviceVolume == i || deviceInfo.minVolume > i) {
                return;
            }
            int i2 = deviceInfo.maxVolume;
            if (i2 == 0 || i <= i2) {
                this.playerInfo = playerInfo.copyWithDeviceVolume(i, playerInfo.deviceMuted);
                this.listeners.queueEvent(30, new ListenerSet.Event() { // from class: androidx.media3.session.K
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(Object obj) {
                        MediaControllerImplBase.this.lambda$setDeviceVolume$52(i, (Player.Listener) obj);
                    }
                });
                this.listeners.flushEvents();
            }
        }
    }

    public <T> void setFutureResult(final int i, T t) {
        this.sequencedFutureManager.setFutureResult(i, t);
        getInstance().runOnApplicationLooper(new Runnable() { // from class: androidx.media3.session.t1
            @Override // java.lang.Runnable
            public final void run() {
                MediaControllerImplBase.this.lambda$setFutureResult$106(i);
            }
        });
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setMediaItem(final MediaItem mediaItem) {
        if (isPlayerCommandAvailable(31)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new RemoteSessionTask() { // from class: androidx.media3.session.h0
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(IMediaSession iMediaSession, int i) {
                    MediaControllerImplBase.this.lambda$setMediaItem$22(mediaItem, iMediaSession, i);
                }
            });
            setMediaItemsInternal(Collections.singletonList(mediaItem), -1, -9223372036854775807L, true);
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setMediaItems(final List<MediaItem> list) {
        if (isPlayerCommandAvailable(20)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new RemoteSessionTask() { // from class: androidx.media3.session.f0
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(IMediaSession iMediaSession, int i) {
                    MediaControllerImplBase.this.lambda$setMediaItems$25(list, iMediaSession, i);
                }
            });
            setMediaItemsInternal(list, -1, -9223372036854775807L, true);
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setPlayWhenReady(final boolean z) {
        if (isPlayerCommandAvailable(1)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new RemoteSessionTask() { // from class: androidx.media3.session.C
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(IMediaSession iMediaSession, int i) {
                    MediaControllerImplBase.this.lambda$setPlayWhenReady$14(z, iMediaSession, i);
                }
            });
            setPlayWhenReady(z, 1);
        } else if (z) {
            Log.w(TAG, "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        if (isPlayerCommandAvailable(13)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new C0539m2(this, playbackParameters));
            if (this.playerInfo.playbackParameters.equals(playbackParameters)) {
                return;
            }
            this.playerInfo = this.playerInfo.copyWithPlaybackParameters(playbackParameters);
            this.listeners.queueEvent(12, new C0455a0(playbackParameters));
            this.listeners.flushEvents();
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setPlaybackSpeed(final float f) {
        if (isPlayerCommandAvailable(13)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new RemoteSessionTask() { // from class: androidx.media3.session.T0
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(IMediaSession iMediaSession, int i) {
                    MediaControllerImplBase.this.lambda$setPlaybackSpeed$17(f, iMediaSession, i);
                }
            });
            PlaybackParameters playbackParameters = this.playerInfo.playbackParameters;
            if (playbackParameters.speed != f) {
                PlaybackParameters withSpeed = playbackParameters.withSpeed(f);
                this.playerInfo = this.playerInfo.copyWithPlaybackParameters(withSpeed);
                this.listeners.queueEvent(12, new U0(withSpeed));
                this.listeners.flushEvents();
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setPlaylistMetadata(MediaMetadata mediaMetadata) {
        if (isPlayerCommandAvailable(19)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new C0483e0(this, mediaMetadata));
            if (this.playerInfo.playlistMetadata.equals(mediaMetadata)) {
                return;
            }
            this.playerInfo = this.playerInfo.copyWithPlaylistMetadata(mediaMetadata);
            this.listeners.queueEvent(15, new C0497g0(mediaMetadata));
            this.listeners.flushEvents();
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public com.google.common.util.concurrent.u<SessionResult> setRating(final String str, final Rating rating) {
        return dispatchRemoteSessionTaskWithSessionCommand(SessionCommand.COMMAND_CODE_SESSION_SET_RATING, new RemoteSessionTask() { // from class: androidx.media3.session.i0
            @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
            public final void run(IMediaSession iMediaSession, int i) {
                MediaControllerImplBase.this.lambda$setRating$19(str, rating, iMediaSession, i);
            }
        });
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setRepeatMode(final int i) {
        if (isPlayerCommandAvailable(15)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new RemoteSessionTask() { // from class: androidx.media3.session.E
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(IMediaSession iMediaSession, int i2) {
                    MediaControllerImplBase.this.lambda$setRepeatMode$45(i, iMediaSession, i2);
                }
            });
            PlayerInfo playerInfo = this.playerInfo;
            if (playerInfo.repeatMode != i) {
                this.playerInfo = playerInfo.copyWithRepeatMode(i);
                this.listeners.queueEvent(8, new ListenerSet.Event() { // from class: androidx.media3.session.F
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(Object obj) {
                        ((Player.Listener) obj).onRepeatModeChanged(i);
                    }
                });
                this.listeners.flushEvents();
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setShuffleModeEnabled(final boolean z) {
        if (isPlayerCommandAvailable(14)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new RemoteSessionTask() { // from class: androidx.media3.session.a1
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(IMediaSession iMediaSession, int i) {
                    MediaControllerImplBase.this.lambda$setShuffleModeEnabled$47(z, iMediaSession, i);
                }
            });
            PlayerInfo playerInfo = this.playerInfo;
            if (playerInfo.shuffleModeEnabled != z) {
                this.playerInfo = playerInfo.copyWithShuffleModeEnabled(z);
                this.listeners.queueEvent(9, new ListenerSet.Event() { // from class: androidx.media3.session.b1
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(Object obj) {
                        ((Player.Listener) obj).onShuffleModeEnabledChanged(z);
                    }
                });
                this.listeners.flushEvents();
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setTrackSelectionParameters(final TrackSelectionParameters trackSelectionParameters) {
        if (isPlayerCommandAvailable(29)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new RemoteSessionTask() { // from class: androidx.media3.session.N
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(IMediaSession iMediaSession, int i) {
                    MediaControllerImplBase.this.lambda$setTrackSelectionParameters$75(trackSelectionParameters, iMediaSession, i);
                }
            });
            PlayerInfo playerInfo = this.playerInfo;
            if (trackSelectionParameters != playerInfo.trackSelectionParameters) {
                this.playerInfo = playerInfo.copyWithTrackSelectionParameters(trackSelectionParameters);
                this.listeners.queueEvent(19, new O(trackSelectionParameters));
                this.listeners.flushEvents();
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setVideoSurface(@Nullable Surface surface) {
        if (isPlayerCommandAvailable(27)) {
            clearSurfacesAndCallbacks();
            this.videoSurface = surface;
            dispatchRemoteSessionTaskWithPlayerCommandAndWaitForFuture(new U(this, surface));
            int i = surface == null ? 0 : -1;
            maybeNotifySurfaceSizeChanged(i, i);
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder) {
        if (isPlayerCommandAvailable(27)) {
            if (surfaceHolder == null) {
                clearVideoSurface();
                return;
            }
            if (this.videoSurfaceHolder == surfaceHolder) {
                return;
            }
            clearSurfacesAndCallbacks();
            this.videoSurfaceHolder = surfaceHolder;
            surfaceHolder.addCallback(this.surfaceCallback);
            final Surface surface = surfaceHolder.getSurface();
            if (surface == null || !surface.isValid()) {
                this.videoSurface = null;
                dispatchRemoteSessionTaskWithPlayerCommandAndWaitForFuture(new C0525k0(this));
                maybeNotifySurfaceSizeChanged(0, 0);
            } else {
                this.videoSurface = surface;
                dispatchRemoteSessionTaskWithPlayerCommandAndWaitForFuture(new RemoteSessionTask() { // from class: androidx.media3.session.j0
                    @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                    public final void run(IMediaSession iMediaSession, int i) {
                        MediaControllerImplBase.this.lambda$setVideoSurfaceHolder$71(surface, iMediaSession, i);
                    }
                });
                Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
                maybeNotifySurfaceSizeChanged(surfaceFrame.width(), surfaceFrame.height());
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setVideoSurfaceView(@Nullable SurfaceView surfaceView) {
        if (isPlayerCommandAvailable(27)) {
            setVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setVideoTextureView(@Nullable TextureView textureView) {
        if (isPlayerCommandAvailable(27)) {
            if (textureView == null) {
                clearVideoSurface();
                return;
            }
            if (this.videoTextureView == textureView) {
                return;
            }
            clearSurfacesAndCallbacks();
            this.videoTextureView = textureView;
            textureView.setSurfaceTextureListener(this.surfaceCallback);
            SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
            if (surfaceTexture == null) {
                dispatchRemoteSessionTaskWithPlayerCommandAndWaitForFuture(new RemoteSessionTask() { // from class: androidx.media3.session.Q
                    @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                    public final void run(IMediaSession iMediaSession, int i) {
                        MediaControllerImplBase.this.lambda$setVideoTextureView$73(iMediaSession, i);
                    }
                });
                maybeNotifySurfaceSizeChanged(0, 0);
            } else {
                this.videoSurface = new Surface(surfaceTexture);
                dispatchRemoteSessionTaskWithPlayerCommandAndWaitForFuture(new RemoteSessionTask() { // from class: androidx.media3.session.S
                    @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                    public final void run(IMediaSession iMediaSession, int i) {
                        MediaControllerImplBase.this.lambda$setVideoTextureView$74(iMediaSession, i);
                    }
                });
                maybeNotifySurfaceSizeChanged(textureView.getWidth(), textureView.getHeight());
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setVolume(final float f) {
        if (isPlayerCommandAvailable(24)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new RemoteSessionTask() { // from class: androidx.media3.session.E1
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(IMediaSession iMediaSession, int i) {
                    MediaControllerImplBase.this.lambda$setVolume$49(f, iMediaSession, i);
                }
            });
            PlayerInfo playerInfo = this.playerInfo;
            if (playerInfo.volume != f) {
                this.playerInfo = playerInfo.copyWithVolume(f);
                this.listeners.queueEvent(22, new F1(f));
                this.listeners.flushEvents();
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void stop() {
        if (isPlayerCommandAvailable(3)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new RemoteSessionTask() { // from class: androidx.media3.session.y1
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(IMediaSession iMediaSession, int i) {
                    MediaControllerImplBase.this.lambda$stop$2(iMediaSession, i);
                }
            });
            PlayerInfo playerInfo = this.playerInfo;
            SessionPositionInfo sessionPositionInfo = this.playerInfo.sessionPositionInfo;
            Player.PositionInfo positionInfo = sessionPositionInfo.positionInfo;
            boolean z = sessionPositionInfo.isPlayingAd;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            SessionPositionInfo sessionPositionInfo2 = this.playerInfo.sessionPositionInfo;
            long j = sessionPositionInfo2.durationMs;
            long j2 = sessionPositionInfo2.positionInfo.positionMs;
            int calculateBufferedPercentage = MediaUtils.calculateBufferedPercentage(j2, j);
            SessionPositionInfo sessionPositionInfo3 = this.playerInfo.sessionPositionInfo;
            PlayerInfo copyWithSessionPositionInfo = playerInfo.copyWithSessionPositionInfo(new SessionPositionInfo(positionInfo, z, elapsedRealtime, j, j2, calculateBufferedPercentage, 0L, sessionPositionInfo3.currentLiveOffsetMs, sessionPositionInfo3.contentDurationMs, sessionPositionInfo3.positionInfo.positionMs));
            this.playerInfo = copyWithSessionPositionInfo;
            if (copyWithSessionPositionInfo.playbackState != 1) {
                this.playerInfo = copyWithSessionPositionInfo.copyWithPlaybackState(1, copyWithSessionPositionInfo.playerError);
                this.listeners.queueEvent(4, new C0616z1());
                this.listeners.flushEvents();
            }
        }
    }

    private com.google.common.util.concurrent.u<SessionResult> dispatchRemoteSessionTaskWithSessionCommand(SessionCommand sessionCommand, RemoteSessionTask remoteSessionTask) {
        return dispatchRemoteSessionTaskWithSessionCommandInternal(0, sessionCommand, remoteSessionTask);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public com.google.common.util.concurrent.u<SessionResult> setRating(final Rating rating) {
        return dispatchRemoteSessionTaskWithSessionCommand(SessionCommand.COMMAND_CODE_SESSION_SET_RATING, new RemoteSessionTask() { // from class: androidx.media3.session.P
            @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
            public final void run(IMediaSession iMediaSession, int i) {
                MediaControllerImplBase.this.lambda$setRating$20(rating, iMediaSession, i);
            }
        });
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void addMediaItems(final int i, final List<MediaItem> list) {
        if (isPlayerCommandAvailable(20)) {
            Assertions.checkArgument(i >= 0);
            dispatchRemoteSessionTaskWithPlayerCommand(new RemoteSessionTask() { // from class: androidx.media3.session.o1
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(IMediaSession iMediaSession, int i2) {
                    this.lambda$addMediaItems$33(i, list, iMediaSession, i2);
                }
            });
            addMediaItemsInternal(i, list);
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekTo(final int i, final long j) {
        if (isPlayerCommandAvailable(10)) {
            Assertions.checkArgument(i >= 0);
            dispatchRemoteSessionTaskWithPlayerCommand(new RemoteSessionTask() { // from class: androidx.media3.session.u1
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(IMediaSession iMediaSession, int i2) {
                    MediaControllerImplBase.this.lambda$seekTo$11(i, j, iMediaSession, i2);
                }
            });
            seekToInternal(i, j);
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekToDefaultPosition(final int i) {
        if (isPlayerCommandAvailable(10)) {
            Assertions.checkArgument(i >= 0);
            dispatchRemoteSessionTaskWithPlayerCommand(new RemoteSessionTask() { // from class: androidx.media3.session.x
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(IMediaSession iMediaSession, int i2) {
                    MediaControllerImplBase.this.lambda$seekToDefaultPosition$9(i, iMediaSession, i2);
                }
            });
            seekToInternal(i, -9223372036854775807L);
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setMediaItems(final List<MediaItem> list, final boolean z) {
        if (isPlayerCommandAvailable(20)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new RemoteSessionTask() { // from class: androidx.media3.session.f1
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(IMediaSession iMediaSession, int i) {
                    MediaControllerImplBase.this.lambda$setMediaItems$26(list, z, iMediaSession, i);
                }
            });
            setMediaItemsInternal(list, -1, -9223372036854775807L, z);
        }
    }

    private void setPlayWhenReady(boolean z, int i) {
        int playbackSuppressionReason = getPlaybackSuppressionReason();
        if (playbackSuppressionReason == 1) {
            playbackSuppressionReason = 0;
        }
        PlayerInfo playerInfo = this.playerInfo;
        if (playerInfo.playWhenReady == z && playerInfo.playbackSuppressionReason == playbackSuppressionReason) {
            return;
        }
        this.currentPositionMs = MediaUtils.getUpdatedCurrentPositionMs(playerInfo, this.currentPositionMs, this.lastSetPlayWhenReadyCalledTimeMs, getInstance().getTimeDiffMs());
        this.lastSetPlayWhenReadyCalledTimeMs = SystemClock.elapsedRealtime();
        updatePlayerInfo(this.playerInfo.copyWithPlayWhenReady(z, i, playbackSuppressionReason), null, Integer.valueOf(i), null, null);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void addMediaItem(final int i, final MediaItem mediaItem) {
        if (isPlayerCommandAvailable(20)) {
            Assertions.checkArgument(i >= 0);
            dispatchRemoteSessionTaskWithPlayerCommand(new RemoteSessionTask() { // from class: androidx.media3.session.I1
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(IMediaSession iMediaSession, int i2) {
                    MediaControllerImplBase.this.lambda$addMediaItem$31(i, mediaItem, iMediaSession, i2);
                }
            });
            addMediaItemsInternal(i, Collections.singletonList(mediaItem));
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void clearVideoSurface(@Nullable Surface surface) {
        if (isPlayerCommandAvailable(27) && surface != null && this.videoSurface == surface) {
            clearVideoSurface();
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setMediaItem(final MediaItem mediaItem, final long j) {
        if (isPlayerCommandAvailable(31)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new RemoteSessionTask() { // from class: androidx.media3.session.V0
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(IMediaSession iMediaSession, int i) {
                    MediaControllerImplBase.this.lambda$setMediaItem$23(mediaItem, j, iMediaSession, i);
                }
            });
            setMediaItemsInternal(Collections.singletonList(mediaItem), -1, j, false);
        }
    }

    private static PlayerInfo maskTimelineAndPositionInfo(PlayerInfo playerInfo, Timeline timeline, Player.PositionInfo positionInfo, SessionPositionInfo sessionPositionInfo, int i) {
        return new PlayerInfo.Builder(playerInfo).setTimeline(timeline).setOldPositionInfo(playerInfo.sessionPositionInfo.positionInfo).setNewPositionInfo(positionInfo).setSessionPositionInfo(sessionPositionInfo).setDiscontinuityReason(i).build();
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setDeviceMuted(final boolean z, final int i) {
        if (isPlayerCommandAvailable(34)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new RemoteSessionTask() { // from class: androidx.media3.session.X0
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(IMediaSession iMediaSession, int i2) {
                    MediaControllerImplBase.this.lambda$setDeviceMuted$65(z, i, iMediaSession, i2);
                }
            });
            PlayerInfo playerInfo = this.playerInfo;
            if (playerInfo.deviceMuted != z) {
                this.playerInfo = playerInfo.copyWithDeviceVolume(playerInfo.deviceVolume, z);
                this.listeners.queueEvent(30, new ListenerSet.Event() { // from class: androidx.media3.session.Y0
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(Object obj) {
                        MediaControllerImplBase.this.lambda$setDeviceMuted$66(z, (Player.Listener) obj);
                    }
                });
                this.listeners.flushEvents();
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setMediaItems(final List<MediaItem> list, final int i, final long j) {
        if (isPlayerCommandAvailable(20)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new RemoteSessionTask() { // from class: androidx.media3.session.I
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(IMediaSession iMediaSession, int i2) {
                    MediaControllerImplBase.this.lambda$setMediaItems$27(list, i, j, iMediaSession, i2);
                }
            });
            setMediaItemsInternal(list, i, j, false);
        }
    }

    @Nullable
    private static PeriodInfo getPeriodInfo(Timeline timeline, Timeline.Window window, Timeline.Period period, int i, long j) {
        Assertions.checkIndex(i, 0, timeline.getWindowCount());
        timeline.getWindow(i, window);
        if (j == -9223372036854775807L) {
            j = window.getDefaultPositionUs();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = window.firstPeriodIndex;
        timeline.getPeriod(i2, period);
        while (i2 < window.lastPeriodIndex && period.positionInWindowUs != j) {
            int i3 = i2 + 1;
            if (timeline.getPeriod(i3, period).positionInWindowUs > j) {
                break;
            }
            i2 = i3;
        }
        timeline.getPeriod(i2, period);
        return new PeriodInfo(i2, j - period.positionInWindowUs);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void decreaseDeviceVolume(int i) {
        if (isPlayerCommandAvailable(34)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new Y(this, i));
            final int i2 = this.playerInfo.deviceVolume - 1;
            if (i2 >= getDeviceInfo().minVolume) {
                PlayerInfo playerInfo = this.playerInfo;
                this.playerInfo = playerInfo.copyWithDeviceVolume(i2, playerInfo.deviceMuted);
                this.listeners.queueEvent(30, new ListenerSet.Event() { // from class: androidx.media3.session.Z
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(Object obj) {
                        MediaControllerImplBase.this.lambda$decreaseDeviceVolume$62(i2, (Player.Listener) obj);
                    }
                });
                this.listeners.flushEvents();
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void increaseDeviceVolume(final int i) {
        if (isPlayerCommandAvailable(34)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new RemoteSessionTask() { // from class: androidx.media3.session.v1
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(IMediaSession iMediaSession, int i2) {
                    MediaControllerImplBase.this.lambda$increaseDeviceVolume$57(i, iMediaSession, i2);
                }
            });
            final int i2 = this.playerInfo.deviceVolume + 1;
            int i3 = getDeviceInfo().maxVolume;
            if (i3 == 0 || i2 <= i3) {
                PlayerInfo playerInfo = this.playerInfo;
                this.playerInfo = playerInfo.copyWithDeviceVolume(i2, playerInfo.deviceMuted);
                this.listeners.queueEvent(30, new ListenerSet.Event() { // from class: androidx.media3.session.w1
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(Object obj) {
                        MediaControllerImplBase.this.lambda$increaseDeviceVolume$58(i2, (Player.Listener) obj);
                    }
                });
                this.listeners.flushEvents();
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setDeviceVolume(final int i, final int i2) {
        if (isPlayerCommandAvailable(33)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new RemoteSessionTask() { // from class: androidx.media3.session.R0
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(IMediaSession iMediaSession, int i3) {
                    MediaControllerImplBase.this.lambda$setDeviceVolume$53(i, i2, iMediaSession, i3);
                }
            });
            DeviceInfo deviceInfo = getDeviceInfo();
            PlayerInfo playerInfo = this.playerInfo;
            if (playerInfo.deviceVolume == i || deviceInfo.minVolume > i) {
                return;
            }
            int i3 = deviceInfo.maxVolume;
            if (i3 == 0 || i <= i3) {
                this.playerInfo = playerInfo.copyWithDeviceVolume(i, playerInfo.deviceMuted);
                this.listeners.queueEvent(30, new ListenerSet.Event() { // from class: androidx.media3.session.S0
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(Object obj) {
                        MediaControllerImplBase.this.lambda$setDeviceVolume$54(i, (Player.Listener) obj);
                    }
                });
                this.listeners.flushEvents();
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setMediaItem(final MediaItem mediaItem, final boolean z) {
        if (isPlayerCommandAvailable(31)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new RemoteSessionTask() { // from class: androidx.media3.session.G
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(IMediaSession iMediaSession, int i) {
                    MediaControllerImplBase.this.lambda$setMediaItem$24(mediaItem, z, iMediaSession, i);
                }
            });
            setMediaItemsInternal(Collections.singletonList(mediaItem), -1, -9223372036854775807L, z);
        }
    }

    @Nullable
    public IMediaSession getSessionInterfaceWithSessionCommandIfAble(SessionCommand sessionCommand) {
        Assertions.checkArgument(sessionCommand.commandCode == 0);
        if (!this.sessionCommands.contains(sessionCommand)) {
            Log.w(TAG, "Controller isn't allowed to call custom session command:" + sessionCommand.customAction);
            return null;
        }
        return this.iSession;
    }
}
