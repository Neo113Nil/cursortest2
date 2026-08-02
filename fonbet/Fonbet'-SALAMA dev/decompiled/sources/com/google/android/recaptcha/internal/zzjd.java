package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
final class zzjd extends zzjg {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    public zzjd(byte[] bArr, int i7, int i8) {
        super(null);
        int length = bArr.length;
        if (((length - i8) | i8) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i8)));
        }
        this.zzb = bArr;
        this.zzd = 0;
        this.zzc = i8;
    }

    @Override // com.google.android.recaptcha.internal.zzjg
    public final int zza() {
        return this.zzc - this.zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzjg
    public final void zzb(byte b7) {
        try {
            byte[] bArr = this.zzb;
            int i7 = this.zzd;
            this.zzd = i7 + 1;
            bArr[i7] = b7;
        } catch (IndexOutOfBoundsException e7) {
            throw new zzje(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e7);
        }
    }

    public final void zzc(byte[] bArr, int i7, int i8) {
        try {
            System.arraycopy(bArr, 0, this.zzb, this.zzd, i8);
            this.zzd += i8;
        } catch (IndexOutOfBoundsException e7) {
            throw new zzje(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i8)), e7);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzjg
    public final void zzd(int i7, boolean z4) {
        zzq(i7 << 3);
        zzb(z4 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.recaptcha.internal.zzjg
    public final void zze(int i7, zziv zzivVar) {
        zzq((i7 << 3) | 2);
        zzq(zzivVar.zzd());
        zzivVar.zzh(this);
    }

    @Override // com.google.android.recaptcha.internal.zzjg
    public final void zzf(int i7, int i8) {
        zzq((i7 << 3) | 5);
        zzg(i8);
    }

    @Override // com.google.android.recaptcha.internal.zzjg
    public final void zzg(int i7) {
        try {
            byte[] bArr = this.zzb;
            int i8 = this.zzd;
            int i9 = i8 + 1;
            this.zzd = i9;
            bArr[i8] = (byte) (i7 & 255);
            int i10 = i8 + 2;
            this.zzd = i10;
            bArr[i9] = (byte) ((i7 >> 8) & 255);
            int i11 = i8 + 3;
            this.zzd = i11;
            bArr[i10] = (byte) ((i7 >> 16) & 255);
            this.zzd = i8 + 4;
            bArr[i11] = (byte) ((i7 >> 24) & 255);
        } catch (IndexOutOfBoundsException e7) {
            throw new zzje(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e7);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzjg
    public final void zzh(int i7, long j) {
        zzq((i7 << 3) | 1);
        zzi(j);
    }

    @Override // com.google.android.recaptcha.internal.zzjg
    public final void zzi(long j) {
        try {
            byte[] bArr = this.zzb;
            int i7 = this.zzd;
            int i8 = i7 + 1;
            this.zzd = i8;
            bArr[i7] = (byte) (((int) j) & 255);
            int i9 = i7 + 2;
            this.zzd = i9;
            bArr[i8] = (byte) (((int) (j >> 8)) & 255);
            int i10 = i7 + 3;
            this.zzd = i10;
            bArr[i9] = (byte) (((int) (j >> 16)) & 255);
            int i11 = i7 + 4;
            this.zzd = i11;
            bArr[i10] = (byte) (((int) (j >> 24)) & 255);
            int i12 = i7 + 5;
            this.zzd = i12;
            bArr[i11] = (byte) (((int) (j >> 32)) & 255);
            int i13 = i7 + 6;
            this.zzd = i13;
            bArr[i12] = (byte) (((int) (j >> 40)) & 255);
            int i14 = i7 + 7;
            this.zzd = i14;
            bArr[i13] = (byte) (((int) (j >> 48)) & 255);
            this.zzd = i7 + 8;
            bArr[i14] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e7) {
            throw new zzje(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e7);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzjg
    public final void zzj(int i7, int i8) {
        zzq(i7 << 3);
        zzk(i8);
    }

    @Override // com.google.android.recaptcha.internal.zzjg
    public final void zzk(int i7) {
        if (i7 >= 0) {
            zzq(i7);
        } else {
            zzs(i7);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzjg
    public final void zzl(byte[] bArr, int i7, int i8) {
        zzc(bArr, 0, i8);
    }

    @Override // com.google.android.recaptcha.internal.zzjg
    public final void zzm(int i7, String str) {
        zzq((i7 << 3) | 2);
        zzn(str);
    }

    public final void zzn(String str) {
        int i7 = this.zzd;
        try {
            int zzx = zzjg.zzx(str.length() * 3);
            int zzx2 = zzjg.zzx(str.length());
            if (zzx2 != zzx) {
                zzq(zznl.zzc(str));
                byte[] bArr = this.zzb;
                int i8 = this.zzd;
                this.zzd = zznl.zzb(str, bArr, i8, this.zzc - i8);
                return;
            }
            int i9 = i7 + zzx2;
            this.zzd = i9;
            int zzb = zznl.zzb(str, this.zzb, i9, this.zzc - i9);
            this.zzd = i7;
            zzq((zzb - i7) - zzx2);
            this.zzd = zzb;
        } catch (zznk e7) {
            this.zzd = i7;
            zzB(str, e7);
        } catch (IndexOutOfBoundsException e8) {
            throw new zzje(e8);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzjg
    public final void zzo(int i7, int i8) {
        zzq((i7 << 3) | i8);
    }

    @Override // com.google.android.recaptcha.internal.zzjg
    public final void zzp(int i7, int i8) {
        zzq(i7 << 3);
        zzq(i8);
    }

    @Override // com.google.android.recaptcha.internal.zzjg
    public final void zzq(int i7) {
        while ((i7 & (-128)) != 0) {
            try {
                byte[] bArr = this.zzb;
                int i8 = this.zzd;
                this.zzd = i8 + 1;
                bArr[i8] = (byte) ((i7 | 128) & 255);
                i7 >>>= 7;
            } catch (IndexOutOfBoundsException e7) {
                throw new zzje(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e7);
            }
        }
        byte[] bArr2 = this.zzb;
        int i9 = this.zzd;
        this.zzd = i9 + 1;
        bArr2[i9] = (byte) i7;
    }

    @Override // com.google.android.recaptcha.internal.zzjg
    public final void zzr(int i7, long j) {
        zzq(i7 << 3);
        zzs(j);
    }

    @Override // com.google.android.recaptcha.internal.zzjg
    public final void zzs(long j) {
        boolean z4;
        z4 = zzjg.zzc;
        if (!z4 || this.zzc - this.zzd < 10) {
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr = this.zzb;
                    int i7 = this.zzd;
                    this.zzd = i7 + 1;
                    bArr[i7] = (byte) ((((int) j) | 128) & 255);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e7) {
                    throw new zzje(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e7);
                }
            }
            byte[] bArr2 = this.zzb;
            int i8 = this.zzd;
            this.zzd = i8 + 1;
            bArr2[i8] = (byte) j;
            return;
        }
        while (true) {
            int i9 = (int) j;
            if ((j & (-128)) == 0) {
                byte[] bArr3 = this.zzb;
                int i10 = this.zzd;
                this.zzd = i10 + 1;
                zzni.zzn(bArr3, i10, (byte) i9);
                return;
            }
            byte[] bArr4 = this.zzb;
            int i11 = this.zzd;
            this.zzd = i11 + 1;
            zzni.zzn(bArr4, i11, (byte) ((i9 | 128) & 255));
            j >>>= 7;
        }
    }
}
