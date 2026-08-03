package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0068d implements java.util.Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f2289a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f2290b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.datastore.preferences.protobuf.C0071g f2291c;

    public C0068d(androidx.datastore.preferences.protobuf.C0071g c0071g) {
        this.f2291c = c0071g;
        this.f2290b = c0071g.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2289a < this.f2290b;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        int i2 = this.f2289a;
        if (i2 >= this.f2290b) {
            throw new java.util.NoSuchElementException();
        }
        this.f2289a = i2 + 1;
        return java.lang.Byte.valueOf(this.f2291c.f(i2));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
