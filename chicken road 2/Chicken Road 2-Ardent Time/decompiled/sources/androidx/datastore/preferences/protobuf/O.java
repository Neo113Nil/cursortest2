package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class O implements androidx.datastore.preferences.protobuf.W {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.AbstractC0086w f2254a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.e0 f2255b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.C0080p f2256c;

    public O(androidx.datastore.preferences.protobuf.e0 e0Var, androidx.datastore.preferences.protobuf.C0080p c0080p, androidx.datastore.preferences.protobuf.AbstractC0086w abstractC0086w) {
        this.f2255b = e0Var;
        c0080p.getClass();
        this.f2256c = c0080p;
        this.f2254a = abstractC0086w;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final boolean a(java.lang.Object obj) {
        this.f2256c.getClass();
        B1.a.m(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void b(java.lang.Object obj, androidx.datastore.preferences.protobuf.C0075k c0075k, androidx.datastore.preferences.protobuf.C0079o c0079o) {
        this.f2255b.getClass();
        androidx.datastore.preferences.protobuf.e0.a(obj);
        this.f2256c.getClass();
        obj.getClass();
        throw new java.lang.ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void c(java.lang.Object obj, java.lang.Object obj2) {
        androidx.datastore.preferences.protobuf.X.A(this.f2255b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void d(java.lang.Object obj, androidx.datastore.preferences.protobuf.F f2) {
        this.f2256c.getClass();
        B1.a.m(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final int e(androidx.datastore.preferences.protobuf.AbstractC0086w abstractC0086w) {
        this.f2255b.getClass();
        return abstractC0086w.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final int f(androidx.datastore.preferences.protobuf.AbstractC0086w abstractC0086w) {
        this.f2255b.getClass();
        androidx.datastore.preferences.protobuf.d0 d0Var = abstractC0086w.unknownFields;
        int i2 = d0Var.f2296d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < d0Var.f2293a; i4++) {
            int i5 = d0Var.f2294b[i4] >>> 3;
            i3 += androidx.datastore.preferences.protobuf.C0077m.K(3, (androidx.datastore.preferences.protobuf.C0071g) d0Var.f2295c[i4]) + androidx.datastore.preferences.protobuf.C0077m.a0(2, i5) + (androidx.datastore.preferences.protobuf.C0077m.Z(1) * 2);
        }
        d0Var.f2296d = i3;
        return i3;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final androidx.datastore.preferences.protobuf.AbstractC0086w g() {
        androidx.datastore.preferences.protobuf.AbstractC0086w abstractC0086w = this.f2254a;
        return abstractC0086w != null ? abstractC0086w.k() : ((androidx.datastore.preferences.protobuf.AbstractC0084u) abstractC0086w.e(5)).b();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void h(java.lang.Object obj) {
        this.f2255b.getClass();
        androidx.datastore.preferences.protobuf.e0.b(obj);
        this.f2256c.getClass();
        B1.a.m(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final boolean i(androidx.datastore.preferences.protobuf.AbstractC0086w abstractC0086w, java.lang.Object obj) {
        this.f2255b.getClass();
        return abstractC0086w.unknownFields.equals(((androidx.datastore.preferences.protobuf.AbstractC0086w) obj).unknownFields);
    }
}
