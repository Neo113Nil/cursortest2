package androidx.compose.material3.carousel;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0002\u0010\u000bJ5\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0002\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0011R\u0013\u0010\u0012\u001a\u00020\u0013¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0017\u001a\u00020\u0013¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u0013X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001a\u0010\u0015R\u000e\u0010\u001b\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Landroidx/compose/material3/carousel/CarouselDefaults;", "", "<init>", "()V", "singleAdvanceFlingBehavior", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "state", "Landroidx/compose/material3/carousel/CarouselState;", "snapAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "(Landroidx/compose/material3/carousel/CarouselState;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "multiBrowseFlingBehavior", "decayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "(Landroidx/compose/material3/carousel/CarouselState;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "noSnapFlingBehavior", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "MinSmallItemSize", "Landroidx/compose/ui/unit/Dp;", "getMinSmallItemSize-D9Ej5fM", "()F", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "MaxSmallItemSize", "getMaxSmallItemSize-D9Ej5fM", "AnchorSize", "getAnchorSize-D9Ej5fM$material3", "MediumLargeItemDiffThreshold", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CarouselDefaults {
    public static final int $stable = 0;
    public static final float MediumLargeItemDiffThreshold = 0.85f;
    public static final androidx.compose.material3.carousel.CarouselDefaults INSTANCE = new androidx.compose.material3.carousel.CarouselDefaults();
    private static final float getHighSpeedVideoFpsRanges = androidx.compose.ui.unit.Dp.m8601constructorimpl(40.0f);
    private static final float getHighSpeedVideoFpsRangesFor = androidx.compose.ui.unit.Dp.m8601constructorimpl(56.0f);
    private static final float Camera2StreamConfigurationMap = androidx.compose.ui.unit.Dp.m8601constructorimpl(10.0f);

    private CarouselDefaults() {
    }

    public final androidx.compose.foundation.gestures.TargetedFlingBehavior singleAdvanceFlingBehavior(androidx.compose.material3.carousel.CarouselState carouselState, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            animationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec2 = animationSpec;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1701587199, i, -1, "androidx.compose.material3.carousel.CarouselDefaults.singleAdvanceFlingBehavior (Carousel.kt:783)");
        }
        androidx.compose.foundation.gestures.TargetedFlingBehavior flingBehavior = androidx.compose.foundation.pager.PagerDefaults.INSTANCE.flingBehavior(carouselState.getPagerState(), androidx.compose.foundation.pager.PagerSnapDistance.INSTANCE.atMost(1), null, animationSpec2, 0.0f, composer, ((i << 6) & 7168) | (androidx.compose.foundation.pager.PagerDefaults.$stable << 15), 20);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return flingBehavior;
    }

    public final androidx.compose.foundation.gestures.TargetedFlingBehavior multiBrowseFlingBehavior(androidx.compose.material3.carousel.CarouselState carouselState, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> decayAnimationSpec, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            decayAnimationSpec = androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        }
        androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> decayAnimationSpec2 = decayAnimationSpec;
        if ((i2 & 4) != 0) {
            animationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec2 = animationSpec;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1105043293, i, -1, "androidx.compose.material3.carousel.CarouselDefaults.multiBrowseFlingBehavior (Carousel.kt:816)");
        }
        androidx.compose.foundation.gestures.TargetedFlingBehavior flingBehavior = androidx.compose.foundation.pager.PagerDefaults.INSTANCE.flingBehavior(carouselState.getPagerState(), new androidx.compose.foundation.pager.PagerSnapDistance() { // from class: androidx.compose.material3.carousel.CarouselDefaults$multiBrowseFlingBehavior$pagerSnapDistance$1
            @Override // androidx.compose.foundation.pager.PagerSnapDistance
            public final int calculateTargetPage(int startPage, int suggestedTargetPage, float velocity, int pageSize, int pageSpacing) {
                return suggestedTargetPage;
            }
        }, decayAnimationSpec2, animationSpec2, 0.0f, composer, (androidx.compose.foundation.pager.PagerDefaults.$stable << 15) | ((i << 3) & 8064), 16);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return flingBehavior;
    }

    public final androidx.compose.foundation.gestures.TargetedFlingBehavior noSnapFlingBehavior(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-418415756, i, -1, "androidx.compose.material3.carousel.CarouselDefaults.noSnapFlingBehavior (Carousel.kt:845)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider() { // from class: androidx.compose.material3.carousel.CarouselDefaults$noSnapFlingBehavior$decayLayoutInfoProvider$1$1
                @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
                public final float calculateSnapOffset(float velocity) {
                    return 0.0f;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.foundation.gestures.TargetedFlingBehavior rememberSnapFlingBehavior = androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.rememberSnapFlingBehavior((androidx.compose.material3.carousel.CarouselDefaults$noSnapFlingBehavior$decayLayoutInfoProvider$1$1) rememberedValue, composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return rememberSnapFlingBehavior;
    }

    /* renamed from: getMinSmallItemSize-D9Ej5fM, reason: not valid java name */
    public final float m4244getMinSmallItemSizeD9Ej5fM() {
        return getHighSpeedVideoFpsRanges;
    }

    /* renamed from: getMaxSmallItemSize-D9Ej5fM, reason: not valid java name */
    public final float m4243getMaxSmallItemSizeD9Ej5fM() {
        return getHighSpeedVideoFpsRangesFor;
    }

    /* renamed from: getAnchorSize-D9Ej5fM$material3, reason: not valid java name */
    public final float m4242getAnchorSizeD9Ej5fM$material3() {
        return Camera2StreamConfigurationMap;
    }
}
