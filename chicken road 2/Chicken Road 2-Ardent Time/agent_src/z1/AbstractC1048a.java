package z1;

/* renamed from: z1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1048a extends z1.Z implements k1.d, z1.InterfaceC1067u {

    /* renamed from: c, reason: collision with root package name */
    public final k1.i f8557c;

    public AbstractC1048a(k1.i iVar, boolean z2) {
        super(z2);
        G((z1.P) iVar.m(z1.C1066t.f8592b));
        this.f8557c = iVar.g(this);
    }

    @Override // z1.Z
    public final void F(E1.A a2) {
        z1.AbstractC1068v.d(a2, this.f8557c);
    }

    @Override // z1.Z
    public final void N(java.lang.Object obj) {
        if (!(obj instanceof z1.C1061n)) {
            U(obj);
            return;
        }
        z1.C1061n c1061n = (z1.C1061n) obj;
        java.lang.Throwable th = c1061n.f8581a;
        c1061n.getClass();
        T(th, z1.C1061n.f8580b.get(c1061n) != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void V(int i2, z1.AbstractC1048a abstractC1048a, s1.p pVar) {
        int b2 = H.j.b(i2);
        if (b2 == 0) {
            u0.AbstractC0995a.B(pVar, abstractC1048a, this);
            return;
        }
        if (b2 != 1) {
            if (b2 == 2) {
                u0.AbstractC0995a.o(((m1.AbstractC0931b) pVar).b(abstractC1048a, this)).l(h1.C0177i.f3302a);
                return;
            }
            if (b2 != 3) {
                throw new E1.A();
            }
            try {
                k1.i iVar = this.f8557c;
                java.lang.Object m2 = E1.AbstractC0000a.m(iVar, null);
                try {
                    kotlin.jvm.internal.s.a(2, pVar);
                    java.lang.Object invoke = pVar.invoke(abstractC1048a, this);
                    if (invoke != l1.EnumC0927a.f8017a) {
                        l(invoke);
                    }
                } finally {
                    E1.AbstractC0000a.g(iVar, m2);
                }
            } catch (java.lang.Throwable th) {
                l(a.AbstractC0059a.i(th));
            }
        }
    }

    @Override // k1.d
    public final k1.i getContext() {
        return this.f8557c;
    }

    @Override // z1.InterfaceC1067u
    public final k1.i i() {
        return this.f8557c;
    }

    @Override // k1.d
    public final void l(java.lang.Object obj) {
        java.lang.Throwable a2 = h1.AbstractC0174f.a(obj);
        if (a2 != null) {
            obj = new z1.C1061n(a2, false);
        }
        java.lang.Object K2 = K(obj);
        if (K2 == z1.AbstractC1068v.f8596d) {
            return;
        }
        q(K2);
    }

    @Override // z1.Z
    public final java.lang.String u() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void U(java.lang.Object obj) {
    }

    public void T(java.lang.Throwable th, boolean z2) {
    }
}
