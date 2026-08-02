package org.bouncycastle.jcajce.provider.asymmetric.dstu;

/* loaded from: classes17.dex */
public class KeyFactorySpi extends org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi {
    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public java.security.PublicKey generatePublic(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws java.io.IOException {
        org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm().getAlgorithm();
        if (algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu4145le) || algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu4145be)) {
            return new org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PublicKey(subjectPublicKeyInfo);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("algorithm identifier ");
        sb.append(algorithm);
        sb.append(" in key not recognised");
        throw new java.io.IOException(sb.toString());
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public java.security.PrivateKey generatePrivate(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws java.io.IOException {
        org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm();
        if (algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu4145le) || algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu4145be)) {
            return new org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PrivateKey(privateKeyInfo);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("algorithm identifier ");
        sb.append(algorithm);
        sb.append(" in key not recognised");
        throw new java.io.IOException(sb.toString());
    }

    @Override // java.security.KeyFactorySpi
    protected java.security.Key engineTranslateKey(java.security.Key key) throws java.security.InvalidKeyException {
        throw new java.security.InvalidKeyException("key type unknown");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public java.security.spec.KeySpec engineGetKeySpec(java.security.Key key, java.lang.Class cls) throws java.security.spec.InvalidKeySpecException {
        if (cls.isAssignableFrom(java.security.spec.ECPublicKeySpec.class) && (key instanceof java.security.interfaces.ECPublicKey)) {
            java.security.interfaces.ECPublicKey eCPublicKey = (java.security.interfaces.ECPublicKey) key;
            if (eCPublicKey.getParams() != null) {
                return new java.security.spec.ECPublicKeySpec(eCPublicKey.getW(), eCPublicKey.getParams());
            }
            org.bouncycastle.jce.spec.ECParameterSpec ecImplicitlyCa = org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
            return new java.security.spec.ECPublicKeySpec(eCPublicKey.getW(), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(ecImplicitlyCa.getCurve(), ecImplicitlyCa.getSeed()), ecImplicitlyCa));
        }
        if (cls.isAssignableFrom(java.security.spec.ECPrivateKeySpec.class) && (key instanceof java.security.interfaces.ECPrivateKey)) {
            java.security.interfaces.ECPrivateKey eCPrivateKey = (java.security.interfaces.ECPrivateKey) key;
            if (eCPrivateKey.getParams() != null) {
                return new java.security.spec.ECPrivateKeySpec(eCPrivateKey.getS(), eCPrivateKey.getParams());
            }
            org.bouncycastle.jce.spec.ECParameterSpec ecImplicitlyCa2 = org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
            return new java.security.spec.ECPrivateKeySpec(eCPrivateKey.getS(), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(ecImplicitlyCa2.getCurve(), ecImplicitlyCa2.getSeed()), ecImplicitlyCa2));
        }
        if (cls.isAssignableFrom(org.bouncycastle.jce.spec.ECPublicKeySpec.class) && (key instanceof java.security.interfaces.ECPublicKey)) {
            java.security.interfaces.ECPublicKey eCPublicKey2 = (java.security.interfaces.ECPublicKey) key;
            if (eCPublicKey2.getParams() != null) {
                return new org.bouncycastle.jce.spec.ECPublicKeySpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(eCPublicKey2.getParams(), eCPublicKey2.getW()), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCPublicKey2.getParams()));
            }
            return new org.bouncycastle.jce.spec.ECPublicKeySpec(org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(eCPublicKey2.getParams(), eCPublicKey2.getW()), org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa());
        }
        if (!cls.isAssignableFrom(org.bouncycastle.jce.spec.ECPrivateKeySpec.class) || !(key instanceof java.security.interfaces.ECPrivateKey)) {
            return super.engineGetKeySpec(key, cls);
        }
        java.security.interfaces.ECPrivateKey eCPrivateKey2 = (java.security.interfaces.ECPrivateKey) key;
        if (eCPrivateKey2.getParams() != null) {
            return new org.bouncycastle.jce.spec.ECPrivateKeySpec(eCPrivateKey2.getS(), org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertSpec(eCPrivateKey2.getParams()));
        }
        return new org.bouncycastle.jce.spec.ECPrivateKeySpec(eCPrivateKey2.getS(), org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa());
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public java.security.PublicKey engineGeneratePublic(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException {
        return keySpec instanceof org.bouncycastle.jce.spec.ECPublicKeySpec ? new org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PublicKey((org.bouncycastle.jce.spec.ECPublicKeySpec) keySpec, org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION) : keySpec instanceof java.security.spec.ECPublicKeySpec ? new org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PublicKey((java.security.spec.ECPublicKeySpec) keySpec) : super.engineGeneratePublic(keySpec);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public java.security.PrivateKey engineGeneratePrivate(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException {
        return keySpec instanceof org.bouncycastle.jce.spec.ECPrivateKeySpec ? new org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PrivateKey((org.bouncycastle.jce.spec.ECPrivateKeySpec) keySpec) : keySpec instanceof java.security.spec.ECPrivateKeySpec ? new org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PrivateKey((java.security.spec.ECPrivateKeySpec) keySpec) : super.engineGeneratePrivate(keySpec);
    }
}
