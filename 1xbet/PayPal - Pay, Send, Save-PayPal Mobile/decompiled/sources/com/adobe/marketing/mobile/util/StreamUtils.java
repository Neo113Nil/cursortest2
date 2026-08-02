package com.adobe.marketing.mobile.util;

/* loaded from: classes7.dex */
public final class StreamUtils {
    private StreamUtils() {
    }

    public static java.lang.String readAsString(java.io.InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        try {
            try {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr, 0, 1024);
                        if (read == -1) {
                            java.lang.String str = new java.lang.String(byteArrayOutputStream.toByteArray(), java.nio.charset.StandardCharsets.UTF_8);
                            byteArrayOutputStream.close();
                            try {
                                inputStream.close();
                                return str;
                            } catch (java.io.IOException e) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to close InputStream,");
                                sb.append(e.getLocalizedMessage());
                                com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "StreamUtils", sb.toString(), new java.lang.Object[0]);
                                return str;
                            }
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                } catch (java.lang.Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th3) {
                try {
                    inputStream.close();
                } catch (java.io.IOException e2) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unable to close InputStream,");
                    sb2.append(e2.getLocalizedMessage());
                    com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "StreamUtils", sb2.toString(), new java.lang.Object[0]);
                }
                throw th3;
            }
        } catch (java.io.IOException e3) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append("Unable to convert InputStream to String,");
            sb3.append(e3.getLocalizedMessage());
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "StreamUtils", sb3.toString(), new java.lang.Object[0]);
            try {
                inputStream.close();
            } catch (java.io.IOException e4) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Unable to close InputStream,");
                sb4.append(e4.getLocalizedMessage());
                com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "StreamUtils", sb4.toString(), new java.lang.Object[0]);
            }
            return null;
        }
    }
}
