package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0019\u001a\u00020\u0016*\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0016*\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u0019\u001a\u00020\u0016*\u00020\u001cH\u0016¢\u0006\u0004\b\u001a\u0010\u001dJ\u0013\u0010 \u001a\u00020\u0015*\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020\u0015*\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010!J\u0013\u0010 \u001a\u00020\u0015*\u00020\u0016H\u0016¢\u0006\u0004\b\"\u0010\u001fJ\u0013\u0010'\u001a\u00020$*\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0013\u0010)\u001a\u00020#*\u00020$H\u0016¢\u0006\u0004\b(\u0010&JM\u00105\u001a\u0002042\u0006\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020\t2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\t0,2\u0017\u00103\u001a\u0013\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002010/¢\u0006\u0002\b2H\u0096\u0001¢\u0006\u0004\b5\u00106Jh\u00105\u001a\u0002042\u0006\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020\t2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\t0,2\u0019\u00108\u001a\u0015\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u000201\u0018\u00010/¢\u0006\u0002\b22\u0017\u00103\u001a\u0013\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002010/¢\u0006\u0002\b2H\u0096\u0001¢\u0006\u0004\b5\u00109J\u0014\u0010<\u001a\u00020\t*\u00020\u0016H\u0096\u0001¢\u0006\u0004\b:\u0010;J\u0014\u0010<\u001a\u00020\t*\u00020\u0015H\u0096\u0001¢\u0006\u0004\b=\u0010>J\u0014\u0010@\u001a\u00020\u001c*\u00020\u0016H\u0096\u0001¢\u0006\u0004\b?\u0010\u001dJ\u0014\u0010@\u001a\u00020\u001c*\u00020\u0015H\u0096\u0001¢\u0006\u0004\bA\u0010\u0018J\u0014\u0010D\u001a\u00020C*\u00020BH\u0096\u0001¢\u0006\u0004\bD\u0010ER\u0014\u0010H\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010F\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR \u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000b0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010PR \u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010PR\u0014\u0010S\u001a\u00020\u001c8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010U\u001a\u00020\u001c8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bT\u0010RR\u0014\u0010W\u001a\u00020V8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0014\u0010\\\u001a\u00020Y8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bZ\u0010["}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "itemContentFactory", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "subcomposeMeasureScope", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;Landroidx/compose/ui/layout/SubcomposeMeasureScope;)V", "", "index", "", "Landroidx/compose/ui/layout/Measurable;", "compose", "(I)Ljava/util/List;", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/Placeable;", "measure-0kLqBqw", "(IJ)Ljava/util/List;", "measure", "Landroidx/compose/ui/unit/TextUnit;", "Landroidx/compose/ui/unit/Dp;", "toDp-GaN1DYA", "(J)F", "toDp", "toDp-u2uoSUM", "(I)F", "", "(F)F", "toSp-kPz2Gy4", "(F)J", "toSp", "(I)J", "toSp-0xMU5do", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toSize-XkaWNTQ", "(J)J", "toSize", "toDpSize-k-rfVVM", "toDpSize", "width", "height", "", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "placementBlock", "Landroidx/compose/ui/layout/MeasureResult;", androidx.window.reflection.WindowExtensionsConstants.LAYOUT_PACKAGE, "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/RulerScope;", "rulers", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/MeasureResult;", "roundToPx-0680j_4", "(F)I", "roundToPx", "roundToPx--R2X_6o", "(J)I", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "Camera2StreamConfigurationMap", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "getHighSpeedVideoFpsRangesFor", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/collection/MutableIntObjectMap;", "getDensity", "()F", "density", "getFontScale", "fontScale", "", "isLookingAhead", "()Z", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyLayoutMeasureScopeImpl implements androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.layout.MeasureScope {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.ui.layout.SubcomposeMeasureScope getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.collection.MutableIntObjectMap<java.util.List<androidx.compose.ui.layout.Placeable>> Camera2StreamConfigurationMap = androidx.collection.IntObjectMapKt.mutableIntObjectMapOf();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.collection.MutableIntObjectMap<java.util.List<androidx.compose.ui.layout.Measurable>> getHighSpeedVideoSizes = androidx.collection.IntObjectMapKt.mutableIntObjectMapOf();

    public LazyLayoutMeasureScopeImpl(androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory lazyLayoutItemContentFactory, androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope) {
        this.getHighSpeedVideoFpsRanges = lazyLayoutItemContentFactory;
        this.getHighResolutionOutputSizeshNQ4ISI = subcomposeMeasureScope;
        this.getHighSpeedVideoFpsRangesFor = lazyLayoutItemContentFactory.getItemProvider().invoke();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope
    public final java.util.List<androidx.compose.ui.layout.Measurable> compose(int index) {
        java.util.List<androidx.compose.ui.layout.Measurable> list = this.getHighSpeedVideoSizes.get(index);
        if (list != null) {
            return list;
        }
        java.lang.Object key = this.getHighSpeedVideoFpsRangesFor.getKey(index);
        java.util.List<androidx.compose.ui.layout.Measurable> subcompose = this.getHighResolutionOutputSizeshNQ4ISI.subcompose(key, this.getHighSpeedVideoFpsRanges.getContent(index, key, this.getHighSpeedVideoFpsRangesFor.getContentType(index)));
        this.getHighSpeedVideoSizes.set(index, subcompose);
        return subcompose;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope
    @kotlin.Deprecated(message = "Please use compose and measure")
    /* renamed from: measure-0kLqBqw */
    public final java.util.List<androidx.compose.ui.layout.Placeable> mo1857measure0kLqBqw(int index, long constraints) {
        java.util.List<androidx.compose.ui.layout.Placeable> list = this.Camera2StreamConfigurationMap.get(index);
        if (list != null) {
            return list;
        }
        java.lang.Object key = this.getHighSpeedVideoFpsRangesFor.getKey(index);
        java.util.List<androidx.compose.ui.layout.Measurable> subcompose = this.getHighResolutionOutputSizeshNQ4ISI.subcompose(key, this.getHighSpeedVideoFpsRanges.getContent(index, key, this.getHighSpeedVideoFpsRangesFor.getContentType(index)));
        int size = subcompose.size();
        java.util.ArrayList arrayList = new java.util.ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(subcompose.get(i).mo7353measureBRTryo0(constraints));
        }
        java.util.ArrayList arrayList2 = arrayList;
        this.Camera2StreamConfigurationMap.set(index, arrayList2);
        return arrayList2;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public final float mo1413toDpGaN1DYA(long j) {
        return this.getHighResolutionOutputSizeshNQ4ISI.mo1413toDpGaN1DYA(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public final float mo1415toDpu2uoSUM(int i) {
        return this.getHighResolutionOutputSizeshNQ4ISI.mo1415toDpu2uoSUM(i);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public final float mo1414toDpu2uoSUM(float f) {
        return this.getHighResolutionOutputSizeshNQ4ISI.mo1414toDpu2uoSUM(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public final long mo1421toSpkPz2Gy4(float f) {
        return this.getHighResolutionOutputSizeshNQ4ISI.mo1421toSpkPz2Gy4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public final long mo1422toSpkPz2Gy4(int i) {
        return this.getHighResolutionOutputSizeshNQ4ISI.mo1422toSpkPz2Gy4(i);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public final long mo1420toSp0xMU5do(float f) {
        return this.getHighResolutionOutputSizeshNQ4ISI.mo1420toSp0xMU5do(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public final long mo1419toSizeXkaWNTQ(long j) {
        return this.getHighResolutionOutputSizeshNQ4ISI.mo1419toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public final long mo1416toDpSizekrfVVM(long j) {
        return this.getHighResolutionOutputSizeshNQ4ISI.mo1416toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.ui.unit.Density
    public final androidx.compose.ui.geometry.Rect toRect(androidx.compose.ui.unit.DpRect dpRect) {
        return this.getHighResolutionOutputSizeshNQ4ISI.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public final float mo1418toPx0680j_4(float f) {
        return this.getHighResolutionOutputSizeshNQ4ISI.mo1418toPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public final float mo1417toPxR2X_6o(long j) {
        return this.getHighResolutionOutputSizeshNQ4ISI.mo1417toPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public final int mo1412roundToPx0680j_4(float f) {
        return this.getHighResolutionOutputSizeshNQ4ISI.mo1412roundToPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public final int mo1411roundToPxR2X_6o(long j) {
        return this.getHighResolutionOutputSizeshNQ4ISI.mo1411roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public final androidx.compose.ui.layout.MeasureResult layout(int width, int height, java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> alignmentLines, kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.RulerScope, kotlin.Unit> rulers, kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit> placementBlock) {
        return this.getHighResolutionOutputSizeshNQ4ISI.layout(width, height, alignmentLines, rulers, placementBlock);
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public final androidx.compose.ui.layout.MeasureResult layout(int width, int height, java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> alignmentLines, kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit> placementBlock) {
        return this.getHighResolutionOutputSizeshNQ4ISI.layout(width, height, alignmentLines, placementBlock);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public final boolean isLookingAhead() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isLookingAhead();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public final androidx.compose.ui.unit.LayoutDirection getLayoutDirection() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getLayoutDirection();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final float getFontScale() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getFontScale();
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getDensity();
    }
}
