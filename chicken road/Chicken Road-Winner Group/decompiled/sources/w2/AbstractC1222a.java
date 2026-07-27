package w2;

import d2.AbstractC0276f;
import d2.C0279i;
import g2.InterfaceC0319c;
import h2.EnumC0326a;
import i2.AbstractC0343b;

/* renamed from: w2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1222a extends Z implements InterfaceC0319c, InterfaceC1241u {

    /* renamed from: c, reason: collision with root package name */
    public final g2.h f10494c;

    public AbstractC1222a(g2.h hVar, boolean z3) {
        super(z3);
        F((P) hVar.k(C1240t.f10525b));
        this.f10494c = hVar.h(this);
    }

    @Override // w2.Z
    public final void E(T0.b bVar) {
        AbstractC1242v.e(this.f10494c, bVar);
    }

    @Override // w2.Z
    public final void M(Object obj) {
        if (!(obj instanceof C1235n)) {
            T(obj);
        } else {
            C1235n c1235n = (C1235n) obj;
            S(c1235n.f10517a, C1235n.f10516b.get(c1235n) != 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void U(int i3, AbstractC1222a abstractC1222a, o2.p pVar) {
        int b3 = M.j.b(i3);
        if (b3 == 0) {
            X0.a.K(pVar, abstractC1222a, this);
            return;
        }
        if (b3 != 1) {
            if (b3 == 2) {
                F2.b.y(((AbstractC0343b) pVar).b(this, abstractC1222a)).e(C0279i.f4852a);
                return;
            }
            if (b3 != 3) {
                throw new T0.b();
            }
            try {
                g2.h hVar = this.f10494c;
                Object l3 = B2.a.l(hVar, null);
                try {
                    kotlin.jvm.internal.t.a(2, pVar);
                    Object invoke = pVar.invoke(abstractC1222a, this);
                    if (invoke != EnumC0326a.f4994a) {
                        e(invoke);
                    }
                } finally {
                    B2.a.f(hVar, l3);
                }
            } catch (Throwable th) {
                e(X0.a.n(th));
            }
        }
    }

    @Override // w2.InterfaceC1241u
    public final g2.h d() {
        return this.f10494c;
    }

    @Override // g2.InterfaceC0319c
    public final void e(Object obj) {
        Throwable a3 = AbstractC0276f.a(obj);
        if (a3 != null) {
            obj = new C1235n(a3, false);
        }
        Object J2 = J(obj);
        if (J2 == AbstractC1242v.f10529d) {
            return;
        }
        p(J2);
    }

    @Override // g2.InterfaceC0319c
    public final g2.h getContext() {
        return this.f10494c;
    }

    @Override // w2.Z
    public final String t() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void T(Object obj) {
    }

    public void S(Throwable th, boolean z3) {
    }
}
