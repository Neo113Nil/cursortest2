package T;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class c extends X3.e implements List, Collection, j4.a {
    @Override // X3.AbstractC0441a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // X3.AbstractC0441a, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract c d(int i, Object obj);

    public abstract c e(Object obj);

    public c f(Collection collection) {
        f g5 = g();
        g5.addAll(collection);
        return g5.e();
    }

    public abstract f g();

    public abstract c h(b bVar);

    public abstract c i(int i);

    @Override // X3.e, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public abstract c j(int i, Object obj);

    @Override // X3.e, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // X3.e, java.util.List
    public final List subList(int i, int i5) {
        return new S.a(this, i, i5);
    }
}
