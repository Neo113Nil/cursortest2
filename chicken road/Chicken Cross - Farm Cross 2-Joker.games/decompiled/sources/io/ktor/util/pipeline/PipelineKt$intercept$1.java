package io.ktor.util.pipeline;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Add missing generic type declarations: [TContext] */
/* compiled from: Pipeline.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "", "subject"}, k = 3, mv = {2, 1, 0}, xi = 176)
@DebugMetadata(c = "io.ktor.util.pipeline.PipelineKt$intercept$1", f = "Pipeline.kt", i = {}, l = {528}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class PipelineKt$intercept$1<TContext> extends SuspendLambda implements Function3<PipelineContext<? extends Object, TContext>, Object, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function3<PipelineContext<TSubject, TContext>, TSubject, Continuation<? super Unit>, Object> $block;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PipelineKt$intercept$1(Function3<? super PipelineContext<TSubject, TContext>, ? super TSubject, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super PipelineKt$intercept$1> continuation) {
        super(3, continuation);
        this.$block = function3;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(PipelineContext<? extends Object, TContext> pipelineContext, Object obj, Continuation<? super Unit> continuation) {
        PipelineKt$intercept$1 pipelineKt$intercept$1 = new PipelineKt$intercept$1(this.$block, continuation);
        pipelineKt$intercept$1.L$0 = pipelineContext;
        pipelineKt$intercept$1.L$1 = obj;
        return pipelineKt$intercept$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PipelineContext pipelineContext = (PipelineContext) this.L$0;
            Object obj2 = this.L$1;
            Intrinsics.reifiedOperationMarker(3, "TSubject");
            if (!(obj2 instanceof Object)) {
                return Unit.INSTANCE;
            }
            if (!(pipelineContext instanceof PipelineContext)) {
                pipelineContext = null;
            }
            if (pipelineContext != null) {
                Function3<PipelineContext<TSubject, TContext>, TSubject, Continuation<? super Unit>, Object> function3 = this.$block;
                this.L$0 = null;
                this.label = 1;
                if (function3.invoke(pipelineContext, obj2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
