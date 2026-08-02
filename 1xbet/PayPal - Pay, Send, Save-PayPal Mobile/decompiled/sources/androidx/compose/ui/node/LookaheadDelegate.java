package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\b \u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0010¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0019\u0010\u0016\u001a\u0015\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f\u0018\u00010\u0013¢\u0006\u0002\b\u0015H\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001f\u0010\u000eJ&\u0010(\u001a\u00020%2\u0006\u0010!\u001a\u00020 2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0086\b¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\t2\u0006\u0010)\u001a\u00020\tH\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\t2\u0006\u0010)\u001a\u00020\tH\u0016¢\u0006\u0004\b,\u0010+J\u0017\u0010.\u001a\u00020\t2\u0006\u0010-\u001a\u00020\tH\u0016¢\u0006\u0004\b.\u0010+J\u0017\u0010/\u001a\u00020\t2\u0006\u0010-\u001a\u00020\tH\u0016¢\u0006\u0004\b/\u0010+J\u001f\u00105\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b3\u00104R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b7\u00108R\u0016\u0010;\u001a\u0004\u0018\u00010\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010>\u001a\u0002018WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\"\u0010\u0010\u001a\u00020\u000f8\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010\u001cR$\u0010F\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010C8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010I\u001a\u00020#8QX\u0090\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010J\u001a\u0002018WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010=R\u0014\u0010N\u001a\u00020K8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0014\u0010Q\u001a\u00020\u00118WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0014\u0010S\u001a\u00020\u00118WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010PR\u0016\u0010U\u001a\u0004\u0018\u00010\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010:R\u0014\u0010Y\u001a\u00020V8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0014\u0010]\u001a\u00020Z8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0014\u0010`\u001a\u00020^8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b_\u0010AR\u0014\u0010!\u001a\u00020 8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\ba\u0010AR\u001a\u0010c\u001a\u00020b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0014\u0010j\u001a\u00020g8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR(\u0010n\u001a\u0004\u0018\u00010#2\b\u0010\u001a\u001a\u0004\u0018\u00010#8\u0002@CX\u0083\u000e¢\u0006\f\n\u0004\b\u001b\u0010k\"\u0004\bl\u0010mR \u0010p\u001a\b\u0012\u0004\u0012\u00020\u00070o8\u0005X\u0085\u0004¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR\u0016\u0010w\u001a\u0004\u0018\u00010t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bu\u0010v"}, d2 = {"Landroidx/compose/ui/node/LookaheadDelegate;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "<init>", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "getCachedAlignmentLine$ui", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "", "replace$ui", "()V", "Landroidx/compose/ui/unit/IntOffset;", com.daon.sdk.face.license.License.FEATURE_POSITION, "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeAt", "p0", "getHighSpeedVideoSizes", "(J)V", "placeSelfApparentToRealOffset--gyyYBs$ui", "placeSelfApparentToRealOffset", "placeChildren", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/MeasureResult;", "block", "Landroidx/compose/ui/layout/Placeable;", "performingMeasure-K40F9xA", "(JLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/layout/Placeable;", "performingMeasure", "height", "minIntrinsicWidth", "(I)I", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "ancestor", "", "excludingAgnosticOffset", "positionIn-iSbpLlY$ui", "(Landroidx/compose/ui/node/LookaheadDelegate;Z)J", "positionIn", "Landroidx/compose/ui/node/NodeCoordinator;", "getCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "getChild", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "child", "getHasMeasureResult", "()Z", "hasMeasureResult", "J", "getPosition-nOcc-ac", "()J", "setPosition--gyyYBs", "", "getHighSpeedVideoFpsRanges", "Ljava/util/Map;", "getHighSpeedVideoFpsRangesFor", "getMeasureResult$ui", "()Landroidx/compose/ui/layout/MeasureResult;", "measureResult", "isLookingAhead", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getDensity", "()F", "density", "getFontScale", "fontScale", "getParent", "parent", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g$ui", io.ktor.http.ContentDisposition.Parameters.Size, "getConstraints-msEJaDk$ui", "Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;", "lookaheadLayoutCoordinates", "Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;", "getLookaheadLayoutCoordinates", "()Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "alignmentLinesOwner", "Landroidx/compose/ui/layout/MeasureResult;", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/ui/layout/MeasureResult;)V", "Camera2StreamConfigurationMap", "Landroidx/collection/MutableObjectIntMap;", "cachedAlignmentLinesMap", "Landroidx/collection/MutableObjectIntMap;", "getCachedAlignmentLinesMap", "()Landroidx/collection/MutableObjectIntMap;", "", "getParentData", "()Ljava/lang/Object;", "parentData"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class LookaheadDelegate extends androidx.compose.ui.node.LookaheadCapablePlaceable implements androidx.compose.ui.layout.Measurable {
    public static final int $stable = 0;
    private final androidx.compose.ui.node.NodeCoordinator coordinator;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.compose.ui.layout.MeasureResult Camera2StreamConfigurationMap;
    private long position = androidx.compose.ui.unit.IntOffset.INSTANCE.m8740getZeronOccac();
    private final androidx.compose.ui.layout.LookaheadLayoutCoordinates lookaheadLayoutCoordinates = new androidx.compose.ui.layout.LookaheadLayoutCoordinates(this);
    private final androidx.collection.MutableObjectIntMap<androidx.compose.ui.layout.AlignmentLine> cachedAlignmentLinesMap = androidx.collection.ObjectIntMapKt.mutableObjectIntMapOf();

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return true;
    }

    public LookaheadDelegate(androidx.compose.ui.node.NodeCoordinator nodeCoordinator) {
        this.coordinator = nodeCoordinator;
    }

    public final androidx.compose.ui.node.NodeCoordinator getCoordinator() {
        return this.coordinator;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public androidx.compose.ui.node.LookaheadCapablePlaceable getChild() {
        androidx.compose.ui.node.NodeCoordinator wrapped = this.coordinator.getWrapped();
        return wrapped != null ? wrapped.getLookaheadDelegate() : null;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public boolean getHasMeasureResult() {
        return this.Camera2StreamConfigurationMap != null;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    /* renamed from: getPosition-nOcc-ac, reason: from getter */
    public long getPosition() {
        return this.position;
    }

    /* renamed from: setPosition--gyyYBs, reason: not valid java name */
    public void m7582setPositiongyyYBs(long j) {
        this.position = j;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public androidx.compose.ui.layout.MeasureResult getMeasureResult$ui() {
        androidx.compose.ui.layout.MeasureResult measureResult = this.Camera2StreamConfigurationMap;
        if (measureResult != null) {
            return measureResult;
        }
        androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("LookaheadDelegate has not been measured yet when measureResult is requested.");
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public androidx.compose.ui.unit.LayoutDirection getLayoutDirection() {
        return this.coordinator.getLayoutDirection();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.coordinator.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.coordinator.getFontScale();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public androidx.compose.ui.node.LookaheadCapablePlaceable getParent() {
        androidx.compose.ui.node.NodeCoordinator wrappedBy = this.coordinator.getWrappedBy();
        return wrappedBy != null ? wrappedBy.getLookaheadDelegate() : null;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.node.MeasureScopeWithLayoutNode
    public androidx.compose.ui.node.LayoutNode getLayoutNode() {
        return this.coordinator.getLayoutNode();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public androidx.compose.ui.layout.LayoutCoordinates getCoordinates() {
        return this.lookaheadLayoutCoordinates;
    }

    /* renamed from: getSize-YbymL2g$ui, reason: not valid java name */
    public final long m7578getSizeYbymL2g$ui() {
        return androidx.compose.ui.unit.IntSize.m8767constructorimpl((getHeight() & 4294967295L) | (getWidth() << 32));
    }

    /* renamed from: getConstraints-msEJaDk$ui, reason: not valid java name */
    public final long m7577getConstraintsmsEJaDk$ui() {
        return getMeasurementConstraints();
    }

    public final androidx.compose.ui.layout.LookaheadLayoutCoordinates getLookaheadLayoutCoordinates() {
        return this.lookaheadLayoutCoordinates;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public androidx.compose.ui.node.AlignmentLinesOwner getAlignmentLinesOwner() {
        androidx.compose.ui.node.AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui = this.coordinator.getLayoutNode().getLayoutDelegate().getLookaheadAlignmentLinesOwner$ui();
        kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadAlignmentLinesOwner$ui);
        return lookaheadAlignmentLinesOwner$ui;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.layout.MeasureResult measureResult) {
        java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> map;
        if (measureResult != null) {
            m7413setMeasuredSizeozmzZPI(androidx.compose.ui.unit.IntSize.m8767constructorimpl((measureResult.getHeight() & 4294967295L) | (measureResult.getWidth() << 32)));
        } else {
            m7413setMeasuredSizeozmzZPI(androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g());
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, measureResult) && measureResult != null && ((((map = this.getHighSpeedVideoFpsRangesFor) != null && !map.isEmpty()) || !measureResult.getAlignmentLines().isEmpty()) && !kotlin.jvm.internal.Intrinsics.areEqual(measureResult.getAlignmentLines(), this.getHighSpeedVideoFpsRangesFor))) {
            getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
            java.util.LinkedHashMap linkedHashMap = this.getHighSpeedVideoFpsRangesFor;
            if (linkedHashMap == null) {
                linkedHashMap = new java.util.LinkedHashMap();
                this.getHighSpeedVideoFpsRangesFor = linkedHashMap;
            }
            linkedHashMap.clear();
            linkedHashMap.putAll(measureResult.getAlignmentLines());
        }
        this.Camera2StreamConfigurationMap = measureResult;
    }

    protected final androidx.collection.MutableObjectIntMap<androidx.compose.ui.layout.AlignmentLine> getCachedAlignmentLinesMap() {
        return this.cachedAlignmentLinesMap;
    }

    public final int getCachedAlignmentLine$ui(androidx.compose.ui.layout.AlignmentLine alignmentLine) {
        return this.cachedAlignmentLinesMap.getOrDefault(alignmentLine, Integer.MIN_VALUE);
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public void replace$ui() {
        mo7354placeAtf8xVGno(getPosition(), 0.0f, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit>) null);
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public final void mo7354placeAtf8xVGno(long position, float zIndex, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> layerBlock) {
        getHighSpeedVideoSizes(position);
        if (getIsShallowPlacing()) {
            return;
        }
        placeChildren();
    }

    private final void getHighSpeedVideoSizes(long p0) {
        if (!androidx.compose.ui.unit.IntOffset.m8728equalsimpl0(getPosition(), p0)) {
            m7582setPositiongyyYBs(p0);
            androidx.compose.ui.node.LookaheadPassDelegate lookaheadPassDelegate = getLayoutNode().getLayoutDelegate().getLookaheadPassDelegate();
            if (lookaheadPassDelegate != null) {
                lookaheadPassDelegate.notifyChildrenUsingLookaheadCoordinatesWhilePlacing();
            }
            invalidateAlignmentLinesFromPositionChange(this.coordinator);
        }
        if (getIsPlacingForAlignment()) {
            return;
        }
        captureRulersIfNeeded$ui(getMeasureResult$ui());
    }

    /* renamed from: placeSelfApparentToRealOffset--gyyYBs$ui, reason: not valid java name */
    public final void m7580placeSelfApparentToRealOffsetgyyYBs$ui(long position) {
        getHighSpeedVideoSizes(androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(position, getApparentToRealOffset()));
    }

    protected void placeChildren() {
        getMeasureResult$ui().placeChildren();
    }

    /* renamed from: performingMeasure-K40F9xA, reason: not valid java name */
    public final androidx.compose.ui.layout.Placeable m7579performingMeasureK40F9xA(long constraints, kotlin.jvm.functions.Function0<? extends androidx.compose.ui.layout.MeasureResult> block) {
        m7414setMeasurementConstraintsBRTryo0(constraints);
        getHighResolutionOutputSizeshNQ4ISI(block.invoke());
        return this;
    }

    @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    public java.lang.Object getParentData() {
        return this.coordinator.getParentData();
    }

    public int minIntrinsicWidth(int height) {
        androidx.compose.ui.node.NodeCoordinator wrapped = this.coordinator.getWrapped();
        kotlin.jvm.internal.Intrinsics.checkNotNull(wrapped);
        androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = wrapped.getLookaheadDelegate();
        kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.minIntrinsicWidth(height);
    }

    public int maxIntrinsicWidth(int height) {
        androidx.compose.ui.node.NodeCoordinator wrapped = this.coordinator.getWrapped();
        kotlin.jvm.internal.Intrinsics.checkNotNull(wrapped);
        androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = wrapped.getLookaheadDelegate();
        kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.maxIntrinsicWidth(height);
    }

    public int minIntrinsicHeight(int width) {
        androidx.compose.ui.node.NodeCoordinator wrapped = this.coordinator.getWrapped();
        kotlin.jvm.internal.Intrinsics.checkNotNull(wrapped);
        androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = wrapped.getLookaheadDelegate();
        kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.minIntrinsicHeight(width);
    }

    public int maxIntrinsicHeight(int width) {
        androidx.compose.ui.node.NodeCoordinator wrapped = this.coordinator.getWrapped();
        kotlin.jvm.internal.Intrinsics.checkNotNull(wrapped);
        androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = wrapped.getLookaheadDelegate();
        kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.maxIntrinsicHeight(width);
    }

    /* renamed from: positionIn-iSbpLlY$ui, reason: not valid java name */
    public final long m7581positionIniSbpLlY$ui(androidx.compose.ui.node.LookaheadDelegate ancestor, boolean excludingAgnosticOffset) {
        long m8740getZeronOccac = androidx.compose.ui.unit.IntOffset.INSTANCE.m8740getZeronOccac();
        androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = this;
        while (!kotlin.jvm.internal.Intrinsics.areEqual(lookaheadDelegate, ancestor)) {
            if (!lookaheadDelegate.getIsPlacedUnderMotionFrameOfReference() || !excludingAgnosticOffset) {
                m8740getZeronOccac = androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(m8740getZeronOccac, lookaheadDelegate.getPosition());
            }
            androidx.compose.ui.node.NodeCoordinator wrappedBy = lookaheadDelegate.coordinator.getWrappedBy();
            kotlin.jvm.internal.Intrinsics.checkNotNull(wrappedBy);
            lookaheadDelegate = wrappedBy.getLookaheadDelegate();
            kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
        }
        return m8740getZeronOccac;
    }
}
