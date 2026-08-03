package com.google.android.exoplayer2.upstream;

/* loaded from: classes3.dex */
public final class DataSourceUtil {
    private DataSourceUtil() {
    }

    public static byte[] readToEnd(com.google.android.exoplayer2.upstream.DataSource dataSource) throws java.io.IOException {
        byte[] bArr = new byte[1024];
        int i = 0;
        int i2 = 0;
        while (i != -1) {
            if (i2 == bArr.length) {
                bArr = java.util.Arrays.copyOf(bArr, bArr.length * 2);
            }
            i = dataSource.read(bArr, i2, bArr.length - i2);
            if (i != -1) {
                i2 += i;
            }
        }
        return java.util.Arrays.copyOf(bArr, i2);
    }

    public static byte[] readExactly(com.google.android.exoplayer2.upstream.DataSource dataSource, int i) throws java.io.IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = dataSource.read(bArr, i2, i - i2);
            if (read == -1) {
                throw new java.lang.IllegalStateException("Not enough data could be read: " + i2 + " < " + i);
            }
            i2 += read;
        }
        return bArr;
    }

    public static void closeQuietly(com.google.android.exoplayer2.upstream.DataSource dataSource) {
        if (dataSource != null) {
            try {
                dataSource.close();
            } catch (java.io.IOException unused) {
            }
        }
    }
}
