package l;

/* loaded from: classes.dex */
public final class h implements java.util.Set {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7995a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l.C0923a f7996b;

    public /* synthetic */ h(l.C0923a c0923a, int i2) {
        this.f7995a = i2;
        this.f7996b = c0923a;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        switch (this.f7995a) {
            case 0:
                throw new java.lang.UnsupportedOperationException();
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        switch (this.f7995a) {
            case 0:
                l.C0923a c0923a = this.f7996b;
                int d2 = c0923a.d();
                java.util.Iterator it = collection.iterator();
                while (it.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    java.lang.Object key = entry.getKey();
                    java.lang.Object value = entry.getValue();
                    switch (c0923a.f7965d) {
                        case 0:
                            ((l.C0924b) c0923a.f7966e).put(key, value);
                            break;
                        default:
                            ((l.C0925c) c0923a.f7966e).add(key);
                            break;
                    }
                }
                return d2 != c0923a.d();
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f7995a) {
            case 0:
                this.f7996b.a();
                break;
            default:
                this.f7996b.a();
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        switch (this.f7995a) {
            case 0:
                if (!(obj instanceof java.util.Map.Entry)) {
                    return false;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                java.lang.Object key = entry.getKey();
                l.C0923a c0923a = this.f7996b;
                int e2 = c0923a.e(key);
                if (e2 < 0) {
                    return false;
                }
                java.lang.Object b2 = c0923a.b(e2, 1);
                java.lang.Object value = entry.getValue();
                return b2 == value || (b2 != null && b2.equals(value));
            default:
                return this.f7996b.e(obj) >= 0;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        switch (this.f7995a) {
            case 0:
                java.util.Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                java.util.Map c2 = this.f7996b.c();
                java.util.Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!c2.containsKey(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(java.lang.Object obj) {
        switch (this.f7995a) {
        }
        return l.C0923a.h(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        switch (this.f7995a) {
            case 0:
                l.C0923a c0923a = this.f7996b;
                int i2 = 0;
                for (int d2 = c0923a.d() - 1; d2 >= 0; d2--) {
                    java.lang.Object b2 = c0923a.b(d2, 0);
                    java.lang.Object b3 = c0923a.b(d2, 1);
                    i2 += (b2 == null ? 0 : b2.hashCode()) ^ (b3 == null ? 0 : b3.hashCode());
                }
                return i2;
            default:
                l.C0923a c0923a2 = this.f7996b;
                int i3 = 0;
                for (int d3 = c0923a2.d() - 1; d3 >= 0; d3--) {
                    java.lang.Object b4 = c0923a2.b(d3, 0);
                    i3 += b4 == null ? 0 : b4.hashCode();
                }
                return i3;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f7995a) {
            case 0:
                if (this.f7996b.d() == 0) {
                }
                break;
            default:
                if (this.f7996b.d() == 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        switch (this.f7995a) {
            case 0:
                return new l.i(this.f7996b);
            default:
                return new l.g(this.f7996b, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        switch (this.f7995a) {
            case 0:
                throw new java.lang.UnsupportedOperationException();
            default:
                l.C0923a c0923a = this.f7996b;
                int e2 = c0923a.e(obj);
                if (e2 < 0) {
                    return false;
                }
                c0923a.g(e2);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        switch (this.f7995a) {
            case 0:
                throw new java.lang.UnsupportedOperationException();
            default:
                java.util.Map c2 = this.f7996b.c();
                int size = c2.size();
                java.util.Iterator it = collection.iterator();
                while (it.hasNext()) {
                    c2.remove(it.next());
                }
                return size != c2.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        switch (this.f7995a) {
            case 0:
                throw new java.lang.UnsupportedOperationException();
            default:
                java.util.Map c2 = this.f7996b.c();
                int size = c2.size();
                java.util.Iterator it = c2.keySet().iterator();
                while (it.hasNext()) {
                    if (!collection.contains(it.next())) {
                        it.remove();
                    }
                }
                return size != c2.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f7995a) {
        }
        return this.f7996b.d();
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        switch (this.f7995a) {
            case 0:
                throw new java.lang.UnsupportedOperationException();
            default:
                return this.f7996b.i(0, objArr);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray() {
        switch (this.f7995a) {
            case 0:
                throw new java.lang.UnsupportedOperationException();
            default:
                l.C0923a c0923a = this.f7996b;
                int d2 = c0923a.d();
                java.lang.Object[] objArr = new java.lang.Object[d2];
                for (int i2 = 0; i2 < d2; i2++) {
                    objArr[i2] = c0923a.b(i2, 0);
                }
                return objArr;
        }
    }
}
