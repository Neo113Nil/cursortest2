package io.ktor.websocket;

/* compiled from: WebSocketReader.kt */
@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u00011B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020'0-8F¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00062"}, d2 = {"Lio/ktor/websocket/WebSocketReader;", "Lkotlinx/coroutines/CoroutineScope;", "Lio/ktor/utils/io/ByteReadChannel;", "byteChannel", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "", "maxFrameSize", "Lio/ktor/utils/io/pool/ObjectPool;", "Ljava/nio/ByteBuffer;", "pool", "<init>", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/CoroutineContext;JLio/ktor/utils/io/pool/ObjectPool;)V", "buffer", "", "readLoop", "(Ljava/nio/ByteBuffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parseLoop", "handleFrameIfProduced", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteReadChannel;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "J", "getMaxFrameSize", "()J", "setMaxFrameSize", "(J)V", "Lio/ktor/websocket/WebSocketReader$State;", "state", "Lio/ktor/websocket/WebSocketReader$State;", "Lio/ktor/websocket/FrameParser;", "frameParser", "Lio/ktor/websocket/FrameParser;", "Lio/ktor/websocket/SimpleFrameCollector;", "collector", "Lio/ktor/websocket/SimpleFrameCollector;", "Lkotlinx/coroutines/channels/Channel;", "Lio/ktor/websocket/Frame;", "queue", "Lkotlinx/coroutines/channels/Channel;", "Lkotlinx/coroutines/Job;", "readerJob", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "getIncoming", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "incoming", "State", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WebSocketReader implements kotlinx.coroutines.CoroutineScope {
    private final io.ktor.utils.io.ByteReadChannel byteChannel;
    private final io.ktor.websocket.SimpleFrameCollector collector;
    private final kotlin.coroutines.CoroutineContext coroutineContext;
    private final io.ktor.websocket.FrameParser frameParser;
    private long maxFrameSize;
    private final kotlinx.coroutines.channels.Channel<io.ktor.websocket.Frame> queue;
    private final kotlinx.coroutines.Job readerJob;
    private io.ktor.websocket.WebSocketReader.State state;

    /* compiled from: WebSocketReader.kt */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[io.ktor.websocket.WebSocketReader.State.values().length];
            try {
                iArr[io.ktor.websocket.WebSocketReader.State.HEADER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[io.ktor.websocket.WebSocketReader.State.BODY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[io.ktor.websocket.WebSocketReader.State.CLOSED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public WebSocketReader(io.ktor.utils.io.ByteReadChannel byteChannel, kotlin.coroutines.CoroutineContext coroutineContext, long j, io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> pool) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteChannel, "byteChannel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pool, "pool");
        this.byteChannel = byteChannel;
        this.coroutineContext = coroutineContext;
        this.maxFrameSize = j;
        this.state = io.ktor.websocket.WebSocketReader.State.HEADER;
        this.frameParser = new io.ktor.websocket.FrameParser();
        this.collector = new io.ktor.websocket.SimpleFrameCollector();
        this.queue = kotlinx.coroutines.channels.ChannelKt.Channel$default(8, null, null, 6, null);
        this.readerJob = kotlinx.coroutines.BuildersKt.launch(this, new kotlinx.coroutines.CoroutineName("ws-reader"), kotlinx.coroutines.CoroutineStart.ATOMIC, new io.ktor.websocket.WebSocketReader$readerJob$1(pool, this, null));
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
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
        return this.queue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0073 -> B:11:0x0076). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object readLoop(java.nio.ByteBuffer byteBuffer, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.websocket.WebSocketReader$readLoop$1 webSocketReader$readLoop$1;
        int i;
        if (continuation instanceof io.ktor.websocket.WebSocketReader$readLoop$1) {
            webSocketReader$readLoop$1 = (io.ktor.websocket.WebSocketReader$readLoop$1) continuation;
            if ((webSocketReader$readLoop$1.label & Integer.MIN_VALUE) != 0) {
                webSocketReader$readLoop$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = webSocketReader$readLoop$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = webSocketReader$readLoop$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    byteBuffer.clear();
                    if (this.state != io.ktor.websocket.WebSocketReader.State.CLOSED) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    byteBuffer = (java.nio.ByteBuffer) webSocketReader$readLoop$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    byteBuffer.compact();
                    if (this.state != io.ktor.websocket.WebSocketReader.State.CLOSED) {
                        io.ktor.utils.io.ByteReadChannel byteReadChannel = this.byteChannel;
                        webSocketReader$readLoop$1.L$0 = byteBuffer;
                        webSocketReader$readLoop$1.label = 1;
                        obj = io.ktor.utils.io.ByteReadChannelOperations_jvmKt.readAvailable(byteReadChannel, byteBuffer, webSocketReader$readLoop$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (((java.lang.Number) obj).intValue() != -1) {
                            this.state = io.ktor.websocket.WebSocketReader.State.CLOSED;
                        } else {
                            byteBuffer.flip();
                            webSocketReader$readLoop$1.L$0 = byteBuffer;
                            webSocketReader$readLoop$1.label = 2;
                            if (parseLoop(byteBuffer, webSocketReader$readLoop$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            byteBuffer.compact();
                            if (this.state != io.ktor.websocket.WebSocketReader.State.CLOSED) {
                            }
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
                byteBuffer = (java.nio.ByteBuffer) webSocketReader$readLoop$1.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                if (((java.lang.Number) obj).intValue() != -1) {
                }
            }
        }
        webSocketReader$readLoop$1 = new io.ktor.websocket.WebSocketReader$readLoop$1(this, continuation);
        java.lang.Object obj2 = webSocketReader$readLoop$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = webSocketReader$readLoop$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object parseLoop(java.nio.ByteBuffer byteBuffer, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.websocket.WebSocketReader$parseLoop$1 webSocketReader$parseLoop$1;
        int i;
        if (continuation instanceof io.ktor.websocket.WebSocketReader$parseLoop$1) {
            webSocketReader$parseLoop$1 = (io.ktor.websocket.WebSocketReader$parseLoop$1) continuation;
            if ((webSocketReader$parseLoop$1.label & Integer.MIN_VALUE) != 0) {
                webSocketReader$parseLoop$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = webSocketReader$parseLoop$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = webSocketReader$parseLoop$1.label;
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    byteBuffer = (java.nio.ByteBuffer) webSocketReader$parseLoop$1.L$0;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                while (byteBuffer.hasRemaining()) {
                    int i2 = io.ktor.websocket.WebSocketReader.WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
                    if (i2 == 1) {
                        this.frameParser.frame(byteBuffer);
                        if (this.frameParser.getBodyReady()) {
                            this.state = io.ktor.websocket.WebSocketReader.State.BODY;
                            if (this.frameParser.getLength() > 2147483647L || this.frameParser.getLength() > this.maxFrameSize) {
                                throw new io.ktor.websocket.FrameTooBigException(this.frameParser.getLength());
                            }
                            this.collector.start((int) this.frameParser.getLength(), byteBuffer);
                            webSocketReader$parseLoop$1.L$0 = byteBuffer;
                            webSocketReader$parseLoop$1.label = 1;
                            if (handleFrameIfProduced(webSocketReader$parseLoop$1) == coroutine_suspended) {
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
                        this.collector.handle(byteBuffer);
                        webSocketReader$parseLoop$1.L$0 = byteBuffer;
                        webSocketReader$parseLoop$1.label = 2;
                        if (handleFrameIfProduced(webSocketReader$parseLoop$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        webSocketReader$parseLoop$1 = new io.ktor.websocket.WebSocketReader$parseLoop$1(this, continuation);
        java.lang.Object obj2 = webSocketReader$parseLoop$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = webSocketReader$parseLoop$1.label;
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
    public final java.lang.Object handleFrameIfProduced(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.websocket.WebSocketReader$handleFrameIfProduced$1 webSocketReader$handleFrameIfProduced$1;
        int i;
        if (continuation instanceof io.ktor.websocket.WebSocketReader$handleFrameIfProduced$1) {
            webSocketReader$handleFrameIfProduced$1 = (io.ktor.websocket.WebSocketReader$handleFrameIfProduced$1) continuation;
            if ((webSocketReader$handleFrameIfProduced$1.label & Integer.MIN_VALUE) != 0) {
                webSocketReader$handleFrameIfProduced$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = webSocketReader$handleFrameIfProduced$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = webSocketReader$handleFrameIfProduced$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!this.collector.getHasRemaining()) {
                        this.state = this.frameParser.getFrameType() == io.ktor.websocket.FrameType.CLOSE ? io.ktor.websocket.WebSocketReader.State.CLOSED : io.ktor.websocket.WebSocketReader.State.HEADER;
                        io.ktor.websocket.FrameParser frameParser = this.frameParser;
                        io.ktor.websocket.Frame byType = io.ktor.websocket.Frame.INSTANCE.byType(frameParser.getFin(), frameParser.getFrameType(), io.ktor.util.NIOKt.moveToByteArray(this.collector.take(frameParser.getMaskKey())), frameParser.getRsv1(), frameParser.getRsv2(), frameParser.getRsv3());
                        kotlinx.coroutines.channels.Channel<io.ktor.websocket.Frame> channel = this.queue;
                        webSocketReader$handleFrameIfProduced$1.label = 1;
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
                this.frameParser.bodyComplete();
                return kotlin.Unit.INSTANCE;
            }
        }
        webSocketReader$handleFrameIfProduced$1 = new io.ktor.websocket.WebSocketReader$handleFrameIfProduced$1(this, continuation);
        java.lang.Object obj2 = webSocketReader$handleFrameIfProduced$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = webSocketReader$handleFrameIfProduced$1.label;
        if (i != 0) {
        }
        this.frameParser.bodyComplete();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WebSocketReader.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/websocket/WebSocketReader$State;", "", "<init>", "(Ljava/lang/String;I)V", "HEADER", "BODY", "CLOSED", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class State {
        private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
        private static final /* synthetic */ io.ktor.websocket.WebSocketReader.State[] $VALUES;
        public static final io.ktor.websocket.WebSocketReader.State HEADER = new io.ktor.websocket.WebSocketReader.State("HEADER", 0);
        public static final io.ktor.websocket.WebSocketReader.State BODY = new io.ktor.websocket.WebSocketReader.State("BODY", 1);
        public static final io.ktor.websocket.WebSocketReader.State CLOSED = new io.ktor.websocket.WebSocketReader.State("CLOSED", 2);

        private static final /* synthetic */ io.ktor.websocket.WebSocketReader.State[] $values() {
            return new io.ktor.websocket.WebSocketReader.State[]{HEADER, BODY, CLOSED};
        }

        public static kotlin.enums.EnumEntries<io.ktor.websocket.WebSocketReader.State> getEntries() {
            return $ENTRIES;
        }

        private State(java.lang.String str, int i) {
        }

        static {
            io.ktor.websocket.WebSocketReader.State[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
        }

        public static io.ktor.websocket.WebSocketReader.State valueOf(java.lang.String str) {
            return (io.ktor.websocket.WebSocketReader.State) java.lang.Enum.valueOf(io.ktor.websocket.WebSocketReader.State.class, str);
        }

        public static io.ktor.websocket.WebSocketReader.State[] values() {
            return (io.ktor.websocket.WebSocketReader.State[]) $VALUES.clone();
        }
    }
}
