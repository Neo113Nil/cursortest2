package androidx.compose.ui.scrollcapture;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0013\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0018\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0012\u0010\u001b"}, d2 = {"Landroidx/compose/ui/scrollcapture/ScrollCaptureCandidate;", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "p0", "", "p1", "Landroidx/compose/ui/unit/IntRect;", "p2", "Landroidx/compose/ui/layout/LayoutCoordinates;", "p3", "<init>", "(Landroidx/compose/ui/semantics/SemanticsNode;ILandroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/layout/LayoutCoordinates;)V", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/semantics/SemanticsNode;", "()Landroidx/compose/ui/semantics/SemanticsNode;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "()I", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/unit/IntRect;", "getHighSpeedVideoSizes", "()Landroidx/compose/ui/unit/IntRect;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "()Landroidx/compose/ui/layout/LayoutCoordinates;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ScrollCaptureCandidate {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.ui.unit.IntRect getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.ui.semantics.SemanticsNode Camera2StreamConfigurationMap;
    private final androidx.compose.ui.layout.LayoutCoordinates getHighSpeedVideoSizes;

    public ScrollCaptureCandidate(androidx.compose.ui.semantics.SemanticsNode semanticsNode, int i, androidx.compose.ui.unit.IntRect intRect, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        this.Camera2StreamConfigurationMap = semanticsNode;
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighResolutionOutputSizeshNQ4ISI = intRect;
        this.getHighSpeedVideoSizes = layoutCoordinates;
    }

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from getter */
    public final androidx.compose.ui.semantics.SemanticsNode getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from getter */
    public final int getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    /* renamed from: getHighSpeedVideoSizes, reason: from getter */
    public final androidx.compose.ui.unit.IntRect getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* renamed from: Camera2StreamConfigurationMap, reason: from getter */
    public final androidx.compose.ui.layout.LayoutCoordinates getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ScrollCaptureCandidate(node=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", depth=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", viewportBoundsInWindow=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", coordinates=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(')');
        return sb.toString();
    }
}
