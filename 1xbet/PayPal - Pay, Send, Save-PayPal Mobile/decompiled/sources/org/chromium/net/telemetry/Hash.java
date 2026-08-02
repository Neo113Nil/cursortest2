package org.chromium.net.telemetry;

/* loaded from: classes18.dex */
public final class Hash {
    private static final java.security.MessageDigest Camera2StreamConfigurationMap = getHighSpeedVideoSizes();
    private static final java.lang.String getHighSpeedVideoFpsRangesFor = "CronetLoggerImpl";

    private static java.security.MessageDigest getHighSpeedVideoSizes() {
        try {
            return java.security.MessageDigest.getInstance("MD5");
        } catch (java.security.NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static long hash(byte[] bArr) {
        java.security.MessageDigest messageDigest = Camera2StreamConfigurationMap;
        if (messageDigest == null || bArr == null || bArr.length == 0) {
            return 0L;
        }
        return java.nio.ByteBuffer.wrap(messageDigest.digest(bArr)).getLong();
    }

    public static long hash(java.lang.String str) {
        if (Camera2StreamConfigurationMap == null || str == null || str.isEmpty()) {
            return 0L;
        }
        return hash(str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }
}
