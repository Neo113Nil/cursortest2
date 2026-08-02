package kotlinx.io;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\"\u001c\u0010\u000b\u001a\u00020\n*\u00060\bj\u0002`\t8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Ljava/io/OutputStream;", "Lkotlinx/io/RawSink;", "asSink", "(Ljava/io/OutputStream;)Lkotlinx/io/RawSink;", "Ljava/io/InputStream;", "Lkotlinx/io/RawSource;", "asSource", "(Ljava/io/InputStream;)Lkotlinx/io/RawSource;", "Ljava/lang/AssertionError;", "Lkotlin/getOutputSizes;", "", "isAndroidGetsocknameError", "(Ljava/lang/AssertionError;)Z"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class JvmCoreKt {
    public static final kotlinx.io.RawSink asSink(java.io.OutputStream outputStream) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputStream, "");
        return new kotlinx.io.OutputStreamSink(outputStream);
    }

    public static final kotlinx.io.RawSource asSource(java.io.InputStream inputStream) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputStream, "");
        return new kotlinx.io.InputStreamSource(inputStream);
    }

    public static final boolean isAndroidGetsocknameError(java.lang.AssertionError assertionError) {
        java.lang.String message;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assertionError, "");
        return (assertionError.getCause() == null || (message = assertionError.getMessage()) == null || !kotlin.text.StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "getsockname failed", false, 2, (java.lang.Object) null)) ? false : true;
    }
}
