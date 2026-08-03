package androidx.multidex;

/* loaded from: classes2.dex */
final class ZipUtil {
    private static final int BUFFER_SIZE = 16384;
    private static final int ENDHDR = 22;
    private static final int ENDSIG = 101010256;

    static class CentralDirectory {
        long offset;
        long size;

        CentralDirectory() {
        }
    }

    ZipUtil() {
    }

    static long getZipCrc(java.io.File file) throws java.io.IOException {
        java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(file, com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
        try {
            return computeCrcOfCentralDir(randomAccessFile, findCentralDirectory(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }

    static androidx.multidex.ZipUtil.CentralDirectory findCentralDirectory(java.io.RandomAccessFile randomAccessFile) throws java.io.IOException, java.util.zip.ZipException {
        long length = randomAccessFile.length();
        long j = length - 22;
        if (j < 0) {
            throw new java.util.zip.ZipException("File too short to be a zip file: " + randomAccessFile.length());
        }
        long j2 = length - 65558;
        long j3 = j2 >= 0 ? j2 : 0L;
        int reverseBytes = java.lang.Integer.reverseBytes(ENDSIG);
        do {
            randomAccessFile.seek(j);
            if (randomAccessFile.readInt() == reverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                androidx.multidex.ZipUtil.CentralDirectory centralDirectory = new androidx.multidex.ZipUtil.CentralDirectory();
                centralDirectory.size = java.lang.Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                centralDirectory.offset = java.lang.Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                return centralDirectory;
            }
            j--;
        } while (j >= j3);
        throw new java.util.zip.ZipException("End Of Central Directory signature not found");
    }

    static long computeCrcOfCentralDir(java.io.RandomAccessFile randomAccessFile, androidx.multidex.ZipUtil.CentralDirectory centralDirectory) throws java.io.IOException {
        java.util.zip.CRC32 crc32 = new java.util.zip.CRC32();
        long j = centralDirectory.size;
        randomAccessFile.seek(centralDirectory.offset);
        byte[] bArr = new byte[16384];
        int read = randomAccessFile.read(bArr, 0, (int) java.lang.Math.min(16384L, j));
        while (read != -1) {
            crc32.update(bArr, 0, read);
            j -= read;
            if (j == 0) {
                break;
            }
            read = randomAccessFile.read(bArr, 0, (int) java.lang.Math.min(16384L, j));
        }
        return crc32.getValue();
    }
}
