package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u001d\u001a\u00020\u001a2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0015\u001a\u0004\u0018\u00010 2\b\u0010\u0016\u001a\u0004\u0018\u00010 2\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001b\u0010!JE\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00182$\u0010$\u001a \u0012\t\u0012\u00070\t¢\u0006\u0002\b#\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b#\u0012\u0006\u0012\u0004\u0018\u00010 0\"H\u0000¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b+\u0010*J.\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b1\u0010*J\u0010\u00103\u001a\u000202HÖ\u0001¢\u0006\u0004\b3\u00104R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010(R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010*R\u001a\u0010\u0006\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b9\u0010*R\u0014\u0010;\u001a\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b:\u0010*R\u001a\u0010<\u001a\u0002028\u0001X\u0081D¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u00104R\"\u0010?\u001a\u00020\u00048\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b?\u00107\u001a\u0004\b@\u0010*\"\u0004\bA\u0010BR\"\u0010C\u001a\u00020\u00048\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bC\u00107\u001a\u0004\bD\u0010*\"\u0004\bE\u0010BR\u0018\u0010H\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010F\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010L\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bH\u0010GR\u0018\u0010M\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bL\u0010KR\u0018\u0010P\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010Q\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bM\u0010OR6\u0010S\u001a\"\u0012\t\u0012\u00070\t¢\u0006\u0002\b#\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b#\u0012\u0006\u0012\u0004\u0018\u00010 \u0018\u00010\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bP\u0010R"}, d2 = {"Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "", "Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "type", "", "minLinesToShowCollapse", "minCrossAxisSizeToShowCollapse", "<init>", "(Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;II)V", "", "hasNext", "lineIndex", "totalCrossAxisSize", "Landroidx/collection/IntIntPair;", "ellipsisSize-F35zm-w$foundation_layout", "(ZII)Landroidx/collection/IntIntPair;", "ellipsisSize", "Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;", "ellipsisInfo$foundation_layout", "(ZII)Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "seeMoreMeasurable", "collapseMeasurable", "isHorizontal", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "setOverflowMeasurables--hBUhpc$foundation_layout", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;Landroidx/compose/ui/layout/IntrinsicMeasurable;ZJ)V", "setOverflowMeasurables", "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;", "measurePolicy", "Landroidx/compose/ui/layout/Measurable;", "(Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;Landroidx/compose/ui/layout/Measurable;Landroidx/compose/ui/layout/Measurable;J)V", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "getOverflowMeasurable", "setOverflowMeasurables-VKLhPVY$foundation_layout", "(Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;JLkotlin/jvm/functions/Function2;)V", "component1$foundation_layout", "()Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "component2$foundation_layout", "()I", "component3$foundation_layout", "copy", "(Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;II)Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "getType$foundation_layout", com.visa.cbp.getEncExpo.warmup, "getMinLinesToShowCollapse$foundation_layout", "getMinCrossAxisSizeToShowCollapse$foundation_layout", "getShownItemCount$foundation_layout", "shownItemCount", "shownItemLazyErrorMessage", "Ljava/lang/String;", "getShownItemLazyErrorMessage$foundation_layout", "itemShown", "getItemShown$foundation_layout", "setItemShown$foundation_layout", "(I)V", "itemCount", "getItemCount$foundation_layout", "setItemCount$foundation_layout", "getHighSpeedVideoSizes", "Landroidx/compose/ui/layout/Measurable;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/layout/Placeable;", "getInputSizeshNQ4ISI", "Landroidx/compose/ui/layout/Placeable;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizesFor", "Landroidx/collection/IntIntPair;", "Camera2StreamConfigurationMap", "getOutputFormats", "Lkotlin/jvm/functions/Function2;", "getInputFormats"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FlowLayoutOverflowState {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Integer, ? extends androidx.compose.ui.layout.Measurable> getInputFormats;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.ui.layout.Measurable getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.collection.IntIntPair getOutputFormats;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.compose.ui.layout.Placeable getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.compose.ui.layout.Measurable getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private androidx.collection.IntIntPair Camera2StreamConfigurationMap;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.ui.layout.Placeable getHighSpeedVideoSizes;
    private int itemCount;
    private final int minCrossAxisSizeToShowCollapse;
    private final int minLinesToShowCollapse;
    private final androidx.compose.foundation.layout.FlowLayoutOverflow.OverflowType type;
    private final java.lang.String shownItemLazyErrorMessage = "Accessing shownItemCount before it is set. Are you calling this in the Composition phase, rather than in the draw phase? Consider our samples on how to use it during the draw phase or consider using ContextualFlowRow/ContextualFlowColumn which initializes this method in the composition phase.";
    private int itemShown = -1;

    public FlowLayoutOverflowState(androidx.compose.foundation.layout.FlowLayoutOverflow.OverflowType overflowType, int i, int i2) {
        this.type = overflowType;
        this.minLinesToShowCollapse = i;
        this.minCrossAxisSizeToShowCollapse = i2;
    }

    public final androidx.compose.foundation.layout.FlowLayoutOverflow.OverflowType getType$foundation_layout() {
        return this.type;
    }

    public final int getMinLinesToShowCollapse$foundation_layout() {
        return this.minLinesToShowCollapse;
    }

    public final int getMinCrossAxisSizeToShowCollapse$foundation_layout() {
        return this.minCrossAxisSizeToShowCollapse;
    }

    public final int getShownItemCount$foundation_layout() {
        int i = this.itemShown;
        if (i != -1) {
            return i;
        }
        throw new java.lang.IllegalStateException(this.shownItemLazyErrorMessage);
    }

    /* renamed from: getShownItemLazyErrorMessage$foundation_layout, reason: from getter */
    public final java.lang.String getShownItemLazyErrorMessage() {
        return this.shownItemLazyErrorMessage;
    }

    /* renamed from: getItemShown$foundation_layout, reason: from getter */
    public final int getItemShown() {
        return this.itemShown;
    }

    public final void setItemShown$foundation_layout(int i) {
        this.itemShown = i;
    }

    /* renamed from: getItemCount$foundation_layout, reason: from getter */
    public final int getItemCount() {
        return this.itemCount;
    }

    public final void setItemCount$foundation_layout(int i) {
        this.itemCount = i;
    }

    /* renamed from: ellipsisSize-F35zm-w$foundation_layout, reason: not valid java name */
    public final androidx.collection.IntIntPair m1653ellipsisSizeF35zmw$foundation_layout(boolean hasNext, int lineIndex, int totalCrossAxisSize) {
        int i = androidx.compose.foundation.layout.FlowLayoutOverflowState.WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (hasNext) {
                    return this.Camera2StreamConfigurationMap;
                }
                if (lineIndex + 1 < this.minLinesToShowCollapse || totalCrossAxisSize < this.minCrossAxisSizeToShowCollapse) {
                    return null;
                }
                return this.getOutputFormats;
            }
            if (hasNext) {
                return this.Camera2StreamConfigurationMap;
            }
        }
        return null;
    }

    public final androidx.compose.foundation.layout.FlowLayoutBuildingBlocks.WrapEllipsisInfo ellipsisInfo$foundation_layout(boolean hasNext, int lineIndex, int totalCrossAxisSize) {
        androidx.compose.ui.layout.Measurable measurable;
        androidx.collection.IntIntPair intIntPair;
        androidx.compose.ui.layout.Placeable placeable;
        androidx.compose.ui.layout.Measurable measurable2;
        androidx.compose.ui.layout.Placeable placeable2;
        int i = androidx.compose.foundation.layout.FlowLayoutOverflowState.WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i == 1 || i == 2) {
            return null;
        }
        if (i != 3 && i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (hasNext) {
            kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Integer, ? extends androidx.compose.ui.layout.Measurable> function2 = this.getInputFormats;
            if (function2 == null || (measurable = function2.invoke(java.lang.Boolean.TRUE, java.lang.Integer.valueOf(getShownItemCount$foundation_layout()))) == null) {
                measurable = this.getHighResolutionOutputSizeshNQ4ISI;
            }
            intIntPair = this.Camera2StreamConfigurationMap;
            if (this.getInputFormats == null) {
                placeable = this.getHighSpeedVideoSizes;
                measurable2 = measurable;
                placeable2 = placeable;
            }
            measurable2 = measurable;
            placeable2 = null;
        } else {
            if (lineIndex < this.minLinesToShowCollapse - 1 || totalCrossAxisSize < this.minCrossAxisSizeToShowCollapse) {
                measurable = null;
            } else {
                kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Integer, ? extends androidx.compose.ui.layout.Measurable> function22 = this.getInputFormats;
                if (function22 == null || (measurable = function22.invoke(java.lang.Boolean.FALSE, java.lang.Integer.valueOf(getShownItemCount$foundation_layout()))) == null) {
                    measurable = this.getHighSpeedVideoFpsRangesFor;
                }
            }
            intIntPair = this.getOutputFormats;
            if (this.getInputFormats == null) {
                placeable = this.getHighSpeedVideoFpsRanges;
                measurable2 = measurable;
                placeable2 = placeable;
            }
            measurable2 = measurable;
            placeable2 = null;
        }
        if (measurable2 == null) {
            return null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(intIntPair);
        return new androidx.compose.foundation.layout.FlowLayoutBuildingBlocks.WrapEllipsisInfo(measurable2, placeable2, intIntPair.getPackedValue(), false, 8, null);
    }

    /* renamed from: setOverflowMeasurables--hBUhpc$foundation_layout, reason: not valid java name */
    public final void m1655setOverflowMeasurableshBUhpc$foundation_layout(androidx.compose.ui.layout.IntrinsicMeasurable seeMoreMeasurable, androidx.compose.ui.layout.IntrinsicMeasurable collapseMeasurable, boolean isHorizontal, long constraints) {
        long m1682constructorimpl = androidx.compose.foundation.layout.OrientationIndependentConstraints.m1682constructorimpl(constraints, isHorizontal ? androidx.compose.foundation.layout.LayoutOrientation.Horizontal : androidx.compose.foundation.layout.LayoutOrientation.Vertical);
        if (seeMoreMeasurable != null) {
            int mainAxisMin = androidx.compose.foundation.layout.FlowLayoutKt.mainAxisMin(seeMoreMeasurable, isHorizontal, androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(m1682constructorimpl));
            this.Camera2StreamConfigurationMap = androidx.collection.IntIntPair.m1079boximpl(androidx.collection.IntIntPair.m1082constructorimpl(mainAxisMin, androidx.compose.foundation.layout.FlowLayoutKt.crossAxisMin(seeMoreMeasurable, isHorizontal, mainAxisMin)));
            this.getHighResolutionOutputSizeshNQ4ISI = seeMoreMeasurable instanceof androidx.compose.ui.layout.Measurable ? (androidx.compose.ui.layout.Measurable) seeMoreMeasurable : null;
            this.getHighSpeedVideoSizes = null;
        }
        if (collapseMeasurable != null) {
            int mainAxisMin2 = androidx.compose.foundation.layout.FlowLayoutKt.mainAxisMin(collapseMeasurable, isHorizontal, androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(m1682constructorimpl));
            this.getOutputFormats = androidx.collection.IntIntPair.m1079boximpl(androidx.collection.IntIntPair.m1082constructorimpl(mainAxisMin2, androidx.compose.foundation.layout.FlowLayoutKt.crossAxisMin(collapseMeasurable, isHorizontal, mainAxisMin2)));
            this.getHighSpeedVideoFpsRangesFor = collapseMeasurable instanceof androidx.compose.ui.layout.Measurable ? (androidx.compose.ui.layout.Measurable) collapseMeasurable : null;
            this.getHighSpeedVideoFpsRanges = null;
        }
    }

    /* renamed from: setOverflowMeasurables--hBUhpc$foundation_layout, reason: not valid java name */
    public final void m1654setOverflowMeasurableshBUhpc$foundation_layout(final androidx.compose.foundation.layout.FlowLineMeasurePolicy measurePolicy, androidx.compose.ui.layout.Measurable seeMoreMeasurable, androidx.compose.ui.layout.Measurable collapseMeasurable, long constraints) {
        androidx.compose.foundation.layout.LayoutOrientation layoutOrientation = measurePolicy.isHorizontal() ? androidx.compose.foundation.layout.LayoutOrientation.Horizontal : androidx.compose.foundation.layout.LayoutOrientation.Vertical;
        long m1695toBoxConstraintsOenEA2s = androidx.compose.foundation.layout.OrientationIndependentConstraints.m1695toBoxConstraintsOenEA2s(androidx.compose.foundation.layout.OrientationIndependentConstraints.m1684copyyUG9Ft0$default(androidx.compose.foundation.layout.OrientationIndependentConstraints.m1682constructorimpl(constraints, layoutOrientation), 0, 0, 0, 0, 10, null), layoutOrientation);
        if (seeMoreMeasurable != null) {
            androidx.compose.foundation.layout.FlowLayoutKt.m1649measureAndCacherqJ1uqs(seeMoreMeasurable, measurePolicy, m1695toBoxConstraintsOenEA2s, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.FlowLayoutOverflowState$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    kotlin.Unit Camera2StreamConfigurationMap;
                    Camera2StreamConfigurationMap = androidx.compose.foundation.layout.FlowLayoutOverflowState.Camera2StreamConfigurationMap(androidx.compose.foundation.layout.FlowLayoutOverflowState.this, measurePolicy, (androidx.compose.ui.layout.Placeable) obj);
                    return Camera2StreamConfigurationMap;
                }
            });
            this.getHighResolutionOutputSizeshNQ4ISI = seeMoreMeasurable;
        }
        if (collapseMeasurable != null) {
            androidx.compose.foundation.layout.FlowLayoutKt.m1649measureAndCacherqJ1uqs(collapseMeasurable, measurePolicy, m1695toBoxConstraintsOenEA2s, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.FlowLayoutOverflowState$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    kotlin.Unit highSpeedVideoFpsRanges;
                    highSpeedVideoFpsRanges = androidx.compose.foundation.layout.FlowLayoutOverflowState.getHighSpeedVideoFpsRanges(androidx.compose.foundation.layout.FlowLayoutOverflowState.this, measurePolicy, (androidx.compose.ui.layout.Placeable) obj);
                    return highSpeedVideoFpsRanges;
                }
            });
            this.getHighSpeedVideoFpsRangesFor = collapseMeasurable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.foundation.layout.FlowLayoutOverflowState flowLayoutOverflowState, androidx.compose.foundation.layout.FlowLineMeasurePolicy flowLineMeasurePolicy, androidx.compose.ui.layout.Placeable placeable) {
        int i;
        int i2;
        if (placeable != null) {
            i = flowLineMeasurePolicy.mainAxisSize(placeable);
            i2 = flowLineMeasurePolicy.crossAxisSize(placeable);
        } else {
            i = 0;
            i2 = 0;
        }
        flowLayoutOverflowState.Camera2StreamConfigurationMap = androidx.collection.IntIntPair.m1079boximpl(androidx.collection.IntIntPair.m1082constructorimpl(i, i2));
        flowLayoutOverflowState.getHighSpeedVideoSizes = placeable;
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.foundation.layout.FlowLayoutOverflowState flowLayoutOverflowState, androidx.compose.foundation.layout.FlowLineMeasurePolicy flowLineMeasurePolicy, androidx.compose.ui.layout.Placeable placeable) {
        int i;
        int i2;
        if (placeable != null) {
            i = flowLineMeasurePolicy.mainAxisSize(placeable);
            i2 = flowLineMeasurePolicy.crossAxisSize(placeable);
        } else {
            i = 0;
            i2 = 0;
        }
        flowLayoutOverflowState.getOutputFormats = androidx.collection.IntIntPair.m1079boximpl(androidx.collection.IntIntPair.m1082constructorimpl(i, i2));
        flowLayoutOverflowState.getHighSpeedVideoFpsRanges = placeable;
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: setOverflowMeasurables-VKLhPVY$foundation_layout, reason: not valid java name */
    public final void m1656setOverflowMeasurablesVKLhPVY$foundation_layout(androidx.compose.foundation.layout.FlowLineMeasurePolicy measurePolicy, long constraints, kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Integer, ? extends androidx.compose.ui.layout.Measurable> getOverflowMeasurable) {
        this.itemShown = 0;
        this.getInputFormats = getOverflowMeasurable;
        m1654setOverflowMeasurableshBUhpc$foundation_layout(measurePolicy, getOverflowMeasurable.invoke(java.lang.Boolean.TRUE, 0), getOverflowMeasurable.invoke(java.lang.Boolean.FALSE, 0), constraints);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FlowLayoutOverflowState(type=");
        sb.append(this.type);
        sb.append(", minLinesToShowCollapse=");
        sb.append(this.minLinesToShowCollapse);
        sb.append(", minCrossAxisSizeToShowCollapse=");
        sb.append(this.minCrossAxisSizeToShowCollapse);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.type.hashCode() * 31) + java.lang.Integer.hashCode(this.minLinesToShowCollapse)) * 31) + java.lang.Integer.hashCode(this.minCrossAxisSizeToShowCollapse);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.foundation.layout.FlowLayoutOverflowState)) {
            return false;
        }
        androidx.compose.foundation.layout.FlowLayoutOverflowState flowLayoutOverflowState = (androidx.compose.foundation.layout.FlowLayoutOverflowState) other;
        return this.type == flowLayoutOverflowState.type && this.minLinesToShowCollapse == flowLayoutOverflowState.minLinesToShowCollapse && this.minCrossAxisSizeToShowCollapse == flowLayoutOverflowState.minCrossAxisSizeToShowCollapse;
    }

    public final androidx.compose.foundation.layout.FlowLayoutOverflowState copy(androidx.compose.foundation.layout.FlowLayoutOverflow.OverflowType type, int minLinesToShowCollapse, int minCrossAxisSizeToShowCollapse) {
        return new androidx.compose.foundation.layout.FlowLayoutOverflowState(type, minLinesToShowCollapse, minCrossAxisSizeToShowCollapse);
    }

    /* renamed from: component3$foundation_layout, reason: from getter */
    public final int getMinCrossAxisSizeToShowCollapse() {
        return this.minCrossAxisSizeToShowCollapse;
    }

    /* renamed from: component2$foundation_layout, reason: from getter */
    public final int getMinLinesToShowCollapse() {
        return this.minLinesToShowCollapse;
    }

    /* renamed from: component1$foundation_layout, reason: from getter */
    public final androidx.compose.foundation.layout.FlowLayoutOverflow.OverflowType getType() {
        return this.type;
    }

    public static /* synthetic */ androidx.compose.foundation.layout.FlowLayoutOverflowState copy$default(androidx.compose.foundation.layout.FlowLayoutOverflowState flowLayoutOverflowState, androidx.compose.foundation.layout.FlowLayoutOverflow.OverflowType overflowType, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            overflowType = flowLayoutOverflowState.type;
        }
        if ((i3 & 2) != 0) {
            i = flowLayoutOverflowState.minLinesToShowCollapse;
        }
        if ((i3 & 4) != 0) {
            i2 = flowLayoutOverflowState.minCrossAxisSizeToShowCollapse;
        }
        return flowLayoutOverflowState.copy(overflowType, i, i2);
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.foundation.layout.FlowLayoutOverflow.OverflowType.values().length];
            try {
                iArr[androidx.compose.foundation.layout.FlowLayoutOverflow.OverflowType.Visible.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.foundation.layout.FlowLayoutOverflow.OverflowType.Clip.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.foundation.layout.FlowLayoutOverflow.OverflowType.ExpandIndicator.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.compose.foundation.layout.FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
