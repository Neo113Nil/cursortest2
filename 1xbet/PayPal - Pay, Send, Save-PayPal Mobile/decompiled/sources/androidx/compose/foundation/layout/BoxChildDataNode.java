package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u0000*\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u000f\u001a\u00020\u00038\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\r\u0010\u0011R\"\u0010\u0016\u001a\u00020\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u000b\u0010\u0015"}, d2 = {"Landroidx/compose/foundation/layout/BoxChildDataNode;", "Landroidx/compose/ui/node/ParentDataModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/Alignment;", "p0", "", "p1", "<init>", "(Landroidx/compose/ui/Alignment;Z)V", "Landroidx/compose/ui/unit/Density;", "", "getHighResolutionOutputSizeshNQ4ISI", "()Landroidx/compose/foundation/layout/BoxChildDataNode;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/Alignment;", "Camera2StreamConfigurationMap", "()Landroidx/compose/ui/Alignment;", "(Landroidx/compose/ui/Alignment;)V", "Z", "getHighSpeedVideoFpsRangesFor", "()Z", "(Z)V", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BoxChildDataNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.ParentDataModifierNode {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.compose.ui.Alignment Camera2StreamConfigurationMap;

    private androidx.compose.foundation.layout.BoxChildDataNode getHighResolutionOutputSizeshNQ4ISI() {
        return this;
    }

    public BoxChildDataNode(androidx.compose.ui.Alignment alignment, boolean z) {
        this.Camera2StreamConfigurationMap = alignment;
        this.getHighSpeedVideoSizes = z;
    }

    /* renamed from: Camera2StreamConfigurationMap, reason: from getter */
    public final androidx.compose.ui.Alignment getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    public final void getHighResolutionOutputSizeshNQ4ISI(boolean z) {
        this.getHighSpeedVideoSizes = z;
    }

    public final void getHighSpeedVideoFpsRanges(androidx.compose.ui.Alignment alignment) {
        this.Camera2StreamConfigurationMap = alignment;
    }

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from getter */
    public final boolean getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public final /* synthetic */ java.lang.Object modifyParentData(androidx.compose.ui.unit.Density density, java.lang.Object obj) {
        return getHighResolutionOutputSizeshNQ4ISI();
    }
}
