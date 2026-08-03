package io.ktor.util.pipeline;

/* compiled from: DebugPipelineContext.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.util.pipeline.DebugPipelineContext", f = "DebugPipelineContext.kt", i = {}, l = {79}, m = "proceedLoop", n = {}, s = {})
/* loaded from: classes6.dex */
final class DebugPipelineContext$proceedLoop$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ io.ktor.util.pipeline.DebugPipelineContext<TSubject, TContext> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebugPipelineContext$proceedLoop$1(io.ktor.util.pipeline.DebugPipelineContext<TSubject, TContext> debugPipelineContext, kotlin.coroutines.Continuation<? super io.ktor.util.pipeline.DebugPipelineContext$proceedLoop$1> continuation) {
        super(continuation);
        this.this$0 = debugPipelineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object proceedLoop;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        proceedLoop = this.this$0.proceedLoop(this);
        return proceedLoop;
    }
}
