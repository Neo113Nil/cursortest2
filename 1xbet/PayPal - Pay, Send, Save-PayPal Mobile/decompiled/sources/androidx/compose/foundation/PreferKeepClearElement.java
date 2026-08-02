package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/compose/foundation/PreferKeepClearElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/PreferKeepClearNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/geometry/Rect;", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class PreferKeepClearElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.PreferKeepClearNode> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.geometry.Rect> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public PreferKeepClearElement(kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.geometry.Rect> function1) {
        this.getHighSpeedVideoSizes = function1;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* synthetic */ void update(androidx.compose.foundation.PreferKeepClearNode preferKeepClearNode) {
        preferKeepClearNode.setRect(this.getHighSpeedVideoSizes);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        kotlin.jvm.functions.Function1<androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.geometry.Rect> function1 = this.getHighSpeedVideoSizes;
        if (function1 != null) {
            return function1.hashCode();
        }
        return 0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        return (p0 instanceof androidx.compose.foundation.PreferKeepClearNode) && this.getHighSpeedVideoSizes == ((androidx.compose.foundation.PreferKeepClearNode) p0).getRect();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("preferKeepClearBounds");
        if (this.getHighSpeedVideoSizes != null) {
            inspectorInfo.getProperties().set("clearRect", this.getHighSpeedVideoSizes);
        }
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* synthetic */ androidx.compose.foundation.PreferKeepClearNode create() {
        return new androidx.compose.foundation.PreferKeepClearNode(this.getHighSpeedVideoSizes);
    }
}
