package androidx.compose.ui.semantics;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B0\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\b*\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\u00020\u00038\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0005\u001a\u00020\u00038\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0005\u0010\u0011\"\u0004\b\u0014\u0010\u0013R3\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0011R\u0014\u0010\u001d\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0011"}, d2 = {"Landroidx/compose/ui/semantics/CoreSemanticsModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "", "mergeDescendants", "isClearingSemantics", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "Lkotlin/ExtensionFunctionType;", "properties", "<init>", "(ZZLkotlin/jvm/functions/Function1;)V", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "Z", "getMergeDescendants", "()Z", "setMergeDescendants", "(Z)V", "setClearingSemantics", "Lkotlin/jvm/functions/Function1;", "getProperties", "()Lkotlin/jvm/functions/Function1;", "setProperties", "(Lkotlin/jvm/functions/Function1;)V", "getShouldClearDescendantSemantics", "shouldClearDescendantSemantics", "getShouldMergeDescendantSemantics", "shouldMergeDescendantSemantics"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CoreSemanticsModifierNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.SemanticsModifierNode {
    public static final int $stable = 8;
    private boolean isClearingSemantics;
    private boolean mergeDescendants;
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit> properties;

    public CoreSemanticsModifierNode(boolean z, boolean z2, kotlin.jvm.functions.Function1<? super androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit> function1) {
        this.mergeDescendants = z;
        this.isClearingSemantics = z2;
        this.properties = function1;
    }

    public final boolean getMergeDescendants() {
        return this.mergeDescendants;
    }

    public final void setMergeDescendants(boolean z) {
        this.mergeDescendants = z;
    }

    public final boolean isClearingSemantics() {
        return this.isClearingSemantics;
    }

    public final void setClearingSemantics(boolean z) {
        this.isClearingSemantics = z;
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit> getProperties() {
        return this.properties;
    }

    public final void setProperties(kotlin.jvm.functions.Function1<? super androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit> function1) {
        this.properties = function1;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    /* renamed from: getShouldClearDescendantSemantics, reason: from getter */
    public final boolean getIsClearingSemantics() {
        return this.isClearingSemantics;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final boolean getShouldMergeDescendantSemantics() {
        return this.mergeDescendants;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.properties.invoke(semanticsPropertyReceiver);
    }
}
