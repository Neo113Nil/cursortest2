package o;

/* loaded from: classes.dex */
public abstract class f {
    public static android.app.Notification.Action.Builder a(android.app.Notification.Action.Builder builder, boolean z2) {
        return builder.setAllowGeneratedReplies(z2);
    }

    public static android.app.Notification.Builder b(android.app.Notification.Builder builder, android.widget.RemoteViews remoteViews) {
        return builder.setCustomBigContentView(remoteViews);
    }

    public static android.app.Notification.Builder c(android.app.Notification.Builder builder, android.widget.RemoteViews remoteViews) {
        return builder.setCustomContentView(remoteViews);
    }

    public static android.app.Notification.Builder d(android.app.Notification.Builder builder, android.widget.RemoteViews remoteViews) {
        return builder.setCustomHeadsUpContentView(remoteViews);
    }

    public static android.app.Notification.Builder e(android.app.Notification.Builder builder, java.lang.CharSequence[] charSequenceArr) {
        return builder.setRemoteInputHistory(charSequenceArr);
    }
}
