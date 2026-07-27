package w2;

import d2.C0274d;
import g2.C0320d;
import g2.InterfaceC0319c;

/* loaded from: classes.dex */
public final class j0 extends B2.s {

    /* renamed from: e, reason: collision with root package name */
    public final ThreadLocal f10509e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j0(g2.h hVar, i2.g gVar) {
        super(gVar, hVar.k(r0) == null ? hVar.h(r0) : hVar);
        k0 k0Var = k0.f10510a;
        this.f10509e = new ThreadLocal();
        g2.h hVar2 = gVar.f5029b;
        kotlin.jvm.internal.j.b(hVar2);
        if (hVar2.k(C0320d.f4980a) instanceof AbstractC1239s) {
            return;
        }
        Object l3 = B2.a.l(hVar, null);
        B2.a.f(hVar, l3);
        W(hVar, l3);
    }

    public final boolean V() {
        boolean z3 = this.threadLocalIsSet && this.f10509e.get() == null;
        this.f10509e.remove();
        return !z3;
    }

    public final void W(g2.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f10509e.set(new C0274d(hVar, obj));
    }

    @Override // B2.s, w2.Z
    public final void p(Object obj) {
        if (this.threadLocalIsSet) {
            C0274d c0274d = (C0274d) this.f10509e.get();
            if (c0274d != null) {
                B2.a.f((g2.h) c0274d.f4845a, c0274d.f4846b);
            }
            this.f10509e.remove();
        }
        Object h3 = AbstractC1242v.h(obj);
        InterfaceC0319c interfaceC0319c = this.f179d;
        g2.h context = interfaceC0319c.getContext();
        Object l3 = B2.a.l(context, null);
        j0 m3 = l3 != B2.a.f ? AbstractC1242v.m(interfaceC0319c, context, l3) : null;
        try {
            this.f179d.e(h3);
            if (m3 == null || m3.V()) {
                B2.a.f(context, l3);
            }
        } catch (Throwable th) {
            if (m3 == null || m3.V()) {
                B2.a.f(context, l3);
            }
            throw th;
        }
    }
}
