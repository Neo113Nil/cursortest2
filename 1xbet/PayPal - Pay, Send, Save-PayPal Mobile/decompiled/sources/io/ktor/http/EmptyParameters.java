package io.ktor.http;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010&\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00060\f0\tH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0010"}, d2 = {"Lio/ktor/http/EmptyParameters;", "Lio/ktor/http/Parameters;", "<init>", "()V", "", "name", "", "getAll", "(Ljava/lang/String;)Ljava/util/List;", "", "names", "()Ljava/util/Set;", "", "entries", "", "isEmpty", "()Z", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "getCaseInsensitiveName", "caseInsensitiveName"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class EmptyParameters implements io.ktor.http.Parameters {
    public static final io.ktor.http.EmptyParameters INSTANCE = new io.ktor.http.EmptyParameters();

    @Override // io.ktor.util.StringValues
    public final boolean getCaseInsensitiveName() {
        return true;
    }

    @Override // io.ktor.util.StringValues
    public final boolean isEmpty() {
        return true;
    }

    private EmptyParameters() {
    }

    @Override // io.ktor.util.StringValues
    public final boolean contains(java.lang.String str) {
        return io.ktor.http.Parameters.DefaultImpls.contains(this, str);
    }

    @Override // io.ktor.util.StringValues
    public final boolean contains(java.lang.String str, java.lang.String str2) {
        return io.ktor.http.Parameters.DefaultImpls.contains(this, str, str2);
    }

    @Override // io.ktor.util.StringValues
    public final void forEach(kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.util.List<java.lang.String>, kotlin.Unit> function2) {
        io.ktor.http.Parameters.DefaultImpls.forEach(this, function2);
    }

    @Override // io.ktor.util.StringValues
    public final java.lang.String get(java.lang.String str) {
        return io.ktor.http.Parameters.DefaultImpls.get(this, str);
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
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Parameters ");
        sb.append(entries());
        return sb.toString();
    }

    public final boolean equals(java.lang.Object other) {
        return (other instanceof io.ktor.http.Parameters) && ((io.ktor.http.Parameters) other).isEmpty();
    }

    @Override // io.ktor.util.StringValues
    public final java.util.List<java.lang.String> getAll(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return null;
    }
}
