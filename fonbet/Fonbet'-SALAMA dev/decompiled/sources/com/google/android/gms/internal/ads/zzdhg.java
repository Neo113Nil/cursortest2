package com.google.android.gms.internal.ads;

import Y4.D;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdhg extends zzdhh {
    private final JSONObject zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;
    private final boolean zzf;
    private final String zzg;
    private final JSONObject zzh;

    public zzdhg(zzfaf zzfafVar, JSONObject jSONObject) {
        super(zzfafVar);
        String[] strArr = {"tracking_urls_and_actions", "active_view"};
        JSONObject J02 = D.J0(jSONObject, strArr);
        this.zzb = J02 == null ? null : J02.optJSONObject(strArr[1]);
        String[] strArr2 = {"allow_pub_owned_ad_view"};
        JSONObject J03 = D.J0(jSONObject, strArr2);
        this.zzc = J03 == null ? false : J03.optBoolean(strArr2[0], false);
        String[] strArr3 = {"attribution", "allow_pub_rendering"};
        JSONObject J04 = D.J0(jSONObject, strArr3);
        this.zzd = J04 == null ? false : J04.optBoolean(strArr3[1], false);
        String[] strArr4 = {"enable_omid"};
        JSONObject J05 = D.J0(jSONObject, strArr4);
        this.zze = J05 == null ? false : J05.optBoolean(strArr4[0], false);
        String[] strArr5 = {"watermark_overlay_png_base64"};
        JSONObject J06 = D.J0(jSONObject, strArr5);
        this.zzg = J06 != null ? J06.optString(strArr5[0], "") : "";
        this.zzf = jSONObject.optJSONObject("overlay") != null;
        this.zzh = jSONObject.optJSONObject("omid_settings");
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final zzfbd zza() {
        JSONObject jSONObject = this.zzh;
        return jSONObject != null ? new zzfbd(jSONObject) : this.zza.zzV;
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final String zzb() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final JSONObject zzc() {
        JSONObject jSONObject = this.zzb;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.zza.zzz);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final boolean zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final boolean zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final boolean zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final boolean zzg() {
        return this.zzf;
    }
}
