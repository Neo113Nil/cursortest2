package X3;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class s extends r {
    public static void U(Iterable iterable, AbstractCollection abstractCollection) {
        kotlin.jvm.internal.l.f("<this>", abstractCollection);
        kotlin.jvm.internal.l.f("elements", iterable);
        if (iterable instanceof Collection) {
            abstractCollection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }
}
