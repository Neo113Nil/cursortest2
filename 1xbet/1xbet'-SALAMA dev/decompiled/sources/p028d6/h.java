package p028d6;

import U5.AbstractC0438e;
import U5.AbstractC0457y;
import U5.EnumC0446m;
import U5.L;
import U5.M;
import U5.N;
import p155w1.C1017n0;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f12435e;

    public /* synthetic */ h(Object obj, int i7) {
        this.f12434d = i7;
        this.f12435e = obj;
    }

    @Override // p028d6.a, U5.AbstractC0438e
    public AbstractC0457y g(C1017n0 c1017n0) {
        switch (this.f12434d) {
            case 0:
                M m7 = (M) c1017n0.y();
                AbstractC0457y abstractC0457yG = super.g(c1017n0);
                if (m7 != null) {
                    return abstractC0457yG.c().f6455a.get(N.f6435d) == null ? new g(abstractC0457yG, m7) : abstractC0457yG;
                }
                return abstractC0457yG;
            default:
                return super.g(c1017n0);
        }
    }

    @Override // p028d6.a, U5.AbstractC0438e
    public void r(EnumC0446m enumC0446m, L l7) {
        switch (this.f12434d) {
            case 1:
                i iVar = (i) this.f12435e;
                if (iVar.f12442g.f12491f.containsKey(iVar.f12436a)) {
                    iVar.f12439d = enumC0446m;
                    iVar.f12440e = l7;
                    if (!iVar.f12441f) {
                        x xVar = iVar.f12442g;
                        if (!xVar.f12493h) {
                            if (enumC0446m == EnumC0446m.f6553d) {
                                iVar.f12437b.e();
                            }
                            xVar.j();
                        }
                    }
                    break;
                }
                break;
            default:
                super.r(enumC0446m, l7);
                break;
        }
    }

    @Override // p028d6.a
    public final AbstractC0438e s() {
        switch (this.f12434d) {
            case 0:
                return (AbstractC0438e) this.f12435e;
            default:
                return ((i) this.f12435e).f12442g.f12492g;
        }
    }
}
