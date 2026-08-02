package androidx.compose.foundation.lazy;

@kotlin.Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0012\u001a\u0092\u0002\u00101\u001a\u00020.2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001a\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%2/\u0010-\u001a+\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(¢\u0006\u0002\b+\u0012\u0004\u0012\u00020,0'H\u0000¢\u0006\u0004\b/\u00100\u001aI\u00108\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u0018022\u0006\u00104\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u00002\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00000\u001bH\u0002¢\u0006\u0004\b8\u00109\u001a;\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00002\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00000\u001bH\u0002¢\u0006\u0004\b:\u0010;\u001a\u0093\u0001\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0018022\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0006\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u000e2\b\u0010@\u001a\u0004\u0018\u00010\u00102\b\u0010A\u001a\u0004\u0018\u00010\u00122\u0006\u0010B\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020\u0015H\u0002¢\u0006\u0004\b:\u0010D"}, d2 = {"", "itemsCount", "Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;", "measuredItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenItems", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "", "scrollToBeConsumed", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "isVertical", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "reverseLayout", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "itemAnimator", "beyondBoundsItemCount", "", "pinnedItems", "hasLookaheadOccurred", "isLookingAhead", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "placementScopeInvalidator", "Landroidx/compose/ui/graphics/GraphicsContext;", "graphicsContext", "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;", "stickyItemsPlacement", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", androidx.window.reflection.WindowExtensionsConstants.LAYOUT_PACKAGE, "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "measureLazyList-_s_dbAc", "(ILandroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IIIIIIFJZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;ZZLkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "measureLazyList", "", "p0", "p1", "p2", "p3", "p4", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/util/List;Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IILjava/util/List;)Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "(ILandroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;ILjava/util/List;)Ljava/util/List;", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;)Ljava/util/List;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyListMeasureKt {
    private static final int getHighSpeedVideoFpsRangesFor(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges() {
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.lazy.LazyListMeasuredItem getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.lazy.LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i) {
        return androidx.compose.foundation.lazy.LazyListMeasuredItemProvider.m1795getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, i, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.runtime.MutableState mutableState, final java.util.List list, final java.util.List list2, final boolean z, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        placementScope.withMotionFrameOfReferencePlacement(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = androidx.compose.foundation.lazy.LazyListMeasureKt.getHighSpeedVideoFpsRangesFor(list, list2, z, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                return highSpeedVideoFpsRangesFor;
            }
        });
        androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator.m1869attachToScopeimpl(mutableState);
        return kotlin.Unit.INSTANCE;
    }

    private static final java.util.List<androidx.compose.foundation.lazy.LazyListMeasuredItem> getHighResolutionOutputSizeshNQ4ISI(java.util.List<androidx.compose.foundation.lazy.LazyListMeasuredItem> list, androidx.compose.foundation.lazy.LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i, int i2, java.util.List<java.lang.Integer> list2) {
        int min = java.lang.Math.min(((androidx.compose.foundation.lazy.LazyListMeasuredItem) kotlin.collections.CollectionsKt.last((java.util.List) list)).getIndex() + i2, i - 1);
        int index = ((androidx.compose.foundation.lazy.LazyListMeasuredItem) kotlin.collections.CollectionsKt.last((java.util.List) list)).getIndex() + 1;
        java.util.ArrayList arrayList = null;
        if (index <= min) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                arrayList.add(androidx.compose.foundation.lazy.LazyListMeasuredItemProvider.m1795getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, index, 0L, 2, null));
                if (index == min) {
                    break;
                }
                index++;
            }
        }
        if (arrayList != null && ((androidx.compose.foundation.lazy.LazyListMeasuredItem) kotlin.collections.CollectionsKt.last((java.util.List) arrayList)).getIndex() > min) {
            min = ((androidx.compose.foundation.lazy.LazyListMeasuredItem) kotlin.collections.CollectionsKt.last((java.util.List) arrayList)).getIndex();
        }
        int size = list2.size();
        for (int i3 = 0; i3 < size; i3++) {
            int intValue = list2.get(i3).intValue();
            if (intValue > min) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                arrayList.add(androidx.compose.foundation.lazy.LazyListMeasuredItemProvider.m1795getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, intValue, 0L, 2, null));
            }
        }
        return arrayList == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList;
    }

    private static final java.util.List<androidx.compose.foundation.lazy.LazyListMeasuredItem> getHighSpeedVideoFpsRangesFor(int i, androidx.compose.foundation.lazy.LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i2, java.util.List<java.lang.Integer> list) {
        int max = java.lang.Math.max(0, i - i2);
        int i3 = i - 1;
        java.util.ArrayList arrayList = null;
        if (max <= i3) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                arrayList.add(androidx.compose.foundation.lazy.LazyListMeasuredItemProvider.m1795getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, i3, 0L, 2, null));
                if (i3 == max) {
                    break;
                }
                i3--;
            }
        }
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i4 = size - 1;
                int intValue = list.get(size).intValue();
                if (intValue < max) {
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                    }
                    arrayList.add(androidx.compose.foundation.lazy.LazyListMeasuredItemProvider.m1795getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, intValue, 0L, 2, null));
                }
                if (i4 < 0) {
                    break;
                }
                size = i4;
            }
        }
        return arrayList == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList;
    }

    private static final java.util.List<androidx.compose.foundation.lazy.LazyListMeasuredItem> getHighSpeedVideoFpsRangesFor(java.util.List<androidx.compose.foundation.lazy.LazyListMeasuredItem> list, java.util.List<androidx.compose.foundation.lazy.LazyListMeasuredItem> list2, java.util.List<androidx.compose.foundation.lazy.LazyListMeasuredItem> list3, int i, int i2, int i3, int i4, int i5, boolean z, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, boolean z2, androidx.compose.ui.unit.Density density) {
        int i6 = z ? i2 : i;
        int i7 = 0;
        boolean z3 = i3 < java.lang.Math.min(i6, i4);
        if (z3 && i5 != 0) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateException("non-zero itemsScrollOffset");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size() + list2.size() + list3.size());
        if (z3) {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("no extra items");
            }
            int size = list.size();
            int[] iArr = new int[size];
            while (i7 < size) {
                iArr[i7] = list.get(getHighSpeedVideoFpsRangesFor(i7, z2, size)).getSize();
                i7++;
            }
            int[] iArr2 = new int[size];
            if (z) {
                if (vertical != null) {
                    vertical.arrange(density, i6, iArr, iArr2);
                } else {
                    androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null verticalArrangement when isVertical == true");
                    throw new kotlin.KotlinNothingValueException();
                }
            } else if (horizontal != null) {
                horizontal.arrange(density, i6, iArr, androidx.compose.ui.unit.LayoutDirection.Ltr, iArr2);
            } else {
                androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null horizontalArrangement when isVertical == false");
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
                    int i8 = iArr2[first];
                    androidx.compose.foundation.lazy.LazyListMeasuredItem lazyListMeasuredItem = list.get(getHighSpeedVideoFpsRangesFor(first, z2, size));
                    if (z2) {
                        i8 = (i6 - i8) - lazyListMeasuredItem.getSize();
                    }
                    lazyListMeasuredItem.position(i8, i, i2);
                    arrayList.add(lazyListMeasuredItem);
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        } else {
            int size2 = list2.size();
            int i9 = i5;
            for (int i10 = 0; i10 < size2; i10++) {
                androidx.compose.foundation.lazy.LazyListMeasuredItem lazyListMeasuredItem2 = list2.get(i10);
                i9 -= lazyListMeasuredItem2.getMainAxisSizeWithSpacings();
                lazyListMeasuredItem2.position(i9, i, i2);
                arrayList.add(lazyListMeasuredItem2);
            }
            int size3 = list.size();
            int i11 = i5;
            for (int i12 = 0; i12 < size3; i12++) {
                androidx.compose.foundation.lazy.LazyListMeasuredItem lazyListMeasuredItem3 = list.get(i12);
                lazyListMeasuredItem3.position(i11, i, i2);
                arrayList.add(lazyListMeasuredItem3);
                i11 += lazyListMeasuredItem3.getMainAxisSizeWithSpacings();
            }
            int size4 = list3.size();
            while (i7 < size4) {
                androidx.compose.foundation.lazy.LazyListMeasuredItem lazyListMeasuredItem4 = list3.get(i7);
                lazyListMeasuredItem4.position(i11, i, i2);
                arrayList.add(lazyListMeasuredItem4);
                i11 += lazyListMeasuredItem4.getMainAxisSizeWithSpacings();
                i7++;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: measureLazyList-_s_dbAc, reason: not valid java name */
    public static final androidx.compose.foundation.lazy.LazyListMeasureResult m1791measureLazyList_s_dbAc(int i, final androidx.compose.foundation.lazy.LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i2, int i3, int i4, int i5, int i6, int i7, float f, long j, boolean z, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, boolean z2, androidx.compose.ui.unit.Density density, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<androidx.compose.foundation.lazy.LazyListMeasuredItem> lazyLayoutItemAnimator, int i8, java.util.List<java.lang.Integer> list, boolean z3, final boolean z4, kotlinx.coroutines.CoroutineScope coroutineScope, final androidx.compose.runtime.MutableState<kotlin.Unit> mutableState, androidx.compose.ui.graphics.GraphicsContext graphicsContext, androidx.compose.foundation.lazy.layout.StickyItemsPlacement stickyItemsPlacement, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.lang.Integer, ? super kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>, ? extends androidx.compose.ui.layout.MeasureResult> function3) {
        int i9;
        int i10;
        boolean z5;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        float f2;
        java.lang.Integer valueOf;
        int i19;
        boolean z6 = z4;
        if (i3 < 0) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("invalid beforeContentPadding");
        }
        if (i4 < 0) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("invalid afterContentPadding");
        }
        if (i <= 0) {
            int m8556getMinWidthimpl = androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j);
            int m8555getMinHeightimpl = androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j);
            lazyLayoutItemAnimator.onMeasured(0, m8556getMinWidthimpl, m8555getMinHeightimpl, new java.util.ArrayList(), lazyListMeasuredItemProvider.getKeyIndexMap(), lazyListMeasuredItemProvider, z, z4, 1, z3, 0, 0, coroutineScope, graphicsContext);
            if (!z6) {
                long m1853getMinSizeToFitDisappearingItemsYbymL2g = lazyLayoutItemAnimator.m1853getMinSizeToFitDisappearingItemsYbymL2g();
                if (!androidx.compose.ui.unit.IntSize.m8770equalsimpl0(m1853getMinSizeToFitDisappearingItemsYbymL2g, androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g())) {
                    m8556getMinWidthimpl = androidx.compose.ui.unit.ConstraintsKt.m8571constrainWidthK40F9xA(j, (int) (m1853getMinSizeToFitDisappearingItemsYbymL2g >> 32));
                    m8555getMinHeightimpl = androidx.compose.ui.unit.ConstraintsKt.m8570constrainHeightK40F9xA(j, (int) (m1853getMinSizeToFitDisappearingItemsYbymL2g & 4294967295L));
                }
            }
            return new androidx.compose.foundation.lazy.LazyListMeasureResult(null, 0, false, 0.0f, function3.invoke(java.lang.Integer.valueOf(m8556getMinWidthimpl), java.lang.Integer.valueOf(m8555getMinHeightimpl), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    kotlin.Unit highSpeedVideoFpsRanges;
                    highSpeedVideoFpsRanges = androidx.compose.foundation.lazy.LazyListMeasureKt.getHighSpeedVideoFpsRanges();
                    return highSpeedVideoFpsRanges;
                }
            }), 0.0f, false, coroutineScope, density, lazyListMeasuredItemProvider.getChildConstraints(), kotlin.collections.CollectionsKt.emptyList(), -i3, i2 + i4, 0, z2, z ? androidx.compose.foundation.gestures.Orientation.Vertical : androidx.compose.foundation.gestures.Orientation.Horizontal, i4, i5, null);
        }
        int i20 = i6;
        if (i20 >= i) {
            i20 = i - 1;
            i9 = 0;
        } else {
            i9 = i7;
        }
        int round = java.lang.Math.round(f);
        int i21 = i9 - round;
        if (i20 != 0 || i21 >= 0) {
            i10 = round;
        } else {
            i10 = round + i21;
            i21 = 0;
        }
        kotlin.collections.ArrayDeque arrayDeque = new kotlin.collections.ArrayDeque();
        int i22 = -i3;
        int i23 = (i5 < 0 ? i5 : 0) + i22;
        int i24 = i21 + i23;
        int i25 = 0;
        while (i24 < 0 && i20 > 0) {
            int i26 = i20 - 1;
            kotlin.collections.ArrayDeque arrayDeque2 = arrayDeque;
            androidx.compose.foundation.lazy.LazyListMeasuredItem m1795getAndMeasure0kLqBqw$default = androidx.compose.foundation.lazy.LazyListMeasuredItemProvider.m1795getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, i26, 0L, 2, null);
            arrayDeque2.add(0, m1795getAndMeasure0kLqBqw$default);
            i25 = java.lang.Math.max(i25, m1795getAndMeasure0kLqBqw$default.getCrossAxisSize());
            i24 += m1795getAndMeasure0kLqBqw$default.getMainAxisSizeWithSpacings();
            z6 = z6;
            arrayDeque = arrayDeque2;
            i20 = i26;
            i22 = i22;
        }
        kotlin.collections.ArrayDeque arrayDeque3 = arrayDeque;
        int i27 = i22;
        boolean z7 = z6;
        int i28 = i25;
        if (i24 < i23) {
            i10 -= i23 - i24;
            i24 = i23;
        }
        int i29 = i24 - i23;
        int i30 = i2 + i4;
        int coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(i30, 0);
        int i31 = i20;
        int i32 = i31;
        int i33 = -i29;
        int i34 = 0;
        boolean z8 = false;
        while (true) {
            z5 = true;
            if (i34 >= arrayDeque3.size()) {
                break;
            }
            if (i33 >= coerceAtLeast) {
                arrayDeque3.remove(i34);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                z8 = true;
            } else {
                i32++;
                i33 += ((androidx.compose.foundation.lazy.LazyListMeasuredItem) arrayDeque3.get(i34)).getMainAxisSizeWithSpacings();
                i34++;
            }
        }
        int i35 = i28;
        boolean z9 = z8;
        int i36 = i32;
        int i37 = i31;
        int i38 = i29;
        int i39 = i33;
        while (i36 < i && (i39 < coerceAtLeast || i39 <= 0 || arrayDeque3.isEmpty())) {
            int i40 = i35;
            int i41 = i36;
            int i42 = coerceAtLeast;
            int i43 = i30;
            androidx.compose.foundation.lazy.LazyListMeasuredItem m1795getAndMeasure0kLqBqw$default2 = androidx.compose.foundation.lazy.LazyListMeasuredItemProvider.m1795getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, i36, 0L, 2, null);
            i39 += m1795getAndMeasure0kLqBqw$default2.getMainAxisSizeWithSpacings();
            if (i39 <= i23) {
                i19 = i41;
                if (i19 != i - 1) {
                    i38 -= m1795getAndMeasure0kLqBqw$default2.getMainAxisSizeWithSpacings();
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    i37 = i19 + 1;
                    z9 = true;
                    i35 = i40;
                    i36 = i19 + 1;
                    coerceAtLeast = i42;
                    i30 = i43;
                }
            } else {
                i19 = i41;
            }
            i35 = java.lang.Math.max(i40, m1795getAndMeasure0kLqBqw$default2.getCrossAxisSize());
            arrayDeque3.add(m1795getAndMeasure0kLqBqw$default2);
            i36 = i19 + 1;
            coerceAtLeast = i42;
            i30 = i43;
        }
        int i44 = i30;
        int i45 = i36;
        int i46 = i35;
        if (i39 < i2) {
            int i47 = i2 - i39;
            int i48 = i39 + i47;
            int i49 = i46;
            int i50 = i38 - i47;
            while (i50 < i3 && i37 > 0) {
                i37--;
                androidx.compose.foundation.lazy.LazyListMeasuredItem m1795getAndMeasure0kLqBqw$default3 = androidx.compose.foundation.lazy.LazyListMeasuredItemProvider.m1795getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, i37, 0L, 2, null);
                arrayDeque3.add(0, m1795getAndMeasure0kLqBqw$default3);
                i49 = java.lang.Math.max(i49, m1795getAndMeasure0kLqBqw$default3.getCrossAxisSize());
                i50 += m1795getAndMeasure0kLqBqw$default3.getMainAxisSizeWithSpacings();
                i45 = i45;
            }
            i46 = i49;
            int i51 = i50;
            i11 = i45;
            i12 = i47 + i10;
            if (i51 < 0) {
                i12 += i51;
                i39 = i48 + i51;
                i14 = 0;
                i13 = i37;
            } else {
                i13 = i37;
                i39 = i48;
                i14 = i51;
            }
        } else {
            i11 = i45;
            i12 = i10;
            i13 = i37;
            i14 = i38;
        }
        float f3 = (kotlin.math.MathKt.getSign(java.lang.Math.round(f)) != kotlin.math.MathKt.getSign(i12) || java.lang.Math.abs(java.lang.Math.round(f)) < java.lang.Math.abs(i12)) ? f : i12;
        float f4 = f - f3;
        float f5 = (!z7 || i12 <= i10 || f4 > 0.0f) ? 0.0f : (i12 - i10) + f4;
        if (i14 < 0) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("negative currentFirstItemScrollOffset");
        }
        int i52 = -i14;
        androidx.compose.foundation.lazy.LazyListMeasuredItem lazyListMeasuredItem = (androidx.compose.foundation.lazy.LazyListMeasuredItem) arrayDeque3.first();
        if (i3 > 0 || i5 < 0) {
            int i53 = i14;
            int size = arrayDeque3.size();
            androidx.compose.foundation.lazy.LazyListMeasuredItem lazyListMeasuredItem2 = lazyListMeasuredItem;
            int i54 = i53;
            i15 = i46;
            int i55 = 0;
            while (i55 < size) {
                int i56 = size;
                int mainAxisSizeWithSpacings = ((androidx.compose.foundation.lazy.LazyListMeasuredItem) arrayDeque3.get(i55)).getMainAxisSizeWithSpacings();
                if (i54 == 0 || mainAxisSizeWithSpacings > i54 || i55 == kotlin.collections.CollectionsKt.getLastIndex(arrayDeque3)) {
                    break;
                }
                i54 -= mainAxisSizeWithSpacings;
                i55++;
                lazyListMeasuredItem2 = (androidx.compose.foundation.lazy.LazyListMeasuredItem) arrayDeque3.get(i55);
                size = i56;
            }
            i16 = i54;
            lazyListMeasuredItem = lazyListMeasuredItem2;
        } else {
            i15 = i46;
            i16 = i14;
        }
        java.util.List<androidx.compose.foundation.lazy.LazyListMeasuredItem> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(i13, lazyListMeasuredItemProvider, i8, list);
        int i57 = i15;
        int i58 = 0;
        for (int size2 = highSpeedVideoFpsRangesFor.size(); i58 < size2; size2 = size2) {
            i57 = java.lang.Math.max(i57, highSpeedVideoFpsRangesFor.get(i58).getCrossAxisSize());
            i58++;
        }
        kotlin.collections.ArrayDeque arrayDeque4 = arrayDeque3;
        java.util.List<androidx.compose.foundation.lazy.LazyListMeasuredItem> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(arrayDeque4, lazyListMeasuredItemProvider, i, i8, list);
        int i59 = i57;
        int i60 = 0;
        for (int size3 = highResolutionOutputSizeshNQ4ISI.size(); i60 < size3; size3 = size3) {
            i59 = java.lang.Math.max(i59, highResolutionOutputSizeshNQ4ISI.get(i60).getCrossAxisSize());
            i60++;
        }
        boolean z10 = kotlin.jvm.internal.Intrinsics.areEqual(lazyListMeasuredItem, arrayDeque3.first()) && highSpeedVideoFpsRangesFor.isEmpty() && highResolutionOutputSizeshNQ4ISI.isEmpty();
        int i61 = i59;
        float f6 = f5;
        androidx.compose.foundation.lazy.LazyListMeasuredItem lazyListMeasuredItem3 = lazyListMeasuredItem;
        int m8571constrainWidthK40F9xA = androidx.compose.ui.unit.ConstraintsKt.m8571constrainWidthK40F9xA(j, z ? i61 : i39);
        int i62 = i11;
        int m8570constrainHeightK40F9xA = androidx.compose.ui.unit.ConstraintsKt.m8570constrainHeightK40F9xA(j, z ? i39 : i61);
        final java.util.List<androidx.compose.foundation.lazy.LazyListMeasuredItem> highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(arrayDeque4, highSpeedVideoFpsRangesFor, highResolutionOutputSizeshNQ4ISI, m8571constrainWidthK40F9xA, m8570constrainHeightK40F9xA, i39, i2, i52, z, vertical, horizontal, z2, density);
        lazyLayoutItemAnimator.onMeasured((int) f3, m8571constrainWidthK40F9xA, m8570constrainHeightK40F9xA, highSpeedVideoFpsRangesFor2, lazyListMeasuredItemProvider.getKeyIndexMap(), lazyListMeasuredItemProvider, z, z4, 1, z3, i16, i39, coroutineScope, graphicsContext);
        if (z4) {
            i17 = i39;
            i18 = i16;
            f2 = f3;
        } else {
            f2 = f3;
            long m1853getMinSizeToFitDisappearingItemsYbymL2g2 = lazyLayoutItemAnimator.m1853getMinSizeToFitDisappearingItemsYbymL2g();
            i17 = i39;
            i18 = i16;
            if (!androidx.compose.ui.unit.IntSize.m8770equalsimpl0(m1853getMinSizeToFitDisappearingItemsYbymL2g2, androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g())) {
                int i63 = z ? m8570constrainHeightK40F9xA : m8571constrainWidthK40F9xA;
                m8571constrainWidthK40F9xA = androidx.compose.ui.unit.ConstraintsKt.m8571constrainWidthK40F9xA(j, java.lang.Math.max(m8571constrainWidthK40F9xA, (int) (m1853getMinSizeToFitDisappearingItemsYbymL2g2 >> 32)));
                m8570constrainHeightK40F9xA = androidx.compose.ui.unit.ConstraintsKt.m8570constrainHeightK40F9xA(j, java.lang.Math.max(m8570constrainHeightK40F9xA, (int) (m1853getMinSizeToFitDisappearingItemsYbymL2g2 & 4294967295L)));
                int i64 = z ? m8570constrainHeightK40F9xA : m8571constrainWidthK40F9xA;
                if (i64 != i63) {
                    int size4 = highSpeedVideoFpsRangesFor2.size();
                    for (int i65 = 0; i65 < size4; i65++) {
                        highSpeedVideoFpsRangesFor2.get(i65).updateMainAxisLayoutSize(i64);
                    }
                }
            }
        }
        androidx.compose.foundation.lazy.LazyListMeasuredItem lazyListMeasuredItem4 = (androidx.compose.foundation.lazy.LazyListMeasuredItem) arrayDeque3.firstOrNull();
        int index = lazyListMeasuredItem4 != null ? lazyListMeasuredItem4.getIndex() : 0;
        androidx.compose.foundation.lazy.LazyListMeasuredItem lazyListMeasuredItem5 = (androidx.compose.foundation.lazy.LazyListMeasuredItem) arrayDeque3.lastOrNull();
        final java.util.List applyStickyItems = androidx.compose.foundation.lazy.layout.LazyLayoutStickyItemsKt.applyStickyItems(stickyItemsPlacement, index, lazyListMeasuredItem5 != null ? lazyListMeasuredItem5.getIndex() : 0, highSpeedVideoFpsRangesFor2, lazyListMeasuredItemProvider.getHeaderIndexes(), i3, i4, m8571constrainWidthK40F9xA, m8570constrainHeightK40F9xA, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                androidx.compose.foundation.lazy.LazyListMeasuredItem highSpeedVideoFpsRangesFor3;
                highSpeedVideoFpsRangesFor3 = androidx.compose.foundation.lazy.LazyListMeasureKt.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.lazy.LazyListMeasuredItemProvider.this, ((java.lang.Integer) obj).intValue());
                return highSpeedVideoFpsRangesFor3;
            }
        });
        java.lang.Integer num = null;
        if (z10) {
            androidx.compose.foundation.lazy.LazyListMeasuredItem lazyListMeasuredItem6 = (androidx.compose.foundation.lazy.LazyListMeasuredItem) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) highSpeedVideoFpsRangesFor2);
            if (lazyListMeasuredItem6 != null) {
                valueOf = java.lang.Integer.valueOf(lazyListMeasuredItem6.getIndex());
            }
            valueOf = null;
        } else {
            androidx.compose.foundation.lazy.LazyListMeasuredItem lazyListMeasuredItem7 = (androidx.compose.foundation.lazy.LazyListMeasuredItem) arrayDeque3.firstOrNull();
            if (lazyListMeasuredItem7 != null) {
                valueOf = java.lang.Integer.valueOf(lazyListMeasuredItem7.getIndex());
            }
            valueOf = null;
        }
        if (z10) {
            androidx.compose.foundation.lazy.LazyListMeasuredItem lazyListMeasuredItem8 = (androidx.compose.foundation.lazy.LazyListMeasuredItem) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) highSpeedVideoFpsRangesFor2);
            if (lazyListMeasuredItem8 != null) {
                num = java.lang.Integer.valueOf(lazyListMeasuredItem8.getIndex());
            }
        } else {
            androidx.compose.foundation.lazy.LazyListMeasuredItem lazyListMeasuredItem9 = (androidx.compose.foundation.lazy.LazyListMeasuredItem) arrayDeque3.lastOrNull();
            if (lazyListMeasuredItem9 != null) {
                num = java.lang.Integer.valueOf(lazyListMeasuredItem9.getIndex());
            }
        }
        if (i62 >= i && i17 <= i2) {
            z5 = false;
        }
        return new androidx.compose.foundation.lazy.LazyListMeasureResult(lazyListMeasuredItem3, i18, z5, f2, function3.invoke(java.lang.Integer.valueOf(m8571constrainWidthK40F9xA), java.lang.Integer.valueOf(m8570constrainHeightK40F9xA), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.foundation.lazy.LazyListMeasureKt.Camera2StreamConfigurationMap(androidx.compose.runtime.MutableState.this, highSpeedVideoFpsRangesFor2, applyStickyItems, z4, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                return Camera2StreamConfigurationMap;
            }
        }), f6, z9, coroutineScope, density, lazyListMeasuredItemProvider.getChildConstraints(), androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemKt.updatedVisibleItems(valueOf != null ? valueOf.intValue() : 0, num != null ? num.intValue() : 0, highSpeedVideoFpsRangesFor2, applyStickyItems), i27, i44, i, z2, z ? androidx.compose.foundation.gestures.Orientation.Vertical : androidx.compose.foundation.gestures.Orientation.Horizontal, i4, i5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(java.util.List list, java.util.List list2, boolean z, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((androidx.compose.foundation.lazy.LazyListMeasuredItem) list.get(i)).place(placementScope, z);
        }
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((androidx.compose.foundation.lazy.LazyListMeasuredItem) list2.get(i2)).place(placementScope, z);
        }
        return kotlin.Unit.INSTANCE;
    }
}
