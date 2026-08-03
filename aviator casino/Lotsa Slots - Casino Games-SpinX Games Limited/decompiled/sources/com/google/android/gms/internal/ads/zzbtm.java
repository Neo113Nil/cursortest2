package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbtm implements com.google.android.gms.internal.ads.zzcga {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbto zza;

    zzbtm(com.google.android.gms.internal.ads.zzbto zzbtoVar) {
        java.util.Objects.requireNonNull(zzbtoVar);
        this.zza = zzbtoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("Releasing engine reference.");
        this.zza.zzb().zzb();
    }
}
