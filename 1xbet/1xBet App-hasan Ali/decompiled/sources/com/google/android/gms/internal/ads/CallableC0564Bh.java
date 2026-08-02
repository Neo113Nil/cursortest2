package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.os.Bundle;
import game.betting133.sports1xbet.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import n.AbstractC2107A;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Bh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC0564Bh implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7865a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7866b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7867c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7868d;

    public /* synthetic */ CallableC0564Bh(Cr cr, C1428pc c1428pc, Cr cr2) {
        this.f7865a = 2;
        this.f7867c = cr;
        this.f7866b = c1428pc;
        this.f7868d = cr2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C1428pc c1428pc;
        Bundle bundle;
        int i = 6;
        int i5 = 0;
        int i6 = 3;
        int i7 = 1;
        switch (this.f7865a) {
            case 0:
                C0580Dh c0580Dh = (C0580Dh) this.f7866b;
                c0580Dh.getClass();
                C0572Ch c0572Ch = (C0572Ch) ((Cr) this.f7867c).f8093m.get();
                return new C1428pc(c0572Ch.f8049a, (U2.a) c0580Dh.f8328m, (ApplicationInfo) c0580Dh.f8329n, (String) c0580Dh.f8330o, (ArrayList) c0580Dh.f8332q, (PackageInfo) c0580Dh.f8333r, (String) ((E3.a) ((AD) c0580Dh.f8334s).d()).get(), (String) c0580Dh.f8331p, null, null, ((Boolean) Q2.r.f5053d.f5056c.a(F7.E6)).booleanValue() && ((T2.I) c0580Dh.f8336u).n(), ((Wq) c0580Dh.f8337v).b(), (Bundle) this.f7868d, c0572Ch.f8050b);
            case 1:
                Gj gj = new Gj();
                JSONObject jSONObject = (JSONObject) this.f7868d;
                int optInt = jSONObject.optInt("template_id", -1);
                synchronized (gj) {
                    gj.f9226a = optInt;
                }
                gj.i(jSONObject.optString("custom_template_id"));
                JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
                String optString = optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null;
                Sq sq = (Sq) this.f7866b;
                gj.r(optString);
                Wq wq = (Wq) sq.f11595a.f11722l;
                if (!wq.f12100g.contains(Integer.toString(gj.D()))) {
                    throw new C0858co(AbstractC2107A.q("Invalid template ID: ", gj.D()), 1);
                }
                if (gj.D() == 3) {
                    if (gj.a() == null) {
                        throw new C0858co("No custom template id for custom template ad response.", 1);
                    }
                    if (!wq.f12101h.contains(gj.a())) {
                        throw new C0858co("Unexpected custom template id in the response.", 1);
                    }
                }
                Lq lq = (Lq) this.f7867c;
                gj.t(jSONObject.optDouble("rating", -1.0d));
                String optString2 = jSONObject.optString("headline", null);
                if (lq.f10475M) {
                    P2.o oVar = P2.o.f4767B;
                    T2.L l5 = oVar.f4771c;
                    Resources b3 = oVar.f4774g.b();
                    optString2 = AbstractC0467k.v(b3 != null ? b3.getString(R.string.s7) : "Test Ad", " : ", optString2);
                }
                gj.u("headline", optString2);
                gj.u("body", jSONObject.optString("body", null));
                gj.u("call_to_action", jSONObject.optString("call_to_action", null));
                gj.u("store", jSONObject.optString("store", null));
                gj.u("price", jSONObject.optString("price", null));
                gj.u("advertiser", jSONObject.optString("advertiser", null));
                return gj;
            case 2:
                C1473qc c1473qc = (C1473qc) ((Cr) this.f7867c).f8093m.get();
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8805b2)).booleanValue() && (bundle = (c1428pc = (C1428pc) this.f7866b).f15007w) != null) {
                    bundle.putLong("get-ad-dictionary-sdkcore-start", c1473qc.f15132j);
                    c1428pc.f15007w.putLong("get-ad-dictionary-sdkcore-end", c1473qc.f15133k);
                }
                return new Jm((JSONObject) ((Cr) this.f7868d).f8093m.get(), c1473qc);
            default:
                Gn gn = (Gn) this.f7866b;
                gn.getClass();
                Lq lq2 = (Lq) this.f7868d;
                Sq sq2 = (Sq) this.f7867c;
                C0905dr c0905dr = new C0905dr(sq2, lq2, (String) null);
                C1390oj c1390oj = new C1390oj(15, ((Wq) sq2.f11595a.f11722l).a(), new RunnableC1362o(gn, sq2, lq2, i));
                C0594Ff c0594Ff = gn.f9260a;
                C0594Ff c0594Ff2 = c0594Ff.f9019e;
                C1119ih c1119ih = new C1119ih(c0905dr, 3);
                C1119ih c1119ih2 = new C1119ih(c0905dr, 0);
                int i8 = KD.f10142c;
                List list = Collections.EMPTY_LIST;
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(c0594Ff2.f8974I0);
                arrayList.add(c0594Ff2.f8975J0);
                CD b5 = CD.b(new Lh(new KD(list, arrayList), i6));
                ArrayList arrayList2 = new ArrayList(4);
                ArrayList arrayList3 = new ArrayList(4);
                arrayList2.add(c0594Ff2.f9009a1);
                arrayList3.add(c0594Ff2.f9012b1);
                arrayList2.add(c0594Ff2.f9015c1);
                arrayList2.add(c0594Ff2.f9018d1);
                arrayList3.add(c0594Ff2.f9043n1);
                arrayList3.add(c0594Ff2.f9046o1);
                arrayList3.add(c0594Ff2.f9049p1);
                arrayList2.add(c0594Ff2.e1);
                CD b6 = CD.b(new Lh(new KD(arrayList2, arrayList3), 5));
                a3.y yVar = new a3.y(c1119ih2, new C1119ih(c0905dr, 1), c0594Ff2.f9071x0, new C1119ih(c0905dr, 2), c0594Ff2.f9044o);
                CD b7 = CD.b(AbstractC1561sb.f15496L);
                ArrayList arrayList4 = new ArrayList(1);
                ArrayList arrayList5 = new ArrayList(1);
                arrayList5.add(c0594Ff2.r1);
                arrayList4.add(c0594Ff2.f9057s1);
                Lh lh = new Lh(new KD(arrayList4, arrayList5), i);
                List list2 = Collections.EMPTY_LIST;
                ArrayList arrayList6 = new ArrayList(1);
                arrayList6.add(c0594Ff2.f9002X0);
                C0679Rg c0679Rg = (C0679Rg) CD.b(new C0555Ag((DD) new a3.r(c1119ih, c1119ih2, b5, b6, c0594Ff2.f9052q1, yVar, b7, lh, CD.b(new Lh(new KD(list2, arrayList6), 18))), (DD) new C0686Sg(c1390oj, i7), (DD) new C0686Sg(c1390oj, i5), c0594Ff.f9016d.f7648c, 2)).d();
                AbstractC1400ot.D(c0679Rg);
                return c0679Rg;
        }
    }

    public /* synthetic */ CallableC0564Bh(Object obj, Object obj2, Object obj3, int i) {
        this.f7865a = i;
        this.f7866b = obj;
        this.f7867c = obj2;
        this.f7868d = obj3;
    }
}
