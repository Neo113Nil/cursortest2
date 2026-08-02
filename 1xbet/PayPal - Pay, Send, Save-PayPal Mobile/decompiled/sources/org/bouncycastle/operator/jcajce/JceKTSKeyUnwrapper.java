package org.bouncycastle.operator.jcajce;

/* loaded from: classes17.dex */
public class JceKTSKeyUnwrapper extends org.bouncycastle.operator.AsymmetricKeyUnwrapper {
    private java.security.PrivateKey Camera2StreamConfigurationMap;
    private java.util.Map getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.operator.jcajce.OperatorHelper getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizes;

    public org.bouncycastle.operator.jcajce.JceKTSKeyUnwrapper setProvider(java.security.Provider provider) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.operator.jcajce.OperatorHelper(new org.bouncycastle.jcajce.util.ProviderJcaJceHelper(provider));
        return this;
    }

    public org.bouncycastle.operator.jcajce.JceKTSKeyUnwrapper setProvider(java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.operator.jcajce.OperatorHelper(new org.bouncycastle.jcajce.util.NamedJcaJceHelper(str));
        return this;
    }

    @Override // org.bouncycastle.operator.KeyUnwrapper
    public org.bouncycastle.operator.GenericKey generateUnwrappedKey(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, byte[] bArr) throws org.bouncycastle.operator.OperatorException {
        org.bouncycastle.asn1.cms.GenericHybridParameters genericHybridParameters = org.bouncycastle.asn1.cms.GenericHybridParameters.getInstance(getAlgorithmIdentifier().getParameters());
        javax.crypto.Cipher highSpeedVideoSizes = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes(getAlgorithmIdentifier().getAlgorithm(), this.getHighResolutionOutputSizeshNQ4ISI);
        java.lang.String highSpeedVideoSizesFor = org.bouncycastle.operator.jcajce.OperatorHelper.getHighSpeedVideoSizesFor(genericHybridParameters.getDem().getAlgorithm());
        org.bouncycastle.asn1.cms.RsaKemParameters rsaKemParameters = org.bouncycastle.asn1.cms.RsaKemParameters.getInstance(genericHybridParameters.getKem().getParameters());
        try {
            highSpeedVideoSizes.init(4, this.Camera2StreamConfigurationMap, new org.bouncycastle.jcajce.spec.KTSParameterSpec.Builder(highSpeedVideoSizesFor, rsaKemParameters.getKeyLength().intValue() * 8, new org.bouncycastle.crypto.util.DEROtherInfo.Builder(genericHybridParameters.getDem(), this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes).build().getEncoded()).withKdfAlgorithm(rsaKemParameters.getKeyDerivationFunction()).build());
            return new org.bouncycastle.operator.jcajce.JceGenericKey(algorithmIdentifier, highSpeedVideoSizes.unwrap(bArr, org.bouncycastle.operator.jcajce.OperatorHelper.getHighSpeedVideoFpsRangesFor(algorithmIdentifier.getAlgorithm()), 3));
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to unwrap contents key: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.operator.OperatorException(sb.toString(), e);
        }
    }

    public JceKTSKeyUnwrapper(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, java.security.PrivateKey privateKey, byte[] bArr, byte[] bArr2) {
        super(algorithmIdentifier);
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.operator.jcajce.OperatorHelper(new org.bouncycastle.jcajce.util.DefaultJcaJceHelper());
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.HashMap();
        this.Camera2StreamConfigurationMap = privateKey;
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Arrays.clone(bArr);
        this.getHighSpeedVideoSizes = org.bouncycastle.util.Arrays.clone(bArr2);
    }
}
