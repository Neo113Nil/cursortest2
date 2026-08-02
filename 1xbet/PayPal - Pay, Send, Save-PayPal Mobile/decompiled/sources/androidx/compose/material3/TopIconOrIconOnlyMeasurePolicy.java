package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0015\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0006\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0019\u001a\u00020\u0018*\u00020\u00162\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00170\u000f2\u0006\u0010\u0006\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0011\u0010\u001b\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b \u0010!R\u0011\u0010 \u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b\"\u0010!R\u0011\u0010\"\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b\u001d\u0010!R\u0011\u0010$\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b#\u0010!"}, d2 = {"Landroidx/compose/material3/TopIconOrIconOnlyMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "", "p0", "Lkotlin/Function0;", "", "p1", "Landroidx/compose/ui/unit/Dp;", "p2", "p3", "p4", "p5", "<init>", "(ZLkotlin/jvm/functions/Function0;FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "maxIntrinsicHeight", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I", "getHighSpeedVideoFpsRanges", "Z", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function0;", "Camera2StreamConfigurationMap", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizesFor", "getOutputFormats"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TopIconOrIconOnlyMeasurePolicy implements androidx.compose.ui.layout.MeasurePolicy {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final float Camera2StreamConfigurationMap;
    private final kotlin.jvm.functions.Function0<java.lang.Float> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final float getOutputFormats;

    private TopIconOrIconOnlyMeasurePolicy(boolean z, kotlin.jvm.functions.Function0<java.lang.Float> function0, float f, float f2, float f3, float f4) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoSizes = function0;
        this.getHighSpeedVideoFpsRanges = f;
        this.Camera2StreamConfigurationMap = f2;
        this.getHighSpeedVideoFpsRangesFor = f3;
        this.getOutputFormats = f4;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
        float floatValue = this.getHighSpeedVideoSizes.invoke().floatValue();
        long m8545copyZbe2FdA$default = androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list2 = list;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.layout.Measurable measurable = list.get(i);
            if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable), "icon")) {
                androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(androidx.compose.ui.unit.ConstraintsKt.m8573offsetNN6EwU(m8545copyZbe2FdA$default, -measureScope.mo1412roundToPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(this.getHighSpeedVideoFpsRanges * 2.0f)), -measureScope.mo1412roundToPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(this.Camera2StreamConfigurationMap * 2.0f))));
                int width = mo7353measureBRTryo0.getWidth() + measureScope.mo1412roundToPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(this.getHighSpeedVideoFpsRanges * 2.0f));
                int height = mo7353measureBRTryo0.getHeight() + measureScope.mo1412roundToPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(this.Camera2StreamConfigurationMap * 2.0f));
                int roundToInt = kotlin.math.MathKt.roundToInt(width * floatValue);
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    androidx.compose.ui.layout.Measurable measurable2 = list.get(i2);
                    if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable2), "indicatorRipple")) {
                        androidx.compose.ui.layout.Placeable mo7353measureBRTryo02 = measurable2.mo7353measureBRTryo0(androidx.compose.ui.unit.ConstraintsKt.m8569constrainN9IONVI(m8545copyZbe2FdA$default, androidx.compose.ui.unit.Constraints.INSTANCE.m8564fixedJhjzzOo(width, height)));
                        int size3 = list2.size();
                        for (int i3 = 0; i3 < size3; i3++) {
                            androidx.compose.ui.layout.Measurable measurable3 = list.get(i3);
                            if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable3), "indicator")) {
                                androidx.compose.ui.layout.Placeable mo7353measureBRTryo03 = measurable3.mo7353measureBRTryo0(androidx.compose.ui.unit.ConstraintsKt.m8569constrainN9IONVI(m8545copyZbe2FdA$default, androidx.compose.ui.unit.Constraints.INSTANCE.m8564fixedJhjzzOo(roundToInt, height)));
                                if (!this.getHighResolutionOutputSizeshNQ4ISI) {
                                    return androidx.compose.material3.NavigationItemKt.m3552access$placeIconX9ElhV4(measureScope, mo7353measureBRTryo0, mo7353measureBRTryo02, mo7353measureBRTryo03, j);
                                }
                                int size4 = list2.size();
                                for (int i4 = 0; i4 < size4; i4++) {
                                    androidx.compose.ui.layout.Measurable measurable4 = list.get(i4);
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable4), "label")) {
                                        return androidx.compose.material3.NavigationItemKt.m3554access$placeLabelAndTopIconqoqLrGI(measureScope, measurable4.mo7353measureBRTryo0(androidx.compose.ui.unit.ConstraintsKt.m8574offsetNN6EwU$default(m8545copyZbe2FdA$default, 0, -(mo7353measureBRTryo03.getHeight() + measureScope.mo1412roundToPx0680j_4(this.getHighSpeedVideoFpsRangesFor)), 1, null)), mo7353measureBRTryo0, mo7353measureBRTryo02, mo7353measureBRTryo03, j, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getOutputFormats);
                                    }
                                }
                                androidx.compose.ui.util.ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                                throw new kotlin.KotlinNothingValueException();
                            }
                        }
                        androidx.compose.ui.util.ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                        throw new kotlin.KotlinNothingValueException();
                    }
                }
                androidx.compose.ui.util.ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                throw new kotlin.KotlinNothingValueException();
            }
        }
        androidx.compose.ui.util.ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int i) {
        androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable;
        java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list2 = list;
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable2 = list.get(i2);
            if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.material3.internal.LayoutUtilKt.getLayoutId(intrinsicMeasurable2), "icon")) {
                int maxIntrinsicHeight = intrinsicMeasurable2.maxIntrinsicHeight(i);
                int size2 = list2.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        intrinsicMeasurable = null;
                        break;
                    }
                    intrinsicMeasurable = list.get(i3);
                    if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.material3.internal.LayoutUtilKt.getLayoutId(intrinsicMeasurable), "label")) {
                        break;
                    }
                    i3++;
                }
                androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable3 = intrinsicMeasurable;
                return maxIntrinsicHeight + (intrinsicMeasurable3 != null ? intrinsicMeasurable3.maxIntrinsicHeight(i) : 0) + intrinsicMeasureScope.mo1412roundToPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(this.getOutputFormats * 2.0f) + androidx.compose.ui.unit.Dp.m8601constructorimpl(this.Camera2StreamConfigurationMap * 2.0f)) + this.getHighSpeedVideoFpsRangesFor));
            }
        }
        androidx.compose.ui.util.ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new kotlin.KotlinNothingValueException();
    }

    public /* synthetic */ TopIconOrIconOnlyMeasurePolicy(boolean z, kotlin.jvm.functions.Function0 function0, float f, float f2, float f3, float f4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, function0, f, f2, f3, f4);
    }
}
