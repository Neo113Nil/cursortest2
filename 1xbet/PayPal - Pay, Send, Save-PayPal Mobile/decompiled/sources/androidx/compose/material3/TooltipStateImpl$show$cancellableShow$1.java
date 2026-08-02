package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.TooltipStateImpl$show$cancellableShow$1", f = "Tooltip.kt", i = {}, l = {1655}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class TooltipStateImpl$show$cancellableShow$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.material3.TooltipStateImpl getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.compose.material3.TooltipStateImpl tooltipStateImpl = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRangesFor = tooltipStateImpl;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            androidx.compose.material3.TooltipStateImpl$show$cancellableShow$1 tooltipStateImpl$show$cancellableShow$1 = this;
            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(tooltipStateImpl$show$cancellableShow$1), 1);
            cancellableContinuationImpl.initCancellability();
            tooltipStateImpl.getTransition().setTargetState$animation_core(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
            tooltipStateImpl.Camera2StreamConfigurationMap = cancellableContinuationImpl;
            java.lang.Object result = cancellableContinuationImpl.getResult();
            if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(tooltipStateImpl$show$cancellableShow$1);
            }
            if (result == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.material3.TooltipStateImpl$show$cancellableShow$1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.material3.TooltipStateImpl$show$cancellableShow$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TooltipStateImpl$show$cancellableShow$1(androidx.compose.material3.TooltipStateImpl tooltipStateImpl, kotlin.coroutines.Continuation<? super androidx.compose.material3.TooltipStateImpl$show$cancellableShow$1> continuation) {
        super(1, continuation);
        this.getHighSpeedVideoFpsRanges = tooltipStateImpl;
    }
}
