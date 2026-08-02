package io.ktor.util.pipeline;

/* JADX INFO: Add missing generic type declarations: [TContext] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "", "subject"}, k = 3, mv = {2, 1, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.util.pipeline.PipelineKt$intercept$1", f = "Pipeline.kt", i = {}, l = {528}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
public final class PipelineKt$intercept$1<TContext> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<? extends java.lang.Object, TContext>, java.lang.Object, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<TSubject, TContext>, TSubject, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.util.pipeline.PipelineContext pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.getHighSpeedVideoSizes;
            java.lang.Object obj2 = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "TSubject");
            if (!(obj2 instanceof java.lang.Object)) {
                return kotlin.Unit.INSTANCE;
            }
            if (!(pipelineContext instanceof io.ktor.util.pipeline.PipelineContext)) {
                pipelineContext = null;
            }
            if (pipelineContext != null) {
                kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<TSubject, TContext>, TSubject, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function3 = this.Camera2StreamConfigurationMap;
                this.getHighSpeedVideoSizes = null;
                this.getHighSpeedVideoFpsRanges = 1;
                if (function3.invoke(pipelineContext, obj2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
    public final java.lang.Object invoke(io.ktor.util.pipeline.PipelineContext<? extends java.lang.Object, TContext> pipelineContext, java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.util.pipeline.PipelineKt$intercept$1 pipelineKt$intercept$1 = new io.ktor.util.pipeline.PipelineKt$intercept$1(this.Camera2StreamConfigurationMap, continuation);
        pipelineKt$intercept$1.getHighSpeedVideoSizes = pipelineContext;
        pipelineKt$intercept$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return pipelineKt$intercept$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PipelineKt$intercept$1(kotlin.jvm.functions.Function3<? super io.ktor.util.pipeline.PipelineContext<TSubject, TContext>, ? super TSubject, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super io.ktor.util.pipeline.PipelineKt$intercept$1> continuation) {
        super(3, continuation);
        this.Camera2StreamConfigurationMap = function3;
    }
}
