package androidx.compose.ui.tooling.data;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/compose/ui/tooling/data/NodeGroup;", "Landroidx/compose/ui/tooling/data/Group;", "", "key", "node", "Landroidx/compose/ui/unit/IntRect;", "box", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Landroidx/compose/ui/layout/ModifierInfo;", "modifierInfo", "children", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/ui/unit/IntRect;Ljava/util/Collection;Ljava/util/List;Ljava/util/Collection;)V", "Ljava/lang/Object;", "getNode", "()Ljava/lang/Object;", "Ljava/util/List;", "getModifierInfo", "()Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NodeGroup extends androidx.compose.ui.tooling.data.Group {
    public static final int $stable = 8;
    private final java.util.List<androidx.compose.ui.layout.ModifierInfo> modifierInfo;
    private final java.lang.Object node;

    public NodeGroup(java.lang.Object obj, java.lang.Object obj2, androidx.compose.ui.unit.IntRect intRect, java.util.Collection<? extends java.lang.Object> collection, java.util.List<androidx.compose.ui.layout.ModifierInfo> list, java.util.Collection<? extends androidx.compose.ui.tooling.data.Group> collection2) {
        super(obj, null, null, null, intRect, collection, collection2, false, null);
        this.node = obj2;
        this.modifierInfo = list;
    }

    public final java.lang.Object getNode() {
        return this.node;
    }

    @Override // androidx.compose.ui.tooling.data.Group
    public final java.util.List<androidx.compose.ui.layout.ModifierInfo> getModifierInfo() {
        return this.modifierInfo;
    }
}
