package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes17.dex */
public class LMSContext implements org.bouncycastle.crypto.Digest {
    final org.bouncycastle.pqc.crypto.lms.LMSigParameters Camera2StreamConfigurationMap;
    volatile org.bouncycastle.crypto.Digest getHighResolutionOutputSizeshNQ4ISI;
    final byte[] getHighSpeedVideoFpsRanges;
    final byte[][] getHighSpeedVideoFpsRangesFor;
    final org.bouncycastle.pqc.crypto.lms.LMOtsPrivateKey getHighSpeedVideoSizes;
    private final java.lang.Object getHighSpeedVideoSizesFor;
    org.bouncycastle.pqc.crypto.lms.LMSSignedPubKey[] getInputFormats;
    private final org.bouncycastle.pqc.crypto.lms.LMOtsPublicKey getInputSizeshNQ4ISI;

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        this.getHighResolutionOutputSizeshNQ4ISI.update(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b) {
        this.getHighResolutionOutputSizeshNQ4ISI.update(b);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.getHighResolutionOutputSizeshNQ4ISI.reset();
    }

    public java.lang.Object getSignature() {
        return this.getHighSpeedVideoSizesFor;
    }

    public org.bouncycastle.pqc.crypto.lms.LMOtsPublicKey getPublicKey() {
        return this.getInputSizeshNQ4ISI;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getDigestSize();
    }

    @Override // org.bouncycastle.crypto.Digest
    public java.lang.String getAlgorithmName() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        return this.getHighResolutionOutputSizeshNQ4ISI.doFinal(bArr, i);
    }

    public LMSContext(org.bouncycastle.pqc.crypto.lms.LMOtsPublicKey lMOtsPublicKey, java.lang.Object obj, org.bouncycastle.crypto.Digest digest) {
        this.getInputSizeshNQ4ISI = lMOtsPublicKey;
        this.getHighSpeedVideoSizesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI = digest;
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighSpeedVideoSizes = null;
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoFpsRangesFor = null;
    }

    public LMSContext(org.bouncycastle.pqc.crypto.lms.LMOtsPrivateKey lMOtsPrivateKey, org.bouncycastle.pqc.crypto.lms.LMSigParameters lMSigParameters, org.bouncycastle.crypto.Digest digest, byte[] bArr, byte[][] bArr2) {
        this.getHighSpeedVideoSizes = lMOtsPrivateKey;
        this.Camera2StreamConfigurationMap = lMSigParameters;
        this.getHighResolutionOutputSizeshNQ4ISI = digest;
        this.getHighSpeedVideoFpsRanges = bArr;
        this.getHighSpeedVideoFpsRangesFor = bArr2;
        this.getInputSizeshNQ4ISI = null;
        this.getHighSpeedVideoSizesFor = null;
    }
}
