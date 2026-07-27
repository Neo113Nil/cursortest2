package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzael {
    private final zzaed zza;
    private final zzaee zzf;
    private final zzadf zzg;
    private long zzl;
    private final zzadb zzm;
    private final zzaeb zzb = new zzaeb();
    private final zzfi zzc = new zzfi(10);
    private final zzfi zzd = new zzfi(10);
    private final zzej zze = new zzej(16);
    private long zzh = -9223372036854775807L;
    private zzbv zzk = zzbv.zza;
    private long zzi = -9223372036854775807L;
    private long zzj = -9223372036854775807L;

    public zzael(zzadb zzadbVar, zzaed zzaedVar, zzaee zzaeeVar, zzadf zzadfVar) {
        this.zzm = zzadbVar;
        this.zza = zzaedVar;
        this.zzf = zzaeeVar;
        this.zzg = zzadfVar;
    }

    private static Object zzh(zzfi zzfiVar) {
        zzguk.zza(zzfiVar.zzc() > 0);
        while (zzfiVar.zzc() > 1) {
            zzfiVar.zzd();
        }
        Object zzd = zzfiVar.zzd();
        zzd.getClass();
        return zzd;
    }

    public final void zza() {
        this.zze.zze();
        this.zzh = -9223372036854775807L;
        this.zzi = -9223372036854775807L;
        this.zzj = -9223372036854775807L;
        zzfi zzfiVar = this.zzd;
        if (zzfiVar.zzc() > 0) {
            this.zzl = ((Long) zzh(zzfiVar)).longValue();
        }
        zzfi zzfiVar2 = this.zzc;
        if (zzfiVar2.zzc() > 0) {
            zzfiVar2.zza(0L, (zzbv) zzh(zzfiVar2));
        }
    }

    public final void zzb(long j, long j2) throws zzjn {
        long j3;
        while (true) {
            zzej zzejVar = this.zze;
            if (zzejVar.zzd()) {
                return;
            }
            zzfi zzfiVar = this.zzd;
            long zzc = zzejVar.zzc();
            Long l = (Long) zzfiVar.zze(zzc);
            if (l != null && l.longValue() != this.zzl) {
                this.zzl = l.longValue();
                this.zza.zzb(2);
            }
            zzadf zzadfVar = this.zzg;
            zzadfVar.zzb(1000 * zzc);
            zzaed zzaedVar = this.zza;
            long j4 = this.zzl;
            zzaeb zzaebVar = this.zzb;
            int zzl = zzaedVar.zzl(zzc, j, j2, j4, false, false, zzadfVar.zzc(), zzadfVar.zzd(), zzaebVar);
            if (zzl == 5 || zzl == 4) {
                j3 = zzc;
            } else {
                zzaee zzaeeVar = this.zzf;
                long zza = zzaebVar.zza();
                j3 = zzc;
                zzaeeVar.zza(j3, zza);
            }
            if (zzl == 0 || zzl == 1) {
                this.zzi = j3;
                long zzb = zzejVar.zzb();
                zzbv zzbvVar = (zzbv) this.zzc.zze(zzb);
                if (zzbvVar != null && !zzbvVar.equals(zzbv.zza) && !zzbvVar.equals(this.zzk)) {
                    this.zzk = zzbvVar;
                    this.zzm.zza(zzbvVar);
                }
                this.zzm.zzb(zzl == 0 ? System.nanoTime() : zzaebVar.zzb(), zzb, zzaedVar.zzg());
            } else if (zzl == 2 || zzl == 3) {
                this.zzi = j3;
                zzejVar.zzb();
                final zzadb zzadbVar = this.zzm;
                Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzacz
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzadb.this.zza.zzB().zzc();
                    }
                };
                zzadc zzadcVar = zzadbVar.zza;
                zzadcVar.zzC().execute(runnable);
                ((zzafb) zzadcVar.zzz().remove()).zzb();
            } else if (zzl != 4) {
                return;
            } else {
                this.zzi = j3;
            }
        }
    }

    public final void zzc(int i, int i2) {
        long j = this.zzh;
        this.zzc.zza(j == -9223372036854775807L ? 0L : j + 1, new zzbv(i, i2, 1.0f));
    }

    public final void zzd(int i, long j) {
        if (this.zze.zzd()) {
            this.zza.zzb(i);
            this.zzl = j;
        } else {
            zzfi zzfiVar = this.zzd;
            long j2 = this.zzh;
            zzfiVar.zza(j2 == -9223372036854775807L ? -4611686018427387904L : j2 + 1, Long.valueOf(j));
        }
    }

    public final void zze(long j) {
        this.zze.zza(j);
        this.zzh = j;
        this.zzj = -9223372036854775807L;
    }

    public final void zzf() {
        long j = this.zzh;
        if (j == -9223372036854775807L) {
            j = Long.MIN_VALUE;
            this.zzh = Long.MIN_VALUE;
            this.zzi = Long.MIN_VALUE;
        }
        this.zzj = j;
    }

    public final boolean zzg() {
        long j = this.zzj;
        return j != -9223372036854775807L && this.zzi == j;
    }
}
