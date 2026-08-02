package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR\u001a\u0010\u001d\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u001a\u0010\u000f\u001a\u00020\n8\u0017X\u0097D¢\u0006\f\n\u0004\b\u0013\u0010!\u001a\u0004\b#\u0010\"R\u001c\u0010(\u001a\u00020$8\u0017@\u0016X\u0097\f¢\u0006\f\n\u0004\b\u0018\u0010%\u001a\u0004\b&\u0010'"}, d2 = {"Landroidx/compose/material3/EnterAlwaysScrollBehavior;", "Landroidx/compose/material3/TopAppBarScrollBehavior;", "Landroidx/compose/material3/TopAppBarState;", "p0", "Landroidx/compose/animation/core/AnimationSpec;", "", "p1", "Landroidx/compose/animation/core/DecayAnimationSpec;", "p2", "Lkotlin/Function0;", "", "p3", "p4", "<init>", "(Landroidx/compose/material3/TopAppBarState;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/jvm/functions/Function0;Z)V", "getOutputFormats", "Landroidx/compose/material3/TopAppBarState;", "getState", "()Landroidx/compose/material3/TopAppBarState;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizesFor", "Landroidx/compose/animation/core/AnimationSpec;", "getSnapAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/animation/core/DecayAnimationSpec;", "getFlingAnimationSpec", "()Landroidx/compose/animation/core/DecayAnimationSpec;", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoSizes", "Z", "()Z", "isPinned", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getNestedScrollConnection", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getInputFormats"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class EnterAlwaysScrollBehavior implements androidx.compose.material3.TopAppBarScrollBehavior {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.compose.ui.input.nestedscroll.NestedScrollConnection getInputFormats = new androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1(this);
    private final androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<java.lang.Boolean> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final boolean getOutputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final androidx.compose.animation.core.AnimationSpec<java.lang.Float> Camera2StreamConfigurationMap;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final androidx.compose.material3.TopAppBarState getHighSpeedVideoFpsRangesFor;

    public static /* synthetic */ boolean Camera2StreamConfigurationMap() {
        return true;
    }

    public EnterAlwaysScrollBehavior(androidx.compose.material3.TopAppBarState topAppBarState, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> decayAnimationSpec, kotlin.jvm.functions.Function0<java.lang.Boolean> function0, boolean z) {
        this.getHighSpeedVideoFpsRangesFor = topAppBarState;
        this.Camera2StreamConfigurationMap = animationSpec;
        this.getHighResolutionOutputSizeshNQ4ISI = decayAnimationSpec;
        this.getHighSpeedVideoSizes = function0;
        this.getHighSpeedVideoFpsRanges = z;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    /* renamed from: getState, reason: from getter */
    public final androidx.compose.material3.TopAppBarState getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public final androidx.compose.animation.core.AnimationSpec<java.lang.Float> getSnapAnimationSpec() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public final androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> getFlingAnimationSpec() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final kotlin.jvm.functions.Function0<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighSpeedVideoSizes;
    }

    /* renamed from: getHighSpeedVideoSizes, reason: from getter */
    public final boolean getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    /* renamed from: isPinned, reason: from getter */
    public final boolean getGetOutputFormats() {
        return this.getOutputFormats;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    /* renamed from: getNestedScrollConnection, reason: from getter */
    public final androidx.compose.ui.input.nestedscroll.NestedScrollConnection getGetInputFormats() {
        return this.getInputFormats;
    }
}
