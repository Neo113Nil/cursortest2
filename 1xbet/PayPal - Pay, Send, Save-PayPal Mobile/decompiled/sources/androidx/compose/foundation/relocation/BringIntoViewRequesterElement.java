package androidx.compose.foundation.relocation;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\t*\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/relocation/BringIntoViewRequesterNode;", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "p0", "<init>", "(Landroidx/compose/foundation/relocation/BringIntoViewRequester;)V", "getHighSpeedVideoFpsRanges", "()Landroidx/compose/foundation/relocation/BringIntoViewRequesterNode;", "", "Camera2StreamConfigurationMap", "(Landroidx/compose/foundation/relocation/BringIntoViewRequesterNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BringIntoViewRequesterElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.relocation.BringIntoViewRequesterNode> {
    private final androidx.compose.foundation.relocation.BringIntoViewRequester getHighSpeedVideoSizes;

    public BringIntoViewRequesterElement(androidx.compose.foundation.relocation.BringIntoViewRequester bringIntoViewRequester) {
        this.getHighSpeedVideoSizes = bringIntoViewRequester;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.relocation.BringIntoViewRequesterNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.relocation.BringIntoViewRequesterNode(this.getHighSpeedVideoSizes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public void update(androidx.compose.foundation.relocation.BringIntoViewRequesterNode p0) {
        p0.updateRequester(this.getHighSpeedVideoSizes);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("bringIntoViewRequester");
        inspectorInfo.getProperties().set("bringIntoViewRequester", this.getHighSpeedVideoSizes);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this != p0) {
            return (p0 instanceof androidx.compose.foundation.relocation.BringIntoViewRequesterElement) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, ((androidx.compose.foundation.relocation.BringIntoViewRequesterElement) p0).getHighSpeedVideoSizes);
        }
        return true;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.getHighSpeedVideoSizes.hashCode();
    }
}
