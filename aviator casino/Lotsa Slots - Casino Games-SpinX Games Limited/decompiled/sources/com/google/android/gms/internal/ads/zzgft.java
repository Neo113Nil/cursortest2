package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgft implements com.google.android.gms.internal.ads.zzhbe {
    final /* synthetic */ com.google.android.gms.internal.ads.zzgfy zza;

    zzgft(com.google.android.gms.internal.ads.zzgfy zzgfyVar) {
        java.util.Objects.requireNonNull(zzgfyVar);
        this.zza = zzgfyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) throws java.lang.Exception {
        com.google.android.gms.internal.ads.zzgfr zzgfrVar = (com.google.android.gms.internal.ads.zzgfr) obj;
        if (zzgfrVar != null) {
            return com.google.android.gms.internal.ads.zzhbw.zza(zzgfrVar);
        }
        com.google.android.gms.internal.ads.zzgfy zzgfyVar = this.zza;
        zzgfyVar.zza().zzb(51);
        return zzgfyVar.zzd(zzgfyVar.zze());
    }
}
