package org.bouncycastle.crypto.digests;

/* loaded from: classes17.dex */
public class SHA512tDigest extends org.bouncycastle.crypto.digests.LongDigest {
    private long Camera2StreamConfigurationMap;
    private long getHighResolutionOutputSizeshNQ4ISI;
    private long getHighSpeedVideoFpsRanges;
    private long getHighSpeedVideoSizes;
    private long getHighSpeedVideoSizesFor;
    private long getInputFormats;
    private long getInputSizeshNQ4ISI;
    private int getOutputFormats;
    private long getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0086, code lost:
    
        if (r3 > 10) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SHA512tDigest(int i) {
        if (i >= 512) {
            throw new java.lang.IllegalArgumentException("bitLength cannot be >= 512");
        }
        if (i % 8 != 0) {
            throw new java.lang.IllegalArgumentException("bitLength needs to be a multiple of 8");
        }
        if (i == 384) {
            throw new java.lang.IllegalArgumentException("bitLength cannot be 384 use SHA384 instead");
        }
        int i2 = i / 8;
        this.getOutputFormats = i2;
        int i3 = i2 * 8;
        this.H1 = -3482333909917012819L;
        this.H2 = 2216346199247487646L;
        this.H3 = -7364697282686394994L;
        this.H4 = 65953792586715988L;
        this.H5 = -816286391624063116L;
        this.H6 = 4512832404995164602L;
        this.H7 = -5033199132376557362L;
        this.H8 = -124578254951840548L;
        update((byte) 83);
        update((byte) 72);
        update((byte) 65);
        update((byte) 45);
        update(org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE);
        update(org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE);
        update(org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE);
        update((byte) 47);
        if (i3 > 100) {
            update((byte) ((i3 / 100) + 48));
            i3 %= 100;
        }
        update((byte) ((i3 / 10) + 48));
        i3 %= 10;
        update((byte) (i3 + 48));
        finish();
        this.getHighSpeedVideoFpsRanges = this.H1;
        this.getHighSpeedVideoSizes = this.H2;
        this.getHighResolutionOutputSizeshNQ4ISI = this.H3;
        this.Camera2StreamConfigurationMap = this.H4;
        this.getInputSizeshNQ4ISI = this.H5;
        this.getHighSpeedVideoSizesFor = this.H6;
        this.getOutputMinFrameDuration = this.H7;
        this.getInputFormats = this.H8;
        reset();
    }

    public SHA512tDigest(byte[] bArr) {
        this(org.bouncycastle.util.Pack.bigEndianToInt(bArr, bArr.length - 4));
        restoreState(bArr);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(long j, byte[] bArr, int i, int i2) {
        if (i2 <= 0) {
            return;
        }
        int i3 = (int) (j >>> 32);
        int min = java.lang.Math.min(4, i2);
        while (true) {
            min--;
            if (min < 0) {
                break;
            } else {
                bArr[i + min] = (byte) (i3 >>> ((3 - min) * 8));
            }
        }
        if (i2 <= 4) {
            return;
        }
        int i4 = (int) (j & 4294967295L);
        int i5 = i + 4;
        int min2 = java.lang.Math.min(4, i2 - 4);
        while (true) {
            min2--;
            if (min2 < 0) {
                return;
            } else {
                bArr[i5 + min2] = (byte) (i4 >>> ((3 - min2) * 8));
            }
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(org.bouncycastle.util.Memoable memoable) {
        org.bouncycastle.crypto.digests.SHA512tDigest sHA512tDigest = (org.bouncycastle.crypto.digests.SHA512tDigest) memoable;
        if (this.getOutputFormats != sHA512tDigest.getOutputFormats) {
            throw new org.bouncycastle.util.MemoableResetException("digestLength inappropriate in other");
        }
        super.copyIn(sHA512tDigest);
        this.getHighSpeedVideoFpsRanges = sHA512tDigest.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoSizes = sHA512tDigest.getHighSpeedVideoSizes;
        this.getHighResolutionOutputSizeshNQ4ISI = sHA512tDigest.getHighResolutionOutputSizeshNQ4ISI;
        this.Camera2StreamConfigurationMap = sHA512tDigest.Camera2StreamConfigurationMap;
        this.getInputSizeshNQ4ISI = sHA512tDigest.getInputSizeshNQ4ISI;
        this.getHighSpeedVideoSizesFor = sHA512tDigest.getHighSpeedVideoSizesFor;
        this.getOutputMinFrameDuration = sHA512tDigest.getOutputMinFrameDuration;
        this.getInputFormats = sHA512tDigest.getInputFormats;
    }

    @Override // org.bouncycastle.crypto.digests.LongDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.H1 = this.getHighSpeedVideoFpsRanges;
        this.H2 = this.getHighSpeedVideoSizes;
        this.H3 = this.getHighResolutionOutputSizeshNQ4ISI;
        this.H4 = this.Camera2StreamConfigurationMap;
        this.H5 = this.getInputSizeshNQ4ISI;
        this.H6 = this.getHighSpeedVideoSizesFor;
        this.H7 = this.getOutputMinFrameDuration;
        this.H8 = this.getInputFormats;
    }

    @Override // org.bouncycastle.crypto.digests.EncodableDigest
    public byte[] getEncodedState() {
        int encodedStateSize = getEncodedStateSize();
        byte[] bArr = new byte[encodedStateSize + 4];
        populateState(bArr);
        org.bouncycastle.util.Pack.intToBigEndian(this.getOutputFormats * 8, bArr, encodedStateSize);
        return bArr;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.getOutputFormats;
    }

    @Override // org.bouncycastle.crypto.Digest
    public java.lang.String getAlgorithmName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SHA-512/");
        sb.append(java.lang.Integer.toString(this.getOutputFormats * 8));
        return sb.toString();
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        getHighResolutionOutputSizeshNQ4ISI(this.H1, bArr, i, this.getOutputFormats);
        getHighResolutionOutputSizeshNQ4ISI(this.H2, bArr, i + 8, this.getOutputFormats - 8);
        getHighResolutionOutputSizeshNQ4ISI(this.H3, bArr, i + 16, this.getOutputFormats - 16);
        getHighResolutionOutputSizeshNQ4ISI(this.H4, bArr, i + 24, this.getOutputFormats - 24);
        getHighResolutionOutputSizeshNQ4ISI(this.H5, bArr, i + 32, this.getOutputFormats - 32);
        getHighResolutionOutputSizeshNQ4ISI(this.H6, bArr, i + 40, this.getOutputFormats - 40);
        getHighResolutionOutputSizeshNQ4ISI(this.H7, bArr, i + 48, this.getOutputFormats - 48);
        getHighResolutionOutputSizeshNQ4ISI(this.H8, bArr, i + 56, this.getOutputFormats - 56);
        reset();
        return this.getOutputFormats;
    }

    @Override // org.bouncycastle.util.Memoable
    public org.bouncycastle.util.Memoable copy() {
        return new org.bouncycastle.crypto.digests.SHA512tDigest(this);
    }

    public SHA512tDigest(org.bouncycastle.crypto.digests.SHA512tDigest sHA512tDigest) {
        super(sHA512tDigest);
        this.getOutputFormats = sHA512tDigest.getOutputFormats;
        reset(sHA512tDigest);
    }
}
