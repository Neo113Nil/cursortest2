package androidx.compose.ui.focus;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\u0005*\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/compose/ui/focus/FocusEventElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/focus/FocusEventNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusState;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FocusEventElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.ui.focus.FocusEventNode> {
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusState, kotlin.Unit> getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusEventElement(kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusState, kotlin.Unit> function1) {
        this.getHighSpeedVideoFpsRanges = function1;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* bridge */ /* synthetic */ void update(androidx.compose.ui.focus.FocusEventNode focusEventNode) {
        focusEventNode.getHighSpeedVideoSizes = this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onFocusEvent");
        inspectorInfo.getProperties().set("onFocusEvent", this.getHighSpeedVideoFpsRanges);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof androidx.compose.ui.focus.FocusEventElement) && this.getHighSpeedVideoFpsRanges == ((androidx.compose.ui.focus.FocusEventElement) p0).getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.getHighSpeedVideoFpsRanges.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* synthetic */ androidx.compose.ui.focus.FocusEventNode create() {
        return new androidx.compose.ui.focus.FocusEventNode(this.getHighSpeedVideoFpsRanges);
    }
}
