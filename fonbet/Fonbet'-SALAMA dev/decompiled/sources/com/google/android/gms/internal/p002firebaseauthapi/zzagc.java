package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.D;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzagc implements zzadq {
    private String zza;

    public zzagc(String str) {
        D.e(str);
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadq
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.zza);
        return jSONObject.toString();
    }
}
