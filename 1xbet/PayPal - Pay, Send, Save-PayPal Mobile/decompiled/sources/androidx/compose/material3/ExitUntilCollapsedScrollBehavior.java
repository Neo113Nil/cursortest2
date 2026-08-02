package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0017\u0010\u001eR\u001a\u0010\u0013\u001a\u00020\n8\u0017X\u0097D¢\u0006\f\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u000e\u001a\u00020\"8\u0017@\u0016X\u0097\f¢\u0006\f\n\u0004\b\u0012\u0010#\u001a\u0004\b$\u0010%"}, d2 = {"Landroidx/compose/material3/ExitUntilCollapsedScrollBehavior;", "Landroidx/compose/material3/TopAppBarScrollBehavior;", "Landroidx/compose/material3/TopAppBarState;", "p0", "Landroidx/compose/animation/core/AnimationSpec;", "", "p1", "Landroidx/compose/animation/core/DecayAnimationSpec;", "p2", "Lkotlin/Function0;", "", "p3", "<init>", "(Landroidx/compose/material3/TopAppBarState;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/jvm/functions/Function0;)V", "getHighSpeedVideoSizesFor", "Landroidx/compose/material3/TopAppBarState;", "getState", "()Landroidx/compose/material3/TopAppBarState;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Landroidx/compose/animation/core/AnimationSpec;", "getSnapAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/animation/core/DecayAnimationSpec;", "getFlingAnimationSpec", "()Landroidx/compose/animation/core/DecayAnimationSpec;", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "Z", "isPinned", "()Z", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getNestedScrollConnection", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class ExitUntilCollapsedScrollBehavior implements androidx.compose.material3.TopAppBarScrollBehavior {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.animation.core.AnimationSpec<java.lang.Float> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.ui.input.nestedscroll.NestedScrollConnection getHighSpeedVideoSizesFor = new androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1(this);

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final boolean Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final androidx.compose.material3.TopAppBarState getHighResolutionOutputSizeshNQ4ISI;

    public static /* synthetic */ boolean Camera2StreamConfigurationMap() {
        return true;
    }

    public ExitUntilCollapsedScrollBehavior(androidx.compose.material3.TopAppBarState topAppBarState, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> decayAnimationSpec, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        this.getHighResolutionOutputSizeshNQ4ISI = topAppBarState;
        this.getHighSpeedVideoFpsRanges = animationSpec;
        this.getHighSpeedVideoSizes = decayAnimationSpec;
        this.getHighSpeedVideoFpsRangesFor = function0;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    /* renamed from: getState, reason: from getter */
    public final androidx.compose.material3.TopAppBarState getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public final androidx.compose.animation.core.AnimationSpec<java.lang.Float> getSnapAnimationSpec() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public final androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> getFlingAnimationSpec() {
        return this.getHighSpeedVideoSizes;
    }

    public final kotlin.jvm.functions.Function0<java.lang.Boolean> getHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    /* renamed from: isPinned, reason: from getter */
    public final boolean getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    /* renamed from: getNestedScrollConnection, reason: from getter */
    public final androidx.compose.ui.input.nestedscroll.NestedScrollConnection getGetHighSpeedVideoSizesFor() {
        return this.getHighSpeedVideoSizesFor;
    }
}
