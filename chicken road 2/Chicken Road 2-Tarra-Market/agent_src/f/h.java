package f;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h implements Collection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f1031a;

    public h(a aVar) {
        this.f1031a = aVar;
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
        this.f1031a.a();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f1031a.f(obj) >= 0;
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
        return this.f1031a.d() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new e(this.f1031a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        a aVar = this.f1031a;
        int f2 = aVar.f(obj);
        if (f2 < 0) {
            return false;
        }
        aVar.g(f2);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        a aVar = this.f1031a;
        int d2 = aVar.d();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < d2) {
            if (collection.contains(aVar.b(i2, 1))) {
                aVar.g(i2);
                i2--;
                d2--;
                z2 = true;
            }
            i2++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        a aVar = this.f1031a;
        int d2 = aVar.d();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < d2) {
            if (!collection.contains(aVar.b(i2, 1))) {
                aVar.g(i2);
                i2--;
                d2--;
                z2 = true;
            }
            i2++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f1031a.d();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        a aVar = this.f1031a;
        int d2 = aVar.d();
        Object[] objArr = new Object[d2];
        for (int i2 = 0; i2 < d2; i2++) {
            objArr[i2] = aVar.b(i2, 1);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f1031a.i(objArr, 1);
    }
}
