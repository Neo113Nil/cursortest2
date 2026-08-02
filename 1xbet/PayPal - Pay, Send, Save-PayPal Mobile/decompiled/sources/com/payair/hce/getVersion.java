package com.payair.hce;

/* loaded from: classes10.dex */
public final class getVersion extends java.io.FilterInputStream {
    private final int[] IccPrivateKeyCrtComponentsJson;
    private final int[] RecordsJson;
    private final int SdkCoreAlternateContactlessPaymentDataImpl;
    private int SdkCoreBusinessLogicModuleImpl;
    private final byte[] getAid;
    private int getApplicationLifeCycleData;
    private final int getCiacDecline;
    private int getCvrMaskAnd;
    private int getDualTapResetTimeout;
    private final byte[] getGpoResponse;
    private final int getPaymentFci;
    private final byte[][] getProfileVersion;
    private static final byte[] DigitizedCardProfile = com.payair.hce.getCardCountryCode.DigitizedCardProfile;
    private static final int[] values = com.payair.hce.getCardCountryCode.values;
    private static final int[] writeReplace = com.payair.hce.getCardCountryCode.writeReplace;
    private static final int[] AlternateContactlessPaymentDataJson = com.payair.hce.getCardCountryCode.AlternateContactlessPaymentDataJson;
    private static final int[] valueOf = com.payair.hce.getCardCountryCode.valueOf;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public getVersion(java.io.InputStream inputStream, int i, byte[] bArr, byte[][] bArr2) {
        this(inputStream, i, bArr, bArr2, (byte) 0);
    }

    private getVersion(java.io.InputStream inputStream, int i, byte[] bArr, byte[][] bArr2, byte b) {
        super(new java.io.BufferedInputStream(inputStream, 4096));
        this.IccPrivateKeyCrtComponentsJson = new int[4];
        this.getAid = new byte[16];
        this.getGpoResponse = new byte[16];
        this.SdkCoreBusinessLogicModuleImpl = 1;
        this.getCvrMaskAnd = Integer.MAX_VALUE;
        this.getApplicationLifeCycleData = 16;
        this.getDualTapResetTimeout = 16;
        this.SdkCoreAlternateContactlessPaymentDataImpl = i;
        this.RecordsJson = com.payair.hce.getCardCountryCode.values(bArr, i);
        byte[][] bArr3 = new byte[bArr2.length][];
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            bArr3[i2] = new byte[bArr2[i2].length];
            int i3 = 0;
            while (true) {
                byte[] bArr4 = bArr2[i2];
                if (i3 < bArr4.length) {
                    bArr3[i2][bArr4[i3]] = (byte) i3;
                    i3++;
                }
            }
        }
        this.getProfileVersion = bArr3;
        this.getCiacDecline = 100;
        this.getPaymentFci = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws java.io.IOException {
        DigitizedCardProfile();
        int i = this.getApplicationLifeCycleData;
        if (i >= this.getDualTapResetTimeout) {
            return -1;
        }
        byte[] bArr = this.getGpoResponse;
        this.getApplicationLifeCycleData = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws java.io.IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            DigitizedCardProfile();
            int i5 = this.getApplicationLifeCycleData;
            if (i5 >= this.getDualTapResetTimeout) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.getGpoResponse;
            this.getApplicationLifeCycleData = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws java.io.IOException {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws java.io.IOException {
        DigitizedCardProfile();
        return this.getDualTapResetTimeout - this.getApplicationLifeCycleData;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        synchronized (this) {
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws java.io.IOException {
        synchronized (this) {
        }
    }

    private int DigitizedCardProfile() throws java.io.IOException {
        if (this.getCvrMaskAnd == Integer.MAX_VALUE) {
            this.getCvrMaskAnd = ((java.io.FilterInputStream) this).in.read();
        }
        if (this.getApplicationLifeCycleData == 16) {
            byte[] bArr = this.getAid;
            int i = this.getCvrMaskAnd;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new java.lang.IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int read = ((java.io.FilterInputStream) this).in.read(this.getAid, i2, 16 - i2);
                if (read <= 0) {
                    break;
                }
                i2 += read;
            } while (i2 < 16);
            if (i2 < 16) {
                throw new java.lang.IllegalStateException("unexpected block size");
            }
            int i3 = this.getCiacDecline;
            if (i3 == this.getPaymentFci) {
                values(this.getAid, this.getGpoResponse);
            } else {
                if (this.SdkCoreBusinessLogicModuleImpl <= i3) {
                    values(this.getAid, this.getGpoResponse);
                } else {
                    byte[] bArr2 = this.getAid;
                    java.lang.System.arraycopy(bArr2, 0, this.getGpoResponse, 0, bArr2.length);
                }
                int i4 = this.SdkCoreBusinessLogicModuleImpl;
                if (i4 < this.getPaymentFci) {
                    this.SdkCoreBusinessLogicModuleImpl = i4 + 1;
                } else {
                    this.SdkCoreBusinessLogicModuleImpl = 1;
                }
            }
            int read2 = ((java.io.FilterInputStream) this).in.read();
            this.getCvrMaskAnd = read2;
            this.getApplicationLifeCycleData = 0;
            this.getDualTapResetTimeout = read2 < 0 ? 16 - (this.getGpoResponse[15] & 255) : 16;
        }
        return this.getDualTapResetTimeout;
    }

    private void values(byte[] bArr, byte[] bArr2) {
        com.payair.hce.getVersion getversion = this;
        int[] iArr = getversion.IccPrivateKeyCrtComponentsJson;
        char c = 0;
        byte b = bArr[0];
        char c2 = 1;
        byte b2 = bArr[1];
        char c3 = 2;
        byte b3 = bArr[2];
        char c4 = 3;
        byte b4 = bArr[3];
        int[] iArr2 = getversion.RecordsJson;
        iArr[0] = ((((b << com.google.common.base.Ascii.CAN) | ((b2 & 255) << 16)) | ((b3 & 255) << 8)) | (b4 & 255)) ^ iArr2[0];
        iArr[1] = ((((bArr[4] << com.google.common.base.Ascii.CAN) | ((bArr[5] & 255) << 16)) | ((bArr[6] & 255) << 8)) | (bArr[7] & 255)) ^ iArr2[1];
        iArr[2] = ((((bArr[8] << com.google.common.base.Ascii.CAN) | ((bArr[9] & 255) << 16)) | ((bArr[10] & 255) << 8)) | (bArr[11] & 255)) ^ iArr2[2];
        iArr[3] = iArr2[3] ^ ((((bArr[12] << com.google.common.base.Ascii.CAN) | ((bArr[13] & 255) << 16)) | ((bArr[14] & 255) << 8)) | (bArr[15] & 255));
        int i = 4;
        int i2 = 1;
        while (i2 < getversion.SdkCoreAlternateContactlessPaymentDataImpl) {
            int[] iArr3 = values;
            int[] iArr4 = getversion.IccPrivateKeyCrtComponentsJson;
            byte[][] bArr3 = getversion.getProfileVersion;
            byte[] bArr4 = bArr3[c];
            int i3 = iArr3[iArr4[bArr4[c]] >>> 24];
            int[] iArr5 = writeReplace;
            byte[] bArr5 = bArr3[c2];
            int i4 = iArr5[(iArr4[bArr5[c]] >>> 16) & 255];
            int[] iArr6 = AlternateContactlessPaymentDataJson;
            byte[] bArr6 = bArr3[c3];
            int i5 = iArr6[(iArr4[bArr6[c]] >>> 8) & 255];
            int[] iArr7 = valueOf;
            byte[] bArr7 = bArr3[c4];
            int i6 = iArr7[iArr4[bArr7[c]] & 255];
            int[] iArr8 = getversion.RecordsJson;
            int i7 = iArr8[i];
            int i8 = iArr3[iArr4[bArr4[c2]] >>> 24];
            int i9 = iArr5[(iArr4[bArr5[c2]] >>> 16) & 255];
            int i10 = iArr6[(iArr4[bArr6[c2]] >>> 8) & 255];
            int i11 = iArr7[iArr4[bArr7[c2]] & 255];
            int i12 = iArr8[i + 1];
            int i13 = iArr3[iArr4[bArr4[c3]] >>> 24];
            int i14 = iArr5[(iArr4[bArr5[c3]] >>> 16) & 255];
            int i15 = iArr6[(iArr4[bArr6[c3]] >>> 8) & 255];
            int i16 = iArr7[iArr4[bArr7[2]] & 255];
            int i17 = iArr8[i + 2];
            int i18 = iArr3[iArr4[bArr4[3]] >>> 24];
            int i19 = iArr5[(iArr4[bArr5[3]] >>> 16) & 255];
            int i20 = i2;
            int i21 = iArr6[(iArr4[bArr6[3]] >>> 8) & 255];
            int i22 = iArr7[iArr4[bArr7[3]] & 255];
            int i23 = iArr8[i + 3];
            iArr4[0] = (((i3 ^ i4) ^ i5) ^ i6) ^ i7;
            iArr4[1] = ((i10 ^ (i8 ^ i9)) ^ i11) ^ i12;
            iArr4[2] = (((i13 ^ i14) ^ i15) ^ i16) ^ i17;
            iArr4[3] = (((i19 ^ i18) ^ i21) ^ i22) ^ i23;
            i2 = i20 + 1;
            i += 4;
            getversion = this;
            c = 0;
            c2 = 1;
            c3 = 2;
            c4 = 3;
        }
        int[] iArr9 = getversion.RecordsJson;
        int i24 = iArr9[i];
        byte[] bArr8 = DigitizedCardProfile;
        int[] iArr10 = getversion.IccPrivateKeyCrtComponentsJson;
        byte[][] bArr9 = getversion.getProfileVersion;
        byte[] bArr10 = bArr9[0];
        bArr2[0] = (byte) (bArr8[iArr10[bArr10[0]] >>> 24] ^ (i24 >>> 24));
        byte[] bArr11 = bArr9[1];
        bArr2[1] = (byte) (bArr8[(iArr10[bArr11[0]] >>> 16) & 255] ^ (i24 >>> 16));
        byte[] bArr12 = bArr9[2];
        bArr2[2] = (byte) (bArr8[(iArr10[bArr12[0]] >>> 8) & 255] ^ (i24 >>> 8));
        byte[] bArr13 = bArr9[3];
        bArr2[3] = (byte) (i24 ^ bArr8[iArr10[bArr13[0]] & 255]);
        int i25 = iArr9[i + 1];
        bArr2[4] = (byte) (bArr8[iArr10[bArr10[1]] >>> 24] ^ (i25 >>> 24));
        bArr2[5] = (byte) (bArr8[(iArr10[bArr11[1]] >>> 16) & 255] ^ (i25 >>> 16));
        bArr2[6] = (byte) (bArr8[(iArr10[bArr12[1]] >>> 8) & 255] ^ (i25 >>> 8));
        bArr2[7] = (byte) (i25 ^ bArr8[iArr10[bArr13[1]] & 255]);
        int i26 = iArr9[i + 2];
        bArr2[8] = (byte) (bArr8[iArr10[bArr10[2]] >>> 24] ^ (i26 >>> 24));
        bArr2[9] = (byte) (bArr8[(iArr10[bArr11[2]] >>> 16) & 255] ^ (i26 >>> 16));
        bArr2[10] = (byte) (bArr8[(iArr10[bArr12[2]] >>> 8) & 255] ^ (i26 >>> 8));
        bArr2[11] = (byte) (i26 ^ bArr8[iArr10[bArr13[2]] & 255]);
        int i27 = iArr9[i + 3];
        bArr2[12] = (byte) (bArr8[iArr10[bArr10[3]] >>> 24] ^ (i27 >>> 24));
        bArr2[13] = (byte) (bArr8[(iArr10[bArr11[3]] >>> 16) & 255] ^ (i27 >>> 16));
        bArr2[14] = (byte) (bArr8[(iArr10[bArr12[3]] >>> 8) & 255] ^ (i27 >>> 8));
        bArr2[15] = (byte) (i27 ^ bArr8[iArr10[bArr13[3]] & 255]);
    }
}
