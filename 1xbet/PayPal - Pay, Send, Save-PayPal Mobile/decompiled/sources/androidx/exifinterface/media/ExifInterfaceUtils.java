package androidx.exifinterface.media;

/* loaded from: classes7.dex */
class ExifInterfaceUtils {
    private ExifInterfaceUtils() {
    }

    static int getHighResolutionOutputSizeshNQ4ISI(java.io.InputStream inputStream, java.io.OutputStream outputStream) throws java.io.IOException {
        byte[] bArr = new byte[8192];
        int i = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return i;
            }
            i += read;
            outputStream.write(bArr, 0, read);
        }
    }

    static void getHighResolutionOutputSizeshNQ4ISI(java.io.InputStream inputStream, java.io.OutputStream outputStream, int i) throws java.io.IOException {
        byte[] bArr = new byte[8192];
        while (i > 0) {
            int min = java.lang.Math.min(i, 8192);
            int read = inputStream.read(bArr, 0, min);
            if (read != min) {
                throw new java.io.IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
            i -= read;
            outputStream.write(bArr, 0, read);
        }
    }

    static long[] getHighSpeedVideoSizes(java.lang.Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = iArr[i];
            }
            return jArr;
        }
        if (obj instanceof long[]) {
            return (long[]) obj;
        }
        return null;
    }

    static boolean getHighSpeedVideoFpsRangesFor(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    static long getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        try {
            int min = java.lang.Math.min(str.length(), 3);
            long parseLong = java.lang.Long.parseLong(str.substring(0, min));
            while (min < 3) {
                parseLong *= 10;
                min++;
            }
            return parseLong;
        } catch (java.lang.NumberFormatException unused) {
            return 0L;
        }
    }

    static void getHighResolutionOutputSizeshNQ4ISI(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.lang.RuntimeException e) {
                throw e;
            } catch (java.lang.Exception unused) {
            }
        }
    }

    static void getHighSpeedVideoFpsRanges(java.io.FileDescriptor fileDescriptor) {
        try {
            android.system.Os.close(fileDescriptor);
        } catch (android.system.ErrnoException unused) {
        }
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static void getHighSpeedVideoFpsRangesFor(android.media.MediaMetadataRetriever mediaMetadataRetriever, android.media.MediaDataSource mediaDataSource) {
            mediaMetadataRetriever.setDataSource(mediaDataSource);
        }
    }
}
