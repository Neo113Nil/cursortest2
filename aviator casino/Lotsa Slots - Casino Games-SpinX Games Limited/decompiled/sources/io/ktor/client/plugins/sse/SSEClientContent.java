package io.ktor.client.plugins.sse;

/* compiled from: SSEClientContent.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010(\u001a\u00020'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lio/ktor/client/plugins/sse/SSEClientContent;", "Lio/ktor/http/content/OutgoingContent$ContentWrapper;", "Lkotlin/time/Duration;", "reconnectionTime", "", "showCommentEvents", "showRetryEvents", "", "maxReconnectionAttempts", "Lkotlin/coroutines/CoroutineContext;", "callContext", "Lio/ktor/client/request/HttpRequestBuilder;", "initialRequest", "Lio/ktor/http/content/OutgoingContent;", "requestBody", "<init>", "(JZZILkotlin/coroutines/CoroutineContext;Lio/ktor/client/request/HttpRequestBuilder;Lio/ktor/http/content/OutgoingContent;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "delegate", "copy", "(Lio/ktor/http/content/OutgoingContent;)Lio/ktor/client/plugins/sse/SSEClientContent;", "J", "getReconnectionTime-UwyO8pc", "()J", "Z", "getShowCommentEvents", "()Z", "getShowRetryEvents", "I", "getMaxReconnectionAttempts", "()I", "Lkotlin/coroutines/CoroutineContext;", "getCallContext", "()Lkotlin/coroutines/CoroutineContext;", "Lio/ktor/client/request/HttpRequestBuilder;", "getInitialRequest", "()Lio/ktor/client/request/HttpRequestBuilder;", "Lio/ktor/http/Headers;", "headers", "Lio/ktor/http/Headers;", "getHeaders", "()Lio/ktor/http/Headers;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SSEClientContent extends io.ktor.http.content.OutgoingContent.ContentWrapper {
    private final kotlin.coroutines.CoroutineContext callContext;
    private final io.ktor.http.Headers headers;
    private final io.ktor.client.request.HttpRequestBuilder initialRequest;
    private final int maxReconnectionAttempts;
    private final long reconnectionTime;
    private final boolean showCommentEvents;
    private final boolean showRetryEvents;

    public /* synthetic */ SSEClientContent(long j, boolean z, boolean z2, int i, kotlin.coroutines.CoroutineContext coroutineContext, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, io.ktor.http.content.OutgoingContent outgoingContent, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, z, z2, i, coroutineContext, httpRequestBuilder, outgoingContent);
    }

    /* renamed from: getReconnectionTime-UwyO8pc, reason: not valid java name and from getter */
    public final long getReconnectionTime() {
        return this.reconnectionTime;
    }

    public final boolean getShowCommentEvents() {
        return this.showCommentEvents;
    }

    public final boolean getShowRetryEvents() {
        return this.showRetryEvents;
    }

    public final int getMaxReconnectionAttempts() {
        return this.maxReconnectionAttempts;
    }

    public final kotlin.coroutines.CoroutineContext getCallContext() {
        return this.callContext;
    }

    public final io.ktor.client.request.HttpRequestBuilder getInitialRequest() {
        return this.initialRequest;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private SSEClientContent(long j, boolean z, boolean z2, int i, kotlin.coroutines.CoroutineContext callContext, io.ktor.client.request.HttpRequestBuilder initialRequest, io.ktor.http.content.OutgoingContent requestBody) {
        super(requestBody);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callContext, "callContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialRequest, "initialRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        this.reconnectionTime = j;
        this.showCommentEvents = z;
        this.showRetryEvents = z2;
        this.maxReconnectionAttempts = i;
        this.callContext = callContext;
        this.initialRequest = initialRequest;
        io.ktor.http.HeadersBuilder headersBuilder = new io.ktor.http.HeadersBuilder(0, 1, null);
        headersBuilder.appendAll(requestBody.getHeaders());
        io.ktor.http.HeaderValueWithParametersKt.append(headersBuilder, io.ktor.http.HttpHeaders.INSTANCE.getAccept(), io.ktor.http.ContentType.Text.INSTANCE.getEventStream());
        headersBuilder.append(io.ktor.http.HttpHeaders.INSTANCE.getCacheControl(), io.ktor.client.utils.CacheControl.NO_STORE);
        this.headers = headersBuilder.build();
    }

    @Override // io.ktor.http.content.OutgoingContent.ContentWrapper, io.ktor.http.content.OutgoingContent
    public io.ktor.http.Headers getHeaders() {
        return this.headers;
    }

    public java.lang.String toString() {
        return "SSEClientContent";
    }

    @Override // io.ktor.http.content.OutgoingContent.ContentWrapper
    public io.ktor.client.plugins.sse.SSEClientContent copy(io.ktor.http.content.OutgoingContent delegate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new io.ktor.client.plugins.sse.SSEClientContent(this.reconnectionTime, this.showCommentEvents, this.showRetryEvents, this.maxReconnectionAttempts, this.callContext, this.initialRequest, delegate, null);
    }
}
