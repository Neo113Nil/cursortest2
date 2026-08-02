package io.ktor.client.engine.okhttp;

@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u00078\u0017X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u0010+\u001a\b\u0012\u0004\u0012\u00020\u00120*8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u0002000/8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u00102R \u00104\u001a\b\u0012\u0004\u0012\u000200038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107"}, d2 = {"Lio/ktor/client/engine/okhttp/OkHttpSSESession;", "Lio/ktor/client/plugins/sse/SSESession;", "Lokhttp3/sse/EventSourceListener;", "Lokhttp3/sse/EventSource$Factory;", "p0", "Lokhttp3/Request;", "p1", "Lkotlin/coroutines/CoroutineContext;", "p2", "<init>", "(Lokhttp3/sse/EventSource$Factory;Lokhttp3/Request;Lkotlin/coroutines/CoroutineContext;)V", "Lokhttp3/OkHttpClient;", "engine", "engineRequest", "callContext", "(Lokhttp3/OkHttpClient;Lokhttp3/Request;Lkotlin/coroutines/CoroutineContext;)V", "Lokhttp3/sse/EventSource;", "eventSource", "Lokhttp3/Response;", "response", "", "onOpen", "(Lokhttp3/sse/EventSource;Lokhttp3/Response;)V", "", "id", "type", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onEvent", "(Lokhttp3/sse/EventSource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "t", "onFailure", "(Lokhttp3/sse/EventSource;Ljava/lang/Throwable;Lokhttp3/Response;)V", "onClosed", "(Lokhttp3/sse/EventSource;)V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "getHighSpeedVideoFpsRanges", "Lokhttp3/sse/EventSource;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/CompletableDeferred;", "originResponse", "Lkotlinx/coroutines/CompletableDeferred;", "getOriginResponse$ktor_client_okhttp", "()Lkotlinx/coroutines/CompletableDeferred;", "Lkotlinx/coroutines/channels/Channel;", "Lio/ktor/sse/ServerSentEvent;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/channels/Channel;", "Lkotlinx/coroutines/flow/Flow;", "incoming", "Lkotlinx/coroutines/flow/Flow;", "getIncoming", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class OkHttpSSESession extends okhttp3.sse.EventSourceListener implements io.ktor.client.plugins.sse.SSESession {
    private final kotlin.coroutines.CoroutineContext coroutineContext;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.channels.Channel<io.ktor.sse.ServerSentEvent> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final okhttp3.sse.EventSource getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.Flow<io.ktor.sse.ServerSentEvent> incoming;
    private final kotlinx.coroutines.CompletableDeferred<okhttp3.Response> originResponse;

    @Override // kotlinx.coroutines.CoroutineScope
    public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    private OkHttpSSESession(okhttp3.sse.EventSource.Factory factory, okhttp3.Request request, kotlin.coroutines.CoroutineContext coroutineContext) {
        this.coroutineContext = coroutineContext;
        this.getHighSpeedVideoSizes = factory.newEventSource(request, this);
        this.originResponse = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        kotlinx.coroutines.channels.Channel<io.ktor.sse.ServerSentEvent> Channel$default = kotlinx.coroutines.channels.ChannelKt.Channel$default(8, null, null, 6, null);
        this.getHighSpeedVideoFpsRanges = Channel$default;
        this.incoming = kotlinx.coroutines.flow.FlowKt.onCompletion(kotlinx.coroutines.flow.FlowKt.consumeAsFlow(Channel$default), new io.ktor.client.engine.okhttp.OkHttpSSESession$incoming$1(this, null));
        kotlinx.coroutines.JobKt.getJob(getCoroutineContext()).invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.engine.okhttp.OkHttpSSESession$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.engine.okhttp.OkHttpSSESession.$r8$lambda$YcWTiRnFcuNYJG22_YIHGjLk3I0(io.ktor.client.engine.okhttp.OkHttpSSESession.this, (java.lang.Throwable) obj);
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OkHttpSSESession(okhttp3.OkHttpClient okHttpClient, okhttp3.Request request, kotlin.coroutines.CoroutineContext coroutineContext) {
        this(r3, request, coroutineContext.plus(r0).plus(new kotlinx.coroutines.CoroutineName("OkHttpSSESession")));
        kotlinx.coroutines.CompletableJob Job$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(okHttpClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        okhttp3.sse.EventSource.Factory createFactory = okhttp3.sse.EventSources.createFactory(okHttpClient);
        Job$default = kotlinx.coroutines.JobKt__JobKt.Job$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null);
    }

    public final kotlinx.coroutines.CompletableDeferred<okhttp3.Response> getOriginResponse$ktor_client_okhttp() {
        return this.originResponse;
    }

    @Override // io.ktor.client.plugins.sse.SSESession
    public final kotlinx.coroutines.flow.Flow<io.ktor.sse.ServerSentEvent> getIncoming() {
        return this.incoming;
    }

    @Override // okhttp3.sse.EventSourceListener
    public final void onOpen(okhttp3.sse.EventSource eventSource, okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        this.originResponse.complete(response);
    }

    @Override // okhttp3.sse.EventSourceListener
    public final void onEvent(okhttp3.sse.EventSource eventSource, java.lang.String id, java.lang.String type, java.lang.String data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        java.lang.Object trySendBlocking = kotlinx.coroutines.channels.ChannelsKt.trySendBlocking(this.getHighSpeedVideoFpsRanges, new io.ktor.sse.ServerSentEvent(data, type, id, null, null, 24, null));
        if (trySendBlocking instanceof kotlinx.coroutines.channels.ChannelResult.Failed) {
            java.lang.Throwable m24083exceptionOrNullimpl = kotlinx.coroutines.channels.ChannelResult.m24083exceptionOrNullimpl(trySendBlocking);
            if (m24083exceptionOrNullimpl instanceof java.util.concurrent.CancellationException) {
                throw m24083exceptionOrNullimpl;
            }
        }
    }

    @Override // okhttp3.sse.EventSourceListener
    public final void onFailure(okhttp3.sse.EventSource eventSource, java.lang.Throwable t, okhttp3.Response response) {
        io.ktor.client.plugins.sse.SSEClientException sSEClientException;
        io.ktor.http.ContentType parse;
        okhttp3.Headers headers;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventSource, "");
        java.lang.Integer valueOf = response != null ? java.lang.Integer.valueOf(response.code()) : null;
        java.lang.String str = (response == null || (headers = response.headers()) == null) ? null : headers.get(io.ktor.http.HttpHeaders.INSTANCE.getContentType());
        if (response != null) {
            int value = io.ktor.http.HttpStatusCode.INSTANCE.getOK().getValue();
            if (valueOf == null || valueOf.intValue() != value || !kotlin.jvm.internal.Intrinsics.areEqual(str, io.ktor.http.ContentType.Text.INSTANCE.getEventStream().toString())) {
                this.originResponse.complete(response);
                this.getHighSpeedVideoFpsRanges.close(null);
                this.getHighSpeedVideoSizes.cancel();
                kotlinx.coroutines.JobKt__JobKt.cancel$default(getCoroutineContext(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                return;
            }
        }
        if (t != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Exception during OkHttpSSESession: ");
            sb.append(t.getMessage());
            sSEClientException = new io.ktor.client.plugins.sse.SSEClientException(null, t, sb.toString(), 1, null);
        } else if (response != null) {
            if (response.code() != io.ktor.http.HttpStatusCode.INSTANCE.getOK().getValue()) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Expected status code ");
                sb2.append(io.ktor.http.HttpStatusCode.INSTANCE.getOK().getValue());
                sb2.append(" but was ");
                sb2.append(response.code());
                sSEClientException = new io.ktor.client.plugins.sse.SSEClientException(null, null, sb2.toString(), 3, null);
            } else {
                java.lang.String str2 = response.headers().get(io.ktor.http.HttpHeaders.INSTANCE.getContentType());
                if (!kotlin.jvm.internal.Intrinsics.areEqual((str2 == null || (parse = io.ktor.http.ContentType.INSTANCE.parse(str2)) == null) ? null : parse.withoutParameters(), io.ktor.http.ContentType.Text.INSTANCE.getEventStream())) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Content type must be ");
                    sb3.append(io.ktor.http.ContentType.Text.INSTANCE.getEventStream());
                    sb3.append(" but was ");
                    sb3.append(response.headers().get(io.ktor.http.HttpHeaders.INSTANCE.getContentType()));
                    sSEClientException = new io.ktor.client.plugins.sse.SSEClientException(null, null, sb3.toString(), 3, null);
                } else {
                    sSEClientException = new io.ktor.client.plugins.sse.SSEClientException(null, null, "Unexpected error occurred in OkHttpSSESession", 3, null);
                }
            }
        } else {
            sSEClientException = new io.ktor.client.plugins.sse.SSEClientException(null, null, "Unexpected error occurred in OkHttpSSESession", 3, null);
        }
        io.ktor.client.plugins.sse.SSEClientException sSEClientException2 = sSEClientException;
        this.originResponse.completeExceptionally(sSEClientException2);
        this.getHighSpeedVideoFpsRanges.close(sSEClientException2);
        this.getHighSpeedVideoSizes.cancel();
        kotlinx.coroutines.JobKt__JobKt.cancel$default(getCoroutineContext(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YcWTiRnFcuNYJG22_YIHGjLk3I0(io.ktor.client.engine.okhttp.OkHttpSSESession okHttpSSESession, java.lang.Throwable th) {
        okHttpSSESession.getHighSpeedVideoFpsRanges.close(null);
        okHttpSSESession.getHighSpeedVideoSizes.cancel();
        kotlinx.coroutines.JobKt__JobKt.cancel$default(okHttpSSESession.getCoroutineContext(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ void access$close(io.ktor.client.engine.okhttp.OkHttpSSESession okHttpSSESession, java.lang.Throwable th) {
        okHttpSSESession.getHighSpeedVideoFpsRanges.close(th);
        okHttpSSESession.getHighSpeedVideoSizes.cancel();
        kotlinx.coroutines.JobKt__JobKt.cancel$default(okHttpSSESession.getCoroutineContext(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
    }

    @Override // okhttp3.sse.EventSourceListener
    public final void onClosed(okhttp3.sse.EventSource eventSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventSource, "");
        this.getHighSpeedVideoFpsRanges.close(null);
        this.getHighSpeedVideoSizes.cancel();
        kotlinx.coroutines.JobKt__JobKt.cancel$default(getCoroutineContext(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
    }
}
