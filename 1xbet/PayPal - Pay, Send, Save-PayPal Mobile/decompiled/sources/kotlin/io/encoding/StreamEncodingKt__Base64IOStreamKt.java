package kotlin.io.encoding;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0006\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljava/io/InputStream;", "Lkotlin/io/encoding/Base64;", "base64", "decodingWith", "(Ljava/io/InputStream;Lkotlin/io/encoding/Base64;)Ljava/io/InputStream;", "Ljava/io/OutputStream;", "encodingWith", "(Ljava/io/OutputStream;Lkotlin/io/encoding/Base64;)Ljava/io/OutputStream;"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/io/encoding/StreamEncodingKt")
/* loaded from: classes17.dex */
class StreamEncodingKt__Base64IOStreamKt {
    public static final java.io.InputStream decodingWith(java.io.InputStream inputStream, kotlin.io.encoding.Base64 base64) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputStream, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base64, "");
        return new kotlin.io.encoding.DecodeInputStream(inputStream, base64);
    }

    public static final java.io.OutputStream encodingWith(java.io.OutputStream outputStream, kotlin.io.encoding.Base64 base64) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputStream, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base64, "");
        return new kotlin.io.encoding.EncodeOutputStream(outputStream, base64);
    }
}
