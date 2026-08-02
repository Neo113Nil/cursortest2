package com.google.android.gms.internal.measurement;

import W5.AbstractC0486a1;
import java.util.Arrays;

/* loaded from: classes.dex */
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
        int[] copyOf = Arrays.copyOf(zzmmVar.zzc, i7);
        System.arraycopy(zzmmVar2.zzc, 0, copyOf, zzmmVar.zzb, zzmmVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzmmVar.zzd, i7);
        System.arraycopy(zzmmVar2.zzd, 0, copyOf2, zzmmVar.zzb, zzmmVar2.zzb);
        return new zzmm(i7, copyOf, copyOf2, true);
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
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzmmVar.zzd;
                    int i9 = this.zzb;
                    for (int i10 = 0; i10 < i9; i10++) {
                        if (objArr[i10].equals(objArr2[i10])) {
                        }
                    }
                    return true;
                }
                if (iArr[i8] != iArr2[i8]) {
                    break;
                }
                i8++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.zzb;
        int i8 = (i7 + 527) * 31;
        int[] iArr = this.zzc;
        int i9 = 17;
        int i10 = 17;
        for (int i11 = 0; i11 < i7; i11++) {
            i10 = (i10 * 31) + iArr[i11];
        }
        int i12 = (i8 + i10) * 31;
        Object[] objArr = this.zzd;
        int i13 = this.zzb;
        for (int i14 = 0; i14 < i13; i14++) {
            i9 = (i9 * 31) + objArr[i14].hashCode();
        }
        return i12 + i9;
    }

    public final int zza() {
        int zzA;
        int zzB;
        int i7 = this.zze;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.zzb; i9++) {
            int i10 = this.zzc[i9];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            if (i12 != 0) {
                if (i12 == 1) {
                    ((Long) this.zzd[i9]).getClass();
                    i8 = AbstractC0486a1.p(i11 << 3, 8, i8);
                } else if (i12 == 2) {
                    zzjb zzjbVar = (zzjb) this.zzd[i9];
                    int zzA2 = zzjj.zzA(i11 << 3);
                    int zzd = zzjbVar.zzd();
                    i8 = AbstractC0486a1.s(zzd, zzd, zzA2, i8);
                } else if (i12 == 3) {
                    int zzz = zzjj.zzz(i11);
                    zzA = zzz + zzz;
                    zzB = ((zzmm) this.zzd[i9]).zza();
                } else {
                    if (i12 != 5) {
                        throw new IllegalStateException(zzkm.zza());
                    }
                    ((Integer) this.zzd[i9]).getClass();
                    i8 = AbstractC0486a1.p(i11 << 3, 4, i8);
                }
            } else {
                long longValue = ((Long) this.zzd[i9]).longValue();
                zzA = zzjj.zzA(i11 << 3);
                zzB = zzjj.zzB(longValue);
            }
            i8 = zzB + zzA + i8;
        }
        this.zze = i8;
        return i8;
    }

    public final int zzb() {
        int i7 = this.zze;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.zzb; i9++) {
            int i10 = this.zzc[i9];
            zzjb zzjbVar = (zzjb) this.zzd[i9];
            int zzA = zzjj.zzA(8);
            int zzd = zzjbVar.zzd();
            i8 += zzjj.zzA(zzd) + zzd + zzjj.zzA(24) + AbstractC0486a1.p(i10 >>> 3, zzjj.zzA(16), zzA + zzA);
        }
        this.zze = i8;
        return i8;
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
