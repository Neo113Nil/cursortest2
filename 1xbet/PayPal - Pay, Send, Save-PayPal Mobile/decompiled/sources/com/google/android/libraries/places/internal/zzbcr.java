package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbcr extends com.google.android.libraries.places.internal.zzbcu {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    zzbcr(byte[] bArr, int i, int i2) {
        super(null);
        if (bArr == null) {
            throw new java.lang.NullPointerException("buffer");
        }
        int i3 = i + i2;
        int length = bArr.length;
        if ((i | i2 | (length - i3)) < 0) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", java.lang.Integer.valueOf(length), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
        }
        this.zza = bArr;
        this.zzc = i;
        this.zzb = i3;
    }

    @Override // com.google.android.libraries.places.internal.zzbcu
    public final void zzH(int i, int i2) throws java.io.IOException {
        zzq((i << 3) | i2);
    }

    @Override // com.google.android.libraries.places.internal.zzbcu
    public final void zzI(int i, int i2) throws java.io.IOException {
        zzq(i << 3);
        zzp(i2);
    }

    @Override // com.google.android.libraries.places.internal.zzbcu
    public final void zzJ(int i, int i2) throws java.io.IOException {
        zzq(i << 3);
        zzq(i2);
    }

    @Override // com.google.android.libraries.places.internal.zzbcu
    public final void zzK(int i, int i2) throws java.io.IOException {
        zzq((i << 3) | 5);
        zzr(i2);
    }

    @Override // com.google.android.libraries.places.internal.zzbcu
    public final void zzL(int i, long j) throws java.io.IOException {
        zzq(i << 3);
        zzs(j);
    }

    @Override // com.google.android.libraries.places.internal.zzbcu, com.google.android.libraries.places.internal.zzbce
    public final void zza(byte[] bArr, int i, int i2) throws java.io.IOException {
        zzu(bArr, i, i2);
    }

    @Override // com.google.android.libraries.places.internal.zzbcu
    public final void zzi(int i, long j) throws java.io.IOException {
        zzq((i << 3) | 1);
        zzt(j);
    }

    @Override // com.google.android.libraries.places.internal.zzbcu
    public final void zzj(int i, boolean z) throws java.io.IOException {
        zzq(i << 3);
        zzo(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.libraries.places.internal.zzbcu
    public final void zzk(int i, java.lang.String str) throws java.io.IOException {
        zzq((i << 3) | 2);
        zzv(str);
    }

    @Override // com.google.android.libraries.places.internal.zzbcu
    public final void zzl(int i, com.google.android.libraries.places.internal.zzbcl zzbclVar) throws java.io.IOException {
        zzq((i << 3) | 2);
        zzq(zzbclVar.zzc());
        zzbclVar.zze(this);
    }

    @Override // com.google.android.libraries.places.internal.zzbcu
    public final void zzm(int i, com.google.android.libraries.places.internal.zzbex zzbexVar) throws java.io.IOException {
        zzq(11);
        zzJ(2, i);
        zzq(26);
        zzq(zzbexVar.zzbx());
        zzbexVar.zzbL(this);
        zzq(12);
    }

    @Override // com.google.android.libraries.places.internal.zzbcu
    public final void zzn(int i, com.google.android.libraries.places.internal.zzbcl zzbclVar) throws java.io.IOException {
        zzq(11);
        zzJ(2, i);
        zzl(3, zzbclVar);
        zzq(12);
    }

    @Override // com.google.android.libraries.places.internal.zzbcu
    public final void zzo(byte b) throws java.io.IOException {
        java.lang.IndexOutOfBoundsException indexOutOfBoundsException;
        int i = this.zzc;
        try {
            int i2 = i + 1;
            try {
                this.zza[i] = b;
                this.zzc = i2;
            } catch (java.lang.IndexOutOfBoundsException e) {
                indexOutOfBoundsException = e;
                i = i2;
                throw new com.google.android.libraries.places.internal.zzbcs(i, this.zzb, 1, indexOutOfBoundsException);
            }
        } catch (java.lang.IndexOutOfBoundsException e2) {
            indexOutOfBoundsException = e2;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbcu
    public final void zzp(int i) throws java.io.IOException {
        if (i >= 0) {
            zzq(i);
        } else {
            zzs(i);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbcu
    public final void zzr(int i) throws java.io.IOException {
        int i2 = this.zzc;
        try {
            byte[] bArr = this.zza;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.zzc = i2 + 4;
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new com.google.android.libraries.places.internal.zzbcs(i2, this.zzb, 4, e);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbcu
    public final void zzt(long j) throws java.io.IOException {
        int i = this.zzc;
        try {
            byte[] bArr = this.zza;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.zzc = i + 8;
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new com.google.android.libraries.places.internal.zzbcs(i, this.zzb, 8, e);
        }
    }

    public final void zzu(byte[] bArr, int i, int i2) throws java.io.IOException {
        try {
            java.lang.System.arraycopy(bArr, i, this.zza, this.zzc, i2);
            this.zzc += i2;
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new com.google.android.libraries.places.internal.zzbcs(this.zzc, this.zzb, i2, e);
        }
    }

    public final void zzv(java.lang.String str) throws java.io.IOException {
        int i = this.zzc;
        try {
            int zzy = zzy(str.length() * 3);
            int zzy2 = zzy(str.length());
            if (zzy2 != zzy) {
                zzq(com.google.android.libraries.places.internal.zzbgi.zza(str));
                byte[] bArr = this.zza;
                int i2 = this.zzc;
                this.zzc = com.google.android.libraries.places.internal.zzbgi.zzb(str, bArr, i2, this.zzb - i2);
                return;
            }
            int i3 = i + zzy2;
            this.zzc = i3;
            int zzb = com.google.android.libraries.places.internal.zzbgi.zzb(str, this.zza, i3, this.zzb - i3);
            this.zzc = i;
            zzq((zzb - i) - zzy2);
            this.zzc = zzb;
        } catch (com.google.android.libraries.places.internal.zzbgh e) {
            this.zzc = i;
            zzD(str, e);
        } catch (java.lang.IndexOutOfBoundsException e2) {
            throw new com.google.android.libraries.places.internal.zzbcs(e2);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbcu
    public final void zzw() {
    }

    @Override // com.google.android.libraries.places.internal.zzbcu
    public final void zzq(int i) throws java.io.IOException {
        int i2;
        int i3 = this.zzc;
        while ((i & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
            try {
                i2 = i3 + 1;
            } catch (java.lang.IndexOutOfBoundsException e) {
                e = e;
                throw new com.google.android.libraries.places.internal.zzbcs(i3, this.zzb, 1, e);
            }
            try {
                this.zza[i3] = (byte) (i | 128);
                i >>>= 7;
                i3 = i2;
            } catch (java.lang.IndexOutOfBoundsException e2) {
                e = e2;
                i3 = i2;
                throw new com.google.android.libraries.places.internal.zzbcs(i3, this.zzb, 1, e);
            }
        }
        i2 = i3 + 1;
        this.zza[i3] = (byte) i;
        this.zzc = i2;
    }

    @Override // com.google.android.libraries.places.internal.zzbcu
    public final void zzs(long j) throws java.io.IOException {
        boolean z;
        int i;
        java.lang.IndexOutOfBoundsException indexOutOfBoundsException;
        int i2;
        z = com.google.android.libraries.places.internal.zzbcu.zzb;
        int i3 = this.zzc;
        if (!z || this.zzb - i3 < 10) {
            while ((j & (-128)) != 0) {
                try {
                    i2 = i3 + 1;
                } catch (java.lang.IndexOutOfBoundsException e) {
                    indexOutOfBoundsException = e;
                }
                try {
                    this.zza[i3] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i3 = i2;
                } catch (java.lang.IndexOutOfBoundsException e2) {
                    indexOutOfBoundsException = e2;
                    i3 = i2;
                    throw new com.google.android.libraries.places.internal.zzbcs(i3, this.zzb, 1, indexOutOfBoundsException);
                }
            }
            i = i3 + 1;
            try {
                this.zza[i3] = (byte) j;
            } catch (java.lang.IndexOutOfBoundsException e3) {
                indexOutOfBoundsException = e3;
                i3 = i;
                throw new com.google.android.libraries.places.internal.zzbcs(i3, this.zzb, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j & (-128)) != 0) {
                com.google.android.libraries.places.internal.zzbgf.zzp(this.zza, i3, (byte) (((int) j) | 128));
                j >>>= 7;
                i3++;
            }
            i = i3 + 1;
            com.google.android.libraries.places.internal.zzbgf.zzp(this.zza, i3, (byte) j);
        }
        this.zzc = i;
    }

    @Override // com.google.android.libraries.places.internal.zzbcu
    public final int zzc() {
        return this.zzb - this.zzc;
    }
}
