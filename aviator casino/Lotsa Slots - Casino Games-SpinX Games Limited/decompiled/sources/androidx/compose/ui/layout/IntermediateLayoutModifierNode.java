package androidx.compose.ui.layout;

/* compiled from: IntermediateLayoutModifierNode.kt */
@kotlin.Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u000289BH\u0012A\u0010\u0003\u001a=\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0004¢\u0006\u0002\b\r¢\u0006\u0002\u0010\u000eJ\b\u0010 \u001a\u00020!H\u0016J4\u0010\"\u001a\u00020\f*\u00020#2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b&\u0010'J!\u0010(\u001a\u00020)*\u00020*2\u0006\u0010\t\u001a\u00020+2\u0006\u0010,\u001a\u00020)H\u0000¢\u0006\u0002\b-J!\u0010.\u001a\u00020)*\u00020*2\u0006\u0010\t\u001a\u00020+2\u0006\u0010/\u001a\u00020)H\u0000¢\u0006\u0002\b0J&\u00101\u001a\u00020\f*\u00020#2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b2\u00103J!\u00104\u001a\u00020)*\u00020*2\u0006\u0010\t\u001a\u00020+2\u0006\u0010,\u001a\u00020)H\u0000¢\u0006\u0002\b5J!\u00106\u001a\u00020)*\u00020*2\u0006\u0010\t\u001a\u00020+2\u0006\u0010/\u001a\u00020)H\u0000¢\u0006\u0002\b7R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0018\u00010\u0012R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00060\u0014R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\nX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000RU\u0010\u0003\u001a=\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0004¢\u0006\u0002\b\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006:"}, d2 = {"Landroidx/compose/ui/layout/IntermediateLayoutModifierNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "measureBlock", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/IntermediateMeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Lkotlin/ParameterName;", "name", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function3;)V", "closestLookaheadScope", "Landroidx/compose/ui/layout/LookaheadScope;", "intermediateMeasurable", "Landroidx/compose/ui/layout/IntermediateLayoutModifierNode$IntermediateMeasurablePlaceable;", "intermediateMeasureScope", "Landroidx/compose/ui/layout/IntermediateLayoutModifierNode$IntermediateMeasureScopeImpl;", "isIntermediateChangeActive", "", "()Z", "setIntermediateChangeActive", "(Z)V", "localLookaheadScope", "Landroidx/compose/ui/layout/LookaheadScopeImpl;", "lookaheadConstraints", "getMeasureBlock$ui_release", "()Lkotlin/jvm/functions/Function3;", "setMeasureBlock$ui_release", "onAttach", "", "intermediateMeasure", "Landroidx/compose/ui/layout/MeasureScope;", "lookaheadSize", "Landroidx/compose/ui/unit/IntSize;", "intermediateMeasure-Te-uZzU", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;JJJ)Landroidx/compose/ui/layout/MeasureResult;", "maxIntermediateIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntermediateIntrinsicHeight$ui_release", "maxIntermediateIntrinsicWidth", "height", "maxIntermediateIntrinsicWidth$ui_release", "measure", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntermediateIntrinsicHeight", "minIntermediateIntrinsicHeight$ui_release", "minIntermediateIntrinsicWidth", "minIntermediateIntrinsicWidth$ui_release", "IntermediateMeasurablePlaceable", "IntermediateMeasureScopeImpl", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IntermediateLayoutModifierNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.LayoutModifierNode {
    public static final int $stable = 8;
    private androidx.compose.ui.layout.LookaheadScope closestLookaheadScope;
    private androidx.compose.ui.layout.IntermediateLayoutModifierNode.IntermediateMeasurablePlaceable intermediateMeasurable;
    private final androidx.compose.ui.layout.IntermediateLayoutModifierNode.IntermediateMeasureScopeImpl intermediateMeasureScope = new androidx.compose.ui.layout.IntermediateLayoutModifierNode.IntermediateMeasureScopeImpl();
    private boolean isIntermediateChangeActive;
    private final androidx.compose.ui.layout.LookaheadScopeImpl localLookaheadScope;
    private androidx.compose.ui.unit.Constraints lookaheadConstraints;
    private kotlin.jvm.functions.Function3<? super androidx.compose.ui.layout.IntermediateMeasureScope, ? super androidx.compose.ui.layout.Measurable, ? super androidx.compose.ui.unit.Constraints, ? extends androidx.compose.ui.layout.MeasureResult> measureBlock;

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        int maxHeight$ui_release;
        maxHeight$ui_release = androidx.compose.ui.node.NodeMeasuringIntrinsics.INSTANCE.maxHeight$ui_release(new androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode$maxIntrinsicHeight$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final androidx.compose.ui.layout.MeasureResult mo3408measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
                return androidx.compose.ui.node.LayoutModifierNode.this.mo91measure3p2s80s(measureScope, measurable, j);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i);
        return maxHeight$ui_release;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        int maxWidth$ui_release;
        maxWidth$ui_release = androidx.compose.ui.node.NodeMeasuringIntrinsics.INSTANCE.maxWidth$ui_release(new androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode$maxIntrinsicWidth$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final androidx.compose.ui.layout.MeasureResult mo3408measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
                return androidx.compose.ui.node.LayoutModifierNode.this.mo91measure3p2s80s(measureScope, measurable, j);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i);
        return maxWidth$ui_release;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        int minHeight$ui_release;
        minHeight$ui_release = androidx.compose.ui.node.NodeMeasuringIntrinsics.INSTANCE.minHeight$ui_release(new androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode$minIntrinsicHeight$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final androidx.compose.ui.layout.MeasureResult mo3408measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
                return androidx.compose.ui.node.LayoutModifierNode.this.mo91measure3p2s80s(measureScope, measurable, j);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i);
        return minHeight$ui_release;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        int minWidth$ui_release;
        minWidth$ui_release = androidx.compose.ui.node.NodeMeasuringIntrinsics.INSTANCE.minWidth$ui_release(new androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode$minIntrinsicWidth$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final androidx.compose.ui.layout.MeasureResult mo3408measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
                return androidx.compose.ui.node.LayoutModifierNode.this.mo91measure3p2s80s(measureScope, measurable, j);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i);
        return minWidth$ui_release;
    }

    public final kotlin.jvm.functions.Function3<androidx.compose.ui.layout.IntermediateMeasureScope, androidx.compose.ui.layout.Measurable, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult> getMeasureBlock$ui_release() {
        return this.measureBlock;
    }

    public final void setMeasureBlock$ui_release(kotlin.jvm.functions.Function3<? super androidx.compose.ui.layout.IntermediateMeasureScope, ? super androidx.compose.ui.layout.Measurable, ? super androidx.compose.ui.unit.Constraints, ? extends androidx.compose.ui.layout.MeasureResult> function3) {
        this.measureBlock = function3;
    }

    public IntermediateLayoutModifierNode(kotlin.jvm.functions.Function3<? super androidx.compose.ui.layout.IntermediateMeasureScope, ? super androidx.compose.ui.layout.Measurable, ? super androidx.compose.ui.unit.Constraints, ? extends androidx.compose.ui.layout.MeasureResult> function3) {
        this.measureBlock = function3;
        androidx.compose.ui.layout.LookaheadScopeImpl lookaheadScopeImpl = new androidx.compose.ui.layout.LookaheadScopeImpl(new kotlin.jvm.functions.Function0<androidx.compose.ui.layout.LayoutCoordinates>() { // from class: androidx.compose.ui.layout.IntermediateLayoutModifierNode$localLookaheadScope$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.compose.ui.layout.LayoutCoordinates invoke() {
                androidx.compose.ui.node.NodeCoordinator coordinator$ui_release = androidx.compose.ui.layout.IntermediateLayoutModifierNode.this.getCoordinator();
                kotlin.jvm.internal.Intrinsics.checkNotNull(coordinator$ui_release);
                return coordinator$ui_release;
            }
        });
        this.localLookaheadScope = lookaheadScopeImpl;
        this.closestLookaheadScope = lookaheadScopeImpl;
        this.isIntermediateChangeActive = true;
    }

    /* renamed from: isIntermediateChangeActive, reason: from getter */
    public final boolean getIsIntermediateChangeActive() {
        return this.isIntermediateChangeActive;
    }

    public final void setIntermediateChangeActive(boolean z) {
        this.isIntermediateChangeActive = z;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        androidx.compose.ui.layout.LookaheadScopeImpl lookaheadScopeImpl;
        androidx.compose.ui.layout.LookaheadScopeImpl lookaheadScopeImpl2;
        androidx.compose.ui.node.NodeChain nodes;
        androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate;
        androidx.compose.ui.node.NodeCoordinator coordinator$ui_release = getCoordinator();
        if (((coordinator$ui_release == null || (lookaheadDelegate = coordinator$ui_release.getLookaheadDelegate()) == null) ? null : lookaheadDelegate.getLookaheadLayoutCoordinates()) == null) {
            throw new java.lang.IllegalStateException("could not fetch lookahead coordinates".toString());
        }
        androidx.compose.ui.layout.IntermediateLayoutModifierNode intermediateLayoutModifierNode = this;
        final androidx.compose.ui.node.LayoutNode lookaheadRoot = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(intermediateLayoutModifierNode).getLookaheadRoot();
        if (lookaheadRoot != null && lookaheadRoot.getIsVirtualLookaheadRoot()) {
            lookaheadScopeImpl2 = new androidx.compose.ui.layout.LookaheadScopeImpl(new kotlin.jvm.functions.Function0<androidx.compose.ui.layout.LayoutCoordinates>() { // from class: androidx.compose.ui.layout.IntermediateLayoutModifierNode$onAttach$2
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final androidx.compose.ui.layout.LayoutCoordinates invoke() {
                    androidx.compose.ui.node.LayoutNode parent$ui_release = androidx.compose.ui.node.LayoutNode.this.getParent$ui_release();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(parent$ui_release);
                    return parent$ui_release.getInnerCoordinator$ui_release().getCoordinates();
                }
            });
        } else {
            int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(512);
            if (!intermediateLayoutModifierNode.getNode().getIsAttached()) {
                throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            androidx.compose.ui.Modifier.Node parent = intermediateLayoutModifierNode.getNode().getParent();
            androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(intermediateLayoutModifierNode);
            androidx.compose.ui.layout.IntermediateLayoutModifierNode intermediateLayoutModifierNode2 = null;
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & m3613constructorimpl) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & m3613constructorimpl) != 0) {
                            androidx.compose.runtime.collection.MutableVector mutableVector = null;
                            androidx.compose.ui.Modifier.Node node = parent;
                            while (node != null) {
                                if (node instanceof androidx.compose.ui.layout.IntermediateLayoutModifierNode) {
                                    intermediateLayoutModifierNode2 = (androidx.compose.ui.layout.IntermediateLayoutModifierNode) node;
                                } else if ((node.getKindSet() & m3613constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                                    int i = 0;
                                    for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                        if ((delegate.getKindSet() & m3613constructorimpl) != 0) {
                                            i++;
                                            if (i == 1) {
                                                node = delegate;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                                }
                                                if (node != null) {
                                                    if (mutableVector != null) {
                                                        mutableVector.add(node);
                                                    }
                                                    node = null;
                                                }
                                                if (mutableVector != null) {
                                                    mutableVector.add(delegate);
                                                }
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                node = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                parent = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
            }
            if (intermediateLayoutModifierNode2 == null || (lookaheadScopeImpl = intermediateLayoutModifierNode2.localLookaheadScope) == null) {
                lookaheadScopeImpl = this.localLookaheadScope;
            }
            lookaheadScopeImpl2 = lookaheadScopeImpl;
        }
        this.closestLookaheadScope = lookaheadScopeImpl2;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public androidx.compose.ui.layout.MeasureResult mo91measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        final androidx.compose.ui.layout.Placeable mo3402measureBRTryo0 = measurable.mo3402measureBRTryo0(j);
        return androidx.compose.ui.layout.MeasureScope.CC.layout$default(measureScope, mo3402measureBRTryo0.getWidth(), mo3402measureBRTryo0.getHeight(), null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.ui.layout.IntermediateLayoutModifierNode$measure$1$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, androidx.compose.ui.layout.Placeable.this, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* renamed from: intermediateMeasure-Te-uZzU, reason: not valid java name */
    public final androidx.compose.ui.layout.MeasureResult m3404intermediateMeasureTeuZzU(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j, long j2, long j3) {
        this.intermediateMeasureScope.m3407setLookaheadSizeozmzZPI(j2);
        this.lookaheadConstraints = androidx.compose.ui.unit.Constraints.m4412boximpl(j3);
        androidx.compose.ui.layout.IntermediateLayoutModifierNode.IntermediateMeasurablePlaceable intermediateMeasurablePlaceable = this.intermediateMeasurable;
        if (intermediateMeasurablePlaceable == null) {
            intermediateMeasurablePlaceable = new androidx.compose.ui.layout.IntermediateLayoutModifierNode.IntermediateMeasurablePlaceable(measurable);
        }
        this.intermediateMeasurable = intermediateMeasurablePlaceable;
        intermediateMeasurablePlaceable.setWrappedMeasurable(measurable);
        return this.measureBlock.invoke(this.intermediateMeasureScope, intermediateMeasurablePlaceable, androidx.compose.ui.unit.Constraints.m4412boximpl(j));
    }

    public final int minIntermediateIntrinsicWidth$ui_release(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        return androidx.compose.ui.node.NodeMeasuringIntrinsics.INSTANCE.minWidth$ui_release(new androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.layout.IntermediateLayoutModifierNode$minIntermediateIntrinsicWidth$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final androidx.compose.ui.layout.MeasureResult mo3408measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
                return androidx.compose.ui.layout.IntermediateLayoutModifierNode.this.getMeasureBlock$ui_release().invoke(androidx.compose.ui.layout.IntermediateLayoutModifierNode.this.intermediateMeasureScope, measurable, androidx.compose.ui.unit.Constraints.m4412boximpl(j));
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    public final int minIntermediateIntrinsicHeight$ui_release(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        return androidx.compose.ui.node.NodeMeasuringIntrinsics.INSTANCE.minHeight$ui_release(new androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.layout.IntermediateLayoutModifierNode$minIntermediateIntrinsicHeight$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final androidx.compose.ui.layout.MeasureResult mo3408measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
                return androidx.compose.ui.layout.IntermediateLayoutModifierNode.this.getMeasureBlock$ui_release().invoke(androidx.compose.ui.layout.IntermediateLayoutModifierNode.this.intermediateMeasureScope, measurable, androidx.compose.ui.unit.Constraints.m4412boximpl(j));
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    public final int maxIntermediateIntrinsicWidth$ui_release(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        return androidx.compose.ui.node.NodeMeasuringIntrinsics.INSTANCE.maxWidth$ui_release(new androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.layout.IntermediateLayoutModifierNode$maxIntermediateIntrinsicWidth$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final androidx.compose.ui.layout.MeasureResult mo3408measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
                return androidx.compose.ui.layout.IntermediateLayoutModifierNode.this.getMeasureBlock$ui_release().invoke(androidx.compose.ui.layout.IntermediateLayoutModifierNode.this.intermediateMeasureScope, measurable, androidx.compose.ui.unit.Constraints.m4412boximpl(j));
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    public final int maxIntermediateIntrinsicHeight$ui_release(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        return androidx.compose.ui.node.NodeMeasuringIntrinsics.INSTANCE.maxHeight$ui_release(new androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.layout.IntermediateLayoutModifierNode$maxIntermediateIntrinsicHeight$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s, reason: not valid java name */
            public final androidx.compose.ui.layout.MeasureResult mo3408measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
                return androidx.compose.ui.layout.IntermediateLayoutModifierNode.this.getMeasureBlock$ui_release().invoke(androidx.compose.ui.layout.IntermediateLayoutModifierNode.this.intermediateMeasureScope, measurable, androidx.compose.ui.unit.Constraints.m4412boximpl(j));
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    /* compiled from: IntermediateLayoutModifierNode.kt */
    @kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0096\u0002J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0013H\u0016J\u001a\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u0010\u0010 \u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0013H\u0016J=\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0019\u0010'\u001a\u0015\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\"\u0018\u00010(¢\u0006\u0002\b*H\u0014ø\u0001\u0000¢\u0006\u0004\b+\u0010,R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Landroidx/compose/ui/layout/IntermediateLayoutModifierNode$IntermediateMeasurablePlaceable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/Placeable;", "wrappedMeasurable", "(Landroidx/compose/ui/layout/IntermediateLayoutModifierNode;Landroidx/compose/ui/layout/Measurable;)V", "parentData", "", "getParentData", "()Ljava/lang/Object;", "getWrappedMeasurable", "()Landroidx/compose/ui/layout/Measurable;", "setWrappedMeasurable", "(Landroidx/compose/ui/layout/Measurable;)V", "wrappedPlaceable", "getWrappedPlaceable", "()Landroidx/compose/ui/layout/Placeable;", "setWrappedPlaceable", "(Landroidx/compose/ui/layout/Placeable;)V", "get", "", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "maxIntrinsicHeight", "width", "maxIntrinsicWidth", "height", "measure", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "minIntrinsicHeight", "minIntrinsicWidth", "placeAt", "", "position", "Landroidx/compose/ui/unit/IntOffset;", "zIndex", "", "layerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class IntermediateMeasurablePlaceable extends androidx.compose.ui.layout.Placeable implements androidx.compose.ui.layout.Measurable {
        private androidx.compose.ui.layout.Measurable wrappedMeasurable;
        private androidx.compose.ui.layout.Placeable wrappedPlaceable;

        public IntermediateMeasurablePlaceable(androidx.compose.ui.layout.Measurable measurable) {
            this.wrappedMeasurable = measurable;
        }

        public final androidx.compose.ui.layout.Measurable getWrappedMeasurable() {
            return this.wrappedMeasurable;
        }

        public final void setWrappedMeasurable(androidx.compose.ui.layout.Measurable measurable) {
            this.wrappedMeasurable = measurable;
        }

        public final androidx.compose.ui.layout.Placeable getWrappedPlaceable() {
            return this.wrappedPlaceable;
        }

        public final void setWrappedPlaceable(androidx.compose.ui.layout.Placeable placeable) {
            this.wrappedPlaceable = placeable;
        }

        @Override // androidx.compose.ui.layout.Measurable
        /* renamed from: measure-BRTryo0 */
        public androidx.compose.ui.layout.Placeable mo3402measureBRTryo0(long constraints) {
            androidx.compose.ui.layout.Placeable mo3402measureBRTryo0;
            long lookaheadSize;
            if (androidx.compose.ui.layout.IntermediateLayoutModifierNode.this.getIsIntermediateChangeActive()) {
                mo3402measureBRTryo0 = this.wrappedMeasurable.mo3402measureBRTryo0(constraints);
                m3455setMeasurementConstraintsBRTryo0(constraints);
                m3454setMeasuredSizeozmzZPI(androidx.compose.ui.unit.IntSizeKt.IntSize(mo3402measureBRTryo0.getWidth(), mo3402measureBRTryo0.getHeight()));
            } else {
                androidx.compose.ui.layout.Measurable measurable = this.wrappedMeasurable;
                androidx.compose.ui.unit.Constraints constraints2 = androidx.compose.ui.layout.IntermediateLayoutModifierNode.this.lookaheadConstraints;
                kotlin.jvm.internal.Intrinsics.checkNotNull(constraints2);
                mo3402measureBRTryo0 = measurable.mo3402measureBRTryo0(constraints2.getValue());
                androidx.compose.ui.layout.IntermediateLayoutModifierNode intermediateLayoutModifierNode = androidx.compose.ui.layout.IntermediateLayoutModifierNode.this;
                androidx.compose.ui.unit.Constraints constraints3 = intermediateLayoutModifierNode.lookaheadConstraints;
                kotlin.jvm.internal.Intrinsics.checkNotNull(constraints3);
                m3455setMeasurementConstraintsBRTryo0(constraints3.getValue());
                if (!intermediateLayoutModifierNode.getIsIntermediateChangeActive()) {
                    lookaheadSize = intermediateLayoutModifierNode.intermediateMeasureScope.getLookaheadSize();
                } else {
                    lookaheadSize = androidx.compose.ui.unit.IntSizeKt.IntSize(mo3402measureBRTryo0.getWidth(), mo3402measureBRTryo0.getHeight());
                }
                m3454setMeasuredSizeozmzZPI(lookaheadSize);
            }
            this.wrappedPlaceable = mo3402measureBRTryo0;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.compose.ui.layout.Placeable
        /* renamed from: placeAt-f8xVGno */
        public void mo3403placeAtf8xVGno(long position, float zIndex, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> layerBlock) {
            kotlin.Unit unit;
            if (!androidx.compose.ui.layout.IntermediateLayoutModifierNode.this.getIsIntermediateChangeActive()) {
                position = androidx.compose.ui.unit.IntOffset.INSTANCE.m4620getZeronOccac();
            }
            androidx.compose.ui.node.NodeCoordinator coordinator = androidx.compose.ui.layout.IntermediateLayoutModifierNode.this.getNode().getCoordinator();
            kotlin.jvm.internal.Intrinsics.checkNotNull(coordinator);
            androidx.compose.ui.layout.Placeable.PlacementScope placementScope = coordinator.getPlacementScope();
            if (layerBlock != null) {
                androidx.compose.ui.layout.Placeable placeable = this.wrappedPlaceable;
                if (placeable != null) {
                    placementScope.m3465placeWithLayeraW9wM(placeable, position, zIndex, layerBlock);
                    unit = kotlin.Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit != null) {
                    return;
                }
            }
            androidx.compose.ui.layout.Placeable placeable2 = this.wrappedPlaceable;
            if (placeable2 != null) {
                placementScope.m3460place70tqf50(placeable2, position, zIndex);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            }
        }

        @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
        public java.lang.Object getParentData() {
            return this.wrappedMeasurable.getParentData();
        }

        @Override // androidx.compose.ui.layout.Measured
        public int get(androidx.compose.ui.layout.AlignmentLine alignmentLine) {
            androidx.compose.ui.layout.Placeable placeable = this.wrappedPlaceable;
            kotlin.jvm.internal.Intrinsics.checkNotNull(placeable);
            return placeable.get(alignmentLine);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int height) {
            return this.wrappedMeasurable.minIntrinsicWidth(height);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int height) {
            return this.wrappedMeasurable.maxIntrinsicWidth(height);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int width) {
            return this.wrappedMeasurable.minIntrinsicHeight(width);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int width) {
            return this.wrappedMeasurable.maxIntrinsicHeight(width);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: IntermediateLayoutModifierNode.kt */
    @kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0083\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003JE\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020$0'2\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020+0*¢\u0006\u0002\b,H\u0016J\f\u0010-\u001a\u00020\u001d*\u00020\u001dH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\u0016X\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u00020\u001d*\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, d2 = {"Landroidx/compose/ui/layout/IntermediateLayoutModifierNode$IntermediateMeasureScopeImpl;", "Landroidx/compose/ui/layout/IntermediateMeasureScope;", "Lkotlinx/coroutines/CoroutineScope;", "(Landroidx/compose/ui/layout/IntermediateLayoutModifierNode;)V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "density", "", "getDensity", "()F", "fontScale", "getFontScale", "isLookingAhead", "", "()Z", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "lookaheadSize", "Landroidx/compose/ui/unit/IntSize;", "getLookaheadSize-YbymL2g", "()J", "setLookaheadSize-ozmzZPI", "(J)V", "J", "lookaheadScopeCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getLookaheadScopeCoordinates", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)Landroidx/compose/ui/layout/LayoutCoordinates;", "layout", "Landroidx/compose/ui/layout/MeasureResult;", "width", "", "height", "alignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "placementBlock", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "toLookaheadCoordinates", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    final class IntermediateMeasureScopeImpl implements androidx.compose.ui.layout.IntermediateMeasureScope, kotlinx.coroutines.CoroutineScope {
        private long lookaheadSize = androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g();

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public boolean isLookingAhead() {
            return false;
        }

        @Override // androidx.compose.ui.layout.LookaheadScope
        /* renamed from: localLookaheadPositionOf-dBAh8RU, reason: not valid java name */
        public /* synthetic */ long mo3406localLookaheadPositionOfdBAh8RU(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates2) {
            long mo3410localPositionOfR5De75A;
            mo3410localPositionOfR5De75A = toLookaheadCoordinates(layoutCoordinates).mo3410localPositionOfR5De75A(toLookaheadCoordinates(layoutCoordinates2), androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0());
            return mo3410localPositionOfR5De75A;
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx--R2X_6o */
        public /* synthetic */ int mo308roundToPxR2X_6o(long j) {
            return androidx.compose.ui.unit.Density.CC.m4442$default$roundToPxR2X_6o(this, j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx-0680j_4 */
        public /* synthetic */ int mo309roundToPx0680j_4(float f) {
            return androidx.compose.ui.unit.Density.CC.m4443$default$roundToPx0680j_4(this, f);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: toDp-GaN1DYA */
        public /* synthetic */ float mo310toDpGaN1DYA(long j) {
            return androidx.compose.ui.unit.FontScaling.CC.m4587$default$toDpGaN1DYA(this, j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public /* synthetic */ float mo311toDpu2uoSUM(float f) {
            return androidx.compose.ui.unit.Density.CC.m4444$default$toDpu2uoSUM(this, f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public /* synthetic */ float mo312toDpu2uoSUM(int i) {
            return androidx.compose.ui.unit.Density.CC.m4445$default$toDpu2uoSUM((androidx.compose.ui.unit.Density) this, i);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDpSize-k-rfVVM */
        public /* synthetic */ long mo313toDpSizekrfVVM(long j) {
            return androidx.compose.ui.unit.Density.CC.m4446$default$toDpSizekrfVVM(this, j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx--R2X_6o */
        public /* synthetic */ float mo314toPxR2X_6o(long j) {
            return androidx.compose.ui.unit.Density.CC.m4447$default$toPxR2X_6o(this, j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx-0680j_4 */
        public /* synthetic */ float mo315toPx0680j_4(float f) {
            return androidx.compose.ui.unit.Density.CC.m4448$default$toPx0680j_4(this, f);
        }

        @Override // androidx.compose.ui.unit.Density
        public /* synthetic */ androidx.compose.ui.geometry.Rect toRect(androidx.compose.ui.unit.DpRect dpRect) {
            return androidx.compose.ui.unit.Density.CC.$default$toRect(this, dpRect);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSize-XkaWNTQ */
        public /* synthetic */ long mo316toSizeXkaWNTQ(long j) {
            return androidx.compose.ui.unit.Density.CC.m4449$default$toSizeXkaWNTQ(this, j);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: toSp-0xMU5do */
        public /* synthetic */ long mo317toSp0xMU5do(float f) {
            return androidx.compose.ui.unit.FontScaling.CC.m4588$default$toSp0xMU5do(this, f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public /* synthetic */ long mo318toSpkPz2Gy4(float f) {
            return androidx.compose.ui.unit.Density.CC.m4450$default$toSpkPz2Gy4(this, f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public /* synthetic */ long mo319toSpkPz2Gy4(int i) {
            return androidx.compose.ui.unit.Density.CC.m4451$default$toSpkPz2Gy4((androidx.compose.ui.unit.Density) this, i);
        }

        public IntermediateMeasureScopeImpl() {
        }

        @Override // androidx.compose.ui.layout.IntermediateMeasureScope
        /* renamed from: getLookaheadSize-YbymL2g, reason: not valid java name and from getter */
        public long getLookaheadSize() {
            return this.lookaheadSize;
        }

        /* renamed from: setLookaheadSize-ozmzZPI, reason: not valid java name */
        public void m3407setLookaheadSizeozmzZPI(long j) {
            this.lookaheadSize = j;
        }

        @Override // androidx.compose.ui.layout.LookaheadScope
        public androidx.compose.ui.layout.LayoutCoordinates toLookaheadCoordinates(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
            return androidx.compose.ui.layout.IntermediateLayoutModifierNode.this.closestLookaheadScope.toLookaheadCoordinates(layoutCoordinates);
        }

        @Override // androidx.compose.ui.layout.LookaheadScope
        public androidx.compose.ui.layout.LayoutCoordinates getLookaheadScopeCoordinates(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
            return androidx.compose.ui.layout.IntermediateLayoutModifierNode.this.closestLookaheadScope.getLookaheadScopeCoordinates(placementScope);
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        public androidx.compose.ui.layout.MeasureResult layout(final int width, final int height, final java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> alignmentLines, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit> placementBlock) {
            if ((width & androidx.core.view.ViewCompat.MEASURED_STATE_MASK) == 0 && ((-16777216) & height) == 0) {
                final androidx.compose.ui.layout.IntermediateLayoutModifierNode intermediateLayoutModifierNode = androidx.compose.ui.layout.IntermediateLayoutModifierNode.this;
                return new androidx.compose.ui.layout.MeasureResult(width, height, alignmentLines, placementBlock, intermediateLayoutModifierNode) { // from class: androidx.compose.ui.layout.IntermediateLayoutModifierNode$IntermediateMeasureScopeImpl$layout$1
                    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit> $placementBlock;
                    private final java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> alignmentLines;
                    private final int height;
                    final /* synthetic */ androidx.compose.ui.layout.IntermediateLayoutModifierNode this$0;
                    private final int width;

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.$placementBlock = placementBlock;
                        this.this$0 = intermediateLayoutModifierNode;
                        this.width = width;
                        this.height = height;
                        this.alignmentLines = alignmentLines;
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public int getWidth() {
                        return this.width;
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public int getHeight() {
                        return this.height;
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> getAlignmentLines() {
                        return this.alignmentLines;
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public void placeChildren() {
                        kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit> function1 = this.$placementBlock;
                        androidx.compose.ui.node.NodeCoordinator coordinator$ui_release = this.this$0.getCoordinator();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(coordinator$ui_release);
                        function1.invoke(coordinator$ui_release.getPlacementScope());
                    }
                };
            }
            throw new java.lang.IllegalStateException(("Size(" + width + " x " + height + ") is out of range. Each dimension must be between 0 and 16777215.").toString());
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public androidx.compose.ui.unit.LayoutDirection getLayoutDirection() {
            androidx.compose.ui.node.NodeCoordinator coordinator$ui_release = androidx.compose.ui.layout.IntermediateLayoutModifierNode.this.getCoordinator();
            kotlin.jvm.internal.Intrinsics.checkNotNull(coordinator$ui_release);
            return coordinator$ui_release.getLayoutDirection();
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            androidx.compose.ui.node.NodeCoordinator coordinator$ui_release = androidx.compose.ui.layout.IntermediateLayoutModifierNode.this.getCoordinator();
            kotlin.jvm.internal.Intrinsics.checkNotNull(coordinator$ui_release);
            return coordinator$ui_release.getDensity();
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            androidx.compose.ui.node.NodeCoordinator coordinator$ui_release = androidx.compose.ui.layout.IntermediateLayoutModifierNode.this.getCoordinator();
            kotlin.jvm.internal.Intrinsics.checkNotNull(coordinator$ui_release);
            return coordinator$ui_release.getFontScale();
        }

        @Override // kotlinx.coroutines.CoroutineScope
        public kotlin.coroutines.CoroutineContext getCoroutineContext() {
            return androidx.compose.ui.layout.IntermediateLayoutModifierNode.this.getCoroutineScope().getCoroutineContext();
        }
    }
}
