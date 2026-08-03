package o;

/* loaded from: classes.dex */
public abstract class c {
    public static android.app.Notification.Builder a(android.app.Notification.Builder builder, android.app.Notification.Action action) {
        return builder.addAction(action);
    }

    public static android.app.Notification.Action.Builder b(android.app.Notification.Action.Builder builder, android.os.Bundle bundle) {
        return builder.addExtras(bundle);
    }

    public static android.app.Notification.Action.Builder c(android.app.Notification.Action.Builder builder, android.app.RemoteInput remoteInput) {
        return builder.addRemoteInput(remoteInput);
    }

    public static android.app.Notification.Action d(android.app.Notification.Action.Builder builder) {
        return builder.build();
    }

    public static android.app.Notification.Action.Builder e(int i2, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent) {
        return new android.app.Notification.Action.Builder(i2, charSequence, pendingIntent);
    }

    public static java.lang.String f(android.app.Notification notification) {
        return notification.getGroup();
    }

    public static android.app.Notification.Builder g(android.app.Notification.Builder builder, java.lang.String str) {
        return builder.setGroup(str);
    }

    public static android.app.Notification.Builder h(android.app.Notification.Builder builder, boolean z2) {
        return builder.setGroupSummary(z2);
    }

    public static android.app.Notification.Builder i(android.app.Notification.Builder builder, boolean z2) {
        return builder.setLocalOnly(z2);
    }

    public static android.app.Notification.Builder j(android.app.Notification.Builder builder, java.lang.String str) {
        return builder.setSortKey(str);
    }
}
