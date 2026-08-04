package com.google.android.gms.internal.measurement;

import W5.AbstractC0486a1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzmm {
    private static final zzmm zza = new zzmm(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzmm(int i7, int[] iArr, Object[] objArr, boolean z4) {
        this.zze = -1;
        this.zzb = i7;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z4;
    }

    public static zzmm zzc() {
        return zza;
    }

    public static zzmm zzd(zzmm zzmmVar, zzmm zzmmVar2) {
        int i7 = zzmmVar.zzb + zzmmVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzmmVar.zzc, i7);
        System.arraycopy(zzmmVar2.zzc, 0, iArrCopyOf, zzmmVar.zzb, zzmmVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzmmVar.zzd, i7);
        System.arraycopy(zzmmVar2.zzd, 0, objArrCopyOf, zzmmVar.zzb, zzmmVar2.zzb);
        return new zzmm(i7, iArrCopyOf, objArrCopyOf, true);
    }

    public static zzmm zze() {
        return new zzmm(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzmm)) {
            return false;
        }
        zzmm zzmmVar = (zzmm) obj;
        int i7 = this.zzb;
        if (i7 == zzmmVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzmmVar.zzc;
            for (int i8 = 0; i8 < i7; i8++) {
                if (iArr[i8] == iArr2[i8]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zzmmVar.zzd;
            int i9 = this.zzb;
            for (int i10 = 0; i10 < i9; i10++) {
                if (objArr[i10].equals(objArr2[i10])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.zzb;
        int i8 = (i7 + 527) * 31;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i9 = 17;
        for (int i10 = 0; i10 < i7; i10++) {
            i9 = (i9 * 31) + iArr[i10];
        }
        int i11 = (i8 + i9) * 31;
        Object[] objArr = this.zzd;
        int i12 = this.zzb;
        for (int i13 = 0; i13 < i12; i13++) {
            iHashCode = (iHashCode * 31) + objArr[i13].hashCode();
        }
        return i11 + iHashCode;
    }

    public final int zza() {
        int iZzA;
        int iZzB;
        int i7 = this.zze;
        if (i7 != -1) {
            return i7;
        }
        int iP = 0;
        for (int i8 = 0; i8 < this.zzb; i8++) {
            int i9 = this.zzc[i8];
            int i10 = i9 >>> 3;
            int i11 = i9 & 7;
            if (i11 != 0) {
                if (i11 == 1) {
                    ((Long) this.zzd[i8]).getClass();
                    iP = AbstractC0486a1.p(i10 << 3, 8, iP);
                } else if (i11 == 2) {
                    zzjb zzjbVar = (zzjb) this.zzd[i8];
                    int iZzA2 = zzjj.zzA(i10 << 3);
                    int iZzd = zzjbVar.zzd();
                    iP = AbstractC0486a1.s(iZzd, iZzd, iZzA2, iP);
                } else if (i11 == 3) {
                    int iZzz = zzjj.zzz(i10);
                    iZzA = iZzz + iZzz;
                    iZzB = ((zzmm) this.zzd[i8]).zza();
                } else {
                    if (i11 != 5) {
                        throw new IllegalStateException(zzkm.zza());
                    }
                    ((Integer) this.zzd[i8]).getClass();
                    iP = AbstractC0486a1.p(i10 << 3, 4, iP);
                }
            } else {
                long jLongValue = ((Long) this.zzd[i8]).longValue();
                iZzA = zzjj.zzA(i10 << 3);
                iZzB = zzjj.zzB(jLongValue);
            }
            iP = iZzB + iZzA + iP;
        }
        this.zze = iP;
        return iP;
    }

    public final int zzb() {
        int i7 = this.zze;
        if (i7 != -1) {
            return i7;
        }
        int iZzA = 0;
        for (int i8 = 0; i8 < this.zzb; i8++) {
            int i9 = this.zzc[i8];
            zzjb zzjbVar = (zzjb) this.zzd[i8];
            int iZzA2 = zzjj.zzA(8);
            int iZzd = zzjbVar.zzd();
            iZzA += zzjj.zzA(iZzd) + iZzd + zzjj.zzA(24) + AbstractC0486a1.p(i9 >>> 3, zzjj.zzA(16), iZzA2 + iZzA2);
        }
        this.zze = iZzA;
        return iZzA;
    }

    public final void zzf() {
        this.zzf = false;
    }

    public final void zzg(StringBuilder sb, int i7) {
        for (int i8 = 0; i8 < this.zzb; i8++) {
            zzll.zzb(sb, i7, String.valueOf(this.zzc[i8] >>> 3), this.zzd[i8]);
        }
    }

    public final void zzh(int i7, Object obj) {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
        int i8 = this.zzb;
        int[] iArr = this.zzc;
        if (i8 == iArr.length) {
            int i9 = i8 + (i8 < 4 ? 8 : i8 >> 1);
            this.zzc = Arrays.copyOf(iArr, i9);
            this.zzd = Arrays.copyOf(this.zzd, i9);
        }
        int[] iArr2 = this.zzc;
        int i10 = this.zzb;
        iArr2[i10] = i7;
        this.zzd[i10] = obj;
        this.zzb = i10 + 1;
    }

    public final void zzi(zznd zzndVar) {
        if (this.zzb != 0) {
            for (int i7 = 0; i7 < this.zzb; i7++) {
                int i8 = this.zzc[i7];
                Object obj = this.zzd[i7];
                int i9 = i8 >>> 3;
                int i10 = i8 & 7;
                if (i10 == 0) {
                    zzndVar.zzt(i9, ((Long) obj).longValue());
                } else if (i10 == 1) {
                    zzndVar.zzm(i9, ((Long) obj).longValue());
                } else if (i10 == 2) {
                    zzndVar.zzd(i9, (zzjb) obj);
                } else if (i10 == 3) {
                    zzndVar.zzE(i9);
                    ((zzmm) obj).zzi(zzndVar);
                    zzndVar.zzh(i9);
                } else {
                    if (i10 != 5) {
                        throw new RuntimeException(zzkm.zza());
                    }
                    zzndVar.zzk(i9, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzmm() {
        this(0, new int[8], new Object[8], true);
    }
}
