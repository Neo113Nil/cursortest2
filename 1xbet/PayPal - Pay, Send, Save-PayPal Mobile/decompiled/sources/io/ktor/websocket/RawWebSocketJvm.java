package io.ktor.websocket;

@kotlin.Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\n8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001b0!8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001b0%8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001e\u0010-\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030*0)8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u00068W@WX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R+\u0010\t\u001a\u00020\b2\u0006\u0010.\u001a\u00020\b8W@WX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\b5\u00100\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010;\u001a\u00020:8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010@\u001a\u00020?8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C"}, d2 = {"Lio/ktor/websocket/RawWebSocketJvm;", "Lio/ktor/websocket/WebSocketSession;", "Lio/ktor/utils/io/ByteReadChannel;", "input", "Lio/ktor/utils/io/ByteWriteChannel;", "output", "", "maxFrameSize", "", "masking", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lio/ktor/utils/io/pool/ObjectPool;", "Ljava/nio/ByteBuffer;", "pool", "<init>", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;JZLkotlin/coroutines/CoroutineContext;Lio/ktor/utils/io/pool/ObjectPool;)V", "", "flush", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "terminate", "()V", "Lkotlinx/coroutines/CompletableJob;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/CompletableJob;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/channels/Channel;", "Lio/ktor/websocket/Frame;", "Lkotlinx/coroutines/channels/Channel;", "getHighSpeedVideoSizes", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "getIncoming", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "incoming", "Lkotlinx/coroutines/channels/SendChannel;", "getOutgoing", "()Lkotlinx/coroutines/channels/SendChannel;", "outgoing", "", "Lio/ktor/websocket/WebSocketExtension;", "getExtensions", "()Ljava/util/List;", com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS, "<set-?>", "maxFrameSize$delegate", "Lkotlin/properties/ReadWriteProperty;", "getMaxFrameSize", "()J", "setMaxFrameSize", "(J)V", "masking$delegate", "getMasking", "()Z", "setMasking", "(Z)V", "Lio/ktor/websocket/WebSocketWriter;", "writer", "Lio/ktor/websocket/WebSocketWriter;", "getWriter$ktor_websockets", "()Lio/ktor/websocket/WebSocketWriter;", "Lio/ktor/websocket/WebSocketReader;", "reader", "Lio/ktor/websocket/WebSocketReader;", "getReader$ktor_websockets", "()Lio/ktor/websocket/WebSocketReader;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RawWebSocketJvm implements io.ktor.websocket.WebSocketSession {
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoSizes = {kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(io.ktor.websocket.RawWebSocketJvm.class, "maxFrameSize", "getMaxFrameSize()J", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(io.ktor.websocket.RawWebSocketJvm.class, "masking", "getMasking()Z", 0))};

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.channels.Channel<io.ktor.websocket.Frame> getHighSpeedVideoSizes;
    private final kotlin.coroutines.CoroutineContext coroutineContext;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.CompletableJob Camera2StreamConfigurationMap;

    /* renamed from: masking$delegate, reason: from kotlin metadata */
    private final kotlin.properties.ReadWriteProperty masking;

    /* renamed from: maxFrameSize$delegate, reason: from kotlin metadata */
    private final kotlin.properties.ReadWriteProperty maxFrameSize;
    private final io.ktor.websocket.WebSocketReader reader;
    private final io.ktor.websocket.WebSocketWriter writer;

    public RawWebSocketJvm(io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, long j, boolean z, kotlin.coroutines.CoroutineContext coroutineContext, io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> objectPool) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteReadChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteWriteChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectPool, "");
        kotlinx.coroutines.CompletableJob Job = kotlinx.coroutines.JobKt.Job((kotlinx.coroutines.Job) coroutineContext.get(kotlinx.coroutines.Job.INSTANCE));
        this.Camera2StreamConfigurationMap = Job;
        this.getHighSpeedVideoSizes = kotlinx.coroutines.channels.ChannelKt.Channel$default(0, null, null, 6, null);
        this.coroutineContext = coroutineContext.plus(Job).plus(new kotlinx.coroutines.CoroutineName("raw-ws"));
        kotlin.properties.Delegates delegates = kotlin.properties.Delegates.INSTANCE;
        final java.lang.Long valueOf = java.lang.Long.valueOf(j);
        this.maxFrameSize = new kotlin.properties.ObservableProperty<java.lang.Long>(valueOf) { // from class: io.ktor.websocket.RawWebSocketJvm$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            public final void afterChange(kotlin.reflect.KProperty<?> property, java.lang.Long oldValue, java.lang.Long newValue) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
                this.getReader().setMaxFrameSize(newValue.longValue());
            }
        };
        kotlin.properties.Delegates delegates2 = kotlin.properties.Delegates.INSTANCE;
        final java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(z);
        this.masking = new kotlin.properties.ObservableProperty<java.lang.Boolean>(valueOf2) { // from class: io.ktor.websocket.RawWebSocketJvm$special$$inlined$observable$2
            @Override // kotlin.properties.ObservableProperty
            public final void afterChange(kotlin.reflect.KProperty<?> property, java.lang.Boolean oldValue, java.lang.Boolean newValue) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
                this.getWriter().setMasking(newValue.booleanValue());
            }
        };
        this.writer = new io.ktor.websocket.WebSocketWriter(byteWriteChannel, getCoroutineContext(), z, objectPool);
        this.reader = new io.ktor.websocket.WebSocketReader(byteReadChannel, getCoroutineContext(), j, objectPool);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this, null, null, new io.ktor.websocket.RawWebSocketJvm.AnonymousClass1(null), 3, null);
        Job.complete();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final java.lang.Object send(io.ktor.websocket.Frame frame, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return io.ktor.websocket.WebSocketSession.DefaultImpls.send(this, frame, continuation);
    }

    public /* synthetic */ RawWebSocketJvm(io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, long j, boolean z, kotlin.coroutines.CoroutineContext coroutineContext, io.ktor.utils.io.pool.ObjectPool objectPool, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(byteReadChannel, byteWriteChannel, (i & 4) != 0 ? 2147483647L : j, (i & 8) != 0 ? false : z, coroutineContext, (i & 32) != 0 ? io.ktor.util.cio.ByteBufferPoolKt.getKtorDefaultPool() : objectPool);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final kotlinx.coroutines.channels.ReceiveChannel<io.ktor.websocket.Frame> getIncoming() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame> getOutgoing() {
        return this.writer.getOutgoing();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final java.util.List<io.ktor.websocket.WebSocketExtension<?>> getExtensions() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final long getMaxFrameSize() {
        return ((java.lang.Number) this.maxFrameSize.getValue(this, getHighSpeedVideoSizes[0])).longValue();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final void setMaxFrameSize(long j) {
        this.maxFrameSize.setValue(this, getHighSpeedVideoSizes[0], java.lang.Long.valueOf(j));
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final boolean getMasking() {
        return ((java.lang.Boolean) this.masking.getValue(this, getHighSpeedVideoSizes[1])).booleanValue();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final void setMasking(boolean z) {
        this.masking.setValue(this, getHighSpeedVideoSizes[1], java.lang.Boolean.valueOf(z));
    }

    /* renamed from: getWriter$ktor_websockets, reason: from getter */
    public final io.ktor.websocket.WebSocketWriter getWriter() {
        return this.writer;
    }

    /* renamed from: getReader$ktor_websockets, reason: from getter */
    public final io.ktor.websocket.WebSocketReader getReader() {
        return this.reader;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.websocket.RawWebSocketJvm$1", f = "RawWebSocketJvm.kt", i = {}, l = {70, 71}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.websocket.RawWebSocketJvm$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object getHighSpeedVideoSizes;

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
        
            if (r8.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes.send(r9, r8) == r0) goto L23;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0051 A[Catch: all -> 0x006b, CancellationException -> 0x0076, ProtocolViolationException -> 0x0085, FrameTooBigException -> 0x00ab, TRY_LEAVE, TryCatch #5 {FrameTooBigException -> 0x00ab, all -> 0x006b, blocks: (B:7:0x0013, B:9:0x0039, B:12:0x0049, B:14:0x0051, B:24:0x0024, B:26:0x002b), top: B:2:0x0009, outer: #3 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0068 -> B:8:0x0016). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.channels.ChannelIterator<io.ktor.websocket.Frame> it;
            kotlinx.coroutines.channels.ChannelIterator<io.ktor.websocket.Frame> channelIterator;
            java.lang.Object hasNext;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            try {
                try {
                    try {
                    } catch (io.ktor.websocket.FrameTooBigException e) {
                        io.ktor.websocket.RawWebSocketJvm.this.getOutgoing().mo9266trySendJP2dKIU(new io.ktor.websocket.Frame.Close(new io.ktor.websocket.CloseReason(io.ktor.websocket.CloseReason.Codes.TOO_BIG, e.getMessage())));
                        io.ktor.websocket.RawWebSocketJvm.this.getHighSpeedVideoSizes.close(e);
                    } catch (java.lang.Throwable th) {
                        io.ktor.websocket.RawWebSocketJvm.this.getHighSpeedVideoSizes.close(th);
                    }
                } catch (io.ktor.websocket.ProtocolViolationException e2) {
                    io.ktor.websocket.RawWebSocketJvm.this.getOutgoing().mo9266trySendJP2dKIU(new io.ktor.websocket.Frame.Close(new io.ktor.websocket.CloseReason(io.ktor.websocket.CloseReason.Codes.PROTOCOL_ERROR, e2.getMessage())));
                    io.ktor.websocket.RawWebSocketJvm.this.getHighSpeedVideoSizes.close(e2);
                } catch (java.util.concurrent.CancellationException e3) {
                    io.ktor.websocket.RawWebSocketJvm.this.getReader().getIncoming().cancel(e3);
                }
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    it = io.ktor.websocket.RawWebSocketJvm.this.getReader().getIncoming().iterator();
                    this.getHighSpeedVideoSizes = it;
                    this.getHighResolutionOutputSizeshNQ4ISI = 1;
                    hasNext = it.hasNext(this);
                    if (hasNext != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    channelIterator = (kotlinx.coroutines.channels.ChannelIterator) this.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (((java.lang.Boolean) obj).booleanValue()) {
                    }
                    kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(io.ktor.websocket.RawWebSocketJvm.this.getHighSpeedVideoSizes, null, 1, null);
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                channelIterator = (kotlinx.coroutines.channels.ChannelIterator) this.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                it = channelIterator;
                this.getHighSpeedVideoSizes = it;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                hasNext = it.hasNext(this);
                if (hasNext != coroutine_suspended) {
                    channelIterator = it;
                    obj = hasNext;
                    if (((java.lang.Boolean) obj).booleanValue()) {
                        io.ktor.websocket.Frame next = channelIterator.next();
                        this.getHighSpeedVideoSizes = channelIterator;
                        this.getHighResolutionOutputSizeshNQ4ISI = 2;
                    }
                    kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(io.ktor.websocket.RawWebSocketJvm.this.getHighSpeedVideoSizes, null, 1, null);
                    return kotlin.Unit.INSTANCE;
                }
                return coroutine_suspended;
            } catch (java.lang.Throwable th2) {
                kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(io.ktor.websocket.RawWebSocketJvm.this.getHighSpeedVideoSizes, null, 1, null);
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((io.ktor.websocket.RawWebSocketJvm.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return io.ktor.websocket.RawWebSocketJvm.this.new AnonymousClass1(continuation);
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super io.ktor.websocket.RawWebSocketJvm.AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final java.lang.Object flush(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object flush = this.writer.flush(continuation);
        return flush == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? flush : kotlin.Unit.INSTANCE;
    }

    @Override // io.ktor.websocket.WebSocketSession
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use cancel() instead.", replaceWith = @kotlin.ReplaceWith(expression = "cancel()", imports = {"kotlinx.coroutines.cancel"}))
    public final void terminate() {
        kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(getOutgoing(), null, 1, null);
        this.Camera2StreamConfigurationMap.complete();
    }
}
