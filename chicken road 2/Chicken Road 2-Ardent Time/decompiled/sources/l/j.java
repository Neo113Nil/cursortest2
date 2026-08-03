package l;

/* loaded from: classes.dex */
public final class j implements java.util.Collection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l.C0923a f8001a;

    public j(l.C0923a c0923a) {
        this.f8001a = c0923a;
    }

    @Override // java.util.Collection
    public final boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f8001a.a();
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.f8001a.f(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f8001a.d() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new l.g(this.f8001a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        l.C0923a c0923a = this.f8001a;
        int f2 = c0923a.f(obj);
        if (f2 < 0) {
            return false;
        }
        c0923a.g(f2);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        l.C0923a c0923a = this.f8001a;
        int d2 = c0923a.d();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < d2) {
            if (collection.contains(c0923a.b(i2, 1))) {
                c0923a.g(i2);
                i2--;
                d2--;
                z2 = true;
            }
            i2++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        l.C0923a c0923a = this.f8001a;
        int d2 = c0923a.d();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < d2) {
            if (!collection.contains(c0923a.b(i2, 1))) {
                c0923a.g(i2);
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
        return this.f8001a.d();
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
        l.C0923a c0923a = this.f8001a;
        int d2 = c0923a.d();
        java.lang.Object[] objArr = new java.lang.Object[d2];
        for (int i2 = 0; i2 < d2; i2++) {
            objArr[i2] = c0923a.b(i2, 1);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        return this.f8001a.i(1, objArr);
    }
}
