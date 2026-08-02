package androidx.compose.ui.tooling.animation;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/core/Transition;", "", "Landroidx/compose/ui/tooling/animation/AnimatedVisibilityComposeAnimation;", "parseAnimatedVisibility", "(Landroidx/compose/animation/core/Transition;)Landroidx/compose/ui/tooling/animation/AnimatedVisibilityComposeAnimation;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnimatedVisibilityComposeAnimation_androidKt {
    public static final androidx.compose.ui.tooling.animation.AnimatedVisibilityComposeAnimation parseAnimatedVisibility(androidx.compose.animation.core.Transition<java.lang.Boolean> transition) {
        java.lang.String getHighSpeedVideoFpsRanges = transition.getGetHighSpeedVideoFpsRanges();
        if (getHighSpeedVideoFpsRanges == null) {
            getHighSpeedVideoFpsRanges = "AnimatedVisibility";
        }
        return new androidx.compose.ui.tooling.animation.AnimatedVisibilityComposeAnimation(transition, getHighSpeedVideoFpsRanges);
    }
}
