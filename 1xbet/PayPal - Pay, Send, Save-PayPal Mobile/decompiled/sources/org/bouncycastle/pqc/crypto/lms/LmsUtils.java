package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes17.dex */
class LmsUtils {
    static void getHighSpeedVideoFpsRangesFor(int i, org.bouncycastle.crypto.Digest digest) {
        digest.update((byte) (i >>> 24));
        digest.update((byte) (i >>> 16));
        digest.update((byte) (i >>> 8));
        digest.update((byte) i);
    }

    static void getHighResolutionOutputSizeshNQ4ISI(short s, org.bouncycastle.crypto.Digest digest) {
        digest.update((byte) (s >>> 8));
        digest.update((byte) s);
    }

    static int getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.pqc.crypto.lms.LMSParameters lMSParameters) {
        if (lMSParameters == null) {
            throw new java.lang.NullPointerException("lmsParameters cannot be null");
        }
        org.bouncycastle.pqc.crypto.lms.LMSigParameters lMSigParam = lMSParameters.getLMSigParam();
        return (1 << lMSigParam.getH()) * lMSigParam.getM();
    }

    static void getHighSpeedVideoSizes(byte[] bArr, org.bouncycastle.crypto.Digest digest) {
        digest.update(bArr, 0, bArr.length);
    }

    LmsUtils() {
    }
}
