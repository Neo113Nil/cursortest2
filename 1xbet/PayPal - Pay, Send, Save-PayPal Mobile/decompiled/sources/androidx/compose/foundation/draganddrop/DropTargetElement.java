package androidx.compose.foundation.draganddrop;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B(\u0012\u0017\u0010\u0007\u001a\u0013\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0018\u001a\u0013\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u00060\u00038\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0019\u001a\u00020\b8\u0006¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/compose/foundation/draganddrop/DropTargetElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/draganddrop/DragAndDropTargetNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "Lkotlin/ParameterName;", "", "p0", "Landroidx/compose/ui/draganddrop/DragAndDropTarget;", "p1", "<init>", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/draganddrop/DragAndDropTarget;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/draganddrop/DragAndDropTarget;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DropTargetElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.draganddrop.DragAndDropTargetNode> {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.draganddrop.DragAndDropEvent, java.lang.Boolean> getHighSpeedVideoSizes;
    private final androidx.compose.ui.draganddrop.DragAndDropTarget getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public DropTargetElement(kotlin.jvm.functions.Function1<? super androidx.compose.ui.draganddrop.DragAndDropEvent, java.lang.Boolean> function1, androidx.compose.ui.draganddrop.DragAndDropTarget dragAndDropTarget) {
        this.getHighSpeedVideoSizes = function1;
        this.getHighSpeedVideoFpsRangesFor = dragAndDropTarget;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* synthetic */ void update(androidx.compose.foundation.draganddrop.DragAndDropTargetNode dragAndDropTargetNode) {
        androidx.compose.foundation.draganddrop.DragAndDropTargetNode dragAndDropTargetNode2 = dragAndDropTargetNode;
        androidx.compose.ui.draganddrop.DragAndDropTarget dragAndDropTarget = this.getHighSpeedVideoFpsRangesFor;
        dragAndDropTargetNode2.Camera2StreamConfigurationMap = this.getHighSpeedVideoSizes;
        if (kotlin.jvm.internal.Intrinsics.areEqual(dragAndDropTarget, dragAndDropTargetNode2.getHighSpeedVideoSizes)) {
            return;
        }
        androidx.compose.ui.draganddrop.DragAndDropTargetModifierNode dragAndDropTargetModifierNode = dragAndDropTargetNode2.getHighSpeedVideoFpsRanges;
        if (dragAndDropTargetModifierNode != null) {
            dragAndDropTargetNode2.undelegate(dragAndDropTargetModifierNode);
        }
        dragAndDropTargetNode2.getHighSpeedVideoSizes = dragAndDropTarget;
        dragAndDropTargetNode2.getHighSpeedVideoFpsRanges();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("dropTarget");
        inspectorInfo.getProperties().set(androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, this.getHighSpeedVideoFpsRangesFor);
        inspectorInfo.getProperties().set("shouldStartDragAndDrop", this.getHighSpeedVideoSizes);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.foundation.draganddrop.DropTargetElement)) {
            return false;
        }
        androidx.compose.foundation.draganddrop.DropTargetElement dropTargetElement = (androidx.compose.foundation.draganddrop.DropTargetElement) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, dropTargetElement.getHighSpeedVideoFpsRangesFor) && this.getHighSpeedVideoSizes == dropTargetElement.getHighSpeedVideoSizes;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return (this.getHighSpeedVideoFpsRangesFor.hashCode() * 31) + this.getHighSpeedVideoSizes.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create */
    public final /* synthetic */ androidx.compose.foundation.draganddrop.DragAndDropTargetNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.draganddrop.DragAndDropTargetNode(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor);
    }
}
