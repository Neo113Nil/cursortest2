package io.ktor.client.request;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u000f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u001e8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020#8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'"}, d2 = {"Lio/ktor/client/request/DefaultHttpRequest;", "Lio/ktor/client/request/HttpRequest;", "Lio/ktor/client/call/HttpClientCall;", androidx.core.app.NotificationCompat.CATEGORY_CALL, "Lio/ktor/client/request/HttpRequestData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lio/ktor/client/call/HttpClientCall;Lio/ktor/client/request/HttpRequestData;)V", "Lio/ktor/client/call/HttpClientCall;", "getCall", "()Lio/ktor/client/call/HttpClientCall;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lio/ktor/http/HttpMethod;", "method", "Lio/ktor/http/HttpMethod;", "getMethod", "()Lio/ktor/http/HttpMethod;", "Lio/ktor/http/Url;", "url", "Lio/ktor/http/Url;", "getUrl", "()Lio/ktor/http/Url;", "Lio/ktor/http/content/OutgoingContent;", "content", "Lio/ktor/http/content/OutgoingContent;", "getContent", "()Lio/ktor/http/content/OutgoingContent;", "Lio/ktor/http/Headers;", "headers", "Lio/ktor/http/Headers;", "getHeaders", "()Lio/ktor/http/Headers;", "Lio/ktor/util/Attributes;", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "Lio/ktor/util/Attributes;", "getAttributes", "()Lio/ktor/util/Attributes;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public class DefaultHttpRequest implements io.ktor.client.request.HttpRequest {
    private final io.ktor.util.Attributes attributes;
    private final io.ktor.client.call.HttpClientCall call;
    private final io.ktor.http.content.OutgoingContent content;
    private final io.ktor.http.Headers headers;
    private final io.ktor.http.HttpMethod method;
    private final io.ktor.http.Url url;

    public DefaultHttpRequest(io.ktor.client.call.HttpClientCall httpClientCall, io.ktor.client.request.HttpRequestData httpRequestData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientCall, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestData, "");
        this.call = httpClientCall;
        this.method = httpRequestData.getMethod();
        this.url = httpRequestData.getUrl();
        this.content = httpRequestData.getBody();
        this.headers = httpRequestData.getHeaders();
        this.attributes = httpRequestData.getAttributes();
    }

    @Override // io.ktor.client.request.HttpRequest
    public io.ktor.client.call.HttpClientCall getCall() {
        return this.call;
    }

    @Override // io.ktor.client.request.HttpRequest, kotlinx.coroutines.CoroutineScope
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return getCall().getCoroutineContext();
    }

    @Override // io.ktor.client.request.HttpRequest
    /* renamed from: getMethod, reason: from getter */
    public io.ktor.http.HttpMethod getGetHighSpeedVideoSizes() {
        return this.method;
    }

    @Override // io.ktor.client.request.HttpRequest
    /* renamed from: getUrl, reason: from getter */
    public io.ktor.http.Url getGetHighSpeedVideoFpsRanges() {
        return this.url;
    }

    @Override // io.ktor.client.request.HttpRequest
    /* renamed from: getContent, reason: from getter */
    public io.ktor.http.content.OutgoingContent getCamera2StreamConfigurationMap() {
        return this.content;
    }

    @Override // io.ktor.http.HttpMessage
    /* renamed from: getHeaders, reason: from getter */
    public io.ktor.http.Headers getGetHighSpeedVideoSizesFor() {
        return this.headers;
    }

    @Override // io.ktor.client.request.HttpRequest
    /* renamed from: getAttributes, reason: from getter */
    public io.ktor.util.Attributes getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.attributes;
    }
}
