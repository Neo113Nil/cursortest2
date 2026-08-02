package org.bouncycastle.cert;

/* loaded from: classes17.dex */
public class X509v3CertificateBuilder {
    private org.bouncycastle.asn1.x509.ExtensionsGenerator getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.x509.V3TBSCertificateGenerator getHighSpeedVideoSizes;

    public org.bouncycastle.cert.X509CertificateHolder build(org.bouncycastle.operator.ContentSigner contentSigner) {
        this.getHighSpeedVideoSizes.setSignature(contentSigner.getAlgorithmIdentifier());
        if (!this.getHighSpeedVideoFpsRangesFor.isEmpty()) {
            this.getHighSpeedVideoSizes.setExtensions(this.getHighSpeedVideoFpsRangesFor.generate());
        }
        try {
            org.bouncycastle.asn1.x509.TBSCertificate generateTBSCertificate = this.getHighSpeedVideoSizes.generateTBSCertificate();
            org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = contentSigner.getAlgorithmIdentifier();
            java.io.OutputStream outputStream = contentSigner.getOutputStream();
            generateTBSCertificate.encodeTo(outputStream, org.bouncycastle.asn1.ASN1Encoding.DER);
            outputStream.close();
            byte[] signature = contentSigner.getSignature();
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
            aSN1EncodableVector.add(generateTBSCertificate);
            aSN1EncodableVector.add(algorithmIdentifier);
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERBitString(signature));
            return new org.bouncycastle.cert.X509CertificateHolder(org.bouncycastle.asn1.x509.Certificate.getInstance(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector)));
        } catch (java.io.IOException unused) {
            throw new java.lang.IllegalArgumentException("cannot produce certificate signature");
        }
    }

    public org.bouncycastle.asn1.x509.Extension getExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.getHighSpeedVideoFpsRangesFor.generate().getExtension(aSN1ObjectIdentifier);
    }

    public boolean hasExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.getHighSpeedVideoFpsRangesFor.generate().getExtension(aSN1ObjectIdentifier) != null;
    }

    public org.bouncycastle.cert.X509v3CertificateBuilder setSubjectUniqueID(boolean[] zArr) {
        this.getHighSpeedVideoSizes.setSubjectUniqueID(getHighSpeedVideoSizes(zArr));
        return this;
    }

    public org.bouncycastle.cert.X509v3CertificateBuilder setIssuerUniqueID(boolean[] zArr) {
        this.getHighSpeedVideoSizes.setIssuerUniqueID(getHighSpeedVideoSizes(zArr));
        return this;
    }

    public org.bouncycastle.cert.X509v3CertificateBuilder replaceExtension(org.bouncycastle.asn1.x509.Extension extension) throws org.bouncycastle.cert.CertIOException {
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.cert.CertUtils.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor, extension);
        return this;
    }

    public org.bouncycastle.cert.X509v3CertificateBuilder replaceExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, byte[] bArr) throws org.bouncycastle.cert.CertIOException {
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.cert.CertUtils.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor, new org.bouncycastle.asn1.x509.Extension(aSN1ObjectIdentifier, z, bArr));
        return this;
    }

    public org.bouncycastle.cert.X509v3CertificateBuilder replaceExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) throws org.bouncycastle.cert.CertIOException {
        try {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.cert.CertUtils.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor, new org.bouncycastle.asn1.x509.Extension(aSN1ObjectIdentifier, z, aSN1Encodable.toASN1Primitive().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER)));
            return this;
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot encode extension: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cert.CertIOException(sb.toString(), e);
        }
    }

    public org.bouncycastle.cert.X509v3CertificateBuilder removeExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.cert.CertUtils.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, aSN1ObjectIdentifier);
        return this;
    }

    public org.bouncycastle.cert.X509v3CertificateBuilder copyAndAddExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) {
        org.bouncycastle.asn1.x509.Extension extension = x509CertificateHolder.toASN1Structure().getTBSCertificate().getExtensions().getExtension(aSN1ObjectIdentifier);
        if (extension != null) {
            this.getHighSpeedVideoFpsRangesFor.addExtension(aSN1ObjectIdentifier, z, extension.getExtnValue().getOctets());
            return this;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("extension ");
        sb.append(aSN1ObjectIdentifier);
        sb.append(" not present");
        throw new java.lang.NullPointerException(sb.toString());
    }

    public org.bouncycastle.cert.X509v3CertificateBuilder addExtension(org.bouncycastle.asn1.x509.Extension extension) throws org.bouncycastle.cert.CertIOException {
        this.getHighSpeedVideoFpsRangesFor.addExtension(extension);
        return this;
    }

    public org.bouncycastle.cert.X509v3CertificateBuilder addExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, byte[] bArr) throws org.bouncycastle.cert.CertIOException {
        this.getHighSpeedVideoFpsRangesFor.addExtension(aSN1ObjectIdentifier, z, bArr);
        return this;
    }

    public org.bouncycastle.cert.X509v3CertificateBuilder addExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) throws org.bouncycastle.cert.CertIOException {
        try {
            this.getHighSpeedVideoFpsRangesFor.addExtension(aSN1ObjectIdentifier, z, aSN1Encodable);
            return this;
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot encode extension: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cert.CertIOException(sb.toString(), e);
        }
    }

    private static org.bouncycastle.asn1.DERBitString getHighSpeedVideoSizes(boolean[] zArr) {
        byte[] bArr = new byte[(zArr.length + 7) / 8];
        for (int i = 0; i != zArr.length; i++) {
            int i2 = i / 8;
            bArr[i2] = (byte) (bArr[i2] | (zArr[i] ? 1 << (7 - (i % 8)) : 0));
        }
        int length = zArr.length % 8;
        return length == 0 ? new org.bouncycastle.asn1.DERBitString(bArr) : new org.bouncycastle.asn1.DERBitString(bArr, 8 - length);
    }

    public X509v3CertificateBuilder(org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) {
        org.bouncycastle.asn1.x509.V3TBSCertificateGenerator v3TBSCertificateGenerator = new org.bouncycastle.asn1.x509.V3TBSCertificateGenerator();
        this.getHighSpeedVideoSizes = v3TBSCertificateGenerator;
        v3TBSCertificateGenerator.setSerialNumber(new org.bouncycastle.asn1.ASN1Integer(x509CertificateHolder.getSerialNumber()));
        this.getHighSpeedVideoSizes.setIssuer(x509CertificateHolder.getIssuer());
        this.getHighSpeedVideoSizes.setStartDate(new org.bouncycastle.asn1.x509.Time(x509CertificateHolder.getNotBefore()));
        this.getHighSpeedVideoSizes.setEndDate(new org.bouncycastle.asn1.x509.Time(x509CertificateHolder.getNotAfter()));
        this.getHighSpeedVideoSizes.setSubject(x509CertificateHolder.getSubject());
        this.getHighSpeedVideoSizes.setSubjectPublicKeyInfo(x509CertificateHolder.getSubjectPublicKeyInfo());
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.x509.ExtensionsGenerator();
        org.bouncycastle.asn1.x509.Extensions extensions = x509CertificateHolder.getExtensions();
        java.util.Enumeration oids = extensions.oids();
        while (oids.hasMoreElements()) {
            this.getHighSpeedVideoFpsRangesFor.addExtension(extensions.getExtension((org.bouncycastle.asn1.ASN1ObjectIdentifier) oids.nextElement()));
        }
    }

    public X509v3CertificateBuilder(org.bouncycastle.asn1.x500.X500Name x500Name, java.math.BigInteger bigInteger, org.bouncycastle.asn1.x509.Time time, org.bouncycastle.asn1.x509.Time time2, org.bouncycastle.asn1.x500.X500Name x500Name2, org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) {
        org.bouncycastle.asn1.x509.V3TBSCertificateGenerator v3TBSCertificateGenerator = new org.bouncycastle.asn1.x509.V3TBSCertificateGenerator();
        this.getHighSpeedVideoSizes = v3TBSCertificateGenerator;
        v3TBSCertificateGenerator.setSerialNumber(new org.bouncycastle.asn1.ASN1Integer(bigInteger));
        this.getHighSpeedVideoSizes.setIssuer(x500Name);
        this.getHighSpeedVideoSizes.setStartDate(time);
        this.getHighSpeedVideoSizes.setEndDate(time2);
        this.getHighSpeedVideoSizes.setSubject(x500Name2);
        this.getHighSpeedVideoSizes.setSubjectPublicKeyInfo(subjectPublicKeyInfo);
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.x509.ExtensionsGenerator();
    }

    public X509v3CertificateBuilder(org.bouncycastle.asn1.x500.X500Name x500Name, java.math.BigInteger bigInteger, java.util.Date date, java.util.Date date2, org.bouncycastle.asn1.x500.X500Name x500Name2, org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this(x500Name, bigInteger, new org.bouncycastle.asn1.x509.Time(date), new org.bouncycastle.asn1.x509.Time(date2), x500Name2, subjectPublicKeyInfo);
    }

    public X509v3CertificateBuilder(org.bouncycastle.asn1.x500.X500Name x500Name, java.math.BigInteger bigInteger, java.util.Date date, java.util.Date date2, java.util.Locale locale, org.bouncycastle.asn1.x500.X500Name x500Name2, org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this(x500Name, bigInteger, new org.bouncycastle.asn1.x509.Time(date, locale), new org.bouncycastle.asn1.x509.Time(date2, locale), x500Name2, subjectPublicKeyInfo);
    }
}
