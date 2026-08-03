package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbqf implements com.google.android.gms.internal.ads.zzbqg {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcfw zza;

    zzbqf(com.google.android.gms.internal.ads.zzbqh zzbqhVar, com.google.android.gms.internal.ads.zzcfw zzcfwVar) {
        this.zza = zzcfwVar;
        java.util.Objects.requireNonNull(zzbqhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final void zza(org.json.JSONObject jSONObject) {
        this.zza.zzc(jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final void zzb(java.lang.String str) {
        this.zza.zzd(new com.google.android.gms.internal.ads.zzbtx(str));
    }
}
