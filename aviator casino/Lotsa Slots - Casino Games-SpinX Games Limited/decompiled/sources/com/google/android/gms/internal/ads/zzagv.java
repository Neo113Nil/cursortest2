package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzagv {
    public int zza;
    public java.lang.String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;

    public zzagv() {
    }

    public zzagv(com.google.android.gms.internal.ads.zzagv zzagvVar) {
        this.zza = zzagvVar.zza;
        this.zzb = zzagvVar.zzb;
        this.zzc = zzagvVar.zzc;
        this.zzd = zzagvVar.zzd;
        this.zze = zzagvVar.zze;
        this.zzf = zzagvVar.zzf;
        this.zzg = zzagvVar.zzg;
    }

    public final boolean zza(int i) {
        boolean zzl;
        int i2;
        int i3;
        int i4;
        int i5;
        java.lang.String[] strArr;
        int[] iArr;
        int zzm;
        int[] iArr2;
        int[] iArr3;
        int i6;
        int[] iArr4;
        int[] iArr5;
        int i7;
        int[] iArr6;
        zzl = com.google.android.gms.internal.ads.zzagw.zzl(i);
        if (!zzl || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i8 = i4 - 1;
        this.zza = i2;
        strArr = com.google.android.gms.internal.ads.zzagw.zza;
        this.zzb = strArr[3 - i3];
        iArr = com.google.android.gms.internal.ads.zzagw.zzb;
        int i9 = iArr[i5];
        this.zzd = i9;
        if (i2 == 2) {
            i9 /= 2;
            this.zzd = i9;
        } else if (i2 == 0) {
            i9 /= 4;
            this.zzd = i9;
        }
        int i10 = (i >>> 9) & 1;
        zzm = com.google.android.gms.internal.ads.zzagw.zzm(i2, i3);
        this.zzg = zzm;
        if (i3 == 3) {
            if (i2 == 3) {
                iArr6 = com.google.android.gms.internal.ads.zzagw.zzc;
                i7 = iArr6[i8];
            } else {
                iArr5 = com.google.android.gms.internal.ads.zzagw.zzd;
                i7 = iArr5[i8];
            }
            this.zzf = i7;
            this.zzc = (((i7 * 12) / i9) + i10) * 4;
        } else {
            if (i2 == 3) {
                if (i3 == 2) {
                    iArr4 = com.google.android.gms.internal.ads.zzagw.zze;
                    i6 = iArr4[i8];
                } else {
                    iArr3 = com.google.android.gms.internal.ads.zzagw.zzf;
                    i6 = iArr3[i8];
                }
                this.zzf = i6;
                this.zzc = ((i6 * 144) / i9) + i10;
            } else {
                iArr2 = com.google.android.gms.internal.ads.zzagw.zzg;
                int i11 = iArr2[i8];
                this.zzf = i11;
                this.zzc = (((i3 == 1 ? 72 : 144) * i11) / i9) + i10;
            }
        }
        this.zze = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
