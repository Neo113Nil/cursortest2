package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.C0875q;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class zzagm {
    private final String zza;

    public zzagm(String str) {
        C0875q.d(str);
        this.zza = str;
    }

    public final JSONObject zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appSignatureHash", this.zza);
        return jSONObject;
    }
}
