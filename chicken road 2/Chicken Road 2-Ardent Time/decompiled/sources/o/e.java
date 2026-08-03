package o;

/* loaded from: classes.dex */
public abstract class e {
    public static android.app.Notification.Action.Builder a(android.graphics.drawable.Icon icon, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent) {
        return new android.app.Notification.Action.Builder(icon, charSequence, pendingIntent);
    }

    public static android.app.Notification.Builder b(android.app.Notification.Builder builder, android.graphics.drawable.Icon icon) {
        return builder.setLargeIcon(icon);
    }

    public static android.app.Notification.Builder c(android.app.Notification.Builder builder, java.lang.Object obj) {
        return builder.setSmallIcon((android.graphics.drawable.Icon) obj);
    }
}
