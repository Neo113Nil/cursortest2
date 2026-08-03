package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzenx implements com.google.android.gms.internal.ads.zzelu {
    private final com.google.android.gms.internal.ads.zzdxc zza;

    public zzenx(com.google.android.gms.internal.ads.zzdxc zzdxcVar) {
        this.zza = zzdxcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelu
    public final com.google.android.gms.internal.ads.zzelv zza(java.lang.String str, org.json.JSONObject jSONObject) throws com.google.android.gms.internal.ads.zzflf {
        return new com.google.android.gms.internal.ads.zzelv(this.zza.zza(str, jSONObject), new com.google.android.gms.internal.ads.zzenh(), str);
    }
}
