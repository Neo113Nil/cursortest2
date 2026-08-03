package androidx.compose.ui.semantics;

/* compiled from: SemanticsOwner.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u001a,\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\b*\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000¨\u0006\u000b"}, d2 = {"getAllSemanticsNodes", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "Landroidx/compose/ui/semantics/SemanticsOwner;", "mergingEnabled", "", "skipDeactivatedNodes", "getAllSemanticsNodesToMap", "", "", "useUnmergedTree", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SemanticsOwnerKt {
    public static /* synthetic */ java.util.List getAllSemanticsNodes$default(androidx.compose.ui.semantics.SemanticsOwner semanticsOwner, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        return getAllSemanticsNodes(semanticsOwner, z, z2);
    }

    public static final java.util.List<androidx.compose.ui.semantics.SemanticsNode> getAllSemanticsNodes(androidx.compose.ui.semantics.SemanticsOwner semanticsOwner, boolean z, boolean z2) {
        return kotlin.collections.CollectionsKt.toList(getAllSemanticsNodesToMap(semanticsOwner, !z, z2).values());
    }

    public static /* synthetic */ java.util.Map getAllSemanticsNodesToMap$default(androidx.compose.ui.semantics.SemanticsOwner semanticsOwner, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return getAllSemanticsNodesToMap(semanticsOwner, z, z2);
    }

    public static final java.util.Map<java.lang.Integer, androidx.compose.ui.semantics.SemanticsNode> getAllSemanticsNodesToMap(androidx.compose.ui.semantics.SemanticsOwner semanticsOwner, boolean z, boolean z2) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        getAllSemanticsNodesToMap$findAllSemanticNodesRecursive(z2, linkedHashMap, z ? semanticsOwner.getUnmergedRootSemanticsNode() : semanticsOwner.getRootSemanticsNode());
        return linkedHashMap;
    }

    private static final void getAllSemanticsNodesToMap$findAllSemanticNodesRecursive(boolean z, java.util.Map<java.lang.Integer, androidx.compose.ui.semantics.SemanticsNode> map, androidx.compose.ui.semantics.SemanticsNode semanticsNode) {
        if (z && semanticsNode.getLayoutInfo().getIsDeactivated()) {
            return;
        }
        map.put(java.lang.Integer.valueOf(semanticsNode.getId()), semanticsNode);
        java.util.List<androidx.compose.ui.semantics.SemanticsNode> children = semanticsNode.getChildren();
        int size = children.size();
        for (int i = 0; i < size; i++) {
            getAllSemanticsNodesToMap$findAllSemanticNodesRecursive(z, map, children.get(i));
        }
    }
}
