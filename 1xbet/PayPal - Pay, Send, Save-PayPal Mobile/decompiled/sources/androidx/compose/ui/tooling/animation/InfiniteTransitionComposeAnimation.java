package androidx.compose.ui.tooling.animation;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001f\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0004R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation;", "Landroidx/compose/animation/tooling/ComposeAnimation;", "toolingState", "Landroidx/compose/ui/tooling/animation/ToolingState;", "", "animationObject", "Landroidx/compose/animation/core/InfiniteTransition;", "<init>", "(Landroidx/compose/ui/tooling/animation/ToolingState;Landroidx/compose/animation/core/InfiniteTransition;)V", "getAnimationObject", "()Landroidx/compose/animation/core/InfiniteTransition;", "type", "Landroidx/compose/animation/tooling/ComposeAnimationType;", "getType", "()Landroidx/compose/animation/tooling/ComposeAnimationType;", "states", "", "", "getStates", "()Ljava/util/Set;", "label", "", "getLabel", "()Ljava/lang/String;", "setTimeNanos", "", "playTimeNanos", "Companion", "ui-tooling"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InfiniteTransitionComposeAnimation implements androidx.compose.animation.tooling.ComposeAnimation {
    private static boolean apiAvailable;
    private final java.lang.String Camera2StreamConfigurationMap;
    private final androidx.compose.animation.tooling.ComposeAnimationType getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.compose.ui.tooling.animation.ToolingState<java.lang.Long> getHighSpeedVideoFpsRanges;
    private final androidx.compose.animation.core.InfiniteTransition getHighSpeedVideoFpsRangesFor;
    private final java.util.Set<java.lang.Object> getHighSpeedVideoSizes;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.tooling.animation.InfiniteTransitionComposeAnimation.Companion INSTANCE = new androidx.compose.ui.tooling.animation.InfiniteTransitionComposeAnimation.Companion(null);
    public static final int $stable = 8;

    private InfiniteTransitionComposeAnimation(androidx.compose.ui.tooling.animation.ToolingState<java.lang.Long> toolingState, androidx.compose.animation.core.InfiniteTransition infiniteTransition) {
        this.getHighSpeedVideoFpsRanges = toolingState;
        this.getHighSpeedVideoFpsRangesFor = infiniteTransition;
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.compose.animation.tooling.ComposeAnimationType.INFINITE_TRANSITION;
        this.getHighSpeedVideoSizes = kotlin.collections.SetsKt.setOf(0);
        this.Camera2StreamConfigurationMap = m8523getAnimationObject().getLabel();
    }

    /* renamed from: getAnimationObject, reason: from getter and merged with bridge method [inline-methods] */
    public final androidx.compose.animation.core.InfiniteTransition m8523getAnimationObject() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    /* renamed from: getType, reason: from getter */
    public final androidx.compose.animation.tooling.ComposeAnimationType getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.util.Set<java.lang.Object> getStates() {
        return this.getHighSpeedVideoSizes;
    }

    /* renamed from: getLabel, reason: from getter */
    public final java.lang.String getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    public final void setTimeNanos(long playTimeNanos) {
        this.getHighSpeedVideoFpsRanges.setValue(java.lang.Long.valueOf(playTimeNanos));
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b8\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearchInfo;", "Landroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation;", "parse$ui_tooling", "(Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearchInfo;)Landroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation;", "", "override", "", "testOverrideAvailability", "(Z)V", "p0", "apiAvailable", "Z", "getApiAvailable", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final boolean getApiAvailable() {
            return androidx.compose.ui.tooling.animation.InfiniteTransitionComposeAnimation.apiAvailable;
        }

        public final androidx.compose.ui.tooling.animation.InfiniteTransitionComposeAnimation parse$ui_tooling(androidx.compose.ui.tooling.animation.AnimationSearch.InfiniteTransitionSearchInfo infiniteTransitionSearchInfo) {
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            if (getApiAvailable()) {
                return new androidx.compose.ui.tooling.animation.InfiniteTransitionComposeAnimation(infiniteTransitionSearchInfo.getToolingState(), infiniteTransitionSearchInfo.getInfiniteTransition(), defaultConstructorMarker);
            }
            return null;
        }

        public final void testOverrideAvailability(boolean override) {
            androidx.compose.ui.tooling.animation.InfiniteTransitionComposeAnimation.apiAvailable = override;
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
            if (kotlin.jvm.internal.Intrinsics.areEqual(values[i].name(), "INFINITE_TRANSITION")) {
                z = true;
                break;
            }
            i++;
        }
        apiAvailable = z;
    }

    public /* synthetic */ InfiniteTransitionComposeAnimation(androidx.compose.ui.tooling.animation.ToolingState toolingState, androidx.compose.animation.core.InfiniteTransition infiniteTransition, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(toolingState, infiniteTransition);
    }
}
