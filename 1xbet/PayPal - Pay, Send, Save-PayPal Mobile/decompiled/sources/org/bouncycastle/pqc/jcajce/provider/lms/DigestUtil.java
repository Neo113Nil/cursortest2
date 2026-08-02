package org.bouncycastle.pqc.jcajce.provider.lms;

/* loaded from: classes17.dex */
class DigestUtil {
    public static byte[] getHighSpeedVideoSizes(org.bouncycastle.crypto.Digest digest) {
        boolean z = digest instanceof org.bouncycastle.crypto.Xof;
        int digestSize = digest.getDigestSize();
        if (z) {
            digestSize *= 2;
        }
        byte[] bArr = new byte[digestSize];
        if (z) {
            ((org.bouncycastle.crypto.Xof) digest).doFinal(bArr, 0, digestSize);
            return bArr;
        }
        digest.doFinal(bArr, 0);
        return bArr;
    }

    DigestUtil() {
    }
}
