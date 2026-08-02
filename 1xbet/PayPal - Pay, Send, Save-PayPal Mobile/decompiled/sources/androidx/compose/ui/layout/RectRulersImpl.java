package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\b\u001a\u00020\u000b8\u0017@\u0016X\u0096\f¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0014\u001a\u00020\u000f8\u0017@\u0016X\u0097\f¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\u00020\u000b8\u0017@\u0016X\u0097\f¢\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0015\u0010\u000eR\u001c\u0010\u0010\u001a\u00020\u000f8\u0017@\u0016X\u0097\f¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013"}, d2 = {"Landroidx/compose/ui/layout/RectRulersImpl;", "Landroidx/compose/ui/layout/RectRulers;", "", "p0", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/layout/VerticalRuler;", "Landroidx/compose/ui/layout/VerticalRuler;", "getLeft", "()Landroidx/compose/ui/layout/VerticalRuler;", "Landroidx/compose/ui/layout/HorizontalRuler;", "getHighSpeedVideoSizes", "Landroidx/compose/ui/layout/HorizontalRuler;", "getTop", "()Landroidx/compose/ui/layout/HorizontalRuler;", "getHighSpeedVideoFpsRangesFor", "getRight", "getHighSpeedVideoFpsRanges", "getBottom"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class RectRulersImpl implements androidx.compose.ui.layout.RectRulers {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.String Camera2StreamConfigurationMap;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.compose.ui.layout.VerticalRuler getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.ui.layout.VerticalRuler();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.compose.ui.layout.HorizontalRuler getHighSpeedVideoFpsRangesFor = new androidx.compose.ui.layout.HorizontalRuler();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.compose.ui.layout.VerticalRuler getHighSpeedVideoFpsRanges = new androidx.compose.ui.layout.VerticalRuler();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.compose.ui.layout.HorizontalRuler getHighSpeedVideoSizes = new androidx.compose.ui.layout.HorizontalRuler();

    public RectRulersImpl(java.lang.String str) {
        this.Camera2StreamConfigurationMap = str;
    }

    @Override // androidx.compose.ui.layout.RectRulers
    /* renamed from: getLeft, reason: from getter */
    public final androidx.compose.ui.layout.VerticalRuler getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.compose.ui.layout.RectRulers
    /* renamed from: getTop, reason: from getter */
    public final androidx.compose.ui.layout.HorizontalRuler getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.compose.ui.layout.RectRulers
    /* renamed from: getRight, reason: from getter */
    public final androidx.compose.ui.layout.VerticalRuler getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.compose.ui.layout.RectRulers
    /* renamed from: getBottom, reason: from getter */
    public final androidx.compose.ui.layout.HorizontalRuler getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.lang.String toString() {
        if (this.Camera2StreamConfigurationMap == null) {
            return super.toString();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RectRulers(");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(')');
        return sb.toString();
    }
}
