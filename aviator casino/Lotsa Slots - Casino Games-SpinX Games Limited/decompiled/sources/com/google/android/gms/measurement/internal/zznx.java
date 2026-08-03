package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zznx {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzob zza;
    private com.google.android.gms.measurement.internal.zznw zzb;

    zznx(com.google.android.gms.measurement.internal.zzob zzobVar) {
        java.util.Objects.requireNonNull(zzobVar);
        this.zza = zzobVar;
    }

    final void zza() {
        com.google.android.gms.measurement.internal.zzob zzobVar = this.zza;
        zzobVar.zzg();
        com.google.android.gms.measurement.internal.zznw zznwVar = this.zzb;
        if (zznwVar != null) {
            zzobVar.zzm().removeCallbacks(zznwVar);
        }
        com.google.android.gms.measurement.internal.zzib zzibVar = zzobVar.zzu;
        zzibVar.zzd().zzn.zzb(false);
        zzobVar.zzh(false);
        if (zzibVar.zzc().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzaT)) {
            com.google.android.gms.measurement.internal.zzib zzibVar2 = zzobVar.zzu;
            if (zzibVar2.zzj().zzx()) {
                zzibVar.zzaV().zzk().zza("Retrying trigger URI registration in foreground");
                zzibVar2.zzj().zzz();
            }
        }
    }

    final void zzb(long j) {
        com.google.android.gms.measurement.internal.zzob zzobVar = this.zza;
        this.zzb = new com.google.android.gms.measurement.internal.zznw(this, zzobVar.zzu.zzaZ().currentTimeMillis(), j);
        zzobVar.zzm().postDelayed(this.zzb, 2000L);
    }
}
