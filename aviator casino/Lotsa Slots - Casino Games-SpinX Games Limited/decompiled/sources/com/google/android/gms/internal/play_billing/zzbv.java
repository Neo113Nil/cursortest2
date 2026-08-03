package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
final class zzbv extends com.google.android.gms.internal.play_billing.zzby {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    zzbv(byte[] bArr, int i, int i2) {
        super(null);
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", java.lang.Integer.valueOf(length), 0, java.lang.Integer.valueOf(i2)));
        }
        this.zzb = bArr;
        this.zzd = 0;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final int zza() {
        return this.zzc - this.zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzd(int i, boolean z) throws java.io.IOException {
        zzq(i << 3);
        zzb(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zze(int i, com.google.android.gms.internal.play_billing.zzbq zzbqVar) throws java.io.IOException {
        zzq((i << 3) | 2);
        zzq(zzbqVar.zzd());
        zzbqVar.zzh(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzf(int i, int i2) throws java.io.IOException {
        zzq((i << 3) | 5);
        zzg(i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzg(int i) throws java.io.IOException {
        try {
            byte[] bArr = this.zzb;
            int i2 = this.zzd;
            bArr[i2] = (byte) (i & 255);
            bArr[i2 + 1] = (byte) ((i >> 8) & 255);
            bArr[i2 + 2] = (byte) ((i >> 16) & 255);
            this.zzd = i2 + 4;
            bArr[i2 + 3] = (byte) ((i >> 24) & 255);
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new com.google.android.gms.internal.play_billing.zzbw(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.zzd), java.lang.Integer.valueOf(this.zzc), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzh(int i, long j) throws java.io.IOException {
        zzq((i << 3) | 1);
        zzi(j);
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzi(long j) throws java.io.IOException {
        try {
            byte[] bArr = this.zzb;
            int i = this.zzd;
            bArr[i] = (byte) (((int) j) & 255);
            bArr[i + 1] = (byte) (((int) (j >> 8)) & 255);
            bArr[i + 2] = (byte) (((int) (j >> 16)) & 255);
            bArr[i + 3] = (byte) (((int) (j >> 24)) & 255);
            bArr[i + 4] = (byte) (((int) (j >> 32)) & 255);
            bArr[i + 5] = (byte) (((int) (j >> 40)) & 255);
            bArr[i + 6] = (byte) (((int) (j >> 48)) & 255);
            this.zzd = i + 8;
            bArr[i + 7] = (byte) (((int) (j >> 56)) & 255);
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new com.google.android.gms.internal.play_billing.zzbw(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.zzd), java.lang.Integer.valueOf(this.zzc), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzj(int i, int i2) throws java.io.IOException {
        zzq(i << 3);
        zzk(i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzk(int i) throws java.io.IOException {
        if (i >= 0) {
            zzq(i);
        } else {
            zzs(i);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzl(byte[] bArr, int i, int i2) throws java.io.IOException {
        zzc(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzm(int i, java.lang.String str) throws java.io.IOException {
        zzq((i << 3) | 2);
        zzn(str);
    }

    public final void zzn(java.lang.String str) throws java.io.IOException {
        int i = this.zzd;
        try {
            int zzw = zzw(str.length() * 3);
            int zzw2 = zzw(str.length());
            if (zzw2 != zzw) {
                zzq(com.google.android.gms.internal.play_billing.zzfu.zzc(str));
                byte[] bArr = this.zzb;
                int i2 = this.zzd;
                this.zzd = com.google.android.gms.internal.play_billing.zzfu.zzb(str, bArr, i2, this.zzc - i2);
                return;
            }
            int i3 = i + zzw2;
            this.zzd = i3;
            int zzb = com.google.android.gms.internal.play_billing.zzfu.zzb(str, this.zzb, i3, this.zzc - i3);
            this.zzd = i;
            zzq((zzb - i) - zzw2);
            this.zzd = zzb;
        } catch (com.google.android.gms.internal.play_billing.zzft e) {
            this.zzd = i;
            zzA(str, e);
        } catch (java.lang.IndexOutOfBoundsException e2) {
            throw new com.google.android.gms.internal.play_billing.zzbw(e2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzo(int i, int i2) throws java.io.IOException {
        zzq((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzp(int i, int i2) throws java.io.IOException {
        zzq(i << 3);
        zzq(i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzr(int i, long j) throws java.io.IOException {
        zzq(i << 3);
        zzs(j);
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzb(byte b) throws java.io.IOException {
        try {
            byte[] bArr = this.zzb;
            int i = this.zzd;
            this.zzd = i + 1;
            bArr[i] = b;
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new com.google.android.gms.internal.play_billing.zzbw(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.zzd), java.lang.Integer.valueOf(this.zzc), 1), e);
        }
    }

    public final void zzc(byte[] bArr, int i, int i2) throws java.io.IOException {
        try {
            java.lang.System.arraycopy(bArr, 0, this.zzb, this.zzd, i2);
            this.zzd += i2;
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new com.google.android.gms.internal.play_billing.zzbw(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.zzd), java.lang.Integer.valueOf(this.zzc), java.lang.Integer.valueOf(i2)), e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzq(int i) throws java.io.IOException {
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.zzb;
                int i2 = this.zzd;
                this.zzd = i2 + 1;
                bArr[i2] = (byte) ((i | 128) & 255);
                i >>>= 7;
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new com.google.android.gms.internal.play_billing.zzbw(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.zzd), java.lang.Integer.valueOf(this.zzc), 1), e);
            }
        }
        byte[] bArr2 = this.zzb;
        int i3 = this.zzd;
        this.zzd = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzby
    public final void zzs(long j) throws java.io.IOException {
        boolean z;
        z = com.google.android.gms.internal.play_billing.zzby.zzc;
        if (!z || this.zzc - this.zzd < 10) {
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr = this.zzb;
                    int i = this.zzd;
                    this.zzd = i + 1;
                    bArr[i] = (byte) ((((int) j) | 128) & 255);
                    j >>>= 7;
                } catch (java.lang.IndexOutOfBoundsException e) {
                    throw new com.google.android.gms.internal.play_billing.zzbw(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.zzd), java.lang.Integer.valueOf(this.zzc), 1), e);
                }
            }
            byte[] bArr2 = this.zzb;
            int i2 = this.zzd;
            this.zzd = i2 + 1;
            bArr2[i2] = (byte) j;
            return;
        }
        while (true) {
            int i3 = (int) j;
            if ((j & (-128)) == 0) {
                byte[] bArr3 = this.zzb;
                int i4 = this.zzd;
                this.zzd = i4 + 1;
                com.google.android.gms.internal.play_billing.zzfp.zzn(bArr3, i4, (byte) i3);
                return;
            }
            byte[] bArr4 = this.zzb;
            int i5 = this.zzd;
            this.zzd = i5 + 1;
            com.google.android.gms.internal.play_billing.zzfp.zzn(bArr4, i5, (byte) ((i3 | 128) & 255));
            j >>>= 7;
        }
    }
}
