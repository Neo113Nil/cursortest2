package org.bouncycastle.pqc.crypto.qtesla;

/* loaded from: classes17.dex */
class HashUtils {
    static void getHighSpeedVideoSizes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        org.bouncycastle.crypto.digests.SHAKEDigest sHAKEDigest = new org.bouncycastle.crypto.digests.SHAKEDigest(256);
        sHAKEDigest.update(bArr2, 0, i3);
        sHAKEDigest.doFinal(bArr, i, i2);
    }

    static void getHighSpeedVideoFpsRangesFor(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        org.bouncycastle.crypto.digests.SHAKEDigest sHAKEDigest = new org.bouncycastle.crypto.digests.SHAKEDigest(128);
        sHAKEDigest.update(bArr2, 0, i3);
        sHAKEDigest.doFinal(bArr, i, i2);
    }

    static void getHighSpeedVideoSizes(byte[] bArr, int i, short s, byte[] bArr2, int i2) {
        org.bouncycastle.crypto.digests.CSHAKEDigest cSHAKEDigest = new org.bouncycastle.crypto.digests.CSHAKEDigest(256, null, new byte[]{(byte) s, (byte) (s >> 8)});
        cSHAKEDigest.update(bArr2, i2, 32);
        cSHAKEDigest.doFinal(bArr, 0, i);
    }

    static void getHighSpeedVideoFpsRangesFor(byte[] bArr, int i, short s, byte[] bArr2, int i2) {
        org.bouncycastle.crypto.digests.CSHAKEDigest cSHAKEDigest = new org.bouncycastle.crypto.digests.CSHAKEDigest(128, null, new byte[]{(byte) s, (byte) (s >> 8)});
        cSHAKEDigest.update(bArr2, i2, 32);
        cSHAKEDigest.doFinal(bArr, 0, i);
    }

    HashUtils() {
    }
}
