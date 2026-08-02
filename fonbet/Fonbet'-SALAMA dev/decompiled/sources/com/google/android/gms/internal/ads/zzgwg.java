package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract class zzgwg extends zzgwl {
    final byte[] zza;
    final int zzb;
    int zzc;
    int zzd;

    public zzgwg(int i7) {
        super(null);
        if (i7 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i7, 20)];
        this.zza = bArr;
        this.zzb = bArr.length;
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final int zzb() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    public final void zzc(byte b7) {
        byte[] bArr = this.zza;
        int i7 = this.zzc;
        bArr[i7] = b7;
        this.zzc = i7 + 1;
        this.zzd++;
    }

    public final void zzd(int i7) {
        int i8 = this.zzc;
        byte[] bArr = this.zza;
        bArr[i8] = (byte) i7;
        bArr[i8 + 1] = (byte) (i7 >> 8);
        bArr[i8 + 2] = (byte) (i7 >> 16);
        bArr[i8 + 3] = (byte) (i7 >> 24);
        this.zzc = i8 + 4;
        this.zzd += 4;
    }

    public final void zze(long j) {
        int i7 = this.zzc;
        byte[] bArr = this.zza;
        bArr[i7] = (byte) j;
        bArr[i7 + 1] = (byte) (j >> 8);
        bArr[i7 + 2] = (byte) (j >> 16);
        bArr[i7 + 3] = (byte) (j >> 24);
        bArr[i7 + 4] = (byte) (j >> 32);
        bArr[i7 + 5] = (byte) (j >> 40);
        bArr[i7 + 6] = (byte) (j >> 48);
        bArr[i7 + 7] = (byte) (j >> 56);
        this.zzc = i7 + 8;
        this.zzd += 8;
    }

    public final void zzf(int i7) {
        boolean z4;
        z4 = zzgwl.zzb;
        if (!z4) {
            while ((i7 & (-128)) != 0) {
                byte[] bArr = this.zza;
                int i8 = this.zzc;
                this.zzc = i8 + 1;
                bArr[i8] = (byte) (i7 | 128);
                this.zzd++;
                i7 >>>= 7;
            }
            byte[] bArr2 = this.zza;
            int i9 = this.zzc;
            this.zzc = i9 + 1;
            bArr2[i9] = (byte) i7;
            this.zzd++;
            return;
        }
        long j = this.zzc;
        while ((i7 & (-128)) != 0) {
            byte[] bArr3 = this.zza;
            int i10 = this.zzc;
            this.zzc = i10 + 1;
            zzhad.zzq(bArr3, i10, (byte) (i7 | 128));
            i7 >>>= 7;
        }
        byte[] bArr4 = this.zza;
        int i11 = this.zzc;
        this.zzc = i11 + 1;
        zzhad.zzq(bArr4, i11, (byte) i7);
        this.zzd += (int) (this.zzc - j);
    }

    public final void zzg(long j) {
        boolean z4;
        z4 = zzgwl.zzb;
        if (z4) {
            long j3 = this.zzc;
            while (true) {
                int i7 = (int) j;
                if ((j & (-128)) == 0) {
                    byte[] bArr = this.zza;
                    int i8 = this.zzc;
                    this.zzc = i8 + 1;
                    zzhad.zzq(bArr, i8, (byte) i7);
                    this.zzd += (int) (this.zzc - j3);
                    return;
                }
                byte[] bArr2 = this.zza;
                int i9 = this.zzc;
                this.zzc = i9 + 1;
                zzhad.zzq(bArr2, i9, (byte) (i7 | 128));
                j >>>= 7;
            }
        } else {
            while (true) {
                int i10 = (int) j;
                if ((j & (-128)) == 0) {
                    byte[] bArr3 = this.zza;
                    int i11 = this.zzc;
                    this.zzc = i11 + 1;
                    bArr3[i11] = (byte) i10;
                    this.zzd++;
                    return;
                }
                byte[] bArr4 = this.zza;
                int i12 = this.zzc;
                this.zzc = i12 + 1;
                bArr4[i12] = (byte) (i10 | 128);
                this.zzd++;
                j >>>= 7;
            }
        }
    }
}
