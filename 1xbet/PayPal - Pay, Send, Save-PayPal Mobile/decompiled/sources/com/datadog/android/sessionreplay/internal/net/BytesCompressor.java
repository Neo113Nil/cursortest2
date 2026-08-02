package com.datadog.android.sessionreplay.internal.net;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/net/BytesCompressor;", "", "<init>", "()V", "Ljava/util/zip/Deflater;", "p0", "", "p1", "Ljava/io/ByteArrayOutputStream;", "p2", "", "p3", "", "getHighSpeedVideoFpsRangesFor", "(Ljava/util/zip/Deflater;[BLjava/io/ByteArrayOutputStream;I)V", "uncompressedData", "compressBytes", "([B)[B", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BytesCompressor {
    public static final int CHECKSUM_FLAG_SIZE_IN_BYTES = 6;

    public final byte[] compressBytes(byte[] uncompressedData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uncompressedData, "");
        java.util.zip.Deflater deflater = new java.util.zip.Deflater(6);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(uncompressedData.length * 2);
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
            getHighSpeedVideoFpsRangesFor(deflater, uncompressedData, byteArrayOutputStream2, 2);
            getHighSpeedVideoFpsRangesFor(deflater, new byte[0], byteArrayOutputStream2, 3);
            deflater.end();
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            kotlin.io.CloseableKt.closeFinally(byteArrayOutputStream, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray, "");
            return byteArray;
        } finally {
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(java.util.zip.Deflater p0, byte[] p1, java.io.ByteArrayOutputStream p2, int p3) {
        byte[] bArr;
        if (p3 == 2) {
            bArr = new byte[p1.length + 6];
        } else if (p3 == 3) {
            bArr = new byte[p1.length + 8];
        } else {
            bArr = new byte[p1.length + 2];
        }
        int i = 1;
        while (true) {
            int length = bArr.length * i;
            byte[] bArr2 = new byte[length];
            if (p3 == 2) {
                p0.reset();
            }
            p0.setInput(p1);
            if (p3 == 3) {
                p0.finish();
            }
            int deflate = p0.deflate(bArr2, 0, length, p3);
            i++;
            if (deflate < length) {
                p2.write(bArr2, 0, deflate);
                return;
            }
            bArr = bArr2;
        }
    }
}
