package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class zzaeq {
    private final zzaep zza;
    private final zzaeb zzb;
    private final int zzc;
    private final int zzd;
    private final long zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private long zzl;
    private long[] zzm;
    private int[] zzn;

    public zzaeq(int i7, zzaep zzaepVar, zzaeb zzaebVar) {
        this.zza = zzaepVar;
        int iZzb = zzaepVar.zzb();
        boolean z4 = true;
        if (iZzb != 1) {
            if (iZzb == 2) {
                iZzb = 2;
            } else {
                z4 = false;
            }
        }
        zzcv.zzd(z4);
        this.zzc = zzh(i7, iZzb == 2 ? 1667497984 : 1651965952);
        this.zze = zzaepVar.zzc();
        this.zzb = zzaebVar;
        this.zzd = iZzb == 2 ? zzh(i7, 1650720768) : -1;
        this.zzl = -1L;
        this.zzm = new long[512];
        this.zzn = new int[512];
        this.zzf = zzaepVar.zzd;
    }

    private static int zzh(int i7, int i8) {
        return (((i7 % 10) + 48) << 8) | ((i7 / 10) + 48) | i8;
    }

    private final long zzi(int i7) {
        return (this.zze * ((long) i7)) / ((long) this.zzf);
    }

    private final zzadv zzj(int i7) {
        return new zzadv(((long) this.zzn[i7]) * zzi(1), this.zzm[i7]);
    }

    public final zzads zza(long j) {
        if (this.zzk == 0) {
            zzadv zzadvVar = new zzadv(0L, this.zzl);
            return new zzads(zzadvVar, zzadvVar);
        }
        int iZzi = (int) (j / zzi(1));
        int iZzc = zzen.zzc(this.zzn, iZzi, true, true);
        if (this.zzn[iZzc] == iZzi) {
            zzadv zzadvVarZzj = zzj(iZzc);
            return new zzads(zzadvVarZzj, zzadvVarZzj);
        }
        zzadv zzadvVarZzj2 = zzj(iZzc);
        int i7 = iZzc + 1;
        return i7 < this.zzm.length ? new zzads(zzadvVarZzj2, zzj(i7)) : new zzads(zzadvVarZzj2, zzadvVarZzj2);
    }

    public final void zzb(long j, boolean z4) {
        if (this.zzl == -1) {
            this.zzl = j;
        }
        if (z4) {
            if (this.zzk == this.zzn.length) {
                long[] jArr = this.zzm;
                this.zzm = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.zzn;
                this.zzn = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.zzm;
            int i7 = this.zzk;
            jArr2[i7] = j;
            this.zzn[i7] = this.zzj;
            this.zzk = i7 + 1;
        }
        this.zzj++;
    }

    public final void zzc() {
        int i7;
        this.zzm = Arrays.copyOf(this.zzm, this.zzk);
        this.zzn = Arrays.copyOf(this.zzn, this.zzk);
        if ((this.zzc & 1651965952) != 1651965952 || this.zza.zzf == 0 || (i7 = this.zzk) <= 0) {
            return;
        }
        this.zzf = i7;
    }

    public final void zzd(int i7) {
        this.zzg = i7;
        this.zzh = i7;
    }

    public final void zze(long j) {
        if (this.zzk == 0) {
            this.zzi = 0;
        } else {
            this.zzi = this.zzn[zzen.zzd(this.zzm, j, true, true)];
        }
    }

    public final boolean zzf(int i7) {
        return this.zzc == i7 || this.zzd == i7;
    }

    public final boolean zzg(zzacw zzacwVar) {
        int i7 = this.zzh;
        int iZzf = i7 - this.zzb.zzf(zzacwVar, i7, false);
        this.zzh = iZzf;
        boolean z4 = iZzf == 0;
        if (z4) {
            if (this.zzg > 0) {
                this.zzb.zzt(zzi(this.zzi), Arrays.binarySearch(this.zzn, this.zzi) >= 0 ? 1 : 0, this.zzg, 0, null);
            }
            this.zzi++;
        }
        return z4;
    }
}
