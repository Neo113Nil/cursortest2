package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\\B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0005J!\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\r2\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b \u0010\u0005J\u001d\u0010\u001c\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b#\u0010\u0005J\u0015\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u001fJ'\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010(\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010)J\u000f\u0010#\u001a\u00020\bH\u0002¢\u0006\u0004\b#\u0010\u001fJ\u001f\u0010*\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b*\u0010+J\u001d\u0010-\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\r¢\u0006\u0004\b-\u0010+J\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010+J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010+J\u0017\u0010/\u001a\u00020\b2\b\b\u0002\u0010.\u001a\u00020\r¢\u0006\u0004\b/\u00100J\u0015\u00102\u001a\u00020\b2\u0006\u00101\u001a\u00020\u0002¢\u0006\u0004\b2\u0010\u0005J\u001b\u0010#\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b#\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010*\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0011\u0010:\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b8\u00109R\u0011\u0010<\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b;\u00109R\"\u0010=\u001a\u00020\r8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u00109\"\u0004\b@\u00100R\u0016\u0010\u0019\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010>R\u0014\u0010C\u001a\u00020A8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010BR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020$0D8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010ER$\u0010G\u001a\u00020F2\u0006\u0010\u0015\u001a\u00020F8G@BX\u0087\u000e¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020K0D8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bC\u0010ER\u0018\u0010 \u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bL\u0010MR$\u0010O\u001a\u0004\u0018\u00010N8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0016\u0010W\u001a\u0004\u0018\u00010U8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010VR\u0018\u00106\u001a\u00020\r*\u00020\u00028CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0018\u0010L\u001a\u00020\r*\u00020\u00028CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010XR\u0018\u0010Y\u001a\u00020\r*\u00020\u00028CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010XR\u0018\u0010Z\u001a\u00020\r*\u00020\u00028CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010XR\u0018\u0010[\u001a\u00020\r*\u00020\u00028CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010X"}, d2 = {"Landroidx/compose/ui/node/MeasureAndLayoutDelegate;", "", "Landroidx/compose/ui/node/LayoutNode;", "root", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "updateRootConstraints-BRTryo0", "(J)V", "updateRootConstraints", "layoutNode", "", "forced", "requestLookaheadRemeasure", "(Landroidx/compose/ui/node/LayoutNode;Z)Z", "requestRemeasure", "requestLookaheadRelayout", "requestRelayout", "requestOnPositionedCallback", "p0", "p1", "Camera2StreamConfigurationMap", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/unit/Constraints;)Z", "getHighSpeedVideoSizes", "Lkotlin/Function0;", "onLayout", "measureAndLayout", "(Lkotlin/jvm/functions/Function0;)Z", "measureOnly", "()V", "getInputSizeshNQ4ISI", "measureAndLayout-0kLqBqw", "(Landroidx/compose/ui/node/LayoutNode;J)V", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "registerOnLayoutCompletedListener", "(Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;)V", "p2", "(Landroidx/compose/ui/node/LayoutNode;ZZ)Z", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/ui/node/LayoutNode;Z)V", "affectsLookahead", "forceMeasureTheSubtree", "forceDispatch", "dispatchOnPositionedCallbacks", "(Z)V", "node", "onNodeDetached", "getHighSpeedVideoSizesFor", "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;", "getInputFormats", "Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;", "getHasPendingMeasureOrLayout", "()Z", "hasPendingMeasureOrLayout", "getHasPendingOnPositionedCallbacks", "hasPendingOnPositionedCallbacks", "duringMeasureLayout", "Z", "getDuringMeasureLayout$ui", "setDuringMeasureLayout$ui", "Landroidx/compose/ui/node/OnPositionedDispatcher;", "Landroidx/compose/ui/node/OnPositionedDispatcher;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/collection/MutableVector;", "", "measureIteration", "J", "getMeasureIteration", "()J", "Landroidx/compose/ui/node/MeasureAndLayoutDelegate$PostponedRequest;", "getOutputMinFrameDuration", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/node/RootForTest$UncaughtExceptionHandler;", "uncaughtExceptionHandler", "Landroidx/compose/ui/node/RootForTest$UncaughtExceptionHandler;", "getUncaughtExceptionHandler$ui", "()Landroidx/compose/ui/node/RootForTest$UncaughtExceptionHandler;", "setUncaughtExceptionHandler$ui", "(Landroidx/compose/ui/node/RootForTest$UncaughtExceptionHandler;)V", "Landroidx/compose/ui/node/LayoutTreeConsistencyChecker;", "Landroidx/compose/ui/node/LayoutTreeConsistencyChecker;", "getOutputFormats", "(Landroidx/compose/ui/node/LayoutNode;)Z", "getOutputStallDurationlomOqCM", "getOutputMinFrameDurationlomOqCM", "getOutputStallDuration", "PostponedRequest"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MeasureAndLayoutDelegate {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.ui.node.LayoutTreeConsistencyChecker getOutputFormats;
    private boolean duringMeasureLayout;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.ui.node.OnPositionedDispatcher getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.MeasureAndLayoutDelegate.PostponedRequest> getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.Owner.OnLayoutCompletedListener> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final androidx.compose.ui.node.LayoutNode Camera2StreamConfigurationMap;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final androidx.compose.ui.node.DepthSortedSetsForDifferentPasses getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private androidx.compose.ui.unit.Constraints getInputSizeshNQ4ISI;
    private long measureIteration;
    private androidx.compose.ui.node.RootForTest.UncaughtExceptionHandler uncaughtExceptionHandler;

    public MeasureAndLayoutDelegate(androidx.compose.ui.node.LayoutNode layoutNode) {
        this.Camera2StreamConfigurationMap = layoutNode;
        androidx.compose.ui.node.DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = new androidx.compose.ui.node.DepthSortedSetsForDifferentPasses(androidx.compose.ui.node.Owner.INSTANCE.getEnableExtraAssertions());
        this.getHighSpeedVideoFpsRangesFor = depthSortedSetsForDifferentPasses;
        this.getHighSpeedVideoFpsRanges = new androidx.compose.ui.node.OnPositionedDispatcher();
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.ui.node.Owner.OnLayoutCompletedListener[16], 0);
        this.measureIteration = 1L;
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.MeasureAndLayoutDelegate.PostponedRequest> mutableVector = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.ui.node.MeasureAndLayoutDelegate.PostponedRequest[16], 0);
        this.getHighSpeedVideoSizesFor = mutableVector;
        this.getOutputFormats = androidx.compose.ui.node.Owner.INSTANCE.getEnableExtraAssertions() ? new androidx.compose.ui.node.LayoutTreeConsistencyChecker(layoutNode, depthSortedSetsForDifferentPasses, mutableVector.asMutableList()) : null;
    }

    public final boolean getHasPendingMeasureOrLayout() {
        return this.getHighSpeedVideoFpsRangesFor.isNotEmpty();
    }

    public final boolean getHasPendingOnPositionedCallbacks() {
        return this.getHighSpeedVideoFpsRanges.isNotEmpty();
    }

    /* renamed from: getDuringMeasureLayout$ui, reason: from getter */
    public final boolean getDuringMeasureLayout() {
        return this.duringMeasureLayout;
    }

    public final void setDuringMeasureLayout$ui(boolean z) {
        this.duringMeasureLayout = z;
    }

    public final long getMeasureIteration() {
        if (!this.duringMeasureLayout) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("measureIteration should be only used during the measure/layout pass");
        }
        return this.measureIteration;
    }

    /* renamed from: getUncaughtExceptionHandler$ui, reason: from getter */
    public final androidx.compose.ui.node.RootForTest.UncaughtExceptionHandler getUncaughtExceptionHandler() {
        return this.uncaughtExceptionHandler;
    }

    public final void setUncaughtExceptionHandler$ui(androidx.compose.ui.node.RootForTest.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.uncaughtExceptionHandler = uncaughtExceptionHandler;
    }

    /* renamed from: updateRootConstraints-BRTryo0, reason: not valid java name */
    public final void m7587updateRootConstraintsBRTryo0(long constraints) {
        androidx.compose.ui.node.Invalidation invalidation;
        androidx.compose.ui.unit.Constraints constraints2 = this.getInputSizeshNQ4ISI;
        if (constraints2 != null && androidx.compose.ui.unit.Constraints.m8548equalsimpl0(constraints2.getGetHighSpeedVideoFpsRangesFor(), constraints)) {
            return;
        }
        if (this.duringMeasureLayout) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("updateRootConstraints called while measuring");
        }
        this.getInputSizeshNQ4ISI = androidx.compose.ui.unit.Constraints.m8542boximpl(constraints);
        if (this.Camera2StreamConfigurationMap.getLookaheadRoot() != null) {
            this.Camera2StreamConfigurationMap.markLookaheadMeasurePending$ui();
        }
        this.Camera2StreamConfigurationMap.markMeasurePending$ui();
        androidx.compose.ui.node.DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = this.getHighSpeedVideoFpsRangesFor;
        androidx.compose.ui.node.LayoutNode layoutNode = this.Camera2StreamConfigurationMap;
        if (layoutNode.getLookaheadRoot() != null) {
            invalidation = androidx.compose.ui.node.Invalidation.LookaheadMeasurement;
        } else {
            invalidation = androidx.compose.ui.node.Invalidation.Measurement;
        }
        depthSortedSetsForDifferentPasses.add(layoutNode, invalidation);
    }

    public static /* synthetic */ boolean requestLookaheadRemeasure$default(androidx.compose.ui.node.MeasureAndLayoutDelegate measureAndLayoutDelegate, androidx.compose.ui.node.LayoutNode layoutNode, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return measureAndLayoutDelegate.requestLookaheadRemeasure(layoutNode, z);
    }

    public final boolean requestLookaheadRemeasure(androidx.compose.ui.node.LayoutNode layoutNode, boolean forced) {
        androidx.compose.ui.node.LayoutNode parent$ui;
        androidx.compose.ui.node.LayoutNode parent$ui2;
        if (layoutNode.getLookaheadRoot() == null) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int i = androidx.compose.ui.node.MeasureAndLayoutDelegate.WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui().ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3 && i != 4) {
                if (i != 5) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (layoutNode.getLookaheadMeasurePending$ui() && !forced) {
                    return false;
                }
                layoutNode.markLookaheadMeasurePending$ui();
                layoutNode.markMeasurePending$ui();
                if (layoutNode.getIsDeactivated()) {
                    return false;
                }
                if ((kotlin.jvm.internal.Intrinsics.areEqual(layoutNode.isPlacedInLookahead(), java.lang.Boolean.TRUE) || getHighSpeedVideoFpsRanges(layoutNode)) && ((parent$ui = layoutNode.getParent$ui()) == null || !parent$ui.getLookaheadMeasurePending$ui())) {
                    this.getHighSpeedVideoFpsRangesFor.add(layoutNode, androidx.compose.ui.node.Invalidation.LookaheadMeasurement);
                } else if ((layoutNode.isPlaced() || getHighSpeedVideoFpsRangesFor(layoutNode)) && ((parent$ui2 = layoutNode.getParent$ui()) == null || !parent$ui2.getMeasurePending$ui())) {
                    this.getHighSpeedVideoFpsRangesFor.add(layoutNode, androidx.compose.ui.node.Invalidation.Measurement);
                }
                return !this.getHighSpeedVideoSizes;
            }
            this.getHighSpeedVideoSizesFor.add(new androidx.compose.ui.node.MeasureAndLayoutDelegate.PostponedRequest(layoutNode, true, forced));
            androidx.compose.ui.node.LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.getOutputFormats;
            if (layoutTreeConsistencyChecker != null) {
                layoutTreeConsistencyChecker.assertConsistent();
            }
        }
        return false;
    }

    public static /* synthetic */ boolean requestRemeasure$default(androidx.compose.ui.node.MeasureAndLayoutDelegate measureAndLayoutDelegate, androidx.compose.ui.node.LayoutNode layoutNode, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return measureAndLayoutDelegate.requestRemeasure(layoutNode, z);
    }

    public final boolean requestRemeasure(androidx.compose.ui.node.LayoutNode layoutNode, boolean forced) {
        int i = androidx.compose.ui.node.MeasureAndLayoutDelegate.WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                if (i != 5) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (layoutNode.getMeasurePending$ui() && !forced) {
                    return false;
                }
                layoutNode.markMeasurePending$ui();
                if (layoutNode.getIsDeactivated()) {
                    return false;
                }
                if (!layoutNode.isPlaced() && !getHighSpeedVideoFpsRangesFor(layoutNode)) {
                    return false;
                }
                androidx.compose.ui.node.LayoutNode parent$ui = layoutNode.getParent$ui();
                if (parent$ui == null || !parent$ui.getMeasurePending$ui()) {
                    this.getHighSpeedVideoFpsRangesFor.add(layoutNode, androidx.compose.ui.node.Invalidation.Measurement);
                }
                return !this.getHighSpeedVideoSizes;
            }
            this.getHighSpeedVideoSizesFor.add(new androidx.compose.ui.node.MeasureAndLayoutDelegate.PostponedRequest(layoutNode, false, forced));
            androidx.compose.ui.node.LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.getOutputFormats;
            if (layoutTreeConsistencyChecker != null) {
                layoutTreeConsistencyChecker.assertConsistent();
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
        int i = androidx.compose.ui.node.MeasureAndLayoutDelegate.WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
            }
            if ((layoutNode.getLookaheadMeasurePending$ui() || layoutNode.getLookaheadLayoutPending$ui()) && !forced) {
                androidx.compose.ui.node.LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.getOutputFormats;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
                return false;
            }
            layoutNode.markLookaheadLayoutPending$ui();
            layoutNode.markLayoutPending$ui();
            if (layoutNode.getIsDeactivated()) {
                return false;
            }
            androidx.compose.ui.node.LayoutNode parent$ui = layoutNode.getParent$ui();
            if (kotlin.jvm.internal.Intrinsics.areEqual(layoutNode.isPlacedInLookahead(), java.lang.Boolean.TRUE) && ((parent$ui == null || !parent$ui.getLookaheadMeasurePending$ui()) && (parent$ui == null || !parent$ui.getLookaheadLayoutPending$ui()))) {
                this.getHighSpeedVideoFpsRangesFor.add(layoutNode, androidx.compose.ui.node.Invalidation.LookaheadPlacement);
            } else if (layoutNode.isPlaced() && ((parent$ui == null || !parent$ui.getLayoutPending$ui()) && (parent$ui == null || !parent$ui.getMeasurePending$ui()))) {
                this.getHighSpeedVideoFpsRangesFor.add(layoutNode, androidx.compose.ui.node.Invalidation.Placement);
            }
            return !this.getHighSpeedVideoSizes;
        }
        androidx.compose.ui.node.LayoutTreeConsistencyChecker layoutTreeConsistencyChecker2 = this.getOutputFormats;
        if (layoutTreeConsistencyChecker2 != null) {
            layoutTreeConsistencyChecker2.assertConsistent();
        }
        return false;
    }

    public static /* synthetic */ boolean requestRelayout$default(androidx.compose.ui.node.MeasureAndLayoutDelegate measureAndLayoutDelegate, androidx.compose.ui.node.LayoutNode layoutNode, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return measureAndLayoutDelegate.requestRelayout(layoutNode, z);
    }

    public final boolean requestRelayout(androidx.compose.ui.node.LayoutNode layoutNode, boolean forced) {
        int i = androidx.compose.ui.node.MeasureAndLayoutDelegate.WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui().ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            androidx.compose.ui.node.LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.getOutputFormats;
            if (layoutTreeConsistencyChecker != null) {
                layoutTreeConsistencyChecker.assertConsistent();
            }
            return false;
        }
        if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        androidx.compose.ui.node.LayoutNode parent$ui = layoutNode.getParent$ui();
        boolean z = parent$ui == null || parent$ui.isPlaced();
        if (!forced && (layoutNode.getMeasurePending$ui() || (layoutNode.getLayoutPending$ui() && layoutNode.isPlaced() == z && layoutNode.isPlaced() == layoutNode.isPlacedByParent()))) {
            androidx.compose.ui.node.LayoutTreeConsistencyChecker layoutTreeConsistencyChecker2 = this.getOutputFormats;
            if (layoutTreeConsistencyChecker2 != null) {
                layoutTreeConsistencyChecker2.assertConsistent();
            }
            return false;
        }
        layoutNode.markLayoutPending$ui();
        if (!layoutNode.getIsDeactivated() && layoutNode.isPlacedByParent() && z) {
            if ((parent$ui == null || !parent$ui.getLayoutPending$ui()) && (parent$ui == null || !parent$ui.getMeasurePending$ui())) {
                this.getHighSpeedVideoFpsRangesFor.add(layoutNode, androidx.compose.ui.node.Invalidation.Placement);
            }
            if (!this.getHighSpeedVideoSizes) {
                return true;
            }
        }
        return false;
    }

    public final void requestOnPositionedCallback(androidx.compose.ui.node.LayoutNode layoutNode) {
        this.getHighSpeedVideoFpsRanges.onNodePositioned(layoutNode);
    }

    private static boolean Camera2StreamConfigurationMap(androidx.compose.ui.node.LayoutNode p0, androidx.compose.ui.unit.Constraints p1) {
        boolean m7552lookaheadRemeasure_Sx5XlM$ui$default;
        if (p0.getLookaheadRoot() == null) {
            return false;
        }
        if (p1 != null) {
            m7552lookaheadRemeasure_Sx5XlM$ui$default = p0.m7559lookaheadRemeasure_Sx5XlM$ui(p1);
        } else {
            m7552lookaheadRemeasure_Sx5XlM$ui$default = androidx.compose.ui.node.LayoutNode.m7552lookaheadRemeasure_Sx5XlM$ui$default(p0, null, 1, null);
        }
        androidx.compose.ui.node.LayoutNode parent$ui = p0.getParent$ui();
        if (m7552lookaheadRemeasure_Sx5XlM$ui$default && parent$ui != null) {
            if (parent$ui.getLookaheadRoot() == null) {
                androidx.compose.ui.node.LayoutNode.requestRemeasure$ui$default(parent$ui, false, false, false, 3, null);
                return m7552lookaheadRemeasure_Sx5XlM$ui$default;
            }
            if (p0.getMeasuredByParentInLookahead$ui() == androidx.compose.ui.node.LayoutNode.UsageByParent.InMeasureBlock) {
                androidx.compose.ui.node.LayoutNode.requestLookaheadRemeasure$ui$default(parent$ui, false, false, false, 3, null);
                return m7552lookaheadRemeasure_Sx5XlM$ui$default;
            }
            if (p0.getMeasuredByParentInLookahead$ui() == androidx.compose.ui.node.LayoutNode.UsageByParent.InLayoutBlock) {
                androidx.compose.ui.node.LayoutNode.requestLookaheadRelayout$ui$default(parent$ui, false, 1, null);
            }
        }
        return m7552lookaheadRemeasure_Sx5XlM$ui$default;
    }

    private static boolean getHighSpeedVideoSizes(androidx.compose.ui.node.LayoutNode p0, androidx.compose.ui.unit.Constraints p1) {
        boolean m7553remeasure_Sx5XlM$ui$default;
        if (p1 != null) {
            m7553remeasure_Sx5XlM$ui$default = p0.m7560remeasure_Sx5XlM$ui(p1);
        } else {
            m7553remeasure_Sx5XlM$ui$default = androidx.compose.ui.node.LayoutNode.m7553remeasure_Sx5XlM$ui$default(p0, null, 1, null);
        }
        androidx.compose.ui.node.LayoutNode parent$ui = p0.getParent$ui();
        if (m7553remeasure_Sx5XlM$ui$default && parent$ui != null) {
            if (p0.getMeasuredByParent$ui() == androidx.compose.ui.node.LayoutNode.UsageByParent.InMeasureBlock) {
                androidx.compose.ui.node.LayoutNode.requestRemeasure$ui$default(parent$ui, false, false, false, 3, null);
                return m7553remeasure_Sx5XlM$ui$default;
            }
            if (p0.getMeasuredByParent$ui() == androidx.compose.ui.node.LayoutNode.UsageByParent.InLayoutBlock) {
                androidx.compose.ui.node.LayoutNode.requestRelayout$ui$default(parent$ui, false, 1, null);
            }
        }
        return m7553remeasure_Sx5XlM$ui$default;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean measureAndLayout$default(androidx.compose.ui.node.MeasureAndLayoutDelegate measureAndLayoutDelegate, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        return measureAndLayoutDelegate.measureAndLayout(function0);
    }

    public final void measureOnly() {
        if (this.getHighSpeedVideoFpsRangesFor.isNotEmpty()) {
            if (!this.Camera2StreamConfigurationMap.isAttached()) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unattached root");
            }
            if (!this.Camera2StreamConfigurationMap.isPlaced()) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unplaced root");
            }
            if (this.duringMeasureLayout) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called during measure layout");
            }
            if (this.getInputSizeshNQ4ISI != null) {
                this.duringMeasureLayout = true;
                this.getHighSpeedVideoSizes = false;
                try {
                    if (this.getHighSpeedVideoFpsRangesFor.getAffectsLookaheadMeasure()) {
                        if (this.Camera2StreamConfigurationMap.getLookaheadRoot() != null) {
                            getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap, true);
                        } else {
                            getInputSizeshNQ4ISI(this.Camera2StreamConfigurationMap);
                        }
                    }
                    getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap, false);
                } catch (java.lang.Throwable th) {
                    try {
                        androidx.compose.ui.node.RootForTest.UncaughtExceptionHandler uncaughtExceptionHandler = this.uncaughtExceptionHandler;
                        if (uncaughtExceptionHandler == null) {
                            throw th;
                        }
                        uncaughtExceptionHandler.onUncaughtException(th);
                    } catch (java.lang.Throwable th2) {
                        this.duringMeasureLayout = false;
                        this.getHighSpeedVideoSizes = false;
                        throw th2;
                    }
                }
                this.duringMeasureLayout = false;
                this.getHighSpeedVideoSizes = false;
                androidx.compose.ui.node.LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.getOutputFormats;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            }
        }
    }

    /* renamed from: measureAndLayout-0kLqBqw, reason: not valid java name */
    public final void m7586measureAndLayout0kLqBqw(androidx.compose.ui.node.LayoutNode layoutNode, long constraints) {
        if (layoutNode.getIsDeactivated()) {
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(layoutNode, this.Camera2StreamConfigurationMap)) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("measureAndLayout called on root");
        }
        if (!this.Camera2StreamConfigurationMap.isAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unattached root");
        }
        if (!this.Camera2StreamConfigurationMap.isPlaced()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unplaced root");
        }
        if (this.duringMeasureLayout) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called during measure layout");
        }
        if (this.getInputSizeshNQ4ISI != null) {
            this.duringMeasureLayout = true;
            this.getHighSpeedVideoSizes = false;
            try {
                this.getHighSpeedVideoFpsRangesFor.remove(layoutNode);
                if ((Camera2StreamConfigurationMap(layoutNode, androidx.compose.ui.unit.Constraints.m8542boximpl(constraints)) || layoutNode.getLookaheadLayoutPending$ui()) && kotlin.jvm.internal.Intrinsics.areEqual(layoutNode.isPlacedInLookahead(), java.lang.Boolean.TRUE)) {
                    layoutNode.lookaheadReplace$ui();
                }
                getHighResolutionOutputSizeshNQ4ISI(layoutNode);
                getHighSpeedVideoSizes(layoutNode, androidx.compose.ui.unit.Constraints.m8542boximpl(constraints));
                if (layoutNode.getLayoutPending$ui() && layoutNode.isPlaced()) {
                    layoutNode.replace$ui();
                    this.getHighSpeedVideoFpsRanges.onNodePositioned(layoutNode);
                }
                getHighResolutionOutputSizeshNQ4ISI();
            } catch (java.lang.Throwable th) {
                try {
                    androidx.compose.ui.node.RootForTest.UncaughtExceptionHandler uncaughtExceptionHandler = this.uncaughtExceptionHandler;
                    if (uncaughtExceptionHandler == null) {
                        throw th;
                    }
                    uncaughtExceptionHandler.onUncaughtException(th);
                } catch (java.lang.Throwable th2) {
                    this.duringMeasureLayout = false;
                    this.getHighSpeedVideoSizes = false;
                    throw th2;
                }
            }
            this.duringMeasureLayout = false;
            this.getHighSpeedVideoSizes = false;
            androidx.compose.ui.node.LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.getOutputFormats;
            if (layoutTreeConsistencyChecker != null) {
                layoutTreeConsistencyChecker.assertConsistent();
            }
        }
        Camera2StreamConfigurationMap();
    }

    public final void registerOnLayoutCompletedListener(androidx.compose.ui.node.Owner.OnLayoutCompletedListener listener) {
        this.getHighResolutionOutputSizeshNQ4ISI.add(listener);
    }

    private final void Camera2StreamConfigurationMap() {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.Owner.OnLayoutCompletedListener> mutableVector = this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.compose.ui.node.Owner.OnLayoutCompletedListener[] onLayoutCompletedListenerArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            onLayoutCompletedListenerArr[i].onLayoutComplete();
        }
        this.getHighResolutionOutputSizeshNQ4ISI.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean Camera2StreamConfigurationMap(androidx.compose.ui.node.LayoutNode p0, boolean p1, boolean p2) {
        androidx.compose.ui.unit.Constraints constraints;
        boolean z;
        androidx.compose.ui.node.LayoutNode parent$ui;
        if (p0.getIsDeactivated()) {
            return false;
        }
        if (!p0.isPlaced() && !p0.isPlacedByParent() && !getHighSpeedVideoFpsRangesFor(p0) && !kotlin.jvm.internal.Intrinsics.areEqual(p0.isPlacedInLookahead(), java.lang.Boolean.TRUE) && !getHighSpeedVideoFpsRanges(p0) && !p0.getAlignmentLinesRequired$ui()) {
            return false;
        }
        if (p0 == this.Camera2StreamConfigurationMap) {
            constraints = this.getInputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.checkNotNull(constraints);
        } else {
            constraints = null;
        }
        if (p1) {
            z = p0.getLookaheadMeasurePending$ui() ? Camera2StreamConfigurationMap(p0, constraints) : false;
            if (p2 && ((z || p0.getLookaheadLayoutPending$ui()) && kotlin.jvm.internal.Intrinsics.areEqual(p0.isPlacedInLookahead(), java.lang.Boolean.TRUE))) {
                p0.lookaheadReplace$ui();
            }
        } else {
            boolean highSpeedVideoSizes = p0.getMeasurePending$ui() ? getHighSpeedVideoSizes(p0, constraints) : false;
            if (p2 && p0.getLayoutPending$ui() && (p0 == this.Camera2StreamConfigurationMap || ((parent$ui = p0.getParent$ui()) != null && parent$ui.isPlaced() && p0.isPlacedByParent()))) {
                if (p0 == this.Camera2StreamConfigurationMap) {
                    p0.place$ui(0, 0);
                } else {
                    p0.replace$ui();
                }
                this.getHighSpeedVideoFpsRanges.onNodePositioned(p0);
                androidx.compose.ui.node.LayoutTreeConsistencyChecker layoutTreeConsistencyChecker = this.getOutputFormats;
                if (layoutTreeConsistencyChecker != null) {
                    layoutTreeConsistencyChecker.assertConsistent();
                }
            }
            z = highSpeedVideoSizes;
        }
        getHighResolutionOutputSizeshNQ4ISI();
        return z;
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        if (this.getHighSpeedVideoSizesFor.getSize() != 0) {
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.MeasureAndLayoutDelegate.PostponedRequest> mutableVector = this.getHighSpeedVideoSizesFor;
            androidx.compose.ui.node.MeasureAndLayoutDelegate.PostponedRequest[] postponedRequestArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i = 0; i < size; i++) {
                androidx.compose.ui.node.MeasureAndLayoutDelegate.PostponedRequest postponedRequest = postponedRequestArr[i];
                if (postponedRequest.getNode().isAttached()) {
                    if (!postponedRequest.getIsLookahead()) {
                        androidx.compose.ui.node.LayoutNode.requestRemeasure$ui$default(postponedRequest.getNode(), postponedRequest.getIsForced(), false, false, 2, null);
                    } else {
                        androidx.compose.ui.node.LayoutNode.requestLookaheadRemeasure$ui$default(postponedRequest.getNode(), postponedRequest.getIsForced(), false, false, 2, null);
                    }
                }
            }
            this.getHighSpeedVideoSizesFor.clear();
        }
    }

    private final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.node.LayoutNode p0, boolean p1) {
        androidx.compose.ui.unit.Constraints constraints;
        if (p0.getIsDeactivated()) {
            return;
        }
        if (p0 == this.Camera2StreamConfigurationMap) {
            constraints = this.getInputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.checkNotNull(constraints);
        } else {
            constraints = null;
        }
        if (p1) {
            Camera2StreamConfigurationMap(p0, constraints);
        } else {
            getHighSpeedVideoSizes(p0, constraints);
        }
    }

    public final void forceMeasureTheSubtree(androidx.compose.ui.node.LayoutNode layoutNode, boolean affectsLookahead) {
        if (!this.duringMeasureLayout) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (getHighResolutionOutputSizeshNQ4ISI(layoutNode, affectsLookahead)) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("node not yet measured");
        }
        Camera2StreamConfigurationMap(layoutNode, affectsLookahead);
    }

    private final void getHighSpeedVideoSizes(androidx.compose.ui.node.LayoutNode p0, boolean p1) {
        if (getHighResolutionOutputSizeshNQ4ISI(p0, p1)) {
            Camera2StreamConfigurationMap(p0, p1, false);
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
            this.getHighSpeedVideoFpsRanges.onRootNodePositioned(this.Camera2StreamConfigurationMap);
        }
        if (this.getHighSpeedVideoFpsRanges.isNotEmpty()) {
            this.getHighSpeedVideoFpsRanges.dispatch();
        }
    }

    public final void onNodeDetached(androidx.compose.ui.node.LayoutNode node) {
        this.getHighSpeedVideoFpsRangesFor.remove(node);
        this.getHighSpeedVideoFpsRanges.remove(node);
    }

    private static boolean getOutputFormats(androidx.compose.ui.node.LayoutNode layoutNode) {
        return layoutNode.getMeasuredByParent$ui() == androidx.compose.ui.node.LayoutNode.UsageByParent.InMeasureBlock || layoutNode.getLayoutDelegate().getAlignmentLinesOwner$ui().getAlignmentLines().getRequired$ui();
    }

    private static boolean Camera2StreamConfigurationMap(androidx.compose.ui.node.LayoutNode layoutNode) {
        do {
            if (layoutNode.getMeasuredByParent$ui() == androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed && !layoutNode.getLayoutDelegate().getAlignmentLinesOwner$ui().getAlignmentLines().getRequired$ui()) {
                androidx.compose.ui.node.LayoutNode parent$ui = layoutNode.getParent$ui();
                if ((parent$ui != null ? parent$ui.getLayoutState$ui() : null) != androidx.compose.ui.node.LayoutNode.LayoutState.Measuring) {
                    return false;
                }
            }
            layoutNode = layoutNode.getParent$ui();
            if (layoutNode == null) {
                return false;
            }
        } while (!layoutNode.isPlaced());
        return true;
    }

    private static boolean getHighSpeedVideoFpsRangesFor(androidx.compose.ui.node.LayoutNode layoutNode) {
        return layoutNode.getMeasurePending$ui() && Camera2StreamConfigurationMap(layoutNode);
    }

    private static boolean getHighSpeedVideoFpsRanges(androidx.compose.ui.node.LayoutNode layoutNode) {
        androidx.compose.ui.node.AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui;
        androidx.compose.ui.node.AlignmentLines alignmentLines;
        if (layoutNode.getLookaheadMeasurePending$ui()) {
            return (layoutNode.getMeasuredByParentInLookahead$ui() == androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed && ((lookaheadAlignmentLinesOwner$ui = layoutNode.getLayoutDelegate().getLookaheadAlignmentLinesOwner$ui()) == null || (alignmentLines = lookaheadAlignmentLinesOwner$ui.getAlignmentLines()) == null || !alignmentLines.getRequired$ui())) ? false : true;
        }
        return false;
    }

    private static boolean getHighSpeedVideoSizes(androidx.compose.ui.node.LayoutNode layoutNode) {
        androidx.compose.ui.node.AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui;
        androidx.compose.ui.node.AlignmentLines alignmentLines;
        return layoutNode.getMeasuredByParentInLookahead$ui() == androidx.compose.ui.node.LayoutNode.UsageByParent.InMeasureBlock || !((lookaheadAlignmentLinesOwner$ui = layoutNode.getLayoutDelegate().getLookaheadAlignmentLinesOwner$ui()) == null || (alignmentLines = lookaheadAlignmentLinesOwner$ui.getAlignmentLines()) == null || !alignmentLines.getRequired$ui());
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.node.LayoutNode layoutNode, boolean z) {
        return z ? layoutNode.getLookaheadMeasurePending$ui() : layoutNode.getMeasurePending$ui();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u0005\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u0006\u0010\r"}, d2 = {"Landroidx/compose/ui/node/MeasureAndLayoutDelegate$PostponedRequest;", "", "Landroidx/compose/ui/node/LayoutNode;", "node", "", "isLookahead", "isForced", "<init>", "(Landroidx/compose/ui/node/LayoutNode;ZZ)V", "Landroidx/compose/ui/node/LayoutNode;", "getNode", "()Landroidx/compose/ui/node/LayoutNode;", "Z", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
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

    /* JADX WARN: Removed duplicated region for block: B:60:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean measureAndLayout(kotlin.jvm.functions.Function0<kotlin.Unit> onLayout) {
        boolean z;
        androidx.compose.ui.node.LayoutTreeConsistencyChecker layoutTreeConsistencyChecker;
        androidx.compose.ui.node.LayoutNode pop;
        boolean z2;
        boolean z3;
        if (!this.Camera2StreamConfigurationMap.isAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unattached root");
        }
        if (!this.Camera2StreamConfigurationMap.isPlaced()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called with unplaced root");
        }
        if (this.duringMeasureLayout) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("performMeasureAndLayout called during measure layout");
        }
        boolean z4 = false;
        if (this.getInputSizeshNQ4ISI != null) {
            this.duringMeasureLayout = true;
            this.getHighSpeedVideoSizes = true;
            try {
                if (this.getHighSpeedVideoFpsRangesFor.isNotEmpty()) {
                    androidx.compose.ui.node.DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = this.getHighSpeedVideoFpsRangesFor;
                    z = false;
                    while (true) {
                        try {
                            if (!depthSortedSetsForDifferentPasses.getHighSpeedVideoFpsRangesFor.isEmpty()) {
                                pop = depthSortedSetsForDifferentPasses.getHighSpeedVideoFpsRangesFor.pop();
                                z3 = pop.getLookaheadRoot() != null;
                                z2 = false;
                            } else if (!depthSortedSetsForDifferentPasses.getHighSpeedVideoFpsRanges.isEmpty()) {
                                pop = depthSortedSetsForDifferentPasses.getHighSpeedVideoFpsRanges.pop();
                                z3 = pop.getLookaheadRoot() != null;
                                z2 = true;
                            } else {
                                if (depthSortedSetsForDifferentPasses.getHighSpeedVideoSizes.isEmpty()) {
                                    break;
                                }
                                pop = depthSortedSetsForDifferentPasses.getHighSpeedVideoSizes.pop();
                                z2 = true;
                                z3 = false;
                            }
                            boolean Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(pop, z3, z2);
                            if (!z2) {
                                if (pop.getLookaheadLayoutPending$ui()) {
                                    this.getHighSpeedVideoFpsRangesFor.add(pop, androidx.compose.ui.node.Invalidation.LookaheadPlacement);
                                }
                                if (pop.getLayoutPending$ui()) {
                                    this.getHighSpeedVideoFpsRangesFor.add(pop, androidx.compose.ui.node.Invalidation.Placement);
                                }
                            }
                            if (pop == this.Camera2StreamConfigurationMap && Camera2StreamConfigurationMap) {
                                z = true;
                            }
                        } catch (java.lang.Throwable th) {
                            th = th;
                            try {
                                androidx.compose.ui.node.RootForTest.UncaughtExceptionHandler uncaughtExceptionHandler = this.uncaughtExceptionHandler;
                                if (uncaughtExceptionHandler != null) {
                                    uncaughtExceptionHandler.onUncaughtException(th);
                                    this.duringMeasureLayout = false;
                                    this.getHighSpeedVideoSizes = false;
                                    layoutTreeConsistencyChecker = this.getOutputFormats;
                                    if (layoutTreeConsistencyChecker != null) {
                                    }
                                    z4 = z;
                                    Camera2StreamConfigurationMap();
                                    return z4;
                                }
                                throw th;
                            } catch (java.lang.Throwable th2) {
                                this.duringMeasureLayout = false;
                                this.getHighSpeedVideoSizes = false;
                                throw th2;
                            }
                        }
                    }
                    if (onLayout != null) {
                        onLayout.invoke();
                    }
                } else {
                    z = false;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                z = false;
            }
            this.duringMeasureLayout = false;
            this.getHighSpeedVideoSizes = false;
            layoutTreeConsistencyChecker = this.getOutputFormats;
            if (layoutTreeConsistencyChecker != null) {
                layoutTreeConsistencyChecker.assertConsistent();
            }
            z4 = z;
        }
        Camera2StreamConfigurationMap();
        return z4;
    }

    private final void getInputSizeshNQ4ISI(androidx.compose.ui.node.LayoutNode p0) {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = p0.get_children$ui();
        androidx.compose.ui.node.LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.node.LayoutNode layoutNode = layoutNodeArr[i];
            if (getOutputFormats(layoutNode)) {
                if (androidx.compose.ui.node.LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(layoutNode)) {
                    getHighSpeedVideoFpsRangesFor(layoutNode, true);
                } else {
                    getInputSizeshNQ4ISI(layoutNode);
                }
            }
        }
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.node.LayoutNode p0) {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = p0.get_children$ui();
        androidx.compose.ui.node.LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.node.LayoutNode layoutNode = layoutNodeArr[i];
            if (kotlin.jvm.internal.Intrinsics.areEqual(layoutNode.isPlacedInLookahead(), java.lang.Boolean.TRUE) && !layoutNode.getIsDeactivated()) {
                if (this.getHighSpeedVideoFpsRangesFor.contains(layoutNode, true)) {
                    layoutNode.lookaheadReplace$ui();
                }
                getHighResolutionOutputSizeshNQ4ISI(layoutNode);
            }
        }
    }

    private final void Camera2StreamConfigurationMap(androidx.compose.ui.node.LayoutNode p0, boolean p1) {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = p0.get_children$ui();
        androidx.compose.ui.node.LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.node.LayoutNode layoutNode = layoutNodeArr[i];
            if ((!p1 && getOutputFormats(layoutNode)) || (p1 && getHighSpeedVideoSizes(layoutNode))) {
                if (androidx.compose.ui.node.LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(layoutNode) && !p1) {
                    if (layoutNode.getLookaheadMeasurePending$ui() && this.getHighSpeedVideoFpsRangesFor.contains(layoutNode, true)) {
                        Camera2StreamConfigurationMap(layoutNode, true, false);
                    } else {
                        forceMeasureTheSubtree(layoutNode, true);
                    }
                }
                getHighSpeedVideoSizes(layoutNode, p1);
                if (!getHighResolutionOutputSizeshNQ4ISI(layoutNode, p1)) {
                    Camera2StreamConfigurationMap(layoutNode, p1);
                }
            }
        }
        getHighSpeedVideoSizes(p0, p1);
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class WhenMappings {
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
}
