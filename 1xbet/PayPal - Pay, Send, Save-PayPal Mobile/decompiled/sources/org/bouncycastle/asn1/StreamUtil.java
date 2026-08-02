package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
class StreamUtil {
    private static final long Camera2StreamConfigurationMap = java.lang.Runtime.getRuntime().maxMemory();

    static int Camera2StreamConfigurationMap(java.io.InputStream inputStream) {
        if (inputStream instanceof org.bouncycastle.asn1.LimitedInputStream) {
            return ((org.bouncycastle.asn1.LimitedInputStream) inputStream).getHighSpeedVideoFpsRangesFor;
        }
        if (inputStream instanceof org.bouncycastle.asn1.ASN1InputStream) {
            return ((org.bouncycastle.asn1.ASN1InputStream) inputStream).getHighSpeedVideoFpsRangesFor;
        }
        if (inputStream instanceof java.io.ByteArrayInputStream) {
            return ((java.io.ByteArrayInputStream) inputStream).available();
        }
        if (inputStream instanceof java.io.FileInputStream) {
            try {
                java.nio.channels.FileChannel channel = ((java.io.FileInputStream) inputStream).getChannel();
                long size = channel != null ? channel.size() : 2147483647L;
                if (size < androidx.collection.SieveCacheKt.NodeLinkMask) {
                    return (int) size;
                }
            } catch (java.io.IOException unused) {
            }
        }
        long j = Camera2StreamConfigurationMap;
        if (j > androidx.collection.SieveCacheKt.NodeLinkMask) {
            return Integer.MAX_VALUE;
        }
        return (int) j;
    }

    StreamUtil() {
    }
}
