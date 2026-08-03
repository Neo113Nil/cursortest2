package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfnp {
    private final com.google.android.gms.internal.ads.zzfnh zza;
    private final com.google.common.util.concurrent.ListenableFuture zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzfnp(final com.google.android.gms.internal.ads.zzfmn zzfmnVar, final com.google.android.gms.internal.ads.zzfng zzfngVar, final com.google.android.gms.internal.ads.zzfnh zzfnhVar) {
        this.zza = zzfnhVar;
        this.zzb = com.google.android.gms.internal.ads.zzhbw.zzh(com.google.android.gms.internal.ads.zzhbw.zzj(zzfngVar.zza(zzfnhVar), new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzfno
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzfnp.this.zzc(zzfngVar, zzfmnVar, zzfnhVar, (com.google.android.gms.internal.ads.zzfmw) obj);
            }
        }, zzfnhVar.zza()), java.lang.Exception.class, new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzfnm
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzfnp.this.zzd(zzfngVar, (java.lang.Exception) obj);
            }
        }, zzfnhVar.zza());
    }

    public final synchronized void zza(com.google.android.gms.internal.ads.zzhbt zzhbtVar) {
        com.google.android.gms.internal.ads.zzfnh zzfnhVar = this.zza;
        com.google.android.gms.internal.ads.zzhbw.zzr(com.google.android.gms.internal.ads.zzhbw.zzj(this.zzb, com.google.android.gms.internal.ads.zzfnn.zza, zzfnhVar.zza()), zzhbtVar, zzfnhVar.zza());
    }

    public final synchronized com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzfnh zzfnhVar) {
        if (!this.zzd && !this.zzc) {
            com.google.android.gms.internal.ads.zzfnh zzfnhVar2 = this.zza;
            if (zzfnhVar2.zzb() != null && zzfnhVar.zzb() != null && zzfnhVar2.zzb().equals(zzfnhVar.zzb())) {
                this.zzc = true;
                return this.zzb;
            }
        }
        return null;
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzfng zzfngVar, com.google.android.gms.internal.ads.zzfmn zzfmnVar, com.google.android.gms.internal.ads.zzfnh zzfnhVar, com.google.android.gms.internal.ads.zzfmw zzfmwVar) {
        com.google.common.util.concurrent.ListenableFuture zza;
        synchronized (this) {
            this.zzd = true;
            zzfngVar.zzb(zzfmwVar);
            if (this.zzc) {
                zza = com.google.android.gms.internal.ads.zzhbw.zza(new com.google.android.gms.internal.ads.zzfnf(zzfmwVar, zzfnhVar));
            } else {
                zzfmnVar.zzb(zzfnhVar.zzb(), zzfmwVar);
                zza = com.google.android.gms.internal.ads.zzhbw.zza(null);
            }
        }
        return zza;
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzd(com.google.android.gms.internal.ads.zzfng zzfngVar, java.lang.Exception exc) {
        synchronized (this) {
            this.zzd = true;
            throw exc;
        }
    }
}
