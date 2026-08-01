package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* compiled from: LazyGridMeasure.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ap\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001aÒ\u0001\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010'\u001a\u00020(2/\u0010)\u001a+\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+¢\u0006\u0002\b.\u0012\u0004\u0012\u00020/0*H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"calculateItemsOffsets", "", "Landroidx/compose/foundation/lazy/grid/LazyGridPositionedItem;", "lines", "", "Landroidx/compose/foundation/lazy/grid/LazyMeasuredLine;", "layoutWidth", "", "layoutHeight", "finalMainAxisOffset", "maxOffset", "firstLineScrollOffset", "isVertical", "", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "reverseLayout", "density", "Landroidx/compose/ui/unit/Density;", "measureLazyGrid", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "itemsCount", "measuredLineProvider", "Landroidx/compose/foundation/lazy/grid/LazyMeasuredLineProvider;", "measuredItemProvider", "Landroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;", "mainAxisAvailableSize", "slotsPerLine", "beforeContentPadding", "afterContentPadding", "firstVisibleLineIndex", "Landroidx/compose/foundation/lazy/grid/LineIndex;", "firstVisibleLineScrollOffset", "scrollToBeConsumed", "", "constraints", "Landroidx/compose/ui/unit/Constraints;", "placementAnimator", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "layout", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", "measureLazyGrid-zIfe3eg", "(ILandroidx/compose/foundation/lazy/grid/LazyMeasuredLineProvider;Landroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;IIIIIIFJZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyGridMeasureKt {
    private static final int calculateItemsOffsets$reverseAware(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    /* renamed from: measureLazyGrid-zIfe3eg, reason: not valid java name */
    public static final LazyGridMeasureResult m595measureLazyGridzIfe3eg(int i, LazyMeasuredLineProvider lazyMeasuredLineProvider, LazyMeasuredItemProvider measuredItemProvider, int i2, int i3, int i4, int i5, int i6, int i7, float f, long j, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density, LazyGridItemPlacementAnimator placementAnimator, Function3<? super Integer, ? super Integer, ? super Function1<? super Placeable.PlacementScope, Unit>, ? extends MeasureResult> layout) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        LazyMeasuredLine lazyMeasuredLine;
        int i13;
        int m3810constrainWidthK40F9xA;
        int m3795getMaxHeightimpl;
        LazyMeasuredLineProvider measuredLineProvider = lazyMeasuredLineProvider;
        Intrinsics.checkNotNullParameter(measuredLineProvider, "measuredLineProvider");
        Intrinsics.checkNotNullParameter(measuredItemProvider, "measuredItemProvider");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(placementAnimator, "placementAnimator");
        Intrinsics.checkNotNullParameter(layout, "layout");
        if (i4 < 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i5 < 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i <= 0) {
            return new LazyGridMeasureResult(null, 0, false, 0.0f, layout.invoke(Integer.valueOf(Constraints.m3798getMinWidthimpl(j)), Integer.valueOf(Constraints.m3797getMinHeightimpl(j)), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope invoke) {
                    Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }
            }), CollectionsKt.emptyList(), -i4, i2 + i5, 0, z2, z ? Orientation.Vertical : Orientation.Horizontal, i5);
        }
        int roundToInt = MathKt.roundToInt(f);
        int i14 = i7 - roundToInt;
        int i15 = i6;
        if (LineIndex.m620equalsimpl0(i15, LineIndex.m617constructorimpl(0)) && i14 < 0) {
            roundToInt += i14;
            i14 = 0;
        }
        ArrayList arrayList = new ArrayList();
        int i16 = i14 - i4;
        int i17 = -i4;
        while (i16 < 0 && i15 - LineIndex.m617constructorimpl(0) > 0) {
            i15 = LineIndex.m617constructorimpl(i15 - 1);
            LazyMeasuredLine m613getAndMeasurebKFJvoY = measuredLineProvider.m613getAndMeasurebKFJvoY(i15);
            arrayList.add(0, m613getAndMeasurebKFJvoY);
            i16 += m613getAndMeasurebKFJvoY.getMainAxisSizeWithSpacings();
        }
        if (i16 < i17) {
            i8 = roundToInt + i16;
            i9 = i17;
        } else {
            int i18 = i16;
            i8 = roundToInt;
            i9 = i18;
        }
        int i19 = i9 + i4;
        int i20 = i2 + i5;
        int i21 = i15;
        int coerceAtLeast = RangesKt.coerceAtLeast(i20, 0);
        int i22 = -i19;
        int size = arrayList.size();
        int i23 = i21;
        int i24 = i20;
        for (int i25 = 0; i25 < size; i25++) {
            LazyMeasuredLine lazyMeasuredLine2 = (LazyMeasuredLine) arrayList.get(i25);
            i23 = LineIndex.m617constructorimpl(i23 + 1);
            i22 += lazyMeasuredLine2.getMainAxisSizeWithSpacings();
        }
        int i26 = i19;
        int i27 = i23;
        while (true) {
            if (i22 > coerceAtLeast && !arrayList.isEmpty()) {
                break;
            }
            int i28 = coerceAtLeast;
            LazyMeasuredLine m613getAndMeasurebKFJvoY2 = measuredLineProvider.m613getAndMeasurebKFJvoY(i27);
            if (!m613getAndMeasurebKFJvoY2.isEmpty()) {
                int i29 = i17;
                int i30 = i24;
                i22 += m613getAndMeasurebKFJvoY2.getMainAxisSizeWithSpacings();
                if (i22 > i29 || ((LazyMeasuredItem) ArraysKt.last(m613getAndMeasurebKFJvoY2.getItems())).getIndex() == i - 1) {
                    arrayList.add(m613getAndMeasurebKFJvoY2);
                    i10 = i21;
                } else {
                    i10 = LineIndex.m617constructorimpl(i27 + 1);
                    i26 -= m613getAndMeasurebKFJvoY2.getMainAxisSizeWithSpacings();
                }
                i27 = LineIndex.m617constructorimpl(i27 + 1);
                i21 = i10;
                i17 = i29;
                coerceAtLeast = i28;
                i24 = i30;
                measuredLineProvider = lazyMeasuredLineProvider;
            } else {
                LineIndex.m617constructorimpl(i27 - 1);
                break;
            }
        }
        if (i22 < i2) {
            int i31 = i2 - i22;
            i26 -= i31;
            i22 += i31;
            int i32 = i21;
            while (true) {
                if (i26 >= i4) {
                    i11 = i17;
                    i12 = 0;
                    break;
                }
                if (i32 - LineIndex.m617constructorimpl(0) <= 0) {
                    i12 = 0;
                    i11 = i17;
                    break;
                }
                i32 = LineIndex.m617constructorimpl(i32 - 1);
                int i33 = i17;
                LazyMeasuredLine m613getAndMeasurebKFJvoY3 = measuredLineProvider.m613getAndMeasurebKFJvoY(i32);
                arrayList.add(0, m613getAndMeasurebKFJvoY3);
                i26 += m613getAndMeasurebKFJvoY3.getMainAxisSizeWithSpacings();
                i17 = i33;
            }
            i8 += i31;
            if (i26 < 0) {
                i8 += i26;
                i22 += i26;
                i26 = i12;
            }
        } else {
            i11 = i17;
            i12 = 0;
        }
        float f2 = (MathKt.getSign(MathKt.roundToInt(f)) != MathKt.getSign(i8) || Math.abs(MathKt.roundToInt(f)) < Math.abs(i8)) ? f : i8;
        int i34 = -i26;
        LazyMeasuredLine lazyMeasuredLine3 = (LazyMeasuredLine) CollectionsKt.first((List) arrayList);
        if (i4 > 0) {
            int size2 = arrayList.size();
            int i35 = i26;
            LazyMeasuredLine lazyMeasuredLine4 = lazyMeasuredLine3;
            int i36 = i12;
            while (i36 < size2) {
                int mainAxisSizeWithSpacings = ((LazyMeasuredLine) arrayList.get(i36)).getMainAxisSizeWithSpacings();
                if (i35 == 0 || mainAxisSizeWithSpacings > i35 || i36 == CollectionsKt.getLastIndex(arrayList)) {
                    break;
                }
                i35 -= mainAxisSizeWithSpacings;
                i36++;
                lazyMeasuredLine4 = (LazyMeasuredLine) arrayList.get(i36);
            }
            lazyMeasuredLine = lazyMeasuredLine4;
            i13 = i35;
        } else {
            lazyMeasuredLine = lazyMeasuredLine3;
            i13 = i26;
        }
        if (z) {
            m3810constrainWidthK40F9xA = Constraints.m3796getMaxWidthimpl(j);
        } else {
            m3810constrainWidthK40F9xA = ConstraintsKt.m3810constrainWidthK40F9xA(j, i22);
        }
        int i37 = m3810constrainWidthK40F9xA;
        if (z) {
            m3795getMaxHeightimpl = ConstraintsKt.m3809constrainHeightK40F9xA(j, i22);
        } else {
            m3795getMaxHeightimpl = Constraints.m3795getMaxHeightimpl(j);
        }
        int i38 = m3795getMaxHeightimpl;
        int i39 = i24;
        float f3 = f2;
        int i40 = i11;
        final List<LazyGridPositionedItem> calculateItemsOffsets = calculateItemsOffsets(arrayList, i37, i38, i22, i2, i34, z, vertical, horizontal, z2, density);
        int i41 = i22;
        placementAnimator.onMeasured((int) f3, i37, i38, i3, z2, calculateItemsOffsets, measuredItemProvider);
        return new LazyGridMeasureResult(lazyMeasuredLine, i13, i41 > i2, f3, layout.invoke(Integer.valueOf(i37), Integer.valueOf(i38), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope invoke) {
                Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
                List<LazyGridPositionedItem> list = calculateItemsOffsets;
                int size3 = list.size();
                for (int i42 = 0; i42 < size3; i42++) {
                    list.get(i42).place(invoke);
                }
            }
        }), calculateItemsOffsets, i40, i39, i, z2, z ? Orientation.Vertical : Orientation.Horizontal, i5);
    }

    private static final List<LazyGridPositionedItem> calculateItemsOffsets(List<LazyMeasuredLine> list, int i, int i2, int i3, int i4, int i5, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density) {
        int i6 = z ? i2 : i;
        boolean z3 = i3 < Math.min(i6, i4);
        if (z3 && i5 != 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
        int size = list.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += list.get(i8).getItems().length;
        }
        ArrayList arrayList = new ArrayList(i7);
        if (z3) {
            int size2 = list.size();
            int[] iArr = new int[size2];
            for (int i9 = 0; i9 < size2; i9++) {
                iArr[i9] = list.get(calculateItemsOffsets$reverseAware(i9, z2, size2)).getMainAxisSize();
            }
            int[] iArr2 = new int[size2];
            for (int i10 = 0; i10 < size2; i10++) {
                iArr2[i10] = 0;
            }
            if (z) {
                if (vertical == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                vertical.arrange(density, i6, iArr, iArr2);
            } else {
                if (horizontal == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                horizontal.arrange(density, i6, iArr, LayoutDirection.Ltr, iArr2);
            }
            IntRange indices = ArraysKt.getIndices(iArr2);
            if (z2) {
                indices = RangesKt.reversed(indices);
            }
            int first = indices.getFirst();
            int last = indices.getLast();
            int step = indices.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    int i11 = iArr2[first];
                    LazyMeasuredLine lazyMeasuredLine = list.get(calculateItemsOffsets$reverseAware(first, z2, size2));
                    if (z2) {
                        i11 = (i6 - i11) - lazyMeasuredLine.getMainAxisSize();
                    }
                    arrayList.addAll(lazyMeasuredLine.position(i11, i, i2));
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        } else {
            int size3 = list.size();
            int i12 = i5;
            for (int i13 = 0; i13 < size3; i13++) {
                LazyMeasuredLine lazyMeasuredLine2 = list.get(i13);
                arrayList.addAll(lazyMeasuredLine2.position(i12, i, i2));
                i12 += lazyMeasuredLine2.getMainAxisSizeWithSpacings();
            }
        }
        return arrayList;
    }
}
