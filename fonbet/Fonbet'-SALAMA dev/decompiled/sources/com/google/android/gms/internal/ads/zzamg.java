package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzamg {
    private final zzaeb zza;
    private long zzb;
    private boolean zzc;
    private int zzd;
    private long zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private long zzk;
    private long zzl;
    private boolean zzm;

    public zzamg(zzaeb zzaebVar) {
        this.zza = zzaebVar;
    }

    private final void zzf(int i7) {
        long j = this.zzl;
        if (j == -9223372036854775807L) {
            return;
        }
        boolean z4 = this.zzm;
        long j3 = this.zzb - this.zzk;
        this.zza.zzt(j, z4 ? 1 : 0, (int) j3, i7, null);
    }

    public final void zza(long j) {
        this.zzm = this.zzc;
        zzf((int) (j - this.zzb));
        this.zzk = this.zzb;
        this.zzb = j;
        zzf(0);
        this.zzi = false;
    }

    public final void zzb(long j, int i7, boolean z4) {
        if (this.zzj && this.zzg) {
            this.zzm = this.zzc;
            this.zzj = false;
        } else if (this.zzh || this.zzg) {
            if (z4 && this.zzi) {
                zzf(i7 + ((int) (j - this.zzb)));
            }
            this.zzk = this.zzb;
            this.zzl = this.zze;
            this.zzm = this.zzc;
            this.zzi = true;
        }
    }

    public final void zzc(byte[] bArr, int i7, int i8) {
        if (this.zzf) {
            int i9 = this.zzd;
            int i10 = (i7 + 2) - i9;
            if (i10 >= i8) {
                this.zzd = (i8 - i7) + i9;
            } else {
                this.zzg = (bArr[i10] & 128) != 0;
                this.zzf = false;
            }
        }
    }

    public final void zzd() {
        this.zzf = false;
        this.zzg = false;
        this.zzh = false;
        this.zzi = false;
        this.zzj = false;
    }

    public final void zze(long j, int i7, int i8, long j3, boolean z4) {
        this.zzg = false;
        this.zzh = false;
        this.zze = j3;
        this.zzd = 0;
        this.zzb = j;
        if (i8 >= 32 && i8 != 40) {
            if (this.zzi && !this.zzj) {
                if (z4) {
                    zzf(i7);
                }
                this.zzi = false;
            }
            if (i8 <= 35 || i8 == 39) {
                this.zzh = !this.zzj;
                this.zzj = true;
            }
        }
        boolean z7 = i8 >= 16 && i8 <= 21;
        this.zzc = z7;
        this.zzf = z7 || i8 <= 9;
    }
}
