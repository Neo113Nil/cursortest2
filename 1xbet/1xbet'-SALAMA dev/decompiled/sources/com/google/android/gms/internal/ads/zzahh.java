package com.google.android.gms.internal.ads;

import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
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
        int iZzm;
        zzedVar.zzM(6);
        int iZzg = zzedVar.zzg();
        long j7 = zzadnVar.zzc;
        long j8 = iZzg;
        int iZzg2 = zzedVar.zzg();
        if (iZzg2 <= 0) {
            return null;
        }
        long jZzt = zzen.zzt((((long) iZzg2) * ((long) zzadnVar.zzg)) - 1, zzadnVar.zzd);
        int iZzq = zzedVar.zzq();
        int iZzq2 = zzedVar.zzq();
        int iZzq3 = zzedVar.zzq();
        zzedVar.zzM(2);
        long j9 = j3 + ((long) zzadnVar.zzc);
        long[] jArr = new long[iZzq];
        long[] jArr2 = new long[iZzq];
        for (int i7 = 0; i7 < iZzq; i7++) {
            jArr[i7] = (((long) i7) * jZzt) / ((long) iZzq);
            jArr2[i7] = j9;
            if (iZzq3 == 1) {
                iZzm = zzedVar.zzm();
            } else if (iZzq3 == 2) {
                iZzm = zzedVar.zzq();
            } else if (iZzq3 == 3) {
                iZzm = zzedVar.zzo();
            } else {
                if (iZzq3 != 4) {
                    return null;
                }
                iZzm = zzedVar.zzp();
            }
            j9 += ((long) iZzm) * ((long) iZzq2);
        }
        long jMax = j3 + j7 + j8;
        if (j != -1 && j != jMax) {
            StringBuilder sbJ = k.j("VBRI data size mismatch: ", ", ", j);
            sbJ.append(jMax);
            zzdq.zzf("VbriSeeker", sbJ.toString());
        }
        if (jMax != j9) {
            StringBuilder sbJ2 = k.j("VBRI bytes and ToC mismatch (using max): ", ", ", jMax);
            sbJ2.append(j9);
            sbJ2.append("\nSeeking will be inaccurate.");
            zzdq.zzf("VbriSeeker", sbJ2.toString());
            jMax = Math.max(jMax, j9);
        }
        return new zzahh(jArr, jArr2, jZzt, jMax, zzadnVar.zzf);
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
        int iZzd = zzen.zzd(jArr, j, true, true);
        zzadv zzadvVar = new zzadv(jArr[iZzd], this.zzb[iZzd]);
        if (zzadvVar.zzb < j) {
            long[] jArr2 = this.zza;
            if (iZzd != jArr2.length - 1) {
                int i7 = iZzd + 1;
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
