package org.bouncycastle.crypto.digests;

/* loaded from: classes17.dex */
public class TupleHash implements org.bouncycastle.crypto.Xof, org.bouncycastle.crypto.Digest {
    private static final byte[] getHighSpeedVideoFpsRanges = org.bouncycastle.util.Strings.toByteArray("TupleHash");
    private final org.bouncycastle.crypto.digests.CSHAKEDigest Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        if (this.getHighSpeedVideoSizes) {
            byte[] rightEncode = org.bouncycastle.crypto.digests.XofUtils.rightEncode(getDigestSize() * 8);
            this.Camera2StreamConfigurationMap.update(rightEncode, 0, rightEncode.length);
            this.getHighSpeedVideoSizes = false;
        }
        int doFinal = this.Camera2StreamConfigurationMap.doFinal(bArr, i, getDigestSize());
        reset();
        return doFinal;
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doFinal(byte[] bArr, int i, int i2) {
        if (this.getHighSpeedVideoSizes) {
            byte[] rightEncode = org.bouncycastle.crypto.digests.XofUtils.rightEncode(getDigestSize() * 8);
            this.Camera2StreamConfigurationMap.update(rightEncode, 0, rightEncode.length);
            this.getHighSpeedVideoSizes = false;
        }
        int doFinal = this.Camera2StreamConfigurationMap.doFinal(bArr, i, i2);
        reset();
        return doFinal;
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doOutput(byte[] bArr, int i, int i2) {
        if (this.getHighSpeedVideoSizes) {
            byte[] rightEncode = org.bouncycastle.crypto.digests.XofUtils.rightEncode(0L);
            this.Camera2StreamConfigurationMap.update(rightEncode, 0, rightEncode.length);
            this.getHighSpeedVideoSizes = false;
        }
        return this.Camera2StreamConfigurationMap.doOutput(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        byte[] highSpeedVideoFpsRanges = org.bouncycastle.crypto.digests.XofUtils.getHighSpeedVideoFpsRanges(bArr, i, i2);
        this.Camera2StreamConfigurationMap.update(highSpeedVideoFpsRanges, 0, highSpeedVideoFpsRanges.length);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b) throws java.lang.IllegalStateException {
        byte[] highSpeedVideoFpsRanges = org.bouncycastle.crypto.digests.XofUtils.getHighSpeedVideoFpsRanges(b);
        this.Camera2StreamConfigurationMap.update(highSpeedVideoFpsRanges, 0, highSpeedVideoFpsRanges.length);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.Camera2StreamConfigurationMap.reset();
        this.getHighSpeedVideoSizes = true;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.Camera2StreamConfigurationMap.getByteLength();
    }

    @Override // org.bouncycastle.crypto.Digest
    public java.lang.String getAlgorithmName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TupleHash");
        sb.append(this.Camera2StreamConfigurationMap.getAlgorithmName().substring(6));
        return sb.toString();
    }

    public TupleHash(org.bouncycastle.crypto.digests.TupleHash tupleHash) {
        org.bouncycastle.crypto.digests.CSHAKEDigest cSHAKEDigest = new org.bouncycastle.crypto.digests.CSHAKEDigest(tupleHash.Camera2StreamConfigurationMap);
        this.Camera2StreamConfigurationMap = cSHAKEDigest;
        int i = cSHAKEDigest.fixedOutputLength;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRangesFor = (i * 2) / 8;
        this.getHighSpeedVideoSizes = tupleHash.getHighSpeedVideoSizes;
    }

    public TupleHash(int i, byte[] bArr, int i2) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.crypto.digests.CSHAKEDigest(i, getHighSpeedVideoFpsRanges, bArr);
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRangesFor = (i2 + 7) / 8;
        reset();
    }

    public TupleHash(int i, byte[] bArr) {
        this(i, bArr, i * 2);
    }
}
