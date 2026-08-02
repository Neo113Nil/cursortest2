package androidx.compose.foundation.text.contextmenu.modifier;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Be\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u001e\u0010\t\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0005\u0012\u001e\u0010\n\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0005\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0007*\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0004\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR,\u0010\u001c\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR,\u0010\u0019\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\"\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerNode;", "Landroidx/compose/foundation/text/contextmenu/modifier/ToolbarRequester;", "p0", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "p1", "p2", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/geometry/Rect;", "p3", "<init>", "(Landroidx/compose/foundation/text/contextmenu/modifier/ToolbarRequester;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoFpsRanges", "Landroidx/compose/foundation/text/contextmenu/modifier/ToolbarRequester;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function1;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TextContextMenuToolbarHandlerElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequester Camera2StreamConfigurationMap;
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.geometry.Rect> getHighSpeedVideoFpsRangesFor;
    private final kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoSizes;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextContextMenuToolbarHandlerElement(androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequester toolbarRequester, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function1, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function12, kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.geometry.Rect> function13) {
        this.Camera2StreamConfigurationMap = toolbarRequester;
        this.getHighSpeedVideoSizes = function1;
        this.getHighSpeedVideoFpsRanges = function12;
        this.getHighSpeedVideoFpsRangesFor = function13;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* synthetic */ void update(androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode textContextMenuToolbarHandlerNode) {
        androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode textContextMenuToolbarHandlerNode2 = textContextMenuToolbarHandlerNode;
        textContextMenuToolbarHandlerNode2.update(this.Camera2StreamConfigurationMap);
        textContextMenuToolbarHandlerNode2.setOnShow(this.getHighSpeedVideoSizes);
        textContextMenuToolbarHandlerNode2.setOnHide(this.getHighSpeedVideoFpsRanges);
        textContextMenuToolbarHandlerNode2.setComputeContentBounds(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerElement)) {
            return false;
        }
        androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerElement textContextMenuToolbarHandlerElement = (androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerElement) p0;
        return this.Camera2StreamConfigurationMap == textContextMenuToolbarHandlerElement.Camera2StreamConfigurationMap && this.getHighSpeedVideoSizes == textContextMenuToolbarHandlerElement.getHighSpeedVideoSizes && this.getHighSpeedVideoFpsRanges == textContextMenuToolbarHandlerElement.getHighSpeedVideoFpsRanges && this.getHighSpeedVideoFpsRangesFor == textContextMenuToolbarHandlerElement.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int hashCode = this.Camera2StreamConfigurationMap.hashCode();
        kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function1 = this.getHighSpeedVideoSizes;
        int hashCode2 = function1 != null ? function1.hashCode() : 0;
        kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function12 = this.getHighSpeedVideoFpsRanges;
        return (((((hashCode * 31) + hashCode2) * 31) + (function12 != null ? function12.hashCode() : 0)) * 31) + this.getHighSpeedVideoFpsRangesFor.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create */
    public final /* synthetic */ androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor);
    }
}
