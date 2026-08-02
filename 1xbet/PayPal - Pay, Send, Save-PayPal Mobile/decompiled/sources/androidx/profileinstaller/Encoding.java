package androidx.profileinstaller;

/* loaded from: classes7.dex */
class Encoding {
    private Encoding() {
    }

    static int Camera2StreamConfigurationMap(java.lang.String str) {
        return str.getBytes(java.nio.charset.StandardCharsets.UTF_8).length;
    }

    private static void getHighSpeedVideoSizes(java.io.OutputStream outputStream, long j, int i) throws java.io.IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    static void getHighSpeedVideoFpsRangesFor(java.io.OutputStream outputStream, int i) throws java.io.IOException {
        getHighSpeedVideoSizes(outputStream, i, 1);
    }

    static void getHighSpeedVideoSizes(java.io.OutputStream outputStream, int i) throws java.io.IOException {
        getHighSpeedVideoSizes(outputStream, i, 2);
    }

    static void Camera2StreamConfigurationMap(java.io.OutputStream outputStream, long j) throws java.io.IOException {
        getHighSpeedVideoSizes(outputStream, j, 4);
    }

    static void getHighSpeedVideoSizes(java.io.OutputStream outputStream, java.lang.String str) throws java.io.IOException {
        outputStream.write(str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    static int getHighResolutionOutputSizeshNQ4ISI(int i) {
        return ((i + 7) & (-8)) / 8;
    }

    static byte[] getHighSpeedVideoFpsRangesFor(java.io.InputStream inputStream, int i) throws java.io.IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read < 0) {
                throw new java.lang.IllegalStateException("Not enough bytes to read: ".concat(java.lang.String.valueOf(i)));
            }
            i2 += read;
        }
        return bArr;
    }

    private static long Camera2StreamConfigurationMap(java.io.InputStream inputStream, int i) throws java.io.IOException {
        byte[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += (highSpeedVideoFpsRangesFor[i2] & 255) << (i2 * 8);
        }
        return j;
    }

    static int Camera2StreamConfigurationMap(java.io.InputStream inputStream) throws java.io.IOException {
        return (int) Camera2StreamConfigurationMap(inputStream, 1);
    }

    static int getHighSpeedVideoSizes(java.io.InputStream inputStream) throws java.io.IOException {
        return (int) Camera2StreamConfigurationMap(inputStream, 2);
    }

    static long getHighSpeedVideoFpsRangesFor(java.io.InputStream inputStream) throws java.io.IOException {
        return Camera2StreamConfigurationMap(inputStream, 4);
    }

    static java.lang.String getHighSpeedVideoSizes(java.io.InputStream inputStream, int i) throws java.io.IOException {
        return new java.lang.String(getHighSpeedVideoFpsRangesFor(inputStream, i), java.nio.charset.StandardCharsets.UTF_8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        if (r0.finished() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static byte[] getHighSpeedVideoFpsRanges(java.io.InputStream inputStream, int i, int i2) throws java.io.IOException {
        java.util.zip.Inflater inflater = new java.util.zip.Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int i4 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int read = inputStream.read(bArr2);
                if (read < 0) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected ");
                    sb.append(i);
                    sb.append(" bytes");
                    throw new java.lang.IllegalStateException(sb.toString());
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i4 += inflater.inflate(bArr, i4, i2 - i4);
                    i3 += read;
                } catch (java.util.zip.DataFormatException e) {
                    throw new java.lang.IllegalStateException(e.getMessage());
                }
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append("Didn't read enough bytes during decompression. expected=");
            sb2.append(i);
            sb2.append(" actual=");
            sb2.append(i3);
            throw new java.lang.IllegalStateException(sb2.toString());
        } finally {
            inflater.end();
        }
    }

    static void getHighSpeedVideoFpsRangesFor(java.io.OutputStream outputStream, byte[] bArr) throws java.io.IOException {
        getHighSpeedVideoSizes(outputStream, bArr.length, 4);
        byte[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(bArr);
        getHighSpeedVideoSizes(outputStream, highSpeedVideoFpsRangesFor.length, 4);
        outputStream.write(highSpeedVideoFpsRangesFor);
    }

    static byte[] getHighSpeedVideoFpsRangesFor(byte[] bArr) throws java.io.IOException {
        java.util.zip.Deflater deflater = new java.util.zip.Deflater(1);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            java.util.zip.DeflaterOutputStream deflaterOutputStream = new java.util.zip.DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (java.lang.Throwable th) {
            deflater.end();
            throw th;
        }
    }

    static void getHighSpeedVideoFpsRanges(java.io.InputStream inputStream, java.io.OutputStream outputStream, java.nio.channels.FileLock fileLock) throws java.io.IOException {
        if (fileLock == null || !fileLock.isValid()) {
            throw new java.io.IOException("Unable to acquire a lock on the underlying file channel.");
        }
        byte[] bArr = new byte[512];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    static java.lang.RuntimeException getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        return new java.lang.IllegalStateException(str);
    }
}
