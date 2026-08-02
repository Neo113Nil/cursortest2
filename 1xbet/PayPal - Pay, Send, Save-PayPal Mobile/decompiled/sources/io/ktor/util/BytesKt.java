package io.ktor.util;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "offset", "", "readShort", "([BI)S"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class BytesKt {
    public static final short readShort(byte[] bArr, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }
}
