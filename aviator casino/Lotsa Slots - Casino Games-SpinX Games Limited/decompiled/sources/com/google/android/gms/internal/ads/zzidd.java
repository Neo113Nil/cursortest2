package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzidd extends com.google.android.gms.internal.ads.zzide {
    private final java.io.InputStream zzf;
    private final byte[] zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;

    /* synthetic */ zzidd(java.io.InputStream inputStream, int i, byte[] bArr) {
        super(null);
        this.zzm = Integer.MAX_VALUE;
        this.zzf = inputStream;
        this.zzg = new byte[4096];
        this.zzh = 0;
        this.zzj = 0;
        this.zzl = 0;
    }

    private final void zzF() {
        int i = this.zzh + this.zzi;
        this.zzh = i;
        int i2 = this.zzl + i;
        int i3 = this.zzm;
        if (i2 <= i3) {
            this.zzi = 0;
            return;
        }
        int i4 = i2 - i3;
        this.zzi = i4;
        this.zzh = i - i4;
    }

    private final void zzG(int i) throws java.io.IOException {
        if (zzP(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.zzl) - this.zzj) {
            throw new com.google.android.gms.internal.ads.zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new com.google.android.gms.internal.ads.zziet("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    private final boolean zzP(int i) throws java.io.IOException {
        int i2 = this.zzj;
        int i3 = i2 + i;
        int i4 = this.zzh;
        if (i3 <= i4) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 66);
            sb.append("refillBuffer() called when ");
            sb.append(i);
            sb.append(" bytes were already available in buffer");
            throw new java.lang.IllegalStateException(sb.toString());
        }
        int i5 = this.zzl;
        if (i > (Integer.MAX_VALUE - i5) - i2 || i5 + i2 + i > this.zzm) {
            return false;
        }
        if (i2 > 0) {
            if (i4 > i2) {
                byte[] bArr = this.zzg;
                java.lang.System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
            }
            i5 = this.zzl + i2;
            this.zzl = i5;
            i4 = this.zzh - i2;
            this.zzh = i4;
            this.zzj = 0;
        }
        try {
            int read = this.zzf.read(this.zzg, i4, java.lang.Math.min(4096 - i4, (Integer.MAX_VALUE - i5) - i4));
            if (read != 0 && read >= -1 && read <= 4096) {
                if (read <= 0) {
                    return false;
                }
                this.zzh += read;
                zzF();
                return this.zzh >= i || zzP(i);
            }
            java.lang.String valueOf = java.lang.String.valueOf(this.zzf.getClass());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 39 + java.lang.String.valueOf(read).length() + 41);
            sb2.append(valueOf);
            sb2.append("#read(byte[]) returned invalid result: ");
            sb2.append(read);
            sb2.append("\nThe InputStream implementation is buggy.");
            throw new java.lang.IllegalStateException(sb2.toString());
        } catch (com.google.android.gms.internal.ads.zziet e) {
            e.zza();
            throw e;
        }
    }

    private final byte[] zzQ(int i, boolean z) throws java.io.IOException {
        byte[] zzR = zzR(i);
        if (zzR != null) {
            return zzR;
        }
        int i2 = this.zzj;
        int i3 = this.zzh;
        int i4 = i3 - i2;
        this.zzl += i3;
        this.zzj = 0;
        this.zzh = 0;
        java.util.List<byte[]> zzS = zzS(i - i4);
        byte[] bArr = new byte[i];
        java.lang.System.arraycopy(this.zzg, i2, bArr, 0, i4);
        for (byte[] bArr2 : zzS) {
            int length = bArr2.length;
            java.lang.System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    private final byte[] zzR(int i) throws java.io.IOException {
        if (i == 0) {
            return com.google.android.gms.internal.ads.zzier.zza;
        }
        int i2 = this.zzl;
        int i3 = this.zzj;
        int i4 = i2 + i3 + i;
        if ((-2147483647) + i4 > 0) {
            throw new com.google.android.gms.internal.ads.zziet("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i5 = this.zzm;
        if (i4 > i5) {
            zzA((i5 - i2) - i3);
            throw new com.google.android.gms.internal.ads.zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = this.zzh - i3;
        int i7 = i - i6;
        if (i7 >= 4096) {
            try {
                if (i7 > this.zzf.available()) {
                    return null;
                }
            } catch (com.google.android.gms.internal.ads.zziet e) {
                e.zza();
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        java.lang.System.arraycopy(this.zzg, this.zzj, bArr, 0, i6);
        this.zzl += this.zzh;
        this.zzj = 0;
        this.zzh = 0;
        while (i6 < i) {
            try {
                int read = this.zzf.read(bArr, i6, i - i6);
                if (read == -1) {
                    throw new com.google.android.gms.internal.ads.zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzl += read;
                i6 += read;
            } catch (com.google.android.gms.internal.ads.zziet e2) {
                e2.zza();
                throw e2;
            }
        }
        return bArr;
    }

    private final java.util.List zzS(int i) throws java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (i > 0) {
            int min = java.lang.Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                try {
                    int read = this.zzf.read(bArr, i2, min - i2);
                    if (read == -1) {
                        throw new com.google.android.gms.internal.ads.zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    this.zzl += read;
                    i2 += read;
                } catch (com.google.android.gms.internal.ads.zziet e) {
                    e.zza();
                    throw e;
                }
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final void zzA(int i) throws java.io.IOException {
        int i2 = this.zzh;
        int i3 = this.zzj;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.zzj = i3 + i;
            return;
        }
        if (i < 0) {
            throw new com.google.android.gms.internal.ads.zziet("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i5 = this.zzl;
        int i6 = i5 + i3;
        int i7 = this.zzm;
        if (i6 + i > i7) {
            zzA((i7 - i5) - i3);
            throw new com.google.android.gms.internal.ads.zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzl = i6;
        this.zzh = 0;
        this.zzj = 0;
        while (i4 < i) {
            try {
                long j = i - i4;
                try {
                    long skip = this.zzf.skip(j);
                    if (skip < 0 || skip > j) {
                        java.lang.String valueOf = java.lang.String.valueOf(this.zzf.getClass());
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 31 + java.lang.String.valueOf(skip).length() + 41);
                        sb.append(valueOf);
                        sb.append("#skip returned invalid result: ");
                        sb.append(skip);
                        sb.append("\nThe InputStream implementation is buggy.");
                        throw new java.lang.IllegalStateException(sb.toString());
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i4 += (int) skip;
                    }
                } catch (com.google.android.gms.internal.ads.zziet e) {
                    e.zza();
                    throw e;
                }
            } finally {
                this.zzl += i4;
                zzF();
            }
        }
        if (i4 >= i) {
            return;
        }
        int i8 = this.zzh;
        int i9 = i8 - this.zzj;
        this.zzj = i8;
        zzG(1);
        while (true) {
            int i10 = i - i9;
            int i11 = this.zzh;
            if (i10 <= i11) {
                this.zzj = i10;
                return;
            } else {
                i9 += i11;
                this.zzj = i11;
                zzG(1);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final void zzC(int i) {
        this.zzm = i;
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final boolean zzD() throws java.io.IOException {
        return this.zzj == this.zzh && !zzP(1);
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final int zzE() {
        return this.zzl + this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final int zza() throws java.io.IOException {
        if (zzD()) {
            this.zzk = 0;
            return 0;
        }
        int zzu = zzu();
        this.zzk = zzu;
        if ((zzu >>> 3) != 0) {
            return zzu;
        }
        throw new com.google.android.gms.internal.ads.zziet("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final void zzb(int i) throws com.google.android.gms.internal.ads.zziet {
        if (this.zzk != i) {
            throw new com.google.android.gms.internal.ads.zziet("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final double zzd() throws java.io.IOException {
        return java.lang.Double.longBitsToDouble(zzy());
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final float zze() throws java.io.IOException {
        return java.lang.Float.intBitsToFloat(zzx());
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final long zzf() throws java.io.IOException {
        return zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final long zzg() throws java.io.IOException {
        return zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final int zzh() throws java.io.IOException {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final long zzi() throws java.io.IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final int zzj() throws java.io.IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final boolean zzk() throws java.io.IOException {
        return zzv() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final java.lang.String zzl() throws java.io.IOException {
        int zzu = zzu();
        if (zzu > 0) {
            int i = this.zzh;
            int i2 = this.zzj;
            if (zzu <= i - i2) {
                java.lang.String str = new java.lang.String(this.zzg, i2, zzu, java.nio.charset.StandardCharsets.UTF_8);
                this.zzj += zzu;
                return str;
            }
        }
        if (zzu == 0) {
            return "";
        }
        if (zzu < 0) {
            throw new com.google.android.gms.internal.ads.zziet("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (zzu > this.zzh) {
            return new java.lang.String(zzQ(zzu, false), java.nio.charset.StandardCharsets.UTF_8);
        }
        zzG(zzu);
        java.lang.String str2 = new java.lang.String(this.zzg, this.zzj, zzu, java.nio.charset.StandardCharsets.UTF_8);
        this.zzj += zzu;
        return str2;
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final java.lang.String zzm() throws java.io.IOException {
        byte[] zzQ;
        int zzu = zzu();
        int i = this.zzj;
        int i2 = this.zzh;
        if (zzu <= i2 - i && zzu > 0) {
            zzQ = this.zzg;
            this.zzj = i + zzu;
        } else {
            if (zzu == 0) {
                return "";
            }
            if (zzu < 0) {
                throw new com.google.android.gms.internal.ads.zziet("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i = 0;
            if (zzu <= i2) {
                zzG(zzu);
                zzQ = this.zzg;
                this.zzj = zzu;
            } else {
                zzQ = zzQ(zzu, false);
            }
        }
        return com.google.android.gms.internal.ads.zzihf.zze(zzQ, i, zzu);
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final com.google.android.gms.internal.ads.zzida zzn() throws java.io.IOException {
        int zzu = zzu();
        int i = this.zzh;
        int i2 = this.zzj;
        if (zzu <= i - i2 && zzu > 0) {
            com.google.android.gms.internal.ads.zzida zzu2 = com.google.android.gms.internal.ads.zzida.zzu(this.zzg, i2, zzu, false);
            this.zzj += zzu;
            return zzu2;
        }
        if (zzu == 0) {
            return com.google.android.gms.internal.ads.zzida.zza;
        }
        if (zzu < 0) {
            throw new com.google.android.gms.internal.ads.zziet("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] zzR = zzR(zzu);
        if (zzR != null) {
            return com.google.android.gms.internal.ads.zzida.zzu(zzR, 0, zzR.length, false);
        }
        int i3 = this.zzj;
        int i4 = this.zzh;
        int i5 = i4 - i3;
        this.zzl += i4;
        this.zzj = 0;
        this.zzh = 0;
        java.util.List<byte[]> zzS = zzS(zzu - i5);
        byte[] bArr = new byte[zzu];
        java.lang.System.arraycopy(this.zzg, i3, bArr, 0, i5);
        for (byte[] bArr2 : zzS) {
            int length = bArr2.length;
            java.lang.System.arraycopy(bArr2, 0, bArr, i5, length);
            i5 += length;
        }
        return com.google.android.gms.internal.ads.zzida.zzv(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final int zzo() throws java.io.IOException {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final int zzp() throws java.io.IOException {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final int zzq() throws java.io.IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final long zzr() throws java.io.IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final int zzs() throws java.io.IOException {
        return zzM(zzu());
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final long zzt() throws java.io.IOException {
        return zzN(zzv());
    }

    final long zzw() throws java.io.IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((zzz() & 128) == 0) {
                return j;
            }
        }
        throw new com.google.android.gms.internal.ads.zziet("CodedInputStream encountered a malformed varint.");
    }

    public final int zzx() throws java.io.IOException {
        int i = this.zzj;
        if (this.zzh - i < 4) {
            zzG(4);
            i = this.zzj;
        }
        byte[] bArr = this.zzg;
        this.zzj = i + 4;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public final long zzy() throws java.io.IOException {
        int i = this.zzj;
        if (this.zzh - i < 8) {
            zzG(8);
            i = this.zzj;
        }
        byte[] bArr = this.zzg;
        this.zzj = i + 8;
        long j = bArr[i];
        long j2 = bArr[i + 2];
        long j3 = bArr[i + 3];
        return ((bArr[i + 7] & 255) << 56) | (j & 255) | ((bArr[i + 1] & 255) << 8) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public final byte zzz() throws java.io.IOException {
        if (this.zzj == this.zzh) {
            zzG(1);
        }
        byte[] bArr = this.zzg;
        int i = this.zzj;
        this.zzj = i + 1;
        return bArr[i];
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final int zzB(int i) throws com.google.android.gms.internal.ads.zziet {
        if (i < 0) {
            throw new com.google.android.gms.internal.ads.zziet("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = i + this.zzl + this.zzj;
        if (i2 < 0) {
            throw new com.google.android.gms.internal.ads.zziet("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i3 = this.zzm;
        if (i2 > i3) {
            throw new com.google.android.gms.internal.ads.zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzm = i2;
        zzF();
        return i3;
    }

    public final int zzu() throws java.io.IOException {
        int i;
        int i2 = this.zzj;
        int i3 = this.zzh;
        if (i3 != i2) {
            byte[] bArr = this.zzg;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.zzj = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << com.google.common.base.Ascii.SO) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << com.google.common.base.Ascii.NAK);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << com.google.common.base.Ascii.FS)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.zzj = i5;
                return i;
            }
        }
        return (int) zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final boolean zzc(int i) throws java.io.IOException {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.zzh - this.zzj < 10) {
                while (i3 < 10) {
                    if (zzz() < 0) {
                        i3++;
                    }
                }
                throw new com.google.android.gms.internal.ads.zziet("CodedInputStream encountered a malformed varint.");
            }
            while (i3 < 10) {
                byte[] bArr = this.zzg;
                int i4 = this.zzj;
                this.zzj = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw new com.google.android.gms.internal.ads.zziet("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i2 == 1) {
            zzA(8);
            return true;
        }
        if (i2 == 2) {
            zzA(zzu());
            return true;
        }
        if (i2 == 3) {
            zzL();
            zzb(((i >>> 3) << 3) | 4);
            return true;
        }
        if (i2 == 4) {
            zzK();
            return false;
        }
        if (i2 != 5) {
            throw new com.google.android.gms.internal.ads.zzies("Protocol message tag had invalid wire type.");
        }
        zzA(4);
        return true;
    }

    public final long zzv() throws java.io.IOException {
        long j;
        long j2;
        long j3;
        int i = this.zzj;
        int i2 = this.zzh;
        if (i2 != i) {
            byte[] bArr = this.zzg;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.zzj = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << com.google.common.base.Ascii.SO) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << com.google.common.base.Ascii.NAK);
                        if (i9 < 0) {
                            long j4 = (-2080896) ^ i9;
                            i4 = i8;
                            j = j4;
                        } else {
                            i6 = i + 5;
                            long j5 = (bArr[i8] << 28) ^ i9;
                            if (j5 >= 0) {
                                j = j5 ^ 266354560;
                            } else {
                                i4 = i + 6;
                                long j6 = (bArr[i6] << 35) ^ j5;
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    int i10 = i + 7;
                                    long j7 = j6 ^ (bArr[i4] << 42);
                                    if (j7 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i4 = i + 8;
                                        j6 = j7 ^ (bArr[i10] << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i10 = i + 9;
                                            j7 = j6 ^ (bArr[i4] << 56);
                                            if (j7 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                i4 = i + 10;
                                                long j8 = j7 ^ (bArr[i10] << 63);
                                                if (j8 >= 0) {
                                                    j = j8 ^ (-9151873028817141888L);
                                                }
                                            }
                                        }
                                    }
                                    j = j7 ^ j2;
                                    i4 = i10;
                                }
                                j = j6 ^ j3;
                            }
                        }
                    }
                    i4 = i6;
                }
                this.zzj = i4;
                return j;
            }
        }
        return zzw();
    }
}
