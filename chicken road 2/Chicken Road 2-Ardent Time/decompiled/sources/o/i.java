package o;

/* loaded from: classes.dex */
public abstract class i {
    public static android.app.Notification.Builder a(android.app.Notification.Builder builder, boolean z2) {
        return builder.setAllowSystemGeneratedContextualActions(z2);
    }

    public static android.app.Notification.Builder b(android.app.Notification.Builder builder, android.app.Notification.BubbleMetadata bubbleMetadata) {
        return builder.setBubbleMetadata(bubbleMetadata);
    }

    public static android.app.Notification.Action.Builder c(android.app.Notification.Action.Builder builder, boolean z2) {
        return builder.setContextual(z2);
    }

    public static android.app.Notification.Builder d(android.app.Notification.Builder builder, java.lang.Object obj) {
        return builder.setLocusId((android.content.LocusId) obj);
    }
}
