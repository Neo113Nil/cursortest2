package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0087\u0001\u0010\u0015\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f2\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;", "", "mainAxisMin", "crossAxisMin", "mainAxisMax", "crossAxisMax", "arrangementSpacingInt", "Landroidx/compose/ui/layout/MeasureScope;", "measureScope", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "startIndex", "endIndex", "", "crossAxisOffset", "currentLineIndex", "Landroidx/compose/ui/layout/MeasureResult;", "measure", "(Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;IIIIILandroidx/compose/ui/layout/MeasureScope;Ljava/util/List;[Landroidx/compose/ui/layout/Placeable;II[II)Landroidx/compose/ui/layout/MeasureResult;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RowColumnMeasurePolicyKt {
    /* JADX WARN: Removed duplicated region for block: B:46:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0279  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final androidx.compose.ui.layout.MeasureResult measure(androidx.compose.foundation.layout.RowColumnMeasurePolicy rowColumnMeasurePolicy, int i, int i2, int i3, int i4, int i5, androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, androidx.compose.ui.layout.Placeable[] placeableArr, int i6, int i7, int[] iArr, int i8) {
        int i9;
        int[] iArr2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int[] iArr3;
        float f;
        androidx.compose.foundation.layout.FlowLayoutData flowLayoutData;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int[] iArr4;
        int i22;
        androidx.compose.foundation.layout.FlowLayoutData flowLayoutData2;
        int i23 = i4;
        long j = i5;
        int i24 = i7 - i6;
        int[] iArr5 = new int[i24];
        int i25 = 0;
        int i26 = i6;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        float f2 = 0.0f;
        while (true) {
            java.lang.Integer num = null;
            i9 = Integer.MAX_VALUE;
            if (i26 >= i7) {
                break;
            }
            int i32 = i24;
            androidx.compose.ui.layout.Measurable measurable = list.get(i26);
            androidx.compose.foundation.layout.RowColumnParentData rowColumnParentData = androidx.compose.foundation.layout.RowColumnImplKt.getRowColumnParentData(measurable);
            float weight = androidx.compose.foundation.layout.RowColumnImplKt.getWeight(rowColumnParentData);
            i30 = (i30 != 0 || androidx.compose.foundation.layout.RowColumnImplKt.isRelative(rowColumnParentData)) ? 1 : i25;
            if (weight > 0.0f) {
                f2 += weight;
                i29++;
                i21 = i26;
                i22 = i32;
            } else {
                if (i23 != Integer.MAX_VALUE && rowColumnParentData != null && (flowLayoutData2 = rowColumnParentData.getFlowLayoutData()) != null) {
                    num = java.lang.Integer.valueOf(java.lang.Math.round(flowLayoutData2.getFillCrossAxisFraction() * i23));
                }
                int i33 = i3 - i31;
                androidx.compose.ui.layout.Placeable placeable = placeableArr[i26];
                if (placeable == null) {
                    i20 = i28;
                    i21 = i26;
                    iArr4 = iArr5;
                    i22 = i32;
                    placeable = measurable.mo7353measureBRTryo0(androidx.compose.foundation.layout.RowColumnMeasurePolicy.m1719createConstraintsxF2OJ5Q$default(rowColumnMeasurePolicy, 0, num != null ? num.intValue() : i25, i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i33 < 0 ? i25 : i33, num != null ? num.intValue() : i23, false, 16, null));
                } else {
                    i20 = i28;
                    i21 = i26;
                    iArr4 = iArr5;
                    i22 = i32;
                }
                int mainAxisSize = rowColumnMeasurePolicy.mainAxisSize(placeable);
                int crossAxisSize = rowColumnMeasurePolicy.crossAxisSize(placeable);
                iArr5 = iArr4;
                iArr5[i21 - i6] = mainAxisSize;
                int i34 = i33 - mainAxisSize;
                if (i34 < 0) {
                    i34 = 0;
                }
                int min = java.lang.Math.min(i5, i34);
                i31 += mainAxisSize + min;
                int max = java.lang.Math.max(i20, crossAxisSize);
                placeableArr[i21] = placeable;
                i27 = min;
                i28 = max;
            }
            i26 = i21 + 1;
            i23 = i4;
            i24 = i22;
            i25 = 0;
        }
        int i35 = i28;
        int i36 = i24;
        if (i29 == 0) {
            i31 -= i27;
            i13 = i35;
            iArr2 = iArr5;
            i12 = 0;
            i10 = 0;
        } else {
            long j2 = j * (i29 - 1);
            long j3 = ((i3 != Integer.MAX_VALUE ? i3 : i) - i31) - j2;
            if (j3 < 0) {
                j3 = 0;
            }
            float f3 = j3 / f2;
            for (int i37 = i6; i37 < i7; i37++) {
                j3 -= java.lang.Math.round(androidx.compose.foundation.layout.RowColumnImplKt.getWeight(androidx.compose.foundation.layout.RowColumnImplKt.getRowColumnParentData(list.get(i37))) * f3);
            }
            int i38 = i6;
            long j4 = j3;
            int i39 = 0;
            while (i38 < i7) {
                if (placeableArr[i38] == null) {
                    androidx.compose.ui.layout.Measurable measurable2 = list.get(i38);
                    androidx.compose.foundation.layout.RowColumnParentData rowColumnParentData2 = androidx.compose.foundation.layout.RowColumnImplKt.getRowColumnParentData(measurable2);
                    float weight2 = androidx.compose.foundation.layout.RowColumnImplKt.getWeight(rowColumnParentData2);
                    int i40 = i35;
                    java.lang.Integer valueOf = (i4 == i9 || rowColumnParentData2 == null || (flowLayoutData = rowColumnParentData2.getFlowLayoutData()) == null) ? null : java.lang.Integer.valueOf(java.lang.Math.round(flowLayoutData.getFillCrossAxisFraction() * i4));
                    if (weight2 <= 0.0f) {
                        androidx.compose.foundation.layout.internal.InlineClassHelperKt.throwIllegalStateException("All weights <= 0 should have placeables");
                    }
                    int sign = kotlin.math.MathKt.getSign(j4);
                    iArr3 = iArr5;
                    long j5 = sign;
                    int max2 = java.lang.Math.max(0, java.lang.Math.round(weight2 * f3) + sign);
                    i15 = Integer.MAX_VALUE;
                    i16 = i38;
                    f = f3;
                    androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable2.mo7353measureBRTryo0(rowColumnMeasurePolicy.mo1627createConstraintsxF2OJ5Q((!androidx.compose.foundation.layout.RowColumnImplKt.getFill(rowColumnParentData2) || max2 == Integer.MAX_VALUE) ? 0 : max2, valueOf != null ? valueOf.intValue() : 0, max2, valueOf != null ? valueOf.intValue() : i4, true));
                    int mainAxisSize2 = rowColumnMeasurePolicy.mainAxisSize(mo7353measureBRTryo0);
                    int crossAxisSize2 = rowColumnMeasurePolicy.crossAxisSize(mo7353measureBRTryo0);
                    iArr3[i16 - i6] = mainAxisSize2;
                    i39 += mainAxisSize2;
                    int max3 = java.lang.Math.max(i40, crossAxisSize2);
                    placeableArr[i16] = mo7353measureBRTryo0;
                    j4 -= j5;
                    i35 = max3;
                } else {
                    i15 = i9;
                    i16 = i38;
                    iArr3 = iArr5;
                    f = f3;
                }
                i38 = i16 + 1;
                i9 = i15;
                f3 = f;
                iArr5 = iArr3;
            }
            int i41 = i35;
            iArr2 = iArr5;
            i10 = 0;
            int i42 = (int) (i39 + j2);
            i11 = i3 - i31;
            i12 = i42 < 0 ? 0 : i42;
            if (i12 > i11) {
                i14 = i41;
                if (i30 == 0) {
                    int i43 = i10;
                    i17 = i43;
                    for (int i44 = i6; i44 < i7; i44++) {
                        androidx.compose.ui.layout.Placeable placeable2 = placeableArr[i44];
                        kotlin.jvm.internal.Intrinsics.checkNotNull(placeable2);
                        androidx.compose.foundation.layout.CrossAxisAlignment crossAxisAlignment = androidx.compose.foundation.layout.RowColumnImplKt.getCrossAxisAlignment(androidx.compose.foundation.layout.RowColumnImplKt.getRowColumnParentData(placeable2));
                        java.lang.Integer calculateAlignmentLinePosition$foundation_layout = crossAxisAlignment != null ? crossAxisAlignment.calculateAlignmentLinePosition$foundation_layout(placeable2) : null;
                        if (calculateAlignmentLinePosition$foundation_layout != null) {
                            int intValue = calculateAlignmentLinePosition$foundation_layout.intValue();
                            int crossAxisSize3 = rowColumnMeasurePolicy.crossAxisSize(placeable2);
                            i43 = java.lang.Math.max(i43, intValue != Integer.MIN_VALUE ? calculateAlignmentLinePosition$foundation_layout.intValue() : i10);
                            if (intValue == Integer.MIN_VALUE) {
                                intValue = crossAxisSize3;
                            }
                            i17 = java.lang.Math.max(i17, crossAxisSize3 - intValue);
                        }
                    }
                    i18 = i43;
                } else {
                    i17 = i10;
                    i18 = i17;
                }
                i19 = i31 + i11;
                if (i19 < 0) {
                    i19 = i10;
                }
                int max4 = java.lang.Math.max(i19, i);
                int max5 = java.lang.Math.max(i14, java.lang.Math.max(i2, i17 + i18));
                int[] iArr6 = new int[i36];
                rowColumnMeasurePolicy.populateMainAxisPositions(max4, iArr2, iArr6, measureScope);
                return rowColumnMeasurePolicy.placeHelper(placeableArr, measureScope, i18, iArr6, max4, max5, iArr, i8, i6, i7);
            }
            i13 = i41;
        }
        i11 = i12;
        i14 = i13;
        if (i30 == 0) {
        }
        i19 = i31 + i11;
        if (i19 < 0) {
        }
        int max42 = java.lang.Math.max(i19, i);
        int max52 = java.lang.Math.max(i14, java.lang.Math.max(i2, i17 + i18));
        int[] iArr62 = new int[i36];
        rowColumnMeasurePolicy.populateMainAxisPositions(max42, iArr2, iArr62, measureScope);
        return rowColumnMeasurePolicy.placeHelper(placeableArr, measureScope, i18, iArr62, max42, max52, iArr, i8, i6, i7);
    }
}
