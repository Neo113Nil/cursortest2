package p028d6;

import U5.AbstractC0438e;
import U5.AbstractC0457y;
import U5.C0453u;
import U5.EnumC0446m;
import U5.L;
import U5.N;
import W5.C0531p1;
import java.util.List;
import p113p3.f;
import p155w1.C1017n0;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12417d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f12418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ N f12419f;

    public d(e eVar) {
        this.f12419f = eVar;
    }

    @Override // p028d6.a, U5.AbstractC0438e
    public AbstractC0457y g(C1017n0 c1017n0) {
        switch (this.f12417d) {
            case 1:
                h hVar = (h) this.f12418e;
                t tVar = (t) this.f12419f;
                s sVar = new s(tVar, c1017n0, hVar);
                List list = (List) c1017n0.f17811b;
                if (t.g(list) && tVar.f12480f.containsKey(((C0453u) list.get(0)).f6592a.get(0))) {
                    l lVar = (l) tVar.f12480f.get(((C0453u) list.get(0)).f6592a.get(0));
                    lVar.a(sVar);
                    if (lVar.f12452d != null) {
                        sVar.r();
                    }
                }
                return sVar;
            default:
                return super.g(c1017n0);
        }
    }

    @Override // p028d6.a, U5.AbstractC0438e
    public final void r(EnumC0446m enumC0446m, L l7) {
        switch (this.f12417d) {
            case 0:
                N n2 = (N) this.f12418e;
                e eVar = (e) this.f12419f;
                N n7 = eVar.f12425k;
                EnumC0446m enumC0446m2 = EnumC0446m.f6551b;
                if (n2 == n7) {
                    f.q("there's pending lb while current lb has been out of READY", eVar.f12428n);
                    eVar.f12426l = enumC0446m;
                    eVar.f12427m = l7;
                    if (enumC0446m == enumC0446m2) {
                        eVar.h();
                    }
                } else if (n2 == eVar.f12424i) {
                    boolean z4 = enumC0446m == enumC0446m2;
                    eVar.f12428n = z4;
                    if (z4 || n7 == eVar.f12421f) {
                        eVar.f12422g.r(enumC0446m, l7);
                    } else {
                        eVar.h();
                    }
                }
                break;
            default:
                ((h) this.f12418e).r(enumC0446m, new C0531p1(l7));
                break;
        }
    }

    @Override // p028d6.a
    public final AbstractC0438e s() {
        switch (this.f12417d) {
            case 0:
                return ((e) this.f12419f).f12422g;
            default:
                return (h) this.f12418e;
        }
    }

    public d(t tVar, AbstractC0438e abstractC0438e) {
        this.f12419f = tVar;
        this.f12418e = new h(abstractC0438e, 0);
    }
}
