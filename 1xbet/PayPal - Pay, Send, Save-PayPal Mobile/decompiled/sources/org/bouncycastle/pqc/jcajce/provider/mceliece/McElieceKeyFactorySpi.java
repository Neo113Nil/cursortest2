package org.bouncycastle.pqc.jcajce.provider.mceliece;

/* loaded from: classes17.dex */
public class McElieceKeyFactorySpi extends java.security.KeyFactorySpi implements org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter {
    public static final java.lang.String OID = "1.3.6.1.4.1.8301.3.1.3.4.1";

    @Override // java.security.KeyFactorySpi
    protected java.security.spec.KeySpec engineGetKeySpec(java.security.Key key, java.lang.Class cls) throws java.security.spec.InvalidKeySpecException {
        return null;
    }

    @Override // java.security.KeyFactorySpi
    protected java.security.Key engineTranslateKey(java.security.Key key) throws java.security.InvalidKeyException {
        return null;
    }

    public java.security.Key translateKey(java.security.Key key) throws java.security.InvalidKeyException {
        if ((key instanceof org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePrivateKey) || (key instanceof org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePublicKey)) {
            return key;
        }
        throw new java.security.InvalidKeyException("Unsupported key type.");
    }

    public java.security.spec.KeySpec getKeySpec(java.security.Key key, java.lang.Class cls) throws java.security.spec.InvalidKeySpecException {
        if (key instanceof org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePrivateKey) {
            if (java.security.spec.PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new java.security.spec.PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else {
            if (!(key instanceof org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePublicKey)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported key type: ");
                sb.append(key.getClass());
                sb.append(".");
                throw new java.security.spec.InvalidKeySpecException(sb.toString());
            }
            if (java.security.spec.X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new java.security.spec.X509EncodedKeySpec(key.getEncoded());
            }
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unknown key specification: ");
        sb2.append(cls);
        sb2.append(".");
        throw new java.security.spec.InvalidKeySpecException(sb2.toString());
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public java.security.PublicKey generatePublic(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws java.io.IOException {
        org.bouncycastle.pqc.asn1.McEliecePublicKey mcEliecePublicKey = org.bouncycastle.pqc.asn1.McEliecePublicKey.getInstance(subjectPublicKeyInfo.parsePublicKey());
        return new org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePublicKey(new org.bouncycastle.pqc.crypto.mceliece.McEliecePublicKeyParameters(mcEliecePublicKey.getN(), mcEliecePublicKey.getT(), mcEliecePublicKey.getG()));
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public java.security.PrivateKey generatePrivate(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws java.io.IOException {
        org.bouncycastle.pqc.asn1.McEliecePrivateKey mcEliecePrivateKey = org.bouncycastle.pqc.asn1.McEliecePrivateKey.getInstance(privateKeyInfo.parsePrivateKey().toASN1Primitive());
        return new org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePrivateKey(new org.bouncycastle.pqc.crypto.mceliece.McEliecePrivateKeyParameters(mcEliecePrivateKey.getN(), mcEliecePrivateKey.getK(), mcEliecePrivateKey.getField(), mcEliecePrivateKey.getGoppaPoly(), mcEliecePrivateKey.getP1(), mcEliecePrivateKey.getP2(), mcEliecePrivateKey.getSInv()));
    }

    @Override // java.security.KeyFactorySpi
    protected java.security.PublicKey engineGeneratePublic(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException {
        if (!(keySpec instanceof java.security.spec.X509EncodedKeySpec)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported key specification: ");
            sb.append(keySpec.getClass());
            sb.append(".");
            throw new java.security.spec.InvalidKeySpecException(sb.toString());
        }
        try {
            org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo = org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray(((java.security.spec.X509EncodedKeySpec) keySpec).getEncoded()));
            try {
                if (!org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.mcEliece.equals((org.bouncycastle.asn1.ASN1Primitive) subjectPublicKeyInfo.getAlgorithm().getAlgorithm())) {
                    throw new java.security.spec.InvalidKeySpecException("Unable to recognise OID in McEliece public key");
                }
                org.bouncycastle.pqc.asn1.McEliecePublicKey mcEliecePublicKey = org.bouncycastle.pqc.asn1.McEliecePublicKey.getInstance(subjectPublicKeyInfo.parsePublicKey());
                return new org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePublicKey(new org.bouncycastle.pqc.crypto.mceliece.McEliecePublicKeyParameters(mcEliecePublicKey.getN(), mcEliecePublicKey.getT(), mcEliecePublicKey.getG()));
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unable to decode X509EncodedKeySpec: ");
                sb2.append(e.getMessage());
                throw new java.security.spec.InvalidKeySpecException(sb2.toString());
            }
        } catch (java.io.IOException e2) {
            throw new java.security.spec.InvalidKeySpecException(e2.toString());
        }
    }

    @Override // java.security.KeyFactorySpi
    protected java.security.PrivateKey engineGeneratePrivate(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException {
        if (!(keySpec instanceof java.security.spec.PKCS8EncodedKeySpec)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported key specification: ");
            sb.append(keySpec.getClass());
            sb.append(".");
            throw new java.security.spec.InvalidKeySpecException(sb.toString());
        }
        try {
            org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo = org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray(((java.security.spec.PKCS8EncodedKeySpec) keySpec).getEncoded()));
            try {
                if (!org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.mcEliece.equals((org.bouncycastle.asn1.ASN1Primitive) privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm())) {
                    throw new java.security.spec.InvalidKeySpecException("Unable to recognise OID in McEliece private key");
                }
                org.bouncycastle.pqc.asn1.McEliecePrivateKey mcEliecePrivateKey = org.bouncycastle.pqc.asn1.McEliecePrivateKey.getInstance(privateKeyInfo.parsePrivateKey());
                return new org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePrivateKey(new org.bouncycastle.pqc.crypto.mceliece.McEliecePrivateKeyParameters(mcEliecePrivateKey.getN(), mcEliecePrivateKey.getK(), mcEliecePrivateKey.getField(), mcEliecePrivateKey.getGoppaPoly(), mcEliecePrivateKey.getP1(), mcEliecePrivateKey.getP2(), mcEliecePrivateKey.getSInv()));
            } catch (java.io.IOException unused) {
                throw new java.security.spec.InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec.");
            }
        } catch (java.io.IOException e) {
            throw new java.security.spec.InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec: ".concat(java.lang.String.valueOf(e)));
        }
    }
}
