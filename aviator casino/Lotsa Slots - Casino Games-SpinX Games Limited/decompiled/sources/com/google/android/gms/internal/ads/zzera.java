package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzera implements com.google.android.gms.ads.internal.zzg {
    final java.util.concurrent.atomic.AtomicBoolean zza = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final com.google.android.gms.internal.ads.zzdcp zzb;
    private final com.google.android.gms.internal.ads.zzddj zzc;
    private final com.google.android.gms.internal.ads.zzdla zzd;
    private final com.google.android.gms.internal.ads.zzdks zze;
    private final com.google.android.gms.internal.ads.zzcug zzf;

    zzera(com.google.android.gms.internal.ads.zzdcp zzdcpVar, com.google.android.gms.internal.ads.zzddj zzddjVar, com.google.android.gms.internal.ads.zzdla zzdlaVar, com.google.android.gms.internal.ads.zzdks zzdksVar, com.google.android.gms.internal.ads.zzcug zzcugVar) {
        this.zzb = zzdcpVar;
        this.zzc = zzddjVar;
        this.zzd = zzdlaVar;
        this.zze = zzdksVar;
        this.zzf = zzcugVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final synchronized void zza(android.view.View view) {
        if (this.zza.compareAndSet(false, true)) {
            this.zzf.zzdr();
            this.zze.zza(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
        if (this.zza.get()) {
            this.zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        if (this.zza.get()) {
            this.zzc.zza();
            this.zzd.zza();
        }
    }
}
