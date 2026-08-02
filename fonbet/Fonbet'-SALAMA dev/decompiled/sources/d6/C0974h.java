package d6;

import U5.AbstractC0438e;
import U5.AbstractC0457y;
import U5.EnumC0446m;
import U5.L;
import U5.M;
import U5.N;
import w1.C1726n0;

/* renamed from: d6.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0974h extends AbstractC0967a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12428d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f12429e;

    public /* synthetic */ C0974h(Object obj, int i7) {
        this.f12428d = i7;
        this.f12429e = obj;
    }

    @Override // d6.AbstractC0967a, U5.AbstractC0438e
    public AbstractC0457y g(C1726n0 c1726n0) {
        switch (this.f12428d) {
            case 0:
                M m7 = (M) c1726n0.y();
                AbstractC0457y g3 = super.g(c1726n0);
                if (m7 != null) {
                    return g3.c().f6455a.get(N.f6435d) == null ? new C0973g(g3, m7) : g3;
                }
                return g3;
            default:
                return super.g(c1726n0);
        }
    }

    @Override // d6.AbstractC0967a, U5.AbstractC0438e
    public void r(EnumC0446m enumC0446m, L l7) {
        switch (this.f12428d) {
            case 1:
                C0975i c0975i = (C0975i) this.f12429e;
                if (c0975i.f12436g.f12485f.containsKey(c0975i.f12430a)) {
                    c0975i.f12433d = enumC0446m;
                    c0975i.f12434e = l7;
                    if (!c0975i.f12435f) {
                        C0990x c0990x = c0975i.f12436g;
                        if (!c0990x.f12487h) {
                            if (enumC0446m == EnumC0446m.f6553d) {
                                c0975i.f12431b.e();
                            }
                            c0990x.j();
                            break;
                        }
                    }
                }
                break;
            default:
                super.r(enumC0446m, l7);
                break;
        }
    }

    @Override // d6.AbstractC0967a
    public final AbstractC0438e s() {
        switch (this.f12428d) {
            case 0:
                return (AbstractC0438e) this.f12429e;
            default:
                return ((C0975i) this.f12429e).f12436g.f12486g;
        }
    }
}
