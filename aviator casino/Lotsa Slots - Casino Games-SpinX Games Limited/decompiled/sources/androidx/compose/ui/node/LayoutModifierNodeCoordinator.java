package androidx.compose.ui.node;

/* compiled from: LayoutModifierNodeCoordinator.kt */
@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 ;2\u00020\u0001:\u0002;<B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u001dH\u0016J\u0010\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u001dH\u0016J\u001a\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u001dH\u0016J\u0010\u0010,\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u001dH\u0016J\u0010\u0010-\u001a\u00020!2\u0006\u0010.\u001a\u00020/H\u0016J=\u00100\u001a\u00020!2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0019\u00105\u001a\u0015\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020!\u0018\u000106¢\u0006\u0002\b8H\u0014ø\u0001\u0000¢\u0006\u0004\b9\u0010:R$\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000f@TX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006="}, d2 = {"Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;", "Landroidx/compose/ui/node/NodeCoordinator;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "measureNode", "Landroidx/compose/ui/node/LayoutModifierNode;", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/LayoutModifierNode;)V", "<set-?>", "layoutModifierNode", "getLayoutModifierNode", "()Landroidx/compose/ui/node/LayoutModifierNode;", "setLayoutModifierNode$ui_release", "(Landroidx/compose/ui/node/LayoutModifierNode;)V", "lookaheadConstraints", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/node/LookaheadDelegate;", "lookaheadDelegate", "getLookaheadDelegate", "()Landroidx/compose/ui/node/LookaheadDelegate;", "setLookaheadDelegate", "(Landroidx/compose/ui/node/LookaheadDelegate;)V", "tail", "Landroidx/compose/ui/Modifier$Node;", "getTail", "()Landroidx/compose/ui/Modifier$Node;", "wrappedNonNull", "getWrappedNonNull", "()Landroidx/compose/ui/node/NodeCoordinator;", "calculateAlignmentLine", "", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "ensureLookaheadDelegateCreated", "", "maxIntrinsicHeight", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/Placeable;", "constraints", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "minIntrinsicHeight", "minIntrinsicWidth", "performDraw", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "placeAt", "position", "Landroidx/compose/ui/unit/IntOffset;", "zIndex", "", "layerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "LookaheadDelegateForLayoutModifierNode", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutModifierNodeCoordinator extends androidx.compose.ui.node.NodeCoordinator {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.node.LayoutModifierNodeCoordinator.Companion INSTANCE = new androidx.compose.ui.node.LayoutModifierNodeCoordinator.Companion(null);
    private static final androidx.compose.ui.graphics.Paint modifierBoundsPaint;
    private androidx.compose.ui.node.LayoutModifierNode layoutModifierNode;
    private androidx.compose.ui.unit.Constraints lookaheadConstraints;
    private androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate;

    public LayoutModifierNodeCoordinator(androidx.compose.ui.node.LayoutNode layoutNode, androidx.compose.ui.node.LayoutModifierNode layoutModifierNode) {
        super(layoutNode);
        this.layoutModifierNode = layoutModifierNode;
        this.lookaheadDelegate = layoutNode.getLookaheadRoot() != null ? new androidx.compose.ui.node.LayoutModifierNodeCoordinator.LookaheadDelegateForLayoutModifierNode() : null;
    }

    public final androidx.compose.ui.node.LayoutModifierNode getLayoutModifierNode() {
        return this.layoutModifierNode;
    }

    public final void setLayoutModifierNode$ui_release(androidx.compose.ui.node.LayoutModifierNode layoutModifierNode) {
        this.layoutModifierNode = layoutModifierNode;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public androidx.compose.ui.Modifier.Node getTail() {
        return this.layoutModifierNode.getNode();
    }

    public final androidx.compose.ui.node.NodeCoordinator getWrappedNonNull() {
        androidx.compose.ui.node.NodeCoordinator wrapped$ui_release = getWrapped();
        kotlin.jvm.internal.Intrinsics.checkNotNull(wrapped$ui_release);
        return wrapped$ui_release;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public androidx.compose.ui.node.LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    protected void setLookaheadDelegate(androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate) {
        this.lookaheadDelegate = lookaheadDelegate;
    }

    /* compiled from: LayoutModifierNodeCoordinator.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/node/LayoutModifierNodeCoordinator$LookaheadDelegateForLayoutModifierNode;", "Landroidx/compose/ui/node/LookaheadDelegate;", "(Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;)V", "calculateAlignmentLine", "", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "maxIntrinsicHeight", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class LookaheadDelegateForLayoutModifierNode extends androidx.compose.ui.node.LookaheadDelegate {
        public LookaheadDelegateForLayoutModifierNode() {
            super(androidx.compose.ui.node.LayoutModifierNodeCoordinator.this);
        }

        @Override // androidx.compose.ui.layout.Measurable
        /* renamed from: measure-BRTryo0 */
        public androidx.compose.ui.layout.Placeable mo3402measureBRTryo0(long constraints) {
            androidx.compose.ui.node.LayoutModifierNodeCoordinator.LookaheadDelegateForLayoutModifierNode lookaheadDelegateForLayoutModifierNode = this;
            androidx.compose.ui.node.LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = androidx.compose.ui.node.LayoutModifierNodeCoordinator.this;
            lookaheadDelegateForLayoutModifierNode.m3455setMeasurementConstraintsBRTryo0(constraints);
            layoutModifierNodeCoordinator.lookaheadConstraints = androidx.compose.ui.unit.Constraints.m4412boximpl(constraints);
            androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = layoutModifierNodeCoordinator.getWrappedNonNull().getLookaheadDelegate();
            kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
            lookaheadDelegateForLayoutModifierNode.set_measureResult(layoutModifierNodeCoordinator.getLayoutModifierNode().mo91measure3p2s80s(this, lookaheadDelegate, constraints));
            return lookaheadDelegateForLayoutModifierNode;
        }

        @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
        public int calculateAlignmentLine(androidx.compose.ui.layout.AlignmentLine alignmentLine) {
            int calculateAlignmentAndPlaceChildAsNeeded;
            calculateAlignmentAndPlaceChildAsNeeded = androidx.compose.ui.node.LayoutModifierNodeCoordinatorKt.calculateAlignmentAndPlaceChildAsNeeded(this, alignmentLine);
            getCachedAlignmentLinesMap().put(alignmentLine, java.lang.Integer.valueOf(calculateAlignmentAndPlaceChildAsNeeded));
            return calculateAlignmentAndPlaceChildAsNeeded;
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int height) {
            androidx.compose.ui.node.LayoutModifierNode layoutModifierNode = androidx.compose.ui.node.LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = androidx.compose.ui.node.LayoutModifierNodeCoordinator.this.getWrappedNonNull().getLookaheadDelegate();
            kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
            return layoutModifierNode.minIntrinsicWidth(this, lookaheadDelegate, height);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int height) {
            androidx.compose.ui.node.LayoutModifierNode layoutModifierNode = androidx.compose.ui.node.LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = androidx.compose.ui.node.LayoutModifierNodeCoordinator.this.getWrappedNonNull().getLookaheadDelegate();
            kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
            return layoutModifierNode.maxIntrinsicWidth(this, lookaheadDelegate, height);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int width) {
            androidx.compose.ui.node.LayoutModifierNode layoutModifierNode = androidx.compose.ui.node.LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = androidx.compose.ui.node.LayoutModifierNodeCoordinator.this.getWrappedNonNull().getLookaheadDelegate();
            kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
            return layoutModifierNode.minIntrinsicHeight(this, lookaheadDelegate, width);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int width) {
            androidx.compose.ui.node.LayoutModifierNode layoutModifierNode = androidx.compose.ui.node.LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = androidx.compose.ui.node.LayoutModifierNodeCoordinator.this.getWrappedNonNull().getLookaheadDelegate();
            kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
            return layoutModifierNode.maxIntrinsicHeight(this, lookaheadDelegate, width);
        }
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void ensureLookaheadDelegateCreated() {
        if (getLookaheadDelegate() == null) {
            setLookaheadDelegate(new androidx.compose.ui.node.LayoutModifierNodeCoordinator.LookaheadDelegateForLayoutModifierNode());
        }
    }

    @Override // androidx.compose.ui.layout.Measurable
    /* renamed from: measure-BRTryo0 */
    public androidx.compose.ui.layout.Placeable mo3402measureBRTryo0(long constraints) {
        androidx.compose.ui.layout.MeasureResult mo91measure3p2s80s;
        m3455setMeasurementConstraintsBRTryo0(constraints);
        androidx.compose.ui.node.LayoutModifierNode layoutModifierNode = getLayoutModifierNode();
        if (layoutModifierNode instanceof androidx.compose.ui.layout.IntermediateLayoutModifierNode) {
            androidx.compose.ui.node.NodeCoordinator wrappedNonNull = getWrappedNonNull();
            androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
            kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
            androidx.compose.ui.layout.MeasureResult measureResult$ui_release = lookaheadDelegate.getMeasureResult$ui_release();
            long IntSize = androidx.compose.ui.unit.IntSizeKt.IntSize(measureResult$ui_release.getWidth(), measureResult$ui_release.getHeight());
            androidx.compose.ui.unit.Constraints constraints2 = this.lookaheadConstraints;
            kotlin.jvm.internal.Intrinsics.checkNotNull(constraints2);
            mo91measure3p2s80s = ((androidx.compose.ui.layout.IntermediateLayoutModifierNode) layoutModifierNode).m3404intermediateMeasureTeuZzU(this, wrappedNonNull, constraints, IntSize, constraints2.getValue());
        } else {
            mo91measure3p2s80s = layoutModifierNode.mo91measure3p2s80s(this, getWrappedNonNull(), constraints);
        }
        setMeasureResult$ui_release(mo91measure3p2s80s);
        androidx.compose.ui.node.LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = this;
        onMeasured();
        return layoutModifierNodeCoordinator;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int height) {
        androidx.compose.ui.node.LayoutModifierNode layoutModifierNode = this.layoutModifierNode;
        androidx.compose.ui.layout.IntermediateLayoutModifierNode intermediateLayoutModifierNode = layoutModifierNode instanceof androidx.compose.ui.layout.IntermediateLayoutModifierNode ? (androidx.compose.ui.layout.IntermediateLayoutModifierNode) layoutModifierNode : null;
        if (intermediateLayoutModifierNode != null) {
            return intermediateLayoutModifierNode.minIntermediateIntrinsicWidth$ui_release(this, getWrappedNonNull(), height);
        }
        return layoutModifierNode.minIntrinsicWidth(this, getWrappedNonNull(), height);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int height) {
        androidx.compose.ui.node.LayoutModifierNode layoutModifierNode = this.layoutModifierNode;
        androidx.compose.ui.layout.IntermediateLayoutModifierNode intermediateLayoutModifierNode = layoutModifierNode instanceof androidx.compose.ui.layout.IntermediateLayoutModifierNode ? (androidx.compose.ui.layout.IntermediateLayoutModifierNode) layoutModifierNode : null;
        if (intermediateLayoutModifierNode != null) {
            return intermediateLayoutModifierNode.maxIntermediateIntrinsicWidth$ui_release(this, getWrappedNonNull(), height);
        }
        return layoutModifierNode.maxIntrinsicWidth(this, getWrappedNonNull(), height);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int width) {
        androidx.compose.ui.node.LayoutModifierNode layoutModifierNode = this.layoutModifierNode;
        androidx.compose.ui.layout.IntermediateLayoutModifierNode intermediateLayoutModifierNode = layoutModifierNode instanceof androidx.compose.ui.layout.IntermediateLayoutModifierNode ? (androidx.compose.ui.layout.IntermediateLayoutModifierNode) layoutModifierNode : null;
        if (intermediateLayoutModifierNode != null) {
            return intermediateLayoutModifierNode.minIntermediateIntrinsicHeight$ui_release(this, getWrappedNonNull(), width);
        }
        return layoutModifierNode.minIntrinsicHeight(this, getWrappedNonNull(), width);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int width) {
        androidx.compose.ui.node.LayoutModifierNode layoutModifierNode = this.layoutModifierNode;
        androidx.compose.ui.layout.IntermediateLayoutModifierNode intermediateLayoutModifierNode = layoutModifierNode instanceof androidx.compose.ui.layout.IntermediateLayoutModifierNode ? (androidx.compose.ui.layout.IntermediateLayoutModifierNode) layoutModifierNode : null;
        if (intermediateLayoutModifierNode != null) {
            return intermediateLayoutModifierNode.maxIntermediateIntrinsicHeight$ui_release(this, getWrappedNonNull(), width);
        }
        return layoutModifierNode.maxIntrinsicHeight(this, getWrappedNonNull(), width);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    protected void mo3403placeAtf8xVGno(long position, float zIndex, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> layerBlock) {
        super.mo3403placeAtf8xVGno(position, zIndex, layerBlock);
        if (getIsShallowPlacing()) {
            return;
        }
        onPlaced();
        getMeasureResult$ui_release().placeChildren();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public int calculateAlignmentLine(androidx.compose.ui.layout.AlignmentLine alignmentLine) {
        int calculateAlignmentAndPlaceChildAsNeeded;
        androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            return lookaheadDelegate.getCachedAlignmentLine$ui_release(alignmentLine);
        }
        calculateAlignmentAndPlaceChildAsNeeded = androidx.compose.ui.node.LayoutModifierNodeCoordinatorKt.calculateAlignmentAndPlaceChildAsNeeded(this, alignmentLine);
        return calculateAlignmentAndPlaceChildAsNeeded;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void performDraw(androidx.compose.ui.graphics.Canvas canvas) {
        getWrappedNonNull().draw(canvas);
        if (androidx.compose.ui.node.LayoutNodeKt.requireOwner(getLayoutNode()).getShowLayoutBounds()) {
            drawBorder(canvas, modifierBoundsPaint);
        }
    }

    /* compiled from: LayoutModifierNodeCoordinator.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/LayoutModifierNodeCoordinator$Companion;", "", "()V", "modifierBoundsPaint", "Landroidx/compose/ui/graphics/Paint;", "getModifierBoundsPaint", "()Landroidx/compose/ui/graphics/Paint;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final androidx.compose.ui.graphics.Paint getModifierBoundsPaint() {
            return androidx.compose.ui.node.LayoutModifierNodeCoordinator.modifierBoundsPaint;
        }
    }

    static {
        androidx.compose.ui.graphics.Paint Paint = androidx.compose.ui.graphics.AndroidPaint_androidKt.Paint();
        Paint.mo1992setColor8_81llA(androidx.compose.ui.graphics.Color.INSTANCE.m2140getBlue0d7_KjU());
        Paint.setStrokeWidth(1.0f);
        Paint.mo1996setStylek9PVt8s(androidx.compose.ui.graphics.PaintingStyle.INSTANCE.m2389getStrokeTiuSbCo());
        modifierBoundsPaint = Paint;
    }
}
