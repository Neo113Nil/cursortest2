package com.google.android.gms.internal.ads;

import e1.k;

/* loaded from: classes.dex */
final class zzahh implements zzahg {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    private zzahh(long[] jArr, long[] jArr2, long j, long j3, int i7) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j;
        this.zzd = j3;
        this.zze = i7;
    }

    public static zzahh zzb(long j, long j3, zzadn zzadnVar, zzed zzedVar) {
        int zzm;
        zzedVar.zzM(6);
        int zzg = zzedVar.zzg();
        long j7 = zzadnVar.zzc;
        long j8 = zzg;
        if (zzedVar.zzg() <= 0) {
            return null;
        }
        long zzt = zzen.zzt((r4 * zzadnVar.zzg) - 1, zzadnVar.zzd);
        int zzq = zzedVar.zzq();
        int zzq2 = zzedVar.zzq();
        int zzq3 = zzedVar.zzq();
        zzedVar.zzM(2);
        long j9 = j3 + zzadnVar.zzc;
        long[] jArr = new long[zzq];
        long[] jArr2 = new long[zzq];
        for (int i7 = 0; i7 < zzq; i7++) {
            jArr[i7] = (i7 * zzt) / zzq;
            jArr2[i7] = j9;
            if (zzq3 == 1) {
                zzm = zzedVar.zzm();
            } else if (zzq3 == 2) {
                zzm = zzedVar.zzq();
            } else if (zzq3 == 3) {
                zzm = zzedVar.zzo();
            } else {
                if (zzq3 != 4) {
                    return null;
                }
                zzm = zzedVar.zzp();
            }
            j9 += zzm * zzq2;
        }
        long j10 = j3 + j7 + j8;
        if (j != -1 && j != j10) {
            StringBuilder j11 = k.j("VBRI data size mismatch: ", ", ", j);
            j11.append(j10);
            zzdq.zzf("VbriSeeker", j11.toString());
        }
        if (j10 != j9) {
            StringBuilder j12 = k.j("VBRI bytes and ToC mismatch (using max): ", ", ", j10);
            j12.append(j9);
            j12.append("\nSeeking will be inaccurate.");
            zzdq.zzf("VbriSeeker", j12.toString());
            j10 = Math.max(j10, j9);
        }
        return new zzahh(jArr, jArr2, zzt, j10, zzadnVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahg
    public final int zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzahg
    public final long zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzahg
    public final long zze(long j) {
        return this.zza[zzen.zzd(this.zzb, j, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final zzads zzg(long j) {
        long[] jArr = this.zza;
        int zzd = zzen.zzd(jArr, j, true, true);
        zzadv zzadvVar = new zzadv(jArr[zzd], this.zzb[zzd]);
        if (zzadvVar.zzb < j) {
            long[] jArr2 = this.zza;
            if (zzd != jArr2.length - 1) {
                int i7 = zzd + 1;
                return new zzads(zzadvVar, new zzadv(jArr2[i7], this.zzb[i7]));
            }
        }
        return new zzads(zzadvVar, zzadvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzh() {
        return true;
    }
}
