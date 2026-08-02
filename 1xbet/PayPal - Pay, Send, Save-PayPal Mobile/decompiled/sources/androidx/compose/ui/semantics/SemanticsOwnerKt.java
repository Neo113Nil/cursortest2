package androidx.compose.ui.semantics;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\b\u001a3\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000e\u001a\u00020\u0001*\u00020\u0005H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a5\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0011H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\"\u001e\u0010\u0017\u001a\u00020\u0001*\u00020\u00058AX\u0080\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u000f\"\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsOwner;", "", "mergingEnabled", "skipDeactivatedNodes", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "getAllSemanticsNodes", "(Landroidx/compose/ui/semantics/SemanticsOwner;ZZ)Ljava/util/List;", "(Landroidx/compose/ui/semantics/SemanticsOwner;Z)Ljava/util/List;", "useUnmergedTree", "", "", "getAllSemanticsNodesToMap", "(Landroidx/compose/ui/semantics/SemanticsOwner;ZZ)Ljava/util/Map;", "isImportantForAccessibility", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "customRootNodeId", "Lkotlin/Function1;", "shouldIgnoreNode", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/semantics/SemanticsNodeWithAdjustedBounds;", "getAllUncoveredSemanticsNodesToIntObjectMap", "(Landroidx/compose/ui/semantics/SemanticsOwner;ILkotlin/jvm/functions/Function1;)Landroidx/collection/IntObjectMap;", "isHidden", "isHidden$annotations", "(Landroidx/compose/ui/semantics/SemanticsNode;)V", "Landroidx/compose/ui/geometry/Rect;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/geometry/Rect;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SemanticsOwnerKt {
    private static final androidx.compose.ui.geometry.Rect getHighSpeedVideoFpsRanges = new androidx.compose.ui.geometry.Rect(0.0f, 0.0f, 10.0f, 10.0f);

    public static /* synthetic */ void isHidden$annotations(androidx.compose.ui.semantics.SemanticsNode semanticsNode) {
    }

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
        androidx.compose.ui.semantics.SemanticsNode unmergedRootSemanticsNode = z ? semanticsOwner.getUnmergedRootSemanticsNode() : semanticsOwner.getRootSemanticsNode();
        if (z2 && unmergedRootSemanticsNode.getLayoutNode().getIsDeactivated()) {
            return linkedHashMap;
        }
        getHighSpeedVideoSizes(linkedHashMap, z2, unmergedRootSemanticsNode);
        return linkedHashMap;
    }

    private static final void getHighSpeedVideoSizes(java.util.Map<java.lang.Integer, androidx.compose.ui.semantics.SemanticsNode> map, boolean z, androidx.compose.ui.semantics.SemanticsNode semanticsNode) {
        map.put(java.lang.Integer.valueOf(semanticsNode.getId()), semanticsNode);
        java.util.List children$ui$default = androidx.compose.ui.semantics.SemanticsNode.getChildren$ui$default(semanticsNode, false, false, !z, 3, null);
        int size = children$ui$default.size();
        for (int i = 0; i < size; i++) {
            getHighSpeedVideoSizes(map, z, (androidx.compose.ui.semantics.SemanticsNode) children$ui$default.get(i));
        }
    }

    public static final boolean isImportantForAccessibility(androidx.compose.ui.semantics.SemanticsNode semanticsNode) {
        if (isHidden(semanticsNode)) {
            return false;
        }
        return semanticsNode.getUnmergedConfig().getIsMergingSemanticsOfDescendants() || semanticsNode.getUnmergedConfig().containsImportantForAccessibility$ui();
    }

    public static final boolean isHidden(androidx.compose.ui.semantics.SemanticsNode semanticsNode) {
        return semanticsNode.isTransparent$ui() || semanticsNode.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getHideFromAccessibility()) || semanticsNode.getUnmergedConfig().contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getInvisibleToUser());
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.semantics.SemanticsRegion semanticsRegion, androidx.compose.ui.semantics.SemanticsNode semanticsNode, int i, androidx.collection.MutableIntObjectMap<androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds> mutableIntObjectMap, kotlin.jvm.functions.Function1<? super androidx.compose.ui.semantics.SemanticsNode, java.lang.Boolean> function1, androidx.compose.ui.semantics.SemanticsNode semanticsNode2, androidx.compose.ui.semantics.SemanticsRegion semanticsRegion2) {
        androidx.compose.ui.geometry.Rect rect;
        androidx.compose.ui.layout.LayoutInfo layoutInfo;
        boolean z = (semanticsNode2.getLayoutNode().isPlaced() && semanticsNode2.getLayoutNode().isAttached()) ? false : true;
        if (!semanticsRegion.isEmpty() || semanticsNode2.getId() == semanticsNode.getId()) {
            if (!z || semanticsNode2.getIsFake()) {
                androidx.compose.ui.unit.IntRect roundToIntRect = androidx.compose.ui.unit.IntRectKt.roundToIntRect(semanticsNode2.getTouchBoundsInRoot());
                semanticsRegion2.set(roundToIntRect);
                int id = semanticsNode2.getId() == semanticsNode.getId() ? i : semanticsNode2.getId();
                if (semanticsRegion2.intersect(semanticsRegion)) {
                    mutableIntObjectMap.set(id, new androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds(semanticsNode2, semanticsRegion2.getBounds()));
                    java.util.List<androidx.compose.ui.semantics.SemanticsNode> replacedChildren$ui = semanticsNode2.getReplacedChildren$ui();
                    for (int size = replacedChildren$ui.size() - 1; size >= 0; size--) {
                        if (!function1.invoke(replacedChildren$ui.get(size)).booleanValue()) {
                            getHighResolutionOutputSizeshNQ4ISI(semanticsRegion, semanticsNode, i, mutableIntObjectMap, function1, replacedChildren$ui.get(size), semanticsRegion2);
                        }
                    }
                    if (isImportantForAccessibility(semanticsNode2)) {
                        semanticsRegion.difference(roundToIntRect);
                        return;
                    }
                    return;
                }
                if (!semanticsNode2.getIsFake()) {
                    if (id == i) {
                        mutableIntObjectMap.set(id, new androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds(semanticsNode2, semanticsRegion2.getBounds()));
                        return;
                    }
                    return;
                }
                androidx.compose.ui.semantics.SemanticsNode parent = semanticsNode2.getParent();
                if (parent != null && (layoutInfo = parent.getLayoutInfo()) != null && layoutInfo.isPlaced()) {
                    rect = parent.getBoundsInRoot();
                } else {
                    rect = getHighSpeedVideoFpsRanges;
                }
                mutableIntObjectMap.set(id, new androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds(semanticsNode2, androidx.compose.ui.unit.IntRectKt.roundToIntRect(rect)));
            }
        }
    }

    public static final androidx.collection.IntObjectMap<androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds> getAllUncoveredSemanticsNodesToIntObjectMap(androidx.compose.ui.semantics.SemanticsOwner semanticsOwner, int i, kotlin.jvm.functions.Function1<? super androidx.compose.ui.semantics.SemanticsNode, java.lang.Boolean> function1) {
        android.os.Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            androidx.compose.ui.semantics.SemanticsNode unmergedRootSemanticsNode = semanticsOwner.getUnmergedRootSemanticsNode();
            if (unmergedRootSemanticsNode.getLayoutNode().isPlaced() && unmergedRootSemanticsNode.getLayoutNode().isAttached()) {
                androidx.collection.MutableIntObjectMap mutableIntObjectMap = new androidx.collection.MutableIntObjectMap(48);
                androidx.compose.ui.semantics.SemanticsRegion SemanticsRegion = androidx.compose.ui.semantics.SemanticsRegion_androidKt.SemanticsRegion();
                SemanticsRegion.set(androidx.compose.ui.unit.IntRectKt.roundToIntRect(unmergedRootSemanticsNode.getBoundsInRoot()));
                getHighResolutionOutputSizeshNQ4ISI(SemanticsRegion, unmergedRootSemanticsNode, i, mutableIntObjectMap, function1, unmergedRootSemanticsNode, androidx.compose.ui.semantics.SemanticsRegion_androidKt.SemanticsRegion());
                return mutableIntObjectMap;
            }
            return androidx.collection.IntObjectMapKt.emptyIntObjectMap();
        } finally {
            android.os.Trace.endSection();
        }
    }
}
