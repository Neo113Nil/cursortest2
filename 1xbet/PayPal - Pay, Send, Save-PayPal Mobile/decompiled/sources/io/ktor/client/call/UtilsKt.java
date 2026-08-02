package io.ktor.client.call;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a)\u0010\u0006\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "contentLength", "bodySize", "Lio/ktor/http/HttpMethod;", "method", "", "checkContentLength", "(Ljava/lang/Long;JLio/ktor/http/HttpMethod;)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UtilsKt {
    public static final void checkContentLength(java.lang.Long l, long j, io.ktor.http.HttpMethod httpMethod) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMethod, "");
        if (l == null || l.longValue() < 0 || kotlin.jvm.internal.Intrinsics.areEqual(httpMethod, io.ktor.http.HttpMethod.INSTANCE.getHead()) || l.longValue() == j) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Content-Length mismatch: expected ");
        sb.append(l);
        sb.append(" bytes, but received ");
        sb.append(j);
        sb.append(" bytes");
        throw new java.lang.IllegalStateException(sb.toString().toString());
    }
}
