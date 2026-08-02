package androidx.compose.ui.tooling.animation;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/animation/core/Transition;", "Landroidx/compose/ui/tooling/animation/TransitionComposeAnimation;", "parse", "(Landroidx/compose/animation/core/Transition;)Landroidx/compose/ui/tooling/animation/TransitionComposeAnimation;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransitionComposeAnimation_androidKt {
    public static final androidx.compose.ui.tooling.animation.TransitionComposeAnimation<?> parse(androidx.compose.animation.core.Transition<?> transition) {
        java.util.Set of;
        java.lang.Object currentState = transition.getCurrentState();
        if (currentState == null) {
            return null;
        }
        java.lang.Object[] enumConstants = currentState.getClass().getEnumConstants();
        if (enumConstants == null || (of = kotlin.collections.ArraysKt.toSet(enumConstants)) == null) {
            of = kotlin.collections.SetsKt.setOf(currentState);
        }
        java.lang.String getHighSpeedVideoFpsRanges = transition.getGetHighSpeedVideoFpsRanges();
        if (getHighSpeedVideoFpsRanges == null) {
            getHighSpeedVideoFpsRanges = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(currentState.getClass()).getSimpleName();
        }
        return new androidx.compose.ui.tooling.animation.TransitionComposeAnimation<>(transition, of, getHighSpeedVideoFpsRanges);
    }
}
