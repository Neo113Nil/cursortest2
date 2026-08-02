package p4;

import b4.EnumC0510a;
import c4.AbstractC0540a;
import r0.AbstractC2346c;

/* renamed from: p4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2261a extends b0 implements a4.c, InterfaceC2280u {

    /* renamed from: m, reason: collision with root package name */
    public final a4.h f18774m;

    public AbstractC2261a(a4.h hVar, boolean z3) {
        super(z3);
        N((U) hVar.l(r.f18819l));
        this.f18774m = hVar.m(this);
    }

    @Override // p4.b0
    public final String C() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // p4.b0
    public final void M(D2.e eVar) {
        AbstractC2282w.l(this.f18774m, eVar);
    }

    @Override // p4.b0
    public final void U(Object obj) {
        if (!(obj instanceof C2275o)) {
            d0(obj);
        } else {
            C2275o c2275o = (C2275o) obj;
            c0(c2275o.f18812a, C2275o.f18811b.get(c2275o) != 0);
        }
    }

    public final void e0(EnumC2281v enumC2281v, AbstractC2261a abstractC2261a, i4.e eVar) {
        Object invoke;
        int ordinal = enumC2281v.ordinal();
        W3.o oVar = W3.o.f6046a;
        if (ordinal == 0) {
            try {
                u4.a.h(AbstractC2346c.v(AbstractC2346c.j(abstractC2261a, this, eVar)), oVar);
                return;
            } finally {
                resumeWith(G4.l.p(th));
            }
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                kotlin.jvm.internal.l.f("<this>", eVar);
                AbstractC2346c.v(AbstractC2346c.j(abstractC2261a, this, eVar)).resumeWith(oVar);
                return;
            }
            if (ordinal != 3) {
                throw new D2.e();
            }
            try {
                a4.h hVar = this.f18774m;
                Object l5 = u4.a.l(hVar, null);
                try {
                    if (eVar instanceof AbstractC0540a) {
                        kotlin.jvm.internal.z.b(2, eVar);
                        invoke = eVar.invoke(abstractC2261a, this);
                    } else {
                        invoke = AbstractC2346c.J(eVar, abstractC2261a, this);
                    }
                    u4.a.g(hVar, l5);
                    if (invoke != EnumC0510a.f7289k) {
                        resumeWith(invoke);
                    }
                } catch (Throwable th) {
                    u4.a.g(hVar, l5);
                    throw th;
                }
            } catch (Throwable th2) {
            }
        }
    }

    @Override // a4.c
    public final a4.h getContext() {
        return this.f18774m;
    }

    @Override // p4.InterfaceC2280u
    public final a4.h i() {
        return this.f18774m;
    }

    @Override // a4.c
    public final void resumeWith(Object obj) {
        Throwable a5 = W3.k.a(obj);
        if (a5 != null) {
            obj = new C2275o(a5, false);
        }
        Object R4 = R(obj);
        if (R4 == AbstractC2282w.f18830e) {
            return;
        }
        x(R4);
    }

    public void d0(Object obj) {
    }

    public void c0(Throwable th, boolean z3) {
    }
}
