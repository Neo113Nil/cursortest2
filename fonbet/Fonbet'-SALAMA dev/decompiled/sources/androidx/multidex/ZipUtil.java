package androidx.multidex;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* loaded from: classes.dex */
final class ZipUtil {
    private static final int BUFFER_SIZE = 16384;
    private static final int ENDHDR = 22;
    private static final int ENDSIG = 101010256;

    public static class CentralDirectory {
        long offset;
        long size;
    }

    public static long computeCrcOfCentralDir(RandomAccessFile randomAccessFile, CentralDirectory centralDirectory) {
        CRC32 crc32 = new CRC32();
        long j = centralDirectory.size;
        randomAccessFile.seek(centralDirectory.offset);
        int min = (int) Math.min(16384L, j);
        byte[] bArr = new byte[BUFFER_SIZE];
        int read = randomAccessFile.read(bArr, 0, min);
        while (read != -1) {
            crc32.update(bArr, 0, read);
            j -= read;
            if (j == 0) {
                break;
            }
            read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j));
        }
        return crc32.getValue();
    }

    public static CentralDirectory findCentralDirectory(RandomAccessFile randomAccessFile) {
        long length = randomAccessFile.length();
        long j = length - 22;
        if (j < 0) {
            throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
        }
        long j3 = length - 65558;
        long j7 = j3 >= 0 ? j3 : 0L;
        int reverseBytes = Integer.reverseBytes(ENDSIG);
        do {
            randomAccessFile.seek(j);
            if (randomAccessFile.readInt() == reverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                CentralDirectory centralDirectory = new CentralDirectory();
                centralDirectory.size = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                centralDirectory.offset = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                return centralDirectory;
            }
            j--;
        } while (j >= j7);
        throw new ZipException("End Of Central Directory signature not found");
    }

    public static long getZipCrc(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            return computeCrcOfCentralDir(randomAccessFile, findCentralDirectory(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }
}
