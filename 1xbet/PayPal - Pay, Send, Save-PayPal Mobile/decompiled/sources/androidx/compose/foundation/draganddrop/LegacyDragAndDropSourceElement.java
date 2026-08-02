package androidx.compose.foundation.draganddrop;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u0012'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u0005*\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0007\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00068\u0006¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R2\u0010\u001c\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\u00068\u0006¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/compose/foundation/draganddrop/LegacyDragAndDropSourceElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/draganddrop/LegacyDragAndDropSourceNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "p0", "Lkotlin/Function2;", "Landroidx/compose/foundation/draganddrop/DragAndDropSourceScope;", "Lkotlin/coroutines/Continuation;", "", "p1", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function2;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class LegacyDragAndDropSourceElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.draganddrop.LegacyDragAndDropSourceNode> {
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<androidx.compose.foundation.draganddrop.DragAndDropSourceScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public LegacyDragAndDropSourceElement(kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.draganddrop.DragAndDropSourceScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        this.Camera2StreamConfigurationMap = function1;
        this.getHighSpeedVideoFpsRangesFor = function2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* synthetic */ void update(androidx.compose.foundation.draganddrop.LegacyDragAndDropSourceNode legacyDragAndDropSourceNode) {
        androidx.compose.foundation.draganddrop.LegacyDragAndDropSourceNode legacyDragAndDropSourceNode2 = legacyDragAndDropSourceNode;
        legacyDragAndDropSourceNode2.setDrawDragDecoration(this.Camera2StreamConfigurationMap);
        legacyDragAndDropSourceNode2.setDragAndDropSourceHandler(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("dragSource");
        inspectorInfo.getProperties().set("drawDragDecoration", this.Camera2StreamConfigurationMap);
        inspectorInfo.getProperties().set("dragAndDropSourceHandler", this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.foundation.draganddrop.LegacyDragAndDropSourceElement)) {
            return false;
        }
        androidx.compose.foundation.draganddrop.LegacyDragAndDropSourceElement legacyDragAndDropSourceElement = (androidx.compose.foundation.draganddrop.LegacyDragAndDropSourceElement) p0;
        return this.Camera2StreamConfigurationMap == legacyDragAndDropSourceElement.Camera2StreamConfigurationMap && this.getHighSpeedVideoFpsRangesFor == legacyDragAndDropSourceElement.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return (this.Camera2StreamConfigurationMap.hashCode() * 31) + this.getHighSpeedVideoFpsRangesFor.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create */
    public final /* synthetic */ androidx.compose.foundation.draganddrop.LegacyDragAndDropSourceNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.draganddrop.LegacyDragAndDropSourceNode(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor);
    }
}
