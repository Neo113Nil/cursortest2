package io.appmetrica.analytics.coreutils.internal.io;

/* loaded from: classes.dex */
public final class InputStreamUtils {
    public static final io.appmetrica.analytics.coreutils.internal.io.InputStreamUtils INSTANCE = new io.appmetrica.analytics.coreutils.internal.io.InputStreamUtils();

    private InputStreamUtils() {
    }

    public final byte[] readSafelyApprox(int i2, s1.InterfaceC0991a interfaceC0991a) {
        try {
            java.io.InputStream inputStream = (java.io.InputStream) interfaceC0991a.invoke();
            if (inputStream != null) {
                try {
                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[8192];
                        int i3 = 0;
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (-1 == read || i3 > i2) {
                                break;
                            }
                            if (read > 0) {
                                byteArrayOutputStream.write(bArr, 0, read);
                                i3 += read;
                            }
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        Q1.d.g(byteArrayOutputStream, null);
                        Q1.d.g(inputStream, null);
                        return byteArray;
                    } catch (java.lang.Throwable unused) {
                        Q1.d.g(byteArrayOutputStream, null);
                        Q1.d.g(inputStream, null);
                    }
                } finally {
                }
            }
        } catch (java.lang.Throwable unused2) {
        }
        return new byte[0];
    }
}
