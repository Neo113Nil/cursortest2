package androidx.compose.foundation.pager;

/* compiled from: Pager.kt */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jh\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018JY\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0003\u0010\u0016\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/pager/PagerDefaults;", "", "()V", "BeyondBoundsPageCount", "", "LowVelocityAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "getLowVelocityAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "flingBehavior", "Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "state", "Landroidx/compose/foundation/pager/PagerState;", "pagerSnapDistance", "Landroidx/compose/foundation/pager/PagerSnapDistance;", "lowVelocityAnimationSpec", "highVelocityAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "snapAnimationSpec", "snapVelocityThreshold", "Landroidx/compose/ui/unit/Dp;", "snapPositionalThreshold", "flingBehavior-PfoAEA0", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/pager/PagerSnapDistance;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;FFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/pager/PagerSnapDistance;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;FLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "pageNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PagerDefaults {
    public static final int BeyondBoundsPageCount = 0;
    public static final androidx.compose.foundation.pager.PagerDefaults INSTANCE = new androidx.compose.foundation.pager.PagerDefaults();
    private static final androidx.compose.animation.core.AnimationSpec<java.lang.Float> LowVelocityAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.tween$default(500, 0, androidx.compose.animation.core.EasingKt.getLinearEasing(), 2, null);
    public static final int $stable = 8;

    private PagerDefaults() {
    }

    public final androidx.compose.foundation.gestures.snapping.SnapFlingBehavior flingBehavior(androidx.compose.foundation.pager.PagerState pagerState, androidx.compose.foundation.pager.PagerSnapDistance pagerSnapDistance, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> decayAnimationSpec, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec2, float f, androidx.compose.runtime.Composer composer, int i, int i2) {
        androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider SnapLayoutInfoProvider;
        composer.startReplaceableGroup(-194065136);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(flingBehavior)P(5,2,1)345@18344L26,353@18811L7,354@18834L770:Pager.kt#g6yjnt");
        if ((i2 & 2) != 0) {
            pagerSnapDistance = androidx.compose.foundation.pager.PagerSnapDistance.INSTANCE.atMost(1);
        }
        if ((i2 & 4) != 0) {
            animationSpec = LowVelocityAnimationSpec;
        }
        if ((i2 & 8) != 0) {
            decayAnimationSpec = androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        }
        if ((i2 & 16) != 0) {
            animationSpec2 = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i2 & 32) != 0) {
            f = 0.5f;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-194065136, i, -1, "androidx.compose.foundation.pager.PagerDefaults.flingBehavior (Pager.kt:348)");
        }
        if (0.0f > f || f > 1.0f) {
            throw new java.lang.IllegalArgumentException(("snapPositionalThreshold should be a number between 0 and 1. You've specified " + f).toString());
        }
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume = composer.consume(localDensity);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        java.lang.Object[] objArr = {pagerState, animationSpec, decayAnimationSpec, animationSpec2, pagerSnapDistance, (androidx.compose.ui.unit.Density) consume};
        composer.startReplaceableGroup(-568225417);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean z = false;
        for (int i3 = 0; i3 < 6; i3++) {
            z |= composer.changed(objArr[i3]);
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            SnapLayoutInfoProvider = androidx.compose.foundation.pager.PagerKt.SnapLayoutInfoProvider(pagerState, pagerSnapDistance, decayAnimationSpec, f);
            rememberedValue = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior(SnapLayoutInfoProvider, animationSpec, decayAnimationSpec, animationSpec2);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        androidx.compose.foundation.gestures.snapping.SnapFlingBehavior snapFlingBehavior = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return snapFlingBehavior;
    }

    public final androidx.compose.animation.core.AnimationSpec<java.lang.Float> getLowVelocityAnimationSpec() {
        return LowVelocityAnimationSpec;
    }

    @kotlin.Deprecated(message = "Please use the overload without snapVelocityThreshold. For Pagerthe functionalities provided by snapVelocityThreshold were already being provided byother APIS.")
    /* renamed from: flingBehavior-PfoAEA0, reason: not valid java name */
    public final androidx.compose.foundation.gestures.snapping.SnapFlingBehavior m803flingBehaviorPfoAEA0(androidx.compose.foundation.pager.PagerState pagerState, androidx.compose.foundation.pager.PagerSnapDistance pagerSnapDistance, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> decayAnimationSpec, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec2, float f, float f2, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-705378306);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(flingBehavior)P(6,2,1!2,5:c#ui.unit.Dp)466@25585L26,470@25820L190:Pager.kt#g6yjnt");
        androidx.compose.foundation.pager.PagerSnapDistance atMost = (i2 & 2) != 0 ? androidx.compose.foundation.pager.PagerSnapDistance.INSTANCE.atMost(1) : pagerSnapDistance;
        androidx.compose.animation.core.TweenSpec tween$default = (i2 & 4) != 0 ? androidx.compose.animation.core.AnimationSpecKt.tween$default(500, 0, androidx.compose.animation.core.EasingKt.getLinearEasing(), 2, null) : animationSpec;
        androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> rememberSplineBasedDecay = (i2 & 8) != 0 ? androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0) : decayAnimationSpec;
        androidx.compose.animation.core.SpringSpec spring$default = (i2 & 16) != 0 ? androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null) : animationSpec2;
        if ((i2 & 32) != 0) {
            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.getMinFlingVelocityDp();
        }
        float f3 = (i2 & 64) != 0 ? 0.5f : f2;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-705378306, i, -1, "androidx.compose.foundation.pager.PagerDefaults.flingBehavior (Pager.kt:470)");
        }
        androidx.compose.foundation.gestures.snapping.SnapFlingBehavior flingBehavior = flingBehavior(pagerState, atMost, tween$default, rememberSplineBasedDecay, spring$default, f3, composer, (i & 14) | 2134528 | (i & 112) | ((i >> 3) & 458752), 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return flingBehavior;
    }

    public final androidx.compose.ui.input.nestedscroll.NestedScrollConnection pageNestedScrollConnection(androidx.compose.foundation.pager.PagerState state, androidx.compose.foundation.gestures.Orientation orientation) {
        return new androidx.compose.foundation.pager.DefaultPagerNestedScrollConnection(state, orientation);
    }
}
