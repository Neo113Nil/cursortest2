package org.jose4j.keys;

/* loaded from: classes18.dex */
public class X509Util {
    private java.security.cert.CertificateFactory getHighSpeedVideoFpsRanges;

    public X509Util() {
        try {
            this.getHighSpeedVideoFpsRanges = java.security.cert.CertificateFactory.getInstance("X.509");
        } catch (java.security.cert.CertificateException e) {
            throw new java.lang.IllegalStateException("Couldn't find X.509 CertificateFactory!?!", e);
        }
    }

    public X509Util(java.lang.String str) throws java.security.NoSuchProviderException {
        try {
            this.getHighSpeedVideoFpsRanges = java.security.cert.CertificateFactory.getInstance("X.509", str);
        } catch (java.security.cert.CertificateException e) {
            throw new java.lang.IllegalStateException("Couldn't find X.509 CertificateFactory!?!", e);
        }
    }

    public static org.jose4j.keys.X509Util getX509Util(java.lang.String str) throws org.jose4j.lang.JoseException {
        if (str == null) {
            return new org.jose4j.keys.X509Util();
        }
        try {
            return new org.jose4j.keys.X509Util(str);
        } catch (java.security.NoSuchProviderException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Provider ");
            sb.append(str);
            sb.append(" not found when creating X509Util.");
            throw new org.jose4j.lang.JoseException(sb.toString(), e);
        }
    }

    public java.lang.String toBase64(java.security.cert.X509Certificate x509Certificate) {
        try {
            return org.jose4j.base64url.Base64.encode(x509Certificate.getEncoded());
        } catch (java.security.cert.CertificateEncodingException e) {
            throw new java.lang.IllegalStateException("Unexpected problem getting encoded certificate.", e);
        }
    }

    public java.lang.String toPem(java.security.cert.X509Certificate x509Certificate) {
        try {
            return org.jose4j.base64url.SimplePEMEncoder.encode(x509Certificate.getEncoded());
        } catch (java.security.cert.CertificateEncodingException e) {
            throw new java.lang.IllegalStateException("Unexpected problem getting encoded certificate.", e);
        }
    }

    public java.security.cert.X509Certificate fromBase64Der(java.lang.String str) throws org.jose4j.lang.JoseException {
        try {
            return (java.security.cert.X509Certificate) this.getHighSpeedVideoFpsRanges.generateCertificate(new java.io.ByteArrayInputStream(org.jose4j.base64url.Base64.decode(str)));
        } catch (java.security.cert.CertificateException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to convert ");
            sb.append(str);
            sb.append(" value to X509Certificate: ");
            sb.append(e);
            throw new org.jose4j.lang.JoseException(sb.toString(), e);
        }
    }

    public static java.lang.String x5t(java.security.cert.X509Certificate x509Certificate) {
        return Camera2StreamConfigurationMap(x509Certificate, "SHA-1");
    }

    public static java.lang.String x5tS256(java.security.cert.X509Certificate x509Certificate) {
        return Camera2StreamConfigurationMap(x509Certificate, "SHA-256");
    }

    private static java.lang.String Camera2StreamConfigurationMap(java.security.cert.X509Certificate x509Certificate, java.lang.String str) {
        try {
            return org.jose4j.base64url.Base64Url.encode(org.jose4j.lang.HashUtil.getMessageDigest(str).digest(x509Certificate.getEncoded()));
        } catch (java.security.cert.CertificateEncodingException e) {
            throw new org.jose4j.lang.UncheckedJoseException("Unable to get certificate thumbprint due to unexpected certificate encoding exception.", e);
        }
    }
}
