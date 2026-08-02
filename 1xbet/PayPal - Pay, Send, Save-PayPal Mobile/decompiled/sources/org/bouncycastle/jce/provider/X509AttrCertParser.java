package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
public class X509AttrCertParser extends org.bouncycastle.x509.X509StreamParserSpi {
    private static final org.bouncycastle.jce.provider.PEMUtil getHighSpeedVideoFpsRangesFor = new org.bouncycastle.jce.provider.PEMUtil(org.bouncycastle.openssl.PEMParser.TYPE_ATTRIBUTE_CERTIFICATE);
    private org.bouncycastle.asn1.ASN1Set Camera2StreamConfigurationMap = null;
    private int getHighSpeedVideoSizes = 0;
    private java.io.InputStream getHighResolutionOutputSizeshNQ4ISI = null;

    @Override // org.bouncycastle.x509.X509StreamParserSpi
    public java.lang.Object engineRead() throws org.bouncycastle.x509.util.StreamParsingException {
        try {
            org.bouncycastle.asn1.ASN1Set aSN1Set = this.Camera2StreamConfigurationMap;
            if (aSN1Set != null) {
                if (this.getHighSpeedVideoSizes != aSN1Set.size()) {
                    return getHighResolutionOutputSizeshNQ4ISI();
                }
                this.Camera2StreamConfigurationMap = null;
                this.getHighSpeedVideoSizes = 0;
                return null;
            }
            this.getHighResolutionOutputSizeshNQ4ISI.mark(10);
            int read = this.getHighResolutionOutputSizeshNQ4ISI.read();
            if (read == -1) {
                return null;
            }
            if (read != 48) {
                this.getHighResolutionOutputSizeshNQ4ISI.reset();
                org.bouncycastle.asn1.ASN1Sequence highSpeedVideoSizes = getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI);
                if (highSpeedVideoSizes != null) {
                    return new org.bouncycastle.x509.X509V2AttributeCertificate(highSpeedVideoSizes.getEncoded());
                }
                return null;
            }
            this.getHighResolutionOutputSizeshNQ4ISI.reset();
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(new org.bouncycastle.asn1.ASN1InputStream(this.getHighResolutionOutputSizeshNQ4ISI).readObject());
            if (aSN1Sequence.size() <= 1 || !(aSN1Sequence.getObjectAt(0) instanceof org.bouncycastle.asn1.ASN1ObjectIdentifier) || !aSN1Sequence.getObjectAt(0).equals(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.signedData)) {
                return new org.bouncycastle.x509.X509V2AttributeCertificate(aSN1Sequence.getEncoded());
            }
            this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.pkcs.SignedData(org.bouncycastle.asn1.ASN1Sequence.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(1), true)).getCertificates();
            return getHighResolutionOutputSizeshNQ4ISI();
        } catch (java.lang.Exception e) {
            throw new org.bouncycastle.x509.util.StreamParsingException(e.toString(), e);
        }
    }

    @Override // org.bouncycastle.x509.X509StreamParserSpi
    public java.util.Collection engineReadAll() throws org.bouncycastle.x509.util.StreamParsingException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            org.bouncycastle.x509.X509AttributeCertificate x509AttributeCertificate = (org.bouncycastle.x509.X509AttributeCertificate) engineRead();
            if (x509AttributeCertificate == null) {
                return arrayList;
            }
            arrayList.add(x509AttributeCertificate);
        }
    }

    @Override // org.bouncycastle.x509.X509StreamParserSpi
    public void engineInit(java.io.InputStream inputStream) {
        this.getHighResolutionOutputSizeshNQ4ISI = inputStream;
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoSizes = 0;
        if (inputStream.markSupported()) {
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = new java.io.BufferedInputStream(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    private org.bouncycastle.x509.X509AttributeCertificate getHighResolutionOutputSizeshNQ4ISI() throws java.io.IOException {
        if (this.Camera2StreamConfigurationMap == null) {
            return null;
        }
        while (this.getHighSpeedVideoSizes < this.Camera2StreamConfigurationMap.size()) {
            org.bouncycastle.asn1.ASN1Set aSN1Set = this.Camera2StreamConfigurationMap;
            int i = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = i + 1;
            org.bouncycastle.asn1.ASN1Encodable objectAt = aSN1Set.getObjectAt(i);
            if (objectAt instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
                org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) objectAt;
                if (aSN1TaggedObject.getTagNo() == 2) {
                    return new org.bouncycastle.x509.X509V2AttributeCertificate(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, false).getEncoded());
                }
            }
        }
        return null;
    }
}
