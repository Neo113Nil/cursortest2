package androidx.compose.foundation.draganddrop;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Be\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u0012-\u0010\r\u001a)\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bj\u0004\b\u0001`\f¢\u0006\u0002\b\u0006\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0005*\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00068\u0006¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR8\u0010\u001f\u001a)\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bj\u0004\b\u0001`\f¢\u0006\u0002\b\u00068\u0006¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001f\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00038\u0006¢\u0006\u0006\n\u0004\b!\u0010\u001d"}, d2 = {"Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "p0", "Lkotlin/Function2;", "Landroidx/compose/foundation/draganddrop/DragAndDropStartDetectorScope;", "Lkotlin/coroutines/Continuation;", "", "Landroidx/compose/foundation/draganddrop/DragAndDropStartDetector;", "p1", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "p2", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function1;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function2;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DragAndDropSourceElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.draganddrop.DragAndDropSourceNode> {
    private final kotlin.jvm.functions.Function2<androidx.compose.foundation.draganddrop.DragAndDropStartDetectorScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> Camera2StreamConfigurationMap;
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, androidx.compose.ui.draganddrop.DragAndDropTransferData> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropSourceElement(kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.draganddrop.DragAndDropStartDetectorScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, androidx.compose.ui.draganddrop.DragAndDropTransferData> function12) {
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.Camera2StreamConfigurationMap = function2;
        this.getHighSpeedVideoFpsRanges = function12;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* synthetic */ void update(androidx.compose.foundation.draganddrop.DragAndDropSourceNode dragAndDropSourceNode) {
        androidx.compose.foundation.draganddrop.DragAndDropSourceNode dragAndDropSourceNode2 = dragAndDropSourceNode;
        dragAndDropSourceNode2.setDrawDragDecoration(this.getHighResolutionOutputSizeshNQ4ISI);
        dragAndDropSourceNode2.setDetectDragStart(this.Camera2StreamConfigurationMap);
        dragAndDropSourceNode2.setTransferData(this.getHighSpeedVideoFpsRanges);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("dragSource");
        inspectorInfo.getProperties().set("drawDragDecoration", this.getHighResolutionOutputSizeshNQ4ISI);
        inspectorInfo.getProperties().set("detectDragStart", this.Camera2StreamConfigurationMap);
        inspectorInfo.getProperties().set("transferData", this.getHighSpeedVideoFpsRanges);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.foundation.draganddrop.DragAndDropSourceElement)) {
            return false;
        }
        androidx.compose.foundation.draganddrop.DragAndDropSourceElement dragAndDropSourceElement = (androidx.compose.foundation.draganddrop.DragAndDropSourceElement) p0;
        return this.getHighResolutionOutputSizeshNQ4ISI == dragAndDropSourceElement.getHighResolutionOutputSizeshNQ4ISI && this.Camera2StreamConfigurationMap == dragAndDropSourceElement.Camera2StreamConfigurationMap && this.getHighSpeedVideoFpsRanges == dragAndDropSourceElement.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return (((this.getHighResolutionOutputSizeshNQ4ISI.hashCode() * 31) + this.Camera2StreamConfigurationMap.hashCode()) * 31) + this.getHighSpeedVideoFpsRanges.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create */
    public final /* synthetic */ androidx.compose.foundation.draganddrop.DragAndDropSourceNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.draganddrop.DragAndDropSourceNode(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges);
    }
}
