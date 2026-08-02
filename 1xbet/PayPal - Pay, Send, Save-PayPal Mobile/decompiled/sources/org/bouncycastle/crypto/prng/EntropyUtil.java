package org.bouncycastle.crypto.prng;

/* loaded from: classes17.dex */
public class EntropyUtil {
    public static byte[] generateSeed(org.bouncycastle.crypto.prng.EntropySource entropySource, int i) {
        byte[] bArr = new byte[i];
        if (i * 8 <= entropySource.entropySize()) {
            java.lang.System.arraycopy(entropySource.getEntropy(), 0, bArr, 0, i);
            return bArr;
        }
        int entropySize = entropySource.entropySize() / 8;
        for (int i2 = 0; i2 < i; i2 += entropySize) {
            byte[] entropy = entropySource.getEntropy();
            int i3 = i - i2;
            if (entropy.length <= i3) {
                java.lang.System.arraycopy(entropy, 0, bArr, i2, entropy.length);
            } else {
                java.lang.System.arraycopy(entropy, 0, bArr, i2, i3);
            }
        }
        return bArr;
    }
}
