package org.bouncycastle.pqc.jcajce.provider.rainbow;

/* loaded from: classes17.dex */
public class RainbowKeyFactorySpi extends java.security.KeyFactorySpi implements org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter {
    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public java.security.PublicKey generatePublic(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws java.io.IOException {
        org.bouncycastle.pqc.asn1.RainbowPublicKey rainbowPublicKey = org.bouncycastle.pqc.asn1.RainbowPublicKey.getInstance(subjectPublicKeyInfo.parsePublicKey());
        return new org.bouncycastle.pqc.jcajce.provider.rainbow.BCRainbowPublicKey(rainbowPublicKey.getDocLength(), rainbowPublicKey.getCoeffQuadratic(), rainbowPublicKey.getCoeffSingular(), rainbowPublicKey.getCoeffScalar());
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public java.security.PrivateKey generatePrivate(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws java.io.IOException {
        org.bouncycastle.pqc.asn1.RainbowPrivateKey rainbowPrivateKey = org.bouncycastle.pqc.asn1.RainbowPrivateKey.getInstance(privateKeyInfo.parsePrivateKey());
        return new org.bouncycastle.pqc.jcajce.provider.rainbow.BCRainbowPrivateKey(rainbowPrivateKey.getInvA1(), rainbowPrivateKey.getB1(), rainbowPrivateKey.getInvA2(), rainbowPrivateKey.getB2(), rainbowPrivateKey.getVi(), rainbowPrivateKey.getLayers());
    }

    @Override // java.security.KeyFactorySpi
    public final java.security.Key engineTranslateKey(java.security.Key key) throws java.security.InvalidKeyException {
        if ((key instanceof org.bouncycastle.pqc.jcajce.provider.rainbow.BCRainbowPrivateKey) || (key instanceof org.bouncycastle.pqc.jcajce.provider.rainbow.BCRainbowPublicKey)) {
            return key;
        }
        throw new java.security.InvalidKeyException("Unsupported key type");
    }

    @Override // java.security.KeyFactorySpi
    public final java.security.spec.KeySpec engineGetKeySpec(java.security.Key key, java.lang.Class cls) throws java.security.spec.InvalidKeySpecException {
        if (key instanceof org.bouncycastle.pqc.jcajce.provider.rainbow.BCRainbowPrivateKey) {
            if (java.security.spec.PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new java.security.spec.PKCS8EncodedKeySpec(key.getEncoded());
            }
            if (org.bouncycastle.pqc.jcajce.spec.RainbowPrivateKeySpec.class.isAssignableFrom(cls)) {
                org.bouncycastle.pqc.jcajce.provider.rainbow.BCRainbowPrivateKey bCRainbowPrivateKey = (org.bouncycastle.pqc.jcajce.provider.rainbow.BCRainbowPrivateKey) key;
                return new org.bouncycastle.pqc.jcajce.spec.RainbowPrivateKeySpec(bCRainbowPrivateKey.getInvA1(), bCRainbowPrivateKey.getB1(), bCRainbowPrivateKey.getInvA2(), bCRainbowPrivateKey.getB2(), bCRainbowPrivateKey.getVi(), bCRainbowPrivateKey.getLayers());
            }
        } else {
            if (!(key instanceof org.bouncycastle.pqc.jcajce.provider.rainbow.BCRainbowPublicKey)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported key type: ");
                sb.append(key.getClass());
                sb.append(".");
                throw new java.security.spec.InvalidKeySpecException(sb.toString());
            }
            if (java.security.spec.X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new java.security.spec.X509EncodedKeySpec(key.getEncoded());
            }
            if (org.bouncycastle.pqc.jcajce.spec.RainbowPublicKeySpec.class.isAssignableFrom(cls)) {
                org.bouncycastle.pqc.jcajce.provider.rainbow.BCRainbowPublicKey bCRainbowPublicKey = (org.bouncycastle.pqc.jcajce.provider.rainbow.BCRainbowPublicKey) key;
                return new org.bouncycastle.pqc.jcajce.spec.RainbowPublicKeySpec(bCRainbowPublicKey.getDocLength(), bCRainbowPublicKey.getCoeffQuadratic(), bCRainbowPublicKey.getCoeffSingular(), bCRainbowPublicKey.getCoeffScalar());
            }
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unknown key specification: ");
        sb2.append(cls);
        sb2.append(".");
        throw new java.security.spec.InvalidKeySpecException(sb2.toString());
    }

    @Override // java.security.KeyFactorySpi
    public java.security.PublicKey engineGeneratePublic(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException {
        if (keySpec instanceof org.bouncycastle.pqc.jcajce.spec.RainbowPublicKeySpec) {
            return new org.bouncycastle.pqc.jcajce.provider.rainbow.BCRainbowPublicKey((org.bouncycastle.pqc.jcajce.spec.RainbowPublicKeySpec) keySpec);
        }
        if (keySpec instanceof java.security.spec.X509EncodedKeySpec) {
            try {
                return generatePublic(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(((java.security.spec.X509EncodedKeySpec) keySpec).getEncoded()));
            } catch (java.lang.Exception e) {
                throw new java.security.spec.InvalidKeySpecException(e.toString());
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown key specification: ");
        sb.append(keySpec);
        sb.append(".");
        throw new java.security.spec.InvalidKeySpecException(sb.toString());
    }

    @Override // java.security.KeyFactorySpi
    public java.security.PrivateKey engineGeneratePrivate(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException {
        if (keySpec instanceof org.bouncycastle.pqc.jcajce.spec.RainbowPrivateKeySpec) {
            return new org.bouncycastle.pqc.jcajce.provider.rainbow.BCRainbowPrivateKey((org.bouncycastle.pqc.jcajce.spec.RainbowPrivateKeySpec) keySpec);
        }
        if (keySpec instanceof java.security.spec.PKCS8EncodedKeySpec) {
            try {
                return generatePrivate(org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray(((java.security.spec.PKCS8EncodedKeySpec) keySpec).getEncoded())));
            } catch (java.lang.Exception e) {
                throw new java.security.spec.InvalidKeySpecException(e.toString());
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported key specification: ");
        sb.append(keySpec.getClass());
        sb.append(".");
        throw new java.security.spec.InvalidKeySpecException(sb.toString());
    }
}
