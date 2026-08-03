package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zznd implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.ConnectionResult zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzne zzb;

    zznd(com.google.android.gms.measurement.internal.zzne zzneVar, com.google.android.gms.common.ConnectionResult connectionResult) {
        this.zza = connectionResult;
        java.util.Objects.requireNonNull(zzneVar);
        this.zzb = zzneVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zznk zznkVar = this.zzb.zza;
        zznkVar.zzaa(null);
        if (this.zza.getErrorCode() != 7777) {
            zznkVar.zzX();
            return;
        }
        if (zznkVar.zzab() == null) {
            zznkVar.zzac(java.util.concurrent.Executors.newScheduledThreadPool(1));
        }
        zznkVar.zzab().schedule(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zznb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                final com.google.android.gms.measurement.internal.zznk zznkVar2 = com.google.android.gms.measurement.internal.zznd.this.zzb.zza;
                com.google.android.gms.measurement.internal.zzhy zzaW = zznkVar2.zzu.zzaW();
                java.util.Objects.requireNonNull(zznkVar2);
                zzaW.zzj(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zznc
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.measurement.internal.zznk.this.zzI();
                    }
                });
            }
        }, ((java.lang.Long) com.google.android.gms.measurement.internal.zzfx.zzZ.zzb(null)).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
    }
}
