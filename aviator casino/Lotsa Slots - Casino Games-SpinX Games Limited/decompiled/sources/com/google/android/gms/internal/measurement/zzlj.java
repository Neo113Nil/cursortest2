package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
final class zzlj extends com.google.android.gms.internal.measurement.zzll {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    zzlj(byte[] bArr, int i, int i2) {
        super(null);
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", java.lang.Integer.valueOf(length), 0, java.lang.Integer.valueOf(i2)));
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zza(int i, int i2) throws java.io.IOException {
        zzr((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzb(int i, int i2) throws java.io.IOException {
        zzr(i << 3);
        zzq(i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzc(int i, int i2) throws java.io.IOException {
        zzr(i << 3);
        zzr(i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzd(int i, int i2) throws java.io.IOException {
        zzr((i << 3) | 5);
        zzs(i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zze(int i, long j) throws java.io.IOException {
        zzr(i << 3);
        zzt(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzf(int i, long j) throws java.io.IOException {
        zzr((i << 3) | 1);
        zzu(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzg(int i, boolean z) throws java.io.IOException {
        zzr(i << 3);
        zzp(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzh(int i, java.lang.String str) throws java.io.IOException {
        zzr((i << 3) | 2);
        zzx(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzi(int i, com.google.android.gms.internal.measurement.zzlg zzlgVar) throws java.io.IOException {
        zzr((i << 3) | 2);
        zzj(zzlgVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzj(com.google.android.gms.internal.measurement.zzlg zzlgVar) throws java.io.IOException {
        zzr(zzlgVar.zzc());
        zzlgVar.zzf(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzk(byte[] bArr, int i, int i2) throws java.io.IOException {
        zzr(i2);
        zzv(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    final void zzl(int i, com.google.android.gms.internal.measurement.zznl zznlVar, com.google.android.gms.internal.measurement.zznw zznwVar) throws java.io.IOException {
        zzr((i << 3) | 2);
        zzr(((com.google.android.gms.internal.measurement.zzkr) zznlVar).zzcd(zznwVar));
        zznwVar.zzf(zznlVar, this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzm(int i, com.google.android.gms.internal.measurement.zznl zznlVar) throws java.io.IOException {
        zzr(11);
        zzc(2, i);
        zzr(26);
        zzo(zznlVar);
        zzr(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzn(int i, com.google.android.gms.internal.measurement.zzlg zzlgVar) throws java.io.IOException {
        zzr(11);
        zzc(2, i);
        zzi(3, zzlgVar);
        zzr(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzo(com.google.android.gms.internal.measurement.zznl zznlVar) throws java.io.IOException {
        zzr(zznlVar.zzcn());
        zznlVar.zzcB(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
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
                throw new com.google.android.gms.internal.measurement.zzlk(i, this.zzd, 1, indexOutOfBoundsException);
            }
        } catch (java.lang.IndexOutOfBoundsException e2) {
            indexOutOfBoundsException = e2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzq(int i) throws java.io.IOException {
        if (i >= 0) {
            zzr(i);
        } else {
            zzt(i);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzll
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
            throw new com.google.android.gms.internal.measurement.zzlk(i2, this.zzd, 4, e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzll
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
            throw new com.google.android.gms.internal.measurement.zzlk(i, this.zzd, 8, e);
        }
    }

    public final void zzv(byte[] bArr, int i, int i2) throws java.io.IOException {
        try {
            java.lang.System.arraycopy(bArr, 0, this.zzc, this.zze, i2);
            this.zze += i2;
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new com.google.android.gms.internal.measurement.zzlk(this.zze, this.zzd, i2, e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzw(byte[] bArr, int i, int i2) throws java.io.IOException {
        zzv(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzx(java.lang.String str) throws java.io.IOException {
        int i = this.zze;
        try {
            int zzz = zzz(str.length() * 3);
            int zzz2 = zzz(str.length());
            if (zzz2 != zzz) {
                zzr(com.google.android.gms.internal.measurement.zzor.zzb(str));
                byte[] bArr = this.zzc;
                int i2 = this.zze;
                this.zze = com.google.android.gms.internal.measurement.zzor.zzc(str, bArr, i2, this.zzd - i2);
                return;
            }
            int i3 = i + zzz2;
            this.zze = i3;
            int zzc = com.google.android.gms.internal.measurement.zzor.zzc(str, this.zzc, i3, this.zzd - i3);
            this.zze = i;
            zzr((zzc - i) - zzz2);
            this.zze = zzc;
        } catch (com.google.android.gms.internal.measurement.zzoq e) {
            this.zze = i;
            zzF(str, e);
        } catch (java.lang.IndexOutOfBoundsException e2) {
            throw new com.google.android.gms.internal.measurement.zzlk(e2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final int zzy() {
        return this.zzd - this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzll
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
                    throw new com.google.android.gms.internal.measurement.zzlk(i3, this.zzd, 1, indexOutOfBoundsException);
                }
            } catch (java.lang.IndexOutOfBoundsException e2) {
                indexOutOfBoundsException = e2;
                throw new com.google.android.gms.internal.measurement.zzlk(i3, this.zzd, 1, indexOutOfBoundsException);
            }
        }
        i2 = i3 + 1;
        this.zzc[i3] = (byte) i;
        this.zze = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzt(long j) throws java.io.IOException {
        boolean z;
        int i;
        java.lang.IndexOutOfBoundsException indexOutOfBoundsException;
        int i2;
        z = com.google.android.gms.internal.measurement.zzll.zzd;
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
                    throw new com.google.android.gms.internal.measurement.zzlk(i3, this.zzd, 1, indexOutOfBoundsException);
                }
            }
            i = i3 + 1;
            try {
                this.zzc[i3] = (byte) j;
            } catch (java.lang.IndexOutOfBoundsException e3) {
                indexOutOfBoundsException = e3;
                i3 = i;
                throw new com.google.android.gms.internal.measurement.zzlk(i3, this.zzd, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j & (-128)) != 0) {
                com.google.android.gms.internal.measurement.zzoo.zzp(this.zzc, i3, (byte) (((int) j) | 128));
                j >>>= 7;
                i3++;
            }
            i = i3 + 1;
            com.google.android.gms.internal.measurement.zzoo.zzp(this.zzc, i3, (byte) j);
        }
        this.zze = i;
    }
}
