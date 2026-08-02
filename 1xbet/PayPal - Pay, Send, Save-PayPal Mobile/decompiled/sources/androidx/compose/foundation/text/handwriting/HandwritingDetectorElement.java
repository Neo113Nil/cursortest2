package androidx.compose.foundation.text.handwriting;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u0004*\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/foundation/text/handwriting/HandwritingDetectorElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/handwriting/HandwritingDetectorNode;", "Lkotlin/Function0;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class HandwritingDetectorElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.text.handwriting.HandwritingDetectorNode> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    public HandwritingDetectorElement(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.getHighSpeedVideoFpsRangesFor = function0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* bridge */ /* synthetic */ void update(androidx.compose.foundation.text.handwriting.HandwritingDetectorNode handwritingDetectorNode) {
        handwritingDetectorNode.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.getHighSpeedVideoFpsRangesFor.hashCode() * 31;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        boolean z = false;
        boolean z2 = this == p0;
        if ((p0 instanceof androidx.compose.foundation.text.handwriting.HandwritingDetectorElement) && this.getHighSpeedVideoFpsRangesFor == ((androidx.compose.foundation.text.handwriting.HandwritingDetectorElement) p0).getHighSpeedVideoFpsRangesFor) {
            z = true;
        }
        return z2 | z;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("handwritingDetector");
        inspectorInfo.getProperties().set(com.sun.jna.Callback.METHOD_NAME, this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create */
    public final /* synthetic */ androidx.compose.foundation.text.handwriting.HandwritingDetectorNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.text.handwriting.HandwritingDetectorNode(this.getHighSpeedVideoFpsRangesFor);
    }
}
