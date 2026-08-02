package androidx.compose.foundation.pager;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\n\u001a\u00020\t*\u00020\b2\u0006\u0010\u0003\u001a\u00020\tH\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/foundation/pager/PagerWrapperFlingBehavior;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "p0", "Landroidx/compose/foundation/pager/PagerState;", "p1", "<init>", "(Landroidx/compose/foundation/gestures/TargetedFlingBehavior;Landroidx/compose/foundation/pager/PagerState;)V", "Landroidx/compose/foundation/gestures/ScrollScope;", "", "performFling", "(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/foundation/pager/PagerState;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class PagerWrapperFlingBehavior implements androidx.compose.foundation.gestures.FlingBehavior {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.foundation.pager.PagerState Camera2StreamConfigurationMap;
    private final androidx.compose.foundation.gestures.TargetedFlingBehavior getHighSpeedVideoSizes;

    public PagerWrapperFlingBehavior(androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior, androidx.compose.foundation.pager.PagerState pagerState) {
        this.getHighSpeedVideoSizes = targetedFlingBehavior;
        this.Camera2StreamConfigurationMap = pagerState;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.foundation.gestures.FlingBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object performFling(final androidx.compose.foundation.gestures.ScrollScope scrollScope, float f, kotlin.coroutines.Continuation<? super java.lang.Float> continuation) {
        androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1 pagerWrapperFlingBehavior$performFling$1;
        int i;
        if (continuation instanceof androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1) {
            pagerWrapperFlingBehavior$performFling$1 = (androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1) continuation;
            if ((pagerWrapperFlingBehavior$performFling$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                pagerWrapperFlingBehavior$performFling$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = pagerWrapperFlingBehavior$performFling$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pagerWrapperFlingBehavior$performFling$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior = this.getHighSpeedVideoSizes;
                    kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.pager.PagerWrapperFlingBehavior$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            kotlin.Unit highSpeedVideoSizes;
                            highSpeedVideoSizes = androidx.compose.foundation.pager.PagerWrapperFlingBehavior.getHighSpeedVideoSizes(androidx.compose.foundation.pager.PagerWrapperFlingBehavior.this, scrollScope, ((java.lang.Float) obj2).floatValue());
                            return highSpeedVideoSizes;
                        }
                    };
                    pagerWrapperFlingBehavior$performFling$1.Camera2StreamConfigurationMap = 1;
                    obj = targetedFlingBehavior.performFling(scrollScope, f, function1, pagerWrapperFlingBehavior$performFling$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                float floatValue = ((java.lang.Number) obj).floatValue();
                if (this.Camera2StreamConfigurationMap.getCurrentPageOffsetFraction() == 0.0f && java.lang.Math.abs(this.Camera2StreamConfigurationMap.getCurrentPageOffsetFraction()) < 0.001d) {
                    androidx.compose.foundation.pager.PagerState pagerState = this.Camera2StreamConfigurationMap;
                    androidx.compose.foundation.pager.PagerState.requestScrollToPage$default(pagerState, pagerState.getCurrentPage(), 0.0f, 2, null);
                } else {
                    kotlin.coroutines.jvm.internal.Boxing.boxFloat(this.Camera2StreamConfigurationMap.getCurrentPageOffsetFraction());
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxFloat(floatValue);
            }
        }
        pagerWrapperFlingBehavior$performFling$1 = new androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1(this, continuation);
        java.lang.Object obj2 = pagerWrapperFlingBehavior$performFling$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pagerWrapperFlingBehavior$performFling$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        float floatValue2 = ((java.lang.Number) obj2).floatValue();
        if (this.Camera2StreamConfigurationMap.getCurrentPageOffsetFraction() == 0.0f) {
        }
        kotlin.coroutines.jvm.internal.Boxing.boxFloat(this.Camera2StreamConfigurationMap.getCurrentPageOffsetFraction());
        return kotlin.coroutines.jvm.internal.Boxing.boxFloat(floatValue2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.foundation.pager.PagerWrapperFlingBehavior pagerWrapperFlingBehavior, androidx.compose.foundation.gestures.ScrollScope scrollScope, float f) {
        pagerWrapperFlingBehavior.Camera2StreamConfigurationMap.updateTargetPage(scrollScope, kotlin.math.MathKt.roundToInt(pagerWrapperFlingBehavior.Camera2StreamConfigurationMap.getPageSizeWithSpacing$foundation() != 0 ? f / pagerWrapperFlingBehavior.Camera2StreamConfigurationMap.getPageSizeWithSpacing$foundation() : 0.0f) + pagerWrapperFlingBehavior.Camera2StreamConfigurationMap.getCurrentPage());
        return kotlin.Unit.INSTANCE;
    }
}
