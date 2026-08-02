package org.bouncycastle.crypto.digests;

/* loaded from: classes17.dex */
public class SHA256Digest extends org.bouncycastle.crypto.digests.GeneralDigest implements org.bouncycastle.crypto.digests.EncodableDigest {
    static final int[] Camera2StreamConfigurationMap = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    private int getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private int[] getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private int getInputSizeshNQ4ISI;
    private int getOutputFormats;
    private int getOutputMinFrameDuration;
    private int getOutputStallDurationlomOqCM;

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processBlock() {
        for (int i = 16; i <= 63; i++) {
            int[] iArr = this.getHighSpeedVideoSizesFor;
            int i2 = iArr[i - 2];
            int i3 = ((((i2 << 13) | (i2 >>> 19)) ^ ((i2 >>> 17) | (i2 << 15))) ^ (i2 >>> 10)) + iArr[i - 7];
            int i4 = iArr[i - 15];
            iArr[i] = i3 + ((((i4 << 14) | (i4 >>> 18)) ^ ((i4 >>> 7) | (i4 << 25))) ^ (i4 >>> 3)) + iArr[i - 16];
        }
        int i5 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i6 = this.getHighSpeedVideoFpsRangesFor;
        int i7 = this.getHighSpeedVideoSizes;
        int i8 = this.getHighSpeedVideoFpsRanges;
        int i9 = this.getInputFormats;
        int i10 = this.getInputSizeshNQ4ISI;
        int i11 = this.getOutputMinFrameDuration;
        int i12 = this.getOutputFormats;
        int i13 = 0;
        for (int i14 = 0; i14 < 8; i14++) {
            int i15 = ((~i9) & i11) ^ (i10 & i9);
            int[] iArr2 = Camera2StreamConfigurationMap;
            int i16 = (((i9 << 7) | (i9 >>> 25)) ^ (((i9 >>> 6) | (i9 << 26)) ^ ((i9 >>> 11) | (i9 << 21)))) + i15 + iArr2[i13];
            int[] iArr3 = this.getHighSpeedVideoSizesFor;
            int i17 = i12 + i16 + iArr3[i13];
            int i18 = i8 + i17;
            int i19 = i17 + (((i5 << 10) | (i5 >>> 22)) ^ (((i5 >>> 2) | (i5 << 30)) ^ ((i5 >>> 13) | (i5 << 19)))) + (((i5 ^ i6) & i7) | (i5 & i6));
            int i20 = i13 + 1;
            int i21 = i11 + (((i18 << 7) | (i18 >>> 25)) ^ (((i18 >>> 6) | (i18 << 26)) ^ ((i18 >>> 11) | (i18 << 21)))) + (((~i18) & i10) ^ (i9 & i18)) + iArr2[i20] + iArr3[i20];
            int i22 = i7 + i21;
            int i23 = i21 + (((i19 << 10) | (i19 >>> 22)) ^ (((i19 >>> 2) | (i19 << 30)) ^ ((i19 >>> 13) | (i19 << 19)))) + (((i19 ^ i5) & i6) | (i19 & i5));
            int i24 = i13 + 2;
            int i25 = i10 + (((i22 << 7) | (i22 >>> 25)) ^ (((i22 >>> 6) | (i22 << 26)) ^ ((i22 >>> 11) | (i22 << 21)))) + (((~i22) & i9) ^ (i18 & i22)) + iArr2[i24] + iArr3[i24];
            int i26 = i6 + i25;
            int i27 = i25 + (((i23 << 10) | (i23 >>> 22)) ^ (((i23 >>> 2) | (i23 << 30)) ^ ((i23 >>> 13) | (i23 << 19)))) + (((i23 ^ i19) & i5) | (i23 & i19));
            int i28 = i13 + 3;
            int i29 = i9 + (((i26 << 7) | (i26 >>> 25)) ^ (((i26 >>> 6) | (i26 << 26)) ^ ((i26 >>> 11) | (i26 << 21)))) + (((~i26) & i18) ^ (i22 & i26)) + iArr2[i28] + iArr3[i28];
            int i30 = i5 + i29;
            int i31 = i29 + (((i27 << 10) | (i27 >>> 22)) ^ (((i27 >>> 2) | (i27 << 30)) ^ ((i27 >>> 13) | (i27 << 19)))) + (((i27 ^ i23) & i19) | (i27 & i23));
            int i32 = i13 + 4;
            int i33 = i18 + (((i30 << 7) | (i30 >>> 25)) ^ (((i30 >>> 6) | (i30 << 26)) ^ ((i30 >>> 11) | (i30 << 21)))) + (((~i30) & i22) ^ (i26 & i30)) + iArr2[i32] + iArr3[i32];
            i12 = i19 + i33;
            i8 = i33 + (((i31 << 10) | (i31 >>> 22)) ^ (((i31 >>> 2) | (i31 << 30)) ^ ((i31 >>> 13) | (i31 << 19)))) + (((i31 ^ i27) & i23) | (i31 & i27));
            int i34 = i13 + 5;
            int i35 = i22 + (((i12 << 7) | (i12 >>> 25)) ^ (((i12 >>> 6) | (i12 << 26)) ^ ((i12 >>> 11) | (i12 << 21)))) + (((~i12) & i26) ^ (i30 & i12)) + iArr2[i34] + iArr3[i34];
            i11 = i23 + i35;
            i7 = i35 + (((i8 << 10) | (i8 >>> 22)) ^ (((i8 >>> 2) | (i8 << 30)) ^ ((i8 >>> 13) | (i8 << 19)))) + (((i8 ^ i31) & i27) | (i8 & i31));
            int i36 = i13 + 6;
            int i37 = i26 + (((i11 << 7) | (i11 >>> 25)) ^ (((i11 >>> 6) | (i11 << 26)) ^ ((i11 >>> 11) | (i11 << 21)))) + (((~i11) & i30) ^ (i12 & i11)) + iArr2[i36] + iArr3[i36];
            i10 = i27 + i37;
            i6 = i37 + (((i7 << 10) | (i7 >>> 22)) ^ (((i7 >>> 2) | (i7 << 30)) ^ ((i7 >>> 13) | (i7 << 19)))) + (((i7 ^ i8) & i31) | (i7 & i8));
            int i38 = i13 + 7;
            int i39 = i30 + (((i10 << 7) | (i10 >>> 25)) ^ (((i10 >>> 6) | (i10 << 26)) ^ ((i10 >>> 11) | (i10 << 21)))) + (((~i10) & i12) ^ (i11 & i10)) + iArr2[i38] + iArr3[i38];
            i9 = i31 + i39;
            i5 = i39 + (((i6 << 10) | (i6 >>> 22)) ^ (((i6 >>> 2) | (i6 << 30)) ^ ((i6 >>> 13) | (i6 << 19)))) + (((i6 ^ i7) & i8) | (i6 & i7));
            i13 += 8;
        }
        this.getHighResolutionOutputSizeshNQ4ISI += i5;
        this.getHighSpeedVideoFpsRangesFor += i6;
        this.getHighSpeedVideoSizes += i7;
        this.getHighSpeedVideoFpsRanges += i8;
        this.getInputFormats += i9;
        this.getInputSizeshNQ4ISI += i10;
        this.getOutputMinFrameDuration += i11;
        this.getOutputFormats += i12;
        this.getOutputStallDurationlomOqCM = 0;
        for (int i40 = 0; i40 < 16; i40++) {
            this.getHighSpeedVideoSizesFor[i40] = 0;
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(org.bouncycastle.util.Memoable memoable) {
        Camera2StreamConfigurationMap((org.bouncycastle.crypto.digests.SHA256Digest) memoable);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.getHighResolutionOutputSizeshNQ4ISI = 1779033703;
        this.getHighSpeedVideoFpsRangesFor = -1150833019;
        this.getHighSpeedVideoSizes = 1013904242;
        this.getHighSpeedVideoFpsRanges = -1521486534;
        this.getInputFormats = 1359893119;
        this.getInputSizeshNQ4ISI = -1694144372;
        this.getOutputMinFrameDuration = 528734635;
        this.getOutputFormats = 1541459225;
        this.getOutputStallDurationlomOqCM = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.getHighSpeedVideoSizesFor;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processWord(byte[] bArr, int i) {
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        byte b3 = bArr[i + 2];
        byte b4 = bArr[i + 3];
        int[] iArr = this.getHighSpeedVideoSizesFor;
        int i2 = this.getOutputStallDurationlomOqCM;
        iArr[i2] = (b4 & 255) | (b << com.google.common.base.Ascii.CAN) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
        int i3 = i2 + 1;
        this.getOutputStallDurationlomOqCM = i3;
        if (i3 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processLength(long j) {
        if (this.getOutputStallDurationlomOqCM > 14) {
            processBlock();
        }
        int[] iArr = this.getHighSpeedVideoSizesFor;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    @Override // org.bouncycastle.crypto.digests.EncodableDigest
    public byte[] getEncodedState() {
        byte[] bArr = new byte[(this.getOutputStallDurationlomOqCM * 4) + 52];
        super.populateState(bArr);
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighResolutionOutputSizeshNQ4ISI, bArr, 16);
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighSpeedVideoFpsRangesFor, bArr, 20);
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighSpeedVideoSizes, bArr, 24);
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighSpeedVideoFpsRanges, bArr, 28);
        org.bouncycastle.util.Pack.intToBigEndian(this.getInputFormats, bArr, 32);
        org.bouncycastle.util.Pack.intToBigEndian(this.getInputSizeshNQ4ISI, bArr, 36);
        org.bouncycastle.util.Pack.intToBigEndian(this.getOutputMinFrameDuration, bArr, 40);
        org.bouncycastle.util.Pack.intToBigEndian(this.getOutputFormats, bArr, 44);
        org.bouncycastle.util.Pack.intToBigEndian(this.getOutputStallDurationlomOqCM, bArr, 48);
        for (int i = 0; i != this.getOutputStallDurationlomOqCM; i++) {
            org.bouncycastle.util.Pack.intToBigEndian(this.getHighSpeedVideoSizesFor[i], bArr, (i * 4) + 52);
        }
        return bArr;
    }

    @Override // org.bouncycastle.crypto.Digest
    public java.lang.String getAlgorithmName() {
        return "SHA-256";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighResolutionOutputSizeshNQ4ISI, bArr, i);
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighSpeedVideoFpsRangesFor, bArr, i + 4);
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighSpeedVideoSizes, bArr, i + 8);
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighSpeedVideoFpsRanges, bArr, i + 12);
        org.bouncycastle.util.Pack.intToBigEndian(this.getInputFormats, bArr, i + 16);
        org.bouncycastle.util.Pack.intToBigEndian(this.getInputSizeshNQ4ISI, bArr, i + 20);
        org.bouncycastle.util.Pack.intToBigEndian(this.getOutputMinFrameDuration, bArr, i + 24);
        org.bouncycastle.util.Pack.intToBigEndian(this.getOutputFormats, bArr, i + 28);
        reset();
        return 32;
    }

    @Override // org.bouncycastle.util.Memoable
    public org.bouncycastle.util.Memoable copy() {
        return new org.bouncycastle.crypto.digests.SHA256Digest(this);
    }

    private void Camera2StreamConfigurationMap(org.bouncycastle.crypto.digests.SHA256Digest sHA256Digest) {
        super.copyIn(sHA256Digest);
        this.getHighResolutionOutputSizeshNQ4ISI = sHA256Digest.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRangesFor = sHA256Digest.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoSizes = sHA256Digest.getHighSpeedVideoSizes;
        this.getHighSpeedVideoFpsRanges = sHA256Digest.getHighSpeedVideoFpsRanges;
        this.getInputFormats = sHA256Digest.getInputFormats;
        this.getInputSizeshNQ4ISI = sHA256Digest.getInputSizeshNQ4ISI;
        this.getOutputMinFrameDuration = sHA256Digest.getOutputMinFrameDuration;
        this.getOutputFormats = sHA256Digest.getOutputFormats;
        int[] iArr = sHA256Digest.getHighSpeedVideoSizesFor;
        java.lang.System.arraycopy(iArr, 0, this.getHighSpeedVideoSizesFor, 0, iArr.length);
        this.getOutputStallDurationlomOqCM = sHA256Digest.getOutputStallDurationlomOqCM;
    }

    public SHA256Digest(byte[] bArr) {
        super(bArr);
        this.getHighSpeedVideoSizesFor = new int[64];
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Pack.bigEndianToInt(bArr, 16);
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Pack.bigEndianToInt(bArr, 20);
        this.getHighSpeedVideoSizes = org.bouncycastle.util.Pack.bigEndianToInt(bArr, 24);
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.util.Pack.bigEndianToInt(bArr, 28);
        this.getInputFormats = org.bouncycastle.util.Pack.bigEndianToInt(bArr, 32);
        this.getInputSizeshNQ4ISI = org.bouncycastle.util.Pack.bigEndianToInt(bArr, 36);
        this.getOutputMinFrameDuration = org.bouncycastle.util.Pack.bigEndianToInt(bArr, 40);
        this.getOutputFormats = org.bouncycastle.util.Pack.bigEndianToInt(bArr, 44);
        this.getOutputStallDurationlomOqCM = org.bouncycastle.util.Pack.bigEndianToInt(bArr, 48);
        for (int i = 0; i != this.getOutputStallDurationlomOqCM; i++) {
            this.getHighSpeedVideoSizesFor[i] = org.bouncycastle.util.Pack.bigEndianToInt(bArr, (i * 4) + 52);
        }
    }

    public SHA256Digest(org.bouncycastle.crypto.digests.SHA256Digest sHA256Digest) {
        super(sHA256Digest);
        this.getHighSpeedVideoSizesFor = new int[64];
        Camera2StreamConfigurationMap(sHA256Digest);
    }

    public SHA256Digest() {
        this.getHighSpeedVideoSizesFor = new int[64];
        reset();
    }
}
