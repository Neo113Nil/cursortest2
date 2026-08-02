package kotlin.io;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ExceptionsKt {
    public static final /* synthetic */ java.lang.String access$constructMessage(java.io.File file, java.io.File file2, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> ".concat(java.lang.String.valueOf(file2)));
        }
        if (str != null) {
            sb.append(": ".concat(java.lang.String.valueOf(str)));
        }
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }
}
