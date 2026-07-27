package sg.bigo.ads.h;

import android.util.Pair;
import com.ironsource.mediationsdk.logger.IronSourceError;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.i.C5231c;
import sg.bigo.ads.i.C5241m;
import sg.bigo.ads.u.C5485f;

/* renamed from: sg.bigo.ads.h.h1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5172h1 implements sg.bigo.ads.Q.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sg.bigo.ads.Q.c f12891a;
    public final /* synthetic */ C5185l1 b;

    public C5172h1(C5185l1 c5185l1, sg.bigo.ads.Z0.g gVar) {
        this.b = c5185l1;
        this.f12891a = gVar;
    }

    @Override // sg.bigo.ads.Q.c
    public final void a(Ad ad, int i, int i2, String str) {
        C5185l1 c5185l1 = this.b;
        if (c5185l1.n || c5185l1.p) {
            return;
        }
        this.f12891a.a(c5185l1, i, i2, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sg.bigo.ads.Q.c
    public final void a(sg.bigo.ads.Q.b bVar, boolean z) {
        boolean z2;
        NativeAd nativeAd = (NativeAd) bVar;
        C5185l1 c5185l1 = this.b;
        boolean z3 = c5185l1.n;
        if (z3 || (z2 = c5185l1.p) || !(nativeAd instanceof sg.bigo.ads.C.t)) {
            return;
        }
        if (((sg.bigo.ads.U0.k) ((InterfaceC5087a) ((sg.bigo.ads.C.t) nativeAd).k.f12482a)).V0 != null || z) {
            a(nativeAd);
        } else {
            if (z3 || z2) {
                return;
            }
            this.f12891a.a(c5185l1, IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, 10202, "video download failed and no backup creative resource.");
        }
    }

    @Override // sg.bigo.ads.Q.c
    public final void a(NativeAd nativeAd) {
        C5185l1 c5185l1 = this.b;
        sg.bigo.ads.P.j jVar = c5185l1.k;
        if (!(nativeAd instanceof sg.bigo.ads.Q.d) && (c5185l1.X == null || c5185l1.Y == null)) {
            Pair a2 = C5185l1.a(c5185l1, false, nativeAd, jVar.b, jVar.f12482a, true);
            C5185l1 c5185l12 = this.b;
            C5241m c5241m = (C5241m) a2.first;
            c5185l12.X = c5241m;
            c5185l12.Y = (C5231c) a2.second;
            if (c5241m != null && c5241m.f12988a) {
                sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) jVar.f12482a;
                if (bVar.p0 == 1 && bVar.k == 2) {
                    c5241m.a(c5185l12.D().k.e);
                }
            }
        }
        C5185l1 c5185l13 = this.b;
        if (c5185l13.n || c5185l13.p) {
            return;
        }
        sg.bigo.ads.C.l lVar = c5185l13.W;
        if (lVar != null && !(lVar instanceof sg.bigo.ads.E.d)) {
            sg.bigo.ads.P.c cVar = (InterfaceC5087a) lVar.e();
            sg.bigo.ads.T0.q qVar = ((sg.bigo.ads.U0.b) cVar).I;
            C5485f a3 = C5485f.a(lVar, qVar);
            if (a3 != null) {
                c5185l13.c0.put(lVar, a3);
            }
            C5485f b = C5485f.b(lVar, qVar);
            if (b != null) {
                c5185l13.d0.put(lVar, b);
            }
            if (a3 != null || b != null) {
                if (a3 != null && a3.f == 1) {
                    a3.b();
                } else if (b != null && b.f == 1) {
                    b.b();
                } else if (a3 != null && a3.f == 2) {
                    sg.bigo.ads.U0.k kVar = (sg.bigo.ads.U0.k) cVar;
                    if (kVar.p()) {
                        sg.bigo.ads.n1.n.n.a(kVar.k(), new C5176i1(a3));
                    } else if (!sg.bigo.ads.s0.x.a(kVar.e())) {
                        a3.b();
                    }
                } else if (b != null && b.f == 2) {
                    sg.bigo.ads.U0.k kVar2 = (sg.bigo.ads.U0.k) cVar;
                    if (kVar2.p()) {
                        sg.bigo.ads.n1.n.n.a(kVar2.k(), new C5176i1(b));
                    } else if (!sg.bigo.ads.s0.x.a(kVar2.e())) {
                        b.b();
                    }
                }
            }
        }
        this.f12891a.a(this.b);
    }
}
