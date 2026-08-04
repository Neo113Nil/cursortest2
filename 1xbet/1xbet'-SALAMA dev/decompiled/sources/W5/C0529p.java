package W5;

import U5.AbstractC0457y;

/* JADX INFO: renamed from: W5.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0529p extends D {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ U5.l0 f7303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ U5.b0 f7304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
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
        p036e6.b.c();
        try {
            p036e6.c cVar = ((C0537s) this.f7305e.f8078d).f7326b;
            p036e6.b.a();
            p036e6.a aVar = p036e6.b.f12742a;
            aVar.getClass();
            e();
            aVar.getClass();
        } catch (Throwable th) {
            try {
                p036e6.b.f12742a.getClass();
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
        } finally {
            ((C0537s) this.f7305e.f8078d).g();
            p072k1.g gVar = ((C0537s) this.f7305e.f8078d).f7329e;
            if (l0Var.e()) {
                ((A0) gVar.f14682c).c();
            } else {
                ((A0) gVar.f14683d).c();
            }
        }
    }
}
