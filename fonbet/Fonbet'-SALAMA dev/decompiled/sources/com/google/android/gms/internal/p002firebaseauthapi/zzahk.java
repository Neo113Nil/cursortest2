package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.D;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzahk implements zzadq {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;
    private zzafg zzi;

    private zzahk(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        D.e(str);
        this.zza = str;
        D.e(str2);
        this.zzb = str2;
        D.e(str3);
        this.zzc = str3;
        this.zze = str4;
        this.zzd = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
    }

    public static zzahk zza(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        D.e(str3);
        return new zzahk("phone", str, str2, str3, str4, str5, str6, str7);
    }

    public final String zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadq
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mfaPendingCredential", this.zzb);
        jSONObject.put("mfaEnrollmentId", this.zzc);
        this.zza.getClass();
        jSONObject.put("mfaProvider", 1);
        if (this.zze != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("phoneNumber", this.zze);
            if (!TextUtils.isEmpty(this.zzf)) {
                jSONObject2.put("recaptchaToken", this.zzf);
            }
            if (!TextUtils.isEmpty(this.zzg)) {
                jSONObject2.put("playIntegrityToken", this.zzg);
            }
            String str = this.zzh;
            if (str != null) {
                zzaid.zza(jSONObject2, "captchaResponse", str);
            } else {
                zzaid.zza(jSONObject2);
            }
            zzafg zzafgVar = this.zzi;
            if (zzafgVar != null) {
                jSONObject2.put("autoRetrievalInfo", zzafgVar.zza());
            }
            jSONObject.put("phoneSignInInfo", jSONObject2);
        }
        return jSONObject.toString();
    }

    public final void zza(zzafg zzafgVar) {
        this.zzi = zzafgVar;
    }
}
