package org.bouncycastle.pkcs;

/* loaded from: classes17.dex */
public class PKCS12SafeBagBuilder {
    private org.bouncycastle.asn1.ASN1ObjectIdentifier Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1EncodableVector getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoFpsRangesFor;

    public org.bouncycastle.pkcs.PKCS12SafeBag build() {
        return new org.bouncycastle.pkcs.PKCS12SafeBag(new org.bouncycastle.asn1.pkcs.SafeBag(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, new org.bouncycastle.asn1.DERSet(this.getHighSpeedVideoFpsRanges)));
    }

    public org.bouncycastle.pkcs.PKCS12SafeBagBuilder addBagAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighSpeedVideoFpsRanges.add(new org.bouncycastle.asn1.pkcs.Attribute(aSN1ObjectIdentifier, new org.bouncycastle.asn1.DERSet(aSN1Encodable)));
        return this;
    }

    public PKCS12SafeBagBuilder(org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) throws java.io.IOException {
        this(x509CertificateHolder.toASN1Structure());
    }

    public PKCS12SafeBagBuilder(org.bouncycastle.cert.X509CRLHolder x509CRLHolder) throws java.io.IOException {
        this(x509CRLHolder.toASN1Structure());
    }

    public PKCS12SafeBagBuilder(org.bouncycastle.asn1.x509.CertificateList certificateList) throws java.io.IOException {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.ASN1EncodableVector();
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.crlBag;
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.pkcs.CertBag(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.x509Crl, new org.bouncycastle.asn1.DEROctetString(certificateList.getEncoded()));
    }

    public PKCS12SafeBagBuilder(org.bouncycastle.asn1.x509.Certificate certificate) throws java.io.IOException {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.ASN1EncodableVector();
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.certBag;
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.pkcs.CertBag(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.x509Certificate, new org.bouncycastle.asn1.DEROctetString(certificate.getEncoded()));
    }

    public PKCS12SafeBagBuilder(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo, org.bouncycastle.operator.OutputEncryptor outputEncryptor) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.ASN1EncodableVector();
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pkcs8ShroudedKeyBag;
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.pkcs.PKCS8EncryptedPrivateKeyInfoBuilder(privateKeyInfo).build(outputEncryptor).toASN1Structure();
    }

    public PKCS12SafeBagBuilder(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.ASN1EncodableVector();
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.keyBag;
        this.getHighSpeedVideoFpsRangesFor = privateKeyInfo;
    }
}
