package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

/* loaded from: classes17.dex */
public class KeyFactorySpi extends org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi {
    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public java.security.PublicKey generatePublic(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws java.io.IOException {
        org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm().getAlgorithm();
        if (!algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.dhKeyAgreement) && !algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x9.X9ObjectIdentifiers.dhpublicnumber) && !algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.elGamalAlgorithm)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("algorithm identifier ");
            sb.append(algorithm);
            sb.append(" in key not recognised");
            throw new java.io.IOException(sb.toString());
        }
        return new org.bouncycastle.jcajce.provider.asymmetric.elgamal.BCElGamalPublicKey(subjectPublicKeyInfo);
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public java.security.PrivateKey generatePrivate(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws java.io.IOException {
        org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm();
        if (!algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.dhKeyAgreement) && !algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x9.X9ObjectIdentifiers.dhpublicnumber) && !algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.elGamalAlgorithm)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("algorithm identifier ");
            sb.append(algorithm);
            sb.append(" in key not recognised");
            throw new java.io.IOException(sb.toString());
        }
        return new org.bouncycastle.jcajce.provider.asymmetric.elgamal.BCElGamalPrivateKey(privateKeyInfo);
    }

    @Override // java.security.KeyFactorySpi
    protected java.security.Key engineTranslateKey(java.security.Key key) throws java.security.InvalidKeyException {
        if (key instanceof javax.crypto.interfaces.DHPublicKey) {
            return new org.bouncycastle.jcajce.provider.asymmetric.elgamal.BCElGamalPublicKey((javax.crypto.interfaces.DHPublicKey) key);
        }
        if (key instanceof javax.crypto.interfaces.DHPrivateKey) {
            return new org.bouncycastle.jcajce.provider.asymmetric.elgamal.BCElGamalPrivateKey((javax.crypto.interfaces.DHPrivateKey) key);
        }
        if (key instanceof org.bouncycastle.jce.interfaces.ElGamalPublicKey) {
            return new org.bouncycastle.jcajce.provider.asymmetric.elgamal.BCElGamalPublicKey((org.bouncycastle.jce.interfaces.ElGamalPublicKey) key);
        }
        if (key instanceof org.bouncycastle.jce.interfaces.ElGamalPrivateKey) {
            return new org.bouncycastle.jcajce.provider.asymmetric.elgamal.BCElGamalPrivateKey((org.bouncycastle.jce.interfaces.ElGamalPrivateKey) key);
        }
        throw new java.security.InvalidKeyException("key type unknown");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public java.security.spec.KeySpec engineGetKeySpec(java.security.Key key, java.lang.Class cls) throws java.security.spec.InvalidKeySpecException {
        if (cls.isAssignableFrom(javax.crypto.spec.DHPrivateKeySpec.class) && (key instanceof javax.crypto.interfaces.DHPrivateKey)) {
            javax.crypto.interfaces.DHPrivateKey dHPrivateKey = (javax.crypto.interfaces.DHPrivateKey) key;
            return new javax.crypto.spec.DHPrivateKeySpec(dHPrivateKey.getX(), dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG());
        }
        if (!cls.isAssignableFrom(javax.crypto.spec.DHPublicKeySpec.class) || !(key instanceof javax.crypto.interfaces.DHPublicKey)) {
            return super.engineGetKeySpec(key, cls);
        }
        javax.crypto.interfaces.DHPublicKey dHPublicKey = (javax.crypto.interfaces.DHPublicKey) key;
        return new javax.crypto.spec.DHPublicKeySpec(dHPublicKey.getY(), dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG());
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public java.security.PublicKey engineGeneratePublic(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException {
        return keySpec instanceof org.bouncycastle.jce.spec.ElGamalPublicKeySpec ? new org.bouncycastle.jcajce.provider.asymmetric.elgamal.BCElGamalPublicKey((org.bouncycastle.jce.spec.ElGamalPublicKeySpec) keySpec) : keySpec instanceof javax.crypto.spec.DHPublicKeySpec ? new org.bouncycastle.jcajce.provider.asymmetric.elgamal.BCElGamalPublicKey((javax.crypto.spec.DHPublicKeySpec) keySpec) : super.engineGeneratePublic(keySpec);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public java.security.PrivateKey engineGeneratePrivate(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException {
        return keySpec instanceof org.bouncycastle.jce.spec.ElGamalPrivateKeySpec ? new org.bouncycastle.jcajce.provider.asymmetric.elgamal.BCElGamalPrivateKey((org.bouncycastle.jce.spec.ElGamalPrivateKeySpec) keySpec) : keySpec instanceof javax.crypto.spec.DHPrivateKeySpec ? new org.bouncycastle.jcajce.provider.asymmetric.elgamal.BCElGamalPrivateKey((javax.crypto.spec.DHPrivateKeySpec) keySpec) : super.engineGeneratePrivate(keySpec);
    }
}
