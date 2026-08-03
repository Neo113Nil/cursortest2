package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class a0 implements java.util.Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f2281a = -1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2282b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.Iterator f2283c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.datastore.preferences.protobuf.Y f2284d;

    public a0(androidx.datastore.preferences.protobuf.Y y2) {
        this.f2284d = y2;
    }

    public final java.util.Iterator a() {
        if (this.f2283c == null) {
            this.f2283c = this.f2284d.f2274b.entrySet().iterator();
        }
        return this.f2283c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.f2281a + 1;
        androidx.datastore.preferences.protobuf.Y y2 = this.f2284d;
        if (i2 >= y2.f2273a.size()) {
            return !y2.f2274b.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        this.f2282b = true;
        int i2 = this.f2281a + 1;
        this.f2281a = i2;
        androidx.datastore.preferences.protobuf.Y y2 = this.f2284d;
        return i2 < y2.f2273a.size() ? (java.util.Map.Entry) y2.f2273a.get(this.f2281a) : (java.util.Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f2282b) {
            throw new java.lang.IllegalStateException("remove() was called before next()");
        }
        this.f2282b = false;
        int i2 = androidx.datastore.preferences.protobuf.Y.f2272f;
        androidx.datastore.preferences.protobuf.Y y2 = this.f2284d;
        y2.b();
        if (this.f2281a >= y2.f2273a.size()) {
            a().remove();
            return;
        }
        int i3 = this.f2281a;
        this.f2281a = i3 - 1;
        y2.h(i3);
    }
}
