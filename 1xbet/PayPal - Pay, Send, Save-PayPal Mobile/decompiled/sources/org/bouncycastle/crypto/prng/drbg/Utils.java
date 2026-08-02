package org.bouncycastle.crypto.prng.drbg;

/* loaded from: classes17.dex */
class Utils {
    static final java.util.Hashtable getHighSpeedVideoFpsRanges;

    static boolean getHighSpeedVideoSizes(byte[] bArr, int i) {
        return bArr != null && bArr.length > i;
    }

    static byte[] getHighSpeedVideoSizes(org.bouncycastle.crypto.Digest digest, byte[] bArr, int i) {
        int i2 = (i + 7) / 8;
        byte[] bArr2 = new byte[i2];
        int digestSize = i2 / digest.getDigestSize();
        int digestSize2 = digest.getDigestSize();
        byte[] bArr3 = new byte[digestSize2];
        int i3 = 1;
        int i4 = 0;
        for (int i5 = 0; i5 <= digestSize; i5++) {
            digest.update((byte) i3);
            digest.update((byte) (i >> 24));
            digest.update((byte) (i >> 16));
            digest.update((byte) (i >> 8));
            digest.update((byte) i);
            digest.update(bArr, 0, bArr.length);
            digest.doFinal(bArr3, 0);
            int i6 = i5 * digestSize2;
            int i7 = i2 - i6;
            if (i7 > digestSize2) {
                i7 = digestSize2;
            }
            java.lang.System.arraycopy(bArr3, 0, bArr2, i6, i7);
            i3++;
        }
        int i8 = i % 8;
        if (i8 != 0) {
            int i9 = 8 - i8;
            int i10 = 0;
            while (i4 != i2) {
                int i11 = bArr2[i4] & 255;
                bArr2[i4] = (byte) ((i10 << (8 - i9)) | (i11 >>> i9));
                i4++;
                i10 = i11;
            }
        }
        return bArr2;
    }

    static int getHighSpeedVideoSizes(org.bouncycastle.crypto.Mac mac) {
        java.lang.String algorithmName = mac.getAlgorithmName();
        return ((java.lang.Integer) getHighSpeedVideoFpsRanges.get(algorithmName.substring(0, algorithmName.indexOf(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR)))).intValue();
    }

    static int Camera2StreamConfigurationMap(org.bouncycastle.crypto.Digest digest) {
        return ((java.lang.Integer) getHighSpeedVideoFpsRanges.get(digest.getAlgorithmName())).intValue();
    }

    Utils() {
    }

    static {
        java.util.Hashtable hashtable = new java.util.Hashtable();
        getHighSpeedVideoFpsRanges = hashtable;
        hashtable.put("SHA-1", org.bouncycastle.util.Integers.valueOf(128));
        hashtable.put("SHA-224", org.bouncycastle.util.Integers.valueOf(192));
        hashtable.put("SHA-256", org.bouncycastle.util.Integers.valueOf(256));
        hashtable.put("SHA-384", org.bouncycastle.util.Integers.valueOf(256));
        hashtable.put("SHA-512", org.bouncycastle.util.Integers.valueOf(256));
        hashtable.put(org.apache.commons.codec.digest.MessageDigestAlgorithms.SHA_512_224, org.bouncycastle.util.Integers.valueOf(192));
        hashtable.put("SHA-512/256", org.bouncycastle.util.Integers.valueOf(256));
    }
}
