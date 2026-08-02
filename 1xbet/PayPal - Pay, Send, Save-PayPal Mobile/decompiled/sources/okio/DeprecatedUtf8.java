package okio;

@kotlin.Deprecated(message = "changed in Okio 2.x")
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0007\u0010\f"}, d2 = {"Lokio/-DeprecatedUtf8;", "", "<init>", "()V", "", "string", "", io.ktor.http.ContentDisposition.Parameters.Size, "(Ljava/lang/String;)J", "", "beginIndex", "endIndex", "(Ljava/lang/String;II)J"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* renamed from: okio.-DeprecatedUtf8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class DeprecatedUtf8 {
    public static final okio.DeprecatedUtf8 INSTANCE = new okio.DeprecatedUtf8();

    private DeprecatedUtf8() {
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "string.utf8Size()", imports = {"okio.utf8Size"}))
    public final long size(java.lang.String string) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "");
        return okio.Utf8.size$default(string, 0, 0, 3, null);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "string.utf8Size(beginIndex, endIndex)", imports = {"okio.utf8Size"}))
    public final long size(java.lang.String string, int beginIndex, int endIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "");
        return okio.Utf8.size(string, beginIndex, endIndex);
    }
}
