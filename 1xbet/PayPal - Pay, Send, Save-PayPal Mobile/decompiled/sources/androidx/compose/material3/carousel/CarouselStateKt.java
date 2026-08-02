package androidx.compose.material3.carousel;

@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001aW\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00132\u001d\u0010\u0014\u001a\u0019\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u0015¢\u0006\u0002\b\u0017H\u0082@¢\u0006\u0002\u0010\u0018\u001a\u001c\u0010\u0019\u001a\u00020\b*\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002\"\u000e\u0010\u0007\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"rememberCarouselState", "Landroidx/compose/material3/carousel/CarouselState;", "initialItem", "", "itemCount", "Lkotlin/Function0;", "(ILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/carousel/CarouselState;", "MinPageOffset", "", "MaxPageOffset", "MaxPagesForAnimateScroll", "animateScrollToPage", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;", "pagerState", "Landroidx/compose/foundation/pager/PagerState;", "targetPage", "targetPageOffsetToSnappedPosition", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "updateTargetPage", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;Landroidx/compose/foundation/pager/PagerState;IFLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calculateScrollDistanceTo", "currentPage", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CarouselStateKt {
    public static final float MaxPageOffset = 0.5f;
    public static final float MinPageOffset = -0.5f;

    public static final androidx.compose.material3.carousel.CarouselState rememberCarouselState(final int i, final kotlin.jvm.functions.Function0<java.lang.Integer> function0, androidx.compose.runtime.Composer composer, int i2, int i3) {
        boolean z = true;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-217285684, i2, -1, "androidx.compose.material3.carousel.rememberCarouselState (CarouselState.kt:151)");
        }
        java.lang.Object[] objArr = new java.lang.Object[0];
        androidx.compose.runtime.saveable.Saver<androidx.compose.material3.carousel.CarouselState, ?> saver = androidx.compose.material3.carousel.CarouselState.INSTANCE.getSaver();
        boolean z2 = (((i2 & 14) ^ 6) > 4 && composer.changed(i)) || (i2 & 6) == 4;
        if ((((i2 & 112) ^ 48) <= 32 || !composer.changed(function0)) && (i2 & 48) != 32) {
            z = false;
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((z | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.carousel.CarouselStateKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.compose.material3.carousel.CarouselStateKt.$r8$lambda$7YZ0rT9piCNtSFSAYw86hr6Qrrg(i, function0);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.material3.carousel.CarouselState carouselState = (androidx.compose.material3.carousel.CarouselState) androidx.compose.runtime.saveable.RememberSaveableKt.m5465rememberSaveable(objArr, (androidx.compose.runtime.saveable.Saver) saver, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
        carouselState.getPagerState().getPageCountState().setValue(function0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return carouselState;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5b0JRsNzoYj1gzRYE3VmSgziuOc(kotlin.jvm.internal.Ref.FloatRef floatRef, androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope lazyLayoutScrollScope, float f, float f2) {
        floatRef.element += lazyLayoutScrollScope.scrollBy(f - floatRef.element);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.material3.carousel.CarouselState $r8$lambda$7YZ0rT9piCNtSFSAYw86hr6Qrrg(int i, kotlin.jvm.functions.Function0 function0) {
        return new androidx.compose.material3.carousel.CarouselState(i, 0.0f, function0);
    }

    public static final /* synthetic */ java.lang.Object access$animateScrollToPage(final androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope lazyLayoutScrollScope, androidx.compose.foundation.pager.PagerState pagerState, int i, float f, androidx.compose.animation.core.AnimationSpec animationSpec, kotlin.jvm.functions.Function2 function2, kotlin.coroutines.Continuation continuation) {
        int coerceAtMost;
        function2.invoke(lazyLayoutScrollScope, kotlin.coroutines.jvm.internal.Boxing.boxInt(i));
        boolean z = i > lazyLayoutScrollScope.getFirstVisibleItemIndex();
        int lastVisibleItemIndex = (lazyLayoutScrollScope.getLastVisibleItemIndex() - lazyLayoutScrollScope.getFirstVisibleItemIndex()) + 1;
        if (((z && i > lazyLayoutScrollScope.getLastVisibleItemIndex()) || (!z && i < lazyLayoutScrollScope.getFirstVisibleItemIndex())) && java.lang.Math.abs(i - lazyLayoutScrollScope.getFirstVisibleItemIndex()) >= 3) {
            if (z) {
                coerceAtMost = kotlin.ranges.RangesKt.coerceAtLeast(i - lastVisibleItemIndex, lazyLayoutScrollScope.getFirstVisibleItemIndex());
            } else {
                coerceAtMost = kotlin.ranges.RangesKt.coerceAtMost(lastVisibleItemIndex + i, lazyLayoutScrollScope.getFirstVisibleItemIndex());
            }
            lazyLayoutScrollScope.snapToItem(coerceAtMost, 0);
        }
        int currentPage = pagerState.getCurrentPage();
        int mo1926getViewportSizeYbymL2g = (int) (pagerState.getLayoutInfo().getOrientation() == androidx.compose.foundation.gestures.Orientation.Horizontal ? pagerState.getLayoutInfo().mo1926getViewportSizeYbymL2g() >> 32 : pagerState.getLayoutInfo().mo1926getViewportSizeYbymL2g() & 4294967295L);
        float pageSize = ((i - currentPage) * (pagerState.getLayoutInfo().getPageSize() + pagerState.getLayoutInfo().getPageSpacing())) + (pagerState.getLayoutInfo().getSnapPosition().position(mo1926getViewportSizeYbymL2g, pagerState.getLayoutInfo().getPageSize(), pagerState.getLayoutInfo().getBeforeContentPadding(), pagerState.getLayoutInfo().getAfterContentPadding(), currentPage, pagerState.getPageCount()) - pagerState.getLayoutInfo().getSnapPosition().position(mo1926getViewportSizeYbymL2g, pagerState.getLayoutInfo().getPageSize(), pagerState.getLayoutInfo().getBeforeContentPadding(), pagerState.getLayoutInfo().getAfterContentPadding(), i, pagerState.getPageCount()));
        final kotlin.jvm.internal.Ref.FloatRef floatRef = new kotlin.jvm.internal.Ref.FloatRef();
        java.lang.Object animate$default = androidx.compose.animation.core.SuspendAnimationKt.animate$default(0.0f, pageSize + f, 0.0f, animationSpec, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.carousel.CarouselStateKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.compose.material3.carousel.CarouselStateKt.$r8$lambda$5b0JRsNzoYj1gzRYE3VmSgziuOc(kotlin.jvm.internal.Ref.FloatRef.this, lazyLayoutScrollScope, ((java.lang.Float) obj).floatValue(), ((java.lang.Float) obj2).floatValue());
            }
        }, continuation, 4, null);
        return animate$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animate$default : kotlin.Unit.INSTANCE;
    }
}
