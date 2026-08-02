package androidx.compose.foundation.text.contextmenu.modifier;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B2\u0012)\u0010\t\u001a%\b\u0001\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\u0007*\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R7\u0010\u0015\u001a%\b\u0001\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuGestureElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuGestureNode;", "Lkotlin/Function2;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function2;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TextContextMenuGestureElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode> {
    private final kotlin.jvm.functions.Function2<androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public TextContextMenuGestureElement(kotlin.jvm.functions.Function2<? super androidx.compose.ui.geometry.Offset, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        this.getHighSpeedVideoFpsRanges = function2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* bridge */ /* synthetic */ void update(androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode textContextMenuGestureNode) {
        textContextMenuGestureNode.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("TextContextMenuGestures");
        inspectorInfo.getProperties().set("onPreShowContextMenu", this.getHighSpeedVideoFpsRanges);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureElement) && this.getHighSpeedVideoFpsRanges == ((androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureElement) p0).getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        kotlin.jvm.functions.Function2<androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2 = this.getHighSpeedVideoFpsRanges;
        if (function2 != null) {
            return function2.hashCode();
        }
        return 0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* synthetic */ androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode create() {
        return new androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode(this.getHighSpeedVideoFpsRanges);
    }
}
