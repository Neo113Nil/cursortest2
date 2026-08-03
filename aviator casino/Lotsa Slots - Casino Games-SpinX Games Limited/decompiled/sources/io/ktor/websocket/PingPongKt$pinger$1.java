package io.ktor.websocket;

/* compiled from: PingPong.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.websocket.PingPongKt$pinger$1", f = "PingPong.kt", i = {0, 0, 1, 1}, l = {66, 75, 97}, m = "invokeSuspend", n = {"random", "pingIdBytes", "random", "pingIdBytes"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes6.dex */
final class PingPongKt$pinger$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.channels.Channel<io.ktor.websocket.Frame.Pong> $channel;
    final /* synthetic */ kotlin.jvm.functions.Function2<io.ktor.websocket.CloseReason, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $onTimeout;
    final /* synthetic */ kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame> $outgoing;
    final /* synthetic */ long $periodMillis;
    final /* synthetic */ long $timeoutMillis;
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PingPongKt$pinger$1(long j, long j2, kotlin.jvm.functions.Function2<? super io.ktor.websocket.CloseReason, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlinx.coroutines.channels.Channel<io.ktor.websocket.Frame.Pong> channel, kotlinx.coroutines.channels.SendChannel<? super io.ktor.websocket.Frame> sendChannel, kotlin.coroutines.Continuation<? super io.ktor.websocket.PingPongKt$pinger$1> continuation) {
        super(2, continuation);
        this.$periodMillis = j;
        this.$timeoutMillis = j2;
        this.$onTimeout = function2;
        this.$channel = channel;
        this.$outgoing = sendChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.websocket.PingPongKt$pinger$1(this.$periodMillis, this.$timeoutMillis, this.$onTimeout, this.$channel, this.$outgoing, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.websocket.PingPongKt$pinger$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00c7 A[Catch: ClosedByteChannelException | CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00ea, ClosedByteChannelException | CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00ea, ClosedByteChannelException | CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00ea, ClosedByteChannelException | CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00ea, TRY_LEAVE, TryCatch #0 {ClosedByteChannelException | CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00ea, blocks: (B:7:0x0012, B:14:0x0027, B:14:0x0027, B:14:0x0027, B:14:0x0027, B:15:0x00c3, B:15:0x00c3, B:15:0x00c3, B:15:0x00c3, B:17:0x00c7, B:17:0x00c7, B:17:0x00c7, B:17:0x00c7, B:21:0x006d, B:21:0x006d, B:21:0x006d, B:21:0x006d, B:25:0x0089, B:25:0x0089, B:25:0x0089, B:25:0x0089, B:29:0x0034, B:29:0x0034, B:29:0x0034, B:29:0x0034), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00c0 -> B:15:0x00c3). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.random.Random Random;
        byte[] bArr;
        kotlin.random.Random random;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.websocket.DefaultWebSocketSessionKt.getLOGGER().trace("Starting WebSocket pinger coroutine with period " + this.$periodMillis + " ms and timeout " + this.$timeoutMillis + " ms");
            Random = kotlin.random.RandomKt.Random(io.ktor.util.date.DateJvmKt.getTimeMillis());
            bArr = new byte[32];
            this.L$0 = Random;
            this.L$1 = bArr;
            this.label = 1;
            if (kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(this.$periodMillis, new io.ktor.websocket.PingPongKt$pinger$1.AnonymousClass1(this.$channel, null), this) != coroutine_suspended) {
            }
        } else if (i == 1) {
            bArr = (byte[]) this.L$1;
            random = (kotlin.random.Random) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            random.nextBytes(bArr);
            java.lang.String str = "[ping " + io.ktor.util.CryptoKt.hex(bArr) + " ping]";
            this.L$0 = random;
            this.L$1 = bArr;
            this.label = 2;
            obj = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(this.$timeoutMillis, new io.ktor.websocket.PingPongKt$pinger$1$rc$1(this.$outgoing, str, this.$channel, null), this);
            if (obj == coroutine_suspended) {
            }
            if (((kotlin.Unit) obj) != null) {
            }
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            bArr = (byte[]) this.L$1;
            random = (kotlin.random.Random) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            if (((kotlin.Unit) obj) != null) {
                Random = random;
                this.L$0 = Random;
                this.L$1 = bArr;
                this.label = 1;
                if (kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(this.$periodMillis, new io.ktor.websocket.PingPongKt$pinger$1.AnonymousClass1(this.$channel, null), this) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                random = Random;
                random.nextBytes(bArr);
                java.lang.String str2 = "[ping " + io.ktor.util.CryptoKt.hex(bArr) + " ping]";
                this.L$0 = random;
                this.L$1 = bArr;
                this.label = 2;
                obj = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(this.$timeoutMillis, new io.ktor.websocket.PingPongKt$pinger$1$rc$1(this.$outgoing, str2, this.$channel, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (((kotlin.Unit) obj) != null) {
                }
            } else {
                io.ktor.websocket.DefaultWebSocketSessionKt.getLOGGER().trace("WebSocket pinger has timed out");
                kotlin.jvm.functions.Function2<io.ktor.websocket.CloseReason, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2 = this.$onTimeout;
                io.ktor.websocket.CloseReason closeReason = new io.ktor.websocket.CloseReason(io.ktor.websocket.CloseReason.Codes.INTERNAL_ERROR, "Ping timeout");
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                if (function2.invoke(closeReason, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            }
        }
    }

    /* compiled from: PingPong.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.websocket.PingPongKt$pinger$1$1", f = "PingPong.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.websocket.PingPongKt$pinger$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.channels.Channel<io.ktor.websocket.Frame.Pong> $channel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(kotlinx.coroutines.channels.Channel<io.ktor.websocket.Frame.Pong> channel, kotlin.coroutines.Continuation<? super io.ktor.websocket.PingPongKt$pinger$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.$channel = channel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new io.ktor.websocket.PingPongKt$pinger$1.AnonymousClass1(this.$channel, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((io.ktor.websocket.PingPongKt$pinger$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0 && i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            do {
                this.label = 1;
            } while (this.$channel.receive(this) != coroutine_suspended);
            return coroutine_suspended;
        }
    }
}
