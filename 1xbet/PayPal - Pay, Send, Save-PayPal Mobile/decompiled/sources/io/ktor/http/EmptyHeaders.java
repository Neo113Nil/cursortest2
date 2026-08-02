package io.ktor.http;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010&\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00060\f0\tH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0010"}, d2 = {"Lio/ktor/http/EmptyHeaders;", "Lio/ktor/http/Headers;", "<init>", "()V", "", "p0", "", "getAll", "(Ljava/lang/String;)Ljava/util/List;", "", "names", "()Ljava/util/Set;", "", "entries", "", "isEmpty", "()Z", "toString", "()Ljava/lang/String;", "getCaseInsensitiveName", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class EmptyHeaders implements io.ktor.http.Headers {
    public static final io.ktor.http.EmptyHeaders INSTANCE = new io.ktor.http.EmptyHeaders();

    @Override // io.ktor.util.StringValues
    public final boolean getCaseInsensitiveName() {
        return true;
    }

    @Override // io.ktor.util.StringValues
    public final boolean isEmpty() {
        return true;
    }

    private EmptyHeaders() {
    }

    @Override // io.ktor.util.StringValues
    public final boolean contains(java.lang.String str) {
        return io.ktor.http.Headers.DefaultImpls.contains(this, str);
    }

    @Override // io.ktor.util.StringValues
    public final boolean contains(java.lang.String str, java.lang.String str2) {
        return io.ktor.http.Headers.DefaultImpls.contains(this, str, str2);
    }

    @Override // io.ktor.util.StringValues
    public final void forEach(kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.util.List<java.lang.String>, kotlin.Unit> function2) {
        io.ktor.http.Headers.DefaultImpls.forEach(this, function2);
    }

    @Override // io.ktor.util.StringValues
    public final java.lang.String get(java.lang.String str) {
        return io.ktor.http.Headers.DefaultImpls.get(this, str);
    }

    @Override // io.ktor.util.StringValues
    public final java.util.Set<java.lang.String> names() {
        return kotlin.collections.SetsKt.emptySet();
    }

    @Override // io.ktor.util.StringValues
    public final java.util.Set<java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>>> entries() {
        return kotlin.collections.SetsKt.emptySet();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Headers ");
        sb.append(entries());
        return sb.toString();
    }

    @Override // io.ktor.util.StringValues
    public final java.util.List<java.lang.String> getAll(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return null;
    }
}
