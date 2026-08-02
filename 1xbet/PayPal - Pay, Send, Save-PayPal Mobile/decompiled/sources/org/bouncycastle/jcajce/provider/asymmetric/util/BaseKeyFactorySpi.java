package org.bouncycastle.jcajce.provider.asymmetric.util;

/* loaded from: classes17.dex */
public abstract class BaseKeyFactorySpi extends java.security.KeyFactorySpi implements org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter {
    @Override // java.security.KeyFactorySpi
    public java.security.spec.KeySpec engineGetKeySpec(java.security.Key key, java.lang.Class cls) throws java.security.spec.InvalidKeySpecException {
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
    public java.security.PublicKey engineGeneratePublic(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException {
        if (!(keySpec instanceof java.security.spec.X509EncodedKeySpec)) {
            throw new java.security.spec.InvalidKeySpecException("key spec not recognized");
        }
        try {
            return generatePublic(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(((java.security.spec.X509EncodedKeySpec) keySpec).getEncoded()));
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("encoded key spec not recognized: ");
            sb.append(e.getMessage());
            throw new java.security.spec.InvalidKeySpecException(sb.toString());
        }
    }

    @Override // java.security.KeyFactorySpi
    public java.security.PrivateKey engineGeneratePrivate(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException {
        if (!(keySpec instanceof java.security.spec.PKCS8EncodedKeySpec)) {
            throw new java.security.spec.InvalidKeySpecException("key spec not recognized");
        }
        try {
            return generatePrivate(org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance(((java.security.spec.PKCS8EncodedKeySpec) keySpec).getEncoded()));
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("encoded key spec not recognized: ");
            sb.append(e.getMessage());
            throw new java.security.spec.InvalidKeySpecException(sb.toString());
        }
    }
}
