package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfgz implements com.google.android.gms.internal.ads.zzfng {
    private final com.google.android.gms.internal.ads.zzfhw zza;

    public zzfgz(com.google.android.gms.internal.ads.zzfhw zzfhwVar) {
        this.zza = zzfhwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfng
    public final com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzfnh zzfnhVar) {
        com.google.android.gms.internal.ads.zzfhc zzfhcVar = (com.google.android.gms.internal.ads.zzfhc) zzfnhVar;
        return ((com.google.android.gms.internal.ads.zzfgy) this.zza).zzb(zzfhcVar.zzb, zzfhcVar.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfng
    public final void zzb(com.google.android.gms.internal.ads.zzfmw zzfmwVar) {
        zzfmwVar.zza = ((com.google.android.gms.internal.ads.zzfgy) this.zza).zza();
    }
}
