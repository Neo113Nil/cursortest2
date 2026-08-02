package io.ktor.client.plugins.sse;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lio/ktor/client/plugins/sse/ClientSSESession;", "Lio/ktor/client/plugins/sse/SSESession;", "Lio/ktor/client/call/HttpClientCall;", androidx.core.app.NotificationCompat.CATEGORY_CALL, "delegate", "<init>", "(Lio/ktor/client/call/HttpClientCall;Lio/ktor/client/plugins/sse/SSESession;)V", "Lio/ktor/client/call/HttpClientCall;", "getCall", "()Lio/ktor/client/call/HttpClientCall;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlinx/coroutines/flow/Flow;", "Lio/ktor/sse/ServerSentEvent;", "getIncoming", "()Lkotlinx/coroutines/flow/Flow;", "incoming"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ClientSSESession implements io.ktor.client.plugins.sse.SSESession {
    private final io.ktor.client.call.HttpClientCall call;
    private final /* synthetic */ io.ktor.client.plugins.sse.SSESession getHighSpeedVideoSizes;

    public ClientSSESession(io.ktor.client.call.HttpClientCall httpClientCall, io.ktor.client.plugins.sse.SSESession sSESession) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientCall, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sSESession, "");
        this.getHighSpeedVideoSizes = sSESession;
        this.call = httpClientCall;
    }

    public final io.ktor.client.call.HttpClientCall getCall() {
        return this.call;
    }

    @Override // io.ktor.client.plugins.sse.SSESession
    public final kotlinx.coroutines.flow.Flow<io.ktor.sse.ServerSentEvent> getIncoming() {
        return this.getHighSpeedVideoSizes.getIncoming();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return this.getHighSpeedVideoSizes.getCoroutineContext();
    }
}
