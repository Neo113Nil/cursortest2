package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/compose/foundation/text/selection/HandlePositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "Landroidx/compose/ui/Alignment;", "handleReferencePoint", "Landroidx/compose/foundation/text/selection/OffsetProvider;", "positionProvider", "<init>", "(Landroidx/compose/ui/Alignment;Landroidx/compose/foundation/text/selection/OffsetProvider;)V", "Landroidx/compose/ui/unit/IntRect;", "anchorBounds", "Landroidx/compose/ui/unit/IntSize;", "windowSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "popupContentSize", "Landroidx/compose/ui/unit/IntOffset;", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "calculatePosition", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/Alignment;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/foundation/text/selection/OffsetProvider;", "Landroidx/compose/ui/geometry/Offset;", "getHighResolutionOutputSizeshNQ4ISI", "J"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HandlePositionProvider implements androidx.compose.ui.window.PopupPositionProvider {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.ui.Alignment getHighSpeedVideoFpsRanges;
    private long getHighResolutionOutputSizeshNQ4ISI = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.selection.OffsetProvider Camera2StreamConfigurationMap;

    public HandlePositionProvider(androidx.compose.ui.Alignment alignment, androidx.compose.foundation.text.selection.OffsetProvider offsetProvider) {
        this.getHighSpeedVideoFpsRanges = alignment;
        this.Camera2StreamConfigurationMap = offsetProvider;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public final long mo1386calculatePositionllwVHH4(androidx.compose.ui.unit.IntRect anchorBounds, long windowSize, androidx.compose.ui.unit.LayoutDirection layoutDirection, long popupContentSize) {
        long mo1994provideF1C5BW0 = this.Camera2StreamConfigurationMap.mo1994provideF1C5BW0();
        if ((9223372034707292159L & mo1994provideF1C5BW0) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            mo1994provideF1C5BW0 = this.getHighResolutionOutputSizeshNQ4ISI;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = mo1994provideF1C5BW0;
        return androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(anchorBounds.m8758getTopLeftnOccac(), androidx.compose.ui.unit.IntOffsetKt.m8746roundk4lQ0M(mo1994provideF1C5BW0)), this.getHighSpeedVideoFpsRanges.mo5504alignKFBX0sM(popupContentSize, androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g(), layoutDirection));
    }
}
