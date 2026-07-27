package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class I extends H implements NavigableSet, InterfaceC0171a0 {

    /* renamed from: c, reason: collision with root package name */
    public final transient Comparator f2636c;

    /* renamed from: d, reason: collision with root package name */
    public transient I f2637d;

    public I(Comparator comparator) {
        this.f2636c = comparator;
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f2636c;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        I i3 = this.f2637d;
        if (i3 == null) {
            Y y = (Y) this;
            Comparator reverseOrder = Collections.reverseOrder(y.f2636c);
            if (!y.isEmpty()) {
                i3 = new Y(y.f2713e.h(), reverseOrder);
            } else if (M.f2653b.equals(reverseOrder)) {
                i3 = Y.f;
            } else {
                C0244z c0244z = C.f2606b;
                i3 = new Y(Q.f2666e, reverseOrder);
            }
            this.f2637d = i3;
            i3.f2637d = this;
        }
        return i3;
    }

    @Override // java.util.SortedSet
    public abstract Object first();

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        Y y = (Y) this;
        return y.m(0, y.k(obj, false));
    }

    @Override // java.util.SortedSet
    public abstract Object last();

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z3, Object obj2, boolean z4) {
        obj.getClass();
        obj2.getClass();
        if (this.f2636c.compare(obj, obj2) > 0) {
            throw new IllegalArgumentException();
        }
        Y y = (Y) this;
        Y m3 = y.m(y.l(obj, z3), y.f2713e.size());
        return m3.m(0, m3.k(obj2, z4));
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        Y y = (Y) this;
        return y.m(y.l(obj, true), y.f2713e.size());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z3) {
        obj.getClass();
        Y y = (Y) this;
        return y.m(0, y.k(obj, z3));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z3) {
        obj.getClass();
        Y y = (Y) this;
        return y.m(y.l(obj, z3), y.f2713e.size());
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        if (this.f2636c.compare(obj, obj2) <= 0) {
            Y y = (Y) this;
            Y m3 = y.m(y.l(obj, true), y.f2713e.size());
            return m3.m(0, m3.k(obj2, false));
        }
        throw new IllegalArgumentException();
    }
}
