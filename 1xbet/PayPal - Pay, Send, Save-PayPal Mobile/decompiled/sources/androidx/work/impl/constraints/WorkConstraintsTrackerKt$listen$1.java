package androidx.work.impl.constraints;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.work.impl.constraints.WorkConstraintsTrackerKt$listen$1", f = "WorkConstraintsTracker.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class WorkConstraintsTrackerKt$listen$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.work.impl.constraints.OnConstraintsStateChangedListener getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.work.impl.model.WorkSpec getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.work.impl.constraints.WorkConstraintsTracker getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.Flow<androidx.work.impl.constraints.ConstraintsState> track = this.getHighSpeedVideoSizes.track(this.getHighSpeedVideoFpsRangesFor);
            final androidx.work.impl.constraints.OnConstraintsStateChangedListener onConstraintsStateChangedListener = this.getHighResolutionOutputSizeshNQ4ISI;
            final androidx.work.impl.model.WorkSpec workSpec = this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRanges = 1;
            if (track.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: androidx.work.impl.constraints.WorkConstraintsTrackerKt$listen$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public final java.lang.Object emit(androidx.work.impl.constraints.ConstraintsState constraintsState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    androidx.work.impl.constraints.OnConstraintsStateChangedListener.this.onConstraintsStateChanged(workSpec, constraintsState);
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.work.impl.constraints.WorkConstraintsTrackerKt$listen$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.work.impl.constraints.WorkConstraintsTrackerKt$listen$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WorkConstraintsTrackerKt$listen$1(androidx.work.impl.constraints.WorkConstraintsTracker workConstraintsTracker, androidx.work.impl.model.WorkSpec workSpec, androidx.work.impl.constraints.OnConstraintsStateChangedListener onConstraintsStateChangedListener, kotlin.coroutines.Continuation<? super androidx.work.impl.constraints.WorkConstraintsTrackerKt$listen$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = workConstraintsTracker;
        this.getHighSpeedVideoFpsRangesFor = workSpec;
        this.getHighResolutionOutputSizeshNQ4ISI = onConstraintsStateChangedListener;
    }
}
