package androidx.work.impl.foreground;

/* loaded from: classes2.dex */
public class SystemForegroundService extends androidx.lifecycle.LifecycleService implements androidx.work.impl.foreground.SystemForegroundDispatcher.Callback {
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("SystemFgService");
    private static androidx.work.impl.foreground.SystemForegroundService sForegroundService = null;
    androidx.work.impl.foreground.SystemForegroundDispatcher mDispatcher;
    private android.os.Handler mHandler;
    private boolean mIsShutdown;
    android.app.NotificationManager mNotificationManager;

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        sForegroundService = this;
        initializeDispatcher();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(android.content.Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);
        if (this.mIsShutdown) {
            androidx.work.Logger.get().info(TAG, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.mDispatcher.onDestroy();
            initializeDispatcher();
            this.mIsShutdown = false;
        }
        if (intent == null) {
            return 3;
        }
        this.mDispatcher.onStartCommand(intent);
        return 3;
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.mDispatcher.onDestroy();
    }

    private void initializeDispatcher() {
        this.mHandler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.mNotificationManager = (android.app.NotificationManager) getApplicationContext().getSystemService(com.helpshift.util.ConfigValues.SOURCE_NOTIFICATION);
        androidx.work.impl.foreground.SystemForegroundDispatcher systemForegroundDispatcher = new androidx.work.impl.foreground.SystemForegroundDispatcher(getApplicationContext());
        this.mDispatcher = systemForegroundDispatcher;
        systemForegroundDispatcher.setCallback(this);
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    public void stop() {
        this.mIsShutdown = true;
        androidx.work.Logger.get().debug(TAG, "All commands completed.");
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        sForegroundService = null;
        stopSelf();
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    public void startForeground(final int notificationId, final int notificationType, final android.app.Notification notification) {
        this.mHandler.post(new java.lang.Runnable() { // from class: androidx.work.impl.foreground.SystemForegroundService.1
            @Override // java.lang.Runnable
            public void run() {
                if (android.os.Build.VERSION.SDK_INT >= 31) {
                    androidx.work.impl.foreground.SystemForegroundService.Api31Impl.startForeground(androidx.work.impl.foreground.SystemForegroundService.this, notificationId, notification, notificationType);
                } else if (android.os.Build.VERSION.SDK_INT >= 29) {
                    androidx.work.impl.foreground.SystemForegroundService.Api29Impl.startForeground(androidx.work.impl.foreground.SystemForegroundService.this, notificationId, notification, notificationType);
                } else {
                    androidx.work.impl.foreground.SystemForegroundService.this.startForeground(notificationId, notification);
                }
            }
        });
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    public void notify(final int notificationId, final android.app.Notification notification) {
        this.mHandler.post(new java.lang.Runnable() { // from class: androidx.work.impl.foreground.SystemForegroundService.2
            @Override // java.lang.Runnable
            public void run() {
                androidx.work.impl.foreground.SystemForegroundService.this.mNotificationManager.notify(notificationId, notification);
            }
        });
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    public void cancelNotification(final int notificationId) {
        this.mHandler.post(new java.lang.Runnable() { // from class: androidx.work.impl.foreground.SystemForegroundService.3
            @Override // java.lang.Runnable
            public void run() {
                androidx.work.impl.foreground.SystemForegroundService.this.mNotificationManager.cancel(notificationId);
            }
        });
    }

    public static androidx.work.impl.foreground.SystemForegroundService getInstance() {
        return sForegroundService;
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static void startForeground(android.app.Service service, int id, android.app.Notification notification, int foregroundServiceType) {
            service.startForeground(id, notification, foregroundServiceType);
        }
    }

    static class Api31Impl {
        private Api31Impl() {
        }

        static void startForeground(android.app.Service service, int id, android.app.Notification notification, int foregroundServiceType) {
            try {
                service.startForeground(id, notification, foregroundServiceType);
            } catch (android.app.ForegroundServiceStartNotAllowedException e) {
                androidx.work.Logger.get().warning(androidx.work.impl.foreground.SystemForegroundService.TAG, "Unable to start foreground service", e);
            }
        }
    }
}
