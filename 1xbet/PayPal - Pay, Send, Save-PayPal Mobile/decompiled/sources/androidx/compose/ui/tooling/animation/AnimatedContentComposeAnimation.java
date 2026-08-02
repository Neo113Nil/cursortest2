package androidx.compose.ui.tooling.animation;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u0017*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u0017B/\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimatedContentComposeAnimation;", "T", "Landroidx/compose/animation/tooling/ComposeAnimation;", "Landroidx/compose/ui/tooling/animation/TransitionBasedAnimation;", "animationObject", "Landroidx/compose/animation/core/Transition;", "states", "", "", "label", "", "<init>", "(Landroidx/compose/animation/core/Transition;Ljava/util/Set;Ljava/lang/String;)V", "getAnimationObject", "()Landroidx/compose/animation/core/Transition;", "getStates", "()Ljava/util/Set;", "getLabel", "()Ljava/lang/String;", "type", "Landroidx/compose/animation/tooling/ComposeAnimationType;", "getType", "()Landroidx/compose/animation/tooling/ComposeAnimationType;", "Companion", "ui-tooling"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnimatedContentComposeAnimation<T> implements androidx.compose.animation.tooling.ComposeAnimation, androidx.compose.ui.tooling.animation.TransitionBasedAnimation<T> {
    private static boolean apiAvailable;
    private final java.lang.String Camera2StreamConfigurationMap;
    private final androidx.compose.animation.tooling.ComposeAnimationType getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.compose.animation.core.Transition<T> getHighSpeedVideoFpsRanges;
    private final java.util.Set<java.lang.Object> getHighSpeedVideoFpsRangesFor;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.tooling.animation.AnimatedContentComposeAnimation.Companion INSTANCE = new androidx.compose.ui.tooling.animation.AnimatedContentComposeAnimation.Companion(null);
    public static final int $stable = 8;

    private AnimatedContentComposeAnimation(androidx.compose.animation.core.Transition<T> transition, java.util.Set<? extends java.lang.Object> set, java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = transition;
        this.getHighSpeedVideoFpsRangesFor = set;
        this.Camera2StreamConfigurationMap = str;
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.compose.animation.tooling.ComposeAnimationType.ANIMATED_CONTENT;
    }

    @Override // androidx.compose.ui.tooling.animation.TransitionBasedAnimation
    /* renamed from: getAnimationObject, reason: merged with bridge method [inline-methods] */
    public final androidx.compose.animation.core.Transition<T> m8517getAnimationObject() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.util.Set<java.lang.Object> getStates() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    /* renamed from: getLabel, reason: from getter */
    public final java.lang.String getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    /* renamed from: getType, reason: from getter */
    public final androidx.compose.animation.tooling.ComposeAnimationType getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b8\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimatedContentComposeAnimation$Companion;", "", "<init>", "()V", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/ui/tooling/animation/AnimatedContentComposeAnimation;", "parseAnimatedContent", "(Landroidx/compose/animation/core/Transition;)Landroidx/compose/ui/tooling/animation/AnimatedContentComposeAnimation;", "", "override", "", "testOverrideAvailability", "(Z)V", "p0", "apiAvailable", "Z", "getApiAvailable", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final boolean getApiAvailable() {
            return androidx.compose.ui.tooling.animation.AnimatedContentComposeAnimation.apiAvailable;
        }

        public final androidx.compose.ui.tooling.animation.AnimatedContentComposeAnimation<?> parseAnimatedContent(androidx.compose.animation.core.Transition<?> transition) {
            java.lang.Object currentState;
            java.util.Set of;
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            if (!getApiAvailable() || (currentState = transition.getCurrentState()) == null) {
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
            return new androidx.compose.ui.tooling.animation.AnimatedContentComposeAnimation<>(transition, of, getHighSpeedVideoFpsRanges, defaultConstructorMarker);
        }

        public final void testOverrideAvailability(boolean override) {
            androidx.compose.ui.tooling.animation.AnimatedContentComposeAnimation.apiAvailable = override;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        androidx.compose.animation.tooling.ComposeAnimationType[] values = androidx.compose.animation.tooling.ComposeAnimationType.values();
        int length = values.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(values[i].name(), "ANIMATED_CONTENT")) {
                z = true;
                break;
            }
            i++;
        }
        apiAvailable = z;
    }

    public /* synthetic */ AnimatedContentComposeAnimation(androidx.compose.animation.core.Transition transition, java.util.Set set, java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(transition, set, str);
    }
}
