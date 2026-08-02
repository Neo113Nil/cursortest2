package org.bouncycastle.jcajce.provider.symmetric.util;

/* loaded from: classes17.dex */
public class BaseSecretKeyFactory extends javax.crypto.SecretKeyFactorySpi implements org.bouncycastle.jcajce.provider.symmetric.util.PBE {
    protected java.lang.String algName;
    protected org.bouncycastle.asn1.ASN1ObjectIdentifier algOid;

    @Override // javax.crypto.SecretKeyFactorySpi
    protected javax.crypto.SecretKey engineTranslateKey(javax.crypto.SecretKey secretKey) throws java.security.InvalidKeyException {
        if (secretKey == null) {
            throw new java.security.InvalidKeyException("key parameter is null");
        }
        if (secretKey.getAlgorithm().equalsIgnoreCase(this.algName)) {
            return new javax.crypto.spec.SecretKeySpec(secretKey.getEncoded(), this.algName);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Key not of type ");
        sb.append(this.algName);
        sb.append(".");
        throw new java.security.InvalidKeyException(sb.toString());
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    protected java.security.spec.KeySpec engineGetKeySpec(javax.crypto.SecretKey secretKey, java.lang.Class cls) throws java.security.spec.InvalidKeySpecException {
        if (cls == null) {
            throw new java.security.spec.InvalidKeySpecException("keySpec parameter is null");
        }
        if (secretKey == null) {
            throw new java.security.spec.InvalidKeySpecException("key parameter is null");
        }
        if (javax.crypto.spec.SecretKeySpec.class.isAssignableFrom(cls)) {
            return new javax.crypto.spec.SecretKeySpec(secretKey.getEncoded(), this.algName);
        }
        try {
            return (java.security.spec.KeySpec) cls.getConstructor(byte[].class).newInstance(secretKey.getEncoded());
        } catch (java.lang.Exception e) {
            throw new java.security.spec.InvalidKeySpecException(e.toString());
        }
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    public javax.crypto.SecretKey engineGenerateSecret(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException {
        if (keySpec instanceof javax.crypto.spec.SecretKeySpec) {
            return new javax.crypto.spec.SecretKeySpec(((javax.crypto.spec.SecretKeySpec) keySpec).getEncoded(), this.algName);
        }
        throw new java.security.spec.InvalidKeySpecException("Invalid KeySpec");
    }

    public BaseSecretKeyFactory(java.lang.String str, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.algName = str;
        this.algOid = aSN1ObjectIdentifier;
    }
}
