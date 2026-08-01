package sg.bigo.ads.f;

import android.util.Pair;
import sg.bigo.ads.api.InnerBannerAd;
import sg.bigo.ads.w0.AbstractC5496a;

/* renamed from: sg.bigo.ads.f.D, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5091D implements sg.bigo.ads.P0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sg.bigo.ads.X0.o[] f12756a;
    public final /* synthetic */ C5095H b;

    public C5091D(C5095H c5095h, sg.bigo.ads.X0.o[] oVarArr) {
        this.b = c5095h;
        this.f12756a = oVarArr;
    }

    @Override // sg.bigo.ads.P0.d
    public final void a(int i, int i2, int i3, String str, Object obj) {
        C5091D c5091d;
        sg.bigo.ads.N.d dVar;
        sg.bigo.ads.P.t tVar;
        sg.bigo.ads.P.t tVar2;
        sg.bigo.ads.P.t tVar3;
        sg.bigo.ads.P.t tVar4;
        Pair pair = (Pair) obj;
        AbstractC5496a.a(2, 6, "Banner", "Banner auto-refresh failed: " + str);
        String str2 = null;
        if (pair != null) {
            sg.bigo.ads.N.d dVar2 = (sg.bigo.ads.N.d) pair.first;
            if (dVar2 != null) {
                sg.bigo.ads.N.c cVar = dVar2.h;
                if (cVar.l == 0) {
                    cVar.l = System.currentTimeMillis();
                }
            }
            c5091d = this;
            dVar = dVar2;
        } else {
            c5091d = this;
            dVar = null;
        }
        sg.bigo.ads.X0.o oVar = c5091d.f12756a[0];
        sg.bigo.ads.T0.p pVar = pair != null ? (sg.bigo.ads.T0.p) pair.second : null;
        int i4 = (oVar == null || (tVar4 = oVar.g) == null) ? 3 : tVar4.f12492a ? 1 : 0;
        boolean z = (oVar == null || (tVar3 = oVar.g) == null || !tVar3.b) ? false : true;
        int i5 = (oVar == null || (tVar2 = oVar.g) == null) ? 4 : tVar2.c;
        if (oVar != null && (tVar = oVar.g) != null) {
            str2 = tVar.d;
        }
        sg.bigo.ads.s1.b.a(pVar, dVar, i2, i3, str, 1, 0, i4, z, i5, str2);
    }

    @Override // sg.bigo.ads.P0.d
    public final void a(int i, sg.bigo.ads.N.d dVar, Object[] objArr) {
        int i2;
        sg.bigo.ads.P.t tVar;
        sg.bigo.ads.P.t tVar2;
        sg.bigo.ads.P.t tVar3;
        sg.bigo.ads.P.t tVar4;
        sg.bigo.ads.P.j jVar = (sg.bigo.ads.P.j) sg.bigo.ads.K0.A.b((sg.bigo.ads.P.j[]) objArr);
        sg.bigo.ads.N.c cVar = jVar.c.h;
        if (cVar.l == 0) {
            cVar.l = System.currentTimeMillis();
        }
        sg.bigo.ads.X0.o oVar = this.f12756a[0];
        sg.bigo.ads.P.c cVar2 = jVar.f12482a;
        sg.bigo.ads.P.c[] cVarArr = {cVar2};
        sg.bigo.ads.N.d dVar2 = jVar.c;
        boolean z = jVar.b.s == 1 && ((sg.bigo.ads.U0.b) cVar2).D == 1;
        if (oVar == null || (tVar4 = oVar.g) == null) {
            i2 = 3;
        } else {
            i2 = tVar4.f12492a ? 1 : 0;
        }
        sg.bigo.ads.s1.b.a(cVarArr, dVar2, z, 1, 0, i2, (oVar == null || (tVar3 = oVar.g) == null || !tVar3.b) ? false : true, (oVar == null || (tVar2 = oVar.g) == null) ? 4 : tVar2.c, (oVar == null || (tVar = oVar.g) == null) ? null : tVar.d);
        sg.bigo.ads.P.c cVar3 = jVar.f12482a;
        C5095H c5095h = this.b;
        c5095h.getClass();
        InnerBannerAd a2 = AbstractC5112q.a(jVar);
        if (a2 != null) {
            c5095h.S = jVar;
            a2.markFromAutoFresh(cVar3);
            a2.handleInnerBannerAdResponse(c5095h.V);
        }
    }
}
