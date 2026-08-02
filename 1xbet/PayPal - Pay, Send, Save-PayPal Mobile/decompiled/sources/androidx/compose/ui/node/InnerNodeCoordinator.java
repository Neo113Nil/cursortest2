package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 I2\u00020\u0001:\u0002JIB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0012J'\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ:\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0019\u0010#\u001a\u0015\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0006\u0018\u00010 ¢\u0006\u0002\b\"H\u0014¢\u0006\u0004\b\u001d\u0010$J\u000f\u0010%\u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010\bJ\u0017\u0010(\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J!\u0010-\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b-\u0010.J7\u0010;\u001a\u00020\u00062\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:R\u001a\u0010=\u001a\u00020<8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R.\u0010C\u001a\u0004\u0018\u00010A2\b\u0010B\u001a\u0004\u0018\u00010A8\u0017@UX\u0097\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H"}, d2 = {"Landroidx/compose/ui/node/InnerNodeCoordinator;", "Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "", "ensureLookaheadDelegateCreated", "()V", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/Placeable;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measure", "", "height", "minIntrinsicWidth", "(I)I", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "Landroidx/compose/ui/unit/IntOffset;", com.daon.sdk.face.license.License.FEATURE_POSITION, "", "zIndex", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "placeAt-f8xVGno", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "placeAt", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "(JFLkotlin/jvm/functions/Function1;)V", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "calculateAlignmentLine", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "graphicsLayer", "performDraw", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "hitTestSource", "Landroidx/compose/ui/geometry/Offset;", "pointerPosition", "Landroidx/compose/ui/node/HitTestResult;", "hitTestResult", "Landroidx/compose/ui/input/pointer/PointerType;", "pointerType", "", "isInLayer", "hitTestChild-qzLsGqo", "(Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZ)V", "hitTestChild", "Landroidx/compose/ui/node/TailModifierNode;", "tail", "Landroidx/compose/ui/node/TailModifierNode;", "getTail", "()Landroidx/compose/ui/node/TailModifierNode;", "Landroidx/compose/ui/node/LookaheadDelegate;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "lookaheadDelegate", "Landroidx/compose/ui/node/LookaheadDelegate;", "getLookaheadDelegate", "()Landroidx/compose/ui/node/LookaheadDelegate;", "setLookaheadDelegate", "(Landroidx/compose/ui/node/LookaheadDelegate;)V", "Companion", "LookaheadDelegateImpl"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InnerNodeCoordinator extends androidx.compose.ui.node.NodeCoordinator {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.node.InnerNodeCoordinator.Companion INSTANCE = new androidx.compose.ui.node.InnerNodeCoordinator.Companion(null);
    private static final androidx.compose.ui.graphics.Paint innerBoundsPaint;
    private androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate;
    private final androidx.compose.ui.node.TailModifierNode tail;

    public InnerNodeCoordinator(androidx.compose.ui.node.LayoutNode layoutNode) {
        super(layoutNode);
        this.tail = new androidx.compose.ui.node.TailModifierNode();
        getTail().updateCoordinator$ui(this);
        this.lookaheadDelegate = layoutNode.getLookaheadRoot() != null ? new androidx.compose.ui.node.InnerNodeCoordinator.LookaheadDelegateImpl() : null;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final androidx.compose.ui.node.TailModifierNode getTail() {
        return this.tail;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final androidx.compose.ui.node.LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    protected final void setLookaheadDelegate(androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate) {
        this.lookaheadDelegate = lookaheadDelegate;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0012"}, d2 = {"Landroidx/compose/ui/node/InnerNodeCoordinator$LookaheadDelegateImpl;", "Landroidx/compose/ui/node/LookaheadDelegate;", "<init>", "(Landroidx/compose/ui/node/InnerNodeCoordinator;)V", "Landroidx/compose/ui/unit/Constraints;", "p0", "Landroidx/compose/ui/layout/Placeable;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measure", "Landroidx/compose/ui/layout/AlignmentLine;", "", "calculateAlignmentLine", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "", "placeChildren", "()V", "minIntrinsicWidth", "(I)I", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class LookaheadDelegateImpl extends androidx.compose.ui.node.LookaheadDelegate {
        public LookaheadDelegateImpl() {
            super(androidx.compose.ui.node.InnerNodeCoordinator.this);
        }

        @Override // androidx.compose.ui.layout.Measurable
        /* renamed from: measure-BRTryo0 */
        public final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0(long p0) {
            androidx.compose.ui.node.InnerNodeCoordinator.LookaheadDelegateImpl lookaheadDelegateImpl = this;
            lookaheadDelegateImpl.m7414setMeasurementConstraintsBRTryo0(p0);
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = getLayoutNode().get_children$ui();
            androidx.compose.ui.node.LayoutNode[] layoutNodeArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i = 0; i < size; i++) {
                androidx.compose.ui.node.LookaheadPassDelegate lookaheadPassDelegate$ui = layoutNodeArr[i].getLookaheadPassDelegate$ui();
                kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadPassDelegate$ui);
                lookaheadPassDelegate$ui.setMeasuredByParent$ui(androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed);
            }
            lookaheadDelegateImpl.getHighResolutionOutputSizeshNQ4ISI(getLayoutNode().getMeasurePolicy().mo1095measure3p2s80s(this, getLayoutNode().getChildLookaheadMeasurables$ui(), p0));
            return lookaheadDelegateImpl;
        }

        @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
        public final int calculateAlignmentLine(androidx.compose.ui.layout.AlignmentLine p0) {
            java.lang.Integer num = getAlignmentLinesOwner().calculateAlignmentLines().get(p0);
            int intValue = num != null ? num.intValue() : Integer.MIN_VALUE;
            getCachedAlignmentLinesMap().set(p0, intValue);
            return intValue;
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate
        protected final void placeChildren() {
            androidx.compose.ui.node.LookaheadPassDelegate lookaheadPassDelegate$ui = getLayoutNode().getLookaheadPassDelegate$ui();
            kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadPassDelegate$ui);
            lookaheadPassDelegate$ui.onNodePlaced$ui();
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public final int minIntrinsicWidth(int p0) {
            return getLayoutNode().minLookaheadIntrinsicWidth(p0);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public final int minIntrinsicHeight(int p0) {
            return getLayoutNode().minLookaheadIntrinsicHeight(p0);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public final int maxIntrinsicWidth(int p0) {
            return getLayoutNode().maxLookaheadIntrinsicWidth(p0);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public final int maxIntrinsicHeight(int p0) {
            return getLayoutNode().maxLookaheadIntrinsicHeight(p0);
        }
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final void ensureLookaheadDelegateCreated() {
        if (getLookaheadDelegate() == null) {
            setLookaheadDelegate(new androidx.compose.ui.node.InnerNodeCoordinator.LookaheadDelegateImpl());
        }
    }

    @Override // androidx.compose.ui.layout.Measurable
    /* renamed from: measure-BRTryo0 */
    public final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0(long constraints) {
        if (getForceMeasureWithLookaheadConstraints()) {
            androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
            kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
            constraints = lookaheadDelegate.m7577getConstraintsmsEJaDk$ui();
        }
        m7414setMeasurementConstraintsBRTryo0(constraints);
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = getLayoutNode().get_children$ui();
        androidx.compose.ui.node.LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            layoutNodeArr[i].getMeasurePassDelegate$ui().setMeasuredByParent$ui(androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed);
        }
        setMeasureResult$ui(getLayoutNode().getMeasurePolicy().mo1095measure3p2s80s(this, getLayoutNode().getChildMeasurables$ui(), constraints));
        onMeasured();
        return this;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int minIntrinsicWidth(int height) {
        return getLayoutNode().minIntrinsicWidth(height);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int minIntrinsicHeight(int width) {
        return getLayoutNode().minIntrinsicHeight(width);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int maxIntrinsicWidth(int height) {
        return getLayoutNode().maxIntrinsicWidth(height);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int maxIntrinsicHeight(int width) {
        return getLayoutNode().maxIntrinsicHeight(width);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public final void mo7412placeAtf8xVGno(long position, float zIndex, androidx.compose.ui.graphics.layer.GraphicsLayer layer) {
        super.mo7412placeAtf8xVGno(position, zIndex, layer);
        getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public final void mo7354placeAtf8xVGno(long position, float zIndex, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> layerBlock) {
        super.mo7354placeAtf8xVGno(position, zIndex, layerBlock);
        getHighResolutionOutputSizeshNQ4ISI();
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        if (getIsShallowPlacing()) {
            return;
        }
        getLayoutNode().getMeasurePassDelegate$ui().onNodePlaced$ui();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final int calculateAlignmentLine(androidx.compose.ui.layout.AlignmentLine alignmentLine) {
        androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            return lookaheadDelegate.calculateAlignmentLine(alignmentLine);
        }
        java.lang.Integer num = getAlignmentLinesOwner().calculateAlignmentLines().get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final void performDraw(androidx.compose.ui.graphics.Canvas canvas, androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer) {
        androidx.compose.ui.node.Owner requireOwner = androidx.compose.ui.node.LayoutNodeKt.requireOwner(getLayoutNode());
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> zSortedChildren = getLayoutNode().getZSortedChildren();
        androidx.compose.ui.node.LayoutNode[] layoutNodeArr = zSortedChildren.content;
        int size = zSortedChildren.getSize();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.node.LayoutNode layoutNode = layoutNodeArr[i];
            if (layoutNode.isPlaced()) {
                layoutNode.draw$ui(canvas, graphicsLayer);
            }
        }
        if (requireOwner.getShowLayoutBounds()) {
            drawBorder(canvas, innerBoundsPaint);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x003d, code lost:
    
        if ((java.lang.Float.floatToRawIntBits(m7604distanceInMinimumTouchTargettz77jQw(r19, m7607getMinimumTouchTargetSizeNHjbRc())) & Integer.MAX_VALUE) < 2139095040) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0048  */
    @Override // androidx.compose.ui.node.NodeCoordinator
    /* renamed from: hitTestChild-qzLsGqo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo7545hitTestChildqzLsGqo(androidx.compose.ui.node.NodeCoordinator.HitTestSource hitTestSource, long pointerPosition, androidx.compose.ui.node.HitTestResult hitTestResult, int pointerType, boolean isInLayer) {
        boolean z;
        boolean z2 = false;
        if (hitTestSource.shouldHitTestChildren(getLayoutNode())) {
            if (m7616withinLayerBoundsk4lQ0M(pointerPosition)) {
                z2 = isInLayer;
            } else if (androidx.compose.ui.input.pointer.PointerType.m7299equalsimpl0(pointerType, androidx.compose.ui.input.pointer.PointerType.INSTANCE.m7306getTouchT8wyACA())) {
            }
            z = z2;
            z2 = true;
            if (z2) {
                return;
            }
            int i = hitTestResult.getHighSpeedVideoFpsRangesFor;
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> zSortedChildren = getLayoutNode().getZSortedChildren();
            androidx.compose.ui.node.LayoutNode[] layoutNodeArr = zSortedChildren.content;
            for (int size = zSortedChildren.getSize() - 1; size >= 0; size--) {
                androidx.compose.ui.node.LayoutNode layoutNode = layoutNodeArr[size];
                if (layoutNode.isPlaced()) {
                    hitTestSource.mo7617childHitTestqzLsGqo(layoutNode, pointerPosition, hitTestResult, pointerType, z);
                    if (!hitTestResult.hasHit()) {
                        continue;
                    } else if (!layoutNode.getOuterCoordinator$ui().shouldSharePointerInputWithSiblings()) {
                        break;
                    } else {
                        hitTestResult.acceptHits();
                    }
                }
            }
            hitTestResult.getHighSpeedVideoFpsRangesFor = i;
            return;
        }
        z = isInLayer;
        if (z2) {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/node/InnerNodeCoordinator$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Paint;", "innerBoundsPaint", "Landroidx/compose/ui/graphics/Paint;", "getInnerBoundsPaint", "()Landroidx/compose/ui/graphics/Paint;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.ui.graphics.Paint getInnerBoundsPaint() {
            return androidx.compose.ui.node.InnerNodeCoordinator.innerBoundsPaint;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        androidx.compose.ui.graphics.Paint Paint = androidx.compose.ui.graphics.AndroidPaint_androidKt.Paint();
        Paint.mo5873setColor8_81llA(androidx.compose.ui.graphics.Color.INSTANCE.m6030getRed0d7_KjU());
        Paint.setStrokeWidth(1.0f);
        Paint.mo5877setStylek9PVt8s(androidx.compose.ui.graphics.PaintingStyle.INSTANCE.m6260getStrokeTiuSbCo());
        innerBoundsPaint = Paint;
    }
}
