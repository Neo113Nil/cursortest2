package org.bouncycastle.crypto.ec;

/* loaded from: classes17.dex */
public class ECElGamalDecryptor implements org.bouncycastle.crypto.ec.ECDecryptor {
    private org.bouncycastle.crypto.params.ECPrivateKeyParameters getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.crypto.ec.ECDecryptor
    public void init(org.bouncycastle.crypto.CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.ECPrivateKeyParameters)) {
            throw new java.lang.IllegalArgumentException("ECPrivateKeyParameters are required for decryption.");
        }
        this.getHighSpeedVideoFpsRangesFor = (org.bouncycastle.crypto.params.ECPrivateKeyParameters) cipherParameters;
    }

    @Override // org.bouncycastle.crypto.ec.ECDecryptor
    public org.bouncycastle.math.ec.ECPoint decrypt(org.bouncycastle.crypto.ec.ECPair eCPair) {
        org.bouncycastle.crypto.params.ECPrivateKeyParameters eCPrivateKeyParameters = this.getHighSpeedVideoFpsRangesFor;
        if (eCPrivateKeyParameters == null) {
            throw new java.lang.IllegalStateException("ECElGamalDecryptor not initialised");
        }
        org.bouncycastle.math.ec.ECCurve curve = eCPrivateKeyParameters.getParameters().getCurve();
        return org.bouncycastle.math.ec.ECAlgorithms.cleanPoint(curve, eCPair.getY()).subtract(org.bouncycastle.math.ec.ECAlgorithms.cleanPoint(curve, eCPair.getX()).multiply(this.getHighSpeedVideoFpsRangesFor.getD())).normalize();
    }
}
