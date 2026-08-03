package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbrk implements com.google.android.gms.internal.ads.zzhbe {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbrc zza;

    zzbrk(com.google.android.gms.internal.ads.zzbro zzbroVar, com.google.android.gms.internal.ads.zzbrc zzbrcVar) {
        this.zza = zzbrcVar;
        java.util.Objects.requireNonNull(zzbroVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) throws java.lang.Exception {
        com.google.android.gms.internal.ads.zzcfw zzcfwVar = new com.google.android.gms.internal.ads.zzcfw();
        ((com.google.android.gms.internal.ads.zzbri) obj).zze(this.zza, new com.google.android.gms.internal.ads.zzbrj(this, zzcfwVar));
        return zzcfwVar;
    }
}
