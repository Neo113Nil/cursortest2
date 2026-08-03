package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
final class zzpr extends com.google.android.gms.internal.consent_sdk.zzpv {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    zzpr(byte[] bArr, int i, int i2) {
        super(null);
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", java.lang.Integer.valueOf(length), 0, java.lang.Integer.valueOf(i2)));
        }
        this.zza = bArr;
        this.zzc = 0;
        this.zzb = i2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzI() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzJ(byte b) throws java.io.IOException {
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
                throw new com.google.android.gms.internal.consent_sdk.zzps(i, this.zzb, 1, indexOutOfBoundsException);
            }
        } catch (java.lang.IndexOutOfBoundsException e2) {
            indexOutOfBoundsException = e2;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzK(int i, boolean z) throws java.io.IOException {
        zzw(i << 3);
        zzJ(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzL(byte[] bArr, int i, int i2) throws java.io.IOException {
        zzw(i2);
        zze(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv, com.google.android.gms.internal.consent_sdk.zzpe
    public final void zza(byte[] bArr, int i, int i2) throws java.io.IOException {
        zze(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final int zzb() {
        return this.zzb - this.zzc;
    }

    public final void zze(byte[] bArr, int i, int i2) throws java.io.IOException {
        try {
            java.lang.System.arraycopy(bArr, 0, this.zza, this.zzc, i2);
            this.zzc += i2;
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new com.google.android.gms.internal.consent_sdk.zzps(this.zzc, this.zzb, i2, e);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzh(int i, com.google.android.gms.internal.consent_sdk.zzpm zzpmVar) throws java.io.IOException {
        zzw((i << 3) | 2);
        zzi(zzpmVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzi(com.google.android.gms.internal.consent_sdk.zzpm zzpmVar) throws java.io.IOException {
        zzw(zzpmVar.zzd());
        zzpmVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzj(int i, int i2) throws java.io.IOException {
        zzw((i << 3) | 5);
        zzk(i2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzk(int i) throws java.io.IOException {
        int i2 = this.zzc;
        try {
            byte[] bArr = this.zza;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.zzc = i2 + 4;
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new com.google.android.gms.internal.consent_sdk.zzps(i2, this.zzb, 4, e);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzl(int i, long j) throws java.io.IOException {
        zzw((i << 3) | 1);
        zzm(j);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzm(long j) throws java.io.IOException {
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
            throw new com.google.android.gms.internal.consent_sdk.zzps(i, this.zzb, 8, e);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzn(int i, int i2) throws java.io.IOException {
        zzw(i << 3);
        zzo(i2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzo(int i) throws java.io.IOException {
        if (i >= 0) {
            zzw(i);
        } else {
            zzy(i);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzp(com.google.android.gms.internal.consent_sdk.zzrq zzrqVar) throws java.io.IOException {
        zzw(zzrqVar.zzn());
        zzrqVar.zzB(this);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzq(int i, com.google.android.gms.internal.consent_sdk.zzrq zzrqVar) throws java.io.IOException {
        zzw(11);
        zzv(2, i);
        zzw(26);
        zzp(zzrqVar);
        zzw(12);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzr(int i, com.google.android.gms.internal.consent_sdk.zzpm zzpmVar) throws java.io.IOException {
        zzw(11);
        zzv(2, i);
        zzh(3, zzpmVar);
        zzw(12);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzs(int i, java.lang.String str) throws java.io.IOException {
        zzw((i << 3) | 2);
        zzt(str);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzt(java.lang.String str) throws java.io.IOException {
        int i = this.zzc;
        try {
            int zzC = zzC(str.length() * 3);
            int zzC2 = zzC(str.length());
            if (zzC2 != zzC) {
                zzw(com.google.android.gms.internal.consent_sdk.zzsy.zzb(str));
                byte[] bArr = this.zza;
                int i2 = this.zzc;
                this.zzc = com.google.android.gms.internal.consent_sdk.zzsy.zza(str, bArr, i2, this.zzb - i2);
                return;
            }
            int i3 = i + zzC2;
            this.zzc = i3;
            int zza = com.google.android.gms.internal.consent_sdk.zzsy.zza(str, this.zza, i3, this.zzb - i3);
            this.zzc = i;
            zzw((zza - i) - zzC2);
            this.zzc = zza;
        } catch (com.google.android.gms.internal.consent_sdk.zzsx e) {
            this.zzc = i;
            zzE(str, e);
        } catch (java.lang.IndexOutOfBoundsException e2) {
            throw new com.google.android.gms.internal.consent_sdk.zzps(e2);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzu(int i, int i2) throws java.io.IOException {
        zzw((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzv(int i, int i2) throws java.io.IOException {
        zzw(i << 3);
        zzw(i2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzx(int i, long j) throws java.io.IOException {
        zzw(i << 3);
        zzy(j);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzw(int i) throws java.io.IOException {
        int i2;
        java.lang.IndexOutOfBoundsException indexOutOfBoundsException;
        int i3 = this.zzc;
        while ((i & (-128)) != 0) {
            try {
                i2 = i3 + 1;
                try {
                    this.zza[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (java.lang.IndexOutOfBoundsException e) {
                    indexOutOfBoundsException = e;
                    i3 = i2;
                    throw new com.google.android.gms.internal.consent_sdk.zzps(i3, this.zzb, 1, indexOutOfBoundsException);
                }
            } catch (java.lang.IndexOutOfBoundsException e2) {
                indexOutOfBoundsException = e2;
                throw new com.google.android.gms.internal.consent_sdk.zzps(i3, this.zzb, 1, indexOutOfBoundsException);
            }
        }
        i2 = i3 + 1;
        this.zza[i3] = (byte) i;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzy(long j) throws java.io.IOException {
        boolean z;
        int i;
        java.lang.IndexOutOfBoundsException indexOutOfBoundsException;
        int i2;
        int i3 = this.zzc;
        z = com.google.android.gms.internal.consent_sdk.zzpv.zzb;
        if (!z || this.zzb - i3 < 10) {
            while ((j & (-128)) != 0) {
                try {
                    i2 = i3 + 1;
                } catch (java.lang.IndexOutOfBoundsException e) {
                    e = e;
                }
                try {
                    this.zza[i3] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i3 = i2;
                } catch (java.lang.IndexOutOfBoundsException e2) {
                    e = e2;
                    i3 = i2;
                    indexOutOfBoundsException = e;
                    throw new com.google.android.gms.internal.consent_sdk.zzps(i3, this.zzb, 1, indexOutOfBoundsException);
                }
            }
            i = i3 + 1;
            try {
                this.zza[i3] = (byte) j;
            } catch (java.lang.IndexOutOfBoundsException e3) {
                indexOutOfBoundsException = e3;
                i3 = i;
                throw new com.google.android.gms.internal.consent_sdk.zzps(i3, this.zzb, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j & (-128)) != 0) {
                com.google.android.gms.internal.consent_sdk.zzsw.zzn(this.zza, i3, (byte) (((int) j) | 128));
                j >>>= 7;
                i3++;
            }
            i = i3 + 1;
            com.google.android.gms.internal.consent_sdk.zzsw.zzn(this.zza, i3, (byte) j);
        }
        this.zzc = i;
    }
}
