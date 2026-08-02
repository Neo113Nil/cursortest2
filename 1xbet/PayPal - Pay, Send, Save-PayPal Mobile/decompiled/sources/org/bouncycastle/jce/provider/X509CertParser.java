package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
public class X509CertParser extends org.bouncycastle.x509.X509StreamParserSpi {
    private static final org.bouncycastle.jce.provider.PEMUtil Camera2StreamConfigurationMap = new org.bouncycastle.jce.provider.PEMUtil(org.bouncycastle.openssl.PEMParser.TYPE_CERTIFICATE);
    private org.bouncycastle.asn1.ASN1Set getHighSpeedVideoFpsRangesFor = null;
    private int getHighSpeedVideoFpsRanges = 0;
    private java.io.InputStream getHighResolutionOutputSizeshNQ4ISI = null;

    @Override // org.bouncycastle.x509.X509StreamParserSpi
    public java.lang.Object engineRead() throws org.bouncycastle.x509.util.StreamParsingException {
        try {
            org.bouncycastle.asn1.ASN1Set aSN1Set = this.getHighSpeedVideoFpsRangesFor;
            if (aSN1Set != null) {
                if (this.getHighSpeedVideoFpsRanges != aSN1Set.size()) {
                    return Camera2StreamConfigurationMap();
                }
                this.getHighSpeedVideoFpsRangesFor = null;
                this.getHighSpeedVideoFpsRanges = 0;
                return null;
            }
            this.getHighResolutionOutputSizeshNQ4ISI.mark(10);
            int read = this.getHighResolutionOutputSizeshNQ4ISI.read();
            if (read == -1) {
                return null;
            }
            if (read != 48) {
                this.getHighResolutionOutputSizeshNQ4ISI.reset();
                org.bouncycastle.asn1.ASN1Sequence highSpeedVideoSizes = Camera2StreamConfigurationMap.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI);
                if (highSpeedVideoSizes != null) {
                    return new org.bouncycastle.jce.provider.X509CertificateObject(org.bouncycastle.asn1.x509.Certificate.getInstance(highSpeedVideoSizes));
                }
                return null;
            }
            this.getHighResolutionOutputSizeshNQ4ISI.reset();
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = (org.bouncycastle.asn1.ASN1Sequence) new org.bouncycastle.asn1.ASN1InputStream(this.getHighResolutionOutputSizeshNQ4ISI).readObject();
            if (aSN1Sequence.size() <= 1 || !(aSN1Sequence.getObjectAt(0) instanceof org.bouncycastle.asn1.ASN1ObjectIdentifier) || !aSN1Sequence.getObjectAt(0).equals(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.signedData)) {
                return new org.bouncycastle.jce.provider.X509CertificateObject(org.bouncycastle.asn1.x509.Certificate.getInstance(aSN1Sequence));
            }
            this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.pkcs.SignedData(org.bouncycastle.asn1.ASN1Sequence.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(1), true)).getCertificates();
            return Camera2StreamConfigurationMap();
        } catch (java.lang.Exception e) {
            throw new org.bouncycastle.x509.util.StreamParsingException(e.toString(), e);
        }
    }

    @Override // org.bouncycastle.x509.X509StreamParserSpi
    public java.util.Collection engineReadAll() throws org.bouncycastle.x509.util.StreamParsingException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            java.security.cert.Certificate certificate = (java.security.cert.Certificate) engineRead();
            if (certificate == null) {
                return arrayList;
            }
            arrayList.add(certificate);
        }
    }

    @Override // org.bouncycastle.x509.X509StreamParserSpi
    public void engineInit(java.io.InputStream inputStream) {
        this.getHighResolutionOutputSizeshNQ4ISI = inputStream;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoFpsRanges = 0;
        if (inputStream.markSupported()) {
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = new java.io.BufferedInputStream(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    private java.security.cert.Certificate Camera2StreamConfigurationMap() throws java.security.cert.CertificateParsingException {
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            return null;
        }
        while (this.getHighSpeedVideoFpsRanges < this.getHighSpeedVideoFpsRangesFor.size()) {
            org.bouncycastle.asn1.ASN1Set aSN1Set = this.getHighSpeedVideoFpsRangesFor;
            int i = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = i + 1;
            org.bouncycastle.asn1.ASN1Encodable objectAt = aSN1Set.getObjectAt(i);
            if (objectAt instanceof org.bouncycastle.asn1.ASN1Sequence) {
                return new org.bouncycastle.jce.provider.X509CertificateObject(org.bouncycastle.asn1.x509.Certificate.getInstance(objectAt));
            }
        }
        return null;
    }
}
