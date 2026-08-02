package org.bouncycastle.jcajce.provider.asymmetric.dsa;

/* loaded from: classes17.dex */
public class KeyFactorySpi extends org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi {
    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public java.security.PublicKey generatePublic(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws java.io.IOException {
        org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm().getAlgorithm();
        if (org.bouncycastle.jcajce.provider.asymmetric.dsa.DSAUtil.isDsaOid(algorithm)) {
            return new org.bouncycastle.jcajce.provider.asymmetric.dsa.BCDSAPublicKey(subjectPublicKeyInfo);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("algorithm identifier ");
        sb.append(algorithm);
        sb.append(" in key not recognised");
        throw new java.io.IOException(sb.toString());
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public java.security.PrivateKey generatePrivate(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws java.io.IOException {
        org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm();
        if (org.bouncycastle.jcajce.provider.asymmetric.dsa.DSAUtil.isDsaOid(algorithm)) {
            return new org.bouncycastle.jcajce.provider.asymmetric.dsa.BCDSAPrivateKey(privateKeyInfo);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("algorithm identifier ");
        sb.append(algorithm);
        sb.append(" in key not recognised");
        throw new java.io.IOException(sb.toString());
    }

    @Override // java.security.KeyFactorySpi
    protected java.security.Key engineTranslateKey(java.security.Key key) throws java.security.InvalidKeyException {
        if (key instanceof java.security.interfaces.DSAPublicKey) {
            return new org.bouncycastle.jcajce.provider.asymmetric.dsa.BCDSAPublicKey((java.security.interfaces.DSAPublicKey) key);
        }
        if (key instanceof java.security.interfaces.DSAPrivateKey) {
            return new org.bouncycastle.jcajce.provider.asymmetric.dsa.BCDSAPrivateKey((java.security.interfaces.DSAPrivateKey) key);
        }
        throw new java.security.InvalidKeyException("key type unknown");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public java.security.spec.KeySpec engineGetKeySpec(java.security.Key key, java.lang.Class cls) throws java.security.spec.InvalidKeySpecException {
        if (cls.isAssignableFrom(java.security.spec.DSAPublicKeySpec.class) && (key instanceof java.security.interfaces.DSAPublicKey)) {
            java.security.interfaces.DSAPublicKey dSAPublicKey = (java.security.interfaces.DSAPublicKey) key;
            return new java.security.spec.DSAPublicKeySpec(dSAPublicKey.getY(), dSAPublicKey.getParams().getP(), dSAPublicKey.getParams().getQ(), dSAPublicKey.getParams().getG());
        }
        if (cls.isAssignableFrom(java.security.spec.DSAPrivateKeySpec.class) && (key instanceof java.security.interfaces.DSAPrivateKey)) {
            java.security.interfaces.DSAPrivateKey dSAPrivateKey = (java.security.interfaces.DSAPrivateKey) key;
            return new java.security.spec.DSAPrivateKeySpec(dSAPrivateKey.getX(), dSAPrivateKey.getParams().getP(), dSAPrivateKey.getParams().getQ(), dSAPrivateKey.getParams().getG());
        }
        if (cls.isAssignableFrom(org.bouncycastle.jcajce.spec.OpenSSHPublicKeySpec.class) && (key instanceof java.security.interfaces.DSAPublicKey)) {
            java.security.interfaces.DSAPublicKey dSAPublicKey2 = (java.security.interfaces.DSAPublicKey) key;
            try {
                return new org.bouncycastle.jcajce.spec.OpenSSHPublicKeySpec(org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil.encodePublicKey(new org.bouncycastle.crypto.params.DSAPublicKeyParameters(dSAPublicKey2.getY(), new org.bouncycastle.crypto.params.DSAParameters(dSAPublicKey2.getParams().getP(), dSAPublicKey2.getParams().getQ(), dSAPublicKey2.getParams().getG()))));
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to produce encoding: ");
                sb.append(e.getMessage());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        if (!cls.isAssignableFrom(org.bouncycastle.jcajce.spec.OpenSSHPrivateKeySpec.class) || !(key instanceof java.security.interfaces.DSAPrivateKey)) {
            return super.engineGetKeySpec(key, cls);
        }
        java.security.interfaces.DSAPrivateKey dSAPrivateKey2 = (java.security.interfaces.DSAPrivateKey) key;
        try {
            return new org.bouncycastle.jcajce.spec.OpenSSHPrivateKeySpec(org.bouncycastle.crypto.util.OpenSSHPrivateKeyUtil.encodePrivateKey(new org.bouncycastle.crypto.params.DSAPrivateKeyParameters(dSAPrivateKey2.getX(), new org.bouncycastle.crypto.params.DSAParameters(dSAPrivateKey2.getParams().getP(), dSAPrivateKey2.getParams().getQ(), dSAPrivateKey2.getParams().getG()))));
        } catch (java.io.IOException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("unable to produce encoding: ");
            sb2.append(e2.getMessage());
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public java.security.PublicKey engineGeneratePublic(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException {
        if (keySpec instanceof java.security.spec.DSAPublicKeySpec) {
            try {
                return new org.bouncycastle.jcajce.provider.asymmetric.dsa.BCDSAPublicKey((java.security.spec.DSAPublicKeySpec) keySpec);
            } catch (java.lang.Exception e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid KeySpec: ");
                sb.append(e.getMessage());
                throw new java.security.spec.InvalidKeySpecException(sb.toString()) { // from class: org.bouncycastle.jcajce.provider.asymmetric.dsa.KeyFactorySpi.1
                    @Override // java.lang.Throwable
                    public java.lang.Throwable getCause() {
                        return e;
                    }
                };
            }
        }
        if (!(keySpec instanceof org.bouncycastle.jcajce.spec.OpenSSHPublicKeySpec)) {
            return super.engineGeneratePublic(keySpec);
        }
        org.bouncycastle.crypto.params.AsymmetricKeyParameter parsePublicKey = org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil.parsePublicKey(((org.bouncycastle.jcajce.spec.OpenSSHPublicKeySpec) keySpec).getEncoded());
        if (!(parsePublicKey instanceof org.bouncycastle.crypto.params.DSAPublicKeyParameters)) {
            throw new java.lang.IllegalArgumentException("openssh public key is not dsa public key");
        }
        org.bouncycastle.crypto.params.DSAPublicKeyParameters dSAPublicKeyParameters = (org.bouncycastle.crypto.params.DSAPublicKeyParameters) parsePublicKey;
        return engineGeneratePublic(new java.security.spec.DSAPublicKeySpec(dSAPublicKeyParameters.getY(), dSAPublicKeyParameters.getParameters().getP(), dSAPublicKeyParameters.getParameters().getQ(), dSAPublicKeyParameters.getParameters().getG()));
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public java.security.PrivateKey engineGeneratePrivate(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException {
        if (keySpec instanceof java.security.spec.DSAPrivateKeySpec) {
            return new org.bouncycastle.jcajce.provider.asymmetric.dsa.BCDSAPrivateKey((java.security.spec.DSAPrivateKeySpec) keySpec);
        }
        if (!(keySpec instanceof org.bouncycastle.jcajce.spec.OpenSSHPrivateKeySpec)) {
            return super.engineGeneratePrivate(keySpec);
        }
        org.bouncycastle.crypto.params.AsymmetricKeyParameter parsePrivateKeyBlob = org.bouncycastle.crypto.util.OpenSSHPrivateKeyUtil.parsePrivateKeyBlob(((org.bouncycastle.jcajce.spec.OpenSSHPrivateKeySpec) keySpec).getEncoded());
        if (!(parsePrivateKeyBlob instanceof org.bouncycastle.crypto.params.DSAPrivateKeyParameters)) {
            throw new java.lang.IllegalArgumentException("openssh private key is not dsa privare key");
        }
        org.bouncycastle.crypto.params.DSAPrivateKeyParameters dSAPrivateKeyParameters = (org.bouncycastle.crypto.params.DSAPrivateKeyParameters) parsePrivateKeyBlob;
        return engineGeneratePrivate(new java.security.spec.DSAPrivateKeySpec(dSAPrivateKeyParameters.getX(), dSAPrivateKeyParameters.getParameters().getP(), dSAPrivateKeyParameters.getParameters().getQ(), dSAPrivateKeyParameters.getParameters().getG()));
    }
}
