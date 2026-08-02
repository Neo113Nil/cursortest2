package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableDefaultFlingBehavior;", "platformScrollableDefaultFlingBehavior", "()Landroidx/compose/foundation/gestures/ScrollableDefaultFlingBehavior;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "rememberPlatformDefaultFlingBehavior", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/FlingBehavior;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Scrollable_androidKt {
    public static final androidx.compose.foundation.gestures.ScrollableDefaultFlingBehavior platformScrollableDefaultFlingBehavior() {
        return new androidx.compose.foundation.gestures.DefaultFlingBehavior(androidx.compose.animation.SplineBasedDecayKt.splineBasedDecay(androidx.compose.foundation.gestures.ScrollableKt.getUnityDensity()), null, 2, null);
    }

    public static final androidx.compose.foundation.gestures.FlingBehavior rememberPlatformDefaultFlingBehavior(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(162564459, i, -1, "androidx.compose.foundation.gestures.rememberPlatformDefaultFlingBehavior (Scrollable.android.kt:28)");
        }
        androidx.compose.animation.core.DecayAnimationSpec rememberSplineBasedDecay = androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        boolean changed = composer.changed(rememberSplineBasedDecay);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.foundation.gestures.DefaultFlingBehavior(rememberSplineBasedDecay, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.foundation.gestures.DefaultFlingBehavior defaultFlingBehavior = (androidx.compose.foundation.gestures.DefaultFlingBehavior) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return defaultFlingBehavior;
    }
}
