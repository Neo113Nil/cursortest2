package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 P2\u00020\u0001:\u0002QPB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J'\u0010!\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 J:\u0010!\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0019\u0010%\u001a\u0015\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\b\u0018\u00010\"¢\u0006\u0002\b$H\u0014¢\u0006\u0004\b\u001f\u0010&J\u000f\u0010'\u001a\u00020\bH\u0002¢\u0006\u0004\b'\u0010\nJ\u0017\u0010*\u001a\u00020\u00112\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J!\u0010/\u001a\u00020\b2\u0006\u0010-\u001a\u00020,2\b\u0010.\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b/\u00100R*\u00102\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00048\u0007@AX\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0014\u0010;\u001a\u0002088WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0011\u0010>\u001a\u00020\u00018G¢\u0006\u0006\u001a\u0004\b<\u0010=R$\u0010?\u001a\u0004\u0018\u00010\u000b8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR.\u0010F\u001a\u0004\u0018\u00010E2\b\u00101\u001a\u0004\u0018\u00010E8\u0017@UX\u0097\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0018\u0010O\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bM\u0010N"}, d2 = {"Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;", "Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/LayoutModifierNode;", "measureNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/LayoutModifierNode;)V", "", "ensureLookaheadDelegateCreated", "()V", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/Placeable;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measure", "", "height", "minIntrinsicWidth", "(I)I", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "Landroidx/compose/ui/unit/IntOffset;", com.daon.sdk.face.license.License.FEATURE_POSITION, "", "zIndex", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "placeAt-f8xVGno", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "placeAt", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "(JFLkotlin/jvm/functions/Function1;)V", "getHighSpeedVideoSizes", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "calculateAlignmentLine", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "graphicsLayer", "performDraw", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "layoutModifierNode", "Landroidx/compose/ui/node/LayoutModifierNode;", "getLayoutModifierNode", "()Landroidx/compose/ui/node/LayoutModifierNode;", "setLayoutModifierNode$ui", "(Landroidx/compose/ui/node/LayoutModifierNode;)V", "Landroidx/compose/ui/Modifier$Node;", "getTail", "()Landroidx/compose/ui/Modifier$Node;", "tail", "getWrappedNonNull", "()Landroidx/compose/ui/node/NodeCoordinator;", "wrappedNonNull", "lookaheadConstraints", "Landroidx/compose/ui/unit/Constraints;", "getLookaheadConstraints-DWUhwKw$ui", "()Landroidx/compose/ui/unit/Constraints;", "setLookaheadConstraints-_Sx5XlM$ui", "(Landroidx/compose/ui/unit/Constraints;)V", "Landroidx/compose/ui/node/LookaheadDelegate;", "lookaheadDelegate", "Landroidx/compose/ui/node/LookaheadDelegate;", "getLookaheadDelegate", "()Landroidx/compose/ui/node/LookaheadDelegate;", "setLookaheadDelegate", "(Landroidx/compose/ui/node/LookaheadDelegate;)V", "Landroidx/compose/ui/layout/ApproachMeasureScopeImpl;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/layout/ApproachMeasureScopeImpl;", "getHighSpeedVideoFpsRangesFor", "Companion", "LookaheadDelegateForLayoutModifierNode"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutModifierNodeCoordinator extends androidx.compose.ui.node.NodeCoordinator {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.node.LayoutModifierNodeCoordinator.Companion INSTANCE = new androidx.compose.ui.node.LayoutModifierNodeCoordinator.Companion(null);
    private static final androidx.compose.ui.graphics.Paint modifierBoundsPaint;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.compose.ui.layout.ApproachMeasureScopeImpl getHighSpeedVideoFpsRangesFor;
    private androidx.compose.ui.node.LayoutModifierNode layoutModifierNode;
    private androidx.compose.ui.unit.Constraints lookaheadConstraints;
    private androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate;

    public LayoutModifierNodeCoordinator(androidx.compose.ui.node.LayoutNode layoutNode, androidx.compose.ui.node.LayoutModifierNode layoutModifierNode) {
        super(layoutNode);
        this.layoutModifierNode = layoutModifierNode;
        androidx.compose.ui.layout.ApproachMeasureScopeImpl approachMeasureScopeImpl = null;
        this.lookaheadDelegate = layoutNode.getLookaheadRoot() != null ? new androidx.compose.ui.node.LayoutModifierNodeCoordinator.LookaheadDelegateForLayoutModifierNode() : null;
        if ((layoutModifierNode.getNode().getKindSet() & androidx.compose.ui.node.NodeKind.m7621constructorimpl(512)) != 0) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(layoutModifierNode, "");
            approachMeasureScopeImpl = new androidx.compose.ui.layout.ApproachMeasureScopeImpl(this, (androidx.compose.ui.layout.ApproachLayoutModifierNode) layoutModifierNode);
        }
        this.getHighSpeedVideoFpsRangesFor = approachMeasureScopeImpl;
    }

    public final androidx.compose.ui.node.LayoutModifierNode getLayoutModifierNode() {
        return this.layoutModifierNode;
    }

    public final void setLayoutModifierNode$ui(androidx.compose.ui.node.LayoutModifierNode layoutModifierNode) {
        if (!kotlin.jvm.internal.Intrinsics.areEqual(layoutModifierNode, this.layoutModifierNode)) {
            androidx.compose.ui.Modifier.Node node = layoutModifierNode.getNode();
            if ((node.getKindSet() & androidx.compose.ui.node.NodeKind.m7621constructorimpl(512)) != 0) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(layoutModifierNode, "");
                androidx.compose.ui.layout.ApproachLayoutModifierNode approachLayoutModifierNode = (androidx.compose.ui.layout.ApproachLayoutModifierNode) layoutModifierNode;
                androidx.compose.ui.layout.ApproachMeasureScopeImpl approachMeasureScopeImpl = this.getHighSpeedVideoFpsRangesFor;
                if (approachMeasureScopeImpl != null) {
                    approachMeasureScopeImpl.setApproachNode(approachLayoutModifierNode);
                } else {
                    approachMeasureScopeImpl = new androidx.compose.ui.layout.ApproachMeasureScopeImpl(this, approachLayoutModifierNode);
                }
                this.getHighSpeedVideoFpsRangesFor = approachMeasureScopeImpl;
            } else {
                this.getHighSpeedVideoFpsRangesFor = null;
            }
        }
        this.layoutModifierNode = layoutModifierNode;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final androidx.compose.ui.Modifier.Node getTail() {
        return this.layoutModifierNode.getNode();
    }

    public final androidx.compose.ui.node.NodeCoordinator getWrappedNonNull() {
        androidx.compose.ui.node.NodeCoordinator wrapped = getWrapped();
        kotlin.jvm.internal.Intrinsics.checkNotNull(wrapped);
        return wrapped;
    }

    /* renamed from: getLookaheadConstraints-DWUhwKw$ui, reason: not valid java name and from getter */
    public final androidx.compose.ui.unit.Constraints getLookaheadConstraints() {
        return this.lookaheadConstraints;
    }

    /* renamed from: setLookaheadConstraints-_Sx5XlM$ui, reason: not valid java name */
    public final void m7548setLookaheadConstraints_Sx5XlM$ui(androidx.compose.ui.unit.Constraints constraints) {
        this.lookaheadConstraints = constraints;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final androidx.compose.ui.node.LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    protected final void setLookaheadDelegate(androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate) {
        this.lookaheadDelegate = lookaheadDelegate;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u000f"}, d2 = {"Landroidx/compose/ui/node/LayoutModifierNodeCoordinator$LookaheadDelegateForLayoutModifierNode;", "Landroidx/compose/ui/node/LookaheadDelegate;", "<init>", "(Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;)V", "Landroidx/compose/ui/unit/Constraints;", "p0", "Landroidx/compose/ui/layout/Placeable;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measure", "Landroidx/compose/ui/layout/AlignmentLine;", "", "calculateAlignmentLine", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "minIntrinsicWidth", "(I)I", "maxIntrinsicWidth", "minIntrinsicHeight", "maxIntrinsicHeight"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    final class LookaheadDelegateForLayoutModifierNode extends androidx.compose.ui.node.LookaheadDelegate {
        public LookaheadDelegateForLayoutModifierNode() {
            super(androidx.compose.ui.node.LayoutModifierNodeCoordinator.this);
        }

        @Override // androidx.compose.ui.layout.Measurable
        /* renamed from: measure-BRTryo0 */
        public final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0(long p0) {
            androidx.compose.ui.node.LayoutModifierNodeCoordinator.LookaheadDelegateForLayoutModifierNode lookaheadDelegateForLayoutModifierNode = this;
            androidx.compose.ui.node.LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = androidx.compose.ui.node.LayoutModifierNodeCoordinator.this;
            lookaheadDelegateForLayoutModifierNode.m7414setMeasurementConstraintsBRTryo0(p0);
            layoutModifierNodeCoordinator.m7548setLookaheadConstraints_Sx5XlM$ui(androidx.compose.ui.unit.Constraints.m8542boximpl(p0));
            androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = layoutModifierNodeCoordinator.getWrappedNonNull().getLookaheadDelegate();
            kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
            lookaheadDelegateForLayoutModifierNode.getHighResolutionOutputSizeshNQ4ISI(layoutModifierNodeCoordinator.getLayoutModifierNode().mo1117measure3p2s80s(this, lookaheadDelegate, p0));
            return lookaheadDelegateForLayoutModifierNode;
        }

        @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
        public final int calculateAlignmentLine(androidx.compose.ui.layout.AlignmentLine p0) {
            int highResolutionOutputSizeshNQ4ISI;
            highResolutionOutputSizeshNQ4ISI = androidx.compose.ui.node.LayoutModifierNodeCoordinatorKt.getHighResolutionOutputSizeshNQ4ISI(this, p0);
            getCachedAlignmentLinesMap().set(p0, highResolutionOutputSizeshNQ4ISI);
            return highResolutionOutputSizeshNQ4ISI;
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public final int minIntrinsicWidth(int p0) {
            androidx.compose.ui.node.LayoutModifierNode layoutModifierNode = androidx.compose.ui.node.LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = androidx.compose.ui.node.LayoutModifierNodeCoordinator.this.getWrappedNonNull().getLookaheadDelegate();
            kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
            return layoutModifierNode.minIntrinsicWidth(this, lookaheadDelegate, p0);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public final int maxIntrinsicWidth(int p0) {
            androidx.compose.ui.node.LayoutModifierNode layoutModifierNode = androidx.compose.ui.node.LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = androidx.compose.ui.node.LayoutModifierNodeCoordinator.this.getWrappedNonNull().getLookaheadDelegate();
            kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
            return layoutModifierNode.maxIntrinsicWidth(this, lookaheadDelegate, p0);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public final int minIntrinsicHeight(int p0) {
            androidx.compose.ui.node.LayoutModifierNode layoutModifierNode = androidx.compose.ui.node.LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = androidx.compose.ui.node.LayoutModifierNodeCoordinator.this.getWrappedNonNull().getLookaheadDelegate();
            kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
            return layoutModifierNode.minIntrinsicHeight(this, lookaheadDelegate, p0);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public final int maxIntrinsicHeight(int p0) {
            androidx.compose.ui.node.LayoutModifierNode layoutModifierNode = androidx.compose.ui.node.LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = androidx.compose.ui.node.LayoutModifierNodeCoordinator.this.getWrappedNonNull().getLookaheadDelegate();
            kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
            return layoutModifierNode.maxIntrinsicHeight(this, lookaheadDelegate, p0);
        }
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final void ensureLookaheadDelegateCreated() {
        if (getLookaheadDelegate() == null) {
            setLookaheadDelegate(new androidx.compose.ui.node.LayoutModifierNodeCoordinator.LookaheadDelegateForLayoutModifierNode());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0088, code lost:
    
        if (r2 == r5.getHeight()) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00be, code lost:
    
        if (r1 == null) goto L37;
     */
    @Override // androidx.compose.ui.layout.Measurable
    /* renamed from: measure-BRTryo0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0(long constraints) {
        final androidx.compose.ui.layout.MeasureResult mo1117measure3p2s80s;
        if (getForceMeasureWithLookaheadConstraints()) {
            androidx.compose.ui.unit.Constraints constraints2 = this.lookaheadConstraints;
            if (constraints2 == null) {
                throw new java.lang.IllegalArgumentException("Lookahead constraints cannot be null in approach pass.".toString());
            }
            constraints = constraints2.getGetHighSpeedVideoFpsRangesFor();
        }
        m7414setMeasurementConstraintsBRTryo0(constraints);
        androidx.compose.ui.layout.ApproachMeasureScopeImpl approachMeasureScopeImpl = this.getHighSpeedVideoFpsRangesFor;
        if (approachMeasureScopeImpl != null) {
            androidx.compose.ui.layout.ApproachLayoutModifierNode approachNode = approachMeasureScopeImpl.getApproachNode();
            boolean z = true;
            approachMeasureScopeImpl.setApproachMeasureRequired$ui(approachNode.mo1120isMeasurementApproachInProgressozmzZPI(approachMeasureScopeImpl.mo7335getLookaheadSizeYbymL2g()) || !androidx.compose.ui.unit.Constraints.m8547equalsimpl(constraints, getLookaheadConstraints()));
            if (!approachMeasureScopeImpl.getApproachMeasureRequired()) {
                getWrappedNonNull().setForceMeasureWithLookaheadConstraints$ui(true);
            }
            mo1117measure3p2s80s = approachNode.mo1119approachMeasure3p2s80s(approachMeasureScopeImpl, getWrappedNonNull(), constraints);
            getWrappedNonNull().setForceMeasureWithLookaheadConstraints$ui(false);
            int width = mo1117measure3p2s80s.getWidth();
            androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
            kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
            if (width == lookaheadDelegate.getWidth()) {
                int height = mo1117measure3p2s80s.getHeight();
                androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate2 = getLookaheadDelegate();
                kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate2);
            }
            z = false;
            if (!approachMeasureScopeImpl.getApproachMeasureRequired()) {
                long mo7361getSizeYbymL2g = getWrappedNonNull().mo7361getSizeYbymL2g();
                androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate3 = getWrappedNonNull().getLookaheadDelegate();
                if (androidx.compose.ui.unit.IntSize.m8769equalsimpl(mo7361getSizeYbymL2g, lookaheadDelegate3 != null ? androidx.compose.ui.unit.IntSize.m8764boximpl(lookaheadDelegate3.m7578getSizeYbymL2g$ui()) : null) && !z) {
                    mo1117measure3p2s80s = new androidx.compose.ui.layout.MeasureResult(this) { // from class: androidx.compose.ui.node.LayoutModifierNodeCoordinator$measure$1$1$1$1
                        private final int height;
                        private final int width;

                        {
                            androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate4 = this.getLookaheadDelegate();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate4);
                            this.width = lookaheadDelegate4.getWidth();
                            androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate5 = this.getLookaheadDelegate();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate5);
                            this.height = lookaheadDelegate5.getHeight();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public final int getWidth() {
                            return this.width;
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public final int getHeight() {
                            return this.height;
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public final void placeChildren() {
                            androidx.compose.ui.layout.MeasureResult.this.placeChildren();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public final kotlin.jvm.functions.Function1<androidx.compose.ui.layout.RulerScope, kotlin.Unit> getRulers() {
                            return androidx.compose.ui.layout.MeasureResult.this.getRulers();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public final java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> getAlignmentLines() {
                            return androidx.compose.ui.layout.MeasureResult.this.getAlignmentLines();
                        }
                    };
                }
            }
        }
        mo1117measure3p2s80s = getLayoutModifierNode().mo1117measure3p2s80s(this, getWrappedNonNull(), constraints);
        setMeasureResult$ui(mo1117measure3p2s80s);
        androidx.compose.ui.node.LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = this;
        onMeasured();
        return layoutModifierNodeCoordinator;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int minIntrinsicWidth(int height) {
        androidx.compose.ui.layout.ApproachMeasureScopeImpl approachMeasureScopeImpl = this.getHighSpeedVideoFpsRangesFor;
        if (approachMeasureScopeImpl != null) {
            return approachMeasureScopeImpl.getApproachNode().minApproachIntrinsicWidth(approachMeasureScopeImpl, getWrappedNonNull(), height);
        }
        return this.layoutModifierNode.minIntrinsicWidth(this, getWrappedNonNull(), height);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int maxIntrinsicWidth(int height) {
        androidx.compose.ui.layout.ApproachMeasureScopeImpl approachMeasureScopeImpl = this.getHighSpeedVideoFpsRangesFor;
        if (approachMeasureScopeImpl != null) {
            return approachMeasureScopeImpl.getApproachNode().maxApproachIntrinsicWidth(approachMeasureScopeImpl, getWrappedNonNull(), height);
        }
        return this.layoutModifierNode.maxIntrinsicWidth(this, getWrappedNonNull(), height);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int minIntrinsicHeight(int width) {
        androidx.compose.ui.layout.ApproachMeasureScopeImpl approachMeasureScopeImpl = this.getHighSpeedVideoFpsRangesFor;
        if (approachMeasureScopeImpl != null) {
            return approachMeasureScopeImpl.getApproachNode().minApproachIntrinsicHeight(approachMeasureScopeImpl, getWrappedNonNull(), width);
        }
        return this.layoutModifierNode.minIntrinsicHeight(this, getWrappedNonNull(), width);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int maxIntrinsicHeight(int width) {
        androidx.compose.ui.layout.ApproachMeasureScopeImpl approachMeasureScopeImpl = this.getHighSpeedVideoFpsRangesFor;
        if (approachMeasureScopeImpl != null) {
            return approachMeasureScopeImpl.getApproachNode().maxApproachIntrinsicHeight(approachMeasureScopeImpl, getWrappedNonNull(), width);
        }
        return this.layoutModifierNode.maxIntrinsicHeight(this, getWrappedNonNull(), width);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public final void mo7412placeAtf8xVGno(long position, float zIndex, androidx.compose.ui.graphics.layer.GraphicsLayer layer) {
        super.mo7412placeAtf8xVGno(position, zIndex, layer);
        getHighSpeedVideoSizes();
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public final void mo7354placeAtf8xVGno(long position, float zIndex, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> layerBlock) {
        super.mo7354placeAtf8xVGno(position, zIndex, layerBlock);
        getHighSpeedVideoSizes();
    }

    private final void getHighSpeedVideoSizes() {
        boolean z;
        if (getIsShallowPlacing()) {
            return;
        }
        onPlaced();
        androidx.compose.ui.node.NodeCoordinator wrappedNonNull = getWrappedNonNull();
        androidx.compose.ui.layout.ApproachMeasureScopeImpl approachMeasureScopeImpl = this.getHighSpeedVideoFpsRangesFor;
        if (approachMeasureScopeImpl != null) {
            androidx.compose.ui.layout.ApproachLayoutModifierNode approachNode = approachMeasureScopeImpl.getApproachNode();
            androidx.compose.ui.layout.Placeable.PlacementScope placementScope = getPlacementScope();
            androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
            kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
            if (!approachNode.isPlacementApproachInProgress(placementScope, lookaheadDelegate.getLookaheadLayoutCoordinates()) && !approachMeasureScopeImpl.getApproachMeasureRequired()) {
                long mo7361getSizeYbymL2g = mo7361getSizeYbymL2g();
                androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate2 = getLookaheadDelegate();
                if (androidx.compose.ui.unit.IntSize.m8769equalsimpl(mo7361getSizeYbymL2g, lookaheadDelegate2 != null ? androidx.compose.ui.unit.IntSize.m8764boximpl(lookaheadDelegate2.m7578getSizeYbymL2g$ui()) : null)) {
                    long mo7361getSizeYbymL2g2 = wrappedNonNull.mo7361getSizeYbymL2g();
                    androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate3 = wrappedNonNull.getLookaheadDelegate();
                    if (androidx.compose.ui.unit.IntSize.m8769equalsimpl(mo7361getSizeYbymL2g2, lookaheadDelegate3 != null ? androidx.compose.ui.unit.IntSize.m8764boximpl(lookaheadDelegate3.m7578getSizeYbymL2g$ui()) : null)) {
                        z = true;
                        wrappedNonNull.setForcePlaceWithLookaheadOffset$ui(z);
                    }
                }
            }
            z = false;
            wrappedNonNull.setForcePlaceWithLookaheadOffset$ui(z);
        }
        wrappedNonNull.setPlacingForAlignment$ui(getIsPlacingForAlignment());
        getMeasureResult$ui().placeChildren();
        wrappedNonNull.setPlacingForAlignment$ui(false);
        wrappedNonNull.setForcePlaceWithLookaheadOffset$ui(false);
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final int calculateAlignmentLine(androidx.compose.ui.layout.AlignmentLine alignmentLine) {
        int highResolutionOutputSizeshNQ4ISI;
        androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            return lookaheadDelegate.getCachedAlignmentLine$ui(alignmentLine);
        }
        highResolutionOutputSizeshNQ4ISI = androidx.compose.ui.node.LayoutModifierNodeCoordinatorKt.getHighResolutionOutputSizeshNQ4ISI(this, alignmentLine);
        return highResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final void performDraw(androidx.compose.ui.graphics.Canvas canvas, androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer) {
        androidx.compose.ui.node.NodeCoordinator wrapped;
        getWrappedNonNull().draw(canvas, graphicsLayer);
        if (!androidx.compose.ui.node.LayoutNodeKt.requireOwner(getLayoutNode()).getShowLayoutBounds() || (wrapped = getWrapped()) == null) {
            return;
        }
        if (androidx.compose.ui.unit.IntSize.m8770equalsimpl0(mo7361getSizeYbymL2g(), wrapped.mo7361getSizeYbymL2g()) && androidx.compose.ui.unit.IntOffset.m8728equalsimpl0(wrapped.getPosition(), androidx.compose.ui.unit.IntOffset.INSTANCE.m8740getZeronOccac())) {
            return;
        }
        drawBorder(canvas, modifierBoundsPaint);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/node/LayoutModifierNodeCoordinator$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Paint;", "modifierBoundsPaint", "Landroidx/compose/ui/graphics/Paint;", "getModifierBoundsPaint", "()Landroidx/compose/ui/graphics/Paint;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.ui.graphics.Paint getModifierBoundsPaint() {
            return androidx.compose.ui.node.LayoutModifierNodeCoordinator.modifierBoundsPaint;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        androidx.compose.ui.graphics.Paint Paint = androidx.compose.ui.graphics.AndroidPaint_androidKt.Paint();
        Paint.mo5873setColor8_81llA(androidx.compose.ui.graphics.Color.INSTANCE.m6023getBlue0d7_KjU());
        Paint.setStrokeWidth(1.0f);
        Paint.mo5877setStylek9PVt8s(androidx.compose.ui.graphics.PaintingStyle.INSTANCE.m6260getStrokeTiuSbCo());
        modifierBoundsPaint = Paint;
    }
}
