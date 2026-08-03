package androidx.compose.ui.semantics;

/* compiled from: SemanticsNode.kt */
@kotlin.Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\r\u0010H\u001a\u00020\u0000H\u0000¢\u0006\u0002\bIJ\u0016\u0010J\u001a\u00020K2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00000MH\u0002J3\u0010N\u001a\u00020\u00002\b\u0010O\u001a\u0004\u0018\u00010P2\u0017\u0010Q\u001a\u0013\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020K0R¢\u0006\u0002\bTH\u0002ø\u0001\u0000¢\u0006\u0002\bUJ\u000f\u0010V\u001a\u0004\u0018\u00010WH\u0000¢\u0006\u0002\bXJ\u001e\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00000\u00142\u000e\b\u0002\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00000MH\u0002J\u000e\u0010[\u001a\u00020\u001c2\u0006\u0010\\\u001a\u00020]J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00000\u00142\u0006\u0010^\u001a\u00020\u00052\u0006\u0010_\u001a\u00020\u0005H\u0002J\u0010\u0010`\u001a\u00020K2\u0006\u0010a\u001a\u00020\tH\u0002J\u001d\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00000\u00142\b\b\u0002\u0010_\u001a\u00020\u0005H\u0000¢\u0006\u0002\bbJ\u001a\u0010c\u001a\u00020K*\u00020\u00072\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00000MH\u0002R\u0014\u0010\u000b\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010!R\u0011\u0010%\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b%\u0010!R\u0014\u0010&\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b'\u0010!R\u0014\u0010(\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b)\u0010!R\u0011\u0010*\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u00103\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0017\u00106\u001a\u0002078Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b8\u00109R\u0017\u0010:\u001a\u0002078Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b;\u00109R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00000\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\u0016R\u0013\u0010>\u001a\u0004\u0018\u00010?8F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0017\u0010B\u001a\u00020C8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bD\u00109R\u0011\u0010E\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bF\u0010\u000eR\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006d"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsNode;", "", "outerSemanticsNode", "Landroidx/compose/ui/Modifier$Node;", "mergingEnabled", "", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "unmergedConfig", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "(Landroidx/compose/ui/Modifier$Node;ZLandroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/semantics/SemanticsConfiguration;)V", "boundsInParent", "Landroidx/compose/ui/geometry/Rect;", "getBoundsInParent$ui_release", "()Landroidx/compose/ui/geometry/Rect;", "boundsInRoot", "getBoundsInRoot", "boundsInWindow", "getBoundsInWindow", com.helpshift.proactive.InAppViewConstants.CHILDREN, "", "getChildren", "()Ljava/util/List;", com.helpshift.proactive.InAppViewConstants.CONFIG, "getConfig", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "fakeNodeParent", "id", "", "getId", "()I", "isFake", "isFake$ui_release", "()Z", "setFake$ui_release", "(Z)V", "isMergingSemanticsOfDescendants", "isRoot", "isTransparent", "isTransparent$ui_release", "isUnmergedLeafNode", "isUnmergedLeafNode$ui_release", "layoutInfo", "Landroidx/compose/ui/layout/LayoutInfo;", "getLayoutInfo", "()Landroidx/compose/ui/layout/LayoutInfo;", "getLayoutNode$ui_release", "()Landroidx/compose/ui/node/LayoutNode;", "getMergingEnabled", "getOuterSemanticsNode$ui_release", "()Landroidx/compose/ui/Modifier$Node;", "parent", "getParent", "()Landroidx/compose/ui/semantics/SemanticsNode;", "positionInRoot", "Landroidx/compose/ui/geometry/Offset;", "getPositionInRoot-F1C5BW0", "()J", "positionInWindow", "getPositionInWindow-F1C5BW0", "replacedChildren", "getReplacedChildren$ui_release", "root", "Landroidx/compose/ui/node/RootForTest;", "getRoot", "()Landroidx/compose/ui/node/RootForTest;", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "touchBoundsInRoot", "getTouchBoundsInRoot", "getUnmergedConfig$ui_release", "copyWithMergingEnabled", "copyWithMergingEnabled$ui_release", "emitFakeNodes", "", "unmergedChildren", "", "fakeSemanticsNode", "role", "Landroidx/compose/ui/semantics/Role;", "properties", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Lkotlin/ExtensionFunctionType;", "fakeSemanticsNode-ypyhhiA", "findCoordinatorToGetBounds", "Landroidx/compose/ui/node/NodeCoordinator;", "findCoordinatorToGetBounds$ui_release", "findOneLayerOfMergingSemanticsNodes", "list", "getAlignmentLinePosition", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "includeReplacedSemantics", "includeFakeNodes", "mergeConfig", "mergedConfig", "unmergedChildren$ui_release", "fillOneLayerOfSemanticsWrappers", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SemanticsNode {
    public static final int $stable = 8;
    private androidx.compose.ui.semantics.SemanticsNode fakeNodeParent;
    private final int id;
    private boolean isFake;
    private final androidx.compose.ui.node.LayoutNode layoutNode;
    private final boolean mergingEnabled;
    private final androidx.compose.ui.Modifier.Node outerSemanticsNode;
    private final androidx.compose.ui.semantics.SemanticsConfiguration unmergedConfig;

    public SemanticsNode(androidx.compose.ui.Modifier.Node node, boolean z, androidx.compose.ui.node.LayoutNode layoutNode, androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration) {
        this.outerSemanticsNode = node;
        this.mergingEnabled = z;
        this.layoutNode = layoutNode;
        this.unmergedConfig = semanticsConfiguration;
        this.id = layoutNode.getSemanticsId();
    }

    /* renamed from: getOuterSemanticsNode$ui_release, reason: from getter */
    public final androidx.compose.ui.Modifier.Node getOuterSemanticsNode() {
        return this.outerSemanticsNode;
    }

    public final boolean getMergingEnabled() {
        return this.mergingEnabled;
    }

    /* renamed from: getLayoutNode$ui_release, reason: from getter */
    public final androidx.compose.ui.node.LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    /* renamed from: getUnmergedConfig$ui_release, reason: from getter */
    public final androidx.compose.ui.semantics.SemanticsConfiguration getUnmergedConfig() {
        return this.unmergedConfig;
    }

    /* renamed from: isFake$ui_release, reason: from getter */
    public final boolean getIsFake() {
        return this.isFake;
    }

    public final void setFake$ui_release(boolean z) {
        this.isFake = z;
    }

    public final boolean isUnmergedLeafNode$ui_release() {
        return !this.isFake && getReplacedChildren$ui_release().isEmpty() && androidx.compose.ui.semantics.SemanticsNodeKt.findClosestParentNode(this.layoutNode, new kotlin.jvm.functions.Function1<androidx.compose.ui.node.LayoutNode, java.lang.Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsNode$isUnmergedLeafNode$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Boolean invoke(androidx.compose.ui.node.LayoutNode layoutNode) {
                androidx.compose.ui.semantics.SemanticsConfiguration collapsedSemantics$ui_release = layoutNode.getCollapsedSemantics$ui_release();
                boolean z = false;
                if (collapsedSemantics$ui_release != null && collapsedSemantics$ui_release.getIsMergingSemanticsOfDescendants()) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            }
        }) == null;
    }

    public final androidx.compose.ui.layout.LayoutInfo getLayoutInfo() {
        return this.layoutNode;
    }

    public final androidx.compose.ui.node.RootForTest getRoot() {
        androidx.compose.ui.node.Owner owner = this.layoutNode.getOwner();
        if (owner != null) {
            return owner.getRootForTest();
        }
        return null;
    }

    public final int getId() {
        return this.id;
    }

    public final androidx.compose.ui.geometry.Rect getTouchBoundsInRoot() {
        androidx.compose.ui.Modifier.Node node;
        if (this.unmergedConfig.getIsMergingSemanticsOfDescendants()) {
            androidx.compose.ui.node.DelegatableNode outerMergingSemantics = androidx.compose.ui.semantics.SemanticsNodeKt.getOuterMergingSemantics(this.layoutNode);
            if (outerMergingSemantics == null) {
                outerMergingSemantics = this.outerSemanticsNode;
            }
            node = outerMergingSemantics;
        } else {
            node = this.outerSemanticsNode;
        }
        return androidx.compose.ui.node.SemanticsModifierNodeKt.touchBoundsInRoot(node.getNode(), androidx.compose.ui.node.SemanticsModifierNodeKt.getUseMinimumTouchTarget(this.unmergedConfig));
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m3802getSizeYbymL2g() {
        androidx.compose.ui.node.NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        return findCoordinatorToGetBounds$ui_release != null ? findCoordinatorToGetBounds$ui_release.mo3409getSizeYbymL2g() : androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g();
    }

    public final androidx.compose.ui.geometry.Rect getBoundsInRoot() {
        androidx.compose.ui.geometry.Rect boundsInRoot;
        androidx.compose.ui.node.NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (findCoordinatorToGetBounds$ui_release != null) {
            if (!findCoordinatorToGetBounds$ui_release.isAttached()) {
                findCoordinatorToGetBounds$ui_release = null;
            }
            if (findCoordinatorToGetBounds$ui_release != null && (boundsInRoot = androidx.compose.ui.layout.LayoutCoordinatesKt.boundsInRoot(findCoordinatorToGetBounds$ui_release)) != null) {
                return boundsInRoot;
            }
        }
        return androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
    }

    /* renamed from: getPositionInRoot-F1C5BW0, reason: not valid java name */
    public final long m3800getPositionInRootF1C5BW0() {
        androidx.compose.ui.node.NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (findCoordinatorToGetBounds$ui_release != null) {
            if (!findCoordinatorToGetBounds$ui_release.isAttached()) {
                findCoordinatorToGetBounds$ui_release = null;
            }
            if (findCoordinatorToGetBounds$ui_release != null) {
                return androidx.compose.ui.layout.LayoutCoordinatesKt.positionInRoot(findCoordinatorToGetBounds$ui_release);
            }
        }
        return androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
    }

    public final androidx.compose.ui.geometry.Rect getBoundsInWindow() {
        androidx.compose.ui.geometry.Rect boundsInWindow;
        androidx.compose.ui.node.NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (findCoordinatorToGetBounds$ui_release != null) {
            if (!findCoordinatorToGetBounds$ui_release.isAttached()) {
                findCoordinatorToGetBounds$ui_release = null;
            }
            if (findCoordinatorToGetBounds$ui_release != null && (boundsInWindow = androidx.compose.ui.layout.LayoutCoordinatesKt.boundsInWindow(findCoordinatorToGetBounds$ui_release)) != null) {
                return boundsInWindow;
            }
        }
        return androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
    }

    /* renamed from: getPositionInWindow-F1C5BW0, reason: not valid java name */
    public final long m3801getPositionInWindowF1C5BW0() {
        androidx.compose.ui.node.NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (findCoordinatorToGetBounds$ui_release != null) {
            if (!findCoordinatorToGetBounds$ui_release.isAttached()) {
                findCoordinatorToGetBounds$ui_release = null;
            }
            if (findCoordinatorToGetBounds$ui_release != null) {
                return androidx.compose.ui.layout.LayoutCoordinatesKt.positionInWindow(findCoordinatorToGetBounds$ui_release);
            }
        }
        return androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
    }

    public final androidx.compose.ui.geometry.Rect getBoundsInParent$ui_release() {
        androidx.compose.ui.layout.LayoutCoordinates coordinates;
        androidx.compose.ui.semantics.SemanticsNode parent = getParent();
        if (parent == null) {
            return androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
        }
        androidx.compose.ui.node.NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (findCoordinatorToGetBounds$ui_release != null) {
            if (!findCoordinatorToGetBounds$ui_release.isAttached()) {
                findCoordinatorToGetBounds$ui_release = null;
            }
            if (findCoordinatorToGetBounds$ui_release != null && (coordinates = findCoordinatorToGetBounds$ui_release.getCoordinates()) != null) {
                return androidx.compose.ui.layout.LayoutCoordinates.CC.localBoundingBoxOf$default(androidx.compose.ui.node.DelegatableNodeKt.m3509requireCoordinator64DMado(parent.outerSemanticsNode, androidx.compose.ui.node.NodeKind.m3613constructorimpl(8)), coordinates, false, 2, null);
            }
        }
        return androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
    }

    public final boolean isTransparent$ui_release() {
        androidx.compose.ui.node.NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (findCoordinatorToGetBounds$ui_release != null) {
            return findCoordinatorToGetBounds$ui_release.isTransparent();
        }
        return false;
    }

    public final int getAlignmentLinePosition(androidx.compose.ui.layout.AlignmentLine alignmentLine) {
        androidx.compose.ui.node.NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (findCoordinatorToGetBounds$ui_release != null) {
            return findCoordinatorToGetBounds$ui_release.get(alignmentLine);
        }
        return Integer.MIN_VALUE;
    }

    public final androidx.compose.ui.semantics.SemanticsConfiguration getConfig() {
        if (isMergingSemanticsOfDescendants()) {
            androidx.compose.ui.semantics.SemanticsConfiguration copy = this.unmergedConfig.copy();
            mergeConfig(copy);
            return copy;
        }
        return this.unmergedConfig;
    }

    private final void mergeConfig(androidx.compose.ui.semantics.SemanticsConfiguration mergedConfig) {
        if (this.unmergedConfig.getIsClearingSemantics()) {
            return;
        }
        java.util.List unmergedChildren$ui_release$default = unmergedChildren$ui_release$default(this, false, 1, null);
        int size = unmergedChildren$ui_release$default.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.semantics.SemanticsNode semanticsNode = (androidx.compose.ui.semantics.SemanticsNode) unmergedChildren$ui_release$default.get(i);
            if (!semanticsNode.isMergingSemanticsOfDescendants()) {
                mergedConfig.mergeChild$ui_release(semanticsNode.unmergedConfig);
                semanticsNode.mergeConfig(mergedConfig);
            }
        }
    }

    private final boolean isMergingSemanticsOfDescendants() {
        return this.mergingEnabled && this.unmergedConfig.getIsMergingSemanticsOfDescendants();
    }

    public static /* synthetic */ java.util.List unmergedChildren$ui_release$default(androidx.compose.ui.semantics.SemanticsNode semanticsNode, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return semanticsNode.unmergedChildren$ui_release(z);
    }

    public final java.util.List<androidx.compose.ui.semantics.SemanticsNode> unmergedChildren$ui_release(boolean includeFakeNodes) {
        if (this.isFake) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        fillOneLayerOfSemanticsWrappers(this.layoutNode, arrayList);
        if (includeFakeNodes) {
            emitFakeNodes(arrayList);
        }
        return arrayList;
    }

    private final void fillOneLayerOfSemanticsWrappers(androidx.compose.ui.node.LayoutNode layoutNode, java.util.List<androidx.compose.ui.semantics.SemanticsNode> list) {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> zSortedChildren = layoutNode.getZSortedChildren();
        int size = zSortedChildren.getSize();
        if (size > 0) {
            androidx.compose.ui.node.LayoutNode[] content = zSortedChildren.getContent();
            int i = 0;
            do {
                androidx.compose.ui.node.LayoutNode layoutNode2 = content[i];
                if (layoutNode2.isAttached()) {
                    if (layoutNode2.getNodes().m3576hasH91voCI$ui_release(androidx.compose.ui.node.NodeKind.m3613constructorimpl(8))) {
                        list.add(androidx.compose.ui.semantics.SemanticsNodeKt.SemanticsNode(layoutNode2, this.mergingEnabled));
                    } else {
                        fillOneLayerOfSemanticsWrappers(layoutNode2, list);
                    }
                }
                i++;
            } while (i < size);
        }
    }

    public final java.util.List<androidx.compose.ui.semantics.SemanticsNode> getChildren() {
        return getChildren(!this.mergingEnabled, false);
    }

    public final java.util.List<androidx.compose.ui.semantics.SemanticsNode> getReplacedChildren$ui_release() {
        return getChildren(false, true);
    }

    private final java.util.List<androidx.compose.ui.semantics.SemanticsNode> getChildren(boolean includeReplacedSemantics, boolean includeFakeNodes) {
        if (!includeReplacedSemantics && this.unmergedConfig.getIsClearingSemantics()) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        if (isMergingSemanticsOfDescendants()) {
            return findOneLayerOfMergingSemanticsNodes$default(this, null, 1, null);
        }
        return unmergedChildren$ui_release(includeFakeNodes);
    }

    public final boolean isRoot() {
        return getParent() == null;
    }

    public final androidx.compose.ui.semantics.SemanticsNode getParent() {
        androidx.compose.ui.semantics.SemanticsNode semanticsNode = this.fakeNodeParent;
        if (semanticsNode != null) {
            return semanticsNode;
        }
        androidx.compose.ui.node.LayoutNode findClosestParentNode = this.mergingEnabled ? androidx.compose.ui.semantics.SemanticsNodeKt.findClosestParentNode(this.layoutNode, new kotlin.jvm.functions.Function1<androidx.compose.ui.node.LayoutNode, java.lang.Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsNode$parent$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Boolean invoke(androidx.compose.ui.node.LayoutNode layoutNode) {
                androidx.compose.ui.semantics.SemanticsConfiguration collapsedSemantics$ui_release = layoutNode.getCollapsedSemantics$ui_release();
                boolean z = false;
                if (collapsedSemantics$ui_release != null && collapsedSemantics$ui_release.getIsMergingSemanticsOfDescendants()) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            }
        }) : null;
        if (findClosestParentNode == null) {
            findClosestParentNode = androidx.compose.ui.semantics.SemanticsNodeKt.findClosestParentNode(this.layoutNode, new kotlin.jvm.functions.Function1<androidx.compose.ui.node.LayoutNode, java.lang.Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsNode$parent$2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Boolean invoke(androidx.compose.ui.node.LayoutNode layoutNode) {
                    return java.lang.Boolean.valueOf(layoutNode.getNodes().m3576hasH91voCI$ui_release(androidx.compose.ui.node.NodeKind.m3613constructorimpl(8)));
                }
            });
        }
        if (findClosestParentNode == null) {
            return null;
        }
        return androidx.compose.ui.semantics.SemanticsNodeKt.SemanticsNode(findClosestParentNode, this.mergingEnabled);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ java.util.List findOneLayerOfMergingSemanticsNodes$default(androidx.compose.ui.semantics.SemanticsNode semanticsNode, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = new java.util.ArrayList();
        }
        return semanticsNode.findOneLayerOfMergingSemanticsNodes(list);
    }

    private final java.util.List<androidx.compose.ui.semantics.SemanticsNode> findOneLayerOfMergingSemanticsNodes(java.util.List<androidx.compose.ui.semantics.SemanticsNode> list) {
        java.util.List unmergedChildren$ui_release$default = unmergedChildren$ui_release$default(this, false, 1, null);
        int size = unmergedChildren$ui_release$default.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.semantics.SemanticsNode semanticsNode = (androidx.compose.ui.semantics.SemanticsNode) unmergedChildren$ui_release$default.get(i);
            if (semanticsNode.isMergingSemanticsOfDescendants()) {
                list.add(semanticsNode);
            } else if (!semanticsNode.unmergedConfig.getIsClearingSemantics()) {
                semanticsNode.findOneLayerOfMergingSemanticsNodes(list);
            }
        }
        return list;
    }

    public final androidx.compose.ui.node.NodeCoordinator findCoordinatorToGetBounds$ui_release() {
        if (this.isFake) {
            androidx.compose.ui.semantics.SemanticsNode parent = getParent();
            if (parent != null) {
                return parent.findCoordinatorToGetBounds$ui_release();
            }
            return null;
        }
        androidx.compose.ui.node.DelegatableNode outerMergingSemantics = androidx.compose.ui.semantics.SemanticsNodeKt.getOuterMergingSemantics(this.layoutNode);
        if (outerMergingSemantics == null) {
            outerMergingSemantics = this.outerSemanticsNode;
        }
        return androidx.compose.ui.node.DelegatableNodeKt.m3509requireCoordinator64DMado(outerMergingSemantics, androidx.compose.ui.node.NodeKind.m3613constructorimpl(8));
    }

    private final void emitFakeNodes(java.util.List<androidx.compose.ui.semantics.SemanticsNode> unmergedChildren) {
        final androidx.compose.ui.semantics.Role role;
        role = androidx.compose.ui.semantics.SemanticsNodeKt.getRole(this);
        if (role != null && this.unmergedConfig.getIsMergingSemanticsOfDescendants() && (!unmergedChildren.isEmpty())) {
            unmergedChildren.add(m3799fakeSemanticsNodeypyhhiA(role, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    androidx.compose.ui.semantics.SemanticsPropertiesKt.m3808setRolekuIjeqM(semanticsPropertyReceiver, androidx.compose.ui.semantics.Role.this.getValue());
                }
            }));
        }
        if (this.unmergedConfig.contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getContentDescription()) && (!unmergedChildren.isEmpty()) && this.unmergedConfig.getIsMergingSemanticsOfDescendants()) {
            java.util.List list = (java.util.List) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(this.unmergedConfig, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getContentDescription());
            final java.lang.String str = list != null ? (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull(list) : null;
            if (str != null) {
                unmergedChildren.add(0, m3799fakeSemanticsNodeypyhhiA(null, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                    }
                }));
            }
        }
    }

    /* renamed from: fakeSemanticsNode-ypyhhiA, reason: not valid java name */
    private final androidx.compose.ui.semantics.SemanticsNode m3799fakeSemanticsNodeypyhhiA(androidx.compose.ui.semantics.Role role, kotlin.jvm.functions.Function1<? super androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit> properties) {
        androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration = new androidx.compose.ui.semantics.SemanticsConfiguration();
        semanticsConfiguration.setMergingSemanticsOfDescendants(false);
        semanticsConfiguration.setClearingSemantics(false);
        properties.invoke(semanticsConfiguration);
        androidx.compose.ui.semantics.SemanticsNode semanticsNode = new androidx.compose.ui.semantics.SemanticsNode(new androidx.compose.ui.semantics.SemanticsNode$fakeSemanticsNode$fakeNode$1(properties), false, new androidx.compose.ui.node.LayoutNode(true, role != null ? androidx.compose.ui.semantics.SemanticsNodeKt.roleFakeNodeId(this) : androidx.compose.ui.semantics.SemanticsNodeKt.contentDescriptionFakeNodeId(this)), semanticsConfiguration);
        semanticsNode.isFake = true;
        semanticsNode.fakeNodeParent = this;
        return semanticsNode;
    }

    public final androidx.compose.ui.semantics.SemanticsNode copyWithMergingEnabled$ui_release() {
        return new androidx.compose.ui.semantics.SemanticsNode(this.outerSemanticsNode, true, this.layoutNode, this.unmergedConfig);
    }
}
