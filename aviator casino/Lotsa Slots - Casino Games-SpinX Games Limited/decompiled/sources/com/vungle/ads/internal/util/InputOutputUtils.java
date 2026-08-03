package com.vungle.ads.internal.util;

/* compiled from: InputOutputUtils.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/util/InputOutputUtils;", "", "()V", "convertForSending", "", "stringToConvert", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class InputOutputUtils {
    public static final com.vungle.ads.internal.util.InputOutputUtils INSTANCE = new com.vungle.ads.internal.util.InputOutputUtils();

    private InputOutputUtils() {
    }

    public final java.lang.String convertForSending(java.lang.String stringToConvert) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringToConvert, "stringToConvert");
        java.util.zip.GZIPOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(stringToConvert.length());
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
            byteArrayOutputStream = new java.util.zip.GZIPOutputStream(byteArrayOutputStream2);
            try {
                java.util.zip.GZIPOutputStream gZIPOutputStream = byteArrayOutputStream;
                byte[] bytes = stringToConvert.getBytes(kotlin.text.Charsets.UTF_8);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                gZIPOutputStream.write(bytes);
                gZIPOutputStream.close();
                java.lang.String encodeToString = android.util.Base64.encodeToString(byteArrayOutputStream2.toByteArray(), 2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(compressed, Base64.NO_WRAP)");
                kotlin.io.CloseableKt.closeFinally(byteArrayOutputStream, null);
                kotlin.io.CloseableKt.closeFinally(byteArrayOutputStream, null);
                return encodeToString;
            } finally {
            }
        } finally {
        }
    }
}
