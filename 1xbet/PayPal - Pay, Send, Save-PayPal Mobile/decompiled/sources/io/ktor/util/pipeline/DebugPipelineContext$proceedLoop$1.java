package io.ktor.util.pipeline;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.util.pipeline.DebugPipelineContext", f = "DebugPipelineContext.kt", i = {}, l = {79}, m = "proceedLoop", n = {}, s = {})
/* loaded from: classes17.dex */
final class DebugPipelineContext$proceedLoop$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ io.ktor.util.pipeline.DebugPipelineContext<TSubject, TContext> getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebugPipelineContext$proceedLoop$1(io.ktor.util.pipeline.DebugPipelineContext<TSubject, TContext> debugPipelineContext, kotlin.coroutines.Continuation<? super io.ktor.util.pipeline.DebugPipelineContext$proceedLoop$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = debugPipelineContext;
    }
}
