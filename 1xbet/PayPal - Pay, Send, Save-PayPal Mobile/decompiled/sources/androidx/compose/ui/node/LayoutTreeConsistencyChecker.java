package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u000f*\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0012\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0012\u0010\u0016R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001a"}, d2 = {"Landroidx/compose/ui/node/LayoutTreeConsistencyChecker;", "", "Landroidx/compose/ui/node/LayoutNode;", "root", "Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;", "relayoutNodes", "", "Landroidx/compose/ui/node/MeasureAndLayoutDelegate$PostponedRequest;", "postponedMeasureRequests", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;Ljava/util/List;)V", "", "assertConsistent", "()V", "p0", "", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/ui/node/LayoutNode;)Z", "getHighResolutionOutputSizeshNQ4ISI", "", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/ui/node/LayoutNode;)Ljava/lang/String;", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;", "Ljava/util/List;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LayoutTreeConsistencyChecker {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.ui.node.LayoutNode getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.ui.node.DepthSortedSetsForDifferentPasses Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.List<androidx.compose.ui.node.MeasureAndLayoutDelegate.PostponedRequest> getHighSpeedVideoSizes;

    public LayoutTreeConsistencyChecker(androidx.compose.ui.node.LayoutNode layoutNode, androidx.compose.ui.node.DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses, java.util.List<androidx.compose.ui.node.MeasureAndLayoutDelegate.PostponedRequest> list) {
        this.getHighSpeedVideoFpsRanges = layoutNode;
        this.Camera2StreamConfigurationMap = depthSortedSetsForDifferentPasses;
        this.getHighSpeedVideoSizes = list;
    }

    public final void assertConsistent() {
        if (getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges)) {
            return;
        }
        java.lang.System.out.println((java.lang.Object) getHighResolutionOutputSizeshNQ4ISI());
        throw new java.lang.IllegalStateException("Inconsistency found!");
    }

    private final boolean getHighSpeedVideoFpsRangesFor(androidx.compose.ui.node.LayoutNode p0) {
        if (!getHighResolutionOutputSizeshNQ4ISI(p0)) {
            return false;
        }
        java.util.List<androidx.compose.ui.node.LayoutNode> children$ui = p0.getChildren$ui();
        int size = children$ui.size();
        for (int i = 0; i < size; i++) {
            if (!getHighSpeedVideoFpsRangesFor(children$ui.get(i))) {
                return false;
            }
        }
        return true;
    }

    private final boolean getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.node.LayoutNode layoutNode) {
        androidx.compose.ui.node.MeasureAndLayoutDelegate.PostponedRequest postponedRequest;
        androidx.compose.ui.node.LayoutNode parent$ui = layoutNode.getParent$ui();
        androidx.compose.ui.node.MeasureAndLayoutDelegate.PostponedRequest postponedRequest2 = null;
        androidx.compose.ui.node.LayoutNode.LayoutState layoutState$ui = parent$ui != null ? parent$ui.getLayoutState$ui() : null;
        if (layoutNode.isPlaced() || (layoutNode.getPlaceOrder$ui() != Integer.MAX_VALUE && parent$ui != null && parent$ui.isPlaced())) {
            if (layoutNode.getMeasurePending$ui()) {
                java.util.List<androidx.compose.ui.node.MeasureAndLayoutDelegate.PostponedRequest> list = this.getHighSpeedVideoSizes;
                int size = list.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        postponedRequest = null;
                        break;
                    }
                    postponedRequest = list.get(i);
                    androidx.compose.ui.node.MeasureAndLayoutDelegate.PostponedRequest postponedRequest3 = postponedRequest;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(postponedRequest3.getNode(), layoutNode) && !postponedRequest3.getIsLookahead()) {
                        break;
                    }
                    i++;
                }
                if (postponedRequest != null) {
                    return true;
                }
            }
            if (layoutNode.getIsDeactivated()) {
                return true;
            }
            if (layoutNode.getMeasurePending$ui()) {
                return this.Camera2StreamConfigurationMap.contains(layoutNode) || layoutNode.getLayoutState$ui() == androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadMeasuring || (parent$ui != null && parent$ui.getMeasurePending$ui()) || ((parent$ui != null && parent$ui.getLookaheadMeasurePending$ui()) || layoutState$ui == androidx.compose.ui.node.LayoutNode.LayoutState.Measuring);
            }
            if (layoutNode.getLayoutPending$ui()) {
                if (!this.Camera2StreamConfigurationMap.contains(layoutNode) && parent$ui != null && !parent$ui.getMeasurePending$ui() && !parent$ui.getLayoutPending$ui() && layoutState$ui != androidx.compose.ui.node.LayoutNode.LayoutState.Measuring && layoutState$ui != androidx.compose.ui.node.LayoutNode.LayoutState.LayingOut) {
                    java.util.List<androidx.compose.ui.node.MeasureAndLayoutDelegate.PostponedRequest> list2 = this.getHighSpeedVideoSizes;
                    int size2 = list2.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 < size2) {
                            if (kotlin.jvm.internal.Intrinsics.areEqual(list2.get(i2).getNode(), layoutNode)) {
                                break;
                            }
                            i2++;
                        } else {
                            if (layoutNode.getLayoutState$ui() == androidx.compose.ui.node.LayoutNode.LayoutState.Measuring || layoutNode.getLayoutState$ui() == androidx.compose.ui.node.LayoutNode.LayoutState.LayingOut) {
                                break;
                            }
                            return false;
                        }
                    }
                }
                return true;
            }
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(layoutNode.isPlacedInLookahead(), java.lang.Boolean.TRUE)) {
            if (layoutNode.getLookaheadMeasurePending$ui()) {
                java.util.List<androidx.compose.ui.node.MeasureAndLayoutDelegate.PostponedRequest> list3 = this.getHighSpeedVideoSizes;
                int size3 = list3.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size3) {
                        break;
                    }
                    androidx.compose.ui.node.MeasureAndLayoutDelegate.PostponedRequest postponedRequest4 = list3.get(i3);
                    androidx.compose.ui.node.MeasureAndLayoutDelegate.PostponedRequest postponedRequest5 = postponedRequest4;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(postponedRequest5.getNode(), layoutNode) && postponedRequest5.getIsLookahead()) {
                        postponedRequest2 = postponedRequest4;
                        break;
                    }
                    i3++;
                }
                if (postponedRequest2 != null) {
                    return true;
                }
            }
            if (layoutNode.getLookaheadMeasurePending$ui()) {
                return this.Camera2StreamConfigurationMap.contains(layoutNode, true) || (parent$ui != null && parent$ui.getLookaheadMeasurePending$ui()) || layoutState$ui == androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadMeasuring || (parent$ui != null && parent$ui.getMeasurePending$ui() && kotlin.jvm.internal.Intrinsics.areEqual(layoutNode.getLookaheadRoot(), layoutNode));
            }
            if (layoutNode.getLookaheadLayoutPending$ui() && !this.Camera2StreamConfigurationMap.contains(layoutNode, true) && parent$ui != null && !parent$ui.getLookaheadMeasurePending$ui() && !parent$ui.getLookaheadLayoutPending$ui() && layoutState$ui != androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadMeasuring && layoutState$ui != androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut && (!parent$ui.getLayoutPending$ui() || !kotlin.jvm.internal.Intrinsics.areEqual(layoutNode.getLookaheadRoot(), layoutNode))) {
                return false;
            }
        }
        return true;
    }

    private final java.lang.String getHighSpeedVideoFpsRanges(androidx.compose.ui.node.LayoutNode p0) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(p0);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("[");
        sb2.append(p0.getLayoutState$ui());
        sb2.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        sb.append(sb2.toString());
        if (!p0.isPlaced()) {
            sb.append("[!isPlaced]");
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("[measuredByParent=");
        sb3.append(p0.getMeasuredByParent$ui());
        sb3.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        sb.append(sb3.toString());
        if (!getHighResolutionOutputSizeshNQ4ISI(p0)) {
            sb.append("[INCONSISTENT]");
        }
        return sb.toString();
    }

    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Tree state:");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append('\n');
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
        getHighSpeedVideoFpsRangesFor(this, sb, this.getHighSpeedVideoFpsRanges, 0);
        return sb.toString();
    }

    private static final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.node.LayoutTreeConsistencyChecker layoutTreeConsistencyChecker, java.lang.StringBuilder sb, androidx.compose.ui.node.LayoutNode layoutNode, int i) {
        java.lang.String highSpeedVideoFpsRanges = layoutTreeConsistencyChecker.getHighSpeedVideoFpsRanges(layoutNode);
        if (highSpeedVideoFpsRanges.length() > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("..");
            }
            sb.append(highSpeedVideoFpsRanges);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
            sb.append('\n');
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
            i++;
        }
        java.util.List<androidx.compose.ui.node.LayoutNode> children$ui = layoutNode.getChildren$ui();
        int size = children$ui.size();
        for (int i3 = 0; i3 < size; i3++) {
            getHighSpeedVideoFpsRangesFor(layoutTreeConsistencyChecker, sb, children$ui.get(i3), i);
        }
    }
}
