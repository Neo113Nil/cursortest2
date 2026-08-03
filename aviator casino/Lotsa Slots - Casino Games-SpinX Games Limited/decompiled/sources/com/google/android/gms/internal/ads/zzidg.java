package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzidg extends com.google.android.gms.internal.ads.zzidj {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    zzidg(byte[] bArr, int i, int i2) {
        super(null);
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", java.lang.Integer.valueOf(length), 0, java.lang.Integer.valueOf(i2)));
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzicr
    public final void zza(byte[] bArr, int i, int i2) throws java.io.IOException {
        zzv(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzidj
    public final void zzb(int i, int i2) throws java.io.IOException {
        zzr((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.ads.zzidj
    public final void zzc(int i, int i2) throws java.io.IOException {
        zzr(i << 3);
        zzq(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzidj
    public final void zzd(int i, int i2) throws java.io.IOException {
        zzr(i << 3);
        zzr(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzidj
    public final void zze(int i, int i2) throws java.io.IOException {
        zzr((i << 3) | 5);
        zzs(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzidj
    public final void zzf(int i, long j) throws java.io.IOException {
        zzr(i << 3);
        zzt(j);
    }

    @Override // com.google.android.gms.internal.ads.zzidj
    public final void zzg(int i, long j) throws java.io.IOException {
        zzr((i << 3) | 1);
        zzu(j);
    }

    @Override // com.google.android.gms.internal.ads.zzidj
    public final void zzh(int i, boolean z) throws java.io.IOException {
        zzr(i << 3);
        zzp(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzidj
    public final void zzi(int i, java.lang.String str) throws java.io.IOException {
        zzr((i << 3) | 2);
        zzw(str);
    }

    @Override // com.google.android.gms.internal.ads.zzidj
    public final void zzj(int i, com.google.android.gms.internal.ads.zzida zzidaVar) throws java.io.IOException {
        zzr((i << 3) | 2);
        zzk(zzidaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzidj
    public final void zzk(com.google.android.gms.internal.ads.zzida zzidaVar) throws java.io.IOException {
        zzr(zzidaVar.zzb());
        zzidaVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzidj
    public final void zzl(byte[] bArr, int i, int i2) throws java.io.IOException {
        zzr(i2);
        zzv(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzidj
    public final void zzm(int i, com.google.android.gms.internal.ads.zzifp zzifpVar) throws java.io.IOException {
        zzr(11);
        zzd(2, i);
        zzr(26);
        zzo(zzifpVar);
        zzr(12);
    }

    @Override // com.google.android.gms.internal.ads.zzidj
    public final void zzn(int i, com.google.android.gms.internal.ads.zzida zzidaVar) throws java.io.IOException {
        zzr(11);
        zzd(2, i);
        zzj(3, zzidaVar);
        zzr(12);
    }

    @Override // com.google.android.gms.internal.ads.zzidj
    public final void zzo(com.google.android.gms.internal.ads.zzifp zzifpVar) throws java.io.IOException {
        zzr(zzifpVar.zzbr());
        zzifpVar.zzcX(this);
    }

    @Override // com.google.android.gms.internal.ads.zzidj
    public final void zzp(byte b) throws java.io.IOException {
        java.lang.IndexOutOfBoundsException indexOutOfBoundsException;
        int i = this.zze;
        try {
            int i2 = i + 1;
            try {
                this.zzc[i] = b;
                this.zze = i2;
            } catch (java.lang.IndexOutOfBoundsException e) {
                indexOutOfBoundsException = e;
                i = i2;
                throw new com.google.android.gms.internal.ads.zzidh(i, this.zzd, 1, indexOutOfBoundsException);
            }
        } catch (java.lang.IndexOutOfBoundsException e2) {
            indexOutOfBoundsException = e2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidj
    public final void zzq(int i) throws java.io.IOException {
        if (i >= 0) {
            zzr(i);
        } else {
            zzt(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidj
    public final void zzs(int i) throws java.io.IOException {
        int i2 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.zze = i2 + 4;
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new com.google.android.gms.internal.ads.zzidh(i2, this.zzd, 4, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidj
    public final void zzu(long j) throws java.io.IOException {
        int i = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.zze = i + 8;
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new com.google.android.gms.internal.ads.zzidh(i, this.zzd, 8, e);
        }
    }

    public final void zzv(byte[] bArr, int i, int i2) throws java.io.IOException {
        try {
            java.lang.System.arraycopy(bArr, i, this.zzc, this.zze, i2);
            this.zze += i2;
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new com.google.android.gms.internal.ads.zzidh(this.zze, this.zzd, i2, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidj
    public final void zzw(java.lang.String str) throws java.io.IOException {
        int i = this.zze;
        try {
            int zzF = zzF(str.length() * 3);
            int zzF2 = zzF(str.length());
            if (zzF2 != zzF) {
                zzr(com.google.android.gms.internal.ads.zzihf.zzc(str));
                byte[] bArr = this.zzc;
                int i2 = this.zze;
                this.zze = com.google.android.gms.internal.ads.zzihf.zzd(str, bArr, i2, bArr.length - i2);
                return;
            }
            int i3 = i + zzF2;
            this.zze = i3;
            byte[] bArr2 = this.zzc;
            int zzd = com.google.android.gms.internal.ads.zzihf.zzd(str, bArr2, i3, bArr2.length - i3);
            this.zze = i;
            zzr((zzd - i) - zzF2);
            this.zze = zzd;
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new com.google.android.gms.internal.ads.zzidh(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidj
    public final void zzx() {
    }

    @Override // com.google.android.gms.internal.ads.zzidj
    public final int zzy() {
        return this.zzd - this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzidj
    public final void zzr(int i) throws java.io.IOException {
        int i2;
        java.lang.IndexOutOfBoundsException indexOutOfBoundsException;
        int i3 = this.zze;
        while ((i & (-128)) != 0) {
            try {
                i2 = i3 + 1;
                try {
                    this.zzc[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (java.lang.IndexOutOfBoundsException e) {
                    indexOutOfBoundsException = e;
                    i3 = i2;
                    throw new com.google.android.gms.internal.ads.zzidh(i3, this.zzd, 1, indexOutOfBoundsException);
                }
            } catch (java.lang.IndexOutOfBoundsException e2) {
                indexOutOfBoundsException = e2;
                throw new com.google.android.gms.internal.ads.zzidh(i3, this.zzd, 1, indexOutOfBoundsException);
            }
        }
        i2 = i3 + 1;
        this.zzc[i3] = (byte) i;
        this.zze = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzidj
    public final void zzt(long j) throws java.io.IOException {
        boolean z;
        int i;
        java.lang.IndexOutOfBoundsException indexOutOfBoundsException;
        int i2;
        z = com.google.android.gms.internal.ads.zzidj.zzc;
        int i3 = this.zze;
        if (!z || this.zzd - i3 < 10) {
            while ((j & (-128)) != 0) {
                try {
                    i2 = i3 + 1;
                } catch (java.lang.IndexOutOfBoundsException e) {
                    indexOutOfBoundsException = e;
                }
                try {
                    this.zzc[i3] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i3 = i2;
                } catch (java.lang.IndexOutOfBoundsException e2) {
                    indexOutOfBoundsException = e2;
                    i3 = i2;
                    throw new com.google.android.gms.internal.ads.zzidh(i3, this.zzd, 1, indexOutOfBoundsException);
                }
            }
            i = i3 + 1;
            try {
                this.zzc[i3] = (byte) j;
            } catch (java.lang.IndexOutOfBoundsException e3) {
                indexOutOfBoundsException = e3;
                i3 = i;
                throw new com.google.android.gms.internal.ads.zzidh(i3, this.zzd, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j & (-128)) != 0) {
                com.google.android.gms.internal.ads.zziha.zzo(this.zzc, i3, (byte) (((int) j) | 128));
                j >>>= 7;
                i3++;
            }
            i = i3 + 1;
            com.google.android.gms.internal.ads.zziha.zzo(this.zzc, i3, (byte) j);
        }
        this.zze = i;
    }
}
