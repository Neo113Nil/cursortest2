package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.D;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzagz implements zzadq {
    private final String zza;
    private final long zzb;
    private final boolean zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;
    private final boolean zzi;
    private zzafg zzj;

    public zzagz(String str, long j, boolean z4, String str2, String str3, String str4, String str5, String str6, boolean z7) {
        D.e(str);
        this.zza = str;
        this.zzb = j;
        this.zzc = z4;
        this.zzd = str2;
        this.zze = str3;
        this.zzf = str4;
        this.zzg = str5;
        this.zzh = str6;
        this.zzi = z7;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadq
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("phoneNumber", this.zza);
        String str = this.zze;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        String str2 = this.zzf;
        if (str2 != null) {
            jSONObject.put("recaptchaToken", str2);
        }
        zzafg zzafgVar = this.zzj;
        if (zzafgVar != null) {
            jSONObject.put("autoRetrievalInfo", zzafgVar.zza());
        }
        String str3 = this.zzg;
        if (str3 != null) {
            jSONObject.put("playIntegrityToken", str3);
        }
        String str4 = this.zzh;
        if (str4 != null) {
            zzaid.zza(jSONObject, "captchaResponse", str4);
        } else {
            zzaid.zza(jSONObject);
        }
        return jSONObject.toString();
    }

    public final long zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }

    public final boolean zzf() {
        return this.zzi;
    }

    public final void zza(zzafg zzafgVar) {
        this.zzj = zzafgVar;
    }
}
