package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzahw {
    private final com.google.android.gms.internal.ads.zzahv zza;
    private final com.google.android.gms.internal.ads.zzahk zzb;
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

    public zzahw(int i, com.google.android.gms.internal.ads.zzahv zzahvVar, com.google.android.gms.internal.ads.zzahk zzahkVar) {
        this.zza = zzahvVar;
        int zzc = zzahvVar.zzc();
        boolean z = true;
        if (zzc != 1) {
            if (zzc == 2) {
                zzc = 2;
            } else {
                z = false;
            }
        }
        com.google.android.gms.internal.ads.zzgtj.zza(z);
        this.zzc = zzj(i, zzc == 2 ? 1667497984 : 1651965952);
        this.zze = zzahvVar.zzd();
        this.zzb = zzahkVar;
        this.zzd = zzc == 2 ? zzj(i, 1650720768) : -1;
        this.zzl = -1L;
        this.zzm = new long[512];
        this.zzn = new int[512];
        this.zzf = zzahvVar.zzd;
    }

    private final long zzh(int i) {
        return (this.zze * i) / this.zzf;
    }

    private final com.google.android.gms.internal.ads.zzahc zzi(int i) {
        return new com.google.android.gms.internal.ads.zzahc(this.zzn[i] * zzh(1), this.zzm[i]);
    }

    private static int zzj(int i, int i2) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i2;
    }

    public final void zza(long j, boolean z) {
        if (this.zzl == -1) {
            this.zzl = j;
        }
        if (z) {
            if (this.zzk == this.zzn.length) {
                long[] jArr = this.zzm;
                this.zzm = java.util.Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.zzn;
                this.zzn = java.util.Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.zzm;
            int i = this.zzk;
            jArr2[i] = j;
            this.zzn[i] = this.zzj;
            this.zzk = i + 1;
        }
        this.zzj++;
    }

    public final void zzb() {
        int i;
        this.zzm = java.util.Arrays.copyOf(this.zzm, this.zzk);
        this.zzn = java.util.Arrays.copyOf(this.zzn, this.zzk);
        if ((this.zzc & 1651965952) != 1651965952 || this.zza.zzf == 0 || (i = this.zzk) <= 0) {
            return;
        }
        this.zzf = i;
    }

    public final boolean zzc(int i) {
        return this.zzc == i || this.zzd == i;
    }

    public final void zzd(int i) {
        this.zzg = i;
        this.zzh = i;
    }

    public final boolean zze(com.google.android.gms.internal.ads.zzafz zzafzVar) throws java.io.IOException {
        int i = this.zzh;
        com.google.android.gms.internal.ads.zzahk zzahkVar = this.zzb;
        int zza = i - zzahkVar.zza(zzafzVar, i, false);
        this.zzh = zza;
        boolean z = zza == 0;
        if (z) {
            if (this.zzg > 0) {
                zzahkVar.zze(zzh(this.zzi), java.util.Arrays.binarySearch(this.zzn, this.zzi) >= 0 ? 1 : 0, this.zzg, 0, null);
            }
            this.zzi++;
        }
        return z;
    }

    public final void zzf(long j) {
        if (this.zzk == 0) {
            this.zzi = 0;
        } else {
            this.zzi = this.zzn[com.google.android.gms.internal.ads.zzfl.zzo(this.zzm, j, true, true)];
        }
    }

    public final com.google.android.gms.internal.ads.zzagz zzg(long j) {
        if (this.zzk == 0) {
            com.google.android.gms.internal.ads.zzahc zzahcVar = new com.google.android.gms.internal.ads.zzahc(0L, this.zzl);
            return new com.google.android.gms.internal.ads.zzagz(zzahcVar, zzahcVar);
        }
        int zzh = (int) (j / zzh(1));
        int zzn = com.google.android.gms.internal.ads.zzfl.zzn(this.zzn, zzh, true, true);
        if (this.zzn[zzn] == zzh) {
            com.google.android.gms.internal.ads.zzahc zzi = zzi(zzn);
            return new com.google.android.gms.internal.ads.zzagz(zzi, zzi);
        }
        com.google.android.gms.internal.ads.zzahc zzi2 = zzi(zzn);
        int i = zzn + 1;
        return i < this.zzm.length ? new com.google.android.gms.internal.ads.zzagz(zzi2, zzi(i)) : new com.google.android.gms.internal.ads.zzagz(zzi2, zzi2);
    }
}
