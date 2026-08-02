package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJg\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u00102\u0019\u0010\u0017\u001a\u0015\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013¢\u0006\u0002\b\u00162\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJM\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u00102\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0016H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001dJ\u0014\u0010!\u001a\u00020\r*\u00020\u001eH\u0096\u0001¢\u0006\u0004\b\u001f\u0010 J\u0014\u0010!\u001a\u00020\r*\u00020\"H\u0096\u0001¢\u0006\u0004\b#\u0010$J\u0014\u0010'\u001a\u00020\u001e*\u00020\rH\u0096\u0001¢\u0006\u0004\b%\u0010&J\u0014\u0010'\u001a\u00020\u001e*\u00020(H\u0096\u0001¢\u0006\u0004\b%\u0010)J\u0014\u0010'\u001a\u00020\u001e*\u00020\"H\u0096\u0001¢\u0006\u0004\b*\u0010+J\u0014\u00100\u001a\u00020-*\u00020,H\u0096\u0001¢\u0006\u0004\b.\u0010/J\u0014\u00102\u001a\u00020(*\u00020\u001eH\u0096\u0001¢\u0006\u0004\b1\u0010)J\u0014\u00102\u001a\u00020(*\u00020\"H\u0096\u0001¢\u0006\u0004\b3\u0010+J\u0014\u00106\u001a\u000205*\u000204H\u0096\u0001¢\u0006\u0004\b6\u00107J\u0014\u00109\u001a\u00020,*\u00020-H\u0096\u0001¢\u0006\u0004\b8\u0010/J\u0014\u0010<\u001a\u00020\"*\u00020\rH\u0096\u0001¢\u0006\u0004\b:\u0010;J\u0014\u0010<\u001a\u00020\"*\u00020(H\u0096\u0001¢\u0006\u0004\b:\u0010=J\u0014\u0010<\u001a\u00020\"*\u00020\u001eH\u0096\u0001¢\u0006\u0004\b>\u0010=R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010?\u001a\u0004\b@\u0010AR\"\u0010\u0007\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0014\u0010J\u001a\u00020G8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010M\u001a\u00020K8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010IR\"\u0010O\u001a\u00020N8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0018\u0010W\u001a\u00020\n*\u00020\u00188WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020N8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010RR\u0014\u0010[\u001a\u00020(8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0014\u0010]\u001a\u00020(8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\\\u0010ZR\u0014\u0010a\u001a\u00020^8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b_\u0010`"}, d2 = {"Landroidx/compose/ui/layout/ApproachMeasureScopeImpl;", "Landroidx/compose/ui/layout/ApproachMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/LookaheadScope;", "Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;", "coordinator", "Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "approachNode", "<init>", "(Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;Landroidx/compose/ui/layout/ApproachLayoutModifierNode;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "toLookaheadCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/layout/LayoutCoordinates;", "", "width", "height", "", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "", "Lkotlin/ExtensionFunctionType;", "rulers", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placementBlock", "Landroidx/compose/ui/layout/MeasureResult;", androidx.window.reflection.WindowExtensionsConstants.LAYOUT_PACKAGE, "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/MeasureResult;", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-u2uoSUM", "(I)F", "toDp", "", "(F)F", "toDp-GaN1DYA", "(J)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;", "toSize-XkaWNTQ", "toSize", "toSp-kPz2Gy4", "(I)J", "toSp", "(F)J", "toSp-0xMU5do", "Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;", "getCoordinator", "()Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;", "Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "getApproachNode", "()Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "setApproachNode", "(Landroidx/compose/ui/layout/ApproachLayoutModifierNode;)V", "Landroidx/compose/ui/unit/Constraints;", "getLookaheadConstraints-msEJaDk", "()J", "lookaheadConstraints", "Landroidx/compose/ui/unit/IntSize;", "getLookaheadSize-YbymL2g", "lookaheadSize", "", "approachMeasureRequired", "Z", "getApproachMeasureRequired$ui", "()Z", "setApproachMeasureRequired$ui", "(Z)V", "getLookaheadScopeCoordinates", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)Landroidx/compose/ui/layout/LayoutCoordinates;", "lookaheadScopeCoordinates", "isLookingAhead", "getDensity", "()F", "density", "getFontScale", "fontScale", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ApproachMeasureScopeImpl implements androidx.compose.ui.layout.ApproachMeasureScope, androidx.compose.ui.layout.MeasureScope, androidx.compose.ui.layout.LookaheadScope {
    public static final int $stable = 0;
    private boolean approachMeasureRequired;
    private androidx.compose.ui.layout.ApproachLayoutModifierNode approachNode;
    private final androidx.compose.ui.node.LayoutModifierNodeCoordinator coordinator;

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public final boolean isLookingAhead() {
        return false;
    }

    public ApproachMeasureScopeImpl(androidx.compose.ui.node.LayoutModifierNodeCoordinator layoutModifierNodeCoordinator, androidx.compose.ui.layout.ApproachLayoutModifierNode approachLayoutModifierNode) {
        this.coordinator = layoutModifierNodeCoordinator;
        this.approachNode = approachLayoutModifierNode;
    }

    public final androidx.compose.ui.node.LayoutModifierNodeCoordinator getCoordinator() {
        return this.coordinator;
    }

    public final androidx.compose.ui.layout.ApproachLayoutModifierNode getApproachNode() {
        return this.approachNode;
    }

    public final void setApproachNode(androidx.compose.ui.layout.ApproachLayoutModifierNode approachLayoutModifierNode) {
        this.approachNode = approachLayoutModifierNode;
    }

    @Override // androidx.compose.ui.layout.ApproachIntrinsicMeasureScope
    /* renamed from: getLookaheadConstraints-msEJaDk */
    public final long mo7334getLookaheadConstraintsmsEJaDk() {
        androidx.compose.ui.unit.Constraints lookaheadConstraints = this.coordinator.getLookaheadConstraints();
        if (lookaheadConstraints == null) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Error: Lookahead constraints requested before lookahead measure.");
            throw new kotlin.KotlinNothingValueException();
        }
        return lookaheadConstraints.getGetHighSpeedVideoFpsRangesFor();
    }

    @Override // androidx.compose.ui.layout.ApproachIntrinsicMeasureScope
    /* renamed from: getLookaheadSize-YbymL2g */
    public final long mo7335getLookaheadSizeYbymL2g() {
        androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = this.coordinator.getLookaheadDelegate();
        kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
        androidx.compose.ui.layout.MeasureResult measureResult$ui = lookaheadDelegate.getMeasureResult$ui();
        return androidx.compose.ui.unit.IntSize.m8767constructorimpl((measureResult$ui.getWidth() << 32) | (measureResult$ui.getHeight() & 4294967295L));
    }

    /* renamed from: getApproachMeasureRequired$ui, reason: from getter */
    public final boolean getApproachMeasureRequired() {
        return this.approachMeasureRequired;
    }

    public final void setApproachMeasureRequired$ui(boolean z) {
        this.approachMeasureRequired = z;
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    public final androidx.compose.ui.layout.LayoutCoordinates toLookaheadCoordinates(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        androidx.compose.ui.layout.LookaheadLayoutCoordinates lookaheadLayoutCoordinates;
        if (!(layoutCoordinates instanceof androidx.compose.ui.layout.LookaheadLayoutCoordinates)) {
            if (layoutCoordinates instanceof androidx.compose.ui.node.NodeCoordinator) {
                androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = ((androidx.compose.ui.node.NodeCoordinator) layoutCoordinates).getLookaheadDelegate();
                if (lookaheadDelegate != null && (lookaheadLayoutCoordinates = lookaheadDelegate.getLookaheadLayoutCoordinates()) != null) {
                    return lookaheadLayoutCoordinates;
                }
            } else {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Unsupported LayoutCoordinates");
                throw new kotlin.KotlinNothingValueException();
            }
        }
        return layoutCoordinates;
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    public final androidx.compose.ui.layout.LayoutCoordinates getLookaheadScopeCoordinates(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.ui.node.NodeCoordinator outerCoordinator$ui;
        androidx.compose.ui.node.LayoutNode lookaheadRoot = this.coordinator.getLayoutNode().getLookaheadRoot();
        if (lookaheadRoot != null) {
            if (lookaheadRoot.getIsVirtualLookaheadRoot()) {
                androidx.compose.ui.node.LayoutNode parent$ui = lookaheadRoot.getParent$ui();
                if (parent$ui == null || (outerCoordinator$ui = parent$ui.getInnerCoordinator$ui()) == null) {
                    outerCoordinator$ui = lookaheadRoot.getChildren$ui().get(0).getOuterCoordinator$ui();
                }
                return outerCoordinator$ui;
            }
            return lookaheadRoot.getOuterCoordinator$ui();
        }
        androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Error: Requesting LookaheadScopeCoordinates is not permitted from outside of a LookaheadScope.");
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public final androidx.compose.ui.layout.MeasureResult layout(final int width, final int height, final java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> alignmentLines, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.RulerScope, kotlin.Unit> rulers, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit> placementBlock) {
        if ((width & (-16777216)) != 0 || ((-16777216) & height) != 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Size(");
            sb.append(width);
            sb.append(" x ");
            sb.append(height);
            sb.append(") is out of range. Each dimension must be between 0 and 16777215.");
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException(sb.toString());
        }
        return new androidx.compose.ui.layout.MeasureResult(width, height, alignmentLines, rulers, placementBlock, this) { // from class: androidx.compose.ui.layout.ApproachMeasureScopeImpl$layout$1
            final /* synthetic */ kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit> Camera2StreamConfigurationMap;
            private final java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> alignmentLines;
            final /* synthetic */ androidx.compose.ui.layout.ApproachMeasureScopeImpl getHighSpeedVideoFpsRanges;
            private final int height;
            private final kotlin.jvm.functions.Function1<androidx.compose.ui.layout.RulerScope, kotlin.Unit> rulers;
            private final int width;

            public static /* synthetic */ void getAlignmentLines$annotations() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.Camera2StreamConfigurationMap = placementBlock;
                this.getHighSpeedVideoFpsRanges = this;
                this.width = width;
                this.height = height;
                this.alignmentLines = alignmentLines;
                this.rulers = rulers;
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
            public final java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> getAlignmentLines() {
                return this.alignmentLines;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final kotlin.jvm.functions.Function1<androidx.compose.ui.layout.RulerScope, kotlin.Unit> getRulers() {
                return this.rulers;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final void placeChildren() {
                this.Camera2StreamConfigurationMap.invoke(this.getHighSpeedVideoFpsRanges.getCoordinator().getPlacementScope());
            }
        };
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public final long mo1422toSpkPz2Gy4(int i) {
        return this.coordinator.mo1422toSpkPz2Gy4(i);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public final long mo1421toSpkPz2Gy4(float f) {
        return this.coordinator.mo1421toSpkPz2Gy4(f);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public final long mo1420toSp0xMU5do(float f) {
        return this.coordinator.mo1420toSp0xMU5do(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public final long mo1419toSizeXkaWNTQ(long j) {
        return this.coordinator.mo1419toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.ui.unit.Density
    public final androidx.compose.ui.geometry.Rect toRect(androidx.compose.ui.unit.DpRect dpRect) {
        return this.coordinator.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public final float mo1418toPx0680j_4(float f) {
        return this.coordinator.mo1418toPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public final float mo1417toPxR2X_6o(long j) {
        return this.coordinator.mo1417toPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public final long mo1416toDpSizekrfVVM(long j) {
        return this.coordinator.mo1416toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public final float mo1415toDpu2uoSUM(int i) {
        return this.coordinator.mo1415toDpu2uoSUM(i);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public final float mo1414toDpu2uoSUM(float f) {
        return this.coordinator.mo1414toDpu2uoSUM(f);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public final float mo1413toDpGaN1DYA(long j) {
        return this.coordinator.mo1413toDpGaN1DYA(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public final int mo1412roundToPx0680j_4(float f) {
        return this.coordinator.mo1412roundToPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public final int mo1411roundToPxR2X_6o(long j) {
        return this.coordinator.mo1411roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public final androidx.compose.ui.layout.MeasureResult layout(int width, int height, java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> alignmentLines, kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit> placementBlock) {
        return this.coordinator.layout(width, height, alignmentLines, placementBlock);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public final androidx.compose.ui.unit.LayoutDirection getLayoutDirection() {
        return this.coordinator.getLayoutDirection();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final float getFontScale() {
        return this.coordinator.getFontScale();
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.coordinator.getDensity();
    }
}
