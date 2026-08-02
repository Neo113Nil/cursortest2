package com.google.android.gms.internal.ads;

import F2.C0254t;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class zzdtj {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final int zzd;
    private final String zze;
    private final int zzf;
    private final boolean zzg;

    public zzdtj(String str, String str2, String str3, int i7, String str4, int i8, boolean z4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = i7;
        this.zze = str4;
        this.zzf = i8;
        this.zzg = z4;
    }

    public final JSONObject zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.zza);
        jSONObject.put("version", this.zzc);
        zzbbp zzbbpVar = zzbby.zzjq;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            jSONObject.put("sdkVersion", this.zzb);
        }
        jSONObject.put("status", this.zzd);
        jSONObject.put("description", this.zze);
        jSONObject.put("initializationLatencyMillis", this.zzf);
        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzjr)).booleanValue()) {
            jSONObject.put("supportsInitialization", this.zzg);
        }
        return jSONObject;
    }
}
