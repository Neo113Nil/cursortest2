package sg.bigo.ads.S0;

import android.util.Pair;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.Q0.n;
import sg.bigo.ads.X0.u;
import sg.bigo.ads.b1.r;
import sg.bigo.ads.c0.C5052c;
import sg.bigo.ads.q0.C5447k;
import sg.bigo.ads.y0.AbstractRunnableC5522h;

/* loaded from: classes3.dex */
public final class d extends f {
    public d(n nVar, sg.bigo.ads.U.h hVar, sg.bigo.ads.T0.g gVar, sg.bigo.ads.T0.n nVar2) {
        super(nVar, hVar, gVar, nVar2);
    }

    @Override // sg.bigo.ads.S0.f
    public final sg.bigo.ads.R0.h a() {
        return this.f12538a.f12510a.k;
    }

    @Override // sg.bigo.ads.S0.f
    public final C5447k b() {
        int i;
        boolean z;
        sg.bigo.ads.R0.j jVar = AbstractRunnableC5522h.e;
        if (jVar != null) {
            i = jVar.b;
            z = jVar.a(13);
        } else {
            i = 2;
            z = false;
        }
        return AbstractRunnableC5522h.a("ReportNet", i, z);
    }

    @Override // sg.bigo.ads.S0.f
    public final void a(Pair pair) {
        if (this.f12538a == null || this.b == null) {
            return;
        }
        this.g.set(true);
        HashMap hashMap = new HashMap();
        try {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("type", "1");
            hashMap2.put("host", (String) pair.first);
            hashMap2.put("retry_times", String.valueOf(sg.bigo.ads.O.g.f12472a.R));
            hashMap2.put("retry_interval", String.valueOf(sg.bigo.ads.O.g.f12472a.S));
            hashMap2.put("next_retry_interval", String.valueOf(sg.bigo.ads.O.g.f12472a.T));
            hashMap2.put("cur_retry_time", String.valueOf(pair.second));
            ((u) this.b).getClass();
            hashMap2.put("uuid", sg.bigo.ads.F0.a.e());
            hashMap2.put("action", "2");
            C5052c a2 = new sg.bigo.ads.u1.a(hashMap2, "06002067").a(this.b, 0L);
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event_id", a2.b);
            jSONObject.put("event_info", a2.c);
            jSONArray.put(jSONObject);
            hashMap.put("sdk_events", jSONArray);
        } catch (Exception unused) {
        }
        r rVar = new r(hashMap, this.b, this.f12538a, new c(this, pair));
        rVar.i = (String) pair.first;
        rVar.b();
    }
}
