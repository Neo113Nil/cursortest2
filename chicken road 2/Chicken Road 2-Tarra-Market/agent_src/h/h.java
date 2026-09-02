package h;

import android.app.Notification;
import android.app.Person;

/* loaded from: classes.dex */
public abstract class h {
    public static Notification.Builder a(Notification.Builder builder, Person person) {
        return builder.addPerson(person);
    }

    public static Notification.Action.Builder b(Notification.Action.Builder builder, int i2) {
        return builder.setSemanticAction(i2);
    }
}
