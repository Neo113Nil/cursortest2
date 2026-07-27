package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.firebase.analytics.FirebaseAnalytics;
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

/* compiled from: LazyListMeasure.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u008c\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002\u001aØ\u0001\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2/\u0010+\u001a+\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/0-¢\u0006\u0002\b0\u0012\u0004\u0012\u0002010,H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"calculateItemsOffsets", "", "Landroidx/compose/foundation/lazy/LazyListPositionedItem;", FirebaseAnalytics.Param.ITEMS, "", "Landroidx/compose/foundation/lazy/LazyMeasuredItem;", "extraItemsBefore", "extraItemsAfter", "layoutWidth", "", "layoutHeight", "finalMainAxisOffset", "maxOffset", "itemsScrollOffset", "isVertical", "", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "reverseLayout", "density", "Landroidx/compose/ui/unit/Density;", "measureLazyList", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "itemsCount", "itemProvider", "Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "firstVisibleItemIndex", "Landroidx/compose/foundation/lazy/DataIndex;", "firstVisibleItemScrollOffset", "scrollToBeConsumed", "", "constraints", "Landroidx/compose/ui/unit/Constraints;", "headerIndexes", "placementAnimator", "Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;", "layout", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", "measureLazyList-7Xnphek", "(ILandroidx/compose/foundation/lazy/LazyMeasuredItemProvider;IIIIIFJZLjava/util/List;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyListMeasureKt {
    private static final int calculateItemsOffsets$reverseAware(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02d8  */
    /* renamed from: measureLazyList-7Xnphek, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final LazyListMeasureResult m539measureLazyList7Xnphek(int i, LazyMeasuredItemProvider itemProvider, int i2, int i3, int i4, int i5, int i6, float f, long j, boolean z, List<Integer> headerIndexes, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density, LazyListItemPlacementAnimator placementAnimator, LazyListBeyondBoundsInfo beyondBoundsInfo, Function3<? super Integer, ? super Integer, ? super Function1<? super Placeable.PlacementScope, Unit>, ? extends MeasureResult> layout) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        LazyMeasuredItem lazyMeasuredItem;
        ArrayList emptyList;
        List emptyList2;
        boolean z3;
        LazyMeasuredItem lazyMeasuredItem2;
        int i13;
        int i14;
        LazyListPositionedItem lazyListPositionedItem;
        List<LazyListPositionedItem> list;
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(headerIndexes, "headerIndexes");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(placementAnimator, "placementAnimator");
        Intrinsics.checkNotNullParameter(beyondBoundsInfo, "beyondBoundsInfo");
        Intrinsics.checkNotNullParameter(layout, "layout");
        if (i3 < 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i <= 0) {
            return new LazyListMeasureResult(null, 0, false, 0.0f, layout.invoke(Integer.valueOf(Constraints.m3798getMinWidthimpl(j)), Integer.valueOf(Constraints.m3797getMinHeightimpl(j)), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope invoke) {
                    Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }
            }), CollectionsKt.emptyList(), -i3, i2 + i4, 0, z2, z ? Orientation.Vertical : Orientation.Horizontal, i4);
        }
        int i15 = i5;
        if (i15 >= i) {
            i15 = DataIndex.m509constructorimpl(i - 1);
            i7 = 0;
        } else {
            i7 = i6;
        }
        int roundToInt = MathKt.roundToInt(f);
        int i16 = i7 - roundToInt;
        if (DataIndex.m512equalsimpl0(i15, DataIndex.m509constructorimpl(0)) && i16 < 0) {
            roundToInt += i16;
            i16 = 0;
        }
        ArrayList arrayList = new ArrayList();
        int i17 = i16 - i3;
        int i18 = -i3;
        int i19 = 0;
        while (i17 < 0 && i15 - DataIndex.m509constructorimpl(0) > 0) {
            int m509constructorimpl = DataIndex.m509constructorimpl(i15 - 1);
            LazyMeasuredItem m550getAndMeasureZjPyQlc = itemProvider.m550getAndMeasureZjPyQlc(m509constructorimpl);
            arrayList.add(0, m550getAndMeasureZjPyQlc);
            i19 = Math.max(i19, m550getAndMeasureZjPyQlc.getCrossAxisSize());
            i17 += m550getAndMeasureZjPyQlc.getSizeWithSpacings();
            i15 = m509constructorimpl;
        }
        if (i17 < i18) {
            roundToInt += i17;
            i17 = i18;
        }
        int i20 = i17 + i3;
        int i21 = i2 + i4;
        int i22 = i15;
        int i23 = i19;
        int coerceAtLeast = RangesKt.coerceAtLeast(i21, 0);
        int i24 = -i20;
        int size = arrayList.size();
        int i25 = i22;
        for (int i26 = 0; i26 < size; i26++) {
            LazyMeasuredItem lazyMeasuredItem3 = (LazyMeasuredItem) arrayList.get(i26);
            i25 = DataIndex.m509constructorimpl(i25 + 1);
            i24 += lazyMeasuredItem3.getSizeWithSpacings();
        }
        int i27 = i20;
        int i28 = i23;
        int i29 = i24;
        int i30 = i25;
        while (true) {
            if ((i29 <= coerceAtLeast || arrayList.isEmpty()) && i30 < i) {
                int i31 = coerceAtLeast;
                LazyMeasuredItem m550getAndMeasureZjPyQlc2 = itemProvider.m550getAndMeasureZjPyQlc(i30);
                i29 += m550getAndMeasureZjPyQlc2.getSizeWithSpacings();
                if (i29 <= i18) {
                    i8 = i18;
                    if (i30 != i - 1) {
                        i9 = DataIndex.m509constructorimpl(i30 + 1);
                        i27 -= m550getAndMeasureZjPyQlc2.getSizeWithSpacings();
                        i30 = DataIndex.m509constructorimpl(i30 + 1);
                        i22 = i9;
                        coerceAtLeast = i31;
                        i18 = i8;
                    }
                } else {
                    i8 = i18;
                }
                int max = Math.max(i28, m550getAndMeasureZjPyQlc2.getCrossAxisSize());
                arrayList.add(m550getAndMeasureZjPyQlc2);
                i28 = max;
                i9 = i22;
                i30 = DataIndex.m509constructorimpl(i30 + 1);
                i22 = i9;
                coerceAtLeast = i31;
                i18 = i8;
            }
        }
        int i32 = i18;
        if (i29 < i2) {
            int i33 = i2 - i29;
            i27 -= i33;
            i29 += i33;
            int i34 = i28;
            int i35 = i22;
            while (i27 < i3 && i35 - DataIndex.m509constructorimpl(0) > 0) {
                i35 = DataIndex.m509constructorimpl(i35 - 1);
                LazyMeasuredItem m550getAndMeasureZjPyQlc3 = itemProvider.m550getAndMeasureZjPyQlc(i35);
                arrayList.add(0, m550getAndMeasureZjPyQlc3);
                i34 = Math.max(i34, m550getAndMeasureZjPyQlc3.getCrossAxisSize());
                i27 += m550getAndMeasureZjPyQlc3.getSizeWithSpacings();
            }
            roundToInt += i33;
            if (i27 < 0) {
                roundToInt += i27;
                i28 = i34;
                i10 = i29 + i27;
                i27 = 0;
                float f2 = (MathKt.getSign(MathKt.roundToInt(f)) == MathKt.getSign(roundToInt) || Math.abs(MathKt.roundToInt(f)) < Math.abs(roundToInt)) ? f : roundToInt;
                int i36 = -i27;
                LazyMeasuredItem lazyMeasuredItem4 = (LazyMeasuredItem) CollectionsKt.first((List) arrayList);
                if (i3 <= 0) {
                    int size2 = arrayList.size();
                    LazyMeasuredItem lazyMeasuredItem5 = lazyMeasuredItem4;
                    int i37 = i27;
                    int i38 = 0;
                    while (i38 < size2) {
                        int sizeWithSpacings = ((LazyMeasuredItem) arrayList.get(i38)).getSizeWithSpacings();
                        if (i37 == 0 || sizeWithSpacings > i37) {
                            break;
                        }
                        i11 = i28;
                        if (i38 == CollectionsKt.getLastIndex(arrayList)) {
                            break;
                        }
                        i37 -= sizeWithSpacings;
                        i38++;
                        lazyMeasuredItem5 = (LazyMeasuredItem) arrayList.get(i38);
                        i28 = i11;
                    }
                    i11 = i28;
                    i12 = i37;
                    lazyMeasuredItem = lazyMeasuredItem5;
                } else {
                    i11 = i28;
                    i12 = i27;
                    lazyMeasuredItem = lazyMeasuredItem4;
                }
                if (!beyondBoundsInfo.hasIntervals() && ((LazyMeasuredItem) CollectionsKt.first((List) arrayList)).getIndex() > measureLazyList_7Xnphek$startIndex(beyondBoundsInfo, i)) {
                    emptyList = new ArrayList();
                    int index = ((LazyMeasuredItem) CollectionsKt.first((List) arrayList)).getIndex() - 1;
                    int measureLazyList_7Xnphek$startIndex = measureLazyList_7Xnphek$startIndex(beyondBoundsInfo, i);
                    if (measureLazyList_7Xnphek$startIndex <= index) {
                        while (true) {
                            emptyList.add(itemProvider.m550getAndMeasureZjPyQlc(DataIndex.m509constructorimpl(index)));
                            if (index == measureLazyList_7Xnphek$startIndex) {
                                break;
                            }
                            index--;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                } else {
                    emptyList = CollectionsKt.emptyList();
                }
                List list2 = emptyList;
                if (!beyondBoundsInfo.hasIntervals() && ((LazyMeasuredItem) CollectionsKt.last((List) arrayList)).getIndex() < measureLazyList_7Xnphek$endIndex(beyondBoundsInfo, i)) {
                    ArrayList arrayList2 = new ArrayList();
                    int index2 = ((LazyMeasuredItem) CollectionsKt.last((List) arrayList)).getIndex();
                    int measureLazyList_7Xnphek$endIndex = measureLazyList_7Xnphek$endIndex(beyondBoundsInfo, i);
                    while (index2 < measureLazyList_7Xnphek$endIndex) {
                        index2++;
                        arrayList2.add(itemProvider.m550getAndMeasureZjPyQlc(DataIndex.m509constructorimpl(index2)));
                    }
                    Unit unit2 = Unit.INSTANCE;
                    emptyList2 = arrayList2;
                } else {
                    emptyList2 = CollectionsKt.emptyList();
                }
                z3 = !Intrinsics.areEqual(lazyMeasuredItem, CollectionsKt.first((List) arrayList)) && list2.isEmpty() && emptyList2.isEmpty();
                int m3810constrainWidthK40F9xA = ConstraintsKt.m3810constrainWidthK40F9xA(j, !z ? i11 : i10);
                int m3809constrainHeightK40F9xA = ConstraintsKt.m3809constrainHeightK40F9xA(j, !z ? i10 : i11);
                final List<LazyListPositionedItem> calculateItemsOffsets = calculateItemsOffsets(arrayList, list2, emptyList2, m3810constrainWidthK40F9xA, m3809constrainHeightK40F9xA, i10, i2, i36, z, vertical, horizontal, z2, density);
                if (headerIndexes.isEmpty()) {
                    lazyMeasuredItem2 = lazyMeasuredItem;
                    i13 = 0;
                    i14 = i32;
                    lazyListPositionedItem = LazyListHeadersKt.findOrComposeLazyListHeader(calculateItemsOffsets, itemProvider, headerIndexes, i3, m3810constrainWidthK40F9xA, m3809constrainHeightK40F9xA);
                } else {
                    lazyMeasuredItem2 = lazyMeasuredItem;
                    i13 = 0;
                    i14 = i32;
                    lazyListPositionedItem = null;
                }
                final LazyListPositionedItem lazyListPositionedItem2 = lazyListPositionedItem;
                placementAnimator.onMeasured((int) f2, m3810constrainWidthK40F9xA, m3809constrainHeightK40F9xA, z2, calculateItemsOffsets, itemProvider);
                boolean z4 = i10 <= i2 ? 1 : i13;
                MeasureResult invoke = layout.invoke(Integer.valueOf(m3810constrainWidthK40F9xA), Integer.valueOf(m3809constrainHeightK40F9xA), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$3
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
                    public final void invoke2(Placeable.PlacementScope invoke2) {
                        Intrinsics.checkNotNullParameter(invoke2, "$this$invoke");
                        List<LazyListPositionedItem> list3 = calculateItemsOffsets;
                        LazyListPositionedItem lazyListPositionedItem3 = lazyListPositionedItem2;
                        int size3 = list3.size();
                        for (int i39 = 0; i39 < size3; i39++) {
                            LazyListPositionedItem lazyListPositionedItem4 = list3.get(i39);
                            if (lazyListPositionedItem4 != lazyListPositionedItem3) {
                                lazyListPositionedItem4.place(invoke2);
                            }
                        }
                        LazyListPositionedItem lazyListPositionedItem5 = lazyListPositionedItem2;
                        if (lazyListPositionedItem5 != null) {
                            lazyListPositionedItem5.place(invoke2);
                        }
                    }
                });
                if (z3) {
                    ArrayList arrayList3 = new ArrayList(calculateItemsOffsets.size());
                    int size3 = calculateItemsOffsets.size();
                    while (i13 < size3) {
                        LazyListPositionedItem lazyListPositionedItem3 = calculateItemsOffsets.get(i13);
                        LazyListPositionedItem lazyListPositionedItem4 = lazyListPositionedItem3;
                        if ((lazyListPositionedItem4.getIndex() >= ((LazyMeasuredItem) CollectionsKt.first((List) arrayList)).getIndex() && lazyListPositionedItem4.getIndex() <= ((LazyMeasuredItem) CollectionsKt.last((List) arrayList)).getIndex()) || lazyListPositionedItem4 == lazyListPositionedItem2) {
                            arrayList3.add(lazyListPositionedItem3);
                        }
                        i13++;
                    }
                    list = arrayList3;
                } else {
                    list = calculateItemsOffsets;
                }
                return new LazyListMeasureResult(lazyMeasuredItem2, i12, z4, f2, invoke, list, i14, i21, i, z2, !z ? Orientation.Vertical : Orientation.Horizontal, i4);
            }
            i28 = i34;
        }
        i10 = i29;
        if (MathKt.getSign(MathKt.roundToInt(f)) == MathKt.getSign(roundToInt)) {
        }
        int i362 = -i27;
        LazyMeasuredItem lazyMeasuredItem42 = (LazyMeasuredItem) CollectionsKt.first((List) arrayList);
        if (i3 <= 0) {
        }
        if (!beyondBoundsInfo.hasIntervals()) {
        }
        emptyList = CollectionsKt.emptyList();
        List list22 = emptyList;
        if (!beyondBoundsInfo.hasIntervals()) {
        }
        emptyList2 = CollectionsKt.emptyList();
        if (Intrinsics.areEqual(lazyMeasuredItem, CollectionsKt.first((List) arrayList))) {
        }
        int m3810constrainWidthK40F9xA2 = ConstraintsKt.m3810constrainWidthK40F9xA(j, !z ? i11 : i10);
        int m3809constrainHeightK40F9xA2 = ConstraintsKt.m3809constrainHeightK40F9xA(j, !z ? i10 : i11);
        final List<LazyListPositionedItem> calculateItemsOffsets2 = calculateItemsOffsets(arrayList, list22, emptyList2, m3810constrainWidthK40F9xA2, m3809constrainHeightK40F9xA2, i10, i2, i362, z, vertical, horizontal, z2, density);
        if (headerIndexes.isEmpty()) {
        }
        final LazyListPositionedItem lazyListPositionedItem22 = lazyListPositionedItem;
        placementAnimator.onMeasured((int) f2, m3810constrainWidthK40F9xA2, m3809constrainHeightK40F9xA2, z2, calculateItemsOffsets2, itemProvider);
        if (i10 <= i2) {
        }
        MeasureResult invoke2 = layout.invoke(Integer.valueOf(m3810constrainWidthK40F9xA2), Integer.valueOf(m3809constrainHeightK40F9xA2), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$3
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
            public final void invoke2(Placeable.PlacementScope invoke22) {
                Intrinsics.checkNotNullParameter(invoke22, "$this$invoke");
                List<LazyListPositionedItem> list3 = calculateItemsOffsets2;
                LazyListPositionedItem lazyListPositionedItem32 = lazyListPositionedItem22;
                int size32 = list3.size();
                for (int i39 = 0; i39 < size32; i39++) {
                    LazyListPositionedItem lazyListPositionedItem42 = list3.get(i39);
                    if (lazyListPositionedItem42 != lazyListPositionedItem32) {
                        lazyListPositionedItem42.place(invoke22);
                    }
                }
                LazyListPositionedItem lazyListPositionedItem5 = lazyListPositionedItem22;
                if (lazyListPositionedItem5 != null) {
                    lazyListPositionedItem5.place(invoke22);
                }
            }
        });
        if (z3) {
        }
        return new LazyListMeasureResult(lazyMeasuredItem2, i12, z4, f2, invoke2, list, i14, i21, i, z2, !z ? Orientation.Vertical : Orientation.Horizontal, i4);
    }

    private static final int measureLazyList_7Xnphek$startIndex(LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo, int i) {
        return Math.min(lazyListBeyondBoundsInfo.getStart(), i - 1);
    }

    private static final int measureLazyList_7Xnphek$endIndex(LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo, int i) {
        return Math.min(lazyListBeyondBoundsInfo.getEnd(), i - 1);
    }

    private static final List<LazyListPositionedItem> calculateItemsOffsets(List<LazyMeasuredItem> list, List<LazyMeasuredItem> list2, List<LazyMeasuredItem> list3, int i, int i2, int i3, int i4, int i5, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density) {
        int i6 = z ? i2 : i;
        boolean z3 = i3 < Math.min(i6, i4);
        if (z3 && i5 != 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z3) {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            int size = list.size();
            int[] iArr = new int[size];
            for (int i7 = 0; i7 < size; i7++) {
                iArr[i7] = list.get(calculateItemsOffsets$reverseAware(i7, z2, size)).getSize();
            }
            int[] iArr2 = new int[size];
            for (int i8 = 0; i8 < size; i8++) {
                iArr2[i8] = 0;
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
                    int i9 = iArr2[first];
                    LazyMeasuredItem lazyMeasuredItem = list.get(calculateItemsOffsets$reverseAware(first, z2, size));
                    if (z2) {
                        i9 = (i6 - i9) - lazyMeasuredItem.getSize();
                    }
                    arrayList.add(lazyMeasuredItem.position(i9, i, i2));
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        } else {
            int size2 = list2.size();
            int i10 = i5;
            for (int i11 = 0; i11 < size2; i11++) {
                LazyMeasuredItem lazyMeasuredItem2 = list2.get(i11);
                i10 -= lazyMeasuredItem2.getSizeWithSpacings();
                arrayList.add(lazyMeasuredItem2.position(i10, i, i2));
            }
            int size3 = list.size();
            int i12 = i5;
            for (int i13 = 0; i13 < size3; i13++) {
                LazyMeasuredItem lazyMeasuredItem3 = list.get(i13);
                arrayList.add(lazyMeasuredItem3.position(i12, i, i2));
                i12 += lazyMeasuredItem3.getSizeWithSpacings();
            }
            int size4 = list3.size();
            for (int i14 = 0; i14 < size4; i14++) {
                LazyMeasuredItem lazyMeasuredItem4 = list3.get(i14);
                arrayList.add(lazyMeasuredItem4.position(i12, i, i2));
                i12 += lazyMeasuredItem4.getSizeWithSpacings();
            }
        }
        return arrayList;
    }
}
