package androidx.compose.ui.tooling.animation;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 #*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u00020\u0004:\u0001#B9\b\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0019R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001dX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/tooling/ComposeAnimation;", "toolingState", "Landroidx/compose/ui/tooling/animation/ToolingState;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "animationObject", "Landroidx/compose/animation/core/Animatable;", "<init>", "(Landroidx/compose/ui/tooling/animation/ToolingState;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/Animatable;)V", "getToolingState", "()Landroidx/compose/ui/tooling/animation/ToolingState;", "getAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "getAnimationObject", "()Landroidx/compose/animation/core/Animatable;", "type", "Landroidx/compose/animation/tooling/ComposeAnimationType;", "getType", "()Landroidx/compose/animation/tooling/ComposeAnimationType;", "states", "", "", "getStates", "()Ljava/util/Set;", "label", "", "getLabel", "()Ljava/lang/String;", "setState", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Companion", "ui-tooling"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnimateXAsStateComposeAnimation<T, V extends androidx.compose.animation.core.AnimationVector> implements androidx.compose.animation.tooling.ComposeAnimation {
    private static boolean apiAvailable;
    private final java.util.Set<java.lang.Object> Camera2StreamConfigurationMap;
    private final androidx.compose.ui.tooling.animation.ToolingState<T> getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final androidx.compose.animation.core.Animatable<T, V> getHighSpeedVideoFpsRangesFor;
    private final androidx.compose.animation.core.AnimationSpec<T> getHighSpeedVideoSizes;
    private final androidx.compose.animation.tooling.ComposeAnimationType getOutputFormats;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.tooling.animation.AnimateXAsStateComposeAnimation.Companion INSTANCE = new androidx.compose.ui.tooling.animation.AnimateXAsStateComposeAnimation.Companion(null);
    public static final int $stable = 8;

    private AnimateXAsStateComposeAnimation(androidx.compose.ui.tooling.animation.ToolingState<T> toolingState, androidx.compose.animation.core.AnimationSpec<T> animationSpec, androidx.compose.animation.core.Animatable<T, V> animatable) {
        java.util.Set<java.lang.Object> set;
        this.getHighResolutionOutputSizeshNQ4ISI = toolingState;
        this.getHighSpeedVideoSizes = animationSpec;
        this.getHighSpeedVideoFpsRangesFor = animatable;
        this.getOutputFormats = androidx.compose.animation.tooling.ComposeAnimationType.ANIMATE_X_AS_STATE;
        T value = m8516getAnimationObject().getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNull(value, "");
        java.lang.Object[] enumConstants = value.getClass().getEnumConstants();
        this.Camera2StreamConfigurationMap = (enumConstants == null || (set = kotlin.collections.ArraysKt.toSet(enumConstants)) == null) ? kotlin.collections.SetsKt.setOf(value) : set;
        this.getHighSpeedVideoFpsRanges = m8516getAnimationObject().getLabel();
    }

    public final androidx.compose.ui.tooling.animation.ToolingState<T> getToolingState() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final androidx.compose.animation.core.AnimationSpec<T> getAnimationSpec() {
        return this.getHighSpeedVideoSizes;
    }

    /* renamed from: getAnimationObject, reason: merged with bridge method [inline-methods] */
    public final androidx.compose.animation.core.Animatable<T, V> m8516getAnimationObject() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    /* renamed from: getType, reason: from getter */
    public final androidx.compose.animation.tooling.ComposeAnimationType getGetOutputFormats() {
        return this.getOutputFormats;
    }

    public final java.util.Set<java.lang.Object> getStates() {
        return this.Camera2StreamConfigurationMap;
    }

    /* renamed from: getLabel, reason: from getter */
    public final java.lang.String getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final void setState(java.lang.Object value) {
        this.getHighResolutionOutputSizeshNQ4ISI.setValue(value);
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\t\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\b\"\u0004\b\u0002\u0010\u0004\"\b\b\u0003\u0010\u0006*\u00020\u0005*\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b8\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation$Companion;", "", "<init>", "()V", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearchInfo;", "Landroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation;", "parse$ui_tooling", "(Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearchInfo;)Landroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation;", "", "override", "", "testOverrideAvailability", "(Z)V", "p0", "apiAvailable", "Z", "getApiAvailable", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final boolean getApiAvailable() {
            return androidx.compose.ui.tooling.animation.AnimateXAsStateComposeAnimation.apiAvailable;
        }

        public final <T, V extends androidx.compose.animation.core.AnimationVector> androidx.compose.ui.tooling.animation.AnimateXAsStateComposeAnimation<?, ?> parse$ui_tooling(androidx.compose.ui.tooling.animation.AnimationSearch.AnimateXAsStateSearchInfo<T, V> animateXAsStateSearchInfo) {
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            if (getApiAvailable() && animateXAsStateSearchInfo.getAnimatable().getValue() != null) {
                return new androidx.compose.ui.tooling.animation.AnimateXAsStateComposeAnimation<>(animateXAsStateSearchInfo.getToolingState(), animateXAsStateSearchInfo.getAnimationSpec(), animateXAsStateSearchInfo.getAnimatable(), defaultConstructorMarker);
            }
            return null;
        }

        public final void testOverrideAvailability(boolean override) {
            androidx.compose.ui.tooling.animation.AnimateXAsStateComposeAnimation.apiAvailable = override;
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
            if (kotlin.jvm.internal.Intrinsics.areEqual(values[i].name(), "ANIMATE_X_AS_STATE")) {
                z = true;
                break;
            }
            i++;
        }
        apiAvailable = z;
    }

    public /* synthetic */ AnimateXAsStateComposeAnimation(androidx.compose.ui.tooling.animation.ToolingState toolingState, androidx.compose.animation.core.AnimationSpec animationSpec, androidx.compose.animation.core.Animatable animatable, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(toolingState, animationSpec, animatable);
    }
}
