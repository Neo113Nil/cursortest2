package kotlin.io.encoding;

/* compiled from: Base64JVM.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a%\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0081\b\u001a%\u0010\b\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0081\b\u001a5\u0010\n\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0081\b\u001a%\u0010\r\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0081\b¨\u0006\u000e"}, d2 = {"platformCharsToBytes", "", "Lkotlin/io/encoding/Base64;", "source", "", "startIndex", "", "endIndex", "platformEncodeToString", "", "platformEncodeIntoByteArray", "destination", "destinationOffset", "platformEncodeToByteArray", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Base64JVMKt {
    private static final byte[] platformCharsToBytes(kotlin.io.encoding.Base64 base64, java.lang.CharSequence source, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base64, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        if (source instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) source;
            base64.checkSourceBounds$kotlin_stdlib(str.length(), i, i2);
            java.lang.String substring = str.substring(i, i2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            java.nio.charset.Charset charset = kotlin.text.Charsets.ISO_8859_1;
            kotlin.jvm.internal.Intrinsics.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = substring.getBytes(charset);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return bytes;
        }
        return base64.charsToBytesImpl$kotlin_stdlib(source, i, i2);
    }

    private static final java.lang.String platformEncodeToString(kotlin.io.encoding.Base64 base64, byte[] source, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base64, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        return new java.lang.String(base64.encodeToByteArrayImpl$kotlin_stdlib(source, i, i2), kotlin.text.Charsets.ISO_8859_1);
    }

    private static final int platformEncodeIntoByteArray(kotlin.io.encoding.Base64 base64, byte[] source, byte[] destination, int i, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base64, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "destination");
        return base64.encodeIntoByteArrayImpl$kotlin_stdlib(source, destination, i, i2, i3);
    }

    private static final byte[] platformEncodeToByteArray(kotlin.io.encoding.Base64 base64, byte[] source, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base64, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        return base64.encodeToByteArrayImpl$kotlin_stdlib(source, i, i2);
    }
}
