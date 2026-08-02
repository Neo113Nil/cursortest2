package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import java.util.Arrays;

/* loaded from: classes.dex */
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
        int[] copyOf = Arrays.copyOf(zzgzxVar.zzc, i7);
        System.arraycopy(zzgzxVar2.zzc, 0, copyOf, zzgzxVar.zzb, zzgzxVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzgzxVar.zzd, i7);
        System.arraycopy(zzgzxVar2.zzd, 0, copyOf2, zzgzxVar.zzb, zzgzxVar2.zzb);
        return new zzgzx(i7, copyOf, copyOf2, true);
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
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzgzxVar.zzd;
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
        int i8 = i7 + 527;
        int[] iArr = this.zzc;
        int i9 = 17;
        int i10 = 17;
        for (int i11 = 0; i11 < i7; i11++) {
            i10 = (i10 * 31) + iArr[i11];
        }
        int i12 = ((i8 * 31) + i10) * 31;
        Object[] objArr = this.zzd;
        int i13 = this.zzb;
        for (int i14 = 0; i14 < i13; i14++) {
            i9 = (i9 * 31) + objArr[i14].hashCode();
        }
        return i12 + i9;
    }

    public final int zza() {
        int zzD;
        int zzE;
        int zzD2;
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
                    zzD2 = zzgwl.zzD(i11 << 3) + 8;
                } else if (i12 == 2) {
                    int i13 = i11 << 3;
                    zzgvy zzgvyVar = (zzgvy) this.zzd[i9];
                    int zzD3 = zzgwl.zzD(i13);
                    int zzd = zzgvyVar.zzd();
                    i8 = zzgwl.zzD(zzd) + zzd + zzD3 + i8;
                } else if (i12 == 3) {
                    int zzD4 = zzgwl.zzD(i11 << 3);
                    zzD = zzD4 + zzD4;
                    zzE = ((zzgzx) this.zzd[i9]).zza();
                } else {
                    if (i12 != 5) {
                        throw new IllegalStateException(new zzgxu("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i9]).getClass();
                    zzD2 = zzgwl.zzD(i11 << 3) + 4;
                }
                i8 = zzD2 + i8;
            } else {
                int i14 = i11 << 3;
                long longValue = ((Long) this.zzd[i9]).longValue();
                zzD = zzgwl.zzD(i14);
                zzE = zzgwl.zzE(longValue);
            }
            i8 = zzE + zzD + i8;
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
            int i10 = this.zzc[i9] >>> 3;
            zzgvy zzgvyVar = (zzgvy) this.zzd[i9];
            int zzD = zzgwl.zzD(8);
            int zzD2 = zzgwl.zzD(i10) + zzgwl.zzD(16);
            int zzD3 = zzgwl.zzD(24);
            int zzd = zzgvyVar.zzd();
            i8 += zzD + zzD + zzD2 + AbstractC0486a1.c(zzd, zzd, zzD3);
        }
        this.zze = i8;
        return i8;
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

    public final boolean zzm(int i7, zzgwe zzgweVar) {
        int zzl;
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
            zzl = zzgweVar.zzl();
            if (zzl == 0) {
                break;
            }
        } while (zzgzxVar.zzm(zzl, zzgweVar));
        zzgweVar.zzy(4 | ((i7 >>> 3) << 3));
        zzj(i7, zzgzxVar);
        return true;
    }

    private zzgzx() {
        this(0, new int[8], new Object[8], true);
    }
}
