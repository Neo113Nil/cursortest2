package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0012\u0010\bJ\r\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\bJ\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\bJ\r\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\bJ\r\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\bJ\r\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001e\u001a\u00020\u001b8G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010!\u001a\u0004\u0018\u00010\r8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010#\u001a\u0004\u0018\u00010\r8G¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0014\u0010'\u001a\u00020$8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020$8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b(\u0010&R\"\u0010+\u001a\u00020*8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00101\u001a\u00020*8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R\"\u00105\u001a\u0002048\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020*8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b;\u0010.R\u0014\u0010>\u001a\u00020*8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b=\u0010.R\"\u0010?\u001a\u00020*8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b?\u0010,\u001a\u0004\b@\u0010.\"\u0004\bA\u00100R\"\u0010B\u001a\u00020*8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bB\u0010,\u001a\u0004\bC\u0010.\"\u0004\bD\u00100R\"\u0010E\u001a\u00020*8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bE\u0010,\u001a\u0004\bF\u0010.\"\u0004\bG\u00100R\"\u0010H\u001a\u00020$8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010&\"\u0004\bK\u0010LR\"\u0010M\u001a\u00020$8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bM\u0010I\u001a\u0004\bN\u0010&\"\u0004\bO\u0010LR\u0014\u0010S\u001a\u00020P8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0016\u0010U\u001a\u0004\u0018\u00010P8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bT\u0010RR*\u0010W\u001a\u00020*2\u0006\u0010V\u001a\u00020*8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\bW\u0010,\u001a\u0004\bX\u0010.\"\u0004\bY\u00100R*\u0010Z\u001a\u00020*2\u0006\u0010V\u001a\u00020*8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\bZ\u0010,\u001a\u0004\b[\u0010.\"\u0004\b\\\u00100R*\u0010]\u001a\u00020$2\u0006\u0010V\u001a\u00020$8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b]\u0010I\u001a\u0004\b^\u0010&\"\u0004\b_\u0010LR*\u0010`\u001a\u00020*2\u0006\u0010V\u001a\u00020*8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b`\u0010,\u001a\u0004\ba\u0010.\"\u0004\bb\u00100R*\u0010c\u001a\u00020*2\u0006\u0010V\u001a\u00020*8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\bc\u0010,\u001a\u0004\bd\u0010.\"\u0004\be\u00100R*\u0010f\u001a\u00020$2\u0006\u0010V\u001a\u00020$8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\bf\u0010I\u001a\u0004\bg\u0010&\"\u0004\bh\u0010LR\u001a\u0010j\u001a\u00020i8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR(\u0010p\u001a\u0004\u0018\u00010n2\b\u0010o\u001a\u0004\u0018\u00010n8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010s"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "", "markLayoutPending$ui", "()V", "markMeasurePending$ui", "markLookaheadLayoutPending$ui", "markLookaheadMeasurePending$ui", "onCoordinatesUsed", "Landroidx/compose/ui/unit/Constraints;", "constraints", "performLookaheadMeasure-BRTryo0$ui", "(J)V", "performLookaheadMeasure", "ensureLookaheadDelegateCreated$ui", "updateParentData", "invalidateParentData", "resetAlignmentLines", "markChildrenDirty", "onRemovedFromLookaheadScope", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode$ui", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/NodeCoordinator;", "getOuterCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "outerCoordinator", "getLastConstraints-DWUhwKw", "()Landroidx/compose/ui/unit/Constraints;", "lastConstraints", "getLastLookaheadConstraints-DWUhwKw", "lastLookaheadConstraints", "", "getHeight$ui", "()I", "height", "getWidth$ui", "width", "", "detachedFromParentLookaheadPass", "Z", "getDetachedFromParentLookaheadPass$ui", "()Z", "setDetachedFromParentLookaheadPass$ui", "(Z)V", "detachedFromParentLookaheadPlacement", "getDetachedFromParentLookaheadPlacement$ui", "setDetachedFromParentLookaheadPlacement$ui", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "layoutState", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "getLayoutState$ui", "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "setLayoutState$ui", "(Landroidx/compose/ui/node/LayoutNode$LayoutState;)V", "getMeasurePending$ui", "measurePending", "getLayoutPending$ui", "layoutPending", "lookaheadMeasurePending", "getLookaheadMeasurePending$ui", "setLookaheadMeasurePending$ui", "lookaheadLayoutPending", "getLookaheadLayoutPending$ui", "setLookaheadLayoutPending$ui", "lookaheadLayoutPendingForAlignment", "getLookaheadLayoutPendingForAlignment$ui", "setLookaheadLayoutPendingForAlignment$ui", "nextChildLookaheadPlaceOrder", com.visa.cbp.getEncExpo.warmup, "getNextChildLookaheadPlaceOrder$ui", "setNextChildLookaheadPlaceOrder$ui", "(I)V", "nextChildPlaceOrder", "getNextChildPlaceOrder$ui", "setNextChildPlaceOrder$ui", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner$ui", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "alignmentLinesOwner", "getLookaheadAlignmentLinesOwner$ui", "lookaheadAlignmentLinesOwner", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "coordinatesAccessedDuringPlacement", "getCoordinatesAccessedDuringPlacement", "setCoordinatesAccessedDuringPlacement", "coordinatesAccessedDuringModifierPlacement", "getCoordinatesAccessedDuringModifierPlacement", "setCoordinatesAccessedDuringModifierPlacement", "childrenAccessingCoordinatesDuringPlacement", "getChildrenAccessingCoordinatesDuringPlacement", "setChildrenAccessingCoordinatesDuringPlacement", "lookaheadCoordinatesAccessedDuringPlacement", "getLookaheadCoordinatesAccessedDuringPlacement", "setLookaheadCoordinatesAccessedDuringPlacement", "lookaheadCoordinatesAccessedDuringModifierPlacement", "getLookaheadCoordinatesAccessedDuringModifierPlacement", "setLookaheadCoordinatesAccessedDuringModifierPlacement", "childrenAccessingLookaheadCoordinatesDuringPlacement", "getChildrenAccessingLookaheadCoordinatesDuringPlacement", "setChildrenAccessingLookaheadCoordinatesDuringPlacement", "Landroidx/compose/ui/node/MeasurePassDelegate;", "measurePassDelegate", "Landroidx/compose/ui/node/MeasurePassDelegate;", "getMeasurePassDelegate$ui", "()Landroidx/compose/ui/node/MeasurePassDelegate;", "Landroidx/compose/ui/node/LookaheadPassDelegate;", "p0", "lookaheadPassDelegate", "Landroidx/compose/ui/node/LookaheadPassDelegate;", "getLookaheadPassDelegate$ui", "()Landroidx/compose/ui/node/LookaheadPassDelegate;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutNodeLayoutDelegate {
    public static final int $stable = 8;
    private int childrenAccessingCoordinatesDuringPlacement;
    private int childrenAccessingLookaheadCoordinatesDuringPlacement;
    private boolean coordinatesAccessedDuringModifierPlacement;
    private boolean coordinatesAccessedDuringPlacement;
    private boolean detachedFromParentLookaheadPass;
    private boolean detachedFromParentLookaheadPlacement;
    private final androidx.compose.ui.node.LayoutNode layoutNode;
    private boolean lookaheadCoordinatesAccessedDuringModifierPlacement;
    private boolean lookaheadCoordinatesAccessedDuringPlacement;
    private boolean lookaheadLayoutPending;
    private boolean lookaheadLayoutPendingForAlignment;
    private boolean lookaheadMeasurePending;
    private androidx.compose.ui.node.LookaheadPassDelegate lookaheadPassDelegate;
    private int nextChildLookaheadPlaceOrder;
    private int nextChildPlaceOrder;
    private androidx.compose.ui.node.LayoutNode.LayoutState layoutState = androidx.compose.ui.node.LayoutNode.LayoutState.Idle;
    private final androidx.compose.ui.node.MeasurePassDelegate measurePassDelegate = new androidx.compose.ui.node.MeasurePassDelegate(this);

    public LayoutNodeLayoutDelegate(androidx.compose.ui.node.LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
    }

    /* renamed from: getLayoutNode$ui, reason: from getter */
    public final androidx.compose.ui.node.LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public final androidx.compose.ui.node.NodeCoordinator getOuterCoordinator() {
        return this.layoutNode.getNodes().getOuterCoordinator();
    }

    /* renamed from: getLastConstraints-DWUhwKw, reason: not valid java name */
    public final androidx.compose.ui.unit.Constraints m7572getLastConstraintsDWUhwKw() {
        return this.measurePassDelegate.m7589getLastConstraintsDWUhwKw();
    }

    /* renamed from: getLastLookaheadConstraints-DWUhwKw, reason: not valid java name */
    public final androidx.compose.ui.unit.Constraints m7573getLastLookaheadConstraintsDWUhwKw() {
        androidx.compose.ui.node.LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            return lookaheadPassDelegate.getGetOutputStallDurationlomOqCM();
        }
        return null;
    }

    public final int getHeight$ui() {
        return this.measurePassDelegate.getHeight();
    }

    public final int getWidth$ui() {
        return this.measurePassDelegate.getWidth();
    }

    /* renamed from: getDetachedFromParentLookaheadPass$ui, reason: from getter */
    public final boolean getDetachedFromParentLookaheadPass() {
        return this.detachedFromParentLookaheadPass;
    }

    public final void setDetachedFromParentLookaheadPass$ui(boolean z) {
        this.detachedFromParentLookaheadPass = z;
    }

    /* renamed from: getDetachedFromParentLookaheadPlacement$ui, reason: from getter */
    public final boolean getDetachedFromParentLookaheadPlacement() {
        return this.detachedFromParentLookaheadPlacement;
    }

    public final void setDetachedFromParentLookaheadPlacement$ui(boolean z) {
        this.detachedFromParentLookaheadPlacement = z;
    }

    /* renamed from: getLayoutState$ui, reason: from getter */
    public final androidx.compose.ui.node.LayoutNode.LayoutState getLayoutState() {
        return this.layoutState;
    }

    public final void setLayoutState$ui(androidx.compose.ui.node.LayoutNode.LayoutState layoutState) {
        this.layoutState = layoutState;
    }

    public final boolean getMeasurePending$ui() {
        return this.measurePassDelegate.getMeasurePending();
    }

    public final boolean getLayoutPending$ui() {
        return this.measurePassDelegate.getLayoutPending();
    }

    /* renamed from: getLookaheadMeasurePending$ui, reason: from getter */
    public final boolean getLookaheadMeasurePending() {
        return this.lookaheadMeasurePending;
    }

    public final void setLookaheadMeasurePending$ui(boolean z) {
        this.lookaheadMeasurePending = z;
    }

    /* renamed from: getLookaheadLayoutPending$ui, reason: from getter */
    public final boolean getLookaheadLayoutPending() {
        return this.lookaheadLayoutPending;
    }

    public final void setLookaheadLayoutPending$ui(boolean z) {
        this.lookaheadLayoutPending = z;
    }

    /* renamed from: getLookaheadLayoutPendingForAlignment$ui, reason: from getter */
    public final boolean getLookaheadLayoutPendingForAlignment() {
        return this.lookaheadLayoutPendingForAlignment;
    }

    public final void setLookaheadLayoutPendingForAlignment$ui(boolean z) {
        this.lookaheadLayoutPendingForAlignment = z;
    }

    /* renamed from: getNextChildLookaheadPlaceOrder$ui, reason: from getter */
    public final int getNextChildLookaheadPlaceOrder() {
        return this.nextChildLookaheadPlaceOrder;
    }

    public final void setNextChildLookaheadPlaceOrder$ui(int i) {
        this.nextChildLookaheadPlaceOrder = i;
    }

    /* renamed from: getNextChildPlaceOrder$ui, reason: from getter */
    public final int getNextChildPlaceOrder() {
        return this.nextChildPlaceOrder;
    }

    public final void setNextChildPlaceOrder$ui(int i) {
        this.nextChildPlaceOrder = i;
    }

    public final void markLayoutPending$ui() {
        this.measurePassDelegate.markLayoutPending();
    }

    public final void markMeasurePending$ui() {
        this.measurePassDelegate.markMeasurePending$ui();
    }

    public final void markLookaheadLayoutPending$ui() {
        this.lookaheadLayoutPending = true;
        this.lookaheadLayoutPendingForAlignment = true;
    }

    public final void markLookaheadMeasurePending$ui() {
        this.lookaheadMeasurePending = true;
    }

    public final androidx.compose.ui.node.AlignmentLinesOwner getAlignmentLinesOwner$ui() {
        return this.measurePassDelegate;
    }

    public final androidx.compose.ui.node.AlignmentLinesOwner getLookaheadAlignmentLinesOwner$ui() {
        return this.lookaheadPassDelegate;
    }

    public final boolean getCoordinatesAccessedDuringPlacement() {
        return this.coordinatesAccessedDuringPlacement;
    }

    public final void setCoordinatesAccessedDuringPlacement(boolean z) {
        if (this.coordinatesAccessedDuringPlacement != z) {
            this.coordinatesAccessedDuringPlacement = z;
            if (z && !this.coordinatesAccessedDuringModifierPlacement) {
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement + 1);
            } else {
                if (z || this.coordinatesAccessedDuringModifierPlacement) {
                    return;
                }
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final boolean getCoordinatesAccessedDuringModifierPlacement() {
        return this.coordinatesAccessedDuringModifierPlacement;
    }

    public final void setCoordinatesAccessedDuringModifierPlacement(boolean z) {
        if (this.coordinatesAccessedDuringModifierPlacement != z) {
            this.coordinatesAccessedDuringModifierPlacement = z;
            if (z && !this.coordinatesAccessedDuringPlacement) {
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement + 1);
            } else {
                if (z || this.coordinatesAccessedDuringPlacement) {
                    return;
                }
                setChildrenAccessingCoordinatesDuringPlacement(this.childrenAccessingCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final int getChildrenAccessingCoordinatesDuringPlacement() {
        return this.childrenAccessingCoordinatesDuringPlacement;
    }

    public final void setChildrenAccessingCoordinatesDuringPlacement(int i) {
        androidx.compose.ui.node.LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this;
        while (true) {
            int i2 = layoutNodeLayoutDelegate.childrenAccessingCoordinatesDuringPlacement;
            layoutNodeLayoutDelegate.childrenAccessingCoordinatesDuringPlacement = i;
            if ((i2 == 0) == (i == 0)) {
                return;
            }
            androidx.compose.ui.node.LayoutNode parent$ui = layoutNodeLayoutDelegate.layoutNode.getParent$ui();
            layoutNodeLayoutDelegate = parent$ui != null ? parent$ui.getLayoutDelegate() : null;
            if (layoutNodeLayoutDelegate == null) {
                return;
            }
            if (i == 0) {
                i = layoutNodeLayoutDelegate.childrenAccessingCoordinatesDuringPlacement - 1;
            } else {
                i = layoutNodeLayoutDelegate.childrenAccessingCoordinatesDuringPlacement + 1;
            }
        }
    }

    public final boolean getLookaheadCoordinatesAccessedDuringPlacement() {
        return this.lookaheadCoordinatesAccessedDuringPlacement;
    }

    public final void setLookaheadCoordinatesAccessedDuringPlacement(boolean z) {
        if (this.lookaheadCoordinatesAccessedDuringPlacement != z) {
            this.lookaheadCoordinatesAccessedDuringPlacement = z;
            if (z && !this.lookaheadCoordinatesAccessedDuringModifierPlacement) {
                setChildrenAccessingLookaheadCoordinatesDuringPlacement(this.childrenAccessingLookaheadCoordinatesDuringPlacement + 1);
            } else {
                if (z || this.lookaheadCoordinatesAccessedDuringModifierPlacement) {
                    return;
                }
                setChildrenAccessingLookaheadCoordinatesDuringPlacement(this.childrenAccessingLookaheadCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final boolean getLookaheadCoordinatesAccessedDuringModifierPlacement() {
        return this.lookaheadCoordinatesAccessedDuringModifierPlacement;
    }

    public final void setLookaheadCoordinatesAccessedDuringModifierPlacement(boolean z) {
        if (this.lookaheadCoordinatesAccessedDuringModifierPlacement != z) {
            this.lookaheadCoordinatesAccessedDuringModifierPlacement = z;
            if (z && !this.lookaheadCoordinatesAccessedDuringPlacement) {
                setChildrenAccessingLookaheadCoordinatesDuringPlacement(this.childrenAccessingLookaheadCoordinatesDuringPlacement + 1);
            } else {
                if (z || this.lookaheadCoordinatesAccessedDuringPlacement) {
                    return;
                }
                setChildrenAccessingLookaheadCoordinatesDuringPlacement(this.childrenAccessingLookaheadCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final int getChildrenAccessingLookaheadCoordinatesDuringPlacement() {
        return this.childrenAccessingLookaheadCoordinatesDuringPlacement;
    }

    public final void setChildrenAccessingLookaheadCoordinatesDuringPlacement(int i) {
        androidx.compose.ui.node.LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this;
        while (true) {
            int i2 = layoutNodeLayoutDelegate.childrenAccessingLookaheadCoordinatesDuringPlacement;
            layoutNodeLayoutDelegate.childrenAccessingLookaheadCoordinatesDuringPlacement = i;
            if ((i2 == 0) == (i == 0)) {
                return;
            }
            androidx.compose.ui.node.LayoutNode parent$ui = layoutNodeLayoutDelegate.layoutNode.getParent$ui();
            layoutNodeLayoutDelegate = parent$ui != null ? parent$ui.getLayoutDelegate() : null;
            if (layoutNodeLayoutDelegate == null) {
                return;
            }
            if (i == 0) {
                i = layoutNodeLayoutDelegate.childrenAccessingLookaheadCoordinatesDuringPlacement - 1;
            } else {
                i = layoutNodeLayoutDelegate.childrenAccessingLookaheadCoordinatesDuringPlacement + 1;
            }
        }
    }

    /* renamed from: getMeasurePassDelegate$ui, reason: from getter */
    public final androidx.compose.ui.node.MeasurePassDelegate getMeasurePassDelegate() {
        return this.measurePassDelegate;
    }

    /* renamed from: getLookaheadPassDelegate$ui, reason: from getter */
    public final androidx.compose.ui.node.LookaheadPassDelegate getLookaheadPassDelegate() {
        return this.lookaheadPassDelegate;
    }

    public final void onCoordinatesUsed() {
        androidx.compose.ui.node.LayoutNode.LayoutState layoutState$ui = this.layoutNode.getLayoutState$ui();
        if (layoutState$ui == androidx.compose.ui.node.LayoutNode.LayoutState.LayingOut || layoutState$ui == androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut) {
            if (this.measurePassDelegate.getLayingOutChildren()) {
                setCoordinatesAccessedDuringPlacement(true);
            } else {
                setCoordinatesAccessedDuringModifierPlacement(true);
            }
        }
        if (layoutState$ui == androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut) {
            androidx.compose.ui.node.LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
            if (lookaheadPassDelegate != null && lookaheadPassDelegate.getLayingOutChildren()) {
                setLookaheadCoordinatesAccessedDuringPlacement(true);
            } else {
                setLookaheadCoordinatesAccessedDuringModifierPlacement(true);
            }
        }
    }

    /* renamed from: performLookaheadMeasure-BRTryo0$ui, reason: not valid java name */
    public final void m7574performLookaheadMeasureBRTryo0$ui(long constraints) {
        androidx.compose.ui.node.LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.m7584performMeasureBRTryo0$ui(constraints);
        }
    }

    public final void ensureLookaheadDelegateCreated$ui() {
        if (this.lookaheadPassDelegate == null) {
            this.lookaheadPassDelegate = new androidx.compose.ui.node.LookaheadPassDelegate(this);
        }
    }

    public final void updateParentData() {
        androidx.compose.ui.node.LayoutNode parent$ui;
        if (this.measurePassDelegate.updateParentData() && (parent$ui = this.layoutNode.getParent$ui()) != null) {
            androidx.compose.ui.node.LayoutNode.requestRemeasure$ui$default(parent$ui, false, false, false, 7, null);
        }
        androidx.compose.ui.node.LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate == null || !lookaheadPassDelegate.updateParentData()) {
            return;
        }
        if (androidx.compose.ui.node.LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(this.layoutNode)) {
            androidx.compose.ui.node.LayoutNode parent$ui2 = this.layoutNode.getParent$ui();
            if (parent$ui2 != null) {
                androidx.compose.ui.node.LayoutNode.requestRemeasure$ui$default(parent$ui2, false, false, false, 7, null);
                return;
            }
            return;
        }
        androidx.compose.ui.node.LayoutNode parent$ui3 = this.layoutNode.getParent$ui();
        if (parent$ui3 != null) {
            androidx.compose.ui.node.LayoutNode.requestLookaheadRemeasure$ui$default(parent$ui3, false, false, false, 7, null);
        }
    }

    public final void invalidateParentData() {
        this.measurePassDelegate.invalidateParentData();
        androidx.compose.ui.node.LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.invalidateParentData();
        }
    }

    public final void resetAlignmentLines() {
        androidx.compose.ui.node.AlignmentLines alignmentLines;
        this.measurePassDelegate.getAlignmentLines().reset$ui();
        androidx.compose.ui.node.LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate == null || (alignmentLines = lookaheadPassDelegate.getAlignmentLines()) == null) {
            return;
        }
        alignmentLines.reset$ui();
    }

    public final void markChildrenDirty() {
        this.measurePassDelegate.setChildDelegatesDirty$ui(true);
        androidx.compose.ui.node.LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.setChildDelegatesDirty$ui(true);
        }
    }

    public final void onRemovedFromLookaheadScope() {
        this.lookaheadPassDelegate = null;
        this.lookaheadLayoutPending = false;
        this.lookaheadMeasurePending = false;
    }
}
