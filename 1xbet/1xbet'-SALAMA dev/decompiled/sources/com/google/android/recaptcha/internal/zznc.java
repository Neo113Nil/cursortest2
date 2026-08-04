package com.google.android.recaptcha.internal;

import W5.AbstractC0486a1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zznc {
    private static final zznc zza = new zznc(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zznc(int i7, int[] iArr, Object[] objArr, boolean z4) {
        this.zze = -1;
        this.zzb = i7;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z4;
    }

    public static zznc zzc() {
        return zza;
    }

    public static zznc zze(zznc zzncVar, zznc zzncVar2) {
        int i7 = zzncVar.zzb + zzncVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzncVar.zzc, i7);
        System.arraycopy(zzncVar2.zzc, 0, iArrCopyOf, zzncVar.zzb, zzncVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzncVar.zzd, i7);
        System.arraycopy(zzncVar2.zzd, 0, objArrCopyOf, zzncVar.zzb, zzncVar2.zzb);
        return new zznc(i7, iArrCopyOf, objArrCopyOf, true);
    }

    public static zznc zzf() {
        return new zznc(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i7) {
        int[] iArr = this.zzc;
        if (i7 > iArr.length) {
            int i8 = this.zzb;
            int i9 = (i8 / 2) + i8;
            if (i9 >= i7) {
                i7 = i9;
            }
            if (i7 < 8) {
                i7 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i7);
            this.zzd = Arrays.copyOf(this.zzd, i7);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zznc)) {
            return false;
        }
        zznc zzncVar = (zznc) obj;
        int i7 = this.zzb;
        if (i7 == zzncVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzncVar.zzc;
            for (int i8 = 0; i8 < i7; i8++) {
                if (iArr[i8] == iArr2[i8]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zzncVar.zzd;
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
        int i8 = i7 + 527;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i9 = 17;
        for (int i10 = 0; i10 < i7; i10++) {
            i9 = (i9 * 31) + iArr[i10];
        }
        int i11 = ((i8 * 31) + i9) * 31;
        Object[] objArr = this.zzd;
        int i12 = this.zzb;
        for (int i13 = 0; i13 < i12; i13++) {
            iHashCode = (iHashCode * 31) + objArr[i13].hashCode();
        }
        return i11 + iHashCode;
    }

    public final int zza() {
        int iZzx;
        int iZzy;
        int iZzx2;
        int i7 = this.zze;
        if (i7 != -1) {
            return i7;
        }
        int iZzx3 = 0;
        for (int i8 = 0; i8 < this.zzb; i8++) {
            int i9 = this.zzc[i8];
            int i10 = i9 >>> 3;
            int i11 = i9 & 7;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        int i12 = i10 << 3;
                        zziv zzivVar = (zziv) this.zzd[i8];
                        int iZzx4 = zzjg.zzx(i12);
                        int iZzd = zzivVar.zzd();
                        iZzx3 = zzjg.zzx(iZzd) + iZzd + iZzx4 + iZzx3;
                    } else if (i11 == 3) {
                        int iZzx5 = zzjg.zzx(i10 << 3);
                        iZzx = iZzx5 + iZzx5;
                        iZzy = ((zznc) this.zzd[i8]).zza();
                    } else {
                        if (i11 != 5) {
                            throw new IllegalStateException(zzlc.zza());
                        }
                        ((Integer) this.zzd[i8]).getClass();
                        iZzx2 = zzjg.zzx(i10 << 3) + 4;
                    }
                } else {
                    ((Long) this.zzd[i8]).getClass();
                    iZzx2 = zzjg.zzx(i10 << 3) + 8;
                }
                iZzx3 = iZzx2 + iZzx3;
            } else {
                int i13 = i10 << 3;
                long jLongValue = ((Long) this.zzd[i8]).longValue();
                iZzx = zzjg.zzx(i13);
                iZzy = zzjg.zzy(jLongValue);
            }
            iZzx3 = iZzy + iZzx + iZzx3;
        }
        this.zze = iZzx3;
        return iZzx3;
    }

    public final int zzb() {
        int i7 = this.zze;
        if (i7 != -1) {
            return i7;
        }
        int iR = 0;
        for (int i8 = 0; i8 < this.zzb; i8++) {
            int i9 = this.zzc[i8] >>> 3;
            zziv zzivVar = (zziv) this.zzd[i8];
            int iZzx = zzjg.zzx(8);
            int iZzx2 = zzjg.zzx(i9) + zzjg.zzx(16);
            int iZzx3 = zzjg.zzx(24);
            int iZzd = zzivVar.zzd();
            iR += iZzx + iZzx + iZzx2 + AbstractC0486a1.r(iZzd, iZzd, iZzx3);
        }
        this.zze = iR;
        return iR;
    }

    public final zznc zzd(zznc zzncVar) {
        if (zzncVar.equals(zza)) {
            return this;
        }
        zzg();
        int i7 = this.zzb + zzncVar.zzb;
        zzm(i7);
        System.arraycopy(zzncVar.zzc, 0, this.zzc, this.zzb, zzncVar.zzb);
        System.arraycopy(zzncVar.zzd, 0, this.zzd, this.zzb, zzncVar.zzb);
        this.zzb = i7;
        return this;
    }

    public final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb, int i7) {
        for (int i8 = 0; i8 < this.zzb; i8++) {
            zzlz.zzb(sb, i7, String.valueOf(this.zzc[i8] >>> 3), this.zzd[i8]);
        }
    }

    public final void zzj(int i7, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i8 = this.zzb;
        iArr[i8] = i7;
        this.zzd[i8] = obj;
        this.zzb = i8 + 1;
    }

    public final void zzk(zzno zznoVar) {
        for (int i7 = 0; i7 < this.zzb; i7++) {
            zznoVar.zzw(this.zzc[i7] >>> 3, this.zzd[i7]);
        }
    }

    public final void zzl(zzno zznoVar) {
        if (this.zzb != 0) {
            for (int i7 = 0; i7 < this.zzb; i7++) {
                int i8 = this.zzc[i7];
                Object obj = this.zzd[i7];
                int i9 = i8 & 7;
                int i10 = i8 >>> 3;
                if (i9 == 0) {
                    zznoVar.zzt(i10, ((Long) obj).longValue());
                } else if (i9 == 1) {
                    zznoVar.zzm(i10, ((Long) obj).longValue());
                } else if (i9 == 2) {
                    zznoVar.zzd(i10, (zziv) obj);
                } else if (i9 == 3) {
                    zznoVar.zzF(i10);
                    ((zznc) obj).zzl(zznoVar);
                    zznoVar.zzh(i10);
                } else {
                    if (i9 != 5) {
                        throw new RuntimeException(zzlc.zza());
                    }
                    zznoVar.zzk(i10, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zznc() {
        this(0, new int[8], new Object[8], true);
    }
}
