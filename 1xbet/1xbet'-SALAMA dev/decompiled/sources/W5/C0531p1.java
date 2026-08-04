package W5;

import U5.AbstractC0457y;
import U5.C0435b;

/* JADX INFO: renamed from: W5.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0531p1 extends U5.L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7309a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7310b;

    public C0531p1(U5.J j) {
        p113p3.f.k(j, "result");
        this.f7310b = j;
    }

    @Override // U5.L
    public final U5.J a(C0539s1 c0539s1) {
        switch (this.f7309a) {
            case 0:
                return (U5.J) this.f7310b;
            default:
                U5.J jA = ((U5.L) this.f7310b).a(c0539s1);
                AbstractC0457y abstractC0457y = jA.f6426a;
                if (abstractC0457y == null) {
                    return jA;
                }
                C0435b c0435bC = abstractC0457y.c();
                return U5.J.b(abstractC0457y, new p028d6.r((p028d6.l) c0435bC.f6455a.get(p028d6.t.f12479n), jA.f6427b));
        }
    }

    public String toString() {
        switch (this.f7309a) {
            case 0:
                D3.j jVar = new D3.j(C0531p1.class.getSimpleName());
                jVar.a((U5.J) this.f7310b, "result");
                return jVar.toString();
            default:
                return super.toString();
        }
    }

    public C0531p1(U5.L l7) {
        this.f7310b = l7;
    }
}
