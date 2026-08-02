package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u001c\u001a\u00020\u0019*\u00020\u00152\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00162\u0006\u0010\u0006\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u001f\u001a\u00020\u000e*\u00020\u001d2\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00160\u00162\u0006\u0010\u0006\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010 J/\u0010!\u001a\u00020\u000e*\u00020\u001d2\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00160\u00162\u0006\u0010\u0006\u001a\u00020\u000eH\u0016¢\u0006\u0004\b!\u0010 J/\u0010\"\u001a\u00020\u000e*\u00020\u001d2\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00160\u00162\u0006\u0010\u0006\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010 J/\u0010#\u001a\u00020\u000e*\u00020\u001d2\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00160\u00162\u0006\u0010\u0006\u001a\u00020\u000eH\u0016¢\u0006\u0004\b#\u0010 JK\u0010$\u001a\u00020\u000e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00162\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0011¢\u0006\u0004\b$\u0010%J+\u0010&\u001a\u00020\u000e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00162\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u000e¢\u0006\u0004\b&\u0010'JK\u0010(\u001a\u00020\u000e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00162\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0011¢\u0006\u0004\b(\u0010%J\u0019\u0010&\u001a\u00020\u000e*\u00020\u001e2\u0006\u0010\u0004\u001a\u00020\u000e¢\u0006\u0004\b&\u0010)J\u0019\u0010(\u001a\u00020\u000e*\u00020\u001e2\u0006\u0010\u0004\u001a\u00020\u000e¢\u0006\u0004\b(\u0010)J\u0019\u0010*\u001a\u00020\u000e*\u00020\u001e2\u0006\u0010\u0004\u001a\u00020\u000e¢\u0006\u0004\b*\u0010)J\u001a\u0010,\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00101\u001a\u000200HÖ\u0001¢\u0006\u0004\b1\u00102R\u001a\u0010&\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b&\u00103\u001a\u0004\b4\u00105R\u001a\u0010$\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b$\u00106\u001a\u0004\b7\u00108R\u001a\u0010(\u001a\u00020\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010*\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010=R\u001a\u0010A\u001a\u00020\u000b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b(\u0010>\u001a\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bA\u0010=R\u0014\u0010E\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u00109\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bF\u0010DR\u0014\u0010F\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u0010G"}, d2 = {"Landroidx/compose/foundation/layout/FlowMeasurePolicy;", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;", "", "p0", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "p1", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "p2", "Landroidx/compose/ui/unit/Dp;", "p3", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "p4", "p5", "", "p6", "p7", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "p8", "<init>", "(ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/CrossAxisAlignment;FIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I", "minIntrinsicHeight", "maxIntrinsicHeight", "maxIntrinsicWidth", "Camera2StreamConfigurationMap", "(Ljava/util/List;IIIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)I", "getHighSpeedVideoFpsRanges", "(Ljava/util/List;II)I", "getHighSpeedVideoSizes", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "getHighResolutionOutputSizeshNQ4ISI", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "isHorizontal", "()Z", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getHorizontalArrangement", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getOutputMinFrameDuration", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "getVerticalArrangement", "()Landroidx/compose/foundation/layout/Arrangement$Vertical;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCrossAxisAlignment", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getHighSpeedVideoFpsRangesFor", "getInputFormats", "getOutputFormats", com.visa.cbp.getEncExpo.warmup, "getInputSizeshNQ4ISI", "getHighSpeedVideoSizesFor", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class FlowMeasurePolicy implements androidx.compose.ui.layout.MultiContentMeasurePolicy, androidx.compose.foundation.layout.FlowLineMeasurePolicy {
    private final androidx.compose.foundation.layout.Arrangement.Horizontal Camera2StreamConfigurationMap;
    private final float getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final float getInputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.layout.CrossAxisAlignment getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final int getOutputMinFrameDuration;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final androidx.compose.foundation.layout.FlowLayoutOverflowState getHighSpeedVideoSizesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final int getInputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final androidx.compose.foundation.layout.Arrangement.Vertical getHighSpeedVideoSizes;

    private FlowMeasurePolicy(boolean z, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.foundation.layout.Arrangement.Vertical vertical, float f, androidx.compose.foundation.layout.CrossAxisAlignment crossAxisAlignment, float f2, int i, int i2, androidx.compose.foundation.layout.FlowLayoutOverflowState flowLayoutOverflowState) {
        this.getHighSpeedVideoFpsRanges = z;
        this.Camera2StreamConfigurationMap = horizontal;
        this.getHighSpeedVideoSizes = vertical;
        this.getHighResolutionOutputSizeshNQ4ISI = f;
        this.getHighSpeedVideoFpsRangesFor = crossAxisAlignment;
        this.getInputFormats = f2;
        this.getInputSizeshNQ4ISI = i;
        this.getOutputMinFrameDuration = i2;
        this.getHighSpeedVideoSizesFor = flowLayoutOverflowState;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    /* renamed from: isHorizontal, reason: from getter */
    public final boolean getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    /* renamed from: getHorizontalArrangement, reason: from getter */
    public final androidx.compose.foundation.layout.Arrangement.Horizontal getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    /* renamed from: getVerticalArrangement, reason: from getter */
    public final androidx.compose.foundation.layout.Arrangement.Vertical getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.compose.foundation.layout.FlowLineMeasurePolicy
    /* renamed from: getCrossAxisAlignment, reason: from getter */
    public final androidx.compose.foundation.layout.CrossAxisAlignment getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s, reason: not valid java name */
    public final androidx.compose.ui.layout.MeasureResult mo1663measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends java.util.List<? extends androidx.compose.ui.layout.Measurable>> list, long j) {
        androidx.compose.foundation.layout.LayoutOrientation layoutOrientation;
        if (this.getOutputMinFrameDuration == 0 || this.getInputSizeshNQ4ISI == 0 || list.isEmpty() || (androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j) == 0 && this.getHighSpeedVideoSizesFor.getType$foundation_layout() != androidx.compose.foundation.layout.FlowLayoutOverflow.OverflowType.Visible)) {
            return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, 0, 0, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    kotlin.Unit Camera2StreamConfigurationMap;
                    Camera2StreamConfigurationMap = androidx.compose.foundation.layout.FlowMeasurePolicy.Camera2StreamConfigurationMap();
                    return Camera2StreamConfigurationMap;
                }
            }, 4, null);
        }
        java.util.List list2 = (java.util.List) kotlin.collections.CollectionsKt.first((java.util.List) list);
        if (list2.isEmpty()) {
            return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, 0, 0, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.FlowMeasurePolicy$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.layout.FlowMeasurePolicy.getHighResolutionOutputSizeshNQ4ISI();
                    return highResolutionOutputSizeshNQ4ISI;
                }
            }, 4, null);
        }
        java.util.List list3 = (java.util.List) kotlin.collections.CollectionsKt.getOrNull(list, 1);
        androidx.compose.ui.layout.Measurable measurable = list3 != null ? (androidx.compose.ui.layout.Measurable) kotlin.collections.CollectionsKt.firstOrNull(list3) : null;
        java.util.List list4 = (java.util.List) kotlin.collections.CollectionsKt.getOrNull(list, 2);
        androidx.compose.ui.layout.Measurable measurable2 = list4 != null ? (androidx.compose.ui.layout.Measurable) kotlin.collections.CollectionsKt.firstOrNull(list4) : null;
        this.getHighSpeedVideoSizesFor.setItemCount$foundation_layout(list2.size());
        androidx.compose.foundation.layout.FlowMeasurePolicy flowMeasurePolicy = this;
        this.getHighSpeedVideoSizesFor.m1654setOverflowMeasurableshBUhpc$foundation_layout(flowMeasurePolicy, measurable, measurable2, j);
        java.util.Iterator it = list2.iterator();
        float f = this.getHighResolutionOutputSizeshNQ4ISI;
        float f2 = this.getInputFormats;
        if (getGetHighSpeedVideoFpsRanges()) {
            layoutOrientation = androidx.compose.foundation.layout.LayoutOrientation.Horizontal;
        } else {
            layoutOrientation = androidx.compose.foundation.layout.LayoutOrientation.Vertical;
        }
        return androidx.compose.foundation.layout.FlowLayoutKt.m1648breakDownItemsdi9J0FM(measureScope, flowMeasurePolicy, it, f, f2, androidx.compose.foundation.layout.OrientationIndependentConstraints.m1682constructorimpl(j, layoutOrientation), this.getInputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getHighSpeedVideoSizesFor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap() {
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI() {
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>> list, int i) {
        androidx.compose.foundation.layout.FlowLayoutOverflowState flowLayoutOverflowState = this.getHighSpeedVideoSizesFor;
        java.util.List list2 = (java.util.List) kotlin.collections.CollectionsKt.getOrNull(list, 1);
        androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (androidx.compose.ui.layout.IntrinsicMeasurable) kotlin.collections.CollectionsKt.firstOrNull(list2) : null;
        java.util.List list3 = (java.util.List) kotlin.collections.CollectionsKt.getOrNull(list, 2);
        flowLayoutOverflowState.m1655setOverflowMeasurableshBUhpc$foundation_layout(intrinsicMeasurable, list3 != null ? (androidx.compose.ui.layout.IntrinsicMeasurable) kotlin.collections.CollectionsKt.firstOrNull(list3) : null, getGetHighSpeedVideoFpsRanges(), androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null));
        if (getGetHighSpeedVideoFpsRanges()) {
            java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list4 = (java.util.List) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) list);
            if (list4 == null) {
                list4 = kotlin.collections.CollectionsKt.emptyList();
            }
            return Camera2StreamConfigurationMap(list4, i, intrinsicMeasureScope.mo1412roundToPx0680j_4(this.getHighResolutionOutputSizeshNQ4ISI), intrinsicMeasureScope.mo1412roundToPx0680j_4(this.getInputFormats), this.getInputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getHighSpeedVideoSizesFor);
        }
        java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list5 = (java.util.List) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) list);
        if (list5 == null) {
            list5 = kotlin.collections.CollectionsKt.emptyList();
        }
        return getHighSpeedVideoSizes(list5, i, intrinsicMeasureScope.mo1412roundToPx0680j_4(this.getHighResolutionOutputSizeshNQ4ISI), intrinsicMeasureScope.mo1412roundToPx0680j_4(this.getInputFormats), this.getInputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getHighSpeedVideoSizesFor);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>> list, int i) {
        androidx.compose.foundation.layout.FlowLayoutOverflowState flowLayoutOverflowState = this.getHighSpeedVideoSizesFor;
        java.util.List list2 = (java.util.List) kotlin.collections.CollectionsKt.getOrNull(list, 1);
        androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (androidx.compose.ui.layout.IntrinsicMeasurable) kotlin.collections.CollectionsKt.firstOrNull(list2) : null;
        java.util.List list3 = (java.util.List) kotlin.collections.CollectionsKt.getOrNull(list, 2);
        flowLayoutOverflowState.m1655setOverflowMeasurableshBUhpc$foundation_layout(intrinsicMeasurable, list3 != null ? (androidx.compose.ui.layout.IntrinsicMeasurable) kotlin.collections.CollectionsKt.firstOrNull(list3) : null, getGetHighSpeedVideoFpsRanges(), androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null));
        if (getGetHighSpeedVideoFpsRanges()) {
            java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list4 = (java.util.List) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) list);
            if (list4 == null) {
                list4 = kotlin.collections.CollectionsKt.emptyList();
            }
            return getHighSpeedVideoSizes(list4, i, intrinsicMeasureScope.mo1412roundToPx0680j_4(this.getHighResolutionOutputSizeshNQ4ISI), intrinsicMeasureScope.mo1412roundToPx0680j_4(this.getInputFormats), this.getInputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getHighSpeedVideoSizesFor);
        }
        java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list5 = (java.util.List) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) list);
        if (list5 == null) {
            list5 = kotlin.collections.CollectionsKt.emptyList();
        }
        return Camera2StreamConfigurationMap(list5, i, intrinsicMeasureScope.mo1412roundToPx0680j_4(this.getHighResolutionOutputSizeshNQ4ISI), intrinsicMeasureScope.mo1412roundToPx0680j_4(this.getInputFormats), this.getInputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getHighSpeedVideoSizesFor);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>> list, int i) {
        androidx.compose.foundation.layout.FlowLayoutOverflowState flowLayoutOverflowState = this.getHighSpeedVideoSizesFor;
        java.util.List list2 = (java.util.List) kotlin.collections.CollectionsKt.getOrNull(list, 1);
        androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (androidx.compose.ui.layout.IntrinsicMeasurable) kotlin.collections.CollectionsKt.firstOrNull(list2) : null;
        java.util.List list3 = (java.util.List) kotlin.collections.CollectionsKt.getOrNull(list, 2);
        flowLayoutOverflowState.m1655setOverflowMeasurableshBUhpc$foundation_layout(intrinsicMeasurable, list3 != null ? (androidx.compose.ui.layout.IntrinsicMeasurable) kotlin.collections.CollectionsKt.firstOrNull(list3) : null, getGetHighSpeedVideoFpsRanges(), androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null));
        if (getGetHighSpeedVideoFpsRanges()) {
            java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list4 = (java.util.List) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) list);
            if (list4 == null) {
                list4 = kotlin.collections.CollectionsKt.emptyList();
            }
            return getHighSpeedVideoSizes(list4, i, intrinsicMeasureScope.mo1412roundToPx0680j_4(this.getHighResolutionOutputSizeshNQ4ISI), intrinsicMeasureScope.mo1412roundToPx0680j_4(this.getInputFormats), this.getInputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getHighSpeedVideoSizesFor);
        }
        java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list5 = (java.util.List) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) list);
        if (list5 == null) {
            list5 = kotlin.collections.CollectionsKt.emptyList();
        }
        return getHighSpeedVideoFpsRanges(list5, i, intrinsicMeasureScope.mo1412roundToPx0680j_4(this.getHighResolutionOutputSizeshNQ4ISI));
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable>> list, int i) {
        androidx.compose.foundation.layout.FlowLayoutOverflowState flowLayoutOverflowState = this.getHighSpeedVideoSizesFor;
        java.util.List list2 = (java.util.List) kotlin.collections.CollectionsKt.getOrNull(list, 1);
        androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (androidx.compose.ui.layout.IntrinsicMeasurable) kotlin.collections.CollectionsKt.firstOrNull(list2) : null;
        java.util.List list3 = (java.util.List) kotlin.collections.CollectionsKt.getOrNull(list, 2);
        flowLayoutOverflowState.m1655setOverflowMeasurableshBUhpc$foundation_layout(intrinsicMeasurable, list3 != null ? (androidx.compose.ui.layout.IntrinsicMeasurable) kotlin.collections.CollectionsKt.firstOrNull(list3) : null, getGetHighSpeedVideoFpsRanges(), androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null));
        if (getGetHighSpeedVideoFpsRanges()) {
            java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list4 = (java.util.List) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) list);
            if (list4 == null) {
                list4 = kotlin.collections.CollectionsKt.emptyList();
            }
            return getHighSpeedVideoFpsRanges(list4, i, intrinsicMeasureScope.mo1412roundToPx0680j_4(this.getHighResolutionOutputSizeshNQ4ISI));
        }
        java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list5 = (java.util.List) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) list);
        if (list5 == null) {
            list5 = kotlin.collections.CollectionsKt.emptyList();
        }
        return getHighSpeedVideoSizes(list5, i, intrinsicMeasureScope.mo1412roundToPx0680j_4(this.getHighResolutionOutputSizeshNQ4ISI), intrinsicMeasureScope.mo1412roundToPx0680j_4(this.getInputFormats), this.getInputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getHighSpeedVideoSizesFor);
    }

    private int getHighSpeedVideoFpsRanges(java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> p0, int p1, int p2) {
        int i = this.getInputSizeshNQ4ISI;
        int size = p0.size();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 < size) {
            int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(p0.get(i2), p1) + p2;
            int i6 = i2 + 1;
            if (i6 - i4 == i || i6 == p0.size()) {
                i3 = java.lang.Math.max(i3, (i5 + highSpeedVideoFpsRanges) - p2);
                i5 = 0;
                i4 = i2;
            } else {
                i5 += highSpeedVideoFpsRanges;
            }
            i2 = i6;
        }
        return i3;
    }

    private int getHighSpeedVideoFpsRanges(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        return getGetHighSpeedVideoFpsRanges() ? intrinsicMeasurable.maxIntrinsicWidth(i) : intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    private int getHighSpeedVideoSizes(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        return getGetHighSpeedVideoFpsRanges() ? intrinsicMeasurable.minIntrinsicHeight(i) : intrinsicMeasurable.minIntrinsicWidth(i);
    }

    private int getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, int i) {
        return getGetHighSpeedVideoFpsRanges() ? intrinsicMeasurable.minIntrinsicWidth(i) : intrinsicMeasurable.minIntrinsicHeight(i);
    }

    private int Camera2StreamConfigurationMap(java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> p0, int p1, int p2, int p3, int p4, int p5, androidx.compose.foundation.layout.FlowLayoutOverflowState p6) {
        long Camera2StreamConfigurationMap;
        if (p0.isEmpty()) {
            return 0;
        }
        int size = p0.size();
        int[] iArr = new int[size];
        int size2 = p0.size();
        int[] iArr2 = new int[size2];
        int size3 = p0.size();
        for (int i = 0; i < size3; i++) {
            androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable = p0.get(i);
            int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(intrinsicMeasurable, p1);
            iArr[i] = highResolutionOutputSizeshNQ4ISI;
            iArr2[i] = getHighSpeedVideoSizes(intrinsicMeasurable, highResolutionOutputSizeshNQ4ISI);
        }
        int i2 = Integer.MAX_VALUE;
        if (p5 != Integer.MAX_VALUE && p4 != Integer.MAX_VALUE) {
            i2 = p4 * p5;
        }
        int i3 = 1;
        int min = java.lang.Math.min(i2 - (((i2 >= p0.size() || !(p6.getType$foundation_layout() == androidx.compose.foundation.layout.FlowLayoutOverflow.OverflowType.ExpandIndicator || p6.getType$foundation_layout() == androidx.compose.foundation.layout.FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) && (i2 < p0.size() || p5 < p6.getMinLinesToShowCollapse$foundation_layout() || p6.getType$foundation_layout() != androidx.compose.foundation.layout.FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) ? 0 : 1), p0.size());
        int sum = kotlin.collections.ArraysKt.sum(iArr) + ((p0.size() - 1) * p2);
        if (size2 != 0) {
            int i4 = iArr2[0];
            int lastIndex = kotlin.collections.ArraysKt.getLastIndex(iArr2);
            if (lastIndex > 0) {
                int i5 = 1;
                while (true) {
                    int i6 = iArr2[i5];
                    if (i4 < i6) {
                        i4 = i6;
                    }
                    if (i5 == lastIndex) {
                        break;
                    }
                    i5++;
                }
            }
            if (size != 0) {
                int i7 = iArr[0];
                int lastIndex2 = kotlin.collections.ArraysKt.getLastIndex(iArr);
                if (lastIndex2 > 0) {
                    while (true) {
                        int i8 = iArr[i3];
                        if (i7 < i8) {
                            i7 = i8;
                        }
                        if (i3 == lastIndex2) {
                            break;
                        }
                        i3++;
                    }
                }
                int i9 = i7;
                int i10 = sum;
                while (i9 <= i10 && i4 != p1) {
                    int i11 = (i9 + i10) / 2;
                    int i12 = i10;
                    int i13 = i9;
                    int i14 = min;
                    Camera2StreamConfigurationMap = androidx.compose.foundation.layout.FlowLayoutKt.Camera2StreamConfigurationMap(p0, iArr, iArr2, i11, p2, p3, p4, p5, p6);
                    i4 = androidx.collection.IntIntPair.m1086getFirstimpl(Camera2StreamConfigurationMap);
                    int m1087getSecondimpl = androidx.collection.IntIntPair.m1087getSecondimpl(Camera2StreamConfigurationMap);
                    if (i4 > p1 || m1087getSecondimpl < i14) {
                        int i15 = i11 + 1;
                        if (i15 > i12) {
                            return i15;
                        }
                        i10 = i12;
                        i9 = i15;
                    } else {
                        if (i4 >= p1) {
                            return i11;
                        }
                        i10 = i11 - 1;
                        i9 = i13;
                    }
                    min = i14;
                    sum = i11;
                }
                return sum;
            }
            throw new java.util.NoSuchElementException();
        }
        throw new java.util.NoSuchElementException();
    }

    private int getHighSpeedVideoSizes(java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> p0, int p1, int p2, int p3, int p4, int p5, androidx.compose.foundation.layout.FlowLayoutOverflowState p6) {
        long m1082constructorimpl;
        int i;
        if (p0.isEmpty()) {
            m1082constructorimpl = androidx.collection.IntIntPair.m1082constructorimpl(0, 0);
        } else {
            androidx.compose.foundation.layout.FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new androidx.compose.foundation.layout.FlowLayoutBuildingBlocks(p4, p6, androidx.compose.foundation.layout.OrientationIndependentConstraints.m1681constructorimpl(0, p1, 0, Integer.MAX_VALUE), p5, p2, p3, null);
            androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable = (androidx.compose.ui.layout.IntrinsicMeasurable) kotlin.collections.CollectionsKt.getOrNull(p0, 0);
            int highSpeedVideoSizes = intrinsicMeasurable != null ? getHighSpeedVideoSizes(intrinsicMeasurable, p1) : 0;
            int highResolutionOutputSizeshNQ4ISI = intrinsicMeasurable != null ? getHighResolutionOutputSizeshNQ4ISI(intrinsicMeasurable, highSpeedVideoSizes) : 0;
            if (flowLayoutBuildingBlocks.m1644getWrapInfoOpUlnko(p0.size() > 1, 0, androidx.collection.IntIntPair.m1082constructorimpl(p1, Integer.MAX_VALUE), intrinsicMeasurable == null ? null : androidx.collection.IntIntPair.m1079boximpl(androidx.collection.IntIntPair.m1082constructorimpl(highResolutionOutputSizeshNQ4ISI, highSpeedVideoSizes)), 0, 0, 0, false, false).getIsLastItemInContainer()) {
                androidx.collection.IntIntPair m1653ellipsisSizeF35zmw$foundation_layout = p6.m1653ellipsisSizeF35zmw$foundation_layout(intrinsicMeasurable != null, 0, 0);
                m1082constructorimpl = androidx.collection.IntIntPair.m1082constructorimpl(m1653ellipsisSizeF35zmw$foundation_layout != null ? androidx.collection.IntIntPair.m1087getSecondimpl(m1653ellipsisSizeF35zmw$foundation_layout.getPackedValue()) : 0, 0);
            } else {
                int size = p0.size();
                int i2 = p1;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                while (true) {
                    if (i4 >= size) {
                        break;
                    }
                    int i9 = i2 - highResolutionOutputSizeshNQ4ISI;
                    int i10 = i4 + 1;
                    int max = java.lang.Math.max(i5, highSpeedVideoSizes);
                    androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable2 = (androidx.compose.ui.layout.IntrinsicMeasurable) kotlin.collections.CollectionsKt.getOrNull(p0, i10);
                    int highSpeedVideoSizes2 = intrinsicMeasurable2 != null ? getHighSpeedVideoSizes(intrinsicMeasurable2, p1) : 0;
                    int highResolutionOutputSizeshNQ4ISI2 = intrinsicMeasurable2 != null ? getHighResolutionOutputSizeshNQ4ISI(intrinsicMeasurable2, highSpeedVideoSizes2) + p2 : 0;
                    boolean z = i4 + 2 < p0.size();
                    int i11 = i10 - i7;
                    int i12 = highResolutionOutputSizeshNQ4ISI2;
                    int i13 = highSpeedVideoSizes2;
                    androidx.compose.foundation.layout.FlowLayoutBuildingBlocks.WrapInfo m1644getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m1644getWrapInfoOpUlnko(z, i11, androidx.collection.IntIntPair.m1082constructorimpl(i9, Integer.MAX_VALUE), intrinsicMeasurable2 == null ? null : androidx.collection.IntIntPair.m1079boximpl(androidx.collection.IntIntPair.m1082constructorimpl(highResolutionOutputSizeshNQ4ISI2, highSpeedVideoSizes2)), i8, i3, max, false, false);
                    if (m1644getWrapInfoOpUlnko.getIsLastItemInLine()) {
                        i3 += max + p3;
                        androidx.compose.foundation.layout.FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo = flowLayoutBuildingBlocks.getWrapEllipsisInfo(m1644getWrapInfoOpUlnko, intrinsicMeasurable2 != null, i8, i3, i9, i11);
                        i8++;
                        if (m1644getWrapInfoOpUlnko.getIsLastItemInContainer()) {
                            if (wrapEllipsisInfo != null) {
                                long ellipsisSize = wrapEllipsisInfo.getEllipsisSize();
                                if (!wrapEllipsisInfo.getPlaceEllipsisOnLastContentLine()) {
                                    i3 += androidx.collection.IntIntPair.m1087getSecondimpl(ellipsisSize) + p3;
                                }
                            }
                            i6 = i10;
                        } else {
                            i = p1;
                            i7 = i10;
                            i5 = 0;
                            highResolutionOutputSizeshNQ4ISI = i12 - p2;
                        }
                    } else {
                        i5 = max;
                        i = i9;
                        highResolutionOutputSizeshNQ4ISI = i12;
                    }
                    i4 = i10;
                    i6 = i4;
                    i2 = i;
                    highSpeedVideoSizes = i13;
                }
                m1082constructorimpl = androidx.collection.IntIntPair.m1082constructorimpl(i3 - p3, i6);
            }
        }
        return androidx.collection.IntIntPair.m1086getFirstimpl(m1082constructorimpl);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FlowMeasurePolicy(getHighSpeedVideoFpsRanges=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", getHighSpeedVideoSizes=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
        sb.append((java.lang.Object) androidx.compose.ui.unit.Dp.m8612toStringimpl(this.getHighResolutionOutputSizeshNQ4ISI));
        sb.append(", getHighSpeedVideoFpsRangesFor=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", getInputFormats=");
        sb.append((java.lang.Object) androidx.compose.ui.unit.Dp.m8612toStringimpl(this.getInputFormats));
        sb.append(", getInputSizeshNQ4ISI=");
        sb.append(this.getInputSizeshNQ4ISI);
        sb.append(", getOutputMinFrameDuration=");
        sb.append(this.getOutputMinFrameDuration);
        sb.append(", getHighSpeedVideoSizesFor=");
        sb.append(this.getHighSpeedVideoSizesFor);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((((((java.lang.Boolean.hashCode(this.getHighSpeedVideoFpsRanges) * 31) + this.Camera2StreamConfigurationMap.hashCode()) * 31) + this.getHighSpeedVideoSizes.hashCode()) * 31) + androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI)) * 31) + this.getHighSpeedVideoFpsRangesFor.hashCode()) * 31) + androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.getInputFormats)) * 31) + java.lang.Integer.hashCode(this.getInputSizeshNQ4ISI)) * 31) + java.lang.Integer.hashCode(this.getOutputMinFrameDuration)) * 31) + this.getHighSpeedVideoSizesFor.hashCode();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.foundation.layout.FlowMeasurePolicy)) {
            return false;
        }
        androidx.compose.foundation.layout.FlowMeasurePolicy flowMeasurePolicy = (androidx.compose.foundation.layout.FlowMeasurePolicy) p0;
        return this.getHighSpeedVideoFpsRanges == flowMeasurePolicy.getHighSpeedVideoFpsRanges && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, flowMeasurePolicy.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, flowMeasurePolicy.getHighSpeedVideoSizes) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getHighResolutionOutputSizeshNQ4ISI, flowMeasurePolicy.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, flowMeasurePolicy.getHighSpeedVideoFpsRangesFor) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getInputFormats, flowMeasurePolicy.getInputFormats) && this.getInputSizeshNQ4ISI == flowMeasurePolicy.getInputSizeshNQ4ISI && this.getOutputMinFrameDuration == flowMeasurePolicy.getOutputMinFrameDuration && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizesFor, flowMeasurePolicy.getHighSpeedVideoSizesFor);
    }

    public /* synthetic */ FlowMeasurePolicy(boolean z, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.foundation.layout.Arrangement.Vertical vertical, float f, androidx.compose.foundation.layout.CrossAxisAlignment crossAxisAlignment, float f2, int i, int i2, androidx.compose.foundation.layout.FlowLayoutOverflowState flowLayoutOverflowState, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, horizontal, vertical, f, crossAxisAlignment, f2, i, i2, flowLayoutOverflowState);
    }
}
