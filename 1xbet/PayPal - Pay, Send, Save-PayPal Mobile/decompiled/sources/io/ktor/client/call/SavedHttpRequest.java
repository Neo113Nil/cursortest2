package io.ktor.client.call;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 "}, d2 = {"Lio/ktor/client/call/SavedHttpRequest;", "Lio/ktor/client/request/HttpRequest;", "Lio/ktor/client/call/SavedHttpCall;", androidx.core.app.NotificationCompat.CATEGORY_CALL, "origin", "<init>", "(Lio/ktor/client/call/SavedHttpCall;Lio/ktor/client/request/HttpRequest;)V", "Lio/ktor/client/call/SavedHttpCall;", "getCall", "()Lio/ktor/client/call/SavedHttpCall;", "Lio/ktor/util/Attributes;", "getAttributes", "()Lio/ktor/util/Attributes;", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "Lio/ktor/http/content/OutgoingContent;", "getContent", "()Lio/ktor/http/content/OutgoingContent;", "content", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lio/ktor/http/Headers;", "getHeaders", "()Lio/ktor/http/Headers;", "headers", "Lio/ktor/http/HttpMethod;", "getMethod", "()Lio/ktor/http/HttpMethod;", "method", "Lio/ktor/http/Url;", "getUrl", "()Lio/ktor/http/Url;", "url"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SavedHttpRequest implements io.ktor.client.request.HttpRequest {
    private final io.ktor.client.call.SavedHttpCall call;
    private final /* synthetic */ io.ktor.client.request.HttpRequest getHighSpeedVideoSizes;

    public SavedHttpRequest(io.ktor.client.call.SavedHttpCall savedHttpCall, io.ktor.client.request.HttpRequest httpRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedHttpCall, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequest, "");
        this.getHighSpeedVideoSizes = httpRequest;
        this.call = savedHttpCall;
    }

    @Override // io.ktor.client.request.HttpRequest
    public final io.ktor.client.call.SavedHttpCall getCall() {
        return this.call;
    }

    @Override // io.ktor.client.request.HttpRequest
    /* renamed from: getUrl */
    public final io.ktor.http.Url getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoSizes.getGetHighSpeedVideoFpsRanges();
    }

    @Override // io.ktor.client.request.HttpRequest
    /* renamed from: getMethod */
    public final io.ktor.http.HttpMethod getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes.getGetHighSpeedVideoSizes();
    }

    @Override // io.ktor.http.HttpMessage
    /* renamed from: getHeaders */
    public final io.ktor.http.Headers getGetHighSpeedVideoSizesFor() {
        return this.getHighSpeedVideoSizes.getGetHighSpeedVideoSizesFor();
    }

    @Override // io.ktor.client.request.HttpRequest, kotlinx.coroutines.CoroutineScope
    public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return this.getHighSpeedVideoSizes.getCoroutineContext();
    }

    @Override // io.ktor.client.request.HttpRequest
    /* renamed from: getContent */
    public final io.ktor.http.content.OutgoingContent getCamera2StreamConfigurationMap() {
        return this.getHighSpeedVideoSizes.getCamera2StreamConfigurationMap();
    }

    @Override // io.ktor.client.request.HttpRequest
    /* renamed from: getAttributes */
    public final io.ktor.util.Attributes getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighSpeedVideoSizes.getGetHighResolutionOutputSizeshNQ4ISI();
    }
}
