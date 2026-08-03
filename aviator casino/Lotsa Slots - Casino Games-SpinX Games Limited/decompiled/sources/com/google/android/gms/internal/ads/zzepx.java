package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzepx implements com.google.android.gms.internal.ads.zzelu {
    private final java.util.Map zza = new java.util.HashMap();
    private final com.google.android.gms.internal.ads.zzdxc zzb;

    public zzepx(com.google.android.gms.internal.ads.zzdxc zzdxcVar) {
        this.zzb = zzdxcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelu
    public final com.google.android.gms.internal.ads.zzelv zza(java.lang.String str, org.json.JSONObject jSONObject) throws com.google.android.gms.internal.ads.zzflf {
        com.google.android.gms.internal.ads.zzelv zzelvVar;
        synchronized (this) {
            java.util.Map map = this.zza;
            zzelvVar = (com.google.android.gms.internal.ads.zzelv) map.get(str);
            if (zzelvVar == null) {
                zzelvVar = new com.google.android.gms.internal.ads.zzelv(this.zzb.zza(str, jSONObject), new com.google.android.gms.internal.ads.zzeni(), str);
                map.put(str, zzelvVar);
            }
        }
        return zzelvVar;
    }
}
