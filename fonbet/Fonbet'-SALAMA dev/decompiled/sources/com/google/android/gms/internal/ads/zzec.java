package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzec {
    public byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd;

    public zzec(byte[] bArr, int i7) {
        this.zza = bArr;
        this.zzd = i7;
    }

    private final void zzq() {
        int i7;
        int i8 = this.zzb;
        boolean z4 = false;
        if (i8 >= 0 && (i8 < (i7 = this.zzd) || (i8 == i7 && this.zzc == 0))) {
            z4 = true;
        }
        zzcv.zzf(z4);
    }

    public final int zza() {
        return ((this.zzd - this.zzb) * 8) - this.zzc;
    }

    public final int zzb() {
        zzcv.zzf(this.zzc == 0);
        return this.zzb;
    }

    public final int zzc() {
        return (this.zzb * 8) + this.zzc;
    }

    public final int zzd(int i7) {
        int i8;
        if (i7 == 0) {
            return 0;
        }
        this.zzc += i7;
        int i9 = 0;
        while (true) {
            i8 = this.zzc;
            if (i8 <= 8) {
                break;
            }
            int i10 = i8 - 8;
            this.zzc = i10;
            byte[] bArr = this.zza;
            int i11 = this.zzb;
            this.zzb = i11 + 1;
            i9 |= (bArr[i11] & 255) << i10;
        }
        byte[] bArr2 = this.zza;
        int i12 = this.zzb;
        int i13 = i9 | ((bArr2[i12] & 255) >> (8 - i8));
        int i14 = 32 - i7;
        if (i8 == 8) {
            this.zzc = 0;
            this.zzb = i12 + 1;
        }
        int i15 = ((-1) >>> i14) & i13;
        zzq();
        return i15;
    }

    public final long zze(int i7) {
        if (i7 <= 32) {
            int zzd = zzd(i7);
            int i8 = zzen.zza;
            return 4294967295L & zzd;
        }
        int zzd2 = zzd(i7 - 32);
        int zzd3 = zzd(32);
        int i9 = zzen.zza;
        return (4294967295L & zzd3) | ((zzd2 & 4294967295L) << 32);
    }

    public final void zzf() {
        if (this.zzc == 0) {
            return;
        }
        this.zzc = 0;
        this.zzb++;
        zzq();
    }

    public final void zzg(int i7, int i8) {
        int min = Math.min(8 - this.zzc, 14);
        int i9 = this.zzc;
        int i10 = (8 - i9) - min;
        byte[] bArr = this.zza;
        int i11 = this.zzb;
        byte b7 = (byte) (((65280 >> i9) | ((1 << i10) - 1)) & bArr[i11]);
        bArr[i11] = b7;
        int i12 = 14 - min;
        int i13 = i7 & 16383;
        bArr[i11] = (byte) (b7 | ((i13 >>> i12) << i10));
        int i14 = i11 + 1;
        while (i12 > 8) {
            i12 -= 8;
            this.zza[i14] = (byte) (i13 >>> i12);
            i14++;
        }
        byte[] bArr2 = this.zza;
        byte b8 = (byte) (bArr2[i14] & ((1 << r0) - 1));
        bArr2[i14] = b8;
        bArr2[i14] = (byte) (((i13 & ((1 << i12) - 1)) << (8 - i12)) | b8);
        zzn(14);
        zzq();
    }

    public final void zzh(byte[] bArr, int i7, int i8) {
        int i9;
        int i10 = 0;
        while (true) {
            i9 = i8 >> 3;
            if (i10 >= i9) {
                break;
            }
            byte[] bArr2 = this.zza;
            int i11 = this.zzb;
            int i12 = i11 + 1;
            this.zzb = i12;
            byte b7 = bArr2[i11];
            int i13 = this.zzc;
            byte b8 = (byte) (b7 << i13);
            bArr[i10] = b8;
            bArr[i10] = (byte) (((bArr2[i12] & 255) >> (8 - i13)) | b8);
            i10++;
        }
        int i14 = i8 & 7;
        if (i14 == 0) {
            return;
        }
        byte b9 = (byte) (bArr[i9] & (255 >> i14));
        bArr[i9] = b9;
        int i15 = this.zzc;
        if (i15 + i14 > 8) {
            byte[] bArr3 = this.zza;
            int i16 = this.zzb;
            this.zzb = i16 + 1;
            b9 = (byte) (b9 | ((bArr3[i16] & 255) << i15));
            bArr[i9] = b9;
            i15 -= 8;
        }
        int i17 = i15 + i14;
        this.zzc = i17;
        byte[] bArr4 = this.zza;
        int i18 = this.zzb;
        bArr[i9] = (byte) (((byte) (((255 & bArr4[i18]) >> (8 - i17)) << (8 - i14))) | b9);
        if (i17 == 8) {
            this.zzc = 0;
            this.zzb = i18 + 1;
        }
        zzq();
    }

    public final void zzi(byte[] bArr, int i7, int i8) {
        zzcv.zzf(this.zzc == 0);
        System.arraycopy(this.zza, this.zzb, bArr, 0, i8);
        this.zzb += i8;
        zzq();
    }

    public final void zzj(zzed zzedVar) {
        zzk(zzedVar.zzN(), zzedVar.zze());
        zzl(zzedVar.zzd() * 8);
    }

    public final void zzk(byte[] bArr, int i7) {
        this.zza = bArr;
        this.zzb = 0;
        this.zzc = 0;
        this.zzd = i7;
    }

    public final void zzl(int i7) {
        int i8 = i7 / 8;
        this.zzb = i8;
        this.zzc = i7 - (i8 * 8);
        zzq();
    }

    public final void zzm() {
        int i7 = this.zzc + 1;
        this.zzc = i7;
        if (i7 == 8) {
            this.zzc = 0;
            this.zzb++;
        }
        zzq();
    }

    public final void zzn(int i7) {
        int i8 = i7 / 8;
        int i9 = this.zzb + i8;
        this.zzb = i9;
        int i10 = (i7 - (i8 * 8)) + this.zzc;
        this.zzc = i10;
        if (i10 > 7) {
            this.zzb = i9 + 1;
            this.zzc = i10 - 8;
        }
        zzq();
    }

    public final void zzo(int i7) {
        zzcv.zzf(this.zzc == 0);
        this.zzb += i7;
        zzq();
    }

    public final boolean zzp() {
        int i7 = this.zza[this.zzb] & (128 >> this.zzc);
        zzm();
        return i7 != 0;
    }

    public zzec() {
        this.zza = zzen.zzc;
    }
}
