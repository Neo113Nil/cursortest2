package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbcn extends com.google.android.libraries.places.internal.zzbco {
    private final java.io.InputStream zzg;
    private final byte[] zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;

    /* synthetic */ zzbcn(java.io.InputStream inputStream, int i, byte[] bArr) {
        super(null);
        this.zzn = Integer.MAX_VALUE;
        this.zzg = inputStream;
        this.zzh = new byte[4096];
        this.zzi = 0;
        this.zzk = 0;
        this.zzm = 0;
    }

    private final void zzP(int i) throws java.io.IOException {
        if (zzQ(i)) {
            return;
        }
        if (i <= (this.zzd - this.zzm) - this.zzk) {
            throw new com.google.android.libraries.places.internal.zzbed("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new com.google.android.libraries.places.internal.zzbed("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    private final boolean zzQ(int i) throws java.io.IOException {
        int i2 = this.zzk;
        int i3 = this.zzi;
        if (i2 + i <= i3) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 66);
            sb.append("refillBuffer() called when ");
            sb.append(i);
            sb.append(" bytes were already available in buffer");
            throw new java.lang.IllegalStateException(sb.toString());
        }
        int i4 = this.zzd;
        int i5 = this.zzm;
        if (i > (i4 - i5) - i2 || i5 + i2 + i > this.zzn) {
            return false;
        }
        if (i2 > 0) {
            if (i3 > i2) {
                byte[] bArr = this.zzh;
                java.lang.System.arraycopy(bArr, i2, bArr, 0, i3 - i2);
            }
            i5 = this.zzm + i2;
            this.zzm = i5;
            i3 = this.zzi - i2;
            this.zzi = i3;
            this.zzk = 0;
        }
        try {
            int read = this.zzg.read(this.zzh, i3, java.lang.Math.min(4096 - i3, (this.zzd - i5) - i3));
            if (read != 0 && read >= -1 && read <= 4096) {
                if (read <= 0) {
                    return false;
                }
                this.zzi += read;
                zzO();
                return this.zzi >= i || zzQ(i);
            }
            java.lang.String valueOf = java.lang.String.valueOf(this.zzg.getClass());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 39 + java.lang.String.valueOf(read).length() + 41);
            sb2.append(valueOf);
            sb2.append("#read(byte[]) returned invalid result: ");
            sb2.append(read);
            sb2.append("\nThe InputStream implementation is buggy.");
            throw new java.lang.IllegalStateException(sb2.toString());
        } catch (com.google.android.libraries.places.internal.zzbed e) {
            e.zza();
            throw e;
        }
    }

    private final byte[] zzR(int i, boolean z) throws java.io.IOException {
        byte[] zzS = zzS(i);
        if (zzS != null) {
            return zzS;
        }
        int i2 = this.zzk;
        int i3 = this.zzi;
        int i4 = i3 - i2;
        this.zzm += i3;
        this.zzk = 0;
        this.zzi = 0;
        java.util.List<byte[]> zzT = zzT(i - i4);
        byte[] bArr = new byte[i];
        java.lang.System.arraycopy(this.zzh, i2, bArr, 0, i4);
        for (byte[] bArr2 : zzT) {
            int length = bArr2.length;
            java.lang.System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    private final byte[] zzS(int i) throws java.io.IOException {
        if (i == 0) {
            return com.google.android.libraries.places.internal.zzbeb.zzb;
        }
        int i2 = this.zzm;
        int i3 = this.zzk;
        int i4 = i2 + i3 + i;
        if (i4 - this.zzd > 0) {
            throw new com.google.android.libraries.places.internal.zzbed("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i5 = this.zzn;
        if (i4 > i5) {
            zzE((i5 - i2) - i3);
            throw new com.google.android.libraries.places.internal.zzbed("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = this.zzi - i3;
        int i7 = i - i6;
        if (i7 >= 4096) {
            try {
                if (i7 > this.zzg.available()) {
                    return null;
                }
            } catch (com.google.android.libraries.places.internal.zzbed e) {
                e.zza();
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        java.lang.System.arraycopy(this.zzh, this.zzk, bArr, 0, i6);
        this.zzm += this.zzi;
        this.zzk = 0;
        this.zzi = 0;
        while (i6 < i) {
            try {
                int read = this.zzg.read(bArr, i6, i - i6);
                if (read == -1) {
                    throw new com.google.android.libraries.places.internal.zzbed("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzm += read;
                i6 += read;
            } catch (com.google.android.libraries.places.internal.zzbed e2) {
                e2.zza();
                throw e2;
            }
        }
        return bArr;
    }

    private final java.util.List zzT(int i) throws java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (i > 0) {
            int min = java.lang.Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.zzg.read(bArr, i2, min - i2);
                if (read == -1) {
                    throw new com.google.android.libraries.places.internal.zzbed("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzm += read;
                i2 += read;
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // com.google.android.libraries.places.internal.zzbco
    public final void zzA(int i) {
        this.zzn = i;
        zzO();
    }

    @Override // com.google.android.libraries.places.internal.zzbco
    public final boolean zzB() throws java.io.IOException {
        return this.zzk == this.zzi && !zzQ(1);
    }

    public final byte zzD() throws java.io.IOException {
        if (this.zzk == this.zzi) {
            zzP(1);
        }
        byte[] bArr = this.zzh;
        int i = this.zzk;
        this.zzk = i + 1;
        return bArr[i];
    }

    public final void zzE(int i) throws java.io.IOException {
        int i2 = this.zzi;
        int i3 = this.zzk;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.zzk = i3 + i;
            return;
        }
        if (i < 0) {
            throw new com.google.android.libraries.places.internal.zzbed("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i5 = this.zzm;
        int i6 = i5 + i3;
        int i7 = this.zzn;
        if (i6 + i > i7) {
            zzE((i7 - i5) - i3);
            throw new com.google.android.libraries.places.internal.zzbed("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzm = i6;
        this.zzi = 0;
        this.zzk = 0;
        while (i4 < i) {
            try {
                long j = i - i4;
                try {
                    long skip = this.zzg.skip(j);
                    if (skip >= 0 && skip <= j) {
                        if (skip == 0) {
                            break;
                        } else {
                            i4 += (int) skip;
                        }
                    } else {
                        java.lang.String valueOf = java.lang.String.valueOf(this.zzg.getClass());
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 31 + java.lang.String.valueOf(skip).length() + 41);
                        sb.append(valueOf);
                        sb.append("#skip returned invalid result: ");
                        sb.append(skip);
                        sb.append("\nThe InputStream implementation is buggy.");
                        throw new java.lang.IllegalStateException(sb.toString());
                    }
                } catch (com.google.android.libraries.places.internal.zzbed e) {
                    e.zza();
                    throw e;
                }
            } finally {
                this.zzm += i4;
                zzO();
            }
        }
        if (i4 >= i) {
            return;
        }
        int i8 = this.zzi;
        int i9 = i8 - this.zzk;
        this.zzk = i8;
        zzP(1);
        while (true) {
            int i10 = i - i9;
            int i11 = this.zzi;
            if (i10 <= i11) {
                this.zzk = i10;
                return;
            } else {
                i9 += i11;
                this.zzk = i11;
                zzP(1);
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbco
    public final int zza() throws java.io.IOException {
        if (zzB()) {
            this.zzl = 0;
            return 0;
        }
        int zzu = zzu();
        this.zzl = zzu;
        if ((zzu >>> 3) != 0) {
            return zzu;
        }
        throw new com.google.android.libraries.places.internal.zzbed("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.libraries.places.internal.zzbco
    public final void zzb(int i) throws com.google.android.libraries.places.internal.zzbed {
        if (this.zzl != i) {
            throw new com.google.android.libraries.places.internal.zzbed("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbco
    public final double zzd() throws java.io.IOException {
        return java.lang.Double.longBitsToDouble(zzy());
    }

    @Override // com.google.android.libraries.places.internal.zzbco
    public final float zze() throws java.io.IOException {
        return java.lang.Float.intBitsToFloat(zzx());
    }

    @Override // com.google.android.libraries.places.internal.zzbco
    public final long zzf() throws java.io.IOException {
        return zzv();
    }

    @Override // com.google.android.libraries.places.internal.zzbco
    public final long zzg() throws java.io.IOException {
        return zzv();
    }

    @Override // com.google.android.libraries.places.internal.zzbco
    public final int zzh() throws java.io.IOException {
        return zzu();
    }

    @Override // com.google.android.libraries.places.internal.zzbco
    public final long zzi() throws java.io.IOException {
        return zzy();
    }

    @Override // com.google.android.libraries.places.internal.zzbco
    public final int zzj() throws java.io.IOException {
        return zzx();
    }

    @Override // com.google.android.libraries.places.internal.zzbco
    public final boolean zzk() throws java.io.IOException {
        return zzv() != 0;
    }

    @Override // com.google.android.libraries.places.internal.zzbco
    public final java.lang.String zzl() throws java.io.IOException {
        int zzu = zzu();
        if (zzu > 0) {
            int i = this.zzi;
            int i2 = this.zzk;
            if (zzu <= i - i2) {
                java.lang.String str = new java.lang.String(this.zzh, i2, zzu, com.google.android.libraries.places.internal.zzbeb.zza);
                this.zzk += zzu;
                return str;
            }
        }
        if (zzu == 0) {
            return "";
        }
        if (zzu < 0) {
            throw new com.google.android.libraries.places.internal.zzbed("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (zzu > this.zzi) {
            return new java.lang.String(zzR(zzu, false), com.google.android.libraries.places.internal.zzbeb.zza);
        }
        zzP(zzu);
        java.lang.String str2 = new java.lang.String(this.zzh, this.zzk, zzu, com.google.android.libraries.places.internal.zzbeb.zza);
        this.zzk += zzu;
        return str2;
    }

    @Override // com.google.android.libraries.places.internal.zzbco
    public final java.lang.String zzm() throws java.io.IOException {
        byte[] zzR;
        int zzu = zzu();
        int i = this.zzk;
        int i2 = this.zzi;
        if (zzu <= i2 - i && zzu > 0) {
            zzR = this.zzh;
            this.zzk = i + zzu;
        } else {
            if (zzu == 0) {
                return "";
            }
            if (zzu < 0) {
                throw new com.google.android.libraries.places.internal.zzbed("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i = 0;
            if (zzu <= i2) {
                zzP(zzu);
                zzR = this.zzh;
                this.zzk = zzu;
            } else {
                zzR = zzR(zzu, false);
            }
        }
        return com.google.android.libraries.places.internal.zzbgi.zzc(zzR, i, zzu);
    }

    @Override // com.google.android.libraries.places.internal.zzbco
    public final com.google.android.libraries.places.internal.zzbcl zzn() throws java.io.IOException {
        int zzu = zzu();
        int i = this.zzi;
        int i2 = this.zzk;
        if (zzu <= i - i2 && zzu > 0) {
            com.google.android.libraries.places.internal.zzbcl zzk = com.google.android.libraries.places.internal.zzbcl.zzk(this.zzh, i2, zzu, false);
            this.zzk += zzu;
            return zzk;
        }
        if (zzu == 0) {
            return com.google.android.libraries.places.internal.zzbcl.zza;
        }
        if (zzu < 0) {
            throw new com.google.android.libraries.places.internal.zzbed("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] zzS = zzS(zzu);
        if (zzS != null) {
            return com.google.android.libraries.places.internal.zzbcl.zzk(zzS, 0, zzS.length, false);
        }
        int i3 = this.zzk;
        int i4 = this.zzi;
        int i5 = i4 - i3;
        this.zzm += i4;
        this.zzk = 0;
        this.zzi = 0;
        java.util.List<byte[]> zzT = zzT(zzu - i5);
        byte[] bArr = new byte[zzu];
        java.lang.System.arraycopy(this.zzh, i3, bArr, 0, i5);
        for (byte[] bArr2 : zzT) {
            int length = bArr2.length;
            java.lang.System.arraycopy(bArr2, 0, bArr, i5, length);
            i5 += length;
        }
        try {
            return new com.google.android.libraries.places.internal.zzbck(bArr);
        } catch (com.google.android.libraries.places.internal.zzbed e) {
            throw new java.lang.AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbco
    public final int zzo() throws java.io.IOException {
        return zzu();
    }

    @Override // com.google.android.libraries.places.internal.zzbco
    public final int zzp() throws java.io.IOException {
        return zzu();
    }

    @Override // com.google.android.libraries.places.internal.zzbco
    public final int zzq() throws java.io.IOException {
        return zzx();
    }

    @Override // com.google.android.libraries.places.internal.zzbco
    public final long zzr() throws java.io.IOException {
        return zzy();
    }

    @Override // com.google.android.libraries.places.internal.zzbco
    public final int zzs() throws java.io.IOException {
        return zzM(zzu());
    }

    @Override // com.google.android.libraries.places.internal.zzbco
    public final long zzt() throws java.io.IOException {
        return zzN(zzv());
    }

    final long zzw() throws java.io.IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((zzD() & 128) == 0) {
                return j;
            }
        }
        throw new com.google.android.libraries.places.internal.zzbed("CodedInputStream encountered a malformed varint.");
    }

    public final int zzx() throws java.io.IOException {
        int i = this.zzk;
        if (this.zzi - i < 4) {
            zzP(4);
            i = this.zzk;
        }
        byte[] bArr = this.zzh;
        this.zzk = i + 4;
        byte b = bArr[i];
        return ((bArr[i + 3] & 255) << 24) | ((bArr[i + 1] & 255) << 8) | (b & 255) | ((bArr[i + 2] & 255) << 16);
    }

    public final long zzy() throws java.io.IOException {
        int i = this.zzk;
        if (this.zzi - i < 8) {
            zzP(8);
            i = this.zzk;
        }
        byte[] bArr = this.zzh;
        this.zzk = i + 8;
        return ((bArr[i + 6] & 255) << 48) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 7] & 255) << 56);
    }

    @Override // com.google.android.libraries.places.internal.zzbco
    public final int zzz(int i) throws com.google.android.libraries.places.internal.zzbed {
        if (i < 0) {
            throw new com.google.android.libraries.places.internal.zzbed("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = i + this.zzm + this.zzk;
        if (i2 < 0) {
            throw new com.google.android.libraries.places.internal.zzbed("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i3 = this.zzn;
        if (i2 > i3) {
            throw new com.google.android.libraries.places.internal.zzbed("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzn = i2;
        zzO();
        return i3;
    }

    public final int zzu() throws java.io.IOException {
        int i;
        int i2 = this.zzk;
        int i3 = this.zzi;
        if (i3 != i2) {
            byte[] bArr = this.zzh;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.zzk = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
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
                                                if (bArr[i7] >= 0) {
                                                    i5 = i2 + 10;
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
                this.zzk = i5;
                return i;
            }
        }
        return (int) zzw();
    }

    @Override // com.google.android.libraries.places.internal.zzbco
    public final boolean zzc(int i) throws java.io.IOException {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.zzi - this.zzk < 10) {
                while (i3 < 10) {
                    if (zzD() < 0) {
                        i3++;
                    }
                }
                throw new com.google.android.libraries.places.internal.zzbed("CodedInputStream encountered a malformed varint.");
            }
            while (i3 < 10) {
                byte[] bArr = this.zzh;
                int i4 = this.zzk;
                this.zzk = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw new com.google.android.libraries.places.internal.zzbed("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i2 == 1) {
            zzE(8);
            return true;
        }
        if (i2 == 2) {
            zzE(zzu());
            return true;
        }
        if (i2 == 3) {
            zzK();
            zzb(((i >>> 3) << 3) | 4);
            return true;
        }
        if (i2 == 4) {
            zzJ();
            return false;
        }
        if (i2 != 5) {
            throw new com.google.android.libraries.places.internal.zzbec("Protocol message tag had invalid wire type.");
        }
        zzE(4);
        return true;
    }

    public final long zzv() throws java.io.IOException {
        long j;
        long j2;
        long j3;
        int i = this.zzk;
        int i2 = this.zzi;
        if (i2 != i) {
            byte[] bArr = this.zzh;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.zzk = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
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
                this.zzk = i4;
                return j;
            }
        }
        return zzw();
    }

    @Override // com.google.android.libraries.places.internal.zzbco
    public final int zzC() {
        return this.zzm + this.zzk;
    }

    private final void zzO() {
        int i = this.zzi + this.zzj;
        this.zzi = i;
        int i2 = this.zzm + i;
        int i3 = this.zzn;
        if (i2 <= i3) {
            this.zzj = 0;
            return;
        }
        int i4 = i2 - i3;
        this.zzj = i4;
        this.zzi = i - i4;
    }
}
