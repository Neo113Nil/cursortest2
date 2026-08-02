package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/compose/ui/platform/SemanticsNodeCopy;", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "semanticsNode", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/semantics/SemanticsNodeWithAdjustedBounds;", "currentSemanticsNodes", "<init>", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/collection/IntObjectMap;)V", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "unmergedConfig", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getUnmergedConfig", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "Landroidx/collection/MutableIntSet;", "children", "Landroidx/collection/MutableIntSet;", "getChildren", "()Landroidx/collection/MutableIntSet;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SemanticsNodeCopy {
    public static final int $stable = 8;
    private final androidx.collection.MutableIntSet children;
    private final androidx.compose.ui.semantics.SemanticsConfiguration unmergedConfig;

    public SemanticsNodeCopy(androidx.compose.ui.semantics.SemanticsNode semanticsNode, androidx.collection.IntObjectMap<androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds> intObjectMap) {
        this.unmergedConfig = semanticsNode.getUnmergedConfig();
        this.children = new androidx.collection.MutableIntSet(semanticsNode.getReplacedChildren$ui().size());
        java.util.List<androidx.compose.ui.semantics.SemanticsNode> replacedChildren$ui = semanticsNode.getReplacedChildren$ui();
        int size = replacedChildren$ui.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.semantics.SemanticsNode semanticsNode2 = replacedChildren$ui.get(i);
            if (intObjectMap.containsKey(semanticsNode2.getId())) {
                this.children.add(semanticsNode2.getId());
            }
        }
    }

    public final androidx.compose.ui.semantics.SemanticsConfiguration getUnmergedConfig() {
        return this.unmergedConfig;
    }

    public final androidx.collection.MutableIntSet getChildren() {
        return this.children;
    }
}
