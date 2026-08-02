package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00058\u0017X\u0097D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001c8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010$\u001a\u00020 8\u0017@\u0016X\u0097\f¢\u0006\f\n\u0004\b\u0010\u0010!\u001a\u0004\b\"\u0010#"}, d2 = {"Landroidx/compose/material3/PinnedScrollBehavior;", "Landroidx/compose/material3/TopAppBarScrollBehavior;", "Landroidx/compose/material3/TopAppBarState;", "p0", "Lkotlin/Function0;", "", "p1", "<init>", "(Landroidx/compose/material3/TopAppBarState;Lkotlin/jvm/functions/Function0;)V", "getOutputMinFrameDuration", "Landroidx/compose/material3/TopAppBarState;", "getState", "()Landroidx/compose/material3/TopAppBarState;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRanges", "()Lkotlin/jvm/functions/Function0;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Z", "isPinned", "()Z", "Landroidx/compose/animation/core/AnimationSpec;", "", "Landroidx/compose/animation/core/AnimationSpec;", "getSnapAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "getFlingAnimationSpec", "()Landroidx/compose/animation/core/DecayAnimationSpec;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getNestedScrollConnection", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getInputFormats"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class PinnedScrollBehavior implements androidx.compose.material3.TopAppBarScrollBehavior {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.animation.core.AnimationSpec<java.lang.Float> getHighSpeedVideoFpsRanges;
    private final boolean getHighResolutionOutputSizeshNQ4ISI = true;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.compose.ui.input.nestedscroll.NestedScrollConnection getInputFormats = new androidx.compose.ui.input.nestedscroll.NestedScrollConnection() { // from class: androidx.compose.material3.PinnedScrollBehavior$nestedScrollConnection$1
        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPostScroll-DzOQY0M */
        public final long mo1529onPostScrollDzOQY0M(long consumed, long available, int source) {
            if (!androidx.compose.material3.PinnedScrollBehavior.this.getHighSpeedVideoFpsRanges().invoke().booleanValue()) {
                return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
            }
            androidx.compose.material3.TopAppBarState getHighSpeedVideoFpsRangesFor = androidx.compose.material3.PinnedScrollBehavior.this.getGetHighSpeedVideoFpsRangesFor();
            getHighSpeedVideoFpsRangesFor.setContentOffset(getHighSpeedVideoFpsRangesFor.getContentOffset() + java.lang.Float.intBitsToFloat((int) (consumed & 4294967295L)));
            return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPostFling-RZ2iAVY */
        public final java.lang.Object mo1528onPostFlingRZ2iAVY(long j, long j2, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
            if (androidx.compose.ui.unit.Velocity.m8840getYimpl(j2) > 0.0f) {
                androidx.compose.material3.PinnedScrollBehavior.this.getGetHighSpeedVideoFpsRangesFor().setContentOffset(0.0f);
            }
            return super.mo1528onPostFlingRZ2iAVY(j, j2, continuation);
        }
    };

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<java.lang.Boolean> Camera2StreamConfigurationMap;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final androidx.compose.material3.TopAppBarState getHighSpeedVideoFpsRangesFor;

    public static /* synthetic */ boolean Camera2StreamConfigurationMap() {
        return true;
    }

    public PinnedScrollBehavior(androidx.compose.material3.TopAppBarState topAppBarState, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        this.getHighSpeedVideoFpsRangesFor = topAppBarState;
        this.Camera2StreamConfigurationMap = function0;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    /* renamed from: getState, reason: from getter */
    public final androidx.compose.material3.TopAppBarState getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final kotlin.jvm.functions.Function0<java.lang.Boolean> getHighSpeedVideoFpsRanges() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    /* renamed from: isPinned, reason: from getter */
    public final boolean getGetHighResolutionOutputSizeshNQ4ISI() {
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

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    /* renamed from: getNestedScrollConnection, reason: from getter */
    public final androidx.compose.ui.input.nestedscroll.NestedScrollConnection getGetInputFormats() {
        return this.getInputFormats;
    }
}
