package androidx.compose.foundation.pager;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\b\b\u0003\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/pager/PagerDefaults;", "", "<init>", "()V", "flingBehavior", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "state", "Landroidx/compose/foundation/pager/PagerState;", "pagerSnapDistance", "Landroidx/compose/foundation/pager/PagerSnapDistance;", "decayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "snapAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "snapPositionalThreshold", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/pager/PagerSnapDistance;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;FLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "pageNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "BeyondViewportPageCount", "", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PagerDefaults {
    public static final int $stable = 0;
    public static final int BeyondViewportPageCount = 0;
    public static final androidx.compose.foundation.pager.PagerDefaults INSTANCE = new androidx.compose.foundation.pager.PagerDefaults();

    private PagerDefaults() {
    }

    public final androidx.compose.foundation.gestures.TargetedFlingBehavior flingBehavior(final androidx.compose.foundation.pager.PagerState pagerState, androidx.compose.foundation.pager.PagerSnapDistance pagerSnapDistance, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> decayAnimationSpec, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, float f, androidx.compose.runtime.Composer composer, int i, int i2) {
        boolean z = true;
        androidx.compose.foundation.pager.PagerSnapDistance atMost = (i2 & 2) != 0 ? androidx.compose.foundation.pager.PagerSnapDistance.INSTANCE.atMost(1) : pagerSnapDistance;
        androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> rememberSplineBasedDecay = (i2 & 4) != 0 ? androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0) : decayAnimationSpec;
        androidx.compose.animation.core.SpringSpec spring$default = (i2 & 8) != 0 ? androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, java.lang.Float.valueOf(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(kotlin.jvm.internal.IntCompanionObject.INSTANCE)), 1, null) : animationSpec;
        final float f2 = (i2 & 16) != 0 ? 0.5f : f;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1559769181, i, -1, "androidx.compose.foundation.pager.PagerDefaults.flingBehavior (Pager.kt:384)");
        }
        if (0.0f > f2 || f2 > 1.0f) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("snapPositionalThreshold should be a number between 0 and 1. You've specified ".concat(java.lang.String.valueOf(f2)));
        }
        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
        final androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection());
        boolean z2 = (((i & 14) ^ 6) > 4 && composer.changed(pagerState)) || (i & 6) == 4;
        boolean changed = composer.changed(rememberSplineBasedDecay);
        boolean changed2 = composer.changed(spring$default);
        if ((((i & 112) ^ 48) <= 32 || !composer.changed(atMost)) && (i & 48) != 32) {
            z = false;
        }
        boolean changed3 = composer.changed(density);
        boolean changed4 = composer.changed(layoutDirection.ordinal());
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changed3 | z | z2 | changed | changed2 | changed4) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.snapFlingBehavior(androidx.compose.foundation.gestures.snapping.PagerSnapLayoutInfoProviderKt.SnapLayoutInfoProvider(pagerState, atMost, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.foundation.pager.PagerDefaults$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    float highResolutionOutputSizeshNQ4ISI;
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.pager.PagerDefaults.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.pager.PagerState.this, layoutDirection, f2, ((java.lang.Float) obj).floatValue(), ((java.lang.Float) obj2).floatValue(), ((java.lang.Float) obj3).floatValue());
                    return java.lang.Float.valueOf(highResolutionOutputSizeshNQ4ISI);
                }
            }), rememberSplineBasedDecay, spring$default);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior = (androidx.compose.foundation.gestures.TargetedFlingBehavior) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return targetedFlingBehavior;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.pager.PagerState pagerState, androidx.compose.ui.unit.LayoutDirection layoutDirection, float f, float f2, float f3, float f4) {
        return androidx.compose.foundation.gestures.snapping.PagerSnapLayoutInfoProviderKt.calculateFinalSnappingBound(pagerState, layoutDirection, f, f2, f3, f4);
    }

    public final androidx.compose.ui.input.nestedscroll.NestedScrollConnection pageNestedScrollConnection(androidx.compose.foundation.pager.PagerState pagerState, androidx.compose.foundation.gestures.Orientation orientation, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(877583120, i, -1, "androidx.compose.foundation.pager.PagerDefaults.pageNestedScrollConnection (Pager.kt:433)");
        }
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && composer.changed(pagerState)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !composer.changed(orientation.ordinal())) && (i & 48) != 32) {
            z = false;
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((z2 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.foundation.pager.DefaultPagerNestedScrollConnection(pagerState, orientation);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.foundation.pager.DefaultPagerNestedScrollConnection defaultPagerNestedScrollConnection = (androidx.compose.foundation.pager.DefaultPagerNestedScrollConnection) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return defaultPagerNestedScrollConnection;
    }
}
