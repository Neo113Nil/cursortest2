package androidx.compose.ui.layout;

/* compiled from: SubcomposeLayout.kt */
@kotlin.Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001:\u0003cdeB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J%\u0010+\u001a\u00020,2\u001d\u0010-\u001a\u0019\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002010.¢\u0006\u0002\b2J!\u00103\u001a\u0002012\u0006\u00104\u001a\u0002012\u000e\b\u0004\u00105\u001a\b\u0012\u0004\u0012\u00020706H\u0082\bJ\u0010\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u0010H\u0002J\b\u0010:\u001a\u000207H\u0002J\u000e\u0010;\u001a\u0002072\u0006\u0010<\u001a\u00020\u0010J\b\u0010=\u001a\u000207H\u0002J\u0006\u0010>\u001a\u000207J\u0012\u0010?\u001a\u0004\u0018\u00010\u00182\u0006\u00109\u001a\u00020\u0010H\u0002J\u0017\u0010@\u001a\u0002072\f\u0010-\u001a\b\u0012\u0004\u0012\u00020706H\u0082\bJ\u0006\u0010A\u001a\u000207J\u0010\u0010B\u001a\u0002072\u0006\u0010C\u001a\u00020DH\u0002J\"\u0010E\u001a\u0002072\u0006\u0010F\u001a\u00020\u00102\u0006\u0010G\u001a\u00020\u00102\b\b\u0002\u0010H\u001a\u00020\u0010H\u0002J\b\u0010I\u001a\u000207H\u0016J\b\u0010J\u001a\u000207H\u0016J\b\u0010K\u001a\u000207H\u0016J0\u0010L\u001a\b\u0012\u0004\u0012\u00020N0M2\b\u0010O\u001a\u0004\u0018\u00010\u00182\u0011\u0010P\u001a\r\u0012\u0004\u0012\u00020706¢\u0006\u0002\bQH\u0002¢\u0006\u0002\u0010RJ(\u0010S\u001a\u00020\u001d2\b\u0010O\u001a\u0004\u0018\u00010\u00182\u0011\u0010P\u001a\r\u0012\u0004\u0012\u00020706¢\u0006\u0002\bQ¢\u0006\u0002\u0010TJ\u0018\u0010U\u001a\u0002072\u0006\u0010V\u001a\u00020\u00032\u0006\u0010W\u001a\u00020\u0014H\u0002J2\u0010U\u001a\u0002072\u0006\u0010V\u001a\u00020\u00032\b\u0010O\u001a\u0004\u0018\u00010\u00182\u0011\u0010P\u001a\r\u0012\u0004\u0012\u00020706¢\u0006\u0002\bQH\u0002¢\u0006\u0002\u0010XJ.\u0010U\u001a\b\u0012\u0004\u0012\u00020N0M2\b\u0010O\u001a\u0004\u0018\u00010\u00182\u0011\u0010P\u001a\r\u0012\u0004\u0012\u00020706¢\u0006\u0002\bQ¢\u0006\u0002\u0010RJB\u0010Y\u001a\u00020Z2\b\u0010[\u001a\u0004\u0018\u00010Z2\u0006\u0010\\\u001a\u00020\u00032\u0006\u0010]\u001a\u00020D2\u0006\u0010^\u001a\u00020\n2\u0011\u0010_\u001a\r\u0012\u0004\u0012\u00020706¢\u0006\u0002\bQH\u0002¢\u0006\u0002\u0010`J\u0014\u0010a\u001a\u0004\u0018\u00010\u00032\b\u0010O\u001a\u0004\u0018\u00010\u0018H\u0002J\f\u0010b\u001a\u000207*\u00020\u0003H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00140\u0013j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014`\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0019\u001a\u00060\u001aR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\u001e\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00030\u0013j\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u0003`\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010#\u001a\u00060$R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010%\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00030\u0013j\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u0003`\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0004\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006f"}, d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "root", "Landroidx/compose/ui/node/LayoutNode;", "slotReusePolicy", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;)V", "NoIntrinsicsMessage", "", "compositionContext", "Landroidx/compose/runtime/CompositionContext;", "getCompositionContext", "()Landroidx/compose/runtime/CompositionContext;", "setCompositionContext", "(Landroidx/compose/runtime/CompositionContext;)V", "currentIndex", "", "currentPostLookaheadIndex", "nodeToNodeState", "Ljava/util/HashMap;", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;", "Lkotlin/collections/HashMap;", "postLookaheadComposedSlotIds", "Landroidx/compose/runtime/collection/MutableVector;", "", "postLookaheadMeasureScope", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$PostLookaheadMeasureScopeImpl;", "postLookaheadPrecomposeSlotHandleMap", "", "Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "precomposeMap", "precomposedCount", "reusableCount", "reusableSlotIdsSet", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;", "scope", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$Scope;", "slotIdToNode", "value", "getSlotReusePolicy", "()Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "setSlotReusePolicy", "(Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;)V", "createMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "block", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "createMeasureResult", "result", "placeChildrenBlock", "Lkotlin/Function0;", "", "createNodeAt", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "disposeCurrentNodes", "disposeOrReuseStartingFromIndex", "startIndex", "disposeUnusedSlotsInPostLookahead", "forceRecomposeChildren", "getSlotIdAtIndex", "ignoreRemeasureRequests", "makeSureStateIsConsistent", "markActiveNodesAsReused", "deactivate", "", "move", com.google.firebase.messaging.Constants.MessagePayloadKeys.FROM, "to", com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT, "onDeactivate", "onRelease", "onReuse", "postLookaheadSubcompose", "", "Landroidx/compose/ui/layout/Measurable;", "slotId", "content", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "precompose", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "subcompose", "node", "nodeState", "(Landroidx/compose/ui/node/LayoutNode;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "subcomposeInto", "Landroidx/compose/runtime/ReusableComposition;", "existing", "container", "reuseContent", "parent", "composable", "(Landroidx/compose/runtime/ReusableComposition;Landroidx/compose/ui/node/LayoutNode;ZLandroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/ReusableComposition;", "takeNodeFromReusables", "resetLayoutState", "NodeState", "PostLookaheadMeasureScopeImpl", "Scope", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutNodeSubcompositionsState implements androidx.compose.runtime.ComposeNodeLifecycleCallback {
    public static final int $stable = 8;
    private androidx.compose.runtime.CompositionContext compositionContext;
    private int currentIndex;
    private int currentPostLookaheadIndex;
    private int precomposedCount;
    private int reusableCount;
    private final androidx.compose.ui.node.LayoutNode root;
    private androidx.compose.ui.layout.SubcomposeSlotReusePolicy slotReusePolicy;
    private final java.util.HashMap<androidx.compose.ui.node.LayoutNode, androidx.compose.ui.layout.LayoutNodeSubcompositionsState.NodeState> nodeToNodeState = new java.util.HashMap<>();
    private final java.util.HashMap<java.lang.Object, androidx.compose.ui.node.LayoutNode> slotIdToNode = new java.util.HashMap<>();
    private final androidx.compose.ui.layout.LayoutNodeSubcompositionsState.Scope scope = new androidx.compose.ui.layout.LayoutNodeSubcompositionsState.Scope();
    private final androidx.compose.ui.layout.LayoutNodeSubcompositionsState.PostLookaheadMeasureScopeImpl postLookaheadMeasureScope = new androidx.compose.ui.layout.LayoutNodeSubcompositionsState.PostLookaheadMeasureScopeImpl();
    private final java.util.HashMap<java.lang.Object, androidx.compose.ui.node.LayoutNode> precomposeMap = new java.util.HashMap<>();
    private final androidx.compose.ui.layout.SubcomposeSlotReusePolicy.SlotIdsSet reusableSlotIdsSet = new androidx.compose.ui.layout.SubcomposeSlotReusePolicy.SlotIdsSet(null, 1, null);
    private final java.util.Map<java.lang.Object, androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle> postLookaheadPrecomposeSlotHandleMap = new java.util.LinkedHashMap();
    private final androidx.compose.runtime.collection.MutableVector<java.lang.Object> postLookaheadComposedSlotIds = new androidx.compose.runtime.collection.MutableVector<>(new java.lang.Object[16], 0);
    private final java.lang.String NoIntrinsicsMessage = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    public LayoutNodeSubcompositionsState(androidx.compose.ui.node.LayoutNode layoutNode, androidx.compose.ui.layout.SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        this.root = layoutNode;
        this.slotReusePolicy = subcomposeSlotReusePolicy;
    }

    public final androidx.compose.runtime.CompositionContext getCompositionContext() {
        return this.compositionContext;
    }

    public final void setCompositionContext(androidx.compose.runtime.CompositionContext compositionContext) {
        this.compositionContext = compositionContext;
    }

    public final androidx.compose.ui.layout.SubcomposeSlotReusePolicy getSlotReusePolicy() {
        return this.slotReusePolicy;
    }

    public final void setSlotReusePolicy(androidx.compose.ui.layout.SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        if (this.slotReusePolicy != subcomposeSlotReusePolicy) {
            this.slotReusePolicy = subcomposeSlotReusePolicy;
            markActiveNodesAsReused(false);
            androidx.compose.ui.node.LayoutNode.requestRemeasure$ui_release$default(this.root, false, false, 3, null);
        }
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        markActiveNodesAsReused(false);
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        markActiveNodesAsReused(true);
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        disposeCurrentNodes();
    }

    public final java.util.List<androidx.compose.ui.layout.Measurable> subcompose(java.lang.Object slotId, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content) {
        makeSureStateIsConsistent();
        androidx.compose.ui.node.LayoutNode.LayoutState layoutState$ui_release = this.root.getLayoutState$ui_release();
        if (layoutState$ui_release != androidx.compose.ui.node.LayoutNode.LayoutState.Measuring && layoutState$ui_release != androidx.compose.ui.node.LayoutNode.LayoutState.LayingOut && layoutState$ui_release != androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadMeasuring && layoutState$ui_release != androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut) {
            throw new java.lang.IllegalStateException("subcompose can only be used inside the measure or layout blocks".toString());
        }
        java.util.HashMap<java.lang.Object, androidx.compose.ui.node.LayoutNode> hashMap = this.slotIdToNode;
        androidx.compose.ui.node.LayoutNode layoutNode = hashMap.get(slotId);
        if (layoutNode == null) {
            layoutNode = this.precomposeMap.remove(slotId);
            if (layoutNode != null) {
                int i = this.precomposedCount;
                if (i <= 0) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                this.precomposedCount = i - 1;
            } else {
                layoutNode = takeNodeFromReusables(slotId);
                if (layoutNode == null) {
                    layoutNode = createNodeAt(this.currentIndex);
                }
            }
            hashMap.put(slotId, layoutNode);
        }
        androidx.compose.ui.node.LayoutNode layoutNode2 = layoutNode;
        if (kotlin.collections.CollectionsKt.getOrNull(this.root.getFoldedChildren$ui_release(), this.currentIndex) != layoutNode2) {
            int indexOf = this.root.getFoldedChildren$ui_release().indexOf(layoutNode2);
            int i2 = this.currentIndex;
            if (indexOf < i2) {
                throw new java.lang.IllegalArgumentException(("Key \"" + slotId + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.").toString());
            }
            if (i2 != indexOf) {
                move$default(this, indexOf, i2, 0, 4, null);
            }
        }
        this.currentIndex++;
        subcompose(layoutNode2, slotId, content);
        if (layoutState$ui_release == androidx.compose.ui.node.LayoutNode.LayoutState.Measuring || layoutState$ui_release == androidx.compose.ui.node.LayoutNode.LayoutState.LayingOut) {
            return layoutNode2.getChildMeasurables$ui_release();
        }
        return layoutNode2.getChildLookaheadMeasurables$ui_release();
    }

    private final void subcompose(androidx.compose.ui.node.LayoutNode node, java.lang.Object slotId, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content) {
        java.util.HashMap<androidx.compose.ui.node.LayoutNode, androidx.compose.ui.layout.LayoutNodeSubcompositionsState.NodeState> hashMap = this.nodeToNodeState;
        androidx.compose.ui.layout.LayoutNodeSubcompositionsState.NodeState nodeState = hashMap.get(node);
        if (nodeState == null) {
            nodeState = new androidx.compose.ui.layout.LayoutNodeSubcompositionsState.NodeState(slotId, androidx.compose.ui.layout.ComposableSingletons$SubcomposeLayoutKt.INSTANCE.m3392getLambda1$ui_release(), null, 4, null);
            hashMap.put(node, nodeState);
        }
        androidx.compose.ui.layout.LayoutNodeSubcompositionsState.NodeState nodeState2 = nodeState;
        androidx.compose.runtime.ReusableComposition composition = nodeState2.getComposition();
        boolean hasInvalidations = composition != null ? composition.getHasInvalidations() : true;
        if (nodeState2.getContent() != content || hasInvalidations || nodeState2.getForceRecompose()) {
            nodeState2.setContent(content);
            subcompose(node, nodeState2);
            nodeState2.setForceRecompose(false);
        }
    }

    private final void subcompose(androidx.compose.ui.node.LayoutNode node, final androidx.compose.ui.layout.LayoutNodeSubcompositionsState.NodeState nodeState) {
        androidx.compose.runtime.snapshots.Snapshot createNonObservableSnapshot = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.createNonObservableSnapshot();
        try {
            androidx.compose.runtime.snapshots.Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            try {
                androidx.compose.ui.node.LayoutNode layoutNode = this.root;
                layoutNode.ignoreRemeasureRequests = true;
                final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> content = nodeState.getContent();
                androidx.compose.runtime.ReusableComposition composition = nodeState.getComposition();
                androidx.compose.runtime.CompositionContext compositionContext = this.compositionContext;
                if (compositionContext != null) {
                    nodeState.setComposition(subcomposeInto(composition, node, nodeState.getForceReuse(), compositionContext, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1750409193, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$subcompose$3$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                            invoke(composer, num.intValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(androidx.compose.runtime.Composer composer, int i) {
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C477@20610L46:SubcomposeLayout.kt#80mrfh");
                            if ((i & 11) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-1750409193, i, -1, "androidx.compose.ui.layout.LayoutNodeSubcompositionsState.subcompose.<anonymous>.<anonymous>.<anonymous> (SubcomposeLayout.kt:477)");
                            }
                            boolean active = androidx.compose.ui.layout.LayoutNodeSubcompositionsState.NodeState.this.getActive();
                            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = content;
                            composer.startReusableGroup(207, java.lang.Boolean.valueOf(active));
                            boolean changed = composer.changed(active);
                            if (active) {
                                function2.invoke(composer, 0);
                            } else {
                                composer.deactivateToEndGroup(changed);
                            }
                            composer.endReusableGroup();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                        }
                    })));
                    nodeState.setForceReuse(false);
                    layoutNode.ignoreRemeasureRequests = false;
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    return;
                }
                throw new java.lang.IllegalStateException("parent composition reference not set".toString());
            } finally {
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
            }
        } finally {
            createNonObservableSnapshot.dispose();
        }
    }

    private final androidx.compose.runtime.ReusableComposition subcomposeInto(androidx.compose.runtime.ReusableComposition existing, androidx.compose.ui.node.LayoutNode container, boolean reuseContent, androidx.compose.runtime.CompositionContext parent, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> composable) {
        if (existing == null || existing.getDisposed()) {
            existing = androidx.compose.ui.platform.Wrapper_androidKt.createSubcomposition(container, parent);
        }
        if (!reuseContent) {
            existing.setContent(composable);
        } else {
            existing.setContentWithReuse(composable);
        }
        return existing;
    }

    private final java.lang.Object getSlotIdAtIndex(int index) {
        androidx.compose.ui.layout.LayoutNodeSubcompositionsState.NodeState nodeState = this.nodeToNodeState.get(this.root.getFoldedChildren$ui_release().get(index));
        kotlin.jvm.internal.Intrinsics.checkNotNull(nodeState);
        return nodeState.getSlotId();
    }

    public final void disposeOrReuseStartingFromIndex(int startIndex) {
        this.reusableCount = 0;
        int size = (this.root.getFoldedChildren$ui_release().size() - this.precomposedCount) - 1;
        if (startIndex <= size) {
            this.reusableSlotIdsSet.clear();
            if (startIndex <= size) {
                int i = startIndex;
                while (true) {
                    this.reusableSlotIdsSet.add(getSlotIdAtIndex(i));
                    if (i == size) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            this.slotReusePolicy.getSlotsToRetain(this.reusableSlotIdsSet);
            androidx.compose.runtime.snapshots.Snapshot createNonObservableSnapshot = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.createNonObservableSnapshot();
            try {
                androidx.compose.runtime.snapshots.Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                boolean z = false;
                while (size >= startIndex) {
                    try {
                        androidx.compose.ui.node.LayoutNode layoutNode = this.root.getFoldedChildren$ui_release().get(size);
                        androidx.compose.ui.layout.LayoutNodeSubcompositionsState.NodeState nodeState = this.nodeToNodeState.get(layoutNode);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(nodeState);
                        androidx.compose.ui.layout.LayoutNodeSubcompositionsState.NodeState nodeState2 = nodeState;
                        java.lang.Object slotId = nodeState2.getSlotId();
                        if (this.reusableSlotIdsSet.contains(slotId)) {
                            this.reusableCount++;
                            if (nodeState2.getActive()) {
                                resetLayoutState(layoutNode);
                                nodeState2.setActive(false);
                                z = true;
                            }
                        } else {
                            androidx.compose.ui.node.LayoutNode layoutNode2 = this.root;
                            layoutNode2.ignoreRemeasureRequests = true;
                            this.nodeToNodeState.remove(layoutNode);
                            androidx.compose.runtime.ReusableComposition composition = nodeState2.getComposition();
                            if (composition != null) {
                                composition.dispose();
                            }
                            this.root.removeAt$ui_release(size, 1);
                            layoutNode2.ignoreRemeasureRequests = false;
                        }
                        this.slotIdToNode.remove(slotId);
                        size--;
                    } finally {
                        createNonObservableSnapshot.restoreCurrent(makeCurrent);
                    }
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                if (z) {
                    androidx.compose.runtime.snapshots.Snapshot.INSTANCE.sendApplyNotifications();
                }
            } finally {
                createNonObservableSnapshot.dispose();
            }
        }
        makeSureStateIsConsistent();
    }

    private final void markActiveNodesAsReused(boolean deactivate) {
        androidx.compose.ui.layout.SubcomposeLayoutKt$ReusedSlotId$1 subcomposeLayoutKt$ReusedSlotId$1;
        this.precomposedCount = 0;
        this.precomposeMap.clear();
        int size = this.root.getFoldedChildren$ui_release().size();
        if (this.reusableCount != size) {
            this.reusableCount = size;
            androidx.compose.runtime.snapshots.Snapshot createNonObservableSnapshot = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.createNonObservableSnapshot();
            try {
                androidx.compose.runtime.snapshots.Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                for (int i = 0; i < size; i++) {
                    try {
                        androidx.compose.ui.node.LayoutNode layoutNode = this.root.getFoldedChildren$ui_release().get(i);
                        androidx.compose.ui.layout.LayoutNodeSubcompositionsState.NodeState nodeState = this.nodeToNodeState.get(layoutNode);
                        if (nodeState != null && nodeState.getActive()) {
                            resetLayoutState(layoutNode);
                            if (deactivate) {
                                androidx.compose.runtime.ReusableComposition composition = nodeState.getComposition();
                                if (composition != null) {
                                    composition.deactivate();
                                }
                                nodeState.setActiveState(androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null));
                            } else {
                                nodeState.setActive(false);
                            }
                            subcomposeLayoutKt$ReusedSlotId$1 = androidx.compose.ui.layout.SubcomposeLayoutKt.ReusedSlotId;
                            nodeState.setSlotId(subcomposeLayoutKt$ReusedSlotId$1);
                        }
                    } finally {
                        createNonObservableSnapshot.restoreCurrent(makeCurrent);
                    }
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                createNonObservableSnapshot.dispose();
                this.slotIdToNode.clear();
            } catch (java.lang.Throwable th) {
                createNonObservableSnapshot.dispose();
                throw th;
            }
        }
        makeSureStateIsConsistent();
    }

    private final void disposeCurrentNodes() {
        androidx.compose.ui.node.LayoutNode layoutNode = this.root;
        layoutNode.ignoreRemeasureRequests = true;
        java.util.Iterator<T> it = this.nodeToNodeState.values().iterator();
        while (it.hasNext()) {
            androidx.compose.runtime.ReusableComposition composition = ((androidx.compose.ui.layout.LayoutNodeSubcompositionsState.NodeState) it.next()).getComposition();
            if (composition != null) {
                composition.dispose();
            }
        }
        this.root.removeAll$ui_release();
        layoutNode.ignoreRemeasureRequests = false;
        this.nodeToNodeState.clear();
        this.slotIdToNode.clear();
        this.precomposedCount = 0;
        this.reusableCount = 0;
        this.precomposeMap.clear();
        makeSureStateIsConsistent();
    }

    public final void makeSureStateIsConsistent() {
        int size = this.root.getFoldedChildren$ui_release().size();
        if (this.nodeToNodeState.size() != size) {
            throw new java.lang.IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + this.nodeToNodeState.size() + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
        }
        if ((size - this.reusableCount) - this.precomposedCount >= 0) {
            if (this.precomposeMap.size() == this.precomposedCount) {
                return;
            }
            throw new java.lang.IllegalArgumentException(("Incorrect state. Precomposed children " + this.precomposedCount + ". Map size " + this.precomposeMap.size()).toString());
        }
        throw new java.lang.IllegalArgumentException(("Incorrect state. Total children " + size + ". Reusable children " + this.reusableCount + ". Precomposed children " + this.precomposedCount).toString());
    }

    private final void resetLayoutState(androidx.compose.ui.node.LayoutNode layoutNode) {
        layoutNode.getMeasurePassDelegate$ui_release().setMeasuredByParent$ui_release(androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed);
        androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNode.getLookaheadPassDelegate$ui_release();
        if (lookaheadPassDelegate$ui_release != null) {
            lookaheadPassDelegate$ui_release.setMeasuredByParent$ui_release(androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed);
        }
    }

    private final androidx.compose.ui.node.LayoutNode takeNodeFromReusables(java.lang.Object slotId) {
        int i;
        androidx.compose.ui.layout.SubcomposeLayoutKt$ReusedSlotId$1 subcomposeLayoutKt$ReusedSlotId$1;
        if (this.reusableCount == 0) {
            return null;
        }
        int size = this.root.getFoldedChildren$ui_release().size() - this.precomposedCount;
        int i2 = size - this.reusableCount;
        int i3 = size - 1;
        int i4 = i3;
        while (true) {
            if (i4 < i2) {
                i = -1;
                break;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(getSlotIdAtIndex(i4), slotId)) {
                i = i4;
                break;
            }
            i4--;
        }
        if (i == -1) {
            while (i3 >= i2) {
                androidx.compose.ui.layout.LayoutNodeSubcompositionsState.NodeState nodeState = this.nodeToNodeState.get(this.root.getFoldedChildren$ui_release().get(i3));
                kotlin.jvm.internal.Intrinsics.checkNotNull(nodeState);
                androidx.compose.ui.layout.LayoutNodeSubcompositionsState.NodeState nodeState2 = nodeState;
                java.lang.Object slotId2 = nodeState2.getSlotId();
                subcomposeLayoutKt$ReusedSlotId$1 = androidx.compose.ui.layout.SubcomposeLayoutKt.ReusedSlotId;
                if (slotId2 == subcomposeLayoutKt$ReusedSlotId$1 || this.slotReusePolicy.areCompatible(slotId, nodeState2.getSlotId())) {
                    nodeState2.setSlotId(slotId);
                    i4 = i3;
                    i = i4;
                    break;
                }
                i3--;
            }
            i4 = i3;
        }
        if (i == -1) {
            return null;
        }
        if (i4 != i2) {
            move(i4, i2, 1);
        }
        this.reusableCount--;
        androidx.compose.ui.node.LayoutNode layoutNode = this.root.getFoldedChildren$ui_release().get(i2);
        androidx.compose.ui.layout.LayoutNodeSubcompositionsState.NodeState nodeState3 = this.nodeToNodeState.get(layoutNode);
        kotlin.jvm.internal.Intrinsics.checkNotNull(nodeState3);
        androidx.compose.ui.layout.LayoutNodeSubcompositionsState.NodeState nodeState4 = nodeState3;
        nodeState4.setActiveState(androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null));
        nodeState4.setForceReuse(true);
        nodeState4.setForceRecompose(true);
        return layoutNode;
    }

    public final androidx.compose.ui.layout.MeasurePolicy createMeasurePolicy(final kotlin.jvm.functions.Function2<? super androidx.compose.ui.layout.SubcomposeMeasureScope, ? super androidx.compose.ui.unit.Constraints, ? extends androidx.compose.ui.layout.MeasureResult> block) {
        final java.lang.String str = this.NoIntrinsicsMessage;
        return new androidx.compose.ui.node.LayoutNode.NoIntrinsicsMeasurePolicy(str) { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public androidx.compose.ui.layout.MeasureResult mo39measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
                final int i;
                androidx.compose.ui.layout.LayoutNodeSubcompositionsState.PostLookaheadMeasureScopeImpl postLookaheadMeasureScopeImpl;
                final int i2;
                androidx.compose.ui.layout.LayoutNodeSubcompositionsState.this.scope.setLayoutDirection(measureScope.getLayoutDirection());
                androidx.compose.ui.layout.LayoutNodeSubcompositionsState.this.scope.setDensity(measureScope.getDensity());
                androidx.compose.ui.layout.LayoutNodeSubcompositionsState.this.scope.setFontScale(measureScope.getFontScale());
                if (measureScope.isLookingAhead() || androidx.compose.ui.layout.LayoutNodeSubcompositionsState.this.root.getLookaheadRoot() == null) {
                    androidx.compose.ui.layout.LayoutNodeSubcompositionsState.this.currentIndex = 0;
                    final androidx.compose.ui.layout.MeasureResult invoke = block.invoke(androidx.compose.ui.layout.LayoutNodeSubcompositionsState.this.scope, androidx.compose.ui.unit.Constraints.m4412boximpl(j));
                    i = androidx.compose.ui.layout.LayoutNodeSubcompositionsState.this.currentIndex;
                    final androidx.compose.ui.layout.LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = androidx.compose.ui.layout.LayoutNodeSubcompositionsState.this;
                    return new androidx.compose.ui.layout.MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure-3p2s80s$$inlined$createMeasureResult$2
                        @Override // androidx.compose.ui.layout.MeasureResult
                        public java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> getAlignmentLines() {
                            return invoke.getAlignmentLines();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        /* renamed from: getHeight */
                        public int get$height() {
                            return invoke.get$height();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        /* renamed from: getWidth */
                        public int get$width() {
                            return invoke.get$width();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public void placeChildren() {
                            int i3;
                            layoutNodeSubcompositionsState.currentIndex = i;
                            invoke.placeChildren();
                            androidx.compose.ui.layout.LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = layoutNodeSubcompositionsState;
                            i3 = layoutNodeSubcompositionsState2.currentIndex;
                            layoutNodeSubcompositionsState2.disposeOrReuseStartingFromIndex(i3);
                        }
                    };
                }
                androidx.compose.ui.layout.LayoutNodeSubcompositionsState.this.currentPostLookaheadIndex = 0;
                kotlin.jvm.functions.Function2<androidx.compose.ui.layout.SubcomposeMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult> function2 = block;
                postLookaheadMeasureScopeImpl = androidx.compose.ui.layout.LayoutNodeSubcompositionsState.this.postLookaheadMeasureScope;
                final androidx.compose.ui.layout.MeasureResult invoke2 = function2.invoke(postLookaheadMeasureScopeImpl, androidx.compose.ui.unit.Constraints.m4412boximpl(j));
                i2 = androidx.compose.ui.layout.LayoutNodeSubcompositionsState.this.currentPostLookaheadIndex;
                final androidx.compose.ui.layout.LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = androidx.compose.ui.layout.LayoutNodeSubcompositionsState.this;
                return new androidx.compose.ui.layout.MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure-3p2s80s$$inlined$createMeasureResult$1
                    @Override // androidx.compose.ui.layout.MeasureResult
                    public java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> getAlignmentLines() {
                        return invoke2.getAlignmentLines();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    /* renamed from: getHeight */
                    public int get$height() {
                        return invoke2.get$height();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    /* renamed from: getWidth */
                    public int get$width() {
                        return invoke2.get$width();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public void placeChildren() {
                        layoutNodeSubcompositionsState2.currentPostLookaheadIndex = i2;
                        invoke2.placeChildren();
                        layoutNodeSubcompositionsState2.disposeUnusedSlotsInPostLookahead();
                    }
                };
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disposeUnusedSlotsInPostLookahead() {
        kotlin.collections.CollectionsKt.removeAll(this.postLookaheadPrecomposeSlotHandleMap.entrySet(), new kotlin.jvm.functions.Function1<java.util.Map.Entry<java.lang.Object, androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle>, java.lang.Boolean>() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$disposeUnusedSlotsInPostLookahead$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Boolean invoke(java.util.Map.Entry<java.lang.Object, androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle> entry) {
                androidx.compose.runtime.collection.MutableVector mutableVector;
                boolean z;
                int i;
                java.lang.Object key = entry.getKey();
                androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle value = entry.getValue();
                mutableVector = androidx.compose.ui.layout.LayoutNodeSubcompositionsState.this.postLookaheadComposedSlotIds;
                int indexOf = mutableVector.indexOf(key);
                if (indexOf >= 0) {
                    i = androidx.compose.ui.layout.LayoutNodeSubcompositionsState.this.currentPostLookaheadIndex;
                    if (indexOf < i) {
                        z = false;
                        return java.lang.Boolean.valueOf(z);
                    }
                }
                value.dispose();
                z = true;
                return java.lang.Boolean.valueOf(z);
            }
        });
    }

    private final androidx.compose.ui.layout.MeasureResult createMeasureResult(final androidx.compose.ui.layout.MeasureResult result, final kotlin.jvm.functions.Function0<kotlin.Unit> placeChildrenBlock) {
        return new androidx.compose.ui.layout.MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasureResult$1
            @Override // androidx.compose.ui.layout.MeasureResult
            public java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> getAlignmentLines() {
                return result.getAlignmentLines();
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            /* renamed from: getHeight */
            public int get$height() {
                return result.get$height();
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            /* renamed from: getWidth */
            public int get$width() {
                return result.get$width();
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
                placeChildrenBlock.invoke();
            }
        };
    }

    public final androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle precompose(final java.lang.Object slotId, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content) {
        if (!this.root.isAttached()) {
            return new androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$precompose$1
                @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
                public void dispose() {
                }

                @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
                public /* synthetic */ int getPlaceablesCount() {
                    return androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle.CC.$default$getPlaceablesCount(this);
                }

                @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
                /* renamed from: premeasure-0kLqBqw, reason: not valid java name */
                public /* synthetic */ void mo3420premeasure0kLqBqw(int i, long j) {
                    androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle.CC.m3492$default$premeasure0kLqBqw(this, i, j);
                }
            };
        }
        makeSureStateIsConsistent();
        if (!this.slotIdToNode.containsKey(slotId)) {
            this.postLookaheadPrecomposeSlotHandleMap.remove(slotId);
            java.util.HashMap<java.lang.Object, androidx.compose.ui.node.LayoutNode> hashMap = this.precomposeMap;
            androidx.compose.ui.node.LayoutNode layoutNode = hashMap.get(slotId);
            if (layoutNode == null) {
                layoutNode = takeNodeFromReusables(slotId);
                if (layoutNode != null) {
                    move(this.root.getFoldedChildren$ui_release().indexOf(layoutNode), this.root.getFoldedChildren$ui_release().size(), 1);
                    this.precomposedCount++;
                } else {
                    layoutNode = createNodeAt(this.root.getFoldedChildren$ui_release().size());
                    this.precomposedCount++;
                }
                hashMap.put(slotId, layoutNode);
            }
            subcompose(layoutNode, slotId, content);
        }
        return new androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$precompose$2
            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public void dispose() {
                java.util.HashMap hashMap2;
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                androidx.compose.ui.layout.LayoutNodeSubcompositionsState.this.makeSureStateIsConsistent();
                hashMap2 = androidx.compose.ui.layout.LayoutNodeSubcompositionsState.this.precomposeMap;
                androidx.compose.ui.node.LayoutNode layoutNode2 = (androidx.compose.ui.node.LayoutNode) hashMap2.remove(slotId);
                if (layoutNode2 != null) {
                    i = androidx.compose.ui.layout.LayoutNodeSubcompositionsState.this.precomposedCount;
                    if (i > 0) {
                        int indexOf = androidx.compose.ui.layout.LayoutNodeSubcompositionsState.this.root.getFoldedChildren$ui_release().indexOf(layoutNode2);
                        int size = androidx.compose.ui.layout.LayoutNodeSubcompositionsState.this.root.getFoldedChildren$ui_release().size();
                        i2 = androidx.compose.ui.layout.LayoutNodeSubcompositionsState.this.precomposedCount;
                        if (indexOf < size - i2) {
                            throw new java.lang.IllegalStateException("Item is not in pre-composed item range".toString());
                        }
                        androidx.compose.ui.layout.LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = androidx.compose.ui.layout.LayoutNodeSubcompositionsState.this;
                        i3 = layoutNodeSubcompositionsState.reusableCount;
                        layoutNodeSubcompositionsState.reusableCount = i3 + 1;
                        androidx.compose.ui.layout.LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = androidx.compose.ui.layout.LayoutNodeSubcompositionsState.this;
                        i4 = layoutNodeSubcompositionsState2.precomposedCount;
                        layoutNodeSubcompositionsState2.precomposedCount = i4 - 1;
                        int size2 = androidx.compose.ui.layout.LayoutNodeSubcompositionsState.this.root.getFoldedChildren$ui_release().size();
                        i5 = androidx.compose.ui.layout.LayoutNodeSubcompositionsState.this.precomposedCount;
                        int i7 = size2 - i5;
                        i6 = androidx.compose.ui.layout.LayoutNodeSubcompositionsState.this.reusableCount;
                        int i8 = i7 - i6;
                        androidx.compose.ui.layout.LayoutNodeSubcompositionsState.this.move(indexOf, i8, 1);
                        androidx.compose.ui.layout.LayoutNodeSubcompositionsState.this.disposeOrReuseStartingFromIndex(i8);
                        return;
                    }
                    throw new java.lang.IllegalStateException("No pre-composed items to dispose".toString());
                }
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public int getPlaceablesCount() {
                java.util.HashMap hashMap2;
                java.util.List<androidx.compose.ui.node.LayoutNode> children$ui_release;
                hashMap2 = androidx.compose.ui.layout.LayoutNodeSubcompositionsState.this.precomposeMap;
                androidx.compose.ui.node.LayoutNode layoutNode2 = (androidx.compose.ui.node.LayoutNode) hashMap2.get(slotId);
                if (layoutNode2 == null || (children$ui_release = layoutNode2.getChildren$ui_release()) == null) {
                    return 0;
                }
                return children$ui_release.size();
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            /* renamed from: premeasure-0kLqBqw */
            public void mo3420premeasure0kLqBqw(int index, long constraints) {
                java.util.HashMap hashMap2;
                hashMap2 = androidx.compose.ui.layout.LayoutNodeSubcompositionsState.this.precomposeMap;
                androidx.compose.ui.node.LayoutNode layoutNode2 = (androidx.compose.ui.node.LayoutNode) hashMap2.get(slotId);
                if (layoutNode2 == null || !layoutNode2.isAttached()) {
                    return;
                }
                int size = layoutNode2.getChildren$ui_release().size();
                if (index < 0 || index >= size) {
                    throw new java.lang.IndexOutOfBoundsException("Index (" + index + ") is out of bound of [0, " + size + ')');
                }
                if (!layoutNode2.isPlaced()) {
                    androidx.compose.ui.node.LayoutNode layoutNode3 = androidx.compose.ui.layout.LayoutNodeSubcompositionsState.this.root;
                    layoutNode3.ignoreRemeasureRequests = true;
                    androidx.compose.ui.node.LayoutNodeKt.requireOwner(layoutNode2).mo3669measureAndLayout0kLqBqw(layoutNode2.getChildren$ui_release().get(index), constraints);
                    layoutNode3.ignoreRemeasureRequests = false;
                    return;
                }
                throw new java.lang.IllegalArgumentException("Pre-measure called on node that is not placed".toString());
            }
        };
    }

    public final void forceRecomposeChildren() {
        if (this.reusableCount != this.root.getFoldedChildren$ui_release().size()) {
            java.util.Iterator<java.util.Map.Entry<androidx.compose.ui.node.LayoutNode, androidx.compose.ui.layout.LayoutNodeSubcompositionsState.NodeState>> it = this.nodeToNodeState.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().setForceRecompose(true);
            }
            if (this.root.getMeasurePending$ui_release()) {
                return;
            }
            androidx.compose.ui.node.LayoutNode.requestRemeasure$ui_release$default(this.root, false, false, 3, null);
        }
    }

    private final androidx.compose.ui.node.LayoutNode createNodeAt(int index) {
        androidx.compose.ui.node.LayoutNode layoutNode = new androidx.compose.ui.node.LayoutNode(true, 0, 2, null);
        androidx.compose.ui.node.LayoutNode layoutNode2 = this.root;
        layoutNode2.ignoreRemeasureRequests = true;
        this.root.insertAt$ui_release(index, layoutNode);
        layoutNode2.ignoreRemeasureRequests = false;
        return layoutNode;
    }

    static /* synthetic */ void move$default(androidx.compose.ui.layout.LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        layoutNodeSubcompositionsState.move(i, i2, i3);
    }

    private final void ignoreRemeasureRequests(kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        androidx.compose.ui.node.LayoutNode layoutNode = this.root;
        layoutNode.ignoreRemeasureRequests = true;
        block.invoke();
        layoutNode.ignoreRemeasureRequests = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SubcomposeLayout.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0002\u0018\u00002\u00020\u0001B.\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR$\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR'\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u0010R\u001a\u0010#\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000e\"\u0004\b%\u0010\u0010R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006*"}, d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;", "", "slotId", "content", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "composition", "Landroidx/compose/runtime/ReusableComposition;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/ReusableComposition;)V", "value", "", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "getActive", "()Z", "setActive", "(Z)V", "activeState", "Landroidx/compose/runtime/MutableState;", "getActiveState", "()Landroidx/compose/runtime/MutableState;", "setActiveState", "(Landroidx/compose/runtime/MutableState;)V", "getComposition", "()Landroidx/compose/runtime/ReusableComposition;", "setComposition", "(Landroidx/compose/runtime/ReusableComposition;)V", "getContent", "()Lkotlin/jvm/functions/Function2;", "setContent", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "forceRecompose", "getForceRecompose", "setForceRecompose", "forceReuse", "getForceReuse", "setForceReuse", "getSlotId", "()Ljava/lang/Object;", "setSlotId", "(Ljava/lang/Object;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class NodeState {
        private androidx.compose.runtime.MutableState<java.lang.Boolean> activeState;
        private androidx.compose.runtime.ReusableComposition composition;
        private kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content;
        private boolean forceRecompose;
        private boolean forceReuse;
        private java.lang.Object slotId;

        public NodeState(java.lang.Object obj, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.ReusableComposition reusableComposition) {
            this.slotId = obj;
            this.content = function2;
            this.composition = reusableComposition;
            this.activeState = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
        }

        public /* synthetic */ NodeState(java.lang.Object obj, kotlin.jvm.functions.Function2 function2, androidx.compose.runtime.ReusableComposition reusableComposition, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, function2, (i & 4) != 0 ? null : reusableComposition);
        }

        public final java.lang.Object getSlotId() {
            return this.slotId;
        }

        public final void setSlotId(java.lang.Object obj) {
            this.slotId = obj;
        }

        public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getContent() {
            return this.content;
        }

        public final void setContent(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2) {
            this.content = function2;
        }

        public final androidx.compose.runtime.ReusableComposition getComposition() {
            return this.composition;
        }

        public final void setComposition(androidx.compose.runtime.ReusableComposition reusableComposition) {
            this.composition = reusableComposition;
        }

        public final boolean getForceRecompose() {
            return this.forceRecompose;
        }

        public final void setForceRecompose(boolean z) {
            this.forceRecompose = z;
        }

        public final boolean getForceReuse() {
            return this.forceReuse;
        }

        public final void setForceReuse(boolean z) {
            this.forceReuse = z;
        }

        public final androidx.compose.runtime.MutableState<java.lang.Boolean> getActiveState() {
            return this.activeState;
        }

        public final void setActiveState(androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState) {
            this.activeState = mutableState;
        }

        public final boolean getActive() {
            return this.activeState.getValue().booleanValue();
        }

        public final void setActive(boolean z) {
            this.activeState.setValue(java.lang.Boolean.valueOf(z));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SubcomposeLayout.kt */
    @kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JE\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00180\u001b2\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001e¢\u0006\u0002\b!H\u0016J0\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\b\u0010%\u001a\u0004\u0018\u00010&2\u0011\u0010'\u001a\r\u0012\u0004\u0012\u00020 0(¢\u0006\u0002\b)H\u0016¢\u0006\u0002\u0010*R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006+"}, d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$Scope;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)V", "density", "", "getDensity", "()F", "setDensity", "(F)V", "fontScale", "getFontScale", "setFontScale", "isLookingAhead", "", "()Z", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layout", "Landroidx/compose/ui/layout/MeasureResult;", "width", "", "height", "alignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "placementBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "subcompose", "", "Landroidx/compose/ui/layout/Measurable;", "slotId", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    final class Scope implements androidx.compose.ui.layout.SubcomposeMeasureScope {
        private float density;
        private float fontScale;
        private androidx.compose.ui.unit.LayoutDirection layoutDirection = androidx.compose.ui.unit.LayoutDirection.Rtl;

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

        public Scope() {
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public androidx.compose.ui.unit.LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        public void setLayoutDirection(androidx.compose.ui.unit.LayoutDirection layoutDirection) {
            this.layoutDirection = layoutDirection;
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.density;
        }

        public void setDensity(float f) {
            this.density = f;
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return this.fontScale;
        }

        public void setFontScale(float f) {
            this.fontScale = f;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public boolean isLookingAhead() {
            return androidx.compose.ui.layout.LayoutNodeSubcompositionsState.this.root.getLayoutState$ui_release() == androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut || androidx.compose.ui.layout.LayoutNodeSubcompositionsState.this.root.getLayoutState$ui_release() == androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadMeasuring;
        }

        @Override // androidx.compose.ui.layout.SubcomposeMeasureScope
        public java.util.List<androidx.compose.ui.layout.Measurable> subcompose(java.lang.Object slotId, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content) {
            return androidx.compose.ui.layout.LayoutNodeSubcompositionsState.this.subcompose(slotId, content);
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        public androidx.compose.ui.layout.MeasureResult layout(final int width, final int height, final java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> alignmentLines, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit> placementBlock) {
            if ((width & androidx.core.view.ViewCompat.MEASURED_STATE_MASK) == 0 && ((-16777216) & height) == 0) {
                final androidx.compose.ui.layout.LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = androidx.compose.ui.layout.LayoutNodeSubcompositionsState.this;
                return new androidx.compose.ui.layout.MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$Scope$layout$1
                    @Override // androidx.compose.ui.layout.MeasureResult
                    /* renamed from: getWidth, reason: from getter */
                    public int get$width() {
                        return width;
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    /* renamed from: getHeight, reason: from getter */
                    public int get$height() {
                        return height;
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> getAlignmentLines() {
                        return alignmentLines;
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public void placeChildren() {
                        androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate;
                        if (!this.isLookingAhead() || (lookaheadDelegate = layoutNodeSubcompositionsState.root.getInnerCoordinator$ui_release().getLookaheadDelegate()) == null) {
                            placementBlock.invoke(layoutNodeSubcompositionsState.root.getInnerCoordinator$ui_release().getPlacementScope());
                        } else {
                            placementBlock.invoke(lookaheadDelegate.getPlacementScope());
                        }
                    }
                };
            }
            throw new java.lang.IllegalStateException(("Size(" + width + " x " + height + ") is out of range. Each dimension must be between 0 and 16777215.").toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SubcomposeLayout.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003JH\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00140\u00172\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a¢\u0006\u0002\b\u001dH\u0096\u0001J0\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0011\u0010#\u001a\r\u0012\u0004\u0012\u00020\u001c0$¢\u0006\u0002\b%H\u0016¢\u0006\u0002\u0010&J\u0017\u0010'\u001a\u00020\u0014*\u00020(H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u0017\u0010'\u001a\u00020\u0014*\u00020+H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020(*\u00020+H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b/\u00100J\u001a\u0010.\u001a\u00020(*\u00020\u0005H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u00102J\u001a\u0010.\u001a\u00020(*\u00020\u0014H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u00103J\u0017\u00104\u001a\u000205*\u000206H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\u0005*\u00020(H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b:\u00102J\u0017\u00109\u001a\u00020\u0005*\u00020+H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b;\u00100J\r\u0010<\u001a\u00020=*\u00020>H\u0097\u0001J\u0017\u0010?\u001a\u000206*\u000205H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b@\u00108J\u0017\u0010A\u001a\u00020+*\u00020(H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ\u001a\u0010A\u001a\u00020+*\u00020\u0005H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bD\u0010CJ\u001a\u0010A\u001a\u00020+*\u00020\u0014H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bD\u0010ER\u0014\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006F"}, d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$PostLookaheadMeasureScopeImpl;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)V", "density", "", "getDensity", "()F", "fontScale", "getFontScale", "isLookingAhead", "", "()Z", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layout", "Landroidx/compose/ui/layout/MeasureResult;", "width", "", "height", "alignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "placementBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "subcompose", "", "Landroidx/compose/ui/layout/Measurable;", "slotId", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "roundToPx", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-GaN1DYA", "(J)F", "toDp-u2uoSUM", "(F)F", "(I)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toDpSize-k-rfVVM", "(J)J", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-0xMU5do", "(F)J", "toSp-kPz2Gy4", "(I)J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    final class PostLookaheadMeasureScopeImpl implements androidx.compose.ui.layout.SubcomposeMeasureScope, androidx.compose.ui.layout.MeasureScope {
        private final /* synthetic */ androidx.compose.ui.layout.LayoutNodeSubcompositionsState.Scope $$delegate_0;

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.$$delegate_0.getDensity();
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return this.$$delegate_0.getFontScale();
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public androidx.compose.ui.unit.LayoutDirection getLayoutDirection() {
            return this.$$delegate_0.getLayoutDirection();
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public boolean isLookingAhead() {
            return this.$$delegate_0.isLookingAhead();
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        public androidx.compose.ui.layout.MeasureResult layout(int width, int height, java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> alignmentLines, kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit> placementBlock) {
            return this.$$delegate_0.layout(width, height, alignmentLines, placementBlock);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx--R2X_6o */
        public int mo308roundToPxR2X_6o(long j) {
            return this.$$delegate_0.mo308roundToPxR2X_6o(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx-0680j_4 */
        public int mo309roundToPx0680j_4(float f) {
            return this.$$delegate_0.mo309roundToPx0680j_4(f);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: toDp-GaN1DYA */
        public float mo310toDpGaN1DYA(long j) {
            return this.$$delegate_0.mo310toDpGaN1DYA(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public float mo311toDpu2uoSUM(float f) {
            return this.$$delegate_0.mo311toDpu2uoSUM(f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public float mo312toDpu2uoSUM(int i) {
            return this.$$delegate_0.mo312toDpu2uoSUM(i);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDpSize-k-rfVVM */
        public long mo313toDpSizekrfVVM(long j) {
            return this.$$delegate_0.mo313toDpSizekrfVVM(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx--R2X_6o */
        public float mo314toPxR2X_6o(long j) {
            return this.$$delegate_0.mo314toPxR2X_6o(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx-0680j_4 */
        public float mo315toPx0680j_4(float f) {
            return this.$$delegate_0.mo315toPx0680j_4(f);
        }

        @Override // androidx.compose.ui.unit.Density
        public androidx.compose.ui.geometry.Rect toRect(androidx.compose.ui.unit.DpRect dpRect) {
            return this.$$delegate_0.toRect(dpRect);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSize-XkaWNTQ */
        public long mo316toSizeXkaWNTQ(long j) {
            return this.$$delegate_0.mo316toSizeXkaWNTQ(j);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: toSp-0xMU5do */
        public long mo317toSp0xMU5do(float f) {
            return this.$$delegate_0.mo317toSp0xMU5do(f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public long mo318toSpkPz2Gy4(float f) {
            return this.$$delegate_0.mo318toSpkPz2Gy4(f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public long mo319toSpkPz2Gy4(int i) {
            return this.$$delegate_0.mo319toSpkPz2Gy4(i);
        }

        public PostLookaheadMeasureScopeImpl() {
            this.$$delegate_0 = androidx.compose.ui.layout.LayoutNodeSubcompositionsState.this.scope;
        }

        @Override // androidx.compose.ui.layout.SubcomposeMeasureScope
        public java.util.List<androidx.compose.ui.layout.Measurable> subcompose(java.lang.Object slotId, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content) {
            androidx.compose.ui.node.LayoutNode layoutNode = (androidx.compose.ui.node.LayoutNode) androidx.compose.ui.layout.LayoutNodeSubcompositionsState.this.slotIdToNode.get(slotId);
            java.util.List<androidx.compose.ui.layout.Measurable> childMeasurables$ui_release = layoutNode != null ? layoutNode.getChildMeasurables$ui_release() : null;
            return childMeasurables$ui_release != null ? childMeasurables$ui_release : androidx.compose.ui.layout.LayoutNodeSubcompositionsState.this.postLookaheadSubcompose(slotId, content);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List<androidx.compose.ui.layout.Measurable> postLookaheadSubcompose(java.lang.Object slotId, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content) {
        if (this.postLookaheadComposedSlotIds.getSize() < this.currentPostLookaheadIndex) {
            throw new java.lang.IllegalArgumentException("Error: currentPostLookaheadIndex cannot be greater than the size of thepostLookaheadComposedSlotIds list.".toString());
        }
        int size = this.postLookaheadComposedSlotIds.getSize();
        int i = this.currentPostLookaheadIndex;
        if (size == i) {
            this.postLookaheadComposedSlotIds.add(slotId);
        } else {
            this.postLookaheadComposedSlotIds.set(i, slotId);
        }
        this.currentPostLookaheadIndex++;
        if (!this.precomposeMap.containsKey(slotId)) {
            this.postLookaheadPrecomposeSlotHandleMap.put(slotId, precompose(slotId, content));
            if (this.root.getLayoutState$ui_release() == androidx.compose.ui.node.LayoutNode.LayoutState.LayingOut) {
                this.root.requestLookaheadRelayout$ui_release(true);
            } else {
                androidx.compose.ui.node.LayoutNode.requestLookaheadRemeasure$ui_release$default(this.root, true, false, 2, null);
            }
        }
        androidx.compose.ui.node.LayoutNode layoutNode = this.precomposeMap.get(slotId);
        if (layoutNode != null) {
            java.util.List<androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate> childDelegates$ui_release = layoutNode.getMeasurePassDelegate$ui_release().getChildDelegates$ui_release();
            int size2 = childDelegates$ui_release.size();
            for (int i2 = 0; i2 < size2; i2++) {
                childDelegates$ui_release.get(i2).markDetachedFromParentLookaheadPass$ui_release();
            }
            if (childDelegates$ui_release != null) {
                return childDelegates$ui_release;
            }
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void move(int from, int to, int count) {
        androidx.compose.ui.node.LayoutNode layoutNode = this.root;
        layoutNode.ignoreRemeasureRequests = true;
        this.root.move$ui_release(from, to, count);
        layoutNode.ignoreRemeasureRequests = false;
    }
}
