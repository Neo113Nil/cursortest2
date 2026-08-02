package org.bouncycastle.jcajce.provider.asymmetric.x509;

/* loaded from: classes17.dex */
public class CertificateFactory extends java.security.cert.CertificateFactorySpi {
    private static final org.bouncycastle.jcajce.provider.asymmetric.x509.PEMUtil Camera2StreamConfigurationMap = new org.bouncycastle.jcajce.provider.asymmetric.x509.PEMUtil(org.bouncycastle.openssl.PEMParser.TYPE_CERTIFICATE);
    private static final org.bouncycastle.jcajce.provider.asymmetric.x509.PEMUtil getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.asymmetric.x509.PEMUtil("CRL");
    private static final org.bouncycastle.jcajce.provider.asymmetric.x509.PEMUtil getHighSpeedVideoFpsRangesFor = new org.bouncycastle.jcajce.provider.asymmetric.x509.PEMUtil(org.bouncycastle.openssl.PEMParser.TYPE_PKCS7);
    private final org.bouncycastle.jcajce.util.JcaJceHelper getHighSpeedVideoFpsRanges = new org.bouncycastle.jcajce.util.BCJcaJceHelper();
    private org.bouncycastle.asn1.ASN1Set getInputSizeshNQ4ISI = null;
    private int getOutputFormats = 0;
    private java.io.InputStream getInputFormats = null;
    private org.bouncycastle.asn1.ASN1Set getHighSpeedVideoSizesFor = null;
    private int getOutputMinFrameDuration = 0;
    private java.io.InputStream getHighResolutionOutputSizeshNQ4ISI = null;

    private java.security.cert.CRL getHighResolutionOutputSizeshNQ4ISI(java.io.InputStream inputStream, boolean z) throws java.security.cert.CRLException {
        java.io.InputStream inputStream2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (inputStream2 == null || inputStream2 != inputStream) {
            this.getHighResolutionOutputSizeshNQ4ISI = inputStream;
            this.getHighSpeedVideoSizesFor = null;
            this.getOutputMinFrameDuration = 0;
        }
        try {
            org.bouncycastle.asn1.ASN1Set aSN1Set = this.getHighSpeedVideoSizesFor;
            if (aSN1Set != null) {
                if (this.getOutputMinFrameDuration != aSN1Set.size()) {
                    return getHighSpeedVideoFpsRangesFor();
                }
                this.getHighSpeedVideoSizesFor = null;
                this.getOutputMinFrameDuration = 0;
                return null;
            }
            if (!inputStream.markSupported()) {
                inputStream = new java.io.ByteArrayInputStream(org.bouncycastle.util.io.Streams.readAll(inputStream));
            }
            inputStream.mark(1);
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            inputStream.reset();
            return read != 48 ? getHighSpeedVideoFpsRanges(getHighSpeedVideoSizes.getHighSpeedVideoSizes(inputStream, z)) : getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.ASN1Sequence.getInstance(new org.bouncycastle.asn1.ASN1InputStream(inputStream, true).readObject()));
        } catch (java.security.cert.CRLException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            throw new java.security.cert.CRLException(e2.toString());
        }
    }

    private java.security.cert.Certificate Camera2StreamConfigurationMap(java.io.InputStream inputStream, boolean z) throws java.security.cert.CertificateException {
        java.io.InputStream inputStream2 = this.getInputFormats;
        if (inputStream2 == null || inputStream2 != inputStream) {
            this.getInputFormats = inputStream;
            this.getInputSizeshNQ4ISI = null;
            this.getOutputFormats = 0;
        }
        try {
            org.bouncycastle.asn1.ASN1Set aSN1Set = this.getInputSizeshNQ4ISI;
            if (aSN1Set != null) {
                if (this.getOutputFormats != aSN1Set.size()) {
                    return getHighSpeedVideoFpsRanges();
                }
                this.getInputSizeshNQ4ISI = null;
                this.getOutputFormats = 0;
                return null;
            }
            if (!inputStream.markSupported()) {
                inputStream = new java.io.ByteArrayInputStream(org.bouncycastle.util.io.Streams.readAll(inputStream));
            }
            inputStream.mark(1);
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            inputStream.reset();
            return read != 48 ? Camera2StreamConfigurationMap(Camera2StreamConfigurationMap.getHighSpeedVideoSizes(inputStream, z)) : Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Sequence.getInstance(new org.bouncycastle.asn1.ASN1InputStream(inputStream).readObject()));
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("parsing issue: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.jcajce.provider.asymmetric.x509.CertificateFactory.ExCertificateException(sb.toString(), e);
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public java.util.Iterator engineGetCertPathEncodings() {
        return org.bouncycastle.jcajce.provider.asymmetric.x509.PKIXCertPath.getHighSpeedVideoFpsRangesFor.iterator();
    }

    @Override // java.security.cert.CertificateFactorySpi
    public java.util.Collection engineGenerateCertificates(java.io.InputStream inputStream) throws java.security.cert.CertificateException {
        java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(inputStream);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            java.security.cert.Certificate Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(bufferedInputStream, arrayList.isEmpty());
            if (Camera2StreamConfigurationMap2 == null) {
                return arrayList;
            }
            arrayList.add(Camera2StreamConfigurationMap2);
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public java.security.cert.Certificate engineGenerateCertificate(java.io.InputStream inputStream) throws java.security.cert.CertificateException {
        return Camera2StreamConfigurationMap(inputStream, true);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public java.security.cert.CertPath engineGenerateCertPath(java.util.List list) throws java.security.cert.CertificateException {
        for (java.lang.Object obj : list) {
            if (obj != null && !(obj instanceof java.security.cert.X509Certificate)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("list contains non X509Certificate object while creating CertPath\n");
                sb.append(obj.toString());
                throw new java.security.cert.CertificateException(sb.toString());
            }
        }
        return new org.bouncycastle.jcajce.provider.asymmetric.x509.PKIXCertPath(list);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public java.security.cert.CertPath engineGenerateCertPath(java.io.InputStream inputStream, java.lang.String str) throws java.security.cert.CertificateException {
        return new org.bouncycastle.jcajce.provider.asymmetric.x509.PKIXCertPath(inputStream, str);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public java.security.cert.CertPath engineGenerateCertPath(java.io.InputStream inputStream) throws java.security.cert.CertificateException {
        return engineGenerateCertPath(inputStream, "PkiPath");
    }

    @Override // java.security.cert.CertificateFactorySpi
    public java.util.Collection engineGenerateCRLs(java.io.InputStream inputStream) throws java.security.cert.CRLException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(inputStream);
        while (true) {
            java.security.cert.CRL highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(bufferedInputStream, arrayList.isEmpty());
            if (highResolutionOutputSizeshNQ4ISI == null) {
                return arrayList;
            }
            arrayList.add(highResolutionOutputSizeshNQ4ISI);
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public java.security.cert.CRL engineGenerateCRL(java.io.InputStream inputStream) throws java.security.cert.CRLException {
        return getHighResolutionOutputSizeshNQ4ISI(inputStream, true);
    }

    protected java.security.cert.CRL createCRL(org.bouncycastle.asn1.x509.CertificateList certificateList) throws java.security.cert.CRLException {
        return new org.bouncycastle.jcajce.provider.asymmetric.x509.X509CRLObject(this.getHighSpeedVideoFpsRanges, certificateList);
    }

    private java.security.cert.Certificate Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) throws java.security.cert.CertificateParsingException {
        if (aSN1Sequence == null) {
            return null;
        }
        if (aSN1Sequence.size() <= 1 || !(aSN1Sequence.getObjectAt(0) instanceof org.bouncycastle.asn1.ASN1ObjectIdentifier) || !aSN1Sequence.getObjectAt(0).equals(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.signedData)) {
            return new org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateObject(this.getHighSpeedVideoFpsRanges, org.bouncycastle.asn1.x509.Certificate.getInstance(aSN1Sequence));
        }
        this.getInputSizeshNQ4ISI = org.bouncycastle.asn1.pkcs.SignedData.getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(1), true)).getCertificates();
        return getHighSpeedVideoFpsRanges();
    }

    private java.security.cert.Certificate getHighSpeedVideoFpsRanges() throws java.security.cert.CertificateParsingException {
        if (this.getInputSizeshNQ4ISI == null) {
            return null;
        }
        while (this.getOutputFormats < this.getInputSizeshNQ4ISI.size()) {
            org.bouncycastle.asn1.ASN1Set aSN1Set = this.getInputSizeshNQ4ISI;
            int i = this.getOutputFormats;
            this.getOutputFormats = i + 1;
            org.bouncycastle.asn1.ASN1Encodable objectAt = aSN1Set.getObjectAt(i);
            if (objectAt instanceof org.bouncycastle.asn1.ASN1Sequence) {
                return new org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateObject(this.getHighSpeedVideoFpsRanges, org.bouncycastle.asn1.x509.Certificate.getInstance(objectAt));
            }
        }
        return null;
    }

    private java.security.cert.CRL getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) throws java.security.cert.CRLException {
        if (aSN1Sequence == null) {
            return null;
        }
        if (aSN1Sequence.size() <= 1 || !(aSN1Sequence.getObjectAt(0) instanceof org.bouncycastle.asn1.ASN1ObjectIdentifier) || !aSN1Sequence.getObjectAt(0).equals(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.signedData)) {
            return createCRL(org.bouncycastle.asn1.x509.CertificateList.getInstance(aSN1Sequence));
        }
        this.getHighSpeedVideoSizesFor = org.bouncycastle.asn1.pkcs.SignedData.getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(1), true)).getCRLs();
        return getHighSpeedVideoFpsRangesFor();
    }

    class ExCertificateException extends java.security.cert.CertificateException {
        private java.lang.Throwable getHighSpeedVideoFpsRangesFor;

        @Override // java.lang.Throwable
        public java.lang.Throwable getCause() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public ExCertificateException(java.lang.String str, java.lang.Throwable th) {
            super(str);
            this.getHighSpeedVideoFpsRangesFor = th;
        }
    }

    private java.security.cert.CRL getHighSpeedVideoFpsRangesFor() throws java.security.cert.CRLException {
        org.bouncycastle.asn1.ASN1Set aSN1Set = this.getHighSpeedVideoSizesFor;
        if (aSN1Set == null || this.getOutputMinFrameDuration >= aSN1Set.size()) {
            return null;
        }
        org.bouncycastle.asn1.ASN1Set aSN1Set2 = this.getHighSpeedVideoSizesFor;
        int i = this.getOutputMinFrameDuration;
        this.getOutputMinFrameDuration = i + 1;
        return createCRL(org.bouncycastle.asn1.x509.CertificateList.getInstance(aSN1Set2.getObjectAt(i)));
    }
}
