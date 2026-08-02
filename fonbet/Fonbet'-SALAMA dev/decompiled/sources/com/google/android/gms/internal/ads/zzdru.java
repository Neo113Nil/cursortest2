package com.google.android.gms.internal.ads;

import F2.C0254t;
import I2.J;
import J2.j;
import org.json.JSONException;
import org.json.JSONObject;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
final class zzdru {
    private Long zza;
    private final String zzb;
    private String zzc;
    private Integer zzd;
    private String zze;
    private Integer zzf;

    public /* synthetic */ zzdru(String str, zzdrv zzdrvVar) {
        this.zzb = str;
    }

    public static String zza(zzdru zzdruVar) {
        String str = (String) C0254t.f2723d.f2726c.zzb(zzbby.zzjX);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", zzdruVar.zza);
            jSONObject.put("eventCategory", zzdruVar.zzb);
            jSONObject.putOpt("event", zzdruVar.zzc);
            jSONObject.putOpt("errorCode", zzdruVar.zzd);
            jSONObject.putOpt("rewardType", zzdruVar.zze);
            jSONObject.putOpt("rewardAmount", zzdruVar.zzf);
        } catch (JSONException unused) {
            int i7 = J.f3546b;
            j.g("Could not convert parameters to JSON.");
        }
        return AbstractC1663a.o(str, "(\"h5adsEvent\",", jSONObject.toString(), ");");
    }
}
