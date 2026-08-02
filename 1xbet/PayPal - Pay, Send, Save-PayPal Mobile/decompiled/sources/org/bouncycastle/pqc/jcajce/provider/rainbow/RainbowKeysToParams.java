package org.bouncycastle.pqc.jcajce.provider.rainbow;

/* loaded from: classes17.dex */
public class RainbowKeysToParams {
    public static org.bouncycastle.crypto.params.AsymmetricKeyParameter generatePublicKeyParameter(java.security.PublicKey publicKey) throws java.security.InvalidKeyException {
        if (publicKey instanceof org.bouncycastle.pqc.jcajce.provider.rainbow.BCRainbowPublicKey) {
            org.bouncycastle.pqc.jcajce.provider.rainbow.BCRainbowPublicKey bCRainbowPublicKey = (org.bouncycastle.pqc.jcajce.provider.rainbow.BCRainbowPublicKey) publicKey;
            return new org.bouncycastle.pqc.crypto.rainbow.RainbowPublicKeyParameters(bCRainbowPublicKey.getDocLength(), bCRainbowPublicKey.getCoeffQuadratic(), bCRainbowPublicKey.getCoeffSingular(), bCRainbowPublicKey.getCoeffScalar());
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("can't identify Rainbow public key: ");
        sb.append(publicKey.getClass().getName());
        throw new java.security.InvalidKeyException(sb.toString());
    }

    public static org.bouncycastle.crypto.params.AsymmetricKeyParameter generatePrivateKeyParameter(java.security.PrivateKey privateKey) throws java.security.InvalidKeyException {
        if (!(privateKey instanceof org.bouncycastle.pqc.jcajce.provider.rainbow.BCRainbowPrivateKey)) {
            throw new java.security.InvalidKeyException("can't identify Rainbow private key.");
        }
        org.bouncycastle.pqc.jcajce.provider.rainbow.BCRainbowPrivateKey bCRainbowPrivateKey = (org.bouncycastle.pqc.jcajce.provider.rainbow.BCRainbowPrivateKey) privateKey;
        return new org.bouncycastle.pqc.crypto.rainbow.RainbowPrivateKeyParameters(bCRainbowPrivateKey.getInvA1(), bCRainbowPrivateKey.getB1(), bCRainbowPrivateKey.getInvA2(), bCRainbowPrivateKey.getB2(), bCRainbowPrivateKey.getVi(), bCRainbowPrivateKey.getLayers());
    }
}
