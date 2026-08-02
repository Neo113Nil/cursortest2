package org.apache.commons.codec.cli;

/* loaded from: classes17.dex */
public class Digest {
    private final java.lang.String[] Camera2StreamConfigurationMap;
    private final java.lang.String[] getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoSizes;

    public static void main(java.lang.String[] strArr) throws java.io.IOException {
        org.apache.commons.codec.cli.Digest digest = new org.apache.commons.codec.cli.Digest(strArr);
        if (digest.getHighSpeedVideoSizes.equalsIgnoreCase("ALL") || digest.getHighSpeedVideoSizes.equals("*")) {
            for (java.lang.String str : org.apache.commons.codec.digest.MessageDigestAlgorithms.values()) {
                if (org.apache.commons.codec.digest.DigestUtils.isAvailable(str)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(str);
                    sb.append(" ");
                    digest.getHighSpeedVideoFpsRanges(sb.toString(), org.apache.commons.codec.digest.DigestUtils.getDigest(str));
                }
            }
            return;
        }
        java.security.MessageDigest digest2 = org.apache.commons.codec.digest.DigestUtils.getDigest(digest.getHighSpeedVideoSizes, null);
        if (digest2 == null) {
            digest.getHighSpeedVideoFpsRanges("", org.apache.commons.codec.digest.DigestUtils.getDigest(digest.getHighSpeedVideoSizes.toUpperCase(java.util.Locale.ROOT)));
        } else {
            digest.getHighSpeedVideoFpsRanges("", digest2);
        }
    }

    private Digest(java.lang.String[] strArr) {
        if (strArr == null) {
            throw new java.lang.IllegalArgumentException("args");
        }
        int length = strArr.length;
        if (length == 0) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Usage: java %s [algorithm] [FILE|DIRECTORY|string] ...", org.apache.commons.codec.cli.Digest.class.getName()));
        }
        this.getHighSpeedVideoFpsRanges = strArr;
        this.getHighSpeedVideoSizes = strArr[0];
        if (length <= 1) {
            this.Camera2StreamConfigurationMap = null;
        } else {
            this.Camera2StreamConfigurationMap = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr, 1, length);
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, byte[] bArr, java.lang.String str2) {
        java.io.PrintStream printStream = java.lang.System.out;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(org.apache.commons.codec.binary.Hex.encodeHexString(bArr));
        sb.append(str2 != null ? "  ".concat(java.lang.String.valueOf(str2)) : "");
        printStream.println(sb.toString());
    }

    private void getHighSpeedVideoFpsRanges(java.lang.String str, java.security.MessageDigest messageDigest) throws java.io.IOException {
        java.lang.String[] strArr = this.Camera2StreamConfigurationMap;
        if (strArr != null) {
            for (java.lang.String str2 : strArr) {
                java.io.File file = new java.io.File(str2);
                if (file.isFile()) {
                    getHighSpeedVideoFpsRangesFor(str, org.apache.commons.codec.digest.DigestUtils.digest(messageDigest, file), str2);
                } else if (file.isDirectory()) {
                    java.io.File[] listFiles = file.listFiles();
                    if (listFiles != null) {
                        getHighResolutionOutputSizeshNQ4ISI(str, messageDigest, listFiles);
                    }
                } else {
                    getHighSpeedVideoFpsRangesFor(str, org.apache.commons.codec.digest.DigestUtils.digest(messageDigest, str2.getBytes(java.nio.charset.Charset.defaultCharset())), null);
                }
            }
            return;
        }
        getHighSpeedVideoFpsRangesFor(str, org.apache.commons.codec.digest.DigestUtils.digest(messageDigest, java.lang.System.in), null);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.security.MessageDigest messageDigest, java.io.File[] fileArr) throws java.io.IOException {
        for (java.io.File file : fileArr) {
            if (file.isFile()) {
                getHighSpeedVideoFpsRangesFor(str, org.apache.commons.codec.digest.DigestUtils.digest(messageDigest, file), file.getName());
            }
        }
    }

    public java.lang.String toString() {
        return java.lang.String.format("%s %s", super.toString(), java.util.Arrays.toString(this.getHighSpeedVideoFpsRanges));
    }
}
