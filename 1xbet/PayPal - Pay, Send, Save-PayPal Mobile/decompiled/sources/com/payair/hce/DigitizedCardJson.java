package com.payair.hce;

/* loaded from: classes10.dex */
public final class DigitizedCardJson extends java.io.FilterInputStream {
    private static final short writeReplace = (short) ((java.lang.Math.sqrt(5.0d) - 1.0d) * java.lang.Math.pow(2.0d, 15.0d));
    private byte[] AlternateContactlessPaymentDataJson;
    private byte[] DigitizedCardProfile;
    private int IccPrivateKeyCrtComponentsJson;
    private int RecordsJson;
    private int SdkCoreAlternateContactlessPaymentDataImpl;
    private final int SdkCoreBusinessLogicModuleImpl;
    private int getAid;
    private int getCardLayoutDescription;
    private int getCiacDecline;
    private int getCvrMaskAnd;
    private final int getGpoResponse;
    private int getPaymentFci;
    private int getProfileVersion;
    private int valueOf;
    private byte[] values;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public DigitizedCardJson(java.io.InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3) throws java.io.IOException {
        this(inputStream, iArr, i, bArr, i2, i3, (byte) 0);
    }

    private DigitizedCardJson(java.io.InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3, byte b) throws java.io.IOException {
        super(new java.io.BufferedInputStream(inputStream, 4096));
        this.SdkCoreAlternateContactlessPaymentDataImpl = Integer.MAX_VALUE;
        this.getCardLayoutDescription = 1;
        this.values = new byte[8];
        this.AlternateContactlessPaymentDataJson = new byte[8];
        this.DigitizedCardProfile = new byte[8];
        this.valueOf = 8;
        this.getProfileVersion = 8;
        this.getAid = java.lang.Math.min(java.lang.Math.max(i2, 5), 16);
        this.IccPrivateKeyCrtComponentsJson = i3;
        if (i3 == 3) {
            java.lang.System.arraycopy(bArr, 0, this.AlternateContactlessPaymentDataJson, 0, 8);
        }
        long j = (iArr[1] & 4294967295L) | ((iArr[0] & 4294967295L) << 32);
        if (i != 0) {
            int i4 = (int) j;
            this.RecordsJson = i4;
            this.getCiacDecline = i4 * i;
            this.getCvrMaskAnd = i ^ i4;
            this.getPaymentFci = (int) (j >> 32);
        } else {
            this.RecordsJson = (int) j;
            long j2 = j >> 3;
            long j3 = writeReplace;
            this.getCiacDecline = (int) ((j3 * j2) >> 32);
            this.getCvrMaskAnd = (int) (j >> 32);
            this.getPaymentFci = (int) (j2 + j3);
        }
        this.getGpoResponse = 100;
        this.SdkCoreBusinessLogicModuleImpl = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws java.io.IOException {
        DigitizedCardProfile();
        int i = this.valueOf;
        if (i >= this.getProfileVersion) {
            return -1;
        }
        byte[] bArr = this.values;
        this.valueOf = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            DigitizedCardProfile();
            int i5 = this.valueOf;
            if (i5 >= this.getProfileVersion) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.values;
            this.valueOf = i5 + 1;
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
        return this.getProfileVersion - this.valueOf;
    }

    private void writeReplace() {
        if (this.IccPrivateKeyCrtComponentsJson == 3) {
            byte[] bArr = this.values;
            java.lang.System.arraycopy(bArr, 0, this.DigitizedCardProfile, 0, bArr.length);
        }
        byte[] bArr2 = this.values;
        int i = ((bArr2[0] << com.google.common.base.Ascii.CAN) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr2[3] & 255);
        int i2 = ((-16777216) & (bArr2[4] << com.google.common.base.Ascii.CAN)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i3 = 0;
        while (true) {
            int i4 = this.getAid;
            if (i3 >= i4) {
                break;
            }
            int i5 = (i4 - i3) * writeReplace;
            i2 -= ((i5 + i) ^ ((i << 4) + this.getCvrMaskAnd)) ^ ((i >>> 5) + this.getPaymentFci);
            i -= (((i2 << 4) + this.RecordsJson) ^ (i5 + i2)) ^ ((i2 >>> 5) + this.getCiacDecline);
            i3++;
        }
        byte[] bArr3 = this.values;
        bArr3[0] = (byte) (i >> 24);
        bArr3[1] = (byte) (i >> 16);
        bArr3[2] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.IccPrivateKeyCrtComponentsJson == 3) {
            for (int i6 = 0; i6 < 8; i6++) {
                byte[] bArr4 = this.values;
                bArr4[i6] = (byte) (bArr4[i6] ^ this.AlternateContactlessPaymentDataJson[i6]);
            }
            byte[] bArr5 = this.DigitizedCardProfile;
            java.lang.System.arraycopy(bArr5, 0, this.AlternateContactlessPaymentDataJson, 0, bArr5.length);
        }
    }

    private int DigitizedCardProfile() throws java.io.IOException {
        if (this.SdkCoreAlternateContactlessPaymentDataImpl == Integer.MAX_VALUE) {
            this.SdkCoreAlternateContactlessPaymentDataImpl = ((java.io.FilterInputStream) this).in.read();
        }
        if (this.valueOf == 8) {
            byte[] bArr = this.values;
            int i = this.SdkCoreAlternateContactlessPaymentDataImpl;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new java.lang.IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int read = ((java.io.FilterInputStream) this).in.read(this.values, i2, 8 - i2);
                if (read <= 0) {
                    break;
                }
                i2 += read;
            } while (i2 < 8);
            if (i2 < 8) {
                throw new java.lang.IllegalStateException("unexpected block size");
            }
            int i3 = this.getGpoResponse;
            if (i3 == this.SdkCoreBusinessLogicModuleImpl) {
                writeReplace();
            } else {
                if (this.getCardLayoutDescription <= i3) {
                    writeReplace();
                }
                int i4 = this.getCardLayoutDescription;
                if (i4 < this.SdkCoreBusinessLogicModuleImpl) {
                    this.getCardLayoutDescription = i4 + 1;
                } else {
                    this.getCardLayoutDescription = 1;
                }
            }
            int read2 = ((java.io.FilterInputStream) this).in.read();
            this.SdkCoreAlternateContactlessPaymentDataImpl = read2;
            this.valueOf = 0;
            this.getProfileVersion = read2 < 0 ? 8 - (this.values[7] & 255) : 8;
        }
        return this.getProfileVersion;
    }
}
