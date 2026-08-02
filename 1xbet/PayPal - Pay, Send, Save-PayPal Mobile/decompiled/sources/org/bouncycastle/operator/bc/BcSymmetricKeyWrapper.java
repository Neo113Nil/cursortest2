package org.bouncycastle.operator.bc;

/* loaded from: classes17.dex */
public class BcSymmetricKeyWrapper extends org.bouncycastle.operator.SymmetricKeyWrapper {
    private org.bouncycastle.crypto.params.KeyParameter getHighResolutionOutputSizeshNQ4ISI;
    private java.security.SecureRandom getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.crypto.Wrapper getHighSpeedVideoSizes;

    public org.bouncycastle.operator.bc.BcSymmetricKeyWrapper setSecureRandom(java.security.SecureRandom secureRandom) {
        this.getHighSpeedVideoFpsRangesFor = secureRandom;
        return this;
    }

    @Override // org.bouncycastle.operator.KeyWrapper
    public byte[] generateWrappedKey(org.bouncycastle.operator.GenericKey genericKey) throws org.bouncycastle.operator.OperatorException {
        org.bouncycastle.crypto.Wrapper wrapper;
        org.bouncycastle.crypto.CipherParameters cipherParameters;
        byte[] highSpeedVideoSizes = org.bouncycastle.operator.bc.OperatorUtils.getHighSpeedVideoSizes(genericKey);
        java.security.SecureRandom secureRandom = this.getHighSpeedVideoFpsRangesFor;
        if (secureRandom == null) {
            wrapper = this.getHighSpeedVideoSizes;
            cipherParameters = this.getHighResolutionOutputSizeshNQ4ISI;
        } else {
            org.bouncycastle.crypto.Wrapper wrapper2 = this.getHighSpeedVideoSizes;
            org.bouncycastle.crypto.params.ParametersWithRandom parametersWithRandom = new org.bouncycastle.crypto.params.ParametersWithRandom(this.getHighResolutionOutputSizeshNQ4ISI, secureRandom);
            wrapper = wrapper2;
            cipherParameters = parametersWithRandom;
        }
        wrapper.init(true, cipherParameters);
        return this.getHighSpeedVideoSizes.wrap(highSpeedVideoSizes, 0, highSpeedVideoSizes.length);
    }

    public BcSymmetricKeyWrapper(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.crypto.Wrapper wrapper, org.bouncycastle.crypto.params.KeyParameter keyParameter) {
        super(algorithmIdentifier);
        this.getHighSpeedVideoSizes = wrapper;
        this.getHighResolutionOutputSizeshNQ4ISI = keyParameter;
    }
}
