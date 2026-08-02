package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\u0018\u00002\u00020\u0001B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lio/ktor/client/plugins/HttpRetryDelayContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "request", "Lio/ktor/client/statement/HttpResponse;", "response", "", "cause", "<init>", "(Lio/ktor/client/request/HttpRequestBuilder;Lio/ktor/client/statement/HttpResponse;Ljava/lang/Throwable;)V", "Lio/ktor/client/request/HttpRequestBuilder;", "getRequest", "()Lio/ktor/client/request/HttpRequestBuilder;", "Lio/ktor/client/statement/HttpResponse;", "getResponse", "()Lio/ktor/client/statement/HttpResponse;", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HttpRetryDelayContext {
    private final java.lang.Throwable cause;
    private final io.ktor.client.request.HttpRequestBuilder request;
    private final io.ktor.client.statement.HttpResponse response;

    public HttpRetryDelayContext(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, io.ktor.client.statement.HttpResponse httpResponse, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        this.request = httpRequestBuilder;
        this.response = httpResponse;
        this.cause = th;
    }

    public final io.ktor.client.request.HttpRequestBuilder getRequest() {
        return this.request;
    }

    public final io.ktor.client.statement.HttpResponse getResponse() {
        return this.response;
    }

    public final java.lang.Throwable getCause() {
        return this.cause;
    }
}
