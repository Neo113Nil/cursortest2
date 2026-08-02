package org.bouncycastle.jcajce.provider.asymmetric.util;

/* loaded from: classes17.dex */
public class GOST3410Util {
    public static org.bouncycastle.crypto.params.AsymmetricKeyParameter generatePublicKeyParameter(java.security.PublicKey publicKey) throws java.security.InvalidKeyException {
        if (publicKey instanceof org.bouncycastle.jce.interfaces.GOST3410PublicKey) {
            org.bouncycastle.jce.interfaces.GOST3410PublicKey gOST3410PublicKey = (org.bouncycastle.jce.interfaces.GOST3410PublicKey) publicKey;
            org.bouncycastle.jce.spec.GOST3410PublicKeyParameterSetSpec publicKeyParameters = gOST3410PublicKey.getParameters().getPublicKeyParameters();
            return new org.bouncycastle.crypto.params.GOST3410PublicKeyParameters(gOST3410PublicKey.getY(), new org.bouncycastle.crypto.params.GOST3410Parameters(publicKeyParameters.getP(), publicKeyParameters.getQ(), publicKeyParameters.getA()));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("can't identify GOST3410 public key: ");
        sb.append(publicKey.getClass().getName());
        throw new java.security.InvalidKeyException(sb.toString());
    }

    public static org.bouncycastle.crypto.params.AsymmetricKeyParameter generatePrivateKeyParameter(java.security.PrivateKey privateKey) throws java.security.InvalidKeyException {
        if (!(privateKey instanceof org.bouncycastle.jce.interfaces.GOST3410PrivateKey)) {
            throw new java.security.InvalidKeyException("can't identify GOST3410 private key.");
        }
        org.bouncycastle.jce.interfaces.GOST3410PrivateKey gOST3410PrivateKey = (org.bouncycastle.jce.interfaces.GOST3410PrivateKey) privateKey;
        org.bouncycastle.jce.spec.GOST3410PublicKeyParameterSetSpec publicKeyParameters = gOST3410PrivateKey.getParameters().getPublicKeyParameters();
        return new org.bouncycastle.crypto.params.GOST3410PrivateKeyParameters(gOST3410PrivateKey.getX(), new org.bouncycastle.crypto.params.GOST3410Parameters(publicKeyParameters.getP(), publicKeyParameters.getQ(), publicKeyParameters.getA()));
    }
}
