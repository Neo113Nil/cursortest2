package org.bouncycastle.jcajce.provider.asymmetric.rsa;

/* loaded from: classes17.dex */
public class KeyFactorySpi extends org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi {
    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public java.security.PublicKey generatePublic(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws java.io.IOException {
        org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm().getAlgorithm();
        if (org.bouncycastle.jcajce.provider.asymmetric.rsa.RSAUtil.isRsaOid(algorithm)) {
            return new org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPublicKey(subjectPublicKeyInfo);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("algorithm identifier ");
        sb.append(algorithm);
        sb.append(" in key not recognised");
        throw new java.io.IOException(sb.toString());
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public java.security.PrivateKey generatePrivate(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws java.io.IOException {
        org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm();
        if (org.bouncycastle.jcajce.provider.asymmetric.rsa.RSAUtil.isRsaOid(algorithm)) {
            org.bouncycastle.asn1.pkcs.RSAPrivateKey rSAPrivateKey = org.bouncycastle.asn1.pkcs.RSAPrivateKey.getInstance(privateKeyInfo.parsePrivateKey());
            return rSAPrivateKey.getCoefficient().intValue() == 0 ? new org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey(privateKeyInfo.getPrivateKeyAlgorithm(), rSAPrivateKey) : new org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateCrtKey(privateKeyInfo);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("algorithm identifier ");
        sb.append(algorithm);
        sb.append(" in key not recognised");
        throw new java.io.IOException(sb.toString());
    }

    @Override // java.security.KeyFactorySpi
    protected java.security.Key engineTranslateKey(java.security.Key key) throws java.security.InvalidKeyException {
        if (key instanceof java.security.interfaces.RSAPublicKey) {
            return new org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPublicKey((java.security.interfaces.RSAPublicKey) key);
        }
        if (key instanceof java.security.interfaces.RSAPrivateCrtKey) {
            return new org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateCrtKey((java.security.interfaces.RSAPrivateCrtKey) key);
        }
        if (key instanceof java.security.interfaces.RSAPrivateKey) {
            return new org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey((java.security.interfaces.RSAPrivateKey) key);
        }
        throw new java.security.InvalidKeyException("key type unknown");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public java.security.spec.KeySpec engineGetKeySpec(java.security.Key key, java.lang.Class cls) throws java.security.spec.InvalidKeySpecException {
        if ((cls.isAssignableFrom(java.security.spec.KeySpec.class) || cls.isAssignableFrom(java.security.spec.RSAPublicKeySpec.class)) && (key instanceof java.security.interfaces.RSAPublicKey)) {
            java.security.interfaces.RSAPublicKey rSAPublicKey = (java.security.interfaces.RSAPublicKey) key;
            return new java.security.spec.RSAPublicKeySpec(rSAPublicKey.getModulus(), rSAPublicKey.getPublicExponent());
        }
        if ((cls.isAssignableFrom(java.security.spec.KeySpec.class) || cls.isAssignableFrom(java.security.spec.RSAPrivateCrtKeySpec.class)) && (key instanceof java.security.interfaces.RSAPrivateCrtKey)) {
            java.security.interfaces.RSAPrivateCrtKey rSAPrivateCrtKey = (java.security.interfaces.RSAPrivateCrtKey) key;
            return new java.security.spec.RSAPrivateCrtKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent(), rSAPrivateCrtKey.getPrivateExponent(), rSAPrivateCrtKey.getPrimeP(), rSAPrivateCrtKey.getPrimeQ(), rSAPrivateCrtKey.getPrimeExponentP(), rSAPrivateCrtKey.getPrimeExponentQ(), rSAPrivateCrtKey.getCrtCoefficient());
        }
        if ((cls.isAssignableFrom(java.security.spec.KeySpec.class) || cls.isAssignableFrom(java.security.spec.RSAPrivateKeySpec.class)) && (key instanceof java.security.interfaces.RSAPrivateKey)) {
            java.security.interfaces.RSAPrivateKey rSAPrivateKey = (java.security.interfaces.RSAPrivateKey) key;
            return new java.security.spec.RSAPrivateKeySpec(rSAPrivateKey.getModulus(), rSAPrivateKey.getPrivateExponent());
        }
        if (cls.isAssignableFrom(org.bouncycastle.jcajce.spec.OpenSSHPublicKeySpec.class) && (key instanceof java.security.interfaces.RSAPublicKey)) {
            try {
                return new org.bouncycastle.jcajce.spec.OpenSSHPublicKeySpec(org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil.encodePublicKey(new org.bouncycastle.crypto.params.RSAKeyParameters(false, ((java.security.interfaces.RSAPublicKey) key).getModulus(), ((java.security.interfaces.RSAPublicKey) key).getPublicExponent())));
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to produce encoding: ");
                sb.append(e.getMessage());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        if (!cls.isAssignableFrom(org.bouncycastle.jcajce.spec.OpenSSHPrivateKeySpec.class) || !(key instanceof java.security.interfaces.RSAPrivateCrtKey)) {
            return super.engineGetKeySpec(key, cls);
        }
        try {
            return new org.bouncycastle.jcajce.spec.OpenSSHPrivateKeySpec(org.bouncycastle.crypto.util.OpenSSHPrivateKeyUtil.encodePrivateKey(new org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters(((java.security.interfaces.RSAPrivateCrtKey) key).getModulus(), ((java.security.interfaces.RSAPrivateCrtKey) key).getPublicExponent(), ((java.security.interfaces.RSAPrivateCrtKey) key).getPrivateExponent(), ((java.security.interfaces.RSAPrivateCrtKey) key).getPrimeP(), ((java.security.interfaces.RSAPrivateCrtKey) key).getPrimeQ(), ((java.security.interfaces.RSAPrivateCrtKey) key).getPrimeExponentP(), ((java.security.interfaces.RSAPrivateCrtKey) key).getPrimeExponentQ(), ((java.security.interfaces.RSAPrivateCrtKey) key).getCrtCoefficient())));
        } catch (java.io.IOException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("unable to produce encoding: ");
            sb2.append(e2.getMessage());
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public java.security.PublicKey engineGeneratePublic(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException {
        if (keySpec instanceof java.security.spec.RSAPublicKeySpec) {
            return new org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPublicKey((java.security.spec.RSAPublicKeySpec) keySpec);
        }
        if (!(keySpec instanceof org.bouncycastle.jcajce.spec.OpenSSHPublicKeySpec)) {
            return super.engineGeneratePublic(keySpec);
        }
        org.bouncycastle.crypto.params.AsymmetricKeyParameter parsePublicKey = org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil.parsePublicKey(((org.bouncycastle.jcajce.spec.OpenSSHPublicKeySpec) keySpec).getEncoded());
        if (parsePublicKey instanceof org.bouncycastle.crypto.params.RSAKeyParameters) {
            return new org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPublicKey((org.bouncycastle.crypto.params.RSAKeyParameters) parsePublicKey);
        }
        throw new java.security.spec.InvalidKeySpecException("Open SSH public key is not RSA public key");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public java.security.PrivateKey engineGeneratePrivate(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException {
        if (keySpec instanceof java.security.spec.PKCS8EncodedKeySpec) {
            try {
                return generatePrivate(org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance(((java.security.spec.PKCS8EncodedKeySpec) keySpec).getEncoded()));
            } catch (java.lang.Exception e) {
                try {
                    return new org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateCrtKey(org.bouncycastle.asn1.pkcs.RSAPrivateKey.getInstance(((java.security.spec.PKCS8EncodedKeySpec) keySpec).getEncoded()));
                } catch (java.lang.Exception unused) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to process key spec: ");
                    sb.append(e.toString());
                    throw new org.bouncycastle.jcajce.provider.asymmetric.util.ExtendedInvalidKeySpecException(sb.toString(), e);
                }
            }
        }
        if (keySpec instanceof java.security.spec.RSAPrivateCrtKeySpec) {
            return new org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateCrtKey((java.security.spec.RSAPrivateCrtKeySpec) keySpec);
        }
        if (keySpec instanceof java.security.spec.RSAPrivateKeySpec) {
            return new org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey((java.security.spec.RSAPrivateKeySpec) keySpec);
        }
        if (!(keySpec instanceof org.bouncycastle.jcajce.spec.OpenSSHPrivateKeySpec)) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("unknown KeySpec type: ");
            sb2.append(keySpec.getClass().getName());
            throw new java.security.spec.InvalidKeySpecException(sb2.toString());
        }
        org.bouncycastle.crypto.params.AsymmetricKeyParameter parsePrivateKeyBlob = org.bouncycastle.crypto.util.OpenSSHPrivateKeyUtil.parsePrivateKeyBlob(((org.bouncycastle.jcajce.spec.OpenSSHPrivateKeySpec) keySpec).getEncoded());
        if (parsePrivateKeyBlob instanceof org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters) {
            return new org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateCrtKey((org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters) parsePrivateKeyBlob);
        }
        throw new java.security.spec.InvalidKeySpecException("open SSH public key is not RSA private key");
    }
}
