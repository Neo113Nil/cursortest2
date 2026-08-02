package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
public class X509CertPairParser extends org.bouncycastle.x509.X509StreamParserSpi {
    private java.io.InputStream Camera2StreamConfigurationMap = null;

    @Override // org.bouncycastle.x509.X509StreamParserSpi
    public java.lang.Object engineRead() throws org.bouncycastle.x509.util.StreamParsingException {
        try {
            this.Camera2StreamConfigurationMap.mark(10);
            if (this.Camera2StreamConfigurationMap.read() == -1) {
                return null;
            }
            this.Camera2StreamConfigurationMap.reset();
            return new org.bouncycastle.x509.X509CertificatePair(org.bouncycastle.asn1.x509.CertificatePair.getInstance((org.bouncycastle.asn1.ASN1Sequence) new org.bouncycastle.asn1.ASN1InputStream(this.Camera2StreamConfigurationMap).readObject()));
        } catch (java.lang.Exception e) {
            throw new org.bouncycastle.x509.util.StreamParsingException(e.toString(), e);
        }
    }

    @Override // org.bouncycastle.x509.X509StreamParserSpi
    public java.util.Collection engineReadAll() throws org.bouncycastle.x509.util.StreamParsingException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            org.bouncycastle.x509.X509CertificatePair x509CertificatePair = (org.bouncycastle.x509.X509CertificatePair) engineRead();
            if (x509CertificatePair == null) {
                return arrayList;
            }
            arrayList.add(x509CertificatePair);
        }
    }

    @Override // org.bouncycastle.x509.X509StreamParserSpi
    public void engineInit(java.io.InputStream inputStream) {
        this.Camera2StreamConfigurationMap = inputStream;
        if (inputStream.markSupported()) {
            return;
        }
        this.Camera2StreamConfigurationMap = new java.io.BufferedInputStream(this.Camera2StreamConfigurationMap);
    }
}
