package io.ktor.websocket;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\u0012\b\u0002\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\r\u001a\u00020\b8'@'X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0010\u001a\u00020\b8'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lio/ktor/websocket/DefaultWebSocketSession;", "Lio/ktor/websocket/WebSocketSession;", "", "Lio/ktor/websocket/WebSocketExtension;", "negotiatedExtensions", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "(Ljava/util/List;)V", "", "getPingIntervalMillis", "()J", "setPingIntervalMillis", "(J)V", "pingIntervalMillis", "getTimeoutMillis", "setTimeoutMillis", "timeoutMillis", "Lkotlinx/coroutines/Deferred;", "Lio/ktor/websocket/CloseReason;", "getCloseReason", "()Lkotlinx/coroutines/Deferred;", "closeReason"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface DefaultWebSocketSession extends io.ktor.websocket.WebSocketSession {
    kotlinx.coroutines.Deferred<io.ktor.websocket.CloseReason> getCloseReason();

    long getPingIntervalMillis();

    long getTimeoutMillis();

    void setPingIntervalMillis(long j);

    void setTimeoutMillis(long j);

    void start(java.util.List<? extends io.ktor.websocket.WebSocketExtension<?>> negotiatedExtensions);

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static java.lang.Object send(io.ktor.websocket.DefaultWebSocketSession defaultWebSocketSession, io.ktor.websocket.Frame frame, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            java.lang.Object send = io.ktor.websocket.WebSocketSession.DefaultImpls.send(defaultWebSocketSession, frame, continuation);
            return send == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : kotlin.Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void start$default(io.ktor.websocket.DefaultWebSocketSession defaultWebSocketSession, java.util.List list, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
            }
            if ((i & 1) != 0) {
                list = kotlin.collections.CollectionsKt.emptyList();
            }
            defaultWebSocketSession.start(list);
        }
    }
}
