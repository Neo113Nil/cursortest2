package io.ktor.websocket;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.websocket.WebSocketWriter$writeLoopJob$1", f = "WebSocketWriter.kt", i = {0, 0}, l = {44}, m = "invokeSuspend", n = {"$this$useInstance$iv", "instance$iv"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class WebSocketWriter$writeLoopJob$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ io.ktor.websocket.WebSocketWriter Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [io.ktor.utils.io.pool.ObjectPool] */
    /* JADX WARN: Type inference failed for: r1v7, types: [io.ktor.utils.io.pool.ObjectPool] */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> pool;
        java.nio.ByteBuffer borrow;
        java.lang.Object highSpeedVideoSizes;
        ?? r1;
        ?? r0;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pool = this.Camera2StreamConfigurationMap.getPool();
            io.ktor.websocket.WebSocketWriter webSocketWriter = this.Camera2StreamConfigurationMap;
            borrow = pool.borrow();
            try {
                this.getHighSpeedVideoFpsRanges = pool;
                this.getHighSpeedVideoSizes = borrow;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                highSpeedVideoSizes = webSocketWriter.getHighSpeedVideoSizes(borrow, this);
                if (highSpeedVideoSizes == coroutine_suspended) {
                    return coroutine_suspended;
                }
                r1 = pool;
                r0 = borrow;
            } catch (java.lang.Throwable th) {
                th = th;
                pool.recycle(borrow);
                throw th;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r0 = this.getHighSpeedVideoSizes;
            r1 = (io.ktor.utils.io.pool.ObjectPool) this.getHighSpeedVideoFpsRanges;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
                r0 = r0;
                r1 = r1;
            } catch (java.lang.Throwable th2) {
                borrow = r0;
                th = th2;
                pool = r1;
                pool.recycle(borrow);
                throw th;
            }
        }
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        r1.recycle(r0);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.websocket.WebSocketWriter$writeLoopJob$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.websocket.WebSocketWriter$writeLoopJob$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebSocketWriter$writeLoopJob$1(io.ktor.websocket.WebSocketWriter webSocketWriter, kotlin.coroutines.Continuation<? super io.ktor.websocket.WebSocketWriter$writeLoopJob$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = webSocketWriter;
    }
}
