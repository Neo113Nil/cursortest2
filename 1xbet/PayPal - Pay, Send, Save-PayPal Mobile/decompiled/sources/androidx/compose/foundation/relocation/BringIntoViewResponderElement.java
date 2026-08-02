package androidx.compose.foundation.relocation;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\t*\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewResponderElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "p0", "<init>", "(Landroidx/compose/foundation/relocation/BringIntoViewResponder;)V", "getHighSpeedVideoFpsRanges", "()Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;", "", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class BringIntoViewResponderElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.relocation.BringIntoViewResponderNode> {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.foundation.relocation.BringIntoViewResponder Camera2StreamConfigurationMap;

    public BringIntoViewResponderElement(androidx.compose.foundation.relocation.BringIntoViewResponder bringIntoViewResponder) {
        this.Camera2StreamConfigurationMap = bringIntoViewResponder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.relocation.BringIntoViewResponderNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.relocation.BringIntoViewResponderNode(this.Camera2StreamConfigurationMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public void update(androidx.compose.foundation.relocation.BringIntoViewResponderNode p0) {
        p0.setResponder(this.Camera2StreamConfigurationMap);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this != p0) {
            return (p0 instanceof androidx.compose.foundation.relocation.BringIntoViewResponderElement) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, ((androidx.compose.foundation.relocation.BringIntoViewResponderElement) p0).Camera2StreamConfigurationMap);
        }
        return true;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.Camera2StreamConfigurationMap.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("bringIntoViewResponder");
        inspectorInfo.getProperties().set("responder", this.Camera2StreamConfigurationMap);
    }
}
