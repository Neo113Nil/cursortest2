package androidx.compose.foundation.pager;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.pager.PagerState$animateScrollToPage$3", f = "PagerState.kt", i = {}, l = {672}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class PagerState$animateScrollToPage$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.foundation.gestures.ScrollScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.animation.core.AnimationSpec<java.lang.Float> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.pager.PagerState getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ float getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope LazyLayoutScrollScope = androidx.compose.foundation.pager.PagerScrollScopeKt.LazyLayoutScrollScope(this.getHighResolutionOutputSizeshNQ4ISI, (androidx.compose.foundation.gestures.ScrollScope) this.getInputSizeshNQ4ISI);
            int i2 = this.getHighSpeedVideoFpsRangesFor;
            float f = this.getHighSpeedVideoSizes;
            androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec = this.Camera2StreamConfigurationMap;
            final androidx.compose.foundation.pager.PagerState pagerState = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRanges = 1;
            Camera2StreamConfigurationMap = androidx.compose.foundation.pager.PagerStateKt.Camera2StreamConfigurationMap(LazyLayoutScrollScope, i2, f, animationSpec, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.pager.PagerState$animateScrollToPage$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return androidx.compose.foundation.pager.PagerState$animateScrollToPage$3.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.pager.PagerState.this, (androidx.compose.foundation.gestures.ScrollScope) obj2, ((java.lang.Integer) obj3).intValue());
                }
            }, this);
            if (Camera2StreamConfigurationMap == coroutine_suspended) {
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

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.pager.PagerState pagerState, androidx.compose.foundation.gestures.ScrollScope scrollScope, int i) {
        pagerState.updateTargetPage(scrollScope, i);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.foundation.gestures.ScrollScope scrollScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.pager.PagerState$animateScrollToPage$3) create(scrollScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.pager.PagerState$animateScrollToPage$3 pagerState$animateScrollToPage$3 = new androidx.compose.foundation.pager.PagerState$animateScrollToPage$3(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
        pagerState$animateScrollToPage$3.getInputSizeshNQ4ISI = obj;
        return pagerState$animateScrollToPage$3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PagerState$animateScrollToPage$3(androidx.compose.foundation.pager.PagerState pagerState, int i, float f, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.coroutines.Continuation<? super androidx.compose.foundation.pager.PagerState$animateScrollToPage$3> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = pagerState;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoSizes = f;
        this.Camera2StreamConfigurationMap = animationSpec;
    }
}
