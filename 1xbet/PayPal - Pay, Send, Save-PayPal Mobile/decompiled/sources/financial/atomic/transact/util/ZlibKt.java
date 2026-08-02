package financial.atomic.transact.util;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "compress", "(Ljava/lang/String;)[B", "decompress", "([B)Ljava/lang/String;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ZlibKt {
    public static final byte[] compress(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.nio.charset.Charset forName = java.nio.charset.Charset.forName("UTF-8");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(forName, "");
        byte[] bytes = str.getBytes(forName);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArr = new byte[bytes.length * 4];
        java.util.zip.Deflater deflater = new java.util.zip.Deflater(-1, true);
        deflater.setInput(bytes);
        deflater.finish();
        return kotlin.collections.ArraysKt.copyOfRange(bArr, 0, deflater.deflate(bArr));
    }

    public static final java.lang.String decompress(byte[] bArr) {
        int inflate;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        java.util.zip.Inflater inflater = new java.util.zip.Inflater(true);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            byte[] bArr2 = new byte[1024];
            inflater.setInput(bArr);
            do {
                inflate = inflater.inflate(bArr2);
                byteArrayOutputStream.write(bArr2, 0, inflate);
            } while (inflate != 0);
            inflater.end();
            java.lang.String byteArrayOutputStream2 = byteArrayOutputStream.toString("UTF-8");
            kotlin.io.CloseableKt.closeFinally(byteArrayOutputStream, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArrayOutputStream2, "");
            return byteArrayOutputStream2;
        } finally {
        }
    }
}
