package io.ktor.client.plugins.cache;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000b\u001a\u00020\u00108\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00148\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0015\u001a\u00020\u001a8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\"\u001a\u00020\u001e8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b \u0010!"}, d2 = {"Lio/ktor/client/plugins/cache/RequestForCache;", "Lio/ktor/client/request/HttpRequest;", "Lio/ktor/client/request/HttpRequestData;", "p0", "<init>", "(Lio/ktor/client/request/HttpRequestData;)V", "Lio/ktor/client/call/HttpClientCall;", "getCall", "()Lio/ktor/client/call/HttpClientCall;", "getHighSpeedVideoFpsRangesFor", "Lio/ktor/http/HttpMethod;", "getHighSpeedVideoFpsRanges", "Lio/ktor/http/HttpMethod;", "getMethod", "()Lio/ktor/http/HttpMethod;", "getHighSpeedVideoSizes", "Lio/ktor/http/Url;", "Lio/ktor/http/Url;", "getUrl", "()Lio/ktor/http/Url;", "Lio/ktor/util/Attributes;", "Camera2StreamConfigurationMap", "Lio/ktor/util/Attributes;", "getAttributes", "()Lio/ktor/util/Attributes;", "getHighResolutionOutputSizeshNQ4ISI", "Lio/ktor/http/content/OutgoingContent;", "Lio/ktor/http/content/OutgoingContent;", "getContent", "()Lio/ktor/http/content/OutgoingContent;", "Lio/ktor/http/Headers;", "Lio/ktor/http/Headers;", "getHeaders", "()Lio/ktor/http/Headers;", "getHighSpeedVideoSizesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class RequestForCache implements io.ktor.client.request.HttpRequest {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final io.ktor.util.Attributes getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final io.ktor.http.Headers getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final io.ktor.http.HttpMethod getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final io.ktor.http.Url getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final io.ktor.http.content.OutgoingContent Camera2StreamConfigurationMap;

    public RequestForCache(io.ktor.client.request.HttpRequestData httpRequestData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestData, "");
        this.getHighSpeedVideoSizes = httpRequestData.getMethod();
        this.getHighSpeedVideoFpsRanges = httpRequestData.getUrl();
        this.getHighResolutionOutputSizeshNQ4ISI = httpRequestData.getAttributes();
        this.Camera2StreamConfigurationMap = httpRequestData.getBody();
        this.getHighSpeedVideoSizesFor = httpRequestData.getHeaders();
    }

    @Override // io.ktor.client.request.HttpRequest, kotlinx.coroutines.CoroutineScope
    public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return io.ktor.client.request.HttpRequest.DefaultImpls.getCoroutineContext(this);
    }

    @Override // io.ktor.client.request.HttpRequest
    public final io.ktor.client.call.HttpClientCall getCall() {
        throw new java.lang.IllegalStateException("This request has no call");
    }

    @Override // io.ktor.client.request.HttpRequest
    /* renamed from: getMethod, reason: from getter */
    public final io.ktor.http.HttpMethod getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // io.ktor.client.request.HttpRequest
    /* renamed from: getUrl, reason: from getter */
    public final io.ktor.http.Url getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // io.ktor.client.request.HttpRequest
    /* renamed from: getAttributes, reason: from getter */
    public final io.ktor.util.Attributes getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // io.ktor.client.request.HttpRequest
    /* renamed from: getContent, reason: from getter */
    public final io.ktor.http.content.OutgoingContent getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // io.ktor.http.HttpMessage
    /* renamed from: getHeaders, reason: from getter */
    public final io.ktor.http.Headers getGetHighSpeedVideoSizesFor() {
        return this.getHighSpeedVideoSizesFor;
    }
}
