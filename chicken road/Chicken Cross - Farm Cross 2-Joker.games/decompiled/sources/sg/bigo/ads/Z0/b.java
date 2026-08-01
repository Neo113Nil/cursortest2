package sg.bigo.ads.Z0;

import android.util.Pair;
import sg.bigo.ads.K0.A;
import sg.bigo.ads.P.t;
import sg.bigo.ads.T0.p;
import sg.bigo.ads.X0.o;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.IconAdsRequest;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class b extends k {
    public final /* synthetic */ String n;
    public final /* synthetic */ l o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l lVar, l lVar2, sg.bigo.ads.N.d dVar, String str, String str2) {
        super(lVar, lVar2, dVar, str);
        this.o = lVar;
        this.n = str2;
    }

    @Override // sg.bigo.ads.P0.d
    public final void a(int i, int i2, int i3, String str, Object obj) {
        AbstractC5446j.a(3, new a(this, i3, this, i, str, i2, (Pair) obj));
    }

    @Override // sg.bigo.ads.P0.d
    public final void a(int i, sg.bigo.ads.N.d dVar, Object[] objArr) {
        sg.bigo.ads.P.c[] cVarArr;
        sg.bigo.ads.P.c[] cVarArr2;
        int i2;
        int i3;
        t tVar;
        t tVar2;
        t tVar3;
        t tVar4;
        sg.bigo.ads.P.j jVar;
        sg.bigo.ads.T0.g gVar;
        l lVar;
        int i4;
        Pair pair;
        Pair pair2;
        sg.bigo.ads.T0.g gVar2;
        sg.bigo.ads.P.j[] jVarArr = (sg.bigo.ads.P.j[]) objArr;
        if (A.c(jVarArr)) {
            cVarArr = null;
        } else {
            cVarArr = new sg.bigo.ads.P.c[jVarArr.length];
            for (int i5 = 0; i5 < jVarArr.length; i5++) {
                cVarArr[i5] = jVarArr[i5].f12482a;
            }
        }
        this.c = cVarArr;
        o oVar = this.i;
        if (oVar != null) {
            int i6 = oVar.f;
            if (!A.c(cVarArr)) {
                for (sg.bigo.ads.P.c cVar : cVarArr) {
                    if (cVar != null) {
                        ((sg.bigo.ads.U0.b) cVar).b0 = i6;
                    }
                }
            }
            sg.bigo.ads.P.c[] cVarArr3 = this.c;
            t tVar5 = this.i.g;
            if (!A.c(cVarArr3)) {
                for (sg.bigo.ads.P.c cVar2 : cVarArr3) {
                    if (cVar2 != null) {
                        ((sg.bigo.ads.U0.b) cVar2).i0 = tVar5;
                    }
                }
            }
        }
        sg.bigo.ads.N.c cVar3 = dVar.h;
        if (cVar3.l == 0) {
            cVar3.l = System.currentTimeMillis();
        }
        if (this.f12662a && (gVar2 = sg.bigo.ads.O.g.f12472a) != null) {
            boolean b = gVar2.L.b(this.n);
            sg.bigo.ads.T0.b a2 = gVar2.L.a(this.n);
            int i7 = a2 != null ? a2.f : 0;
            if (!b || i7 > 2) {
                lVar = this.o;
                i4 = 10209;
                if (this.i != null) {
                    pair = new Pair((sg.bigo.ads.N.d) this.i.f12610a, null);
                    pair2 = pair;
                    lVar.a(this, 1011, i4, "no fill", pair2);
                    return;
                }
                pair2 = null;
                lVar.a(this, 1011, i4, "no fill", pair2);
                return;
            }
        }
        if (this.b && (gVar = sg.bigo.ads.O.g.f12472a) != null) {
            boolean b2 = gVar.L.b(this.n);
            sg.bigo.ads.T0.b a3 = gVar.L.a(this.n);
            int i8 = a3 != null ? a3.g : 0;
            if (!b2 || i8 > 2) {
                lVar = this.o;
                i4 = 10210;
                if (this.i != null) {
                    pair = new Pair((sg.bigo.ads.N.d) this.i.f12610a, null);
                    pair2 = pair;
                    lVar.a(this, 1011, i4, "no fill", pair2);
                    return;
                }
                pair2 = null;
                lVar.a(this, 1011, i4, "no fill", pair2);
                return;
            }
        }
        p c = dVar.c();
        if (c == null && (jVar = (sg.bigo.ads.P.j) A.b(jVarArr)) != null) {
            c = jVar.b;
        }
        if (A.c(jVarArr)) {
            cVarArr2 = null;
        } else {
            sg.bigo.ads.P.c[] cVarArr4 = new sg.bigo.ads.P.c[jVarArr.length];
            for (int i9 = 0; i9 < jVarArr.length; i9++) {
                cVarArr4[i9] = jVarArr[i9].f12482a;
            }
            cVarArr2 = cVarArr4;
        }
        sg.bigo.ads.P.c cVar4 = (sg.bigo.ads.P.c) A.b(cVarArr2);
        if (c == null || cVar4 == null) {
            i2 = 1;
            i3 = 3;
        } else {
            boolean z = c.s == 1 && ((sg.bigo.ads.U0.b) cVar4).D == 1;
            int i10 = this.f12662a ? 2 : this.b ? 4 : 1;
            o oVar2 = this.i;
            i2 = 1;
            i3 = 3;
            sg.bigo.ads.s1.b.a(cVarArr2, dVar, z, i10, oVar2 != null ? oVar2.f : 0, (oVar2 == null || (tVar4 = oVar2.g) == null) ? 3 : tVar4.f12492a ? 1 : 0, (oVar2 == null || (tVar3 = oVar2.g) == null || !tVar3.b) ? false : true, (oVar2 == null || (tVar2 = oVar2.g) == null) ? 4 : tVar2.c, (oVar2 == null || (tVar = oVar2.g) == null) ? null : tVar.d);
        }
        l lVar2 = this.o;
        lVar2.getClass();
        Ad a4 = dVar instanceof IconAdsRequest ? lVar2.a(dVar, jVarArr) : lVar2.a((sg.bigo.ads.P.j) A.b(jVarArr));
        if (a4 == null) {
            lVar2.a(b(), this, null, 1005, 1009, "Unmatched ad type.");
            return;
        }
        if (!(a4 instanceof sg.bigo.ads.Q.b)) {
            lVar2.a(c == null ? null : c.l, this, a4, 1024, 1010, "Unknown ad.");
            return;
        }
        o oVar3 = this.i;
        if (oVar3 != null) {
            oVar3.e = i3;
        }
        sg.bigo.ads.P.c[] a5 = m.a(a4);
        int i11 = this.f12662a ? 2 : this.b ? 4 : i2;
        o oVar4 = this.i;
        m.a(a5, i11, oVar4 == null ? 0 : oVar4.f, false);
        ((sg.bigo.ads.Q.b) a4).a(new g(lVar2, this, i, c));
    }
}
