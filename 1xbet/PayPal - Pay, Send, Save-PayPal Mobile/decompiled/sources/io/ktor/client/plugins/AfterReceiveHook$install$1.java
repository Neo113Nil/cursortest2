package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponse;", "response"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.AfterReceiveHook$install$1", f = "BodyProgress.kt", i = {0}, l = {50, 51}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
/* loaded from: classes17.dex */
final class AfterReceiveHook$install$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<io.ktor.client.statement.HttpResponse, kotlin.Unit>, io.ktor.client.statement.HttpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function2<io.ktor.client.statement.HttpResponse, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse>, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if (r1.proceedWith(r6, r5) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        if (r6 != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.util.pipeline.PipelineContext pipelineContext;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.getHighSpeedVideoFpsRangesFor;
            io.ktor.client.statement.HttpResponse httpResponse = (io.ktor.client.statement.HttpResponse) this.Camera2StreamConfigurationMap;
            kotlin.jvm.functions.Function2<io.ktor.client.statement.HttpResponse, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse>, java.lang.Object> function2 = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRangesFor = pipelineContext;
            this.getHighSpeedVideoSizes = 1;
            obj = function2.invoke(httpResponse, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        io.ktor.client.statement.HttpResponse httpResponse2 = (io.ktor.client.statement.HttpResponse) obj;
        if (httpResponse2 != null) {
            this.getHighSpeedVideoFpsRangesFor = null;
            this.getHighSpeedVideoSizes = 2;
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(io.ktor.util.pipeline.PipelineContext<io.ktor.client.statement.HttpResponse, kotlin.Unit> pipelineContext, io.ktor.client.statement.HttpResponse httpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.AfterReceiveHook$install$1 afterReceiveHook$install$1 = new io.ktor.client.plugins.AfterReceiveHook$install$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        afterReceiveHook$install$1.getHighSpeedVideoFpsRangesFor = pipelineContext;
        afterReceiveHook$install$1.Camera2StreamConfigurationMap = httpResponse;
        return afterReceiveHook$install$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AfterReceiveHook$install$1(kotlin.jvm.functions.Function2<? super io.ktor.client.statement.HttpResponse, ? super kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.AfterReceiveHook$install$1> continuation) {
        super(3, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
    }
}
