package org.bouncycastle.operator.jcajce;

/* loaded from: classes17.dex */
public class JceSymmetricKeyUnwrapper extends org.bouncycastle.operator.SymmetricKeyUnwrapper {
    private org.bouncycastle.operator.jcajce.OperatorHelper getHighSpeedVideoFpsRanges;
    private javax.crypto.SecretKey getHighSpeedVideoFpsRangesFor;

    public org.bouncycastle.operator.jcajce.JceSymmetricKeyUnwrapper setProvider(java.security.Provider provider) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.operator.jcajce.OperatorHelper(new org.bouncycastle.jcajce.util.ProviderJcaJceHelper(provider));
        return this;
    }

    public org.bouncycastle.operator.jcajce.JceSymmetricKeyUnwrapper setProvider(java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.operator.jcajce.OperatorHelper(new org.bouncycastle.jcajce.util.NamedJcaJceHelper(str));
        return this;
    }

    @Override // org.bouncycastle.operator.KeyUnwrapper
    public org.bouncycastle.operator.GenericKey generateUnwrappedKey(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, byte[] bArr) throws org.bouncycastle.operator.OperatorException {
        try {
            javax.crypto.Cipher highSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges(getAlgorithmIdentifier().getAlgorithm());
            highSpeedVideoFpsRanges.init(4, this.getHighSpeedVideoFpsRangesFor);
            return new org.bouncycastle.operator.jcajce.JceGenericKey(algorithmIdentifier, highSpeedVideoFpsRanges.unwrap(bArr, org.bouncycastle.operator.jcajce.OperatorHelper.getHighSpeedVideoFpsRangesFor(algorithmIdentifier.getAlgorithm()), 3));
        } catch (java.security.InvalidKeyException e) {
            throw new org.bouncycastle.operator.OperatorException("key invalid in message.", e);
        } catch (java.security.NoSuchAlgorithmException e2) {
            throw new org.bouncycastle.operator.OperatorException("can't find algorithm.", e2);
        }
    }

    public JceSymmetricKeyUnwrapper(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, javax.crypto.SecretKey secretKey) {
        super(algorithmIdentifier);
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.operator.jcajce.OperatorHelper(new org.bouncycastle.jcajce.util.DefaultJcaJceHelper());
        this.getHighSpeedVideoFpsRangesFor = secretKey;
    }
}
