package com.iovation.mobile.android.d;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f3941a;

    static {
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(charset, "");
        byte[] bytes = "0740".getBytes(charset);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        f3941a = bytes;
    }

    public static java.lang.String a(java.util.concurrent.ConcurrentHashMap concurrentHashMap) {
        java.util.Formatter formatter = new java.util.Formatter(new java.lang.StringBuilder());
        try {
            formatter.format("%04x", java.lang.Integer.valueOf(concurrentHashMap.size()));
            for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                java.lang.String str2 = (java.lang.String) entry.getValue();
                a(formatter, str);
                a(formatter, str2);
            }
            java.lang.String obj = formatter.toString();
            kotlin.io.CloseableKt.closeFinally(formatter, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            return obj;
        } finally {
        }
    }

    public static void a(java.util.Formatter formatter, java.lang.String str) {
        try {
            java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(charset, "");
            byte[] bytes = str.getBytes(charset);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
            formatter.format("%04x", java.lang.Integer.valueOf(bytes.length));
            formatter.format("%s", str);
        } catch (java.io.UnsupportedEncodingException unused) {
        }
    }

    public static java.lang.String a(java.lang.String str) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byteArrayOutputStream.write(f3941a);
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(charset, "");
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        byteArrayOutputStream.write(bytes);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        kotlin.jvm.internal.Intrinsics.checkNotNull(byteArray);
        byte[] bArr = new byte[(((byteArray.length / 16384) + 1) * 5) + byteArray.length + 6];
        java.util.zip.Deflater deflater = new java.util.zip.Deflater(-1, true);
        deflater.setStrategy(0);
        deflater.setInput(byteArray);
        deflater.finish();
        deflater.deflate(bArr);
        int totalOut = deflater.getTotalOut();
        deflater.end();
        byte[] bArr2 = new byte[totalOut];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, totalOut);
        return "0740".concat(com.iovation.mobile.android.d.c.b(bArr2));
    }
}
