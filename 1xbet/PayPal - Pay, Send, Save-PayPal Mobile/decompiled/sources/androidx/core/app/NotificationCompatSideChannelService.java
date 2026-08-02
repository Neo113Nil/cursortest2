package androidx.core.app;

/* loaded from: classes7.dex */
public abstract class NotificationCompatSideChannelService extends android.app.Service {
    public abstract void cancel(java.lang.String str, int i, java.lang.String str2);

    public abstract void cancelAll(java.lang.String str);

    public abstract void notify(java.lang.String str, int i, java.lang.String str2, android.app.Notification notification);

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return null;
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
