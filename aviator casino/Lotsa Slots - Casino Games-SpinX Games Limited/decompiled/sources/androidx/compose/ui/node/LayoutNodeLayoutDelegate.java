package androidx.compose.ui.node;

/* compiled from: LayoutNodeLayoutDelegate.kt */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001c\b\u0000\u0018\u00002\u00020\u0001:\u0002^_B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010I\u001a\u00020DH\u0000¢\u0006\u0002\bJJ\u0006\u0010K\u001a\u00020DJ\u0006\u0010L\u001a\u00020DJ\r\u0010M\u001a\u00020DH\u0000¢\u0006\u0002\bNJ\r\u0010O\u001a\u00020DH\u0000¢\u0006\u0002\bPJ\r\u0010Q\u001a\u00020DH\u0000¢\u0006\u0002\bRJ\r\u0010S\u001a\u00020DH\u0000¢\u0006\u0002\bTJ\u0006\u0010U\u001a\u00020DJ\u001a\u0010V\u001a\u00020D2\u0006\u0010W\u001a\u00020\u001fH\u0002ø\u0001\u0000¢\u0006\u0004\bX\u0010YJ\u001a\u0010Z\u001a\u00020D2\u0006\u0010W\u001a\u00020\u001fH\u0002ø\u0001\u0000¢\u0006\u0004\b[\u0010YJ\u0006\u0010\\\u001a\u00020DJ\u0006\u0010]\u001a\u00020DR\u0014\u0010\u0005\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001e\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0010@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\rR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001f8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b \u0010!R\u0019\u0010\"\u001a\u0004\u0018\u00010\u001f8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b#\u0010!R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010$\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0010@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0013R\u000e\u0010&\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010(\u001a\u00020'2\u0006\u0010\u0019\u001a\u00020'@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010+\u001a\u0004\u0018\u00010\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\bR\u001e\u0010-\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0010@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0013R\u000e\u0010/\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u00100\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0010@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0013R*\u00103\u001a\b\u0018\u000102R\u00020\u00002\f\u0010\u0019\u001a\b\u0018\u000102R\u00020\u0000@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0018\u00106\u001a\u000607R\u00020\u0000X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u001e\u0010:\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0010@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\u0013R\u000e\u0010<\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010>\u001a\u00020?8F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010B\u001a\b\u0012\u0004\u0012\u00020D0CX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010E\u001a\u00020\u001fX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010FR\u0014\u0010G\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bH\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006`"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "alignmentLinesOwner", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner$ui_release", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "value", "", "childrenAccessingCoordinatesDuringPlacement", "getChildrenAccessingCoordinatesDuringPlacement", "()I", "setChildrenAccessingCoordinatesDuringPlacement", "(I)V", "", "coordinatesAccessedDuringModifierPlacement", "getCoordinatesAccessedDuringModifierPlacement", "()Z", "setCoordinatesAccessedDuringModifierPlacement", "(Z)V", "coordinatesAccessedDuringPlacement", "getCoordinatesAccessedDuringPlacement", "setCoordinatesAccessedDuringPlacement", "<set-?>", "detachedFromParentLookaheadPass", "getDetachedFromParentLookaheadPass$ui_release", "height", "getHeight$ui_release", "lastConstraints", "Landroidx/compose/ui/unit/Constraints;", "getLastConstraints-DWUhwKw", "()Landroidx/compose/ui/unit/Constraints;", "lastLookaheadConstraints", "getLastLookaheadConstraints-DWUhwKw", "layoutPending", "getLayoutPending$ui_release", "layoutPendingForAlignment", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "layoutState", "getLayoutState$ui_release", "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "lookaheadAlignmentLinesOwner", "getLookaheadAlignmentLinesOwner$ui_release", "lookaheadLayoutPending", "getLookaheadLayoutPending$ui_release", "lookaheadLayoutPendingForAlignment", "lookaheadMeasurePending", "getLookaheadMeasurePending$ui_release", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "lookaheadPassDelegate", "getLookaheadPassDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "measurePassDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "getMeasurePassDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "measurePending", "getMeasurePending$ui_release", "nextChildLookaheadPlaceOrder", "nextChildPlaceOrder", "outerCoordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "getOuterCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "performMeasureBlock", "Lkotlin/Function0;", "", "performMeasureConstraints", "J", "width", "getWidth$ui_release", "ensureLookaheadDelegateCreated", "ensureLookaheadDelegateCreated$ui_release", "invalidateParentData", "markChildrenDirty", "markLayoutPending", "markLayoutPending$ui_release", "markLookaheadLayoutPending", "markLookaheadLayoutPending$ui_release", "markLookaheadMeasurePending", "markLookaheadMeasurePending$ui_release", "markMeasurePending", "markMeasurePending$ui_release", "onCoordinatesUsed", "performLookaheadMeasure", "constraints", "performLookaheadMeasure-BRTryo0", "(J)V", "performMeasure", "performMeasure-BRTryo0", "resetAlignmentLines", "updateParentData", "LookaheadPassDelegate", "MeasurePassDelegate", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutNodeLayoutDelegate {
    public static final int $stable = 8;
    private int childrenAccessingCoordinatesDuringPlacement;
    private boolean coordinatesAccessedDuringModifierPlacement;
    private boolean coordinatesAccessedDuringPlacement;
    private boolean detachedFromParentLookaheadPass;
    private final androidx.compose.ui.node.LayoutNode layoutNode;
    private boolean layoutPending;
    private boolean layoutPendingForAlignment;
    private boolean lookaheadLayoutPending;
    private boolean lookaheadLayoutPendingForAlignment;
    private boolean lookaheadMeasurePending;
    private androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate;
    private boolean measurePending;
    private int nextChildLookaheadPlaceOrder;
    private int nextChildPlaceOrder;
    private androidx.compose.ui.node.LayoutNode.LayoutState layoutState = androidx.compose.ui.node.LayoutNode.LayoutState.Idle;
    private final androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate = new androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate();
    private long performMeasureConstraints = androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    private final kotlin.jvm.functions.Function0<kotlin.Unit> performMeasureBlock = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$performMeasureBlock$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
            invoke2();
            return kotlin.Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            long j;
            androidx.compose.ui.node.NodeCoordinator outerCoordinator = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getOuterCoordinator();
            j = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.performMeasureConstraints;
            outerCoordinator.mo3402measureBRTryo0(j);
        }
    };

    public LayoutNodeLayoutDelegate(androidx.compose.ui.node.LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
    }

    public final androidx.compose.ui.node.NodeCoordinator getOuterCoordinator() {
        return this.layoutNode.getNodes().getOuterCoordinator();
    }

    /* renamed from: getLastConstraints-DWUhwKw, reason: not valid java name */
    public final androidx.compose.ui.unit.Constraints m3552getLastConstraintsDWUhwKw() {
        return this.measurePassDelegate.m3558getLastConstraintsDWUhwKw();
    }

    /* renamed from: getLastLookaheadConstraints-DWUhwKw, reason: not valid java name */
    public final androidx.compose.ui.unit.Constraints m3553getLastLookaheadConstraintsDWUhwKw() {
        androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            return lookaheadPassDelegate.getLookaheadConstraints();
        }
        return null;
    }

    public final int getHeight$ui_release() {
        return this.measurePassDelegate.getHeight();
    }

    public final int getWidth$ui_release() {
        return this.measurePassDelegate.getWidth();
    }

    /* renamed from: getDetachedFromParentLookaheadPass$ui_release, reason: from getter */
    public final boolean getDetachedFromParentLookaheadPass() {
        return this.detachedFromParentLookaheadPass;
    }

    /* renamed from: getLayoutState$ui_release, reason: from getter */
    public final androidx.compose.ui.node.LayoutNode.LayoutState getLayoutState() {
        return this.layoutState;
    }

    /* renamed from: getMeasurePending$ui_release, reason: from getter */
    public final boolean getMeasurePending() {
        return this.measurePending;
    }

    /* renamed from: getLayoutPending$ui_release, reason: from getter */
    public final boolean getLayoutPending() {
        return this.layoutPending;
    }

    /* renamed from: getLookaheadMeasurePending$ui_release, reason: from getter */
    public final boolean getLookaheadMeasurePending() {
        return this.lookaheadMeasurePending;
    }

    /* renamed from: getLookaheadLayoutPending$ui_release, reason: from getter */
    public final boolean getLookaheadLayoutPending() {
        return this.lookaheadLayoutPending;
    }

    public final void markLayoutPending$ui_release() {
        this.layoutPending = true;
        this.layoutPendingForAlignment = true;
    }

    public final void markMeasurePending$ui_release() {
        this.measurePending = true;
    }

    public final void markLookaheadLayoutPending$ui_release() {
        this.lookaheadLayoutPending = true;
        this.lookaheadLayoutPendingForAlignment = true;
    }

    public final void markLookaheadMeasurePending$ui_release() {
        this.lookaheadMeasurePending = true;
    }

    public final androidx.compose.ui.node.AlignmentLinesOwner getAlignmentLinesOwner$ui_release() {
        return this.measurePassDelegate;
    }

    public final androidx.compose.ui.node.AlignmentLinesOwner getLookaheadAlignmentLinesOwner$ui_release() {
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
        int i2 = this.childrenAccessingCoordinatesDuringPlacement;
        this.childrenAccessingCoordinatesDuringPlacement = i;
        if ((i2 == 0) != (i == 0)) {
            androidx.compose.ui.node.LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
            androidx.compose.ui.node.LayoutNodeLayoutDelegate layoutDelegate = parent$ui_release != null ? parent$ui_release.getLayoutDelegate() : null;
            if (layoutDelegate != null) {
                if (i == 0) {
                    layoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(layoutDelegate.childrenAccessingCoordinatesDuringPlacement - 1);
                } else {
                    layoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(layoutDelegate.childrenAccessingCoordinatesDuringPlacement + 1);
                }
            }
        }
    }

    /* renamed from: getMeasurePassDelegate$ui_release, reason: from getter */
    public final androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate getMeasurePassDelegate() {
        return this.measurePassDelegate;
    }

    /* renamed from: getLookaheadPassDelegate$ui_release, reason: from getter */
    public final androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate getLookaheadPassDelegate() {
        return this.lookaheadPassDelegate;
    }

    public final void onCoordinatesUsed() {
        androidx.compose.ui.node.LayoutNode.LayoutState layoutState$ui_release = this.layoutNode.getLayoutState$ui_release();
        if (layoutState$ui_release == androidx.compose.ui.node.LayoutNode.LayoutState.LayingOut || layoutState$ui_release == androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut) {
            if (this.measurePassDelegate.getLayingOutChildren()) {
                setCoordinatesAccessedDuringPlacement(true);
            } else {
                setCoordinatesAccessedDuringModifierPlacement(true);
            }
        }
        if (layoutState$ui_release == androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut) {
            androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
            if (lookaheadPassDelegate != null && lookaheadPassDelegate.getLayingOutChildren()) {
                setCoordinatesAccessedDuringPlacement(true);
            } else {
                setCoordinatesAccessedDuringModifierPlacement(true);
            }
        }
    }

    /* compiled from: LayoutNodeLayoutDelegate.kt */
    @kotlin.Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0014\u0010W\u001a\u000e\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020;0XH\u0016J\b\u0010Z\u001a\u00020)H\u0002J\b\u0010[\u001a\u00020)H\u0002J\u001c\u0010\\\u001a\u00020)2\u0012\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020)0'H\u0016J!\u0010^\u001a\u00020)2\u0016\u0010]\u001a\u0012\u0012\b\u0012\u00060\u0000R\u00020\u0007\u0012\u0004\u0012\u00020)0'H\u0082\bJ\u0011\u0010_\u001a\u00020;2\u0006\u0010`\u001a\u00020YH\u0096\u0002J\u000e\u0010a\u001a\u00020)2\u0006\u0010b\u001a\u00020\u0011J\u0006\u0010c\u001a\u00020)J\b\u0010d\u001a\u00020)H\u0016J\r\u0010e\u001a\u00020)H\u0000¢\u0006\u0002\bfJ\b\u0010g\u001a\u00020)H\u0002J\b\u0010h\u001a\u00020)H\u0002J\u0010\u0010i\u001a\u00020;2\u0006\u0010j\u001a\u00020;H\u0016J\u0010\u0010k\u001a\u00020;2\u0006\u0010l\u001a\u00020;H\u0016J\u001a\u0010m\u001a\u00020\u00022\u0006\u0010n\u001a\u00020#H\u0016ø\u0001\u0000¢\u0006\u0004\bo\u0010pJ\u0006\u0010q\u001a\u00020)J\u0010\u0010r\u001a\u00020;2\u0006\u0010j\u001a\u00020;H\u0016J\u0010\u0010s\u001a\u00020;2\u0006\u0010l\u001a\u00020;H\u0016J\u0006\u0010t\u001a\u00020)J\b\u0010u\u001a\u00020)H\u0002J\b\u0010v\u001a\u00020)H\u0002J\u0006\u0010w\u001a\u00020)J\r\u0010x\u001a\u00020)H\u0000¢\u0006\u0002\byJ=\u0010z\u001a\u00020)2\u0006\u0010{\u001a\u00020,2\u0006\u0010T\u001a\u00020/2\u0019\u0010|\u001a\u0015\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)\u0018\u00010'¢\u0006\u0002\b*H\u0014ø\u0001\u0000¢\u0006\u0004\b}\u0010~J\u0006\u0010\u007f\u001a\u00020)J?\u0010\u0080\u0001\u001a\u00020)2\u0006\u0010{\u001a\u00020,2\u0006\u0010T\u001a\u00020/2\u0019\u0010|\u001a\u0015\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)\u0018\u00010'¢\u0006\u0002\b*H\u0002ø\u0001\u0000¢\u0006\u0005\b\u0081\u0001\u0010~J\u001b\u0010\u0082\u0001\u001a\u00020\u00112\u0006\u0010n\u001a\u00020#ø\u0001\u0000¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u0007\u0010\u0085\u0001\u001a\u00020)J\t\u0010\u0086\u0001\u001a\u00020)H\u0016J\t\u0010\u0087\u0001\u001a\u00020)H\u0016J\u0013\u0010\u0088\u0001\u001a\u00020)2\b\u0010\u0089\u0001\u001a\u00030\u008a\u0001H\u0002J\u0007\u0010\u008b\u0001\u001a\u00020\u0011R\u0018\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0000R\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\f\u0012\b\u0012\u00060\u0000R\u00020\u00070\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0011@PX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015R$\u0010 \u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0011@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R\u0019\u0010\"\u001a\u0004\u0018\u00010#8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b$\u0010%R!\u0010&\u001a\u0015\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)\u0018\u00010'¢\u0006\u0002\b*X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010+\u001a\u00020,X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010-R\u000e\u0010.\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u00100\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0013R\u0014\u00102\u001a\b\u0012\u0004\u0012\u00020)03X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00104\u001a\u000205X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0014\u0010:\u001a\u00020;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u000e\u0010>\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010?\u001a\u00020;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010=R\u000e\u0010A\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010B\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\"\u0010F\u001a\u0004\u0018\u00010E2\b\u0010\u001d\u001a\u0004\u0018\u00010E@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u000e\u0010I\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010J\u001a\u00020;2\u0006\u0010\u001d\u001a\u00020;@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bK\u0010=R\u0014\u0010L\u001a\b\u0012\u0004\u0012\u00020)03X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010M\u001a\u0015\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)\u0018\u00010'¢\u0006\u0002\b*X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010N\u001a\u00020,X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010-R\u000e\u0010O\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010Q\u001a\u00020;2\u0006\u0010\u001d\u001a\u00020;@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bR\u0010=R\u000e\u0010S\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010T\u001a\u00020/2\u0006\u0010\u001d\u001a\u00020/@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bU\u0010V\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u008c\u0001"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "(Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;)V", "_childDelegates", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "alignmentLines", "Landroidx/compose/ui/node/AlignmentLines;", "getAlignmentLines", "()Landroidx/compose/ui/node/AlignmentLines;", "childDelegates", "", "getChildDelegates$ui_release", "()Ljava/util/List;", "childDelegatesDirty", "", "getChildDelegatesDirty$ui_release", "()Z", "setChildDelegatesDirty$ui_release", "(Z)V", "duringAlignmentLinesQuery", "getDuringAlignmentLinesQuery$ui_release", "setDuringAlignmentLinesQuery$ui_release", "innerCoordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "getInnerCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "<set-?>", "isPlaced", "setPlaced$ui_release", "isPlacedByParent", "setPlacedByParent$ui_release", "lastConstraints", "Landroidx/compose/ui/unit/Constraints;", "getLastConstraints-DWUhwKw", "()Landroidx/compose/ui/unit/Constraints;", "lastLayerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "Lkotlin/ExtensionFunctionType;", "lastPosition", "Landroidx/compose/ui/unit/IntOffset;", "J", "lastZIndex", "", "layingOutChildren", "getLayingOutChildren", "layoutChildrenBlock", "Lkotlin/Function0;", "measuredByParent", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "getMeasuredByParent$ui_release", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "setMeasuredByParent$ui_release", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "measuredHeight", "", "getMeasuredHeight", "()I", "measuredOnce", "measuredWidth", "getMeasuredWidth", "onNodePlacedCalled", "parentAlignmentLinesOwner", "getParentAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "", "parentData", "getParentData", "()Ljava/lang/Object;", "parentDataDirty", "placeOrder", "getPlaceOrder$ui_release", "placeOuterCoordinatorBlock", "placeOuterCoordinatorLayerBlock", "placeOuterCoordinatorPosition", "placeOuterCoordinatorZIndex", "placedOnce", "previousPlaceOrder", "getPreviousPlaceOrder$ui_release", "relayoutWithoutParentInProgress", "zIndex", "getZIndex$ui_release", "()F", "calculateAlignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "checkChildrenPlaceOrderForUpdates", "clearPlaceOrder", "forEachChildAlignmentLinesOwner", "block", "forEachChildDelegate", "get", "alignmentLine", "invalidateIntrinsicsParent", "forceRequest", "invalidateParentData", "layoutChildren", "markDetachedFromParentLookaheadPass", "markDetachedFromParentLookaheadPass$ui_release", "markNodeAndSubtreeAsPlaced", "markSubtreeAsNotPlaced", "maxIntrinsicHeight", "width", "maxIntrinsicWidth", "height", "measure", "constraints", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measureBasedOnLookahead", "minIntrinsicHeight", "minIntrinsicWidth", "notifyChildrenUsingCoordinatesWhilePlacing", "onBeforeLayoutChildren", "onIntrinsicsQueried", "onNodeDetached", "onNodePlaced", "onNodePlaced$ui_release", "placeAt", "position", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeBasedOnLookahead", "placeOuterCoordinator", "placeOuterCoordinator-f8xVGno", "remeasure", "remeasure-BRTryo0", "(J)Z", "replace", "requestLayout", "requestMeasure", "trackMeasurementByParent", "node", "Landroidx/compose/ui/node/LayoutNode;", "updateParentData", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class MeasurePassDelegate extends androidx.compose.ui.layout.Placeable implements androidx.compose.ui.layout.Measurable, androidx.compose.ui.node.AlignmentLinesOwner {
        private boolean duringAlignmentLinesQuery;
        private boolean isPlaced;
        private boolean isPlacedByParent;
        private kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> lastLayerBlock;
        private float lastZIndex;
        private boolean layingOutChildren;
        private boolean measuredOnce;
        private boolean onNodePlacedCalled;
        private java.lang.Object parentData;
        private final kotlin.jvm.functions.Function0<kotlin.Unit> placeOuterCoordinatorBlock;
        private kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> placeOuterCoordinatorLayerBlock;
        private float placeOuterCoordinatorZIndex;
        private boolean placedOnce;
        private boolean relayoutWithoutParentInProgress;
        private float zIndex;
        private int previousPlaceOrder = Integer.MAX_VALUE;
        private int placeOrder = Integer.MAX_VALUE;
        private androidx.compose.ui.node.LayoutNode.UsageByParent measuredByParent = androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed;
        private long lastPosition = androidx.compose.ui.unit.IntOffset.INSTANCE.m4620getZeronOccac();
        private boolean parentDataDirty = true;
        private final androidx.compose.ui.node.AlignmentLines alignmentLines = new androidx.compose.ui.node.LayoutNodeAlignmentLines(this);
        private final androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate> _childDelegates = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate[16], 0);
        private boolean childDelegatesDirty = true;
        private final kotlin.jvm.functions.Function0<kotlin.Unit> layoutChildrenBlock = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildrenBlock$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.this.clearPlaceOrder();
                androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.this.forEachChildAlignmentLinesOwner(new kotlin.jvm.functions.Function1<androidx.compose.ui.node.AlignmentLinesOwner, kotlin.Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildrenBlock$1.1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.AlignmentLinesOwner alignmentLinesOwner) {
                        invoke2(alignmentLinesOwner);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(androidx.compose.ui.node.AlignmentLinesOwner alignmentLinesOwner) {
                        alignmentLinesOwner.getAlignmentLines().setUsedDuringParentLayout$ui_release(false);
                    }
                });
                androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.this.getInnerCoordinator().getMeasureResult$ui_release().placeChildren();
                androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.this.checkChildrenPlaceOrderForUpdates();
                androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.this.forEachChildAlignmentLinesOwner(new kotlin.jvm.functions.Function1<androidx.compose.ui.node.AlignmentLinesOwner, kotlin.Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildrenBlock$1.2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.AlignmentLinesOwner alignmentLinesOwner) {
                        invoke2(alignmentLinesOwner);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(androidx.compose.ui.node.AlignmentLinesOwner alignmentLinesOwner) {
                        alignmentLinesOwner.getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(alignmentLinesOwner.getAlignmentLines().getUsedDuringParentLayout());
                    }
                });
            }
        };
        private long placeOuterCoordinatorPosition = androidx.compose.ui.unit.IntOffset.INSTANCE.m4620getZeronOccac();

        /* compiled from: LayoutNodeLayoutDelegate.kt */
        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[androidx.compose.ui.node.LayoutNode.LayoutState.values().length];
                try {
                    iArr[androidx.compose.ui.node.LayoutNode.LayoutState.Measuring.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[androidx.compose.ui.node.LayoutNode.LayoutState.LayingOut.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[androidx.compose.ui.node.LayoutNode.UsageByParent.values().length];
                try {
                    iArr2[androidx.compose.ui.node.LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr2[androidx.compose.ui.node.LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public MeasurePassDelegate() {
            this.placeOuterCoordinatorBlock = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$placeOuterCoordinatorBlock$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    invoke2();
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    androidx.compose.ui.layout.Placeable.PlacementScope placementScope;
                    kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> function1;
                    long j;
                    float f;
                    long j2;
                    float f2;
                    androidx.compose.ui.node.NodeCoordinator wrappedBy = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getOuterCoordinator().getWrappedBy();
                    if (wrappedBy == null || (placementScope = wrappedBy.getPlacementScope()) == null) {
                        placementScope = androidx.compose.ui.node.LayoutNodeKt.requireOwner(androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode).getPlacementScope();
                    }
                    androidx.compose.ui.layout.Placeable.PlacementScope placementScope2 = placementScope;
                    androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate = this;
                    androidx.compose.ui.node.LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this;
                    function1 = measurePassDelegate.placeOuterCoordinatorLayerBlock;
                    if (function1 == null) {
                        androidx.compose.ui.node.NodeCoordinator outerCoordinator = layoutNodeLayoutDelegate.getOuterCoordinator();
                        j2 = measurePassDelegate.placeOuterCoordinatorPosition;
                        f2 = measurePassDelegate.placeOuterCoordinatorZIndex;
                        placementScope2.m3460place70tqf50(outerCoordinator, j2, f2);
                        return;
                    }
                    androidx.compose.ui.node.NodeCoordinator outerCoordinator2 = layoutNodeLayoutDelegate.getOuterCoordinator();
                    j = measurePassDelegate.placeOuterCoordinatorPosition;
                    f = measurePassDelegate.placeOuterCoordinatorZIndex;
                    placementScope2.m3465placeWithLayeraW9wM(outerCoordinator2, j, f, function1);
                }
            };
        }

        /* renamed from: getPreviousPlaceOrder$ui_release, reason: from getter */
        public final int getPreviousPlaceOrder() {
            return this.previousPlaceOrder;
        }

        /* renamed from: getPlaceOrder$ui_release, reason: from getter */
        public final int getPlaceOrder() {
            return this.placeOrder;
        }

        /* renamed from: getLastConstraints-DWUhwKw, reason: not valid java name */
        public final androidx.compose.ui.unit.Constraints m3558getLastConstraintsDWUhwKw() {
            if (this.measuredOnce) {
                return androidx.compose.ui.unit.Constraints.m4412boximpl(getMeasurementConstraints());
            }
            return null;
        }

        /* renamed from: getMeasuredByParent$ui_release, reason: from getter */
        public final androidx.compose.ui.node.LayoutNode.UsageByParent getMeasuredByParent() {
            return this.measuredByParent;
        }

        public final void setMeasuredByParent$ui_release(androidx.compose.ui.node.LayoutNode.UsageByParent usageByParent) {
            this.measuredByParent = usageByParent;
        }

        /* renamed from: getDuringAlignmentLinesQuery$ui_release, reason: from getter */
        public final boolean getDuringAlignmentLinesQuery() {
            return this.duringAlignmentLinesQuery;
        }

        public final void setDuringAlignmentLinesQuery$ui_release(boolean z) {
            this.duringAlignmentLinesQuery = z;
        }

        @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
        public java.lang.Object getParentData() {
            return this.parentData;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        /* renamed from: isPlaced, reason: from getter */
        public boolean getIsPlaced() {
            return this.isPlaced;
        }

        public void setPlaced$ui_release(boolean z) {
            this.isPlaced = z;
        }

        /* renamed from: isPlacedByParent, reason: from getter */
        public final boolean getIsPlacedByParent() {
            return this.isPlacedByParent;
        }

        public final void setPlacedByParent$ui_release(boolean z) {
            this.isPlacedByParent = z;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public androidx.compose.ui.node.NodeCoordinator getInnerCoordinator() {
            return androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.getInnerCoordinator$ui_release();
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public androidx.compose.ui.node.AlignmentLines getAlignmentLines() {
            return this.alignmentLines;
        }

        /* renamed from: getChildDelegatesDirty$ui_release, reason: from getter */
        public final boolean getChildDelegatesDirty() {
            return this.childDelegatesDirty;
        }

        public final void setChildDelegatesDirty$ui_release(boolean z) {
            this.childDelegatesDirty = z;
        }

        public final java.util.List<androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate> getChildDelegates$ui_release() {
            androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.updateChildrenIfDirty$ui_release();
            if (!this.childDelegatesDirty) {
                return this._childDelegates.asMutableList();
            }
            androidx.compose.ui.node.LayoutNode layoutNode = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode;
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate> mutableVector = this._childDelegates;
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector2 = layoutNode.get_children$ui_release();
            int size = mutableVector2.getSize();
            if (size > 0) {
                androidx.compose.ui.node.LayoutNode[] content = mutableVector2.getContent();
                int i = 0;
                do {
                    androidx.compose.ui.node.LayoutNode layoutNode2 = content[i];
                    if (mutableVector.getSize() <= i) {
                        mutableVector.add(layoutNode2.getLayoutDelegate().getMeasurePassDelegate());
                    } else {
                        mutableVector.set(i, layoutNode2.getLayoutDelegate().getMeasurePassDelegate());
                    }
                    i++;
                } while (i < size);
            }
            mutableVector.removeRange(layoutNode.getChildren$ui_release().size(), mutableVector.getSize());
            this.childDelegatesDirty = false;
            return this._childDelegates.asMutableList();
        }

        public final void markDetachedFromParentLookaheadPass$ui_release() {
            androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.detachedFromParentLookaheadPass = true;
        }

        public final boolean getLayingOutChildren() {
            return this.layingOutChildren;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void layoutChildren() {
            this.layingOutChildren = true;
            getAlignmentLines().recalculateQueryOwner();
            if (androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getLayoutPending()) {
                onBeforeLayoutChildren();
            }
            if (androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutPendingForAlignment || (!this.duringAlignmentLinesQuery && !getInnerCoordinator().getIsPlacingForAlignment() && androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getLayoutPending())) {
                androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutPending = false;
                androidx.compose.ui.node.LayoutNode.LayoutState layoutState = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getLayoutState();
                androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutState = androidx.compose.ui.node.LayoutNode.LayoutState.LayingOut;
                androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.setCoordinatesAccessedDuringPlacement(false);
                androidx.compose.ui.node.LayoutNode layoutNode = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode;
                androidx.compose.ui.node.LayoutNodeKt.requireOwner(layoutNode).getSnapshotObserver().observeLayoutSnapshotReads$ui_release(layoutNode, false, this.layoutChildrenBlock);
                androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutState = layoutState;
                if (getInnerCoordinator().getIsPlacingForAlignment() && androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringPlacement()) {
                    requestLayout();
                }
                androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutPendingForAlignment = false;
            }
            if (getAlignmentLines().getUsedDuringParentLayout()) {
                getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(true);
            }
            if (getAlignmentLines().getDirty() && getAlignmentLines().getRequired$ui_release()) {
                getAlignmentLines().recalculate();
            }
            this.layingOutChildren = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkChildrenPlaceOrderForUpdates() {
            androidx.compose.ui.node.LayoutNode layoutNode = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode;
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                androidx.compose.ui.node.LayoutNode[] content = mutableVector.getContent();
                int i = 0;
                do {
                    androidx.compose.ui.node.LayoutNode layoutNode2 = content[i];
                    if (layoutNode2.getMeasurePassDelegate$ui_release().previousPlaceOrder != layoutNode2.getPlaceOrder$ui_release()) {
                        layoutNode.onZSortedChildrenInvalidated$ui_release();
                        layoutNode.invalidateLayer$ui_release();
                        if (layoutNode2.getPlaceOrder$ui_release() == Integer.MAX_VALUE) {
                            layoutNode2.getMeasurePassDelegate$ui_release().markSubtreeAsNotPlaced();
                        }
                    }
                    i++;
                } while (i < size);
            }
        }

        private final void markSubtreeAsNotPlaced() {
            if (getIsPlaced()) {
                int i = 0;
                setPlaced$ui_release(false);
                androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
                int size = mutableVector.getSize();
                if (size > 0) {
                    androidx.compose.ui.node.LayoutNode[] content = mutableVector.getContent();
                    do {
                        content[i].getMeasurePassDelegate$ui_release().markSubtreeAsNotPlaced();
                        i++;
                    } while (i < size);
                }
            }
        }

        private final void markNodeAndSubtreeAsPlaced() {
            boolean isPlaced = getIsPlaced();
            setPlaced$ui_release(true);
            androidx.compose.ui.node.LayoutNode layoutNode = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode;
            int i = 0;
            if (!isPlaced) {
                if (layoutNode.getMeasurePending$ui_release()) {
                    androidx.compose.ui.node.LayoutNode.requestRemeasure$ui_release$default(layoutNode, true, false, 2, null);
                } else if (layoutNode.getLookaheadMeasurePending$ui_release()) {
                    androidx.compose.ui.node.LayoutNode.requestLookaheadRemeasure$ui_release$default(layoutNode, true, false, 2, null);
                }
            }
            androidx.compose.ui.node.NodeCoordinator wrapped = layoutNode.getInnerCoordinator$ui_release().getWrapped();
            for (androidx.compose.ui.node.NodeCoordinator outerCoordinator$ui_release = layoutNode.getOuterCoordinator$ui_release(); !kotlin.jvm.internal.Intrinsics.areEqual(outerCoordinator$ui_release, wrapped) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped()) {
                if (outerCoordinator$ui_release.getLastLayerDrawingWasSkipped()) {
                    outerCoordinator$ui_release.invalidateLayer();
                }
            }
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                androidx.compose.ui.node.LayoutNode[] content = mutableVector.getContent();
                do {
                    androidx.compose.ui.node.LayoutNode layoutNode2 = content[i];
                    if (layoutNode2.getPlaceOrder$ui_release() != Integer.MAX_VALUE) {
                        layoutNode2.getMeasurePassDelegate$ui_release().markNodeAndSubtreeAsPlaced();
                        layoutNode.rescheduleRemeasureOrRelayout$ui_release(layoutNode2);
                    }
                    i++;
                } while (i < size);
            }
        }

        /* renamed from: getZIndex$ui_release, reason: from getter */
        public final float getZIndex() {
            return this.zIndex;
        }

        public final void onNodePlaced$ui_release() {
            this.onNodePlacedCalled = true;
            androidx.compose.ui.node.LayoutNode parent$ui_release = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            float zIndex = getInnerCoordinator().getZIndex();
            androidx.compose.ui.node.LayoutNode layoutNode = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode;
            androidx.compose.ui.node.NodeCoordinator outerCoordinator$ui_release = layoutNode.getOuterCoordinator$ui_release();
            androidx.compose.ui.node.NodeCoordinator innerCoordinator$ui_release = layoutNode.getInnerCoordinator$ui_release();
            while (outerCoordinator$ui_release != innerCoordinator$ui_release) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                androidx.compose.ui.node.LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (androidx.compose.ui.node.LayoutModifierNodeCoordinator) outerCoordinator$ui_release;
                zIndex += layoutModifierNodeCoordinator.getZIndex();
                outerCoordinator$ui_release = layoutModifierNodeCoordinator.getWrapped();
            }
            if (zIndex != this.zIndex) {
                this.zIndex = zIndex;
                if (parent$ui_release != null) {
                    parent$ui_release.onZSortedChildrenInvalidated$ui_release();
                }
                if (parent$ui_release != null) {
                    parent$ui_release.invalidateLayer$ui_release();
                }
            }
            if (!getIsPlaced()) {
                if (parent$ui_release != null) {
                    parent$ui_release.invalidateLayer$ui_release();
                }
                markNodeAndSubtreeAsPlaced();
                if (this.relayoutWithoutParentInProgress && parent$ui_release != null) {
                    androidx.compose.ui.node.LayoutNode.requestRelayout$ui_release$default(parent$ui_release, false, 1, null);
                }
            }
            if (parent$ui_release != null) {
                if (!this.relayoutWithoutParentInProgress && parent$ui_release.getLayoutState$ui_release() == androidx.compose.ui.node.LayoutNode.LayoutState.LayingOut) {
                    if (this.placeOrder == Integer.MAX_VALUE) {
                        this.placeOrder = parent$ui_release.getLayoutDelegate().nextChildPlaceOrder;
                        parent$ui_release.getLayoutDelegate().nextChildPlaceOrder++;
                    } else {
                        throw new java.lang.IllegalStateException("Place was called on a node which was placed already".toString());
                    }
                }
            } else {
                this.placeOrder = 0;
            }
            layoutChildren();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void clearPlaceOrder() {
            androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.nextChildPlaceOrder = 0;
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                androidx.compose.ui.node.LayoutNode[] content = mutableVector.getContent();
                int i = 0;
                do {
                    androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate$ui_release = content[i].getMeasurePassDelegate$ui_release();
                    measurePassDelegate$ui_release.previousPlaceOrder = measurePassDelegate$ui_release.placeOrder;
                    measurePassDelegate$ui_release.placeOrder = Integer.MAX_VALUE;
                    measurePassDelegate$ui_release.isPlacedByParent = false;
                    if (measurePassDelegate$ui_release.measuredByParent == androidx.compose.ui.node.LayoutNode.UsageByParent.InLayoutBlock) {
                        measurePassDelegate$ui_release.measuredByParent = androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed;
                    }
                    i++;
                } while (i < size);
            }
        }

        private final void forEachChildDelegate(kotlin.jvm.functions.Function1<? super androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate, kotlin.Unit> block) {
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                androidx.compose.ui.node.LayoutNode[] content = mutableVector.getContent();
                int i = 0;
                do {
                    block.invoke(content[i].getMeasurePassDelegate$ui_release());
                    i++;
                } while (i < size);
            }
        }

        @Override // androidx.compose.ui.layout.Measurable
        /* renamed from: measure-BRTryo0 */
        public androidx.compose.ui.layout.Placeable mo3402measureBRTryo0(long constraints) {
            if (androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent() == androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed) {
                androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.clearSubtreeIntrinsicsUsage$ui_release();
            }
            if (androidx.compose.ui.node.LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode)) {
                androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getLookaheadPassDelegate();
                kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadPassDelegate);
                lookaheadPassDelegate.setMeasuredByParent$ui_release(androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed);
                lookaheadPassDelegate.mo3402measureBRTryo0(constraints);
            }
            trackMeasurementByParent(androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode);
            m3559remeasureBRTryo0(constraints);
            return this;
        }

        /* renamed from: remeasure-BRTryo0, reason: not valid java name */
        public final boolean m3559remeasureBRTryo0(long constraints) {
            boolean z = true;
            if (!androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.getIsDeactivated()) {
                androidx.compose.ui.node.Owner requireOwner = androidx.compose.ui.node.LayoutNodeKt.requireOwner(androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode);
                androidx.compose.ui.node.LayoutNode parent$ui_release = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
                androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.setCanMultiMeasure$ui_release(androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.getCanMultiMeasure() || (parent$ui_release != null && parent$ui_release.getCanMultiMeasure()));
                if (!androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.getMeasurePending$ui_release() && androidx.compose.ui.unit.Constraints.m4417equalsimpl0(getMeasurementConstraints(), constraints)) {
                    androidx.compose.ui.node.Owner.CC.forceMeasureTheSubtree$default(requireOwner, androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode, false, 2, null);
                    androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.resetSubtreeIntrinsicsUsage$ui_release();
                    return false;
                }
                getAlignmentLines().setUsedByModifierMeasurement$ui_release(false);
                forEachChildAlignmentLinesOwner(new kotlin.jvm.functions.Function1<androidx.compose.ui.node.AlignmentLinesOwner, kotlin.Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$remeasure$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.AlignmentLinesOwner alignmentLinesOwner) {
                        invoke2(alignmentLinesOwner);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(androidx.compose.ui.node.AlignmentLinesOwner alignmentLinesOwner) {
                        alignmentLinesOwner.getAlignmentLines().setUsedDuringParentMeasurement$ui_release(false);
                    }
                });
                this.measuredOnce = true;
                long mo3409getSizeYbymL2g = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getOuterCoordinator().mo3409getSizeYbymL2g();
                m3455setMeasurementConstraintsBRTryo0(constraints);
                androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.m3551performMeasureBRTryo0(constraints);
                if (androidx.compose.ui.unit.IntSize.m4650equalsimpl0(androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getOuterCoordinator().mo3409getSizeYbymL2g(), mo3409getSizeYbymL2g) && androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getOuterCoordinator().getWidth() == getWidth() && androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getOuterCoordinator().getHeight() == getHeight()) {
                    z = false;
                }
                m3454setMeasuredSizeozmzZPI(androidx.compose.ui.unit.IntSizeKt.IntSize(androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getOuterCoordinator().getWidth(), androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getOuterCoordinator().getHeight()));
                return z;
            }
            throw new java.lang.IllegalArgumentException("measure is called on a deactivated node".toString());
        }

        private final void trackMeasurementByParent(androidx.compose.ui.node.LayoutNode node) {
            androidx.compose.ui.node.LayoutNode.UsageByParent usageByParent;
            androidx.compose.ui.node.LayoutNode parent$ui_release = node.getParent$ui_release();
            if (parent$ui_release != null) {
                if (this.measuredByParent != androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed && !node.getCanMultiMeasure()) {
                    throw new java.lang.IllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()".toString());
                }
                int i = androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
                if (i == 1) {
                    usageByParent = androidx.compose.ui.node.LayoutNode.UsageByParent.InMeasureBlock;
                } else if (i == 2) {
                    usageByParent = androidx.compose.ui.node.LayoutNode.UsageByParent.InLayoutBlock;
                } else {
                    throw new java.lang.IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + parent$ui_release.getLayoutState$ui_release());
                }
                this.measuredByParent = usageByParent;
                return;
            }
            this.measuredByParent = androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed;
        }

        @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
        public int getMeasuredWidth() {
            return androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getOuterCoordinator().getMeasuredWidth();
        }

        @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
        public int getMeasuredHeight() {
            return androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getOuterCoordinator().getMeasuredHeight();
        }

        @Override // androidx.compose.ui.layout.Measured
        public int get(androidx.compose.ui.layout.AlignmentLine alignmentLine) {
            androidx.compose.ui.node.LayoutNode parent$ui_release = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if ((parent$ui_release != null ? parent$ui_release.getLayoutState$ui_release() : null) != androidx.compose.ui.node.LayoutNode.LayoutState.Measuring) {
                androidx.compose.ui.node.LayoutNode parent$ui_release2 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
                if ((parent$ui_release2 != null ? parent$ui_release2.getLayoutState$ui_release() : null) == androidx.compose.ui.node.LayoutNode.LayoutState.LayingOut) {
                    getAlignmentLines().setUsedDuringParentLayout$ui_release(true);
                }
            } else {
                getAlignmentLines().setUsedDuringParentMeasurement$ui_release(true);
            }
            this.duringAlignmentLinesQuery = true;
            int i = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getOuterCoordinator().get(alignmentLine);
            this.duringAlignmentLinesQuery = false;
            return i;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.compose.ui.layout.Placeable
        /* renamed from: placeAt-f8xVGno */
        public void mo3403placeAtf8xVGno(long position, float zIndex, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> layerBlock) {
            androidx.compose.ui.layout.Placeable.PlacementScope placementScope;
            this.isPlacedByParent = true;
            if (!androidx.compose.ui.unit.IntOffset.m4609equalsimpl0(position, this.lastPosition)) {
                if (androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringModifierPlacement() || androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringPlacement()) {
                    androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutPending = true;
                }
                notifyChildrenUsingCoordinatesWhilePlacing();
            }
            boolean z = false;
            if (androidx.compose.ui.node.LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode)) {
                androidx.compose.ui.node.NodeCoordinator wrappedBy = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getOuterCoordinator().getWrappedBy();
                if (wrappedBy == null || (placementScope = wrappedBy.getPlacementScope()) == null) {
                    placementScope = androidx.compose.ui.node.LayoutNodeKt.requireOwner(androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode).getPlacementScope();
                }
                androidx.compose.ui.layout.Placeable.PlacementScope placementScope2 = placementScope;
                androidx.compose.ui.node.LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this;
                androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.getLookaheadPassDelegate();
                kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadPassDelegate);
                androidx.compose.ui.node.LayoutNode parent$ui_release = layoutNodeLayoutDelegate.layoutNode.getParent$ui_release();
                if (parent$ui_release != null) {
                    parent$ui_release.getLayoutDelegate().nextChildLookaheadPlaceOrder = 0;
                }
                lookaheadPassDelegate.setPlaceOrder$ui_release(Integer.MAX_VALUE);
                androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope2, lookaheadPassDelegate, androidx.compose.ui.unit.IntOffset.m4610getXimpl(position), androidx.compose.ui.unit.IntOffset.m4611getYimpl(position), 0.0f, 4, null);
            }
            androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate2 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getLookaheadPassDelegate();
            if (lookaheadPassDelegate2 != null && !lookaheadPassDelegate2.getPlacedOnce()) {
                z = true;
            }
            if (!(true ^ z)) {
                throw new java.lang.IllegalArgumentException("Error: Placement happened before lookahead.".toString());
            }
            m3557placeOuterCoordinatorf8xVGno(position, zIndex, layerBlock);
        }

        /* renamed from: placeOuterCoordinator-f8xVGno, reason: not valid java name */
        private final void m3557placeOuterCoordinatorf8xVGno(long position, float zIndex, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> layerBlock) {
            if (!(!androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.getIsDeactivated())) {
                throw new java.lang.IllegalArgumentException("place is called on a deactivated node".toString());
            }
            androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutState = androidx.compose.ui.node.LayoutNode.LayoutState.LayingOut;
            this.lastPosition = position;
            this.lastZIndex = zIndex;
            this.lastLayerBlock = layerBlock;
            this.placedOnce = true;
            this.onNodePlacedCalled = false;
            androidx.compose.ui.node.Owner requireOwner = androidx.compose.ui.node.LayoutNodeKt.requireOwner(androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode);
            if (!androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getLayoutPending() && getIsPlaced()) {
                androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getOuterCoordinator().m3603placeSelfApparentToRealOffsetf8xVGno(position, zIndex, layerBlock);
                onNodePlaced$ui_release();
            } else {
                getAlignmentLines().setUsedByModifierLayout$ui_release(false);
                androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.setCoordinatesAccessedDuringModifierPlacement(false);
                this.placeOuterCoordinatorLayerBlock = layerBlock;
                this.placeOuterCoordinatorPosition = position;
                this.placeOuterCoordinatorZIndex = zIndex;
                requireOwner.getSnapshotObserver().observeLayoutModifierSnapshotReads$ui_release(androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode, false, this.placeOuterCoordinatorBlock);
                this.placeOuterCoordinatorLayerBlock = null;
            }
            androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutState = androidx.compose.ui.node.LayoutNode.LayoutState.Idle;
        }

        public final void replace() {
            androidx.compose.ui.node.LayoutNode parent$ui_release;
            try {
                this.relayoutWithoutParentInProgress = true;
                if (!this.placedOnce) {
                    throw new java.lang.IllegalStateException("replace called on unplaced item".toString());
                }
                boolean isPlaced = getIsPlaced();
                m3557placeOuterCoordinatorf8xVGno(this.lastPosition, this.lastZIndex, this.lastLayerBlock);
                if (isPlaced && !this.onNodePlacedCalled && (parent$ui_release = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release()) != null) {
                    androidx.compose.ui.node.LayoutNode.requestRelayout$ui_release$default(parent$ui_release, false, 1, null);
                }
            } finally {
                this.relayoutWithoutParentInProgress = false;
            }
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int height) {
            onIntrinsicsQueried();
            return androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getOuterCoordinator().minIntrinsicWidth(height);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int height) {
            onIntrinsicsQueried();
            return androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getOuterCoordinator().maxIntrinsicWidth(height);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int width) {
            onIntrinsicsQueried();
            return androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getOuterCoordinator().minIntrinsicHeight(width);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int width) {
            onIntrinsicsQueried();
            return androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getOuterCoordinator().maxIntrinsicHeight(width);
        }

        private final void onIntrinsicsQueried() {
            androidx.compose.ui.node.LayoutNode.UsageByParent usageByParent;
            androidx.compose.ui.node.LayoutNode.requestRemeasure$ui_release$default(androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode, false, false, 3, null);
            androidx.compose.ui.node.LayoutNode parent$ui_release = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if (parent$ui_release == null || androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent() != androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed) {
                return;
            }
            androidx.compose.ui.node.LayoutNode layoutNode = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode;
            int i = androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
            if (i == 1) {
                usageByParent = androidx.compose.ui.node.LayoutNode.UsageByParent.InMeasureBlock;
            } else if (i == 2) {
                usageByParent = androidx.compose.ui.node.LayoutNode.UsageByParent.InLayoutBlock;
            } else {
                usageByParent = parent$ui_release.getIntrinsicsUsageByParent();
            }
            layoutNode.setIntrinsicsUsageByParent$ui_release(usageByParent);
        }

        public final void invalidateParentData() {
            this.parentDataDirty = true;
        }

        public final boolean updateParentData() {
            if ((getParentData() == null && androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getOuterCoordinator().getParentData() == null) || !this.parentDataDirty) {
                return false;
            }
            this.parentDataDirty = false;
            this.parentData = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getOuterCoordinator().getParentData();
            return true;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> calculateAlignmentLines() {
            if (!this.duringAlignmentLinesQuery) {
                if (androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getLayoutState() == androidx.compose.ui.node.LayoutNode.LayoutState.Measuring) {
                    getAlignmentLines().setUsedByModifierMeasurement$ui_release(true);
                    if (getAlignmentLines().getDirty()) {
                        androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.markLayoutPending$ui_release();
                    }
                } else {
                    getAlignmentLines().setUsedByModifierLayout$ui_release(true);
                }
            }
            getInnerCoordinator().setPlacingForAlignment$ui_release(true);
            layoutChildren();
            getInnerCoordinator().setPlacingForAlignment$ui_release(false);
            return getAlignmentLines().getLastCalculation();
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public androidx.compose.ui.node.AlignmentLinesOwner getParentAlignmentLinesOwner() {
            androidx.compose.ui.node.LayoutNodeLayoutDelegate layoutDelegate;
            androidx.compose.ui.node.LayoutNode parent$ui_release = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if (parent$ui_release == null || (layoutDelegate = parent$ui_release.getLayoutDelegate()) == null) {
                return null;
            }
            return layoutDelegate.getAlignmentLinesOwner$ui_release();
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void forEachChildAlignmentLinesOwner(kotlin.jvm.functions.Function1<? super androidx.compose.ui.node.AlignmentLinesOwner, kotlin.Unit> block) {
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                androidx.compose.ui.node.LayoutNode[] content = mutableVector.getContent();
                int i = 0;
                do {
                    block.invoke(content[i].getLayoutDelegate().getAlignmentLinesOwner$ui_release());
                    i++;
                } while (i < size);
            }
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void requestLayout() {
            androidx.compose.ui.node.LayoutNode.requestRelayout$ui_release$default(androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode, false, 1, null);
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void requestMeasure() {
            androidx.compose.ui.node.LayoutNode.requestRemeasure$ui_release$default(androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode, false, false, 3, null);
        }

        public final void notifyChildrenUsingCoordinatesWhilePlacing() {
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector;
            int size;
            if (androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getChildrenAccessingCoordinatesDuringPlacement() <= 0 || (size = (mutableVector = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release()).getSize()) <= 0) {
                return;
            }
            androidx.compose.ui.node.LayoutNode[] content = mutableVector.getContent();
            int i = 0;
            do {
                androidx.compose.ui.node.LayoutNode layoutNode = content[i];
                androidx.compose.ui.node.LayoutNodeLayoutDelegate layoutDelegate = layoutNode.getLayoutDelegate();
                if ((layoutDelegate.getCoordinatesAccessedDuringPlacement() || layoutDelegate.getCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate.getLayoutPending()) {
                    androidx.compose.ui.node.LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
                }
                layoutDelegate.getMeasurePassDelegate().notifyChildrenUsingCoordinatesWhilePlacing();
                i++;
            } while (i < size);
        }

        private final void onBeforeLayoutChildren() {
            androidx.compose.ui.node.LayoutNode layoutNode = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode;
            androidx.compose.ui.node.LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this;
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                androidx.compose.ui.node.LayoutNode[] content = mutableVector.getContent();
                int i = 0;
                do {
                    androidx.compose.ui.node.LayoutNode layoutNode2 = content[i];
                    if (layoutNode2.getMeasurePending$ui_release() && layoutNode2.getMeasuredByParent$ui_release() == androidx.compose.ui.node.LayoutNode.UsageByParent.InMeasureBlock && androidx.compose.ui.node.LayoutNode.m3535remeasure_Sx5XlM$ui_release$default(layoutNode2, null, 1, null)) {
                        androidx.compose.ui.node.LayoutNode.requestRemeasure$ui_release$default(layoutNodeLayoutDelegate.layoutNode, false, false, 3, null);
                    }
                    i++;
                } while (i < size);
            }
        }

        public final void invalidateIntrinsicsParent(boolean forceRequest) {
            androidx.compose.ui.node.LayoutNode parent$ui_release;
            androidx.compose.ui.node.LayoutNode parent$ui_release2 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            androidx.compose.ui.node.LayoutNode.UsageByParent intrinsicsUsageByParent = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent();
            if (parent$ui_release2 == null || intrinsicsUsageByParent == androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed) {
                return;
            }
            while (parent$ui_release2.getIntrinsicsUsageByParent() == intrinsicsUsageByParent && (parent$ui_release = parent$ui_release2.getParent$ui_release()) != null) {
                parent$ui_release2 = parent$ui_release;
            }
            int i = androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate.WhenMappings.$EnumSwitchMapping$1[intrinsicsUsageByParent.ordinal()];
            if (i == 1) {
                androidx.compose.ui.node.LayoutNode.requestRemeasure$ui_release$default(parent$ui_release2, forceRequest, false, 2, null);
            } else {
                if (i == 2) {
                    parent$ui_release2.requestRelayout$ui_release(forceRequest);
                    return;
                }
                throw new java.lang.IllegalStateException("Intrinsics isn't used by the parent".toString());
            }
        }

        public final void onNodeDetached() {
            this.placeOrder = Integer.MAX_VALUE;
            this.previousPlaceOrder = Integer.MAX_VALUE;
            setPlaced$ui_release(false);
        }

        public final void measureBasedOnLookahead() {
            androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getLookaheadPassDelegate();
            androidx.compose.ui.node.LayoutNode parent$ui_release = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if (parent$ui_release == null) {
                throw new java.lang.IllegalStateException("layoutNode parent is not set".toString());
            }
            if (lookaheadPassDelegate == null) {
                throw new java.lang.IllegalStateException("invalid lookaheadDelegate".toString());
            }
            if (lookaheadPassDelegate.getMeasuredByParent() == androidx.compose.ui.node.LayoutNode.UsageByParent.InMeasureBlock && parent$ui_release.getLayoutState$ui_release() == androidx.compose.ui.node.LayoutNode.LayoutState.Measuring) {
                androidx.compose.ui.unit.Constraints lookaheadConstraints = lookaheadPassDelegate.getLookaheadConstraints();
                kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadConstraints);
                mo3402measureBRTryo0(lookaheadConstraints.getValue());
            } else if (lookaheadPassDelegate.getMeasuredByParent() == androidx.compose.ui.node.LayoutNode.UsageByParent.InLayoutBlock && parent$ui_release.getLayoutState$ui_release() == androidx.compose.ui.node.LayoutNode.LayoutState.LayingOut) {
                androidx.compose.ui.unit.Constraints lookaheadConstraints2 = lookaheadPassDelegate.getLookaheadConstraints();
                kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadConstraints2);
                mo3402measureBRTryo0(lookaheadConstraints2.getValue());
            }
        }

        public final void placeBasedOnLookahead() {
            androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getLookaheadPassDelegate();
            if (lookaheadPassDelegate == null) {
                throw new java.lang.IllegalStateException("invalid lookaheadDelegate".toString());
            }
            mo3403placeAtf8xVGno(lookaheadPassDelegate.getLastPosition(), lookaheadPassDelegate.getLastZIndex(), lookaheadPassDelegate.getLastLayerBlock$ui_release());
        }
    }

    /* compiled from: LayoutNodeLayoutDelegate.kt */
    @kotlin.Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0014\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020B0[H\u0016J\b\u0010]\u001a\u00020&H\u0002J\b\u0010^\u001a\u00020&H\u0002J\u001c\u0010_\u001a\u00020&2\u0012\u0010`\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020&0$H\u0016J!\u0010a\u001a\u00020&2\u0016\u0010`\u001a\u0012\u0012\b\u0012\u00060\u0000R\u00020\u0007\u0012\u0004\u0012\u00020&0$H\u0082\bJ\u0011\u0010b\u001a\u00020B2\u0006\u0010c\u001a\u00020\\H\u0096\u0002J\u000e\u0010d\u001a\u00020&2\u0006\u0010e\u001a\u00020\u0011J\u0006\u0010f\u001a\u00020&J\b\u0010g\u001a\u00020&H\u0016J\b\u0010h\u001a\u00020&H\u0002J\b\u0010i\u001a\u00020&H\u0002J\u0010\u0010j\u001a\u00020B2\u0006\u0010k\u001a\u00020BH\u0016J\u0010\u0010l\u001a\u00020B2\u0006\u0010m\u001a\u00020BH\u0016J\u001a\u0010n\u001a\u00020\u00012\u0006\u0010o\u001a\u00020 H\u0016ø\u0001\u0000¢\u0006\u0004\bp\u0010qJ\u0010\u0010r\u001a\u00020B2\u0006\u0010k\u001a\u00020BH\u0016J\u0010\u0010s\u001a\u00020B2\u0006\u0010m\u001a\u00020BH\u0016J\u0006\u0010t\u001a\u00020&J\b\u0010u\u001a\u00020&H\u0002J\b\u0010v\u001a\u00020&H\u0002J\u0006\u0010w\u001a\u00020&J\r\u0010x\u001a\u00020&H\u0000¢\u0006\u0002\byJ=\u0010z\u001a\u00020&2\u0006\u0010{\u001a\u00020+2\u0006\u0010|\u001a\u0002002\u0019\u0010}\u001a\u0015\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0018\u00010$¢\u0006\u0002\b'H\u0014ø\u0001\u0000¢\u0006\u0004\b~\u0010\u007fJ\u001b\u0010\u0080\u0001\u001a\u00020\u00112\u0006\u0010o\u001a\u00020 ø\u0001\u0000¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u0007\u0010\u0083\u0001\u001a\u00020&J\t\u0010\u0084\u0001\u001a\u00020&H\u0016J\t\u0010\u0085\u0001\u001a\u00020&H\u0016J\u0013\u0010\u0086\u0001\u001a\u00020&2\b\u0010\u0087\u0001\u001a\u00030\u0088\u0001H\u0002J\u0007\u0010\u0089\u0001\u001a\u00020\u0011R\u0018\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0000R\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\f\u0012\b\u0012\u00060\u0000R\u00020\u00070\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0011X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\u0019\u0010\u001f\u001a\u0004\u0018\u00010 8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b!\u0010\"RD\u0010(\u001a\u0015\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0018\u00010$¢\u0006\u0002\b'2\u0019\u0010#\u001a\u0015\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0018\u00010$¢\u0006\u0002\b'@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R&\u0010,\u001a\u00020+2\u0006\u0010#\u001a\u00020+@BX\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010/\u001a\u0004\b-\u0010.R\u001e\u00101\u001a\u0002002\u0006\u0010#\u001a\u000200@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u001e\u00104\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0013R\u0016\u00106\u001a\u0004\u0018\u00010 X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R\u0018\u00107\u001a\u000608R\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u001a\u0010;\u001a\u00020<X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u000e\u0010E\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010F\u001a\u00020B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010DR\u000e\u0010H\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010I\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\"\u0010M\u001a\u0004\u0018\u00010L2\b\u0010#\u001a\u0004\u0018\u00010L@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u000e\u0010P\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010Q\u001a\u00020BX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010D\"\u0004\bS\u0010TR\u001a\u0010U\u001a\u00020\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\u0013\"\u0004\bW\u0010\u0015R\u0018\u0010X\u001a\u00020B2\u0006\u0010#\u001a\u00020B@BX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u008a\u0001"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "(Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;)V", "_childDelegates", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "alignmentLines", "Landroidx/compose/ui/node/AlignmentLines;", "getAlignmentLines", "()Landroidx/compose/ui/node/AlignmentLines;", "childDelegates", "", "getChildDelegates$ui_release", "()Ljava/util/List;", "childDelegatesDirty", "", "getChildDelegatesDirty$ui_release", "()Z", "setChildDelegatesDirty$ui_release", "(Z)V", "duringAlignmentLinesQuery", "getDuringAlignmentLinesQuery$ui_release", "setDuringAlignmentLinesQuery$ui_release", "innerCoordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "getInnerCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "isPlaced", "setPlaced", "lastConstraints", "Landroidx/compose/ui/unit/Constraints;", "getLastConstraints-DWUhwKw", "()Landroidx/compose/ui/unit/Constraints;", "<set-?>", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "Lkotlin/ExtensionFunctionType;", "lastLayerBlock", "getLastLayerBlock$ui_release", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/unit/IntOffset;", "lastPosition", "getLastPosition-nOcc-ac$ui_release", "()J", "J", "", "lastZIndex", "getLastZIndex$ui_release", "()F", "layingOutChildren", "getLayingOutChildren", "lookaheadConstraints", "measurePassDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "getMeasurePassDelegate$ui_release", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "measuredByParent", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "getMeasuredByParent$ui_release", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "setMeasuredByParent$ui_release", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "measuredHeight", "", "getMeasuredHeight", "()I", "measuredOnce", "measuredWidth", "getMeasuredWidth", "onNodePlacedCalled", "parentAlignmentLinesOwner", "getParentAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "", "parentData", "getParentData", "()Ljava/lang/Object;", "parentDataDirty", "placeOrder", "getPlaceOrder$ui_release", "setPlaceOrder$ui_release", "(I)V", "placedOnce", "getPlacedOnce$ui_release", "setPlacedOnce$ui_release", "previousPlaceOrder", "relayoutWithoutParentInProgress", "calculateAlignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "checkChildrenPlaceOrderForUpdates", "clearPlaceOrder", "forEachChildAlignmentLinesOwner", "block", "forEachChildDelegate", "get", "alignmentLine", "invalidateIntrinsicsParent", "forceRequest", "invalidateParentData", "layoutChildren", "markNodeAndSubtreeAsPlaced", "markSubtreeAsNotPlaced", "maxIntrinsicHeight", "width", "maxIntrinsicWidth", "height", "measure", "constraints", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "minIntrinsicHeight", "minIntrinsicWidth", "notifyChildrenUsingCoordinatesWhilePlacing", "onBeforeLayoutChildren", "onIntrinsicsQueried", "onNodeDetached", "onNodePlaced", "onNodePlaced$ui_release", "placeAt", "position", "zIndex", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "remeasure", "remeasure-BRTryo0", "(J)Z", "replace", "requestLayout", "requestMeasure", "trackLookaheadMeasurementByParent", "node", "Landroidx/compose/ui/node/LayoutNode;", "updateParentData", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class LookaheadPassDelegate extends androidx.compose.ui.layout.Placeable implements androidx.compose.ui.layout.Measurable, androidx.compose.ui.node.AlignmentLinesOwner {
        private boolean duringAlignmentLinesQuery;
        private boolean isPlaced;
        private kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> lastLayerBlock;
        private float lastZIndex;
        private boolean layingOutChildren;
        private androidx.compose.ui.unit.Constraints lookaheadConstraints;
        private boolean measuredOnce;
        private boolean onNodePlacedCalled;
        private boolean placedOnce;
        private boolean relayoutWithoutParentInProgress;
        private int previousPlaceOrder = Integer.MAX_VALUE;
        private int placeOrder = Integer.MAX_VALUE;
        private androidx.compose.ui.node.LayoutNode.UsageByParent measuredByParent = androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed;
        private long lastPosition = androidx.compose.ui.unit.IntOffset.INSTANCE.m4620getZeronOccac();
        private final androidx.compose.ui.node.AlignmentLines alignmentLines = new androidx.compose.ui.node.LookaheadAlignmentLines(this);
        private final androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate> _childDelegates = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate[16], 0);
        private boolean childDelegatesDirty = true;
        private boolean parentDataDirty = true;
        private java.lang.Object parentData = getMeasurePassDelegate$ui_release().getParentData();

        /* compiled from: LayoutNodeLayoutDelegate.kt */
        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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
                    iArr[androidx.compose.ui.node.LayoutNode.LayoutState.LayingOut.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[androidx.compose.ui.node.LayoutNode.UsageByParent.values().length];
                try {
                    iArr2[androidx.compose.ui.node.LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                try {
                    iArr2[androidx.compose.ui.node.LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public LookaheadPassDelegate() {
        }

        /* renamed from: getPlaceOrder$ui_release, reason: from getter */
        public final int getPlaceOrder() {
            return this.placeOrder;
        }

        public final void setPlaceOrder$ui_release(int i) {
            this.placeOrder = i;
        }

        /* renamed from: getMeasuredByParent$ui_release, reason: from getter */
        public final androidx.compose.ui.node.LayoutNode.UsageByParent getMeasuredByParent() {
            return this.measuredByParent;
        }

        public final void setMeasuredByParent$ui_release(androidx.compose.ui.node.LayoutNode.UsageByParent usageByParent) {
            this.measuredByParent = usageByParent;
        }

        public final androidx.compose.ui.node.LayoutNodeLayoutDelegate.MeasurePassDelegate getMeasurePassDelegate$ui_release() {
            return androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getMeasurePassDelegate();
        }

        /* renamed from: getDuringAlignmentLinesQuery$ui_release, reason: from getter */
        public final boolean getDuringAlignmentLinesQuery() {
            return this.duringAlignmentLinesQuery;
        }

        public final void setDuringAlignmentLinesQuery$ui_release(boolean z) {
            this.duringAlignmentLinesQuery = z;
        }

        /* renamed from: getPlacedOnce$ui_release, reason: from getter */
        public final boolean getPlacedOnce() {
            return this.placedOnce;
        }

        public final void setPlacedOnce$ui_release(boolean z) {
            this.placedOnce = z;
        }

        /* renamed from: getLastConstraints-DWUhwKw, reason: not valid java name and from getter */
        public final androidx.compose.ui.unit.Constraints getLookaheadConstraints() {
            return this.lookaheadConstraints;
        }

        /* renamed from: getLastPosition-nOcc-ac$ui_release, reason: not valid java name and from getter */
        public final long getLastPosition() {
            return this.lastPosition;
        }

        /* renamed from: getLastZIndex$ui_release, reason: from getter */
        public final float getLastZIndex() {
            return this.lastZIndex;
        }

        public final kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> getLastLayerBlock$ui_release() {
            return this.lastLayerBlock;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        /* renamed from: isPlaced, reason: from getter */
        public boolean getIsPlaced() {
            return this.isPlaced;
        }

        public void setPlaced(boolean z) {
            this.isPlaced = z;
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public androidx.compose.ui.node.NodeCoordinator getInnerCoordinator() {
            return androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.getInnerCoordinator$ui_release();
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public androidx.compose.ui.node.AlignmentLines getAlignmentLines() {
            return this.alignmentLines;
        }

        /* renamed from: getChildDelegatesDirty$ui_release, reason: from getter */
        public final boolean getChildDelegatesDirty() {
            return this.childDelegatesDirty;
        }

        public final void setChildDelegatesDirty$ui_release(boolean z) {
            this.childDelegatesDirty = z;
        }

        public final java.util.List<androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate> getChildDelegates$ui_release() {
            androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.getChildren$ui_release();
            if (!this.childDelegatesDirty) {
                return this._childDelegates.asMutableList();
            }
            androidx.compose.ui.node.LayoutNode layoutNode = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode;
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate> mutableVector = this._childDelegates;
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector2 = layoutNode.get_children$ui_release();
            int size = mutableVector2.getSize();
            if (size > 0) {
                androidx.compose.ui.node.LayoutNode[] content = mutableVector2.getContent();
                int i = 0;
                do {
                    androidx.compose.ui.node.LayoutNode layoutNode2 = content[i];
                    if (mutableVector.getSize() <= i) {
                        androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = layoutNode2.getLayoutDelegate().getLookaheadPassDelegate();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadPassDelegate);
                        mutableVector.add(lookaheadPassDelegate);
                    } else {
                        androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate2 = layoutNode2.getLayoutDelegate().getLookaheadPassDelegate();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadPassDelegate2);
                        mutableVector.set(i, lookaheadPassDelegate2);
                    }
                    i++;
                } while (i < size);
            }
            mutableVector.removeRange(layoutNode.getChildren$ui_release().size(), mutableVector.getSize());
            this.childDelegatesDirty = false;
            return this._childDelegates.asMutableList();
        }

        public final boolean getLayingOutChildren() {
            return this.layingOutChildren;
        }

        private final void forEachChildDelegate(kotlin.jvm.functions.Function1<? super androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate, kotlin.Unit> block) {
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                androidx.compose.ui.node.LayoutNode[] content = mutableVector.getContent();
                int i = 0;
                do {
                    androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = content[i].getLayoutDelegate().getLookaheadPassDelegate();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadPassDelegate);
                    block.invoke(lookaheadPassDelegate);
                    i++;
                } while (i < size);
            }
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void layoutChildren() {
            this.layingOutChildren = true;
            getAlignmentLines().recalculateQueryOwner();
            if (androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getLookaheadLayoutPending()) {
                onBeforeLayoutChildren();
            }
            final androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = getInnerCoordinator().getLookaheadDelegate();
            kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
            if (androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.lookaheadLayoutPendingForAlignment || (!this.duringAlignmentLinesQuery && !lookaheadDelegate.getIsPlacingForAlignment() && androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getLookaheadLayoutPending())) {
                androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.lookaheadLayoutPending = false;
                androidx.compose.ui.node.LayoutNode.LayoutState layoutState = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getLayoutState();
                androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutState = androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut;
                androidx.compose.ui.node.Owner requireOwner = androidx.compose.ui.node.LayoutNodeKt.requireOwner(androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode);
                androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.setCoordinatesAccessedDuringPlacement(false);
                androidx.compose.ui.node.OwnerSnapshotObserver snapshotObserver = requireOwner.getSnapshotObserver();
                androidx.compose.ui.node.LayoutNode layoutNode = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode;
                final androidx.compose.ui.node.LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this;
                androidx.compose.ui.node.OwnerSnapshotObserver.observeLayoutSnapshotReads$ui_release$default(snapshotObserver, layoutNode, false, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                        invoke2();
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.this.clearPlaceOrder();
                        androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.this.forEachChildAlignmentLinesOwner(new kotlin.jvm.functions.Function1<androidx.compose.ui.node.AlignmentLinesOwner, kotlin.Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1.1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.AlignmentLinesOwner alignmentLinesOwner) {
                                invoke2(alignmentLinesOwner);
                                return kotlin.Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(androidx.compose.ui.node.AlignmentLinesOwner alignmentLinesOwner) {
                                alignmentLinesOwner.getAlignmentLines().setUsedDuringParentLayout$ui_release(false);
                            }
                        });
                        androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate2 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.this.getInnerCoordinator().getLookaheadDelegate();
                        if (lookaheadDelegate2 != null) {
                            boolean isPlacingForAlignment$ui_release = lookaheadDelegate2.getIsPlacingForAlignment();
                            java.util.List<androidx.compose.ui.node.LayoutNode> children$ui_release = layoutNodeLayoutDelegate.layoutNode.getChildren$ui_release();
                            int size = children$ui_release.size();
                            for (int i = 0; i < size; i++) {
                                androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate3 = children$ui_release.get(i).getOuterCoordinator$ui_release().getLookaheadDelegate();
                                if (lookaheadDelegate3 != null) {
                                    lookaheadDelegate3.setPlacingForAlignment$ui_release(isPlacingForAlignment$ui_release);
                                }
                            }
                        }
                        lookaheadDelegate.getMeasureResult$ui_release().placeChildren();
                        androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate4 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.this.getInnerCoordinator().getLookaheadDelegate();
                        if (lookaheadDelegate4 != null) {
                            lookaheadDelegate4.getIsPlacingForAlignment();
                            java.util.List<androidx.compose.ui.node.LayoutNode> children$ui_release2 = layoutNodeLayoutDelegate.layoutNode.getChildren$ui_release();
                            int size2 = children$ui_release2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate5 = children$ui_release2.get(i2).getOuterCoordinator$ui_release().getLookaheadDelegate();
                                if (lookaheadDelegate5 != null) {
                                    lookaheadDelegate5.setPlacingForAlignment$ui_release(false);
                                }
                            }
                        }
                        androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.this.checkChildrenPlaceOrderForUpdates();
                        androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.this.forEachChildAlignmentLinesOwner(new kotlin.jvm.functions.Function1<androidx.compose.ui.node.AlignmentLinesOwner, kotlin.Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1.4
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.AlignmentLinesOwner alignmentLinesOwner) {
                                invoke2(alignmentLinesOwner);
                                return kotlin.Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(androidx.compose.ui.node.AlignmentLinesOwner alignmentLinesOwner) {
                                alignmentLinesOwner.getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(alignmentLinesOwner.getAlignmentLines().getUsedDuringParentLayout());
                            }
                        });
                    }
                }, 2, null);
                androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutState = layoutState;
                if (androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringPlacement() && lookaheadDelegate.getIsPlacingForAlignment()) {
                    requestLayout();
                }
                androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.lookaheadLayoutPendingForAlignment = false;
            }
            if (getAlignmentLines().getUsedDuringParentLayout()) {
                getAlignmentLines().setPreviousUsedDuringParentLayout$ui_release(true);
            }
            if (getAlignmentLines().getDirty() && getAlignmentLines().getRequired$ui_release()) {
                getAlignmentLines().recalculate();
            }
            this.layingOutChildren = false;
        }

        private final void markSubtreeAsNotPlaced() {
            if (getIsPlaced()) {
                int i = 0;
                setPlaced(false);
                androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
                int size = mutableVector.getSize();
                if (size > 0) {
                    androidx.compose.ui.node.LayoutNode[] content = mutableVector.getContent();
                    do {
                        androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = content[i].getLayoutDelegate().getLookaheadPassDelegate();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadPassDelegate);
                        lookaheadPassDelegate.markSubtreeAsNotPlaced();
                        i++;
                    } while (i < size);
                }
            }
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> calculateAlignmentLines() {
            if (!this.duringAlignmentLinesQuery) {
                if (androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getLayoutState() == androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadMeasuring) {
                    getAlignmentLines().setUsedByModifierMeasurement$ui_release(true);
                    if (getAlignmentLines().getDirty()) {
                        androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.markLookaheadLayoutPending$ui_release();
                    }
                } else {
                    getAlignmentLines().setUsedByModifierLayout$ui_release(true);
                }
            }
            androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = getInnerCoordinator().getLookaheadDelegate();
            if (lookaheadDelegate != null) {
                lookaheadDelegate.setPlacingForAlignment$ui_release(true);
            }
            layoutChildren();
            androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate2 = getInnerCoordinator().getLookaheadDelegate();
            if (lookaheadDelegate2 != null) {
                lookaheadDelegate2.setPlacingForAlignment$ui_release(false);
            }
            return getAlignmentLines().getLastCalculation();
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public androidx.compose.ui.node.AlignmentLinesOwner getParentAlignmentLinesOwner() {
            androidx.compose.ui.node.LayoutNodeLayoutDelegate layoutDelegate;
            androidx.compose.ui.node.LayoutNode parent$ui_release = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if (parent$ui_release == null || (layoutDelegate = parent$ui_release.getLayoutDelegate()) == null) {
                return null;
            }
            return layoutDelegate.getLookaheadAlignmentLinesOwner$ui_release();
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void forEachChildAlignmentLinesOwner(kotlin.jvm.functions.Function1<? super androidx.compose.ui.node.AlignmentLinesOwner, kotlin.Unit> block) {
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                androidx.compose.ui.node.LayoutNode[] content = mutableVector.getContent();
                int i = 0;
                do {
                    androidx.compose.ui.node.AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = content[i].getLayoutDelegate().getLookaheadAlignmentLinesOwner$ui_release();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadAlignmentLinesOwner$ui_release);
                    block.invoke(lookaheadAlignmentLinesOwner$ui_release);
                    i++;
                } while (i < size);
            }
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void requestLayout() {
            androidx.compose.ui.node.LayoutNode.requestLookaheadRelayout$ui_release$default(androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode, false, 1, null);
        }

        @Override // androidx.compose.ui.node.AlignmentLinesOwner
        public void requestMeasure() {
            androidx.compose.ui.node.LayoutNode.requestLookaheadRemeasure$ui_release$default(androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode, false, false, 3, null);
        }

        public final void notifyChildrenUsingCoordinatesWhilePlacing() {
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector;
            int size;
            if (androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getChildrenAccessingCoordinatesDuringPlacement() <= 0 || (size = (mutableVector = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release()).getSize()) <= 0) {
                return;
            }
            androidx.compose.ui.node.LayoutNode[] content = mutableVector.getContent();
            int i = 0;
            do {
                androidx.compose.ui.node.LayoutNode layoutNode = content[i];
                androidx.compose.ui.node.LayoutNodeLayoutDelegate layoutDelegate = layoutNode.getLayoutDelegate();
                if ((layoutDelegate.getCoordinatesAccessedDuringPlacement() || layoutDelegate.getCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate.getLayoutPending()) {
                    androidx.compose.ui.node.LayoutNode.requestLookaheadRelayout$ui_release$default(layoutNode, false, 1, null);
                }
                androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = layoutDelegate.getLookaheadPassDelegate();
                if (lookaheadPassDelegate != null) {
                    lookaheadPassDelegate.notifyChildrenUsingCoordinatesWhilePlacing();
                }
                i++;
            } while (i < size);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
        
            if ((r0 != null ? r0.getLayoutState$ui_release() : null) == androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut) goto L13;
         */
        @Override // androidx.compose.ui.layout.Measurable
        /* renamed from: measure-BRTryo0 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public androidx.compose.ui.layout.Placeable mo3402measureBRTryo0(long constraints) {
            androidx.compose.ui.node.LayoutNode parent$ui_release = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if ((parent$ui_release != null ? parent$ui_release.getLayoutState$ui_release() : null) != androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadMeasuring) {
                androidx.compose.ui.node.LayoutNode parent$ui_release2 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            }
            androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.detachedFromParentLookaheadPass = false;
            trackLookaheadMeasurementByParent(androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode);
            if (androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent() == androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed) {
                androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.clearSubtreeIntrinsicsUsage$ui_release();
            }
            m3556remeasureBRTryo0(constraints);
            return this;
        }

        private final void trackLookaheadMeasurementByParent(androidx.compose.ui.node.LayoutNode node) {
            androidx.compose.ui.node.LayoutNode.UsageByParent usageByParent;
            androidx.compose.ui.node.LayoutNode parent$ui_release = node.getParent$ui_release();
            if (parent$ui_release != null) {
                if (this.measuredByParent != androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed && !node.getCanMultiMeasure()) {
                    throw new java.lang.IllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()".toString());
                }
                int i = androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
                if (i == 1 || i == 2) {
                    usageByParent = androidx.compose.ui.node.LayoutNode.UsageByParent.InMeasureBlock;
                } else if (i == 3 || i == 4) {
                    usageByParent = androidx.compose.ui.node.LayoutNode.UsageByParent.InLayoutBlock;
                } else {
                    throw new java.lang.IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + parent$ui_release.getLayoutState$ui_release());
                }
                this.measuredByParent = usageByParent;
                return;
            }
            this.measuredByParent = androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed;
        }

        @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
        public java.lang.Object getParentData() {
            return this.parentData;
        }

        /* renamed from: remeasure-BRTryo0, reason: not valid java name */
        public final boolean m3556remeasureBRTryo0(long constraints) {
            long IntSize;
            androidx.compose.ui.unit.Constraints constraints2;
            if (!androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.getIsDeactivated()) {
                androidx.compose.ui.node.LayoutNode parent$ui_release = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
                androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.setCanMultiMeasure$ui_release(androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.getCanMultiMeasure() || (parent$ui_release != null && parent$ui_release.getCanMultiMeasure()));
                if (!androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.getLookaheadMeasurePending$ui_release() && (constraints2 = this.lookaheadConstraints) != null && androidx.compose.ui.unit.Constraints.m4417equalsimpl0(constraints2.getValue(), constraints)) {
                    androidx.compose.ui.node.Owner owner = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.getOwner();
                    if (owner != null) {
                        owner.forceMeasureTheSubtree(androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode, true);
                    }
                    androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.resetSubtreeIntrinsicsUsage$ui_release();
                    return false;
                }
                this.lookaheadConstraints = androidx.compose.ui.unit.Constraints.m4412boximpl(constraints);
                m3455setMeasurementConstraintsBRTryo0(constraints);
                getAlignmentLines().setUsedByModifierMeasurement$ui_release(false);
                forEachChildAlignmentLinesOwner(new kotlin.jvm.functions.Function1<androidx.compose.ui.node.AlignmentLinesOwner, kotlin.Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$remeasure$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.AlignmentLinesOwner alignmentLinesOwner) {
                        invoke2(alignmentLinesOwner);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(androidx.compose.ui.node.AlignmentLinesOwner alignmentLinesOwner) {
                        alignmentLinesOwner.getAlignmentLines().setUsedDuringParentMeasurement$ui_release(false);
                    }
                });
                if (this.measuredOnce) {
                    IntSize = getMeasuredSize();
                } else {
                    IntSize = androidx.compose.ui.unit.IntSizeKt.IntSize(Integer.MIN_VALUE, Integer.MIN_VALUE);
                }
                this.measuredOnce = true;
                androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
                if (lookaheadDelegate != null) {
                    androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.m3550performLookaheadMeasureBRTryo0(constraints);
                    m3454setMeasuredSizeozmzZPI(androidx.compose.ui.unit.IntSizeKt.IntSize(lookaheadDelegate.getWidth(), lookaheadDelegate.getHeight()));
                    return (androidx.compose.ui.unit.IntSize.m4652getWidthimpl(IntSize) == lookaheadDelegate.getWidth() && androidx.compose.ui.unit.IntSize.m4651getHeightimpl(IntSize) == lookaheadDelegate.getHeight()) ? false : true;
                }
                throw new java.lang.IllegalStateException("Lookahead result from lookaheadRemeasure cannot be null".toString());
            }
            throw new java.lang.IllegalArgumentException("measure is called on a deactivated node".toString());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.compose.ui.layout.Placeable
        /* renamed from: placeAt-f8xVGno */
        public void mo3403placeAtf8xVGno(final long position, float zIndex, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> layerBlock) {
            if (!(!androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.getIsDeactivated())) {
                throw new java.lang.IllegalArgumentException("place is called on a deactivated node".toString());
            }
            androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutState = androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut;
            this.placedOnce = true;
            this.onNodePlacedCalled = false;
            if (!androidx.compose.ui.unit.IntOffset.m4609equalsimpl0(position, this.lastPosition)) {
                if (androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringModifierPlacement() || androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getCoordinatesAccessedDuringPlacement()) {
                    androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.lookaheadLayoutPending = true;
                }
                notifyChildrenUsingCoordinatesWhilePlacing();
            }
            final androidx.compose.ui.node.Owner requireOwner = androidx.compose.ui.node.LayoutNodeKt.requireOwner(androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode);
            if (!androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getLookaheadLayoutPending() && getIsPlaced()) {
                androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
                kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
                lookaheadDelegate.m3564placeSelfApparentToRealOffsetgyyYBs$ui_release(position);
                onNodePlaced$ui_release();
            } else {
                androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.setCoordinatesAccessedDuringModifierPlacement(false);
                getAlignmentLines().setUsedByModifierLayout$ui_release(false);
                androidx.compose.ui.node.OwnerSnapshotObserver snapshotObserver = requireOwner.getSnapshotObserver();
                androidx.compose.ui.node.LayoutNode layoutNode = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode;
                final androidx.compose.ui.node.LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this;
                androidx.compose.ui.node.OwnerSnapshotObserver.observeLayoutModifierSnapshotReads$ui_release$default(snapshotObserver, layoutNode, false, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$placeAt$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                        invoke2();
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate2;
                        androidx.compose.ui.layout.Placeable.PlacementScope placementScope = null;
                        if (androidx.compose.ui.node.LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode)) {
                            androidx.compose.ui.node.NodeCoordinator wrappedBy = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getOuterCoordinator().getWrappedBy();
                            if (wrappedBy != null) {
                                placementScope = wrappedBy.getPlacementScope();
                            }
                        } else {
                            androidx.compose.ui.node.NodeCoordinator wrappedBy2 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getOuterCoordinator().getWrappedBy();
                            if (wrappedBy2 != null && (lookaheadDelegate2 = wrappedBy2.getLookaheadDelegate()) != null) {
                                placementScope = lookaheadDelegate2.getPlacementScope();
                            }
                        }
                        if (placementScope == null) {
                            placementScope = requireOwner.getPlacementScope();
                        }
                        androidx.compose.ui.node.LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this;
                        long j = position;
                        androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate3 = layoutNodeLayoutDelegate2.getOuterCoordinator().getLookaheadDelegate();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate3);
                        androidx.compose.ui.layout.Placeable.PlacementScope.m3456place70tqf50$default(placementScope, lookaheadDelegate3, j, 0.0f, 2, null);
                    }
                }, 2, null);
            }
            this.lastPosition = position;
            this.lastZIndex = zIndex;
            this.lastLayerBlock = layerBlock;
            androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutState = androidx.compose.ui.node.LayoutNode.LayoutState.Idle;
        }

        @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
        public int getMeasuredWidth() {
            androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
            return lookaheadDelegate.getMeasuredWidth();
        }

        @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
        public int getMeasuredHeight() {
            androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
            return lookaheadDelegate.getMeasuredHeight();
        }

        @Override // androidx.compose.ui.layout.Measured
        public int get(androidx.compose.ui.layout.AlignmentLine alignmentLine) {
            androidx.compose.ui.node.LayoutNode parent$ui_release = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if ((parent$ui_release != null ? parent$ui_release.getLayoutState$ui_release() : null) != androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadMeasuring) {
                androidx.compose.ui.node.LayoutNode parent$ui_release2 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
                if ((parent$ui_release2 != null ? parent$ui_release2.getLayoutState$ui_release() : null) == androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut) {
                    getAlignmentLines().setUsedDuringParentLayout$ui_release(true);
                }
            } else {
                getAlignmentLines().setUsedDuringParentMeasurement$ui_release(true);
            }
            this.duringAlignmentLinesQuery = true;
            androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
            int i = lookaheadDelegate.get(alignmentLine);
            this.duringAlignmentLinesQuery = false;
            return i;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int height) {
            onIntrinsicsQueried();
            androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
            return lookaheadDelegate.minIntrinsicWidth(height);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int height) {
            onIntrinsicsQueried();
            androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
            return lookaheadDelegate.maxIntrinsicWidth(height);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int width) {
            onIntrinsicsQueried();
            androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
            return lookaheadDelegate.minIntrinsicHeight(width);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int width) {
            onIntrinsicsQueried();
            androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
            return lookaheadDelegate.maxIntrinsicHeight(width);
        }

        private final void onIntrinsicsQueried() {
            androidx.compose.ui.node.LayoutNode.UsageByParent usageByParent;
            androidx.compose.ui.node.LayoutNode.requestLookaheadRemeasure$ui_release$default(androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode, false, false, 3, null);
            androidx.compose.ui.node.LayoutNode parent$ui_release = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if (parent$ui_release == null || androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent() != androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed) {
                return;
            }
            androidx.compose.ui.node.LayoutNode layoutNode = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode;
            int i = androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
            if (i == 2) {
                usageByParent = androidx.compose.ui.node.LayoutNode.UsageByParent.InMeasureBlock;
            } else if (i == 3) {
                usageByParent = androidx.compose.ui.node.LayoutNode.UsageByParent.InLayoutBlock;
            } else {
                usageByParent = parent$ui_release.getIntrinsicsUsageByParent();
            }
            layoutNode.setIntrinsicsUsageByParent$ui_release(usageByParent);
        }

        public final void invalidateIntrinsicsParent(boolean forceRequest) {
            androidx.compose.ui.node.LayoutNode parent$ui_release;
            androidx.compose.ui.node.LayoutNode parent$ui_release2 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            androidx.compose.ui.node.LayoutNode.UsageByParent intrinsicsUsageByParent = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.getIntrinsicsUsageByParent();
            if (parent$ui_release2 == null || intrinsicsUsageByParent == androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed) {
                return;
            }
            while (parent$ui_release2.getIntrinsicsUsageByParent() == intrinsicsUsageByParent && (parent$ui_release = parent$ui_release2.getParent$ui_release()) != null) {
                parent$ui_release2 = parent$ui_release;
            }
            int i = androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate.WhenMappings.$EnumSwitchMapping$1[intrinsicsUsageByParent.ordinal()];
            if (i == 1) {
                if (parent$ui_release2.getLookaheadRoot() != null) {
                    androidx.compose.ui.node.LayoutNode.requestLookaheadRemeasure$ui_release$default(parent$ui_release2, forceRequest, false, 2, null);
                    return;
                } else {
                    androidx.compose.ui.node.LayoutNode.requestRemeasure$ui_release$default(parent$ui_release2, forceRequest, false, 2, null);
                    return;
                }
            }
            if (i == 2) {
                if (parent$ui_release2.getLookaheadRoot() != null) {
                    parent$ui_release2.requestLookaheadRelayout$ui_release(forceRequest);
                    return;
                } else {
                    parent$ui_release2.requestRelayout$ui_release(forceRequest);
                    return;
                }
            }
            throw new java.lang.IllegalStateException("Intrinsics isn't used by the parent".toString());
        }

        public final void invalidateParentData() {
            this.parentDataDirty = true;
        }

        public final boolean updateParentData() {
            if (getParentData() == null) {
                androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
                kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
                if (lookaheadDelegate.getParentData() == null) {
                    return false;
                }
            }
            if (!this.parentDataDirty) {
                return false;
            }
            this.parentDataDirty = false;
            androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate2 = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
            kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate2);
            this.parentData = lookaheadDelegate2.getParentData();
            return true;
        }

        public final void onNodePlaced$ui_release() {
            this.onNodePlacedCalled = true;
            androidx.compose.ui.node.LayoutNode parent$ui_release = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release();
            if (!getIsPlaced()) {
                markNodeAndSubtreeAsPlaced();
                if (this.relayoutWithoutParentInProgress && parent$ui_release != null) {
                    androidx.compose.ui.node.LayoutNode.requestLookaheadRelayout$ui_release$default(parent$ui_release, false, 1, null);
                }
            }
            if (parent$ui_release != null) {
                if (!this.relayoutWithoutParentInProgress && (parent$ui_release.getLayoutState$ui_release() == androidx.compose.ui.node.LayoutNode.LayoutState.LayingOut || parent$ui_release.getLayoutState$ui_release() == androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut)) {
                    if (this.placeOrder == Integer.MAX_VALUE) {
                        this.placeOrder = parent$ui_release.getLayoutDelegate().nextChildLookaheadPlaceOrder;
                        parent$ui_release.getLayoutDelegate().nextChildLookaheadPlaceOrder++;
                    } else {
                        throw new java.lang.IllegalStateException("Place was called on a node which was placed already".toString());
                    }
                }
            } else {
                this.placeOrder = 0;
            }
            layoutChildren();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void clearPlaceOrder() {
            int i = 0;
            androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.nextChildLookaheadPlaceOrder = 0;
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                androidx.compose.ui.node.LayoutNode[] content = mutableVector.getContent();
                do {
                    androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = content[i].getLayoutDelegate().getLookaheadPassDelegate();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadPassDelegate);
                    lookaheadPassDelegate.previousPlaceOrder = lookaheadPassDelegate.placeOrder;
                    lookaheadPassDelegate.placeOrder = Integer.MAX_VALUE;
                    if (lookaheadPassDelegate.measuredByParent == androidx.compose.ui.node.LayoutNode.UsageByParent.InLayoutBlock) {
                        lookaheadPassDelegate.measuredByParent = androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed;
                    }
                    i++;
                } while (i < size);
            }
        }

        private final void markNodeAndSubtreeAsPlaced() {
            boolean isPlaced = getIsPlaced();
            setPlaced(true);
            int i = 0;
            if (!isPlaced && androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getLookaheadMeasurePending()) {
                androidx.compose.ui.node.LayoutNode.requestLookaheadRemeasure$ui_release$default(androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode, true, false, 2, null);
            }
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                androidx.compose.ui.node.LayoutNode[] content = mutableVector.getContent();
                do {
                    androidx.compose.ui.node.LayoutNode layoutNode = content[i];
                    if (layoutNode.getPlaceOrder$ui_release() != Integer.MAX_VALUE) {
                        androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNode.getLookaheadPassDelegate$ui_release();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadPassDelegate$ui_release);
                        lookaheadPassDelegate$ui_release.markNodeAndSubtreeAsPlaced();
                        layoutNode.rescheduleRemeasureOrRelayout$ui_release(layoutNode);
                    }
                    i++;
                } while (i < size);
            }
        }

        private final void onBeforeLayoutChildren() {
            androidx.compose.ui.node.LayoutNode layoutNode = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode;
            androidx.compose.ui.node.LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this;
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                androidx.compose.ui.node.LayoutNode[] content = mutableVector.getContent();
                int i = 0;
                do {
                    androidx.compose.ui.node.LayoutNode layoutNode2 = content[i];
                    if (layoutNode2.getLookaheadMeasurePending$ui_release() && layoutNode2.getMeasuredByParentInLookahead$ui_release() == androidx.compose.ui.node.LayoutNode.UsageByParent.InMeasureBlock) {
                        androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = layoutNode2.getLayoutDelegate().getLookaheadPassDelegate();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadPassDelegate);
                        androidx.compose.ui.unit.Constraints m3553getLastLookaheadConstraintsDWUhwKw = layoutNode2.getLayoutDelegate().m3553getLastLookaheadConstraintsDWUhwKw();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(m3553getLastLookaheadConstraintsDWUhwKw);
                        if (lookaheadPassDelegate.m3556remeasureBRTryo0(m3553getLastLookaheadConstraintsDWUhwKw.getValue())) {
                            androidx.compose.ui.node.LayoutNode.requestLookaheadRemeasure$ui_release$default(layoutNodeLayoutDelegate.layoutNode, false, false, 3, null);
                        }
                    }
                    i++;
                } while (i < size);
            }
        }

        public final void replace() {
            androidx.compose.ui.node.LayoutNode parent$ui_release;
            try {
                this.relayoutWithoutParentInProgress = true;
                if (!this.placedOnce) {
                    throw new java.lang.IllegalStateException("replace() called on item that was not placed".toString());
                }
                this.onNodePlacedCalled = false;
                boolean isPlaced = getIsPlaced();
                mo3403placeAtf8xVGno(this.lastPosition, 0.0f, null);
                if (isPlaced && !this.onNodePlacedCalled && (parent$ui_release = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.getParent$ui_release()) != null) {
                    androidx.compose.ui.node.LayoutNode.requestLookaheadRelayout$ui_release$default(parent$ui_release, false, 1, null);
                }
            } finally {
                this.relayoutWithoutParentInProgress = false;
            }
        }

        public final void onNodeDetached() {
            this.placeOrder = Integer.MAX_VALUE;
            this.previousPlaceOrder = Integer.MAX_VALUE;
            setPlaced(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkChildrenPlaceOrderForUpdates() {
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.layoutNode.get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                androidx.compose.ui.node.LayoutNode[] content = mutableVector.getContent();
                int i = 0;
                do {
                    androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = content[i].getLayoutDelegate().getLookaheadPassDelegate();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadPassDelegate);
                    int i2 = lookaheadPassDelegate.previousPlaceOrder;
                    int i3 = lookaheadPassDelegate.placeOrder;
                    if (i2 != i3 && i3 == Integer.MAX_VALUE) {
                        lookaheadPassDelegate.markSubtreeAsNotPlaced();
                    }
                    i++;
                } while (i < size);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performMeasure-BRTryo0, reason: not valid java name */
    public final void m3551performMeasureBRTryo0(long constraints) {
        if (this.layoutState != androidx.compose.ui.node.LayoutNode.LayoutState.Idle) {
            throw new java.lang.IllegalStateException("layout state is not idle before measure starts".toString());
        }
        this.layoutState = androidx.compose.ui.node.LayoutNode.LayoutState.Measuring;
        this.measurePending = false;
        this.performMeasureConstraints = constraints;
        androidx.compose.ui.node.LayoutNodeKt.requireOwner(this.layoutNode).getSnapshotObserver().observeMeasureSnapshotReads$ui_release(this.layoutNode, false, this.performMeasureBlock);
        if (this.layoutState == androidx.compose.ui.node.LayoutNode.LayoutState.Measuring) {
            markLayoutPending$ui_release();
            this.layoutState = androidx.compose.ui.node.LayoutNode.LayoutState.Idle;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performLookaheadMeasure-BRTryo0, reason: not valid java name */
    public final void m3550performLookaheadMeasureBRTryo0(final long constraints) {
        this.layoutState = androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadMeasuring;
        this.lookaheadMeasurePending = false;
        androidx.compose.ui.node.OwnerSnapshotObserver.observeMeasureSnapshotReads$ui_release$default(androidx.compose.ui.node.LayoutNodeKt.requireOwner(this.layoutNode).getSnapshotObserver(), this.layoutNode, false, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.node.LayoutNodeLayoutDelegate$performLookaheadMeasure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = androidx.compose.ui.node.LayoutNodeLayoutDelegate.this.getOuterCoordinator().getLookaheadDelegate();
                kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
                lookaheadDelegate.mo3402measureBRTryo0(constraints);
            }
        }, 2, null);
        markLookaheadLayoutPending$ui_release();
        if (androidx.compose.ui.node.LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(this.layoutNode)) {
            markLayoutPending$ui_release();
        } else {
            markMeasurePending$ui_release();
        }
        this.layoutState = androidx.compose.ui.node.LayoutNode.LayoutState.Idle;
    }

    public final void ensureLookaheadDelegateCreated$ui_release() {
        if (this.lookaheadPassDelegate == null) {
            this.lookaheadPassDelegate = new androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate();
        }
    }

    public final void updateParentData() {
        androidx.compose.ui.node.LayoutNode parent$ui_release;
        if (this.measurePassDelegate.updateParentData() && (parent$ui_release = this.layoutNode.getParent$ui_release()) != null) {
            androidx.compose.ui.node.LayoutNode.requestRemeasure$ui_release$default(parent$ui_release, false, false, 3, null);
        }
        androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate == null || !lookaheadPassDelegate.updateParentData()) {
            return;
        }
        if (androidx.compose.ui.node.LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(this.layoutNode)) {
            androidx.compose.ui.node.LayoutNode parent$ui_release2 = this.layoutNode.getParent$ui_release();
            if (parent$ui_release2 != null) {
                androidx.compose.ui.node.LayoutNode.requestRemeasure$ui_release$default(parent$ui_release2, false, false, 3, null);
                return;
            }
            return;
        }
        androidx.compose.ui.node.LayoutNode parent$ui_release3 = this.layoutNode.getParent$ui_release();
        if (parent$ui_release3 != null) {
            androidx.compose.ui.node.LayoutNode.requestLookaheadRemeasure$ui_release$default(parent$ui_release3, false, false, 3, null);
        }
    }

    public final void invalidateParentData() {
        this.measurePassDelegate.invalidateParentData();
        androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.invalidateParentData();
        }
    }

    public final void resetAlignmentLines() {
        androidx.compose.ui.node.AlignmentLines alignmentLines;
        this.measurePassDelegate.getAlignmentLines().reset$ui_release();
        androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate == null || (alignmentLines = lookaheadPassDelegate.getAlignmentLines()) == null) {
            return;
        }
        alignmentLines.reset$ui_release();
    }

    public final void markChildrenDirty() {
        this.measurePassDelegate.setChildDelegatesDirty$ui_release(true);
        androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = this.lookaheadPassDelegate;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.setChildDelegatesDirty$ui_release(true);
        }
    }
}
