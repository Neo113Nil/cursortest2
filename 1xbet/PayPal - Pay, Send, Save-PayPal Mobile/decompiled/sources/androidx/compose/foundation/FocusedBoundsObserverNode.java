package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0015B\u001d\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bR0\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00108\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/compose/foundation/FocusedBoundsObserverNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/TraversableNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "", "onPositioned", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "focusedBounds", "onFocusBoundsChanged", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Lkotlin/jvm/functions/Function1;", "getOnPositioned", "()Lkotlin/jvm/functions/Function1;", "setOnPositioned", "", "traverseKey", "Ljava/lang/Object;", "getTraverseKey", "()Ljava/lang/Object;", "TraverseKey"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FocusedBoundsObserverNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.TraversableNode {
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit> onPositioned;
    private final java.lang.Object traverseKey = INSTANCE;

    /* renamed from: TraverseKey, reason: from kotlin metadata */
    public static final androidx.compose.foundation.FocusedBoundsObserverNode.Companion INSTANCE = new androidx.compose.foundation.FocusedBoundsObserverNode.Companion(null);
    public static final int $stable = 8;

    public FocusedBoundsObserverNode(kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit> function1) {
        this.onPositioned = function1;
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit> getOnPositioned() {
        return this.onPositioned;
    }

    public final void setOnPositioned(kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit> function1) {
        this.onPositioned = function1;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public final java.lang.Object getTraverseKey() {
        return this.traverseKey;
    }

    public final void onFocusBoundsChanged(androidx.compose.ui.layout.LayoutCoordinates focusedBounds) {
        androidx.compose.foundation.FocusedBoundsObserverNode focusedBoundsObserverNode = this;
        do {
            focusedBoundsObserverNode.onPositioned.invoke(focusedBounds);
            focusedBoundsObserverNode = (androidx.compose.foundation.FocusedBoundsObserverNode) androidx.compose.ui.node.TraversableNodeKt.findNearestAncestor(focusedBoundsObserverNode);
        } while (focusedBoundsObserverNode != null);
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/FocusedBoundsObserverNode$TraverseKey;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.FocusedBoundsObserverNode$TraverseKey, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
