package org.bouncycastle.cms.jcajce;

/* loaded from: classes17.dex */
public class JceKTSKeyTransRecipientInfoGenerator extends org.bouncycastle.cms.KeyTransRecipientInfoGenerator {
    private static final byte[] Camera2StreamConfigurationMap = org.bouncycastle.util.encoders.Hex.decode("0c14416e6f6e796d6f75732053656e64657220202020");

    public org.bouncycastle.cms.jcajce.JceKTSKeyTransRecipientInfoGenerator setProvider(java.security.Provider provider) {
        ((org.bouncycastle.operator.jcajce.JceKTSKeyWrapper) this.wrapper).setProvider(provider);
        return this;
    }

    public org.bouncycastle.cms.jcajce.JceKTSKeyTransRecipientInfoGenerator setProvider(java.lang.String str) {
        ((org.bouncycastle.operator.jcajce.JceKTSKeyWrapper) this.wrapper).setProvider(str);
        return this;
    }

    private static byte[] getHighSpeedVideoFpsRanges(byte[] bArr) {
        try {
            return new org.bouncycastle.asn1.DEROctetString(bArr).getEncoded();
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot process subject key identifier: ");
            sb.append(e.getMessage());
            throw new java.lang.IllegalArgumentException(sb.toString()) { // from class: org.bouncycastle.cms.jcajce.JceKTSKeyTransRecipientInfoGenerator.2
                @Override // java.lang.Throwable
                public final java.lang.Throwable getCause() {
                    return e;
                }
            };
        }
    }

    private static byte[] Camera2StreamConfigurationMap(org.bouncycastle.asn1.cms.IssuerAndSerialNumber issuerAndSerialNumber) throws java.security.cert.CertificateEncodingException {
        try {
            return issuerAndSerialNumber.getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot process extracted IssuerAndSerialNumber: ");
            sb.append(e.getMessage());
            throw new java.security.cert.CertificateEncodingException(sb.toString()) { // from class: org.bouncycastle.cms.jcajce.JceKTSKeyTransRecipientInfoGenerator.1
                @Override // java.lang.Throwable
                public final java.lang.Throwable getCause() {
                    return e;
                }
            };
        }
    }

    public JceKTSKeyTransRecipientInfoGenerator(byte[] bArr, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, java.security.PublicKey publicKey) {
        super(bArr, new org.bouncycastle.operator.jcajce.JceAsymmetricKeyWrapper(algorithmIdentifier, publicKey));
    }

    public JceKTSKeyTransRecipientInfoGenerator(byte[] bArr, java.security.PublicKey publicKey, java.lang.String str, int i) {
        super(bArr, new org.bouncycastle.operator.jcajce.JceKTSKeyWrapper(publicKey, str, i, Camera2StreamConfigurationMap, getHighSpeedVideoFpsRanges(bArr)));
    }

    public JceKTSKeyTransRecipientInfoGenerator(java.security.cert.X509Certificate x509Certificate, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) throws java.security.cert.CertificateEncodingException {
        super(new org.bouncycastle.asn1.cms.IssuerAndSerialNumber(new org.bouncycastle.cert.jcajce.JcaX509CertificateHolder(x509Certificate).toASN1Structure()), new org.bouncycastle.operator.jcajce.JceAsymmetricKeyWrapper(algorithmIdentifier, x509Certificate.getPublicKey()));
    }

    private JceKTSKeyTransRecipientInfoGenerator(java.security.cert.X509Certificate x509Certificate, org.bouncycastle.asn1.cms.IssuerAndSerialNumber issuerAndSerialNumber, java.lang.String str, int i) throws java.security.cert.CertificateEncodingException {
        super(issuerAndSerialNumber, new org.bouncycastle.operator.jcajce.JceKTSKeyWrapper(x509Certificate, str, i, Camera2StreamConfigurationMap, Camera2StreamConfigurationMap(issuerAndSerialNumber)));
    }

    public JceKTSKeyTransRecipientInfoGenerator(java.security.cert.X509Certificate x509Certificate, java.lang.String str, int i) throws java.security.cert.CertificateEncodingException {
        this(x509Certificate, new org.bouncycastle.asn1.cms.IssuerAndSerialNumber(new org.bouncycastle.cert.jcajce.JcaX509CertificateHolder(x509Certificate).toASN1Structure()), str, i);
    }
}
