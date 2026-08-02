package androidx.compose.ui;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/ui/CombinedAlignment;", "Landroidx/compose/ui/Alignment;", "Landroidx/compose/ui/Alignment$Horizontal;", "p0", "Landroidx/compose/ui/Alignment$Vertical;", "p1", "<init>", "(Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;)V", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/unit/LayoutDirection;", "p2", "Landroidx/compose/ui/unit/IntOffset;", "align-KFBX0sM", "(JJLandroidx/compose/ui/unit/LayoutDirection;)J", "align", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/Alignment$Horizontal;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/Alignment$Vertical;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class CombinedAlignment implements androidx.compose.ui.Alignment {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.ui.Alignment.Vertical getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.ui.Alignment.Horizontal getHighResolutionOutputSizeshNQ4ISI;

    public CombinedAlignment(androidx.compose.ui.Alignment.Horizontal horizontal, androidx.compose.ui.Alignment.Vertical vertical) {
        this.getHighResolutionOutputSizeshNQ4ISI = horizontal;
        this.getHighSpeedVideoSizes = vertical;
    }

    @Override // androidx.compose.ui.Alignment
    /* renamed from: align-KFBX0sM */
    public final long mo5504alignKFBX0sM(long p0, long p1, androidx.compose.ui.unit.LayoutDirection p2) {
        return androidx.compose.ui.unit.IntOffset.m8723constructorimpl((this.getHighResolutionOutputSizeshNQ4ISI.align((int) (p0 >> 32), (int) (p1 >> 32), p2) << 32) | (this.getHighSpeedVideoSizes.align((int) (p0 & 4294967295L), (int) (p1 & 4294967295L)) & 4294967295L));
    }
}
