package androidx.compose.foundation.lazy.staggeredgrid;

@kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a£\u0001\u0010 \u001a\u00020\u001d*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a3\u0010'\u001a\u00020\u001d*\u00020!2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020\fH\u0002¢\u0006\u0004\b'\u0010(\u001aM\u0010-\u001a\b\u0012\u0004\u0012\u00020+0\u0003*\u00020!2\u0012\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*0)2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u0004H\u0002¢\u0006\u0004\b-\u0010.\u001a\u001b\u00100\u001a\u00020/*\u00020#2\u0006\u0010\"\u001a\u00020\u0004H\u0002¢\u0006\u0004\b0\u00101\u001a\u001b\u0010'\u001a\u00020\u0004*\u00020#2\u0006\u0010\"\u001a\u000202H\u0002¢\u0006\u0004\b'\u00103\u001a\u001d\u00105\u001a\u00020\u0004*\u00020#2\b\b\u0002\u00104\u001a\u00020\u0004H\u0000¢\u0006\u0004\b5\u00106\u001a\u0013\u0010-\u001a\u00020\u0004*\u00020#H\u0002¢\u0006\u0004\b-\u00107\u001a#\u0010'\u001a\u00020/*\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0004H\u0002¢\u0006\u0004\b'\u00108\u001a#\u00100\u001a\u00020\u0004*\u00020!2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004H\u0002¢\u0006\u0004\b0\u00109"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "", "", "pinnedItems", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "itemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "resolvedSlots", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "isVertical", "reverseLayout", "Landroidx/compose/ui/unit/IntOffset;", "contentOffset", "mainAxisAvailableSize", "mainAxisSpacing", "beforeContentPadding", "afterContentPadding", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "isInLookaheadScope", "isLookingAhead", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "approachLayoutInfo", "Landroidx/compose/ui/graphics/GraphicsContext;", "graphicsContext", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "measureStaggeredGrid-C6celF4", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Ljava/util/List;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;JZZJIIIILkotlinx/coroutines/CoroutineScope;ZZLandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;Landroidx/compose/ui/graphics/GraphicsContext;)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "measureStaggeredGrid", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "p0", "", "p1", "p2", "p3", "getHighSpeedVideoSizes", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;I[I[IZ)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "", "Lkotlin/collections/ArrayDeque;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "p4", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[Lkotlin/collections/ArrayDeque;[IIII)Ljava/util/List;", "", "getHighSpeedVideoFpsRanges", "([II)V", "Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "([IJ)I", "minBound", "indexOfMinValue", "([II)I", "([I)I", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[II)V", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;II)I"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyStaggeredGridMeasureKt {
    /* renamed from: measureStaggeredGrid-C6celF4, reason: not valid java name */
    public static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult m1901measureStaggeredGridC6celF4(androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState, java.util.List<java.lang.Integer> list, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots lazyStaggeredGridSlots, long j, boolean z, boolean z2, long j2, int i, int i2, int i3, int i4, kotlinx.coroutines.CoroutineScope coroutineScope, boolean z3, boolean z4, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, androidx.compose.ui.graphics.GraphicsContext graphicsContext) {
        boolean z5;
        int i5;
        int highSpeedVideoSizes;
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext(lazyStaggeredGridState, list, lazyStaggeredGridItemProvider, lazyStaggeredGridSlots, j, z, lazyLayoutMeasureScope, i, j2, i3, i4, z2, i2, coroutineScope, z3, z4, lazyStaggeredGridLayoutInfo, graphicsContext, null);
        int[] updateScrollPositionIfTheFirstItemWasMoved$foundation = lazyStaggeredGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation(lazyStaggeredGridItemProvider, lazyStaggeredGridState.getScrollPosition().getIndices());
        int[] scrollOffsets = lazyStaggeredGridState.getScrollPosition().getScrollOffsets();
        if (updateScrollPositionIfTheFirstItemWasMoved$foundation.length != lazyStaggeredGridMeasureContext.getLaneCount()) {
            lazyStaggeredGridMeasureContext.getLaneInfo().reset();
            int laneCount = lazyStaggeredGridMeasureContext.getLaneCount();
            int[] iArr = new int[laneCount];
            int i6 = 0;
            while (i6 < laneCount) {
                if (i6 >= updateScrollPositionIfTheFirstItemWasMoved$foundation.length || (highSpeedVideoSizes = updateScrollPositionIfTheFirstItemWasMoved$foundation[i6]) == -1) {
                    highSpeedVideoSizes = i6 == 0 ? 0 : getHighSpeedVideoSizes(iArr, androidx.compose.foundation.lazy.staggeredgrid.SpanRange.m1907constructorimpl(0, i6)) + 1;
                }
                iArr[i6] = highSpeedVideoSizes;
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[i6], i6);
                i6++;
            }
            updateScrollPositionIfTheFirstItemWasMoved$foundation = iArr;
        }
        if (scrollOffsets.length != lazyStaggeredGridMeasureContext.getLaneCount()) {
            int laneCount2 = lazyStaggeredGridMeasureContext.getLaneCount();
            int[] iArr2 = new int[laneCount2];
            int i7 = 0;
            while (i7 < laneCount2) {
                if (i7 < scrollOffsets.length) {
                    i5 = scrollOffsets[i7];
                } else {
                    i5 = i7 == 0 ? 0 : iArr2[i7 - 1];
                }
                iArr2[i7] = i5;
                i7++;
            }
            z5 = z4;
            scrollOffsets = iArr2;
        } else {
            z5 = z4;
        }
        return getHighSpeedVideoSizes(lazyStaggeredGridMeasureContext, java.lang.Math.round(lazyStaggeredGridState.scrollToBeConsumed$foundation(z5)), updateScrollPositionIfTheFirstItemWasMoved$foundation, scrollOffsets, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:243:0x053c, code lost:
    
        if ((r0 != null ? r0.getIndex() : -1) <= r3) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x02f4, code lost:
    
        r3 = indexOfMinValue$default(r8, 0, 1, null);
        r4 = getHighSpeedVideoFpsRangesFor(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x02ff, code lost:
    
        if (r3 == r4) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0305, code lost:
    
        if (r8[r3] != r8[r4]) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0307, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x0309, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x030a, code lost:
    
        r4 = r11[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x030d, code lost:
    
        if (r4 != (-1)) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x030f, code lost:
    
        r4 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x0310, code lost:
    
        r4 = getHighSpeedVideoFpsRanges(r6, r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x0314, code lost:
    
        if (r4 >= 0) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x0343, code lost:
    
        r17 = r12;
        r12 = r6.m1897getSpanRangelOCCd4c(r51.getItemProvider(), r4, r3);
        r3 = r51.getLaneInfo();
        r19 = r10;
        r5 = (int) (r12 & 4294967295L);
        r34 = r7;
        r6 = (int) (r12 >> 32);
        r7 = r5 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x0365, code lost:
    
        if (r7 == 1) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x0367, code lost:
    
        r10 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x036a, code lost:
    
        r3.setLane(r4, r10);
        r3 = r51.getMeasuredItemProvider().m1903getAndMeasurejy6DScQ(r4, r12);
        r10 = getHighSpeedVideoSizes(r8, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x0379, code lost:
    
        if (r7 == 1) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x037b, code lost:
    
        r7 = r51.getLaneInfo().getGaps(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0385, code lost:
    
        if (r6 >= r5) goto L502;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0389, code lost:
    
        if (r8[r6] == r10) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x038b, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x038c, code lost:
    
        r20[r6].addFirst(r3);
        r11[r6] = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0393, code lost:
    
        if (r7 != null) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x0395, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x0399, code lost:
    
        r8[r6] = (r3.getMainAxisSizeWithSpacings() + r10) + r9;
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0397, code lost:
    
        r9 = r7[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x0384, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x0369, code lost:
    
        r10 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x0316, code lost:
    
        if (r0 != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x031c, code lost:
    
        if (Camera2StreamConfigurationMap(r11, r6, r8, r3) == false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x031e, code lost:
    
        if (r27 == false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x0320, code lost:
    
        r51.getLaneInfo().reset();
        r0 = r11.length;
        r1 = new int[r0];
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x032b, code lost:
    
        if (r2 >= r0) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x032d, code lost:
    
        r1[r2] = -1;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x0333, code lost:
    
        r0 = r8.length;
        r9 = new int[r0];
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0337, code lost:
    
        if (r2 >= r0) goto L507;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x0339, code lost:
    
        r9[r2] = r8[r3];
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x0340, code lost:
    
        r8 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x09a4, code lost:
    
        r0 = androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(r51.getConstraints());
        r1 = androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(r51.getConstraints());
        r51.getState().getItemAnimator$foundation().onMeasured(0, r0, r1, new java.util.ArrayList(), r51.getMeasuredItemProvider().getKeyIndexMap(), r51.getMeasuredItemProvider(), r51.getIsVertical(), r7.isLookingAhead(), r51.getLaneCount(), r51.getIsInLookaheadScope(), 0, 0, r51.getCoroutineScope(), r51.getGraphicsContext());
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x0a00, code lost:
    
        if (r7.isLookingAhead() != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0a02, code lost:
    
        r2 = r51.getState().getItemAnimator$foundation().m1853getMinSizeToFitDisappearingItemsYbymL2g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x0a18, code lost:
    
        if (androidx.compose.ui.unit.IntSize.m8770equalsimpl0(r2, androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g()) != false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x0a1a, code lost:
    
        r0 = androidx.compose.ui.unit.ConstraintsKt.m8571constrainWidthK40F9xA(r51.getConstraints(), (int) (r2 >> 32));
        r1 = androidx.compose.ui.unit.ConstraintsKt.m8570constrainHeightK40F9xA(r51.getConstraints(), (int) (r2 & 4294967295L));
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x0ab0, code lost:
    
        return new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult(r8, r9, 0.0f, androidx.compose.ui.layout.MeasureScope.layout$default(r7, r0, r1, null, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$$ExternalSyntheticLambda1(), 4, null), 0.0f, false, r51.getIsVertical(), false, r51.getResolvedSlots(), r51.getItemProvider().getSpanProvider(), r7, r15, kotlin.collections.CollectionsKt.emptyList(), androidx.compose.ui.unit.IntSize.m8767constructorimpl((androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(r51.getConstraints()) & 4294967295L) | (androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(r51.getConstraints()) << 32)), -r51.getBeforeContentPadding(), r51.getMainAxisAvailableSize() + r51.getAfterContentPadding(), r51.getBeforeContentPadding(), r51.getAfterContentPadding(), r51.getMainAxisSpacing(), r51.getCoroutineScope(), null);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:290:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x079e  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x080c  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0885  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0891 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult getHighSpeedVideoSizes(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i, int[] iArr, int[] iArr2, boolean z) {
        int itemCount;
        int[] copyOf;
        int i2;
        kotlin.collections.ArrayDeque[] arrayDequeArr;
        boolean z2;
        int i3;
        int[] iArr3;
        boolean z3;
        int i4;
        androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope;
        int i5;
        int i6;
        int i7;
        int i8;
        int mainAxisAvailableSize;
        int[] iArr4;
        int i9;
        int[] iArr5;
        int i10;
        int i11;
        java.util.ArrayList arrayList;
        int i12;
        int[] iArr6;
        int i13;
        int m8571constrainWidthK40F9xA;
        int m8553getMaxHeightimpl;
        final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext2;
        int[] iArr7;
        int i14;
        java.util.List list;
        float f;
        int i15;
        java.util.ArrayList arrayList2;
        int size;
        int i16;
        java.util.ArrayList arrayList3;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z4;
        java.util.List<java.lang.Integer> list2;
        int i21;
        int[] iArr8;
        int[] iArr9;
        int i22;
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo;
        int index;
        int min;
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo2;
        int i23;
        int i24;
        int i25;
        int[] iArr10;
        int i26;
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext3 = lazyStaggeredGridMeasureContext;
        int i27 = i;
        int[] iArr11 = iArr;
        int[] iArr12 = iArr2;
        boolean z5 = z;
        loop0: while (true) {
            androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope measureScope = lazyStaggeredGridMeasureContext.getMeasureScope();
            itemCount = lazyStaggeredGridMeasureContext.getItemProvider().getItemCount();
            if (itemCount <= 0 || lazyStaggeredGridMeasureContext.getLaneCount() == 0) {
                break;
            }
            copyOf = java.util.Arrays.copyOf(iArr11, iArr11.length);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
            int[] copyOf2 = java.util.Arrays.copyOf(iArr12, iArr12.length);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf2, "");
            getHighSpeedVideoSizes(lazyStaggeredGridMeasureContext3, copyOf, itemCount);
            getHighSpeedVideoFpsRanges(copyOf2, -i27);
            int laneCount = lazyStaggeredGridMeasureContext.getLaneCount();
            kotlin.collections.ArrayDeque[] arrayDequeArr2 = new kotlin.collections.ArrayDeque[laneCount];
            for (int i28 = 0; i28 < laneCount; i28++) {
                arrayDequeArr2[i28] = new kotlin.collections.ArrayDeque(16);
            }
            getHighSpeedVideoFpsRanges(copyOf2, -lazyStaggeredGridMeasureContext.getBeforeContentPadding());
            boolean z6 = false;
            while (true) {
                if (!getHighResolutionOutputSizeshNQ4ISI(copyOf, copyOf2, lazyStaggeredGridMeasureContext3)) {
                    i2 = laneCount;
                    arrayDequeArr = arrayDequeArr2;
                    z2 = z6;
                    i3 = -1;
                    break;
                }
                i3 = getHighSpeedVideoFpsRangesFor(copyOf);
                int i29 = copyOf[i3];
                int length = copyOf2.length;
                int i30 = 0;
                while (i30 < length) {
                    boolean z7 = z6;
                    if (copyOf[i30] != copyOf[i3]) {
                        int i31 = copyOf2[i30];
                        int i32 = copyOf2[i3];
                        if (i31 < i32) {
                            copyOf2[i30] = i32;
                        }
                    }
                    i30++;
                    z6 = z7;
                }
                z2 = z6;
                int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(lazyStaggeredGridMeasureContext3, i29, i3);
                if (highSpeedVideoFpsRanges < 0) {
                    i2 = laneCount;
                    arrayDequeArr = arrayDequeArr2;
                    break;
                }
                long m1897getSpanRangelOCCd4c = lazyStaggeredGridMeasureContext3.m1897getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), highSpeedVideoFpsRanges, i3);
                int i33 = laneCount;
                kotlin.collections.ArrayDeque[] arrayDequeArr3 = arrayDequeArr2;
                int i34 = (int) (m1897getSpanRangelOCCd4c & 4294967295L);
                int i35 = (int) (m1897getSpanRangelOCCd4c >> 32);
                int i36 = i34 - i35;
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(highSpeedVideoFpsRanges, i36 != 1 ? -2 : i35);
                androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem m1903getAndMeasurejy6DScQ = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m1903getAndMeasurejy6DScQ(highSpeedVideoFpsRanges, m1897getSpanRangelOCCd4c);
                int highSpeedVideoSizes = getHighSpeedVideoSizes(copyOf2, m1897getSpanRangelOCCd4c);
                int[] gaps = i36 != 1 ? lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(highSpeedVideoFpsRanges) : null;
                while (i35 < i34) {
                    copyOf[i35] = highSpeedVideoFpsRanges;
                    int mainAxisSizeWithSpacings = m1903getAndMeasurejy6DScQ.getMainAxisSizeWithSpacings() + highSpeedVideoSizes + (gaps == null ? 0 : gaps[i35]);
                    copyOf2[i35] = mainAxisSizeWithSpacings;
                    if (lazyStaggeredGridMeasureContext.getMainAxisAvailableSize() + mainAxisSizeWithSpacings <= 0) {
                        z2 = true;
                    }
                    i35++;
                }
                z6 = z2;
                laneCount = i33;
                arrayDequeArr2 = arrayDequeArr3;
            }
            int i37 = -lazyStaggeredGridMeasureContext.getBeforeContentPadding();
            int i38 = copyOf2[0];
            if (i38 < i37) {
                int i39 = i37 - i38;
                getHighSpeedVideoFpsRanges(copyOf2, i39);
                i27 -= i39;
            }
            getHighSpeedVideoFpsRanges(copyOf2, lazyStaggeredGridMeasureContext.getBeforeContentPadding());
            int i40 = -1;
            if (i3 == -1) {
                i3 = kotlin.collections.ArraysKt.indexOf(copyOf, 0);
            }
            if (i3 != -1 && Camera2StreamConfigurationMap(copyOf, lazyStaggeredGridMeasureContext3, copyOf2, i3) && z5) {
                lazyStaggeredGridMeasureContext.getLaneInfo().reset();
                int length2 = copyOf.length;
                int[] iArr13 = new int[length2];
                int i41 = 0;
                while (i41 < length2) {
                    iArr13[i41] = i40;
                    i41++;
                    i40 = -1;
                }
                int length3 = copyOf2.length;
                int[] iArr14 = new int[length3];
                for (int i42 = 0; i42 < length3; i42++) {
                    iArr14[i42] = copyOf2[i3];
                }
                iArr11 = iArr13;
                iArr12 = iArr14;
            } else {
                int[] copyOf3 = java.util.Arrays.copyOf(copyOf, copyOf.length);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf3, "");
                int length4 = copyOf2.length;
                iArr3 = new int[length4];
                for (int i43 = 0; i43 < length4; i43++) {
                    iArr3[i43] = -copyOf2[i43];
                }
                int mainAxisSpacing = lazyStaggeredGridMeasureContext.getMainAxisSpacing() + i37;
                int coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(lazyStaggeredGridMeasureContext.getMainAxisAvailableSize() + lazyStaggeredGridMeasureContext.getAfterContentPadding(), 0);
                int indexOfMinValue$default = indexOfMinValue$default(copyOf3, 0, 1, null);
                int i44 = 0;
                z3 = z2;
                for (int i45 = -1; indexOfMinValue$default != i45 && i44 < lazyStaggeredGridMeasureContext.getLaneCount(); i45 = -1) {
                    int i46 = copyOf3[indexOfMinValue$default];
                    int indexOfMinValue = indexOfMinValue(copyOf3, i46);
                    i44++;
                    if (i46 >= 0) {
                        long m1897getSpanRangelOCCd4c2 = lazyStaggeredGridMeasureContext3.m1897getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), i46, indexOfMinValue$default);
                        int i47 = i37;
                        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem m1903getAndMeasurejy6DScQ2 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m1903getAndMeasurejy6DScQ(i46, m1897getSpanRangelOCCd4c2);
                        androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope2 = measureScope;
                        int i48 = i27;
                        boolean z8 = z5;
                        int i49 = (int) (m1897getSpanRangelOCCd4c2 & 4294967295L);
                        int[] iArr15 = copyOf2;
                        int i50 = coerceAtLeast;
                        int i51 = (int) (m1897getSpanRangelOCCd4c2 >> 32);
                        int i52 = i49 - i51;
                        lazyStaggeredGridMeasureContext.getLaneInfo().setLane(i46, i52 != 1 ? -2 : i51);
                        int highSpeedVideoSizes2 = getHighSpeedVideoSizes(iArr3, m1897getSpanRangelOCCd4c2);
                        for (int i53 = i51; i53 < i49; i53++) {
                            iArr3[i53] = m1903getAndMeasurejy6DScQ2.getMainAxisSizeWithSpacings() + highSpeedVideoSizes2;
                            copyOf3[i53] = i46;
                            arrayDequeArr[i53].addLast(m1903getAndMeasurejy6DScQ2);
                        }
                        if (highSpeedVideoSizes2 >= mainAxisSpacing || iArr3[i51] > mainAxisSpacing) {
                            i26 = 1;
                        } else {
                            m1903getAndMeasurejy6DScQ2.setVisible(false);
                            i26 = 1;
                            z3 = true;
                        }
                        i44 = i52 != i26 ? lazyStaggeredGridMeasureContext.getLaneCount() : i44;
                        indexOfMinValue$default = indexOfMinValue;
                        i27 = i48;
                        i37 = i47;
                        z5 = z8;
                        measureScope = lazyLayoutMeasureScope2;
                        copyOf2 = iArr15;
                        coerceAtLeast = i50;
                    } else {
                        indexOfMinValue$default = indexOfMinValue;
                    }
                }
                i4 = i27;
                boolean z9 = z5;
                lazyLayoutMeasureScope = measureScope;
                int[] iArr16 = copyOf2;
                int i54 = coerceAtLeast;
                i5 = i37;
                while (true) {
                    int i55 = 0;
                    while (i55 < length4) {
                        int i56 = iArr3[i55];
                        i6 = i54;
                        if (i56 < i6 || i56 <= 0) {
                            i7 = i2;
                            break;
                        }
                        i55++;
                        i54 = i6;
                    }
                    i6 = i54;
                    i7 = i2;
                    for (int i57 = 0; i57 < i7; i57++) {
                        if (!arrayDequeArr[i57].isEmpty()) {
                            i8 = 1;
                            break;
                        }
                    }
                    i8 = 1;
                    int indexOfMinValue$default2 = indexOfMinValue$default(iArr3, 0, 1, null);
                    int maxOrThrow = kotlin.collections.ArraysKt.maxOrThrow(copyOf3) + 1;
                    if (maxOrThrow >= itemCount) {
                        break;
                    }
                    int i58 = i7;
                    i54 = i6;
                    int[] iArr17 = copyOf3;
                    int i59 = length4;
                    int[] iArr18 = iArr3;
                    int i60 = itemCount;
                    int i61 = i4;
                    androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope3 = lazyLayoutMeasureScope;
                    int[] iArr19 = iArr16;
                    int[] iArr20 = copyOf;
                    long m1897getSpanRangelOCCd4c3 = lazyStaggeredGridMeasureContext3.m1897getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), maxOrThrow, indexOfMinValue$default2);
                    int i62 = (int) (m1897getSpanRangelOCCd4c3 & 4294967295L);
                    int i63 = (int) (m1897getSpanRangelOCCd4c3 >> 32);
                    int i64 = i62 - i63;
                    lazyStaggeredGridMeasureContext.getLaneInfo().setLane(maxOrThrow, i64 != 1 ? -2 : i63);
                    androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem m1903getAndMeasurejy6DScQ3 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m1903getAndMeasurejy6DScQ(maxOrThrow, m1897getSpanRangelOCCd4c3);
                    int highSpeedVideoSizes3 = getHighSpeedVideoSizes(iArr18, m1897getSpanRangelOCCd4c3);
                    if (i64 != 1) {
                        iArr10 = lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(maxOrThrow);
                        if (iArr10 == null) {
                            iArr10 = new int[lazyStaggeredGridMeasureContext.getLaneCount()];
                        }
                    } else {
                        iArr10 = null;
                    }
                    for (int i65 = i63; i65 < i62; i65++) {
                        if (iArr10 != null) {
                            iArr10[i65] = highSpeedVideoSizes3 - iArr18[i65];
                        }
                        iArr17[i65] = maxOrThrow;
                        iArr18[i65] = highSpeedVideoSizes3 + m1903getAndMeasurejy6DScQ3.getMainAxisSizeWithSpacings();
                        arrayDequeArr[i65].addLast(m1903getAndMeasurejy6DScQ3);
                    }
                    lazyStaggeredGridMeasureContext.getLaneInfo().setGaps(maxOrThrow, iArr10);
                    if (highSpeedVideoSizes3 < mainAxisSpacing && iArr18[i63] <= mainAxisSpacing) {
                        m1903getAndMeasurejy6DScQ3.setVisible(false);
                    }
                    copyOf3 = iArr17;
                    i4 = i61;
                    length4 = i59;
                    lazyLayoutMeasureScope = lazyLayoutMeasureScope3;
                    iArr3 = iArr18;
                    i2 = i58;
                    copyOf = iArr20;
                    itemCount = i60;
                    iArr16 = iArr19;
                }
                int i66 = 0;
                while (i66 < i7) {
                    kotlin.collections.ArrayDeque arrayDeque = arrayDequeArr[i66];
                    while (arrayDeque.size() > i8 && !((androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) arrayDeque.first()).getIsVisible()) {
                        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) arrayDeque.removeFirst();
                        int[] gaps2 = lazyStaggeredGridMeasuredItem.getSpan() != i8 ? lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(lazyStaggeredGridMeasuredItem.getIndex()) : null;
                        iArr16[i66] = iArr16[i66] - (lazyStaggeredGridMeasuredItem.getMainAxisSizeWithSpacings() + (gaps2 == null ? 0 : gaps2[i66]));
                        i8 = 1;
                    }
                    androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem2 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) arrayDeque.firstOrNull();
                    copyOf[i66] = lazyStaggeredGridMeasuredItem2 != null ? lazyStaggeredGridMeasuredItem2.getIndex() : -1;
                    i66++;
                    i8 = 1;
                }
                int length5 = copyOf3.length;
                int i67 = 0;
                while (true) {
                    if (i67 >= length5) {
                        break;
                    }
                    if (copyOf3[i67] == itemCount - 1) {
                        getHighSpeedVideoFpsRanges(iArr3, -lazyStaggeredGridMeasureContext.getMainAxisSpacing());
                        break;
                    }
                    i67++;
                }
                int i68 = 0;
                while (true) {
                    if (i68 < length4) {
                        if (iArr3[i68] >= lazyStaggeredGridMeasureContext.getMainAxisAvailableSize()) {
                            i9 = i6;
                            iArr5 = copyOf3;
                            i10 = length4;
                            i11 = i4;
                            iArr4 = iArr16;
                            arrayList = null;
                            break loop0;
                        }
                        i68++;
                    } else {
                        mainAxisAvailableSize = lazyStaggeredGridMeasureContext.getMainAxisAvailableSize() - iArr3[getHighSpeedVideoFpsRangesFor(iArr3)];
                        iArr4 = iArr16;
                        getHighSpeedVideoFpsRanges(iArr4, -mainAxisAvailableSize);
                        getHighSpeedVideoFpsRanges(iArr3, mainAxisAvailableSize);
                        boolean z10 = false;
                        while (true) {
                            int length6 = iArr4.length;
                            int i69 = 0;
                            while (true) {
                                if (i69 >= length6) {
                                    break;
                                }
                                if (iArr4[i69] < lazyStaggeredGridMeasureContext.getBeforeContentPadding()) {
                                    break;
                                }
                                i69++;
                                lazyStaggeredGridMeasureContext3 = lazyStaggeredGridMeasureContext;
                            }
                            lazyStaggeredGridMeasureContext3 = lazyStaggeredGridMeasureContext;
                            length4 = i12;
                            copyOf3 = iArr6;
                            i6 = i13;
                        }
                        i9 = i6;
                        iArr5 = copyOf3;
                        i10 = length4;
                        if (!z10 || !z9) {
                            break;
                        }
                        lazyStaggeredGridMeasureContext.getLaneInfo().reset();
                        lazyStaggeredGridMeasureContext3 = lazyStaggeredGridMeasureContext;
                        iArr12 = iArr4;
                        iArr11 = copyOf;
                        i27 = i4;
                    }
                }
            }
            z5 = false;
        }
        i11 = i4 + mainAxisAvailableSize;
        arrayList = null;
        int i70 = iArr4[indexOfMinValue$default(iArr4, 0, 1, null)];
        if (i70 < 0) {
            i11 += i70;
            getHighSpeedVideoFpsRanges(iArr3, i70);
            getHighSpeedVideoFpsRanges(iArr4, -i70);
        }
        float scrollToBeConsumed$foundation = lazyStaggeredGridMeasureContext.getState().scrollToBeConsumed$foundation(lazyLayoutMeasureScope.isLookingAhead());
        float f2 = (kotlin.math.MathKt.getSign(java.lang.Math.round(scrollToBeConsumed$foundation)) != kotlin.math.MathKt.getSign(i11) || java.lang.Math.abs(java.lang.Math.round(scrollToBeConsumed$foundation)) < java.lang.Math.abs(i11)) ? scrollToBeConsumed$foundation : i11;
        float f3 = scrollToBeConsumed$foundation - f2;
        float f4 = (!lazyLayoutMeasureScope.isLookingAhead() || i11 <= (i25 = i4) || f3 > 0.0f) ? 0.0f : (i11 - i25) + f3;
        int[] copyOf4 = java.util.Arrays.copyOf(iArr4, iArr4.length);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf4, "copyOf(...)");
        int length7 = copyOf4.length;
        for (int i71 = 0; i71 < length7; i71++) {
            copyOf4[i71] = -copyOf4[i71];
        }
        if (lazyStaggeredGridMeasureContext.getBeforeContentPadding() > lazyStaggeredGridMeasureContext.getMainAxisSpacing()) {
            for (int i72 = 0; i72 < i7; i72++) {
                kotlin.collections.ArrayDeque arrayDeque2 = arrayDequeArr[i72];
                int size2 = arrayDeque2.size();
                int i73 = 0;
                while (i73 < size2) {
                    androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem3 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) arrayDeque2.get(i73);
                    int[] gaps3 = lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(lazyStaggeredGridMeasuredItem3.getIndex());
                    int mainAxisSizeWithSpacings2 = lazyStaggeredGridMeasuredItem3.getMainAxisSizeWithSpacings() + (gaps3 == null ? 0 : gaps3[i72]);
                    if (i73 != kotlin.collections.CollectionsKt.getLastIndex(arrayDeque2) && (i24 = iArr4[i72]) != 0 && i24 >= mainAxisSizeWithSpacings2) {
                        iArr4[i72] = i24 - mainAxisSizeWithSpacings2;
                        i73++;
                        copyOf[i72] = ((androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) arrayDeque2.get(i73)).getIndex();
                    }
                }
            }
        }
        int beforeContentPadding = lazyStaggeredGridMeasureContext.getBeforeContentPadding() + lazyStaggeredGridMeasureContext.getAfterContentPadding();
        if (lazyStaggeredGridMeasureContext.getIsVertical()) {
            m8571constrainWidthK40F9xA = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(lazyStaggeredGridMeasureContext.getConstraints());
        } else {
            m8571constrainWidthK40F9xA = androidx.compose.ui.unit.ConstraintsKt.m8571constrainWidthK40F9xA(lazyStaggeredGridMeasureContext.getConstraints(), kotlin.collections.ArraysKt.maxOrThrow(iArr3) + beforeContentPadding);
        }
        int i74 = m8571constrainWidthK40F9xA;
        if (lazyStaggeredGridMeasureContext.getIsVertical()) {
            m8553getMaxHeightimpl = androidx.compose.ui.unit.ConstraintsKt.m8570constrainHeightK40F9xA(lazyStaggeredGridMeasureContext.getConstraints(), kotlin.collections.ArraysKt.maxOrThrow(iArr3) + beforeContentPadding);
        } else {
            m8553getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(lazyStaggeredGridMeasureContext.getConstraints());
        }
        int i75 = m8553getMaxHeightimpl;
        int afterContentPadding = lazyStaggeredGridMeasureContext.getAfterContentPadding() + (java.lang.Math.min(lazyStaggeredGridMeasureContext.getIsVertical() ? i75 : i74, lazyStaggeredGridMeasureContext.getMainAxisAvailableSize()) - lazyStaggeredGridMeasureContext.getBeforeContentPadding());
        int i76 = copyOf4[0];
        java.util.List<java.lang.Integer> pinnedItems = lazyStaggeredGridMeasureContext.getPinnedItems();
        int size3 = pinnedItems.size() - 1;
        if (size3 >= 0) {
            java.util.ArrayList arrayList4 = arrayList;
            while (true) {
                int i77 = size3 - 1;
                int intValue = pinnedItems.get(size3).intValue();
                int lane = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(intValue);
                java.util.List<java.lang.Integer> list3 = pinnedItems;
                if (lane != -2 && lane != -1) {
                    androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem4 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) arrayDequeArr[lane].firstOrNull();
                } else {
                    for (int i78 = 0; i78 < i7; i78++) {
                        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem5 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) arrayDequeArr[i78].firstOrNull();
                        if ((lazyStaggeredGridMeasuredItem5 != null ? lazyStaggeredGridMeasuredItem5.getIndex() : -1) <= intValue) {
                            lazyStaggeredGridMeasureContext2 = lazyStaggeredGridMeasureContext;
                            i23 = i7;
                            iArr7 = copyOf;
                            i14 = i74;
                            break;
                        }
                    }
                    lazyStaggeredGridMeasureContext2 = lazyStaggeredGridMeasureContext;
                    i23 = i7;
                    iArr7 = copyOf;
                    i14 = i74;
                    long m1897getSpanRangelOCCd4c4 = lazyStaggeredGridMeasureContext2.m1897getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), intValue, 0);
                    if (arrayList4 == null) {
                        arrayList4 = new java.util.ArrayList();
                    }
                    java.util.ArrayList arrayList5 = arrayList4;
                    androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem m1903getAndMeasurejy6DScQ4 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m1903getAndMeasurejy6DScQ(intValue, m1897getSpanRangelOCCd4c4);
                    i76 -= m1903getAndMeasurejy6DScQ4.getMainAxisSizeWithSpacings();
                    m1903getAndMeasurejy6DScQ4.position(i76, 0, afterContentPadding);
                    arrayList5.add(m1903getAndMeasurejy6DScQ4);
                    arrayList4 = arrayList5;
                }
                if (i77 < 0) {
                    break;
                }
                size3 = i77;
                pinnedItems = list3;
                i7 = i23;
                i74 = i14;
                copyOf = iArr7;
            }
            list = arrayList4;
        } else {
            lazyStaggeredGridMeasureContext2 = lazyStaggeredGridMeasureContext;
            iArr7 = copyOf;
            i14 = i74;
            list = null;
        }
        if (list == null) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List list4 = list;
        java.util.List<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(lazyStaggeredGridMeasureContext, arrayDequeArr, copyOf4, afterContentPadding, i5, i9);
        int i79 = copyOf4[0];
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem6 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) highSpeedVideoFpsRangesFor);
        int index2 = lazyStaggeredGridMeasuredItem6 != null ? lazyStaggeredGridMeasuredItem6.getIndex() : -1;
        if (lazyLayoutMeasureScope.isLookingAhead() && lazyStaggeredGridMeasureContext.getApproachLayoutInfo() != null && !lazyStaggeredGridMeasureContext.getApproachLayoutInfo().getVisibleItemsInfo().isEmpty()) {
            java.util.List<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo> visibleItemsInfo = lazyStaggeredGridMeasureContext.getApproachLayoutInfo().getVisibleItemsInfo();
            for (int size4 = visibleItemsInfo.size() - 1; size4 >= 0; size4--) {
                if (visibleItemsInfo.get(size4).getIndex() > index2 && (size4 == 0 || visibleItemsInfo.get(size4 - 1).getIndex() <= index2)) {
                    lazyStaggeredGridItemInfo = visibleItemsInfo.get(size4);
                    break;
                }
            }
            lazyStaggeredGridItemInfo = null;
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo3 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) kotlin.collections.CollectionsKt.last((java.util.List) lazyStaggeredGridMeasureContext.getApproachLayoutInfo().getVisibleItemsInfo());
            if (lazyStaggeredGridItemInfo != null && (index = lazyStaggeredGridItemInfo.getIndex()) <= (min = java.lang.Math.min(lazyStaggeredGridItemInfo3.getIndex(), itemCount - 1))) {
                int i80 = index;
                arrayList2 = null;
                while (true) {
                    if (arrayList2 != null) {
                        int size5 = arrayList2.size();
                        int i81 = 0;
                        while (i81 < size5) {
                            int i82 = size5;
                            if (((androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) arrayList2.get(i81)).getIndex() == i80) {
                                f = f4;
                                i15 = beforeContentPadding;
                                break;
                            }
                            i81++;
                            size5 = i82;
                        }
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new java.util.ArrayList();
                    }
                    java.util.List<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo> visibleItemsInfo2 = lazyStaggeredGridMeasureContext.getApproachLayoutInfo().getVisibleItemsInfo();
                    int size6 = visibleItemsInfo2.size();
                    f = f4;
                    int i83 = 0;
                    while (true) {
                        if (i83 >= size6) {
                            lazyStaggeredGridItemInfo2 = null;
                            break;
                        }
                        lazyStaggeredGridItemInfo2 = visibleItemsInfo2.get(i83);
                        java.util.List<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo> list5 = visibleItemsInfo2;
                        if (lazyStaggeredGridItemInfo2.getIndex() == i80) {
                            break;
                        }
                        i83++;
                        visibleItemsInfo2 = list5;
                    }
                    androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo4 = lazyStaggeredGridItemInfo2;
                    int lane2 = lazyStaggeredGridItemInfo4 != null ? lazyStaggeredGridItemInfo4.getLane() : 0;
                    i15 = beforeContentPadding;
                    androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem m1903getAndMeasurejy6DScQ5 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m1903getAndMeasurejy6DScQ(i80, lazyStaggeredGridMeasureContext2.m1897getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), i80, lane2));
                    arrayList2.add(m1903getAndMeasurejy6DScQ5);
                    int[] positions = lazyStaggeredGridMeasureContext.getResolvedSlots().getPositions();
                    m1903getAndMeasurejy6DScQ5.position(i79, positions.length > lane2 ? positions[lane2] : 0, afterContentPadding);
                    i79 += m1903getAndMeasurejy6DScQ5.getMainAxisSizeWithSpacings();
                    if (i80 == min) {
                        break;
                    }
                    i80++;
                    beforeContentPadding = i15;
                    f4 = f;
                }
                java.util.List<java.lang.Integer> pinnedItems2 = lazyStaggeredGridMeasureContext.getPinnedItems();
                size = pinnedItems2.size();
                i16 = 0;
                arrayList3 = null;
                while (i16 < size) {
                    int intValue2 = pinnedItems2.get(i16).intValue();
                    if (intValue2 >= itemCount) {
                        list2 = pinnedItems2;
                        i21 = size;
                    } else {
                        if (arrayList2 != null) {
                            int size7 = arrayList2.size();
                            list2 = pinnedItems2;
                            int i84 = 0;
                            while (i84 < size7) {
                                i21 = size;
                                if (((androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) arrayList2.get(i84)).getIndex() == intValue2) {
                                    break;
                                }
                                i84++;
                                size = i21;
                            }
                        } else {
                            list2 = pinnedItems2;
                        }
                        i21 = size;
                        int lane3 = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(intValue2);
                        if (lane3 != -2 && lane3 != -1) {
                            if (iArr5[lane3] < intValue2) {
                                iArr8 = iArr5;
                            }
                        } else {
                            iArr8 = iArr5;
                            int length8 = iArr8.length;
                            int i85 = 0;
                            while (i85 < length8) {
                                int i86 = length8;
                                if (iArr8[i85] >= intValue2) {
                                    iArr9 = iArr3;
                                    i22 = itemCount;
                                    break;
                                }
                                i85++;
                                length8 = i86;
                            }
                        }
                        iArr9 = iArr3;
                        i22 = itemCount;
                        long m1897getSpanRangelOCCd4c5 = lazyStaggeredGridMeasureContext2.m1897getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), intValue2, 0);
                        if (arrayList3 == null) {
                            arrayList3 = new java.util.ArrayList();
                        }
                        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem m1903getAndMeasurejy6DScQ6 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m1903getAndMeasurejy6DScQ(intValue2, m1897getSpanRangelOCCd4c5);
                        m1903getAndMeasurejy6DScQ6.position(i79, 0, afterContentPadding);
                        i79 += m1903getAndMeasurejy6DScQ6.getMainAxisSizeWithSpacings();
                        arrayList3.add(m1903getAndMeasurejy6DScQ6);
                        i16++;
                        iArr3 = iArr9;
                        size = i21;
                        itemCount = i22;
                        iArr5 = iArr8;
                        pinnedItems2 = list2;
                    }
                    iArr8 = iArr5;
                    iArr9 = iArr3;
                    i22 = itemCount;
                    break;
                    i16++;
                    iArr3 = iArr9;
                    size = i21;
                    itemCount = i22;
                    iArr5 = iArr8;
                    pinnedItems2 = list2;
                }
                int i87 = itemCount;
                int[] iArr21 = iArr5;
                int[] iArr22 = iArr3;
                if (arrayList3 == null) {
                    arrayList3 = kotlin.collections.CollectionsKt.emptyList();
                }
                final java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.addAll(list4);
                arrayList6.addAll(highSpeedVideoFpsRangesFor);
                if (arrayList2 != null) {
                    arrayList6.addAll(arrayList2);
                }
                arrayList6.addAll(arrayList3);
                lazyStaggeredGridMeasureContext.getState().getItemAnimator$foundation().onMeasured((int) f2, i14, i75, arrayList6, lazyStaggeredGridMeasureContext.getMeasuredItemProvider().getKeyIndexMap(), lazyStaggeredGridMeasureContext.getMeasuredItemProvider(), lazyStaggeredGridMeasureContext.getIsVertical(), lazyLayoutMeasureScope.isLookingAhead(), lazyStaggeredGridMeasureContext.getLaneCount(), lazyStaggeredGridMeasureContext.getIsInLookaheadScope(), kotlin.collections.ArraysKt.minOrThrow(iArr4), kotlin.collections.ArraysKt.maxOrThrow(iArr22) + i15, lazyStaggeredGridMeasureContext.getCoroutineScope(), lazyStaggeredGridMeasureContext.getGraphicsContext());
                if (!lazyLayoutMeasureScope.isLookingAhead()) {
                    long m1853getMinSizeToFitDisappearingItemsYbymL2g = lazyStaggeredGridMeasureContext.getState().getItemAnimator$foundation().m1853getMinSizeToFitDisappearingItemsYbymL2g();
                    if (!androidx.compose.ui.unit.IntSize.m8770equalsimpl0(m1853getMinSizeToFitDisappearingItemsYbymL2g, androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g())) {
                        int i88 = lazyStaggeredGridMeasureContext.getIsVertical() ? i75 : i14;
                        i18 = androidx.compose.ui.unit.ConstraintsKt.m8571constrainWidthK40F9xA(lazyStaggeredGridMeasureContext.getConstraints(), java.lang.Math.max(i14, (int) (m1853getMinSizeToFitDisappearingItemsYbymL2g >> 32)));
                        int m8570constrainHeightK40F9xA = androidx.compose.ui.unit.ConstraintsKt.m8570constrainHeightK40F9xA(lazyStaggeredGridMeasureContext.getConstraints(), java.lang.Math.max(i75, (int) (m1853getMinSizeToFitDisappearingItemsYbymL2g & 4294967295L)));
                        int i89 = lazyStaggeredGridMeasureContext.getIsVertical() ? m8570constrainHeightK40F9xA : i18;
                        if (i89 != i88) {
                            int size8 = arrayList6.size();
                            for (int i90 = 0; i90 < size8; i90++) {
                                arrayList6.get(i90).updateMainAxisLayoutSize(i89);
                            }
                        }
                        i17 = m8570constrainHeightK40F9xA;
                        i19 = i10;
                        i20 = 0;
                        while (true) {
                            if (i20 < i19) {
                                if (iArr22[i20] > lazyStaggeredGridMeasureContext.getMainAxisAvailableSize()) {
                                    break;
                                }
                                i20++;
                            } else {
                                for (int i91 : iArr21) {
                                    if (i91 >= i87 - 1) {
                                        z4 = false;
                                        break;
                                    }
                                }
                            }
                        }
                        z4 = true;
                        final androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope4 = lazyLayoutMeasureScope;
                        return new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult(iArr7, iArr4, f2, androidx.compose.ui.layout.MeasureScope.layout$default(lazyLayoutMeasureScope, i18, i17, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext.this, arrayList6, lazyLayoutMeasureScope4, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                                return highResolutionOutputSizeshNQ4ISI;
                            }
                        }, 4, null), f, z4, lazyStaggeredGridMeasureContext.getIsVertical(), z3, lazyStaggeredGridMeasureContext.getResolvedSlots(), lazyStaggeredGridMeasureContext.getItemProvider().getSpanProvider(), lazyLayoutMeasureScope4, i87, highSpeedVideoFpsRangesFor, androidx.compose.ui.unit.IntSize.m8767constructorimpl((i18 << 32) | (i17 & 4294967295L)), i5, i9, lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisSpacing(), lazyStaggeredGridMeasureContext.getCoroutineScope(), null);
                    }
                }
                i17 = i75;
                i18 = i14;
                i19 = i10;
                i20 = 0;
                while (true) {
                    if (i20 < i19) {
                    }
                    i20++;
                }
                z4 = true;
                final androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope42 = lazyLayoutMeasureScope;
                return new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult(iArr7, iArr4, f2, androidx.compose.ui.layout.MeasureScope.layout$default(lazyLayoutMeasureScope, i18, i17, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                        highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext.this, arrayList6, lazyLayoutMeasureScope42, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                        return highResolutionOutputSizeshNQ4ISI;
                    }
                }, 4, null), f, z4, lazyStaggeredGridMeasureContext.getIsVertical(), z3, lazyStaggeredGridMeasureContext.getResolvedSlots(), lazyStaggeredGridMeasureContext.getItemProvider().getSpanProvider(), lazyLayoutMeasureScope42, i87, highSpeedVideoFpsRangesFor, androidx.compose.ui.unit.IntSize.m8767constructorimpl((i18 << 32) | (i17 & 4294967295L)), i5, i9, lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisSpacing(), lazyStaggeredGridMeasureContext.getCoroutineScope(), null);
            }
        }
        f = f4;
        i15 = beforeContentPadding;
        arrayList2 = null;
        java.util.List<java.lang.Integer> pinnedItems22 = lazyStaggeredGridMeasureContext.getPinnedItems();
        size = pinnedItems22.size();
        i16 = 0;
        arrayList3 = null;
        while (i16 < size) {
        }
        int i872 = itemCount;
        int[] iArr212 = iArr5;
        int[] iArr222 = iArr3;
        if (arrayList3 == null) {
        }
        final java.util.List arrayList62 = new java.util.ArrayList();
        arrayList62.addAll(list4);
        arrayList62.addAll(highSpeedVideoFpsRangesFor);
        if (arrayList2 != null) {
        }
        arrayList62.addAll(arrayList3);
        lazyStaggeredGridMeasureContext.getState().getItemAnimator$foundation().onMeasured((int) f2, i14, i75, arrayList62, lazyStaggeredGridMeasureContext.getMeasuredItemProvider().getKeyIndexMap(), lazyStaggeredGridMeasureContext.getMeasuredItemProvider(), lazyStaggeredGridMeasureContext.getIsVertical(), lazyLayoutMeasureScope.isLookingAhead(), lazyStaggeredGridMeasureContext.getLaneCount(), lazyStaggeredGridMeasureContext.getIsInLookaheadScope(), kotlin.collections.ArraysKt.minOrThrow(iArr4), kotlin.collections.ArraysKt.maxOrThrow(iArr222) + i15, lazyStaggeredGridMeasureContext.getCoroutineScope(), lazyStaggeredGridMeasureContext.getGraphicsContext());
        if (!lazyLayoutMeasureScope.isLookingAhead()) {
        }
        i17 = i75;
        i18 = i14;
        i19 = i10;
        i20 = 0;
        while (true) {
            if (i20 < i19) {
            }
            i20++;
        }
        z4 = true;
        final androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope422 = lazyLayoutMeasureScope;
        return new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult(iArr7, iArr4, f2, androidx.compose.ui.layout.MeasureScope.layout$default(lazyLayoutMeasureScope, i18, i17, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext.this, arrayList62, lazyLayoutMeasureScope422, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                return highResolutionOutputSizeshNQ4ISI;
            }
        }, 4, null), f, z4, lazyStaggeredGridMeasureContext.getIsVertical(), z3, lazyStaggeredGridMeasureContext.getResolvedSlots(), lazyStaggeredGridMeasureContext.getItemProvider().getSpanProvider(), lazyLayoutMeasureScope422, i872, highSpeedVideoFpsRangesFor, androidx.compose.ui.unit.IntSize.m8767constructorimpl((i18 << 32) | (i17 & 4294967295L)), i5, i9, lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisSpacing(), lazyStaggeredGridMeasureContext.getCoroutineScope(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI() {
        return kotlin.Unit.INSTANCE;
    }

    private static final boolean getHighResolutionOutputSizeshNQ4ISI(int[] iArr, int[] iArr2, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            if (iArr2[i] < java.lang.Math.max(-lazyStaggeredGridMeasureContext.getMainAxisSpacing(), 0) && i2 > 0) {
                return true;
            }
        }
        return false;
    }

    private static final boolean Camera2StreamConfigurationMap(int[] iArr, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr2, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (getHighSpeedVideoFpsRanges(lazyStaggeredGridMeasureContext, iArr[i2], i2) == -1 && iArr2[i2] != iArr2[i]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i3 = 0; i3 < length2; i3++) {
            if (getHighSpeedVideoFpsRanges(lazyStaggeredGridMeasureContext, iArr[i3], i3) != -1 && iArr2[i3] >= iArr2[i]) {
                return true;
            }
        }
        int lane = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(0);
        return (lane == 0 || lane == -1 || lane == -2) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, final java.util.List list, final androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        placementScope.withMotionFrameOfReferencePlacement(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt.Camera2StreamConfigurationMap(list, lazyStaggeredGridMeasureContext, lazyLayoutMeasureScope, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                return Camera2StreamConfigurationMap;
            }
        });
        androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator.m1869attachToScopeimpl(lazyStaggeredGridMeasureContext.getState().m1905getPlacementScopeInvalidatorzYiylxw$foundation());
        return kotlin.Unit.INSTANCE;
    }

    private static final java.util.List<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem> getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, kotlin.collections.ArrayDeque<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem>[] arrayDequeArr, int[] iArr, int i, int i2, int i3) {
        int i4 = 0;
        for (kotlin.collections.ArrayDeque<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem> arrayDeque : arrayDequeArr) {
            i4 += arrayDeque.size();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i4);
        while (true) {
            for (kotlin.collections.ArrayDeque<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem> arrayDeque2 : arrayDequeArr) {
                if (!arrayDeque2.isEmpty()) {
                    int length = arrayDequeArr.length;
                    int i5 = -1;
                    int i6 = Integer.MAX_VALUE;
                    for (int i7 = 0; i7 < length; i7++) {
                        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem firstOrNull = arrayDequeArr[i7].firstOrNull();
                        int index = firstOrNull != null ? firstOrNull.getIndex() : Integer.MAX_VALUE;
                        if (i6 > index) {
                            i5 = i7;
                            i6 = index;
                        }
                    }
                    androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem removeFirst = arrayDequeArr[i5].removeFirst();
                    if (removeFirst.getLane() == i5) {
                        long m1907constructorimpl = androidx.compose.foundation.lazy.staggeredgrid.SpanRange.m1907constructorimpl(removeFirst.getLane(), removeFirst.getSpan());
                        int highSpeedVideoSizes = getHighSpeedVideoSizes(iArr, m1907constructorimpl);
                        int i8 = lazyStaggeredGridMeasureContext.getResolvedSlots().getPositions()[i5];
                        if (removeFirst.getMainAxisSize() + highSpeedVideoSizes >= i2 && highSpeedVideoSizes <= i3) {
                            removeFirst.position(highSpeedVideoSizes, i8, i);
                            arrayList.add(removeFirst);
                        }
                        int i9 = (int) (m1907constructorimpl & 4294967295L);
                        for (int i10 = (int) (m1907constructorimpl >> 32); i10 < i9; i10++) {
                            iArr[i10] = removeFirst.getMainAxisSizeWithSpacings() + highSpeedVideoSizes;
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    private static final void getHighSpeedVideoFpsRanges(int[] iArr, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = iArr[i2] + i;
        }
    }

    private static final int getHighSpeedVideoSizes(int[] iArr, long j) {
        int i = (int) (j & 4294967295L);
        int i2 = Integer.MIN_VALUE;
        for (int i3 = (int) (j >> 32); i3 < i; i3++) {
            i2 = java.lang.Math.max(i2, iArr[i3]);
        }
        return i2;
    }

    public static /* synthetic */ int indexOfMinValue$default(int[] iArr, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = Integer.MIN_VALUE;
        }
        return indexOfMinValue(iArr, i);
    }

    public static final int indexOfMinValue(int[] iArr, int i) {
        int length = iArr.length;
        int i2 = -1;
        int i3 = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            if (i + 1 <= i5 && i5 < i3) {
                i2 = i4;
                i3 = i5;
            }
        }
        return i2;
    }

    private static final int getHighSpeedVideoFpsRangesFor(int[] iArr) {
        int length = iArr.length;
        int i = -1;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (i2 < i4) {
                i = i3;
                i2 = i4;
            }
        }
        return i;
    }

    private static final void getHighSpeedVideoSizes(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr, int i) {
        int length = iArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i2 = length - 1;
            while (true) {
                if (iArr[length] < i && lazyStaggeredGridMeasureContext.getLaneInfo().assignedToLane(iArr[length], length)) {
                    break;
                } else {
                    iArr[length] = getHighSpeedVideoFpsRanges(lazyStaggeredGridMeasureContext, iArr[length], length);
                }
            }
            int i3 = iArr[length];
            if (i3 >= 0 && !lazyStaggeredGridMeasureContext.isFullSpan(lazyStaggeredGridMeasureContext.getItemProvider(), i3)) {
                if (lazyStaggeredGridMeasureContext.getLaneInfo().getLane(i3) == -2) {
                    int length2 = iArr.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length2) {
                            i4 = -1;
                            break;
                        } else if (iArr[i4] == i3) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    int i5 = i4 + 1;
                    if (i5 <= length) {
                        while (true) {
                            if (iArr[i5] == i3) {
                                iArr[i5] = getHighSpeedVideoFpsRanges(lazyStaggeredGridMeasureContext, i3, i5);
                            }
                            if (i5 == length) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                    length = i4;
                }
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(i3, length);
            }
            if (i2 < 0) {
                return;
            } else {
                length = i2;
            }
        }
    }

    private static final int getHighSpeedVideoFpsRanges(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i, int i2) {
        return lazyStaggeredGridMeasureContext.getLaneInfo().findPreviousItemIndex(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(java.util.List list, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) list.get(i)).place(placementScope, lazyStaggeredGridMeasureContext, lazyLayoutMeasureScope.isLookingAhead());
        }
        return kotlin.Unit.INSTANCE;
    }
}
