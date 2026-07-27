package p;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: p.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1160j implements Collection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1151a f10218a;

    public C1160j(C1151a c1151a) {
        this.f10218a = c1151a;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f10218a.a();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f10218a.f(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f10218a.d() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1157g(this.f10218a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C1151a c1151a = this.f10218a;
        int f = c1151a.f(obj);
        if (f < 0) {
            return false;
        }
        c1151a.g(f);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C1151a c1151a = this.f10218a;
        int d3 = c1151a.d();
        int i3 = 0;
        boolean z3 = false;
        while (i3 < d3) {
            if (collection.contains(c1151a.b(i3, 1))) {
                c1151a.g(i3);
                i3--;
                d3--;
                z3 = true;
            }
            i3++;
        }
        return z3;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C1151a c1151a = this.f10218a;
        int d3 = c1151a.d();
        int i3 = 0;
        boolean z3 = false;
        while (i3 < d3) {
            if (!collection.contains(c1151a.b(i3, 1))) {
                c1151a.g(i3);
                i3--;
                d3--;
                z3 = true;
            }
            i3++;
        }
        return z3;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f10218a.d();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C1151a c1151a = this.f10218a;
        int d3 = c1151a.d();
        Object[] objArr = new Object[d3];
        for (int i3 = 0; i3 < d3; i3++) {
            objArr[i3] = c1151a.b(i3, 1);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f10218a.i(1, objArr);
    }
}
