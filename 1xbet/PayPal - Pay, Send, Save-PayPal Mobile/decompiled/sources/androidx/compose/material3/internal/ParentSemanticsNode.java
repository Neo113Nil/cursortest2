package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B \u0012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0006*\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\r\u001a\u00020\u0006*\u00020\u0005¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fR3\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00078\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\nR\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00148WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u001b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Landroidx/compose/material3/internal/ParentSemanticsNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "Lkotlin/ExtensionFunctionType;", "properties", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "obtainSemantics", "releaseSemantics", "()V", "Lkotlin/jvm/functions/Function1;", "getProperties", "()Lkotlin/jvm/functions/Function1;", "setProperties", "", "Camera2StreamConfigurationMap", "Z", "getHighSpeedVideoSizes", "getShouldMergeDescendantSemantics", "()Z", "shouldMergeDescendantSemantics", "", "traverseKey", "Ljava/lang/Object;", "getTraverseKey", "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ParentSemanticsNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.TraversableNode, androidx.compose.ui.node.SemanticsModifierNode {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes;
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit> properties;
    private final java.lang.Object traverseKey = androidx.compose.material3.internal.ParentSemanticsNodeKey.INSTANCE;

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit> getProperties() {
        return this.properties;
    }

    public final void setProperties(kotlin.jvm.functions.Function1<? super androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit> function1) {
        this.properties = function1;
    }

    public ParentSemanticsNode(kotlin.jvm.functions.Function1<? super androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit> function1) {
        this.properties = function1;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public final java.lang.Object getTraverseKey() {
        return this.traverseKey;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (this.getHighSpeedVideoSizes) {
            return;
        }
        this.properties.invoke(semanticsPropertyReceiver);
    }

    public final void obtainSemantics(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.getHighSpeedVideoSizes = true;
        this.properties.invoke(semanticsPropertyReceiver);
        androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(this);
    }

    public final void releaseSemantics() {
        this.getHighSpeedVideoSizes = false;
        androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(this);
    }
}
