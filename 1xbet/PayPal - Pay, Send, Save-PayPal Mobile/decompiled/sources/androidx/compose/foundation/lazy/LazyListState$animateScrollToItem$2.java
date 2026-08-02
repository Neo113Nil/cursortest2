package androidx.compose.foundation.lazy;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.lazy.LazyListState$animateScrollToItem$2", f = "LazyListState.kt", i = {}, l = {583}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class LazyListState$animateScrollToItem$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.foundation.gestures.ScrollScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.lazy.LazyListState getHighSpeedVideoFpsRanges;
    final /* synthetic */ int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.compose.foundation.gestures.ScrollScope scrollScope = (androidx.compose.foundation.gestures.ScrollScope) this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizes = 1;
            if (androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt.animateScrollToItem(androidx.compose.foundation.lazy.LazyListScrollScopeKt.LazyLayoutScrollScope(this.getHighSpeedVideoFpsRanges, scrollScope), this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, 100, this.getHighSpeedVideoFpsRanges.getDensity$foundation(), this) == coroutine_suspended) {
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
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(androidx.compose.foundation.gestures.ScrollScope scrollScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.lazy.LazyListState$animateScrollToItem$2) create(scrollScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.lazy.LazyListState$animateScrollToItem$2 lazyListState$animateScrollToItem$2 = new androidx.compose.foundation.lazy.LazyListState$animateScrollToItem$2(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        lazyListState$animateScrollToItem$2.Camera2StreamConfigurationMap = obj;
        return lazyListState$animateScrollToItem$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyListState$animateScrollToItem$2(androidx.compose.foundation.lazy.LazyListState lazyListState, int i, int i2, kotlin.coroutines.Continuation<? super androidx.compose.foundation.lazy.LazyListState$animateScrollToItem$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = lazyListState;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
    }
}
