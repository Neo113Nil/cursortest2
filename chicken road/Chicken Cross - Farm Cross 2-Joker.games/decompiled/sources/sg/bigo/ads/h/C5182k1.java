package sg.bigo.ads.h;

import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.i.C5231c;
import sg.bigo.ads.i.C5241m;

/* renamed from: sg.bigo.ads.h.k1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5182k1 implements sg.bigo.ads.E.a {

    /* renamed from: a, reason: collision with root package name */
    public HashMap f12900a;
    public final /* synthetic */ C5185l1 b;

    public C5182k1(C5185l1 c5185l1) {
        this.b = c5185l1;
    }

    public final Pair a(sg.bigo.ads.C.l lVar) {
        HashMap hashMap;
        if (lVar == null || (hashMap = this.f12900a) == null) {
            return null;
        }
        return (Pair) hashMap.get(lVar);
    }

    public final void b(sg.bigo.ads.C.l lVar) {
        HashMap hashMap;
        Pair pair;
        if (lVar == null || (hashMap = this.f12900a) == null || (pair = (Pair) hashMap.remove(lVar)) == null) {
            return;
        }
        C5241m c5241m = (C5241m) pair.first;
        if (c5241m != null) {
            c5241m.a();
        }
        C5231c c5231c = (C5231c) pair.second;
        if (c5231c != null) {
            c5231c.a();
        }
    }

    public final void a(int i, NativeAd nativeAd, sg.bigo.ads.T0.p pVar) {
        if (this.f12900a == null) {
            this.f12900a = new HashMap();
        }
        if (nativeAd instanceof sg.bigo.ads.C.l) {
            sg.bigo.ads.C.l lVar = (sg.bigo.ads.C.l) nativeAd;
            sg.bigo.ads.P.c e = lVar.e();
            sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) e;
            sg.bigo.ads.T0.q qVar = bVar.I;
            boolean z = false;
            boolean z2 = bVar.p0 == 1;
            if (z2 || qVar == null) {
                z = z2;
            } else {
                Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("endpage.companion_first"));
                if (1 == (a2 != null ? a2.intValue() : 0) || i == 2) {
                    z = true;
                }
            }
            if (z) {
                Pair a3 = C5185l1.a(this.b, true, lVar, pVar, e, false);
                this.f12900a.put(lVar, a3);
                C5241m c5241m = (C5241m) a3.first;
                if (c5241m != null && c5241m.f12988a && bVar.p0 == 1 && bVar.k == 2) {
                    c5241m.a(lVar.k.e);
                }
            }
        }
    }

    public final void a() {
        HashMap hashMap = this.f12900a;
        if (hashMap != null) {
            Iterator it = hashMap.keySet().iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) this.f12900a.get((sg.bigo.ads.C.l) it.next());
                if (pair != null) {
                    C5241m c5241m = (C5241m) pair.first;
                    if (c5241m != null) {
                        c5241m.a();
                    }
                    C5231c c5231c = (C5231c) pair.second;
                    if (c5231c != null) {
                        c5231c.a();
                    }
                }
            }
            this.f12900a.clear();
        }
    }
}
