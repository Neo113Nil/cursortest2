package o;

/* loaded from: classes.dex */
public abstract class h {
    public static android.app.Notification.Builder a(android.app.Notification.Builder builder, android.app.Person person) {
        return builder.addPerson(person);
    }

    public static android.app.Notification.Action.Builder b(android.app.Notification.Action.Builder builder, int i2) {
        return builder.setSemanticAction(i2);
    }
}
