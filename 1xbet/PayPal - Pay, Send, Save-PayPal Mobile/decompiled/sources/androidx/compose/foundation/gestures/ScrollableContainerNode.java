package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\b\u0000\u0018\u0000 \u00122\u00020\u00012\u00020\u0002:\u0001\u0012B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u0006R\u001a\u0010\n\u001a\u00020\t8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00038\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableContainerNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/TraversableNode;", "", "enabled", "<init>", "(Z)V", "", "update", "", "traverseKey", "Ljava/lang/Object;", "getTraverseKey", "()Ljava/lang/Object;", "p0", "Z", "getEnabled", "()Z", "TraverseKey"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScrollableContainerNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.TraversableNode {
    private boolean enabled;
    private final java.lang.Object traverseKey = INSTANCE;

    /* renamed from: TraverseKey, reason: from kotlin metadata */
    public static final androidx.compose.foundation.gestures.ScrollableContainerNode.Companion INSTANCE = new androidx.compose.foundation.gestures.ScrollableContainerNode.Companion(null);
    public static final int $stable = 8;

    public ScrollableContainerNode(boolean z) {
        this.enabled = z;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public final java.lang.Object getTraverseKey() {
        return this.traverseKey;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableContainerNode$TraverseKey;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.ScrollableContainerNode$TraverseKey, reason: from kotlin metadata */
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void update(boolean enabled) {
        this.enabled = enabled;
    }
}
