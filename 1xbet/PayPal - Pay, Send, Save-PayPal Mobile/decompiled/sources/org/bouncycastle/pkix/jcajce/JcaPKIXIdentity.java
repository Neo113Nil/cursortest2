package org.bouncycastle.pkix.jcajce;

/* loaded from: classes17.dex */
public class JcaPKIXIdentity extends org.bouncycastle.pkix.PKIXIdentity {
    private final java.security.cert.X509Certificate[] getHighSpeedVideoFpsRangesFor;
    private final java.security.PrivateKey getHighSpeedVideoSizes;

    public java.security.cert.X509Certificate[] getX509CertificateChain() {
        java.security.cert.X509Certificate[] x509CertificateArr = this.getHighSpeedVideoFpsRangesFor;
        int length = x509CertificateArr.length;
        java.security.cert.X509Certificate[] x509CertificateArr2 = new java.security.cert.X509Certificate[length];
        java.lang.System.arraycopy(x509CertificateArr, 0, x509CertificateArr2, 0, length);
        return x509CertificateArr2;
    }

    public java.security.cert.X509Certificate getX509Certificate() {
        return this.getHighSpeedVideoFpsRangesFor[0];
    }

    public java.security.PrivateKey getPrivateKey() {
        return this.getHighSpeedVideoSizes;
    }

    private static org.bouncycastle.asn1.pkcs.PrivateKeyInfo getHighResolutionOutputSizeshNQ4ISI(java.security.PrivateKey privateKey) {
        try {
            return org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance(privateKey.getEncoded());
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private static org.bouncycastle.cert.X509CertificateHolder[] Camera2StreamConfigurationMap(java.security.cert.X509Certificate[] x509CertificateArr) {
        int length = x509CertificateArr.length;
        org.bouncycastle.cert.X509CertificateHolder[] x509CertificateHolderArr = new org.bouncycastle.cert.X509CertificateHolder[length];
        for (int i = 0; i != length; i++) {
            try {
                x509CertificateHolderArr[i] = new org.bouncycastle.cert.jcajce.JcaX509CertificateHolder(x509CertificateArr[i]);
            } catch (java.security.cert.CertificateEncodingException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to process certificates: ");
                sb.append(e.getMessage());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        return x509CertificateHolderArr;
    }

    public JcaPKIXIdentity(java.security.PrivateKey privateKey, java.security.cert.X509Certificate[] x509CertificateArr) {
        super(getHighResolutionOutputSizeshNQ4ISI(privateKey), Camera2StreamConfigurationMap(x509CertificateArr));
        this.getHighSpeedVideoSizes = privateKey;
        java.security.cert.X509Certificate[] x509CertificateArr2 = new java.security.cert.X509Certificate[x509CertificateArr.length];
        this.getHighSpeedVideoFpsRangesFor = x509CertificateArr2;
        java.lang.System.arraycopy(x509CertificateArr, 0, x509CertificateArr2, 0, x509CertificateArr.length);
    }

    public JcaPKIXIdentity(java.security.PrivateKey privateKey, java.security.cert.X509Certificate x509Certificate) {
        this(privateKey, new java.security.cert.X509Certificate[]{x509Certificate});
    }
}
