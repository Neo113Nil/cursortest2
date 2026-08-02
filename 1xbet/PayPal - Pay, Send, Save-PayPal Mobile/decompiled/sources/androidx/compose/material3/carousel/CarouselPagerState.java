package androidx.compose.material3.carousel;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tR.\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\n8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/compose/material3/carousel/CarouselPagerState;", "Landroidx/compose/foundation/pager/PagerState;", "", "currentPage", "", "currentPageOffsetFraction", "Lkotlin/Function0;", "updatedPageCount", "<init>", "(IFLkotlin/jvm/functions/Function0;)V", "Landroidx/compose/runtime/MutableState;", "pageCountState", "Landroidx/compose/runtime/MutableState;", "getPageCountState", "()Landroidx/compose/runtime/MutableState;", "setPageCountState", "(Landroidx/compose/runtime/MutableState;)V", "getPageCount", "()I", "pageCount", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CarouselPagerState extends androidx.compose.foundation.pager.PagerState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.material3.carousel.CarouselPagerState.Companion INSTANCE = new androidx.compose.material3.carousel.CarouselPagerState.Companion(null);
    private static final androidx.compose.runtime.saveable.Saver<androidx.compose.material3.carousel.CarouselPagerState, ?> Saver = androidx.compose.runtime.saveable.ListSaverKt.listSaver(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.carousel.CarouselPagerState$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return androidx.compose.material3.carousel.CarouselPagerState.$r8$lambda$YXuhrA1pB7iFY31dSLDDSpJEiB8((androidx.compose.runtime.saveable.SaverScope) obj, (androidx.compose.material3.carousel.CarouselPagerState) obj2);
        }
    }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.carousel.CarouselPagerState$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return androidx.compose.material3.carousel.CarouselPagerState.$r8$lambda$jgH2iGWJoVyeqLxPAMBxXNtOxmk((java.util.List) obj);
        }
    });
    private androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<java.lang.Integer>> pageCountState;

    public CarouselPagerState(int i, float f, kotlin.jvm.functions.Function0<java.lang.Integer> function0) {
        super(i, f);
        this.pageCountState = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(function0, null, 2, null);
    }

    public final androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<java.lang.Integer>> getPageCountState() {
        return this.pageCountState;
    }

    public final void setPageCountState(androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<java.lang.Integer>> mutableState) {
        this.pageCountState = mutableState;
    }

    @Override // androidx.compose.foundation.pager.PagerState
    public final int getPageCount() {
        return this.pageCountState.getValue().invoke().intValue();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/material3/carousel/CarouselPagerState$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/carousel/CarouselPagerState;", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.runtime.saveable.Saver<androidx.compose.material3.carousel.CarouselPagerState, ?> getSaver() {
            return androidx.compose.material3.carousel.CarouselPagerState.Saver;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ int $r8$lambda$3sRwBCpP8rEToYkbtY1mBYkm1H0(java.util.List list) {
        java.lang.Object obj = list.get(2);
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        return ((java.lang.Integer) obj).intValue();
    }

    public static /* synthetic */ java.util.List $r8$lambda$YXuhrA1pB7iFY31dSLDDSpJEiB8(androidx.compose.runtime.saveable.SaverScope saverScope, androidx.compose.material3.carousel.CarouselPagerState carouselPagerState) {
        int currentPage = carouselPagerState.getCurrentPage();
        float coerceIn = kotlin.ranges.RangesKt.coerceIn(carouselPagerState.getCurrentPageOffsetFraction(), -0.5f, 0.5f);
        return kotlin.collections.CollectionsKt.listOf(java.lang.Integer.valueOf(currentPage), java.lang.Float.valueOf(coerceIn), carouselPagerState.pageCountState.getValue());
    }

    public static /* synthetic */ androidx.compose.material3.carousel.CarouselPagerState $r8$lambda$jgH2iGWJoVyeqLxPAMBxXNtOxmk(final java.util.List list) {
        java.lang.Object obj = list.get(0);
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        int intValue = ((java.lang.Integer) obj).intValue();
        java.lang.Object obj2 = list.get(1);
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
        return new androidx.compose.material3.carousel.CarouselPagerState(intValue, ((java.lang.Float) obj2).floatValue(), new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.carousel.CarouselPagerState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(androidx.compose.material3.carousel.CarouselPagerState.$r8$lambda$3sRwBCpP8rEToYkbtY1mBYkm1H0(list));
            }
        });
    }
}
