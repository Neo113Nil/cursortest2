package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
public class X509CRLParser extends org.bouncycastle.x509.X509StreamParserSpi {
    private static final org.bouncycastle.jce.provider.PEMUtil Camera2StreamConfigurationMap = new org.bouncycastle.jce.provider.PEMUtil("CRL");
    private org.bouncycastle.asn1.ASN1Set getHighSpeedVideoFpsRangesFor = null;
    private int getHighSpeedVideoSizes = 0;
    private java.io.InputStream getHighSpeedVideoFpsRanges = null;

    @Override // org.bouncycastle.x509.X509StreamParserSpi
    public java.lang.Object engineRead() throws org.bouncycastle.x509.util.StreamParsingException {
        try {
            org.bouncycastle.asn1.ASN1Set aSN1Set = this.getHighSpeedVideoFpsRangesFor;
            if (aSN1Set != null) {
                if (this.getHighSpeedVideoSizes != aSN1Set.size()) {
                    return getHighResolutionOutputSizeshNQ4ISI();
                }
                this.getHighSpeedVideoFpsRangesFor = null;
                this.getHighSpeedVideoSizes = 0;
                return null;
            }
            this.getHighSpeedVideoFpsRanges.mark(10);
            int read = this.getHighSpeedVideoFpsRanges.read();
            if (read == -1) {
                return null;
            }
            if (read != 48) {
                this.getHighSpeedVideoFpsRanges.reset();
                org.bouncycastle.asn1.ASN1Sequence highSpeedVideoSizes = Camera2StreamConfigurationMap.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges);
                if (highSpeedVideoSizes != null) {
                    return new org.bouncycastle.jce.provider.X509CRLObject(org.bouncycastle.asn1.x509.CertificateList.getInstance(highSpeedVideoSizes));
                }
                return null;
            }
            this.getHighSpeedVideoFpsRanges.reset();
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = (org.bouncycastle.asn1.ASN1Sequence) new org.bouncycastle.asn1.ASN1InputStream(this.getHighSpeedVideoFpsRanges).readObject();
            if (aSN1Sequence.size() <= 1 || !(aSN1Sequence.getObjectAt(0) instanceof org.bouncycastle.asn1.ASN1ObjectIdentifier) || !aSN1Sequence.getObjectAt(0).equals(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.signedData)) {
                return new org.bouncycastle.jce.provider.X509CRLObject(org.bouncycastle.asn1.x509.CertificateList.getInstance(aSN1Sequence));
            }
            this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.pkcs.SignedData(org.bouncycastle.asn1.ASN1Sequence.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(1), true)).getCRLs();
            return getHighResolutionOutputSizeshNQ4ISI();
        } catch (java.lang.Exception e) {
            throw new org.bouncycastle.x509.util.StreamParsingException(e.toString(), e);
        }
    }

    @Override // org.bouncycastle.x509.X509StreamParserSpi
    public java.util.Collection engineReadAll() throws org.bouncycastle.x509.util.StreamParsingException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            java.security.cert.CRL crl = (java.security.cert.CRL) engineRead();
            if (crl == null) {
                return arrayList;
            }
            arrayList.add(crl);
        }
    }

    @Override // org.bouncycastle.x509.X509StreamParserSpi
    public void engineInit(java.io.InputStream inputStream) {
        this.getHighSpeedVideoFpsRanges = inputStream;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoSizes = 0;
        if (inputStream.markSupported()) {
            return;
        }
        this.getHighSpeedVideoFpsRanges = new java.io.BufferedInputStream(this.getHighSpeedVideoFpsRanges);
    }

    private java.security.cert.CRL getHighResolutionOutputSizeshNQ4ISI() throws java.security.cert.CRLException {
        org.bouncycastle.asn1.ASN1Set aSN1Set = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1Set == null || this.getHighSpeedVideoSizes >= aSN1Set.size()) {
            return null;
        }
        org.bouncycastle.asn1.ASN1Set aSN1Set2 = this.getHighSpeedVideoFpsRangesFor;
        int i = this.getHighSpeedVideoSizes;
        this.getHighSpeedVideoSizes = i + 1;
        return new org.bouncycastle.jce.provider.X509CRLObject(org.bouncycastle.asn1.x509.CertificateList.getInstance(aSN1Set2.getObjectAt(i)));
    }
}
