package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbsq implements com.google.android.gms.internal.ads.zzbpq {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbsx zza;
    private final com.google.android.gms.internal.ads.zzbpq zzb;

    public zzbsq(com.google.android.gms.internal.ads.zzbsx zzbsxVar, com.google.android.gms.internal.ads.zzbpq zzbpqVar) {
        java.util.Objects.requireNonNull(zzbsxVar);
        this.zza = zzbsxVar;
        this.zzb = zzbpqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        this.zzb.zza(this.zza, map);
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzbpq zzb() {
        return this.zzb;
    }
}
