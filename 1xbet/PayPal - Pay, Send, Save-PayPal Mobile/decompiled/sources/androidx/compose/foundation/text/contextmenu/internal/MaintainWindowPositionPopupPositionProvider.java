package androidx.compose.foundation.text.contextmenu.internal;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J/\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0011\u001a\u00020\u00018\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/internal/MaintainWindowPositionPopupPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "p0", "<init>", "(Landroidx/compose/ui/window/PopupPositionProvider;)V", "Landroidx/compose/ui/unit/IntRect;", "Landroidx/compose/ui/unit/IntSize;", "p1", "Landroidx/compose/ui/unit/LayoutDirection;", "p2", "p3", "Landroidx/compose/ui/unit/IntOffset;", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "calculatePosition", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/window/PopupPositionProvider;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Landroidx/compose/ui/unit/IntSize;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/unit/LayoutDirection;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/unit/IntOffset;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class MaintainWindowPositionPopupPositionProvider implements androidx.compose.ui.window.PopupPositionProvider {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    public androidx.compose.ui.unit.LayoutDirection getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    public androidx.compose.ui.unit.IntSize Camera2StreamConfigurationMap;
    public androidx.compose.ui.unit.IntOffset getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.ui.window.PopupPositionProvider getHighResolutionOutputSizeshNQ4ISI;
    public androidx.compose.ui.unit.IntSize getHighSpeedVideoSizes;

    public MaintainWindowPositionPopupPositionProvider(androidx.compose.ui.window.PopupPositionProvider popupPositionProvider) {
        this.getHighResolutionOutputSizeshNQ4ISI = popupPositionProvider;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public final long mo1386calculatePositionllwVHH4(androidx.compose.ui.unit.IntRect p0, long p1, androidx.compose.ui.unit.LayoutDirection p2, long p3) {
        androidx.compose.ui.unit.IntSize intSize;
        androidx.compose.ui.unit.IntSize intSize2;
        androidx.compose.ui.unit.IntOffset intOffset = this.getHighSpeedVideoFpsRanges;
        if (intOffset != null && (intSize = this.getHighSpeedVideoSizes) != null && androidx.compose.ui.unit.IntSize.m8770equalsimpl0(intSize.m8776unboximpl(), p1) && this.getHighSpeedVideoFpsRangesFor == p2 && (intSize2 = this.Camera2StreamConfigurationMap) != null && androidx.compose.ui.unit.IntSize.m8770equalsimpl0(intSize2.m8776unboximpl(), p3)) {
            return intOffset.m8738unboximpl();
        }
        long mo1386calculatePositionllwVHH4 = this.getHighResolutionOutputSizeshNQ4ISI.mo1386calculatePositionllwVHH4(p0, p1, p2, p3);
        this.getHighSpeedVideoSizes = androidx.compose.ui.unit.IntSize.m8764boximpl(p1);
        this.getHighSpeedVideoFpsRangesFor = p2;
        this.Camera2StreamConfigurationMap = androidx.compose.ui.unit.IntSize.m8764boximpl(p3);
        this.getHighSpeedVideoFpsRanges = androidx.compose.ui.unit.IntOffset.m8720boximpl(mo1386calculatePositionllwVHH4);
        return mo1386calculatePositionllwVHH4;
    }
}
