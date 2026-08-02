package io.ktor.websocket;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u00014B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0013\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0007\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010*\u001a\u00020,8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010-R\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020\u00110.8G¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u0010\u001a\u001a\u0002028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u00103"}, d2 = {"Lio/ktor/websocket/WebSocketWriter;", "Lkotlinx/coroutines/CoroutineScope;", "Lio/ktor/utils/io/ByteWriteChannel;", "writeChannel", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "", "masking", "Lio/ktor/utils/io/pool/ObjectPool;", "Ljava/nio/ByteBuffer;", "pool", "<init>", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/CoroutineContext;ZLio/ktor/utils/io/pool/ObjectPool;)V", "p0", "", "getHighSpeedVideoSizes", "(Ljava/nio/ByteBuffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/websocket/Frame;", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(Lio/ktor/websocket/Frame;Ljava/nio/ByteBuffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME, "send", "(Lio/ktor/websocket/Frame;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flush", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lio/ktor/utils/io/ByteWriteChannel;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Z", "getMasking", "()Z", "setMasking", "(Z)V", "Lio/ktor/utils/io/pool/ObjectPool;", "getPool", "()Lio/ktor/utils/io/pool/ObjectPool;", "Lkotlinx/coroutines/channels/Channel;", "", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/channels/Channel;", "Lio/ktor/websocket/Serializer;", "Lio/ktor/websocket/Serializer;", "Lkotlinx/coroutines/channels/SendChannel;", "getOutgoing", "()Lkotlinx/coroutines/channels/SendChannel;", "outgoing", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "FlushRequest"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WebSocketWriter implements kotlinx.coroutines.CoroutineScope {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final io.ktor.utils.io.ByteWriteChannel getHighSpeedVideoFpsRangesFor;
    private final kotlin.coroutines.CoroutineContext coroutineContext;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final io.ktor.websocket.Serializer getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.channels.Channel<java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.Job Camera2StreamConfigurationMap;
    private boolean masking;
    private final io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> pool;

    public WebSocketWriter(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlin.coroutines.CoroutineContext coroutineContext, boolean z, io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> objectPool) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteWriteChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectPool, "");
        this.getHighSpeedVideoFpsRangesFor = byteWriteChannel;
        this.coroutineContext = coroutineContext;
        this.masking = z;
        this.pool = objectPool;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlinx.coroutines.channels.ChannelKt.Channel$default(8, null, null, 6, null);
        this.getHighSpeedVideoFpsRanges = new io.ktor.websocket.Serializer();
        this.Camera2StreamConfigurationMap = kotlinx.coroutines.BuildersKt.launch(this, new kotlinx.coroutines.CoroutineName("ws-writer"), kotlinx.coroutines.CoroutineStart.ATOMIC, new io.ktor.websocket.WebSocketWriter$writeLoopJob$1(this, null));
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
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
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|94|6|7|8|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009a, code lost:
    
        if (((java.lang.Boolean) r11).booleanValue() != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0092, code lost:
    
        if (r11 != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e1, code lost:
    
        if (r10.flushAndClose(r0) != r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00a2, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0106, code lost:
    
        r9.getHighResolutionOutputSizeshNQ4ISI.close(kotlinx.coroutines.ExceptionsKt.CancellationException("Failed to write to WebSocket.", r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0115, code lost:
    
        r9.getHighResolutionOutputSizeshNQ4ISI.close(kotlinx.coroutines.ExceptionsKt.CancellationException("WebSocket closed.", null));
        r10 = r9.getHighSpeedVideoFpsRangesFor;
        r0.getHighResolutionOutputSizeshNQ4ISI = null;
        r0.getHighSpeedVideoSizes = null;
        r0.getHighSpeedVideoFpsRanges = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x012d, code lost:
    
        if (r10.flushAndClose(r0) == r1) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00a0, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00e5, code lost:
    
        r9.getHighResolutionOutputSizeshNQ4ISI.close(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00ea, code lost:
    
        r9.getHighResolutionOutputSizeshNQ4ISI.close(kotlinx.coroutines.ExceptionsKt.CancellationException("WebSocket closed.", null));
        r10 = r9.getHighSpeedVideoFpsRangesFor;
        r0.getHighResolutionOutputSizeshNQ4ISI = null;
        r0.getHighSpeedVideoSizes = null;
        r0.getHighSpeedVideoFpsRanges = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0102, code lost:
    
        if (r10.flushAndClose(r0) != r1) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x007d A[Catch: all -> 0x00a0, ChannelWriteException -> 0x00a2, TRY_LEAVE, TryCatch #4 {ChannelWriteException -> 0x00a2, all -> 0x00a0, blocks: (B:55:0x0049, B:56:0x0094, B:59:0x0065, B:62:0x0075, B:64:0x007d, B:67:0x0085, B:71:0x00a8, B:72:0x00b4, B:73:0x00c8, B:83:0x0055, B:85:0x005f), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0092 -> B:41:0x0094). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00a8 -> B:43:0x009d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(java.nio.ByteBuffer byteBuffer, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.websocket.WebSocketWriter$writeLoop$1 webSocketWriter$writeLoop$1;
        kotlinx.coroutines.channels.ChannelIterator<java.lang.Object> channelIterator;
        java.nio.ByteBuffer byteBuffer2;
        if (continuation instanceof io.ktor.websocket.WebSocketWriter$writeLoop$1) {
            webSocketWriter$writeLoop$1 = (io.ktor.websocket.WebSocketWriter$writeLoop$1) continuation;
            if ((webSocketWriter$writeLoop$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                webSocketWriter$writeLoop$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = webSocketWriter$writeLoop$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (webSocketWriter$writeLoop$1.getHighSpeedVideoFpsRanges) {
                    case 0:
                        kotlin.ResultKt.throwOnFailure(obj);
                        byteBuffer.clear();
                        kotlinx.coroutines.channels.ChannelIterator<java.lang.Object> it = this.getHighResolutionOutputSizeshNQ4ISI.iterator();
                        webSocketWriter$writeLoop$1.getHighResolutionOutputSizeshNQ4ISI = byteBuffer;
                        webSocketWriter$writeLoop$1.getHighSpeedVideoSizes = it;
                        webSocketWriter$writeLoop$1.getHighSpeedVideoFpsRanges = 1;
                        java.lang.Object hasNext = it.hasNext(webSocketWriter$writeLoop$1);
                        if (hasNext != coroutine_suspended) {
                            byteBuffer2 = byteBuffer;
                            channelIterator = it;
                            obj = hasNext;
                            if (((java.lang.Boolean) obj).booleanValue()) {
                                java.lang.Object next = channelIterator.next();
                                if (next instanceof io.ktor.websocket.Frame) {
                                    webSocketWriter$writeLoop$1.getHighResolutionOutputSizeshNQ4ISI = byteBuffer2;
                                    webSocketWriter$writeLoop$1.getHighSpeedVideoSizes = channelIterator;
                                    webSocketWriter$writeLoop$1.getHighSpeedVideoFpsRanges = 2;
                                    obj = getHighResolutionOutputSizeshNQ4ISI((io.ktor.websocket.Frame) next, byteBuffer2, webSocketWriter$writeLoop$1);
                                    break;
                                } else {
                                    if (!(next instanceof io.ktor.websocket.WebSocketWriter.FlushRequest)) {
                                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                        sb.append("unknown message ");
                                        sb.append(next);
                                        throw new java.lang.IllegalArgumentException(sb.toString());
                                    }
                                    kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((io.ktor.websocket.WebSocketWriter.FlushRequest) next).getHighSpeedVideoFpsRanges.complete());
                                    it = channelIterator;
                                    byteBuffer = byteBuffer2;
                                    webSocketWriter$writeLoop$1.getHighResolutionOutputSizeshNQ4ISI = byteBuffer;
                                    webSocketWriter$writeLoop$1.getHighSpeedVideoSizes = it;
                                    webSocketWriter$writeLoop$1.getHighSpeedVideoFpsRanges = 1;
                                    java.lang.Object hasNext2 = it.hasNext(webSocketWriter$writeLoop$1);
                                    if (hasNext2 != coroutine_suspended) {
                                    }
                                }
                            }
                            this.getHighResolutionOutputSizeshNQ4ISI.close(kotlinx.coroutines.ExceptionsKt.CancellationException("WebSocket closed.", null));
                            io.ktor.utils.io.ByteWriteChannel byteWriteChannel = this.getHighSpeedVideoFpsRangesFor;
                            webSocketWriter$writeLoop$1.getHighResolutionOutputSizeshNQ4ISI = null;
                            webSocketWriter$writeLoop$1.getHighSpeedVideoSizes = null;
                            webSocketWriter$writeLoop$1.getHighSpeedVideoFpsRanges = 3;
                            break;
                        }
                        return coroutine_suspended;
                    case 1:
                        channelIterator = (kotlinx.coroutines.channels.ChannelIterator) webSocketWriter$writeLoop$1.getHighSpeedVideoSizes;
                        byteBuffer2 = (java.nio.ByteBuffer) webSocketWriter$writeLoop$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (((java.lang.Boolean) obj).booleanValue()) {
                        }
                        this.getHighResolutionOutputSizeshNQ4ISI.close(kotlinx.coroutines.ExceptionsKt.CancellationException("WebSocket closed.", null));
                        io.ktor.utils.io.ByteWriteChannel byteWriteChannel2 = this.getHighSpeedVideoFpsRangesFor;
                        webSocketWriter$writeLoop$1.getHighResolutionOutputSizeshNQ4ISI = null;
                        webSocketWriter$writeLoop$1.getHighSpeedVideoSizes = null;
                        webSocketWriter$writeLoop$1.getHighSpeedVideoFpsRanges = 3;
                        break;
                    case 2:
                        channelIterator = (kotlinx.coroutines.channels.ChannelIterator) webSocketWriter$writeLoop$1.getHighSpeedVideoSizes;
                        byteBuffer2 = (java.nio.ByteBuffer) webSocketWriter$writeLoop$1.getHighResolutionOutputSizeshNQ4ISI;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            break;
                        } catch (java.lang.Throwable th) {
                            this.getHighResolutionOutputSizeshNQ4ISI.close(kotlinx.coroutines.ExceptionsKt.CancellationException("WebSocket closed.", null));
                            io.ktor.utils.io.ByteWriteChannel byteWriteChannel3 = this.getHighSpeedVideoFpsRangesFor;
                            webSocketWriter$writeLoop$1.getHighResolutionOutputSizeshNQ4ISI = th;
                            webSocketWriter$writeLoop$1.getHighSpeedVideoSizes = null;
                            webSocketWriter$writeLoop$1.getHighSpeedVideoFpsRanges = 6;
                            if (byteWriteChannel3.flushAndClose(webSocketWriter$writeLoop$1) != coroutine_suspended) {
                                throw th;
                            }
                        }
                        break;
                    case 3:
                    case 4:
                    case 5:
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(this.getHighResolutionOutputSizeshNQ4ISI, null, 1, null);
                        while (true) {
                            try {
                                java.lang.Object m24084getOrNullimpl = kotlinx.coroutines.channels.ChannelResult.m24084getOrNullimpl(this.getHighResolutionOutputSizeshNQ4ISI.mo24073tryReceivePtdJZtk());
                                if (m24084getOrNullimpl != null) {
                                    if (!(m24084getOrNullimpl instanceof io.ktor.websocket.Frame.Close) && !(m24084getOrNullimpl instanceof io.ktor.websocket.Frame.Ping) && !(m24084getOrNullimpl instanceof io.ktor.websocket.Frame.Pong)) {
                                        if (m24084getOrNullimpl instanceof io.ktor.websocket.WebSocketWriter.FlushRequest) {
                                            ((io.ktor.websocket.WebSocketWriter.FlushRequest) m24084getOrNullimpl).getHighSpeedVideoFpsRanges.complete();
                                        } else if (!(m24084getOrNullimpl instanceof io.ktor.websocket.Frame.Text) && !(m24084getOrNullimpl instanceof io.ktor.websocket.Frame.Binary)) {
                                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                            sb2.append("unknown message ");
                                            sb2.append(m24084getOrNullimpl);
                                            throw new java.lang.IllegalArgumentException(sb2.toString());
                                        }
                                    }
                                }
                            } catch (java.util.concurrent.CancellationException unused) {
                            }
                        }
                        return kotlin.Unit.INSTANCE;
                    case 6:
                        java.lang.Throwable th2 = (java.lang.Throwable) webSocketWriter$writeLoop$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        throw th2;
                    default:
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        webSocketWriter$writeLoop$1 = new io.ktor.websocket.WebSocketWriter$writeLoop$1(this, continuation);
        java.lang.Object obj2 = webSocketWriter$writeLoop$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (webSocketWriter$writeLoop$1.getHighSpeedVideoFpsRanges) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c3, code lost:
    
        kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(r9.getHighResolutionOutputSizeshNQ4ISI, null, 1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e8, code lost:
    
        if (r12.flush(r0) != r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0148, code lost:
    
        if (r12.flush(r0) == r1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x015e, code lost:
    
        if (r12.hasRemaining() == false) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0158 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [int] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r2v18, types: [T, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x012a -> B:24:0x0152). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0130 -> B:24:0x0152). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0136 -> B:24:0x0152). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0148 -> B:23:0x014b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(io.ktor.websocket.Frame frame, java.nio.ByteBuffer byteBuffer, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        io.ktor.websocket.WebSocketWriter$drainQueueAndSerialize$1 webSocketWriter$drainQueueAndSerialize$1;
        int i;
        java.nio.ByteBuffer byteBuffer2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        int i2;
        java.nio.ByteBuffer byteBuffer3;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        int i3;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel;
        ?? r10;
        ?? m24084getOrNullimpl;
        int i4;
        int i5;
        if (continuation instanceof io.ktor.websocket.WebSocketWriter$drainQueueAndSerialize$1) {
            webSocketWriter$drainQueueAndSerialize$1 = (io.ktor.websocket.WebSocketWriter$drainQueueAndSerialize$1) continuation;
            if ((webSocketWriter$drainQueueAndSerialize$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                webSocketWriter$drainQueueAndSerialize$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = webSocketWriter$drainQueueAndSerialize$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = webSocketWriter$drainQueueAndSerialize$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.ObjectRef objectRef3 = new kotlin.jvm.internal.Ref.ObjectRef();
                    this.getHighSpeedVideoFpsRanges.enqueue(frame);
                    byteBuffer2 = byteBuffer;
                    objectRef = objectRef3;
                    r10 = frame instanceof io.ktor.websocket.Frame.Close;
                    while (objectRef.element == null) {
                        if (!(m24084getOrNullimpl instanceof io.ktor.websocket.WebSocketWriter.FlushRequest)) {
                        }
                    }
                    if (!this.getHighSpeedVideoFpsRanges.getHasOutstandingBytes()) {
                    }
                    this.getHighSpeedVideoFpsRanges.setMasking(this.masking);
                    this.getHighSpeedVideoFpsRanges.serialize(byteBuffer2);
                    byteBuffer2.flip();
                    i3 = r10;
                    byteWriteChannel = this.getHighSpeedVideoFpsRangesFor;
                    webSocketWriter$drainQueueAndSerialize$1.getHighSpeedVideoFpsRangesFor = byteBuffer2;
                    webSocketWriter$drainQueueAndSerialize$1.Camera2StreamConfigurationMap = objectRef;
                    webSocketWriter$drainQueueAndSerialize$1.getHighSpeedVideoSizes = null;
                    webSocketWriter$drainQueueAndSerialize$1.getHighSpeedVideoFpsRanges = i3;
                    webSocketWriter$drainQueueAndSerialize$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (io.ktor.utils.io.ByteWriteChannelOperations_jvmKt.writeFully(byteWriteChannel, byteBuffer2, webSocketWriter$drainQueueAndSerialize$1) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    int i6 = webSocketWriter$drainQueueAndSerialize$1.getHighSpeedVideoFpsRanges;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef4 = (kotlin.jvm.internal.Ref.ObjectRef) webSocketWriter$drainQueueAndSerialize$1.Camera2StreamConfigurationMap;
                    java.nio.ByteBuffer byteBuffer4 = (java.nio.ByteBuffer) webSocketWriter$drainQueueAndSerialize$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    byteBuffer3 = byteBuffer4;
                    objectRef2 = objectRef4;
                    i2 = i6;
                    i4 = i2;
                    if (!this.getHighSpeedVideoFpsRanges.getHasOutstandingBytes()) {
                    }
                    objectRef = objectRef2;
                    byteBuffer2 = byteBuffer3;
                    if (objectRef.element == null) {
                    }
                    i3 = i4;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i7 = webSocketWriter$drainQueueAndSerialize$1.getHighSpeedVideoFpsRanges;
                        objectRef = (kotlin.jvm.internal.Ref.ObjectRef) webSocketWriter$drainQueueAndSerialize$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        i5 = i7;
                        io.ktor.websocket.WebSocketWriter.FlushRequest flushRequest = (io.ktor.websocket.WebSocketWriter.FlushRequest) objectRef.element;
                        if (flushRequest != null) {
                            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(flushRequest.getHighSpeedVideoFpsRanges.complete());
                        }
                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(i5 != 0);
                    }
                    int i8 = webSocketWriter$drainQueueAndSerialize$1.getHighSpeedVideoFpsRanges;
                    io.ktor.websocket.WebSocketWriter.FlushRequest flushRequest2 = (io.ktor.websocket.WebSocketWriter.FlushRequest) webSocketWriter$drainQueueAndSerialize$1.getHighSpeedVideoSizes;
                    objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) webSocketWriter$drainQueueAndSerialize$1.Camera2StreamConfigurationMap;
                    byteBuffer3 = (java.nio.ByteBuffer) webSocketWriter$drainQueueAndSerialize$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    int i9 = i8;
                    flushRequest2.getHighSpeedVideoFpsRanges.complete();
                    objectRef2.element = null;
                    i4 = i9;
                    objectRef = objectRef2;
                    byteBuffer2 = byteBuffer3;
                    if (objectRef.element == null || i4 != 0) {
                        i3 = i4;
                    }
                    byteBuffer2.compact();
                    r10 = i4;
                    while (objectRef.element == null && r10 == 0 && this.getHighSpeedVideoFpsRanges.getRemainingCapacity() > 0 && (m24084getOrNullimpl = kotlinx.coroutines.channels.ChannelResult.m24084getOrNullimpl(this.getHighResolutionOutputSizeshNQ4ISI.mo24073tryReceivePtdJZtk())) != 0) {
                        if (!(m24084getOrNullimpl instanceof io.ktor.websocket.WebSocketWriter.FlushRequest)) {
                            objectRef.element = m24084getOrNullimpl;
                        } else if (m24084getOrNullimpl instanceof io.ktor.websocket.Frame.Close) {
                            this.getHighSpeedVideoFpsRanges.enqueue((io.ktor.websocket.Frame) m24084getOrNullimpl);
                            r10 = 1;
                        } else {
                            if (!(m24084getOrNullimpl instanceof io.ktor.websocket.Frame)) {
                                throw new java.lang.IllegalArgumentException("unknown message ".concat(java.lang.String.valueOf((java.lang.Object) m24084getOrNullimpl)));
                            }
                            this.getHighSpeedVideoFpsRanges.enqueue((io.ktor.websocket.Frame) m24084getOrNullimpl);
                        }
                    }
                    if (!this.getHighSpeedVideoFpsRanges.getHasOutstandingBytes() || byteBuffer2.position() != 0) {
                        this.getHighSpeedVideoFpsRanges.setMasking(this.masking);
                        this.getHighSpeedVideoFpsRanges.serialize(byteBuffer2);
                        byteBuffer2.flip();
                        i3 = r10;
                        byteWriteChannel = this.getHighSpeedVideoFpsRangesFor;
                        webSocketWriter$drainQueueAndSerialize$1.getHighSpeedVideoFpsRangesFor = byteBuffer2;
                        webSocketWriter$drainQueueAndSerialize$1.Camera2StreamConfigurationMap = objectRef;
                        webSocketWriter$drainQueueAndSerialize$1.getHighSpeedVideoSizes = null;
                        webSocketWriter$drainQueueAndSerialize$1.getHighSpeedVideoFpsRanges = i3;
                        webSocketWriter$drainQueueAndSerialize$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        if (io.ktor.utils.io.ByteWriteChannelOperations_jvmKt.writeFully(byteWriteChannel, byteBuffer2, webSocketWriter$drainQueueAndSerialize$1) != coroutine_suspended) {
                            objectRef2 = objectRef;
                            byteBuffer3 = byteBuffer2;
                            i2 = i3;
                            i4 = i2;
                            if (!this.getHighSpeedVideoFpsRanges.getHasOutstandingBytes()) {
                                i4 = i2;
                                if (!byteBuffer3.hasRemaining()) {
                                    flushRequest2 = (io.ktor.websocket.WebSocketWriter.FlushRequest) objectRef2.element;
                                    i4 = i2;
                                    if (flushRequest2 != null) {
                                        io.ktor.utils.io.ByteWriteChannel byteWriteChannel2 = this.getHighSpeedVideoFpsRangesFor;
                                        webSocketWriter$drainQueueAndSerialize$1.getHighSpeedVideoFpsRangesFor = byteBuffer3;
                                        webSocketWriter$drainQueueAndSerialize$1.Camera2StreamConfigurationMap = objectRef2;
                                        webSocketWriter$drainQueueAndSerialize$1.getHighSpeedVideoSizes = flushRequest2;
                                        webSocketWriter$drainQueueAndSerialize$1.getHighSpeedVideoFpsRanges = i2;
                                        webSocketWriter$drainQueueAndSerialize$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                                        i9 = i2;
                                    }
                                }
                            }
                            objectRef = objectRef2;
                            byteBuffer2 = byteBuffer3;
                            if (objectRef.element == null) {
                            }
                            i3 = i4;
                        }
                        return coroutine_suspended;
                    }
                    io.ktor.utils.io.ByteWriteChannel byteWriteChannel3 = this.getHighSpeedVideoFpsRangesFor;
                    webSocketWriter$drainQueueAndSerialize$1.getHighSpeedVideoFpsRangesFor = objectRef;
                    webSocketWriter$drainQueueAndSerialize$1.Camera2StreamConfigurationMap = null;
                    webSocketWriter$drainQueueAndSerialize$1.getHighSpeedVideoSizes = null;
                    webSocketWriter$drainQueueAndSerialize$1.getHighSpeedVideoFpsRanges = r10;
                    webSocketWriter$drainQueueAndSerialize$1.getHighResolutionOutputSizeshNQ4ISI = 3;
                    i5 = r10;
                }
            }
        }
        webSocketWriter$drainQueueAndSerialize$1 = new io.ktor.websocket.WebSocketWriter$drainQueueAndSerialize$1(this, continuation);
        java.lang.Object obj2 = webSocketWriter$drainQueueAndSerialize$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = webSocketWriter$drainQueueAndSerialize$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
    }

    public final java.lang.Object send(io.ktor.websocket.Frame frame, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object send = this.getHighResolutionOutputSizeshNQ4ISI.send(frame, continuation);
        return send == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : kotlin.Unit.INSTANCE;
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
    /* JADX WARN: Type inference failed for: r2v0, types: [int, io.ktor.websocket.WebSocketWriter$FlushRequest] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object flush(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.websocket.WebSocketWriter$flush$1 webSocketWriter$flush$1;
        ?? r2;
        io.ktor.websocket.WebSocketWriter.FlushRequest flushRequest;
        io.ktor.websocket.WebSocketWriter.FlushRequest flushRequest2;
        java.lang.Object join;
        try {
            if (continuation instanceof io.ktor.websocket.WebSocketWriter$flush$1) {
                webSocketWriter$flush$1 = (io.ktor.websocket.WebSocketWriter$flush$1) continuation;
                if ((webSocketWriter$flush$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                    webSocketWriter$flush$1.Camera2StreamConfigurationMap -= 2147483648;
                    java.lang.Object obj = webSocketWriter$flush$1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r2 = webSocketWriter$flush$1.Camera2StreamConfigurationMap;
                    if (r2 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        flushRequest = new io.ktor.websocket.WebSocketWriter.FlushRequest((kotlinx.coroutines.Job) getCoroutineContext().get(kotlinx.coroutines.Job.INSTANCE));
                        try {
                            kotlinx.coroutines.channels.Channel<java.lang.Object> channel = this.getHighResolutionOutputSizeshNQ4ISI;
                            webSocketWriter$flush$1.getHighSpeedVideoFpsRangesFor = flushRequest;
                            webSocketWriter$flush$1.getHighResolutionOutputSizeshNQ4ISI = flushRequest;
                            webSocketWriter$flush$1.Camera2StreamConfigurationMap = 1;
                        } catch (kotlinx.coroutines.channels.ClosedSendChannelException unused) {
                            flushRequest2 = flushRequest;
                            flushRequest.getHighSpeedVideoFpsRanges.complete();
                            kotlinx.coroutines.Job job = this.Camera2StreamConfigurationMap;
                            webSocketWriter$flush$1.getHighSpeedVideoFpsRangesFor = flushRequest2;
                            webSocketWriter$flush$1.getHighResolutionOutputSizeshNQ4ISI = null;
                            webSocketWriter$flush$1.Camera2StreamConfigurationMap = 2;
                        }
                    } else if (r2 == 1) {
                        flushRequest = (io.ktor.websocket.WebSocketWriter.FlushRequest) webSocketWriter$flush$1.getHighResolutionOutputSizeshNQ4ISI;
                        flushRequest2 = (io.ktor.websocket.WebSocketWriter.FlushRequest) webSocketWriter$flush$1.getHighSpeedVideoFpsRangesFor;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                        } catch (kotlinx.coroutines.channels.ClosedSendChannelException unused2) {
                            flushRequest.getHighSpeedVideoFpsRanges.complete();
                            kotlinx.coroutines.Job job2 = this.Camera2StreamConfigurationMap;
                            webSocketWriter$flush$1.getHighSpeedVideoFpsRangesFor = flushRequest2;
                            webSocketWriter$flush$1.getHighResolutionOutputSizeshNQ4ISI = null;
                            webSocketWriter$flush$1.Camera2StreamConfigurationMap = 2;
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
                        flushRequest = (io.ktor.websocket.WebSocketWriter.FlushRequest) webSocketWriter$flush$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    webSocketWriter$flush$1.getHighSpeedVideoFpsRangesFor = null;
                    webSocketWriter$flush$1.getHighResolutionOutputSizeshNQ4ISI = null;
                    webSocketWriter$flush$1.Camera2StreamConfigurationMap = 3;
                    join = flushRequest.getHighSpeedVideoFpsRanges.join(webSocketWriter$flush$1);
                    if (join != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        join = kotlin.Unit.INSTANCE;
                    }
                }
            }
            if (r2 != 0) {
            }
            webSocketWriter$flush$1.getHighSpeedVideoFpsRangesFor = null;
            webSocketWriter$flush$1.getHighResolutionOutputSizeshNQ4ISI = null;
            webSocketWriter$flush$1.Camera2StreamConfigurationMap = 3;
            join = flushRequest.getHighSpeedVideoFpsRanges.join(webSocketWriter$flush$1);
            if (join != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            }
        } catch (java.lang.Throwable th) {
            r2.getHighSpeedVideoFpsRanges.complete();
            throw th;
        }
        webSocketWriter$flush$1 = new io.ktor.websocket.WebSocketWriter$flush$1(this, continuation);
        java.lang.Object obj2 = webSocketWriter$flush$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = webSocketWriter$flush$1.Camera2StreamConfigurationMap;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b"}, d2 = {"Lio/ktor/websocket/WebSocketWriter$FlushRequest;", "", "Lkotlinx/coroutines/Job;", "p0", "<init>", "(Lkotlinx/coroutines/Job;)V", "Lkotlinx/coroutines/CompletableJob;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/CompletableJob;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes17.dex */
    static final class FlushRequest {

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        final kotlinx.coroutines.CompletableJob getHighSpeedVideoFpsRanges;

        public FlushRequest(kotlinx.coroutines.Job job) {
            this.getHighSpeedVideoFpsRanges = kotlinx.coroutines.JobKt.Job(job);
        }
    }
}
