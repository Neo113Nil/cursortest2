package s;

import android.app.Notification;
import android.app.Person;

/* renamed from: s.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1190k {
    public static Notification.Builder a(Notification.Builder builder, Person person) {
        return builder.addPerson(person);
    }

    public static Notification.Action.Builder b(Notification.Action.Builder builder, int i3) {
        return builder.setSemanticAction(i3);
    }
}
