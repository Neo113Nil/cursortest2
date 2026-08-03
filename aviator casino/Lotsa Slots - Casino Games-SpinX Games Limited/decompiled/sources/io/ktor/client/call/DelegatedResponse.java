package io.ktor.client.call;

/* compiled from: DelegatedCall.kt */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B:\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R%\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010'¨\u0006+"}, d2 = {"Lio/ktor/client/call/DelegatedResponse;", "Lio/ktor/client/statement/HttpResponse;", "Lio/ktor/client/call/HttpClientCall;", "call", "origin", "Lkotlin/Function1;", "Lio/ktor/utils/io/ByteReadChannel;", "Lkotlin/ExtensionFunctionType;", "content", "Lio/ktor/http/Headers;", "headers", "<init>", "(Lio/ktor/client/call/HttpClientCall;Lio/ktor/client/statement/HttpResponse;Lkotlin/jvm/functions/Function1;Lio/ktor/http/Headers;)V", "Lio/ktor/client/call/HttpClientCall;", "getCall", "()Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/client/statement/HttpResponse;", "Lkotlin/jvm/functions/Function1;", "Lio/ktor/http/Headers;", "getHeaders", "()Lio/ktor/http/Headers;", "getRawContent", "()Lio/ktor/utils/io/ByteReadChannel;", "rawContent", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Lio/ktor/http/HttpStatusCode;", "getStatus", "()Lio/ktor/http/HttpStatusCode;", "status", "Lio/ktor/http/HttpProtocolVersion;", "getVersion", "()Lio/ktor/http/HttpProtocolVersion;", "version", "Lio/ktor/util/date/GMTDate;", "getRequestTime", "()Lio/ktor/util/date/GMTDate;", "requestTime", "getResponseTime", "responseTime", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DelegatedResponse extends io.ktor.client.statement.HttpResponse {
    private final io.ktor.client.call.HttpClientCall call;
    private final kotlin.jvm.functions.Function1<io.ktor.client.statement.HttpResponse, io.ktor.utils.io.ByteReadChannel> content;
    private final kotlin.coroutines.CoroutineContext coroutineContext;
    private final io.ktor.http.Headers headers;
    private final io.ktor.client.statement.HttpResponse origin;

    @Override // io.ktor.client.statement.HttpResponse
    public io.ktor.client.call.HttpClientCall getCall() {
        return this.call;
    }

    public /* synthetic */ DelegatedResponse(io.ktor.client.call.HttpClientCall httpClientCall, io.ktor.client.statement.HttpResponse httpResponse, kotlin.jvm.functions.Function1 function1, io.ktor.http.Headers headers, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(httpClientCall, httpResponse, function1, (i & 8) != 0 ? httpResponse.getHeaders() : headers);
    }

    @Override // io.ktor.http.HttpMessage
    public io.ktor.http.Headers getHeaders() {
        return this.headers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DelegatedResponse(io.ktor.client.call.HttpClientCall call, io.ktor.client.statement.HttpResponse origin, kotlin.jvm.functions.Function1<? super io.ktor.client.statement.HttpResponse, ? extends io.ktor.utils.io.ByteReadChannel> content, io.ktor.http.Headers headers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(origin, "origin");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        this.call = call;
        this.origin = origin;
        this.content = content;
        this.headers = headers;
        this.coroutineContext = origin.getCoroutineContext();
    }

    @Override // io.ktor.client.statement.HttpResponse
    public io.ktor.utils.io.ByteReadChannel getRawContent() {
        return this.content.invoke(this.origin);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // io.ktor.client.statement.HttpResponse
    public io.ktor.http.HttpStatusCode getStatus() {
        return this.origin.getStatus();
    }

    @Override // io.ktor.client.statement.HttpResponse
    public io.ktor.http.HttpProtocolVersion getVersion() {
        return this.origin.getVersion();
    }

    @Override // io.ktor.client.statement.HttpResponse
    public io.ktor.util.date.GMTDate getRequestTime() {
        return this.origin.getRequestTime();
    }

    @Override // io.ktor.client.statement.HttpResponse
    public io.ktor.util.date.GMTDate getResponseTime() {
        return this.origin.getResponseTime();
    }
}
