package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000f\u001a\u00020\f*\u00020\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0005\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroidx/compose/foundation/layout/BoxMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/ui/Alignment;", "p0", "", "p1", "<init>", "(Landroidx/compose/ui/Alignment;Z)V", "Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/Alignment;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Z", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class BoxMeasurePolicy implements androidx.compose.ui.layout.MeasurePolicy {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.ui.Alignment getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoFpsRanges;

    public BoxMeasurePolicy(androidx.compose.ui.Alignment alignment, boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = alignment;
        this.getHighSpeedVideoFpsRanges = z;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(final androidx.compose.ui.layout.MeasureScope measureScope, final java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
        boolean Camera2StreamConfigurationMap;
        boolean Camera2StreamConfigurationMap2;
        boolean Camera2StreamConfigurationMap3;
        int m8556getMinWidthimpl;
        int m8555getMinHeightimpl;
        androidx.compose.ui.layout.Placeable mo7353measureBRTryo0;
        if (list.isEmpty()) {
            return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j), androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j), null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.BoxMeasurePolicy$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    kotlin.Unit highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = androidx.compose.foundation.layout.BoxMeasurePolicy.getHighSpeedVideoFpsRangesFor();
                    return highSpeedVideoFpsRangesFor;
                }
            }, 4, null);
        }
        long m8543constructorimpl = this.getHighSpeedVideoFpsRanges ? j : androidx.compose.ui.unit.Constraints.m8543constructorimpl(j & androidx.compose.ui.unit.ConstraintsKt.MaxDimensionsAndFocusMask);
        if (list.size() == 1) {
            final androidx.compose.ui.layout.Measurable measurable = list.get(0);
            Camera2StreamConfigurationMap3 = androidx.compose.foundation.layout.BoxKt.Camera2StreamConfigurationMap(measurable);
            if (!Camera2StreamConfigurationMap3) {
                mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(m8543constructorimpl);
                m8556getMinWidthimpl = java.lang.Math.max(androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j), mo7353measureBRTryo0.getWidth());
                m8555getMinHeightimpl = java.lang.Math.max(androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j), mo7353measureBRTryo0.getHeight());
            } else {
                m8556getMinWidthimpl = androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j);
                m8555getMinHeightimpl = androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j);
                mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.INSTANCE.m8564fixedJhjzzOo(androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j), androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j)));
            }
            final int i = m8556getMinWidthimpl;
            final int i2 = m8555getMinHeightimpl;
            final androidx.compose.ui.layout.Placeable placeable = mo7353measureBRTryo0;
            return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, i, i2, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.BoxMeasurePolicy$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    kotlin.Unit highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = androidx.compose.foundation.layout.BoxMeasurePolicy.getHighSpeedVideoFpsRangesFor(androidx.compose.ui.layout.Placeable.this, measurable, measureScope, i, i2, this, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                    return highSpeedVideoFpsRangesFor;
                }
            }, 4, null);
        }
        final androidx.compose.ui.layout.Placeable[] placeableArr = new androidx.compose.ui.layout.Placeable[list.size()];
        final kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
        intRef.element = androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j);
        final kotlin.jvm.internal.Ref.IntRef intRef2 = new kotlin.jvm.internal.Ref.IntRef();
        intRef2.element = androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j);
        java.util.List<? extends androidx.compose.ui.layout.Measurable> list2 = list;
        int size = list2.size();
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            androidx.compose.ui.layout.Measurable measurable2 = list.get(i3);
            Camera2StreamConfigurationMap2 = androidx.compose.foundation.layout.BoxKt.Camera2StreamConfigurationMap(measurable2);
            if (Camera2StreamConfigurationMap2) {
                z = true;
            } else {
                androidx.compose.ui.layout.Placeable mo7353measureBRTryo02 = measurable2.mo7353measureBRTryo0(m8543constructorimpl);
                placeableArr[i3] = mo7353measureBRTryo02;
                intRef.element = java.lang.Math.max(intRef.element, mo7353measureBRTryo02.getWidth());
                intRef2.element = java.lang.Math.max(intRef2.element, mo7353measureBRTryo02.getHeight());
            }
        }
        if (z) {
            long Constraints = androidx.compose.ui.unit.ConstraintsKt.Constraints(intRef.element != Integer.MAX_VALUE ? intRef.element : 0, intRef.element, intRef2.element != Integer.MAX_VALUE ? intRef2.element : 0, intRef2.element);
            int size2 = list2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                androidx.compose.ui.layout.Measurable measurable3 = list.get(i4);
                Camera2StreamConfigurationMap = androidx.compose.foundation.layout.BoxKt.Camera2StreamConfigurationMap(measurable3);
                if (Camera2StreamConfigurationMap) {
                    placeableArr[i4] = measurable3.mo7353measureBRTryo0(Constraints);
                }
            }
        }
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, intRef.element, intRef2.element, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.BoxMeasurePolicy$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.compose.foundation.layout.BoxMeasurePolicy.getHighSpeedVideoFpsRanges(placeableArr, list, measureScope, intRef, intRef2, this, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                return highSpeedVideoFpsRanges;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor() {
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.ui.layout.Placeable placeable, androidx.compose.ui.layout.Measurable measurable, androidx.compose.ui.layout.MeasureScope measureScope, int i, int i2, androidx.compose.foundation.layout.BoxMeasurePolicy boxMeasurePolicy, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.foundation.layout.BoxKt.getHighSpeedVideoFpsRangesFor(placementScope, placeable, measurable, measureScope.getLayoutDirection(), i, i2, boxMeasurePolicy.getHighResolutionOutputSizeshNQ4ISI);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.ui.layout.Placeable[] placeableArr, java.util.List list, androidx.compose.ui.layout.MeasureScope measureScope, kotlin.jvm.internal.Ref.IntRef intRef, kotlin.jvm.internal.Ref.IntRef intRef2, androidx.compose.foundation.layout.BoxMeasurePolicy boxMeasurePolicy, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        int length = placeableArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            androidx.compose.ui.layout.Placeable placeable = placeableArr[i];
            kotlin.jvm.internal.Intrinsics.checkNotNull(placeable, "");
            androidx.compose.foundation.layout.BoxKt.getHighSpeedVideoFpsRangesFor(placementScope, placeable, (androidx.compose.ui.layout.Measurable) list.get(i2), measureScope.getLayoutDirection(), intRef.element, intRef2.element, boxMeasurePolicy.getHighResolutionOutputSizeshNQ4ISI);
            i++;
            i2++;
        }
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BoxMeasurePolicy(getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", getHighSpeedVideoFpsRanges=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (this.getHighResolutionOutputSizeshNQ4ISI.hashCode() * 31) + java.lang.Boolean.hashCode(this.getHighSpeedVideoFpsRanges);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.foundation.layout.BoxMeasurePolicy)) {
            return false;
        }
        androidx.compose.foundation.layout.BoxMeasurePolicy boxMeasurePolicy = (androidx.compose.foundation.layout.BoxMeasurePolicy) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, boxMeasurePolicy.getHighResolutionOutputSizeshNQ4ISI) && this.getHighSpeedVideoFpsRanges == boxMeasurePolicy.getHighSpeedVideoFpsRanges;
    }
}
