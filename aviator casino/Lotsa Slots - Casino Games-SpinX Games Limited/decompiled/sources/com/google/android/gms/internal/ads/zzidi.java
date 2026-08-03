package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzidi extends com.google.android.gms.internal.ads.zzidj {
    private final byte[] zzc;
    private final int zzd;
    private int zze;
    private int zzf;
    private final java.io.OutputStream zzg;

    zzidi(java.io.OutputStream outputStream, int i) {
        super(null);
        if (outputStream == null) {
            throw new java.lang.NullPointerException("out");
        }
        this.zzg = outputStream;
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[java.lang.Math.max(i, 20)];
        this.zzc = bArr;
        this.zzd = bArr.length;
    }

    private final void zzK(int i) throws java.io.IOException {
        if (this.zzd - this.zze < i) {
            zzL();
        }
    }

    private final void zzL() throws java.io.IOException {
        this.zzg.write(this.zzc, 0, this.zze);
        this.zze = 0;
    }

    final void zzB(int i) {
        int i2 = this.zze;
        byte[] bArr = this.zzc;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.zze = i2 + 4;
        this.zzf += 4;
    }

    final void zzC(long j) {
        int i = this.zze;
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
        this.zzf += 8;
    }

    public final void zzD(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = this.zzd;
        int i4 = this.zze;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            java.lang.System.arraycopy(bArr, i, this.zzc, i4, i2);
            this.zze += i2;
            this.zzf += i2;
            return;
        }
        byte[] bArr2 = this.zzc;
        java.lang.System.arraycopy(bArr, i, bArr2, i4, i5);
        int i6 = i + i5;
        this.zze = i3;
        this.zzf += i5;
        zzL();
        int i7 = i2 - i5;
        if (i7 <= i3) {
            java.lang.System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.zze = i7;
        } else {
            this.zzg.write(bArr, i6, i7);
        }
        this.zzf += i7;
    }

    @Override // com.google.android.gms.internal.ads.zzicr
    public final void zza(byte[] bArr, int i, int i2) throws java.io.IOException {
        zzD(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzidj
    public final void zzb(int i, int i2) throws java.io.IOException {
        zzr((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.ads.zzidj
    public final void zzc(int i, int i2) throws java.io.IOException {
        zzK(20);
        zzz(i << 3);
        if (i2 >= 0) {
            zzz(i2);
        } else {
            zzA(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidj
    public final void zzd(int i, int i2) throws java.io.IOException {
        zzK(20);
        zzz(i << 3);
        zzz(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzidj
    public final void zze(int i, int i2) throws java.io.IOException {
        zzK(14);
        zzz((i << 3) | 5);
        zzB(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzidj
    public final void zzf(int i, long j) throws java.io.IOException {
        zzK(20);
        zzz(i << 3);
        zzA(j);
    }

    @Override // com.google.android.gms.internal.ads.zzidj
    public final void zzg(int i, long j) throws java.io.IOException {
        zzK(18);
        zzz((i << 3) | 1);
        zzC(j);
    }

    @Override // com.google.android.gms.internal.ads.zzidj
    public final void zzh(int i, boolean z) throws java.io.IOException {
        zzK(11);
        zzz(i << 3);
        zzv(z ? (byte) 1 : (byte) 0);
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
        zzD(bArr, 0, i2);
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
        if (this.zze == this.zzd) {
            zzL();
        }
        zzv(b);
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
    public final void zzr(int i) throws java.io.IOException {
        zzK(5);
        zzz(i);
    }

    @Override // com.google.android.gms.internal.ads.zzidj
    public final void zzs(int i) throws java.io.IOException {
        zzK(4);
        zzB(i);
    }

    @Override // com.google.android.gms.internal.ads.zzidj
    public final void zzt(long j) throws java.io.IOException {
        zzK(10);
        zzA(j);
    }

    @Override // com.google.android.gms.internal.ads.zzidj
    public final void zzu(long j) throws java.io.IOException {
        zzK(8);
        zzC(j);
    }

    final void zzv(byte b) {
        byte[] bArr = this.zzc;
        int i = this.zze;
        bArr[i] = b;
        this.zze = i + 1;
        this.zzf++;
    }

    @Override // com.google.android.gms.internal.ads.zzidj
    public final void zzw(java.lang.String str) throws java.io.IOException {
        int zzc;
        int length = str.length() * 3;
        int zzF = zzF(length);
        int i = zzF + length;
        int i2 = this.zzd;
        if (i > i2) {
            byte[] bArr = new byte[length];
            int zzd = com.google.android.gms.internal.ads.zzihf.zzd(str, bArr, 0, length);
            zzr(zzd);
            zzD(bArr, 0, zzd);
            return;
        }
        if (i > i2 - this.zze) {
            zzL();
        }
        int zzF2 = zzF(str.length());
        int i3 = this.zze;
        try {
            if (zzF2 == zzF) {
                int i4 = i3 + zzF2;
                this.zze = i4;
                int zzd2 = com.google.android.gms.internal.ads.zzihf.zzd(str, this.zzc, i4, i2 - i4);
                this.zze = i3;
                zzc = (zzd2 - i3) - zzF2;
                zzz(zzc);
                this.zze = zzd2;
            } else {
                zzc = com.google.android.gms.internal.ads.zzihf.zzc(str);
                zzz(zzc);
                this.zze = com.google.android.gms.internal.ads.zzihf.zzd(str, this.zzc, this.zze, zzc);
            }
            this.zzf += zzc;
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            throw new com.google.android.gms.internal.ads.zzidh(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidj
    public final void zzx() throws java.io.IOException {
        if (this.zze > 0) {
            zzL();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidj
    public final int zzy() {
        throw new java.lang.UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    final void zzA(long j) {
        boolean z;
        z = com.google.android.gms.internal.ads.zzidj.zzc;
        if (z) {
            long j2 = this.zze;
            while (true) {
                int i = (int) j;
                if ((j & (-128)) == 0) {
                    byte[] bArr = this.zzc;
                    int i2 = this.zze;
                    this.zze = i2 + 1;
                    com.google.android.gms.internal.ads.zziha.zzo(bArr, i2, (byte) i);
                    this.zzf += (int) (this.zze - j2);
                    return;
                }
                byte[] bArr2 = this.zzc;
                int i3 = this.zze;
                this.zze = i3 + 1;
                com.google.android.gms.internal.ads.zziha.zzo(bArr2, i3, (byte) (i | 128));
                j >>>= 7;
            }
        } else {
            while (true) {
                int i4 = (int) j;
                if ((j & (-128)) == 0) {
                    byte[] bArr3 = this.zzc;
                    int i5 = this.zze;
                    this.zze = i5 + 1;
                    bArr3[i5] = (byte) i4;
                    this.zzf++;
                    return;
                }
                byte[] bArr4 = this.zzc;
                int i6 = this.zze;
                this.zze = i6 + 1;
                bArr4[i6] = (byte) (i4 | 128);
                this.zzf++;
                j >>>= 7;
            }
        }
    }

    final void zzz(int i) {
        boolean z;
        z = com.google.android.gms.internal.ads.zzidj.zzc;
        if (!z) {
            while ((i & (-128)) != 0) {
                byte[] bArr = this.zzc;
                int i2 = this.zze;
                this.zze = i2 + 1;
                bArr[i2] = (byte) (i | 128);
                this.zzf++;
                i >>>= 7;
            }
            byte[] bArr2 = this.zzc;
            int i3 = this.zze;
            this.zze = i3 + 1;
            bArr2[i3] = (byte) i;
            this.zzf++;
            return;
        }
        long j = this.zze;
        while ((i & (-128)) != 0) {
            byte[] bArr3 = this.zzc;
            int i4 = this.zze;
            this.zze = i4 + 1;
            com.google.android.gms.internal.ads.zziha.zzo(bArr3, i4, (byte) (i | 128));
            i >>>= 7;
        }
        byte[] bArr4 = this.zzc;
        int i5 = this.zze;
        this.zze = i5 + 1;
        com.google.android.gms.internal.ads.zziha.zzo(bArr4, i5, (byte) i);
        this.zzf += (int) (this.zze - j);
    }
}
