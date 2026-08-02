package org.bouncycastle.crypto.digests;

/* loaded from: classes17.dex */
public class SHA224Digest extends org.bouncycastle.crypto.digests.GeneralDigest implements org.bouncycastle.crypto.digests.EncodableDigest {
    static final int[] getHighSpeedVideoSizes = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    private int Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizesFor;
    private int[] getInputFormats;
    private int getInputSizeshNQ4ISI;
    private int getOutputFormats;
    private int getOutputMinFrameDuration;
    private int getOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 28;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processBlock() {
        for (int i = 16; i <= 63; i++) {
            int[] iArr = this.getInputFormats;
            int i2 = iArr[i - 2];
            int i3 = ((((i2 << 13) | (i2 >>> 19)) ^ ((i2 >>> 17) | (i2 << 15))) ^ (i2 >>> 10)) + iArr[i - 7];
            int i4 = iArr[i - 15];
            iArr[i] = i3 + ((((i4 << 14) | (i4 >>> 18)) ^ ((i4 >>> 7) | (i4 << 25))) ^ (i4 >>> 3)) + iArr[i - 16];
        }
        int i5 = this.getHighSpeedVideoFpsRangesFor;
        int i6 = this.Camera2StreamConfigurationMap;
        int i7 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i8 = this.getHighSpeedVideoFpsRanges;
        int i9 = this.getHighSpeedVideoSizesFor;
        int i10 = this.getOutputMinFrameDuration;
        int i11 = this.getInputSizeshNQ4ISI;
        int i12 = this.getOutputFormats;
        int i13 = 0;
        for (int i14 = 0; i14 < 8; i14++) {
            int i15 = ((~i9) & i11) ^ (i10 & i9);
            int[] iArr2 = getHighSpeedVideoSizes;
            int i16 = (((i9 << 7) | (i9 >>> 25)) ^ (((i9 >>> 6) | (i9 << 26)) ^ ((i9 >>> 11) | (i9 << 21)))) + i15 + iArr2[i13];
            int[] iArr3 = this.getInputFormats;
            int i17 = i12 + i16 + iArr3[i13];
            int i18 = i8 + i17;
            int i19 = i5 & i6;
            int i20 = i17 + (((i5 << 10) | (i5 >>> 22)) ^ (((i5 >>> 2) | (i5 << 30)) ^ ((i5 >>> 13) | (i5 << 19)))) + (((i5 & i7) ^ i19) ^ (i6 & i7));
            int i21 = i13 + 1;
            int i22 = i11 + (((i18 << 7) | (i18 >>> 25)) ^ (((i18 >>> 6) | (i18 << 26)) ^ ((i18 >>> 11) | (i18 << 21)))) + (((~i18) & i10) ^ (i9 & i18)) + iArr2[i21] + iArr3[i21];
            int i23 = i7 + i22;
            int i24 = i20 & i5;
            int i25 = i22 + (((i20 << 10) | (i20 >>> 22)) ^ (((i20 >>> 2) | (i20 << 30)) ^ ((i20 >>> 13) | (i20 << 19)))) + (((i20 & i6) ^ i24) ^ i19);
            int i26 = i13 + 2;
            int i27 = i10 + (((i23 << 7) | (i23 >>> 25)) ^ (((i23 >>> 6) | (i23 << 26)) ^ ((i23 >>> 11) | (i23 << 21)))) + (((~i23) & i9) ^ (i18 & i23)) + iArr2[i26] + iArr3[i26];
            int i28 = i6 + i27;
            int i29 = i25 & i20;
            int i30 = i27 + (((i25 << 10) | (i25 >>> 22)) ^ (((i25 >>> 2) | (i25 << 30)) ^ ((i25 >>> 13) | (i25 << 19)))) + (((i25 & i5) ^ i29) ^ i24);
            int i31 = i13 + 3;
            int i32 = i9 + (((i28 << 7) | (i28 >>> 25)) ^ (((i28 >>> 6) | (i28 << 26)) ^ ((i28 >>> 11) | (i28 << 21)))) + (((~i28) & i18) ^ (i23 & i28)) + iArr2[i31] + iArr3[i31];
            int i33 = i5 + i32;
            int i34 = i30 & i25;
            int i35 = i32 + (((i30 << 10) | (i30 >>> 22)) ^ (((i30 >>> 2) | (i30 << 30)) ^ ((i30 >>> 13) | (i30 << 19)))) + (((i30 & i20) ^ i34) ^ i29);
            int i36 = i13 + 4;
            int i37 = i18 + (((i33 << 7) | (i33 >>> 25)) ^ (((i33 >>> 6) | (i33 << 26)) ^ ((i33 >>> 11) | (i33 << 21)))) + (((~i33) & i23) ^ (i28 & i33)) + iArr2[i36] + iArr3[i36];
            i12 = i20 + i37;
            int i38 = i35 & i30;
            i8 = i37 + (((i35 << 10) | (i35 >>> 22)) ^ (((i35 >>> 2) | (i35 << 30)) ^ ((i35 >>> 13) | (i35 << 19)))) + (((i35 & i25) ^ i38) ^ i34);
            int i39 = i13 + 5;
            int i40 = i23 + (((i12 << 7) | (i12 >>> 25)) ^ (((i12 >>> 6) | (i12 << 26)) ^ ((i12 >>> 11) | (i12 << 21)))) + (((~i12) & i28) ^ (i33 & i12)) + iArr2[i39] + iArr3[i39];
            i11 = i25 + i40;
            int i41 = i8 & i35;
            i7 = i40 + (((i8 << 10) | (i8 >>> 22)) ^ (((i8 >>> 2) | (i8 << 30)) ^ ((i8 >>> 13) | (i8 << 19)))) + (((i8 & i30) ^ i41) ^ i38);
            int i42 = i13 + 6;
            int i43 = i28 + (((i11 << 7) | (i11 >>> 25)) ^ (((i11 >>> 6) | (i11 << 26)) ^ ((i11 >>> 11) | (i11 << 21)))) + (((~i11) & i33) ^ (i12 & i11)) + iArr2[i42] + iArr3[i42];
            i10 = i30 + i43;
            int i44 = i7 & i8;
            i6 = i43 + (((i7 << 10) | (i7 >>> 22)) ^ (((i7 >>> 2) | (i7 << 30)) ^ ((i7 >>> 13) | (i7 << 19)))) + (((i7 & i35) ^ i44) ^ i41);
            int i45 = i13 + 7;
            int i46 = i33 + (((i10 << 7) | (i10 >>> 25)) ^ (((i10 >>> 6) | (i10 << 26)) ^ ((i10 >>> 11) | (i10 << 21)))) + (((~i10) & i12) ^ (i11 & i10)) + iArr2[i45] + iArr3[i45];
            i9 = i35 + i46;
            i5 = i46 + (((i6 << 10) | (i6 >>> 22)) ^ (((i6 >>> 2) | (i6 << 30)) ^ ((i6 >>> 13) | (i6 << 19)))) + (((i6 & i8) ^ (i6 & i7)) ^ i44);
            i13 += 8;
        }
        this.getHighSpeedVideoFpsRangesFor += i5;
        this.Camera2StreamConfigurationMap += i6;
        this.getHighResolutionOutputSizeshNQ4ISI += i7;
        this.getHighSpeedVideoFpsRanges += i8;
        this.getHighSpeedVideoSizesFor += i9;
        this.getOutputMinFrameDuration += i10;
        this.getInputSizeshNQ4ISI += i11;
        this.getOutputFormats += i12;
        this.getOutputSizeshNQ4ISI = 0;
        for (int i47 = 0; i47 < 16; i47++) {
            this.getInputFormats[i47] = 0;
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(org.bouncycastle.util.Memoable memoable) {
        getHighResolutionOutputSizeshNQ4ISI((org.bouncycastle.crypto.digests.SHA224Digest) memoable);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.getHighSpeedVideoFpsRangesFor = -1056596264;
        this.Camera2StreamConfigurationMap = 914150663;
        this.getHighResolutionOutputSizeshNQ4ISI = 812702999;
        this.getHighSpeedVideoFpsRanges = -150054599;
        this.getHighSpeedVideoSizesFor = -4191439;
        this.getOutputMinFrameDuration = 1750603025;
        this.getInputSizeshNQ4ISI = 1694076839;
        this.getOutputFormats = -1090891868;
        this.getOutputSizeshNQ4ISI = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.getInputFormats;
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
        int[] iArr = this.getInputFormats;
        int i2 = this.getOutputSizeshNQ4ISI;
        iArr[i2] = (b4 & 255) | (b << com.google.common.base.Ascii.CAN) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
        int i3 = i2 + 1;
        this.getOutputSizeshNQ4ISI = i3;
        if (i3 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processLength(long j) {
        if (this.getOutputSizeshNQ4ISI > 14) {
            processBlock();
        }
        int[] iArr = this.getInputFormats;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    @Override // org.bouncycastle.crypto.digests.EncodableDigest
    public byte[] getEncodedState() {
        byte[] bArr = new byte[(this.getOutputSizeshNQ4ISI * 4) + 52];
        super.populateState(bArr);
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighSpeedVideoFpsRangesFor, bArr, 16);
        org.bouncycastle.util.Pack.intToBigEndian(this.Camera2StreamConfigurationMap, bArr, 20);
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighResolutionOutputSizeshNQ4ISI, bArr, 24);
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighSpeedVideoFpsRanges, bArr, 28);
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighSpeedVideoSizesFor, bArr, 32);
        org.bouncycastle.util.Pack.intToBigEndian(this.getOutputMinFrameDuration, bArr, 36);
        org.bouncycastle.util.Pack.intToBigEndian(this.getInputSizeshNQ4ISI, bArr, 40);
        org.bouncycastle.util.Pack.intToBigEndian(this.getOutputFormats, bArr, 44);
        org.bouncycastle.util.Pack.intToBigEndian(this.getOutputSizeshNQ4ISI, bArr, 48);
        for (int i = 0; i != this.getOutputSizeshNQ4ISI; i++) {
            org.bouncycastle.util.Pack.intToBigEndian(this.getInputFormats[i], bArr, (i * 4) + 52);
        }
        return bArr;
    }

    @Override // org.bouncycastle.crypto.Digest
    public java.lang.String getAlgorithmName() {
        return "SHA-224";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighSpeedVideoFpsRangesFor, bArr, i);
        org.bouncycastle.util.Pack.intToBigEndian(this.Camera2StreamConfigurationMap, bArr, i + 4);
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighResolutionOutputSizeshNQ4ISI, bArr, i + 8);
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighSpeedVideoFpsRanges, bArr, i + 12);
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighSpeedVideoSizesFor, bArr, i + 16);
        org.bouncycastle.util.Pack.intToBigEndian(this.getOutputMinFrameDuration, bArr, i + 20);
        org.bouncycastle.util.Pack.intToBigEndian(this.getInputSizeshNQ4ISI, bArr, i + 24);
        reset();
        return 28;
    }

    @Override // org.bouncycastle.util.Memoable
    public org.bouncycastle.util.Memoable copy() {
        return new org.bouncycastle.crypto.digests.SHA224Digest(this);
    }

    private void getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.crypto.digests.SHA224Digest sHA224Digest) {
        super.copyIn(sHA224Digest);
        this.getHighSpeedVideoFpsRangesFor = sHA224Digest.getHighSpeedVideoFpsRangesFor;
        this.Camera2StreamConfigurationMap = sHA224Digest.Camera2StreamConfigurationMap;
        this.getHighResolutionOutputSizeshNQ4ISI = sHA224Digest.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRanges = sHA224Digest.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoSizesFor = sHA224Digest.getHighSpeedVideoSizesFor;
        this.getOutputMinFrameDuration = sHA224Digest.getOutputMinFrameDuration;
        this.getInputSizeshNQ4ISI = sHA224Digest.getInputSizeshNQ4ISI;
        this.getOutputFormats = sHA224Digest.getOutputFormats;
        int[] iArr = sHA224Digest.getInputFormats;
        java.lang.System.arraycopy(iArr, 0, this.getInputFormats, 0, iArr.length);
        this.getOutputSizeshNQ4ISI = sHA224Digest.getOutputSizeshNQ4ISI;
    }

    public SHA224Digest(byte[] bArr) {
        super(bArr);
        this.getInputFormats = new int[64];
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Pack.bigEndianToInt(bArr, 16);
        this.Camera2StreamConfigurationMap = org.bouncycastle.util.Pack.bigEndianToInt(bArr, 20);
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Pack.bigEndianToInt(bArr, 24);
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.util.Pack.bigEndianToInt(bArr, 28);
        this.getHighSpeedVideoSizesFor = org.bouncycastle.util.Pack.bigEndianToInt(bArr, 32);
        this.getOutputMinFrameDuration = org.bouncycastle.util.Pack.bigEndianToInt(bArr, 36);
        this.getInputSizeshNQ4ISI = org.bouncycastle.util.Pack.bigEndianToInt(bArr, 40);
        this.getOutputFormats = org.bouncycastle.util.Pack.bigEndianToInt(bArr, 44);
        this.getOutputSizeshNQ4ISI = org.bouncycastle.util.Pack.bigEndianToInt(bArr, 48);
        for (int i = 0; i != this.getOutputSizeshNQ4ISI; i++) {
            this.getInputFormats[i] = org.bouncycastle.util.Pack.bigEndianToInt(bArr, (i * 4) + 52);
        }
    }

    public SHA224Digest(org.bouncycastle.crypto.digests.SHA224Digest sHA224Digest) {
        super(sHA224Digest);
        this.getInputFormats = new int[64];
        getHighResolutionOutputSizeshNQ4ISI(sHA224Digest);
    }

    public SHA224Digest() {
        this.getInputFormats = new int[64];
        reset();
    }
}
