package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzoa {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzob zza;

    zzoa(com.google.android.gms.measurement.internal.zzob zzobVar) {
        java.util.Objects.requireNonNull(zzobVar);
        this.zza = zzobVar;
    }

    final void zza() {
        com.google.android.gms.measurement.internal.zzob zzobVar = this.zza;
        zzobVar.zzg();
        com.google.android.gms.measurement.internal.zzib zzibVar = zzobVar.zzu;
        if (zzibVar.zzd().zzp(zzibVar.zzaZ().currentTimeMillis())) {
            zzibVar.zzd().zzg.zzb(true);
            android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new android.app.ActivityManager.RunningAppProcessInfo();
            android.app.ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                zzibVar.zzaV().zzk().zza("Detected application was in foreground");
                zzc(zzibVar.zzaZ().currentTimeMillis(), false);
            }
        }
    }

    final void zzb(long j, boolean z) {
        com.google.android.gms.measurement.internal.zzob zzobVar = this.zza;
        zzobVar.zzg();
        zzobVar.zzj();
        com.google.android.gms.measurement.internal.zzib zzibVar = zzobVar.zzu;
        if (zzibVar.zzd().zzp(j)) {
            zzibVar.zzd().zzg.zzb(true);
            zzobVar.zzu.zzv().zzi();
        }
        zzibVar.zzd().zzk.zzb(j);
        if (zzibVar.zzd().zzg.zza()) {
            zzc(j, z);
        }
    }

    final void zzc(long j, boolean z) {
        com.google.android.gms.measurement.internal.zzob zzobVar = this.zza;
        zzobVar.zzg();
        if (zzobVar.zzu.zzB()) {
            com.google.android.gms.measurement.internal.zzib zzibVar = zzobVar.zzu;
            zzibVar.zzd().zzk.zzb(j);
            zzibVar.zzaV().zzk().zzb("Session started, time", java.lang.Long.valueOf(zzibVar.zzaZ().elapsedRealtime()));
            long j2 = j / 1000;
            com.google.android.gms.measurement.internal.zzib zzibVar2 = zzobVar.zzu;
            java.lang.Long valueOf = java.lang.Long.valueOf(j2);
            zzibVar2.zzj().zzN("auto", "_sid", valueOf, j);
            com.google.android.gms.measurement.internal.zzhd zzhdVar = zzibVar.zzd().zzl;
            valueOf.getClass();
            zzhdVar.zzb(j2);
            zzibVar.zzd().zzg.zzb(false);
            android.os.Bundle bundle = new android.os.Bundle();
            valueOf.getClass();
            bundle.putLong("_sid", j2);
            zzibVar2.zzj().zzG("auto", "_s", j, bundle);
            java.lang.String zza = zzibVar.zzd().zzq.zza();
            if (android.text.TextUtils.isEmpty(zza)) {
                return;
            }
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("_ffr", zza);
            zzibVar2.zzj().zzG("auto", "_ssr", j, bundle2);
        }
    }
}
