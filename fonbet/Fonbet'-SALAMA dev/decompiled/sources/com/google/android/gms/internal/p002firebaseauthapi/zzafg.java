package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.D;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzafg {
    private final String zza;

    public zzafg(String str) {
        D.e(str);
        this.zza = str;
    }

    public final JSONObject zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appSignatureHash", this.zza);
        return jSONObject;
    }
}
