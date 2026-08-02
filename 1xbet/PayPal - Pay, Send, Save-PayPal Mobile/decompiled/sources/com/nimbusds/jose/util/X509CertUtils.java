package com.nimbusds.jose.util;

/* loaded from: classes4.dex */
public class X509CertUtils {
    public static final java.lang.String PEM_BEGIN_MARKER = "-----BEGIN CERTIFICATE-----";
    public static final java.lang.String PEM_END_MARKER = "-----END CERTIFICATE-----";
    private static java.security.Provider jcaProvider;

    public static java.security.Provider getProvider() {
        return jcaProvider;
    }

    public static void setProvider(java.security.Provider provider) {
        jcaProvider = provider;
    }

    public static java.security.cert.X509Certificate parse(byte[] bArr) {
        try {
            return parseWithException(bArr);
        } catch (java.security.cert.CertificateException unused) {
            return null;
        }
    }

    public static java.security.cert.X509Certificate parseWithException(byte[] bArr) throws java.security.cert.CertificateException {
        java.security.cert.CertificateFactory certificateFactory;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        java.security.Provider provider = jcaProvider;
        if (provider != null) {
            certificateFactory = java.security.cert.CertificateFactory.getInstance("X.509", provider);
        } else {
            certificateFactory = java.security.cert.CertificateFactory.getInstance("X.509");
        }
        java.security.cert.Certificate generateCertificate = certificateFactory.generateCertificate(new java.io.ByteArrayInputStream(bArr));
        if (!(generateCertificate instanceof java.security.cert.X509Certificate)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Not a X.509 certificate: ");
            sb.append(generateCertificate.getType());
            throw new java.security.cert.CertificateException(sb.toString());
        }
        return (java.security.cert.X509Certificate) generateCertificate;
    }

    public static java.security.cert.X509Certificate parse(java.lang.String str) {
        int indexOf;
        java.lang.String substring;
        int indexOf2;
        if (str == null || str.isEmpty() || (indexOf = str.indexOf(PEM_BEGIN_MARKER)) < 0 || (indexOf2 = (substring = str.substring(indexOf + 27)).indexOf(PEM_END_MARKER)) < 0) {
            return null;
        }
        return parse(new com.nimbusds.jose.util.Base64(substring.substring(0, indexOf2).replaceAll("\\s", "")).decode());
    }

    public static java.security.cert.X509Certificate parseWithException(java.lang.String str) throws java.security.cert.CertificateException {
        if (str == null || str.isEmpty()) {
            return null;
        }
        int indexOf = str.indexOf(PEM_BEGIN_MARKER);
        if (indexOf < 0) {
            throw new java.security.cert.CertificateException("PEM begin marker not found");
        }
        java.lang.String substring = str.substring(indexOf + 27);
        int indexOf2 = substring.indexOf(PEM_END_MARKER);
        if (indexOf2 < 0) {
            throw new java.security.cert.CertificateException("PEM end marker not found");
        }
        return parseWithException(new com.nimbusds.jose.util.Base64(substring.substring(0, indexOf2).replaceAll("\\s", "")).decode());
    }

    public static java.lang.String toPEMString(java.security.cert.X509Certificate x509Certificate) {
        return toPEMString(x509Certificate, true);
    }

    public static java.lang.String toPEMString(java.security.cert.X509Certificate x509Certificate, boolean z) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(PEM_BEGIN_MARKER);
        if (z) {
            sb.append('\n');
        }
        try {
            sb.append(com.nimbusds.jose.util.Base64.encode(x509Certificate.getEncoded()));
            if (z) {
                sb.append('\n');
            }
            sb.append(PEM_END_MARKER);
            return sb.toString();
        } catch (java.security.cert.CertificateEncodingException unused) {
            return null;
        }
    }

    public static com.nimbusds.jose.util.Base64URL computeSHA256Thumbprint(java.security.cert.X509Certificate x509Certificate) {
        try {
            return com.nimbusds.jose.util.Base64URL.encode(java.security.MessageDigest.getInstance("SHA-256").digest(x509Certificate.getEncoded()));
        } catch (java.security.NoSuchAlgorithmException | java.security.cert.CertificateEncodingException unused) {
            return null;
        }
    }

    public static java.util.UUID store(java.security.KeyStore keyStore, java.security.PrivateKey privateKey, char[] cArr, java.security.cert.X509Certificate x509Certificate) throws java.security.KeyStoreException {
        java.util.UUID randomUUID = java.util.UUID.randomUUID();
        keyStore.setKeyEntry(randomUUID.toString(), privateKey, cArr, new java.security.cert.Certificate[]{x509Certificate});
        return randomUUID;
    }
}
