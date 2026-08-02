package com.payair.hce;

/* loaded from: classes10.dex */
public final class assignWalletRelatedData extends java.io.FilterInputStream {
    private final int AlternateContactlessPaymentDataJson;
    private final int DigitizedCardProfile;
    private byte[] IccPrivateKeyCrtComponentsJson;
    private byte[] RecordsJson;
    private int SdkCoreAlternateContactlessPaymentDataImpl;
    private int SdkCoreBusinessLogicModuleImpl;
    private byte[] getAid;
    private int getCiacDecline;
    private int getCvrMaskAnd;
    private int[] getProfileVersion;
    private int valueOf;
    private final int values;
    private com.payair.hce.assignTrack2ConstructionData writeReplace;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public assignWalletRelatedData(java.io.InputStream inputStream, int[] iArr, byte[] bArr, int i, boolean z, int i2) throws java.io.IOException {
        this(inputStream, iArr, bArr, i, false, i2, (byte) 0);
    }

    private assignWalletRelatedData(java.io.InputStream inputStream, int[] iArr, byte[] bArr, int i, boolean z, int i2, byte b) throws java.io.IOException {
        super(new java.io.BufferedInputStream(inputStream, 4096));
        this.valueOf = 1;
        this.getCvrMaskAnd = Integer.MAX_VALUE;
        int min = java.lang.Math.min(java.lang.Math.max(i, 3), 16);
        this.values = min;
        this.IccPrivateKeyCrtComponentsJson = new byte[8];
        byte[] bArr2 = new byte[8];
        this.getAid = bArr2;
        this.RecordsJson = new byte[8];
        this.getProfileVersion = new int[2];
        this.SdkCoreAlternateContactlessPaymentDataImpl = 8;
        this.getCiacDecline = 8;
        this.SdkCoreBusinessLogicModuleImpl = i2;
        if (i2 == 2) {
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.writeReplace = new com.payair.hce.assignTrack2ConstructionData(iArr, min, true, z);
        this.DigitizedCardProfile = 100;
        this.AlternateContactlessPaymentDataJson = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws java.io.IOException {
        DigitizedCardProfile();
        int i = this.SdkCoreAlternateContactlessPaymentDataImpl;
        if (i >= this.getCiacDecline) {
            return -1;
        }
        byte[] bArr = this.IccPrivateKeyCrtComponentsJson;
        this.SdkCoreAlternateContactlessPaymentDataImpl = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            DigitizedCardProfile();
            int i5 = this.SdkCoreAlternateContactlessPaymentDataImpl;
            if (i5 >= this.getCiacDecline) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.IccPrivateKeyCrtComponentsJson;
            this.SdkCoreAlternateContactlessPaymentDataImpl = i5 + 1;
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
        return this.getCiacDecline - this.SdkCoreAlternateContactlessPaymentDataImpl;
    }

    private void valueOf() {
        if (this.SdkCoreBusinessLogicModuleImpl == 2) {
            byte[] bArr = this.IccPrivateKeyCrtComponentsJson;
            java.lang.System.arraycopy(bArr, 0, this.RecordsJson, 0, bArr.length);
        }
        byte[] bArr2 = this.IccPrivateKeyCrtComponentsJson;
        com.payair.hce.getCard.valueOf(((bArr2[0] << com.google.common.base.Ascii.CAN) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr2[3] & 255), ((bArr2[4] << com.google.common.base.Ascii.CAN) & (-16777216)) + ((bArr2[5] << 16) & 16711680) + ((bArr2[6] << 8) & androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr2[7] & 255), false, this.values, this.writeReplace.AlternateContactlessPaymentDataJson, this.writeReplace.values, this.getProfileVersion);
        int[] iArr = this.getProfileVersion;
        int i = iArr[0];
        int i2 = iArr[1];
        byte[] bArr3 = this.IccPrivateKeyCrtComponentsJson;
        bArr3[0] = (byte) (i >> 24);
        bArr3[1] = (byte) (i >> 16);
        bArr3[2] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.SdkCoreBusinessLogicModuleImpl == 2) {
            for (int i3 = 0; i3 < 8; i3++) {
                byte[] bArr4 = this.IccPrivateKeyCrtComponentsJson;
                bArr4[i3] = (byte) (bArr4[i3] ^ this.getAid[i3]);
            }
            byte[] bArr5 = this.RecordsJson;
            java.lang.System.arraycopy(bArr5, 0, this.getAid, 0, bArr5.length);
        }
    }

    private int DigitizedCardProfile() throws java.io.IOException {
        if (this.getCvrMaskAnd == Integer.MAX_VALUE) {
            this.getCvrMaskAnd = ((java.io.FilterInputStream) this).in.read();
        }
        if (this.SdkCoreAlternateContactlessPaymentDataImpl == 8) {
            byte[] bArr = this.IccPrivateKeyCrtComponentsJson;
            int i = this.getCvrMaskAnd;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new java.lang.IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int read = ((java.io.FilterInputStream) this).in.read(this.IccPrivateKeyCrtComponentsJson, i2, 8 - i2);
                if (read <= 0) {
                    break;
                }
                i2 += read;
            } while (i2 < 8);
            if (i2 < 8) {
                throw new java.lang.IllegalStateException("unexpected block size");
            }
            int i3 = this.DigitizedCardProfile;
            if (i3 == this.AlternateContactlessPaymentDataJson) {
                valueOf();
            } else {
                if (this.valueOf <= i3) {
                    valueOf();
                }
                int i4 = this.valueOf;
                if (i4 < this.AlternateContactlessPaymentDataJson) {
                    this.valueOf = i4 + 1;
                } else {
                    this.valueOf = 1;
                }
            }
            int read2 = ((java.io.FilterInputStream) this).in.read();
            this.getCvrMaskAnd = read2;
            this.SdkCoreAlternateContactlessPaymentDataImpl = 0;
            this.getCiacDecline = read2 < 0 ? 8 - (this.IccPrivateKeyCrtComponentsJson[7] & 255) : 8;
        }
        return this.getCiacDecline;
    }
}
