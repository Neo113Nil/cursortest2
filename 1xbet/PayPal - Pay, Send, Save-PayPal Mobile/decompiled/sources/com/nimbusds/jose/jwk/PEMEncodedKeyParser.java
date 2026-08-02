package com.nimbusds.jose.jwk;

/* loaded from: classes10.dex */
class PEMEncodedKeyParser {
    private static final org.bouncycastle.openssl.jcajce.JcaPEMKeyConverter pemConverter = new org.bouncycastle.openssl.jcajce.JcaPEMKeyConverter();

    private PEMEncodedKeyParser() {
    }

    static java.util.List<java.security.KeyPair> parseKeys(java.lang.String str) throws com.nimbusds.jose.JOSEException {
        java.lang.Object readObject;
        org.bouncycastle.openssl.PEMParser pEMParser = new org.bouncycastle.openssl.PEMParser(new java.io.StringReader(str));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        do {
            try {
                readObject = pEMParser.readObject();
                if (readObject instanceof org.bouncycastle.asn1.x509.SubjectPublicKeyInfo) {
                    arrayList.add(toKeyPair((org.bouncycastle.asn1.x509.SubjectPublicKeyInfo) readObject));
                } else if (readObject instanceof org.bouncycastle.cert.X509CertificateHolder) {
                    arrayList.add(toKeyPair((org.bouncycastle.cert.X509CertificateHolder) readObject));
                } else if (readObject instanceof org.bouncycastle.openssl.PEMKeyPair) {
                    arrayList.add(toKeyPair((org.bouncycastle.openssl.PEMKeyPair) readObject));
                } else if (readObject instanceof org.bouncycastle.asn1.pkcs.PrivateKeyInfo) {
                    arrayList.add(toKeyPair((org.bouncycastle.asn1.pkcs.PrivateKeyInfo) readObject));
                }
            } catch (java.lang.Exception e) {
                throw new com.nimbusds.jose.JOSEException(e.getMessage(), e);
            }
        } while (readObject != null);
        return arrayList;
    }

    private static java.security.KeyPair toKeyPair(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws org.bouncycastle.openssl.PEMException {
        return new java.security.KeyPair(pemConverter.getPublicKey(subjectPublicKeyInfo), null);
    }

    private static java.security.KeyPair toKeyPair(org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) throws org.bouncycastle.openssl.PEMException {
        return new java.security.KeyPair(pemConverter.getPublicKey(x509CertificateHolder.getSubjectPublicKeyInfo()), null);
    }

    private static java.security.KeyPair toKeyPair(org.bouncycastle.openssl.PEMKeyPair pEMKeyPair) throws org.bouncycastle.openssl.PEMException {
        return pemConverter.getKeyPair(pEMKeyPair);
    }

    private static java.security.KeyPair toKeyPair(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws org.bouncycastle.openssl.PEMException, java.security.NoSuchAlgorithmException, java.security.spec.InvalidKeySpecException {
        java.security.PrivateKey privateKey = pemConverter.getPrivateKey(privateKeyInfo);
        if (privateKey instanceof java.security.interfaces.RSAPrivateCrtKey) {
            java.security.interfaces.RSAPrivateCrtKey rSAPrivateCrtKey = (java.security.interfaces.RSAPrivateCrtKey) privateKey;
            return new java.security.KeyPair(java.security.KeyFactory.getInstance("RSA").generatePublic(new java.security.spec.RSAPublicKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent())), privateKey);
        }
        return new java.security.KeyPair(null, privateKey);
    }
}
