package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0006\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0005*\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001f\u0010\u0018\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\u0006\n\u0004\b\t\u0010\u0017"}, d2 = {"Landroidx/compose/foundation/FocusedBoundsObserverElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/FocusedBoundsObserverNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "getHighSpeedVideoSizes", "()Landroidx/compose/foundation/FocusedBoundsObserverNode;", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/foundation/FocusedBoundsObserverNode;)V", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "Lkotlin/jvm/functions/Function1;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FocusedBoundsObserverElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.FocusedBoundsObserverNode> {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusedBoundsObserverElement(kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit> function1) {
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public androidx.compose.foundation.FocusedBoundsObserverNode create() {
        return new androidx.compose.foundation.FocusedBoundsObserverNode(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    public void update(androidx.compose.foundation.FocusedBoundsObserverNode p0) {
        p0.setOnPositioned(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        androidx.compose.foundation.FocusedBoundsObserverElement focusedBoundsObserverElement = p0 instanceof androidx.compose.foundation.FocusedBoundsObserverElement ? (androidx.compose.foundation.FocusedBoundsObserverElement) p0 : null;
        return focusedBoundsObserverElement != null && this.getHighResolutionOutputSizeshNQ4ISI == focusedBoundsObserverElement.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onFocusedBoundsChanged");
        inspectorInfo.getProperties().set("onPositioned", this.getHighResolutionOutputSizeshNQ4ISI);
    }
}
