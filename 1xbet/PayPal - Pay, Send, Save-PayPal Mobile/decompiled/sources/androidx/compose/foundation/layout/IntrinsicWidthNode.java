package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\n*\u00020\b2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000f*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0012\u001a\u00020\u000f*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0017\u001a\u00020\u00028\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001b\u001a\u00020\u00048\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019\"\u0004\b\u0017\u0010\u001a"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicWidthNode;", "Landroidx/compose/foundation/layout/IntrinsicSizeModifier;", "Landroidx/compose/foundation/layout/IntrinsicSize;", "p0", "", "p1", "<init>", "(Landroidx/compose/foundation/layout/IntrinsicSize;Z)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Camera2StreamConfigurationMap", "(Landroidx/compose/ui/layout/Measurable;J)J", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "maxIntrinsicWidth", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/layout/IntrinsicSize;", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/foundation/layout/IntrinsicSize;)V", "getHighResolutionOutputSizeshNQ4ISI", "Z", "()Z", "(Z)V", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class IntrinsicWidthNode extends androidx.compose.foundation.layout.IntrinsicSizeModifier {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.compose.foundation.layout.IntrinsicSize getHighResolutionOutputSizeshNQ4ISI;

    public IntrinsicWidthNode(androidx.compose.foundation.layout.IntrinsicSize intrinsicSize, boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = intrinsicSize;
        this.getHighSpeedVideoFpsRanges = z;
    }

    public final void getHighResolutionOutputSizeshNQ4ISI(boolean z) {
        this.getHighSpeedVideoFpsRanges = z;
    }

    public final void getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.layout.IntrinsicSize intrinsicSize) {
        this.getHighResolutionOutputSizeshNQ4ISI = intrinsicSize;
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    /* renamed from: getHighSpeedVideoSizes, reason: from getter */
    public final boolean getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    public final long Camera2StreamConfigurationMap(androidx.compose.ui.layout.Measurable p0, long p1) {
        int maxIntrinsicWidth;
        if (this.getHighResolutionOutputSizeshNQ4ISI == androidx.compose.foundation.layout.IntrinsicSize.Min) {
            maxIntrinsicWidth = p0.minIntrinsicWidth(androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(p1));
        } else {
            maxIntrinsicWidth = p0.maxIntrinsicWidth(androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(p1));
        }
        if (maxIntrinsicWidth < 0) {
            maxIntrinsicWidth = 0;
        }
        return androidx.compose.ui.unit.Constraints.INSTANCE.m8566fixedWidthOenEA2s(maxIntrinsicWidth);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        return this.getHighResolutionOutputSizeshNQ4ISI == androidx.compose.foundation.layout.IntrinsicSize.Min ? intrinsicMeasurable.minIntrinsicWidth(i) : intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        return this.getHighResolutionOutputSizeshNQ4ISI == androidx.compose.foundation.layout.IntrinsicSize.Min ? intrinsicMeasurable.minIntrinsicWidth(i) : intrinsicMeasurable.maxIntrinsicWidth(i);
    }
}
