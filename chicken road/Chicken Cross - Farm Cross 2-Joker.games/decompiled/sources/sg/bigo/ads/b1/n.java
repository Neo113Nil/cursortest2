package sg.bigo.ads.b1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.K0.A;
import sg.bigo.ads.X0.u;

/* loaded from: classes3.dex */
public final class n extends C5033f {
    public n(sg.bigo.ads.T0.g gVar, u uVar, sg.bigo.ads.Q0.n nVar, sg.bigo.ads.N.d dVar, sg.bigo.ads.T0.p pVar, sg.bigo.ads.P0.d dVar2) {
        super(gVar, uVar, nVar, dVar, pVar, dVar2);
    }

    @Override // sg.bigo.ads.b1.C5033f, sg.bigo.ads.b1.AbstractC5032e
    public final void a(Map map, String str) {
        sg.bigo.ads.U0.b a2;
        if (this.n != null) {
            Object obj = ((HashMap) map).get("logid");
            long longValue = obj instanceof Long ? ((Long) obj).longValue() : 0L;
            try {
                JSONObject jSONObject = new JSONObject(str);
                ArrayList arrayList = new ArrayList();
                JSONArray optJSONArray = jSONObject.optJSONArray(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS);
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null && (a2 = sg.bigo.ads.U0.b.a(longValue, this.l.h, this.m, optJSONObject)) != null) {
                        arrayList.add(a2);
                    }
                }
                if (A.a(arrayList)) {
                    a(1005, 0, "empty ad data.");
                } else {
                    this.n.a(this.f12697a, this.l, (sg.bigo.ads.U0.b[]) arrayList.toArray(new sg.bigo.ads.U0.b[arrayList.size()]));
                }
            } catch (JSONException unused) {
                a(1005, 0, "Invalid ad data.");
            }
        }
    }

    @Override // sg.bigo.ads.b1.C5033f, sg.bigo.ads.b1.AbstractC5032e
    public final boolean j() {
        return sg.bigo.ads.O.g.f12472a.B.a(7) && ((Boolean) sg.bigo.ads.F0.b.a("sp_ads", "sp_ads_encrypticon_ads_data_request", Boolean.TRUE, 4)).booleanValue();
    }

    @Override // sg.bigo.ads.b1.C5033f, sg.bigo.ads.b1.AbstractC5032e
    public final void k() {
        sg.bigo.ads.F0.b.b("sp_ads", "sp_ads_encrypticon_ads_data_request", Boolean.FALSE, 4);
    }

    @Override // sg.bigo.ads.b1.C5033f, sg.bigo.ads.b1.AbstractC5032e
    /* renamed from: n */
    public final sg.bigo.ads.Q0.q i() {
        return this.c.a("/Ad/GetUniIconAds", (String) null);
    }
}
