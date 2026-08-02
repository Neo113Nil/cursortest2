package io.ktor.client.plugins.sse;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lio/ktor/sse/ServerSentEvent;", "cause", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.sse.DefaultClientSSESession$_incoming$3", f = "DefaultClientSSESession.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class DefaultClientSSESession$_incoming$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super io.ktor.sse.ServerSentEvent>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ io.ktor.client.plugins.sse.DefaultClientSSESession Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (((java.lang.Throwable) this.getHighSpeedVideoSizes) instanceof java.util.concurrent.CancellationException) {
            io.ktor.client.plugins.sse.DefaultClientSSESession.access$close(this.Camera2StreamConfigurationMap);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super io.ktor.sse.ServerSentEvent> flowCollector, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.sse.DefaultClientSSESession$_incoming$3 defaultClientSSESession$_incoming$3 = new io.ktor.client.plugins.sse.DefaultClientSSESession$_incoming$3(this.Camera2StreamConfigurationMap, continuation);
        defaultClientSSESession$_incoming$3.getHighSpeedVideoSizes = th;
        return defaultClientSSESession$_incoming$3.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultClientSSESession$_incoming$3(io.ktor.client.plugins.sse.DefaultClientSSESession defaultClientSSESession, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.sse.DefaultClientSSESession$_incoming$3> continuation) {
        super(3, continuation);
        this.Camera2StreamConfigurationMap = defaultClientSSESession;
    }
}
