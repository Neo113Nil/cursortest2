package androidx.compose.ui.tooling.animation;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00038F¢\u0006\f\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\n¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimatedVisibilityComposeAnimation;", "Landroidx/compose/animation/tooling/ComposeAnimation;", "animationObject", "Landroidx/compose/animation/core/Transition;", "", "label", "", "<init>", "(Landroidx/compose/animation/core/Transition;Ljava/lang/String;)V", "getAnimationObject", "()Landroidx/compose/animation/core/Transition;", "getLabel", "()Ljava/lang/String;", "type", "Landroidx/compose/animation/tooling/ComposeAnimationType;", "getType", "()Landroidx/compose/animation/tooling/ComposeAnimationType;", "states", "", "Landroidx/compose/ui/tooling/animation/states/AnimatedVisibilityState;", "getStates", "()Ljava/util/Set;", "childTransition", "", "getChildTransition$annotations", "()V", "getChildTransition", "ui-tooling"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnimatedVisibilityComposeAnimation implements androidx.compose.animation.tooling.ComposeAnimation {
    public static final int $stable = 8;
    private final androidx.compose.animation.core.Transition<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoSizes;
    private final androidx.compose.animation.tooling.ComposeAnimationType Camera2StreamConfigurationMap = androidx.compose.animation.tooling.ComposeAnimationType.ANIMATED_VISIBILITY;
    private final java.util.Set<androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState> getHighSpeedVideoFpsRanges = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState[]{androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState.m8533boximpl(androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState.INSTANCE.m8539getEnterjXw82LU()), androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState.m8533boximpl(androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState.INSTANCE.m8540getExitjXw82LU())});

    public static /* synthetic */ void getChildTransition$annotations() {
    }

    public AnimatedVisibilityComposeAnimation(androidx.compose.animation.core.Transition<java.lang.Boolean> transition, java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = transition;
        this.getHighSpeedVideoSizes = str;
    }

    /* renamed from: getAnimationObject, reason: merged with bridge method [inline-methods] */
    public final androidx.compose.animation.core.Transition<java.lang.Boolean> m8518getAnimationObject() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* renamed from: getLabel, reason: from getter */
    public final java.lang.String getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    /* renamed from: getType, reason: from getter */
    public final androidx.compose.animation.tooling.ComposeAnimationType getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.util.Set<androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState> getStates() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final androidx.compose.animation.core.Transition<java.lang.Object> getChildTransition() {
        java.lang.Object orNull = kotlin.collections.CollectionsKt.getOrNull(m8518getAnimationObject().getTransitions(), 0);
        if (orNull instanceof androidx.compose.animation.core.Transition) {
            return (androidx.compose.animation.core.Transition) orNull;
        }
        return null;
    }
}
