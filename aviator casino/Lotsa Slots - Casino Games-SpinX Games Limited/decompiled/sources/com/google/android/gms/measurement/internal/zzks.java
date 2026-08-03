package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzks implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzaz zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzli zzb;

    zzks(com.google.android.gms.measurement.internal.zzli zzliVar, com.google.android.gms.measurement.internal.zzaz zzazVar) {
        this.zza = zzazVar;
        java.util.Objects.requireNonNull(zzliVar);
        this.zzb = zzliVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzli zzliVar = this.zzb;
        com.google.android.gms.measurement.internal.zzib zzibVar = zzliVar.zzu;
        com.google.android.gms.measurement.internal.zzhg zzd = zzibVar.zzd();
        com.google.android.gms.measurement.internal.zzib zzibVar2 = zzd.zzu;
        zzd.zzg();
        com.google.android.gms.measurement.internal.zzaz zzj = zzd.zzj();
        com.google.android.gms.measurement.internal.zzaz zzazVar = this.zza;
        if (!com.google.android.gms.measurement.internal.zzjk.zzu(zzazVar.zzb(), zzj.zzb())) {
            zzibVar.zzaV().zzi().zzb("Lower precedence consent source ignored, proposed source", java.lang.Integer.valueOf(zzazVar.zzb()));
            return;
        }
        android.content.SharedPreferences.Editor edit = zzd.zzd().edit();
        edit.putString("dma_consent_settings", zzazVar.zze());
        edit.apply();
        zzibVar.zzaV().zzk().zzb("Setting DMA consent(FE)", zzazVar);
        com.google.android.gms.measurement.internal.zzib zzibVar3 = zzliVar.zzu;
        if (zzibVar3.zzt().zzP()) {
            zzibVar3.zzt().zzl();
        } else {
            zzibVar3.zzt().zzj(false);
        }
    }
}
