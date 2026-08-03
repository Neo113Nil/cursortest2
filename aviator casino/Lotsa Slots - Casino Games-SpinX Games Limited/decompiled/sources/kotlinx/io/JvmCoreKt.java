package kotlinx.io;

/* compiled from: JvmCore.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\"\u001c\u0010\u0006\u001a\u00020\u0007*\u00060\bj\u0002`\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"asSink", "Lkotlinx/io/RawSink;", "Ljava/io/OutputStream;", "asSource", "Lkotlinx/io/RawSource;", "Ljava/io/InputStream;", "isAndroidGetsocknameError", "", "Ljava/lang/AssertionError;", "Lkotlin/AssertionError;", "(Ljava/lang/AssertionError;)Z", "kotlinx-io-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JvmCoreKt {
    public static final kotlinx.io.RawSink asSink(java.io.OutputStream outputStream) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputStream, "<this>");
        return new kotlinx.io.OutputStreamSink(outputStream);
    }

    public static final kotlinx.io.RawSource asSource(java.io.InputStream inputStream) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return new kotlinx.io.InputStreamSource(inputStream);
    }

    public static final boolean isAndroidGetsocknameError(java.lang.AssertionError assertionError) {
        java.lang.String message;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assertionError, "<this>");
        return (assertionError.getCause() == null || (message = assertionError.getMessage()) == null || !kotlin.text.StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "getsockname failed", false, 2, (java.lang.Object) null)) ? false : true;
    }
}
