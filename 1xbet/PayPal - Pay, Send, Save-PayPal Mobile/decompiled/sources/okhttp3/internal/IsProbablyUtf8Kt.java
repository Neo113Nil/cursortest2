package okhttp3.internal;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lokio/BufferedSource;", "", "codePointLimit", "", "isProbablyUtf8", "(Lokio/BufferedSource;J)Z"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IsProbablyUtf8Kt {
    public static /* synthetic */ boolean isProbablyUtf8$default(okio.BufferedSource bufferedSource, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = Long.MAX_VALUE;
        }
        return isProbablyUtf8(bufferedSource, j);
    }

    public static final boolean isProbablyUtf8(okio.BufferedSource bufferedSource, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSource, "");
        try {
            okio.BufferedSource peek = bufferedSource.peek();
            for (long j2 = 0; j2 < j; j2++) {
                if (peek.exhausted()) {
                    return true;
                }
                int readUtf8CodePoint = peek.readUtf8CodePoint();
                if (java.lang.Character.isISOControl(readUtf8CodePoint) && !java.lang.Character.isWhitespace(readUtf8CodePoint)) {
                    return false;
                }
            }
            return true;
        } catch (java.io.EOFException unused) {
            return false;
        }
    }
}
