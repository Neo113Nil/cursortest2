package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.D;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzagw implements zzadq {
    private final String zza;
    private final String zzb;
    private final String zzc;

    public zzagw(String str, String str2, String str3) {
        D.e(str);
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadq
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("oobCode", this.zza);
        String str = this.zzb;
        if (str != null) {
            jSONObject.put("newPassword", str);
        }
        String str2 = this.zzc;
        if (str2 != null) {
            jSONObject.put("tenantId", str2);
        }
        return jSONObject.toString();
    }

    public final String zzb() {
        return this.zzb;
    }
}
