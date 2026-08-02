package androidx.work.impl.workers;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Landroidx/work/impl/constraints/ConstraintsState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2", f = "ConstraintTrackingWorker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.work.impl.constraints.ConstraintsState, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.work.impl.model.WorkSpec getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        str = androidx.work.impl.workers.ConstraintTrackingWorkerKt.getHighResolutionOutputSizeshNQ4ISI;
        androidx.work.Logger.get().debug(str, "Constraints changed for ".concat(java.lang.String.valueOf(this.getHighSpeedVideoSizes)));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.work.impl.constraints.ConstraintsState constraintsState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2) create(constraintsState, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2(androidx.work.impl.model.WorkSpec workSpec, kotlin.coroutines.Continuation<? super androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = workSpec;
    }
}
