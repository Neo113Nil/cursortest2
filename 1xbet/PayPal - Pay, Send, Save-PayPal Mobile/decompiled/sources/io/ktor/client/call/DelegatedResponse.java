package io.ktor.client.call;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B:\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R%\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\n\u001a\u00020\t8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\u00020\u001c8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020)8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010+"}, d2 = {"Lio/ktor/client/call/DelegatedResponse;", "Lio/ktor/client/statement/HttpResponse;", "Lio/ktor/client/call/HttpClientCall;", androidx.core.app.NotificationCompat.CATEGORY_CALL, "origin", "Lkotlin/Function1;", "Lio/ktor/utils/io/ByteReadChannel;", "Lkotlin/ExtensionFunctionType;", "content", "Lio/ktor/http/Headers;", "headers", "<init>", "(Lio/ktor/client/call/HttpClientCall;Lio/ktor/client/statement/HttpResponse;Lkotlin/jvm/functions/Function1;Lio/ktor/http/Headers;)V", "Lio/ktor/client/call/HttpClientCall;", "getCall", "()Lio/ktor/client/call/HttpClientCall;", "getHighSpeedVideoSizes", "Lio/ktor/client/statement/HttpResponse;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRanges", "Lio/ktor/http/Headers;", "getHeaders", "()Lio/ktor/http/Headers;", "getRawContent", "()Lio/ktor/utils/io/ByteReadChannel;", "rawContent", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Lio/ktor/http/HttpStatusCode;", "getStatus", "()Lio/ktor/http/HttpStatusCode;", "status", "Lio/ktor/http/HttpProtocolVersion;", "getVersion", "()Lio/ktor/http/HttpProtocolVersion;", "version", "Lio/ktor/util/date/GMTDate;", "getRequestTime", "()Lio/ktor/util/date/GMTDate;", "requestTime", "getResponseTime", "responseTime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DelegatedResponse extends io.ktor.client.statement.HttpResponse {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<io.ktor.client.statement.HttpResponse, io.ktor.utils.io.ByteReadChannel> getHighSpeedVideoFpsRanges;
    private final io.ktor.client.call.HttpClientCall call;
    private final kotlin.coroutines.CoroutineContext coroutineContext;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final io.ktor.client.statement.HttpResponse getHighSpeedVideoFpsRangesFor;
    private final io.ktor.http.Headers headers;

    @Override // io.ktor.client.statement.HttpResponse
    public final io.ktor.client.call.HttpClientCall getCall() {
        return this.call;
    }

    public /* synthetic */ DelegatedResponse(io.ktor.client.call.HttpClientCall httpClientCall, io.ktor.client.statement.HttpResponse httpResponse, kotlin.jvm.functions.Function1 function1, io.ktor.http.Headers headers, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(httpClientCall, httpResponse, function1, (i & 8) != 0 ? httpResponse.getHeaders() : headers);
    }

    @Override // io.ktor.http.HttpMessage
    public final io.ktor.http.Headers getHeaders() {
        return this.headers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DelegatedResponse(io.ktor.client.call.HttpClientCall httpClientCall, io.ktor.client.statement.HttpResponse httpResponse, kotlin.jvm.functions.Function1<? super io.ktor.client.statement.HttpResponse, ? extends io.ktor.utils.io.ByteReadChannel> function1, io.ktor.http.Headers headers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientCall, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpResponse, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
        this.call = httpClientCall;
        this.getHighSpeedVideoFpsRangesFor = httpResponse;
        this.getHighSpeedVideoFpsRanges = function1;
        this.headers = headers;
        this.coroutineContext = httpResponse.getCoroutineContext();
    }

    @Override // io.ktor.client.statement.HttpResponse
    public final io.ktor.utils.io.ByteReadChannel getRawContent() {
        return this.getHighSpeedVideoFpsRanges.invoke(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // io.ktor.client.statement.HttpResponse
    public final io.ktor.http.HttpStatusCode getStatus() {
        return this.getHighSpeedVideoFpsRangesFor.getStatus();
    }

    @Override // io.ktor.client.statement.HttpResponse
    public final io.ktor.http.HttpProtocolVersion getVersion() {
        return this.getHighSpeedVideoFpsRangesFor.getVersion();
    }

    @Override // io.ktor.client.statement.HttpResponse
    public final io.ktor.util.date.GMTDate getRequestTime() {
        return this.getHighSpeedVideoFpsRangesFor.getRequestTime();
    }

    @Override // io.ktor.client.statement.HttpResponse
    public final io.ktor.util.date.GMTDate getResponseTime() {
        return this.getHighSpeedVideoFpsRangesFor.getResponseTime();
    }
}
