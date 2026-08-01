package sg.bigo.ads.g;

import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.C.f;
import sg.bigo.ads.C.l;
import sg.bigo.ads.D.h;
import sg.bigo.ads.K0.A;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.P.j;
import sg.bigo.ads.T0.g;
import sg.bigo.ads.Y0.D;
import sg.bigo.ads.api.AdBid;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.IconAds;
import sg.bigo.ads.api.IconAdsRequest;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.e1.InterfaceC5087a;

/* renamed from: sg.bigo.ads.g.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5122e extends sg.bigo.ads.Q.e implements IconAds {
    public final h[] l;
    public long m;
    public final C5118a n;
    public final AtomicBoolean o;
    public final AtomicBoolean p;
    public final AtomicBoolean q;
    public final AtomicBoolean r;
    public final AtomicBoolean s;
    public sg.bigo.ads.N.e t;
    public int u;

    public C5122e(sg.bigo.ads.N.d dVar, j... jVarArr) {
        super(dVar);
        this.n = new C5118a(this);
        ArrayList arrayList = new ArrayList();
        for (j jVar : jVarArr) {
            l a2 = f.a(jVar);
            if (a2 instanceof h) {
                arrayList.add((h) a2);
            }
        }
        h[] hVarArr = new h[arrayList.size()];
        if (!A.a(arrayList)) {
            arrayList.toArray(hVarArr);
        }
        this.l = hVarArr;
        this.o = new AtomicBoolean(false);
        this.p = new AtomicBoolean(false);
        this.q = new AtomicBoolean(false);
        this.r = new AtomicBoolean(false);
        this.s = new AtomicBoolean(false);
        this.u = 1;
    }

    public static void a(C5122e c5122e, h hVar) {
        if (c5122e.r.compareAndSet(false, true)) {
            c5122e.m = SystemClock.elapsedRealtime();
            sg.bigo.ads.f1.b.i.a("impression", sg.bigo.ads.f1.a.a("impression", c5122e.d.c(), c5122e.d, null, null, null, null, c5122e));
            if (hVar instanceof h) {
                Pair a2 = (c5122e.o() == null || !((sg.bigo.ads.U0.b) c5122e.o()).a(64) || ((sg.bigo.ads.U0.b) c5122e.o()).z == null) ? null : D.a(hVar.k.e, ((sg.bigo.ads.U0.b) c5122e.o()).z.g, ((sg.bigo.ads.U0.b) c5122e.o()).U);
                Context context = hVar.k.e;
                Object obj = hVar.N.get("show_proportion");
                if (obj == null) {
                    obj = "";
                }
                String str = (String) obj;
                String o = hVar.o();
                Object obj2 = hVar.N.get("render_style");
                int intValue = ((Integer) (obj2 != null ? obj2 : 0)).intValue();
                long elapsedRealtime = hVar.A == 0 ? 0L : SystemClock.elapsedRealtime() - hVar.A;
                Object obj3 = hVar.N.get("attach_render_cost");
                sg.bigo.ads.s1.b.a(context, c5122e, str, o, intValue, elapsedRealtime, ((Long) (obj3 != null ? obj3 : -1L)).longValue(), SystemClock.elapsedRealtime() - hVar.x, -1, -1, -1, a2 == null ? -1 : ((Integer) a2.first).intValue(), a2 == null ? -1 : ((Integer) a2.second).intValue());
            }
        }
    }

    @Override // sg.bigo.ads.api.Ad
    public final void destroy() {
        for (h hVar : this.l) {
            hVar.destroy();
        }
        sg.bigo.ads.s1.b.a(o(), SystemClock.elapsedRealtime() - this.m);
    }

    @Override // sg.bigo.ads.Q.b
    public final sg.bigo.ads.P.c e() {
        return o();
    }

    @Override // sg.bigo.ads.Q.b
    public final long f() {
        g gVar = sg.bigo.ads.O.g.f12472a;
        if (gVar != null) {
            return gVar.k;
        }
        return 0L;
    }

    @Override // sg.bigo.ads.Q.b
    public final double g() {
        double d = 0.0d;
        for (h hVar : this.l) {
            d += hVar.g();
        }
        return d;
    }

    @Override // sg.bigo.ads.api.Ad
    public final AdBid getBid() {
        return null;
    }

    @Override // sg.bigo.ads.api.Ad
    public final String getCreativeId() {
        return "";
    }

    @Override // sg.bigo.ads.api.Ad
    public final String getExtraInfo(String str) {
        sg.bigo.ads.P.c o = o();
        if (o == null) {
            return "";
        }
        sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) o;
        if (str == null) {
            return "";
        }
        HashMap hashMap = bVar.j0;
        String str2 = hashMap != null ? (String) hashMap.get(str) : "";
        return str2 == null ? "" : str2;
    }

    @Override // sg.bigo.ads.api.IconAds
    public final NativeAd[] getNativeAds() {
        h[] hVarArr = this.l;
        return (NativeAd[]) Arrays.copyOf(hVarArr, hVarArr.length);
    }

    @Override // sg.bigo.ads.Q.b
    public final String h() {
        return "";
    }

    @Override // sg.bigo.ads.api.Ad
    public final boolean isExpired() {
        for (h hVar : this.l) {
            if (!((sg.bigo.ads.U0.b) hVar.k.f12482a).a()) {
                return false;
            }
        }
        return true;
    }

    @Override // sg.bigo.ads.Q.b
    public final void j() {
        if (this.p.compareAndSet(false, true)) {
            for (h hVar : this.l) {
                if (hVar != null) {
                    hVar.j();
                }
            }
            sg.bigo.ads.f1.b.i.a("filled", sg.bigo.ads.f1.a.a("filled", this.d.c(), this.d, null, null, null, null, this));
        }
    }

    @Override // sg.bigo.ads.Q.b
    public final void k() {
        if (this.o.compareAndSet(false, true)) {
            sg.bigo.ads.N.d dVar = this.d;
            if (dVar instanceof IconAdsRequest) {
                sg.bigo.ads.q.h hVar = ((IconAdsRequest) dVar).n;
                this.u = hVar != null ? hVar.f13241a : 1;
            }
            boolean z = false;
            for (h hVar2 : this.l) {
                if (hVar2 != null) {
                    hVar2.k();
                    z |= ((Boolean) hVar2.a(Boolean.FALSE, "is_cache")).booleanValue();
                }
            }
            sg.bigo.ads.s1.b.a(this, z);
        }
    }

    @Override // sg.bigo.ads.Q.e
    public final sg.bigo.ads.P.c[] m() {
        ArrayList arrayList = new ArrayList();
        for (h hVar : this.l) {
            arrayList.add(hVar.k.f12482a);
        }
        sg.bigo.ads.P.c[] cVarArr = new sg.bigo.ads.P.c[arrayList.size()];
        if (!A.a(arrayList)) {
            arrayList.toArray(cVarArr);
        }
        return cVarArr;
    }

    @Override // sg.bigo.ads.Q.e
    public final int n() {
        int i = 0;
        for (h hVar : this.l) {
            if (!hVar.l0) {
                i++;
            }
        }
        return i;
    }

    public final InterfaceC5087a o() {
        for (h hVar : this.l) {
            InterfaceC5087a interfaceC5087a = (InterfaceC5087a) hVar.k.f12482a;
            if (interfaceC5087a != null) {
                return interfaceC5087a;
            }
        }
        return null;
    }

    @Override // sg.bigo.ads.api.IconAds
    public final void setAdInteractionListener(sg.bigo.ads.N.e eVar) {
        this.t = eVar;
    }

    @Override // sg.bigo.ads.api.Ad
    public final void setAdInteractionListener(AdInteractionListener adInteractionListener) {
    }

    @Override // sg.bigo.ads.Q.b
    public final void a(sg.bigo.ads.Q.c cVar) {
        HashSet hashSet = new HashSet(Arrays.asList(this.l));
        HashSet hashSet2 = new HashSet();
        C5119b c5119b = new C5119b(this, hashSet, hashSet2, (sg.bigo.ads.Z0.g) cVar);
        for (h hVar : this.l) {
            hVar.a((sg.bigo.ads.Q.b) this);
            if (!I.a((CharSequence) "filled")) {
                hVar.F.add("filled");
            }
            if (!I.a((CharSequence) "impression")) {
                hVar.F.add("impression");
            }
            if (!I.a((CharSequence) "06002008")) {
                hVar.G.add("06002008");
            }
            if (!I.a((CharSequence) "06002010")) {
                hVar.G.add("06002010");
            }
            if (!I.a((CharSequence) "06002029")) {
                hVar.G.add("06002029");
            }
            hVar.j = new C5121d(hVar, this.n);
            hVar.a(new C5120c(this, hashSet, hashSet2, c5119b));
        }
    }

    @Override // sg.bigo.ads.Q.b
    public final void a(String str, int i, String str2) {
        if (this.s.compareAndSet(false, true)) {
            sg.bigo.ads.s1.b.a(this, str, str2, i);
        }
    }

    @Override // sg.bigo.ads.Q.b
    public final void a(int i, int i2, String str) {
        if (this.q.compareAndSet(false, true)) {
            for (h hVar : this.l) {
                if (hVar != null) {
                    hVar.a(i, i2, str);
                }
            }
            sg.bigo.ads.s1.b.a(this, i, i2, str);
        }
    }
}
