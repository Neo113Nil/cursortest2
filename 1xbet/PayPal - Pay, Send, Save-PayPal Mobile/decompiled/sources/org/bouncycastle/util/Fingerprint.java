package org.bouncycastle.util;

/* loaded from: classes17.dex */
public class Fingerprint {
    private static char[] Camera2StreamConfigurationMap = {com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', io.ktor.util.date.GMTDateParser.DAY_OF_MONTH, 'e', 'f'};
    private final byte[] getHighSpeedVideoFpsRanges;

    public java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i = 0; i != this.getHighSpeedVideoFpsRanges.length; i++) {
            if (i > 0) {
                stringBuffer.append(io.ktor.sse.ServerSentEventKt.COLON);
            }
            stringBuffer.append(Camera2StreamConfigurationMap[(this.getHighSpeedVideoFpsRanges[i] >>> 4) & 15]);
            stringBuffer.append(Camera2StreamConfigurationMap[this.getHighSpeedVideoFpsRanges[i] & com.google.common.base.Ascii.SI]);
        }
        return stringBuffer.toString();
    }

    public int hashCode() {
        return org.bouncycastle.util.Arrays.hashCode(this.getHighSpeedVideoFpsRanges);
    }

    public byte[] getFingerprint() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRanges);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof org.bouncycastle.util.Fingerprint) {
            return org.bouncycastle.util.Arrays.areEqual(((org.bouncycastle.util.Fingerprint) obj).getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRanges);
        }
        return false;
    }

    public static byte[] calculateFingerprintSHA512_160(byte[] bArr) {
        org.bouncycastle.crypto.digests.SHA512tDigest sHA512tDigest = new org.bouncycastle.crypto.digests.SHA512tDigest(160);
        sHA512tDigest.update(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[sHA512tDigest.getDigestSize()];
        sHA512tDigest.doFinal(bArr2, 0);
        return bArr2;
    }

    public static byte[] calculateFingerprint(byte[] bArr, int i) {
        if (i % 8 != 0) {
            throw new java.lang.IllegalArgumentException("bitLength must be a multiple of 8");
        }
        org.bouncycastle.crypto.digests.SHAKEDigest sHAKEDigest = new org.bouncycastle.crypto.digests.SHAKEDigest(256);
        sHAKEDigest.update(bArr, 0, bArr.length);
        int i2 = i / 8;
        byte[] bArr2 = new byte[i2];
        sHAKEDigest.doFinal(bArr2, 0, i2);
        return bArr2;
    }

    public static byte[] calculateFingerprint(byte[] bArr) {
        return calculateFingerprint(bArr, 160);
    }

    public Fingerprint(byte[] bArr, boolean z) {
        if (z) {
            this.getHighSpeedVideoFpsRanges = calculateFingerprintSHA512_160(bArr);
        } else {
            this.getHighSpeedVideoFpsRanges = calculateFingerprint(bArr);
        }
    }

    public Fingerprint(byte[] bArr, int i) {
        this.getHighSpeedVideoFpsRanges = calculateFingerprint(bArr, i);
    }

    public Fingerprint(byte[] bArr) {
        this(bArr, 160);
    }
}
