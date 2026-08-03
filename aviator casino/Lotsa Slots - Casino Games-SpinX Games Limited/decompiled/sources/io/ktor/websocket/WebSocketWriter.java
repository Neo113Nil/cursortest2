package io.ktor.websocket;

/* compiled from: WebSocketWriter.kt */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u00016B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020\u00130/8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00067"}, d2 = {"Lio/ktor/websocket/WebSocketWriter;", "Lkotlinx/coroutines/CoroutineScope;", "Lio/ktor/utils/io/ByteWriteChannel;", "writeChannel", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "", "masking", "Lio/ktor/utils/io/pool/ObjectPool;", "Ljava/nio/ByteBuffer;", "pool", "<init>", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/CoroutineContext;ZLio/ktor/utils/io/pool/ObjectPool;)V", "buffer", "", "writeLoop", "(Ljava/nio/ByteBuffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "drainQueueAndDiscard", "()V", "Lio/ktor/websocket/Frame;", "firstMsg", "drainQueueAndSerialize", "(Lio/ktor/websocket/Frame;Ljava/nio/ByteBuffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "frame", "send", "(Lio/ktor/websocket/Frame;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flush", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteWriteChannel;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Z", "getMasking", "()Z", "setMasking", "(Z)V", "Lio/ktor/utils/io/pool/ObjectPool;", "getPool", "()Lio/ktor/utils/io/pool/ObjectPool;", "Lkotlinx/coroutines/channels/Channel;", "", "queue", "Lkotlinx/coroutines/channels/Channel;", "Lio/ktor/websocket/Serializer;", "serializer", "Lio/ktor/websocket/Serializer;", "Lkotlinx/coroutines/channels/SendChannel;", "getOutgoing", "()Lkotlinx/coroutines/channels/SendChannel;", "outgoing", "Lkotlinx/coroutines/Job;", "writeLoopJob", "Lkotlinx/coroutines/Job;", "FlushRequest", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WebSocketWriter implements kotlinx.coroutines.CoroutineScope {
    private final kotlin.coroutines.CoroutineContext coroutineContext;
    private boolean masking;
    private final io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> pool;
    private final kotlinx.coroutines.channels.Channel<java.lang.Object> queue;
    private final io.ktor.websocket.Serializer serializer;
    private final io.ktor.utils.io.ByteWriteChannel writeChannel;
    private final kotlinx.coroutines.Job writeLoopJob;

    public WebSocketWriter(io.ktor.utils.io.ByteWriteChannel writeChannel, kotlin.coroutines.CoroutineContext coroutineContext, boolean z, io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> pool) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writeChannel, "writeChannel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pool, "pool");
        this.writeChannel = writeChannel;
        this.coroutineContext = coroutineContext;
        this.masking = z;
        this.pool = pool;
        this.queue = kotlinx.coroutines.channels.ChannelKt.Channel$default(8, null, null, 6, null);
        this.serializer = new io.ktor.websocket.Serializer();
        this.writeLoopJob = kotlinx.coroutines.BuildersKt.launch(this, new kotlinx.coroutines.CoroutineName("ws-writer"), kotlinx.coroutines.CoroutineStart.ATOMIC, new io.ktor.websocket.WebSocketWriter$writeLoopJob$1(this, null));
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    public final boolean getMasking() {
        return this.masking;
    }

    public final void setMasking(boolean z) {
        this.masking = z;
    }

    public /* synthetic */ WebSocketWriter(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlin.coroutines.CoroutineContext coroutineContext, boolean z, io.ktor.utils.io.pool.ObjectPool objectPool, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(byteWriteChannel, coroutineContext, (i & 4) != 0 ? false : z, (i & 8) != 0 ? io.ktor.util.cio.ByteBufferPoolKt.getKtorDefaultPool() : objectPool);
    }

    public final io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> getPool() {
        return this.pool;
    }

    public final kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame> getOutgoing() {
        return this.queue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|73|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x010e, code lost:
    
        r8 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ed, code lost:
    
        r8 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083 A[Catch: all -> 0x00e7, ChannelWriteException -> 0x00ea, TryCatch #5 {ChannelWriteException -> 0x00ea, all -> 0x00e7, blocks: (B:21:0x009b, B:33:0x007b, B:35:0x0083, B:37:0x008b, B:40:0x00a7, B:42:0x00ab, B:43:0x00b5, B:44:0x00cb), top: B:20:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0098 -> B:20:0x009b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00ab -> B:27:0x00a4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object writeLoop(java.nio.ByteBuffer byteBuffer, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.websocket.WebSocketWriter$writeLoop$1 webSocketWriter$writeLoop$1;
        java.lang.Object coroutine_suspended;
        kotlinx.coroutines.channels.ChannelIterator<java.lang.Object> it;
        io.ktor.websocket.WebSocketWriter$writeLoop$1 webSocketWriter$writeLoop$12;
        kotlinx.coroutines.channels.ChannelIterator<java.lang.Object> channelIterator;
        io.ktor.websocket.WebSocketWriter$writeLoop$1 webSocketWriter$writeLoop$13;
        java.lang.Object hasNext;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel;
        try {
            if (continuation instanceof io.ktor.websocket.WebSocketWriter$writeLoop$1) {
                webSocketWriter$writeLoop$1 = (io.ktor.websocket.WebSocketWriter$writeLoop$1) continuation;
                if ((webSocketWriter$writeLoop$1.label & Integer.MIN_VALUE) != 0) {
                    webSocketWriter$writeLoop$1.label -= Integer.MIN_VALUE;
                    java.lang.Object obj = webSocketWriter$writeLoop$1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch (webSocketWriter$writeLoop$1.label) {
                        case 0:
                            kotlin.ResultKt.throwOnFailure(obj);
                            byteBuffer.clear();
                            it = this.queue.iterator();
                            webSocketWriter$writeLoop$1.L$0 = byteBuffer;
                            webSocketWriter$writeLoop$1.L$1 = it;
                            webSocketWriter$writeLoop$1.label = 1;
                            hasNext = it.hasNext(webSocketWriter$writeLoop$1);
                            if (hasNext != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            webSocketWriter$writeLoop$12 = webSocketWriter$writeLoop$1;
                            channelIterator = it;
                            obj = hasNext;
                            webSocketWriter$writeLoop$13 = webSocketWriter$writeLoop$12;
                            if (((java.lang.Boolean) obj).booleanValue()) {
                                java.lang.Object next = channelIterator.next();
                                if (next instanceof io.ktor.websocket.Frame) {
                                    try {
                                        webSocketWriter$writeLoop$13.L$0 = byteBuffer;
                                        webSocketWriter$writeLoop$13.L$1 = channelIterator;
                                        webSocketWriter$writeLoop$13.label = 2;
                                        obj = drainQueueAndSerialize((io.ktor.websocket.Frame) next, byteBuffer, webSocketWriter$writeLoop$13);
                                        if (obj == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        if (((java.lang.Boolean) obj).booleanValue()) {
                                        }
                                        it = channelIterator;
                                        webSocketWriter$writeLoop$1 = webSocketWriter$writeLoop$13;
                                        webSocketWriter$writeLoop$1.L$0 = byteBuffer;
                                        webSocketWriter$writeLoop$1.L$1 = it;
                                        webSocketWriter$writeLoop$1.label = 1;
                                        hasNext = it.hasNext(webSocketWriter$writeLoop$1);
                                        if (hasNext != coroutine_suspended) {
                                        }
                                    } catch (io.ktor.util.cio.ChannelWriteException e) {
                                        e = e;
                                        webSocketWriter$writeLoop$1 = webSocketWriter$writeLoop$13;
                                        this.queue.close(kotlinx.coroutines.ExceptionsKt.CancellationException("Failed to write to WebSocket.", e));
                                        this.queue.close(kotlinx.coroutines.ExceptionsKt.CancellationException("WebSocket closed.", null));
                                        io.ktor.utils.io.ByteWriteChannel byteWriteChannel2 = this.writeChannel;
                                        webSocketWriter$writeLoop$1.L$0 = null;
                                        webSocketWriter$writeLoop$1.L$1 = null;
                                        webSocketWriter$writeLoop$1.label = 4;
                                        if (byteWriteChannel2.flushAndClose(webSocketWriter$writeLoop$1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        drainQueueAndDiscard();
                                        return kotlin.Unit.INSTANCE;
                                    } catch (java.lang.Throwable th) {
                                        th = th;
                                        webSocketWriter$writeLoop$1 = webSocketWriter$writeLoop$13;
                                        this.queue.close(th);
                                        this.queue.close(kotlinx.coroutines.ExceptionsKt.CancellationException("WebSocket closed.", null));
                                        io.ktor.utils.io.ByteWriteChannel byteWriteChannel3 = this.writeChannel;
                                        webSocketWriter$writeLoop$1.L$0 = null;
                                        webSocketWriter$writeLoop$1.L$1 = null;
                                        webSocketWriter$writeLoop$1.label = 5;
                                        if (byteWriteChannel3.flushAndClose(webSocketWriter$writeLoop$1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        drainQueueAndDiscard();
                                        return kotlin.Unit.INSTANCE;
                                    }
                                } else {
                                    if (!(next instanceof io.ktor.websocket.WebSocketWriter.FlushRequest)) {
                                        throw new java.lang.IllegalArgumentException("unknown message " + next);
                                    }
                                    kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((io.ktor.websocket.WebSocketWriter.FlushRequest) next).complete());
                                    it = channelIterator;
                                    webSocketWriter$writeLoop$1 = webSocketWriter$writeLoop$13;
                                    webSocketWriter$writeLoop$1.L$0 = byteBuffer;
                                    webSocketWriter$writeLoop$1.L$1 = it;
                                    webSocketWriter$writeLoop$1.label = 1;
                                    hasNext = it.hasNext(webSocketWriter$writeLoop$1);
                                    if (hasNext != coroutine_suspended) {
                                    }
                                }
                            }
                            this.queue.close(kotlinx.coroutines.ExceptionsKt.CancellationException("WebSocket closed.", null));
                            byteWriteChannel = this.writeChannel;
                            webSocketWriter$writeLoop$13.L$0 = null;
                            webSocketWriter$writeLoop$13.L$1 = null;
                            webSocketWriter$writeLoop$13.label = 3;
                            if (byteWriteChannel.flushAndClose(webSocketWriter$writeLoop$13) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            drainQueueAndDiscard();
                            return kotlin.Unit.INSTANCE;
                        case 1:
                            kotlinx.coroutines.channels.ChannelIterator<java.lang.Object> channelIterator2 = (kotlinx.coroutines.channels.ChannelIterator) webSocketWriter$writeLoop$1.L$1;
                            java.nio.ByteBuffer byteBuffer2 = (java.nio.ByteBuffer) webSocketWriter$writeLoop$1.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            webSocketWriter$writeLoop$12 = webSocketWriter$writeLoop$1;
                            channelIterator = channelIterator2;
                            byteBuffer = byteBuffer2;
                            webSocketWriter$writeLoop$13 = webSocketWriter$writeLoop$12;
                            if (((java.lang.Boolean) obj).booleanValue()) {
                            }
                            this.queue.close(kotlinx.coroutines.ExceptionsKt.CancellationException("WebSocket closed.", null));
                            byteWriteChannel = this.writeChannel;
                            webSocketWriter$writeLoop$13.L$0 = null;
                            webSocketWriter$writeLoop$13.L$1 = null;
                            webSocketWriter$writeLoop$13.label = 3;
                            if (byteWriteChannel.flushAndClose(webSocketWriter$writeLoop$13) == coroutine_suspended) {
                            }
                            drainQueueAndDiscard();
                            return kotlin.Unit.INSTANCE;
                        case 2:
                            kotlinx.coroutines.channels.ChannelIterator<java.lang.Object> channelIterator3 = (kotlinx.coroutines.channels.ChannelIterator) webSocketWriter$writeLoop$1.L$1;
                            java.nio.ByteBuffer byteBuffer3 = (java.nio.ByteBuffer) webSocketWriter$writeLoop$1.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            io.ktor.websocket.WebSocketWriter$writeLoop$1 webSocketWriter$writeLoop$14 = webSocketWriter$writeLoop$1;
                            channelIterator = channelIterator3;
                            byteBuffer = byteBuffer3;
                            webSocketWriter$writeLoop$13 = webSocketWriter$writeLoop$14;
                            if (((java.lang.Boolean) obj).booleanValue()) {
                            }
                            it = channelIterator;
                            webSocketWriter$writeLoop$1 = webSocketWriter$writeLoop$13;
                            webSocketWriter$writeLoop$1.L$0 = byteBuffer;
                            webSocketWriter$writeLoop$1.L$1 = it;
                            webSocketWriter$writeLoop$1.label = 1;
                            hasNext = it.hasNext(webSocketWriter$writeLoop$1);
                            if (hasNext != coroutine_suspended) {
                            }
                            break;
                        case 3:
                        case 4:
                        case 5:
                            kotlin.ResultKt.throwOnFailure(obj);
                            drainQueueAndDiscard();
                            return kotlin.Unit.INSTANCE;
                        case 6:
                            java.lang.Throwable th2 = (java.lang.Throwable) webSocketWriter$writeLoop$1.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            throw th2;
                        default:
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (webSocketWriter$writeLoop$1.label) {
            }
        } catch (java.lang.Throwable th3) {
            this.queue.close(kotlinx.coroutines.ExceptionsKt.CancellationException("WebSocket closed.", null));
            io.ktor.utils.io.ByteWriteChannel byteWriteChannel4 = this.writeChannel;
            webSocketWriter$writeLoop$1.L$0 = th3;
            webSocketWriter$writeLoop$1.L$1 = null;
            webSocketWriter$writeLoop$1.label = 6;
            if (byteWriteChannel4.flushAndClose(webSocketWriter$writeLoop$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            throw th3;
        }
        webSocketWriter$writeLoop$1 = new io.ktor.websocket.WebSocketWriter$writeLoop$1(this, continuation);
        java.lang.Object obj2 = webSocketWriter$writeLoop$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004c, code lost:
    
        throw new java.lang.IllegalArgumentException("unknown message " + r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void drainQueueAndDiscard() {
        kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(this.queue, null, 1, null);
        while (true) {
            try {
                java.lang.Object m12323getOrNullimpl = kotlinx.coroutines.channels.ChannelResult.m12323getOrNullimpl(this.queue.mo12311tryReceivePtdJZtk());
                if (m12323getOrNullimpl != null) {
                    if (!(m12323getOrNullimpl instanceof io.ktor.websocket.Frame.Close) && !(m12323getOrNullimpl instanceof io.ktor.websocket.Frame.Ping) && !(m12323getOrNullimpl instanceof io.ktor.websocket.Frame.Pong)) {
                        if (!(m12323getOrNullimpl instanceof io.ktor.websocket.WebSocketWriter.FlushRequest)) {
                            if (!(m12323getOrNullimpl instanceof io.ktor.websocket.Frame.Text) && !(m12323getOrNullimpl instanceof io.ktor.websocket.Frame.Binary)) {
                                break;
                            }
                        } else {
                            ((io.ktor.websocket.WebSocketWriter.FlushRequest) m12323getOrNullimpl).complete();
                        }
                    }
                } else {
                    return;
                }
            } catch (java.util.concurrent.CancellationException unused) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c4, code lost:
    
        kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(r8.queue, null, 1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0160, code lost:
    
        if (r10.hasRemaining() == false) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x015a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0125 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v18, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [int] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x012e -> B:24:0x0154). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0134 -> B:24:0x0154). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x013a -> B:24:0x0154). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x014c -> B:23:0x014f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object drainQueueAndSerialize(io.ktor.websocket.Frame frame, java.nio.ByteBuffer byteBuffer, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        io.ktor.websocket.WebSocketWriter$drainQueueAndSerialize$1 webSocketWriter$drainQueueAndSerialize$1;
        int i;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        int i2;
        java.nio.ByteBuffer byteBuffer2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        int i3;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel;
        ?? r9;
        kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        ?? m12323getOrNullimpl;
        int i4;
        int i5;
        io.ktor.websocket.WebSocketWriter.FlushRequest flushRequest;
        if (continuation instanceof io.ktor.websocket.WebSocketWriter$drainQueueAndSerialize$1) {
            webSocketWriter$drainQueueAndSerialize$1 = (io.ktor.websocket.WebSocketWriter$drainQueueAndSerialize$1) continuation;
            if ((webSocketWriter$drainQueueAndSerialize$1.label & Integer.MIN_VALUE) != 0) {
                webSocketWriter$drainQueueAndSerialize$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = webSocketWriter$drainQueueAndSerialize$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = webSocketWriter$drainQueueAndSerialize$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                    this.serializer.enqueue(frame);
                    r9 = frame instanceof io.ktor.websocket.Frame.Close;
                    while (objectRef.element == null) {
                        if (!(m12323getOrNullimpl instanceof io.ktor.websocket.WebSocketWriter.FlushRequest)) {
                        }
                    }
                    if (!this.serializer.getHasOutstandingBytes()) {
                    }
                    this.serializer.setMasking(this.masking);
                    this.serializer.serialize(byteBuffer);
                    byteBuffer.flip();
                    i3 = r9;
                    byteWriteChannel = this.writeChannel;
                    webSocketWriter$drainQueueAndSerialize$1.L$0 = byteBuffer;
                    webSocketWriter$drainQueueAndSerialize$1.L$1 = objectRef;
                    webSocketWriter$drainQueueAndSerialize$1.L$2 = null;
                    webSocketWriter$drainQueueAndSerialize$1.I$0 = i3;
                    webSocketWriter$drainQueueAndSerialize$1.label = 1;
                    if (io.ktor.utils.io.ByteWriteChannelOperations_jvmKt.writeFully(byteWriteChannel, byteBuffer, webSocketWriter$drainQueueAndSerialize$1) != coroutine_suspended) {
                    }
                } else if (i == 1) {
                    int i6 = webSocketWriter$drainQueueAndSerialize$1.I$0;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef4 = (kotlin.jvm.internal.Ref.ObjectRef) webSocketWriter$drainQueueAndSerialize$1.L$1;
                    java.nio.ByteBuffer byteBuffer3 = (java.nio.ByteBuffer) webSocketWriter$drainQueueAndSerialize$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    byteBuffer2 = byteBuffer3;
                    objectRef2 = objectRef4;
                    i2 = i6;
                    i4 = i2;
                    if (!this.serializer.getHasOutstandingBytes()) {
                    }
                    objectRef = objectRef2;
                    byteBuffer = byteBuffer2;
                    if (objectRef.element == null) {
                    }
                    i3 = i4;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i7 = webSocketWriter$drainQueueAndSerialize$1.I$0;
                        objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) webSocketWriter$drainQueueAndSerialize$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        i5 = i7;
                        flushRequest = (io.ktor.websocket.WebSocketWriter.FlushRequest) objectRef3.element;
                        if (flushRequest != null) {
                            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(flushRequest.complete());
                        }
                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(i5 != 0);
                    }
                    int i8 = webSocketWriter$drainQueueAndSerialize$1.I$0;
                    io.ktor.websocket.WebSocketWriter.FlushRequest flushRequest2 = (io.ktor.websocket.WebSocketWriter.FlushRequest) webSocketWriter$drainQueueAndSerialize$1.L$2;
                    objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) webSocketWriter$drainQueueAndSerialize$1.L$1;
                    byteBuffer2 = (java.nio.ByteBuffer) webSocketWriter$drainQueueAndSerialize$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    int i9 = i8;
                    flushRequest2.complete();
                    objectRef2.element = null;
                    i4 = i9;
                    objectRef = objectRef2;
                    byteBuffer = byteBuffer2;
                    if (objectRef.element == null || i4 != 0) {
                        i3 = i4;
                    }
                    byteBuffer.compact();
                    r9 = i4;
                    while (objectRef.element == null && r9 == 0 && this.serializer.getRemainingCapacity() > 0 && (m12323getOrNullimpl = kotlinx.coroutines.channels.ChannelResult.m12323getOrNullimpl(this.queue.mo12311tryReceivePtdJZtk())) != 0) {
                        if (!(m12323getOrNullimpl instanceof io.ktor.websocket.WebSocketWriter.FlushRequest)) {
                            objectRef.element = m12323getOrNullimpl;
                        } else if (m12323getOrNullimpl instanceof io.ktor.websocket.Frame.Close) {
                            this.serializer.enqueue((io.ktor.websocket.Frame) m12323getOrNullimpl);
                            r9 = 1;
                        } else {
                            if (!(m12323getOrNullimpl instanceof io.ktor.websocket.Frame)) {
                                throw new java.lang.IllegalArgumentException("unknown message " + m12323getOrNullimpl);
                            }
                            this.serializer.enqueue((io.ktor.websocket.Frame) m12323getOrNullimpl);
                        }
                    }
                    if (!this.serializer.getHasOutstandingBytes() || byteBuffer.position() != 0) {
                        this.serializer.setMasking(this.masking);
                        this.serializer.serialize(byteBuffer);
                        byteBuffer.flip();
                        i3 = r9;
                        byteWriteChannel = this.writeChannel;
                        webSocketWriter$drainQueueAndSerialize$1.L$0 = byteBuffer;
                        webSocketWriter$drainQueueAndSerialize$1.L$1 = objectRef;
                        webSocketWriter$drainQueueAndSerialize$1.L$2 = null;
                        webSocketWriter$drainQueueAndSerialize$1.I$0 = i3;
                        webSocketWriter$drainQueueAndSerialize$1.label = 1;
                        if (io.ktor.utils.io.ByteWriteChannelOperations_jvmKt.writeFully(byteWriteChannel, byteBuffer, webSocketWriter$drainQueueAndSerialize$1) != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        byteBuffer2 = byteBuffer;
                        objectRef2 = objectRef;
                        i2 = i3;
                        i4 = i2;
                        if (!this.serializer.getHasOutstandingBytes()) {
                            i4 = i2;
                            if (!byteBuffer2.hasRemaining()) {
                                flushRequest2 = (io.ktor.websocket.WebSocketWriter.FlushRequest) objectRef2.element;
                                i4 = i2;
                                if (flushRequest2 != null) {
                                    io.ktor.utils.io.ByteWriteChannel byteWriteChannel2 = this.writeChannel;
                                    webSocketWriter$drainQueueAndSerialize$1.L$0 = byteBuffer2;
                                    webSocketWriter$drainQueueAndSerialize$1.L$1 = objectRef2;
                                    webSocketWriter$drainQueueAndSerialize$1.L$2 = flushRequest2;
                                    webSocketWriter$drainQueueAndSerialize$1.I$0 = i2;
                                    webSocketWriter$drainQueueAndSerialize$1.label = 2;
                                    i9 = i2;
                                    if (byteWriteChannel2.flush(webSocketWriter$drainQueueAndSerialize$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    flushRequest2.complete();
                                    objectRef2.element = null;
                                    i4 = i9;
                                }
                            }
                        }
                        objectRef = objectRef2;
                        byteBuffer = byteBuffer2;
                        if (objectRef.element == null) {
                        }
                        i3 = i4;
                    } else {
                        io.ktor.utils.io.ByteWriteChannel byteWriteChannel3 = this.writeChannel;
                        webSocketWriter$drainQueueAndSerialize$1.L$0 = objectRef;
                        webSocketWriter$drainQueueAndSerialize$1.L$1 = null;
                        webSocketWriter$drainQueueAndSerialize$1.L$2 = null;
                        webSocketWriter$drainQueueAndSerialize$1.I$0 = r9;
                        webSocketWriter$drainQueueAndSerialize$1.label = 3;
                        if (byteWriteChannel3.flush(webSocketWriter$drainQueueAndSerialize$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef3 = objectRef;
                        i5 = r9;
                        flushRequest = (io.ktor.websocket.WebSocketWriter.FlushRequest) objectRef3.element;
                        if (flushRequest != null) {
                        }
                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(i5 != 0);
                    }
                }
            }
        }
        webSocketWriter$drainQueueAndSerialize$1 = new io.ktor.websocket.WebSocketWriter$drainQueueAndSerialize$1(this, continuation);
        java.lang.Object obj2 = webSocketWriter$drainQueueAndSerialize$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = webSocketWriter$drainQueueAndSerialize$1.label;
        if (i != 0) {
        }
    }

    public final java.lang.Object send(io.ktor.websocket.Frame frame, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object send = this.queue.send(frame, continuation);
        return send == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, io.ktor.websocket.WebSocketWriter$FlushRequest] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object flush(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.websocket.WebSocketWriter$flush$1 webSocketWriter$flush$1;
        java.lang.Object coroutine_suspended;
        ?? r2;
        io.ktor.websocket.WebSocketWriter.FlushRequest flushRequest;
        io.ktor.websocket.WebSocketWriter.FlushRequest flushRequest2;
        kotlinx.coroutines.Job job;
        try {
            if (continuation instanceof io.ktor.websocket.WebSocketWriter$flush$1) {
                webSocketWriter$flush$1 = (io.ktor.websocket.WebSocketWriter$flush$1) continuation;
                if ((webSocketWriter$flush$1.label & Integer.MIN_VALUE) != 0) {
                    webSocketWriter$flush$1.label -= Integer.MIN_VALUE;
                    java.lang.Object obj = webSocketWriter$flush$1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r2 = webSocketWriter$flush$1.label;
                    if (r2 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        flushRequest = new io.ktor.websocket.WebSocketWriter.FlushRequest((kotlinx.coroutines.Job) getCoroutineContext().get(kotlinx.coroutines.Job.INSTANCE));
                        try {
                            kotlinx.coroutines.channels.Channel<java.lang.Object> channel = this.queue;
                            webSocketWriter$flush$1.L$0 = flushRequest;
                            webSocketWriter$flush$1.L$1 = flushRequest;
                            webSocketWriter$flush$1.label = 1;
                            if (channel.send(flushRequest, webSocketWriter$flush$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } catch (kotlinx.coroutines.channels.ClosedSendChannelException unused) {
                            flushRequest2 = flushRequest;
                            flushRequest.complete();
                            job = this.writeLoopJob;
                            webSocketWriter$flush$1.L$0 = flushRequest2;
                            webSocketWriter$flush$1.L$1 = null;
                            webSocketWriter$flush$1.label = 2;
                            if (job.join(webSocketWriter$flush$1) != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            flushRequest = flushRequest2;
                            flushRequest2 = flushRequest;
                            webSocketWriter$flush$1.L$0 = null;
                            webSocketWriter$flush$1.L$1 = null;
                            webSocketWriter$flush$1.label = 3;
                            if (flushRequest2.await(webSocketWriter$flush$1) == coroutine_suspended) {
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    } else {
                        if (r2 == 1) {
                            flushRequest = (io.ktor.websocket.WebSocketWriter.FlushRequest) webSocketWriter$flush$1.L$1;
                            flushRequest2 = (io.ktor.websocket.WebSocketWriter.FlushRequest) webSocketWriter$flush$1.L$0;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                            } catch (kotlinx.coroutines.channels.ClosedSendChannelException unused2) {
                                flushRequest.complete();
                                job = this.writeLoopJob;
                                webSocketWriter$flush$1.L$0 = flushRequest2;
                                webSocketWriter$flush$1.L$1 = null;
                                webSocketWriter$flush$1.label = 2;
                                if (job.join(webSocketWriter$flush$1) != coroutine_suspended) {
                                }
                            }
                            webSocketWriter$flush$1.L$0 = null;
                            webSocketWriter$flush$1.L$1 = null;
                            webSocketWriter$flush$1.label = 3;
                            if (flushRequest2.await(webSocketWriter$flush$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                        if (r2 != 2) {
                            if (r2 != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        }
                        flushRequest = (io.ktor.websocket.WebSocketWriter.FlushRequest) webSocketWriter$flush$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    flushRequest2 = flushRequest;
                    webSocketWriter$flush$1.L$0 = null;
                    webSocketWriter$flush$1.L$1 = null;
                    webSocketWriter$flush$1.label = 3;
                    if (flushRequest2.await(webSocketWriter$flush$1) == coroutine_suspended) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
            if (r2 != 0) {
            }
            flushRequest2 = flushRequest;
            webSocketWriter$flush$1.L$0 = null;
            webSocketWriter$flush$1.L$1 = null;
            webSocketWriter$flush$1.label = 3;
            if (flushRequest2.await(webSocketWriter$flush$1) == coroutine_suspended) {
            }
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            r2.complete();
            throw th;
        }
        webSocketWriter$flush$1 = new io.ktor.websocket.WebSocketWriter$flush$1(this, continuation);
        java.lang.Object obj2 = webSocketWriter$flush$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = webSocketWriter$flush$1.label;
    }

    /* compiled from: WebSocketWriter.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/websocket/WebSocketWriter$FlushRequest;", "", "Lkotlinx/coroutines/Job;", "parent", "<init>", "(Lkotlinx/coroutines/Job;)V", "", "complete", "()Z", "", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/CompletableJob;", "done", "Lkotlinx/coroutines/CompletableJob;", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class FlushRequest {
        private final kotlinx.coroutines.CompletableJob done;

        public FlushRequest(kotlinx.coroutines.Job job) {
            this.done = kotlinx.coroutines.JobKt.Job(job);
        }

        public final boolean complete() {
            return this.done.complete();
        }

        public final java.lang.Object await(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            java.lang.Object join = this.done.join(continuation);
            return join == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? join : kotlin.Unit.INSTANCE;
        }
    }
}
