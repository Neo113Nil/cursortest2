package androidx.compose.foundation.pager;

/* compiled from: PagerMeasure.kt */
@kotlin.Metadata(d1 = {"\u0000¨\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a@\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u001aH\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0016H\u0002\u001a@\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0016H\u0002\u001a\u0017\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0082\b\u001a\u008c\u0001\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001f*\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00012\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\b2\u0006\u0010/\u001a\u00020\bH\u0002\u001aj\u0010\u0015\u001a\u00020\u0006*\u00020 2\u0006\u00100\u001a\u00020\b2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u0010)\u001a\u00020*2\b\u00107\u001a\u0004\u0018\u0001082\b\u00109\u001a\u0004\u0018\u00010:2\u0006\u0010;\u001a\u00020<2\u0006\u0010+\u001a\u00020\u00012\u0006\u0010/\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001aé\u0001\u0010?\u001a\u00020@*\u00020 2\u0006\u0010A\u001a\u00020\b2\u0006\u00103\u001a\u0002042\u0006\u0010B\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010.\u001a\u00020\b2\u0006\u0010C\u001a\u00020\b2\u0006\u0010D\u001a\u00020\b2\u0006\u0010E\u001a\u0002022\u0006\u0010)\u001a\u00020*2\b\u00109\u001a\u0004\u0018\u00010:2\b\u00107\u001a\u0004\u0018\u0001082\u0006\u0010+\u001a\u00020\u00012\u0006\u00105\u001a\u0002062\u0006\u0010/\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010F\u001a\u00020G2/\u0010H\u001a+\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\u001a0\u0016¢\u0006\u0002\bK\u0012\u0004\u0012\u00020L0IH\u0000ø\u0001\u0000¢\u0006\u0004\bM\u0010N\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006O"}, d2 = {"DEBUG", "", "MaxPageOffset", "", "MinPageOffset", "calculateNewCurrentPage", "Landroidx/compose/foundation/pager/MeasuredPage;", "viewportSize", "", "visiblePagesInfo", "", "beforeContentPadding", "afterContentPadding", "itemSize", "snapPositionInLayout", "Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;", "createPagesAfterList", "currentLastPage", "pagesCount", "beyondBoundsPageCount", "pinnedPages", "getAndMeasure", "Lkotlin/Function1;", "createPagesBeforeList", "currentFirstPage", "debugLog", "", "generateMsg", "Lkotlin/Function0;", "", "calculatePagesOffsets", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "pages", "extraPagesBefore", "extraPagesAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "pagesScrollOffset", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "reverseLayout", "density", "Landroidx/compose/ui/unit/Density;", "spaceBetweenPages", "pageAvailableSize", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "childConstraints", "Landroidx/compose/ui/unit/Constraints;", "pagerItemProvider", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "visualPageOffset", "Landroidx/compose/ui/unit/IntOffset;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getAndMeasure-SGf7dI0", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;IJLandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;JLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZI)Landroidx/compose/foundation/pager/MeasuredPage;", "measurePager", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "pageCount", "mainAxisAvailableSize", "currentPage", "currentPageOffset", "constraints", "placementScopeInvalidator", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "layout", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", "measurePager-_JDW0YA", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;ILandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;IIIIIIJLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/Alignment$Horizontal;ZJIILjava/util/List;Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/pager/PagerMeasureResult;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PagerMeasureKt {
    private static final boolean DEBUG = false;
    public static final float MaxPageOffset = 0.5f;
    public static final float MinPageOffset = -0.5f;

    private static final int calculatePagesOffsets$reverseAware(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    private static final void debugLog(kotlin.jvm.functions.Function0<java.lang.String> function0) {
    }

    /* renamed from: measurePager-_JDW0YA, reason: not valid java name */
    public static final androidx.compose.foundation.pager.PagerMeasureResult m809measurePager_JDW0YA(final androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope, int i, final androidx.compose.foundation.pager.PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i2, int i3, int i4, int i5, int i6, int i7, long j, final androidx.compose.foundation.gestures.Orientation orientation, final androidx.compose.ui.Alignment.Vertical vertical, final androidx.compose.ui.Alignment.Horizontal horizontal, final boolean z, final long j2, final int i8, int i9, java.util.List<java.lang.Integer> list, androidx.compose.foundation.gestures.snapping.SnapPositionInLayout snapPositionInLayout, final androidx.compose.runtime.MutableState<kotlin.Unit> mutableState, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.lang.Integer, ? super kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>, ? extends androidx.compose.ui.layout.MeasureResult> function3) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j3;
        int i16;
        java.util.List<androidx.compose.foundation.pager.MeasuredPage> list2;
        int i17;
        if (i3 < 0) {
            throw new java.lang.IllegalArgumentException("negative beforeContentPadding".toString());
        }
        if (i4 < 0) {
            throw new java.lang.IllegalArgumentException("negative afterContentPadding".toString());
        }
        int coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(i8 + i5, 0);
        if (i <= 0) {
            return new androidx.compose.foundation.pager.PagerMeasureResult(kotlin.collections.CollectionsKt.emptyList(), i8, i5, i4, orientation, -i3, i2 + i4, false, i9, null, null, 0.0f, 0, false, function3.invoke(java.lang.Integer.valueOf(androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(j)), java.lang.Integer.valueOf(androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(j)), new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return kotlin.Unit.INSTANCE;
                }
            }), false);
        }
        final long Constraints$default = androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, orientation == androidx.compose.foundation.gestures.Orientation.Vertical ? androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j) : i8, 0, orientation != androidx.compose.foundation.gestures.Orientation.Vertical ? androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j) : i8, 5, null);
        int i18 = i6;
        int i19 = i7;
        while (i18 > 0 && i19 > 0) {
            i18--;
            i19 -= coerceAtLeast;
        }
        int i20 = i19 * (-1);
        if (i18 >= i) {
            i18 = i - 1;
            i20 = 0;
        }
        kotlin.collections.ArrayDeque arrayDeque = new kotlin.collections.ArrayDeque();
        int i21 = -i3;
        if (i5 < 0) {
            i11 = i5;
            i10 = i18;
        } else {
            i10 = i18;
            i11 = 0;
        }
        int i22 = i21 + i11;
        int i23 = 0;
        int i24 = i20 + i22;
        int i25 = i10;
        while (i24 < 0 && i25 > 0) {
            int i26 = i25 - 1;
            androidx.compose.foundation.pager.MeasuredPage m808getAndMeasureSGf7dI0 = m808getAndMeasureSGf7dI0(lazyLayoutMeasureScope, i26, Constraints$default, pagerLazyLayoutItemProvider, j2, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z, i8);
            arrayDeque.add(0, m808getAndMeasureSGf7dI0);
            i23 = java.lang.Math.max(i23, m808getAndMeasureSGf7dI0.getCrossAxisSize());
            i24 += coerceAtLeast;
            i25 = i26;
        }
        if (i24 < i22) {
            i24 = i22;
        }
        int i27 = i24 - i22;
        int i28 = i2 + i4;
        int i29 = i25;
        int coerceAtLeast2 = kotlin.ranges.RangesKt.coerceAtLeast(i28, 0);
        int i30 = i29;
        boolean z2 = false;
        int i31 = -i27;
        int i32 = 0;
        while (i32 < arrayDeque.size()) {
            if (i31 >= coerceAtLeast2) {
                arrayDeque.remove(i32);
                z2 = true;
            } else {
                i30++;
                i31 += coerceAtLeast;
                i32++;
            }
        }
        boolean z3 = z2;
        int i33 = i30;
        int i34 = i27;
        while (i33 < i && (i31 < coerceAtLeast2 || i31 <= 0 || arrayDeque.isEmpty())) {
            int i35 = coerceAtLeast2;
            androidx.compose.foundation.pager.MeasuredPage m808getAndMeasureSGf7dI02 = m808getAndMeasureSGf7dI0(lazyLayoutMeasureScope, i33, Constraints$default, pagerLazyLayoutItemProvider, j2, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z, i8);
            int i36 = i - 1;
            i31 += i33 == i36 ? i8 : coerceAtLeast;
            if (i31 > i22 || i33 == i36) {
                i23 = java.lang.Math.max(i23, m808getAndMeasureSGf7dI02.getCrossAxisSize());
                arrayDeque.add(m808getAndMeasureSGf7dI02);
                i17 = i29;
            } else {
                i17 = i33 + 1;
                i34 -= coerceAtLeast;
                z3 = true;
            }
            i33++;
            i29 = i17;
            coerceAtLeast2 = i35;
        }
        if (i31 < i2) {
            int i37 = i2 - i31;
            i34 -= i37;
            i31 += i37;
            i12 = i29;
            while (i34 < i3 && i12 > 0) {
                i12--;
                androidx.compose.foundation.pager.MeasuredPage m808getAndMeasureSGf7dI03 = m808getAndMeasureSGf7dI0(lazyLayoutMeasureScope, i12, Constraints$default, pagerLazyLayoutItemProvider, j2, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z, i8);
                arrayDeque.add(0, m808getAndMeasureSGf7dI03);
                i23 = java.lang.Math.max(i23, m808getAndMeasureSGf7dI03.getCrossAxisSize());
                i34 += coerceAtLeast;
            }
            if (i34 < 0) {
                i31 += i34;
                i34 = 0;
            }
        } else {
            i12 = i29;
        }
        int i38 = i23;
        int i39 = i31;
        if (i34 < 0) {
            throw new java.lang.IllegalArgumentException("invalid currentFirstPageScrollOffset".toString());
        }
        int i40 = -i34;
        androidx.compose.foundation.pager.MeasuredPage measuredPage = (androidx.compose.foundation.pager.MeasuredPage) arrayDeque.first();
        if (i3 > 0 || i5 < 0) {
            int size = arrayDeque.size();
            i13 = i38;
            int i41 = i34;
            int i42 = 0;
            while (i42 < size && i41 != 0 && coerceAtLeast <= i41) {
                i14 = i40;
                if (i42 == kotlin.collections.CollectionsKt.getLastIndex(arrayDeque)) {
                    break;
                }
                i41 -= coerceAtLeast;
                i42++;
                measuredPage = (androidx.compose.foundation.pager.MeasuredPage) arrayDeque.get(i42);
                i40 = i14;
            }
            i14 = i40;
            i15 = i41;
        } else {
            i15 = i34;
            i13 = i38;
            i14 = i40;
        }
        androidx.compose.foundation.pager.MeasuredPage measuredPage2 = measuredPage;
        java.util.List<androidx.compose.foundation.pager.MeasuredPage> createPagesBeforeList = createPagesBeforeList(i12, i9, list, new kotlin.jvm.functions.Function1<java.lang.Integer, androidx.compose.foundation.pager.MeasuredPage>() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$extraPagesBefore$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ androidx.compose.foundation.pager.MeasuredPage invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final androidx.compose.foundation.pager.MeasuredPage invoke(int i43) {
                androidx.compose.foundation.pager.MeasuredPage m808getAndMeasureSGf7dI04;
                androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope2 = androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope.this;
                m808getAndMeasureSGf7dI04 = androidx.compose.foundation.pager.PagerMeasureKt.m808getAndMeasureSGf7dI0(lazyLayoutMeasureScope2, i43, Constraints$default, pagerLazyLayoutItemProvider, j2, orientation, horizontal, vertical, lazyLayoutMeasureScope2.getLayoutDirection(), z, i8);
                return m808getAndMeasureSGf7dI04;
            }
        });
        int i43 = i13;
        int i44 = 0;
        for (int size2 = createPagesBeforeList.size(); i44 < size2; size2 = size2) {
            i43 = java.lang.Math.max(i43, createPagesBeforeList.get(i44).getCrossAxisSize());
            i44++;
        }
        java.util.List<androidx.compose.foundation.pager.MeasuredPage> createPagesAfterList = createPagesAfterList(((androidx.compose.foundation.pager.MeasuredPage) arrayDeque.last()).getIndex(), i, i9, list, new kotlin.jvm.functions.Function1<java.lang.Integer, androidx.compose.foundation.pager.MeasuredPage>() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$extraPagesAfter$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ androidx.compose.foundation.pager.MeasuredPage invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final androidx.compose.foundation.pager.MeasuredPage invoke(int i45) {
                androidx.compose.foundation.pager.MeasuredPage m808getAndMeasureSGf7dI04;
                androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope2 = androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope.this;
                m808getAndMeasureSGf7dI04 = androidx.compose.foundation.pager.PagerMeasureKt.m808getAndMeasureSGf7dI0(lazyLayoutMeasureScope2, i45, Constraints$default, pagerLazyLayoutItemProvider, j2, orientation, horizontal, vertical, lazyLayoutMeasureScope2.getLayoutDirection(), z, i8);
                return m808getAndMeasureSGf7dI04;
            }
        });
        int size3 = createPagesAfterList.size();
        for (int i45 = 0; i45 < size3; i45++) {
            i43 = java.lang.Math.max(i43, createPagesAfterList.get(i45).getCrossAxisSize());
        }
        boolean z4 = kotlin.jvm.internal.Intrinsics.areEqual(measuredPage2, arrayDeque.first()) && createPagesBeforeList.isEmpty() && createPagesAfterList.isEmpty();
        if (orientation == androidx.compose.foundation.gestures.Orientation.Vertical) {
            j3 = j;
            i16 = i43;
        } else {
            j3 = j;
            i16 = i39;
        }
        int m4438constrainWidthK40F9xA = androidx.compose.ui.unit.ConstraintsKt.m4438constrainWidthK40F9xA(j3, i16);
        if (orientation == androidx.compose.foundation.gestures.Orientation.Vertical) {
            i43 = i39;
        }
        int m4437constrainHeightK40F9xA = androidx.compose.ui.unit.ConstraintsKt.m4437constrainHeightK40F9xA(j3, i43);
        int i46 = i33;
        final java.util.List<androidx.compose.foundation.pager.MeasuredPage> calculatePagesOffsets = calculatePagesOffsets(lazyLayoutMeasureScope, arrayDeque, createPagesBeforeList, createPagesAfterList, m4438constrainWidthK40F9xA, m4437constrainHeightK40F9xA, i39, i2, i14, orientation, z, lazyLayoutMeasureScope, i5, i8);
        if (z4) {
            list2 = calculatePagesOffsets;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(calculatePagesOffsets.size());
            int size4 = calculatePagesOffsets.size();
            for (int i47 = 0; i47 < size4; i47++) {
                androidx.compose.foundation.pager.MeasuredPage measuredPage3 = calculatePagesOffsets.get(i47);
                androidx.compose.foundation.pager.MeasuredPage measuredPage4 = measuredPage3;
                if (measuredPage4.getIndex() >= ((androidx.compose.foundation.pager.MeasuredPage) arrayDeque.first()).getIndex() && measuredPage4.getIndex() <= ((androidx.compose.foundation.pager.MeasuredPage) arrayDeque.last()).getIndex()) {
                    arrayList.add(measuredPage3);
                }
            }
            list2 = arrayList;
        }
        androidx.compose.foundation.pager.MeasuredPage calculateNewCurrentPage = calculateNewCurrentPage(orientation == androidx.compose.foundation.gestures.Orientation.Vertical ? m4437constrainHeightK40F9xA : m4438constrainWidthK40F9xA, list2, i3, i4, coerceAtLeast, snapPositionInLayout);
        return new androidx.compose.foundation.pager.PagerMeasureResult(list2, i8, i5, i4, orientation, i21, i28, z, i9, measuredPage2, calculateNewCurrentPage, coerceAtLeast == 0 ? 0.0f : kotlin.ranges.RangesKt.coerceIn((-(calculateNewCurrentPage != null ? calculateNewCurrentPage.getOffset() : 0)) / coerceAtLeast, -0.5f, 0.5f), i15, i46 < i || i39 > i2, function3.invoke(java.lang.Integer.valueOf(m4438constrainWidthK40F9xA), java.lang.Integer.valueOf(m4437constrainHeightK40F9xA), new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                java.util.List<androidx.compose.foundation.pager.MeasuredPage> list3 = calculatePagesOffsets;
                int size5 = list3.size();
                for (int i48 = 0; i48 < size5; i48++) {
                    list3.get(i48).place(placementScope);
                }
                androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator.m744attachToScopeimpl(mutableState);
            }
        }), z3);
    }

    private static final java.util.List<androidx.compose.foundation.pager.MeasuredPage> createPagesAfterList(int i, int i2, int i3, java.util.List<java.lang.Integer> list, kotlin.jvm.functions.Function1<? super java.lang.Integer, androidx.compose.foundation.pager.MeasuredPage> function1) {
        int min = java.lang.Math.min(i3 + i, i2 - 1);
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

    private static final java.util.List<androidx.compose.foundation.pager.MeasuredPage> createPagesBeforeList(int i, int i2, java.util.List<java.lang.Integer> list, kotlin.jvm.functions.Function1<? super java.lang.Integer, androidx.compose.foundation.pager.MeasuredPage> function1) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getAndMeasure-SGf7dI0, reason: not valid java name */
    public static final androidx.compose.foundation.pager.MeasuredPage m808getAndMeasureSGf7dI0(androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope, int i, long j, androidx.compose.foundation.pager.PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, long j2, androidx.compose.foundation.gestures.Orientation orientation, androidx.compose.ui.Alignment.Horizontal horizontal, androidx.compose.ui.Alignment.Vertical vertical, androidx.compose.ui.unit.LayoutDirection layoutDirection, boolean z, int i2) {
        return new androidx.compose.foundation.pager.MeasuredPage(i, i2, lazyLayoutMeasureScope.mo732measure0kLqBqw(i, j), j2, pagerLazyLayoutItemProvider.getKey(i), orientation, horizontal, vertical, layoutDirection, z, null);
    }

    private static final java.util.List<androidx.compose.foundation.pager.MeasuredPage> calculatePagesOffsets(androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope, java.util.List<androidx.compose.foundation.pager.MeasuredPage> list, java.util.List<androidx.compose.foundation.pager.MeasuredPage> list2, java.util.List<androidx.compose.foundation.pager.MeasuredPage> list3, int i, int i2, int i3, int i4, int i5, androidx.compose.foundation.gestures.Orientation orientation, boolean z, androidx.compose.ui.unit.Density density, int i6, int i7) {
        int i8;
        int i9;
        int i10 = i5;
        int i11 = i7 + i6;
        if (orientation == androidx.compose.foundation.gestures.Orientation.Vertical) {
            i8 = i4;
            i9 = i2;
        } else {
            i8 = i4;
            i9 = i;
        }
        boolean z2 = i3 < java.lang.Math.min(i9, i8);
        if (z2 && i10 != 0) {
            throw new java.lang.IllegalStateException(("non-zero pagesScrollOffset=" + i10).toString());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size() + list2.size() + list3.size());
        if (z2) {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new java.lang.IllegalArgumentException("No extra pages".toString());
            }
            int size = list.size();
            int[] iArr = new int[size];
            for (int i12 = 0; i12 < size; i12++) {
                iArr[i12] = i7;
            }
            int[] iArr2 = new int[size];
            for (int i13 = 0; i13 < size; i13++) {
                iArr2[i13] = 0;
            }
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m477spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.Absolute.INSTANCE.m477spacedBy0680j_4(lazyLayoutMeasureScope.mo312toDpu2uoSUM(i6));
            if (orientation == androidx.compose.foundation.gestures.Orientation.Vertical) {
                m477spacedBy0680j_4.arrange(density, i9, iArr, iArr2);
            } else {
                m477spacedBy0680j_4.arrange(density, i9, iArr, androidx.compose.ui.unit.LayoutDirection.Ltr, iArr2);
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
                    int i14 = iArr2[first];
                    androidx.compose.foundation.pager.MeasuredPage measuredPage = list.get(calculatePagesOffsets$reverseAware(first, z, size));
                    if (z) {
                        i14 = (i9 - i14) - measuredPage.getSize();
                    }
                    measuredPage.position(i14, i, i2);
                    arrayList.add(measuredPage);
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        } else {
            int size2 = list2.size();
            int i15 = i10;
            for (int i16 = 0; i16 < size2; i16++) {
                androidx.compose.foundation.pager.MeasuredPage measuredPage2 = list2.get(i16);
                i15 -= i11;
                measuredPage2.position(i15, i, i2);
                arrayList.add(measuredPage2);
            }
            int size3 = list.size();
            for (int i17 = 0; i17 < size3; i17++) {
                androidx.compose.foundation.pager.MeasuredPage measuredPage3 = list.get(i17);
                measuredPage3.position(i10, i, i2);
                arrayList.add(measuredPage3);
                i10 += i11;
            }
            int size4 = list3.size();
            for (int i18 = 0; i18 < size4; i18++) {
                androidx.compose.foundation.pager.MeasuredPage measuredPage4 = list3.get(i18);
                measuredPage4.position(i10, i, i2);
                arrayList.add(measuredPage4);
                i10 += i11;
            }
        }
        return arrayList;
    }

    private static final androidx.compose.foundation.pager.MeasuredPage calculateNewCurrentPage(int i, java.util.List<androidx.compose.foundation.pager.MeasuredPage> list, int i2, int i3, int i4, androidx.compose.foundation.gestures.snapping.SnapPositionInLayout snapPositionInLayout) {
        androidx.compose.foundation.pager.MeasuredPage measuredPage;
        if (list.isEmpty()) {
            measuredPage = null;
        } else {
            androidx.compose.foundation.pager.MeasuredPage measuredPage2 = list.get(0);
            androidx.compose.foundation.pager.MeasuredPage measuredPage3 = measuredPage2;
            float f = -java.lang.Math.abs(androidx.compose.foundation.gestures.snapping.SnapPositionInLayoutKt.calculateDistanceToDesiredSnapPosition(i, i2, i3, i4, measuredPage3.getOffset(), measuredPage3.getIndex(), snapPositionInLayout));
            int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list);
            int i5 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    androidx.compose.foundation.pager.MeasuredPage measuredPage4 = list.get(i5);
                    androidx.compose.foundation.pager.MeasuredPage measuredPage5 = measuredPage4;
                    float f2 = -java.lang.Math.abs(androidx.compose.foundation.gestures.snapping.SnapPositionInLayoutKt.calculateDistanceToDesiredSnapPosition(i, i2, i3, i4, measuredPage5.getOffset(), measuredPage5.getIndex(), snapPositionInLayout));
                    if (java.lang.Float.compare(f, f2) < 0) {
                        measuredPage2 = measuredPage4;
                        f = f2;
                    }
                    if (i5 == lastIndex) {
                        break;
                    }
                    i5++;
                }
            }
            measuredPage = measuredPage2;
        }
        return measuredPage;
    }
}
