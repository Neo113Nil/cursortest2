package com.izettle.android.auth;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\u0000*\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u0004\u001a\u0017\u0010\u000e\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"", "Ljava/nio/charset/Charset;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "fromBase64", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;", "Landroid/os/HandlerThread;", "Landroid/os/Handler;", "handler", "(Landroid/os/HandlerThread;)Landroid/os/Handler;", "", "toBase64", "([B)Ljava/lang/String;", "Lcom/izettle/android/net/Response;", "Lcom/izettle/android/auth/exceptions/HttpException;", "toException", "(Lcom/izettle/android/net/Response;)Lcom/izettle/android/auth/exceptions/HttpException;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExtensionsKt {
    public static final android.os.Handler handler(android.os.HandlerThread handlerThread) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handlerThread, "");
        handlerThread.start();
        return new android.os.Handler(handlerThread.getLooper());
    }

    public static final java.lang.String toBase64(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        java.lang.String encodeToString = android.util.Base64.encodeToString(bArr, 11);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encodeToString, "");
        return encodeToString;
    }

    public static /* synthetic */ java.lang.String toBase64$default(java.lang.String str, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        return toBase64(str, charset);
    }

    public static final java.lang.String toBase64(java.lang.String str, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "");
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        return toBase64(bytes);
    }

    public static /* synthetic */ java.lang.String fromBase64$default(java.lang.String str, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        return fromBase64(str, charset);
    }

    public static final java.lang.String fromBase64(java.lang.String str, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "");
        byte[] decode = android.util.Base64.decode(str, 11);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decode, "");
        return new java.lang.String(decode, charset);
    }

    public static final com.izettle.android.auth.exceptions.HttpException toException(com.izettle.android.net.Response<?> response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        return new com.izettle.android.auth.exceptions.HttpException(response.getCode(), response.getErrorBody());
    }
}
