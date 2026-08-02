package androidx.compose.ui.tooling.animation;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0013\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/tooling/animation/UnsupportedComposeAnimation;", "Landroidx/compose/animation/tooling/ComposeAnimation;", "label", "", "<init>", "(Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "type", "Landroidx/compose/animation/tooling/ComposeAnimationType;", "getType", "()Landroidx/compose/animation/tooling/ComposeAnimationType;", "animationObject", "", "getAnimationObject", "()Ljava/lang/Object;", "states", "", "", "getStates", "()Ljava/util/Set;", "Companion", "ui-tooling"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UnsupportedComposeAnimation implements androidx.compose.animation.tooling.ComposeAnimation {
    private static boolean apiAvailable;
    private final java.lang.Object Camera2StreamConfigurationMap;
    private final androidx.compose.animation.tooling.ComposeAnimationType getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final java.util.Set<java.lang.Integer> getHighSpeedVideoFpsRangesFor;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.tooling.animation.UnsupportedComposeAnimation.Companion INSTANCE = new androidx.compose.ui.tooling.animation.UnsupportedComposeAnimation.Companion(null);
    public static final int $stable = 8;

    private UnsupportedComposeAnimation(java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.compose.animation.tooling.ComposeAnimationType.UNSUPPORTED;
        this.Camera2StreamConfigurationMap = 0;
        this.getHighSpeedVideoFpsRangesFor = kotlin.collections.SetsKt.emptySet();
    }

    /* renamed from: getLabel, reason: from getter */
    public final java.lang.String getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    /* renamed from: getType, reason: from getter */
    public final androidx.compose.animation.tooling.ComposeAnimationType getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* renamed from: getAnimationObject, reason: from getter */
    public final java.lang.Object getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.util.Set<java.lang.Integer> getStates() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t8\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/compose/ui/tooling/animation/UnsupportedComposeAnimation$Companion;", "", "<init>", "()V", "", "label", "Landroidx/compose/ui/tooling/animation/UnsupportedComposeAnimation;", "create", "(Ljava/lang/String;)Landroidx/compose/ui/tooling/animation/UnsupportedComposeAnimation;", "", "override", "", "testOverrideAvailability", "(Z)V", "p0", "apiAvailable", "Z", "getApiAvailable", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final boolean getApiAvailable() {
            return androidx.compose.ui.tooling.animation.UnsupportedComposeAnimation.apiAvailable;
        }

        public final androidx.compose.ui.tooling.animation.UnsupportedComposeAnimation create(java.lang.String label) {
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            if (getApiAvailable()) {
                return new androidx.compose.ui.tooling.animation.UnsupportedComposeAnimation(label, defaultConstructorMarker);
            }
            return null;
        }

        public final void testOverrideAvailability(boolean override) {
            androidx.compose.ui.tooling.animation.UnsupportedComposeAnimation.apiAvailable = override;
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
            if (kotlin.jvm.internal.Intrinsics.areEqual(values[i].name(), "UNSUPPORTED")) {
                z = true;
                break;
            }
            i++;
        }
        apiAvailable = z;
    }

    public /* synthetic */ UnsupportedComposeAnimation(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
