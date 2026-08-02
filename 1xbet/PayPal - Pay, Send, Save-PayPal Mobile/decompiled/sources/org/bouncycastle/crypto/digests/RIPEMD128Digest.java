package org.bouncycastle.crypto.digests;

/* loaded from: classes17.dex */
public class RIPEMD128Digest extends org.bouncycastle.crypto.digests.GeneralDigest {
    private int Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private int[] getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private int getInputSizeshNQ4ISI;

    private static int Camera2StreamConfigurationMap(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i + ((i2 ^ i3) ^ i4) + i5;
        return (i7 << i6) | (i7 >>> (32 - i6));
    }

    private static int getHighResolutionOutputSizeshNQ4ISI(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i + ((i2 | (~i3)) ^ i4) + i5 + 1859775393;
        return (i7 << i6) | (i7 >>> (32 - i6));
    }

    private static int getHighSpeedVideoFpsRanges(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i + ((i2 ^ i3) ^ i4) + i5;
        return (i7 << i6) | (i7 >>> (32 - i6));
    }

    private static int getHighSpeedVideoFpsRangesFor(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ((i + ((i2 & i4) | (i3 & (~i4)))) + i5) - 1894007588;
        return (i7 << i6) | (i7 >>> (32 - i6));
    }

    private static int getHighSpeedVideoSizes(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i + ((i2 & i3) | (i4 & (~i2))) + i5 + 1518500249;
        return (i7 << i6) | (i7 >>> (32 - i6));
    }

    private static int getInputFormats(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i + ((i2 | (~i3)) ^ i4) + i5 + 1548603684;
        return (i7 << i6) | (i7 >>> (32 - i6));
    }

    private static int getOutputFormats(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i + ((i2 & i4) | (i3 & (~i4))) + i5 + 1352829926;
        return (i7 << i6) | (i7 >>> (32 - i6));
    }

    private static int getOutputMinFrameDuration(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i + ((i2 & i3) | (i4 & (~i2))) + i5 + 1836072691;
        return (i7 << i6) | (i7 >>> (32 - i6));
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 16;
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(org.bouncycastle.util.Memoable memoable) {
        getHighSpeedVideoFpsRangesFor((org.bouncycastle.crypto.digests.RIPEMD128Digest) memoable);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.getHighResolutionOutputSizeshNQ4ISI = 1732584193;
        this.getHighSpeedVideoSizes = -271733879;
        this.Camera2StreamConfigurationMap = -1732584194;
        this.getHighSpeedVideoFpsRanges = 271733878;
        this.getInputSizeshNQ4ISI = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.getHighSpeedVideoFpsRangesFor;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processWord(byte[] bArr, int i) {
        int[] iArr = this.getHighSpeedVideoFpsRangesFor;
        int i2 = this.getInputSizeshNQ4ISI;
        int i3 = i2 + 1;
        this.getInputSizeshNQ4ISI = i3;
        iArr[i2] = ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        if (i3 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processLength(long j) {
        if (this.getInputSizeshNQ4ISI > 14) {
            processBlock();
        }
        int[] iArr = this.getHighSpeedVideoFpsRangesFor;
        iArr[14] = (int) j;
        iArr[15] = (int) (j >>> 32);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processBlock() {
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        int i2 = this.getHighSpeedVideoSizes;
        int i3 = this.Camera2StreamConfigurationMap;
        int i4 = this.getHighSpeedVideoFpsRanges;
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(i, i2, i3, i4, this.getHighSpeedVideoFpsRangesFor[0], 11);
        int highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(i4, highSpeedVideoFpsRanges, i2, i3, this.getHighSpeedVideoFpsRangesFor[1], 14);
        int highSpeedVideoFpsRanges3 = getHighSpeedVideoFpsRanges(i3, highSpeedVideoFpsRanges2, highSpeedVideoFpsRanges, i2, this.getHighSpeedVideoFpsRangesFor[2], 15);
        int highSpeedVideoFpsRanges4 = getHighSpeedVideoFpsRanges(i2, highSpeedVideoFpsRanges3, highSpeedVideoFpsRanges2, highSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor[3], 12);
        int highSpeedVideoFpsRanges5 = getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges, highSpeedVideoFpsRanges4, highSpeedVideoFpsRanges3, highSpeedVideoFpsRanges2, this.getHighSpeedVideoFpsRangesFor[4], 5);
        int highSpeedVideoFpsRanges6 = getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges2, highSpeedVideoFpsRanges5, highSpeedVideoFpsRanges4, highSpeedVideoFpsRanges3, this.getHighSpeedVideoFpsRangesFor[5], 8);
        int highSpeedVideoFpsRanges7 = getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges3, highSpeedVideoFpsRanges6, highSpeedVideoFpsRanges5, highSpeedVideoFpsRanges4, this.getHighSpeedVideoFpsRangesFor[6], 7);
        int highSpeedVideoFpsRanges8 = getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges4, highSpeedVideoFpsRanges7, highSpeedVideoFpsRanges6, highSpeedVideoFpsRanges5, this.getHighSpeedVideoFpsRangesFor[7], 9);
        int highSpeedVideoFpsRanges9 = getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges5, highSpeedVideoFpsRanges8, highSpeedVideoFpsRanges7, highSpeedVideoFpsRanges6, this.getHighSpeedVideoFpsRangesFor[8], 11);
        int highSpeedVideoFpsRanges10 = getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges6, highSpeedVideoFpsRanges9, highSpeedVideoFpsRanges8, highSpeedVideoFpsRanges7, this.getHighSpeedVideoFpsRangesFor[9], 13);
        int highSpeedVideoFpsRanges11 = getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges7, highSpeedVideoFpsRanges10, highSpeedVideoFpsRanges9, highSpeedVideoFpsRanges8, this.getHighSpeedVideoFpsRangesFor[10], 14);
        int highSpeedVideoFpsRanges12 = getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges8, highSpeedVideoFpsRanges11, highSpeedVideoFpsRanges10, highSpeedVideoFpsRanges9, this.getHighSpeedVideoFpsRangesFor[11], 15);
        int highSpeedVideoFpsRanges13 = getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges9, highSpeedVideoFpsRanges12, highSpeedVideoFpsRanges11, highSpeedVideoFpsRanges10, this.getHighSpeedVideoFpsRangesFor[12], 6);
        int highSpeedVideoFpsRanges14 = getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges10, highSpeedVideoFpsRanges13, highSpeedVideoFpsRanges12, highSpeedVideoFpsRanges11, this.getHighSpeedVideoFpsRangesFor[13], 7);
        int highSpeedVideoFpsRanges15 = getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges11, highSpeedVideoFpsRanges14, highSpeedVideoFpsRanges13, highSpeedVideoFpsRanges12, this.getHighSpeedVideoFpsRangesFor[14], 9);
        int highSpeedVideoFpsRanges16 = getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges12, highSpeedVideoFpsRanges15, highSpeedVideoFpsRanges14, highSpeedVideoFpsRanges13, this.getHighSpeedVideoFpsRangesFor[15], 8);
        int highSpeedVideoSizes = getHighSpeedVideoSizes(highSpeedVideoFpsRanges13, highSpeedVideoFpsRanges16, highSpeedVideoFpsRanges15, highSpeedVideoFpsRanges14, this.getHighSpeedVideoFpsRangesFor[7], 7);
        int highSpeedVideoSizes2 = getHighSpeedVideoSizes(highSpeedVideoFpsRanges14, highSpeedVideoSizes, highSpeedVideoFpsRanges16, highSpeedVideoFpsRanges15, this.getHighSpeedVideoFpsRangesFor[4], 6);
        int highSpeedVideoSizes3 = getHighSpeedVideoSizes(highSpeedVideoFpsRanges15, highSpeedVideoSizes2, highSpeedVideoSizes, highSpeedVideoFpsRanges16, this.getHighSpeedVideoFpsRangesFor[13], 8);
        int highSpeedVideoSizes4 = getHighSpeedVideoSizes(highSpeedVideoFpsRanges16, highSpeedVideoSizes3, highSpeedVideoSizes2, highSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor[1], 13);
        int highSpeedVideoSizes5 = getHighSpeedVideoSizes(highSpeedVideoSizes, highSpeedVideoSizes4, highSpeedVideoSizes3, highSpeedVideoSizes2, this.getHighSpeedVideoFpsRangesFor[10], 11);
        int highSpeedVideoSizes6 = getHighSpeedVideoSizes(highSpeedVideoSizes2, highSpeedVideoSizes5, highSpeedVideoSizes4, highSpeedVideoSizes3, this.getHighSpeedVideoFpsRangesFor[6], 9);
        int highSpeedVideoSizes7 = getHighSpeedVideoSizes(highSpeedVideoSizes3, highSpeedVideoSizes6, highSpeedVideoSizes5, highSpeedVideoSizes4, this.getHighSpeedVideoFpsRangesFor[15], 7);
        int highSpeedVideoSizes8 = getHighSpeedVideoSizes(highSpeedVideoSizes4, highSpeedVideoSizes7, highSpeedVideoSizes6, highSpeedVideoSizes5, this.getHighSpeedVideoFpsRangesFor[3], 15);
        int highSpeedVideoSizes9 = getHighSpeedVideoSizes(highSpeedVideoSizes5, highSpeedVideoSizes8, highSpeedVideoSizes7, highSpeedVideoSizes6, this.getHighSpeedVideoFpsRangesFor[12], 7);
        int highSpeedVideoSizes10 = getHighSpeedVideoSizes(highSpeedVideoSizes6, highSpeedVideoSizes9, highSpeedVideoSizes8, highSpeedVideoSizes7, this.getHighSpeedVideoFpsRangesFor[0], 12);
        int highSpeedVideoSizes11 = getHighSpeedVideoSizes(highSpeedVideoSizes7, highSpeedVideoSizes10, highSpeedVideoSizes9, highSpeedVideoSizes8, this.getHighSpeedVideoFpsRangesFor[9], 15);
        int highSpeedVideoSizes12 = getHighSpeedVideoSizes(highSpeedVideoSizes8, highSpeedVideoSizes11, highSpeedVideoSizes10, highSpeedVideoSizes9, this.getHighSpeedVideoFpsRangesFor[5], 9);
        int highSpeedVideoSizes13 = getHighSpeedVideoSizes(highSpeedVideoSizes9, highSpeedVideoSizes12, highSpeedVideoSizes11, highSpeedVideoSizes10, this.getHighSpeedVideoFpsRangesFor[2], 11);
        int highSpeedVideoSizes14 = getHighSpeedVideoSizes(highSpeedVideoSizes10, highSpeedVideoSizes13, highSpeedVideoSizes12, highSpeedVideoSizes11, this.getHighSpeedVideoFpsRangesFor[14], 7);
        int highSpeedVideoSizes15 = getHighSpeedVideoSizes(highSpeedVideoSizes11, highSpeedVideoSizes14, highSpeedVideoSizes13, highSpeedVideoSizes12, this.getHighSpeedVideoFpsRangesFor[11], 13);
        int highSpeedVideoSizes16 = getHighSpeedVideoSizes(highSpeedVideoSizes12, highSpeedVideoSizes15, highSpeedVideoSizes14, highSpeedVideoSizes13, this.getHighSpeedVideoFpsRangesFor[8], 12);
        int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes13, highSpeedVideoSizes16, highSpeedVideoSizes15, highSpeedVideoSizes14, this.getHighSpeedVideoFpsRangesFor[3], 11);
        int highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes14, highResolutionOutputSizeshNQ4ISI, highSpeedVideoSizes16, highSpeedVideoSizes15, this.getHighSpeedVideoFpsRangesFor[10], 13);
        int highResolutionOutputSizeshNQ4ISI3 = getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes15, highResolutionOutputSizeshNQ4ISI2, highResolutionOutputSizeshNQ4ISI, highSpeedVideoSizes16, this.getHighSpeedVideoFpsRangesFor[14], 6);
        int highResolutionOutputSizeshNQ4ISI4 = getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes16, highResolutionOutputSizeshNQ4ISI3, highResolutionOutputSizeshNQ4ISI2, highResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor[4], 7);
        int highResolutionOutputSizeshNQ4ISI5 = getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI, highResolutionOutputSizeshNQ4ISI4, highResolutionOutputSizeshNQ4ISI3, highResolutionOutputSizeshNQ4ISI2, this.getHighSpeedVideoFpsRangesFor[9], 14);
        int highResolutionOutputSizeshNQ4ISI6 = getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI2, highResolutionOutputSizeshNQ4ISI5, highResolutionOutputSizeshNQ4ISI4, highResolutionOutputSizeshNQ4ISI3, this.getHighSpeedVideoFpsRangesFor[15], 9);
        int highResolutionOutputSizeshNQ4ISI7 = getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI3, highResolutionOutputSizeshNQ4ISI6, highResolutionOutputSizeshNQ4ISI5, highResolutionOutputSizeshNQ4ISI4, this.getHighSpeedVideoFpsRangesFor[8], 13);
        int highResolutionOutputSizeshNQ4ISI8 = getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI4, highResolutionOutputSizeshNQ4ISI7, highResolutionOutputSizeshNQ4ISI6, highResolutionOutputSizeshNQ4ISI5, this.getHighSpeedVideoFpsRangesFor[1], 15);
        int highResolutionOutputSizeshNQ4ISI9 = getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI5, highResolutionOutputSizeshNQ4ISI8, highResolutionOutputSizeshNQ4ISI7, highResolutionOutputSizeshNQ4ISI6, this.getHighSpeedVideoFpsRangesFor[2], 14);
        int highResolutionOutputSizeshNQ4ISI10 = getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI6, highResolutionOutputSizeshNQ4ISI9, highResolutionOutputSizeshNQ4ISI8, highResolutionOutputSizeshNQ4ISI7, this.getHighSpeedVideoFpsRangesFor[7], 8);
        int highResolutionOutputSizeshNQ4ISI11 = getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI7, highResolutionOutputSizeshNQ4ISI10, highResolutionOutputSizeshNQ4ISI9, highResolutionOutputSizeshNQ4ISI8, this.getHighSpeedVideoFpsRangesFor[0], 13);
        int highResolutionOutputSizeshNQ4ISI12 = getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI8, highResolutionOutputSizeshNQ4ISI11, highResolutionOutputSizeshNQ4ISI10, highResolutionOutputSizeshNQ4ISI9, this.getHighSpeedVideoFpsRangesFor[6], 6);
        int highResolutionOutputSizeshNQ4ISI13 = getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI9, highResolutionOutputSizeshNQ4ISI12, highResolutionOutputSizeshNQ4ISI11, highResolutionOutputSizeshNQ4ISI10, this.getHighSpeedVideoFpsRangesFor[13], 5);
        int highResolutionOutputSizeshNQ4ISI14 = getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI10, highResolutionOutputSizeshNQ4ISI13, highResolutionOutputSizeshNQ4ISI12, highResolutionOutputSizeshNQ4ISI11, this.getHighSpeedVideoFpsRangesFor[11], 12);
        int highResolutionOutputSizeshNQ4ISI15 = getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI11, highResolutionOutputSizeshNQ4ISI14, highResolutionOutputSizeshNQ4ISI13, highResolutionOutputSizeshNQ4ISI12, this.getHighSpeedVideoFpsRangesFor[5], 7);
        int highResolutionOutputSizeshNQ4ISI16 = getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI12, highResolutionOutputSizeshNQ4ISI15, highResolutionOutputSizeshNQ4ISI14, highResolutionOutputSizeshNQ4ISI13, this.getHighSpeedVideoFpsRangesFor[12], 5);
        int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(highResolutionOutputSizeshNQ4ISI13, highResolutionOutputSizeshNQ4ISI16, highResolutionOutputSizeshNQ4ISI15, highResolutionOutputSizeshNQ4ISI14, this.getHighSpeedVideoFpsRangesFor[1], 11);
        int highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(highResolutionOutputSizeshNQ4ISI14, highSpeedVideoFpsRangesFor, highResolutionOutputSizeshNQ4ISI16, highResolutionOutputSizeshNQ4ISI15, this.getHighSpeedVideoFpsRangesFor[9], 12);
        int highSpeedVideoFpsRangesFor3 = getHighSpeedVideoFpsRangesFor(highResolutionOutputSizeshNQ4ISI15, highSpeedVideoFpsRangesFor2, highSpeedVideoFpsRangesFor, highResolutionOutputSizeshNQ4ISI16, this.getHighSpeedVideoFpsRangesFor[11], 14);
        int highSpeedVideoFpsRangesFor4 = getHighSpeedVideoFpsRangesFor(highResolutionOutputSizeshNQ4ISI16, highSpeedVideoFpsRangesFor3, highSpeedVideoFpsRangesFor2, highSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRangesFor[10], 15);
        int highSpeedVideoFpsRangesFor5 = getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor, highSpeedVideoFpsRangesFor4, highSpeedVideoFpsRangesFor3, highSpeedVideoFpsRangesFor2, this.getHighSpeedVideoFpsRangesFor[0], 14);
        int highSpeedVideoFpsRangesFor6 = getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor2, highSpeedVideoFpsRangesFor5, highSpeedVideoFpsRangesFor4, highSpeedVideoFpsRangesFor3, this.getHighSpeedVideoFpsRangesFor[8], 15);
        int highSpeedVideoFpsRangesFor7 = getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor3, highSpeedVideoFpsRangesFor6, highSpeedVideoFpsRangesFor5, highSpeedVideoFpsRangesFor4, this.getHighSpeedVideoFpsRangesFor[12], 9);
        int highSpeedVideoFpsRangesFor8 = getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor4, highSpeedVideoFpsRangesFor7, highSpeedVideoFpsRangesFor6, highSpeedVideoFpsRangesFor5, this.getHighSpeedVideoFpsRangesFor[4], 8);
        int highSpeedVideoFpsRangesFor9 = getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor5, highSpeedVideoFpsRangesFor8, highSpeedVideoFpsRangesFor7, highSpeedVideoFpsRangesFor6, this.getHighSpeedVideoFpsRangesFor[13], 9);
        int highSpeedVideoFpsRangesFor10 = getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor6, highSpeedVideoFpsRangesFor9, highSpeedVideoFpsRangesFor8, highSpeedVideoFpsRangesFor7, this.getHighSpeedVideoFpsRangesFor[3], 14);
        int highSpeedVideoFpsRangesFor11 = getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor7, highSpeedVideoFpsRangesFor10, highSpeedVideoFpsRangesFor9, highSpeedVideoFpsRangesFor8, this.getHighSpeedVideoFpsRangesFor[7], 5);
        int highSpeedVideoFpsRangesFor12 = getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor8, highSpeedVideoFpsRangesFor11, highSpeedVideoFpsRangesFor10, highSpeedVideoFpsRangesFor9, this.getHighSpeedVideoFpsRangesFor[15], 6);
        int highSpeedVideoFpsRangesFor13 = getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor9, highSpeedVideoFpsRangesFor12, highSpeedVideoFpsRangesFor11, highSpeedVideoFpsRangesFor10, this.getHighSpeedVideoFpsRangesFor[14], 8);
        int highSpeedVideoFpsRangesFor14 = getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor10, highSpeedVideoFpsRangesFor13, highSpeedVideoFpsRangesFor12, highSpeedVideoFpsRangesFor11, this.getHighSpeedVideoFpsRangesFor[5], 6);
        int highSpeedVideoFpsRangesFor15 = getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor11, highSpeedVideoFpsRangesFor14, highSpeedVideoFpsRangesFor13, highSpeedVideoFpsRangesFor12, this.getHighSpeedVideoFpsRangesFor[6], 5);
        int highSpeedVideoFpsRangesFor16 = getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor12, highSpeedVideoFpsRangesFor15, highSpeedVideoFpsRangesFor14, highSpeedVideoFpsRangesFor13, this.getHighSpeedVideoFpsRangesFor[2], 12);
        int outputFormats = getOutputFormats(i, i2, i3, i4, this.getHighSpeedVideoFpsRangesFor[5], 8);
        int outputFormats2 = getOutputFormats(i4, outputFormats, i2, i3, this.getHighSpeedVideoFpsRangesFor[14], 9);
        int outputFormats3 = getOutputFormats(i3, outputFormats2, outputFormats, i2, this.getHighSpeedVideoFpsRangesFor[7], 9);
        int outputFormats4 = getOutputFormats(i2, outputFormats3, outputFormats2, outputFormats, this.getHighSpeedVideoFpsRangesFor[0], 11);
        int outputFormats5 = getOutputFormats(outputFormats, outputFormats4, outputFormats3, outputFormats2, this.getHighSpeedVideoFpsRangesFor[9], 13);
        int outputFormats6 = getOutputFormats(outputFormats2, outputFormats5, outputFormats4, outputFormats3, this.getHighSpeedVideoFpsRangesFor[2], 15);
        int outputFormats7 = getOutputFormats(outputFormats3, outputFormats6, outputFormats5, outputFormats4, this.getHighSpeedVideoFpsRangesFor[11], 15);
        int outputFormats8 = getOutputFormats(outputFormats4, outputFormats7, outputFormats6, outputFormats5, this.getHighSpeedVideoFpsRangesFor[4], 5);
        int outputFormats9 = getOutputFormats(outputFormats5, outputFormats8, outputFormats7, outputFormats6, this.getHighSpeedVideoFpsRangesFor[13], 7);
        int outputFormats10 = getOutputFormats(outputFormats6, outputFormats9, outputFormats8, outputFormats7, this.getHighSpeedVideoFpsRangesFor[6], 7);
        int outputFormats11 = getOutputFormats(outputFormats7, outputFormats10, outputFormats9, outputFormats8, this.getHighSpeedVideoFpsRangesFor[15], 8);
        int outputFormats12 = getOutputFormats(outputFormats8, outputFormats11, outputFormats10, outputFormats9, this.getHighSpeedVideoFpsRangesFor[8], 11);
        int outputFormats13 = getOutputFormats(outputFormats9, outputFormats12, outputFormats11, outputFormats10, this.getHighSpeedVideoFpsRangesFor[1], 14);
        int outputFormats14 = getOutputFormats(outputFormats10, outputFormats13, outputFormats12, outputFormats11, this.getHighSpeedVideoFpsRangesFor[10], 14);
        int outputFormats15 = getOutputFormats(outputFormats11, outputFormats14, outputFormats13, outputFormats12, this.getHighSpeedVideoFpsRangesFor[3], 12);
        int outputFormats16 = getOutputFormats(outputFormats12, outputFormats15, outputFormats14, outputFormats13, this.getHighSpeedVideoFpsRangesFor[12], 6);
        int inputFormats = getInputFormats(outputFormats13, outputFormats16, outputFormats15, outputFormats14, this.getHighSpeedVideoFpsRangesFor[6], 9);
        int inputFormats2 = getInputFormats(outputFormats14, inputFormats, outputFormats16, outputFormats15, this.getHighSpeedVideoFpsRangesFor[11], 13);
        int inputFormats3 = getInputFormats(outputFormats15, inputFormats2, inputFormats, outputFormats16, this.getHighSpeedVideoFpsRangesFor[3], 15);
        int inputFormats4 = getInputFormats(outputFormats16, inputFormats3, inputFormats2, inputFormats, this.getHighSpeedVideoFpsRangesFor[7], 7);
        int inputFormats5 = getInputFormats(inputFormats, inputFormats4, inputFormats3, inputFormats2, this.getHighSpeedVideoFpsRangesFor[0], 12);
        int inputFormats6 = getInputFormats(inputFormats2, inputFormats5, inputFormats4, inputFormats3, this.getHighSpeedVideoFpsRangesFor[13], 8);
        int inputFormats7 = getInputFormats(inputFormats3, inputFormats6, inputFormats5, inputFormats4, this.getHighSpeedVideoFpsRangesFor[5], 9);
        int inputFormats8 = getInputFormats(inputFormats4, inputFormats7, inputFormats6, inputFormats5, this.getHighSpeedVideoFpsRangesFor[10], 11);
        int inputFormats9 = getInputFormats(inputFormats5, inputFormats8, inputFormats7, inputFormats6, this.getHighSpeedVideoFpsRangesFor[14], 7);
        int inputFormats10 = getInputFormats(inputFormats6, inputFormats9, inputFormats8, inputFormats7, this.getHighSpeedVideoFpsRangesFor[15], 7);
        int inputFormats11 = getInputFormats(inputFormats7, inputFormats10, inputFormats9, inputFormats8, this.getHighSpeedVideoFpsRangesFor[8], 12);
        int inputFormats12 = getInputFormats(inputFormats8, inputFormats11, inputFormats10, inputFormats9, this.getHighSpeedVideoFpsRangesFor[12], 7);
        int inputFormats13 = getInputFormats(inputFormats9, inputFormats12, inputFormats11, inputFormats10, this.getHighSpeedVideoFpsRangesFor[4], 6);
        int inputFormats14 = getInputFormats(inputFormats10, inputFormats13, inputFormats12, inputFormats11, this.getHighSpeedVideoFpsRangesFor[9], 15);
        int inputFormats15 = getInputFormats(inputFormats11, inputFormats14, inputFormats13, inputFormats12, this.getHighSpeedVideoFpsRangesFor[1], 13);
        int inputFormats16 = getInputFormats(inputFormats12, inputFormats15, inputFormats14, inputFormats13, this.getHighSpeedVideoFpsRangesFor[2], 11);
        int outputMinFrameDuration = getOutputMinFrameDuration(inputFormats13, inputFormats16, inputFormats15, inputFormats14, this.getHighSpeedVideoFpsRangesFor[15], 9);
        int outputMinFrameDuration2 = getOutputMinFrameDuration(inputFormats14, outputMinFrameDuration, inputFormats16, inputFormats15, this.getHighSpeedVideoFpsRangesFor[5], 7);
        int outputMinFrameDuration3 = getOutputMinFrameDuration(inputFormats15, outputMinFrameDuration2, outputMinFrameDuration, inputFormats16, this.getHighSpeedVideoFpsRangesFor[1], 15);
        int outputMinFrameDuration4 = getOutputMinFrameDuration(inputFormats16, outputMinFrameDuration3, outputMinFrameDuration2, outputMinFrameDuration, this.getHighSpeedVideoFpsRangesFor[3], 11);
        int outputMinFrameDuration5 = getOutputMinFrameDuration(outputMinFrameDuration, outputMinFrameDuration4, outputMinFrameDuration3, outputMinFrameDuration2, this.getHighSpeedVideoFpsRangesFor[7], 8);
        int outputMinFrameDuration6 = getOutputMinFrameDuration(outputMinFrameDuration2, outputMinFrameDuration5, outputMinFrameDuration4, outputMinFrameDuration3, this.getHighSpeedVideoFpsRangesFor[14], 6);
        int outputMinFrameDuration7 = getOutputMinFrameDuration(outputMinFrameDuration3, outputMinFrameDuration6, outputMinFrameDuration5, outputMinFrameDuration4, this.getHighSpeedVideoFpsRangesFor[6], 6);
        int outputMinFrameDuration8 = getOutputMinFrameDuration(outputMinFrameDuration4, outputMinFrameDuration7, outputMinFrameDuration6, outputMinFrameDuration5, this.getHighSpeedVideoFpsRangesFor[9], 14);
        int outputMinFrameDuration9 = getOutputMinFrameDuration(outputMinFrameDuration5, outputMinFrameDuration8, outputMinFrameDuration7, outputMinFrameDuration6, this.getHighSpeedVideoFpsRangesFor[11], 12);
        int outputMinFrameDuration10 = getOutputMinFrameDuration(outputMinFrameDuration6, outputMinFrameDuration9, outputMinFrameDuration8, outputMinFrameDuration7, this.getHighSpeedVideoFpsRangesFor[8], 13);
        int outputMinFrameDuration11 = getOutputMinFrameDuration(outputMinFrameDuration7, outputMinFrameDuration10, outputMinFrameDuration9, outputMinFrameDuration8, this.getHighSpeedVideoFpsRangesFor[12], 5);
        int outputMinFrameDuration12 = getOutputMinFrameDuration(outputMinFrameDuration8, outputMinFrameDuration11, outputMinFrameDuration10, outputMinFrameDuration9, this.getHighSpeedVideoFpsRangesFor[2], 14);
        int outputMinFrameDuration13 = getOutputMinFrameDuration(outputMinFrameDuration9, outputMinFrameDuration12, outputMinFrameDuration11, outputMinFrameDuration10, this.getHighSpeedVideoFpsRangesFor[10], 13);
        int outputMinFrameDuration14 = getOutputMinFrameDuration(outputMinFrameDuration10, outputMinFrameDuration13, outputMinFrameDuration12, outputMinFrameDuration11, this.getHighSpeedVideoFpsRangesFor[0], 13);
        int outputMinFrameDuration15 = getOutputMinFrameDuration(outputMinFrameDuration11, outputMinFrameDuration14, outputMinFrameDuration13, outputMinFrameDuration12, this.getHighSpeedVideoFpsRangesFor[4], 7);
        int outputMinFrameDuration16 = getOutputMinFrameDuration(outputMinFrameDuration12, outputMinFrameDuration15, outputMinFrameDuration14, outputMinFrameDuration13, this.getHighSpeedVideoFpsRangesFor[13], 5);
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(outputMinFrameDuration13, outputMinFrameDuration16, outputMinFrameDuration15, outputMinFrameDuration14, this.getHighSpeedVideoFpsRangesFor[8], 15);
        int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(outputMinFrameDuration14, Camera2StreamConfigurationMap, outputMinFrameDuration16, outputMinFrameDuration15, this.getHighSpeedVideoFpsRangesFor[6], 5);
        int Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(outputMinFrameDuration15, Camera2StreamConfigurationMap2, Camera2StreamConfigurationMap, outputMinFrameDuration16, this.getHighSpeedVideoFpsRangesFor[4], 8);
        int Camera2StreamConfigurationMap4 = Camera2StreamConfigurationMap(outputMinFrameDuration16, Camera2StreamConfigurationMap3, Camera2StreamConfigurationMap2, Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor[1], 11);
        int Camera2StreamConfigurationMap5 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap, Camera2StreamConfigurationMap4, Camera2StreamConfigurationMap3, Camera2StreamConfigurationMap2, this.getHighSpeedVideoFpsRangesFor[3], 14);
        int Camera2StreamConfigurationMap6 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap2, Camera2StreamConfigurationMap5, Camera2StreamConfigurationMap4, Camera2StreamConfigurationMap3, this.getHighSpeedVideoFpsRangesFor[11], 14);
        int Camera2StreamConfigurationMap7 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap3, Camera2StreamConfigurationMap6, Camera2StreamConfigurationMap5, Camera2StreamConfigurationMap4, this.getHighSpeedVideoFpsRangesFor[15], 6);
        int Camera2StreamConfigurationMap8 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap4, Camera2StreamConfigurationMap7, Camera2StreamConfigurationMap6, Camera2StreamConfigurationMap5, this.getHighSpeedVideoFpsRangesFor[0], 14);
        int Camera2StreamConfigurationMap9 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap5, Camera2StreamConfigurationMap8, Camera2StreamConfigurationMap7, Camera2StreamConfigurationMap6, this.getHighSpeedVideoFpsRangesFor[5], 6);
        int Camera2StreamConfigurationMap10 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap6, Camera2StreamConfigurationMap9, Camera2StreamConfigurationMap8, Camera2StreamConfigurationMap7, this.getHighSpeedVideoFpsRangesFor[12], 9);
        int Camera2StreamConfigurationMap11 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap7, Camera2StreamConfigurationMap10, Camera2StreamConfigurationMap9, Camera2StreamConfigurationMap8, this.getHighSpeedVideoFpsRangesFor[2], 12);
        int Camera2StreamConfigurationMap12 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap8, Camera2StreamConfigurationMap11, Camera2StreamConfigurationMap10, Camera2StreamConfigurationMap9, this.getHighSpeedVideoFpsRangesFor[13], 9);
        int Camera2StreamConfigurationMap13 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap9, Camera2StreamConfigurationMap12, Camera2StreamConfigurationMap11, Camera2StreamConfigurationMap10, this.getHighSpeedVideoFpsRangesFor[9], 12);
        int Camera2StreamConfigurationMap14 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap10, Camera2StreamConfigurationMap13, Camera2StreamConfigurationMap12, Camera2StreamConfigurationMap11, this.getHighSpeedVideoFpsRangesFor[7], 5);
        int Camera2StreamConfigurationMap15 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap11, Camera2StreamConfigurationMap14, Camera2StreamConfigurationMap13, Camera2StreamConfigurationMap12, this.getHighSpeedVideoFpsRangesFor[10], 15);
        int Camera2StreamConfigurationMap16 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap12, Camera2StreamConfigurationMap15, Camera2StreamConfigurationMap14, Camera2StreamConfigurationMap13, this.getHighSpeedVideoFpsRangesFor[14], 8);
        int i5 = this.getHighSpeedVideoSizes;
        this.getHighSpeedVideoSizes = this.Camera2StreamConfigurationMap + highSpeedVideoFpsRangesFor14 + Camera2StreamConfigurationMap13;
        this.Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges + highSpeedVideoFpsRangesFor13 + Camera2StreamConfigurationMap16;
        this.getHighSpeedVideoFpsRanges = this.getHighResolutionOutputSizeshNQ4ISI + highSpeedVideoFpsRangesFor16 + Camera2StreamConfigurationMap15;
        this.getHighResolutionOutputSizeshNQ4ISI = Camera2StreamConfigurationMap14 + highSpeedVideoFpsRangesFor15 + i5;
        this.getInputSizeshNQ4ISI = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.getHighSpeedVideoFpsRangesFor;
            if (i6 == iArr.length) {
                return;
            }
            iArr[i6] = 0;
            i6++;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public java.lang.String getAlgorithmName() {
        return "RIPEMD128";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI, bArr, i);
        Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes, bArr, i + 4);
        Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap, bArr, i + 8);
        Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, bArr, i + 12);
        reset();
        return 16;
    }

    @Override // org.bouncycastle.util.Memoable
    public org.bouncycastle.util.Memoable copy() {
        return new org.bouncycastle.crypto.digests.RIPEMD128Digest(this);
    }

    private static void Camera2StreamConfigurationMap(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    private void getHighSpeedVideoFpsRangesFor(org.bouncycastle.crypto.digests.RIPEMD128Digest rIPEMD128Digest) {
        super.copyIn(rIPEMD128Digest);
        this.getHighResolutionOutputSizeshNQ4ISI = rIPEMD128Digest.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoSizes = rIPEMD128Digest.getHighSpeedVideoSizes;
        this.Camera2StreamConfigurationMap = rIPEMD128Digest.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRanges = rIPEMD128Digest.getHighSpeedVideoFpsRanges;
        int[] iArr = rIPEMD128Digest.getHighSpeedVideoFpsRangesFor;
        java.lang.System.arraycopy(iArr, 0, this.getHighSpeedVideoFpsRangesFor, 0, iArr.length);
        this.getInputSizeshNQ4ISI = rIPEMD128Digest.getInputSizeshNQ4ISI;
    }

    public RIPEMD128Digest(org.bouncycastle.crypto.digests.RIPEMD128Digest rIPEMD128Digest) {
        super(rIPEMD128Digest);
        this.getHighSpeedVideoFpsRangesFor = new int[16];
        getHighSpeedVideoFpsRangesFor(rIPEMD128Digest);
    }

    public RIPEMD128Digest() {
        this.getHighSpeedVideoFpsRangesFor = new int[16];
        reset();
    }
}
