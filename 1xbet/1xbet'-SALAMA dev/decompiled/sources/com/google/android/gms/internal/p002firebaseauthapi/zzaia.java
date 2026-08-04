package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.D;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzaia implements zzadq {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private boolean zzf;

    private zzaia() {
    }

    public static zzaia zza(String str, String str2, boolean z4) {
        zzaia zzaiaVar = new zzaia();
        D.e(str);
        zzaiaVar.zzb = str;
        D.e(str2);
        zzaiaVar.zzc = str2;
        zzaiaVar.zzf = z4;
        return zzaiaVar;
    }

    public static zzaia zzb(String str, String str2, boolean z4) {
        zzaia zzaiaVar = new zzaia();
        D.e(str);
        zzaiaVar.zza = str;
        D.e(str2);
        zzaiaVar.zzd = str2;
        zzaiaVar.zzf = z4;
        return zzaiaVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadq
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.zzd)) {
            jSONObject.put("phoneNumber", this.zza);
            jSONObject.put("temporaryProof", this.zzd);
        } else {
            jSONObject.put("sessionInfo", this.zzb);
            jSONObject.put("code", this.zzc);
        }
        String str = this.zze;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        if (!this.zzf) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }

    public final void zza(String str) {
        this.zze = str;
    }
}
