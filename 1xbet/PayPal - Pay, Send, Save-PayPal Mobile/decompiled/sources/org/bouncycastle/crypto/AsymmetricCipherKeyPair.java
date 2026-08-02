package org.bouncycastle.crypto;

/* loaded from: classes17.dex */
public class AsymmetricCipherKeyPair {
    private org.bouncycastle.crypto.params.AsymmetricKeyParameter getHighSpeedVideoFpsRanges;
    private org.bouncycastle.crypto.params.AsymmetricKeyParameter getHighSpeedVideoSizes;

    public org.bouncycastle.crypto.params.AsymmetricKeyParameter getPublic() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.crypto.params.AsymmetricKeyParameter getPrivate() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public AsymmetricCipherKeyPair(org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter, org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter2) {
        this.getHighSpeedVideoSizes = asymmetricKeyParameter;
        this.getHighSpeedVideoFpsRanges = asymmetricKeyParameter2;
    }

    public AsymmetricCipherKeyPair(org.bouncycastle.crypto.CipherParameters cipherParameters, org.bouncycastle.crypto.CipherParameters cipherParameters2) {
        this.getHighSpeedVideoSizes = (org.bouncycastle.crypto.params.AsymmetricKeyParameter) cipherParameters;
        this.getHighSpeedVideoFpsRanges = (org.bouncycastle.crypto.params.AsymmetricKeyParameter) cipherParameters2;
    }
}
