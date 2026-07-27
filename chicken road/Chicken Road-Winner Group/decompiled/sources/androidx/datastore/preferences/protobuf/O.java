package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class O implements W {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0147w f2185a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f2186b;

    /* renamed from: c, reason: collision with root package name */
    public final C0141p f2187c;

    public O(e0 e0Var, C0141p c0141p, AbstractC0147w abstractC0147w) {
        this.f2186b = e0Var;
        c0141p.getClass();
        this.f2187c = c0141p;
        this.f2185a = abstractC0147w;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void a(Object obj, Object obj2) {
        X.k(this.f2186b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void b(Object obj, F f) {
        this.f2187c.getClass();
        B0.c.n(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final int c(AbstractC0147w abstractC0147w) {
        this.f2186b.getClass();
        return abstractC0147w.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void d(Object obj) {
        this.f2186b.getClass();
        d0 d0Var = ((AbstractC0147w) obj).unknownFields;
        if (d0Var.f2227e) {
            d0Var.f2227e = false;
        }
        this.f2187c.getClass();
        B0.c.n(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final boolean e(Object obj) {
        this.f2187c.getClass();
        B0.c.n(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final boolean f(AbstractC0147w abstractC0147w, AbstractC0147w abstractC0147w2) {
        this.f2186b.getClass();
        return abstractC0147w.unknownFields.equals(abstractC0147w2.unknownFields);
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void g(Object obj, C0136k c0136k, C0140o c0140o) {
        this.f2186b.getClass();
        e0.a(obj);
        this.f2187c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final int h(AbstractC0147w abstractC0147w) {
        this.f2186b.getClass();
        d0 d0Var = abstractC0147w.unknownFields;
        int i3 = d0Var.f2226d;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < d0Var.f2223a; i5++) {
            int i6 = d0Var.f2224b[i5] >>> 3;
            i4 += C0138m.o0(3, (C0132g) d0Var.f2225c[i5]) + C0138m.r0(i6) + C0138m.q0(2) + (C0138m.q0(1) * 2);
        }
        d0Var.f2226d = i4;
        return i4;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final AbstractC0147w newInstance() {
        AbstractC0147w abstractC0147w = this.f2185a;
        return abstractC0147w != null ? abstractC0147w.i() : ((AbstractC0145u) abstractC0147w.c(5)).b();
    }
}
