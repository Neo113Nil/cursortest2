package W5;

import U5.AbstractC0439f;
import U5.AbstractC0456x;
import U5.AbstractC0457y;
import U5.C0436c;
import U5.C0437d;
import U5.C0450q;
import io.sentry.protocol.Request;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class G0 extends AbstractC0456x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U5.D f6804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K0 f6805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f6806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final H2.r f6807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0450q f6808e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0437d f6809f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AbstractC0439f f6810g;

    public G0(U5.D d7, K0 k7, Executor executor, H2.r rVar, C0437d c0437d) {
        this.f6804a = d7;
        this.f6805b = k7;
        this.f6807d = rVar;
        Executor executor2 = c0437d.f6475b;
        executor = executor2 != null ? executor2 : executor;
        this.f6806c = executor;
        C0436c c0436cB = C0437d.b(c0437d);
        c0436cB.f6463c = executor;
        this.f6809f = new C0437d(c0436cB);
        this.f6808e = C0450q.b();
    }

    @Override // U5.AbstractC0456x, U5.AbstractC0439f
    public final void a(String str, Throwable th) {
        AbstractC0439f abstractC0439f = this.f6810g;
        if (abstractC0439f != null) {
            abstractC0439f.a(str, th);
        }
    }

    @Override // U5.AbstractC0456x, U5.AbstractC0439f
    public final void e(AbstractC0457y abstractC0457y, U5.b0 b0Var) {
        C0437d c0437d = this.f6809f;
        H2.r rVar = this.f6807d;
        p113p3.f.k(rVar, Request.JsonKeys.METHOD);
        p113p3.f.k(c0437d, "callOptions");
        p155w1.V0 v0A = this.f6804a.a();
        U5.l0 l0Var = (U5.l0) v0A.f17568b;
        if (!l0Var.e()) {
            this.f6806c.execute(new H(this, abstractC0457y, AbstractC0494d0.h(l0Var)));
            this.f6810g = Q0.f6929n0;
            return;
        }
        W0 w7 = (W0) v0A.f17569c;
        w7.getClass();
        U0 u4 = (U0) w7.f7080b.get((String) rVar.f3291b);
        if (u4 == null) {
            u4 = (U0) w7.f7081c.get((String) rVar.f3292c);
        }
        if (u4 == null) {
            u4 = w7.f7079a;
        }
        if (u4 != null) {
            this.f6809f = this.f6809f.c(U0.f7061g, u4);
        }
        AbstractC0439f abstractC0439fN = this.f6805b.n(rVar, this.f6809f);
        this.f6810g = abstractC0439fN;
        abstractC0439fN.e(abstractC0457y, b0Var);
    }

    @Override // U5.AbstractC0456x
    public final AbstractC0439f f() {
        return this.f6810g;
    }
}
