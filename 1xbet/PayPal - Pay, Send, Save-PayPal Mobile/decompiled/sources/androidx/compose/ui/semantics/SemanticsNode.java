package androidx.compose.ui.semantics;

@kotlin.Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010<\u001a\u00020(2\u0006\u0010=\u001a\u00020>H\u0002J\u000e\u0010A\u001a\u00020$2\u0006\u0010B\u001a\u00020CJ\u001e\u0010F\u001a\u00020G2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00000I2\u0006\u0010J\u001a\u00020\tH\u0002J7\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00000L2\u000e\b\u0002\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00000I2\b\b\u0002\u0010M\u001a\u00020\u00052\b\b\u0002\u0010N\u001a\u00020\u0005H\u0000¢\u0006\u0002\bOJ\"\u0010P\u001a\u00020G*\u00020\u00072\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00000I2\u0006\u0010N\u001a\u00020\u0005H\u0002J1\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00000L2\b\b\u0002\u0010W\u001a\u00020\u00052\b\b\u0002\u0010M\u001a\u00020\u00052\b\b\u0002\u0010N\u001a\u00020\u0005H\u0000¢\u0006\u0002\bXJ,\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00000L2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00000I2\u000e\b\u0002\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00000IH\u0002J2\u0010^\u001a\u00020G*\b\u0012\u0004\u0012\u00020\u00000I2\u0012\u0010_\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020G0`H\u0082\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u000f\u0010a\u001a\u0004\u0018\u00010bH\u0000¢\u0006\u0002\bcJ\n\u0010d\u001a\u0004\u0018\u00010eH\u0002J\u0016\u0010f\u001a\u00020G2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00000IH\u0002J0\u0010g\u001a\u00020\u00002\b\u0010h\u001a\u0004\u0018\u00010i2\u0017\u0010j\u001a\u0013\u0012\u0004\u0012\u00020k\u0012\u0004\u0012\u00020G0`¢\u0006\u0002\blH\u0002¢\u0006\u0002\bmJ\r\u0010n\u001a\u00020\u0000H\u0000¢\u0006\u0002\boR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000fR\u0011\u0010\u001b\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u001f\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020$¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010+\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u0010/\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b0\u0010*R\u0011\u00101\u001a\u0002028F¢\u0006\u0006\u001a\u0004\b3\u0010.R\u0011\u00104\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b5\u0010*R\u0011\u00106\u001a\u0002028F¢\u0006\u0006\u001a\u0004\b7\u0010.R\u0011\u00108\u001a\u0002028F¢\u0006\u0006\u001a\u0004\b9\u0010.R\u0014\u0010:\u001a\u00020(8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b;\u0010*R\u0014\u0010?\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\u000fR\u0011\u0010D\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bE\u0010\u0013R\u0014\u0010K\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010\u000fR\u0017\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00000L8F¢\u0006\u0006\u001a\u0004\bS\u0010TR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00000L8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bV\u0010TR\u0011\u0010Y\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bY\u0010\u000fR\u0013\u0010Z\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\b[\u0010\\¨\u0006p"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsNode;", "", "outerSemanticsNode", "Landroidx/compose/ui/Modifier$Node;", "mergingEnabled", "", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "unmergedConfig", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "<init>", "(Landroidx/compose/ui/Modifier$Node;ZLandroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/semantics/SemanticsConfiguration;)V", "getOuterSemanticsNode$ui", "()Landroidx/compose/ui/Modifier$Node;", "getMergingEnabled", "()Z", "getLayoutNode$ui", "()Landroidx/compose/ui/node/LayoutNode;", "getUnmergedConfig$ui", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "isFake", "isFake$ui", "setFake$ui", "(Z)V", "fakeNodeParent", "isUnmergedLeafNode", "isUnmergedLeafNode$ui", "layoutInfo", "Landroidx/compose/ui/layout/LayoutInfo;", "getLayoutInfo", "()Landroidx/compose/ui/layout/LayoutInfo;", "root", "Landroidx/compose/ui/node/RootForTest;", "getRoot", "()Landroidx/compose/ui/node/RootForTest;", "id", "", "getId", "()I", "touchBoundsInRoot", "Landroidx/compose/ui/geometry/Rect;", "getTouchBoundsInRoot", "()Landroidx/compose/ui/geometry/Rect;", io.ktor.http.ContentDisposition.Parameters.Size, "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "boundsInRoot", "getBoundsInRoot", "positionInRoot", "Landroidx/compose/ui/geometry/Offset;", "getPositionInRoot-F1C5BW0", "boundsInWindow", "getBoundsInWindow", "positionInWindow", "getPositionInWindow-F1C5BW0", "positionOnScreen", "getPositionOnScreen-F1C5BW0", "boundsInParent", "getBoundsInParent$ui", "boundsInImportantForBoundsAncestor", "nodeCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "isTransparent", "isTransparent$ui", "getAlignmentLinePosition", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "config", "getConfig", "mergeConfig", "", "unmergedChildren", "", "mergedConfig", "isMergingSemanticsOfDescendants", "", "includeFakeNodes", "includeDeactivatedNodes", "unmergedChildren$ui", "fillOneLayerOfSemanticsWrappers", "list", "children", "getChildren", "()Ljava/util/List;", "replacedChildren", "getReplacedChildren$ui", "includeReplacedSemantics", "getChildren$ui", "isRoot", "parent", "getParent", "()Landroidx/compose/ui/semantics/SemanticsNode;", "findOneLayerOfMergingSemanticsNodes", "forEachUnmergedChild", "block", "Lkotlin/Function1;", "findCoordinatorToGetBounds", "Landroidx/compose/ui/node/NodeCoordinator;", "findCoordinatorToGetBounds$ui", "findSemanticsModifierNodeToGetBounds", "Landroidx/compose/ui/node/SemanticsModifierNode;", "emitFakeNodes", "fakeSemanticsNode", "role", "Landroidx/compose/ui/semantics/Role;", "properties", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Lkotlin/ExtensionFunctionType;", "fakeSemanticsNode-ypyhhiA", "copyWithMergingEnabled", "copyWithMergingEnabled$ui", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SemanticsNode {
    public static final int $stable = 8;
    private androidx.compose.ui.semantics.SemanticsNode getHighSpeedVideoFpsRangesFor;
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

    /* renamed from: getOuterSemanticsNode$ui, reason: from getter */
    public final androidx.compose.ui.Modifier.Node getOuterSemanticsNode() {
        return this.outerSemanticsNode;
    }

    public final boolean getMergingEnabled() {
        return this.mergingEnabled;
    }

    /* renamed from: getLayoutNode$ui, reason: from getter */
    public final androidx.compose.ui.node.LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    /* renamed from: getUnmergedConfig$ui, reason: from getter */
    public final androidx.compose.ui.semantics.SemanticsConfiguration getUnmergedConfig() {
        return this.unmergedConfig;
    }

    /* renamed from: isFake$ui, reason: from getter */
    public final boolean getIsFake() {
        return this.isFake;
    }

    public final void setFake$ui(boolean z) {
        this.isFake = z;
    }

    public final boolean isUnmergedLeafNode$ui() {
        if (this.isFake || !getReplacedChildren$ui().isEmpty()) {
            return false;
        }
        androidx.compose.ui.node.LayoutNode parent$ui = this.layoutNode.getParent$ui();
        while (true) {
            if (parent$ui == null) {
                parent$ui = null;
                break;
            }
            androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration = parent$ui.getSemanticsConfiguration();
            if (semanticsConfiguration != null && semanticsConfiguration.getIsMergingSemanticsOfDescendants()) {
                break;
            }
            parent$ui = parent$ui.getParent$ui();
        }
        return parent$ui == null;
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
        androidx.compose.ui.node.SemanticsModifierNode Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        if (Camera2StreamConfigurationMap == null) {
            return this.layoutNode.getInnerCoordinator$ui().touchBoundsInRoot();
        }
        return androidx.compose.ui.node.SemanticsModifierNodeKt.touchBoundsInRoot(Camera2StreamConfigurationMap.getNode(), androidx.compose.ui.node.SemanticsModifierNodeKt.getUseMinimumTouchTarget(this.unmergedConfig));
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m7810getSizeYbymL2g() {
        androidx.compose.ui.node.NodeCoordinator findCoordinatorToGetBounds$ui = findCoordinatorToGetBounds$ui();
        return findCoordinatorToGetBounds$ui != null ? findCoordinatorToGetBounds$ui.mo7361getSizeYbymL2g() : androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g();
    }

    public final androidx.compose.ui.geometry.Rect getBoundsInRoot() {
        androidx.compose.ui.geometry.Rect boundsInRoot;
        androidx.compose.ui.node.NodeCoordinator findCoordinatorToGetBounds$ui = findCoordinatorToGetBounds$ui();
        if (findCoordinatorToGetBounds$ui != null) {
            if (!findCoordinatorToGetBounds$ui.isAttached()) {
                findCoordinatorToGetBounds$ui = null;
            }
            if (findCoordinatorToGetBounds$ui != null && (boundsInRoot = androidx.compose.ui.layout.LayoutCoordinatesKt.boundsInRoot(findCoordinatorToGetBounds$ui)) != null) {
                return boundsInRoot;
            }
        }
        return androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
    }

    /* renamed from: getPositionInRoot-F1C5BW0, reason: not valid java name */
    public final long m7807getPositionInRootF1C5BW0() {
        androidx.compose.ui.node.NodeCoordinator findCoordinatorToGetBounds$ui = findCoordinatorToGetBounds$ui();
        if (findCoordinatorToGetBounds$ui != null) {
            if (!findCoordinatorToGetBounds$ui.isAttached()) {
                findCoordinatorToGetBounds$ui = null;
            }
            if (findCoordinatorToGetBounds$ui != null) {
                return androidx.compose.ui.layout.LayoutCoordinatesKt.positionInRoot(findCoordinatorToGetBounds$ui);
            }
        }
        return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
    }

    public final androidx.compose.ui.geometry.Rect getBoundsInWindow() {
        androidx.compose.ui.geometry.Rect boundsInWindow$default;
        androidx.compose.ui.node.NodeCoordinator findCoordinatorToGetBounds$ui = findCoordinatorToGetBounds$ui();
        if (findCoordinatorToGetBounds$ui != null) {
            if (!findCoordinatorToGetBounds$ui.isAttached()) {
                findCoordinatorToGetBounds$ui = null;
            }
            if (findCoordinatorToGetBounds$ui != null && (boundsInWindow$default = androidx.compose.ui.layout.LayoutCoordinatesKt.boundsInWindow$default(findCoordinatorToGetBounds$ui, false, 1, null)) != null) {
                return boundsInWindow$default;
            }
        }
        return androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
    }

    /* renamed from: getPositionInWindow-F1C5BW0, reason: not valid java name */
    public final long m7808getPositionInWindowF1C5BW0() {
        androidx.compose.ui.node.NodeCoordinator findCoordinatorToGetBounds$ui = findCoordinatorToGetBounds$ui();
        if (findCoordinatorToGetBounds$ui != null) {
            if (!findCoordinatorToGetBounds$ui.isAttached()) {
                findCoordinatorToGetBounds$ui = null;
            }
            if (findCoordinatorToGetBounds$ui != null) {
                return androidx.compose.ui.layout.LayoutCoordinatesKt.positionInWindow(findCoordinatorToGetBounds$ui);
            }
        }
        return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
    }

    /* renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name */
    public final long m7809getPositionOnScreenF1C5BW0() {
        androidx.compose.ui.node.NodeCoordinator findCoordinatorToGetBounds$ui = findCoordinatorToGetBounds$ui();
        if (findCoordinatorToGetBounds$ui != null) {
            if (!findCoordinatorToGetBounds$ui.isAttached()) {
                findCoordinatorToGetBounds$ui = null;
            }
            if (findCoordinatorToGetBounds$ui != null) {
                return androidx.compose.ui.layout.LayoutCoordinatesKt.positionOnScreen(findCoordinatorToGetBounds$ui);
            }
        }
        return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
    }

    public final androidx.compose.ui.geometry.Rect getBoundsInParent$ui() {
        androidx.compose.ui.layout.LayoutCoordinates coordinates;
        androidx.compose.ui.node.NodeCoordinator findCoordinatorToGetBounds$ui = findCoordinatorToGetBounds$ui();
        if (findCoordinatorToGetBounds$ui != null) {
            if (!findCoordinatorToGetBounds$ui.isAttached()) {
                findCoordinatorToGetBounds$ui = null;
            }
            if (findCoordinatorToGetBounds$ui != null && (coordinates = findCoordinatorToGetBounds$ui.getCoordinates()) != null) {
                return getHighSpeedVideoSizes(coordinates);
            }
        }
        return androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v3 */
    private final androidx.compose.ui.geometry.Rect getHighSpeedVideoSizes(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        androidx.compose.ui.node.DelegatingNode delegatingNode;
        androidx.compose.ui.node.NodeCoordinator m7502requireCoordinator64DMado;
        androidx.compose.ui.semantics.SemanticsNode semanticsNode = this;
        do {
            semanticsNode = semanticsNode.getParent();
            if (semanticsNode == null) {
                return androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
            }
            androidx.compose.ui.node.NodeChain nodes = semanticsNode.layoutNode.getNodes();
            int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(8);
            if ((nodes.getHighSpeedVideoFpsRangesFor() & m7621constructorimpl) != 0) {
                for (androidx.compose.ui.Modifier.Node head = nodes.getHead(); head != null; head = head.getChild()) {
                    if ((head.getKindSet() & m7621constructorimpl) != 0) {
                        delegatingNode = head;
                        androidx.compose.runtime.collection.MutableVector mutableVector = null;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof androidx.compose.ui.node.SemanticsModifierNode) {
                                if (delegatingNode.isImportantForBounds()) {
                                    break;
                                }
                            } else if ((delegatingNode.getKindSet() & m7621constructorimpl) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
                                androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate();
                                int i = 0;
                                delegatingNode = delegatingNode;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            delegatingNode = delegate;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            }
                                            if (delegatingNode != 0) {
                                                if (mutableVector != null) {
                                                    mutableVector.add(delegatingNode);
                                                }
                                                delegatingNode = 0;
                                            }
                                            if (mutableVector != null) {
                                                mutableVector.add(delegate);
                                            }
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    delegatingNode = delegatingNode;
                                }
                                if (i != 1) {
                                }
                            }
                            delegatingNode = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector);
                        }
                    }
                    if ((head.getAggregateChildKindSet() & m7621constructorimpl) == 0) {
                        break;
                    }
                }
            }
            delegatingNode = 0;
            androidx.compose.ui.node.SemanticsModifierNode semanticsModifierNode = (androidx.compose.ui.node.SemanticsModifierNode) delegatingNode;
            m7502requireCoordinator64DMado = semanticsModifierNode != null ? androidx.compose.ui.node.DelegatableNodeKt.m7502requireCoordinator64DMado(semanticsModifierNode, androidx.compose.ui.node.NodeKind.m7621constructorimpl(8)) : null;
        } while (m7502requireCoordinator64DMado == null);
        return androidx.compose.ui.layout.LayoutCoordinates.localBoundingBoxOf$default(m7502requireCoordinator64DMado, layoutCoordinates, false, 2, null);
    }

    public final boolean isTransparent$ui() {
        androidx.compose.ui.node.NodeCoordinator findCoordinatorToGetBounds$ui = findCoordinatorToGetBounds$ui();
        if (findCoordinatorToGetBounds$ui != null) {
            return findCoordinatorToGetBounds$ui.isTransparent();
        }
        return false;
    }

    public final int getAlignmentLinePosition(androidx.compose.ui.layout.AlignmentLine alignmentLine) {
        androidx.compose.ui.node.NodeCoordinator findCoordinatorToGetBounds$ui = findCoordinatorToGetBounds$ui();
        if (findCoordinatorToGetBounds$ui != null) {
            return findCoordinatorToGetBounds$ui.get(alignmentLine);
        }
        return Integer.MIN_VALUE;
    }

    public final androidx.compose.ui.semantics.SemanticsConfiguration getConfig() {
        if (getHighResolutionOutputSizeshNQ4ISI()) {
            androidx.compose.ui.semantics.SemanticsConfiguration copy = this.unmergedConfig.copy();
            getHighSpeedVideoFpsRangesFor(new java.util.ArrayList(), copy);
            return copy;
        }
        return this.unmergedConfig;
    }

    private final void getHighSpeedVideoFpsRangesFor(java.util.List<androidx.compose.ui.semantics.SemanticsNode> list, androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration) {
        if (this.unmergedConfig.getIsClearingSemantics()) {
            return;
        }
        unmergedChildren$ui$default(this, list, false, false, 6, null);
        int size = list.size();
        for (int size2 = list.size(); size2 < size; size2++) {
            androidx.compose.ui.semantics.SemanticsNode semanticsNode = list.get(size2);
            if (!semanticsNode.getHighResolutionOutputSizeshNQ4ISI()) {
                semanticsConfiguration.mergeChild$ui(semanticsNode.unmergedConfig);
                semanticsNode.getHighSpeedVideoFpsRangesFor(list, semanticsConfiguration);
            }
        }
    }

    private final boolean getHighResolutionOutputSizeshNQ4ISI() {
        return this.mergingEnabled && this.unmergedConfig.getIsMergingSemanticsOfDescendants();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.util.List unmergedChildren$ui$default(androidx.compose.ui.semantics.SemanticsNode semanticsNode, java.util.List list, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = new java.util.ArrayList();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return semanticsNode.unmergedChildren$ui(list, z, z2);
    }

    public final java.util.List<androidx.compose.ui.semantics.SemanticsNode> unmergedChildren$ui(java.util.List<androidx.compose.ui.semantics.SemanticsNode> unmergedChildren, boolean includeFakeNodes, boolean includeDeactivatedNodes) {
        if (this.isFake) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        getHighResolutionOutputSizeshNQ4ISI(this.layoutNode, unmergedChildren, includeDeactivatedNodes);
        if (includeFakeNodes) {
            getHighSpeedVideoFpsRanges(unmergedChildren);
        }
        return unmergedChildren;
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.node.LayoutNode layoutNode, java.util.List<androidx.compose.ui.semantics.SemanticsNode> list, boolean z) {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> zSortedChildren = layoutNode.getZSortedChildren();
        androidx.compose.ui.node.LayoutNode[] layoutNodeArr = zSortedChildren.content;
        int size = zSortedChildren.getSize();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.node.LayoutNode layoutNode2 = layoutNodeArr[i];
            if (layoutNode2.isAttached() && (z || !layoutNode2.getIsDeactivated())) {
                if (layoutNode2.getNodes().m7594hasH91voCI$ui(androidx.compose.ui.node.NodeKind.m7621constructorimpl(8))) {
                    list.add(androidx.compose.ui.semantics.SemanticsNodeKt.SemanticsNode(layoutNode2, this.mergingEnabled));
                } else {
                    getHighResolutionOutputSizeshNQ4ISI(layoutNode2, list, z);
                }
            }
        }
    }

    public final java.util.List<androidx.compose.ui.semantics.SemanticsNode> getChildren() {
        return getChildren$ui$default(this, false, false, false, 7, null);
    }

    public final java.util.List<androidx.compose.ui.semantics.SemanticsNode> getReplacedChildren$ui() {
        return getChildren$ui$default(this, false, true, false, 4, null);
    }

    public static /* synthetic */ java.util.List getChildren$ui$default(androidx.compose.ui.semantics.SemanticsNode semanticsNode, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = !semanticsNode.mergingEnabled;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        return semanticsNode.getChildren$ui(z, z2, z3);
    }

    public final java.util.List<androidx.compose.ui.semantics.SemanticsNode> getChildren$ui(boolean includeReplacedSemantics, boolean includeFakeNodes, boolean includeDeactivatedNodes) {
        if (!includeReplacedSemantics && this.unmergedConfig.getIsClearingSemantics()) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (getHighResolutionOutputSizeshNQ4ISI()) {
            return getHighSpeedVideoFpsRanges(this, arrayList);
        }
        return unmergedChildren$ui(arrayList, includeFakeNodes, includeDeactivatedNodes);
    }

    public final boolean isRoot() {
        return getParent() == null;
    }

    public final androidx.compose.ui.semantics.SemanticsNode getParent() {
        androidx.compose.ui.node.LayoutNode layoutNode;
        androidx.compose.ui.semantics.SemanticsNode semanticsNode = this.getHighSpeedVideoFpsRangesFor;
        if (semanticsNode != null) {
            return semanticsNode;
        }
        if (this.mergingEnabled) {
            layoutNode = this.layoutNode.getParent$ui();
            while (layoutNode != null) {
                androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration = layoutNode.getSemanticsConfiguration();
                if (semanticsConfiguration != null && semanticsConfiguration.getIsMergingSemanticsOfDescendants()) {
                    break;
                }
                layoutNode = layoutNode.getParent$ui();
            }
        }
        layoutNode = null;
        if (layoutNode == null) {
            layoutNode = this.layoutNode.getParent$ui();
            while (true) {
                if (layoutNode == null) {
                    layoutNode = null;
                    break;
                }
                if (layoutNode.getNodes().m7594hasH91voCI$ui(androidx.compose.ui.node.NodeKind.m7621constructorimpl(8))) {
                    break;
                }
                layoutNode = layoutNode.getParent$ui();
            }
        }
        if (layoutNode == null) {
            return null;
        }
        return androidx.compose.ui.semantics.SemanticsNodeKt.SemanticsNode(layoutNode, this.mergingEnabled);
    }

    private static /* synthetic */ java.util.List getHighSpeedVideoFpsRanges(androidx.compose.ui.semantics.SemanticsNode semanticsNode, java.util.List list) {
        return semanticsNode.getHighSpeedVideoFpsRanges((java.util.List<androidx.compose.ui.semantics.SemanticsNode>) list, new java.util.ArrayList());
    }

    public final androidx.compose.ui.node.NodeCoordinator findCoordinatorToGetBounds$ui() {
        androidx.compose.ui.node.NodeCoordinator m7502requireCoordinator64DMado;
        androidx.compose.ui.semantics.SemanticsNode semanticsNode = this;
        while (semanticsNode.isFake) {
            semanticsNode = semanticsNode.getParent();
            if (semanticsNode == null) {
                return null;
            }
        }
        androidx.compose.ui.node.SemanticsModifierNode Camera2StreamConfigurationMap = semanticsNode.Camera2StreamConfigurationMap();
        return (Camera2StreamConfigurationMap == null || (m7502requireCoordinator64DMado = androidx.compose.ui.node.DelegatableNodeKt.m7502requireCoordinator64DMado(Camera2StreamConfigurationMap, androidx.compose.ui.node.NodeKind.m7621constructorimpl(8))) == null) ? semanticsNode.layoutNode.getInnerCoordinator$ui() : m7502requireCoordinator64DMado;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v14, types: [androidx.compose.ui.node.SemanticsModifierNode] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    private final androidx.compose.ui.node.SemanticsModifierNode Camera2StreamConfigurationMap() {
        androidx.compose.ui.Modifier.Node node;
        java.lang.Object obj = null;
        if (this.unmergedConfig.getIsMergingSemanticsOfDescendants()) {
            androidx.compose.ui.node.NodeChain nodes = this.layoutNode.getNodes();
            int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(8);
            if ((nodes.getHighSpeedVideoFpsRangesFor() & m7621constructorimpl) != 0) {
                node = null;
                for (androidx.compose.ui.Modifier.Node head = nodes.getHead(); head != null; head = head.getChild()) {
                    if ((head.getKindSet() & m7621constructorimpl) != 0) {
                        androidx.compose.ui.node.DelegatingNode delegatingNode = head;
                        androidx.compose.runtime.collection.MutableVector mutableVector = null;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof androidx.compose.ui.node.SemanticsModifierNode) {
                                ?? r7 = (androidx.compose.ui.node.SemanticsModifierNode) delegatingNode;
                                if (r7.isImportantForBounds()) {
                                    if (r7.getShouldMergeDescendantSemantics()) {
                                        return r7;
                                    }
                                    if (node == null) {
                                        node = r7;
                                    }
                                }
                            } else if ((delegatingNode.getKindSet() & m7621constructorimpl) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
                                androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate();
                                int i = 0;
                                delegatingNode = delegatingNode;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            delegatingNode = delegate;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            }
                                            if (delegatingNode != 0) {
                                                if (mutableVector != null) {
                                                    mutableVector.add(delegatingNode);
                                                }
                                                delegatingNode = 0;
                                            }
                                            if (mutableVector != null) {
                                                mutableVector.add(delegate);
                                            }
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    delegatingNode = delegatingNode;
                                }
                                if (i == 1) {
                                }
                            }
                            delegatingNode = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector);
                        }
                    }
                    if ((head.getAggregateChildKindSet() & m7621constructorimpl) == 0) {
                        break;
                    }
                }
                obj = node;
            }
            return (androidx.compose.ui.node.SemanticsModifierNode) obj;
        }
        androidx.compose.ui.node.NodeChain nodes2 = this.layoutNode.getNodes();
        int m7621constructorimpl2 = androidx.compose.ui.node.NodeKind.m7621constructorimpl(8);
        if ((nodes2.getHighSpeedVideoFpsRangesFor() & m7621constructorimpl2) != 0) {
            loop3: for (androidx.compose.ui.Modifier.Node head2 = nodes2.getHead(); head2 != null; head2 = head2.getChild()) {
                if ((head2.getKindSet() & m7621constructorimpl2) != 0) {
                    node = head2;
                    androidx.compose.runtime.collection.MutableVector mutableVector2 = null;
                    while (node != null) {
                        if (node instanceof androidx.compose.ui.node.SemanticsModifierNode) {
                            if (((androidx.compose.ui.node.SemanticsModifierNode) node).isImportantForBounds()) {
                                obj = node;
                            }
                        } else if ((node.getKindSet() & m7621constructorimpl2) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                            int i2 = 0;
                            for (androidx.compose.ui.Modifier.Node delegate2 = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                if ((delegate2.getKindSet() & m7621constructorimpl2) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        node = delegate2;
                                    } else {
                                        if (mutableVector2 == null) {
                                            mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                        }
                                        if (node != null) {
                                            if (mutableVector2 != null) {
                                                mutableVector2.add(node);
                                            }
                                            node = null;
                                        }
                                        if (mutableVector2 != null) {
                                            mutableVector2.add(delegate2);
                                        }
                                    }
                                }
                            }
                            if (i2 != 1) {
                            }
                        }
                        node = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector2);
                    }
                }
                if ((head2.getAggregateChildKindSet() & m7621constructorimpl2) == 0) {
                    break;
                }
            }
        }
        return (androidx.compose.ui.node.SemanticsModifierNode) obj;
    }

    private final void getHighSpeedVideoFpsRanges(java.util.List<androidx.compose.ui.semantics.SemanticsNode> list) {
        final androidx.compose.ui.semantics.Role highSpeedVideoSizes;
        highSpeedVideoSizes = androidx.compose.ui.semantics.SemanticsNodeKt.getHighSpeedVideoSizes(this);
        if (highSpeedVideoSizes != null && this.unmergedConfig.getIsMergingSemanticsOfDescendants() && !list.isEmpty()) {
            list.add(getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$1
                public final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    androidx.compose.ui.semantics.SemanticsPropertiesKt.m7815setRolekuIjeqM(semanticsPropertyReceiver, androidx.compose.ui.semantics.Role.this.getGetHighSpeedVideoSizes());
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    getHighSpeedVideoFpsRangesFor(semanticsPropertyReceiver);
                    return kotlin.Unit.INSTANCE;
                }

                {
                    super(1);
                }
            }));
        }
        if (this.unmergedConfig.contains(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getContentDescription()) && !list.isEmpty() && this.unmergedConfig.getIsMergingSemanticsOfDescendants()) {
            java.util.List list2 = (java.util.List) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(this.unmergedConfig, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getContentDescription());
            final java.lang.String str = list2 != null ? (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull(list2) : null;
            if (str != null) {
                list.add(0, getHighSpeedVideoFpsRangesFor((androidx.compose.ui.semantics.Role) null, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$2
                    public final void Camera2StreamConfigurationMap(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        Camera2StreamConfigurationMap(semanticsPropertyReceiver);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                }));
            }
        }
    }

    private final androidx.compose.ui.semantics.SemanticsNode getHighSpeedVideoFpsRangesFor(androidx.compose.ui.semantics.Role role, kotlin.jvm.functions.Function1<? super androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit> function1) {
        androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration = new androidx.compose.ui.semantics.SemanticsConfiguration();
        semanticsConfiguration.setMergingSemanticsOfDescendants(false);
        semanticsConfiguration.setClearingSemantics(false);
        function1.invoke(semanticsConfiguration);
        androidx.compose.ui.semantics.SemanticsNode semanticsNode = new androidx.compose.ui.semantics.SemanticsNode(new androidx.compose.ui.semantics.SemanticsNode$fakeSemanticsNode$fakeNode$1(function1), false, new androidx.compose.ui.node.LayoutNode(true, role != null ? androidx.compose.ui.semantics.SemanticsNodeKt.getHighSpeedVideoFpsRangesFor(this) : androidx.compose.ui.semantics.SemanticsNodeKt.Camera2StreamConfigurationMap(this)), semanticsConfiguration);
        semanticsNode.isFake = true;
        semanticsNode.getHighSpeedVideoFpsRangesFor = this;
        return semanticsNode;
    }

    public final androidx.compose.ui.semantics.SemanticsNode copyWithMergingEnabled$ui() {
        return new androidx.compose.ui.semantics.SemanticsNode(this.outerSemanticsNode, true, this.layoutNode, this.unmergedConfig);
    }

    private final java.util.List<androidx.compose.ui.semantics.SemanticsNode> getHighSpeedVideoFpsRanges(java.util.List<androidx.compose.ui.semantics.SemanticsNode> list, java.util.List<androidx.compose.ui.semantics.SemanticsNode> list2) {
        unmergedChildren$ui$default(this, list, false, false, 6, null);
        int size = list.size();
        for (int size2 = list.size(); size2 < size; size2++) {
            androidx.compose.ui.semantics.SemanticsNode semanticsNode = list.get(size2);
            if (semanticsNode.getHighResolutionOutputSizeshNQ4ISI()) {
                list2.add(semanticsNode);
            } else if (!semanticsNode.unmergedConfig.getIsClearingSemantics()) {
                semanticsNode.getHighSpeedVideoFpsRanges(list, list2);
            }
        }
        return list2;
    }
}
