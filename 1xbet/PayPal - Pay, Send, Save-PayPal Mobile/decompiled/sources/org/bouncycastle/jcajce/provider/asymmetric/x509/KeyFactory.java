package org.bouncycastle.jcajce.provider.asymmetric.x509;

/* loaded from: classes17.dex */
public class KeyFactory extends java.security.KeyFactorySpi {
    @Override // java.security.KeyFactorySpi
    protected java.security.Key engineTranslateKey(java.security.Key key) throws java.security.InvalidKeyException {
        throw new java.security.InvalidKeyException("not implemented yet ".concat(java.lang.String.valueOf(key)));
    }

    @Override // java.security.KeyFactorySpi
    protected java.security.spec.KeySpec engineGetKeySpec(java.security.Key key, java.lang.Class cls) throws java.security.spec.InvalidKeySpecException {
        if (cls.isAssignableFrom(java.security.spec.PKCS8EncodedKeySpec.class) && key.getFormat().equals("PKCS#8")) {
            return new java.security.spec.PKCS8EncodedKeySpec(key.getEncoded());
        }
        if (cls.isAssignableFrom(java.security.spec.X509EncodedKeySpec.class) && key.getFormat().equals("X.509")) {
            return new java.security.spec.X509EncodedKeySpec(key.getEncoded());
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("not implemented yet ");
        sb.append(key);
        sb.append(" ");
        sb.append(cls);
        throw new java.security.spec.InvalidKeySpecException(sb.toString());
    }

    @Override // java.security.KeyFactorySpi
    protected java.security.PublicKey engineGeneratePublic(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException {
        if (!(keySpec instanceof java.security.spec.X509EncodedKeySpec)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown KeySpec type: ");
            sb.append(keySpec.getClass().getName());
            throw new java.security.spec.InvalidKeySpecException(sb.toString());
        }
        try {
            org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo = org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(((java.security.spec.X509EncodedKeySpec) keySpec).getEncoded());
            java.security.PublicKey publicKey = org.bouncycastle.jce.provider.BouncyCastleProvider.getPublicKey(subjectPublicKeyInfo);
            if (publicKey != null) {
                return publicKey;
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("no factory found for OID: ");
            sb2.append(subjectPublicKeyInfo.getAlgorithm().getAlgorithm());
            throw new java.security.spec.InvalidKeySpecException(sb2.toString());
        } catch (java.lang.Exception e) {
            throw new java.security.spec.InvalidKeySpecException(e.toString());
        }
    }

    @Override // java.security.KeyFactorySpi
    protected java.security.PrivateKey engineGeneratePrivate(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException {
        if (!(keySpec instanceof java.security.spec.PKCS8EncodedKeySpec)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown KeySpec type: ");
            sb.append(keySpec.getClass().getName());
            throw new java.security.spec.InvalidKeySpecException(sb.toString());
        }
        try {
            org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo = org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance(((java.security.spec.PKCS8EncodedKeySpec) keySpec).getEncoded());
            java.security.PrivateKey privateKey = org.bouncycastle.jce.provider.BouncyCastleProvider.getPrivateKey(privateKeyInfo);
            if (privateKey != null) {
                return privateKey;
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("no factory found for OID: ");
            sb2.append(privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm());
            throw new java.security.spec.InvalidKeySpecException(sb2.toString());
        } catch (java.lang.Exception e) {
            throw new java.security.spec.InvalidKeySpecException(e.toString());
        }
    }
}
