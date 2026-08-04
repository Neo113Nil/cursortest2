package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzamn {
    private static final zzamn zza = new zzamn(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzamn() {
        this(0, new int[8], new Object[8], true);
    }

    public static zzamn zzc() {
        return zza;
    }

    public static zzamn zzd() {
        return new zzamn();
    }

    private final void zzf() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzamn)) {
            return false;
        }
        zzamn zzamnVar = (zzamn) obj;
        int i7 = this.zzb;
        if (i7 == zzamnVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzamnVar.zzc;
            for (int i8 = 0; i8 < i7; i8++) {
                if (iArr[i8] == iArr2[i8]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zzamnVar.zzd;
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
        int iZze;
        int i7 = this.zze;
        if (i7 != -1) {
            return i7;
        }
        int iZza = 0;
        for (int i8 = 0; i8 < this.zzb; i8++) {
            int i9 = this.zzc[i8];
            int i10 = i9 >>> 3;
            int i11 = i9 & 7;
            if (i11 == 0) {
                iZze = zzajg.zze(i10, ((Long) this.zzd[i8]).longValue());
            } else if (i11 == 1) {
                iZze = zzajg.zza(i10, ((Long) this.zzd[i8]).longValue());
            } else if (i11 != 2) {
                if (i11 == 3) {
                    iZza = ((zzamn) this.zzd[i8]).zza() + (zzajg.zzi(i10) << 1) + iZza;
                } else {
                    if (i11 != 5) {
                        throw new IllegalStateException(zzakf.zza());
                    }
                    iZze = zzajg.zzc(i10, ((Integer) this.zzd[i8]).intValue());
                }
            } else {
                iZze = zzajg.zza(i10, (zzaip) this.zzd[i8]);
            }
            iZza = iZze + iZza;
        }
        this.zze = iZza;
        return iZza;
    }

    public final int zzb() {
        int i7 = this.zze;
        if (i7 != -1) {
            return i7;
        }
        int iZzb = 0;
        for (int i8 = 0; i8 < this.zzb; i8++) {
            iZzb += zzajg.zzb(this.zzc[i8] >>> 3, (zzaip) this.zzd[i8]);
        }
        this.zze = iZzb;
        return iZzb;
    }

    public final void zze() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    private zzamn(int i7, int[] iArr, Object[] objArr, boolean z4) {
        this.zze = -1;
        this.zzb = i7;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z4;
    }

    public final void zzb(zzanf zzanfVar) {
        if (this.zzb == 0) {
            return;
        }
        if (zzanfVar.zza() == 1) {
            for (int i7 = 0; i7 < this.zzb; i7++) {
                zza(this.zzc[i7], this.zzd[i7], zzanfVar);
            }
            return;
        }
        for (int i8 = this.zzb - 1; i8 >= 0; i8--) {
            zza(this.zzc[i8], this.zzd[i8], zzanfVar);
        }
    }

    public final zzamn zza(zzamn zzamnVar) {
        if (zzamnVar.equals(zza)) {
            return this;
        }
        zzf();
        int i7 = this.zzb + zzamnVar.zzb;
        zza(i7);
        System.arraycopy(zzamnVar.zzc, 0, this.zzc, this.zzb, zzamnVar.zzb);
        System.arraycopy(zzamnVar.zzd, 0, this.zzd, this.zzb, zzamnVar.zzb);
        this.zzb = i7;
        return this;
    }

    public static zzamn zza(zzamn zzamnVar, zzamn zzamnVar2) {
        int i7 = zzamnVar.zzb + zzamnVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzamnVar.zzc, i7);
        System.arraycopy(zzamnVar2.zzc, 0, iArrCopyOf, zzamnVar.zzb, zzamnVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzamnVar.zzd, i7);
        System.arraycopy(zzamnVar2.zzd, 0, objArrCopyOf, zzamnVar.zzb, zzamnVar2.zzb);
        return new zzamn(i7, iArrCopyOf, objArrCopyOf, true);
    }

    private final void zza(int i7) {
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

    public final void zza(StringBuilder sb, int i7) {
        for (int i8 = 0; i8 < this.zzb; i8++) {
            zzalh.zza(sb, i7, String.valueOf(this.zzc[i8] >>> 3), this.zzd[i8]);
        }
    }

    public final void zza(int i7, Object obj) {
        zzf();
        zza(this.zzb + 1);
        int[] iArr = this.zzc;
        int i8 = this.zzb;
        iArr[i8] = i7;
        this.zzd[i8] = obj;
        this.zzb = i8 + 1;
    }

    public final void zza(zzanf zzanfVar) {
        if (zzanfVar.zza() == 2) {
            for (int i7 = this.zzb - 1; i7 >= 0; i7--) {
                zzanfVar.zza(this.zzc[i7] >>> 3, this.zzd[i7]);
            }
            return;
        }
        for (int i8 = 0; i8 < this.zzb; i8++) {
            zzanfVar.zza(this.zzc[i8] >>> 3, this.zzd[i8]);
        }
    }

    private static void zza(int i7, Object obj, zzanf zzanfVar) {
        int i8 = i7 >>> 3;
        int i9 = i7 & 7;
        if (i9 == 0) {
            zzanfVar.zzb(i8, ((Long) obj).longValue());
            return;
        }
        if (i9 == 1) {
            zzanfVar.zza(i8, ((Long) obj).longValue());
            return;
        }
        if (i9 == 2) {
            zzanfVar.zza(i8, (zzaip) obj);
            return;
        }
        if (i9 != 3) {
            if (i9 == 5) {
                zzanfVar.zzb(i8, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzakf.zza());
        }
        if (zzanfVar.zza() == 1) {
            zzanfVar.zzb(i8);
            ((zzamn) obj).zzb(zzanfVar);
            zzanfVar.zza(i8);
        } else {
            zzanfVar.zza(i8);
            ((zzamn) obj).zzb(zzanfVar);
            zzanfVar.zzb(i8);
        }
    }
}
