package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zznz {
    protected long zza;
    protected long zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzob zzc;
    private final com.google.android.gms.measurement.internal.zzay zzd;

    public zznz(com.google.android.gms.measurement.internal.zzob zzobVar) {
        java.util.Objects.requireNonNull(zzobVar);
        this.zzc = zzobVar;
        this.zzd = new com.google.android.gms.measurement.internal.zzny(this, zzobVar.zzu);
        long elapsedRealtime = zzobVar.zzu.zzaZ().elapsedRealtime();
        this.zza = elapsedRealtime;
        this.zzb = elapsedRealtime;
    }

    final void zza(long j) {
        this.zzc.zzg();
        this.zzd.zzd();
        this.zza = j;
        this.zzb = j;
    }

    final void zzb(long j) {
        this.zzd.zzd();
    }

    final void zzc() {
        this.zzd.zzd();
        long elapsedRealtime = this.zzc.zzu.zzaZ().elapsedRealtime();
        this.zza = elapsedRealtime;
        this.zzb = elapsedRealtime;
    }

    public final boolean zzd(boolean z, boolean z2, long j) {
        com.google.android.gms.measurement.internal.zzob zzobVar = this.zzc;
        zzobVar.zzg();
        zzobVar.zzb();
        if (zzobVar.zzu.zzB()) {
            com.google.android.gms.measurement.internal.zzib zzibVar = zzobVar.zzu;
            zzibVar.zzd().zzk.zzb(zzibVar.zzaZ().currentTimeMillis());
        }
        long j2 = j - this.zza;
        if (!z && j2 < 1000) {
            zzobVar.zzu.zzaV().zzk().zzb("Screen exposed for less than 1000 ms. Event not sent. time", java.lang.Long.valueOf(j2));
            return false;
        }
        if (!z2) {
            j2 = j - this.zzb;
            this.zzb = j;
        }
        com.google.android.gms.measurement.internal.zzib zzibVar2 = zzobVar.zzu;
        zzibVar2.zzaV().zzk().zzb("Recording user engagement, ms", java.lang.Long.valueOf(j2));
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong("_et", j2);
        boolean z3 = !zzibVar2.zzc().zzv();
        com.google.android.gms.measurement.internal.zzib zzibVar3 = zzobVar.zzu;
        com.google.android.gms.measurement.internal.zzpo.zzav(zzibVar3.zzs().zzh(z3), bundle, true);
        if (!z2) {
            zzibVar3.zzj().zzF("auto", "_e", bundle);
        }
        this.zza = j;
        com.google.android.gms.measurement.internal.zzay zzayVar = this.zzd;
        zzayVar.zzd();
        zzayVar.zzb(((java.lang.Long) com.google.android.gms.measurement.internal.zzfx.zzaq.zzb(null)).longValue());
        return true;
    }
}
