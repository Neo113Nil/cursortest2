package androidx.compose.ui.node;

/* compiled from: MeasureAndLayoutDelegate.kt */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0000\u0018\u00002\u00020\u0001:\u0001OB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020(2\b\b\u0002\u0010*\u001a\u00020\bJ\"\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u00032\b\u0010-\u001a\u0004\u0018\u00010\u001dH\u0002ø\u0001\u0000¢\u0006\u0002\b.J\"\u0010/\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u00032\b\u0010-\u001a\u0004\u0018\u00010\u001dH\u0002ø\u0001\u0000¢\u0006\u0002\b0J\u0016\u00101\u001a\u00020(2\u0006\u0010,\u001a\u00020\u00032\u0006\u00102\u001a\u00020\bJ\u0018\u00103\u001a\u00020(2\u0006\u0010,\u001a\u00020\u00032\u0006\u00102\u001a\u00020\bH\u0002J\u0018\u00104\u001a\u00020\b2\u0010\b\u0002\u00105\u001a\n\u0012\u0004\u0012\u00020(\u0018\u000106J \u00104\u001a\u00020(2\u0006\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u001dø\u0001\u0000¢\u0006\u0004\b7\u00108J\u0006\u00109\u001a\u00020(J\u000e\u0010:\u001a\u00020(2\u0006\u0010;\u001a\u00020\u0003J\u0018\u0010<\u001a\u00020(2\u0006\u0010;\u001a\u00020\u00032\u0006\u00102\u001a\u00020\bH\u0002J\u0017\u0010=\u001a\u00020(2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020(06H\u0082\bJ\u000e\u0010?\u001a\u00020(2\u0006\u0010@\u001a\u00020\u0015J$\u0010A\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u00032\b\b\u0002\u00102\u001a\u00020\b2\b\b\u0002\u0010B\u001a\u00020\bH\u0002J\u0010\u0010C\u001a\u00020(2\u0006\u0010,\u001a\u00020\u0003H\u0002J\u0018\u0010D\u001a\u00020(2\u0006\u0010,\u001a\u00020\u00032\u0006\u00102\u001a\u00020\bH\u0002J\u0018\u0010E\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u00032\b\b\u0002\u0010F\u001a\u00020\bJ\u0018\u0010G\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u00032\b\b\u0002\u0010F\u001a\u00020\bJ\u000e\u0010H\u001a\u00020(2\u0006\u0010,\u001a\u00020\u0003J\u0018\u0010I\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u00032\b\b\u0002\u0010F\u001a\u00020\bJ\u0018\u0010J\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u00032\b\b\u0002\u0010F\u001a\u00020\bJ\u0018\u0010K\u001a\u00020(2\u0006\u0010-\u001a\u00020\u001dø\u0001\u0000¢\u0006\u0004\bL\u0010MJ\u0014\u0010N\u001a\u00020\b*\u00020\u00032\u0006\u00102\u001a\u00020\bH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R\u0018\u0010\u001e\u001a\u00020\b*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u00020\b*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0018\u0010#\u001a\u00020\b*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010 R\u0018\u0010%\u001a\u00020\b*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006P"}, d2 = {"Landroidx/compose/ui/node/MeasureAndLayoutDelegate;", "", "root", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "consistencyChecker", "Landroidx/compose/ui/node/LayoutTreeConsistencyChecker;", "duringMeasureLayout", "", "hasPendingMeasureOrLayout", "getHasPendingMeasureOrLayout", "()Z", "hasPendingOnPositionedCallbacks", "getHasPendingOnPositionedCallbacks", "<set-?>", "", "measureIteration", "getMeasureIteration", "()J", "onLayoutCompletedListeners", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "onPositionedDispatcher", "Landroidx/compose/ui/node/OnPositionedDispatcher;", "postponedMeasureRequests", "Landroidx/compose/ui/node/MeasureAndLayoutDelegate$PostponedRequest;", "relayoutNodes", "Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;", "rootConstraints", "Landroidx/compose/ui/unit/Constraints;", "canAffectParent", "getCanAffectParent", "(Landroidx/compose/ui/node/LayoutNode;)Z", "canAffectParentInLookahead", "getCanAffectParentInLookahead", "measureAffectsParent", "getMeasureAffectsParent", "measureAffectsParentLookahead", "getMeasureAffectsParentLookahead", "callOnLayoutCompletedListeners", "", "dispatchOnPositionedCallbacks", "forceDispatch", "doLookaheadRemeasure", "layoutNode", "constraints", "doLookaheadRemeasure-sdFAvZA", "doRemeasure", "doRemeasure-sdFAvZA", "forceMeasureTheSubtree", "affectsLookahead", "forceMeasureTheSubtreeInternal", "measureAndLayout", "onLayout", "Lkotlin/Function0;", "measureAndLayout-0kLqBqw", "(Landroidx/compose/ui/node/LayoutNode;J)V", "measureOnly", "onNodeDetached", "node", "onlyRemeasureIfScheduled", "performMeasureAndLayout", "block", "registerOnLayoutCompletedListener", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "remeasureAndRelayoutIfNeeded", "relayoutNeeded", "remeasureLookaheadRootsInSubtree", "remeasureOnly", "requestLookaheadRelayout", "forced", "requestLookaheadRemeasure", "requestOnPositionedCallback", "requestRelayout", "requestRemeasure", "updateRootConstraints", "updateRootConstraints-BRTryo0", "(J)V", "measurePending", "PostponedRequest", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MeasureAndLayoutDelegate {
    public static final int $stable = 8;
    private final androidx.compose.ui.node.LayoutTreeConsistencyChecker consistencyChecker;
    private boolean duringMeasureLayout;
    private long measureIteration;
    private final androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.Owner.OnLayoutCompletedListener> onLayoutCompletedListeners;
    private final androidx.compose.ui.node.OnPositionedDispatcher onPositionedDispatcher;
    private final androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.MeasureAndLayoutDelegate.PostponedRequest> postponedMeasureRequests;
    private final androidx.compose.ui.node.DepthSortedSetsForDifferentPasses relayoutNodes;
    private final androidx.compose.ui.node.LayoutNode root;
    private androidx.compose.ui.unit.Constraints rootConstraints;

    /* compiled from: MeasureAndLayoutDelegate.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.ui.node.LayoutNode.LayoutState.values().length];
            try {
                iArr[androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.node.LayoutNode.LayoutState.Measuring.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.compose.ui.node.LayoutNode.LayoutState.LayingOut.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[androidx.compose.ui.node.LayoutNode.LayoutState.Idle.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MeasureAndLayoutDelegate(androidx.compose.ui.node.LayoutNode layoutNode) {
        this.root = layoutNode;
        androidx.compose.ui.node.DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = new androidx.compose.ui.node.DepthSortedSetsForDifferentPasses(androidx.compose.ui.node.Owner.INSTANCE.getEnableExtraAssertions());
        this.relayoutNodes = depthSortedSetsForDifferentPasses;
        this.onPositionedDispatcher = new androidx.compose.ui.node.OnPositionedDispatcher();
        this.onLayoutCompletedListeners = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.ui.node.Owner.OnLayoutCompletedListener[16], 0);
        this.measureIteration = 1L;
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.MeasureAndLayoutDelegate.PostponedRequest> mutableVector = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.ui.node.MeasureAndLayoutDelegate.PostponedRequest[16], 0);
        this.postponedMeasureRequests = mutableVector;
        this.consistencyChecker = androidx.compose.ui.node.Owner.INSTANCE.getEnableExtraAssertions() ? new androidx.compose.ui.node.LayoutTreeConsistencyChecker(layoutNode, depthSortedSetsForDifferentPasses, mutableVector.asMutableList()) : null;
    }

    public final boolean getHasPendingMeasureOrLayout() {
        return this.relayoutNodes.isNotEmpty();
    }

    public final boolean getHasPendingOnPositionedCallbacks() {
        return this.onPositionedDispatcher.isNotEmpty();
    }

    public final long getMeasureIteration() {
        if (!this.duringMeasureLayout) {
            throw new java.lang.IllegalArgumentException("measureIteration should be only used during the measure/layout pass".toString());
        }
        return this.measureIteration;
    }

    /* renamed from: updateRootConstraints-BRTryo0, reason: not valid java name */
    public final void m3570updateRootConstraintsBRTryo0(long constraints) {
        androidx.compose.ui.unit.Constraints constraints2 = this.rootConstraints;
        if (constraints2 != null && androidx.compose.ui.unit.Constraints.m4417equalsimpl0(constraints2.getValue(), constraints)) {
            return;
        }
        if (!(!this.duringMeasureLayout)) {
            throw new java.lang.IllegalArgumentException("updateRootConstraints called while measuring".toString());
        }
        this.rootConstraints = androidx.compose.ui.unit.Constraints.m4412boximpl(constraints);
        if (this.root.getLookaheadRoot() != null) {
            this.root.markLookaheadMeasurePending$ui_release();
        }
        this.root.markMeasurePending$ui_release();
        androidx.compose.ui.node.DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = this.relayoutNodes;
        androidx.compose.ui.node.LayoutNode layoutNode = this.root;
        depthSortedSetsForDifferentPasses.add(layoutNode, layoutNode.getLookaheadRoot() != null);
    }

    public static /* synthetic */ boolean requestLookaheadRemeasure$default(androidx.compose.ui.node.MeasureAndLayoutDelegate measureAndLayoutDelegate, androidx.compose.ui.node.LayoutNode layoutNode, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return measureAndLayoutDelegate.requestLookaheadRemeasure(layoutNode, z);
    }

    public final boolean requestLookaheadRemeasure(androidx.compose.ui.node.LayoutNode layoutNode, boolean forced) {
        androidx.compose.ui.node.LayoutNode parent$ui_release;
        androidx.compose.ui.node.LayoutNode parent$ui_release2;
        if (layoutNode.getLookaheadRoot() == null) {
            throw new java.lang.IllegalStateException("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope".toString());
        }
        int i = androidx.compose.ui.node.MeasureAndLayoutDelegate.WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2 || i == 3 || i == 4) {
            this.postponedMeasureRequests.add(new androidx.compose.ui.node.MeasureAndLayoutDelegate.PostponedRequest(layoutNode, true, forced));
            androidx.compose.ui.node.LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
            if (layoutTreeConsistencyChecker == null) {
                return false;
            }
            layoutTreeConsistencyChecker.assertConsistent();
            return false;
        }
        if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (layoutNode.getLookaheadMeasurePending$ui_release() && !forced) {
            return false;
        }
        layoutNode.markLookaheadMeasurePending$ui_release();
        layoutNode.markMeasurePending$ui_release();
        if (layoutNode.getIsDeactivated()) {
            return false;
        }
        if ((kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) layoutNode.isPlacedInLookahead(), (java.lang.Object) true) || getCanAffectParentInLookahead(layoutNode)) && ((parent$ui_release = layoutNode.getParent$ui_release()) == null || !parent$ui_release.getLookaheadMeasurePending$ui_release())) {
            this.relayoutNodes.add(layoutNode, true);
        } else if ((layoutNode.isPlaced() || getCanAffectParent(layoutNode)) && ((parent$ui_release2 = layoutNode.getParent$ui_release()) == null || !parent$ui_release2.getMeasurePending$ui_release())) {
            this.relayoutNodes.add(layoutNode, false);
        }
        return !this.duringMeasureLayout;
    }

    public static /* synthetic */ boolean requestRemeasure$default(androidx.compose.ui.node.MeasureAndLayoutDelegate measureAndLayoutDelegate, androidx.compose.ui.node.LayoutNode layoutNode, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return measureAndLayoutDelegate.requestRemeasure(layoutNode, z);
    }

    public final boolean requestRemeasure(androidx.compose.ui.node.LayoutNode layoutNode, boolean forced) {
        androidx.compose.ui.node.LayoutNode parent$ui_release;
        int i = androidx.compose.ui.node.MeasureAndLayoutDelegate.WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3 || i == 4) {
                this.postponedMeasureRequests.add(new androidx.compose.ui.node.MeasureAndLayoutDelegate.PostponedRequest(layoutNode, false, forced));
                androidx.compose.ui.node.LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            } else {
                if (i != 5) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (!layoutNode.getMeasurePending$ui_release() || forced) {
                    layoutNode.markMeasurePending$ui_release();
                    if (!layoutNode.getIsDeactivated()) {
                        if ((layoutNode.isPlaced() || getCanAffectParent(layoutNode)) && ((parent$ui_release = layoutNode.getParent$ui_release()) == null || !parent$ui_release.getMeasurePending$ui_release())) {
                            this.relayoutNodes.add(layoutNode, false);
                        }
                        if (!this.duringMeasureLayout) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static /* synthetic */ boolean requestLookaheadRelayout$default(androidx.compose.ui.node.MeasureAndLayoutDelegate measureAndLayoutDelegate, androidx.compose.ui.node.LayoutNode layoutNode, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return measureAndLayoutDelegate.requestLookaheadRelayout(layoutNode, z);
    }

    public final boolean requestLookaheadRelayout(androidx.compose.ui.node.LayoutNode layoutNode, boolean forced) {
        int i = androidx.compose.ui.node.MeasureAndLayoutDelegate.WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
            }
            if ((layoutNode.getLookaheadMeasurePending$ui_release() || layoutNode.getLookaheadLayoutPending$ui_release()) && !forced) {
                androidx.compose.ui.node.LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker == null) {
                    return false;
                }
                layoutTreeConsistencyChecker.assertConsistent();
                return false;
            }
            layoutNode.markLookaheadLayoutPending$ui_release();
            layoutNode.markLayoutPending$ui_release();
            if (layoutNode.getIsDeactivated()) {
                return false;
            }
            androidx.compose.ui.node.LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) layoutNode.isPlacedInLookahead(), (java.lang.Object) true) && ((parent$ui_release == null || !parent$ui_release.getLookaheadMeasurePending$ui_release()) && (parent$ui_release == null || !parent$ui_release.getLookaheadLayoutPending$ui_release()))) {
                this.relayoutNodes.add(layoutNode, true);
            } else if (layoutNode.isPlaced() && ((parent$ui_release == null || !parent$ui_release.getLayoutPending$ui_release()) && (parent$ui_release == null || !parent$ui_release.getMeasurePending$ui_release()))) {
                this.relayoutNodes.add(layoutNode, false);
            }
            return !this.duringMeasureLayout;
        }
        androidx.compose.ui.node.LayoutTreeConsistencyChecker layoutTreeConsistencyChecker2 = this.consistencyChecker;
        if (layoutTreeConsistencyChecker2 == null) {
            return false;
        }
        layoutTreeConsistencyChecker2.assertConsistent();
        return false;
    }

    public static /* synthetic */ boolean requestRelayout$default(androidx.compose.ui.node.MeasureAndLayoutDelegate measureAndLayoutDelegate, androidx.compose.ui.node.LayoutNode layoutNode, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return measureAndLayoutDelegate.requestRelayout(layoutNode, z);
    }

    public final boolean requestRelayout(androidx.compose.ui.node.LayoutNode layoutNode, boolean forced) {
        androidx.compose.ui.node.LayoutNode parent$ui_release;
        int i = androidx.compose.ui.node.MeasureAndLayoutDelegate.WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            androidx.compose.ui.node.LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
            if (layoutTreeConsistencyChecker != null) {
                layoutTreeConsistencyChecker.assertConsistent();
            }
        } else {
            if (i != 5) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (!forced && layoutNode.isPlaced() == layoutNode.isPlacedByParent() && (layoutNode.getMeasurePending$ui_release() || layoutNode.getLayoutPending$ui_release())) {
                androidx.compose.ui.node.LayoutTreeConsistencyChecker layoutTreeConsistencyChecker2 = this.consistencyChecker;
                if (layoutTreeConsistencyChecker2 != null) {
                    layoutTreeConsistencyChecker2.assertConsistent();
                }
            } else {
                layoutNode.markLayoutPending$ui_release();
                if (!layoutNode.getIsDeactivated()) {
                    if (layoutNode.isPlacedByParent() && (((parent$ui_release = layoutNode.getParent$ui_release()) == null || !parent$ui_release.getLayoutPending$ui_release()) && (parent$ui_release == null || !parent$ui_release.getMeasurePending$ui_release()))) {
                        this.relayoutNodes.add(layoutNode, false);
                    }
                    if (!this.duringMeasureLayout) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void requestOnPositionedCallback(androidx.compose.ui.node.LayoutNode layoutNode) {
        this.onPositionedDispatcher.onNodePositioned(layoutNode);
    }

    /* renamed from: doLookaheadRemeasure-sdFAvZA, reason: not valid java name */
    private final boolean m3567doLookaheadRemeasuresdFAvZA(androidx.compose.ui.node.LayoutNode layoutNode, androidx.compose.ui.unit.Constraints constraints) {
        boolean m3534lookaheadRemeasure_Sx5XlM$ui_release$default;
        if (layoutNode.getLookaheadRoot() == null) {
            return false;
        }
        if (constraints != null) {
            m3534lookaheadRemeasure_Sx5XlM$ui_release$default = layoutNode.m3538lookaheadRemeasure_Sx5XlM$ui_release(constraints);
        } else {
            m3534lookaheadRemeasure_Sx5XlM$ui_release$default = androidx.compose.ui.node.LayoutNode.m3534lookaheadRemeasure_Sx5XlM$ui_release$default(layoutNode, null, 1, null);
        }
        androidx.compose.ui.node.LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        if (m3534lookaheadRemeasure_Sx5XlM$ui_release$default && parent$ui_release != null) {
            if (parent$ui_release.getLookaheadRoot() == null) {
                requestRemeasure$default(this, parent$ui_release, false, 2, null);
            } else if (layoutNode.getMeasuredByParentInLookahead$ui_release() == androidx.compose.ui.node.LayoutNode.UsageByParent.InMeasureBlock) {
                requestLookaheadRemeasure$default(this, parent$ui_release, false, 2, null);
            } else if (layoutNode.getMeasuredByParentInLookahead$ui_release() == androidx.compose.ui.node.LayoutNode.UsageByParent.InLayoutBlock) {
                requestLookaheadRelayout$default(this, parent$ui_release, false, 2, null);
            }
        }
        return m3534lookaheadRemeasure_Sx5XlM$ui_release$default;
    }

    /* renamed from: doRemeasure-sdFAvZA, reason: not valid java name */
    private final boolean m3568doRemeasuresdFAvZA(androidx.compose.ui.node.LayoutNode layoutNode, androidx.compose.ui.unit.Constraints constraints) {
        boolean m3535remeasure_Sx5XlM$ui_release$default;
        if (constraints != null) {
            m3535remeasure_Sx5XlM$ui_release$default = layoutNode.m3539remeasure_Sx5XlM$ui_release(constraints);
        } else {
            m3535remeasure_Sx5XlM$ui_release$default = androidx.compose.ui.node.LayoutNode.m3535remeasure_Sx5XlM$ui_release$default(layoutNode, null, 1, null);
        }
        androidx.compose.ui.node.LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        if (m3535remeasure_Sx5XlM$ui_release$default && parent$ui_release != null) {
            if (layoutNode.getMeasuredByParent$ui_release() == androidx.compose.ui.node.LayoutNode.UsageByParent.InMeasureBlock) {
                requestRemeasure$default(this, parent$ui_release, false, 2, null);
            } else if (layoutNode.getMeasuredByParent$ui_release() == androidx.compose.ui.node.LayoutNode.UsageByParent.InLayoutBlock) {
                requestRelayout$default(this, parent$ui_release, false, 2, null);
            }
        }
        return m3535remeasure_Sx5XlM$ui_release$default;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean measureAndLayout$default(androidx.compose.ui.node.MeasureAndLayoutDelegate measureAndLayoutDelegate, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        return measureAndLayoutDelegate.measureAndLayout(function0);
    }

    public final void measureOnly() {
        if (this.relayoutNodes.isNotEmpty()) {
            if (!this.root.isAttached()) {
                throw new java.lang.IllegalArgumentException("performMeasureAndLayout called with unattached root".toString());
            }
            if (!this.root.isPlaced()) {
                throw new java.lang.IllegalArgumentException("performMeasureAndLayout called with unplaced root".toString());
            }
            if (!(!this.duringMeasureLayout)) {
                throw new java.lang.IllegalArgumentException("performMeasureAndLayout called during measure layout".toString());
            }
            if (this.rootConstraints != null) {
                this.duringMeasureLayout = true;
                try {
                    if (!this.relayoutNodes.isEmpty(true)) {
                        if (this.root.getLookaheadRoot() != null) {
                            remeasureOnly(this.root, true);
                        } else {
                            remeasureLookaheadRootsInSubtree(this.root);
                        }
                    }
                    remeasureOnly(this.root, false);
                    this.duringMeasureLayout = false;
                    androidx.compose.ui.node.LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                    if (layoutTreeConsistencyChecker != null) {
                        layoutTreeConsistencyChecker.assertConsistent();
                    }
                } catch (java.lang.Throwable th) {
                    this.duringMeasureLayout = false;
                    throw th;
                }
            }
        }
    }

    /* renamed from: measureAndLayout-0kLqBqw, reason: not valid java name */
    public final void m3569measureAndLayout0kLqBqw(androidx.compose.ui.node.LayoutNode layoutNode, long constraints) {
        if (layoutNode.getIsDeactivated()) {
            return;
        }
        if (!(!kotlin.jvm.internal.Intrinsics.areEqual(layoutNode, this.root))) {
            throw new java.lang.IllegalArgumentException("measureAndLayout called on root".toString());
        }
        if (!this.root.isAttached()) {
            throw new java.lang.IllegalArgumentException("performMeasureAndLayout called with unattached root".toString());
        }
        if (!this.root.isPlaced()) {
            throw new java.lang.IllegalArgumentException("performMeasureAndLayout called with unplaced root".toString());
        }
        if (!(!this.duringMeasureLayout)) {
            throw new java.lang.IllegalArgumentException("performMeasureAndLayout called during measure layout".toString());
        }
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            try {
                this.relayoutNodes.remove(layoutNode);
                boolean m3567doLookaheadRemeasuresdFAvZA = m3567doLookaheadRemeasuresdFAvZA(layoutNode, androidx.compose.ui.unit.Constraints.m4412boximpl(constraints));
                m3568doRemeasuresdFAvZA(layoutNode, androidx.compose.ui.unit.Constraints.m4412boximpl(constraints));
                if ((m3567doLookaheadRemeasuresdFAvZA || layoutNode.getLookaheadLayoutPending$ui_release()) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) layoutNode.isPlacedInLookahead(), (java.lang.Object) true)) {
                    layoutNode.lookaheadReplace$ui_release();
                }
                if (layoutNode.getLayoutPending$ui_release() && layoutNode.isPlaced()) {
                    layoutNode.replace$ui_release();
                    this.onPositionedDispatcher.onNodePositioned(layoutNode);
                }
                this.duringMeasureLayout = false;
                androidx.compose.ui.node.LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            } catch (java.lang.Throwable th) {
                this.duringMeasureLayout = false;
                throw th;
            }
        }
        callOnLayoutCompletedListeners();
    }

    private final void performMeasureAndLayout(kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        if (!this.root.isAttached()) {
            throw new java.lang.IllegalArgumentException("performMeasureAndLayout called with unattached root".toString());
        }
        if (!this.root.isPlaced()) {
            throw new java.lang.IllegalArgumentException("performMeasureAndLayout called with unplaced root".toString());
        }
        if (!(!this.duringMeasureLayout)) {
            throw new java.lang.IllegalArgumentException("performMeasureAndLayout called during measure layout".toString());
        }
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            try {
                block.invoke();
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                this.duringMeasureLayout = false;
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                androidx.compose.ui.node.LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            } catch (java.lang.Throwable th) {
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                this.duringMeasureLayout = false;
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                throw th;
            }
        }
    }

    public final void registerOnLayoutCompletedListener(androidx.compose.ui.node.Owner.OnLayoutCompletedListener listener) {
        this.onLayoutCompletedListeners.add(listener);
    }

    private final void callOnLayoutCompletedListeners() {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.Owner.OnLayoutCompletedListener> mutableVector = this.onLayoutCompletedListeners;
        int size = mutableVector.getSize();
        if (size > 0) {
            androidx.compose.ui.node.Owner.OnLayoutCompletedListener[] content = mutableVector.getContent();
            int i = 0;
            do {
                content[i].onLayoutComplete();
                i++;
            } while (i < size);
        }
        this.onLayoutCompletedListeners.clear();
    }

    static /* synthetic */ boolean remeasureAndRelayoutIfNeeded$default(androidx.compose.ui.node.MeasureAndLayoutDelegate measureAndLayoutDelegate, androidx.compose.ui.node.LayoutNode layoutNode, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        return measureAndLayoutDelegate.remeasureAndRelayoutIfNeeded(layoutNode, z, z2);
    }

    private final boolean remeasureAndRelayoutIfNeeded(androidx.compose.ui.node.LayoutNode layoutNode, boolean affectsLookahead, boolean relayoutNeeded) {
        androidx.compose.ui.unit.Constraints constraints;
        boolean m3567doLookaheadRemeasuresdFAvZA;
        boolean m3568doRemeasuresdFAvZA;
        androidx.compose.ui.node.LayoutNode parent$ui_release;
        int i = 0;
        if (layoutNode.getIsDeactivated()) {
            return false;
        }
        if (!layoutNode.isPlaced() && !layoutNode.isPlacedByParent() && !getCanAffectParent(layoutNode) && !kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) layoutNode.isPlacedInLookahead(), (java.lang.Object) true) && !getCanAffectParentInLookahead(layoutNode) && !layoutNode.getAlignmentLinesRequired$ui_release()) {
            return false;
        }
        if (layoutNode.getLookaheadMeasurePending$ui_release() || layoutNode.getMeasurePending$ui_release()) {
            if (layoutNode == this.root) {
                constraints = this.rootConstraints;
                kotlin.jvm.internal.Intrinsics.checkNotNull(constraints);
            } else {
                constraints = null;
            }
            m3567doLookaheadRemeasuresdFAvZA = (layoutNode.getLookaheadMeasurePending$ui_release() && affectsLookahead) ? m3567doLookaheadRemeasuresdFAvZA(layoutNode, constraints) : false;
            m3568doRemeasuresdFAvZA = m3568doRemeasuresdFAvZA(layoutNode, constraints);
        } else {
            m3568doRemeasuresdFAvZA = false;
            m3567doLookaheadRemeasuresdFAvZA = false;
        }
        if (relayoutNeeded) {
            if ((m3567doLookaheadRemeasuresdFAvZA || layoutNode.getLookaheadLayoutPending$ui_release()) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) layoutNode.isPlacedInLookahead(), (java.lang.Object) true) && affectsLookahead) {
                layoutNode.lookaheadReplace$ui_release();
            }
            if (layoutNode.getLayoutPending$ui_release() && (layoutNode == this.root || ((parent$ui_release = layoutNode.getParent$ui_release()) != null && parent$ui_release.isPlaced() && layoutNode.isPlacedByParent()))) {
                if (layoutNode == this.root) {
                    layoutNode.place$ui_release(0, 0);
                } else {
                    layoutNode.replace$ui_release();
                }
                this.onPositionedDispatcher.onNodePositioned(layoutNode);
                androidx.compose.ui.node.LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            }
        }
        if (this.postponedMeasureRequests.isNotEmpty()) {
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.MeasureAndLayoutDelegate.PostponedRequest> mutableVector = this.postponedMeasureRequests;
            int size = mutableVector.getSize();
            if (size > 0) {
                androidx.compose.ui.node.MeasureAndLayoutDelegate.PostponedRequest[] content = mutableVector.getContent();
                do {
                    androidx.compose.ui.node.MeasureAndLayoutDelegate.PostponedRequest postponedRequest = content[i];
                    if (postponedRequest.getNode().isAttached()) {
                        if (!postponedRequest.getIsLookahead()) {
                            requestRemeasure(postponedRequest.getNode(), postponedRequest.getIsForced());
                        } else {
                            requestLookaheadRemeasure(postponedRequest.getNode(), postponedRequest.getIsForced());
                        }
                    }
                    i++;
                } while (i < size);
            }
            this.postponedMeasureRequests.clear();
        }
        return m3568doRemeasuresdFAvZA;
    }

    private final void remeasureOnly(androidx.compose.ui.node.LayoutNode layoutNode, boolean affectsLookahead) {
        androidx.compose.ui.unit.Constraints constraints;
        if (layoutNode == this.root) {
            constraints = this.rootConstraints;
            kotlin.jvm.internal.Intrinsics.checkNotNull(constraints);
        } else {
            constraints = null;
        }
        if (affectsLookahead) {
            m3567doLookaheadRemeasuresdFAvZA(layoutNode, constraints);
        } else {
            m3568doRemeasuresdFAvZA(layoutNode, constraints);
        }
    }

    public final void forceMeasureTheSubtree(androidx.compose.ui.node.LayoutNode layoutNode, boolean affectsLookahead) {
        if (this.relayoutNodes.isEmpty(affectsLookahead)) {
            return;
        }
        if (!this.duringMeasureLayout) {
            throw new java.lang.IllegalStateException("forceMeasureTheSubtree should be executed during the measureAndLayout pass".toString());
        }
        if (!(!measurePending(layoutNode, affectsLookahead))) {
            throw new java.lang.IllegalArgumentException("node not yet measured".toString());
        }
        forceMeasureTheSubtreeInternal(layoutNode, affectsLookahead);
    }

    private final void onlyRemeasureIfScheduled(androidx.compose.ui.node.LayoutNode node, boolean affectsLookahead) {
        if (measurePending(node, affectsLookahead) && this.relayoutNodes.contains(node, affectsLookahead)) {
            remeasureAndRelayoutIfNeeded(node, affectsLookahead, false);
        }
    }

    public static /* synthetic */ void dispatchOnPositionedCallbacks$default(androidx.compose.ui.node.MeasureAndLayoutDelegate measureAndLayoutDelegate, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        measureAndLayoutDelegate.dispatchOnPositionedCallbacks(z);
    }

    public final void dispatchOnPositionedCallbacks(boolean forceDispatch) {
        if (forceDispatch) {
            this.onPositionedDispatcher.onRootNodePositioned(this.root);
        }
        this.onPositionedDispatcher.dispatch();
    }

    public final void onNodeDetached(androidx.compose.ui.node.LayoutNode node) {
        this.relayoutNodes.remove(node);
    }

    private final boolean getMeasureAffectsParent(androidx.compose.ui.node.LayoutNode layoutNode) {
        return layoutNode.getMeasuredByParent$ui_release() == androidx.compose.ui.node.LayoutNode.UsageByParent.InMeasureBlock || layoutNode.getLayoutDelegate().getAlignmentLinesOwner$ui_release().getAlignmentLines().getRequired$ui_release();
    }

    private final boolean getCanAffectParent(androidx.compose.ui.node.LayoutNode layoutNode) {
        return layoutNode.getMeasurePending$ui_release() && getMeasureAffectsParent(layoutNode);
    }

    private final boolean getCanAffectParentInLookahead(androidx.compose.ui.node.LayoutNode layoutNode) {
        return layoutNode.getLookaheadMeasurePending$ui_release() && getMeasureAffectsParentLookahead(layoutNode);
    }

    private final boolean getMeasureAffectsParentLookahead(androidx.compose.ui.node.LayoutNode layoutNode) {
        androidx.compose.ui.node.AlignmentLines alignmentLines;
        if (layoutNode.getMeasuredByParentInLookahead$ui_release() == androidx.compose.ui.node.LayoutNode.UsageByParent.InMeasureBlock) {
            return true;
        }
        androidx.compose.ui.node.AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = layoutNode.getLayoutDelegate().getLookaheadAlignmentLinesOwner$ui_release();
        return (lookaheadAlignmentLinesOwner$ui_release == null || (alignmentLines = lookaheadAlignmentLinesOwner$ui_release.getAlignmentLines()) == null || !alignmentLines.getRequired$ui_release()) ? false : true;
    }

    private final boolean measurePending(androidx.compose.ui.node.LayoutNode layoutNode, boolean z) {
        return z ? layoutNode.getLookaheadMeasurePending$ui_release() : layoutNode.getMeasurePending$ui_release();
    }

    /* compiled from: MeasureAndLayoutDelegate.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/node/MeasureAndLayoutDelegate$PostponedRequest;", "", "node", "Landroidx/compose/ui/node/LayoutNode;", "isLookahead", "", "isForced", "(Landroidx/compose/ui/node/LayoutNode;ZZ)V", "()Z", "getNode", "()Landroidx/compose/ui/node/LayoutNode;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PostponedRequest {
        public static final int $stable = 8;
        private final boolean isForced;
        private final boolean isLookahead;
        private final androidx.compose.ui.node.LayoutNode node;

        public PostponedRequest(androidx.compose.ui.node.LayoutNode layoutNode, boolean z, boolean z2) {
            this.node = layoutNode;
            this.isLookahead = z;
            this.isForced = z2;
        }

        public final androidx.compose.ui.node.LayoutNode getNode() {
            return this.node;
        }

        /* renamed from: isForced, reason: from getter */
        public final boolean getIsForced() {
            return this.isForced;
        }

        /* renamed from: isLookahead, reason: from getter */
        public final boolean getIsLookahead() {
            return this.isLookahead;
        }
    }

    public final boolean measureAndLayout(kotlin.jvm.functions.Function0<kotlin.Unit> onLayout) {
        boolean z;
        if (!this.root.isAttached()) {
            throw new java.lang.IllegalArgumentException("performMeasureAndLayout called with unattached root".toString());
        }
        if (!this.root.isPlaced()) {
            throw new java.lang.IllegalArgumentException("performMeasureAndLayout called with unplaced root".toString());
        }
        if (!(!this.duringMeasureLayout)) {
            throw new java.lang.IllegalArgumentException("performMeasureAndLayout called during measure layout".toString());
        }
        boolean z2 = false;
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            try {
                if (this.relayoutNodes.isNotEmpty()) {
                    androidx.compose.ui.node.DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = this.relayoutNodes;
                    z = false;
                    while (depthSortedSetsForDifferentPasses.isNotEmpty()) {
                        boolean z3 = !depthSortedSetsForDifferentPasses.lookaheadSet.isEmpty();
                        androidx.compose.ui.node.LayoutNode pop = (z3 ? depthSortedSetsForDifferentPasses.lookaheadSet : depthSortedSetsForDifferentPasses.set).pop();
                        boolean remeasureAndRelayoutIfNeeded$default = remeasureAndRelayoutIfNeeded$default(this, pop, z3, false, 4, null);
                        if (pop == this.root && remeasureAndRelayoutIfNeeded$default) {
                            z = true;
                        }
                    }
                    if (onLayout != null) {
                        onLayout.invoke();
                    }
                } else {
                    z = false;
                }
                this.duringMeasureLayout = false;
                androidx.compose.ui.node.LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.consistencyChecker;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
                z2 = z;
            } catch (java.lang.Throwable th) {
                this.duringMeasureLayout = false;
                throw th;
            }
        }
        callOnLayoutCompletedListeners();
        return z2;
    }

    private final void remeasureLookaheadRootsInSubtree(androidx.compose.ui.node.LayoutNode layoutNode) {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            androidx.compose.ui.node.LayoutNode[] content = mutableVector.getContent();
            int i = 0;
            do {
                androidx.compose.ui.node.LayoutNode layoutNode2 = content[i];
                if (getMeasureAffectsParent(layoutNode2)) {
                    if (androidx.compose.ui.node.LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(layoutNode2)) {
                        remeasureOnly(layoutNode2, true);
                    } else {
                        remeasureLookaheadRootsInSubtree(layoutNode2);
                    }
                }
                i++;
            } while (i < size);
        }
    }

    private final void forceMeasureTheSubtreeInternal(androidx.compose.ui.node.LayoutNode layoutNode, boolean affectsLookahead) {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            androidx.compose.ui.node.LayoutNode[] content = mutableVector.getContent();
            int i = 0;
            do {
                androidx.compose.ui.node.LayoutNode layoutNode2 = content[i];
                if ((!affectsLookahead && getMeasureAffectsParent(layoutNode2)) || (affectsLookahead && getMeasureAffectsParentLookahead(layoutNode2))) {
                    if (androidx.compose.ui.node.LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(layoutNode2) && !affectsLookahead) {
                        if (layoutNode2.getLookaheadMeasurePending$ui_release() && this.relayoutNodes.contains(layoutNode2, true)) {
                            remeasureAndRelayoutIfNeeded(layoutNode2, true, false);
                        } else {
                            forceMeasureTheSubtree(layoutNode2, true);
                        }
                    }
                    onlyRemeasureIfScheduled(layoutNode2, affectsLookahead);
                    if (!measurePending(layoutNode2, affectsLookahead)) {
                        forceMeasureTheSubtreeInternal(layoutNode2, affectsLookahead);
                    }
                }
                i++;
            } while (i < size);
        }
        onlyRemeasureIfScheduled(layoutNode, affectsLookahead);
    }
}
