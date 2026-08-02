package com.plaid.internal;

/* renamed from: com.plaid.internal.v1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC0663v1 {
    public static void a(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public static java.util.LinkedHashMap b(java.lang.String str) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.String encodedQuery = android.net.Uri.parse(str).getEncodedQuery();
        if (encodedQuery != null) {
            int length = encodedQuery.length();
            int i = 0;
            while (true) {
                int indexOf = encodedQuery.indexOf(38, i);
                int i2 = indexOf != -1 ? indexOf : length;
                int indexOf2 = encodedQuery.indexOf(61, i);
                if (indexOf2 > i2 || indexOf2 == -1) {
                    indexOf2 = i2;
                }
                java.lang.String decode = android.net.Uri.decode(encodedQuery.substring(i, indexOf2));
                if (indexOf2 == i2) {
                    linkedHashMap.put(decode, "");
                } else {
                    linkedHashMap.put(decode, android.net.Uri.decode(encodedQuery.substring(indexOf2 + 1, i2)));
                }
                if (indexOf == -1) {
                    break;
                }
                i = indexOf + 1;
            }
        }
        return linkedHashMap;
    }

    public static byte[] a(java.lang.String str) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(str.length());
        java.util.zip.GZIPOutputStream gZIPOutputStream = new java.util.zip.GZIPOutputStream(byteArrayOutputStream);
        try {
            gZIPOutputStream.write(str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
            gZIPOutputStream.flush();
            a(gZIPOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (java.lang.Throwable th) {
            a(gZIPOutputStream);
            throw th;
        }
    }
}
