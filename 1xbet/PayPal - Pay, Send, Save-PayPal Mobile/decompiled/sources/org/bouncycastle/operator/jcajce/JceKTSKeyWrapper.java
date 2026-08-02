package org.bouncycastle.operator.jcajce;

/* loaded from: classes17.dex */
public class JceKTSKeyWrapper extends org.bouncycastle.operator.AsymmetricKeyWrapper {
    private final byte[] Camera2StreamConfigurationMap;
    private org.bouncycastle.operator.jcajce.OperatorHelper getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private java.security.PublicKey getHighSpeedVideoFpsRangesFor;
    private final byte[] getHighSpeedVideoSizes;
    private final java.lang.String getInputFormats;
    private java.security.SecureRandom getOutputFormats;

    public org.bouncycastle.operator.jcajce.JceKTSKeyWrapper setSecureRandom(java.security.SecureRandom secureRandom) {
        this.getOutputFormats = secureRandom;
        return this;
    }

    public org.bouncycastle.operator.jcajce.JceKTSKeyWrapper setProvider(java.security.Provider provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.operator.jcajce.OperatorHelper(new org.bouncycastle.jcajce.util.ProviderJcaJceHelper(provider));
        return this;
    }

    public org.bouncycastle.operator.jcajce.JceKTSKeyWrapper setProvider(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.operator.jcajce.OperatorHelper(new org.bouncycastle.jcajce.util.NamedJcaJceHelper(str));
        return this;
    }

    @Override // org.bouncycastle.operator.KeyWrapper
    public byte[] generateWrappedKey(org.bouncycastle.operator.GenericKey genericKey) throws org.bouncycastle.operator.OperatorException {
        javax.crypto.Cipher highSpeedVideoSizes = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(getAlgorithmIdentifier().getAlgorithm(), new java.util.HashMap());
        try {
            highSpeedVideoSizes.init(3, this.getHighSpeedVideoFpsRangesFor, new org.bouncycastle.jcajce.spec.KTSParameterSpec.Builder(this.getInputFormats, this.getHighSpeedVideoFpsRanges, new org.bouncycastle.crypto.util.DEROtherInfo.Builder(org.bouncycastle.operator.jcajce.JceSymmetricKeyWrapper.Camera2StreamConfigurationMap(this.getInputFormats, this.getHighSpeedVideoFpsRanges), this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes).build().getEncoded()).build(), this.getOutputFormats);
            return highSpeedVideoSizes.wrap(org.bouncycastle.operator.jcajce.OperatorUtils.getHighSpeedVideoSizes(genericKey));
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to wrap contents key: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.operator.OperatorException(sb.toString(), e);
        }
    }

    public JceKTSKeyWrapper(java.security.cert.X509Certificate x509Certificate, java.lang.String str, int i, byte[] bArr, byte[] bArr2) {
        this(x509Certificate.getPublicKey(), str, i, bArr, bArr2);
    }

    public JceKTSKeyWrapper(java.security.PublicKey publicKey, java.lang.String str, int i, byte[] bArr, byte[] bArr2) {
        super(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_rsa_KEM, new org.bouncycastle.asn1.cms.GenericHybridParameters(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.iso.ISOIECObjectIdentifiers.id_kem_rsa, new org.bouncycastle.asn1.cms.RsaKemParameters(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_kdf_kdf3, new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256)), (i + 7) / 8)), org.bouncycastle.operator.jcajce.JceSymmetricKeyWrapper.Camera2StreamConfigurationMap(str, i))));
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.operator.jcajce.OperatorHelper(new org.bouncycastle.jcajce.util.DefaultJcaJceHelper());
        this.getHighSpeedVideoFpsRangesFor = publicKey;
        this.getInputFormats = str;
        this.getHighSpeedVideoFpsRanges = i;
        this.Camera2StreamConfigurationMap = org.bouncycastle.util.Arrays.clone(bArr);
        this.getHighSpeedVideoSizes = org.bouncycastle.util.Arrays.clone(bArr2);
    }
}
