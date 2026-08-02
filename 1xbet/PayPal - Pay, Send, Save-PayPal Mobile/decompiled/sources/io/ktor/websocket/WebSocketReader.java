package io.ktor.websocket;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u00010B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0007\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\"R\u0014\u0010\u0011\u001a\u00020$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010%R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010(R\u0014\u0010+\u001a\u00020)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010*R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020'0,8G¢\u0006\u0006\u001a\u0004\b-\u0010."}, d2 = {"Lio/ktor/websocket/WebSocketReader;", "Lkotlinx/coroutines/CoroutineScope;", "Lio/ktor/utils/io/ByteReadChannel;", "byteChannel", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "", "maxFrameSize", "Lio/ktor/utils/io/pool/ObjectPool;", "Ljava/nio/ByteBuffer;", "pool", "<init>", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/CoroutineContext;JLio/ktor/utils/io/pool/ObjectPool;)V", "p0", "", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/nio/ByteBuffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteReadChannel;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "J", "getMaxFrameSize", "()J", "setMaxFrameSize", "(J)V", "Lio/ktor/websocket/WebSocketReader$State;", "getHighSpeedVideoSizesFor", "Lio/ktor/websocket/WebSocketReader$State;", "Camera2StreamConfigurationMap", "Lio/ktor/websocket/FrameParser;", "Lio/ktor/websocket/FrameParser;", "getHighSpeedVideoFpsRanges", "Lio/ktor/websocket/SimpleFrameCollector;", "Lio/ktor/websocket/SimpleFrameCollector;", "Lkotlinx/coroutines/channels/Channel;", "Lio/ktor/websocket/Frame;", "Lkotlinx/coroutines/channels/Channel;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "getOutputFormats", "Lkotlinx/coroutines/channels/ReceiveChannel;", "getIncoming", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "incoming", "State"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WebSocketReader implements kotlinx.coroutines.CoroutineScope {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final io.ktor.websocket.SimpleFrameCollector getHighSpeedVideoSizes;
    private final kotlin.coroutines.CoroutineContext coroutineContext;
    private final kotlinx.coroutines.channels.Channel<io.ktor.websocket.Frame> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.Job getOutputFormats;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final io.ktor.websocket.FrameParser getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final io.ktor.utils.io.ByteReadChannel getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private io.ktor.websocket.WebSocketReader.State Camera2StreamConfigurationMap;
    private long maxFrameSize;

    public WebSocketReader(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.coroutines.CoroutineContext coroutineContext, long j, io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> objectPool) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteReadChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectPool, "");
        this.getHighSpeedVideoFpsRangesFor = byteReadChannel;
        this.coroutineContext = coroutineContext;
        this.maxFrameSize = j;
        this.Camera2StreamConfigurationMap = io.ktor.websocket.WebSocketReader.State.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRanges = new io.ktor.websocket.FrameParser();
        this.getHighSpeedVideoSizes = new io.ktor.websocket.SimpleFrameCollector();
        this.getHighResolutionOutputSizeshNQ4ISI = kotlinx.coroutines.channels.ChannelKt.Channel$default(8, null, null, 6, null);
        this.getOutputFormats = kotlinx.coroutines.BuildersKt.launch(this, new kotlinx.coroutines.CoroutineName("ws-reader"), kotlinx.coroutines.CoroutineStart.ATOMIC, new io.ktor.websocket.WebSocketReader$readerJob$1(objectPool, this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if (r7 != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
    
        if (r5.getHighResolutionOutputSizeshNQ4ISI(r6, r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0072 -> B:11:0x0075). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$readLoop(io.ktor.websocket.WebSocketReader webSocketReader, java.nio.ByteBuffer byteBuffer, kotlin.coroutines.Continuation continuation) {
        io.ktor.websocket.WebSocketReader$readLoop$1 webSocketReader$readLoop$1;
        int i;
        if (continuation instanceof io.ktor.websocket.WebSocketReader$readLoop$1) {
            webSocketReader$readLoop$1 = (io.ktor.websocket.WebSocketReader$readLoop$1) continuation;
            if ((webSocketReader$readLoop$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                webSocketReader$readLoop$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = webSocketReader$readLoop$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = webSocketReader$readLoop$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    byteBuffer.clear();
                    if (webSocketReader.Camera2StreamConfigurationMap != io.ktor.websocket.WebSocketReader.State.getHighSpeedVideoFpsRangesFor) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    byteBuffer = (java.nio.ByteBuffer) webSocketReader$readLoop$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    byteBuffer.compact();
                    if (webSocketReader.Camera2StreamConfigurationMap != io.ktor.websocket.WebSocketReader.State.getHighSpeedVideoFpsRangesFor) {
                        io.ktor.utils.io.ByteReadChannel byteReadChannel = webSocketReader.getHighSpeedVideoFpsRangesFor;
                        webSocketReader$readLoop$1.Camera2StreamConfigurationMap = byteBuffer;
                        webSocketReader$readLoop$1.getHighSpeedVideoFpsRangesFor = 1;
                        obj = io.ktor.utils.io.ByteReadChannelOperations_jvmKt.readAvailable(byteReadChannel, byteBuffer, webSocketReader$readLoop$1);
                    }
                    return kotlin.Unit.INSTANCE;
                }
                byteBuffer = (java.nio.ByteBuffer) webSocketReader$readLoop$1.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                if (((java.lang.Number) obj).intValue() == -1) {
                    webSocketReader.Camera2StreamConfigurationMap = io.ktor.websocket.WebSocketReader.State.getHighSpeedVideoFpsRangesFor;
                    return kotlin.Unit.INSTANCE;
                }
                byteBuffer.flip();
                webSocketReader$readLoop$1.Camera2StreamConfigurationMap = byteBuffer;
                webSocketReader$readLoop$1.getHighSpeedVideoFpsRangesFor = 2;
            }
        }
        webSocketReader$readLoop$1 = new io.ktor.websocket.WebSocketReader$readLoop$1(webSocketReader, continuation);
        java.lang.Object obj2 = webSocketReader$readLoop$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = webSocketReader$readLoop$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    public final long getMaxFrameSize() {
        return this.maxFrameSize;
    }

    public final void setMaxFrameSize(long j) {
        this.maxFrameSize = j;
    }

    public /* synthetic */ WebSocketReader(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.coroutines.CoroutineContext coroutineContext, long j, io.ktor.utils.io.pool.ObjectPool objectPool, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(byteReadChannel, coroutineContext, j, (i & 8) != 0 ? io.ktor.util.cio.ByteBufferPoolKt.getKtorDefaultPool() : objectPool);
    }

    public final kotlinx.coroutines.channels.ReceiveChannel<io.ktor.websocket.Frame> getIncoming() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(java.nio.ByteBuffer byteBuffer, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.websocket.WebSocketReader$parseLoop$1 webSocketReader$parseLoop$1;
        int i;
        if (continuation instanceof io.ktor.websocket.WebSocketReader$parseLoop$1) {
            webSocketReader$parseLoop$1 = (io.ktor.websocket.WebSocketReader$parseLoop$1) continuation;
            if ((webSocketReader$parseLoop$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                webSocketReader$parseLoop$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = webSocketReader$parseLoop$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = webSocketReader$parseLoop$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    byteBuffer = (java.nio.ByteBuffer) webSocketReader$parseLoop$1.getHighResolutionOutputSizeshNQ4ISI;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                while (byteBuffer.hasRemaining()) {
                    int i2 = io.ktor.websocket.WebSocketReader.WhenMappings.$EnumSwitchMapping$0[this.Camera2StreamConfigurationMap.ordinal()];
                    if (i2 == 1) {
                        this.getHighSpeedVideoFpsRanges.frame(byteBuffer);
                        if (this.getHighSpeedVideoFpsRanges.getBodyReady()) {
                            this.Camera2StreamConfigurationMap = io.ktor.websocket.WebSocketReader.State.getHighSpeedVideoFpsRanges;
                            if (this.getHighSpeedVideoFpsRanges.getLength() > androidx.collection.SieveCacheKt.NodeLinkMask || this.getHighSpeedVideoFpsRanges.getLength() > this.maxFrameSize) {
                                throw new io.ktor.websocket.FrameTooBigException(this.getHighSpeedVideoFpsRanges.getLength());
                            }
                            this.getHighSpeedVideoSizes.start((int) this.getHighSpeedVideoFpsRanges.getLength(), byteBuffer);
                            webSocketReader$parseLoop$1.getHighResolutionOutputSizeshNQ4ISI = byteBuffer;
                            webSocketReader$parseLoop$1.getHighSpeedVideoSizes = 1;
                            if (getHighSpeedVideoSizes(webSocketReader$parseLoop$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            return kotlin.Unit.INSTANCE;
                        }
                    } else {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                        this.getHighSpeedVideoSizes.handle(byteBuffer);
                        webSocketReader$parseLoop$1.getHighResolutionOutputSizeshNQ4ISI = byteBuffer;
                        webSocketReader$parseLoop$1.getHighSpeedVideoSizes = 2;
                        if (getHighSpeedVideoSizes(webSocketReader$parseLoop$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        webSocketReader$parseLoop$1 = new io.ktor.websocket.WebSocketReader$parseLoop$1(this, continuation);
        java.lang.Object obj2 = webSocketReader$parseLoop$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = webSocketReader$parseLoop$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        kotlin.ResultKt.throwOnFailure(obj2);
        while (byteBuffer.hasRemaining()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.websocket.WebSocketReader$handleFrameIfProduced$1 webSocketReader$handleFrameIfProduced$1;
        int i;
        if (continuation instanceof io.ktor.websocket.WebSocketReader$handleFrameIfProduced$1) {
            webSocketReader$handleFrameIfProduced$1 = (io.ktor.websocket.WebSocketReader$handleFrameIfProduced$1) continuation;
            if ((webSocketReader$handleFrameIfProduced$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                webSocketReader$handleFrameIfProduced$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = webSocketReader$handleFrameIfProduced$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = webSocketReader$handleFrameIfProduced$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!this.getHighSpeedVideoSizes.getHasRemaining()) {
                        this.Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges.getFrameType() == io.ktor.websocket.FrameType.CLOSE ? io.ktor.websocket.WebSocketReader.State.getHighSpeedVideoFpsRangesFor : io.ktor.websocket.WebSocketReader.State.getHighResolutionOutputSizeshNQ4ISI;
                        io.ktor.websocket.FrameParser frameParser = this.getHighSpeedVideoFpsRanges;
                        io.ktor.websocket.Frame byType = io.ktor.websocket.Frame.INSTANCE.byType(frameParser.getFin(), frameParser.getFrameType(), io.ktor.util.NIOKt.moveToByteArray(this.getHighSpeedVideoSizes.take(frameParser.getMaskKey())), frameParser.getRsv1(), frameParser.getRsv2(), frameParser.getRsv3());
                        kotlinx.coroutines.channels.Channel<io.ktor.websocket.Frame> channel = this.getHighResolutionOutputSizeshNQ4ISI;
                        webSocketReader$handleFrameIfProduced$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        if (channel.send(byType, webSocketReader$handleFrameIfProduced$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoFpsRanges.bodyComplete();
                return kotlin.Unit.INSTANCE;
            }
        }
        webSocketReader$handleFrameIfProduced$1 = new io.ktor.websocket.WebSocketReader$handleFrameIfProduced$1(this, continuation);
        java.lang.Object obj2 = webSocketReader$handleFrameIfProduced$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = webSocketReader$handleFrameIfProduced$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        this.getHighSpeedVideoFpsRanges.bodyComplete();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lio/ktor/websocket/WebSocketReader$State;", "", "<init>", "(Ljava/lang/String;I)V", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes17.dex */
    static final class State {
        private static final /* synthetic */ io.ktor.websocket.WebSocketReader.State[] Camera2StreamConfigurationMap;
        public static final io.ktor.websocket.WebSocketReader.State getHighResolutionOutputSizeshNQ4ISI;
        public static final io.ktor.websocket.WebSocketReader.State getHighSpeedVideoFpsRanges;
        public static final io.ktor.websocket.WebSocketReader.State getHighSpeedVideoFpsRangesFor;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

        private State(java.lang.String str, int i) {
        }

        static {
            io.ktor.websocket.WebSocketReader.State state = new io.ktor.websocket.WebSocketReader.State("HEADER", 0);
            getHighResolutionOutputSizeshNQ4ISI = state;
            io.ktor.websocket.WebSocketReader.State state2 = new io.ktor.websocket.WebSocketReader.State("BODY", 1);
            getHighSpeedVideoFpsRanges = state2;
            io.ktor.websocket.WebSocketReader.State state3 = new io.ktor.websocket.WebSocketReader.State("CLOSED", 2);
            getHighSpeedVideoFpsRangesFor = state3;
            io.ktor.websocket.WebSocketReader.State[] stateArr = {state, state2, state3};
            Camera2StreamConfigurationMap = stateArr;
            getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(stateArr);
        }

        public static io.ktor.websocket.WebSocketReader.State valueOf(java.lang.String str) {
            return (io.ktor.websocket.WebSocketReader.State) java.lang.Enum.valueOf(io.ktor.websocket.WebSocketReader.State.class, str);
        }

        public static io.ktor.websocket.WebSocketReader.State[] values() {
            return (io.ktor.websocket.WebSocketReader.State[]) Camera2StreamConfigurationMap.clone();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[io.ktor.websocket.WebSocketReader.State.values().length];
            try {
                iArr[io.ktor.websocket.WebSocketReader.State.getHighResolutionOutputSizeshNQ4ISI.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[io.ktor.websocket.WebSocketReader.State.getHighSpeedVideoFpsRanges.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[io.ktor.websocket.WebSocketReader.State.getHighSpeedVideoFpsRangesFor.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
