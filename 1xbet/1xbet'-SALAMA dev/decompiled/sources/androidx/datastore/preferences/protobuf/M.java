package androidx.datastore.preferences.protobuf;

import W5.AbstractC0486a1;

/* JADX INFO: loaded from: classes.dex */
public final class M implements U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0675u f9131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f9132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0669n f9133c;

    public M(c0 c0Var, C0669n c0669n, AbstractC0675u abstractC0675u) {
        this.f9132b = c0Var;
        c0669n.getClass();
        this.f9133c = c0669n;
        this.f9131a = abstractC0675u;
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
    public final AbstractC0675u d() {
        AbstractC0675u abstractC0675u = this.f9131a;
        return abstractC0675u != null ? abstractC0675u.k() : ((AbstractC0673s) abstractC0675u.e(5)).b();
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final void e(Object obj, D d7) {
        this.f9133c.getClass();
        AbstractC0486a1.n(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final int f(AbstractC0675u abstractC0675u) {
        this.f9132b.getClass();
        b0 b0Var = abstractC0675u.unknownFields;
        int i7 = b0Var.f9170d;
        if (i7 != -1) {
            return i7;
        }
        int iV0 = 0;
        for (int i8 = 0; i8 < b0Var.f9167a; i8++) {
            int i9 = b0Var.f9168b[i8] >>> 3;
            iV0 += C0666k.v0(3, (C0662g) b0Var.f9169c[i8]) + C0666k.L0(2, i9) + (C0666k.K0(1) * 2);
        }
        b0Var.f9170d = iV0;
        return iV0;
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final int g(AbstractC0675u abstractC0675u) {
        this.f9132b.getClass();
        return abstractC0675u.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final boolean h(AbstractC0675u abstractC0675u, Object obj) {
        this.f9132b.getClass();
        return abstractC0675u.unknownFields.equals(((AbstractC0675u) obj).unknownFields);
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final void i(Object obj, C0665j c0665j, C0668m c0668m) {
        this.f9132b.getClass();
        c0.a(obj);
        this.f9133c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }
}
