package androidx.compose.foundation.draganddrop;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B(\u0012\u0017\u0010\u0006\u001a\u0013\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\rR'\u0010\u0010\u001a\u0013\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016"}, d2 = {"Landroidx/compose/foundation/draganddrop/DragAndDropTargetNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "Lkotlin/ParameterName;", "", "p0", "Landroidx/compose/ui/draganddrop/DragAndDropTarget;", "p1", "<init>", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/draganddrop/DragAndDropTarget;)V", "", "onAttach", "()V", "onDetach", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/draganddrop/DragAndDropTarget;", "getHighSpeedVideoSizes", "Landroidx/compose/ui/draganddrop/DragAndDropTargetModifierNode;", "Landroidx/compose/ui/draganddrop/DragAndDropTargetModifierNode;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DragAndDropTargetNode extends androidx.compose.ui.node.DelegatingNode {
    kotlin.jvm.functions.Function1<? super androidx.compose.ui.draganddrop.DragAndDropEvent, java.lang.Boolean> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    androidx.compose.ui.draganddrop.DragAndDropTarget getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    androidx.compose.ui.draganddrop.DragAndDropTargetModifierNode getHighSpeedVideoFpsRanges;

    public DragAndDropTargetNode(kotlin.jvm.functions.Function1<? super androidx.compose.ui.draganddrop.DragAndDropEvent, java.lang.Boolean> function1, androidx.compose.ui.draganddrop.DragAndDropTarget dragAndDropTarget) {
        this.Camera2StreamConfigurationMap = function1;
        this.getHighSpeedVideoSizes = dragAndDropTarget;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        getHighSpeedVideoFpsRanges();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        androidx.compose.ui.draganddrop.DragAndDropTargetModifierNode dragAndDropTargetModifierNode = this.getHighSpeedVideoFpsRanges;
        kotlin.jvm.internal.Intrinsics.checkNotNull(dragAndDropTargetModifierNode);
        undelegate(dragAndDropTargetModifierNode);
    }

    final void getHighSpeedVideoFpsRanges() {
        this.getHighSpeedVideoFpsRanges = (androidx.compose.ui.draganddrop.DragAndDropTargetModifierNode) delegate(androidx.compose.ui.draganddrop.DragAndDropNodeKt.DragAndDropTargetModifierNode(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.draganddrop.DragAndDropTargetNode$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                boolean booleanValue;
                booleanValue = androidx.compose.foundation.draganddrop.DragAndDropTargetNode.this.Camera2StreamConfigurationMap.invoke((androidx.compose.ui.draganddrop.DragAndDropEvent) obj).booleanValue();
                return java.lang.Boolean.valueOf(booleanValue);
            }
        }, this.getHighSpeedVideoSizes));
    }
}
