package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

/* loaded from: classes17.dex */
public class ElGamalUtil {
    public static org.bouncycastle.crypto.params.AsymmetricKeyParameter generatePublicKeyParameter(java.security.PublicKey publicKey) throws java.security.InvalidKeyException {
        if (publicKey instanceof org.bouncycastle.jce.interfaces.ElGamalPublicKey) {
            org.bouncycastle.jce.interfaces.ElGamalPublicKey elGamalPublicKey = (org.bouncycastle.jce.interfaces.ElGamalPublicKey) publicKey;
            return new org.bouncycastle.crypto.params.ElGamalPublicKeyParameters(elGamalPublicKey.getY(), new org.bouncycastle.crypto.params.ElGamalParameters(elGamalPublicKey.getParameters().getP(), elGamalPublicKey.getParameters().getG()));
        }
        if (!(publicKey instanceof javax.crypto.interfaces.DHPublicKey)) {
            throw new java.security.InvalidKeyException("can't identify public key for El Gamal.");
        }
        javax.crypto.interfaces.DHPublicKey dHPublicKey = (javax.crypto.interfaces.DHPublicKey) publicKey;
        return new org.bouncycastle.crypto.params.ElGamalPublicKeyParameters(dHPublicKey.getY(), new org.bouncycastle.crypto.params.ElGamalParameters(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG()));
    }

    public static org.bouncycastle.crypto.params.AsymmetricKeyParameter generatePrivateKeyParameter(java.security.PrivateKey privateKey) throws java.security.InvalidKeyException {
        if (privateKey instanceof org.bouncycastle.jce.interfaces.ElGamalPrivateKey) {
            org.bouncycastle.jce.interfaces.ElGamalPrivateKey elGamalPrivateKey = (org.bouncycastle.jce.interfaces.ElGamalPrivateKey) privateKey;
            return new org.bouncycastle.crypto.params.ElGamalPrivateKeyParameters(elGamalPrivateKey.getX(), new org.bouncycastle.crypto.params.ElGamalParameters(elGamalPrivateKey.getParameters().getP(), elGamalPrivateKey.getParameters().getG()));
        }
        if (!(privateKey instanceof javax.crypto.interfaces.DHPrivateKey)) {
            throw new java.security.InvalidKeyException("can't identify private key for El Gamal.");
        }
        javax.crypto.interfaces.DHPrivateKey dHPrivateKey = (javax.crypto.interfaces.DHPrivateKey) privateKey;
        return new org.bouncycastle.crypto.params.ElGamalPrivateKeyParameters(dHPrivateKey.getX(), new org.bouncycastle.crypto.params.ElGamalParameters(dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG()));
    }
}
