package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.D;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzafv implements zzafp {
    private String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;

    private zzafv(String str, String str2, String str3, String str4, String str5) {
        D.e(str);
        this.zza = str;
        D.e(str2);
        this.zzb = str2;
        D.e(str3);
        this.zzc = str3;
        D.e(str4);
        this.zzd = str4;
        this.zze = str5;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafp
    public final /* synthetic */ zzafp zza(String str) {
        this.zza = str;
        return this;
    }

    public static zzafv zza(String str, String str2, String str3, String str4, String str5) {
        return new zzafv(str, str2, str3, str4, str5);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadq
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.zza);
        if (!TextUtils.isEmpty(this.zzb)) {
            jSONObject.put("displayName", this.zzb);
        }
        JSONObject jSONObject2 = new JSONObject();
        if (!TextUtils.isEmpty(this.zzc)) {
            jSONObject2.put("sessionInfo", this.zzc);
        }
        if (!TextUtils.isEmpty(this.zzd)) {
            jSONObject2.put("verificationCode", this.zzd);
        }
        jSONObject.put("totpVerificationInfo", jSONObject2);
        if (!TextUtils.isEmpty(this.zze)) {
            jSONObject.put("tenantId", this.zze);
        }
        return jSONObject.toString();
    }
}
