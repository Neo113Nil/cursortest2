package androidx.compose.ui.node;

/* compiled from: LookaheadDelegate.kt */
@kotlin.Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b \u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0015\u0010F\u001a\u00020\u00122\u0006\u0010G\u001a\u00020\u0011H\u0000¢\u0006\u0002\bHJ\u0010\u0010I\u001a\u00020\u00122\u0006\u0010J\u001a\u00020\u0012H\u0016J\u0010\u0010K\u001a\u00020\u00122\u0006\u0010L\u001a\u00020\u0012H\u0016J\u0010\u0010M\u001a\u00020\u00122\u0006\u0010J\u001a\u00020\u0012H\u0016J\u0010\u0010N\u001a\u00020\u00122\u0006\u0010L\u001a\u00020\u0012H\u0016J)\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020R2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00070TH\u0086\bø\u0001\u0000¢\u0006\u0004\bU\u0010VJ=\u0010W\u001a\u00020X2\u0006\u0010?\u001a\u00020@2\u0006\u0010Y\u001a\u00020\u001f2\u0019\u0010Z\u001a\u0015\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020X\u0018\u00010[¢\u0006\u0002\b]H\u0004ø\u0001\u0000¢\u0006\u0004\b^\u0010_J\b\u0010`\u001a\u00020XH\u0014J\u001a\u0010a\u001a\u00020X2\u0006\u0010?\u001a\u00020@H\u0002ø\u0001\u0000¢\u0006\u0004\bb\u0010DJ\u001a\u0010c\u001a\u00020X2\u0006\u0010?\u001a\u00020@H\u0000ø\u0001\u0000¢\u0006\u0004\bd\u0010DJ\u001d\u0010e\u001a\u00020@2\u0006\u0010f\u001a\u00020\u0000H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bg\u0010hJ\r\u0010i\u001a\u00020XH\u0010¢\u0006\u0002\bjR\"\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0014\u0010$\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010'R\u0014\u0010)\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u00101\u001a\u000202¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0014\u00105\u001a\u00020\u00078PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u001c\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u00109\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u0017R\u0016\u0010;\u001a\u0004\u0018\u00010<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\"\u0010?\u001a\u00020@X\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010E\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006k"}, d2 = {"Landroidx/compose/ui/node/LookaheadDelegate;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "coordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "result", "Landroidx/compose/ui/layout/MeasureResult;", "_measureResult", "set_measureResult", "(Landroidx/compose/ui/layout/MeasureResult;)V", "alignmentLinesOwner", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "cachedAlignmentLinesMap", "", "Landroidx/compose/ui/layout/AlignmentLine;", "", "getCachedAlignmentLinesMap", "()Ljava/util/Map;", "child", "getChild", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", com.ironsource.Y3.f, "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "density", "", "getDensity", "()F", "fontScale", "getFontScale", "hasMeasureResult", "", "getHasMeasureResult", "()Z", "isLookingAhead", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "lookaheadLayoutCoordinates", "Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;", "getLookaheadLayoutCoordinates", "()Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;", "measureResult", "getMeasureResult$ui_release", "()Landroidx/compose/ui/layout/MeasureResult;", "oldAlignmentLines", "parent", "getParent", "parentData", "", "getParentData", "()Ljava/lang/Object;", "position", "Landroidx/compose/ui/unit/IntOffset;", "getPosition-nOcc-ac", "()J", "setPosition--gyyYBs", "(J)V", "J", "getCachedAlignmentLine", "alignmentLine", "getCachedAlignmentLine$ui_release", "maxIntrinsicHeight", "width", "maxIntrinsicWidth", "height", "minIntrinsicHeight", "minIntrinsicWidth", "performingMeasure", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "block", "Lkotlin/Function0;", "performingMeasure-K40F9xA", "(JLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/layout/Placeable;", "placeAt", "", "zIndex", "layerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeChildren", "placeSelf", "placeSelf--gyyYBs", "placeSelfApparentToRealOffset", "placeSelfApparentToRealOffset--gyyYBs$ui_release", "positionIn", "ancestor", "positionIn-Bjo55l4$ui_release", "(Landroidx/compose/ui/node/LookaheadDelegate;)J", "replace", "replace$ui_release", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class LookaheadDelegate extends androidx.compose.ui.node.LookaheadCapablePlaceable implements androidx.compose.ui.layout.Measurable {
    public static final int $stable = 0;
    private androidx.compose.ui.layout.MeasureResult _measureResult;
    private final androidx.compose.ui.node.NodeCoordinator coordinator;
    private java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> oldAlignmentLines;
    private long position = androidx.compose.ui.unit.IntOffset.INSTANCE.m4620getZeronOccac();
    private final androidx.compose.ui.layout.LookaheadLayoutCoordinates lookaheadLayoutCoordinates = new androidx.compose.ui.layout.LookaheadLayoutCoordinates(this);
    private final java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> cachedAlignmentLinesMap = new java.util.LinkedHashMap();

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return true;
    }

    public final androidx.compose.ui.node.NodeCoordinator getCoordinator() {
        return this.coordinator;
    }

    public LookaheadDelegate(androidx.compose.ui.node.NodeCoordinator nodeCoordinator) {
        this.coordinator = nodeCoordinator;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public androidx.compose.ui.node.LookaheadCapablePlaceable getChild() {
        androidx.compose.ui.node.NodeCoordinator wrapped = this.coordinator.getWrapped();
        return wrapped != null ? wrapped.getLookaheadDelegate() : null;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public boolean getHasMeasureResult() {
        return this._measureResult != null;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    /* renamed from: getPosition-nOcc-ac, reason: from getter */
    public long getPosition() {
        return this.position;
    }

    /* renamed from: setPosition--gyyYBs, reason: not valid java name */
    public void m3566setPositiongyyYBs(long j) {
        this.position = j;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public androidx.compose.ui.layout.MeasureResult getMeasureResult$ui_release() {
        androidx.compose.ui.layout.MeasureResult measureResult = this._measureResult;
        if (measureResult != null) {
            return measureResult;
        }
        throw new java.lang.IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.".toString());
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

    public final androidx.compose.ui.layout.LookaheadLayoutCoordinates getLookaheadLayoutCoordinates() {
        return this.lookaheadLayoutCoordinates;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public androidx.compose.ui.node.AlignmentLinesOwner getAlignmentLinesOwner() {
        androidx.compose.ui.node.AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = this.coordinator.getLayoutNode().getLayoutDelegate().getLookaheadAlignmentLinesOwner$ui_release();
        kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadAlignmentLinesOwner$ui_release);
        return lookaheadAlignmentLinesOwner$ui_release;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void set_measureResult(androidx.compose.ui.layout.MeasureResult measureResult) {
        kotlin.Unit unit;
        java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> map;
        if (measureResult != null) {
            m3454setMeasuredSizeozmzZPI(androidx.compose.ui.unit.IntSizeKt.IntSize(measureResult.getWidth(), measureResult.getHeight()));
            unit = kotlin.Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            m3454setMeasuredSizeozmzZPI(androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g());
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this._measureResult, measureResult) && measureResult != null && ((((map = this.oldAlignmentLines) != null && !map.isEmpty()) || (!measureResult.getAlignmentLines().isEmpty())) && !kotlin.jvm.internal.Intrinsics.areEqual(measureResult.getAlignmentLines(), this.oldAlignmentLines))) {
            getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
            java.util.LinkedHashMap linkedHashMap = this.oldAlignmentLines;
            if (linkedHashMap == null) {
                linkedHashMap = new java.util.LinkedHashMap();
                this.oldAlignmentLines = linkedHashMap;
            }
            linkedHashMap.clear();
            linkedHashMap.putAll(measureResult.getAlignmentLines());
        }
        this._measureResult = measureResult;
    }

    protected final java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> getCachedAlignmentLinesMap() {
        return this.cachedAlignmentLinesMap;
    }

    public final int getCachedAlignmentLine$ui_release(androidx.compose.ui.layout.AlignmentLine alignmentLine) {
        java.lang.Integer num = this.cachedAlignmentLinesMap.get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public void replace$ui_release() {
        mo3403placeAtf8xVGno(getPosition(), 0.0f, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public final void mo3403placeAtf8xVGno(long position, float zIndex, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> layerBlock) {
        m3562placeSelfgyyYBs(position);
        if (getIsShallowPlacing()) {
            return;
        }
        placeChildren();
    }

    /* renamed from: placeSelf--gyyYBs, reason: not valid java name */
    private final void m3562placeSelfgyyYBs(long position) {
        if (androidx.compose.ui.unit.IntOffset.m4609equalsimpl0(getPosition(), position)) {
            return;
        }
        m3566setPositiongyyYBs(position);
        androidx.compose.ui.node.LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = getLayoutNode().getLayoutDelegate().getLookaheadPassDelegate();
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.notifyChildrenUsingCoordinatesWhilePlacing();
        }
        invalidateAlignmentLinesFromPositionChange(this.coordinator);
    }

    /* renamed from: placeSelfApparentToRealOffset--gyyYBs$ui_release, reason: not valid java name */
    public final void m3564placeSelfApparentToRealOffsetgyyYBs$ui_release(long position) {
        long j = getApparentToRealOffset();
        m3562placeSelfgyyYBs(androidx.compose.ui.unit.IntOffsetKt.IntOffset(androidx.compose.ui.unit.IntOffset.m4610getXimpl(position) + androidx.compose.ui.unit.IntOffset.m4610getXimpl(j), androidx.compose.ui.unit.IntOffset.m4611getYimpl(position) + androidx.compose.ui.unit.IntOffset.m4611getYimpl(j)));
    }

    protected void placeChildren() {
        getMeasureResult$ui_release().placeChildren();
    }

    /* renamed from: performingMeasure-K40F9xA, reason: not valid java name */
    public final androidx.compose.ui.layout.Placeable m3563performingMeasureK40F9xA(long constraints, kotlin.jvm.functions.Function0<? extends androidx.compose.ui.layout.MeasureResult> block) {
        m3455setMeasurementConstraintsBRTryo0(constraints);
        set_measureResult(block.invoke());
        return this;
    }

    @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
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

    /* renamed from: positionIn-Bjo55l4$ui_release, reason: not valid java name */
    public final long m3565positionInBjo55l4$ui_release(androidx.compose.ui.node.LookaheadDelegate ancestor) {
        long m4620getZeronOccac = androidx.compose.ui.unit.IntOffset.INSTANCE.m4620getZeronOccac();
        androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = this;
        while (!kotlin.jvm.internal.Intrinsics.areEqual(lookaheadDelegate, ancestor)) {
            long position = lookaheadDelegate.getPosition();
            m4620getZeronOccac = androidx.compose.ui.unit.IntOffsetKt.IntOffset(androidx.compose.ui.unit.IntOffset.m4610getXimpl(m4620getZeronOccac) + androidx.compose.ui.unit.IntOffset.m4610getXimpl(position), androidx.compose.ui.unit.IntOffset.m4611getYimpl(m4620getZeronOccac) + androidx.compose.ui.unit.IntOffset.m4611getYimpl(position));
            androidx.compose.ui.node.NodeCoordinator wrappedBy = lookaheadDelegate.coordinator.getWrappedBy();
            kotlin.jvm.internal.Intrinsics.checkNotNull(wrappedBy);
            lookaheadDelegate = wrappedBy.getLookaheadDelegate();
            kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
        }
        return m4620getZeronOccac;
    }
}
