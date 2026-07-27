package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.ga, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C4426ga extends AbstractC4379e {
    private final String i = "https://o-sdk.mediation.unity3d.com/mediation?adUnit=2";
    private final String j = "super.dwh.mediation_events";
    private final String k = C4761z5.R;
    private final String l = "data";

    C4426ga(int i) {
        this.g = i;
    }

    @Override // com.ironsource.AbstractC4379e
    public String a() {
        return "https://o-sdk.mediation.unity3d.com/mediation?adUnit=2";
    }

    @Override // com.ironsource.AbstractC4379e
    public String c() {
        return "ironbeast";
    }

    @Override // com.ironsource.AbstractC4379e
    public String a(ArrayList<C4689v5> arrayList, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null) {
            this.f = new JSONObject();
        } else {
            this.f = jSONObject;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<C4689v5> it = arrayList.iterator();
                while (it.hasNext()) {
                    JSONObject a2 = a(it.next());
                    if (a2 != null) {
                        jSONArray.put(a2);
                    }
                }
            }
            jSONObject2.put(C4761z5.R, "super.dwh.mediation_events");
            jSONObject2.put("data", a(jSONArray));
            return jSONObject2.toString();
        } catch (JSONException e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }
}
