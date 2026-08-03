package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzacd {
    public static final com.google.android.gms.internal.ads.zzabx zza = new com.google.android.gms.internal.ads.zzabx(2, -9223372036854775807L, null);
    public static final com.google.android.gms.internal.ads.zzabx zzb = new com.google.android.gms.internal.ads.zzabx(3, -9223372036854775807L, null);
    private final com.google.android.gms.internal.ads.zzacj zzc = com.google.android.gms.internal.ads.zzacj.CC.zzb(com.google.android.gms.internal.ads.zzfl.zzg("ExoPlayer:Loader:ProgressiveMediaPeriod"), com.google.android.gms.internal.ads.zzabw.zza);
    private com.google.android.gms.internal.ads.zzaby zzd;
    private java.io.IOException zze;

    public zzacd(java.lang.String str) {
    }

    public static com.google.android.gms.internal.ads.zzabx zza(boolean z, long j) {
        return new com.google.android.gms.internal.ads.zzabx(z ? 1 : 0, j, null);
    }

    public final boolean zzb() {
        return this.zze != null;
    }

    public final void zzc() {
        this.zze = null;
    }

    public final long zzd(com.google.android.gms.internal.ads.zzabz zzabzVar, com.google.android.gms.internal.ads.zzabv zzabvVar, int i) {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        myLooper.getClass();
        this.zze = null;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        new com.google.android.gms.internal.ads.zzaby(this, myLooper, zzabzVar, zzabvVar, i, elapsedRealtime).zzb(0L);
        return elapsedRealtime;
    }

    public final boolean zze() {
        return this.zzd != null;
    }

    public final void zzg(com.google.android.gms.internal.ads.zzaca zzacaVar) {
        com.google.android.gms.internal.ads.zzaby zzabyVar = this.zzd;
        if (zzabyVar != null) {
            zzabyVar.zzc(true);
        }
        com.google.android.gms.internal.ads.zzacj zzacjVar = this.zzc;
        zzacjVar.execute(new com.google.android.gms.internal.ads.zzacb(zzacaVar));
        zzacjVar.zza();
    }

    public final void zzh(int i) throws java.io.IOException {
        java.io.IOException iOException = this.zze;
        if (iOException != null) {
            throw iOException;
        }
        com.google.android.gms.internal.ads.zzaby zzabyVar = this.zzd;
        if (zzabyVar != null) {
            zzabyVar.zza(i);
        }
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzacj zzi() {
        return this.zzc;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzaby zzj() {
        return this.zzd;
    }

    final /* synthetic */ void zzk(com.google.android.gms.internal.ads.zzaby zzabyVar) {
        this.zzd = zzabyVar;
    }

    final /* synthetic */ void zzl(java.io.IOException iOException) {
        this.zze = iOException;
    }

    public final void zzf() {
        com.google.android.gms.internal.ads.zzaby zzabyVar = this.zzd;
        zzabyVar.getClass();
        zzabyVar.zzc(false);
    }
}
