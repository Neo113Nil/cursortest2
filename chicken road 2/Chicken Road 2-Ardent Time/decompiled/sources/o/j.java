package o;

/* loaded from: classes.dex */
public abstract class j {
    public static android.app.Notification.Action.Builder a(android.app.Notification.Action.Builder builder, boolean z2) {
        return builder.setAuthenticationRequired(z2);
    }

    public static android.app.Notification.Builder b(android.app.Notification.Builder builder, int i2) {
        return builder.setForegroundServiceBehavior(i2);
    }
}
