package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzaec {
    private final com.google.android.gms.internal.ads.zzadu zza;
    private final com.google.android.gms.internal.ads.zzadv zzf;
    private long zzk;
    private final com.google.android.gms.internal.ads.zzacu zzl;
    private final com.google.android.gms.internal.ads.zzads zzb = new com.google.android.gms.internal.ads.zzads();
    private final com.google.android.gms.internal.ads.zzfh zzc = new com.google.android.gms.internal.ads.zzfh(10);
    private final com.google.android.gms.internal.ads.zzfh zzd = new com.google.android.gms.internal.ads.zzfh(10);
    private final com.google.android.gms.internal.ads.zzei zze = new com.google.android.gms.internal.ads.zzei(16);
    private long zzg = -9223372036854775807L;
    private com.google.android.gms.internal.ads.zzbv zzj = com.google.android.gms.internal.ads.zzbv.zza;
    private long zzh = -9223372036854775807L;
    private long zzi = -9223372036854775807L;

    public zzaec(com.google.android.gms.internal.ads.zzacu zzacuVar, com.google.android.gms.internal.ads.zzadu zzaduVar, com.google.android.gms.internal.ads.zzadv zzadvVar) {
        this.zzl = zzacuVar;
        this.zza = zzaduVar;
        this.zzf = zzadvVar;
    }

    private static java.lang.Object zzh(com.google.android.gms.internal.ads.zzfh zzfhVar) {
        com.google.android.gms.internal.ads.zzgtj.zza(zzfhVar.zzc() > 0);
        while (zzfhVar.zzc() > 1) {
            zzfhVar.zzd();
        }
        java.lang.Object zzd = zzfhVar.zzd();
        zzd.getClass();
        return zzd;
    }

    public final void zza() {
        this.zze.zze();
        this.zzg = -9223372036854775807L;
        this.zzh = -9223372036854775807L;
        this.zzi = -9223372036854775807L;
        com.google.android.gms.internal.ads.zzfh zzfhVar = this.zzd;
        if (zzfhVar.zzc() > 0) {
            this.zzk = ((java.lang.Long) zzh(zzfhVar)).longValue();
        }
        com.google.android.gms.internal.ads.zzfh zzfhVar2 = this.zzc;
        if (zzfhVar2.zzc() > 0) {
            zzfhVar2.zza(0L, (com.google.android.gms.internal.ads.zzbv) zzh(zzfhVar2));
        }
    }

    public final void zzb(long j, long j2) throws com.google.android.gms.internal.ads.zzjk {
        while (true) {
            com.google.android.gms.internal.ads.zzei zzeiVar = this.zze;
            if (zzeiVar.zzd()) {
                return;
            }
            com.google.android.gms.internal.ads.zzfh zzfhVar = this.zzd;
            long zzc = zzeiVar.zzc();
            java.lang.Long l = (java.lang.Long) zzfhVar.zze(zzc);
            if (l != null && l.longValue() != this.zzk) {
                this.zzk = l.longValue();
                this.zza.zza(2);
            }
            com.google.android.gms.internal.ads.zzadu zzaduVar = this.zza;
            long j3 = this.zzk;
            com.google.android.gms.internal.ads.zzads zzadsVar = this.zzb;
            int zzk = zzaduVar.zzk(zzc, j, j2, j3, false, false, zzadsVar);
            if (zzk != 5 && zzk != 4) {
                this.zzf.zza(zzc, zzadsVar.zza());
            }
            if (zzk == 0 || zzk == 1) {
                this.zzh = zzc;
                long zzb = zzeiVar.zzb();
                com.google.android.gms.internal.ads.zzbv zzbvVar = (com.google.android.gms.internal.ads.zzbv) this.zzc.zze(zzb);
                if (zzbvVar != null && !zzbvVar.equals(com.google.android.gms.internal.ads.zzbv.zza) && !zzbvVar.equals(this.zzj)) {
                    this.zzj = zzbvVar;
                    this.zzl.zza(zzbvVar);
                }
                this.zzl.zzb(zzk == 0 ? java.lang.System.nanoTime() : zzadsVar.zzb(), zzb, zzaduVar.zzf());
            } else if (zzk == 2 || zzk == 3) {
                this.zzh = zzc;
                zzeiVar.zzb();
                final com.google.android.gms.internal.ads.zzacu zzacuVar = this.zzl;
                java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzacs
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.internal.ads.zzacu.this.zza.zzB().zzc();
                    }
                };
                com.google.android.gms.internal.ads.zzacv zzacvVar = zzacuVar.zza;
                zzacvVar.zzC().execute(runnable);
                ((com.google.android.gms.internal.ads.zzaes) zzacvVar.zzz().remove()).zzb();
            } else if (zzk != 4) {
                return;
            } else {
                this.zzh = zzc;
            }
        }
    }

    public final void zzc(int i, int i2) {
        long j = this.zzg;
        this.zzc.zza(j == -9223372036854775807L ? 0L : j + 1, new com.google.android.gms.internal.ads.zzbv(i, i2, 1.0f));
    }

    public final void zzd(int i, long j) {
        if (this.zze.zzd()) {
            this.zza.zza(i);
            this.zzk = j;
        } else {
            com.google.android.gms.internal.ads.zzfh zzfhVar = this.zzd;
            long j2 = this.zzg;
            zzfhVar.zza(j2 == -9223372036854775807L ? -4611686018427387904L : j2 + 1, java.lang.Long.valueOf(j));
        }
    }

    public final void zze(long j) {
        this.zze.zza(j);
        this.zzg = j;
        this.zzi = -9223372036854775807L;
    }

    public final void zzf() {
        long j = this.zzg;
        if (j == -9223372036854775807L) {
            j = Long.MIN_VALUE;
            this.zzg = Long.MIN_VALUE;
            this.zzh = Long.MIN_VALUE;
        }
        this.zzi = j;
    }

    public final boolean zzg() {
        long j = this.zzi;
        return j != -9223372036854775807L && this.zzh == j;
    }
}
