package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbox implements com.google.android.libraries.places.internal.zzbzh {
    private static final java.util.logging.Logger zzd = java.util.logging.Logger.getLogger(com.google.android.libraries.places.internal.zzbox.class.getName());
    private final java.util.concurrent.ScheduledExecutorService zza;
    private final com.google.android.libraries.places.internal.zzbnx zzb;
    private com.google.android.libraries.places.internal.zzbnw zzc;
    private com.google.android.libraries.places.internal.zzbsh zze;

    @Override // com.google.android.libraries.places.internal.zzbzh
    public final void zza(java.lang.Runnable runnable) {
        com.google.android.libraries.places.internal.zzbnx zzbnxVar = this.zzb;
        zzbnxVar.zzc();
        if (this.zze == null) {
            this.zze = new com.google.android.libraries.places.internal.zzbsh();
        }
        com.google.android.libraries.places.internal.zzbnw zzbnwVar = this.zzc;
        if (zzbnwVar == null || !zzbnwVar.zzb()) {
            long zza = this.zze.zza();
            this.zzc = zzbnxVar.zzd(runnable, zza, java.util.concurrent.TimeUnit.NANOSECONDS, this.zza);
            zzd.logp(java.util.logging.Level.FINE, "io.grpc.internal.BackoffPolicyRetryScheduler", "schedule", "Scheduling DNS resolution backoff for {0}ns", java.lang.Long.valueOf(zza));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbzh
    public final void zzb() {
        com.google.android.libraries.places.internal.zzbnx zzbnxVar = this.zzb;
        zzbnxVar.zzc();
        zzbnxVar.zzb(new java.lang.Runnable() { // from class: com.google.android.libraries.places.internal.zzbow
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.libraries.places.internal.zzbox.this.zzc();
            }
        });
        zzbnxVar.zza();
    }

    final /* synthetic */ void zzc() {
        com.google.android.libraries.places.internal.zzbnw zzbnwVar = this.zzc;
        if (zzbnwVar != null && zzbnwVar.zzb()) {
            this.zzc.zza();
        }
        this.zze = null;
    }

    zzbox(com.google.android.libraries.places.internal.zzbsg zzbsgVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.libraries.places.internal.zzbnx zzbnxVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzbnxVar;
    }
}
