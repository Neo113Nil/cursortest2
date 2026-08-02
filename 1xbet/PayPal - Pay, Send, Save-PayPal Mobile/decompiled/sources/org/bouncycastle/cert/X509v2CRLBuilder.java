package org.bouncycastle.cert;

/* loaded from: classes17.dex */
public class X509v2CRLBuilder {
    private org.bouncycastle.asn1.x509.V2TBSCertListGenerator Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.x509.ExtensionsGenerator getHighSpeedVideoFpsRangesFor;

    public org.bouncycastle.asn1.x509.Extension getExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.getHighSpeedVideoFpsRangesFor.generate().getExtension(aSN1ObjectIdentifier);
    }

    public boolean hasExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.getHighSpeedVideoFpsRangesFor.generate().getExtension(aSN1ObjectIdentifier) != null;
    }

    public org.bouncycastle.cert.X509v2CRLBuilder setNextUpdate(org.bouncycastle.asn1.x509.Time time) {
        this.Camera2StreamConfigurationMap.setNextUpdate(time);
        return this;
    }

    public org.bouncycastle.cert.X509v2CRLBuilder setNextUpdate(java.util.Date date, java.util.Locale locale) {
        return setNextUpdate(new org.bouncycastle.asn1.x509.Time(date, locale));
    }

    public org.bouncycastle.cert.X509v2CRLBuilder setNextUpdate(java.util.Date date) {
        return setNextUpdate(new org.bouncycastle.asn1.x509.Time(date));
    }

    public org.bouncycastle.cert.X509v2CRLBuilder replaceExtension(org.bouncycastle.asn1.x509.Extension extension) throws org.bouncycastle.cert.CertIOException {
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.cert.CertUtils.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor, extension);
        return this;
    }

    public org.bouncycastle.cert.X509v2CRLBuilder replaceExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, byte[] bArr) throws org.bouncycastle.cert.CertIOException {
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.cert.CertUtils.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor, new org.bouncycastle.asn1.x509.Extension(aSN1ObjectIdentifier, z, bArr));
        return this;
    }

    public org.bouncycastle.cert.X509v2CRLBuilder replaceExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) throws org.bouncycastle.cert.CertIOException {
        try {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.cert.CertUtils.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor, new org.bouncycastle.asn1.x509.Extension(aSN1ObjectIdentifier, z, aSN1Encodable.toASN1Primitive().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER)));
            return this;
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot encode extension: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cert.CertIOException(sb.toString(), e);
        }
    }

    public org.bouncycastle.cert.X509v2CRLBuilder removeExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.cert.CertUtils.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, aSN1ObjectIdentifier);
        return this;
    }

    public org.bouncycastle.cert.X509CRLHolder build(org.bouncycastle.operator.ContentSigner contentSigner) {
        this.Camera2StreamConfigurationMap.setSignature(contentSigner.getAlgorithmIdentifier());
        if (!this.getHighSpeedVideoFpsRangesFor.isEmpty()) {
            this.Camera2StreamConfigurationMap.setExtensions(this.getHighSpeedVideoFpsRangesFor.generate());
        }
        return org.bouncycastle.cert.CertUtils.getHighSpeedVideoSizes(contentSigner, this.Camera2StreamConfigurationMap.generateTBSCertList());
    }

    public org.bouncycastle.cert.X509v2CRLBuilder addExtension(org.bouncycastle.asn1.x509.Extension extension) throws org.bouncycastle.cert.CertIOException {
        this.getHighSpeedVideoFpsRangesFor.addExtension(extension);
        return this;
    }

    public org.bouncycastle.cert.X509v2CRLBuilder addExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, byte[] bArr) throws org.bouncycastle.cert.CertIOException {
        this.getHighSpeedVideoFpsRangesFor.addExtension(aSN1ObjectIdentifier, z, bArr);
        return this;
    }

    public org.bouncycastle.cert.X509v2CRLBuilder addExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) throws org.bouncycastle.cert.CertIOException {
        org.bouncycastle.cert.CertUtils.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor, aSN1ObjectIdentifier, z, aSN1Encodable);
        return this;
    }

    public org.bouncycastle.cert.X509v2CRLBuilder addCRLEntry(java.math.BigInteger bigInteger, java.util.Date date, org.bouncycastle.asn1.x509.Extensions extensions) {
        this.Camera2StreamConfigurationMap.addCRLEntry(new org.bouncycastle.asn1.ASN1Integer(bigInteger), new org.bouncycastle.asn1.x509.Time(date), extensions);
        return this;
    }

    public org.bouncycastle.cert.X509v2CRLBuilder addCRLEntry(java.math.BigInteger bigInteger, java.util.Date date, int i, java.util.Date date2) {
        this.Camera2StreamConfigurationMap.addCRLEntry(new org.bouncycastle.asn1.ASN1Integer(bigInteger), new org.bouncycastle.asn1.x509.Time(date), i, new org.bouncycastle.asn1.ASN1GeneralizedTime(date2));
        return this;
    }

    public org.bouncycastle.cert.X509v2CRLBuilder addCRLEntry(java.math.BigInteger bigInteger, java.util.Date date, int i) {
        this.Camera2StreamConfigurationMap.addCRLEntry(new org.bouncycastle.asn1.ASN1Integer(bigInteger), new org.bouncycastle.asn1.x509.Time(date), i);
        return this;
    }

    public org.bouncycastle.cert.X509v2CRLBuilder addCRL(org.bouncycastle.cert.X509CRLHolder x509CRLHolder) {
        org.bouncycastle.asn1.x509.TBSCertList tBSCertList = x509CRLHolder.toASN1Structure().getTBSCertList();
        if (tBSCertList != null) {
            java.util.Enumeration revokedCertificateEnumeration = tBSCertList.getRevokedCertificateEnumeration();
            while (revokedCertificateEnumeration.hasMoreElements()) {
                this.Camera2StreamConfigurationMap.addCRLEntry(org.bouncycastle.asn1.ASN1Sequence.getInstance(((org.bouncycastle.asn1.ASN1Encodable) revokedCertificateEnumeration.nextElement()).toASN1Primitive()));
            }
        }
        return this;
    }

    public X509v2CRLBuilder(org.bouncycastle.cert.X509CRLHolder x509CRLHolder) {
        org.bouncycastle.asn1.x509.V2TBSCertListGenerator v2TBSCertListGenerator = new org.bouncycastle.asn1.x509.V2TBSCertListGenerator();
        this.Camera2StreamConfigurationMap = v2TBSCertListGenerator;
        v2TBSCertListGenerator.setIssuer(x509CRLHolder.getIssuer());
        this.Camera2StreamConfigurationMap.setThisUpdate(new org.bouncycastle.asn1.x509.Time(x509CRLHolder.getThisUpdate()));
        java.util.Date nextUpdate = x509CRLHolder.getNextUpdate();
        if (nextUpdate != null) {
            this.Camera2StreamConfigurationMap.setNextUpdate(new org.bouncycastle.asn1.x509.Time(nextUpdate));
        }
        addCRL(x509CRLHolder);
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.x509.ExtensionsGenerator();
        org.bouncycastle.asn1.x509.Extensions extensions = x509CRLHolder.getExtensions();
        if (extensions != null) {
            java.util.Enumeration oids = extensions.oids();
            while (oids.hasMoreElements()) {
                this.getHighSpeedVideoFpsRangesFor.addExtension(extensions.getExtension((org.bouncycastle.asn1.ASN1ObjectIdentifier) oids.nextElement()));
            }
        }
    }

    public X509v2CRLBuilder(org.bouncycastle.asn1.x500.X500Name x500Name, org.bouncycastle.asn1.x509.Time time) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.x509.V2TBSCertListGenerator();
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.x509.ExtensionsGenerator();
        this.Camera2StreamConfigurationMap.setIssuer(x500Name);
        this.Camera2StreamConfigurationMap.setThisUpdate(time);
    }

    public X509v2CRLBuilder(org.bouncycastle.asn1.x500.X500Name x500Name, java.util.Date date, java.util.Locale locale) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.x509.V2TBSCertListGenerator();
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.x509.ExtensionsGenerator();
        this.Camera2StreamConfigurationMap.setIssuer(x500Name);
        this.Camera2StreamConfigurationMap.setThisUpdate(new org.bouncycastle.asn1.x509.Time(date, locale));
    }

    public X509v2CRLBuilder(org.bouncycastle.asn1.x500.X500Name x500Name, java.util.Date date) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.x509.V2TBSCertListGenerator();
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.x509.ExtensionsGenerator();
        this.Camera2StreamConfigurationMap.setIssuer(x500Name);
        this.Camera2StreamConfigurationMap.setThisUpdate(new org.bouncycastle.asn1.x509.Time(date));
    }
}
