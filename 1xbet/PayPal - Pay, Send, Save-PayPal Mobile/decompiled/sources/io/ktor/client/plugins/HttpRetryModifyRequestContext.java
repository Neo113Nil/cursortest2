package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B-\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lio/ktor/client/plugins/HttpRetryModifyRequestContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "request", "Lio/ktor/client/statement/HttpResponse;", "response", "", "cause", "", "retryCount", "<init>", "(Lio/ktor/client/request/HttpRequestBuilder;Lio/ktor/client/statement/HttpResponse;Ljava/lang/Throwable;I)V", "Lio/ktor/client/request/HttpRequestBuilder;", "getRequest", "()Lio/ktor/client/request/HttpRequestBuilder;", "Lio/ktor/client/statement/HttpResponse;", "getResponse", "()Lio/ktor/client/statement/HttpResponse;", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", com.visa.cbp.getEncExpo.warmup, "getRetryCount", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HttpRetryModifyRequestContext {
    private final java.lang.Throwable cause;
    private final io.ktor.client.request.HttpRequestBuilder request;
    private final io.ktor.client.statement.HttpResponse response;
    private final int retryCount;

    public HttpRetryModifyRequestContext(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, io.ktor.client.statement.HttpResponse httpResponse, java.lang.Throwable th, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        this.request = httpRequestBuilder;
        this.response = httpResponse;
        this.cause = th;
        this.retryCount = i;
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

    public final int getRetryCount() {
        return this.retryCount;
    }
}
