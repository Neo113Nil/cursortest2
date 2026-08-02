package io.ktor.websocket;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.websocket.PingPongKt$pinger$1", f = "PingPong.kt", i = {0, 0, 1, 1}, l = {66, 75, 97}, m = "invokeSuspend", n = {"random", "pingIdBytes", "random", "pingIdBytes"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes17.dex */
final class PingPongKt$pinger$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function2<io.ktor.websocket.CloseReason, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ long getHighSpeedVideoFpsRanges;
    final /* synthetic */ long getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlinx.coroutines.channels.Channel<io.ktor.websocket.Frame.Pong> getHighSpeedVideoSizes;
    java.lang.Object getInputFormats;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e4, code lost:
    
        if (r13.invoke(r1, r12) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c0, code lost:
    
        if (r13 == r0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00c0 -> B:15:0x00c2). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.random.Random Random;
        byte[] bArr;
        kotlin.random.Random random;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            org.slf4j.Logger logger = io.ktor.websocket.DefaultWebSocketSessionKt.getLOGGER();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Starting WebSocket pinger coroutine with period ");
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append(" ms and timeout ");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append(" ms");
            logger.trace(sb.toString());
            Random = kotlin.random.RandomKt.Random(io.ktor.util.date.DateJvmKt.getTimeMillis());
            bArr = new byte[32];
            this.getOutputFormats = Random;
            this.getInputFormats = bArr;
            this.getOutputMinFrameDuration = 1;
            if (kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(this.getHighSpeedVideoFpsRanges, new io.ktor.websocket.PingPongKt$pinger$1.AnonymousClass1(this.getHighSpeedVideoSizes, null), this) != coroutine_suspended) {
            }
        } else if (i == 1) {
            bArr = (byte[]) this.getInputFormats;
            random = (kotlin.random.Random) this.getOutputFormats;
            kotlin.ResultKt.throwOnFailure(obj);
            random.nextBytes(bArr);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append("[ping ");
            sb2.append(io.ktor.util.CryptoKt.hex(bArr));
            sb2.append(" ping]");
            java.lang.String obj2 = sb2.toString();
            this.getOutputFormats = random;
            this.getInputFormats = bArr;
            this.getOutputMinFrameDuration = 2;
            obj = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(this.getHighSpeedVideoFpsRangesFor, new io.ktor.websocket.PingPongKt$pinger$1$rc$1(this.Camera2StreamConfigurationMap, obj2, this.getHighSpeedVideoSizes, null), this);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            bArr = (byte[]) this.getInputFormats;
            random = (kotlin.random.Random) this.getOutputFormats;
            kotlin.ResultKt.throwOnFailure(obj);
            if (((kotlin.Unit) obj) != null) {
                Random = random;
                this.getOutputFormats = Random;
                this.getInputFormats = bArr;
                this.getOutputMinFrameDuration = 1;
                if (kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(this.getHighSpeedVideoFpsRanges, new io.ktor.websocket.PingPongKt$pinger$1.AnonymousClass1(this.getHighSpeedVideoSizes, null), this) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                random = Random;
                random.nextBytes(bArr);
                java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
                sb22.append("[ping ");
                sb22.append(io.ktor.util.CryptoKt.hex(bArr));
                sb22.append(" ping]");
                java.lang.String obj22 = sb22.toString();
                this.getOutputFormats = random;
                this.getInputFormats = bArr;
                this.getOutputMinFrameDuration = 2;
                obj = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(this.getHighSpeedVideoFpsRangesFor, new io.ktor.websocket.PingPongKt$pinger$1$rc$1(this.Camera2StreamConfigurationMap, obj22, this.getHighSpeedVideoSizes, null), this);
            } else {
                io.ktor.websocket.DefaultWebSocketSessionKt.getLOGGER().trace("WebSocket pinger has timed out");
                kotlin.jvm.functions.Function2<io.ktor.websocket.CloseReason, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2 = this.getHighResolutionOutputSizeshNQ4ISI;
                io.ktor.websocket.CloseReason closeReason = new io.ktor.websocket.CloseReason(io.ktor.websocket.CloseReason.Codes.INTERNAL_ERROR, "Ping timeout");
                this.getOutputFormats = null;
                this.getInputFormats = null;
                this.getOutputMinFrameDuration = 3;
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.websocket.PingPongKt$pinger$1$1", f = "PingPong.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.websocket.PingPongKt$pinger$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlinx.coroutines.channels.Channel<io.ktor.websocket.Frame.Pong> getHighSpeedVideoFpsRanges;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i != 0 && i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            do {
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
            } while (this.getHighSpeedVideoFpsRanges.receive(this) != coroutine_suspended);
            return coroutine_suspended;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((io.ktor.websocket.PingPongKt$pinger$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new io.ktor.websocket.PingPongKt$pinger$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(kotlinx.coroutines.channels.Channel<io.ktor.websocket.Frame.Pong> channel, kotlin.coroutines.Continuation<? super io.ktor.websocket.PingPongKt$pinger$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = channel;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.websocket.PingPongKt$pinger$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.websocket.PingPongKt$pinger$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PingPongKt$pinger$1(long j, long j2, kotlin.jvm.functions.Function2<? super io.ktor.websocket.CloseReason, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlinx.coroutines.channels.Channel<io.ktor.websocket.Frame.Pong> channel, kotlinx.coroutines.channels.SendChannel<? super io.ktor.websocket.Frame> sendChannel, kotlin.coroutines.Continuation<? super io.ktor.websocket.PingPongKt$pinger$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = j;
        this.getHighSpeedVideoFpsRangesFor = j2;
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
        this.getHighSpeedVideoSizes = channel;
        this.Camera2StreamConfigurationMap = sendChannel;
    }
}
