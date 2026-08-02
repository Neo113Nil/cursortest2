package d6;

import U5.AbstractC0438e;
import U5.AbstractC0457y;
import U5.C0453u;
import U5.EnumC0446m;
import U5.L;
import U5.N;
import W5.C0531p1;
import java.util.List;
import w1.C1726n0;

/* renamed from: d6.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0970d extends AbstractC0967a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12411d = 0;

    /* renamed from: e, reason: collision with root package name */
    public Object f12412e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ N f12413f;

    public C0970d(C0971e c0971e) {
        this.f12413f = c0971e;
    }

    @Override // d6.AbstractC0967a, U5.AbstractC0438e
    public AbstractC0457y g(C1726n0 c1726n0) {
        switch (this.f12411d) {
            case 1:
                C0974h c0974h = (C0974h) this.f12412e;
                C0986t c0986t = (C0986t) this.f12413f;
                C0985s c0985s = new C0985s(c0986t, c1726n0, c0974h);
                List list = (List) c1726n0.f17805b;
                if (C0986t.g(list) && c0986t.f12474f.containsKey(((C0453u) list.get(0)).f6592a.get(0))) {
                    C0978l c0978l = (C0978l) c0986t.f12474f.get(((C0453u) list.get(0)).f6592a.get(0));
                    c0978l.a(c0985s);
                    if (c0978l.f12446d != null) {
                        c0985s.r();
                    }
                }
                return c0985s;
            default:
                return super.g(c1726n0);
        }
    }

    @Override // d6.AbstractC0967a, U5.AbstractC0438e
    public final void r(EnumC0446m enumC0446m, L l7) {
        switch (this.f12411d) {
            case 0:
                N n2 = (N) this.f12412e;
                C0971e c0971e = (C0971e) this.f12413f;
                N n7 = c0971e.f12419k;
                EnumC0446m enumC0446m2 = EnumC0446m.f6551b;
                if (n2 != n7) {
                    if (n2 == c0971e.f12418i) {
                        boolean z4 = enumC0446m == enumC0446m2;
                        c0971e.f12422n = z4;
                        if (!z4 && n7 != c0971e.f12415f) {
                            c0971e.h();
                            break;
                        } else {
                            c0971e.f12416g.r(enumC0446m, l7);
                            break;
                        }
                    }
                } else {
                    p3.f.q("there's pending lb while current lb has been out of READY", c0971e.f12422n);
                    c0971e.f12420l = enumC0446m;
                    c0971e.f12421m = l7;
                    if (enumC0446m == enumC0446m2) {
                        c0971e.h();
                        break;
                    }
                }
                break;
            default:
                ((C0974h) this.f12412e).r(enumC0446m, new C0531p1(l7));
                break;
        }
    }

    @Override // d6.AbstractC0967a
    public final AbstractC0438e s() {
        switch (this.f12411d) {
            case 0:
                return ((C0971e) this.f12413f).f12416g;
            default:
                return (C0974h) this.f12412e;
        }
    }

    public C0970d(C0986t c0986t, AbstractC0438e abstractC0438e) {
        this.f12413f = c0986t;
        this.f12412e = new C0974h(abstractC0438e, 0);
    }
}
