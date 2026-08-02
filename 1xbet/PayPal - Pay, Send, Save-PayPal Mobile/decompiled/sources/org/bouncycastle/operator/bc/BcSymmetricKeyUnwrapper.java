package org.bouncycastle.operator.bc;

/* loaded from: classes17.dex */
public class BcSymmetricKeyUnwrapper extends org.bouncycastle.operator.SymmetricKeyUnwrapper {
    private org.bouncycastle.crypto.Wrapper getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.params.KeyParameter getHighSpeedVideoFpsRanges;
    private java.security.SecureRandom getHighSpeedVideoSizes;

    public org.bouncycastle.operator.bc.BcSymmetricKeyUnwrapper setSecureRandom(java.security.SecureRandom secureRandom) {
        this.getHighSpeedVideoSizes = secureRandom;
        return this;
    }

    @Override // org.bouncycastle.operator.KeyUnwrapper
    public org.bouncycastle.operator.GenericKey generateUnwrappedKey(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, byte[] bArr) throws org.bouncycastle.operator.OperatorException {
        this.getHighResolutionOutputSizeshNQ4ISI.init(false, this.getHighSpeedVideoFpsRanges);
        try {
            return new org.bouncycastle.operator.GenericKey(algorithmIdentifier, this.getHighResolutionOutputSizeshNQ4ISI.unwrap(bArr, 0, bArr.length));
        } catch (org.bouncycastle.crypto.InvalidCipherTextException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to unwrap key: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.operator.OperatorException(sb.toString(), e);
        }
    }

    public BcSymmetricKeyUnwrapper(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.crypto.Wrapper wrapper, org.bouncycastle.crypto.params.KeyParameter keyParameter) {
        super(algorithmIdentifier);
        this.getHighResolutionOutputSizeshNQ4ISI = wrapper;
        this.getHighSpeedVideoFpsRanges = keyParameter;
    }
}
