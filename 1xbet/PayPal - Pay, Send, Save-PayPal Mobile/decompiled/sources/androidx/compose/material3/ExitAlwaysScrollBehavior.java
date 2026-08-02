package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\n8\u0017X\u0097D¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010&\u001a\u00020\"8\u0017@\u0016X\u0097\f¢\u0006\f\n\u0004\b\u001b\u0010#\u001a\u0004\b$\u0010%"}, d2 = {"Landroidx/compose/material3/ExitAlwaysScrollBehavior;", "Landroidx/compose/material3/BottomAppBarScrollBehavior;", "Landroidx/compose/material3/BottomAppBarState;", "p0", "Landroidx/compose/animation/core/AnimationSpec;", "", "p1", "Landroidx/compose/animation/core/DecayAnimationSpec;", "p2", "Lkotlin/Function0;", "", "p3", "<init>", "(Landroidx/compose/material3/BottomAppBarState;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/jvm/functions/Function0;)V", "getOutputFormats", "Landroidx/compose/material3/BottomAppBarState;", "getState", "()Landroidx/compose/material3/BottomAppBarState;", "getHighSpeedVideoSizes", "Landroidx/compose/animation/core/AnimationSpec;", "getSnapAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/animation/core/DecayAnimationSpec;", "getFlingAnimationSpec", "()Landroidx/compose/animation/core/DecayAnimationSpec;", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "Camera2StreamConfigurationMap", "Z", "isPinned", "()Z", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getNestedScrollConnection", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getOutputMinFrameDuration"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ExitAlwaysScrollBehavior implements androidx.compose.material3.BottomAppBarScrollBehavior {
    private final boolean Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.compose.ui.input.nestedscroll.NestedScrollConnection getOutputMinFrameDuration = new androidx.compose.material3.ExitAlwaysScrollBehavior$nestedScrollConnection$1(this);

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.animation.core.AnimationSpec<java.lang.Float> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final androidx.compose.material3.BottomAppBarState getHighSpeedVideoSizes;

    public static /* synthetic */ boolean getHighSpeedVideoFpsRangesFor() {
        return true;
    }

    public ExitAlwaysScrollBehavior(androidx.compose.material3.BottomAppBarState bottomAppBarState, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> decayAnimationSpec, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        this.getHighSpeedVideoSizes = bottomAppBarState;
        this.getHighSpeedVideoFpsRangesFor = animationSpec;
        this.getHighSpeedVideoFpsRanges = decayAnimationSpec;
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
    }

    @Override // androidx.compose.material3.BottomAppBarScrollBehavior
    /* renamed from: getState, reason: from getter */
    public final androidx.compose.material3.BottomAppBarState getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.compose.material3.BottomAppBarScrollBehavior
    public final androidx.compose.animation.core.AnimationSpec<java.lang.Float> getSnapAnimationSpec() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.compose.material3.BottomAppBarScrollBehavior
    public final androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> getFlingAnimationSpec() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final kotlin.jvm.functions.Function0<java.lang.Boolean> getHighSpeedVideoFpsRanges() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.compose.material3.BottomAppBarScrollBehavior
    /* renamed from: isPinned, reason: from getter */
    public final boolean getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.compose.material3.BottomAppBarScrollBehavior
    /* renamed from: getNestedScrollConnection, reason: from getter */
    public final androidx.compose.ui.input.nestedscroll.NestedScrollConnection getGetOutputMinFrameDuration() {
        return this.getOutputMinFrameDuration;
    }
}
