package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* loaded from: classes.dex */
public final class Hv extends Gv implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f9284k).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f9284k.iterator();
        it.getClass();
        InterfaceC1446pu interfaceC1446pu = this.f9285l;
        interfaceC1446pu.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (interfaceC1446pu.k(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new Hv(((SortedSet) this.f9284k).headSet(obj), this.f9285l);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.f9284k;
        while (true) {
            Object last = sortedSet.last();
            if (this.f9285l.k(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new Hv(((SortedSet) this.f9284k).subSet(obj, obj2), this.f9285l);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new Hv(((SortedSet) this.f9284k).tailSet(obj), this.f9285l);
    }
}
