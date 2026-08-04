package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzgzx {
    private static final zzgzx zza = new zzgzx(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzgzx(int i7, int[] iArr, Object[] objArr, boolean z4) {
        this.zze = -1;
        this.zzb = i7;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z4;
    }

    public static zzgzx zzc() {
        return zza;
    }

    public static zzgzx zze(zzgzx zzgzxVar, zzgzx zzgzxVar2) {
        int i7 = zzgzxVar.zzb + zzgzxVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzgzxVar.zzc, i7);
        System.arraycopy(zzgzxVar2.zzc, 0, iArrCopyOf, zzgzxVar.zzb, zzgzxVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzgzxVar.zzd, i7);
        System.arraycopy(zzgzxVar2.zzd, 0, objArrCopyOf, zzgzxVar.zzb, zzgzxVar2.zzb);
        return new zzgzx(i7, iArrCopyOf, objArrCopyOf, true);
    }

    public static zzgzx zzf() {
        return new zzgzx();
    }

    private final void zzn(int i7) {
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
        if (obj == null || !(obj instanceof zzgzx)) {
            return false;
        }
        zzgzx zzgzxVar = (zzgzx) obj;
        int i7 = this.zzb;
        if (i7 == zzgzxVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzgzxVar.zzc;
            for (int i8 = 0; i8 < i7; i8++) {
                if (iArr[i8] == iArr2[i8]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zzgzxVar.zzd;
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
        int iZzD;
        int iZzE;
        int iZzD2;
        int i7 = this.zze;
        if (i7 != -1) {
            return i7;
        }
        int iZzD3 = 0;
        for (int i8 = 0; i8 < this.zzb; i8++) {
            int i9 = this.zzc[i8];
            int i10 = i9 >>> 3;
            int i11 = i9 & 7;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        int i12 = i10 << 3;
                        zzgvy zzgvyVar = (zzgvy) this.zzd[i8];
                        int iZzD4 = zzgwl.zzD(i12);
                        int iZzd = zzgvyVar.zzd();
                        iZzD3 = zzgwl.zzD(iZzd) + iZzd + iZzD4 + iZzD3;
                    } else if (i11 == 3) {
                        int iZzD5 = zzgwl.zzD(i10 << 3);
                        iZzD = iZzD5 + iZzD5;
                        iZzE = ((zzgzx) this.zzd[i8]).zza();
                    } else {
                        if (i11 != 5) {
                            throw new IllegalStateException(new zzgxu("Protocol message tag had invalid wire type."));
                        }
                        ((Integer) this.zzd[i8]).getClass();
                        iZzD2 = zzgwl.zzD(i10 << 3) + 4;
                    }
                } else {
                    ((Long) this.zzd[i8]).getClass();
                    iZzD2 = zzgwl.zzD(i10 << 3) + 8;
                }
                iZzD3 = iZzD2 + iZzD3;
            } else {
                int i13 = i10 << 3;
                long jLongValue = ((Long) this.zzd[i8]).longValue();
                iZzD = zzgwl.zzD(i13);
                iZzE = zzgwl.zzE(jLongValue);
            }
            iZzD3 = iZzE + iZzD + iZzD3;
        }
        this.zze = iZzD3;
        return iZzD3;
    }

    public final int zzb() {
        int i7 = this.zze;
        if (i7 != -1) {
            return i7;
        }
        int iC = 0;
        for (int i8 = 0; i8 < this.zzb; i8++) {
            int i9 = this.zzc[i8] >>> 3;
            zzgvy zzgvyVar = (zzgvy) this.zzd[i8];
            int iZzD = zzgwl.zzD(8);
            int iZzD2 = zzgwl.zzD(i9) + zzgwl.zzD(16);
            int iZzD3 = zzgwl.zzD(24);
            int iZzd = zzgvyVar.zzd();
            iC += iZzD + iZzD + iZzD2 + AbstractC0486a1.c(iZzd, iZzd, iZzD3);
        }
        this.zze = iC;
        return iC;
    }

    public final zzgzx zzd(zzgzx zzgzxVar) {
        if (zzgzxVar.equals(zza)) {
            return this;
        }
        zzg();
        int i7 = this.zzb + zzgzxVar.zzb;
        zzn(i7);
        System.arraycopy(zzgzxVar.zzc, 0, this.zzc, this.zzb, zzgzxVar.zzb);
        System.arraycopy(zzgzxVar.zzd, 0, this.zzd, this.zzb, zzgzxVar.zzb);
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
            zzgyt.zzb(sb, i7, String.valueOf(this.zzc[i8] >>> 3), this.zzd[i8]);
        }
    }

    public final void zzj(int i7, Object obj) {
        zzg();
        zzn(this.zzb + 1);
        int[] iArr = this.zzc;
        int i8 = this.zzb;
        iArr[i8] = i7;
        this.zzd[i8] = obj;
        this.zzb = i8 + 1;
    }

    public final void zzk(zzhal zzhalVar) {
        for (int i7 = 0; i7 < this.zzb; i7++) {
            zzhalVar.zzw(this.zzc[i7] >>> 3, this.zzd[i7]);
        }
    }

    public final void zzl(zzhal zzhalVar) {
        if (this.zzb != 0) {
            for (int i7 = 0; i7 < this.zzb; i7++) {
                int i8 = this.zzc[i7];
                Object obj = this.zzd[i7];
                int i9 = i8 & 7;
                int i10 = i8 >>> 3;
                if (i9 == 0) {
                    zzhalVar.zzt(i10, ((Long) obj).longValue());
                } else if (i9 == 1) {
                    zzhalVar.zzm(i10, ((Long) obj).longValue());
                } else if (i9 == 2) {
                    zzhalVar.zzd(i10, (zzgvy) obj);
                } else if (i9 == 3) {
                    zzhalVar.zzF(i10);
                    ((zzgzx) obj).zzl(zzhalVar);
                    zzhalVar.zzh(i10);
                } else {
                    if (i9 != 5) {
                        throw new RuntimeException(new zzgxu("Protocol message tag had invalid wire type."));
                    }
                    zzhalVar.zzk(i10, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final boolean zzm(int i7, zzgwe zzgweVar) throws zzgxu {
        int iZzl;
        zzg();
        int i8 = i7 & 7;
        if (i8 == 0) {
            zzj(i7, Long.valueOf(zzgweVar.zzo()));
            return true;
        }
        if (i8 == 1) {
            zzj(i7, Long.valueOf(zzgweVar.zzn()));
            return true;
        }
        if (i8 == 2) {
            zzj(i7, zzgweVar.zzv());
            return true;
        }
        if (i8 != 3) {
            if (i8 == 4) {
                zzgweVar.zzy(0);
                return false;
            }
            if (i8 != 5) {
                throw new zzgxu("Protocol message tag had invalid wire type.");
            }
            zzj(i7, Integer.valueOf(zzgweVar.zzf()));
            return true;
        }
        zzgzx zzgzxVar = new zzgzx();
        do {
            iZzl = zzgweVar.zzl();
            if (iZzl == 0) {
                break;
            }
        } while (zzgzxVar.zzm(iZzl, zzgweVar));
        zzgweVar.zzy(4 | ((i7 >>> 3) << 3));
        zzj(i7, zzgzxVar);
        return true;
    }

    private zzgzx() {
        this(0, new int[8], new Object[8], true);
    }
}
