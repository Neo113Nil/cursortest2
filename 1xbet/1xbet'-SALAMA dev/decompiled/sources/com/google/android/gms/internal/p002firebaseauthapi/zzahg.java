package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.D;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzahg implements zzadq {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;

    public zzahg(String str) {
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadq
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.zza;
        if (str != null) {
            jSONObject.put("email", str);
        }
        String str2 = this.zzb;
        if (str2 != null) {
            jSONObject.put(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, str2);
        }
        String str3 = this.zzc;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.zzd;
        if (str4 != null) {
            zzaid.zza(jSONObject, "captchaResponse", str4);
        } else {
            zzaid.zza(jSONObject);
        }
        String str5 = this.zze;
        if (str5 != null) {
            jSONObject.put("idToken", str5);
        }
        return jSONObject.toString();
    }

    public zzahg(String str, String str2, String str3, String str4, String str5, String str6) {
        D.e(str);
        this.zza = str;
        D.e(str2);
        this.zzb = str2;
        this.zzc = str4;
        this.zzd = str5;
        this.zze = str6;
    }
}
