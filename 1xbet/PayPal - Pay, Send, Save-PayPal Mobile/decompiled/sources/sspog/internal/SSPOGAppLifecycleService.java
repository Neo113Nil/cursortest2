package sspog.internal;

/* loaded from: classes18.dex */
public class SSPOGAppLifecycleService extends android.app.Service {
    public static final java.lang.String CHANNEL_ID = "SSPOGAppLifecycleServiceChannel";
    public static final int SERVICE_ID = 7839;
    private static final java.lang.String TAG = "SSPOGAppLifecycleService";
    private static java.lang.Boolean isLifecycleServiceConnected = java.lang.Boolean.FALSE;
    private static android.graphics.drawable.Drawable appIcon = null;
    private static java.lang.String title = null;
    private static java.lang.String content = null;

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        sspog.SimpleLogger.d(TAG, "SSPOGAppLifecycle service created", new java.lang.Object[0]);
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i, int i2) {
        createNotificationChannel();
        startForeground(SERVICE_ID, buildNotification());
        return 2;
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        sspog.SimpleLogger.d(TAG, "SSPOGAppLifecycle service bind", new java.lang.Object[0]);
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        sspog.SimpleLogger.d(TAG, "SSPOGAppLifecycle service destroyed", new java.lang.Object[0]);
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onTaskRemoved(android.content.Intent intent) {
        sspog.SimpleLogger.d(TAG, "onTaskRemoved", new java.lang.Object[0]);
        sspog.SSPOGService.getInstance().stop(getApplicationContext());
        stopForeground(true);
        stopSelf();
        java.lang.System.exit(0);
        super.onTaskRemoved(intent);
    }

    public static void startAppLifecycleService(android.content.Context context, android.graphics.drawable.Drawable drawable, java.lang.String str, java.lang.String str2) {
        appIcon = drawable;
        title = str;
        content = str2;
        if (context != null) {
            try {
                if (isLifecycleServiceConnected.booleanValue()) {
                    return;
                }
                androidx.core.content.ContextCompat.startForegroundService(context, new android.content.Intent(context, (java.lang.Class<?>) sspog.internal.SSPOGAppLifecycleService.class));
                isLifecycleServiceConnected = java.lang.Boolean.TRUE;
            } catch (java.lang.Exception e) {
                sspog.SimpleLogger.e(TAG, e, (e.getLocalizedMessage() == null || e.getLocalizedMessage().length() <= 0) ? "" : e.getLocalizedMessage(), new java.lang.Object[0]);
            }
        }
    }

    private void createNotificationChannel() {
        ((android.app.NotificationManager) getSystemService(android.app.NotificationManager.class)).createNotificationChannel(new android.app.NotificationChannel(CHANNEL_ID, "Foreground Service Channel", 3));
    }

    private android.app.Notification buildNotification() {
        androidx.core.app.NotificationCompat.Builder smallIcon = new androidx.core.app.NotificationCompat.Builder(this, CHANNEL_ID).setSmallIcon(my.com.softspace.common.util.ScreenUtil.drawableToIconCompat(appIcon));
        java.lang.String str = title;
        androidx.core.app.NotificationCompat.Builder contentTitle = smallIcon.setContentTitle((str == null || str.isEmpty()) ? getString(my.com.softspace.sspog.R.string.FOREGROUND_NOTIFICATION_TITLE) : title);
        java.lang.String str2 = content;
        return contentTitle.setContentText((str2 == null || str2.isEmpty()) ? getString(my.com.softspace.sspog.R.string.FOREGROUND_NOTIFICATION_CONTENT) : content).setPriority(1).build();
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
