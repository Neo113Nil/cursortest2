package sg.bigo.ads.U0;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class c extends b {
    public boolean A0;
    public final g x0;
    public final d y0;
    public boolean z0;

    public c(long j, sg.bigo.ads.N.c cVar, sg.bigo.ads.T0.p pVar, JSONObject jSONObject) {
        super(j, cVar, pVar, jSONObject);
        JSONObject optJSONObject = jSONObject.optJSONObject("display");
        if (optJSONObject != null) {
            this.x0 = new g(optJSONObject);
        }
        this.y0 = new d(jSONObject);
    }
}
