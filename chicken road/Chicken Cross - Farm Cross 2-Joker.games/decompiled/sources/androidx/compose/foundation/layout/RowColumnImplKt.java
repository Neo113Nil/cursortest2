package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.ironsource.U3;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: RowColumnImpl.kt */
@Metadata(d1 = {"\u0000p\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a.\u0010\u0012\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002\u001a.\u0010\u0018\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002\u001a.\u0010\u0019\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002\u001a.\u0010\u001a\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002\u001ad\u0010\u001b\u001a\u00020\u00152\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u00142\u001d\u0010\u001d\u001a\u0019\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u001e¢\u0006\u0002\b\u001f2\u001d\u0010 \u001a\u0019\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u001e¢\u0006\u0002\b\u001f2\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u0015H\u0002\u001aE\u0010#\u001a\u00020\u00152\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u00142\u001d\u0010\u001d\u001a\u0019\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u001e¢\u0006\u0002\b\u001f2\u0006\u0010$\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u0015H\u0002\u001at\u0010%\u001a\u00020\u00152\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u00142\u001d\u0010&\u001a\u0019\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u001e¢\u0006\u0002\b\u001f2\u001d\u0010'\u001a\u0019\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u001e¢\u0006\u0002\b\u001f2\u0006\u0010$\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u0017H\u0002\u001aa\u0010*\u001a\u00020+2\u0006\u0010\u0016\u001a\u00020\u00172*\u0010,\u001a&\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u0002010-2\u0006\u00102\u001a\u0002032\u0006\u0010 \u001a\u0002042\u0006\u0010\u0000\u001a\u00020\u0001H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u00106\"\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u001a\u0010\t\u001a\u00020\n*\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u001a\u0010\r\u001a\u00020\n*\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\f\"\u001a\u0010\u000e\u001a\u00020\u000f*\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00067"}, d2 = {"crossAxisAlignment", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "Landroidx/compose/foundation/layout/RowColumnParentData;", "getCrossAxisAlignment", "(Landroidx/compose/foundation/layout/RowColumnParentData;)Landroidx/compose/foundation/layout/CrossAxisAlignment;", "data", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "getData", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;", "fill", "", "getFill", "(Landroidx/compose/foundation/layout/RowColumnParentData;)Z", "isRelative", "weight", "", "getWeight", "(Landroidx/compose/foundation/layout/RowColumnParentData;)F", "MaxIntrinsicHeightMeasureBlock", "Lkotlin/Function3;", "", "", U3.i.n, "Landroidx/compose/foundation/layout/LayoutOrientation;", "MaxIntrinsicWidthMeasureBlock", "MinIntrinsicHeightMeasureBlock", "MinIntrinsicWidthMeasureBlock", "intrinsicCrossAxisSize", "children", "mainAxisSize", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "crossAxisSize", "mainAxisAvailable", "mainAxisSpacing", "intrinsicMainAxisSize", "crossAxisAvailable", "intrinsicSize", "intrinsicMainSize", "intrinsicCrossSize", "layoutOrientation", "intrinsicOrientation", "rowColumnMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "arrangement", "Lkotlin/Function5;", "", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "", "arrangementSpacing", "Landroidx/compose/ui/unit/Dp;", "Landroidx/compose/foundation/layout/SizeMode;", "rowColumnMeasurePolicy-TDGSqEk", "(Landroidx/compose/foundation/layout/LayoutOrientation;Lkotlin/jvm/functions/Function5;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;)Landroidx/compose/ui/layout/MeasurePolicy;", "foundation-layout_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RowColumnImplKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int rowColumnMeasurePolicy_TDGSqEk$mainAxisSize(Placeable placeable, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? placeable.getWidth() : placeable.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(Placeable placeable, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? placeable.getHeight() : placeable.getWidth();
    }

    /* renamed from: rowColumnMeasurePolicy-TDGSqEk, reason: not valid java name */
    public static final MeasurePolicy m441rowColumnMeasurePolicyTDGSqEk(final LayoutOrientation orientation, final Function5<? super Integer, ? super int[], ? super LayoutDirection, ? super Density, ? super int[], Unit> arrangement, final float f, final SizeMode crossAxisSize, final CrossAxisAlignment crossAxisAlignment) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(arrangement, "arrangement");
        Intrinsics.checkNotNullParameter(crossAxisSize, "crossAxisSize");
        Intrinsics.checkNotNullParameter(crossAxisAlignment, "crossAxisAlignment");
        return new MeasurePolicy() { // from class: androidx.compose.foundation.layout.RowColumnImplKt$rowColumnMeasurePolicy$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public MeasureResult mo15measure3p2s80s(final MeasureScope measure, final List<? extends Measurable> list, long j) {
                int mainAxisMin;
                int i;
                int coerceAtMost;
                float f2;
                int i2;
                float weight;
                boolean fill;
                int i3;
                int rowColumnMeasurePolicy_TDGSqEk$mainAxisSize;
                int rowColumnMeasurePolicy_TDGSqEk$crossAxisSize;
                boolean z;
                boolean isRelative;
                float weight2;
                int i4;
                int max;
                CrossAxisAlignment crossAxisAlignment2;
                int rowColumnMeasurePolicy_TDGSqEk$crossAxisSize2;
                float weight3;
                int i5;
                int i6;
                RowColumnParentData[] rowColumnParentDataArr;
                int rowColumnMeasurePolicy_TDGSqEk$mainAxisSize2;
                int rowColumnMeasurePolicy_TDGSqEk$mainAxisSize3;
                int rowColumnMeasurePolicy_TDGSqEk$crossAxisSize3;
                boolean z2;
                boolean isRelative2;
                RowColumnParentData data;
                List<? extends Measurable> measurables = list;
                Intrinsics.checkNotNullParameter(measure, "$this$measure");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                OrientationIndependentConstraints orientationIndependentConstraints = new OrientationIndependentConstraints(j, LayoutOrientation.this, null);
                int i7 = measure.mo309roundToPx0680j_4(f);
                int size = list.size();
                final Placeable[] placeableArr = new Placeable[size];
                int size2 = list.size();
                RowColumnParentData[] rowColumnParentDataArr2 = new RowColumnParentData[size2];
                for (int i8 = 0; i8 < size2; i8++) {
                    data = RowColumnImplKt.getData(measurables.get(i8));
                    rowColumnParentDataArr2[i8] = data;
                }
                int size3 = list.size();
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                boolean z3 = false;
                float f3 = 0.0f;
                while (true) {
                    if (i11 >= size3) {
                        break;
                    }
                    Measurable measurable = measurables.get(i11);
                    RowColumnParentData rowColumnParentData = rowColumnParentDataArr2[i11];
                    weight3 = RowColumnImplKt.getWeight(rowColumnParentData);
                    if (weight3 > 0.0f) {
                        f3 += weight3;
                        i12++;
                        i5 = i11;
                        i6 = size3;
                        rowColumnParentDataArr = rowColumnParentDataArr2;
                    } else {
                        int mainAxisMax = orientationIndependentConstraints.getMainAxisMax();
                        int i14 = i10;
                        i5 = i11;
                        i6 = size3;
                        rowColumnParentDataArr = rowColumnParentDataArr2;
                        Placeable mo3121measureBRTryo0 = measurable.mo3121measureBRTryo0(OrientationIndependentConstraints.copy$default(orientationIndependentConstraints, 0, mainAxisMax != Integer.MAX_VALUE ? mainAxisMax - i13 : Integer.MAX_VALUE, 0, 0, 8, null).m412toBoxConstraintsOenEA2s(LayoutOrientation.this));
                        rowColumnMeasurePolicy_TDGSqEk$mainAxisSize2 = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$mainAxisSize(mo3121measureBRTryo0, LayoutOrientation.this);
                        int min = Math.min(i7, (mainAxisMax - i13) - rowColumnMeasurePolicy_TDGSqEk$mainAxisSize2);
                        rowColumnMeasurePolicy_TDGSqEk$mainAxisSize3 = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$mainAxisSize(mo3121measureBRTryo0, LayoutOrientation.this);
                        i13 += rowColumnMeasurePolicy_TDGSqEk$mainAxisSize3 + min;
                        rowColumnMeasurePolicy_TDGSqEk$crossAxisSize3 = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(mo3121measureBRTryo0, LayoutOrientation.this);
                        i10 = Math.max(i14, rowColumnMeasurePolicy_TDGSqEk$crossAxisSize3);
                        if (!z3) {
                            isRelative2 = RowColumnImplKt.isRelative(rowColumnParentData);
                            if (!isRelative2) {
                                z2 = false;
                                placeableArr[i5] = mo3121measureBRTryo0;
                                i9 = min;
                                z3 = z2;
                            }
                        }
                        z2 = true;
                        placeableArr[i5] = mo3121measureBRTryo0;
                        i9 = min;
                        z3 = z2;
                    }
                    i11 = i5 + 1;
                    rowColumnParentDataArr2 = rowColumnParentDataArr;
                    size3 = i6;
                }
                int i15 = i10;
                final RowColumnParentData[] rowColumnParentDataArr3 = rowColumnParentDataArr2;
                if (i12 == 0) {
                    i13 -= i9;
                    i = i15;
                    coerceAtMost = 0;
                } else {
                    if (f3 > 0.0f && orientationIndependentConstraints.getMainAxisMax() != Integer.MAX_VALUE) {
                        mainAxisMin = orientationIndependentConstraints.getMainAxisMax();
                    } else {
                        mainAxisMin = orientationIndependentConstraints.getMainAxisMin();
                    }
                    int i16 = i7 * (i12 - 1);
                    int i17 = (mainAxisMin - i13) - i16;
                    float f4 = f3 > 0.0f ? i17 / f3 : 0.0f;
                    int i18 = 0;
                    for (int i19 = 0; i19 < size2; i19++) {
                        weight2 = RowColumnImplKt.getWeight(rowColumnParentDataArr3[i19]);
                        i18 += MathKt.roundToInt(weight2 * f4);
                    }
                    int size4 = list.size();
                    int i20 = i17 - i18;
                    i = i15;
                    int i21 = 0;
                    int i22 = 0;
                    while (i21 < size4) {
                        if (placeableArr[i21] == null) {
                            Measurable measurable2 = measurables.get(i21);
                            RowColumnParentData rowColumnParentData2 = rowColumnParentDataArr3[i21];
                            weight = RowColumnImplKt.getWeight(rowColumnParentData2);
                            if (weight <= 0.0f) {
                                throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                            }
                            int sign = MathKt.getSign(i20);
                            int i23 = i20 - sign;
                            int max2 = Math.max(0, MathKt.roundToInt(weight * f4) + sign);
                            fill = RowColumnImplKt.getFill(rowColumnParentData2);
                            f2 = f4;
                            if (!fill || max2 == Integer.MAX_VALUE) {
                                i2 = size4;
                                i3 = 0;
                            } else {
                                i3 = max2;
                                i2 = size4;
                            }
                            Placeable mo3121measureBRTryo02 = measurable2.mo3121measureBRTryo0(new OrientationIndependentConstraints(i3, max2, 0, orientationIndependentConstraints.getCrossAxisMax()).m412toBoxConstraintsOenEA2s(LayoutOrientation.this));
                            rowColumnMeasurePolicy_TDGSqEk$mainAxisSize = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$mainAxisSize(mo3121measureBRTryo02, LayoutOrientation.this);
                            i22 += rowColumnMeasurePolicy_TDGSqEk$mainAxisSize;
                            rowColumnMeasurePolicy_TDGSqEk$crossAxisSize = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(mo3121measureBRTryo02, LayoutOrientation.this);
                            i = Math.max(i, rowColumnMeasurePolicy_TDGSqEk$crossAxisSize);
                            if (!z3) {
                                isRelative = RowColumnImplKt.isRelative(rowColumnParentData2);
                                if (!isRelative) {
                                    z = false;
                                    placeableArr[i21] = mo3121measureBRTryo02;
                                    z3 = z;
                                    i20 = i23;
                                }
                            }
                            z = true;
                            placeableArr[i21] = mo3121measureBRTryo02;
                            z3 = z;
                            i20 = i23;
                        } else {
                            f2 = f4;
                            i2 = size4;
                        }
                        i21++;
                        measurables = list;
                        f4 = f2;
                        size4 = i2;
                    }
                    coerceAtMost = RangesKt.coerceAtMost(i22 + i16, orientationIndependentConstraints.getMainAxisMax() - i13);
                }
                final Ref.IntRef intRef = new Ref.IntRef();
                if (z3) {
                    i4 = 0;
                    for (int i24 = 0; i24 < size; i24++) {
                        Placeable placeable = placeableArr[i24];
                        Intrinsics.checkNotNull(placeable);
                        crossAxisAlignment2 = RowColumnImplKt.getCrossAxisAlignment(rowColumnParentDataArr3[i24]);
                        Integer calculateAlignmentLinePosition$foundation_layout_release = crossAxisAlignment2 != null ? crossAxisAlignment2.calculateAlignmentLinePosition$foundation_layout_release(placeable) : null;
                        if (calculateAlignmentLinePosition$foundation_layout_release != null) {
                            int i25 = intRef.element;
                            Integer num = calculateAlignmentLinePosition$foundation_layout_release;
                            int intValue = num.intValue();
                            if (intValue == Integer.MIN_VALUE) {
                                intValue = 0;
                            }
                            intRef.element = Math.max(i25, intValue);
                            rowColumnMeasurePolicy_TDGSqEk$crossAxisSize2 = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(placeable, LayoutOrientation.this);
                            LayoutOrientation layoutOrientation = LayoutOrientation.this;
                            int intValue2 = num.intValue();
                            if (intValue2 == Integer.MIN_VALUE) {
                                intValue2 = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(placeable, layoutOrientation);
                            }
                            i4 = Math.max(i4, rowColumnMeasurePolicy_TDGSqEk$crossAxisSize2 - intValue2);
                        }
                    }
                } else {
                    i4 = 0;
                }
                final int max3 = Math.max(i13 + coerceAtMost, orientationIndependentConstraints.getMainAxisMin());
                if (orientationIndependentConstraints.getCrossAxisMax() != Integer.MAX_VALUE && crossAxisSize == SizeMode.Expand) {
                    max = orientationIndependentConstraints.getCrossAxisMax();
                } else {
                    max = Math.max(i, Math.max(orientationIndependentConstraints.getCrossAxisMin(), intRef.element + i4));
                }
                final int i26 = max;
                int i27 = LayoutOrientation.this == LayoutOrientation.Horizontal ? max3 : i26;
                int i28 = LayoutOrientation.this == LayoutOrientation.Horizontal ? i26 : max3;
                int size5 = list.size();
                final int[] iArr = new int[size5];
                for (int i29 = 0; i29 < size5; i29++) {
                    iArr[i29] = 0;
                }
                final Function5<Integer, int[], LayoutDirection, Density, int[], Unit> function5 = arrangement;
                final LayoutOrientation layoutOrientation2 = LayoutOrientation.this;
                final CrossAxisAlignment crossAxisAlignment3 = crossAxisAlignment;
                return MeasureScope.layout$default(measure, i27, i28, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.RowColumnImplKt$rowColumnMeasurePolicy$1$measure$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Placeable.PlacementScope layout) {
                        CrossAxisAlignment crossAxisAlignment4;
                        int rowColumnMeasurePolicy_TDGSqEk$crossAxisSize4;
                        LayoutDirection layoutDirection;
                        int i30;
                        int[] iArr2;
                        int i31;
                        int rowColumnMeasurePolicy_TDGSqEk$mainAxisSize4;
                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                        int size6 = list.size();
                        int[] iArr3 = new int[size6];
                        int i32 = 0;
                        for (int i33 = 0; i33 < size6; i33++) {
                            Placeable placeable2 = placeableArr[i33];
                            Intrinsics.checkNotNull(placeable2);
                            rowColumnMeasurePolicy_TDGSqEk$mainAxisSize4 = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$mainAxisSize(placeable2, layoutOrientation2);
                            iArr3[i33] = rowColumnMeasurePolicy_TDGSqEk$mainAxisSize4;
                        }
                        function5.invoke(Integer.valueOf(max3), iArr3, measure.getLayoutDirection(), measure, iArr);
                        Placeable[] placeableArr2 = placeableArr;
                        RowColumnParentData[] rowColumnParentDataArr4 = rowColumnParentDataArr3;
                        CrossAxisAlignment crossAxisAlignment5 = crossAxisAlignment3;
                        int i34 = i26;
                        LayoutOrientation layoutOrientation3 = layoutOrientation2;
                        MeasureScope measureScope = measure;
                        Ref.IntRef intRef2 = intRef;
                        int[] iArr4 = iArr;
                        int length = placeableArr2.length;
                        int i35 = 0;
                        while (i32 < length) {
                            Placeable placeable3 = placeableArr2[i32];
                            int i36 = i35 + 1;
                            Intrinsics.checkNotNull(placeable3);
                            crossAxisAlignment4 = RowColumnImplKt.getCrossAxisAlignment(rowColumnParentDataArr4[i35]);
                            if (crossAxisAlignment4 == null) {
                                crossAxisAlignment4 = crossAxisAlignment5;
                            }
                            rowColumnMeasurePolicy_TDGSqEk$crossAxisSize4 = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(placeable3, layoutOrientation3);
                            int i37 = i34 - rowColumnMeasurePolicy_TDGSqEk$crossAxisSize4;
                            if (layoutOrientation3 == LayoutOrientation.Horizontal) {
                                layoutDirection = LayoutDirection.Ltr;
                            } else {
                                layoutDirection = measureScope.getLayoutDirection();
                            }
                            Placeable[] placeableArr3 = placeableArr2;
                            int align$foundation_layout_release = crossAxisAlignment4.align$foundation_layout_release(i37, layoutDirection, placeable3, intRef2.element);
                            if (layoutOrientation3 == LayoutOrientation.Horizontal) {
                                i30 = length;
                                iArr2 = iArr4;
                                i31 = i32;
                                Placeable.PlacementScope.place$default(layout, placeable3, iArr4[i35], align$foundation_layout_release, 0.0f, 4, null);
                            } else {
                                i30 = length;
                                iArr2 = iArr4;
                                i31 = i32;
                                Placeable.PlacementScope.place$default(layout, placeable3, align$foundation_layout_release, iArr2[i35], 0.0f, 4, null);
                            }
                            i32 = i31 + 1;
                            i35 = i36;
                            placeableArr2 = placeableArr3;
                            iArr4 = iArr2;
                            length = i30;
                        }
                    }
                }, 4, null);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i) {
                Function3 MinIntrinsicWidthMeasureBlock;
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                MinIntrinsicWidthMeasureBlock = RowColumnImplKt.MinIntrinsicWidthMeasureBlock(LayoutOrientation.this);
                return ((Number) MinIntrinsicWidthMeasureBlock.invoke(measurables, Integer.valueOf(i), Integer.valueOf(intrinsicMeasureScope.mo309roundToPx0680j_4(f)))).intValue();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i) {
                Function3 MinIntrinsicHeightMeasureBlock;
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                MinIntrinsicHeightMeasureBlock = RowColumnImplKt.MinIntrinsicHeightMeasureBlock(LayoutOrientation.this);
                return ((Number) MinIntrinsicHeightMeasureBlock.invoke(measurables, Integer.valueOf(i), Integer.valueOf(intrinsicMeasureScope.mo309roundToPx0680j_4(f)))).intValue();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i) {
                Function3 MaxIntrinsicWidthMeasureBlock;
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                MaxIntrinsicWidthMeasureBlock = RowColumnImplKt.MaxIntrinsicWidthMeasureBlock(LayoutOrientation.this);
                return ((Number) MaxIntrinsicWidthMeasureBlock.invoke(measurables, Integer.valueOf(i), Integer.valueOf(intrinsicMeasureScope.mo309roundToPx0680j_4(f)))).intValue();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i) {
                Function3 MaxIntrinsicHeightMeasureBlock;
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                MaxIntrinsicHeightMeasureBlock = RowColumnImplKt.MaxIntrinsicHeightMeasureBlock(LayoutOrientation.this);
                return ((Number) MaxIntrinsicHeightMeasureBlock.invoke(measurables, Integer.valueOf(i), Integer.valueOf(intrinsicMeasureScope.mo309roundToPx0680j_4(f)))).intValue();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RowColumnParentData getData(IntrinsicMeasurable intrinsicMeasurable) {
        Object parentData = intrinsicMeasurable.getParentData();
        if (parentData instanceof RowColumnParentData) {
            return (RowColumnParentData) parentData;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getWeight(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getWeight();
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getFill(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getFill();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CrossAxisAlignment getCrossAxisAlignment(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getCrossAxisAlignment();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isRelative(RowColumnParentData rowColumnParentData) {
        CrossAxisAlignment crossAxisAlignment = getCrossAxisAlignment(rowColumnParentData);
        if (crossAxisAlignment != null) {
            return crossAxisAlignment.isRelative$foundation_layout_release();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MinIntrinsicWidthMeasureBlock(LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return IntrinsicMeasureBlocks.INSTANCE.getHorizontalMinWidth();
        }
        return IntrinsicMeasureBlocks.INSTANCE.getVerticalMinWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MinIntrinsicHeightMeasureBlock(LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return IntrinsicMeasureBlocks.INSTANCE.getHorizontalMinHeight();
        }
        return IntrinsicMeasureBlocks.INSTANCE.getVerticalMinHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MaxIntrinsicWidthMeasureBlock(LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return IntrinsicMeasureBlocks.INSTANCE.getHorizontalMaxWidth();
        }
        return IntrinsicMeasureBlocks.INSTANCE.getVerticalMaxWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MaxIntrinsicHeightMeasureBlock(LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return IntrinsicMeasureBlocks.INSTANCE.getHorizontalMaxHeight();
        }
        return IntrinsicMeasureBlocks.INSTANCE.getVerticalMaxHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int intrinsicSize(List<? extends IntrinsicMeasurable> list, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function22, int i, int i2, LayoutOrientation layoutOrientation, LayoutOrientation layoutOrientation2) {
        if (layoutOrientation == layoutOrientation2) {
            return intrinsicMainAxisSize(list, function2, i, i2);
        }
        return intrinsicCrossAxisSize(list, function22, function2, i, i2);
    }

    private static final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function22, int i, int i2) {
        int roundToInt;
        int min = Math.min((list.size() - 1) * i2, i);
        int size = list.size();
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i4);
            float weight = getWeight(getData(intrinsicMeasurable));
            if (weight == 0.0f) {
                int min2 = Math.min(function2.invoke(intrinsicMeasurable, Integer.MAX_VALUE).intValue(), i - min);
                min += min2;
                i3 = Math.max(i3, function22.invoke(intrinsicMeasurable, Integer.valueOf(min2)).intValue());
            } else if (weight > 0.0f) {
                f += weight;
            }
        }
        if (f == 0.0f) {
            roundToInt = 0;
        } else {
            roundToInt = i == Integer.MAX_VALUE ? Integer.MAX_VALUE : MathKt.roundToInt(Math.max(i - min, 0) / f);
        }
        int size2 = list.size();
        for (int i5 = 0; i5 < size2; i5++) {
            IntrinsicMeasurable intrinsicMeasurable2 = list.get(i5);
            float weight2 = getWeight(getData(intrinsicMeasurable2));
            if (weight2 > 0.0f) {
                i3 = Math.max(i3, function22.invoke(intrinsicMeasurable2, Integer.valueOf(roundToInt != Integer.MAX_VALUE ? MathKt.roundToInt(roundToInt * weight2) : Integer.MAX_VALUE)).intValue());
            }
        }
        return i3;
    }

    private static final int intrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2, int i, int i2) {
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i5);
            float weight = getWeight(getData(intrinsicMeasurable));
            int intValue = function2.invoke(intrinsicMeasurable, Integer.valueOf(i)).intValue();
            if (weight == 0.0f) {
                i4 += intValue;
            } else if (weight > 0.0f) {
                f += weight;
                i3 = Math.max(i3, MathKt.roundToInt(intValue / weight));
            }
        }
        return MathKt.roundToInt(i3 * f) + i4 + ((list.size() - 1) * i2);
    }
}
