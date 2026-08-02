package org.bouncycastle.jcajce.provider.asymmetric.gost;

/* loaded from: classes17.dex */
public class KeyFactorySpi extends org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi {
    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public java.security.PublicKey generatePublic(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws java.io.IOException {
        org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm().getAlgorithm();
        if (algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_94)) {
            return new org.bouncycastle.jcajce.provider.asymmetric.gost.BCGOST3410PublicKey(subjectPublicKeyInfo);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("algorithm identifier ");
        sb.append(algorithm);
        sb.append(" in key not recognised");
        throw new java.io.IOException(sb.toString());
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public java.security.PrivateKey generatePrivate(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws java.io.IOException {
        org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm();
        if (algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_94)) {
            return new org.bouncycastle.jcajce.provider.asymmetric.gost.BCGOST3410PrivateKey(privateKeyInfo);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("algorithm identifier ");
        sb.append(algorithm);
        sb.append(" in key not recognised");
        throw new java.io.IOException(sb.toString());
    }

    @Override // java.security.KeyFactorySpi
    protected java.security.Key engineTranslateKey(java.security.Key key) throws java.security.InvalidKeyException {
        if (key instanceof org.bouncycastle.jce.interfaces.GOST3410PublicKey) {
            return new org.bouncycastle.jcajce.provider.asymmetric.gost.BCGOST3410PublicKey((org.bouncycastle.jce.interfaces.GOST3410PublicKey) key);
        }
        if (key instanceof org.bouncycastle.jce.interfaces.GOST3410PrivateKey) {
            return new org.bouncycastle.jcajce.provider.asymmetric.gost.BCGOST3410PrivateKey((org.bouncycastle.jce.interfaces.GOST3410PrivateKey) key);
        }
        throw new java.security.InvalidKeyException("key type unknown");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public java.security.spec.KeySpec engineGetKeySpec(java.security.Key key, java.lang.Class cls) throws java.security.spec.InvalidKeySpecException {
        if (cls.isAssignableFrom(org.bouncycastle.jce.spec.GOST3410PublicKeySpec.class) && (key instanceof org.bouncycastle.jce.interfaces.GOST3410PublicKey)) {
            org.bouncycastle.jce.interfaces.GOST3410PublicKey gOST3410PublicKey = (org.bouncycastle.jce.interfaces.GOST3410PublicKey) key;
            org.bouncycastle.jce.spec.GOST3410PublicKeyParameterSetSpec publicKeyParameters = gOST3410PublicKey.getParameters().getPublicKeyParameters();
            return new org.bouncycastle.jce.spec.GOST3410PublicKeySpec(gOST3410PublicKey.getY(), publicKeyParameters.getP(), publicKeyParameters.getQ(), publicKeyParameters.getA());
        }
        if (!cls.isAssignableFrom(org.bouncycastle.jce.spec.GOST3410PrivateKeySpec.class) || !(key instanceof org.bouncycastle.jce.interfaces.GOST3410PrivateKey)) {
            return super.engineGetKeySpec(key, cls);
        }
        org.bouncycastle.jce.interfaces.GOST3410PrivateKey gOST3410PrivateKey = (org.bouncycastle.jce.interfaces.GOST3410PrivateKey) key;
        org.bouncycastle.jce.spec.GOST3410PublicKeyParameterSetSpec publicKeyParameters2 = gOST3410PrivateKey.getParameters().getPublicKeyParameters();
        return new org.bouncycastle.jce.spec.GOST3410PrivateKeySpec(gOST3410PrivateKey.getX(), publicKeyParameters2.getP(), publicKeyParameters2.getQ(), publicKeyParameters2.getA());
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public java.security.PublicKey engineGeneratePublic(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException {
        return keySpec instanceof org.bouncycastle.jce.spec.GOST3410PublicKeySpec ? new org.bouncycastle.jcajce.provider.asymmetric.gost.BCGOST3410PublicKey((org.bouncycastle.jce.spec.GOST3410PublicKeySpec) keySpec) : super.engineGeneratePublic(keySpec);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public java.security.PrivateKey engineGeneratePrivate(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException {
        return keySpec instanceof org.bouncycastle.jce.spec.GOST3410PrivateKeySpec ? new org.bouncycastle.jcajce.provider.asymmetric.gost.BCGOST3410PrivateKey((org.bouncycastle.jce.spec.GOST3410PrivateKeySpec) keySpec) : super.engineGeneratePrivate(keySpec);
    }
}
