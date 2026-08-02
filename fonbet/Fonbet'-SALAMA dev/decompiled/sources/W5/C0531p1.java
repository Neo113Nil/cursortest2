package W5;

import U5.AbstractC0457y;
import U5.C0435b;
import d6.C0978l;
import d6.C0984r;
import d6.C0986t;

/* renamed from: W5.p1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0531p1 extends U5.L {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7309a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7310b;

    public C0531p1(U5.J j) {
        p3.f.k(j, "result");
        this.f7310b = j;
    }

    @Override // U5.L
    public final U5.J a(C0539s1 c0539s1) {
        switch (this.f7309a) {
            case 0:
                return (U5.J) this.f7310b;
            default:
                U5.J a2 = ((U5.L) this.f7310b).a(c0539s1);
                AbstractC0457y abstractC0457y = a2.f6426a;
                if (abstractC0457y == null) {
                    return a2;
                }
                C0435b c3 = abstractC0457y.c();
                return U5.J.b(abstractC0457y, new C0984r((C0978l) c3.f6455a.get(C0986t.f12473n), a2.f6427b));
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
