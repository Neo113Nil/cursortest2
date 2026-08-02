package io.ktor.client.call;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0094@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00128\u0015X\u0094D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lio/ktor/client/call/SavedHttpCall;", "Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/client/HttpClient;", "client", "Lio/ktor/client/request/HttpRequest;", "request", "Lio/ktor/client/statement/HttpResponse;", "response", "", "responseBody", "<init>", "(Lio/ktor/client/HttpClient;Lio/ktor/client/request/HttpRequest;Lio/ktor/client/statement/HttpResponse;[B)V", "Lio/ktor/utils/io/ByteReadChannel;", "getResponseContent", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "[B", "Camera2StreamConfigurationMap", "", "allowDoubleReceive", "Z", "getAllowDoubleReceive", "()Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavedHttpCall extends io.ktor.client.call.HttpClientCall {
    private final boolean allowDoubleReceive;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final byte[] Camera2StreamConfigurationMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavedHttpCall(io.ktor.client.HttpClient httpClient, io.ktor.client.request.HttpRequest httpRequest, io.ktor.client.statement.HttpResponse httpResponse, byte[] bArr) {
        super(httpClient);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequest, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpResponse, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        this.Camera2StreamConfigurationMap = bArr;
        setRequest(new io.ktor.client.call.SavedHttpRequest(this, httpRequest));
        setResponse(new io.ktor.client.call.SavedHttpResponse(this, bArr, httpResponse));
        io.ktor.client.call.UtilsKt.checkContentLength(io.ktor.http.HttpMessagePropertiesKt.contentLength(httpResponse), bArr.length, httpRequest.getMethod());
        this.allowDoubleReceive = true;
    }

    @Override // io.ktor.client.call.HttpClientCall
    protected final java.lang.Object getResponseContent(kotlin.coroutines.Continuation<? super io.ktor.utils.io.ByteReadChannel> continuation) {
        return io.ktor.utils.io.ByteChannelCtorKt.ByteReadChannel$default(this.Camera2StreamConfigurationMap, 0, 0, 6, null);
    }

    @Override // io.ktor.client.call.HttpClientCall
    protected final boolean getAllowDoubleReceive() {
        return this.allowDoubleReceive;
    }
}
