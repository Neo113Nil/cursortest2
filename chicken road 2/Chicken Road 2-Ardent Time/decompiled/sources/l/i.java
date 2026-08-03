package l;

/* loaded from: classes.dex */
public final class i implements java.util.Iterator, java.util.Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public int f7997a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l.C0923a f8000d;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7999c = false;

    /* renamed from: b, reason: collision with root package name */
    public int f7998b = -1;

    public i(l.C0923a c0923a) {
        this.f8000d = c0923a;
        this.f7997a = c0923a.d() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (!this.f7999c) {
            throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object key = entry.getKey();
        int i2 = this.f7998b;
        l.C0923a c0923a = this.f8000d;
        java.lang.Object b2 = c0923a.b(i2, 0);
        if (key != b2 && (key == null || !key.equals(b2))) {
            return false;
        }
        java.lang.Object value = entry.getValue();
        java.lang.Object b3 = c0923a.b(this.f7998b, 1);
        return value == b3 || (value != null && value.equals(b3));
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        if (!this.f7999c) {
            throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f8000d.b(this.f7998b, 0);
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        if (!this.f7999c) {
            throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f8000d.b(this.f7998b, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7998b < this.f7997a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f7999c) {
            throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i2 = this.f7998b;
        l.C0923a c0923a = this.f8000d;
        java.lang.Object b2 = c0923a.b(i2, 0);
        java.lang.Object b3 = c0923a.b(this.f7998b, 1);
        return (b2 == null ? 0 : b2.hashCode()) ^ (b3 != null ? b3.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.f7998b++;
        this.f7999c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f7999c) {
            throw new java.lang.IllegalStateException();
        }
        this.f8000d.g(this.f7998b);
        this.f7998b--;
        this.f7997a--;
        this.f7999c = false;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        if (!this.f7999c) {
            throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        l.C0923a c0923a = this.f8000d;
        int i2 = this.f7998b;
        switch (c0923a.f7965d) {
            case 0:
                int i3 = (i2 << 1) + 1;
                java.lang.Object[] objArr = ((l.C0924b) c0923a.f7966e).f8007b;
                java.lang.Object obj2 = objArr[i3];
                objArr[i3] = obj;
                return obj2;
            default:
                throw new java.lang.UnsupportedOperationException("not a map");
        }
    }

    public final java.lang.String toString() {
        return getKey() + "=" + getValue();
    }
}
