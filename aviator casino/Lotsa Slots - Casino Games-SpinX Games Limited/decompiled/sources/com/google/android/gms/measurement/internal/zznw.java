package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zznw implements java.lang.Runnable {
    final long zza;
    final long zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zznx zzc;

    zznw(com.google.android.gms.measurement.internal.zznx zznxVar, long j, long j2) {
        java.util.Objects.requireNonNull(zznxVar);
        this.zzc = zznxVar;
        this.zza = j;
        this.zzb = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zzu.zzaW().zzj(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zznv
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.measurement.internal.zznw zznwVar = com.google.android.gms.measurement.internal.zznw.this;
                com.google.android.gms.measurement.internal.zzob zzobVar = zznwVar.zzc.zza;
                zzobVar.zzg();
                com.google.android.gms.measurement.internal.zzib zzibVar = zzobVar.zzu;
                zzibVar.zzaV().zzj().zza("Application going to the background");
                zzibVar.zzd().zzn.zzb(true);
                zzobVar.zzh(true);
                if (!zzibVar.zzc().zzv()) {
                    long j = zznwVar.zzb;
                    com.google.android.gms.measurement.internal.zznz zznzVar = zzobVar.zzb;
                    zznzVar.zzd(false, false, j);
                    zznzVar.zzb(j);
                }
                zzibVar.zzaV().zzi().zzb("Application backgrounded at: timestamp_millis", java.lang.Long.valueOf(zznwVar.zza));
                com.google.android.gms.measurement.internal.zzib zzibVar2 = zzobVar.zzu;
                com.google.android.gms.measurement.internal.zzli zzj = zzibVar2.zzj();
                zzj.zzg();
                com.google.android.gms.measurement.internal.zzib zzibVar3 = zzj.zzu;
                zzj.zzb();
                com.google.android.gms.measurement.internal.zznk zzt = zzibVar3.zzt();
                zzt.zzg();
                zzt.zzb();
                if (!zzt.zzK() || zzt.zzu.zzk().zzah() >= 242600) {
                    zzibVar3.zzt().zzF();
                }
                if (zzibVar.zzc().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzaN)) {
                    long zzl = zzibVar.zzk().zzaa(zzibVar.zzaY().getPackageName(), zzibVar.zzc().zzz()) ? 1000L : zzibVar.zzc().zzl(zzibVar.zzaY().getPackageName(), com.google.android.gms.measurement.internal.zzfx.zzD);
                    zzibVar.zzaV().zzk().zzb("[sgtm] Scheduling batch upload with minimum latency in millis", java.lang.Long.valueOf(zzl));
                    zzibVar2.zzx().zzh(zzl);
                }
            }
        });
    }
}
