package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class ParametersWithSBox implements org.bouncycastle.crypto.CipherParameters {
    private org.bouncycastle.crypto.CipherParameters getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;

    public byte[] getSBox() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.crypto.CipherParameters getParameters() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public ParametersWithSBox(org.bouncycastle.crypto.CipherParameters cipherParameters, byte[] bArr) {
        this.getHighSpeedVideoFpsRanges = cipherParameters;
        this.getHighSpeedVideoFpsRangesFor = bArr;
    }
}
