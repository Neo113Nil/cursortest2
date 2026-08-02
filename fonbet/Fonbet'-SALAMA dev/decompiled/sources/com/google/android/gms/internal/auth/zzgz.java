package com.google.android.gms.internal.auth;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzgz {
    private static final zzgz zza = new zzgz(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private boolean zze;

    private zzgz(int i7, int[] iArr, Object[] objArr, boolean z4) {
        this.zzb = i7;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = z4;
    }

    public static zzgz zza() {
        return zza;
    }

    public static zzgz zzb(zzgz zzgzVar, zzgz zzgzVar2) {
        int i7 = zzgzVar.zzb + zzgzVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzgzVar.zzc, i7);
        System.arraycopy(zzgzVar2.zzc, 0, copyOf, zzgzVar.zzb, zzgzVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzgzVar.zzd, i7);
        System.arraycopy(zzgzVar2.zzd, 0, copyOf2, zzgzVar.zzb, zzgzVar2.zzb);
        return new zzgz(i7, copyOf, copyOf2, true);
    }

    public static zzgz zzc() {
        return new zzgz(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzgz)) {
            return false;
        }
        zzgz zzgzVar = (zzgz) obj;
        int i7 = this.zzb;
        if (i7 == zzgzVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzgzVar.zzc;
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzgzVar.zzd;
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

    public final void zzd() {
        this.zze = false;
    }

    public final void zze(StringBuilder sb, int i7) {
        for (int i8 = 0; i8 < this.zzb; i8++) {
            zzfy.zzb(sb, i7, String.valueOf(this.zzc[i8] >>> 3), this.zzd[i8]);
        }
    }

    public final void zzf(int i7, Object obj) {
        if (!this.zze) {
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

    private zzgz() {
        this(0, new int[8], new Object[8], true);
    }
}
