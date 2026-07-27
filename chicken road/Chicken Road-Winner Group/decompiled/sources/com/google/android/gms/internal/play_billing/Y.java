package com.google.android.gms.internal.play_billing;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public final class Y extends I {
    public static final Y f;

    /* renamed from: e, reason: collision with root package name */
    public final transient C f2713e;

    static {
        C0244z c0244z = C.f2606b;
        f = new Y(Q.f2666e, M.f2653b);
    }

    public Y(C c3, Comparator comparator) {
        super(comparator);
        this.f2713e = c3;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0238x
    public final int b(Object[] objArr) {
        return this.f2713e.b(objArr);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0238x
    public final int c() {
        return this.f2713e.c();
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int l3 = l(obj, true);
        C c3 = this.f2713e;
        if (l3 == c3.size()) {
            return null;
        }
        return c3.get(l3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f2713e, obj, this.f2636c) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Comparator comparator = this.f2636c;
        if (!AbstractC0181d1.j(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        C0244z listIterator = this.f2713e.listIterator(0);
        Iterator it = collection.iterator();
        if (listIterator.hasNext()) {
            Object next = it.next();
            Object next2 = listIterator.next();
            while (true) {
                try {
                    int compare = comparator.compare(next2, next);
                    if (compare >= 0) {
                        if (compare != 0) {
                            break;
                        }
                        if (!it.hasNext()) {
                            return true;
                        }
                        next = it.next();
                    } else {
                        if (!listIterator.hasNext()) {
                            break;
                        }
                        next2 = listIterator.next();
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0238x
    public final int d() {
        return this.f2713e.d();
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.f2713e.h().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.H, com.google.android.gms.internal.play_billing.AbstractC0238x
    public final C e() {
        return this.f2713e;
    }

    @Override // com.google.android.gms.internal.play_billing.H, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            C c3 = this.f2713e;
            if (c3.size() == set.size()) {
                if (isEmpty()) {
                    return true;
                }
                Comparator comparator = this.f2636c;
                if (!AbstractC0181d1.j(comparator, set)) {
                    return containsAll(set);
                }
                Iterator it = set.iterator();
                try {
                    C0244z listIterator = c3.listIterator(0);
                    while (listIterator.hasNext()) {
                        Object next = listIterator.next();
                        Object next2 = it.next();
                        if (next2 != null && comparator.compare(next, next2) == 0) {
                        }
                    }
                    return true;
                } catch (ClassCastException | NoSuchElementException unused) {
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.I, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f2713e.get(0);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int k3 = k(obj, true) - 1;
        if (k3 == -1) {
            return null;
        }
        return this.f2713e.get(k3);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0238x
    public final Object[] g() {
        return this.f2713e.g();
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int l3 = l(obj, false);
        C c3 = this.f2713e;
        if (l3 == c3.size()) {
            return null;
        }
        return c3.get(l3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.f2713e.listIterator(0);
    }

    public final int k(Object obj, boolean z3) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f2713e, obj, this.f2636c);
        return binarySearch >= 0 ? z3 ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    public final int l(Object obj, boolean z3) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f2713e, obj, this.f2636c);
        return binarySearch >= 0 ? z3 ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    @Override // com.google.android.gms.internal.play_billing.I, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f2713e.get(r0.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int k3 = k(obj, false) - 1;
        if (k3 == -1) {
            return null;
        }
        return this.f2713e.get(k3);
    }

    public final Y m(int i3, int i4) {
        C c3 = this.f2713e;
        if (i3 == 0) {
            if (i4 == c3.size()) {
                return this;
            }
            i3 = 0;
        }
        Comparator comparator = this.f2636c;
        if (i3 < i4) {
            return new Y(c3.subList(i3, i4), comparator);
        }
        if (M.f2653b.equals(comparator)) {
            return f;
        }
        C0244z c0244z = C.f2606b;
        return new Y(Q.f2666e, comparator);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f2713e.size();
    }
}
