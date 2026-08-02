package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponseContainer;", "Lio/ktor/client/call/HttpClientCall;", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.ReceiveError$install$1", f = "HttpCallValidator.kt", i = {0}, l = {165, 167}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
/* loaded from: classes17.dex */
final class ReceiveError$install$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<io.ktor.client.statement.HttpResponseContainer, io.ktor.client.call.HttpClientCall>, io.ktor.client.statement.HttpResponseContainer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function3<io.ktor.client.request.HttpRequest, java.lang.Throwable, kotlin.coroutines.Continuation<? super java.lang.Throwable>, java.lang.Object> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        if (r6 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r6 != r0) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [io.ktor.util.pipeline.PipelineContext] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.getHighSpeedVideoFpsRangesFor;
        try {
        } catch (java.lang.Throwable th) {
            kotlin.jvm.functions.Function3<io.ktor.client.request.HttpRequest, java.lang.Throwable, kotlin.coroutines.Continuation<? super java.lang.Throwable>, java.lang.Object> function3 = this.getHighSpeedVideoFpsRanges;
            io.ktor.client.request.HttpRequest request = ((io.ktor.client.call.HttpClientCall) r1.getContext()).getRequest();
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.getHighSpeedVideoFpsRangesFor = 2;
            obj = function3.invoke(request, th, this);
        }
        if (r1 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.util.pipeline.PipelineContext pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighResolutionOutputSizeshNQ4ISI = pipelineContext;
            this.getHighSpeedVideoFpsRangesFor = 1;
            java.lang.Object proceed = pipelineContext.proceed(this);
            r1 = pipelineContext;
        } else {
            if (r1 != 1) {
                if (r1 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.Throwable th2 = (java.lang.Throwable) obj;
                if (th2 != null) {
                    throw th2;
                }
                return kotlin.Unit.INSTANCE;
            }
            io.ktor.util.pipeline.PipelineContext pipelineContext2 = (io.ktor.util.pipeline.PipelineContext) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
            r1 = pipelineContext2;
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(io.ktor.util.pipeline.PipelineContext<io.ktor.client.statement.HttpResponseContainer, io.ktor.client.call.HttpClientCall> pipelineContext, io.ktor.client.statement.HttpResponseContainer httpResponseContainer, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.ReceiveError$install$1 receiveError$install$1 = new io.ktor.client.plugins.ReceiveError$install$1(this.getHighSpeedVideoFpsRanges, continuation);
        receiveError$install$1.getHighResolutionOutputSizeshNQ4ISI = pipelineContext;
        return receiveError$install$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReceiveError$install$1(kotlin.jvm.functions.Function3<? super io.ktor.client.request.HttpRequest, ? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super java.lang.Throwable>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.ReceiveError$install$1> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoFpsRanges = function3;
    }
}
