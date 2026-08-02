package androidx.media3.session;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import androidx.annotation.CallSuper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.session.DefaultMediaNotificationProvider;
import androidx.media3.session.IMediaSessionService;
import androidx.media3.session.MediaNotification;
import androidx.media3.session.MediaSession;
import androidx.media3.session.MediaSessionService;
import androidx.media3.session.MediaSessionStub;
import androidx.media3.session.legacy.MediaSessionManager;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class MediaSessionService extends Service {

    @UnstableApi
    public static final long DEFAULT_FOREGROUND_SERVICE_TIMEOUT_MS = 600000;
    public static final String SERVICE_INTERFACE = "androidx.media3.session.MediaSessionService";

    @UnstableApi
    public static final int SHOW_NOTIFICATION_FOR_IDLE_PLAYER_AFTER_STOP_OR_ERROR = 3;

    @UnstableApi
    public static final int SHOW_NOTIFICATION_FOR_IDLE_PLAYER_ALWAYS = 1;

    @UnstableApi
    public static final int SHOW_NOTIFICATION_FOR_IDLE_PLAYER_NEVER = 2;
    private static final String TAG = "MSessionService";
    private DefaultActionFactory actionFactory;

    @Nullable
    @GuardedBy("lock")
    private Listener listener;
    private MediaNotificationManager mediaNotificationManager;

    @Nullable
    private MediaSessionServiceStub stub;
    private final Object lock = new Object();
    private final Handler mainHandler = new Handler(Looper.getMainLooper());

    @GuardedBy("lock")
    private final Map<String, MediaSession> sessions = new ArrayMap();
    private boolean defaultMethodCalled = false;

    @RequiresApi(31)
    public static final class Api31 {
        private Api31() {
        }

        public static boolean instanceOfForegroundServiceStartNotAllowedException(IllegalStateException illegalStateException) {
            return androidx.media.session.c.b(illegalStateException);
        }
    }

    @UnstableApi
    public interface Listener {
        @RequiresApi(31)
        default void onForegroundServiceStartNotAllowedException() {
        }
    }

    public final class MediaSessionListener implements MediaSession.Listener {
        private MediaSessionListener() {
        }

        @Override // androidx.media3.session.MediaSession.Listener
        public void onNotificationRefreshRequired(MediaSession mediaSession) {
            MediaSessionService.this.onUpdateNotificationInternal(mediaSession, false);
        }

        @Override // androidx.media3.session.MediaSession.Listener
        public boolean onPlayRequested(MediaSession mediaSession) {
            int i = Build.VERSION.SDK_INT;
            if (i < 31 || i >= 33 || MediaSessionService.this.getMediaNotificationManager().isStartedInForeground()) {
                return true;
            }
            return MediaSessionService.this.onUpdateNotificationInternal(mediaSession, true);
        }
    }

    public static final class MediaSessionServiceStub extends IMediaSessionService.Stub {
        private final Handler handler;
        private final Set<IMediaController> pendingControllers = Collections.synchronizedSet(new HashSet());
        private final WeakReference<MediaSessionService> serviceReference;

        public MediaSessionServiceStub(MediaSessionService mediaSessionService) {
            this.serviceReference = new WeakReference<>(mediaSessionService);
            this.handler = new Handler(mediaSessionService.getApplicationContext().getMainLooper());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$connect$0(IMediaController iMediaController, MediaSessionManager.RemoteUserInfo remoteUserInfo, ConnectionRequest connectionRequest, boolean z) {
            this.pendingControllers.remove(iMediaController);
            try {
                try {
                    MediaSessionService mediaSessionService = this.serviceReference.get();
                    if (mediaSessionService == null) {
                        SessionUtil.disconnectIMediaController(iMediaController);
                        return;
                    }
                    int i = connectionRequest.libraryVersion;
                    int i2 = connectionRequest.controllerInterfaceVersion;
                    MediaSession.ControllerInfo controllerInfo = new MediaSession.ControllerInfo(remoteUserInfo, i, i2, z, new MediaSessionStub.Controller2Cb(iMediaController, i2), connectionRequest.connectionHints, connectionRequest.maxCommandsForMediaItems);
                    MediaSession onGetSession = mediaSessionService.onGetSession(controllerInfo);
                    if (onGetSession == null) {
                        SessionUtil.disconnectIMediaController(iMediaController);
                    } else {
                        mediaSessionService.addSession(onGetSession);
                        onGetSession.handleControllerConnectionFromService(iMediaController, controllerInfo);
                    }
                } catch (Exception e) {
                    Log.w(MediaSessionService.TAG, "Failed to add a session to session service", e);
                    SessionUtil.disconnectIMediaController(iMediaController);
                }
            } catch (Throwable th) {
                SessionUtil.disconnectIMediaController(iMediaController);
                throw th;
            }
        }

        @Override // androidx.media3.session.IMediaSessionService
        public void connect(@Nullable final IMediaController iMediaController, @Nullable Bundle bundle) {
            if (iMediaController == null || bundle == null) {
                SessionUtil.disconnectIMediaController(iMediaController);
                return;
            }
            try {
                final ConnectionRequest fromBundle = ConnectionRequest.fromBundle(bundle);
                MediaSessionService mediaSessionService = this.serviceReference.get();
                if (mediaSessionService == null) {
                    SessionUtil.disconnectIMediaController(iMediaController);
                    return;
                }
                int callingPid = Binder.getCallingPid();
                int callingUid = Binder.getCallingUid();
                long clearCallingIdentity = Binder.clearCallingIdentity();
                if (callingPid == 0) {
                    callingPid = fromBundle.pid;
                }
                final MediaSessionManager.RemoteUserInfo remoteUserInfo = new MediaSessionManager.RemoteUserInfo(fromBundle.packageName, callingPid, callingUid);
                final boolean isTrustedForMediaControl = MediaSessionManager.getSessionManager(mediaSessionService.getApplicationContext()).isTrustedForMediaControl(remoteUserInfo);
                this.pendingControllers.add(iMediaController);
                try {
                    this.handler.post(new Runnable() { // from class: androidx.media3.session.r4
                        @Override // java.lang.Runnable
                        public final void run() {
                            MediaSessionService.MediaSessionServiceStub.this.lambda$connect$0(iMediaController, remoteUserInfo, fromBundle, isTrustedForMediaControl);
                        }
                    });
                } finally {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            } catch (RuntimeException e) {
                Log.w(MediaSessionService.TAG, "Ignoring malformed Bundle for ConnectionRequest", e);
                SessionUtil.disconnectIMediaController(iMediaController);
            }
        }

        public void release() {
            this.serviceReference.clear();
            this.handler.removeCallbacksAndMessages(null);
            Iterator<IMediaController> it = this.pendingControllers.iterator();
            while (it.hasNext()) {
                SessionUtil.disconnectIMediaController(it.next());
            }
            this.pendingControllers.clear();
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    public @interface ShowNotificationForIdlePlayerMode {
    }

    private static MediaSession.ControllerInfo createFallbackMediaButtonCaller(Intent intent) {
        ComponentName component = intent.getComponent();
        return new MediaSession.ControllerInfo(new MediaSessionManager.RemoteUserInfo(component != null ? component.getPackageName() : SERVICE_INTERFACE, -1, -1), MediaLibraryInfo.VERSION_INT, 7, false, null, Bundle.EMPTY, 0);
    }

    private DefaultActionFactory getActionFactory() {
        if (this.actionFactory == null) {
            this.actionFactory = new DefaultActionFactory(this);
        }
        return this.actionFactory;
    }

    @Nullable
    private Listener getListener() {
        Listener listener;
        synchronized (this.lock) {
            listener = this.listener;
        }
        return listener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MediaNotificationManager getMediaNotificationManager() {
        return getMediaNotificationManager(null);
    }

    private boolean isAnySessionPlaying() {
        List<MediaSession> sessions = getSessions();
        for (int i = 0; i < sessions.size(); i++) {
            if (sessions.get(i).getPlayer().isPlaying()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addSession$0(MediaSession mediaSession) {
        getMediaNotificationManager().addSession(mediaSession);
        mediaSession.setListener(new MediaSessionListener());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onForegroundServiceStartNotAllowedException$4() {
        Listener listener = getListener();
        if (listener != null) {
            listener.onForegroundServiceStartNotAllowedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onStartCommand$2(MediaSessionImpl mediaSessionImpl, Intent intent) {
        MediaSession.ControllerInfo mediaNotificationControllerInfo = mediaSessionImpl.getMediaNotificationControllerInfo();
        if (mediaNotificationControllerInfo == null) {
            mediaNotificationControllerInfo = createFallbackMediaButtonCaller(intent);
        }
        if (mediaSessionImpl.onMediaButtonEvent(mediaNotificationControllerInfo, intent)) {
            return;
        }
        Log.d(TAG, "Ignored unrecognized media button intent.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeSession$1(MediaSession mediaSession) {
        getMediaNotificationManager().removeSession(mediaSession);
        mediaSession.clearListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMediaNotificationProvider$3(MediaNotification.Provider provider) {
        getMediaNotificationManager(provider).setMediaNotificationProvider(provider);
    }

    @RequiresApi(31)
    private void onForegroundServiceStartNotAllowedException() {
        this.mainHandler.post(new Runnable() { // from class: androidx.media3.session.o4
            @Override // java.lang.Runnable
            public final void run() {
                MediaSessionService.this.lambda$onForegroundServiceStartNotAllowedException$4();
            }
        });
    }

    public final void addSession(final MediaSession mediaSession) {
        MediaSession mediaSession2;
        Assertions.checkNotNull(mediaSession, "session must not be null");
        boolean z = true;
        Assertions.checkArgument(!mediaSession.isReleased(), "session is already released");
        synchronized (this.lock) {
            mediaSession2 = this.sessions.get(mediaSession.getId());
            if (mediaSession2 != null && mediaSession2 != mediaSession) {
                z = false;
            }
            Assertions.checkArgument(z, "Session ID should be unique");
            this.sessions.put(mediaSession.getId(), mediaSession);
        }
        if (mediaSession2 == null) {
            Util.postOrRun(this.mainHandler, new Runnable() { // from class: androidx.media3.session.q4
                @Override // java.lang.Runnable
                public final void run() {
                    MediaSessionService.this.lambda$addSession$0(mediaSession);
                }
            });
        }
    }

    @UnstableApi
    public final void clearListener() {
        synchronized (this.lock) {
            this.listener = null;
        }
    }

    public IBinder getServiceBinder() {
        return ((MediaSessionServiceStub) Assertions.checkStateNotNull(this.stub)).asBinder();
    }

    public final List<MediaSession> getSessions() {
        ArrayList arrayList;
        synchronized (this.lock) {
            arrayList = new ArrayList(this.sessions.values());
        }
        return arrayList;
    }

    @UnstableApi
    public boolean isPlaybackOngoing() {
        return getMediaNotificationManager().isStartedInForeground();
    }

    public final boolean isSessionAdded(MediaSession mediaSession) {
        boolean containsKey;
        synchronized (this.lock) {
            containsKey = this.sessions.containsKey(mediaSession.getId());
        }
        return containsKey;
    }

    @Override // android.app.Service
    @Nullable
    @CallSuper
    public IBinder onBind(@Nullable Intent intent) {
        String action;
        MediaSession onGetSession;
        if (intent == null || (action = intent.getAction()) == null) {
            return null;
        }
        if (action.equals(SERVICE_INTERFACE)) {
            return getServiceBinder();
        }
        if (!action.equals("android.media.browse.MediaBrowserService") || (onGetSession = onGetSession(MediaSession.ControllerInfo.createLegacyControllerInfo())) == null) {
            return null;
        }
        addSession(onGetSession);
        return onGetSession.getLegacyBrowserServiceBinder();
    }

    @Override // android.app.Service
    @CallSuper
    public void onCreate() {
        super.onCreate();
        this.stub = new MediaSessionServiceStub(this);
    }

    @Override // android.app.Service
    @CallSuper
    public void onDestroy() {
        super.onDestroy();
        MediaSessionServiceStub mediaSessionServiceStub = this.stub;
        if (mediaSessionServiceStub != null) {
            mediaSessionServiceStub.release();
            this.stub = null;
        }
    }

    @Nullable
    public abstract MediaSession onGetSession(MediaSession.ControllerInfo controllerInfo);

    @Override // android.app.Service
    @CallSuper
    public int onStartCommand(@Nullable final Intent intent, int i, int i2) {
        String customAction;
        if (intent != null) {
            DefaultActionFactory actionFactory = getActionFactory();
            Uri data = intent.getData();
            MediaSession session = data != null ? MediaSession.getSession(data) : null;
            if (actionFactory.isMediaAction(intent)) {
                if (session == null) {
                    session = onGetSession(MediaSession.ControllerInfo.createLegacyControllerInfo());
                    if (session != null) {
                        addSession(session);
                    }
                }
                final MediaSessionImpl impl = session.getImpl();
                impl.getApplicationHandler().post(new Runnable() { // from class: androidx.media3.session.n4
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSessionService.lambda$onStartCommand$2(MediaSessionImpl.this, intent);
                    }
                });
                return 1;
            }
            if (session != null && actionFactory.isCustomAction(intent) && (customAction = actionFactory.getCustomAction(intent)) != null) {
                getMediaNotificationManager().onCustomAction(session, customAction, actionFactory.getCustomActionExtras(intent));
            }
        }
        return 1;
    }

    @Override // android.app.Service
    public void onTaskRemoved(@Nullable Intent intent) {
        if (isPlaybackOngoing() && isAnySessionPlaying()) {
            return;
        }
        pauseAllPlayersAndStopSelf();
    }

    @Deprecated
    public void onUpdateNotification(MediaSession mediaSession) {
        this.defaultMethodCalled = true;
    }

    public boolean onUpdateNotificationInternal(MediaSession mediaSession, boolean z) {
        try {
            onUpdateNotification(mediaSession, getMediaNotificationManager().shouldRunInForeground(z));
            return true;
        } catch (IllegalStateException e) {
            if (Build.VERSION.SDK_INT < 31 || !Api31.instanceOfForegroundServiceStartNotAllowedException(e)) {
                throw e;
            }
            Log.e(TAG, "Failed to start foreground", e);
            onForegroundServiceStartNotAllowedException();
            return false;
        }
    }

    @UnstableApi
    public void pauseAllPlayersAndStopSelf() {
        getMediaNotificationManager().disableUserEngagedTimeout();
        List<MediaSession> sessions = getSessions();
        for (int i = 0; i < sessions.size(); i++) {
            sessions.get(i).getPlayer().setPlayWhenReady(false);
        }
        stopSelf();
    }

    public final void removeSession(MediaSession mediaSession) {
        Assertions.checkNotNull(mediaSession, "session must not be null");
        synchronized (this.lock) {
            Assertions.checkArgument(this.sessions.containsKey(mediaSession.getId()), "session not found");
            this.sessions.remove(mediaSession.getId());
        }
        Util.postOrRun(this.mainHandler, new RunnableC0559p4(0, this, mediaSession));
    }

    @UnstableApi
    public final void setForegroundServiceTimeoutMs(long j) {
        getMediaNotificationManager().setUserEngagedTimeoutMs(Util.constrainValue(j, 0L, DEFAULT_FOREGROUND_SERVICE_TIMEOUT_MS));
    }

    @UnstableApi
    public final void setListener(Listener listener) {
        synchronized (this.lock) {
            this.listener = listener;
        }
    }

    @UnstableApi
    public final void setMediaNotificationProvider(MediaNotification.Provider provider) {
        Assertions.checkNotNull(provider);
        Util.postOrRun(this.mainHandler, new androidx.media3.common.audio.j(1, this, provider));
    }

    @UnstableApi
    public final void setShowNotificationForIdlePlayer(int i) {
        getMediaNotificationManager().setShowNotificationForIdlePlayer(i);
    }

    private MediaNotificationManager getMediaNotificationManager(@Nullable MediaNotification.Provider provider) {
        if (this.mediaNotificationManager == null) {
            if (provider == null) {
                Assertions.checkStateNotNull(getBaseContext(), "Accessing service context before onCreate()");
                provider = new DefaultMediaNotificationProvider.Builder(getApplicationContext()).build();
            }
            this.mediaNotificationManager = new MediaNotificationManager(this, provider, getActionFactory());
        }
        return this.mediaNotificationManager;
    }

    public void onUpdateNotification(MediaSession mediaSession, boolean z) {
        onUpdateNotification(mediaSession);
        if (this.defaultMethodCalled) {
            getMediaNotificationManager().updateNotification(mediaSession, z);
        }
    }
}
