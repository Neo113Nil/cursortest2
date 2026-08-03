package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzjv implements com.google.common.util.concurrent.FutureCallback {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzog zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzli zzb;

    zzjv(com.google.android.gms.measurement.internal.zzli zzliVar, com.google.android.gms.measurement.internal.zzog zzogVar) {
        this.zza = zzogVar;
        java.util.Objects.requireNonNull(zzliVar);
        this.zzb = zzliVar;
    }

    private final void zza() {
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzb.zzu;
        android.util.SparseArray zzf = zzibVar.zzd().zzf();
        com.google.android.gms.measurement.internal.zzog zzogVar = this.zza;
        zzf.put(zzogVar.zzc, java.lang.Long.valueOf(zzogVar.zzb));
        com.google.android.gms.measurement.internal.zzhg zzd = zzibVar.zzd();
        int[] iArr = new int[zzf.size()];
        long[] jArr = new long[zzf.size()];
        for (int i = 0; i < zzf.size(); i++) {
            iArr[i] = zzf.keyAt(i);
            jArr[i] = ((java.lang.Long) zzf.valueAt(i)).longValue();
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        zzd.zzi.zzb(bundle);
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void onFailure(java.lang.Throwable th) {
        com.google.android.gms.measurement.internal.zzli zzliVar = this.zzb;
        zzliVar.zzg();
        zzliVar.zzal(false);
        com.google.android.gms.measurement.internal.zzib zzibVar = zzliVar.zzu;
        int zzap = (zzibVar.zzc().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzaT) ? zzliVar.zzap(th) : 2) - 1;
        if (zzap == 0) {
            zzibVar.zzaV().zze().zzc("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", com.google.android.gms.measurement.internal.zzgt.zzl(zzliVar.zzu.zzv().zzj()), com.google.android.gms.measurement.internal.zzgt.zzl(th.toString()));
            zzliVar.zzan(1);
            zzliVar.zzy().add(this.zza);
            return;
        }
        if (zzap != 1) {
            zzibVar.zzaV().zzb().zzc("registerTriggerAsync failed. Dropping URI. App ID, Throwable", com.google.android.gms.measurement.internal.zzgt.zzl(zzliVar.zzu.zzv().zzj()), th);
            zza();
            zzliVar.zzan(1);
            zzliVar.zzz();
            return;
        }
        zzliVar.zzy().add(this.zza);
        if (zzliVar.zzam() > ((java.lang.Integer) com.google.android.gms.measurement.internal.zzfx.zzaw.zzb(null)).intValue()) {
            zzliVar.zzan(1);
            zzibVar.zzaV().zze().zzc("registerTriggerAsync failed. May try later. App ID, throwable", com.google.android.gms.measurement.internal.zzgt.zzl(zzliVar.zzu.zzv().zzj()), com.google.android.gms.measurement.internal.zzgt.zzl(th.toString()));
        } else {
            zzibVar.zzaV().zze().zzd("registerTriggerAsync failed. App ID, delay in seconds, throwable", com.google.android.gms.measurement.internal.zzgt.zzl(zzliVar.zzu.zzv().zzj()), com.google.android.gms.measurement.internal.zzgt.zzl(java.lang.String.valueOf(zzliVar.zzam())), com.google.android.gms.measurement.internal.zzgt.zzl(th.toString()));
            zzliVar.zzah(zzliVar.zzam());
            int zzam = zzliVar.zzam();
            zzliVar.zzan(zzam + zzam);
        }
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void onSuccess(java.lang.Object obj) {
        com.google.android.gms.measurement.internal.zzli zzliVar = this.zzb;
        zzliVar.zzg();
        zza();
        zzliVar.zzal(false);
        zzliVar.zzan(1);
        zzliVar.zzu.zzaV().zzj().zzb("Successfully registered trigger URI", this.zza.zza);
        zzliVar.zzz();
    }
}
