package androidx.compose.foundation.lazy.grid;

@kotlin.Metadata(d1 = {"\u0000²\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\u001aè\u0002\u00109\u001a\u0002062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001c\u001a\u00020\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00000\u001d2\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00102\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2)\u0010,\u001a%\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b*\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000e0+0\u001d0)2\u0017\u0010-\u001a\u0013\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b*\u0012\u0004\u0012\u00020\u00000)2\b\u0010/\u001a\u0004\u0018\u00010.2/\u00105\u001a+\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u0002020)¢\u0006\u0002\b3\u0012\u0004\u0012\u00020400H\u0000¢\u0006\u0004\b7\u00108\u001aM\u0010A\u001a\b\u0012\u0004\u0012\u00020>0\u001d2\u0006\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00102\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u001d2\b\u0010@\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\bA\u0010B\u001a\u0093\u0001\u0010K\u001a\b\u0012\u0004\u0012\u00020\u001a0J2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020>0\u001d2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d2\u0006\u0010=\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u00002\u0006\u0010@\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u00002\u0006\u0010D\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u00102\b\u0010F\u001a\u0004\u0018\u00010\u00122\b\u0010G\u001a\u0004\u0018\u00010\u00142\u0006\u0010H\u001a\u00020\u00102\u0006\u0010I\u001a\u00020\u0017H\u0002¢\u0006\u0004\bK\u0010L\u001a-\u0010O\u001a\u000202\"\u0004\b\u0000\u0010M*\b\u0012\u0004\u0012\u00028\u00000J2\f\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000NH\u0002¢\u0006\u0004\bO\u0010P"}, d2 = {"", "itemsCount", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;", "measuredLineProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;", "measuredItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenLines", "firstVisibleLineIndex", "firstVisibleLineScrollOffset", "", "scrollToBeConsumed", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "isVertical", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "reverseLayout", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "itemAnimator", "slotsPerLine", "", "pinnedItems", "isInLookaheadScope", "isLookingAhead", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "approachLayoutInfo", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "placementScopeInvalidator", "Landroidx/compose/ui/graphics/GraphicsContext;", "graphicsContext", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "Lkotlin/Pair;", "prefetchInfoRetriever", "lineIndexProvider", "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;", "stickyItemsScrollBehavior", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", androidx.window.reflection.WindowExtensionsConstants.LAYOUT_PACKAGE, "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "measureLazyGrid-t1x4au0", "(ILandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;IIIIIIFJZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;ZZLandroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/graphics/GraphicsContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "measureLazyGrid", "p0", "p1", "p2", "p3", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "p4", "p5", "Camera2StreamConfigurationMap", "(IILandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;ZLjava/util/List;Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;)Ljava/util/List;", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "", "getHighSpeedVideoFpsRanges", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;)Ljava/util/List;", "T", "", "getHighSpeedVideoSizes", "(Ljava/util/List;[Ljava/lang/Object;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyGridMeasureKt {
    private static final int Camera2StreamConfigurationMap(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes() {
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem getHighSpeedVideoFpsRanges(androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider, androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, int i) {
        int spanOf = lazyGridMeasuredLineProvider.spanOf(i);
        return lazyGridMeasuredItemProvider.mo1796getAndMeasurehBUhpc(i, 0, spanOf, lazyGridMeasuredLineProvider.m1831childConstraintsJhjzzOo$foundation(0, spanOf));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.runtime.MutableState mutableState, final java.util.List list, final java.util.List list2, final boolean z, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        placementScope.withMotionFrameOfReferencePlacement(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.lazy.grid.LazyGridMeasureKt.getHighResolutionOutputSizeshNQ4ISI(list, list2, z, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                return highResolutionOutputSizeshNQ4ISI;
            }
        });
        androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator.m1869attachToScopeimpl(mutableState);
        return kotlin.Unit.INSTANCE;
    }

    private static final java.util.List<androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine> Camera2StreamConfigurationMap(int i, int i2, androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider, boolean z, java.util.List<androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine> list, androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo lazyGridLayoutInfo) {
        androidx.compose.foundation.lazy.grid.LazyGridItemInfo lazyGridItemInfo;
        int index;
        int min;
        java.util.ArrayList arrayList = null;
        if (z && lazyGridLayoutInfo != null && !lazyGridLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            java.util.List<androidx.compose.foundation.lazy.grid.LazyGridItemInfo> visibleItemsInfo = lazyGridLayoutInfo.getVisibleItemsInfo();
            for (int size = visibleItemsInfo.size() - 1; size >= 0; size--) {
                if (visibleItemsInfo.get(size).getIndex() > i && (size == 0 || visibleItemsInfo.get(size - 1).getIndex() <= i)) {
                    lazyGridItemInfo = visibleItemsInfo.get(size);
                    break;
                }
            }
            lazyGridItemInfo = null;
            androidx.compose.foundation.lazy.grid.LazyGridItemInfo lazyGridItemInfo2 = (androidx.compose.foundation.lazy.grid.LazyGridItemInfo) kotlin.collections.CollectionsKt.last((java.util.List) lazyGridLayoutInfo.getVisibleItemsInfo());
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine lazyGridMeasuredLine = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) list);
            int index2 = lazyGridMeasuredLine != null ? lazyGridMeasuredLine.getIndex() + 1 : 0;
            if (lazyGridItemInfo != null && (index = lazyGridItemInfo.getIndex()) <= (min = java.lang.Math.min(lazyGridItemInfo2.getIndex(), i2 - 1))) {
                while (true) {
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            for (androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem lazyGridMeasuredItem : arrayList.get(i3).getItems()) {
                                if (lazyGridMeasuredItem.getIndex() == index) {
                                    break;
                                }
                            }
                        }
                    }
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                    }
                    androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine andMeasure = lazyGridMeasuredLineProvider.getAndMeasure(index2);
                    index2++;
                    arrayList.add(andMeasure);
                    if (index == min) {
                        break;
                    }
                    index++;
                }
            }
        }
        return arrayList == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList;
    }

    private static final java.util.List<androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem> getHighSpeedVideoFpsRanges(java.util.List<androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine> list, java.util.List<androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem> list2, java.util.List<androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem> list3, int i, int i2, int i3, int i4, int i5, boolean z, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, boolean z2, androidx.compose.ui.unit.Density density) {
        int i6 = z ? i2 : i;
        boolean z3 = i3 < java.lang.Math.min(i6, i4);
        if (z3 && i5 != 0) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateException("non-zero firstLineScrollOffset");
        }
        java.util.List<androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine> list4 = list;
        int size = list4.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += list.get(i8).getItems().length;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i7);
        if (z3) {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("no items");
            }
            int size2 = list.size();
            int[] iArr = new int[size2];
            for (int i9 = 0; i9 < size2; i9++) {
                iArr[i9] = list.get(Camera2StreamConfigurationMap(i9, z2, size2)).getMainAxisSize();
            }
            int[] iArr2 = new int[size2];
            if (z) {
                if (vertical != null) {
                    vertical.arrange(density, i6, iArr, iArr2);
                } else {
                    androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null verticalArrangement");
                    throw new kotlin.KotlinNothingValueException();
                }
            } else if (horizontal != null) {
                horizontal.arrange(density, i6, iArr, androidx.compose.ui.unit.LayoutDirection.Ltr, iArr2);
            } else {
                androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null horizontalArrangement");
                throw new kotlin.KotlinNothingValueException();
            }
            kotlin.ranges.IntRange indices = kotlin.collections.ArraysKt.getIndices(iArr2);
            if (z2) {
                indices = kotlin.ranges.RangesKt.reversed(indices);
            }
            int first = indices.getFirst();
            int last = indices.getLast();
            int step = indices.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    int i10 = iArr2[first];
                    androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine lazyGridMeasuredLine = list.get(Camera2StreamConfigurationMap(first, z2, size2));
                    if (z2) {
                        i10 = (i6 - i10) - lazyGridMeasuredLine.getMainAxisSize();
                    }
                    getHighSpeedVideoSizes(arrayList, lazyGridMeasuredLine.position(i10, i, i2));
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        } else {
            int size3 = list2.size() - 1;
            if (size3 >= 0) {
                int i11 = i5;
                while (true) {
                    int i12 = size3 - 1;
                    androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem lazyGridMeasuredItem = list2.get(size3);
                    i11 -= lazyGridMeasuredItem.getMainAxisSizeWithSpacings();
                    lazyGridMeasuredItem.position(i11, 0, i, i2);
                    arrayList.add(lazyGridMeasuredItem);
                    if (i12 < 0) {
                        break;
                    }
                    size3 = i12;
                }
            }
            int size4 = list4.size();
            int i13 = i5;
            for (int i14 = 0; i14 < size4; i14++) {
                androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine lazyGridMeasuredLine2 = list.get(i14);
                getHighSpeedVideoSizes(arrayList, lazyGridMeasuredLine2.position(i13, i, i2));
                i13 += lazyGridMeasuredLine2.getMainAxisSizeWithSpacings();
            }
            int size5 = list3.size();
            for (int i15 = 0; i15 < size5; i15++) {
                androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem lazyGridMeasuredItem2 = list3.get(i15);
                lazyGridMeasuredItem2.position(i13, 0, i, i2);
                arrayList.add(lazyGridMeasuredItem2);
                i13 += lazyGridMeasuredItem2.getMainAxisSizeWithSpacings();
            }
        }
        return arrayList;
    }

    private static final <T> void getHighSpeedVideoSizes(java.util.List<T> list, T[] tArr) {
        for (T t : tArr) {
            list.add(t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x025b  */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.List] */
    /* renamed from: measureLazyGrid-t1x4au0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final androidx.compose.foundation.lazy.grid.LazyGridMeasureResult m1829measureLazyGridt1x4au0(int i, final androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider, final androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, int i2, int i3, int i4, int i5, int i6, int i7, float f, long j, boolean z, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, boolean z2, androidx.compose.ui.unit.Density density, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem> lazyLayoutItemAnimator, int i8, java.util.List<java.lang.Integer> list, boolean z3, boolean z4, androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo lazyGridLayoutInfo, kotlinx.coroutines.CoroutineScope coroutineScope, final androidx.compose.runtime.MutableState<kotlin.Unit> mutableState, androidx.compose.ui.graphics.GraphicsContext graphicsContext, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.util.List<kotlin.Pair<java.lang.Integer, androidx.compose.ui.unit.Constraints>>> function1, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> function12, androidx.compose.foundation.lazy.layout.StickyItemsPlacement stickyItemsPlacement, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.lang.Integer, ? super kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>, ? extends androidx.compose.ui.layout.MeasureResult> function3) {
        boolean z5;
        boolean z6;
        int i9;
        int i10;
        int i11;
        androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine lazyGridMeasuredLine;
        int size;
        int i12;
        java.util.List list2;
        int i13;
        boolean z7;
        int size2;
        int i14;
        int i15;
        int size3;
        int i16;
        int i17;
        androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine lazyGridMeasuredLine2;
        int m8571constrainWidthK40F9xA;
        int m8553getMaxHeightimpl;
        androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine lazyGridMeasuredLine3;
        int i18;
        int i19;
        final boolean z8;
        int i20;
        int i21;
        java.util.List<androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine> list3;
        int i22;
        int i23;
        int i24;
        int i25;
        float f2;
        boolean z9;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem[] items;
        androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem lazyGridMeasuredItem;
        androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem[] items2;
        androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem lazyGridMeasuredItem2;
        int i31;
        int i32;
        int i33;
        boolean z10 = z4;
        if (i3 < 0) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("negative beforeContentPadding");
        }
        if (i4 < 0) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("negative afterContentPadding");
        }
        if (i <= 0) {
            int m8556getMinWidthimpl = androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j);
            int m8555getMinHeightimpl = androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j);
            lazyLayoutItemAnimator.onMeasured(0, m8556getMinWidthimpl, m8555getMinHeightimpl, new java.util.ArrayList(), lazyGridMeasuredItemProvider.getKeyIndexMap(), lazyGridMeasuredItemProvider, z, z4, i8, z3, 0, 0, coroutineScope, graphicsContext);
            if (!z10) {
                long m1853getMinSizeToFitDisappearingItemsYbymL2g = lazyLayoutItemAnimator.m1853getMinSizeToFitDisappearingItemsYbymL2g();
                if (!androidx.compose.ui.unit.IntSize.m8770equalsimpl0(m1853getMinSizeToFitDisappearingItemsYbymL2g, androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g())) {
                    m8556getMinWidthimpl = androidx.compose.ui.unit.ConstraintsKt.m8571constrainWidthK40F9xA(j, (int) (m1853getMinSizeToFitDisappearingItemsYbymL2g >> 32));
                    m8555getMinHeightimpl = androidx.compose.ui.unit.ConstraintsKt.m8570constrainHeightK40F9xA(j, (int) (m1853getMinSizeToFitDisappearingItemsYbymL2g & 4294967295L));
                }
            }
            return new androidx.compose.foundation.lazy.grid.LazyGridMeasureResult(null, 0, false, 0.0f, function3.invoke(java.lang.Integer.valueOf(m8556getMinWidthimpl), java.lang.Integer.valueOf(m8555getMinHeightimpl), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    kotlin.Unit highSpeedVideoSizes;
                    highSpeedVideoSizes = androidx.compose.foundation.lazy.grid.LazyGridMeasureKt.getHighSpeedVideoSizes();
                    return highSpeedVideoSizes;
                }
            }), 0.0f, false, coroutineScope, density, i8, function1, function12, kotlin.collections.CollectionsKt.emptyList(), -i3, i2 + i4, 0, z2, z ? androidx.compose.foundation.gestures.Orientation.Vertical : androidx.compose.foundation.gestures.Orientation.Horizontal, i4, i5);
        }
        int round = java.lang.Math.round(f);
        int i34 = i7 - round;
        if (i6 == 0 && i34 < 0) {
            round += i34;
            i34 = 0;
        }
        kotlin.collections.ArrayDeque arrayDeque = new kotlin.collections.ArrayDeque();
        int i35 = -i3;
        int i36 = (i5 < 0 ? i5 : 0) + i35;
        int i37 = i34 + i36;
        int i38 = i6;
        while (i37 < 0 && i38 > 0) {
            int i39 = i38 - 1;
            int i40 = i35;
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine andMeasure = lazyGridMeasuredLineProvider.getAndMeasure(i39);
            arrayDeque.add(0, andMeasure);
            i37 += andMeasure.getMainAxisSizeWithSpacings();
            i38 = i39;
            i35 = i40;
        }
        int i41 = i35;
        if (i37 < i36) {
            round -= i36 - i37;
            i37 = i36;
        }
        int i42 = i37 - i36;
        int i43 = i2 + i4;
        int i44 = i38;
        int coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(i43, 0);
        int i45 = i44;
        int i46 = i43;
        int i47 = i42;
        boolean z11 = false;
        int i48 = -i42;
        int i49 = 0;
        while (true) {
            z5 = true;
            if (i49 >= arrayDeque.size()) {
                break;
            }
            if (i48 >= coerceAtLeast) {
                arrayDeque.remove(i49);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                z11 = true;
            } else {
                i45++;
                i48 += ((androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine) arrayDeque.get(i49)).getMainAxisSizeWithSpacings();
                i49++;
            }
        }
        boolean z12 = z11;
        int i50 = i45;
        while (i50 < i && (i48 < coerceAtLeast || i48 <= 0 || arrayDeque.isEmpty())) {
            int i51 = coerceAtLeast;
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine andMeasure2 = lazyGridMeasuredLineProvider.getAndMeasure(i50);
            if (andMeasure2.isEmpty()) {
                break;
            }
            int mainAxisSizeWithSpacings = i48 + andMeasure2.getMainAxisSizeWithSpacings();
            if (mainAxisSizeWithSpacings <= i36) {
                i31 = i36;
                i32 = mainAxisSizeWithSpacings;
                if (((androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem) kotlin.collections.ArraysKt.last(andMeasure2.getItems())).getIndex() != i - 1) {
                    i33 = i50 + 1;
                    i47 -= andMeasure2.getMainAxisSizeWithSpacings();
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    z12 = true;
                    i50++;
                    i44 = i33;
                    coerceAtLeast = i51;
                    i48 = i32;
                    i36 = i31;
                }
            } else {
                i31 = i36;
                i32 = mainAxisSizeWithSpacings;
            }
            arrayDeque.add(andMeasure2);
            i33 = i44;
            i50++;
            i44 = i33;
            coerceAtLeast = i51;
            i48 = i32;
            i36 = i31;
        }
        if (i48 < i2) {
            int i52 = i2 - i48;
            i48 += i52;
            int i53 = i44;
            int i54 = i47 - i52;
            while (i54 < i3 && i53 > 0) {
                int i55 = i53 - 1;
                boolean z13 = z12;
                androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine andMeasure3 = lazyGridMeasuredLineProvider.getAndMeasure(i55);
                arrayDeque.add(0, andMeasure3);
                i54 += andMeasure3.getMainAxisSizeWithSpacings();
                z12 = z13;
                i53 = i55;
            }
            z6 = z12;
            i9 = i52 + round;
            if (i54 < 0) {
                i9 += i54;
                i10 = i48 + i54;
                i11 = 0;
                float f3 = (kotlin.math.MathKt.getSign(java.lang.Math.round(f)) == kotlin.math.MathKt.getSign(i9) || java.lang.Math.abs(java.lang.Math.round(f)) < java.lang.Math.abs(i9)) ? f : i9;
                float f4 = f - f3;
                float f5 = (z10 || i9 <= round || f4 > 0.0f) ? 0.0f : (i9 - round) + f4;
                if (i11 < 0) {
                    androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("negative initial offset");
                }
                int i56 = -i11;
                lazyGridMeasuredLine = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine) arrayDeque.firstOrNull();
                int index = (lazyGridMeasuredLine != null || (items2 = lazyGridMeasuredLine.getItems()) == null || (lazyGridMeasuredItem2 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem) kotlin.collections.ArraysKt.firstOrNull(items2)) == null) ? 0 : lazyGridMeasuredItem2.getIndex();
                androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine lazyGridMeasuredLine4 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine) arrayDeque.lastOrNull();
                int index2 = (lazyGridMeasuredLine4 != null || (items = lazyGridMeasuredLine4.getItems()) == null || (lazyGridMeasuredItem = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem) kotlin.collections.ArraysKt.lastOrNull(items)) == null) ? 0 : lazyGridMeasuredItem.getIndex();
                java.util.List<java.lang.Integer> list4 = list;
                int i57 = i56;
                size = list4.size();
                java.util.ArrayList arrayList = null;
                i12 = i11;
                list2 = null;
                i13 = 0;
                while (i13 < size) {
                    int i58 = size;
                    int intValue = list.get(i13).intValue();
                    if (intValue < 0 || intValue >= index) {
                        i24 = index2;
                        i25 = index;
                        f2 = f3;
                        z9 = z10;
                        i26 = i10;
                        i27 = i41;
                        i28 = i46;
                        i29 = i57;
                        i30 = i58;
                    } else {
                        float f6 = f3;
                        int spanOf = lazyGridMeasuredLineProvider.spanOf(intValue);
                        i24 = index2;
                        i25 = index;
                        i29 = i57;
                        i30 = i58;
                        i27 = i41;
                        i28 = i46;
                        f2 = f6;
                        z9 = z10;
                        i26 = i10;
                        androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem mo1796getAndMeasurehBUhpc = lazyGridMeasuredItemProvider.mo1796getAndMeasurehBUhpc(intValue, 0, spanOf, lazyGridMeasuredLineProvider.m1831childConstraintsJhjzzOo$foundation(0, spanOf));
                        java.util.ArrayList arrayList2 = list2 == null ? new java.util.ArrayList() : list2;
                        arrayList2.add(mo1796getAndMeasurehBUhpc);
                        list2 = arrayList2;
                    }
                    i13++;
                    i10 = i26;
                    z10 = z9;
                    size = i30;
                    i57 = i29;
                    index2 = i24;
                    index = i25;
                    i41 = i27;
                    i46 = i28;
                    f3 = f2;
                }
                int i59 = index2;
                int i60 = index;
                float f7 = f3;
                z7 = z10;
                int i61 = i10;
                int i62 = i41;
                int i63 = i46;
                int i64 = i57;
                if (list2 == null) {
                    list2 = kotlin.collections.CollectionsKt.emptyList();
                }
                kotlin.collections.ArrayDeque arrayDeque2 = arrayDeque;
                java.util.List<androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine> Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(i59, i, lazyGridMeasuredLineProvider, z4, arrayDeque2, lazyGridLayoutInfo);
                i14 = 0;
                for (size2 = list4.size(); i14 < size2; size2 = i22) {
                    int intValue2 = list.get(i14).intValue();
                    int i65 = i59;
                    if (i65 + 1 > intValue2 || intValue2 >= i) {
                        i20 = i65;
                        i21 = i14;
                        list3 = Camera2StreamConfigurationMap;
                        i22 = size2;
                    } else {
                        if (z7) {
                            int size4 = Camera2StreamConfigurationMap.size();
                            i23 = i65;
                            int i66 = 0;
                            while (i66 < size4) {
                                int i67 = size4;
                                androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem[] items3 = Camera2StreamConfigurationMap.get(i66).getItems();
                                i21 = i14;
                                int length = items3.length;
                                java.util.List<androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine> list5 = Camera2StreamConfigurationMap;
                                int i68 = 0;
                                while (i68 < length) {
                                    androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem[] lazyGridMeasuredItemArr = items3;
                                    if (items3[i68].getIndex() != intValue2) {
                                        i68++;
                                        items3 = lazyGridMeasuredItemArr;
                                    } else {
                                        list3 = list5;
                                        i22 = size2;
                                        i20 = i23;
                                    }
                                }
                                i66++;
                                size4 = i67;
                                Camera2StreamConfigurationMap = list5;
                                i14 = i21;
                            }
                        } else {
                            i23 = i65;
                        }
                        i21 = i14;
                        int spanOf2 = lazyGridMeasuredLineProvider.spanOf(intValue2);
                        i20 = i23;
                        list3 = Camera2StreamConfigurationMap;
                        i22 = size2;
                        androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem mo1796getAndMeasurehBUhpc2 = lazyGridMeasuredItemProvider.mo1796getAndMeasurehBUhpc(intValue2, 0, spanOf2, lazyGridMeasuredLineProvider.m1831childConstraintsJhjzzOo$foundation(0, spanOf2));
                        if (arrayList == null) {
                            arrayList = new java.util.ArrayList();
                        }
                        java.util.ArrayList arrayList3 = arrayList;
                        arrayList3.add(mo1796getAndMeasurehBUhpc2);
                        arrayList = arrayList3;
                        i14 = i21 + 1;
                        i59 = i20;
                        Camera2StreamConfigurationMap = list3;
                    }
                    i14 = i21 + 1;
                    i59 = i20;
                    Camera2StreamConfigurationMap = list3;
                }
                java.util.List<androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine> list6 = Camera2StreamConfigurationMap;
                i15 = i59;
                java.util.List emptyList = arrayList != null ? kotlin.collections.CollectionsKt.emptyList() : arrayList;
                if (i3 <= 0 || i5 < 0) {
                    size3 = arrayDeque.size();
                    i16 = i12;
                    i17 = 0;
                    while (i17 < size3) {
                        int mainAxisSizeWithSpacings2 = ((androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine) arrayDeque.get(i17)).getMainAxisSizeWithSpacings();
                        if (i16 == 0 || mainAxisSizeWithSpacings2 > i16 || i17 == kotlin.collections.CollectionsKt.getLastIndex(arrayDeque2)) {
                            break;
                        }
                        i16 -= mainAxisSizeWithSpacings2;
                        i17++;
                        lazyGridMeasuredLine = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine) arrayDeque.get(i17);
                    }
                    lazyGridMeasuredLine2 = lazyGridMeasuredLine;
                } else {
                    lazyGridMeasuredLine2 = lazyGridMeasuredLine;
                    i16 = i12;
                }
                if (!z) {
                    m8571constrainWidthK40F9xA = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j);
                } else {
                    m8571constrainWidthK40F9xA = androidx.compose.ui.unit.ConstraintsKt.m8571constrainWidthK40F9xA(j, i61);
                }
                if (!z) {
                    m8553getMaxHeightimpl = androidx.compose.ui.unit.ConstraintsKt.m8570constrainHeightK40F9xA(j, i61);
                } else {
                    m8553getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j);
                }
                final java.util.List<androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(!list6.isEmpty() ? arrayDeque2 : kotlin.collections.CollectionsKt.plus((java.util.Collection) arrayDeque, (java.lang.Iterable) list6), list2, emptyList, m8571constrainWidthK40F9xA, m8553getMaxHeightimpl, i61, i2, i64, z, vertical, horizontal, z2, density);
                lazyLayoutItemAnimator.onMeasured((int) f7, m8571constrainWidthK40F9xA, m8553getMaxHeightimpl, highSpeedVideoFpsRanges, lazyGridMeasuredItemProvider.getKeyIndexMap(), lazyGridMeasuredItemProvider, z, z4, i8, z3, i16, i61, coroutineScope, graphicsContext);
                if (z7) {
                    long m1853getMinSizeToFitDisappearingItemsYbymL2g2 = lazyLayoutItemAnimator.m1853getMinSizeToFitDisappearingItemsYbymL2g();
                    lazyGridMeasuredLine3 = lazyGridMeasuredLine2;
                    i18 = i16;
                    if (!androidx.compose.ui.unit.IntSize.m8770equalsimpl0(m1853getMinSizeToFitDisappearingItemsYbymL2g2, androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g())) {
                        int i69 = z ? m8553getMaxHeightimpl : m8571constrainWidthK40F9xA;
                        i19 = i61;
                        m8571constrainWidthK40F9xA = androidx.compose.ui.unit.ConstraintsKt.m8571constrainWidthK40F9xA(j, java.lang.Math.max(m8571constrainWidthK40F9xA, (int) (m1853getMinSizeToFitDisappearingItemsYbymL2g2 >> 32)));
                        m8553getMaxHeightimpl = androidx.compose.ui.unit.ConstraintsKt.m8570constrainHeightK40F9xA(j, java.lang.Math.max(m8553getMaxHeightimpl, (int) (m1853getMinSizeToFitDisappearingItemsYbymL2g2 & 4294967295L)));
                        int i70 = z ? m8553getMaxHeightimpl : m8571constrainWidthK40F9xA;
                        if (i70 != i69) {
                            int size5 = highSpeedVideoFpsRanges.size();
                            for (int i71 = 0; i71 < size5; i71++) {
                                highSpeedVideoFpsRanges.get(i71).updateMainAxisLayoutSize(i70);
                            }
                        }
                        final java.util.List applyStickyItems = androidx.compose.foundation.lazy.layout.LazyLayoutStickyItemsKt.applyStickyItems(stickyItemsPlacement, i60, i15, highSpeedVideoFpsRanges, lazyGridMeasuredItemProvider.getHeaderIndices(), i3, i4, m8571constrainWidthK40F9xA, m8553getMaxHeightimpl, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem highSpeedVideoFpsRanges2;
                                highSpeedVideoFpsRanges2 = androidx.compose.foundation.lazy.grid.LazyGridMeasureKt.getHighSpeedVideoFpsRanges(androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider.this, lazyGridMeasuredItemProvider, ((java.lang.Integer) obj).intValue());
                                return highSpeedVideoFpsRanges2;
                            }
                        });
                        if (i15 == i - 1) {
                            z8 = z4;
                            if (i19 <= i2) {
                                z5 = false;
                            }
                        } else {
                            z8 = z4;
                        }
                        return new androidx.compose.foundation.lazy.grid.LazyGridMeasureResult(lazyGridMeasuredLine3, i18, z5, f7, function3.invoke(java.lang.Integer.valueOf(m8571constrainWidthK40F9xA), java.lang.Integer.valueOf(m8553getMaxHeightimpl), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                kotlin.Unit highSpeedVideoFpsRanges2;
                                highSpeedVideoFpsRanges2 = androidx.compose.foundation.lazy.grid.LazyGridMeasureKt.getHighSpeedVideoFpsRanges(androidx.compose.runtime.MutableState.this, highSpeedVideoFpsRanges, applyStickyItems, z8, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                                return highSpeedVideoFpsRanges2;
                            }
                        }), f5, z6, coroutineScope, density, i8, function1, function12, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemKt.updatedVisibleItems(i60, i15, highSpeedVideoFpsRanges, applyStickyItems), i62, i63, i, z2, z ? androidx.compose.foundation.gestures.Orientation.Vertical : androidx.compose.foundation.gestures.Orientation.Horizontal, i4, i5);
                    }
                } else {
                    lazyGridMeasuredLine3 = lazyGridMeasuredLine2;
                    i18 = i16;
                }
                i19 = i61;
                final java.util.List applyStickyItems2 = androidx.compose.foundation.lazy.layout.LazyLayoutStickyItemsKt.applyStickyItems(stickyItemsPlacement, i60, i15, highSpeedVideoFpsRanges, lazyGridMeasuredItemProvider.getHeaderIndices(), i3, i4, m8571constrainWidthK40F9xA, m8553getMaxHeightimpl, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem highSpeedVideoFpsRanges2;
                        highSpeedVideoFpsRanges2 = androidx.compose.foundation.lazy.grid.LazyGridMeasureKt.getHighSpeedVideoFpsRanges(androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider.this, lazyGridMeasuredItemProvider, ((java.lang.Integer) obj).intValue());
                        return highSpeedVideoFpsRanges2;
                    }
                });
                if (i15 == i - 1) {
                }
                return new androidx.compose.foundation.lazy.grid.LazyGridMeasureResult(lazyGridMeasuredLine3, i18, z5, f7, function3.invoke(java.lang.Integer.valueOf(m8571constrainWidthK40F9xA), java.lang.Integer.valueOf(m8553getMaxHeightimpl), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit highSpeedVideoFpsRanges2;
                        highSpeedVideoFpsRanges2 = androidx.compose.foundation.lazy.grid.LazyGridMeasureKt.getHighSpeedVideoFpsRanges(androidx.compose.runtime.MutableState.this, highSpeedVideoFpsRanges, applyStickyItems2, z8, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                        return highSpeedVideoFpsRanges2;
                    }
                }), f5, z6, coroutineScope, density, i8, function1, function12, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemKt.updatedVisibleItems(i60, i15, highSpeedVideoFpsRanges, applyStickyItems2), i62, i63, i, z2, z ? androidx.compose.foundation.gestures.Orientation.Vertical : androidx.compose.foundation.gestures.Orientation.Horizontal, i4, i5);
            }
            i47 = i54;
        } else {
            z6 = z12;
            i9 = round;
        }
        i10 = i48;
        i11 = i47;
        if (kotlin.math.MathKt.getSign(java.lang.Math.round(f)) == kotlin.math.MathKt.getSign(i9)) {
        }
        float f42 = f - f3;
        if (z10) {
        }
        if (i11 < 0) {
        }
        int i562 = -i11;
        lazyGridMeasuredLine = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine) arrayDeque.firstOrNull();
        if (lazyGridMeasuredLine != null) {
        }
        androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine lazyGridMeasuredLine42 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine) arrayDeque.lastOrNull();
        if (lazyGridMeasuredLine42 != null) {
        }
        java.util.List<java.lang.Integer> list42 = list;
        int i572 = i562;
        size = list42.size();
        java.util.ArrayList arrayList4 = null;
        i12 = i11;
        list2 = null;
        i13 = 0;
        while (i13 < size) {
        }
        int i592 = index2;
        int i602 = index;
        float f72 = f3;
        z7 = z10;
        int i612 = i10;
        int i622 = i41;
        int i632 = i46;
        int i642 = i572;
        if (list2 == null) {
        }
        kotlin.collections.ArrayDeque arrayDeque22 = arrayDeque;
        java.util.List<androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine> Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(i592, i, lazyGridMeasuredLineProvider, z4, arrayDeque22, lazyGridLayoutInfo);
        i14 = 0;
        while (i14 < size2) {
        }
        java.util.List<androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine> list62 = Camera2StreamConfigurationMap2;
        i15 = i592;
        if (arrayList4 != null) {
        }
        if (i3 <= 0) {
        }
        size3 = arrayDeque.size();
        i16 = i12;
        i17 = 0;
        while (i17 < size3) {
        }
        lazyGridMeasuredLine2 = lazyGridMeasuredLine;
        if (!z) {
        }
        if (!z) {
        }
        final java.util.List highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(!list62.isEmpty() ? arrayDeque22 : kotlin.collections.CollectionsKt.plus((java.util.Collection) arrayDeque, (java.lang.Iterable) list62), list2, emptyList, m8571constrainWidthK40F9xA, m8553getMaxHeightimpl, i612, i2, i642, z, vertical, horizontal, z2, density);
        lazyLayoutItemAnimator.onMeasured((int) f72, m8571constrainWidthK40F9xA, m8553getMaxHeightimpl, highSpeedVideoFpsRanges2, lazyGridMeasuredItemProvider.getKeyIndexMap(), lazyGridMeasuredItemProvider, z, z4, i8, z3, i16, i612, coroutineScope, graphicsContext);
        if (z7) {
        }
        i19 = i612;
        final java.util.List applyStickyItems22 = androidx.compose.foundation.lazy.layout.LazyLayoutStickyItemsKt.applyStickyItems(stickyItemsPlacement, i602, i15, highSpeedVideoFpsRanges2, lazyGridMeasuredItemProvider.getHeaderIndices(), i3, i4, m8571constrainWidthK40F9xA, m8553getMaxHeightimpl, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem highSpeedVideoFpsRanges22;
                highSpeedVideoFpsRanges22 = androidx.compose.foundation.lazy.grid.LazyGridMeasureKt.getHighSpeedVideoFpsRanges(androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider.this, lazyGridMeasuredItemProvider, ((java.lang.Integer) obj).intValue());
                return highSpeedVideoFpsRanges22;
            }
        });
        if (i15 == i - 1) {
        }
        return new androidx.compose.foundation.lazy.grid.LazyGridMeasureResult(lazyGridMeasuredLine3, i18, z5, f72, function3.invoke(java.lang.Integer.valueOf(m8571constrainWidthK40F9xA), java.lang.Integer.valueOf(m8553getMaxHeightimpl), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoFpsRanges22;
                highSpeedVideoFpsRanges22 = androidx.compose.foundation.lazy.grid.LazyGridMeasureKt.getHighSpeedVideoFpsRanges(androidx.compose.runtime.MutableState.this, highSpeedVideoFpsRanges2, applyStickyItems22, z8, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                return highSpeedVideoFpsRanges22;
            }
        }), f5, z6, coroutineScope, density, i8, function1, function12, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemKt.updatedVisibleItems(i602, i15, highSpeedVideoFpsRanges2, applyStickyItems22), i622, i632, i, z2, z ? androidx.compose.foundation.gestures.Orientation.Vertical : androidx.compose.foundation.gestures.Orientation.Horizontal, i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(java.util.List list, java.util.List list2, boolean z, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem) list.get(i)).place(placementScope, z);
        }
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem) list2.get(i2)).place(placementScope, z);
        }
        return kotlin.Unit.INSTANCE;
    }
}
