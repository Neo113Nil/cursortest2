package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p090m3.f;

/* JADX INFO: loaded from: classes.dex */
public final class zzagu {
    private List<zzagr> zza;

    public zzagu() {
        this.zza = new ArrayList();
    }

    public static zzagu zza(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new zzagu(new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i7);
            arrayList.add(jSONObject == null ? new zzagr() : new zzagr(f.a(jSONObject.optString("federatedId", null)), f.a(jSONObject.optString("displayName", null)), f.a(jSONObject.optString("photoUrl", null)), f.a(jSONObject.optString("providerId", null)), null, f.a(jSONObject.optString("phoneNumber", null)), f.a(jSONObject.optString("email", null))));
        }
        return new zzagu(arrayList);
    }

    private zzagu(List<zzagr> list) {
        if (!list.isEmpty()) {
            this.zza = Collections.unmodifiableList(list);
        } else {
            this.zza = Collections.emptyList();
        }
    }

    public final List<zzagr> zza() {
        return this.zza;
    }
}
