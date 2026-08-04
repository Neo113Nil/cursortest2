package p122r;

import Q3.d;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Collection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f16006a;

    public k(d dVar) {
        this.f16006a = dVar;
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
        this.f16006a.a();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f16006a.f(obj) >= 0;
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
        return this.f16006a.d() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new h(this.f16006a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        d dVar = this.f16006a;
        int iF = dVar.f(obj);
        if (iF < 0) {
            return false;
        }
        dVar.h(iF);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        d dVar = this.f16006a;
        int iD = dVar.d();
        int i7 = 0;
        boolean z4 = false;
        while (i7 < iD) {
            if (collection.contains(dVar.b(i7, 1))) {
                dVar.h(i7);
                i7--;
                iD--;
                z4 = true;
            }
            i7++;
        }
        return z4;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        d dVar = this.f16006a;
        int iD = dVar.d();
        int i7 = 0;
        boolean z4 = false;
        while (i7 < iD) {
            if (!collection.contains(dVar.b(i7, 1))) {
                dVar.h(i7);
                i7--;
                iD--;
                z4 = true;
            }
            i7++;
        }
        return z4;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f16006a.d();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        d dVar = this.f16006a;
        int iD = dVar.d();
        Object[] objArr = new Object[iD];
        for (int i7 = 0; i7 < iD; i7++) {
            objArr[i7] = dVar.b(i7, 1);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f16006a.q(1, objArr);
    }
}
