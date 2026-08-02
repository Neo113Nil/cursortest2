package org.bouncycastle.openssl.jcajce;

/* loaded from: classes17.dex */
public class JcaMiscPEMGenerator extends org.bouncycastle.openssl.MiscPEMGenerator {
    private static java.lang.Object getHighSpeedVideoFpsRanges(java.lang.Object obj) throws java.io.IOException {
        while (!(obj instanceof java.security.cert.X509Certificate)) {
            if (obj instanceof java.security.cert.X509CRL) {
                try {
                    return new org.bouncycastle.cert.jcajce.JcaX509CRLHolder((java.security.cert.X509CRL) obj);
                } catch (java.security.cert.CRLException e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot encode object: ");
                    sb.append(e.toString());
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
            }
            if (!(obj instanceof java.security.KeyPair)) {
                return obj instanceof java.security.PrivateKey ? org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance(((java.security.Key) obj).getEncoded()) : obj instanceof java.security.PublicKey ? org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(((java.security.PublicKey) obj).getEncoded()) : obj;
            }
            obj = ((java.security.KeyPair) obj).getPrivate();
        }
        try {
            return new org.bouncycastle.cert.jcajce.JcaX509CertificateHolder((java.security.cert.X509Certificate) obj);
        } catch (java.security.cert.CertificateEncodingException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Cannot encode object: ");
            sb2.append(e2.toString());
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
    }

    public JcaMiscPEMGenerator(java.lang.Object obj, org.bouncycastle.openssl.PEMEncryptor pEMEncryptor) throws java.io.IOException {
        super(getHighSpeedVideoFpsRanges(obj), pEMEncryptor);
    }

    public JcaMiscPEMGenerator(java.lang.Object obj) throws java.io.IOException {
        super(getHighSpeedVideoFpsRanges(obj));
    }
}
