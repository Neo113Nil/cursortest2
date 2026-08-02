package W5;

import U5.AbstractC0457y;
import e6.AbstractC1053b;
import e6.C1052a;
import e6.C1054c;

/* renamed from: W5.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0529p extends D {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ U5.l0 f7303c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ U5.b0 f7304d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.media.session.t f7305e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0529p(android.support.v4.media.session.t tVar, U5.l0 l0Var, U5.b0 b0Var) {
        super(((C0537s) tVar.f8078d).f7330f, 0);
        this.f7305e = tVar;
        this.f7303c = l0Var;
        this.f7304d = b0Var;
    }

    @Override // W5.D
    public final void c() {
        AbstractC1053b.c();
        try {
            C1054c c1054c = ((C0537s) this.f7305e.f8078d).f7326b;
            AbstractC1053b.a();
            C1052a c1052a = AbstractC1053b.f12736a;
            c1052a.getClass();
            e();
            c1052a.getClass();
        } catch (Throwable th) {
            try {
                AbstractC1053b.f12736a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void e() {
        U5.l0 l0Var = this.f7303c;
        U5.b0 b0Var = this.f7304d;
        U5.l0 l0Var2 = (U5.l0) this.f7305e.f8077c;
        if (l0Var2 != null) {
            b0Var = new U5.b0();
            l0Var = l0Var2;
        }
        ((C0537s) this.f7305e.f8078d).f7334k = true;
        try {
            android.support.v4.media.session.t tVar = this.f7305e;
            C0537s c0537s = (C0537s) tVar.f8078d;
            AbstractC0457y abstractC0457y = (AbstractC0457y) tVar.f8076b;
            c0537s.getClass();
            abstractC0457y.g(l0Var, b0Var);
            ((C0537s) this.f7305e.f8078d).g();
            k1.g gVar = ((C0537s) this.f7305e.f8078d).f7329e;
            if (l0Var.e()) {
                ((A0) gVar.f14676c).c();
            } else {
                ((A0) gVar.f14677d).c();
            }
        } catch (Throwable th) {
            ((C0537s) this.f7305e.f8078d).g();
            k1.g gVar2 = ((C0537s) this.f7305e.f8078d).f7329e;
            if (l0Var.e()) {
                ((A0) gVar2.f14676c).c();
            } else {
                ((A0) gVar2.f14677d).c();
            }
            throw th;
        }
    }
}
