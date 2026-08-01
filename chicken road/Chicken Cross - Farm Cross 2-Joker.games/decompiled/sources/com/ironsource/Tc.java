package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class Tc extends AbstractC4379e {
    private final String i = C4393ed.f8156a;

    Tc(int i) {
        this.g = i;
    }

    @Override // com.ironsource.AbstractC4379e
    public String a() {
        return C4393ed.f8156a;
    }

    @Override // com.ironsource.AbstractC4379e
    public String c() {
        return "outcome";
    }

    @Override // com.ironsource.AbstractC4379e
    public String a(ArrayList<C4689v5> arrayList, JSONObject jSONObject) {
        if (jSONObject == null) {
            this.f = new JSONObject();
        } else {
            this.f = jSONObject;
        }
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
        return a(jSONArray);
    }
}
