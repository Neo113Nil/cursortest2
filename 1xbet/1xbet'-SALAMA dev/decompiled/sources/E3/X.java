package E3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
public final class X extends W implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f2030a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f2030a.iterator();
        it.getClass();
        D3.l lVar = this.f2031b;
        lVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (lVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new X(((SortedSet) this.f2030a).headSet(obj), this.f2031b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f2030a;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f2031b.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new X(((SortedSet) this.f2030a).subSet(obj, obj2), this.f2031b);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new X(((SortedSet) this.f2030a).tailSet(obj), this.f2031b);
    }
}
