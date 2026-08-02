package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u001a\u0010\t\u001a\u00020\b8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"T", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/animation/core/DecayAnimationSpec;", "splineBasedDecay", "(Landroidx/compose/ui/unit/Density;)Landroidx/compose/animation/core/DecayAnimationSpec;", "rememberSplineBasedDecay", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/DecayAnimationSpec;", "", "platformFlingScrollFriction", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getPlatformFlingScrollFriction", "()F"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SplineBasedFloatDecayAnimationSpec_androidKt {
    private static final float platformFlingScrollFriction = android.view.ViewConfiguration.getScrollFriction();

    public static final float getPlatformFlingScrollFriction() {
        return platformFlingScrollFriction;
    }

    public static final <T> androidx.compose.animation.core.DecayAnimationSpec<T> rememberSplineBasedDecay(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(904445851, i, -1, "androidx.compose.animation.rememberSplineBasedDecay (SplineBasedFloatDecayAnimationSpec.android.kt:40)");
        }
        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
        boolean changed = composer.changed(density.getGetHighResolutionOutputSizeshNQ4ISI());
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.animation.core.DecayAnimationSpecKt.generateDecayAnimationSpec(new androidx.compose.animation.SplineBasedFloatDecayAnimationSpec(density));
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.animation.core.DecayAnimationSpec<T> decayAnimationSpec = (androidx.compose.animation.core.DecayAnimationSpec) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return decayAnimationSpec;
    }
}
