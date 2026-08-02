package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u000bJ\u0013\u0010\r\u001a\u00020\u0005*\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/compose/ui/layout/OnPlacedElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/layout/OnPlacedNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Camera2StreamConfigurationMap", "()Landroidx/compose/ui/layout/OnPlacedNode;", "(Landroidx/compose/ui/layout/OnPlacedNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OnPlacedElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.ui.layout.OnPlacedNode> {
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public OnPlacedElement(kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit> function1) {
        this.getHighSpeedVideoSizes = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public androidx.compose.ui.layout.OnPlacedNode create() {
        return new androidx.compose.ui.layout.OnPlacedNode(this.getHighSpeedVideoSizes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public void update(androidx.compose.ui.layout.OnPlacedNode p0) {
        p0.setCallback(this.getHighSpeedVideoSizes);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onPlaced");
        inspectorInfo.getProperties().set("onPlaced", this.getHighSpeedVideoSizes);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof androidx.compose.ui.layout.OnPlacedElement) && this.getHighSpeedVideoSizes == ((androidx.compose.ui.layout.OnPlacedElement) p0).getHighSpeedVideoSizes;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.getHighSpeedVideoSizes.hashCode();
    }
}
