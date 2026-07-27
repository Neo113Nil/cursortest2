package androidx.datastore.preferences.protobuf;

import b2.AbstractC0279e;

/* loaded from: classes.dex */
public final class N implements V {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0226v f4387a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f4388b;

    /* renamed from: c, reason: collision with root package name */
    public final C0220o f4389c;

    public N(d0 d0Var, C0220o c0220o, AbstractC0226v abstractC0226v) {
        this.f4388b = d0Var;
        c0220o.getClass();
        this.f4389c = c0220o;
        this.f4387a = abstractC0226v;
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void a(Object obj, Object obj2) {
        W.A(this.f4388b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void b(Object obj, E e3) {
        this.f4389c.getClass();
        AbstractC0279e.o(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final int c(AbstractC0226v abstractC0226v) {
        this.f4388b.getClass();
        return abstractC0226v.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void d(Object obj) {
        this.f4388b.getClass();
        d0.b(obj);
        this.f4389c.getClass();
        AbstractC0279e.o(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final boolean e(AbstractC0226v abstractC0226v, Object obj) {
        this.f4388b.getClass();
        return abstractC0226v.unknownFields.equals(((AbstractC0226v) obj).unknownFields);
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final boolean f(Object obj) {
        this.f4389c.getClass();
        AbstractC0279e.o(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void g(Object obj, C0215j c0215j, C0219n c0219n) {
        this.f4388b.getClass();
        d0.a(obj);
        this.f4389c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final int h(AbstractC0226v abstractC0226v) {
        this.f4388b.getClass();
        c0 c0Var = abstractC0226v.unknownFields;
        int i2 = c0Var.f4426d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i6 = 0; i6 < c0Var.f4423a; i6++) {
            int i7 = c0Var.f4424b[i6] >>> 3;
            i3 += C0217l.K(3, (C0212g) c0Var.f4425c[i6]) + C0217l.a0(2, i7) + (C0217l.Z(1) * 2);
        }
        c0Var.f4426d = i3;
        return i3;
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final AbstractC0226v i() {
        AbstractC0226v abstractC0226v = this.f4387a;
        return abstractC0226v != null ? abstractC0226v.k() : ((AbstractC0224t) abstractC0226v.e(5)).b();
    }
}
