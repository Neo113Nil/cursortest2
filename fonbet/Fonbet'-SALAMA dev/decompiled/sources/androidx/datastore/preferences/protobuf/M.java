package androidx.datastore.preferences.protobuf;

import W5.AbstractC0486a1;

/* loaded from: classes.dex */
public final class M implements U {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0696u f9131a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f9132b;

    /* renamed from: c, reason: collision with root package name */
    public final C0690n f9133c;

    public M(c0 c0Var, C0690n c0690n, AbstractC0696u abstractC0696u) {
        this.f9132b = c0Var;
        c0690n.getClass();
        this.f9133c = c0690n;
        this.f9131a = abstractC0696u;
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final void a(Object obj, Object obj2) {
        V.A(this.f9132b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final void b(Object obj) {
        this.f9132b.getClass();
        c0.b(obj);
        this.f9133c.getClass();
        AbstractC0486a1.n(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final boolean c(Object obj) {
        this.f9133c.getClass();
        AbstractC0486a1.n(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final AbstractC0696u d() {
        AbstractC0696u abstractC0696u = this.f9131a;
        return abstractC0696u != null ? abstractC0696u.k() : ((AbstractC0694s) abstractC0696u.e(5)).b();
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final void e(Object obj, D d7) {
        this.f9133c.getClass();
        AbstractC0486a1.n(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final int f(AbstractC0696u abstractC0696u) {
        this.f9132b.getClass();
        b0 b0Var = abstractC0696u.unknownFields;
        int i7 = b0Var.f9170d;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < b0Var.f9167a; i9++) {
            int i10 = b0Var.f9168b[i9] >>> 3;
            i8 += C0687k.v0(3, (C0683g) b0Var.f9169c[i9]) + C0687k.L0(2, i10) + (C0687k.K0(1) * 2);
        }
        b0Var.f9170d = i8;
        return i8;
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final int g(AbstractC0696u abstractC0696u) {
        this.f9132b.getClass();
        return abstractC0696u.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final boolean h(AbstractC0696u abstractC0696u, Object obj) {
        this.f9132b.getClass();
        return abstractC0696u.unknownFields.equals(((AbstractC0696u) obj).unknownFields);
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final void i(Object obj, C0686j c0686j, C0689m c0689m) {
        this.f9132b.getClass();
        c0.a(obj);
        this.f9133c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }
}
