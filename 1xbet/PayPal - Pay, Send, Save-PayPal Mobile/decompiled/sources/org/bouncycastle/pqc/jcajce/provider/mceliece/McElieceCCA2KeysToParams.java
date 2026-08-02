package org.bouncycastle.pqc.jcajce.provider.mceliece;

/* loaded from: classes17.dex */
public class McElieceCCA2KeysToParams {
    public static org.bouncycastle.crypto.params.AsymmetricKeyParameter generatePrivateKeyParameter(java.security.PrivateKey privateKey) throws java.security.InvalidKeyException {
        if (privateKey instanceof org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PrivateKey) {
            return ((org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PrivateKey) privateKey).getHighSpeedVideoFpsRangesFor;
        }
        throw new java.security.InvalidKeyException("can't identify McElieceCCA2 private key.");
    }

    public static org.bouncycastle.crypto.params.AsymmetricKeyParameter generatePublicKeyParameter(java.security.PublicKey publicKey) throws java.security.InvalidKeyException {
        if (publicKey instanceof org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PublicKey) {
            return ((org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PublicKey) publicKey).getHighResolutionOutputSizeshNQ4ISI;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("can't identify McElieceCCA2 public key: ");
        sb.append(publicKey.getClass().getName());
        throw new java.security.InvalidKeyException(sb.toString());
    }
}
