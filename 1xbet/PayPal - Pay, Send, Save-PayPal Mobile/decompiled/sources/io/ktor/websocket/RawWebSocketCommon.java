package io.ktor.websocket;

@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001CB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u0007\u001a\u00020\u00068\u0017@\u0017X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\t\u001a\u00020\b8\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010\u0016\u001a\u00020#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010(R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0&8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010(R\u0016\u0010-\u001a\u00020+8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010,R\u001a\u0010\u000b\u001a\u00020\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b/\u00100R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020'018WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020'058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u001e\u0010=\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:098WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020>8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010@"}, d2 = {"Lio/ktor/websocket/RawWebSocketCommon;", "Lio/ktor/websocket/WebSocketSession;", "Lio/ktor/utils/io/ByteReadChannel;", "input", "Lio/ktor/utils/io/ByteWriteChannel;", "output", "", "maxFrameSize", "", "masking", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;JZLkotlin/coroutines/CoroutineContext;)V", "", "flush", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "terminate", "()V", "getHighSpeedVideoSizes", "Lio/ktor/utils/io/ByteReadChannel;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lio/ktor/utils/io/ByteWriteChannel;", "Camera2StreamConfigurationMap", "J", "getMaxFrameSize", "()J", "setMaxFrameSize", "(J)V", "Z", "getMasking", "()Z", "setMasking", "(Z)V", "Lkotlinx/coroutines/CompletableJob;", "getInputFormats", "Lkotlinx/coroutines/CompletableJob;", "Lkotlinx/coroutines/channels/Channel;", "Lio/ktor/websocket/Frame;", "Lkotlinx/coroutines/channels/Channel;", "", "getHighResolutionOutputSizeshNQ4ISI", "", com.visa.cbp.getEncExpo.warmup, "getInputSizeshNQ4ISI", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "getIncoming", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "incoming", "Lkotlinx/coroutines/channels/SendChannel;", "getOutgoing", "()Lkotlinx/coroutines/channels/SendChannel;", "outgoing", "", "Lio/ktor/websocket/WebSocketExtension;", "getExtensions", "()Ljava/util/List;", com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS, "Lkotlinx/coroutines/Job;", "getHighSpeedVideoSizesFor", "Lkotlinx/coroutines/Job;", "getOutputMinFrameDuration", "getOutputFormats", "FlushRequest"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RawWebSocketCommon implements io.ktor.websocket.WebSocketSession {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.channels.Channel<io.ktor.websocket.Frame> getHighSpeedVideoSizes;
    private final kotlin.coroutines.CoroutineContext coroutineContext;
    private final kotlinx.coroutines.channels.Channel<java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final io.ktor.utils.io.ByteWriteChannel Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private int getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final io.ktor.utils.io.ByteReadChannel getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.Job getOutputMinFrameDuration;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final kotlinx.coroutines.CompletableJob getHighSpeedVideoFpsRanges;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.Job getOutputFormats;
    private boolean masking;
    private long maxFrameSize;

    @Override // io.ktor.websocket.WebSocketSession
    public final java.lang.Object send(io.ktor.websocket.Frame frame, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return io.ktor.websocket.WebSocketSession.DefaultImpls.send(this, frame, continuation);
    }

    public RawWebSocketCommon(io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, long j, boolean z, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteReadChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteWriteChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        this.getHighSpeedVideoFpsRangesFor = byteReadChannel;
        this.Camera2StreamConfigurationMap = byteWriteChannel;
        this.maxFrameSize = j;
        this.masking = z;
        kotlinx.coroutines.CompletableJob Job = kotlinx.coroutines.JobKt.Job((kotlinx.coroutines.Job) coroutineContext.get(kotlinx.coroutines.Job.INSTANCE));
        this.getHighSpeedVideoFpsRanges = Job;
        this.getHighSpeedVideoSizes = kotlinx.coroutines.channels.ChannelKt.Channel$default(8, null, null, 6, null);
        this.getHighResolutionOutputSizeshNQ4ISI = kotlinx.coroutines.channels.ChannelKt.Channel$default(8, null, null, 6, null);
        this.coroutineContext = coroutineContext.plus(Job).plus(new kotlinx.coroutines.CoroutineName("raw-ws"));
        io.ktor.websocket.RawWebSocketCommon rawWebSocketCommon = this;
        this.getOutputMinFrameDuration = kotlinx.coroutines.BuildersKt.launch(rawWebSocketCommon, new kotlinx.coroutines.CoroutineName("ws-writer"), kotlinx.coroutines.CoroutineStart.ATOMIC, new io.ktor.websocket.RawWebSocketCommon$writerJob$1(this, null));
        this.getOutputFormats = kotlinx.coroutines.BuildersKt.launch(rawWebSocketCommon, new kotlinx.coroutines.CoroutineName("ws-reader"), kotlinx.coroutines.CoroutineStart.ATOMIC, new io.ktor.websocket.RawWebSocketCommon$readerJob$1(this, null));
        Job.complete();
    }

    public /* synthetic */ RawWebSocketCommon(io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, long j, boolean z, kotlin.coroutines.CoroutineContext coroutineContext, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(byteReadChannel, byteWriteChannel, (i & 4) != 0 ? androidx.collection.SieveCacheKt.NodeLinkMask : j, (i & 8) != 0 ? false : z, coroutineContext);
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final long getMaxFrameSize() {
        return this.maxFrameSize;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final void setMaxFrameSize(long j) {
        this.maxFrameSize = j;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final boolean getMasking() {
        return this.masking;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final void setMasking(boolean z) {
        this.masking = z;
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
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public final java.util.List<io.ktor.websocket.WebSocketExtension<?>> getExtensions() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a5, code lost:
    
        if (r9 != r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ab, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008d, code lost:
    
        if (r9.join(r0) != r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (r9.send(r2, r0) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, io.ktor.websocket.RawWebSocketCommon$FlushRequest] */
    @Override // io.ktor.websocket.WebSocketSession
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object flush(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.websocket.RawWebSocketCommon$flush$1 rawWebSocketCommon$flush$1;
        ?? r2;
        io.ktor.websocket.RawWebSocketCommon.FlushRequest flushRequest;
        io.ktor.websocket.RawWebSocketCommon.FlushRequest flushRequest2;
        java.lang.Object join;
        try {
            if (continuation instanceof io.ktor.websocket.RawWebSocketCommon$flush$1) {
                rawWebSocketCommon$flush$1 = (io.ktor.websocket.RawWebSocketCommon$flush$1) continuation;
                if ((rawWebSocketCommon$flush$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                    rawWebSocketCommon$flush$1.getHighSpeedVideoFpsRanges -= 2147483648;
                    java.lang.Object obj = rawWebSocketCommon$flush$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r2 = rawWebSocketCommon$flush$1.getHighSpeedVideoFpsRanges;
                    if (r2 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        flushRequest = new io.ktor.websocket.RawWebSocketCommon.FlushRequest((kotlinx.coroutines.Job) getCoroutineContext().get(kotlinx.coroutines.Job.INSTANCE));
                        try {
                            kotlinx.coroutines.channels.Channel<java.lang.Object> channel = this.getHighResolutionOutputSizeshNQ4ISI;
                            rawWebSocketCommon$flush$1.getHighSpeedVideoFpsRangesFor = flushRequest;
                            rawWebSocketCommon$flush$1.Camera2StreamConfigurationMap = flushRequest;
                            rawWebSocketCommon$flush$1.getHighSpeedVideoFpsRanges = 1;
                        } catch (kotlinx.coroutines.channels.ClosedSendChannelException unused) {
                            flushRequest2 = flushRequest;
                            flushRequest.getHighResolutionOutputSizeshNQ4ISI.complete();
                            kotlinx.coroutines.Job job = this.getOutputMinFrameDuration;
                            rawWebSocketCommon$flush$1.getHighSpeedVideoFpsRangesFor = flushRequest2;
                            rawWebSocketCommon$flush$1.Camera2StreamConfigurationMap = null;
                            rawWebSocketCommon$flush$1.getHighSpeedVideoFpsRanges = 2;
                        }
                    } else if (r2 == 1) {
                        flushRequest = (io.ktor.websocket.RawWebSocketCommon.FlushRequest) rawWebSocketCommon$flush$1.Camera2StreamConfigurationMap;
                        flushRequest2 = (io.ktor.websocket.RawWebSocketCommon.FlushRequest) rawWebSocketCommon$flush$1.getHighSpeedVideoFpsRangesFor;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                        } catch (kotlinx.coroutines.channels.ClosedSendChannelException unused2) {
                            flushRequest.getHighResolutionOutputSizeshNQ4ISI.complete();
                            kotlinx.coroutines.Job job2 = this.getOutputMinFrameDuration;
                            rawWebSocketCommon$flush$1.getHighSpeedVideoFpsRangesFor = flushRequest2;
                            rawWebSocketCommon$flush$1.Camera2StreamConfigurationMap = null;
                            rawWebSocketCommon$flush$1.getHighSpeedVideoFpsRanges = 2;
                        }
                        flushRequest = flushRequest2;
                    } else {
                        if (r2 != 2) {
                            if (r2 != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        }
                        flushRequest = (io.ktor.websocket.RawWebSocketCommon.FlushRequest) rawWebSocketCommon$flush$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    rawWebSocketCommon$flush$1.getHighSpeedVideoFpsRangesFor = null;
                    rawWebSocketCommon$flush$1.Camera2StreamConfigurationMap = null;
                    rawWebSocketCommon$flush$1.getHighSpeedVideoFpsRanges = 3;
                    join = flushRequest.getHighResolutionOutputSizeshNQ4ISI.join(rawWebSocketCommon$flush$1);
                    if (join != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        join = kotlin.Unit.INSTANCE;
                    }
                }
            }
            if (r2 != 0) {
            }
            rawWebSocketCommon$flush$1.getHighSpeedVideoFpsRangesFor = null;
            rawWebSocketCommon$flush$1.Camera2StreamConfigurationMap = null;
            rawWebSocketCommon$flush$1.getHighSpeedVideoFpsRanges = 3;
            join = flushRequest.getHighResolutionOutputSizeshNQ4ISI.join(rawWebSocketCommon$flush$1);
            if (join != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            }
        } catch (java.lang.Throwable th) {
            r2.getHighResolutionOutputSizeshNQ4ISI.complete();
            throw th;
        }
        rawWebSocketCommon$flush$1 = new io.ktor.websocket.RawWebSocketCommon$flush$1(this, continuation);
        java.lang.Object obj2 = rawWebSocketCommon$flush$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = rawWebSocketCommon$flush$1.getHighSpeedVideoFpsRanges;
    }

    @Override // io.ktor.websocket.WebSocketSession
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use cancel() instead.", replaceWith = @kotlin.ReplaceWith(expression = "cancel()", imports = {"kotlinx.coroutines.cancel"}))
    public final void terminate() {
        kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(getOutgoing(), null, 1, null);
        this.getHighSpeedVideoFpsRanges.complete();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b"}, d2 = {"Lio/ktor/websocket/RawWebSocketCommon$FlushRequest;", "", "Lkotlinx/coroutines/Job;", "p0", "<init>", "(Lkotlinx/coroutines/Job;)V", "Lkotlinx/coroutines/CompletableJob;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/CompletableJob;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class FlushRequest {

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        final kotlinx.coroutines.CompletableJob getHighResolutionOutputSizeshNQ4ISI;

        public FlushRequest(kotlinx.coroutines.Job job) {
            this.getHighResolutionOutputSizeshNQ4ISI = kotlinx.coroutines.JobKt.Job(job);
        }
    }
}
