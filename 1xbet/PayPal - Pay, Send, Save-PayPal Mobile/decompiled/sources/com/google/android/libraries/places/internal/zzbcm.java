package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbcm extends com.google.android.libraries.places.internal.zzbco {
    private final byte[] zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    /* synthetic */ zzbcm(byte[] bArr, int i, int i2, boolean z, byte[] bArr2) {
        super(null);
        this.zzl = Integer.MAX_VALUE;
        this.zzg = bArr;
        this.zzh = i2;
        this.zzj = 0;
    }

    @Override // com.google.android.libraries.places.internal.zzbco
    public final void zzA(int i) {
        this.zzl = i;
        zzO();
    }

    public final byte zzD() throws java.io.IOException {
        int i = this.zzj;
        if (i == this.zzh) {
            throw new com.google.android.libraries.places.internal.zzbed("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zzg;
        this.zzj = i + 1;
        return bArr[i];
    }

    @Override // com.google.android.libraries.places.internal.zzbco
    public final int zza() throws java.io.IOException {
        if (zzB()) {
            this.zzk = 0;
            return 0;
        }
        int zzu = zzu();
        this.zzk = zzu;
        if ((zzu >>> 3) != 0) {
            return zzu;
        }
        throw new com.google.android.libraries.places.internal.zzbed("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.libraries.places.internal.zzbco
    public final void zzb(int i) throws com.google.android.libraries.places.internal.zzbed {
        if (this.zzk != i) {
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
            int i = this.zzh;
            int i2 = this.zzj;
            if (zzu <= i - i2) {
                java.lang.String str = new java.lang.String(this.zzg, i2, zzu, com.google.android.libraries.places.internal.zzbeb.zza);
                this.zzj += zzu;
                return str;
            }
        }
        if (zzu == 0) {
            return "";
        }
        if (zzu < 0) {
            throw new com.google.android.libraries.places.internal.zzbed("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new com.google.android.libraries.places.internal.zzbed("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.libraries.places.internal.zzbco
    public final java.lang.String zzm() throws java.io.IOException {
        int zzu = zzu();
        if (zzu > 0) {
            int i = this.zzh;
            int i2 = this.zzj;
            if (zzu <= i - i2) {
                java.lang.String zzc = com.google.android.libraries.places.internal.zzbgi.zzc(this.zzg, i2, zzu);
                this.zzj += zzu;
                return zzc;
            }
        }
        if (zzu == 0) {
            return "";
        }
        if (zzu <= 0) {
            throw new com.google.android.libraries.places.internal.zzbed("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new com.google.android.libraries.places.internal.zzbed("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.libraries.places.internal.zzbco
    public final com.google.android.libraries.places.internal.zzbcl zzn() throws java.io.IOException {
        int zzu = zzu();
        if (zzu > 0) {
            int i = this.zzh;
            int i2 = this.zzj;
            if (zzu <= i - i2) {
                com.google.android.libraries.places.internal.zzbcl zzk = com.google.android.libraries.places.internal.zzbcl.zzk(this.zzg, i2, zzu, false);
                this.zzj += zzu;
                return zzk;
            }
        }
        if (zzu == 0) {
            return com.google.android.libraries.places.internal.zzbcl.zza;
        }
        if (zzu > 0) {
            int i3 = this.zzh;
            int i4 = this.zzj;
            if (zzu <= i3 - i4) {
                int i5 = zzu + i4;
                this.zzj = i5;
                return new com.google.android.libraries.places.internal.zzbck(java.util.Arrays.copyOfRange(this.zzg, i4, i5));
            }
        }
        if (zzu <= 0) {
            throw new com.google.android.libraries.places.internal.zzbed("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new com.google.android.libraries.places.internal.zzbed("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
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
        int i = this.zzj;
        if (this.zzh - i < 4) {
            throw new com.google.android.libraries.places.internal.zzbed("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zzg;
        this.zzj = i + 4;
        byte b = bArr[i];
        return ((bArr[i + 3] & 255) << 24) | ((bArr[i + 1] & 255) << 8) | (b & 255) | ((bArr[i + 2] & 255) << 16);
    }

    public final long zzy() throws java.io.IOException {
        int i = this.zzj;
        if (this.zzh - i < 8) {
            throw new com.google.android.libraries.places.internal.zzbed("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zzg;
        this.zzj = i + 8;
        return ((bArr[i + 6] & 255) << 48) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 7] & 255) << 56);
    }

    @Override // com.google.android.libraries.places.internal.zzbco
    public final int zzz(int i) throws com.google.android.libraries.places.internal.zzbed {
        if (i < 0) {
            throw new com.google.android.libraries.places.internal.zzbed("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = i + this.zzj;
        if (i2 < 0) {
            throw new com.google.android.libraries.places.internal.zzbed("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i3 = this.zzl;
        if (i2 > i3) {
            throw new com.google.android.libraries.places.internal.zzbed("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzl = i2;
        zzO();
        return i3;
    }

    public final void zzE(int i) throws java.io.IOException {
        if (i >= 0) {
            int i2 = this.zzh;
            int i3 = this.zzj;
            if (i <= i2 - i3) {
                this.zzj = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw new com.google.android.libraries.places.internal.zzbed("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new com.google.android.libraries.places.internal.zzbed("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
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
                this.zzj = i5;
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
            if (this.zzh - this.zzj < 10) {
                while (i3 < 10) {
                    if (zzD() < 0) {
                        i3++;
                    }
                }
                throw new com.google.android.libraries.places.internal.zzbed("CodedInputStream encountered a malformed varint.");
            }
            while (i3 < 10) {
                byte[] bArr = this.zzg;
                int i4 = this.zzj;
                this.zzj = i4 + 1;
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
                this.zzj = i4;
                return j;
            }
        }
        return zzw();
    }

    @Override // com.google.android.libraries.places.internal.zzbco
    public final int zzC() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.internal.zzbco
    public final boolean zzB() throws java.io.IOException {
        return this.zzj == this.zzh;
    }

    private final void zzO() {
        int i = this.zzh + this.zzi;
        this.zzh = i;
        int i2 = this.zzl;
        if (i <= i2) {
            this.zzi = 0;
            return;
        }
        int i3 = i - i2;
        this.zzi = i3;
        this.zzh = i - i3;
    }
}
