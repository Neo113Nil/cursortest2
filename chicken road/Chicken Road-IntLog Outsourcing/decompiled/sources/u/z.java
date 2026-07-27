package u;

import android.app.Notification;

/* loaded from: classes.dex */
public abstract class z {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
        return builder.setAuthenticationRequired(z);
    }

    public static Notification.Builder b(Notification.Builder builder, int i2) {
        return builder.setForegroundServiceBehavior(i2);
    }
}
