package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcxi implements com.google.android.gms.internal.ads.zzdef, com.google.android.gms.internal.ads.zzbeq, com.google.android.gms.internal.ads.zzdht {
    private final com.google.android.gms.internal.ads.zzfkf zza;
    private final com.google.android.gms.internal.ads.zzddj zzb;
    private final com.google.android.gms.internal.ads.zzdeo zzc;
    private final com.google.android.gms.internal.ads.zzdfk zzf;
    private final java.util.concurrent.atomic.AtomicBoolean zzd = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.concurrent.atomic.AtomicBoolean zze = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.concurrent.atomic.AtomicBoolean zzg = new java.util.concurrent.atomic.AtomicBoolean();

    public zzcxi(com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzddj zzddjVar, com.google.android.gms.internal.ads.zzdeo zzdeoVar, com.google.android.gms.internal.ads.zzdfk zzdfkVar) {
        this.zza = zzfkfVar;
        this.zzb = zzddjVar;
        this.zzc = zzdeoVar;
        this.zzf = zzdfkVar;
    }

    private final void zzd() {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdht
    public final void zzdH() {
        if (this.zza.zze == 4) {
            zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdht
    public final void zzdI() {
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final synchronized void zzg() {
        int i = this.zza.zze;
        if (i == 1 || i == 4) {
            return;
        }
        zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final void zzdj(com.google.android.gms.internal.ads.zzbep zzbepVar) {
        int i = this.zza.zze;
        if (i == 1) {
            if (zzbepVar.zzj) {
                zzd();
            }
        } else if (i == 4 && zzbepVar.zzj && this.zzg.compareAndSet(false, true)) {
            this.zzf.zza();
        }
        if (zzbepVar.zzj && this.zze.compareAndSet(false, true)) {
            this.zzc.zza();
        }
    }
}
