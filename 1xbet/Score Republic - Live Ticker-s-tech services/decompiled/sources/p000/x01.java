package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class x01 extends uc0 {

    /* JADX INFO: renamed from: q */
    public static final x01 f8733q;

    /* JADX INFO: renamed from: p */
    public final transient qc0 f8734p;

    static {
        nc0 nc0Var = qc0.f6464k;
        f8733q = new x01(q01.f6303n, ir0.f3639j);
    }

    public x01(qc0 qc0Var, Comparator comparator) {
        super(comparator);
        this.f8734p = qc0Var;
    }

    @Override // p000.sc0, p000.lc0
    /* JADX INFO: renamed from: b */
    public final qc0 mo3202b() {
        return this.f8734p;
    }

    @Override // p000.lc0
    /* JADX INFO: renamed from: c */
    public final int mo3203c(int i, Object[] objArr) {
        return this.f8734p.mo3203c(i, objArr);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iM5494u = m5494u(obj, true);
        qc0 qc0Var = this.f8734p;
        if (iM5494u == qc0Var.size()) {
            return null;
        }
        return qc0Var.get(iM5494u);
    }

    @Override // p000.lc0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f8734p, obj, this.f7793m) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Comparator comparator = this.f7793m;
        if (!m80.m3341h(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        sf1 it = iterator();
        Iterator it2 = collection.iterator();
        nc0 nc0Var = (nc0) it;
        if (!nc0Var.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = nc0Var.next();
        while (true) {
            try {
                int iCompare = comparator.compare(next2, next);
                if (iCompare < 0) {
                    if (!nc0Var.hasNext()) {
                        return false;
                    }
                    next2 = nc0Var.next();
                } else if (iCompare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iCompare > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
    }

    @Override // p000.lc0
    /* JADX INFO: renamed from: d */
    public final Object[] mo3204d() {
        return this.f8734p.mo3204d();
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.f8734p.mo3680s().listIterator(0);
    }

    @Override // p000.lc0
    /* JADX INFO: renamed from: e */
    public final int mo3205e() {
        return this.f8734p.mo3205e();
    }

    @Override // p000.sc0, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.f8734p.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator comparator = this.f7793m;
        if (!m80.m3341h(comparator, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            sf1 it2 = iterator();
            do {
                nc0 nc0Var = (nc0) it2;
                if (!nc0Var.hasNext()) {
                    return true;
                }
                next = nc0Var.next();
                next2 = it.next();
                if (next2 == null) {
                    return false;
                }
            } while (comparator.compare(next, next2) == 0);
            return false;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // p000.lc0
    /* JADX INFO: renamed from: f */
    public final int mo3206f() {
        return this.f8734p.mo3206f();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f8734p.get(0);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int iM5493t = m5493t(obj, true) - 1;
        if (iM5493t == -1) {
            return null;
        }
        return this.f8734p.get(iM5493t);
    }

    @Override // p000.lc0
    /* JADX INFO: renamed from: g */
    public final boolean mo3207g() {
        return this.f8734p.mo3207g();
    }

    @Override // p000.lc0
    /* JADX INFO: renamed from: h */
    public final sf1 iterator() {
        return this.f8734p.listIterator(0);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int iM5494u = m5494u(obj, false);
        qc0 qc0Var = this.f8734p;
        if (iM5494u == qc0Var.size()) {
            return null;
        }
        return qc0Var.get(iM5494u);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        qc0 qc0Var = this.f8734p;
        return qc0Var.get(qc0Var.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int iM5493t = m5493t(obj, false) - 1;
        if (iM5493t == -1) {
            return null;
        }
        return this.f8734p.get(iM5493t);
    }

    /* JADX INFO: renamed from: s */
    public final x01 m5492s(int i, int i2) {
        qc0 qc0Var = this.f8734p;
        if (i == 0 && i2 == qc0Var.size()) {
            return this;
        }
        Comparator comparator = this.f7793m;
        if (i < i2) {
            return new x01(qc0Var.subList(i, i2), comparator);
        }
        return ir0.f3639j != comparator ? new x01(q01.f6303n, comparator) : f8733q;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f8734p.size();
    }

    /* JADX INFO: renamed from: t */
    public final int m5493t(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f8734p, obj, this.f7793m);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    /* JADX INFO: renamed from: u */
    public final int m5494u(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f8734p, obj, this.f7793m);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }
}
