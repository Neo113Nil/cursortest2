package org.bouncycastle.pqc.jcajce.provider.mceliece;

/* loaded from: classes17.dex */
public class McElieceKeysToParams {
    public static org.bouncycastle.crypto.params.AsymmetricKeyParameter generatePublicKeyParameter(java.security.PublicKey publicKey) throws java.security.InvalidKeyException {
        if (publicKey instanceof org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePublicKey) {
            return ((org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePublicKey) publicKey).Camera2StreamConfigurationMap;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("can't identify McEliece public key: ");
        sb.append(publicKey.getClass().getName());
        throw new java.security.InvalidKeyException(sb.toString());
    }

    public static org.bouncycastle.crypto.params.AsymmetricKeyParameter generatePrivateKeyParameter(java.security.PrivateKey privateKey) throws java.security.InvalidKeyException {
        if (!(privateKey instanceof org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePrivateKey)) {
            throw new java.security.InvalidKeyException("can't identify McEliece private key.");
        }
        org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePrivateKey bCMcEliecePrivateKey = (org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePrivateKey) privateKey;
        return new org.bouncycastle.pqc.crypto.mceliece.McEliecePrivateKeyParameters(bCMcEliecePrivateKey.getN(), bCMcEliecePrivateKey.getK(), bCMcEliecePrivateKey.getField(), bCMcEliecePrivateKey.getGoppaPoly(), bCMcEliecePrivateKey.getP1(), bCMcEliecePrivateKey.getP2(), bCMcEliecePrivateKey.getSInv());
    }
}
