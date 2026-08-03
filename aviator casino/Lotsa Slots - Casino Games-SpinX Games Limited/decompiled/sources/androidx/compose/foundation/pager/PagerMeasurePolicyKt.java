package androidx.compose.foundation.pager;

/* compiled from: PagerMeasurePolicy.kt */
@kotlin.Metadata(d1 = {"\u0000n\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0082\b\u001a\u0099\u0001\u0010\u0007\u001a\u0019\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0002\b\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00170\u0005H\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u0014\u0010%\u001a\u00020\u0017*\u00020\u00102\u0006\u0010&\u001a\u00020\u0017H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"DEBUG", "", "debugLog", "", "generateMsg", "Lkotlin/Function0;", "", "rememberPagerMeasurePolicy", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "itemProviderLambda", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "state", "Landroidx/compose/foundation/pager/PagerState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "beyondBoundsPageCount", "", "pageSpacing", "Landroidx/compose/ui/unit/Dp;", "pageSize", "Landroidx/compose/foundation/pager/PageSize;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "snapPositionInLayout", "Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;", "pageCount", "rememberPagerMeasurePolicy-121YqSk", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;IFLandroidx/compose/foundation/pager/PageSize;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;", "calculateCurrentPageLayoutOffset", "pageSizeWithSpacing", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PagerMeasurePolicyKt {
    private static final boolean DEBUG = false;

    private static final void debugLog(kotlin.jvm.functions.Function0<java.lang.String> function0) {
    }

    /* renamed from: rememberPagerMeasurePolicy-121YqSk, reason: not valid java name */
    public static final kotlin.jvm.functions.Function2<androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult> m810rememberPagerMeasurePolicy121YqSk(final kotlin.jvm.functions.Function0<androidx.compose.foundation.pager.PagerLazyLayoutItemProvider> function0, final androidx.compose.foundation.pager.PagerState pagerState, final androidx.compose.foundation.layout.PaddingValues paddingValues, final boolean z, final androidx.compose.foundation.gestures.Orientation orientation, final int i, final float f, final androidx.compose.foundation.pager.PageSize pageSize, final androidx.compose.ui.Alignment.Horizontal horizontal, final androidx.compose.ui.Alignment.Vertical vertical, final androidx.compose.foundation.gestures.snapping.SnapPositionInLayout snapPositionInLayout, final kotlin.jvm.functions.Function0<java.lang.Integer> function02, androidx.compose.runtime.Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1615726010);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberPagerMeasurePolicy)P(3,10,1,8,4!1,7:c#ui.unit.Dp,6!1,11,9)56@2324L5682:PagerMeasurePolicy.kt#g6yjnt");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1615726010, i2, i3, "androidx.compose.foundation.pager.rememberPagerMeasurePolicy (PagerMeasurePolicy.kt:56)");
        }
        java.lang.Object[] objArr = {pagerState, paddingValues, java.lang.Boolean.valueOf(z), orientation, horizontal, vertical, androidx.compose.ui.unit.Dp.m4476boximpl(f), pageSize, snapPositionInLayout, function02};
        composer.startReplaceableGroup(-568225417);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean z2 = false;
        for (int i4 = 0; i4 < 10; i4++) {
            z2 |= composer.changed(objArr[i4]);
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.foundation.pager.PagerMeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ androidx.compose.foundation.pager.PagerMeasureResult invoke(androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope, androidx.compose.ui.unit.Constraints constraints) {
                    return m811invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                }

                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final androidx.compose.foundation.pager.PagerMeasureResult m811invoke0kLqBqw(final androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                    int i5;
                    int i6;
                    int i7;
                    int m4424getMaxWidthimpl;
                    long IntOffset;
                    boolean z3 = androidx.compose.foundation.gestures.Orientation.this == androidx.compose.foundation.gestures.Orientation.Vertical;
                    androidx.compose.foundation.CheckScrollableContainerConstraintsKt.m240checkScrollableContainerConstraintsK40F9xA(j, z3 ? androidx.compose.foundation.gestures.Orientation.Vertical : androidx.compose.foundation.gestures.Orientation.Horizontal);
                    if (z3) {
                        i5 = lazyLayoutMeasureScope.mo309roundToPx0680j_4(paddingValues.mo519calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        i5 = lazyLayoutMeasureScope.mo309roundToPx0680j_4(androidx.compose.foundation.layout.PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    if (z3) {
                        i6 = lazyLayoutMeasureScope.mo309roundToPx0680j_4(paddingValues.mo520calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        i6 = lazyLayoutMeasureScope.mo309roundToPx0680j_4(androidx.compose.foundation.layout.PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    int i8 = lazyLayoutMeasureScope.mo309roundToPx0680j_4(paddingValues.getTop());
                    int i9 = lazyLayoutMeasureScope.mo309roundToPx0680j_4(paddingValues.getBottom());
                    final int i10 = i8 + i9;
                    final int i11 = i5 + i6;
                    int i12 = z3 ? i10 : i11;
                    if (z3 && !z) {
                        i7 = i8;
                    } else if (z3 && z) {
                        i7 = i9;
                    } else {
                        i7 = (z3 || z) ? i6 : i5;
                    }
                    int i13 = i12 - i7;
                    long m4440offsetNN6EwU = androidx.compose.ui.unit.ConstraintsKt.m4440offsetNN6EwU(j, -i11, -i10);
                    androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                    pagerState.setDensity$foundation_release(lazyLayoutMeasureScope2);
                    int i14 = lazyLayoutMeasureScope.mo309roundToPx0680j_4(f);
                    if (z3) {
                        m4424getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j) - i10;
                    } else {
                        m4424getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j) - i11;
                    }
                    if (!z || m4424getMaxWidthimpl > 0) {
                        IntOffset = androidx.compose.ui.unit.IntOffsetKt.IntOffset(i5, i8);
                    } else {
                        if (!z3) {
                            i5 += m4424getMaxWidthimpl;
                        }
                        if (z3) {
                            i8 += m4424getMaxWidthimpl;
                        }
                        IntOffset = androidx.compose.ui.unit.IntOffsetKt.IntOffset(i5, i8);
                    }
                    long j2 = IntOffset;
                    int calculateMainAxisPageSize = pageSize.calculateMainAxisPageSize(lazyLayoutMeasureScope2, m4424getMaxWidthimpl, i14);
                    pagerState.m815setPremeasureConstraintsBRTryo0$foundation_release(androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, androidx.compose.foundation.gestures.Orientation.this == androidx.compose.foundation.gestures.Orientation.Vertical ? androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(m4440offsetNN6EwU) : calculateMainAxisPageSize, 0, androidx.compose.foundation.gestures.Orientation.this != androidx.compose.foundation.gestures.Orientation.Vertical ? androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(m4440offsetNN6EwU) : calculateMainAxisPageSize, 5, null));
                    androidx.compose.foundation.pager.PagerLazyLayoutItemProvider invoke = function0.invoke();
                    int i15 = calculateMainAxisPageSize + i14;
                    androidx.compose.runtime.snapshots.Snapshot.Companion companion = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
                    androidx.compose.foundation.pager.PagerState pagerState2 = pagerState;
                    androidx.compose.runtime.snapshots.Snapshot createNonObservableSnapshot = companion.createNonObservableSnapshot();
                    try {
                        androidx.compose.runtime.snapshots.Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                        try {
                            int matchScrollPositionWithKey$foundation_release = pagerState2.matchScrollPositionWithKey$foundation_release(invoke, pagerState2.getCurrentPage());
                            int calculateCurrentPageLayoutOffset = androidx.compose.foundation.pager.PagerMeasurePolicyKt.calculateCurrentPageLayoutOffset(pagerState2, i15);
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            createNonObservableSnapshot.dispose();
                            int i16 = m4424getMaxWidthimpl;
                            androidx.compose.foundation.pager.PagerMeasureResult m809measurePager_JDW0YA = androidx.compose.foundation.pager.PagerMeasureKt.m809measurePager_JDW0YA(lazyLayoutMeasureScope, function02.invoke().intValue(), invoke, i16, i7, i13, i14, matchScrollPositionWithKey$foundation_release, calculateCurrentPageLayoutOffset, m4440offsetNN6EwU, androidx.compose.foundation.gestures.Orientation.this, vertical, horizontal, z, j2, calculateMainAxisPageSize, i, androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, pagerState.getPinnedPages(), pagerState.getBeyondBoundsInfo()), snapPositionInLayout, pagerState.m812getPlacementScopeInvalidatorzYiylxw$foundation_release(), new kotlin.jvm.functions.Function3<java.lang.Integer, java.lang.Integer, kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable.PlacementScope, ? extends kotlin.Unit>, androidx.compose.ui.layout.MeasureResult>() { // from class: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ androidx.compose.ui.layout.MeasureResult invoke(java.lang.Integer num, java.lang.Integer num2, kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable.PlacementScope, ? extends kotlin.Unit> function1) {
                                    return invoke(num.intValue(), num2.intValue(), (kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>) function1);
                                }

                                public final androidx.compose.ui.layout.MeasureResult invoke(int i17, int i18, kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit> function1) {
                                    return androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope.this.layout(androidx.compose.ui.unit.ConstraintsKt.m4438constrainWidthK40F9xA(j, i17 + i11), androidx.compose.ui.unit.ConstraintsKt.m4437constrainHeightK40F9xA(j, i18 + i10), kotlin.collections.MapsKt.emptyMap(), function1);
                                }
                            });
                            androidx.compose.foundation.pager.PagerState.applyMeasureResult$foundation_release$default(pagerState, m809measurePager_JDW0YA, false, 2, null);
                            return m809measurePager_JDW0YA;
                        } finally {
                            createNonObservableSnapshot.restoreCurrent(makeCurrent);
                        }
                    } catch (java.lang.Throwable th) {
                        createNonObservableSnapshot.dispose();
                        throw th;
                    }
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        kotlin.jvm.functions.Function2<androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult> function2 = (kotlin.jvm.functions.Function2) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function2;
    }

    public static final int calculateCurrentPageLayoutOffset(androidx.compose.foundation.pager.PagerState pagerState, int i) {
        androidx.compose.foundation.pager.PageInfo pageInfo;
        java.util.List<androidx.compose.foundation.pager.PageInfo> visiblePagesInfo = pagerState.getLayoutInfo().getVisiblePagesInfo();
        int size = visiblePagesInfo.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                pageInfo = null;
                break;
            }
            pageInfo = visiblePagesInfo.get(i2);
            if (pageInfo.getIndex() == pagerState.getCurrentPage()) {
                break;
            }
            i2++;
        }
        androidx.compose.foundation.pager.PageInfo pageInfo2 = pageInfo;
        int offset = pageInfo2 != null ? pageInfo2.getOffset() : 0;
        return -kotlin.math.MathKt.roundToInt(((pagerState.getCurrentPageOffsetFraction() - (i == 0 ? pagerState.getCurrentPageOffsetFraction() : (-offset) / i)) * i) - offset);
    }
}
