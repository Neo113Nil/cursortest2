package androidx.compose.foundation.lazy.staggeredgrid;

/* compiled from: LazyStaggeredGridMeasure.kt */
@kotlin.Metadata(d1 = {"\u0000\u0098\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0082\b\u001a5\u0010\t\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H\n0\u000e¢\u0006\u0002\b\u000fH\u0083\b¢\u0006\u0002\u0010\u0010\u001aR\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012*\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u000e2!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00010\u000e2\u0006\u0010\u001a\u001a\u00020\u0001H\u0083\b\u001a;\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012*\u00020\u00142\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001e0\u001d2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0003H\u0002¢\u0006\u0002\u0010\"\u001a\u001d\u0010#\u001a\u00020\b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001e0\u001dH\u0002¢\u0006\u0002\u0010$\u001a\u001c\u0010%\u001a\u00020\u0005*\u00020\u00142\u0006\u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020\u0003H\u0002\u001a7\u0010(\u001a\u00020\u0005\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00122\b\b\u0002\u0010)\u001a\u00020\u00012\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00050\u000eH\u0082\b\u001a\u001c\u0010+\u001a\u00020\u0003*\u00020\u00142\u0006\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u0003H\u0002\u001a+\u0010.\u001a\u00020\u0005*\u00020/2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u000eH\u0082\bø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a\f\u00102\u001a\u00020\u0003*\u00020 H\u0002\u001a2\u00103\u001a\u00020\u0003\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u001d2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00030\u000eH\u0082\b¢\u0006\u0002\u00104\u001a\u0016\u00105\u001a\u00020\u0003*\u00020 2\b\b\u0002\u00106\u001a\u00020\u0003H\u0000\u001a\u001e\u00107\u001a\u00020\u0003*\u00020 2\u0006\u00108\u001a\u00020/H\u0002ø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a,\u0010;\u001a\u00020<*\u00020\u00142\u0006\u0010=\u001a\u00020\u00032\u0006\u0010>\u001a\u00020 2\u0006\u0010?\u001a\u00020 2\u0006\u0010@\u001a\u00020\u0001H\u0003\u001a\u0084\u0001\u0010A\u001a\u00020<*\u00020\f2\u0006\u0010B\u001a\u00020C2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\u00012\u0006\u0010L\u001a\u00020\u00012\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020\u00032\u0006\u0010P\u001a\u00020\u00032\u0006\u0010Q\u001a\u00020\u00032\u0006\u0010R\u001a\u00020\u00032\u0006\u0010S\u001a\u00020TH\u0001ø\u0001\u0000¢\u0006\u0004\bU\u0010V\u001a\u0014\u0010W\u001a\u00020\u0005*\u00020 2\u0006\u0010X\u001a\u00020\u0003H\u0002\u001a!\u0010Y\u001a\u00020 *\u00020 2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000eH\u0082\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Z"}, d2 = {"DebugLoggingEnabled", "", "Unset", "", "debugLog", "", "message", "Lkotlin/Function0;", "", "withDebugLogging", "T", "scope", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "calculateExtraItems", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "position", "filter", "Lkotlin/ParameterName;", "name", "itemIndex", "beforeVisibleBounds", "calculateVisibleItems", "measuredItems", "", "Lkotlin/collections/ArrayDeque;", "itemScrollOffsets", "", "mainAxisLayoutSize", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[Lkotlin/collections/ArrayDeque;[II)Ljava/util/List;", "debugRender", "([Lkotlin/collections/ArrayDeque;)Ljava/lang/String;", "ensureIndicesInRange", "indices", "itemCount", "fastForEach", "reverse", "action", "findPreviousItemIndex", "item", "lane", "forEach", "Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "forEach-nIS5qE8", "(JLkotlin/jvm/functions/Function1;)V", "indexOfMaxValue", "indexOfMinBy", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)I", "indexOfMinValue", "minBound", "maxInRange", "indexRange", "maxInRange-jy6DScQ", "([IJ)I", "measure", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "initialScrollDelta", "initialItemIndices", "initialItemOffsets", "canRestartMeasure", "measureStaggeredGrid", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "pinnedItems", "itemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "resolvedSlots", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "isVertical", "reverseLayout", "contentOffset", "Landroidx/compose/ui/unit/IntOffset;", "mainAxisAvailableSize", "mainAxisSpacing", "beforeContentPadding", "afterContentPadding", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "measureStaggeredGrid-sdzDtKU", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Ljava/util/List;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;JZZJIIIILkotlinx/coroutines/CoroutineScope;)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "offsetBy", "delta", "transform", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasureKt {
    private static final boolean DebugLoggingEnabled = false;
    private static final int Unset = Integer.MIN_VALUE;

    private static final void debugLog(kotlin.jvm.functions.Function0<java.lang.String> function0) {
    }

    private static final <T> T withDebugLogging(androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, ? extends T> function1) {
        return function1.invoke(lazyLayoutMeasureScope);
    }

    private static final java.lang.String debugRender(kotlin.collections.ArrayDeque<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem>[] arrayDequeArr) {
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: measureStaggeredGrid-sdzDtKU, reason: not valid java name */
    public static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult m777measureStaggeredGridsdzDtKU(androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState, java.util.List<java.lang.Integer> list, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots lazyStaggeredGridSlots, long j, boolean z, boolean z2, long j2, int i, int i2, int i3, int i4, kotlinx.coroutines.CoroutineScope coroutineScope) {
        T t;
        int m776maxInRangejy6DScQ;
        T t2;
        int i5;
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext(lazyStaggeredGridState, list, lazyStaggeredGridItemProvider, lazyStaggeredGridSlots, j, z, lazyLayoutMeasureScope, i, j2, i3, i4, z2, i2, coroutineScope, null);
        kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
        androidx.compose.runtime.snapshots.Snapshot createNonObservableSnapshot = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.createNonObservableSnapshot();
        try {
            androidx.compose.runtime.snapshots.Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            try {
                int[] updateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyStaggeredGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyStaggeredGridItemProvider, lazyStaggeredGridState.getScrollPosition().getIndices());
                int[] scrollOffsets = lazyStaggeredGridState.getScrollPosition().getScrollOffsets();
                if (updateScrollPositionIfTheFirstItemWasMoved$foundation_release.length == lazyStaggeredGridMeasureContext.getLaneCount()) {
                    t = updateScrollPositionIfTheFirstItemWasMoved$foundation_release;
                } else {
                    lazyStaggeredGridMeasureContext.getLaneInfo().reset();
                    int laneCount = lazyStaggeredGridMeasureContext.getLaneCount();
                    int[] iArr = new int[laneCount];
                    int i6 = 0;
                    while (i6 < laneCount) {
                        if (i6 >= updateScrollPositionIfTheFirstItemWasMoved$foundation_release.length || (m776maxInRangejy6DScQ = updateScrollPositionIfTheFirstItemWasMoved$foundation_release[i6]) == -1) {
                            m776maxInRangejy6DScQ = i6 == 0 ? 0 : m776maxInRangejy6DScQ(iArr, androidx.compose.foundation.lazy.staggeredgrid.SpanRange.m786constructorimpl(0, i6)) + 1;
                        }
                        iArr[i6] = m776maxInRangejy6DScQ;
                        lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[i6], i6);
                        i6++;
                    }
                    t = iArr;
                }
                objectRef.element = t;
                if (scrollOffsets.length == lazyStaggeredGridMeasureContext.getLaneCount()) {
                    t2 = scrollOffsets;
                } else {
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
                    t2 = iArr2;
                }
                objectRef2.element = t2;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                createNonObservableSnapshot.dispose();
                return measure(lazyStaggeredGridMeasureContext, kotlin.math.MathKt.roundToInt(lazyStaggeredGridState.getScrollToBeConsumed()), (int[]) objectRef.element, (int[]) objectRef2.element, true);
            } finally {
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
            }
        } catch (java.lang.Throwable th) {
            createNonObservableSnapshot.dispose();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:237:0x0553, code lost:
    
        if (r14[r7] > r12) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x02f5, code lost:
    
        r6 = indexOfMinValue$default(r8, 0, 1, null);
        r7 = indexOfMaxValue(r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0300, code lost:
    
        if (r6 == r7) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0306, code lost:
    
        if (r8[r6] != r8[r7]) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0308, code lost:
    
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x030a, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x030b, code lost:
    
        r7 = r29[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x030e, code lost:
    
        if (r7 != (-1)) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0310, code lost:
    
        r7 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0311, code lost:
    
        r7 = findPreviousItemIndex(r42, r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0315, code lost:
    
        if (r7 >= 0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0357, code lost:
    
        r10 = r27;
        r14 = r29;
        r32 = r5;
        r5 = r42.m773getSpanRangelOCCd4c(r42.getItemProvider(), r7, r6);
        r13 = r42.getLaneInfo();
        r44 = r3;
        r31 = r4;
        r4 = (int) (r5 & 4294967295L);
        r26 = r11;
        r27 = r12;
        r3 = (int) (r5 >> 32);
        r11 = r4 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0381, code lost:
    
        if (r11 == 1) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0383, code lost:
    
        r12 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0386, code lost:
    
        r13.setLane(r7, r12);
        r12 = r42.getMeasuredItemProvider().m781getAndMeasurejy6DScQ(r7, r5);
        r5 = m776maxInRangejy6DScQ(r8, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0396, code lost:
    
        if (r11 == 1) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0398, code lost:
    
        r6 = r42.getLaneInfo().getGaps(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x03a2, code lost:
    
        if (r3 >= r4) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x03a6, code lost:
    
        if (r8[r3] == r5) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x03a8, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x03a9, code lost:
    
        r9[r3].addFirst(r12);
        r14[r3] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x03b0, code lost:
    
        if (r6 != null) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x03b2, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x03b6, code lost:
    
        r8[r3] = (r12.getSizeWithSpacings() + r5) + r11;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x03b4, code lost:
    
        r11 = r6[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x03a1, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0385, code lost:
    
        r12 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0317, code lost:
    
        r14 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0319, code lost:
    
        if (r1 != false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x031f, code lost:
    
        if (measure$lambda$38$misalignedStart(r14, r42, r8, r6) == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x034b, code lost:
    
        r10 = r27;
        r44 = r3;
        r31 = r4;
        r32 = r5;
        r26 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0321, code lost:
    
        if (r46 == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0323, code lost:
    
        r42.getLaneInfo().reset();
        r1 = r14.length;
        r2 = new int[r1];
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x032e, code lost:
    
        if (r3 >= r1) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0330, code lost:
    
        r2[r3] = -1;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0336, code lost:
    
        r1 = r8.length;
        r3 = new int[r1];
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x033a, code lost:
    
        if (r4 >= r1) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x033c, code lost:
    
        r3[r4] = r8[r6];
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x034a, code lost:
    
        return measure(r42, r27, r2, r3, false);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult measure(final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i, int[] iArr, int[] iArr2, boolean z) {
        androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope;
        java.lang.String str;
        int i2;
        int i3;
        int i4;
        int[] iArr3;
        int i5;
        int i6;
        int[] iArr4;
        int i7;
        int i8;
        int[] iArr5;
        int[] iArr6;
        int i9;
        int i10;
        int[] iArr7;
        int[] iArr8;
        int i11;
        int i12;
        int i13;
        int[] iArr9;
        int m4438constrainWidthK40F9xA;
        int m4423getMaxHeightimpl;
        int i14;
        int i15;
        int[] iArr10;
        java.util.ArrayList arrayList;
        boolean z2;
        int[] iArr11;
        java.util.List<java.lang.Integer> list;
        int[] iArr12;
        int i16;
        int i17;
        int[] iArr13;
        boolean z3;
        int i18 = i;
        androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope measureScope = lazyStaggeredGridMeasureContext.getMeasureScope();
        int itemCount = lazyStaggeredGridMeasureContext.getItemProvider().getItemCount();
        if (itemCount <= 0 || lazyStaggeredGridMeasureContext.getLaneCount() == 0) {
            return new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult(iArr, iArr2, 0.0f, androidx.compose.ui.layout.MeasureScope.CC.layout$default(measureScope, androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(lazyStaggeredGridMeasureContext.getConstraints()), androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(lazyStaggeredGridMeasureContext.getConstraints()), null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return kotlin.Unit.INSTANCE;
                }
            }, 4, null), false, lazyStaggeredGridMeasureContext.getIsVertical(), false, itemCount, kotlin.collections.CollectionsKt.emptyList(), androidx.compose.ui.unit.IntSizeKt.IntSize(androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(lazyStaggeredGridMeasureContext.getConstraints()), androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(lazyStaggeredGridMeasureContext.getConstraints())), -lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisAvailableSize() + lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisSpacing(), null);
        }
        int[] copyOf = java.util.Arrays.copyOf(iArr, iArr.length);
        java.lang.String str2 = "copyOf(this, size)";
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        int[] copyOf2 = java.util.Arrays.copyOf(iArr2, iArr2.length);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, size)");
        ensureIndicesInRange(lazyStaggeredGridMeasureContext, copyOf, itemCount);
        offsetBy(copyOf2, -i18);
        int laneCount = lazyStaggeredGridMeasureContext.getLaneCount();
        kotlin.collections.ArrayDeque[] arrayDequeArr = new kotlin.collections.ArrayDeque[laneCount];
        for (int i19 = 0; i19 < laneCount; i19++) {
            arrayDequeArr[i19] = new kotlin.collections.ArrayDeque(16);
        }
        offsetBy(copyOf2, -lazyStaggeredGridMeasureContext.getBeforeContentPadding());
        boolean z4 = false;
        while (true) {
            if (!measure$lambda$38$hasSpaceBeforeFirst(copyOf, copyOf2, lazyStaggeredGridMeasureContext)) {
                lazyLayoutMeasureScope = measureScope;
                str = str2;
                i2 = -1;
                break;
            }
            i2 = indexOfMaxValue(copyOf);
            int i20 = copyOf[i2];
            int length = copyOf2.length;
            for (int i21 = 0; i21 < length; i21++) {
                if (copyOf[i21] != copyOf[i2]) {
                    int i22 = copyOf2[i21];
                    int i23 = copyOf2[i2];
                    if (i22 < i23) {
                        copyOf2[i21] = i23;
                    }
                }
            }
            int findPreviousItemIndex = findPreviousItemIndex(lazyStaggeredGridMeasureContext, i20, i2);
            if (findPreviousItemIndex < 0) {
                lazyLayoutMeasureScope = measureScope;
                str = str2;
                break;
            }
            long m773getSpanRangelOCCd4c = lazyStaggeredGridMeasureContext.m773getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), findPreviousItemIndex, i2);
            int i24 = (int) (4294967295L & m773getSpanRangelOCCd4c);
            androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope2 = measureScope;
            java.lang.String str3 = str2;
            int i25 = (int) (m773getSpanRangelOCCd4c >> 32);
            int i26 = i24 - i25;
            lazyStaggeredGridMeasureContext.getLaneInfo().setLane(findPreviousItemIndex, i26 != 1 ? -2 : i25);
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem m781getAndMeasurejy6DScQ = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m781getAndMeasurejy6DScQ(findPreviousItemIndex, m773getSpanRangelOCCd4c);
            int m776maxInRangejy6DScQ = m776maxInRangejy6DScQ(copyOf2, m773getSpanRangelOCCd4c);
            int[] gaps = i26 != 1 ? lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(findPreviousItemIndex) : null;
            while (i25 < i24) {
                copyOf[i25] = findPreviousItemIndex;
                int sizeWithSpacings = m781getAndMeasurejy6DScQ.getSizeWithSpacings() + m776maxInRangejy6DScQ + (gaps == null ? 0 : gaps[i25]);
                copyOf2[i25] = sizeWithSpacings;
                if (lazyStaggeredGridMeasureContext.getMainAxisAvailableSize() + sizeWithSpacings <= 0) {
                    z4 = true;
                }
                i25++;
            }
            measureScope = lazyLayoutMeasureScope2;
            str2 = str3;
        }
        int i27 = -lazyStaggeredGridMeasureContext.getBeforeContentPadding();
        int i28 = copyOf2[0];
        if (i28 < i27) {
            i18 += i28;
            offsetBy(copyOf2, i27 - i28);
        }
        offsetBy(copyOf2, lazyStaggeredGridMeasureContext.getBeforeContentPadding());
        int i29 = -1;
        if (i2 == -1) {
            i2 = kotlin.collections.ArraysKt.indexOf(copyOf, 0);
        }
        if (i2 != -1 && measure$lambda$38$misalignedStart(copyOf, lazyStaggeredGridMeasureContext, copyOf2, i2) && z) {
            lazyStaggeredGridMeasureContext.getLaneInfo().reset();
            int length2 = copyOf.length;
            int[] iArr14 = new int[length2];
            int i30 = 0;
            while (i30 < length2) {
                iArr14[i30] = i29;
                i30++;
                i29 = -1;
            }
            int length3 = copyOf2.length;
            int[] iArr15 = new int[length3];
            for (int i31 = 0; i31 < length3; i31++) {
                iArr15[i31] = copyOf2[i2];
            }
            return measure(lazyStaggeredGridMeasureContext, i18, iArr14, iArr15, false);
        }
        int[] copyOf3 = java.util.Arrays.copyOf(copyOf, copyOf.length);
        java.lang.String str4 = str;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf3, str4);
        int length4 = copyOf2.length;
        int[] iArr16 = new int[length4];
        for (int i32 = 0; i32 < length4; i32++) {
            iArr16[i32] = -copyOf2[i32];
        }
        int mainAxisSpacing = i27 + lazyStaggeredGridMeasureContext.getMainAxisSpacing();
        int coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(lazyStaggeredGridMeasureContext.getMainAxisAvailableSize() + lazyStaggeredGridMeasureContext.getAfterContentPadding(), 0);
        boolean z5 = z4;
        int indexOfMinValue$default = indexOfMinValue$default(copyOf3, 0, 1, null);
        int i33 = 0;
        while (indexOfMinValue$default != -1 && i33 < lazyStaggeredGridMeasureContext.getLaneCount()) {
            int i34 = copyOf3[indexOfMinValue$default];
            int indexOfMinValue = indexOfMinValue(copyOf3, i34);
            i33++;
            if (i34 >= 0) {
                int i35 = i18;
                long m773getSpanRangelOCCd4c2 = lazyStaggeredGridMeasureContext.m773getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), i34, indexOfMinValue$default);
                androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem m781getAndMeasurejy6DScQ2 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m781getAndMeasurejy6DScQ(i34, m773getSpanRangelOCCd4c2);
                java.lang.String str5 = str4;
                int[] iArr17 = copyOf;
                int[] iArr18 = copyOf2;
                int i36 = (int) (m773getSpanRangelOCCd4c2 & 4294967295L);
                int[] iArr19 = copyOf3;
                int i37 = laneCount;
                int i38 = (int) (m773getSpanRangelOCCd4c2 >> 32);
                int i39 = i36 - i38;
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(i34, i39 != 1 ? -2 : i38);
                int m776maxInRangejy6DScQ2 = m776maxInRangejy6DScQ(iArr16, m773getSpanRangelOCCd4c2);
                for (int i40 = i38; i40 < i36; i40++) {
                    iArr16[i40] = m781getAndMeasurejy6DScQ2.getSizeWithSpacings() + m776maxInRangejy6DScQ2;
                    iArr19[i40] = i34;
                    arrayDequeArr[i40].addLast(m781getAndMeasurejy6DScQ2);
                }
                if (m776maxInRangejy6DScQ2 >= mainAxisSpacing || iArr16[i38] > mainAxisSpacing) {
                    z3 = z5;
                } else {
                    m781getAndMeasurejy6DScQ2.setVisible(false);
                    z3 = true;
                }
                i33 = i39 != 1 ? lazyStaggeredGridMeasureContext.getLaneCount() : i33;
                z5 = z3;
                indexOfMinValue$default = indexOfMinValue;
                i18 = i35;
                str4 = str5;
                copyOf = iArr17;
                copyOf2 = iArr18;
                laneCount = i37;
                copyOf3 = iArr19;
            } else {
                indexOfMinValue$default = indexOfMinValue;
            }
        }
        int i41 = i18;
        int[] iArr20 = copyOf3;
        int i42 = laneCount;
        int[] iArr21 = copyOf;
        int[] iArr22 = copyOf2;
        java.lang.String str6 = str4;
        loop9: while (true) {
            for (int i43 = 0; i43 < length4; i43++) {
                int i44 = iArr16[i43];
                if (i44 < coerceAtLeast || i44 <= 0) {
                    i3 = i42;
                    break;
                }
            }
            i3 = i42;
            for (int i45 = 0; i45 < i3; i45++) {
                if (!arrayDequeArr[i45].isEmpty()) {
                    i4 = 1;
                    break loop9;
                }
            }
            i4 = 1;
            int indexOfMinValue$default2 = indexOfMinValue$default(iArr16, 0, 1, null);
            int maxOrThrow = kotlin.collections.ArraysKt.maxOrThrow(iArr20) + 1;
            if (maxOrThrow >= itemCount) {
                break;
            }
            int i46 = coerceAtLeast;
            int i47 = length4;
            int[] iArr23 = iArr16;
            int i48 = i41;
            int i49 = i3;
            int[] iArr24 = iArr20;
            long m773getSpanRangelOCCd4c3 = lazyStaggeredGridMeasureContext.m773getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), maxOrThrow, indexOfMinValue$default2);
            int i50 = mainAxisSpacing;
            int i51 = (int) (m773getSpanRangelOCCd4c3 & 4294967295L);
            int i52 = (int) (m773getSpanRangelOCCd4c3 >> 32);
            int i53 = i51 - i52;
            lazyStaggeredGridMeasureContext.getLaneInfo().setLane(maxOrThrow, i53 != 1 ? -2 : i52);
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem m781getAndMeasurejy6DScQ3 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m781getAndMeasurejy6DScQ(maxOrThrow, m773getSpanRangelOCCd4c3);
            int m776maxInRangejy6DScQ3 = m776maxInRangejy6DScQ(iArr23, m773getSpanRangelOCCd4c3);
            if (i53 != 1) {
                iArr13 = lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(maxOrThrow);
                if (iArr13 == null) {
                    iArr13 = new int[lazyStaggeredGridMeasureContext.getLaneCount()];
                }
            } else {
                iArr13 = null;
            }
            for (int i54 = i52; i54 < i51; i54++) {
                if (iArr13 != null) {
                    iArr13[i54] = m776maxInRangejy6DScQ3 - iArr23[i54];
                }
                iArr24[i54] = maxOrThrow;
                iArr23[i54] = m776maxInRangejy6DScQ3 + m781getAndMeasurejy6DScQ3.getSizeWithSpacings();
                arrayDequeArr[i54].addLast(m781getAndMeasurejy6DScQ3);
            }
            lazyStaggeredGridMeasureContext.getLaneInfo().setGaps(maxOrThrow, iArr13);
            if (m776maxInRangejy6DScQ3 < i50 && iArr23[i52] <= i50) {
                m781getAndMeasurejy6DScQ3.setVisible(false);
            }
            coerceAtLeast = i46;
            mainAxisSpacing = i50;
            iArr20 = iArr24;
            iArr16 = iArr23;
            i41 = i48;
            i42 = i49;
            length4 = i47;
        }
        int i55 = 0;
        while (i55 < i3) {
            kotlin.collections.ArrayDeque arrayDeque = arrayDequeArr[i55];
            while (arrayDeque.size() > i4 && !((androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) arrayDeque.first()).getIsVisible()) {
                androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) arrayDeque.removeFirst();
                int[] gaps2 = lazyStaggeredGridMeasuredItem.getSpan() != i4 ? lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(lazyStaggeredGridMeasuredItem.getIndex()) : null;
                iArr22[i55] = iArr22[i55] - (lazyStaggeredGridMeasuredItem.getSizeWithSpacings() + (gaps2 == null ? 0 : gaps2[i55]));
                i4 = 1;
            }
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem2 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) arrayDeque.firstOrNull();
            iArr21[i55] = lazyStaggeredGridMeasuredItem2 != null ? lazyStaggeredGridMeasuredItem2.getIndex() : -1;
            i55++;
            i4 = 1;
        }
        int[] iArr25 = iArr20;
        int length5 = iArr25.length;
        int i56 = 0;
        while (true) {
            if (i56 >= length5) {
                break;
            }
            if (iArr25[i56] == itemCount - 1) {
                offsetBy(iArr16, -lazyStaggeredGridMeasureContext.getMainAxisSpacing());
                break;
            }
            i56++;
        }
        int i57 = 0;
        while (true) {
            if (i57 < length4) {
                if (iArr16[i57] >= lazyStaggeredGridMeasureContext.getMainAxisAvailableSize()) {
                    i5 = coerceAtLeast;
                    i6 = i3;
                    iArr4 = iArr25;
                    i7 = length4;
                    iArr6 = iArr16;
                    i9 = i41;
                    iArr5 = iArr21;
                    iArr3 = iArr22;
                    break;
                }
                i57++;
            } else {
                int mainAxisAvailableSize = lazyStaggeredGridMeasureContext.getMainAxisAvailableSize() - iArr16[indexOfMaxValue(iArr16)];
                iArr3 = iArr22;
                offsetBy(iArr3, -mainAxisAvailableSize);
                offsetBy(iArr16, mainAxisAvailableSize);
                boolean z6 = false;
                loop25: while (true) {
                    int length6 = iArr3.length;
                    int i58 = 0;
                    while (true) {
                        if (i58 >= length6) {
                            i5 = coerceAtLeast;
                            i6 = i3;
                            iArr4 = iArr25;
                            i7 = length4;
                            i8 = i41;
                            iArr5 = iArr21;
                            break loop25;
                        }
                        if (iArr3[i58] < lazyStaggeredGridMeasureContext.getBeforeContentPadding()) {
                            break;
                        }
                        i58++;
                        i41 = i41;
                    }
                    coerceAtLeast = i11;
                    iArr21 = iArr7;
                    length4 = i13;
                    iArr16 = iArr9;
                    i3 = i12;
                    iArr25 = iArr8;
                    i41 = i10;
                }
                int[] iArr26 = iArr16;
                if (z6 && z) {
                    lazyStaggeredGridMeasureContext.getLaneInfo().reset();
                    return measure(lazyStaggeredGridMeasureContext, i8, iArr5, iArr3, false);
                }
                int i59 = mainAxisAvailableSize + i8;
                int i60 = iArr3[indexOfMinValue$default(iArr3, 0, 1, null)];
                if (i60 < 0) {
                    i59 += i60;
                    iArr6 = iArr26;
                    offsetBy(iArr6, i60);
                    offsetBy(iArr3, -i60);
                } else {
                    iArr6 = iArr26;
                }
                i9 = i59;
            }
        }
        float scrollToBeConsumed = (kotlin.math.MathKt.getSign(kotlin.math.MathKt.roundToInt(lazyStaggeredGridMeasureContext.getState().getScrollToBeConsumed())) != kotlin.math.MathKt.getSign(i9) || java.lang.Math.abs(kotlin.math.MathKt.roundToInt(lazyStaggeredGridMeasureContext.getState().getScrollToBeConsumed())) < java.lang.Math.abs(i9)) ? lazyStaggeredGridMeasureContext.getState().getScrollToBeConsumed() : i9;
        int[] copyOf4 = java.util.Arrays.copyOf(iArr3, iArr3.length);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf4, str6);
        int length7 = copyOf4.length;
        for (int i61 = 0; i61 < length7; i61++) {
            copyOf4[i61] = -copyOf4[i61];
        }
        if (lazyStaggeredGridMeasureContext.getBeforeContentPadding() > lazyStaggeredGridMeasureContext.getMainAxisSpacing()) {
            int i62 = i6;
            for (int i63 = 0; i63 < i62; i63++) {
                kotlin.collections.ArrayDeque arrayDeque2 = arrayDequeArr[i63];
                int size = arrayDeque2.size();
                int i64 = 0;
                while (i64 < size) {
                    androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem3 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) arrayDeque2.get(i64);
                    int[] gaps3 = lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(lazyStaggeredGridMeasuredItem3.getIndex());
                    int sizeWithSpacings2 = lazyStaggeredGridMeasuredItem3.getSizeWithSpacings() + (gaps3 == null ? 0 : gaps3[i63]);
                    if (i64 != kotlin.collections.CollectionsKt.getLastIndex(arrayDeque2) && (i17 = iArr3[i63]) != 0 && i17 >= sizeWithSpacings2) {
                        iArr3[i63] = i17 - sizeWithSpacings2;
                        i64++;
                        iArr5[i63] = ((androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem) arrayDeque2.get(i64)).getIndex();
                    }
                }
            }
        }
        int beforeContentPadding = lazyStaggeredGridMeasureContext.getBeforeContentPadding() + lazyStaggeredGridMeasureContext.getAfterContentPadding();
        if (lazyStaggeredGridMeasureContext.getIsVertical()) {
            m4438constrainWidthK40F9xA = androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(lazyStaggeredGridMeasureContext.getConstraints());
        } else {
            m4438constrainWidthK40F9xA = androidx.compose.ui.unit.ConstraintsKt.m4438constrainWidthK40F9xA(lazyStaggeredGridMeasureContext.getConstraints(), kotlin.collections.ArraysKt.maxOrThrow(iArr6) + beforeContentPadding);
        }
        if (lazyStaggeredGridMeasureContext.getIsVertical()) {
            m4423getMaxHeightimpl = androidx.compose.ui.unit.ConstraintsKt.m4437constrainHeightK40F9xA(lazyStaggeredGridMeasureContext.getConstraints(), kotlin.collections.ArraysKt.maxOrThrow(iArr6) + beforeContentPadding);
        } else {
            m4423getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(lazyStaggeredGridMeasureContext.getConstraints());
        }
        int min = (java.lang.Math.min(lazyStaggeredGridMeasureContext.getIsVertical() ? m4423getMaxHeightimpl : m4438constrainWidthK40F9xA, lazyStaggeredGridMeasureContext.getMainAxisAvailableSize()) - lazyStaggeredGridMeasureContext.getBeforeContentPadding()) + lazyStaggeredGridMeasureContext.getAfterContentPadding();
        int i65 = copyOf4[0];
        java.util.List<java.lang.Integer> pinnedItems = lazyStaggeredGridMeasureContext.getPinnedItems();
        int size2 = pinnedItems.size() - 1;
        if (size2 >= 0) {
            int i66 = size2;
            int i67 = i65;
            arrayList = null;
            while (true) {
                int i68 = i66 - 1;
                int intValue = pinnedItems.get(i66).intValue();
                java.util.List<java.lang.Integer> list2 = pinnedItems;
                int lane = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(intValue);
                iArr10 = iArr3;
                if (lane == -2 || lane == -1) {
                    int length8 = iArr5.length;
                    int i69 = 0;
                    while (i69 < length8) {
                        int i70 = length8;
                        if (iArr5[i69] <= intValue) {
                            i14 = m4423getMaxHeightimpl;
                            i15 = m4438constrainWidthK40F9xA;
                            break;
                        }
                        i69++;
                        length8 = i70;
                    }
                    i14 = m4423getMaxHeightimpl;
                    i15 = m4438constrainWidthK40F9xA;
                    long m773getSpanRangelOCCd4c4 = lazyStaggeredGridMeasureContext.m773getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), intValue, 0);
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                    }
                    androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem m781getAndMeasurejy6DScQ4 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m781getAndMeasurejy6DScQ(intValue, m773getSpanRangelOCCd4c4);
                    i67 -= m781getAndMeasurejy6DScQ4.getSizeWithSpacings();
                    m781getAndMeasurejy6DScQ4.position(i67, 0, min);
                    arrayList.add(m781getAndMeasurejy6DScQ4);
                }
                if (i68 < 0) {
                    break;
                }
                pinnedItems = list2;
                m4438constrainWidthK40F9xA = i15;
                i66 = i68;
                m4423getMaxHeightimpl = i14;
                iArr3 = iArr10;
            }
        } else {
            i14 = m4423getMaxHeightimpl;
            i15 = m4438constrainWidthK40F9xA;
            iArr10 = iArr3;
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem> calculateVisibleItems = calculateVisibleItems(lazyStaggeredGridMeasureContext, arrayDequeArr, copyOf4, min);
        int i71 = copyOf4[0];
        java.util.List<java.lang.Integer> pinnedItems2 = lazyStaggeredGridMeasureContext.getPinnedItems();
        int size3 = pinnedItems2.size();
        int i72 = 0;
        java.util.ArrayList arrayList2 = null;
        while (i72 < size3) {
            int intValue2 = pinnedItems2.get(i72).intValue();
            if (intValue2 < itemCount) {
                int lane2 = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(intValue2);
                if (lane2 != -2 && lane2 != -1) {
                    if (iArr4[lane2] < intValue2) {
                        list = pinnedItems2;
                        iArr11 = iArr4;
                    }
                } else {
                    iArr11 = iArr4;
                    int length9 = iArr11.length;
                    int i73 = 0;
                    while (i73 < length9) {
                        list = pinnedItems2;
                        if (iArr11[i73] >= intValue2) {
                            i16 = size3;
                            iArr12 = iArr5;
                            break;
                        }
                        i73++;
                        pinnedItems2 = list;
                    }
                    list = pinnedItems2;
                }
                iArr12 = iArr5;
                long m773getSpanRangelOCCd4c5 = lazyStaggeredGridMeasureContext.m773getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), intValue2, 0);
                if (arrayList2 == null) {
                    arrayList2 = new java.util.ArrayList();
                }
                i16 = size3;
                java.util.List list3 = arrayList2;
                androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem m781getAndMeasurejy6DScQ5 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m781getAndMeasurejy6DScQ(intValue2, m773getSpanRangelOCCd4c5);
                m781getAndMeasurejy6DScQ5.position(i71, 0, min);
                i71 += m781getAndMeasurejy6DScQ5.getSizeWithSpacings();
                list3.add(m781getAndMeasurejy6DScQ5);
                arrayList2 = list3;
                i72++;
                pinnedItems2 = list;
                iArr4 = iArr11;
                size3 = i16;
                iArr5 = iArr12;
            }
            list = pinnedItems2;
            iArr11 = iArr4;
            i16 = size3;
            iArr12 = iArr5;
            break;
            i72++;
            pinnedItems2 = list;
            iArr4 = iArr11;
            size3 = i16;
            iArr5 = iArr12;
        }
        int[] iArr27 = iArr5;
        int[] iArr28 = iArr4;
        if (arrayList2 == null) {
            arrayList2 = kotlin.collections.CollectionsKt.emptyList();
        }
        final java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.addAll(arrayList);
        arrayList3.addAll(calculateVisibleItems);
        arrayList3.addAll(arrayList2);
        lazyStaggeredGridMeasureContext.getState().getPlacementAnimator().onMeasured((int) scrollToBeConsumed, i15, i14, arrayList3, lazyStaggeredGridMeasureContext.getMeasuredItemProvider(), lazyStaggeredGridMeasureContext.getIsVertical(), lazyStaggeredGridMeasureContext.getLaneCount(), lazyStaggeredGridMeasureContext.getCoroutineScope());
        int i74 = i7;
        int i75 = 0;
        while (true) {
            if (i75 < i74) {
                if (iArr6[i75] > lazyStaggeredGridMeasureContext.getMainAxisAvailableSize()) {
                    break;
                }
                i75++;
            } else {
                for (int i76 : iArr28) {
                    if (i76 >= itemCount - 1) {
                        z2 = false;
                        break;
                    }
                }
            }
        }
        z2 = true;
        return new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult(iArr27, iArr10, scrollToBeConsumed, androidx.compose.ui.layout.MeasureScope.CC.layout$default(lazyLayoutMeasureScope, i15, i14, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$29
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
                java.util.List<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem> list4 = arrayList3;
                androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext2 = lazyStaggeredGridMeasureContext;
                int size4 = list4.size();
                for (int i77 = 0; i77 < size4; i77++) {
                    list4.get(i77).place(placementScope, lazyStaggeredGridMeasureContext2);
                }
                androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator.m744attachToScopeimpl(lazyStaggeredGridMeasureContext.getState().m784getPlacementScopeInvalidatorzYiylxw$foundation_release());
            }
        }, 4, null), z2, lazyStaggeredGridMeasureContext.getIsVertical(), z5, itemCount, calculateVisibleItems, androidx.compose.ui.unit.IntSizeKt.IntSize(i15, i14), i27, i5, lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisSpacing(), null);
    }

    private static final boolean measure$lambda$38$hasSpaceBeforeFirst(int[] iArr, int[] iArr2, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            if (iArr2[i] < java.lang.Math.max(-lazyStaggeredGridMeasureContext.getMainAxisSpacing(), 0) && i2 > 0) {
                return true;
            }
        }
        return false;
    }

    private static final boolean measure$lambda$38$misalignedStart(int[] iArr, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr2, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i2], i2) == -1 && iArr2[i2] != iArr2[i]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i3 = 0; i3 < length2; i3++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i3], i3) != -1 && iArr2[i3] >= iArr2[i]) {
                return true;
            }
        }
        int lane = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(0);
        return (lane == 0 || lane == -1 || lane == -2) ? false : true;
    }

    private static final java.util.List<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem> calculateVisibleItems(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, kotlin.collections.ArrayDeque<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem>[] arrayDequeArr, int[] iArr, int i) {
        int i2 = 0;
        for (kotlin.collections.ArrayDeque<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem> arrayDeque : arrayDequeArr) {
            i2 += arrayDeque.size();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i2);
        while (true) {
            for (kotlin.collections.ArrayDeque<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem> arrayDeque2 : arrayDequeArr) {
                if (!arrayDeque2.isEmpty()) {
                    int length = arrayDequeArr.length;
                    int i3 = -1;
                    int i4 = Integer.MAX_VALUE;
                    for (int i5 = 0; i5 < length; i5++) {
                        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem firstOrNull = arrayDequeArr[i5].firstOrNull();
                        int index = firstOrNull != null ? firstOrNull.getIndex() : Integer.MAX_VALUE;
                        if (i4 > index) {
                            i3 = i5;
                            i4 = index;
                        }
                    }
                    androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem removeFirst = arrayDequeArr[i3].removeFirst();
                    if (removeFirst.getLane() == i3) {
                        long m786constructorimpl = androidx.compose.foundation.lazy.staggeredgrid.SpanRange.m786constructorimpl(removeFirst.getLane(), removeFirst.getSpan());
                        int m776maxInRangejy6DScQ = m776maxInRangejy6DScQ(iArr, m786constructorimpl);
                        int i6 = lazyStaggeredGridMeasureContext.getResolvedSlots().getPositions()[i3];
                        if (removeFirst.getPlaceablesCount() != 0) {
                            removeFirst.position(m776maxInRangejy6DScQ, i6, i);
                            arrayList.add(removeFirst);
                            int i7 = (int) (m786constructorimpl & 4294967295L);
                            for (int i8 = (int) (m786constructorimpl >> 32); i8 < i7; i8++) {
                                iArr[i8] = removeFirst.getSizeWithSpacings() + m776maxInRangejy6DScQ;
                            }
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    private static final java.util.List<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem> calculateExtraItems(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean> function12, boolean z) {
        java.util.List<java.lang.Integer> pinnedItems = lazyStaggeredGridMeasureContext.getPinnedItems();
        java.util.ArrayList arrayList = null;
        if (z) {
            int size = pinnedItems.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    int intValue = pinnedItems.get(size).intValue();
                    if (function12.invoke(java.lang.Integer.valueOf(intValue)).booleanValue()) {
                        long m773getSpanRangelOCCd4c = lazyStaggeredGridMeasureContext.m773getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), intValue, 0);
                        if (arrayList == null) {
                            arrayList = new java.util.ArrayList();
                        }
                        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem m781getAndMeasurejy6DScQ = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m781getAndMeasurejy6DScQ(intValue, m773getSpanRangelOCCd4c);
                        function1.invoke(m781getAndMeasurejy6DScQ);
                        arrayList.add(m781getAndMeasurejy6DScQ);
                    }
                    if (i < 0) {
                        break;
                    }
                    size = i;
                }
            }
        } else {
            int size2 = pinnedItems.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int intValue2 = pinnedItems.get(i2).intValue();
                if (function12.invoke(java.lang.Integer.valueOf(intValue2)).booleanValue()) {
                    long m773getSpanRangelOCCd4c2 = lazyStaggeredGridMeasureContext.m773getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), intValue2, 0);
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                    }
                    androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem m781getAndMeasurejy6DScQ2 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m781getAndMeasurejy6DScQ(intValue2, m773getSpanRangelOCCd4c2);
                    function1.invoke(m781getAndMeasurejy6DScQ2);
                    arrayList.add(m781getAndMeasurejy6DScQ2);
                }
            }
        }
        return arrayList == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList;
    }

    /* renamed from: forEach-nIS5qE8, reason: not valid java name */
    private static final void m775forEachnIS5qE8(long j, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1) {
        int i = (int) (j & 4294967295L);
        for (int i2 = (int) (j >> 32); i2 < i; i2++) {
            function1.invoke(java.lang.Integer.valueOf(i2));
        }
    }

    private static final void offsetBy(int[] iArr, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = iArr[i2] + i;
        }
    }

    /* renamed from: maxInRange-jy6DScQ, reason: not valid java name */
    private static final int m776maxInRangejy6DScQ(int[] iArr, long j) {
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
            int i5 = i + 1;
            int i6 = iArr[i4];
            if (i5 <= i6 && i6 < i3) {
                i2 = i4;
                i3 = i6;
            }
        }
        return i2;
    }

    private static final <T> int indexOfMinBy(T[] tArr, kotlin.jvm.functions.Function1<? super T, java.lang.Integer> function1) {
        int length = tArr.length;
        int i = -1;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            int intValue = function1.invoke(tArr[i3]).intValue();
            if (i2 > intValue) {
                i = i3;
                i2 = intValue;
            }
        }
        return i;
    }

    private static final int indexOfMaxValue(int[] iArr) {
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

    private static final int[] transform(int[] iArr, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> function1) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = function1.invoke(java.lang.Integer.valueOf(iArr[i])).intValue();
        }
        return iArr;
    }

    private static final void ensureIndicesInRange(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr, int i) {
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
                    iArr[length] = findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[length], length);
                }
            }
            if (iArr[length] >= 0 && !lazyStaggeredGridMeasureContext.isFullSpan(lazyStaggeredGridMeasureContext.getItemProvider(), iArr[length])) {
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[length], length);
            }
            if (i2 < 0) {
                return;
            } else {
                length = i2;
            }
        }
    }

    private static final int findPreviousItemIndex(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i, int i2) {
        return lazyStaggeredGridMeasureContext.getLaneInfo().findPreviousItemIndex(i, i2);
    }

    private static final <T> void fastForEach(java.util.List<? extends T> list, boolean z, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        if (z) {
            int size = list.size() - 1;
            if (size < 0) {
                return;
            }
            while (true) {
                int i = size - 1;
                function1.invoke(list.get(size));
                if (i < 0) {
                    return;
                } else {
                    size = i;
                }
            }
        } else {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                function1.invoke(list.get(i2));
            }
        }
    }

    static /* synthetic */ void fastForEach$default(java.util.List list, boolean z, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if (z) {
            int size = list.size() - 1;
            if (size < 0) {
                return;
            }
            while (true) {
                int i2 = size - 1;
                function1.invoke(list.get(size));
                if (i2 < 0) {
                    return;
                } else {
                    size = i2;
                }
            }
        } else {
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                function1.invoke(list.get(i3));
            }
        }
    }
}
