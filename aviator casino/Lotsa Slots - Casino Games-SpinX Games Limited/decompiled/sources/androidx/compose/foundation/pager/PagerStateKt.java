package androidx.compose.foundation.pager;

/* compiled from: PagerState.kt */
@kotlin.Metadata(d1 = {"\u0000W\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007*\u0001\u0016\u001a\u0017\u0010\u001e\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H\u0082\b\u001a/\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u000e2\b\b\u0002\u0010&\u001a\u00020'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000e0!H\u0007¢\u0006\u0002\u0010)\u001a\u0012\u0010*\u001a\u00020\u001f*\u00020$H\u0080@¢\u0006\u0002\u0010+\u001a\u0012\u0010,\u001a\u00020\u001f*\u00020$H\u0080@¢\u0006\u0002\u0010+\u001a\u0014\u0010-\u001a\u00020\u000e*\u00020\b2\u0006\u0010(\u001a\u00020\u000eH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u001a\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u000eX\u0080T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0010\u001a\u00020\u0011X\u0080\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\n\u001a\u0004\b\u0013\u0010\u0014\"\u0010\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0017\"\u001e\u0010\u0018\u001a\u00020\u000e*\u00020\u00198BX\u0082\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006."}, d2 = {"DEBUG", "", "DefaultPositionThreshold", "Landroidx/compose/ui/unit/Dp;", "getDefaultPositionThreshold", "()F", "F", "EmptyLayoutInfo", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "getEmptyLayoutInfo$annotations", "()V", "getEmptyLayoutInfo", "()Landroidx/compose/foundation/pager/PagerMeasureResult;", "MaxPagesForAnimateScroll", "", "PagesToPrefetch", "SnapAlignmentStartToStart", "Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;", "getSnapAlignmentStartToStart$annotations", "getSnapAlignmentStartToStart", "()Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;", "UnitDensity", "androidx/compose/foundation/pager/PagerStateKt$UnitDensity$1", "Landroidx/compose/foundation/pager/PagerStateKt$UnitDensity$1;", "singleAxisViewPort", "Landroidx/compose/foundation/pager/PagerLayoutInfo;", "getSingleAxisViewPort$annotations", "(Landroidx/compose/foundation/pager/PagerLayoutInfo;)V", "getSingleAxisViewPort", "(Landroidx/compose/foundation/pager/PagerLayoutInfo;)I", "debugLog", "", "generateMsg", "Lkotlin/Function0;", "", "rememberPagerState", "Landroidx/compose/foundation/pager/PagerState;", "initialPage", "initialPageOffsetFraction", "", "pageCount", "(IFLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/pager/PagerState;", "animateToNextPage", "(Landroidx/compose/foundation/pager/PagerState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateToPreviousPage", "calculateNewMaxScrollOffset", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PagerStateKt {
    private static final boolean DEBUG = false;
    private static final int MaxPagesForAnimateScroll = 3;
    public static final int PagesToPrefetch = 1;
    private static final float DefaultPositionThreshold = androidx.compose.ui.unit.Dp.m4478constructorimpl(56);
    private static final androidx.compose.foundation.pager.PagerMeasureResult EmptyLayoutInfo = new androidx.compose.foundation.pager.PagerMeasureResult(kotlin.collections.CollectionsKt.emptyList(), 0, 0, 0, androidx.compose.foundation.gestures.Orientation.Horizontal, 0, 0, false, 0, null, null, 0.0f, 0, false, new androidx.compose.ui.layout.MeasureResult() { // from class: androidx.compose.foundation.pager.PagerStateKt$EmptyLayoutInfo$1
        private final java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> alignmentLines = kotlin.collections.MapsKt.emptyMap();
        private final int height;
        private final int width;

        public static /* synthetic */ void getAlignmentLines$annotations() {
        }

        @Override // androidx.compose.ui.layout.MeasureResult
        public void placeChildren() {
        }

        @Override // androidx.compose.ui.layout.MeasureResult
        public int getWidth() {
            return this.width;
        }

        @Override // androidx.compose.ui.layout.MeasureResult
        public int getHeight() {
            return this.height;
        }

        @Override // androidx.compose.ui.layout.MeasureResult
        public java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> getAlignmentLines() {
            return this.alignmentLines;
        }
    }, false);
    private static final androidx.compose.foundation.pager.PagerStateKt$UnitDensity$1 UnitDensity = new androidx.compose.ui.unit.Density() { // from class: androidx.compose.foundation.pager.PagerStateKt$UnitDensity$1
        private final float density = 1.0f;
        private final float fontScale = 1.0f;

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx--R2X_6o */
        public /* synthetic */ int mo308roundToPxR2X_6o(long j) {
            return androidx.compose.ui.unit.Density.CC.m4442$default$roundToPxR2X_6o(this, j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx-0680j_4 */
        public /* synthetic */ int mo309roundToPx0680j_4(float f) {
            return androidx.compose.ui.unit.Density.CC.m4443$default$roundToPx0680j_4(this, f);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: toDp-GaN1DYA */
        public /* synthetic */ float mo310toDpGaN1DYA(long j) {
            return androidx.compose.ui.unit.FontScaling.CC.m4587$default$toDpGaN1DYA(this, j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public /* synthetic */ float mo311toDpu2uoSUM(float f) {
            return androidx.compose.ui.unit.Density.CC.m4444$default$toDpu2uoSUM(this, f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public /* synthetic */ float mo312toDpu2uoSUM(int i) {
            return androidx.compose.ui.unit.Density.CC.m4445$default$toDpu2uoSUM((androidx.compose.ui.unit.Density) this, i);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDpSize-k-rfVVM */
        public /* synthetic */ long mo313toDpSizekrfVVM(long j) {
            return androidx.compose.ui.unit.Density.CC.m4446$default$toDpSizekrfVVM(this, j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx--R2X_6o */
        public /* synthetic */ float mo314toPxR2X_6o(long j) {
            return androidx.compose.ui.unit.Density.CC.m4447$default$toPxR2X_6o(this, j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx-0680j_4 */
        public /* synthetic */ float mo315toPx0680j_4(float f) {
            return androidx.compose.ui.unit.Density.CC.m4448$default$toPx0680j_4(this, f);
        }

        @Override // androidx.compose.ui.unit.Density
        public /* synthetic */ androidx.compose.ui.geometry.Rect toRect(androidx.compose.ui.unit.DpRect dpRect) {
            return androidx.compose.ui.unit.Density.CC.$default$toRect(this, dpRect);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSize-XkaWNTQ */
        public /* synthetic */ long mo316toSizeXkaWNTQ(long j) {
            return androidx.compose.ui.unit.Density.CC.m4449$default$toSizeXkaWNTQ(this, j);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: toSp-0xMU5do */
        public /* synthetic */ long mo317toSp0xMU5do(float f) {
            return androidx.compose.ui.unit.FontScaling.CC.m4588$default$toSp0xMU5do(this, f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public /* synthetic */ long mo318toSpkPz2Gy4(float f) {
            return androidx.compose.ui.unit.Density.CC.m4450$default$toSpkPz2Gy4(this, f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public /* synthetic */ long mo319toSpkPz2Gy4(int i) {
            return androidx.compose.ui.unit.Density.CC.m4451$default$toSpkPz2Gy4((androidx.compose.ui.unit.Density) this, i);
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.density;
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return this.fontScale;
        }
    };
    private static final androidx.compose.foundation.gestures.snapping.SnapPositionInLayout SnapAlignmentStartToStart = new androidx.compose.foundation.gestures.snapping.SnapPositionInLayout() { // from class: androidx.compose.foundation.pager.PagerStateKt$$ExternalSyntheticLambda0
        @Override // androidx.compose.foundation.gestures.snapping.SnapPositionInLayout
        public final int position(int i, int i2, int i3, int i4, int i5) {
            int SnapAlignmentStartToStart$lambda$2;
            SnapAlignmentStartToStart$lambda$2 = androidx.compose.foundation.pager.PagerStateKt.SnapAlignmentStartToStart$lambda$2(i, i2, i3, i4, i5);
            return SnapAlignmentStartToStart$lambda$2;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final int SnapAlignmentStartToStart$lambda$2(int i, int i2, int i3, int i4, int i5) {
        return 0;
    }

    private static final void debugLog(kotlin.jvm.functions.Function0<java.lang.String> function0) {
    }

    public static /* synthetic */ void getEmptyLayoutInfo$annotations() {
    }

    private static /* synthetic */ void getSingleAxisViewPort$annotations(androidx.compose.foundation.pager.PagerLayoutInfo pagerLayoutInfo) {
    }

    public static /* synthetic */ void getSnapAlignmentStartToStart$annotations() {
    }

    public static final androidx.compose.foundation.pager.PagerState rememberPagerState(final int i, final float f, final kotlin.jvm.functions.Function0<java.lang.Integer> function0, androidx.compose.runtime.Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1210768637);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberPagerState)*80@3537L174:PagerState.kt#g6yjnt");
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            f = 0.0f;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1210768637, i2, -1, "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:79)");
        }
        java.lang.Object[] objArr = new java.lang.Object[0];
        androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.pager.PagerStateImpl, ?> saver = androidx.compose.foundation.pager.PagerStateImpl.INSTANCE.getSaver();
        composer.startReplaceableGroup(-382513842);
        boolean changed = composer.changed(i) | composer.changed(f) | composer.changedInstance(function0);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<androidx.compose.foundation.pager.PagerStateImpl>() { // from class: androidx.compose.foundation.pager.PagerStateKt$rememberPagerState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final androidx.compose.foundation.pager.PagerStateImpl invoke() {
                    return new androidx.compose.foundation.pager.PagerStateImpl(i, f, function0);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        androidx.compose.foundation.pager.PagerStateImpl pagerStateImpl = (androidx.compose.foundation.pager.PagerStateImpl) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(objArr, (androidx.compose.runtime.saveable.Saver) saver, (java.lang.String) null, (kotlin.jvm.functions.Function0) rememberedValue, composer, 72, 4);
        pagerStateImpl.getPageCountState().setValue(function0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pagerStateImpl;
    }

    public static final java.lang.Object animateToNextPage(androidx.compose.foundation.pager.PagerState pagerState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (pagerState.getCurrentPage() + 1 >= pagerState.getPageCount()) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object animateScrollToPage$default = androidx.compose.foundation.pager.PagerState.animateScrollToPage$default(pagerState, pagerState.getCurrentPage() + 1, 0.0f, null, continuation, 6, null);
        return animateScrollToPage$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateScrollToPage$default : kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object animateToPreviousPage(androidx.compose.foundation.pager.PagerState pagerState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (pagerState.getCurrentPage() - 1 < 0) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object animateScrollToPage$default = androidx.compose.foundation.pager.PagerState.animateScrollToPage$default(pagerState, pagerState.getCurrentPage() - 1, 0.0f, null, continuation, 6, null);
        return animateScrollToPage$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateScrollToPage$default : kotlin.Unit.INSTANCE;
    }

    public static final float getDefaultPositionThreshold() {
        return DefaultPositionThreshold;
    }

    public static final androidx.compose.foundation.pager.PagerMeasureResult getEmptyLayoutInfo() {
        return EmptyLayoutInfo;
    }

    public static final androidx.compose.foundation.gestures.snapping.SnapPositionInLayout getSnapAlignmentStartToStart() {
        return SnapAlignmentStartToStart;
    }

    private static final int getSingleAxisViewPort(androidx.compose.foundation.pager.PagerLayoutInfo pagerLayoutInfo) {
        return pagerLayoutInfo.getOrientation() == androidx.compose.foundation.gestures.Orientation.Vertical ? androidx.compose.ui.unit.IntSize.m4651getHeightimpl(pagerLayoutInfo.mo806getViewportSizeYbymL2g()) : androidx.compose.ui.unit.IntSize.m4652getWidthimpl(pagerLayoutInfo.mo806getViewportSizeYbymL2g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int calculateNewMaxScrollOffset(androidx.compose.foundation.pager.PagerMeasureResult pagerMeasureResult, int i) {
        return kotlin.ranges.RangesKt.coerceAtLeast((((pagerMeasureResult.getBeforeContentPadding() + (i * (pagerMeasureResult.getPageSpacing() + pagerMeasureResult.getPageSize()))) + pagerMeasureResult.getAfterContentPadding()) - pagerMeasureResult.getPageSpacing()) - getSingleAxisViewPort(pagerMeasureResult), 0);
    }
}
