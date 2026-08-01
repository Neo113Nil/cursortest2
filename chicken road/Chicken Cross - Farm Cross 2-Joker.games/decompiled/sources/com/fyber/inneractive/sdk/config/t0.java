package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.Track;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class t0 implements com.fyber.inneractive.sdk.util.b1 {

    /* renamed from: a, reason: collision with root package name */
    public Set f5289a = null;

    @Override // com.fyber.inneractive.sdk.util.b1
    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Set set = this.f5289a;
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                jSONArray.put((Track) it.next());
            }
        }
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "track", jSONArray);
        return jSONObject;
    }
}
