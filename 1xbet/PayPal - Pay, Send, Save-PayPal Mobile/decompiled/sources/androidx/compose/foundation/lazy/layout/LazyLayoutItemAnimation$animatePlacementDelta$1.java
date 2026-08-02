package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1", f = "LazyLayoutItemAnimation.kt", i = {0}, l = {141, 148}, m = "invokeSuspend", n = {"finalSpec"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class LazyLayoutItemAnimation$animatePlacementDelta$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ long getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ad, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r5, androidx.compose.ui.unit.IntOffset.m8720boximpl(r3), r1, null, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1$$ExternalSyntheticLambda0(r14, r3), r13, 4, null) != r0) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.animation.core.Animatable animatable;
        androidx.compose.animation.core.SpringSpec springSpec;
        androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> finiteAnimationSpec;
        androidx.compose.animation.core.Animatable animatable2;
        androidx.compose.animation.core.Animatable animatable3;
        androidx.compose.animation.core.SpringSpec springSpec2;
        androidx.compose.animation.core.Animatable animatable4;
        androidx.compose.animation.core.Animatable animatable5;
        kotlin.jvm.functions.Function0 function0;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            animatable = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
            if (animatable.isRunning()) {
                androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> finiteAnimationSpec2 = this.getHighSpeedVideoFpsRangesFor;
                if (!(finiteAnimationSpec2 instanceof androidx.compose.animation.core.SpringSpec)) {
                    springSpec2 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimationKt.getHighSpeedVideoFpsRangesFor;
                } else {
                    springSpec2 = (androidx.compose.animation.core.SpringSpec) finiteAnimationSpec2;
                }
                springSpec = springSpec2;
            } else {
                springSpec = this.getHighSpeedVideoFpsRangesFor;
            }
            finiteAnimationSpec = springSpec;
            animatable2 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
            if (!animatable2.isRunning()) {
                animatable3 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
                this.Camera2StreamConfigurationMap = finiteAnimationSpec;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                if (animatable3.snapTo(androidx.compose.ui.unit.IntOffset.m8720boximpl(this.getHighSpeedVideoFpsRanges), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            animatable4 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
            final long m8732minusqkQi6aY = androidx.compose.ui.unit.IntOffset.m8732minusqkQi6aY(((androidx.compose.ui.unit.IntOffset) animatable4.getValue()).m8738unboximpl(), this.getHighSpeedVideoFpsRanges);
            animatable5 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
            final androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation lazyLayoutItemAnimation = this.getHighSpeedVideoSizes;
            this.Camera2StreamConfigurationMap = null;
            this.getHighResolutionOutputSizeshNQ4ISI = 2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoSizes.setPlacementAnimationInProgress(false);
                this.getHighSpeedVideoSizes.isRunningMovingAwayAnimation = false;
                return kotlin.Unit.INSTANCE;
            }
            finiteAnimationSpec = (androidx.compose.animation.core.FiniteAnimationSpec) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        function0 = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
        function0.invoke();
        animatable4 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
        final long m8732minusqkQi6aY2 = androidx.compose.ui.unit.IntOffset.m8732minusqkQi6aY(((androidx.compose.ui.unit.IntOffset) animatable4.getValue()).m8738unboximpl(), this.getHighSpeedVideoFpsRanges);
        animatable5 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
        final androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation lazyLayoutItemAnimation2 = this.getHighSpeedVideoSizes;
        this.Camera2StreamConfigurationMap = null;
        this.getHighResolutionOutputSizeshNQ4ISI = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation lazyLayoutItemAnimation, long j, androidx.compose.animation.core.Animatable animatable) {
        kotlin.jvm.functions.Function0 function0;
        lazyLayoutItemAnimation.m1843setPlacementDeltagyyYBs(androidx.compose.ui.unit.IntOffset.m8732minusqkQi6aY(((androidx.compose.ui.unit.IntOffset) animatable.getValue()).m8738unboximpl(), j));
        function0 = lazyLayoutItemAnimation.getHighSpeedVideoSizes;
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyLayoutItemAnimation$animatePlacementDelta$1(androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation lazyLayoutItemAnimation, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> finiteAnimationSpec, long j, kotlin.coroutines.Continuation<? super androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = lazyLayoutItemAnimation;
        this.getHighSpeedVideoFpsRangesFor = finiteAnimationSpec;
        this.getHighSpeedVideoFpsRanges = j;
    }
}
