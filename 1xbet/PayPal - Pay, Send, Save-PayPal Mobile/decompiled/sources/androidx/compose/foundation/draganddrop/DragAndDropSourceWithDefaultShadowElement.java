package androidx.compose.foundation.draganddrop;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BL\u0012-\u0010\n\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003j\u0004\b\u0001`\b¢\u0006\u0002\b\t\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u0006*\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R=\u0010\u001c\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003j\u0004\b\u0001`\b¢\u0006\u0002\b\t8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;", "Lkotlin/Function2;", "Landroidx/compose/foundation/draganddrop/DragAndDropStartDetectorScope;", "Lkotlin/coroutines/Continuation;", "", "", "Landroidx/compose/foundation/draganddrop/DragAndDropStartDetector;", "Lkotlin/ExtensionFunctionType;", "p0", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "p1", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function2;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DragAndDropSourceWithDefaultShadowElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.draganddrop.DragSourceNodeWithDefaultPainter> {
    public kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, androidx.compose.ui.draganddrop.DragAndDropTransferData> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    public kotlin.jvm.functions.Function2<? super androidx.compose.foundation.draganddrop.DragAndDropStartDetectorScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> Camera2StreamConfigurationMap;

    public DragAndDropSourceWithDefaultShadowElement(kotlin.jvm.functions.Function2<? super androidx.compose.foundation.draganddrop.DragAndDropStartDetectorScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, androidx.compose.ui.draganddrop.DragAndDropTransferData> function1) {
        this.Camera2StreamConfigurationMap = function2;
        this.getHighSpeedVideoFpsRangesFor = function1;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* synthetic */ void update(androidx.compose.foundation.draganddrop.DragSourceNodeWithDefaultPainter dragSourceNodeWithDefaultPainter) {
        androidx.compose.foundation.draganddrop.DragSourceNodeWithDefaultPainter dragSourceNodeWithDefaultPainter2 = dragSourceNodeWithDefaultPainter;
        dragSourceNodeWithDefaultPainter2.getHighSpeedVideoSizes.setDetectDragStart(this.Camera2StreamConfigurationMap);
        dragSourceNodeWithDefaultPainter2.getHighSpeedVideoSizes.setTransferData(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("dragSourceWithDefaultPainter");
        inspectorInfo.getProperties().set("detectDragStart", this.Camera2StreamConfigurationMap);
        inspectorInfo.getProperties().set("transferData", this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.foundation.draganddrop.DragAndDropSourceWithDefaultShadowElement)) {
            return false;
        }
        androidx.compose.foundation.draganddrop.DragAndDropSourceWithDefaultShadowElement dragAndDropSourceWithDefaultShadowElement = (androidx.compose.foundation.draganddrop.DragAndDropSourceWithDefaultShadowElement) p0;
        return this.Camera2StreamConfigurationMap == dragAndDropSourceWithDefaultShadowElement.Camera2StreamConfigurationMap && this.getHighSpeedVideoFpsRangesFor == dragAndDropSourceWithDefaultShadowElement.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return (this.Camera2StreamConfigurationMap.hashCode() * 31) + this.getHighSpeedVideoFpsRangesFor.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create */
    public final /* synthetic */ androidx.compose.foundation.draganddrop.DragSourceNodeWithDefaultPainter getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.draganddrop.DragSourceNodeWithDefaultPainter(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor);
    }
}
