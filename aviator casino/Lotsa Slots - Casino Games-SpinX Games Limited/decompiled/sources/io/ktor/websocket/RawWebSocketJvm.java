package io.ktor.websocket;

/* compiled from: RawWebSocketJvm.kt */
@kotlin.Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001a0 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001a0$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u001e\u0010,\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030)0(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00068V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R+\u0010\t\u001a\u00020\b2\u0006\u0010-\u001a\u00020\b8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010/\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u0010:\u001a\u0002098\u0000X\u0080\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010?\u001a\u00020>8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B¨\u0006C"}, d2 = {"Lio/ktor/websocket/RawWebSocketJvm;", "Lio/ktor/websocket/WebSocketSession;", "Lio/ktor/utils/io/ByteReadChannel;", "input", "Lio/ktor/utils/io/ByteWriteChannel;", "output", "", "maxFrameSize", "", "masking", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lio/ktor/utils/io/pool/ObjectPool;", "Ljava/nio/ByteBuffer;", "pool", "<init>", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;JZLkotlin/coroutines/CoroutineContext;Lio/ktor/utils/io/pool/ObjectPool;)V", "", "flush", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "terminate", "()V", "Lkotlinx/coroutines/CompletableJob;", "socketJob", "Lkotlinx/coroutines/CompletableJob;", "Lkotlinx/coroutines/channels/Channel;", "Lio/ktor/websocket/Frame;", "filtered", "Lkotlinx/coroutines/channels/Channel;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "getIncoming", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "incoming", "Lkotlinx/coroutines/channels/SendChannel;", "getOutgoing", "()Lkotlinx/coroutines/channels/SendChannel;", "outgoing", "", "Lio/ktor/websocket/WebSocketExtension;", "getExtensions", "()Ljava/util/List;", "extensions", "<set-?>", "maxFrameSize$delegate", "Lkotlin/properties/ReadWriteProperty;", "getMaxFrameSize", "()J", "setMaxFrameSize", "(J)V", "masking$delegate", "getMasking", "()Z", "setMasking", "(Z)V", "Lio/ktor/websocket/WebSocketWriter;", "writer", "Lio/ktor/websocket/WebSocketWriter;", "getWriter$ktor_websockets", "()Lio/ktor/websocket/WebSocketWriter;", "Lio/ktor/websocket/WebSocketReader;", "reader", "Lio/ktor/websocket/WebSocketReader;", "getReader$ktor_websockets", "()Lio/ktor/websocket/WebSocketReader;", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RawWebSocketJvm implements io.ktor.websocket.WebSocketSession {
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(io.ktor.websocket.RawWebSocketJvm.class, "maxFrameSize", "getMaxFrameSize()J", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(io.ktor.websocket.RawWebSocketJvm.class, "masking", "getMasking()Z", 0))};
    private final kotlin.coroutines.CoroutineContext coroutineContext;
    private final kotlinx.coroutines.channels.Channel<io.ktor.websocket.Frame> filtered;

    /* renamed from: masking$delegate, reason: from kotlin metadata */
    private final kotlin.properties.ReadWriteProperty masking;

    /* renamed from: maxFrameSize$delegate, reason: from kotlin metadata */
    private final kotlin.properties.ReadWriteProperty maxFrameSize;
    private final io.ktor.websocket.WebSocketReader reader;
    private final kotlinx.coroutines.CompletableJob socketJob;
    private final io.ktor.websocket.WebSocketWriter writer;

    public RawWebSocketJvm(io.ktor.utils.io.ByteReadChannel input, io.ktor.utils.io.ByteWriteChannel output, long j, boolean z, kotlin.coroutines.CoroutineContext coroutineContext, io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> pool) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "output");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pool, "pool");
        kotlinx.coroutines.CompletableJob Job = kotlinx.coroutines.JobKt.Job((kotlinx.coroutines.Job) coroutineContext.get(kotlinx.coroutines.Job.INSTANCE));
        this.socketJob = Job;
        this.filtered = kotlinx.coroutines.channels.ChannelKt.Channel$default(0, null, null, 6, null);
        this.coroutineContext = coroutineContext.plus(Job).plus(new kotlinx.coroutines.CoroutineName("raw-ws"));
        kotlin.properties.Delegates delegates = kotlin.properties.Delegates.INSTANCE;
        final java.lang.Long valueOf = java.lang.Long.valueOf(j);
        this.maxFrameSize = new kotlin.properties.ObservableProperty<java.lang.Long>(valueOf) { // from class: io.ktor.websocket.RawWebSocketJvm$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(kotlin.reflect.KProperty<?> property, java.lang.Long oldValue, java.lang.Long newValue) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "property");
                long longValue = newValue.longValue();
                oldValue.longValue();
                this.getReader().setMaxFrameSize(longValue);
            }
        };
        kotlin.properties.Delegates delegates2 = kotlin.properties.Delegates.INSTANCE;
        final java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(z);
        this.masking = new kotlin.properties.ObservableProperty<java.lang.Boolean>(valueOf2) { // from class: io.ktor.websocket.RawWebSocketJvm$special$$inlined$observable$2
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(kotlin.reflect.KProperty<?> property, java.lang.Boolean oldValue, java.lang.Boolean newValue) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "property");
                boolean booleanValue = newValue.booleanValue();
                oldValue.booleanValue();
                this.getWriter().setMasking(booleanValue);
            }
        };
        this.writer = new io.ktor.websocket.WebSocketWriter(output, getCoroutineContext(), z, pool);
        this.reader = new io.ktor.websocket.WebSocketReader(input, getCoroutineContext(), j, pool);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this, null, null, new io.ktor.websocket.RawWebSocketJvm.AnonymousClass1(null), 3, null);
        Job.complete();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public java.lang.Object send(io.ktor.websocket.Frame frame, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return io.ktor.websocket.WebSocketSession.DefaultImpls.send(this, frame, continuation);
    }

    public /* synthetic */ RawWebSocketJvm(io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, long j, boolean z, kotlin.coroutines.CoroutineContext coroutineContext, io.ktor.utils.io.pool.ObjectPool objectPool, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(byteReadChannel, byteWriteChannel, (i & 4) != 0 ? 2147483647L : j, (i & 8) != 0 ? false : z, coroutineContext, (i & 32) != 0 ? io.ktor.util.cio.ByteBufferPoolKt.getKtorDefaultPool() : objectPool);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public kotlinx.coroutines.channels.ReceiveChannel<io.ktor.websocket.Frame> getIncoming() {
        return this.filtered;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame> getOutgoing() {
        return this.writer.getOutgoing();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public java.util.List<io.ktor.websocket.WebSocketExtension<?>> getExtensions() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public long getMaxFrameSize() {
        return ((java.lang.Number) this.maxFrameSize.getValue(this, $$delegatedProperties[0])).longValue();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public void setMaxFrameSize(long j) {
        this.maxFrameSize.setValue(this, $$delegatedProperties[0], java.lang.Long.valueOf(j));
    }

    @Override // io.ktor.websocket.WebSocketSession
    public boolean getMasking() {
        return ((java.lang.Boolean) this.masking.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public void setMasking(boolean z) {
        this.masking.setValue(this, $$delegatedProperties[1], java.lang.Boolean.valueOf(z));
    }

    /* renamed from: getWriter$ktor_websockets, reason: from getter */
    public final io.ktor.websocket.WebSocketWriter getWriter() {
        return this.writer;
    }

    /* renamed from: getReader$ktor_websockets, reason: from getter */
    public final io.ktor.websocket.WebSocketReader getReader() {
        return this.reader;
    }

    /* compiled from: RawWebSocketJvm.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.websocket.RawWebSocketJvm$1", f = "RawWebSocketJvm.kt", i = {}, l = {70, 71}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.websocket.RawWebSocketJvm$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        java.lang.Object L$0;
        int label;

        AnonymousClass1(kotlin.coroutines.Continuation<? super io.ktor.websocket.RawWebSocketJvm.AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return io.ktor.websocket.RawWebSocketJvm.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((io.ktor.websocket.RawWebSocketJvm.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0046 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0052 A[Catch: all -> 0x006c, CancellationException -> 0x0082, ProtocolViolationException -> 0x0091, FrameTooBigException -> 0x00b7, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0082, blocks: (B:7:0x0013, B:9:0x0039, B:14:0x004a, B:16:0x0052, B:26:0x0024, B:28:0x002b), top: B:2:0x0009, outer: #0 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0069 -> B:8:0x0016). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.channels.ChannelIterator<io.ktor.websocket.Frame> it;
            kotlinx.coroutines.channels.ChannelIterator<io.ktor.websocket.Frame> channelIterator;
            java.lang.Object hasNext;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                try {
                    try {
                        try {
                            try {
                            } catch (java.util.concurrent.CancellationException e) {
                                io.ktor.websocket.RawWebSocketJvm.this.getReader().getIncoming().cancel(e);
                            }
                        } catch (io.ktor.websocket.FrameTooBigException e2) {
                            io.ktor.websocket.RawWebSocketJvm.this.getOutgoing().mo10716trySendJP2dKIU(new io.ktor.websocket.Frame.Close(new io.ktor.websocket.CloseReason(io.ktor.websocket.CloseReason.Codes.TOO_BIG, e2.getMessage())));
                            io.ktor.websocket.RawWebSocketJvm.this.filtered.close(e2);
                        }
                    } catch (io.ktor.websocket.ProtocolViolationException e3) {
                        io.ktor.websocket.RawWebSocketJvm.this.getOutgoing().mo10716trySendJP2dKIU(new io.ktor.websocket.Frame.Close(new io.ktor.websocket.CloseReason(io.ktor.websocket.CloseReason.Codes.PROTOCOL_ERROR, e3.getMessage())));
                        io.ktor.websocket.RawWebSocketJvm.this.filtered.close(e3);
                    }
                } catch (java.lang.Throwable th) {
                    io.ktor.websocket.RawWebSocketJvm.this.filtered.close(th);
                }
                if (i != 0) {
                    if (i == 1) {
                        channelIterator = (kotlinx.coroutines.channels.ChannelIterator) this.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (((java.lang.Boolean) obj).booleanValue()) {
                        }
                        kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(io.ktor.websocket.RawWebSocketJvm.this.filtered, null, 1, null);
                        return kotlin.Unit.INSTANCE;
                    }
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    channelIterator = (kotlinx.coroutines.channels.ChannelIterator) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    it = channelIterator;
                    this.L$0 = it;
                    this.label = 1;
                    hasNext = it.hasNext(this);
                    if (hasNext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    channelIterator = it;
                    obj = hasNext;
                    if (((java.lang.Boolean) obj).booleanValue()) {
                        io.ktor.websocket.Frame next = channelIterator.next();
                        this.L$0 = channelIterator;
                        this.label = 2;
                        if (io.ktor.websocket.RawWebSocketJvm.this.filtered.send(next, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        it = channelIterator;
                        this.L$0 = it;
                        this.label = 1;
                        hasNext = it.hasNext(this);
                        if (hasNext == coroutine_suspended) {
                        }
                    }
                    kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(io.ktor.websocket.RawWebSocketJvm.this.filtered, null, 1, null);
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                it = io.ktor.websocket.RawWebSocketJvm.this.getReader().getIncoming().iterator();
                this.L$0 = it;
                this.label = 1;
                hasNext = it.hasNext(this);
                if (hasNext == coroutine_suspended) {
                }
            } catch (java.lang.Throwable th2) {
                kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(io.ktor.websocket.RawWebSocketJvm.this.filtered, null, 1, null);
                throw th2;
            }
        }
    }

    @Override // io.ktor.websocket.WebSocketSession
    public java.lang.Object flush(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object flush = this.writer.flush(continuation);
        return flush == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? flush : kotlin.Unit.INSTANCE;
    }

    @Override // io.ktor.websocket.WebSocketSession
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use cancel() instead.", replaceWith = @kotlin.ReplaceWith(expression = "cancel()", imports = {"kotlinx.coroutines.cancel"}))
    public void terminate() {
        kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(getOutgoing(), null, 1, null);
        this.socketJob.complete();
    }
}
