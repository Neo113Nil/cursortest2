package org.bouncycastle.cert;

/* loaded from: classes17.dex */
public class X509v2AttributeCertificateBuilder {
    private org.bouncycastle.asn1.x509.ExtensionsGenerator Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.x509.V2AttributeCertificateInfoGenerator getHighSpeedVideoFpsRangesFor;

    public org.bouncycastle.asn1.x509.Extension getExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.Camera2StreamConfigurationMap.generate().getExtension(aSN1ObjectIdentifier);
    }

    public boolean hasExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.Camera2StreamConfigurationMap.generate().getExtension(aSN1ObjectIdentifier) != null;
    }

    public void setIssuerUniqueId(boolean[] zArr) {
        this.getHighSpeedVideoFpsRangesFor.setIssuerUniqueID(org.bouncycastle.cert.CertUtils.getHighSpeedVideoSizes(zArr));
    }

    public org.bouncycastle.cert.X509v2AttributeCertificateBuilder replaceExtension(org.bouncycastle.asn1.x509.Extension extension) throws org.bouncycastle.cert.CertIOException {
        this.Camera2StreamConfigurationMap = org.bouncycastle.cert.CertUtils.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap, extension);
        return this;
    }

    public org.bouncycastle.cert.X509v2AttributeCertificateBuilder replaceExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, byte[] bArr) throws org.bouncycastle.cert.CertIOException {
        this.Camera2StreamConfigurationMap = org.bouncycastle.cert.CertUtils.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap, new org.bouncycastle.asn1.x509.Extension(aSN1ObjectIdentifier, z, bArr));
        return this;
    }

    public org.bouncycastle.cert.X509v2AttributeCertificateBuilder replaceExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) throws org.bouncycastle.cert.CertIOException {
        try {
            this.Camera2StreamConfigurationMap = org.bouncycastle.cert.CertUtils.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap, new org.bouncycastle.asn1.x509.Extension(aSN1ObjectIdentifier, z, aSN1Encodable.toASN1Primitive().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER)));
            return this;
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot encode extension: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cert.CertIOException(sb.toString(), e);
        }
    }

    public org.bouncycastle.cert.X509v2AttributeCertificateBuilder removeExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.Camera2StreamConfigurationMap = org.bouncycastle.cert.CertUtils.getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap, aSN1ObjectIdentifier);
        return this;
    }

    public org.bouncycastle.cert.X509AttributeCertificateHolder build(org.bouncycastle.operator.ContentSigner contentSigner) {
        this.getHighSpeedVideoFpsRangesFor.setSignature(contentSigner.getAlgorithmIdentifier());
        if (!this.Camera2StreamConfigurationMap.isEmpty()) {
            this.getHighSpeedVideoFpsRangesFor.setExtensions(this.Camera2StreamConfigurationMap.generate());
        }
        return org.bouncycastle.cert.CertUtils.Camera2StreamConfigurationMap(contentSigner, this.getHighSpeedVideoFpsRangesFor.generateAttributeCertificateInfo());
    }

    public org.bouncycastle.cert.X509v2AttributeCertificateBuilder addExtension(org.bouncycastle.asn1.x509.Extension extension) throws org.bouncycastle.cert.CertIOException {
        this.Camera2StreamConfigurationMap.addExtension(extension);
        return this;
    }

    public org.bouncycastle.cert.X509v2AttributeCertificateBuilder addExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, byte[] bArr) throws org.bouncycastle.cert.CertIOException {
        this.Camera2StreamConfigurationMap.addExtension(aSN1ObjectIdentifier, z, bArr);
        return this;
    }

    public org.bouncycastle.cert.X509v2AttributeCertificateBuilder addExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) throws org.bouncycastle.cert.CertIOException {
        org.bouncycastle.cert.CertUtils.getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap, aSN1ObjectIdentifier, z, aSN1Encodable);
        return this;
    }

    public org.bouncycastle.cert.X509v2AttributeCertificateBuilder addAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable[] aSN1EncodableArr) {
        this.getHighSpeedVideoFpsRangesFor.addAttribute(new org.bouncycastle.asn1.x509.Attribute(aSN1ObjectIdentifier, new org.bouncycastle.asn1.DERSet(aSN1EncodableArr)));
        return this;
    }

    public org.bouncycastle.cert.X509v2AttributeCertificateBuilder addAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighSpeedVideoFpsRangesFor.addAttribute(new org.bouncycastle.asn1.x509.Attribute(aSN1ObjectIdentifier, new org.bouncycastle.asn1.DERSet(aSN1Encodable)));
        return this;
    }

    public X509v2AttributeCertificateBuilder(org.bouncycastle.cert.X509AttributeCertificateHolder x509AttributeCertificateHolder) {
        org.bouncycastle.asn1.x509.V2AttributeCertificateInfoGenerator v2AttributeCertificateInfoGenerator = new org.bouncycastle.asn1.x509.V2AttributeCertificateInfoGenerator();
        this.getHighSpeedVideoFpsRangesFor = v2AttributeCertificateInfoGenerator;
        v2AttributeCertificateInfoGenerator.setSerialNumber(new org.bouncycastle.asn1.ASN1Integer(x509AttributeCertificateHolder.getSerialNumber()));
        this.getHighSpeedVideoFpsRangesFor.setIssuer(org.bouncycastle.asn1.x509.AttCertIssuer.getInstance(x509AttributeCertificateHolder.getIssuer().getHighSpeedVideoFpsRangesFor));
        this.getHighSpeedVideoFpsRangesFor.setStartDate(new org.bouncycastle.asn1.ASN1GeneralizedTime(x509AttributeCertificateHolder.getNotBefore()));
        this.getHighSpeedVideoFpsRangesFor.setEndDate(new org.bouncycastle.asn1.ASN1GeneralizedTime(x509AttributeCertificateHolder.getNotAfter()));
        this.getHighSpeedVideoFpsRangesFor.setHolder(x509AttributeCertificateHolder.getHolder().getHighResolutionOutputSizeshNQ4ISI);
        boolean[] issuerUniqueID = x509AttributeCertificateHolder.getIssuerUniqueID();
        if (issuerUniqueID != null) {
            this.getHighSpeedVideoFpsRangesFor.setIssuerUniqueID(org.bouncycastle.cert.CertUtils.getHighSpeedVideoSizes(issuerUniqueID));
        }
        org.bouncycastle.asn1.x509.Attribute[] attributes = x509AttributeCertificateHolder.getAttributes();
        for (int i = 0; i != attributes.length; i++) {
            this.getHighSpeedVideoFpsRangesFor.addAttribute(attributes[i]);
        }
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.x509.ExtensionsGenerator();
        org.bouncycastle.asn1.x509.Extensions extensions = x509AttributeCertificateHolder.getExtensions();
        java.util.Enumeration oids = extensions.oids();
        while (oids.hasMoreElements()) {
            this.Camera2StreamConfigurationMap.addExtension(extensions.getExtension((org.bouncycastle.asn1.ASN1ObjectIdentifier) oids.nextElement()));
        }
    }

    public X509v2AttributeCertificateBuilder(org.bouncycastle.cert.AttributeCertificateHolder attributeCertificateHolder, org.bouncycastle.cert.AttributeCertificateIssuer attributeCertificateIssuer, java.math.BigInteger bigInteger, java.util.Date date, java.util.Date date2, java.util.Locale locale) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.x509.V2AttributeCertificateInfoGenerator();
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.x509.ExtensionsGenerator();
        this.getHighSpeedVideoFpsRangesFor.setHolder(attributeCertificateHolder.getHighResolutionOutputSizeshNQ4ISI);
        this.getHighSpeedVideoFpsRangesFor.setIssuer(org.bouncycastle.asn1.x509.AttCertIssuer.getInstance(attributeCertificateIssuer.getHighSpeedVideoFpsRangesFor));
        this.getHighSpeedVideoFpsRangesFor.setSerialNumber(new org.bouncycastle.asn1.ASN1Integer(bigInteger));
        this.getHighSpeedVideoFpsRangesFor.setStartDate(new org.bouncycastle.asn1.ASN1GeneralizedTime(date, locale));
        this.getHighSpeedVideoFpsRangesFor.setEndDate(new org.bouncycastle.asn1.ASN1GeneralizedTime(date2, locale));
    }

    public X509v2AttributeCertificateBuilder(org.bouncycastle.cert.AttributeCertificateHolder attributeCertificateHolder, org.bouncycastle.cert.AttributeCertificateIssuer attributeCertificateIssuer, java.math.BigInteger bigInteger, java.util.Date date, java.util.Date date2) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.x509.V2AttributeCertificateInfoGenerator();
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.x509.ExtensionsGenerator();
        this.getHighSpeedVideoFpsRangesFor.setHolder(attributeCertificateHolder.getHighResolutionOutputSizeshNQ4ISI);
        this.getHighSpeedVideoFpsRangesFor.setIssuer(org.bouncycastle.asn1.x509.AttCertIssuer.getInstance(attributeCertificateIssuer.getHighSpeedVideoFpsRangesFor));
        this.getHighSpeedVideoFpsRangesFor.setSerialNumber(new org.bouncycastle.asn1.ASN1Integer(bigInteger));
        this.getHighSpeedVideoFpsRangesFor.setStartDate(new org.bouncycastle.asn1.ASN1GeneralizedTime(date));
        this.getHighSpeedVideoFpsRangesFor.setEndDate(new org.bouncycastle.asn1.ASN1GeneralizedTime(date2));
    }
}
