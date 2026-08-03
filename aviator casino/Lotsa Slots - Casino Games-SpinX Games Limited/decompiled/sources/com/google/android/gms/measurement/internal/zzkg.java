package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzkg implements java.lang.Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzli zzb;

    zzkg(com.google.android.gms.measurement.internal.zzli zzliVar, long j) {
        this.zza = j;
        java.util.Objects.requireNonNull(zzliVar);
        this.zzb = zzliVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzli zzliVar = this.zzb;
        zzliVar.zzg();
        zzliVar.zzb();
        com.google.android.gms.measurement.internal.zzib zzibVar = zzliVar.zzu;
        zzibVar.zzaV().zzj().zza("Resetting analytics data (FE)");
        com.google.android.gms.measurement.internal.zzib zzibVar2 = zzliVar.zzu;
        com.google.android.gms.measurement.internal.zzob zzh = zzibVar2.zzh();
        zzh.zzg();
        com.google.android.gms.measurement.internal.zzoa zzoaVar = zzh.zza;
        zzh.zzb.zzc();
        zzibVar2.zzv().zzi();
        boolean z = !zzliVar.zzu.zzB();
        com.google.android.gms.measurement.internal.zzhg zzd = zzibVar.zzd();
        zzd.zzc.zzb(this.zza);
        com.google.android.gms.measurement.internal.zzib zzibVar3 = zzd.zzu;
        if (!android.text.TextUtils.isEmpty(zzibVar3.zzd().zzq.zza())) {
            zzd.zzq.zzb(null);
        }
        zzd.zzk.zzb(0L);
        zzd.zzl.zzb(0L);
        if (!zzibVar3.zzc().zzt()) {
            zzd.zzn(z);
        }
        zzd.zzr.zzb(null);
        zzd.zzs.zzb(0L);
        zzd.zzt.zzb(null);
        zzibVar2.zzt().zzB();
        zzibVar2.zzh().zza.zza();
        zzliVar.zzc = z;
        zzibVar2.zzt().zzC(new java.util.concurrent.atomic.AtomicReference());
    }
}
