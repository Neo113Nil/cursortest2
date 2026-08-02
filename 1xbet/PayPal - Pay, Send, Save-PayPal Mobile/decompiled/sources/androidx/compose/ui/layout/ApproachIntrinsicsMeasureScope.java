package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Jg\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000b2\u0019\u0010\u0012\u001a\u0015\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\u0002\b\u00112\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0014\u0010\u001b\u001a\u00020\b*\u00020\u0018H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0014\u0010\u001b\u001a\u00020\b*\u00020\u001cH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0014\u0010!\u001a\u00020\u0018*\u00020\bH\u0096\u0001¢\u0006\u0004\b\u001f\u0010 J\u0014\u0010!\u001a\u00020\u0018*\u00020\"H\u0096\u0001¢\u0006\u0004\b\u001f\u0010#J\u0014\u0010!\u001a\u00020\u0018*\u00020\u001cH\u0096\u0001¢\u0006\u0004\b$\u0010%J\u0014\u0010*\u001a\u00020'*\u00020&H\u0096\u0001¢\u0006\u0004\b(\u0010)J\u0014\u0010,\u001a\u00020\"*\u00020\u0018H\u0096\u0001¢\u0006\u0004\b+\u0010#J\u0014\u0010,\u001a\u00020\"*\u00020\u001cH\u0096\u0001¢\u0006\u0004\b-\u0010%J\u0014\u00100\u001a\u00020/*\u00020.H\u0096\u0001¢\u0006\u0004\b0\u00101J\u0014\u00103\u001a\u00020&*\u00020'H\u0096\u0001¢\u0006\u0004\b2\u0010)J\u0014\u00106\u001a\u00020\u001c*\u00020\bH\u0096\u0001¢\u0006\u0004\b4\u00105J\u0014\u00106\u001a\u00020\u001c*\u00020\"H\u0096\u0001¢\u0006\u0004\b4\u00107J\u0014\u00106\u001a\u00020\u001c*\u00020\u0018H\u0096\u0001¢\u0006\u0004\b8\u00107R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020\"8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020\"8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b?\u0010=R\u0014\u0010B\u001a\u00020A8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010G\u001a\u00020D8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010J\u001a\u00020H8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bI\u0010F"}, d2 = {"Landroidx/compose/ui/layout/ApproachIntrinsicsMeasureScope;", "Landroidx/compose/ui/layout/ApproachMeasureScope;", "Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;", "intrinsicMeasureScope", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "<init>", "(Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;Landroidx/compose/ui/unit/LayoutDirection;)V", "", "width", "height", "", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "", "Lkotlin/ExtensionFunctionType;", "rulers", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placementBlock", "Landroidx/compose/ui/layout/MeasureResult;", androidx.window.reflection.WindowExtensionsConstants.LAYOUT_PACKAGE, "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-u2uoSUM", "(I)F", "toDp", "", "(F)F", "toDp-GaN1DYA", "(J)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;", "toSize-XkaWNTQ", "toSize", "toSp-kPz2Gy4", "(I)J", "toSp", "(F)J", "toSp-0xMU5do", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "getDensity", "()F", "density", "getFontScale", "fontScale", "", "isLookingAhead", "()Z", "Landroidx/compose/ui/unit/Constraints;", "getLookaheadConstraints-msEJaDk", "()J", "lookaheadConstraints", "Landroidx/compose/ui/unit/IntSize;", "getLookaheadSize-YbymL2g", "lookaheadSize"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ApproachIntrinsicsMeasureScope implements androidx.compose.ui.layout.ApproachMeasureScope, androidx.compose.ui.layout.ApproachIntrinsicMeasureScope {
    public static final int $stable = 0;
    private final /* synthetic */ androidx.compose.ui.layout.ApproachIntrinsicMeasureScope getHighSpeedVideoSizes;
    private final androidx.compose.ui.unit.LayoutDirection layoutDirection;

    public ApproachIntrinsicsMeasureScope(androidx.compose.ui.layout.ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        this.getHighSpeedVideoSizes = approachIntrinsicMeasureScope;
        this.layoutDirection = layoutDirection;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public final androidx.compose.ui.unit.LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public final androidx.compose.ui.layout.MeasureResult layout(final int width, final int height, final java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> alignmentLines, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.RulerScope, kotlin.Unit> rulers, kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit> placementBlock) {
        if (width < 0) {
            width = 0;
        }
        if (height < 0) {
            height = 0;
        }
        if ((width & (-16777216)) != 0 || ((-16777216) & height) != 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Size(");
            sb.append(width);
            sb.append(" x ");
            sb.append(height);
            sb.append(") is out of range. Each dimension must be between 0 and 16777215.");
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException(sb.toString());
        }
        return new androidx.compose.ui.layout.MeasureResult() { // from class: androidx.compose.ui.layout.ApproachIntrinsicsMeasureScope$layout$1
            @Override // androidx.compose.ui.layout.MeasureResult
            public final void placeChildren() {
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            /* renamed from: getWidth, reason: from getter */
            public final int getGetHighSpeedVideoFpsRangesFor() {
                return width;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            /* renamed from: getHeight, reason: from getter */
            public final int getCamera2StreamConfigurationMap() {
                return height;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> getAlignmentLines() {
                return alignmentLines;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public final kotlin.jvm.functions.Function1<androidx.compose.ui.layout.RulerScope, kotlin.Unit> getRulers() {
                return rulers;
            }
        };
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public final long mo1422toSpkPz2Gy4(int i) {
        return this.getHighSpeedVideoSizes.mo1422toSpkPz2Gy4(i);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public final long mo1421toSpkPz2Gy4(float f) {
        return this.getHighSpeedVideoSizes.mo1421toSpkPz2Gy4(f);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public final long mo1420toSp0xMU5do(float f) {
        return this.getHighSpeedVideoSizes.mo1420toSp0xMU5do(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public final long mo1419toSizeXkaWNTQ(long j) {
        return this.getHighSpeedVideoSizes.mo1419toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.ui.unit.Density
    public final androidx.compose.ui.geometry.Rect toRect(androidx.compose.ui.unit.DpRect dpRect) {
        return this.getHighSpeedVideoSizes.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public final float mo1418toPx0680j_4(float f) {
        return this.getHighSpeedVideoSizes.mo1418toPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public final float mo1417toPxR2X_6o(long j) {
        return this.getHighSpeedVideoSizes.mo1417toPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public final long mo1416toDpSizekrfVVM(long j) {
        return this.getHighSpeedVideoSizes.mo1416toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public final float mo1415toDpu2uoSUM(int i) {
        return this.getHighSpeedVideoSizes.mo1415toDpu2uoSUM(i);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public final float mo1414toDpu2uoSUM(float f) {
        return this.getHighSpeedVideoSizes.mo1414toDpu2uoSUM(f);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public final float mo1413toDpGaN1DYA(long j) {
        return this.getHighSpeedVideoSizes.mo1413toDpGaN1DYA(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public final int mo1412roundToPx0680j_4(float f) {
        return this.getHighSpeedVideoSizes.mo1412roundToPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public final int mo1411roundToPxR2X_6o(long j) {
        return this.getHighSpeedVideoSizes.mo1411roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public final boolean isLookingAhead() {
        return this.getHighSpeedVideoSizes.isLookingAhead();
    }

    @Override // androidx.compose.ui.layout.ApproachIntrinsicMeasureScope
    /* renamed from: getLookaheadSize-YbymL2g */
    public final long mo7335getLookaheadSizeYbymL2g() {
        return this.getHighSpeedVideoSizes.mo7335getLookaheadSizeYbymL2g();
    }

    @Override // androidx.compose.ui.layout.ApproachIntrinsicMeasureScope
    /* renamed from: getLookaheadConstraints-msEJaDk */
    public final long mo7334getLookaheadConstraintsmsEJaDk() {
        return this.getHighSpeedVideoSizes.mo7334getLookaheadConstraintsmsEJaDk();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: getFontScale */
    public final float getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoSizes.getGetHighSpeedVideoFpsRangesFor();
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: getDensity */
    public final float getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighSpeedVideoSizes.getGetHighResolutionOutputSizeshNQ4ISI();
    }
}
