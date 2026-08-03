package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzen extends com.google.android.gms.internal.play_games_inputmapping.zzep {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    zzen(byte[] bArr, int i, int i2) {
        super(null);
        if (bArr == null) {
            throw new java.lang.NullPointerException("buffer");
        }
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", java.lang.Integer.valueOf(length), 0, java.lang.Integer.valueOf(i2)));
        }
        this.zzb = bArr;
        this.zzd = 0;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzep
    public final void zza(int i, int i2) throws java.io.IOException {
        zzl((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzep
    public final void zzb(int i, int i2) throws java.io.IOException {
        zzl(i << 3);
        zzk(i2);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzep
    public final void zzc(int i, int i2) throws java.io.IOException {
        zzl(i << 3);
        zzl(i2);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzep
    public final void zzd(int i, int i2) throws java.io.IOException {
        zzl((i << 3) | 5);
        zzm(i2);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzep
    public final void zze(int i, long j) throws java.io.IOException {
        zzl(i << 3);
        zzn(j);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzep
    public final void zzf(int i, long j) throws java.io.IOException {
        zzl((i << 3) | 1);
        zzo(j);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzep
    public final void zzg(int i, boolean z) throws java.io.IOException {
        zzl(i << 3);
        zzj(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzep
    public final void zzh(int i, java.lang.String str) throws java.io.IOException {
        zzl((i << 3) | 2);
        zzr(str);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzep
    public final void zzi(int i, com.google.android.gms.internal.play_games_inputmapping.zzek zzekVar) throws java.io.IOException {
        zzl((i << 3) | 2);
        zzl(zzekVar.zzc());
        zzekVar.zzf(this);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzep
    public final void zzk(int i) throws java.io.IOException {
        if (i >= 0) {
            zzl(i);
        } else {
            zzn(i);
        }
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzep
    public final void zzm(int i) throws java.io.IOException {
        try {
            byte[] bArr = this.zzb;
            int i2 = this.zzd;
            bArr[i2] = (byte) (i & 255);
            bArr[i2 + 1] = (byte) ((i >> 8) & 255);
            bArr[i2 + 2] = (byte) ((i >> 16) & 255);
            this.zzd = i2 + 4;
            bArr[i2 + 3] = (byte) ((i >> 24) & 255);
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new com.google.android.gms.internal.play_games_inputmapping.zzeo(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.zzd), java.lang.Integer.valueOf(this.zzc), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzep
    public final void zzo(long j) throws java.io.IOException {
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
            throw new com.google.android.gms.internal.play_games_inputmapping.zzeo(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.zzd), java.lang.Integer.valueOf(this.zzc), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzep
    public final void zzq(byte[] bArr, int i, int i2) throws java.io.IOException {
        zzp(bArr, 0, i2);
    }

    public final void zzr(java.lang.String str) throws java.io.IOException {
        int i = this.zzd;
        try {
            int zzw = zzw(str.length() * 3);
            int zzw2 = zzw(str.length());
            if (zzw2 != zzw) {
                zzl(com.google.android.gms.internal.play_games_inputmapping.zzhr.zzc(str));
                byte[] bArr = this.zzb;
                int i2 = this.zzd;
                this.zzd = com.google.android.gms.internal.play_games_inputmapping.zzhr.zzd(str, bArr, i2, this.zzc - i2);
                return;
            }
            int i3 = i + zzw2;
            this.zzd = i3;
            int zzd = com.google.android.gms.internal.play_games_inputmapping.zzhr.zzd(str, this.zzb, i3, this.zzc - i3);
            this.zzd = i;
            zzl((zzd - i) - zzw2);
            this.zzd = zzd;
        } catch (com.google.android.gms.internal.play_games_inputmapping.zzhq e) {
            this.zzd = i;
            zzD(str, e);
        } catch (java.lang.IndexOutOfBoundsException e2) {
            throw new com.google.android.gms.internal.play_games_inputmapping.zzeo(e2);
        }
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzep
    public final int zzs() {
        return this.zzc - this.zzd;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzep
    public final void zzj(byte b) throws java.io.IOException {
        try {
            byte[] bArr = this.zzb;
            int i = this.zzd;
            this.zzd = i + 1;
            bArr[i] = b;
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new com.google.android.gms.internal.play_games_inputmapping.zzeo(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.zzd), java.lang.Integer.valueOf(this.zzc), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzep
    public final void zzl(int i) throws java.io.IOException {
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.zzb;
                int i2 = this.zzd;
                this.zzd = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new com.google.android.gms.internal.play_games_inputmapping.zzeo(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.zzd), java.lang.Integer.valueOf(this.zzc), 1), e);
            }
        }
        byte[] bArr2 = this.zzb;
        int i3 = this.zzd;
        this.zzd = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    public final void zzp(byte[] bArr, int i, int i2) throws java.io.IOException {
        try {
            java.lang.System.arraycopy(bArr, 0, this.zzb, this.zzd, i2);
            this.zzd += i2;
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new com.google.android.gms.internal.play_games_inputmapping.zzeo(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.zzd), java.lang.Integer.valueOf(this.zzc), java.lang.Integer.valueOf(i2)), e);
        }
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzep
    public final void zzn(long j) throws java.io.IOException {
        boolean z;
        z = com.google.android.gms.internal.play_games_inputmapping.zzep.zzc;
        if (z && this.zzc - this.zzd >= 10) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.zzb;
                int i = this.zzd;
                this.zzd = i + 1;
                com.google.android.gms.internal.play_games_inputmapping.zzhn.zzp(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.zzb;
            int i2 = this.zzd;
            this.zzd = i2 + 1;
            com.google.android.gms.internal.play_games_inputmapping.zzhn.zzp(bArr2, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                byte[] bArr3 = this.zzb;
                int i3 = this.zzd;
                this.zzd = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (java.lang.IndexOutOfBoundsException e) {
                throw new com.google.android.gms.internal.play_games_inputmapping.zzeo(java.lang.String.format("Pos: %d, limit: %d, len: %d", java.lang.Integer.valueOf(this.zzd), java.lang.Integer.valueOf(this.zzc), 1), e);
            }
        }
        byte[] bArr4 = this.zzb;
        int i4 = this.zzd;
        this.zzd = i4 + 1;
        bArr4[i4] = (byte) j;
    }
}
