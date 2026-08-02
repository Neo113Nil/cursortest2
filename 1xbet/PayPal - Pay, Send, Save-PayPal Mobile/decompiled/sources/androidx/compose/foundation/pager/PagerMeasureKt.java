package androidx.compose.foundation.pager;

@kotlin.Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u008a\u0002\u00100\u001a\u00020-*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2/\u0010)\u001a+\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$¢\u0006\u0002\b'\u0012\u0004\u0012\u00020(0#2\u0012\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00190*H\u0000¢\u0006\u0004\b.\u0010/\u001aO\u00107\u001a\b\u0012\u0004\u0012\u0002050\u00192\u0006\u00101\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u00012\u0006\u00103\u001a\u00020\u00012\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002050$H\u0002¢\u0006\u0004\b7\u00108\u001aG\u00109\u001a\b\u0012\u0004\u0012\u0002050\u00192\u0006\u00101\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u00012\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002050$H\u0002¢\u0006\u0004\b9\u0010:\u001aO\u0010=\u001a\u0004\u0018\u0001052\u0006\u00101\u001a\u00020\u00012\f\u00102\u001a\b\u0012\u0004\u0012\u0002050\u00192\u0006\u00103\u001a\u00020\u00012\u0006\u00104\u001a\u00020\u00012\u0006\u00106\u001a\u00020\u00012\u0006\u0010;\u001a\u00020\u001b2\u0006\u0010<\u001a\u00020\u0001H\u0002¢\u0006\u0004\b=\u0010>\u001a{\u0010D\u001a\u000205*\u00020\u00002\u0006\u00101\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u00152\u0006\u00106\u001a\u00020\r2\b\u0010;\u001a\u0004\u0018\u00010\u00112\b\u0010<\u001a\u0004\u0018\u00010\u000f2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020\u00132\u0006\u0010B\u001a\u00020\u00012\u0012\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00190*H\u0002¢\u0006\u0004\bD\u0010E\u001a\u0093\u0001\u0010D\u001a\b\u0012\u0004\u0012\u0002050H*\u00020\u00002\f\u00101\u001a\b\u0012\u0004\u0012\u0002050\u00192\f\u00102\u001a\b\u0012\u0004\u0012\u0002050\u00192\f\u00103\u001a\b\u0012\u0004\u0012\u0002050\u00192\u0006\u00104\u001a\u00020\u00012\u0006\u00106\u001a\u00020\u00012\u0006\u0010;\u001a\u00020\u00012\u0006\u0010<\u001a\u00020\u00012\u0006\u0010@\u001a\u00020\u00012\u0006\u0010A\u001a\u00020\r2\u0006\u0010B\u001a\u00020\u00132\u0006\u0010C\u001a\u00020!2\u0006\u0010F\u001a\u00020\u00012\u0006\u0010G\u001a\u00020\u0001H\u0002¢\u0006\u0004\bD\u0010I\"\u0014\u0010K\u001a\u00020J8\u0000X\u0080T¢\u0006\u0006\n\u0004\bK\u0010L\"\u0014\u0010M\u001a\u00020J8\u0000X\u0080T¢\u0006\u0006\n\u0004\bM\u0010L"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "", "pageCount", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "pagerItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenPages", "currentPage", "currentPageOffset", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "", "reverseLayout", "Landroidx/compose/ui/unit/IntOffset;", "visualPageOffset", "pageAvailableSize", "beyondViewportPageCount", "", "pinnedPages", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "snapPosition", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "placementScopeInvalidator", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Landroidx/compose/ui/unit/Density;", "density", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", androidx.window.reflection.WindowExtensionsConstants.LAYOUT_PACKAGE, "Landroidx/collection/MutableIntObjectMap;", "Landroidx/compose/ui/layout/Placeable;", "placeablesCache", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "measurePager-7L1iB3k", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;ILandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;IIIIIIJLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/Alignment$Horizontal;ZJIILjava/util/List;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Landroidx/compose/runtime/MutableState;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function3;Landroidx/collection/MutableIntObjectMap;)Landroidx/compose/foundation/pager/PagerMeasureResult;", "measurePager", "p0", "p1", "p2", "p3", "Landroidx/compose/foundation/pager/MeasuredPage;", "p4", "getHighResolutionOutputSizeshNQ4ISI", "(IIILjava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "Camera2StreamConfigurationMap", "(IILjava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "p5", "p6", "getHighSpeedVideoFpsRanges", "(ILjava/util/List;IIILandroidx/compose/foundation/gestures/snapping/SnapPosition;I)Landroidx/compose/foundation/pager/MeasuredPage;", "Landroidx/compose/ui/unit/LayoutDirection;", "p7", "p8", "p9", "p10", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;IJLandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;JLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZILandroidx/collection/MutableIntObjectMap;)Landroidx/compose/foundation/pager/MeasuredPage;", "p11", "p12", "", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIILandroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/ui/unit/Density;II)Ljava/util/List;", "", "MinPageOffset", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "MaxPageOffset"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PagerMeasureKt {
    public static final float MaxPageOffset = 0.5f;
    public static final float MinPageOffset = -0.5f;

    private static final int Camera2StreamConfigurationMap(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI() {
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.pager.MeasuredPage getHighSpeedVideoSizes(androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope, long j, androidx.compose.foundation.pager.PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, long j2, androidx.compose.foundation.gestures.Orientation orientation, androidx.compose.ui.Alignment.Horizontal horizontal, androidx.compose.ui.Alignment.Vertical vertical, boolean z, int i, androidx.collection.MutableIntObjectMap mutableIntObjectMap, int i2) {
        return getHighSpeedVideoFpsRangesFor(lazyLayoutMeasureScope, i2, j, pagerLazyLayoutItemProvider, j2, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z, i, mutableIntObjectMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.pager.MeasuredPage getHighSpeedVideoFpsRanges(androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope, long j, androidx.compose.foundation.pager.PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, long j2, androidx.compose.foundation.gestures.Orientation orientation, androidx.compose.ui.Alignment.Horizontal horizontal, androidx.compose.ui.Alignment.Vertical vertical, boolean z, int i, androidx.collection.MutableIntObjectMap mutableIntObjectMap, int i2) {
        return getHighSpeedVideoFpsRangesFor(lazyLayoutMeasureScope, i2, j, pagerLazyLayoutItemProvider, j2, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z, i, mutableIntObjectMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.runtime.MutableState mutableState, final java.util.List list, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        placementScope.withMotionFrameOfReferencePlacement(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.foundation.pager.PagerMeasureKt.Camera2StreamConfigurationMap(list, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                return Camera2StreamConfigurationMap;
            }
        });
        androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator.m1869attachToScopeimpl(mutableState);
        return kotlin.Unit.INSTANCE;
    }

    private static final java.util.List<androidx.compose.foundation.pager.MeasuredPage> getHighResolutionOutputSizeshNQ4ISI(int i, int i2, int i3, java.util.List<java.lang.Integer> list, kotlin.jvm.functions.Function1<? super java.lang.Integer, androidx.compose.foundation.pager.MeasuredPage> function1) {
        int min = java.lang.Math.min(i3, (i2 - i) - 1) + i;
        int i4 = i + 1;
        java.util.ArrayList arrayList = null;
        if (i4 <= min) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                arrayList.add(function1.invoke(java.lang.Integer.valueOf(i4)));
                if (i4 == min) {
                    break;
                }
                i4++;
            }
        }
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            int intValue = list.get(i5).intValue();
            if (min + 1 <= intValue && intValue < i2) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                arrayList.add(function1.invoke(java.lang.Integer.valueOf(intValue)));
            }
        }
        return arrayList == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList;
    }

    private static final java.util.List<androidx.compose.foundation.pager.MeasuredPage> Camera2StreamConfigurationMap(int i, int i2, java.util.List<java.lang.Integer> list, kotlin.jvm.functions.Function1<? super java.lang.Integer, androidx.compose.foundation.pager.MeasuredPage> function1) {
        int max = java.lang.Math.max(0, i - i2);
        int i3 = i - 1;
        java.util.ArrayList arrayList = null;
        if (max <= i3) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                arrayList.add(function1.invoke(java.lang.Integer.valueOf(i3)));
                if (i3 == max) {
                    break;
                }
                i3--;
            }
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            int intValue = list.get(i4).intValue();
            if (intValue < max) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                arrayList.add(function1.invoke(java.lang.Integer.valueOf(intValue)));
            }
        }
        return arrayList == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList;
    }

    private static final androidx.compose.foundation.pager.MeasuredPage getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope, int i, long j, androidx.compose.foundation.pager.PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, long j2, androidx.compose.foundation.gestures.Orientation orientation, androidx.compose.ui.Alignment.Horizontal horizontal, androidx.compose.ui.Alignment.Vertical vertical, androidx.compose.ui.unit.LayoutDirection layoutDirection, boolean z, int i2, androidx.collection.MutableIntObjectMap<java.util.List<androidx.compose.ui.layout.Placeable>> mutableIntObjectMap) {
        java.util.List<androidx.compose.ui.layout.Placeable> list;
        java.lang.Object key = pagerLazyLayoutItemProvider.getKey(i);
        java.util.List<androidx.compose.ui.layout.Placeable> list2 = mutableIntObjectMap.get(i);
        if (list2 != null) {
            list = list2;
        } else {
            java.util.List<androidx.compose.ui.layout.Measurable> compose = lazyLayoutMeasureScope.compose(i);
            int size = compose.size();
            java.util.ArrayList arrayList = new java.util.ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(compose.get(i3).mo7353measureBRTryo0(j));
            }
            java.util.ArrayList arrayList2 = arrayList;
            mutableIntObjectMap.set(i, arrayList2);
            list = arrayList2;
        }
        return new androidx.compose.foundation.pager.MeasuredPage(i, i2, list, j2, key, orientation, horizontal, vertical, layoutDirection, z, null);
    }

    private static final java.util.List<androidx.compose.foundation.pager.MeasuredPage> getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope, java.util.List<androidx.compose.foundation.pager.MeasuredPage> list, java.util.List<androidx.compose.foundation.pager.MeasuredPage> list2, java.util.List<androidx.compose.foundation.pager.MeasuredPage> list3, int i, int i2, int i3, int i4, int i5, androidx.compose.foundation.gestures.Orientation orientation, boolean z, androidx.compose.ui.unit.Density density, int i6, int i7) {
        int i8;
        int i9;
        java.util.ArrayList arrayList;
        int i10 = i7 + i6;
        if (orientation == androidx.compose.foundation.gestures.Orientation.Vertical) {
            i8 = i4;
            i9 = i2;
        } else {
            i8 = i4;
            i9 = i;
        }
        int i11 = 0;
        boolean z2 = i3 < java.lang.Math.min(i9, i8);
        if (z2 && i5 != 0) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateException("non-zero pagesScrollOffset=".concat(java.lang.String.valueOf(i5)));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size() + list2.size() + list3.size());
        if (z2) {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("No extra pages");
            }
            int size = list.size();
            int[] iArr = new int[size];
            while (i11 < size) {
                iArr[i11] = i7;
                i11++;
            }
            int[] iArr2 = new int[size];
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1605spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.Absolute.INSTANCE.m1605spacedBy0680j_4(lazyLayoutMeasureScope.mo1415toDpu2uoSUM(i6));
            if (orientation == androidx.compose.foundation.gestures.Orientation.Vertical) {
                m1605spacedBy0680j_4.arrange(density, i9, iArr, iArr2);
                arrayList = arrayList2;
            } else {
                arrayList = arrayList2;
                m1605spacedBy0680j_4.arrange(density, i9, iArr, androidx.compose.ui.unit.LayoutDirection.Ltr, iArr2);
            }
            kotlin.ranges.IntRange indices = kotlin.collections.ArraysKt.getIndices(iArr2);
            if (z) {
                indices = kotlin.ranges.RangesKt.reversed(indices);
            }
            int first = indices.getFirst();
            int last = indices.getLast();
            int step = indices.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    int i12 = iArr2[first];
                    androidx.compose.foundation.pager.MeasuredPage measuredPage = list.get(Camera2StreamConfigurationMap(first, z, size));
                    if (z) {
                        i12 = (i9 - i12) - measuredPage.getSize();
                    }
                    measuredPage.position(i12, i, i2);
                    arrayList.add(measuredPage);
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        } else {
            arrayList = arrayList2;
            int size2 = list2.size();
            int i13 = i5;
            for (int i14 = 0; i14 < size2; i14++) {
                androidx.compose.foundation.pager.MeasuredPage measuredPage2 = list2.get(i14);
                i13 -= i10;
                measuredPage2.position(i13, i, i2);
                arrayList.add(measuredPage2);
            }
            int size3 = list.size();
            int i15 = i5;
            for (int i16 = 0; i16 < size3; i16++) {
                androidx.compose.foundation.pager.MeasuredPage measuredPage3 = list.get(i16);
                measuredPage3.position(i15, i, i2);
                arrayList.add(measuredPage3);
                i15 += i10;
            }
            int size4 = list3.size();
            while (i11 < size4) {
                androidx.compose.foundation.pager.MeasuredPage measuredPage4 = list3.get(i11);
                measuredPage4.position(i15, i, i2);
                arrayList.add(measuredPage4);
                i15 += i10;
                i11++;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: measurePager-7L1iB3k, reason: not valid java name */
    public static final androidx.compose.foundation.pager.PagerMeasureResult m1929measurePager7L1iB3k(final androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope, int i, final androidx.compose.foundation.pager.PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i2, int i3, int i4, int i5, int i6, int i7, long j, final androidx.compose.foundation.gestures.Orientation orientation, final androidx.compose.ui.Alignment.Vertical vertical, final androidx.compose.ui.Alignment.Horizontal horizontal, final boolean z, final long j2, final int i8, int i9, java.util.List<java.lang.Integer> list, androidx.compose.foundation.gestures.snapping.SnapPosition snapPosition, final androidx.compose.runtime.MutableState<kotlin.Unit> mutableState, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.ui.unit.Density density, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.lang.Integer, ? super kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>, ? extends androidx.compose.ui.layout.MeasureResult> function3, final androidx.collection.MutableIntObjectMap<java.util.List<androidx.compose.ui.layout.Placeable>> mutableIntObjectMap) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        long j3;
        java.util.List<androidx.compose.foundation.pager.MeasuredPage> list2;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        int i15;
        int i16;
        if (i3 < 0) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("negative beforeContentPadding");
        }
        if (i4 < 0) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("negative afterContentPadding");
        }
        int i17 = 0;
        int coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(i8 + i5, 0);
        int coerceAtMost = kotlin.ranges.RangesKt.coerceAtMost(i9, i);
        final long Constraints$default = androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, orientation == androidx.compose.foundation.gestures.Orientation.Vertical ? androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j) : i8, 0, orientation != androidx.compose.foundation.gestures.Orientation.Vertical ? androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j) : i8, 5, null);
        if (i <= 0) {
            return new androidx.compose.foundation.pager.PagerMeasureResult(kotlin.collections.CollectionsKt.emptyList(), i8, i5, i4, orientation, -i3, i2 + i4, false, coerceAtMost, null, null, 0.0f, 0, false, snapPosition, function3.invoke(java.lang.Integer.valueOf(androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j)), java.lang.Integer.valueOf(androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j)), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.pager.PagerMeasureKt.getHighResolutionOutputSizeshNQ4ISI();
                    return highResolutionOutputSizeshNQ4ISI;
                }
            }), false, null, null, coroutineScope, density, Constraints$default, 393216, null);
        }
        int i18 = coerceAtMost;
        int i19 = i6;
        int i20 = i7;
        while (i19 > 0 && i20 > 0) {
            i19--;
            i20 -= coerceAtLeast;
        }
        int i21 = i20 * (-1);
        if (i19 >= i) {
            i19 = i - 1;
            i21 = 0;
        }
        kotlin.collections.ArrayDeque arrayDeque = new kotlin.collections.ArrayDeque();
        int i22 = -i3;
        int i23 = (i5 < 0 ? i5 : 0) + i22;
        int i24 = i21 + i23;
        int i25 = 0;
        while (i24 < 0 && i19 > 0) {
            int i26 = i19 - 1;
            kotlin.collections.ArrayDeque arrayDeque2 = arrayDeque;
            int i27 = coerceAtLeast;
            int i28 = i17;
            androidx.compose.foundation.pager.MeasuredPage highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(lazyLayoutMeasureScope, i26, Constraints$default, pagerLazyLayoutItemProvider, j2, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z, i8, mutableIntObjectMap);
            arrayDeque2.add(i28, highSpeedVideoFpsRangesFor);
            i25 = java.lang.Math.max(i25, highSpeedVideoFpsRangesFor.getCrossAxisSize());
            i24 += i27;
            i23 = i23;
            coerceAtLeast = i27;
            arrayDeque = arrayDeque2;
            i17 = i28;
            i19 = i26;
            i22 = i22;
            i18 = i18;
        }
        int i29 = i24;
        int i30 = i22;
        int i31 = i23;
        kotlin.collections.ArrayDeque arrayDeque3 = arrayDeque;
        int i32 = coerceAtLeast;
        int i33 = i18;
        int i34 = i17;
        int i35 = (i29 < i31 ? i31 : i29) - i31;
        int i36 = i2 + i4;
        int coerceAtLeast2 = kotlin.ranges.RangesKt.coerceAtLeast(i36, i34);
        int i37 = -i35;
        int i38 = i34;
        int i39 = i38;
        int i40 = i19;
        while (i38 < arrayDeque3.size()) {
            if (i37 >= coerceAtLeast2) {
                arrayDeque3.remove(i38);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                i39 = 1;
            } else {
                i40++;
                i37 += i32;
                i38++;
            }
        }
        int i41 = i19;
        int i42 = i35;
        int i43 = i39;
        int i44 = i40;
        int i45 = i37;
        while (i44 < i && (i45 < coerceAtLeast2 || i45 <= 0 || arrayDeque3.isEmpty())) {
            int i46 = i36;
            int i47 = i45;
            int i48 = i44;
            int i49 = coerceAtLeast2;
            androidx.compose.foundation.pager.MeasuredPage highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(lazyLayoutMeasureScope, i44, Constraints$default, pagerLazyLayoutItemProvider, j2, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z, i8, mutableIntObjectMap);
            int i50 = i - 1;
            i45 = (i48 == i50 ? i8 : i32) + i47;
            if (i45 <= i31 && i48 != i50) {
                i42 -= i32;
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                i41 = i48 + 1;
                i43 = 1;
            } else {
                i25 = java.lang.Math.max(i25, highSpeedVideoFpsRangesFor2.getCrossAxisSize());
                arrayDeque3.add(highSpeedVideoFpsRangesFor2);
            }
            i44 = i48 + 1;
            i36 = i46;
            coerceAtLeast2 = i49;
        }
        int i51 = i36;
        int i52 = i45;
        int i53 = i44;
        if (i52 < i2) {
            int i54 = i2 - i52;
            int i55 = i42 - i54;
            int i56 = i54 + i52;
            int i57 = i3;
            int i58 = i55;
            int i59 = 0;
            while (i58 < i57 && i41 > 0) {
                i41--;
                int i60 = i53;
                int i61 = i59;
                androidx.compose.foundation.pager.MeasuredPage highSpeedVideoFpsRangesFor3 = getHighSpeedVideoFpsRangesFor(lazyLayoutMeasureScope, i41, Constraints$default, pagerLazyLayoutItemProvider, j2, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z, i8, mutableIntObjectMap);
                arrayDeque3.add(i61, highSpeedVideoFpsRangesFor3);
                i25 = java.lang.Math.max(i25, highSpeedVideoFpsRangesFor3.getCrossAxisSize());
                i58 += i32;
                i57 = i3;
                i59 = i61;
                i53 = i60;
            }
            i10 = i53;
            i11 = i59;
            if (i58 < 0) {
                i13 = i11;
                i52 = i56 + i58;
            } else {
                i13 = i58;
                i52 = i56;
            }
            i12 = i41;
        } else {
            i10 = i53;
            i11 = 0;
            i12 = i41;
            i13 = i42;
        }
        if (i13 < 0) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("invalid currentFirstPageScrollOffset");
        }
        int i62 = -i13;
        androidx.compose.foundation.pager.MeasuredPage measuredPage = (androidx.compose.foundation.pager.MeasuredPage) arrayDeque3.first();
        if (i3 > 0 || i5 < 0) {
            int size = arrayDeque3.size();
            int i63 = i11;
            while (i63 < size && i13 != 0 && i32 <= i13 && i63 != kotlin.collections.CollectionsKt.getLastIndex(arrayDeque3)) {
                i13 -= i32;
                i63++;
                measuredPage = (androidx.compose.foundation.pager.MeasuredPage) arrayDeque3.get(i63);
            }
        }
        int i64 = i13;
        androidx.compose.foundation.pager.MeasuredPage measuredPage2 = measuredPage;
        java.util.List<androidx.compose.foundation.pager.MeasuredPage> Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(i12, i33, list, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                androidx.compose.foundation.pager.MeasuredPage highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.foundation.pager.PagerMeasureKt.getHighSpeedVideoSizes(androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope.this, Constraints$default, pagerLazyLayoutItemProvider, j2, orientation, horizontal, vertical, z, i8, mutableIntObjectMap, ((java.lang.Integer) obj).intValue());
                return highSpeedVideoSizes;
            }
        });
        int size2 = Camera2StreamConfigurationMap.size();
        int i65 = i25;
        for (int i66 = 0; i66 < size2; i66++) {
            i65 = java.lang.Math.max(i65, Camera2StreamConfigurationMap.get(i66).getCrossAxisSize());
        }
        int i67 = i52;
        java.util.List<androidx.compose.foundation.pager.MeasuredPage> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(((androidx.compose.foundation.pager.MeasuredPage) arrayDeque3.last()).getIndex(), i, i33, list, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                androidx.compose.foundation.pager.MeasuredPage highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.compose.foundation.pager.PagerMeasureKt.getHighSpeedVideoFpsRanges(androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope.this, Constraints$default, pagerLazyLayoutItemProvider, j2, orientation, horizontal, vertical, z, i8, mutableIntObjectMap, ((java.lang.Integer) obj).intValue());
                return highSpeedVideoFpsRanges;
            }
        });
        int size3 = highResolutionOutputSizeshNQ4ISI.size();
        int i68 = i65;
        for (int i69 = 0; i69 < size3; i69++) {
            i68 = java.lang.Math.max(i68, highResolutionOutputSizeshNQ4ISI.get(i69).getCrossAxisSize());
        }
        boolean z2 = kotlin.jvm.internal.Intrinsics.areEqual(measuredPage2, arrayDeque3.first()) && Camera2StreamConfigurationMap.isEmpty() && highResolutionOutputSizeshNQ4ISI.isEmpty();
        if (orientation == androidx.compose.foundation.gestures.Orientation.Vertical) {
            j3 = j;
            i14 = i68;
        } else {
            i14 = i67;
            j3 = j;
        }
        int m8571constrainWidthK40F9xA = androidx.compose.ui.unit.ConstraintsKt.m8571constrainWidthK40F9xA(j3, i14);
        if (orientation == androidx.compose.foundation.gestures.Orientation.Vertical) {
            i68 = i67;
        }
        int m8570constrainHeightK40F9xA = androidx.compose.ui.unit.ConstraintsKt.m8570constrainHeightK40F9xA(j3, i68);
        final java.util.List<androidx.compose.foundation.pager.MeasuredPage> highSpeedVideoFpsRangesFor4 = getHighSpeedVideoFpsRangesFor(lazyLayoutMeasureScope, arrayDeque3, Camera2StreamConfigurationMap, highResolutionOutputSizeshNQ4ISI, m8571constrainWidthK40F9xA, m8570constrainHeightK40F9xA, i67, i2, i62, orientation, z, lazyLayoutMeasureScope, i5, i8);
        if (z2) {
            list2 = highSpeedVideoFpsRangesFor4;
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList(highSpeedVideoFpsRangesFor4.size());
            int size4 = highSpeedVideoFpsRangesFor4.size();
            for (int i70 = 0; i70 < size4; i70++) {
                androidx.compose.foundation.pager.MeasuredPage measuredPage3 = highSpeedVideoFpsRangesFor4.get(i70);
                androidx.compose.foundation.pager.MeasuredPage measuredPage4 = measuredPage3;
                if (measuredPage4.getIndex() >= ((androidx.compose.foundation.pager.MeasuredPage) arrayDeque3.first()).getIndex() && measuredPage4.getIndex() <= ((androidx.compose.foundation.pager.MeasuredPage) arrayDeque3.last()).getIndex()) {
                    arrayList3.add(measuredPage3);
                }
            }
            list2 = arrayList3;
        }
        if (Camera2StreamConfigurationMap.isEmpty()) {
            arrayList = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.ArrayList arrayList4 = new java.util.ArrayList(highSpeedVideoFpsRangesFor4.size());
            int size5 = highSpeedVideoFpsRangesFor4.size();
            for (int i71 = 0; i71 < size5; i71++) {
                androidx.compose.foundation.pager.MeasuredPage measuredPage5 = highSpeedVideoFpsRangesFor4.get(i71);
                if (measuredPage5.getIndex() < ((androidx.compose.foundation.pager.MeasuredPage) arrayDeque3.first()).getIndex()) {
                    arrayList4.add(measuredPage5);
                }
            }
            arrayList = arrayList4;
        }
        java.util.List list3 = arrayList;
        if (highResolutionOutputSizeshNQ4ISI.isEmpty()) {
            arrayList2 = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.ArrayList arrayList5 = new java.util.ArrayList(highSpeedVideoFpsRangesFor4.size());
            int size6 = highSpeedVideoFpsRangesFor4.size();
            for (int i72 = 0; i72 < size6; i72++) {
                androidx.compose.foundation.pager.MeasuredPage measuredPage6 = highSpeedVideoFpsRangesFor4.get(i72);
                if (measuredPage6.getIndex() > ((androidx.compose.foundation.pager.MeasuredPage) arrayDeque3.last()).getIndex()) {
                    arrayList5.add(measuredPage6);
                }
            }
            arrayList2 = arrayList5;
        }
        java.util.List list4 = arrayList2;
        int i73 = i2 + i3 + i4;
        int i74 = i10;
        androidx.compose.foundation.pager.MeasuredPage highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(i73, list2, i3, i4, i8, snapPosition, i);
        int position = snapPosition.position(i73, i8, i3, i4, highSpeedVideoFpsRanges != null ? highSpeedVideoFpsRanges.getIndex() : 0, i);
        if (highSpeedVideoFpsRanges != null) {
            i16 = highSpeedVideoFpsRanges.getOffset();
            i15 = i32;
        } else {
            i15 = i32;
            i16 = 0;
        }
        return new androidx.compose.foundation.pager.PagerMeasureResult(list2, i8, i5, i4, orientation, i30, i51, z, i33, measuredPage2, highSpeedVideoFpsRanges, i15 == 0 ? 0.0f : kotlin.ranges.RangesKt.coerceIn((position - i16) / i15, -0.5f, 0.5f), i64, i74 < i || i67 > i2, snapPosition, function3.invoke(java.lang.Integer.valueOf(m8571constrainWidthK40F9xA), java.lang.Integer.valueOf(m8570constrainHeightK40F9xA), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.foundation.pager.PagerMeasureKt.getHighSpeedVideoSizes(androidx.compose.runtime.MutableState.this, highSpeedVideoFpsRangesFor4, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                return highSpeedVideoSizes;
            }
        }), i43, list3, list4, coroutineScope, density, Constraints$default, null);
    }

    private static final androidx.compose.foundation.pager.MeasuredPage getHighSpeedVideoFpsRanges(int i, java.util.List<androidx.compose.foundation.pager.MeasuredPage> list, int i2, int i3, int i4, androidx.compose.foundation.gestures.snapping.SnapPosition snapPosition, int i5) {
        androidx.compose.foundation.pager.MeasuredPage measuredPage;
        if (list.isEmpty()) {
            measuredPage = null;
        } else {
            androidx.compose.foundation.pager.MeasuredPage measuredPage2 = list.get(0);
            androidx.compose.foundation.pager.MeasuredPage measuredPage3 = measuredPage2;
            float f = -java.lang.Math.abs(androidx.compose.foundation.gestures.snapping.SnapPositionKt.calculateDistanceToDesiredSnapPosition(i, i2, i3, i4, measuredPage3.getOffset(), measuredPage3.getIndex(), snapPosition, i5));
            int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list);
            if (lastIndex > 0) {
                int i6 = 1;
                while (true) {
                    androidx.compose.foundation.pager.MeasuredPage measuredPage4 = list.get(i6);
                    androidx.compose.foundation.pager.MeasuredPage measuredPage5 = measuredPage4;
                    float f2 = -java.lang.Math.abs(androidx.compose.foundation.gestures.snapping.SnapPositionKt.calculateDistanceToDesiredSnapPosition(i, i2, i3, i4, measuredPage5.getOffset(), measuredPage5.getIndex(), snapPosition, i5));
                    if (java.lang.Float.compare(f, f2) < 0) {
                        measuredPage2 = measuredPage4;
                        f = f2;
                    }
                    if (i6 == lastIndex) {
                        break;
                    }
                    i6++;
                }
            }
            measuredPage = measuredPage2;
        }
        return measuredPage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(java.util.List list, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((androidx.compose.foundation.pager.MeasuredPage) list.get(i)).place(placementScope);
        }
        return kotlin.Unit.INSTANCE;
    }
}
