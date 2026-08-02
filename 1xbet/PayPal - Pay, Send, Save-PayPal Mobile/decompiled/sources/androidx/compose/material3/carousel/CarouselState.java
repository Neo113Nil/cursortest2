package androidx.compose.material3.carousel;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 +2\u00020\u0001:\u0001+B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJA\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2'\u0010\u0015\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000f¢\u0006\u0002\b\u0014H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00022\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001bH\u0086@¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u00020\u001f8\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010\u0003\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b)\u0010*"}, d2 = {"Landroidx/compose/material3/carousel/CarouselState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "", "currentItem", "", "currentItemOffsetFraction", "Lkotlin/Function0;", "itemCount", "<init>", "(IFLkotlin/jvm/functions/Function0;)V", "delta", "dispatchRawDelta", "(F)F", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "item", "scrollToItem", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "animateScrollToItem", "(ILandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/material3/carousel/CarouselPagerState;", "pagerState", "Landroidx/compose/material3/carousel/CarouselPagerState;", "getPagerState$material3", "()Landroidx/compose/material3/carousel/CarouselPagerState;", "setPagerState$material3", "(Landroidx/compose/material3/carousel/CarouselPagerState;)V", "", "isScrollInProgress", "()Z", "getCurrentItem", "()I", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CarouselState implements androidx.compose.foundation.gestures.ScrollableState {
    private androidx.compose.material3.carousel.CarouselPagerState pagerState;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.material3.carousel.CarouselState.Companion INSTANCE = new androidx.compose.material3.carousel.CarouselState.Companion(null);
    public static final int $stable = 8;
    private static final androidx.compose.runtime.saveable.Saver<androidx.compose.material3.carousel.CarouselState, ?> Saver = androidx.compose.runtime.saveable.ListSaverKt.listSaver(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.carousel.CarouselState$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            java.util.List listOf;
            listOf = kotlin.collections.CollectionsKt.listOf(java.lang.Integer.valueOf(r2.pagerState.getCurrentPage()), java.lang.Float.valueOf(r2.pagerState.getCurrentPageOffsetFraction()), java.lang.Integer.valueOf(((androidx.compose.material3.carousel.CarouselState) obj2).pagerState.getPageCount()));
            return listOf;
        }
    }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.carousel.CarouselState$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return androidx.compose.material3.carousel.CarouselState.$r8$lambda$0UMK9YaGLyK6KF9F9XNVzDbkUL0((java.util.List) obj);
        }
    });

    public CarouselState(int i, float f, kotlin.jvm.functions.Function0<java.lang.Integer> function0) {
        this.pagerState = new androidx.compose.material3.carousel.CarouselPagerState(i, f, function0);
    }

    public /* synthetic */ CarouselState(int i, float f, kotlin.jvm.functions.Function0 function0, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0.0f : f, function0);
    }

    /* renamed from: getPagerState$material3, reason: from getter */
    public final androidx.compose.material3.carousel.CarouselPagerState getPagerState() {
        return this.pagerState;
    }

    public final void setPagerState$material3(androidx.compose.material3.carousel.CarouselPagerState carouselPagerState) {
        this.pagerState = carouselPagerState;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean isScrollInProgress() {
        return this.pagerState.isScrollInProgress();
    }

    public final int getCurrentItem() {
        return this.pagerState.getCurrentPage();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final float dispatchRawDelta(float delta) {
        return this.pagerState.dispatchRawDelta(delta);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final java.lang.Object scroll(androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.ScrollScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object scroll = this.pagerState.scroll(mutatePriority, function2, continuation);
        return scroll == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scroll : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object scrollToItem(int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object scrollToPage = this.pagerState.scrollToPage(i, 0.0f, continuation);
        return scrollToPage == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scrollToPage : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object animateScrollToItem$default(androidx.compose.material3.carousel.CarouselState carouselState, int i, androidx.compose.animation.core.AnimationSpec animationSpec, kotlin.coroutines.Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            animationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return carouselState.animateScrollToItem(i, animationSpec, continuation);
    }

    public final java.lang.Object animateScrollToItem(int i, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.material3.carousel.CarouselPagerState carouselPagerState = this.pagerState;
        if ((i == carouselPagerState.getCurrentPage() && carouselPagerState.getCurrentPageOffsetFraction() == 0.0f) || carouselPagerState.getPageCount() == 0) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object scroll$default = androidx.compose.foundation.gestures.ScrollableState.scroll$default(carouselPagerState, null, new androidx.compose.material3.carousel.CarouselState$animateScrollToItem$2$1(carouselPagerState, carouselPagerState.getPageCount() > 0 ? kotlin.ranges.RangesKt.coerceIn(i, 0, carouselPagerState.getPageCount() - 1) : 0, animationSpec, null), continuation, 1, null);
        return scroll$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scroll$default : kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/material3/carousel/CarouselState$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/carousel/CarouselState;", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.runtime.saveable.Saver<androidx.compose.material3.carousel.CarouselState, ?> getSaver() {
            return androidx.compose.material3.carousel.CarouselState.Saver;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ androidx.compose.material3.carousel.CarouselState $r8$lambda$0UMK9YaGLyK6KF9F9XNVzDbkUL0(final java.util.List list) {
        java.lang.Object obj = list.get(0);
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        int intValue = ((java.lang.Integer) obj).intValue();
        java.lang.Object obj2 = list.get(1);
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
        return new androidx.compose.material3.carousel.CarouselState(intValue, ((java.lang.Float) obj2).floatValue(), new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.carousel.CarouselState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(androidx.compose.material3.carousel.CarouselState.m4261$r8$lambda$0XXtSuHGzshYbB9KIlSjiJKNE8(list));
            }
        });
    }

    /* renamed from: $r8$lambda$0XXtSuHGzsh-YbB9KIlSjiJKNE8, reason: not valid java name */
    public static /* synthetic */ int m4261$r8$lambda$0XXtSuHGzshYbB9KIlSjiJKNE8(java.util.List list) {
        java.lang.Object obj = list.get(2);
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        return ((java.lang.Integer) obj).intValue();
    }
}
