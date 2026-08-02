package org.bouncycastle.cert.crmf.jcajce;

/* loaded from: classes17.dex */
public class JceAsymmetricValueDecryptorGenerator implements org.bouncycastle.cert.crmf.ValueDecryptorGenerator {
    private java.security.PrivateKey Camera2StreamConfigurationMap;
    private org.bouncycastle.cert.crmf.jcajce.CRMFHelper getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.cert.crmf.jcajce.CRMFHelper(new org.bouncycastle.jcajce.util.DefaultJcaJceHelper());
    private java.security.Provider getHighSpeedVideoSizes = null;
    private java.lang.String getHighSpeedVideoFpsRangesFor = null;

    @Override // org.bouncycastle.cert.crmf.ValueDecryptorGenerator
    public org.bouncycastle.operator.InputDecryptor getValueDecryptor(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, final org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2, byte[] bArr) throws org.bouncycastle.cert.crmf.CRMFException {
        final javax.crypto.Cipher cipher = (javax.crypto.Cipher) org.bouncycastle.cert.crmf.jcajce.CRMFHelper.getHighResolutionOutputSizeshNQ4ISI(new org.bouncycastle.cert.crmf.jcajce.CRMFHelper.JCECallback() { // from class: org.bouncycastle.cert.crmf.jcajce.CRMFHelper.1
            final /* synthetic */ java.security.Key Camera2StreamConfigurationMap;
            final /* synthetic */ org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRanges;

            @Override // org.bouncycastle.cert.crmf.jcajce.CRMFHelper.JCECallback
            public final java.lang.Object getHighSpeedVideoFpsRanges() throws org.bouncycastle.cert.crmf.CRMFException, java.security.InvalidAlgorithmParameterException, java.security.InvalidKeyException, java.security.spec.InvalidParameterSpecException, java.security.NoSuchAlgorithmException, javax.crypto.NoSuchPaddingException, java.security.NoSuchProviderException {
                javax.crypto.Cipher highSpeedVideoFpsRangesFor = org.bouncycastle.cert.crmf.jcajce.CRMFHelper.this.getHighSpeedVideoFpsRangesFor(r2.getAlgorithm());
                org.bouncycastle.asn1.ASN1Primitive aSN1Primitive = (org.bouncycastle.asn1.ASN1Primitive) r2.getParameters();
                org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = r2.getAlgorithm();
                if (aSN1Primitive == null || (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1Null)) {
                    if (algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.cms.CMSAlgorithm.DES_EDE3_CBC) || algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.cms.CMSAlgorithm.IDEA_CBC) || algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.cms.CMSAlgorithm.CAST5_CBC)) {
                        highSpeedVideoFpsRangesFor.init(2, r3, new javax.crypto.spec.IvParameterSpec(new byte[8]));
                        return highSpeedVideoFpsRangesFor;
                    }
                    highSpeedVideoFpsRangesFor.init(2, r3);
                    return highSpeedVideoFpsRangesFor;
                }
                try {
                    java.security.AlgorithmParameters highSpeedVideoSizes = org.bouncycastle.cert.crmf.jcajce.CRMFHelper.this.getHighSpeedVideoSizes(r2.getAlgorithm());
                    try {
                        org.bouncycastle.jcajce.util.AlgorithmParametersUtils.loadParameters(highSpeedVideoSizes, aSN1Primitive);
                        highSpeedVideoFpsRangesFor.init(2, r3, highSpeedVideoSizes);
                        return highSpeedVideoFpsRangesFor;
                    } catch (java.io.IOException e) {
                        throw new org.bouncycastle.cert.crmf.CRMFException("error decoding algorithm parameters.", e);
                    }
                } catch (java.security.NoSuchAlgorithmException e2) {
                    if (!algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.cms.CMSAlgorithm.DES_EDE3_CBC) && !algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.cms.CMSAlgorithm.IDEA_CBC) && !algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.cms.CMSAlgorithm.AES128_CBC) && !algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.cms.CMSAlgorithm.AES192_CBC) && !algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.cms.CMSAlgorithm.AES256_CBC)) {
                        throw e2;
                    }
                    highSpeedVideoFpsRangesFor.init(2, r3, new javax.crypto.spec.IvParameterSpec(org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Primitive).getOctets()));
                    return highSpeedVideoFpsRangesFor;
                }
            }

            AnonymousClass1(final org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier22, java.security.Key key) {
                r2 = algorithmIdentifier22;
                r3 = key;
            }
        });
        return new org.bouncycastle.operator.InputDecryptor() { // from class: org.bouncycastle.cert.crmf.jcajce.JceAsymmetricValueDecryptorGenerator.1
            @Override // org.bouncycastle.operator.InputDecryptor
            public java.io.InputStream getInputStream(java.io.InputStream inputStream) {
                return new org.bouncycastle.jcajce.io.CipherInputStream(inputStream, cipher);
            }

            @Override // org.bouncycastle.operator.InputDecryptor
            public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() {
                return algorithmIdentifier22;
            }
        };
    }

    public org.bouncycastle.cert.crmf.jcajce.JceAsymmetricValueDecryptorGenerator setProvider(java.security.Provider provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.cert.crmf.jcajce.CRMFHelper(new org.bouncycastle.jcajce.util.ProviderJcaJceHelper(provider));
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRangesFor = null;
        return this;
    }

    public org.bouncycastle.cert.crmf.jcajce.JceAsymmetricValueDecryptorGenerator setProvider(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.cert.crmf.jcajce.CRMFHelper(new org.bouncycastle.jcajce.util.NamedJcaJceHelper(str));
        this.getHighSpeedVideoSizes = null;
        this.getHighSpeedVideoFpsRangesFor = str;
        return this;
    }

    private java.security.Key getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2, byte[] bArr) throws org.bouncycastle.cert.crmf.CRMFException {
        try {
            org.bouncycastle.operator.jcajce.JceAsymmetricKeyUnwrapper jceAsymmetricKeyUnwrapper = new org.bouncycastle.operator.jcajce.JceAsymmetricKeyUnwrapper(algorithmIdentifier, this.Camera2StreamConfigurationMap);
            java.security.Provider provider = this.getHighSpeedVideoSizes;
            if (provider != null) {
                jceAsymmetricKeyUnwrapper.setProvider(provider);
            }
            java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
            if (str != null) {
                jceAsymmetricKeyUnwrapper.setProvider(str);
            }
            return new javax.crypto.spec.SecretKeySpec((byte[]) jceAsymmetricKeyUnwrapper.generateUnwrappedKey(algorithmIdentifier2, bArr).getRepresentation(), algorithmIdentifier2.getAlgorithm().getId());
        } catch (org.bouncycastle.operator.OperatorException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("key invalid in message: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cert.crmf.CRMFException(sb.toString(), e);
        }
    }

    public JceAsymmetricValueDecryptorGenerator(java.security.PrivateKey privateKey) {
        this.Camera2StreamConfigurationMap = privateKey;
    }
}
