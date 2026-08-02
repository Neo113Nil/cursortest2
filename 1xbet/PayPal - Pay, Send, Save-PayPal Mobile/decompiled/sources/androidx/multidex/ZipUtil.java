package androidx.multidex;

/* loaded from: classes7.dex */
final class ZipUtil {

    static class CentralDirectory {
        long Camera2StreamConfigurationMap;
        long getHighSpeedVideoSizes;

        CentralDirectory() {
        }
    }

    ZipUtil() {
    }

    static long Camera2StreamConfigurationMap(java.io.File file) throws java.io.IOException {
        java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(file, "r");
        try {
            long length = randomAccessFile.length();
            long j = length - 22;
            if (j < 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("File too short to be a zip file: ");
                sb.append(randomAccessFile.length());
                throw new java.util.zip.ZipException(sb.toString());
            }
            long j2 = length - 65558;
            if (j2 < 0) {
                j2 = 0;
            }
            int reverseBytes = java.lang.Integer.reverseBytes(101010256);
            do {
                randomAccessFile.seek(j);
                if (randomAccessFile.readInt() == reverseBytes) {
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    androidx.multidex.ZipUtil.CentralDirectory centralDirectory = new androidx.multidex.ZipUtil.CentralDirectory();
                    centralDirectory.Camera2StreamConfigurationMap = java.lang.Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                    centralDirectory.getHighSpeedVideoSizes = java.lang.Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                    java.util.zip.CRC32 crc32 = new java.util.zip.CRC32();
                    long j3 = centralDirectory.Camera2StreamConfigurationMap;
                    randomAccessFile.seek(centralDirectory.getHighSpeedVideoSizes);
                    byte[] bArr = new byte[16384];
                    int read = randomAccessFile.read(bArr, 0, (int) java.lang.Math.min(okhttp3.internal.http2.Http2Stream.EMIT_BUFFER_SIZE, j3));
                    while (read != -1) {
                        crc32.update(bArr, 0, read);
                        j3 -= read;
                        if (j3 == 0) {
                            break;
                        }
                        read = randomAccessFile.read(bArr, 0, (int) java.lang.Math.min(okhttp3.internal.http2.Http2Stream.EMIT_BUFFER_SIZE, j3));
                    }
                    return crc32.getValue();
                }
                j--;
            } while (j >= j2);
            throw new java.util.zip.ZipException("End Of Central Directory signature not found");
        } finally {
            randomAccessFile.close();
        }
    }
}
