package androidx.compose.ui.tooling.animation;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/tooling/animation/TransitionComposeAnimation;", "T", "Landroidx/compose/animation/tooling/ComposeAnimation;", "Landroidx/compose/ui/tooling/animation/TransitionBasedAnimation;", "animationObject", "Landroidx/compose/animation/core/Transition;", "states", "", "", "label", "", "<init>", "(Landroidx/compose/animation/core/Transition;Ljava/util/Set;Ljava/lang/String;)V", "getAnimationObject", "()Landroidx/compose/animation/core/Transition;", "getStates", "()Ljava/util/Set;", "getLabel", "()Ljava/lang/String;", "type", "Landroidx/compose/animation/tooling/ComposeAnimationType;", "getType", "()Landroidx/compose/animation/tooling/ComposeAnimationType;", "ui-tooling"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransitionComposeAnimation<T> implements androidx.compose.animation.tooling.ComposeAnimation, androidx.compose.ui.tooling.animation.TransitionBasedAnimation<T> {
    public static final int $stable = 8;
    private final java.util.Set<java.lang.Object> Camera2StreamConfigurationMap;
    private final androidx.compose.animation.tooling.ComposeAnimationType getHighResolutionOutputSizeshNQ4ISI = androidx.compose.animation.tooling.ComposeAnimationType.TRANSITION_ANIMATION;
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final androidx.compose.animation.core.Transition<T> getHighSpeedVideoSizes;

    public TransitionComposeAnimation(androidx.compose.animation.core.Transition<T> transition, java.util.Set<? extends java.lang.Object> set, java.lang.String str) {
        this.getHighSpeedVideoSizes = transition;
        this.Camera2StreamConfigurationMap = set;
        this.getHighSpeedVideoFpsRanges = str;
    }

    @Override // androidx.compose.ui.tooling.animation.TransitionBasedAnimation
    /* renamed from: getAnimationObject, reason: merged with bridge method [inline-methods] */
    public final androidx.compose.animation.core.Transition<T> m8528getAnimationObject() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.util.Set<java.lang.Object> getStates() {
        return this.Camera2StreamConfigurationMap;
    }

    /* renamed from: getLabel, reason: from getter */
    public final java.lang.String getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    /* renamed from: getType, reason: from getter */
    public final androidx.compose.animation.tooling.ComposeAnimationType getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
