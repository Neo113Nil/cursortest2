package io.ktor.http.cio;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012"}, d2 = {"Lio/ktor/http/cio/Request;", "Lio/ktor/http/cio/HttpMessage;", "Lio/ktor/http/HttpMethod;", "method", "", "uri", "version", "Lio/ktor/http/cio/HttpHeadersMap;", "headers", "Lio/ktor/http/cio/internals/CharArrayBuilder;", "builder", "<init>", "(Lio/ktor/http/HttpMethod;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lio/ktor/http/cio/HttpHeadersMap;Lio/ktor/http/cio/internals/CharArrayBuilder;)V", "Lio/ktor/http/HttpMethod;", "getMethod", "()Lio/ktor/http/HttpMethod;", "Ljava/lang/CharSequence;", "getUri", "()Ljava/lang/CharSequence;", "getVersion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Request extends io.ktor.http.cio.HttpMessage {
    private final io.ktor.http.HttpMethod method;
    private final java.lang.CharSequence uri;
    private final java.lang.CharSequence version;

    public final io.ktor.http.HttpMethod getMethod() {
        return this.method;
    }

    public final java.lang.CharSequence getUri() {
        return this.uri;
    }

    public final java.lang.CharSequence getVersion() {
        return this.version;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Request(io.ktor.http.HttpMethod httpMethod, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, io.ktor.http.cio.HttpHeadersMap httpHeadersMap, io.ktor.http.cio.internals.CharArrayBuilder charArrayBuilder) {
        super(httpHeadersMap, charArrayBuilder);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMethod, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpHeadersMap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charArrayBuilder, "");
        this.method = httpMethod;
        this.uri = charSequence;
        this.version = charSequence2;
    }
}
