package org.bouncycastle.jcajce.provider.asymmetric.util;

/* loaded from: classes17.dex */
public class IESUtil {
    public static org.bouncycastle.jce.spec.IESParameterSpec guessParameterSpec(org.bouncycastle.crypto.BufferedBlockCipher bufferedBlockCipher, byte[] bArr) {
        if (bufferedBlockCipher == null) {
            return new org.bouncycastle.jce.spec.IESParameterSpec(null, null, 128);
        }
        org.bouncycastle.crypto.BlockCipher underlyingCipher = bufferedBlockCipher.getUnderlyingCipher();
        return (underlyingCipher.getAlgorithmName().equals("DES") || underlyingCipher.getAlgorithmName().equals("RC2") || underlyingCipher.getAlgorithmName().equals("RC5-32") || underlyingCipher.getAlgorithmName().equals("RC5-64")) ? new org.bouncycastle.jce.spec.IESParameterSpec(null, null, 64, 64, bArr) : underlyingCipher.getAlgorithmName().equals("SKIPJACK") ? new org.bouncycastle.jce.spec.IESParameterSpec(null, null, 80, 80, bArr) : underlyingCipher.getAlgorithmName().equals("GOST28147") ? new org.bouncycastle.jce.spec.IESParameterSpec(null, null, 256, 256, bArr) : new org.bouncycastle.jce.spec.IESParameterSpec(null, null, 128, 128, bArr);
    }
}
