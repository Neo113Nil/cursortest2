package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\n*\u00020\b2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000f*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0012\u001a\u00020\u000f*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0016\u001a\u00020\u00028\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\"\u0004\b\u000b\u0010\u0015R\"\u0010\u000b\u001a\u00020\u00048\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicHeightNode;", "Landroidx/compose/foundation/layout/IntrinsicSizeModifier;", "Landroidx/compose/foundation/layout/IntrinsicSize;", "p0", "", "p1", "<init>", "(Landroidx/compose/foundation/layout/IntrinsicSize;Z)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Camera2StreamConfigurationMap", "(Landroidx/compose/ui/layout/Measurable;J)J", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "minIntrinsicHeight", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "maxIntrinsicHeight", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/foundation/layout/IntrinsicSize;", "(Landroidx/compose/foundation/layout/IntrinsicSize;)V", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Z", "()Z", "getHighSpeedVideoFpsRanges", "(Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class IntrinsicHeightNode extends androidx.compose.foundation.layout.IntrinsicSizeModifier {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.compose.foundation.layout.IntrinsicSize getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean Camera2StreamConfigurationMap;

    public IntrinsicHeightNode(androidx.compose.foundation.layout.IntrinsicSize intrinsicSize, boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = intrinsicSize;
        this.Camera2StreamConfigurationMap = z;
    }

    public final void Camera2StreamConfigurationMap(androidx.compose.foundation.layout.IntrinsicSize intrinsicSize) {
        this.getHighResolutionOutputSizeshNQ4ISI = intrinsicSize;
    }

    public final void getHighSpeedVideoFpsRanges(boolean z) {
        this.Camera2StreamConfigurationMap = z;
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    /* renamed from: getHighSpeedVideoSizes, reason: from getter */
    public final boolean getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    public final long Camera2StreamConfigurationMap(androidx.compose.ui.layout.Measurable p0, long p1) {
        int maxIntrinsicHeight;
        if (this.getHighResolutionOutputSizeshNQ4ISI == androidx.compose.foundation.layout.IntrinsicSize.Min) {
            maxIntrinsicHeight = p0.minIntrinsicHeight(androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(p1));
        } else {
            maxIntrinsicHeight = p0.maxIntrinsicHeight(androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(p1));
        }
        if (maxIntrinsicHeight < 0) {
            maxIntrinsicHeight = 0;
        }
        return androidx.compose.ui.unit.Constraints.INSTANCE.m8565fixedHeightOenEA2s(maxIntrinsicHeight);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        return this.getHighResolutionOutputSizeshNQ4ISI == androidx.compose.foundation.layout.IntrinsicSize.Min ? intrinsicMeasurable.minIntrinsicHeight(i) : intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        return this.getHighResolutionOutputSizeshNQ4ISI == androidx.compose.foundation.layout.IntrinsicSize.Min ? intrinsicMeasurable.minIntrinsicHeight(i) : intrinsicMeasurable.maxIntrinsicHeight(i);
    }
}
