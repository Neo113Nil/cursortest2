package b1;

import a.AbstractC0009a;
import p.AbstractC0819i;

/* renamed from: b1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0013a extends S implements M0.d, r {

    /* renamed from: c, reason: collision with root package name */
    public final M0.i f650c;

    public AbstractC0013a(M0.i iVar, boolean z2) {
        super(z2);
        A((J) iVar.i(C0029q.f679b));
        this.f650c = iVar.k(this);
    }

    @Override // b1.S
    public final void E(Object obj) {
        if (!(obj instanceof C0023k)) {
            K(obj);
            return;
        }
        C0023k c0023k = (C0023k) obj;
        Throwable th = c0023k.f668a;
        c0023k.getClass();
        J(th, C0023k.f667b.get(c0023k) != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L(int i2, AbstractC0013a abstractC0013a, U0.p pVar) {
        int c2 = AbstractC0819i.c(i2);
        K0.i iVar = K0.i.f206a;
        if (c2 == 0) {
            try {
                g1.a.i(AbstractC0009a.r(((O0.b) pVar).a(abstractC0013a, this)), iVar, null);
                return;
            } finally {
                f(V.a.k(th));
            }
        }
        if (c2 != 1) {
            if (c2 == 2) {
                AbstractC0009a.r(((O0.b) pVar).a(abstractC0013a, this)).f(iVar);
                return;
            }
            if (c2 != 3) {
                throw new H.a();
            }
            try {
                M0.i iVar2 = this.f650c;
                Object m2 = g1.a.m(iVar2, null);
                try {
                    kotlin.jvm.internal.p.a(2, pVar);
                    Object invoke = pVar.invoke(abstractC0013a, this);
                    if (invoke != N0.a.f260a) {
                        f(invoke);
                    }
                } finally {
                    g1.a.h(iVar2, m2);
                }
            } catch (Throwable th) {
            }
        }
    }

    @Override // b1.r
    public final M0.i e() {
        return this.f650c;
    }

    @Override // M0.d
    public final void f(Object obj) {
        Throwable a2 = K0.f.a(obj);
        if (a2 != null) {
            obj = new C0023k(a2, false);
        }
        Object B2 = B(obj);
        if (B2 == AbstractC0030s.f683d) {
            return;
        }
        m(B2);
    }

    @Override // M0.d
    public final M0.i getContext() {
        return this.f650c;
    }

    @Override // b1.S
    public final String q() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // b1.S
    public final void z(H.a aVar) {
        AbstractC0030s.c(this.f650c, aVar);
    }

    public void K(Object obj) {
    }

    public void J(Throwable th, boolean z2) {
    }
}
