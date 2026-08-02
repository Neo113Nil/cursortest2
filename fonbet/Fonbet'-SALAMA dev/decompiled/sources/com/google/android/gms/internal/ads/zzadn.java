package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;

/* loaded from: classes.dex */
public final class zzadn {
    public int zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;

    public zzadn() {
    }

    public final boolean zza(int i7) {
        boolean zzm;
        int i8;
        int i9;
        int i10;
        int i11;
        String[] strArr;
        int[] iArr;
        int zzl;
        int[] iArr2;
        int[] iArr3;
        int i12;
        int[] iArr4;
        int[] iArr5;
        int i13;
        int[] iArr6;
        zzm = zzado.zzm(i7);
        if (!zzm || (i8 = (i7 >>> 19) & 3) == 1 || (i9 = (i7 >>> 17) & 3) == 0 || (i10 = (i7 >>> 12) & 15) == 0 || i10 == 15 || (i11 = (i7 >>> 10) & 3) == 3) {
            return false;
        }
        int i14 = i10 - 1;
        this.zza = i8;
        strArr = zzado.zza;
        this.zzb = strArr[3 - i9];
        iArr = zzado.zzb;
        int i15 = iArr[i11];
        this.zzd = i15;
        if (i8 == 2) {
            i15 /= 2;
            this.zzd = i15;
        } else if (i8 == 0) {
            i15 /= 4;
            this.zzd = i15;
        }
        int i16 = (i7 >>> 9) & 1;
        zzl = zzado.zzl(i8, i9);
        this.zzg = zzl;
        if (i9 == 3) {
            if (i8 == 3) {
                iArr6 = zzado.zzc;
                i13 = iArr6[i14];
            } else {
                iArr5 = zzado.zzd;
                i13 = iArr5[i14];
            }
            this.zzf = i13;
            this.zzc = (((i13 * 12) / i15) + i16) * 4;
        } else {
            if (i8 == 3) {
                if (i9 == 2) {
                    iArr4 = zzado.zze;
                    i12 = iArr4[i14];
                } else {
                    iArr3 = zzado.zzf;
                    i12 = iArr3[i14];
                }
                this.zzf = i12;
                this.zzc = AbstractC0486a1.q(i12, 144, i15, i16);
            } else {
                iArr2 = zzado.zzg;
                int i17 = iArr2[i14];
                this.zzf = i17;
                this.zzc = AbstractC0486a1.q(i9 == 1 ? 72 : 144, i17, i15, i16);
            }
        }
        this.zze = ((i7 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }

    public zzadn(zzadn zzadnVar) {
        this.zza = zzadnVar.zza;
        this.zzb = zzadnVar.zzb;
        this.zzc = zzadnVar.zzc;
        this.zzd = zzadnVar.zzd;
        this.zze = zzadnVar.zze;
        this.zzf = zzadnVar.zzf;
        this.zzg = zzadnVar.zzg;
    }
}
