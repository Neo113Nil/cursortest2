package androidx.compose.foundation.lazy.grid;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.lazy.grid.LazyGridState$animateScrollToItem$2", f = "LazyGridState.kt", i = {}, l = {615}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class LazyGridState$animateScrollToItem$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.foundation.gestures.ScrollScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.lazy.grid.LazyGridState getHighSpeedVideoFpsRanges;
    final /* synthetic */ int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int highSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope LazyLayoutScrollScope = androidx.compose.foundation.lazy.grid.LazyGridScrollScopeKt.LazyLayoutScrollScope(this.getHighSpeedVideoFpsRanges, (androidx.compose.foundation.gestures.ScrollScope) this.getHighResolutionOutputSizeshNQ4ISI);
            int i2 = this.getHighSpeedVideoFpsRangesFor;
            int i3 = this.getHighSpeedVideoSizes;
            highSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor();
            this.Camera2StreamConfigurationMap = 1;
            if (androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt.animateScrollToItem(LazyLayoutScrollScope, i2, i3, highSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges.getDensity$foundation(), this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(androidx.compose.foundation.gestures.ScrollScope scrollScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.lazy.grid.LazyGridState$animateScrollToItem$2) create(scrollScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.lazy.grid.LazyGridState$animateScrollToItem$2 lazyGridState$animateScrollToItem$2 = new androidx.compose.foundation.lazy.grid.LazyGridState$animateScrollToItem$2(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
        lazyGridState$animateScrollToItem$2.getHighResolutionOutputSizeshNQ4ISI = obj;
        return lazyGridState$animateScrollToItem$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyGridState$animateScrollToItem$2(androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState, int i, int i2, kotlin.coroutines.Continuation<? super androidx.compose.foundation.lazy.grid.LazyGridState$animateScrollToItem$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = lazyGridState;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoSizes = i2;
    }
}
