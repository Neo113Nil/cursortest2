package kotlin.io;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0002"}, d2 = {"", "readln", "()Ljava/lang/String;", "readlnOrNull", "readLine"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ConsoleKt {
    public static final java.lang.String readln() {
        java.lang.String readlnOrNull = readlnOrNull();
        if (readlnOrNull != null) {
            return readlnOrNull;
        }
        throw new kotlin.io.ReadAfterEOFException("EOF has already been reached");
    }

    public static final java.lang.String readlnOrNull() {
        return readLine();
    }

    public static final java.lang.String readLine() {
        kotlin.io.LineReader lineReader = kotlin.io.LineReader.INSTANCE;
        java.io.InputStream inputStream = java.lang.System.in;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inputStream, "");
        java.nio.charset.Charset defaultCharset = java.nio.charset.Charset.defaultCharset();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultCharset, "");
        return lineReader.readLine(inputStream, defaultCharset);
    }
}
