package o;

/* loaded from: classes.dex */
public abstract class g {
    public static android.app.Notification.Builder a(android.content.Context context, java.lang.String str) {
        return new android.app.Notification.Builder(context, str);
    }

    public static android.app.Notification.Builder b(android.app.Notification.Builder builder, int i2) {
        return builder.setBadgeIconType(i2);
    }

    public static android.app.Notification.Builder c(android.app.Notification.Builder builder, boolean z2) {
        return builder.setColorized(z2);
    }

    public static android.app.Notification.Builder d(android.app.Notification.Builder builder, int i2) {
        return builder.setGroupAlertBehavior(i2);
    }

    public static android.app.Notification.Builder e(android.app.Notification.Builder builder, java.lang.CharSequence charSequence) {
        return builder.setSettingsText(charSequence);
    }

    public static android.app.Notification.Builder f(android.app.Notification.Builder builder, java.lang.String str) {
        return builder.setShortcutId(str);
    }

    public static android.app.Notification.Builder g(android.app.Notification.Builder builder, long j2) {
        return builder.setTimeoutAfter(j2);
    }
}
