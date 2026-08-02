package org.bouncycastle.x509;

/* loaded from: classes17.dex */
public class X509CertificatePair {
    private final org.bouncycastle.jcajce.util.JcaJceHelper Camera2StreamConfigurationMap = new org.bouncycastle.jcajce.util.BCJcaJceHelper();
    private java.security.cert.X509Certificate getHighSpeedVideoFpsRanges;
    private java.security.cert.X509Certificate getHighSpeedVideoSizes;

    public int hashCode() {
        java.security.cert.X509Certificate x509Certificate = this.getHighSpeedVideoSizes;
        int hashCode = x509Certificate != null ? (-1) ^ x509Certificate.hashCode() : -1;
        java.security.cert.X509Certificate x509Certificate2 = this.getHighSpeedVideoFpsRanges;
        return x509Certificate2 != null ? x509Certificate2.hashCode() ^ (hashCode * 17) : hashCode;
    }

    public java.security.cert.X509Certificate getReverse() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.security.cert.X509Certificate getForward() {
        return this.getHighSpeedVideoSizes;
    }

    public byte[] getEncoded() throws java.security.cert.CertificateEncodingException {
        org.bouncycastle.asn1.x509.Certificate certificate;
        try {
            org.bouncycastle.asn1.x509.Certificate certificate2 = null;
            if (this.getHighSpeedVideoSizes != null) {
                certificate = org.bouncycastle.asn1.x509.Certificate.getInstance(new org.bouncycastle.asn1.ASN1InputStream(this.getHighSpeedVideoSizes.getEncoded()).readObject());
                if (certificate == null) {
                    throw new java.security.cert.CertificateEncodingException("unable to get encoding for forward");
                }
            } else {
                certificate = null;
            }
            if (this.getHighSpeedVideoFpsRanges != null && (certificate2 = org.bouncycastle.asn1.x509.Certificate.getInstance(new org.bouncycastle.asn1.ASN1InputStream(this.getHighSpeedVideoFpsRanges.getEncoded()).readObject())) == null) {
                throw new java.security.cert.CertificateEncodingException("unable to get encoding for reverse");
            }
            return new org.bouncycastle.asn1.x509.CertificatePair(certificate, certificate2).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        } catch (java.io.IOException e) {
            throw new org.bouncycastle.x509.ExtCertificateEncodingException(e.toString(), e);
        } catch (java.lang.IllegalArgumentException e2) {
            throw new org.bouncycastle.x509.ExtCertificateEncodingException(e2.toString(), e2);
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof org.bouncycastle.x509.X509CertificatePair)) {
            return false;
        }
        org.bouncycastle.x509.X509CertificatePair x509CertificatePair = (org.bouncycastle.x509.X509CertificatePair) obj;
        java.security.cert.X509Certificate x509Certificate = this.getHighSpeedVideoSizes;
        boolean equals = x509Certificate != null ? x509Certificate.equals(x509CertificatePair.getHighSpeedVideoSizes) : x509CertificatePair.getHighSpeedVideoSizes == null;
        java.security.cert.X509Certificate x509Certificate2 = this.getHighSpeedVideoFpsRanges;
        java.security.cert.X509Certificate x509Certificate3 = x509CertificatePair.getHighSpeedVideoFpsRanges;
        return equals && (x509Certificate2 != null ? x509Certificate2.equals(x509Certificate3) : x509Certificate3 == null);
    }

    public X509CertificatePair(org.bouncycastle.asn1.x509.CertificatePair certificatePair) throws java.security.cert.CertificateParsingException {
        if (certificatePair.getForward() != null) {
            this.getHighSpeedVideoSizes = new org.bouncycastle.jce.provider.X509CertificateObject(certificatePair.getForward());
        }
        if (certificatePair.getReverse() != null) {
            this.getHighSpeedVideoFpsRanges = new org.bouncycastle.jce.provider.X509CertificateObject(certificatePair.getReverse());
        }
    }

    public X509CertificatePair(java.security.cert.X509Certificate x509Certificate, java.security.cert.X509Certificate x509Certificate2) {
        this.getHighSpeedVideoSizes = x509Certificate;
        this.getHighSpeedVideoFpsRanges = x509Certificate2;
    }
}
