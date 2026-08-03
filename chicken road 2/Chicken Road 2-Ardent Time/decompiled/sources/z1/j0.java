package z1;

/* loaded from: classes.dex */
public final class j0 extends E1.t {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ThreadLocal f8573e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j0(k1.i iVar, m1.AbstractC0935f abstractC0935f) {
        super(abstractC0935f, iVar.m(r0) == null ? iVar.g(r0) : iVar);
        z1.k0 k0Var = z1.k0.f8574a;
        this.f8573e = new java.lang.ThreadLocal();
        k1.i iVar2 = abstractC0935f.f8076b;
        kotlin.jvm.internal.i.b(iVar2);
        if (iVar2.m(k1.e.f7950a) instanceof z1.AbstractC1065s) {
            return;
        }
        java.lang.Object m2 = E1.AbstractC0000a.m(iVar, null);
        E1.AbstractC0000a.g(iVar, m2);
        X(iVar, m2);
    }

    public final boolean W() {
        boolean z2 = this.threadLocalIsSet && this.f8573e.get() == null;
        this.f8573e.remove();
        return !z2;
    }

    public final void X(k1.i iVar, java.lang.Object obj) {
        this.threadLocalIsSet = true;
        this.f8573e.set(new h1.C0172d(iVar, obj));
    }

    @Override // E1.t, z1.Z
    public final void q(java.lang.Object obj) {
        if (this.threadLocalIsSet) {
            h1.C0172d c0172d = (h1.C0172d) this.f8573e.get();
            if (c0172d != null) {
                E1.AbstractC0000a.g((k1.i) c0172d.f3295a, c0172d.f3296b);
            }
            this.f8573e.remove();
        }
        java.lang.Object h2 = z1.AbstractC1068v.h(obj);
        k1.d dVar = this.f301d;
        k1.i context = dVar.getContext();
        java.lang.Object m2 = E1.AbstractC0000a.m(context, null);
        z1.j0 m3 = m2 != E1.AbstractC0000a.f266f ? z1.AbstractC1068v.m(dVar, context, m2) : null;
        try {
            this.f301d.l(h2);
        } finally {
            if (m3 == null || m3.W()) {
                E1.AbstractC0000a.g(context, m2);
            }
        }
    }
}
