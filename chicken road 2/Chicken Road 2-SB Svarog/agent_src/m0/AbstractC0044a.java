package m0;

import a.AbstractC0018a;
import o.AbstractC0071c;
import r0.AbstractC0088a;

/* renamed from: m0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0044a extends T implements Y.d, r {

    /* renamed from: d, reason: collision with root package name */
    public final Y.i f915d;

    public AbstractC0044a(Y.i iVar, boolean z2) {
        super(z2);
        B((K) iVar.d(C0060q.f943c));
        this.f915d = iVar.g(this);
    }

    @Override // m0.T
    public final void A(C.c cVar) {
        AbstractC0062t.c(this.f915d, cVar);
    }

    @Override // m0.T
    public final void F(Object obj) {
        if (!(obj instanceof C0054k)) {
            L(obj);
        } else {
            C0054k c0054k = (C0054k) obj;
            K(c0054k.f934a, C0054k.f933b.get(c0054k) != 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void M(int i2, AbstractC0044a abstractC0044a, f0.p pVar) {
        int a2 = AbstractC0071c.a(i2);
        W.g gVar = W.g.f394a;
        if (a2 == 0) {
            try {
                AbstractC0088a.g(AbstractC0018a.n(((a0.b) pVar).b(this, abstractC0044a)), gVar);
                return;
            } finally {
                k(AbstractC0018a.h(th));
            }
        }
        if (a2 != 1) {
            if (a2 == 2) {
                AbstractC0018a.n(((a0.b) pVar).b(this, abstractC0044a)).k(gVar);
                return;
            }
            if (a2 != 3) {
                throw new C.c();
            }
            try {
                Y.i iVar = this.f915d;
                Object k2 = AbstractC0088a.k(iVar, null);
                try {
                    g0.n.a(2, pVar);
                    Object g2 = pVar.g(abstractC0044a, this);
                    if (g2 != Z.a.f411b) {
                        k(g2);
                    }
                } finally {
                    AbstractC0088a.f(iVar, k2);
                }
            } catch (Throwable th) {
            }
        }
    }

    @Override // Y.d
    public final Y.i h() {
        return this.f915d;
    }

    @Override // m0.r
    public final Y.i j() {
        return this.f915d;
    }

    @Override // Y.d
    public final void k(Object obj) {
        Throwable a2 = W.d.a(obj);
        if (a2 != null) {
            obj = new C0054k(a2, false);
        }
        Object C2 = C(obj);
        if (C2 == AbstractC0062t.f947d) {
            return;
        }
        n(C2);
    }

    @Override // m0.T
    public final String r() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void L(Object obj) {
    }

    public void K(Throwable th, boolean z2) {
    }
}
