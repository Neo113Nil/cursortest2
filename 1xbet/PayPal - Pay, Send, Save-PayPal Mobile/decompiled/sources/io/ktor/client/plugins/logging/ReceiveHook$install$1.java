package io.ktor.client.plugins.logging;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponseContainer;", "Lio/ktor/client/call/HttpClientCall;", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.logging.ReceiveHook$install$1", f = "Logging.kt", i = {}, l = {759}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class ReceiveHook$install$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<io.ktor.client.statement.HttpResponseContainer, io.ktor.client.call.HttpClientCall>, io.ktor.client.statement.HttpResponseContainer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function3<io.ktor.client.plugins.logging.ReceiveHook.Context, io.ktor.client.call.HttpClientCall, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.util.pipeline.PipelineContext pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.getHighSpeedVideoSizes;
            kotlin.jvm.functions.Function3<io.ktor.client.plugins.logging.ReceiveHook.Context, io.ktor.client.call.HttpClientCall, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function3 = this.Camera2StreamConfigurationMap;
            io.ktor.client.plugins.logging.ReceiveHook.Context context = new io.ktor.client.plugins.logging.ReceiveHook.Context(pipelineContext);
            java.lang.Object context2 = pipelineContext.getContext();
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (function3.invoke(context, context2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(io.ktor.util.pipeline.PipelineContext<io.ktor.client.statement.HttpResponseContainer, io.ktor.client.call.HttpClientCall> pipelineContext, io.ktor.client.statement.HttpResponseContainer httpResponseContainer, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.logging.ReceiveHook$install$1 receiveHook$install$1 = new io.ktor.client.plugins.logging.ReceiveHook$install$1(this.Camera2StreamConfigurationMap, continuation);
        receiveHook$install$1.getHighSpeedVideoSizes = pipelineContext;
        return receiveHook$install$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReceiveHook$install$1(kotlin.jvm.functions.Function3<? super io.ktor.client.plugins.logging.ReceiveHook.Context, ? super io.ktor.client.call.HttpClientCall, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.logging.ReceiveHook$install$1> continuation) {
        super(3, continuation);
        this.Camera2StreamConfigurationMap = function3;
    }
}
