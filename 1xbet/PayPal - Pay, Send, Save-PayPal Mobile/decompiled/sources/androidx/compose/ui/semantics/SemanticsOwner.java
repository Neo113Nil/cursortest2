package androidx.compose.ui.semantics;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0080\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001f\u001a\u00020\u001c8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010!\u001a\u00020\u001c8G¢\u0006\u0006\u001a\u0004\b \u0010\u001eR \u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\f8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsOwner;", "", "Landroidx/compose/ui/node/LayoutNode;", "rootNode", "Landroidx/compose/ui/semantics/EmptySemanticsModifier;", "outerSemanticsNode", "Landroidx/collection/IntObjectMap;", "nodes", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/semantics/EmptySemanticsModifier;Landroidx/collection/IntObjectMap;)V", "", "semanticsId", "Landroidx/compose/ui/semantics/SemanticsInfo;", "get$ui", "(I)Landroidx/compose/ui/semantics/SemanticsInfo;", "semanticsInfo", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "previousSemanticsConfiguration", "", "notifySemanticsChange$ui", "(Landroidx/compose/ui/semantics/SemanticsInfo;Landroidx/compose/ui/semantics/SemanticsConfiguration;)V", "getHighSpeedVideoSizes", "Landroidx/compose/ui/node/LayoutNode;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/semantics/EmptySemanticsModifier;", "getHighSpeedVideoFpsRangesFor", "Landroidx/collection/IntObjectMap;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/semantics/SemanticsNode;", "getRootSemanticsNode", "()Landroidx/compose/ui/semantics/SemanticsNode;", "rootSemanticsNode", "getUnmergedRootSemanticsNode", "unmergedRootSemanticsNode", "Landroidx/collection/MutableObjectList;", "Landroidx/compose/ui/semantics/SemanticsListener;", "listeners", "Landroidx/collection/MutableObjectList;", "getListeners$ui", "()Landroidx/collection/MutableObjectList;", "getRootInfo$ui", "()Landroidx/compose/ui/semantics/SemanticsInfo;", "rootInfo"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SemanticsOwner {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.ui.semantics.EmptySemanticsModifier getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.collection.IntObjectMap<androidx.compose.ui.node.LayoutNode> getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.compose.ui.node.LayoutNode getHighSpeedVideoSizes;
    private final androidx.collection.MutableObjectList<androidx.compose.ui.semantics.SemanticsListener> listeners = new androidx.collection.MutableObjectList<>(2);

    public SemanticsOwner(androidx.compose.ui.node.LayoutNode layoutNode, androidx.compose.ui.semantics.EmptySemanticsModifier emptySemanticsModifier, androidx.collection.IntObjectMap<androidx.compose.ui.node.LayoutNode> intObjectMap) {
        this.getHighSpeedVideoSizes = layoutNode;
        this.getHighSpeedVideoFpsRangesFor = emptySemanticsModifier;
        this.getHighResolutionOutputSizeshNQ4ISI = intObjectMap;
    }

    public final androidx.compose.ui.semantics.SemanticsNode getRootSemanticsNode() {
        return androidx.compose.ui.semantics.SemanticsNodeKt.SemanticsNode(this.getHighSpeedVideoSizes, true);
    }

    public final androidx.compose.ui.semantics.SemanticsNode getUnmergedRootSemanticsNode() {
        return new androidx.compose.ui.semantics.SemanticsNode(this.getHighSpeedVideoFpsRangesFor, false, this.getHighSpeedVideoSizes, new androidx.compose.ui.semantics.SemanticsConfiguration());
    }

    public final androidx.collection.MutableObjectList<androidx.compose.ui.semantics.SemanticsListener> getListeners$ui() {
        return this.listeners;
    }

    public final androidx.compose.ui.semantics.SemanticsInfo getRootInfo$ui() {
        return this.getHighSpeedVideoSizes;
    }

    public final androidx.compose.ui.semantics.SemanticsInfo get$ui(int semanticsId) {
        return this.getHighResolutionOutputSizeshNQ4ISI.get(semanticsId);
    }

    public final void notifySemanticsChange$ui(androidx.compose.ui.semantics.SemanticsInfo semanticsInfo, androidx.compose.ui.semantics.SemanticsConfiguration previousSemanticsConfiguration) {
        androidx.collection.MutableObjectList<androidx.compose.ui.semantics.SemanticsListener> mutableObjectList = this.listeners;
        java.lang.Object[] objArr = mutableObjectList.content;
        int i = mutableObjectList._size;
        for (int i2 = 0; i2 < i; i2++) {
            ((androidx.compose.ui.semantics.SemanticsListener) objArr[i2]).onSemanticsChanged(semanticsInfo, previousSemanticsConfiguration);
        }
    }
}
