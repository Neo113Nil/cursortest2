package org.apache.commons.imaging.common;

/* loaded from: classes17.dex */
public final class BinaryFunctions {
    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(org.apache.commons.imaging.common.BinaryFunctions.class.getName());

    public static int charsToQuad(char c, char c2, char c3, char c4) {
        return ((c & 255) << 24) | ((c2 & 255) << 16) | ((c3 & 255) << 8) | (c4 & 255);
    }

    private BinaryFunctions() {
    }

    public static boolean startsWith(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length > bArr.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr2[i] != bArr[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean startsWith(byte[] bArr, org.apache.commons.imaging.common.BinaryConstant binaryConstant) {
        if (bArr == null || bArr.length < binaryConstant.size()) {
            return false;
        }
        for (int i = 0; i < binaryConstant.size(); i++) {
            if (bArr[i] != binaryConstant.get(i)) {
                return false;
            }
        }
        return true;
    }

    public static byte readByte(java.lang.String str, java.io.InputStream inputStream, java.lang.String str2) throws java.io.IOException {
        int read = inputStream.read();
        if (read >= 0) {
            return (byte) (read & 255);
        }
        throw new java.io.IOException(str2);
    }

    public static byte[] readBytes(java.lang.String str, java.io.InputStream inputStream, int i) throws java.io.IOException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(" could not be read.");
        return readBytes(str, inputStream, i, sb.toString());
    }

    public static byte[] readBytes(java.lang.String str, java.io.InputStream inputStream, int i, java.lang.String str2) throws java.io.IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read < 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str2);
                sb.append(" count: ");
                sb.append(read);
                sb.append(" read: ");
                sb.append(i2);
                sb.append(" length: ");
                sb.append(i);
                throw new java.io.IOException(sb.toString());
            }
            i2 += read;
        }
        return bArr;
    }

    public static byte[] readBytes(java.io.InputStream inputStream, int i) throws java.io.IOException {
        return readBytes("", inputStream, i, "Unexpected EOF");
    }

    public static void readAndVerifyBytes(java.io.InputStream inputStream, byte[] bArr, java.lang.String str) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        for (byte b : bArr) {
            int read = inputStream.read();
            byte b2 = (byte) (read & 255);
            if (read < 0) {
                throw new org.apache.commons.imaging.ImageReadException("Unexpected EOF.");
            }
            if (b2 != b) {
                throw new org.apache.commons.imaging.ImageReadException(str);
            }
        }
    }

    public static void readAndVerifyBytes(java.io.InputStream inputStream, org.apache.commons.imaging.common.BinaryConstant binaryConstant, java.lang.String str) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        for (int i = 0; i < binaryConstant.size(); i++) {
            int read = inputStream.read();
            byte b = (byte) (read & 255);
            if (read < 0) {
                throw new org.apache.commons.imaging.ImageReadException("Unexpected EOF.");
            }
            if (b != binaryConstant.get(i)) {
                throw new org.apache.commons.imaging.ImageReadException(str);
            }
        }
    }

    public static void skipBytes(java.io.InputStream inputStream, long j, java.lang.String str) throws java.io.IOException {
        long j2 = 0;
        while (j != j2) {
            long skip = inputStream.skip(j - j2);
            if (skip < 1) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(" (");
                sb.append(skip);
                sb.append(")");
                throw new java.io.IOException(sb.toString());
            }
            j2 += skip;
        }
    }

    public static byte[] remainingBytes(java.lang.String str, byte[] bArr, int i) {
        return slice(bArr, i, bArr.length - i);
    }

    public static byte[] slice(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public static byte[] head(byte[] bArr, int i) {
        if (i > bArr.length) {
            i = bArr.length;
        }
        return slice(bArr, 0, i);
    }

    public static boolean compareBytes(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (bArr.length < i + i3 || bArr2.length < i2 + i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i + i4] != bArr2[i2 + i4]) {
                return false;
            }
        }
        return true;
    }

    public static int read4Bytes(java.lang.String str, java.io.InputStream inputStream, java.lang.String str2, java.nio.ByteOrder byteOrder) throws java.io.IOException {
        int read = inputStream.read();
        int read2 = inputStream.read();
        int read3 = inputStream.read();
        int read4 = inputStream.read();
        if ((read | read2 | read3 | read4) < 0) {
            throw new java.io.IOException(str2);
        }
        if (byteOrder == java.nio.ByteOrder.BIG_ENDIAN) {
            read = (read << 24) | (read2 << 16) | (read3 << 8);
        } else {
            read4 = (read4 << 24) | (read3 << 16) | (read2 << 8);
        }
        return read | read4;
    }

    public static int read3Bytes(java.lang.String str, java.io.InputStream inputStream, java.lang.String str2, java.nio.ByteOrder byteOrder) throws java.io.IOException {
        int read = inputStream.read();
        int read2 = inputStream.read();
        int read3 = inputStream.read();
        if ((read | read2 | read3) < 0) {
            throw new java.io.IOException(str2);
        }
        if (byteOrder == java.nio.ByteOrder.BIG_ENDIAN) {
            read = (read << 16) | (read2 << 8);
        } else {
            read3 = (read3 << 16) | (read2 << 8);
        }
        return read | read3;
    }

    public static int read2Bytes(java.lang.String str, java.io.InputStream inputStream, java.lang.String str2, java.nio.ByteOrder byteOrder) throws java.io.IOException {
        int read = inputStream.read();
        int read2 = inputStream.read();
        if ((read | read2) < 0) {
            throw new java.io.IOException(str2);
        }
        if (byteOrder == java.nio.ByteOrder.BIG_ENDIAN) {
            read <<= 8;
        } else {
            read2 <<= 8;
        }
        return read | read2;
    }

    public static void printCharQuad(java.lang.String str, int i) {
        java.util.logging.Logger logger = LOGGER;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(": '");
        sb.append((char) ((i >> 24) & 255));
        sb.append((char) ((i >> 16) & 255));
        sb.append((char) ((i >> 8) & 255));
        sb.append((char) (i & 255));
        sb.append("'");
        logger.finest(sb.toString());
    }

    public static void printCharQuad(java.io.PrintWriter printWriter, java.lang.String str, int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(": '");
        sb.append((char) ((i >> 24) & 255));
        sb.append((char) ((i >> 16) & 255));
        sb.append((char) ((i >> 8) & 255));
        sb.append((char) (i & 255));
        sb.append("'");
        printWriter.println(sb.toString());
    }

    public static void printByteBits(java.lang.String str, byte b) {
        java.util.logging.Logger logger = LOGGER;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(": '");
        sb.append(java.lang.Integer.toBinaryString(b & 255));
        logger.finest(sb.toString());
    }

    public static byte[] quadsToByteArray(int i) {
        return new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i};
    }

    public static boolean searchQuad(int i, java.io.InputStream inputStream) throws java.io.IOException {
        byte[] quadsToByteArray = quadsToByteArray(i);
        while (true) {
            int i2 = 0;
            do {
                int read = inputStream.read();
                if (read == -1) {
                    return false;
                }
                if (quadsToByteArray[i2] == read) {
                    i2++;
                }
            } while (i2 != quadsToByteArray.length);
            return true;
        }
    }

    public static int findNull(byte[] bArr) {
        return findNull(bArr, 0);
    }

    public static int findNull(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static byte[] getRAFBytes(java.io.RandomAccessFile randomAccessFile, long j, int i, java.lang.String str) throws java.io.IOException {
        byte[] bArr = new byte[i];
        randomAccessFile.seek(j);
        int i2 = 0;
        while (i2 < i) {
            int read = randomAccessFile.read(bArr, i2, i - i2);
            if (read < 0) {
                throw new java.io.IOException(str);
            }
            i2 += read;
        }
        return bArr;
    }

    public static void skipBytes(java.io.InputStream inputStream, long j) throws java.io.IOException {
        skipBytes(inputStream, j, "Couldn't skip bytes");
    }

    public static void copyStreamToStream(java.io.InputStream inputStream, java.io.OutputStream outputStream) throws java.io.IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    public static byte[] getStreamBytes(java.io.InputStream inputStream) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        copyStreamToStream(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
