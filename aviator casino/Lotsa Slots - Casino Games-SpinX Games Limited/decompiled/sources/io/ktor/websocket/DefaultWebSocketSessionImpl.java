package io.ktor.websocket;

/* compiled from: DefaultWebSocketSession.kt */
@kotlin.Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 e2\u00020\u00012\u00020\u0002:\u0001eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0010\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u001f\u0010\u0014J&\u0010$\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"H\u0082@¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\fH\u0002¢\u0006\u0004\b)\u0010\u0016J\"\u0010.\u001a\u00020\f2\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010-\u001a\u00020,H\u0082@¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020,2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020,2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b2\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00103R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020 048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020,078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020,078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00109R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001e\u0010?\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020,0A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020,0\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u001e\u0010J\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u001a\u0010L\u001a\u00020K8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR$\u0010T\u001a\u00020&2\u0006\u0010P\u001a\u00020&8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bQ\u0010(\"\u0004\bR\u0010SR$\u0010Y\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR*\u0010\u0005\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020\u00048\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010[\u001a\u0004\b\\\u0010V\"\u0004\b]\u0010XR*\u0010\u0006\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020\u00048\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010[\u001a\u0004\b^\u0010V\"\u0004\b_\u0010XR\"\u0010a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0`8\u0016X\u0096\u0004¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d¨\u0006f"}, d2 = {"Lio/ktor/websocket/DefaultWebSocketSessionImpl;", "Lio/ktor/websocket/DefaultWebSocketSession;", "Lio/ktor/websocket/WebSocketSession;", "raw", "", "pingIntervalMillis", "timeoutMillis", "<init>", "(Lio/ktor/websocket/WebSocketSession;JJ)V", "", "Lio/ktor/websocket/WebSocketExtension;", "negotiatedExtensions", "", "start", "(Ljava/util/List;)V", "", "message", "goingAway", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flush", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "terminate", "()V", "Lkotlinx/coroutines/channels/SendChannel;", "Lio/ktor/websocket/Frame$Ping;", "ponger", "Lkotlinx/coroutines/Job;", "runIncomingProcessor", "(Lkotlinx/coroutines/channels/SendChannel;)Lkotlinx/coroutines/Job;", "runOutgoingProcessor", "()Lkotlinx/coroutines/Job;", "outgoingProcessorLoop", "Lio/ktor/websocket/CloseReason;", "reason", "", "exception", "sendCloseSequence", "(Lio/ktor/websocket/CloseReason;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "tryClose", "()Z", "runOrCancelPinger", "Lkotlinx/io/Sink;", "packet", "Lio/ktor/websocket/Frame;", "frame", "checkMaxFrameSize", "(Lkotlinx/io/Sink;Lio/ktor/websocket/Frame;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processIncomingExtensions", "(Lio/ktor/websocket/Frame;)Lio/ktor/websocket/Frame;", "processOutgoingExtensions", "Lio/ktor/websocket/WebSocketSession;", "Lkotlinx/coroutines/CompletableDeferred;", "closeReasonRef", "Lkotlinx/coroutines/CompletableDeferred;", "Lkotlinx/coroutines/channels/Channel;", "filtered", "Lkotlinx/coroutines/channels/Channel;", "outgoingToBeProcessed", "Lkotlinx/coroutines/CompletableJob;", "context", "Lkotlinx/coroutines/CompletableJob;", "", "_extensions", "Ljava/util/List;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "getIncoming", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "incoming", "getOutgoing", "()Lkotlinx/coroutines/channels/SendChannel;", "outgoing", "getExtensions", "()Ljava/util/List;", "extensions", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "value", "getMasking", "setMasking", "(Z)V", "masking", "getMaxFrameSize", "()J", "setMaxFrameSize", "(J)V", "maxFrameSize", "newValue", "J", "getPingIntervalMillis", "setPingIntervalMillis", "getTimeoutMillis", "setTimeoutMillis", "Lkotlinx/coroutines/Deferred;", "closeReason", "Lkotlinx/coroutines/Deferred;", "getCloseReason", "()Lkotlinx/coroutines/Deferred;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultWebSocketSessionImpl implements io.ktor.websocket.DefaultWebSocketSession, io.ktor.websocket.WebSocketSession {
    private final java.util.List<io.ktor.websocket.WebSocketExtension<?>> _extensions;
    private final kotlinx.coroutines.Deferred<io.ktor.websocket.CloseReason> closeReason;
    private final kotlinx.coroutines.CompletableDeferred<io.ktor.websocket.CloseReason> closeReasonRef;
    private volatile /* synthetic */ int closed;
    private final kotlinx.coroutines.CompletableJob context;
    private final kotlin.coroutines.CoroutineContext coroutineContext;
    private final kotlinx.coroutines.channels.Channel<io.ktor.websocket.Frame> filtered;
    private final kotlinx.coroutines.channels.Channel<io.ktor.websocket.Frame> outgoingToBeProcessed;
    private long pingIntervalMillis;
    volatile /* synthetic */ java.lang.Object pinger;
    private final io.ktor.websocket.WebSocketSession raw;
    private volatile /* synthetic */ int started;
    private long timeoutMillis;
    private static final io.ktor.websocket.Frame.Pong EmptyPong = new io.ktor.websocket.Frame.Pong(new byte[0], io.ktor.websocket.NonDisposableHandle.INSTANCE);
    static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater pinger$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(io.ktor.websocket.DefaultWebSocketSessionImpl.class, java.lang.Object.class, "pinger");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater closed$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(io.ktor.websocket.DefaultWebSocketSessionImpl.class, "closed");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater started$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(io.ktor.websocket.DefaultWebSocketSessionImpl.class, com.ironsource.X3.i.d0);

    public DefaultWebSocketSessionImpl(io.ktor.websocket.WebSocketSession raw, long j, long j2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(raw, "raw");
        this.raw = raw;
        this.pinger = null;
        kotlinx.coroutines.CompletableDeferred<io.ktor.websocket.CloseReason> CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.closeReasonRef = CompletableDeferred$default;
        this.filtered = kotlinx.coroutines.channels.ChannelKt.Channel$default(8, null, null, 6, null);
        this.outgoingToBeProcessed = kotlinx.coroutines.channels.ChannelKt.Channel$default(io.ktor.websocket.UtilsKt.getOUTGOING_CHANNEL_CAPACITY(), null, null, 6, null);
        this.closed = 0;
        kotlinx.coroutines.CompletableJob Job = kotlinx.coroutines.JobKt.Job((kotlinx.coroutines.Job) raw.getCoroutineContext().get(kotlinx.coroutines.Job.INSTANCE));
        this.context = Job;
        this._extensions = new java.util.ArrayList();
        this.started = 0;
        this.coroutineContext = raw.getCoroutineContext().plus(Job).plus(new kotlinx.coroutines.CoroutineName("ws-default"));
        this.pingIntervalMillis = j;
        this.timeoutMillis = j2;
        this.closeReason = CompletableDeferred$default;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public java.lang.Object send(io.ktor.websocket.Frame frame, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return io.ktor.websocket.DefaultWebSocketSession.DefaultImpls.send(this, frame, continuation);
    }

    @Override // io.ktor.websocket.WebSocketSession
    public kotlinx.coroutines.channels.ReceiveChannel<io.ktor.websocket.Frame> getIncoming() {
        return this.filtered;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame> getOutgoing() {
        return this.outgoingToBeProcessed;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public java.util.List<io.ktor.websocket.WebSocketExtension<?>> getExtensions() {
        return this._extensions;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public boolean getMasking() {
        return this.raw.getMasking();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public void setMasking(boolean z) {
        this.raw.setMasking(z);
    }

    @Override // io.ktor.websocket.WebSocketSession
    public long getMaxFrameSize() {
        return this.raw.getMaxFrameSize();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public void setMaxFrameSize(long j) {
        this.raw.setMaxFrameSize(j);
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public long getPingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public void setPingIntervalMillis(long j) {
        this.pingIntervalMillis = j;
        runOrCancelPinger();
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public long getTimeoutMillis() {
        return this.timeoutMillis;
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public void setTimeoutMillis(long j) {
        this.timeoutMillis = j;
        runOrCancelPinger();
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public kotlinx.coroutines.Deferred<io.ktor.websocket.CloseReason> getCloseReason() {
        return this.closeReason;
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public void start(java.util.List<? extends io.ktor.websocket.WebSocketExtension<?>> negotiatedExtensions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(negotiatedExtensions, "negotiatedExtensions");
        if (!started$FU.compareAndSet(this, 0, 1)) {
            throw new java.lang.IllegalStateException(("WebSocket session " + this + " is already started.").toString());
        }
        org.slf4j.Logger logger = io.ktor.websocket.DefaultWebSocketSessionKt.getLOGGER();
        if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger)) {
            logger.trace("Starting default WebSocketSession(" + this + ") with negotiated extensions: " + kotlin.collections.CollectionsKt.joinToString$default(negotiatedExtensions, null, null, null, 0, null, null, 63, null));
        }
        this._extensions.addAll(negotiatedExtensions);
        runOrCancelPinger();
        io.ktor.websocket.DefaultWebSocketSessionImpl defaultWebSocketSessionImpl = this;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(defaultWebSocketSessionImpl, null, null, new io.ktor.websocket.DefaultWebSocketSessionImpl$start$2(runIncomingProcessor(io.ktor.websocket.PingPongKt.ponger(defaultWebSocketSessionImpl, getOutgoing())), runOutgoingProcessor(), this, null), 3, null);
    }

    public static /* synthetic */ java.lang.Object goingAway$default(io.ktor.websocket.DefaultWebSocketSessionImpl defaultWebSocketSessionImpl, java.lang.String str, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "Server is going down";
        }
        return defaultWebSocketSessionImpl.goingAway(str, continuation);
    }

    public final java.lang.Object goingAway(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object sendCloseSequence$default = sendCloseSequence$default(this, new io.ktor.websocket.CloseReason(io.ktor.websocket.CloseReason.Codes.GOING_AWAY, str), null, continuation, 2, null);
        return sendCloseSequence$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendCloseSequence$default : kotlin.Unit.INSTANCE;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public java.lang.Object flush(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object flush = this.raw.flush(continuation);
        return flush == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? flush : kotlin.Unit.INSTANCE;
    }

    @Override // io.ktor.websocket.WebSocketSession
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use cancel() instead.", replaceWith = @kotlin.ReplaceWith(expression = "cancel()", imports = {"kotlinx.coroutines.cancel"}))
    public void terminate() {
        kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) this.context, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        kotlinx.coroutines.CoroutineScopeKt.cancel$default(this.raw, null, 1, null);
    }

    private final kotlinx.coroutines.Job runIncomingProcessor(kotlinx.coroutines.channels.SendChannel<? super io.ktor.websocket.Frame.Ping> ponger) {
        kotlinx.coroutines.CoroutineName coroutineName;
        kotlinx.coroutines.Job launch$default;
        coroutineName = io.ktor.websocket.DefaultWebSocketSessionKt.IncomingProcessorCoroutineName;
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this, coroutineName.plus(kotlinx.coroutines.Dispatchers.getUnconfined()), null, new io.ktor.websocket.DefaultWebSocketSessionImpl$runIncomingProcessor$1(this, ponger, null), 2, null);
        return launch$default;
    }

    private final kotlinx.coroutines.Job runOutgoingProcessor() {
        kotlinx.coroutines.CoroutineName coroutineName;
        coroutineName = io.ktor.websocket.DefaultWebSocketSessionKt.OutgoingProcessorCoroutineName;
        return kotlinx.coroutines.BuildersKt.launch(this, coroutineName.plus(kotlinx.coroutines.Dispatchers.getUnconfined()), kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new io.ktor.websocket.DefaultWebSocketSessionImpl$runOutgoingProcessor$1(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00cb -> B:12:0x0054). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object outgoingProcessorLoop(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.websocket.DefaultWebSocketSessionImpl$outgoingProcessorLoop$1 defaultWebSocketSessionImpl$outgoingProcessorLoop$1;
        java.lang.Object coroutine_suspended;
        int i;
        kotlinx.coroutines.channels.ChannelIterator<io.ktor.websocket.Frame> it;
        io.ktor.websocket.DefaultWebSocketSessionImpl$outgoingProcessorLoop$1 defaultWebSocketSessionImpl$outgoingProcessorLoop$12;
        kotlinx.coroutines.channels.ChannelIterator<io.ktor.websocket.Frame> channelIterator;
        java.lang.Object hasNext;
        if (continuation instanceof io.ktor.websocket.DefaultWebSocketSessionImpl$outgoingProcessorLoop$1) {
            defaultWebSocketSessionImpl$outgoingProcessorLoop$1 = (io.ktor.websocket.DefaultWebSocketSessionImpl$outgoingProcessorLoop$1) continuation;
            if ((defaultWebSocketSessionImpl$outgoingProcessorLoop$1.label & Integer.MIN_VALUE) != 0) {
                defaultWebSocketSessionImpl$outgoingProcessorLoop$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = defaultWebSocketSessionImpl$outgoingProcessorLoop$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = defaultWebSocketSessionImpl$outgoingProcessorLoop$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    it = this.outgoingToBeProcessed.iterator();
                } else {
                    if (i == 1) {
                        channelIterator = (kotlinx.coroutines.channels.ChannelIterator) defaultWebSocketSessionImpl$outgoingProcessorLoop$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultWebSocketSessionImpl$outgoingProcessorLoop$12 = defaultWebSocketSessionImpl$outgoingProcessorLoop$1;
                        if (((java.lang.Boolean) obj).booleanValue()) {
                            io.ktor.websocket.Frame next = channelIterator.next();
                            org.slf4j.Logger logger = io.ktor.websocket.DefaultWebSocketSessionKt.getLOGGER();
                            if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger)) {
                                logger.trace("Sending " + next + " from session " + this);
                            }
                            if (next instanceof io.ktor.websocket.Frame.Close) {
                                io.ktor.websocket.CloseReason readReason = io.ktor.websocket.FrameCommonKt.readReason((io.ktor.websocket.Frame.Close) next);
                                defaultWebSocketSessionImpl$outgoingProcessorLoop$12.L$0 = null;
                                defaultWebSocketSessionImpl$outgoingProcessorLoop$12.label = 2;
                                if (sendCloseSequence$default(this, readReason, null, defaultWebSocketSessionImpl$outgoingProcessorLoop$12, 2, null) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if ((next instanceof io.ktor.websocket.Frame.Text) || (next instanceof io.ktor.websocket.Frame.Binary)) {
                                    next = processOutgoingExtensions(next);
                                }
                                kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame> outgoing = this.raw.getOutgoing();
                                defaultWebSocketSessionImpl$outgoingProcessorLoop$12.L$0 = channelIterator;
                                defaultWebSocketSessionImpl$outgoingProcessorLoop$12.label = 3;
                                if (outgoing.send(next, defaultWebSocketSessionImpl$outgoingProcessorLoop$12) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                it = channelIterator;
                                defaultWebSocketSessionImpl$outgoingProcessorLoop$1 = defaultWebSocketSessionImpl$outgoingProcessorLoop$12;
                            }
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    if (i == 2) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlinx.coroutines.channels.ChannelIterator<io.ktor.websocket.Frame> channelIterator2 = (kotlinx.coroutines.channels.ChannelIterator) defaultWebSocketSessionImpl$outgoingProcessorLoop$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    it = channelIterator2;
                }
                defaultWebSocketSessionImpl$outgoingProcessorLoop$1.L$0 = it;
                defaultWebSocketSessionImpl$outgoingProcessorLoop$1.label = 1;
                hasNext = it.hasNext(defaultWebSocketSessionImpl$outgoingProcessorLoop$1);
                if (hasNext != coroutine_suspended) {
                    return coroutine_suspended;
                }
                defaultWebSocketSessionImpl$outgoingProcessorLoop$12 = defaultWebSocketSessionImpl$outgoingProcessorLoop$1;
                channelIterator = it;
                obj = hasNext;
                if (((java.lang.Boolean) obj).booleanValue()) {
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        defaultWebSocketSessionImpl$outgoingProcessorLoop$1 = new io.ktor.websocket.DefaultWebSocketSessionImpl$outgoingProcessorLoop$1(this, continuation);
        java.lang.Object obj2 = defaultWebSocketSessionImpl$outgoingProcessorLoop$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = defaultWebSocketSessionImpl$outgoingProcessorLoop$1.label;
        if (i != 0) {
        }
        defaultWebSocketSessionImpl$outgoingProcessorLoop$1.L$0 = it;
        defaultWebSocketSessionImpl$outgoingProcessorLoop$1.label = 1;
        hasNext = it.hasNext(defaultWebSocketSessionImpl$outgoingProcessorLoop$1);
        if (hasNext != coroutine_suspended) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object sendCloseSequence(io.ktor.websocket.CloseReason closeReason, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.websocket.DefaultWebSocketSessionImpl$sendCloseSequence$1 defaultWebSocketSessionImpl$sendCloseSequence$1;
        int i;
        try {
            if (continuation instanceof io.ktor.websocket.DefaultWebSocketSessionImpl$sendCloseSequence$1) {
                defaultWebSocketSessionImpl$sendCloseSequence$1 = (io.ktor.websocket.DefaultWebSocketSessionImpl$sendCloseSequence$1) continuation;
                if ((defaultWebSocketSessionImpl$sendCloseSequence$1.label & Integer.MIN_VALUE) != 0) {
                    defaultWebSocketSessionImpl$sendCloseSequence$1.label -= Integer.MIN_VALUE;
                    java.lang.Object obj = defaultWebSocketSessionImpl$sendCloseSequence$1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = defaultWebSocketSessionImpl$sendCloseSequence$1.label;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (!tryClose()) {
                            return kotlin.Unit.INSTANCE;
                        }
                        org.slf4j.Logger logger = io.ktor.websocket.DefaultWebSocketSessionKt.getLOGGER();
                        if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger)) {
                            logger.trace("Sending Close Sequence for session " + this + " with reason " + closeReason + " and exception " + th);
                        }
                        this.context.complete();
                        if (closeReason == null) {
                            closeReason = new io.ktor.websocket.CloseReason(io.ktor.websocket.CloseReason.Codes.NORMAL, "");
                        }
                        runOrCancelPinger();
                        if (closeReason.getCode() != io.ktor.websocket.CloseReason.Codes.CLOSED_ABNORMALLY.getCode()) {
                            kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame> outgoing = this.raw.getOutgoing();
                            io.ktor.websocket.Frame.Close close = new io.ktor.websocket.Frame.Close(closeReason);
                            defaultWebSocketSessionImpl$sendCloseSequence$1.L$0 = th;
                            defaultWebSocketSessionImpl$sendCloseSequence$1.L$1 = closeReason;
                            defaultWebSocketSessionImpl$sendCloseSequence$1.label = 1;
                            if (outgoing.send(close, defaultWebSocketSessionImpl$sendCloseSequence$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        closeReason = (io.ktor.websocket.CloseReason) defaultWebSocketSessionImpl$sendCloseSequence$1.L$1;
                        th = (java.lang.Throwable) defaultWebSocketSessionImpl$sendCloseSequence$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    if (th != null) {
                        this.outgoingToBeProcessed.close(th);
                        this.filtered.close(th);
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            if (th != null) {
            }
            return kotlin.Unit.INSTANCE;
        } finally {
            this.closeReasonRef.complete(closeReason);
            if (th != null) {
                this.outgoingToBeProcessed.close(th);
                this.filtered.close(th);
            }
        }
        defaultWebSocketSessionImpl$sendCloseSequence$1 = new io.ktor.websocket.DefaultWebSocketSessionImpl$sendCloseSequence$1(this, continuation);
        java.lang.Object obj2 = defaultWebSocketSessionImpl$sendCloseSequence$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = defaultWebSocketSessionImpl$sendCloseSequence$1.label;
    }

    static /* synthetic */ java.lang.Object sendCloseSequence$default(io.ktor.websocket.DefaultWebSocketSessionImpl defaultWebSocketSessionImpl, io.ktor.websocket.CloseReason closeReason, java.lang.Throwable th, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        return defaultWebSocketSessionImpl.sendCloseSequence(closeReason, th, continuation);
    }

    private final boolean tryClose() {
        return closed$FU.compareAndSet(this, 0, 1);
    }

    private final void runOrCancelPinger() {
        long pingIntervalMillis = getPingIntervalMillis();
        kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame.Pong> pinger = (this.closed == 0 && pingIntervalMillis > 0) ? io.ktor.websocket.PingPongKt.pinger(this, this.raw.getOutgoing(), pingIntervalMillis, getTimeoutMillis(), new io.ktor.websocket.DefaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1(this, null)) : null;
        kotlinx.coroutines.channels.SendChannel sendChannel = (kotlinx.coroutines.channels.SendChannel) pinger$FU.getAndSet(this, pinger);
        if (sendChannel != null) {
            kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(sendChannel, null, 1, null);
        }
        if (pinger != null) {
            kotlinx.coroutines.channels.ChannelResult.m12328isSuccessimpl(pinger.mo10716trySendJP2dKIU(EmptyPong));
        }
        if (this.closed == 0 || pinger == null) {
            return;
        }
        runOrCancelPinger();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object checkMaxFrameSize(kotlinx.io.Sink sink, io.ktor.websocket.Frame frame, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.websocket.DefaultWebSocketSessionImpl$checkMaxFrameSize$1 defaultWebSocketSessionImpl$checkMaxFrameSize$1;
        int i;
        int i2;
        if (continuation instanceof io.ktor.websocket.DefaultWebSocketSessionImpl$checkMaxFrameSize$1) {
            defaultWebSocketSessionImpl$checkMaxFrameSize$1 = (io.ktor.websocket.DefaultWebSocketSessionImpl$checkMaxFrameSize$1) continuation;
            if ((defaultWebSocketSessionImpl$checkMaxFrameSize$1.label & Integer.MIN_VALUE) != 0) {
                defaultWebSocketSessionImpl$checkMaxFrameSize$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = defaultWebSocketSessionImpl$checkMaxFrameSize$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = defaultWebSocketSessionImpl$checkMaxFrameSize$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    int length = frame.getData().length + (sink != null ? io.ktor.utils.io.core.BytePacketBuilderKt.getSize(sink) : 0);
                    if (length > getMaxFrameSize()) {
                        if (sink != null) {
                            sink.close();
                        }
                        io.ktor.websocket.CloseReason closeReason = new io.ktor.websocket.CloseReason(io.ktor.websocket.CloseReason.Codes.TOO_BIG, "Frame is too big: " + length + ". Max size is " + getMaxFrameSize());
                        defaultWebSocketSessionImpl$checkMaxFrameSize$1.I$0 = length;
                        defaultWebSocketSessionImpl$checkMaxFrameSize$1.label = 1;
                        if (io.ktor.websocket.WebSocketSessionKt.close(this, closeReason, defaultWebSocketSessionImpl$checkMaxFrameSize$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i2 = length;
                    } else {
                        return kotlin.Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = defaultWebSocketSessionImpl$checkMaxFrameSize$1.I$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new io.ktor.websocket.FrameTooBigException(i2);
            }
        }
        defaultWebSocketSessionImpl$checkMaxFrameSize$1 = new io.ktor.websocket.DefaultWebSocketSessionImpl$checkMaxFrameSize$1(this, continuation);
        java.lang.Object obj2 = defaultWebSocketSessionImpl$checkMaxFrameSize$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = defaultWebSocketSessionImpl$checkMaxFrameSize$1.label;
        if (i != 0) {
        }
        throw new io.ktor.websocket.FrameTooBigException(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final io.ktor.websocket.Frame processIncomingExtensions(io.ktor.websocket.Frame frame) {
        java.util.Iterator<T> it = getExtensions().iterator();
        while (it.hasNext()) {
            frame = ((io.ktor.websocket.WebSocketExtension) it.next()).processIncomingFrame(frame);
        }
        return frame;
    }

    private final io.ktor.websocket.Frame processOutgoingExtensions(io.ktor.websocket.Frame frame) {
        java.util.Iterator<T> it = getExtensions().iterator();
        while (it.hasNext()) {
            frame = ((io.ktor.websocket.WebSocketExtension) it.next()).processOutgoingFrame(frame);
        }
        return frame;
    }
}
