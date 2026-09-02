package h;

import android.app.Notification;

/* loaded from: classes.dex */
public abstract class j {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z2) {
        return builder.setAuthenticationRequired(z2);
    }

    public static Notification.Builder b(Notification.Builder builder, int i2) {
        return builder.setForegroundServiceBehavior(i2);
    }
}
