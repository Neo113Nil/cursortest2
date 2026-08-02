package org.bouncycastle.pqc.jcajce.provider.lms;

/* loaded from: classes17.dex */
public class LMSKeyFactorySpi extends java.security.KeyFactorySpi implements org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter {
    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public java.security.PublicKey generatePublic(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws java.io.IOException {
        return new org.bouncycastle.pqc.jcajce.provider.lms.BCLMSPublicKey(subjectPublicKeyInfo);
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public java.security.PrivateKey generatePrivate(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws java.io.IOException {
        return new org.bouncycastle.pqc.jcajce.provider.lms.BCLMSPrivateKey(privateKeyInfo);
    }

    @Override // java.security.KeyFactorySpi
    public final java.security.Key engineTranslateKey(java.security.Key key) throws java.security.InvalidKeyException {
        if ((key instanceof org.bouncycastle.pqc.jcajce.provider.lms.BCLMSPrivateKey) || (key instanceof org.bouncycastle.pqc.jcajce.provider.lms.BCLMSPublicKey)) {
            return key;
        }
        throw new java.security.InvalidKeyException("unsupported key type");
    }

    @Override // java.security.KeyFactorySpi
    public final java.security.spec.KeySpec engineGetKeySpec(java.security.Key key, java.lang.Class cls) throws java.security.spec.InvalidKeySpecException {
        if (key instanceof org.bouncycastle.pqc.jcajce.provider.lms.BCLMSPrivateKey) {
            if (java.security.spec.PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new java.security.spec.PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else {
            if (!(key instanceof org.bouncycastle.pqc.jcajce.provider.lms.BCLMSPublicKey)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("unsupported key type: ");
                sb.append(key.getClass());
                sb.append(".");
                throw new java.security.spec.InvalidKeySpecException(sb.toString());
            }
            if (java.security.spec.X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new java.security.spec.X509EncodedKeySpec(key.getEncoded());
            }
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("unknown key specification: ");
        sb2.append(cls);
        sb2.append(".");
        throw new java.security.spec.InvalidKeySpecException(sb2.toString());
    }

    @Override // java.security.KeyFactorySpi
    public java.security.PublicKey engineGeneratePublic(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException {
        if (keySpec instanceof java.security.spec.X509EncodedKeySpec) {
            try {
                return generatePublic(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(((java.security.spec.X509EncodedKeySpec) keySpec).getEncoded()));
            } catch (java.lang.Exception e) {
                throw new java.security.spec.InvalidKeySpecException(e.toString(), e);
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown key specification: ");
        sb.append(keySpec);
        sb.append(".");
        throw new java.security.spec.InvalidKeySpecException(sb.toString());
    }

    @Override // java.security.KeyFactorySpi
    public java.security.PrivateKey engineGeneratePrivate(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException {
        if (keySpec instanceof java.security.spec.PKCS8EncodedKeySpec) {
            try {
                return generatePrivate(org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray(((java.security.spec.PKCS8EncodedKeySpec) keySpec).getEncoded())));
            } catch (java.lang.Exception e) {
                throw new java.security.spec.InvalidKeySpecException(e.toString(), e);
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unsupported key specification: ");
        sb.append(keySpec.getClass());
        sb.append(".");
        throw new java.security.spec.InvalidKeySpecException(sb.toString());
    }
}
