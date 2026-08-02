package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0006\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\u000b*\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/compose/foundation/ExcludeFromSystemGestureElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/ExcludeFromSystemGestureNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/geometry/Rect;", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "getHighSpeedVideoFpsRanges", "()Landroidx/compose/foundation/ExcludeFromSystemGestureNode;", "", "getHighSpeedVideoSizes", "(Landroidx/compose/foundation/ExcludeFromSystemGestureNode;)V", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ExcludeFromSystemGestureElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.ExcludeFromSystemGestureNode> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.geometry.Rect> getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public ExcludeFromSystemGestureElement(kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.geometry.Rect> function1) {
        this.getHighSpeedVideoFpsRanges = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.ExcludeFromSystemGestureNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.ExcludeFromSystemGestureNode(this.getHighSpeedVideoFpsRanges);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public void update(androidx.compose.foundation.ExcludeFromSystemGestureNode p0) {
        p0.setRect(this.getHighSpeedVideoFpsRanges);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        kotlin.jvm.functions.Function1<androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.geometry.Rect> function1 = this.getHighSpeedVideoFpsRanges;
        if (function1 != null) {
            return function1.hashCode();
        }
        return 0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        return (p0 instanceof androidx.compose.foundation.ExcludeFromSystemGestureElement) && this.getHighSpeedVideoFpsRanges == ((androidx.compose.foundation.ExcludeFromSystemGestureElement) p0).getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("systemGestureExclusion");
        if (this.getHighSpeedVideoFpsRanges != null) {
            inspectorInfo.getProperties().set("exclusion", this.getHighSpeedVideoFpsRanges);
        }
    }
}
