package r;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class k implements Collection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Q3.d f16000a;

    public k(Q3.d dVar) {
        this.f16000a = dVar;
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
        this.f16000a.a();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f16000a.f(obj) >= 0;
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
        return this.f16000a.d() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new h(this.f16000a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        Q3.d dVar = this.f16000a;
        int f7 = dVar.f(obj);
        if (f7 < 0) {
            return false;
        }
        dVar.h(f7);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        Q3.d dVar = this.f16000a;
        int d7 = dVar.d();
        int i7 = 0;
        boolean z4 = false;
        while (i7 < d7) {
            if (collection.contains(dVar.b(i7, 1))) {
                dVar.h(i7);
                i7--;
                d7--;
                z4 = true;
            }
            i7++;
        }
        return z4;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        Q3.d dVar = this.f16000a;
        int d7 = dVar.d();
        int i7 = 0;
        boolean z4 = false;
        while (i7 < d7) {
            if (!collection.contains(dVar.b(i7, 1))) {
                dVar.h(i7);
                i7--;
                d7--;
                z4 = true;
            }
            i7++;
        }
        return z4;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f16000a.d();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Q3.d dVar = this.f16000a;
        int d7 = dVar.d();
        Object[] objArr = new Object[d7];
        for (int i7 = 0; i7 < d7; i7++) {
            objArr[i7] = dVar.b(i7, 1);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f16000a.q(1, objArr);
    }
}
