package l;

/* loaded from: classes.dex */
public final class g implements java.util.Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f7990a;

    /* renamed from: b, reason: collision with root package name */
    public int f7991b;

    /* renamed from: c, reason: collision with root package name */
    public int f7992c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7993d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l.C0923a f7994e;

    public g(l.C0923a c0923a, int i2) {
        this.f7994e = c0923a;
        this.f7990a = i2;
        this.f7991b = c0923a.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7992c < this.f7991b;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object b2 = this.f7994e.b(this.f7992c, this.f7990a);
        this.f7992c++;
        this.f7993d = true;
        return b2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f7993d) {
            throw new java.lang.IllegalStateException();
        }
        int i2 = this.f7992c - 1;
        this.f7992c = i2;
        this.f7991b--;
        this.f7993d = false;
        this.f7994e.g(i2);
    }
}
