package androidx.compose.foundation.pager;

/* compiled from: PagerState.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.pager.PagerState$animateScrollToPage$3$1", f = "PagerState.kt", i = {}, l = {552}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class PagerState$animateScrollToPage$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.foundation.gestures.ScrollScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.animation.core.AnimationSpec<java.lang.Float> $animationSpec;
    final /* synthetic */ int $targetPage;
    final /* synthetic */ int $targetPageOffsetToSnappedPosition;
    final /* synthetic */ androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope $this_with;
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ androidx.compose.foundation.pager.PagerState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PagerState$animateScrollToPage$3$1(androidx.compose.foundation.pager.PagerState pagerState, int i, androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope, int i2, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.coroutines.Continuation<? super androidx.compose.foundation.pager.PagerState$animateScrollToPage$3$1> continuation) {
        super(2, continuation);
        this.this$0 = pagerState;
        this.$targetPage = i;
        this.$this_with = lazyLayoutAnimateScrollScope;
        this.$targetPageOffsetToSnappedPosition = i2;
        this.$animationSpec = animationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.pager.PagerState$animateScrollToPage$3$1 pagerState$animateScrollToPage$3$1 = new androidx.compose.foundation.pager.PagerState$animateScrollToPage$3$1(this.this$0, this.$targetPage, this.$this_with, this.$targetPageOffsetToSnappedPosition, this.$animationSpec, continuation);
        pagerState$animateScrollToPage$3$1.L$0 = obj;
        return pagerState$animateScrollToPage$3$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(androidx.compose.foundation.gestures.ScrollScope scrollScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.pager.PagerState$animateScrollToPage$3$1) create(scrollScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int coerceAtMost;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.foundation.gestures.ScrollScope scrollScope = (androidx.compose.foundation.gestures.ScrollScope) this.L$0;
            this.this$0.updateTargetPage(scrollScope, this.$targetPage);
            boolean z = this.$targetPage > this.$this_with.getFirstVisibleItemIndex();
            int lastVisibleItemIndex = (this.$this_with.getLastVisibleItemIndex() - this.$this_with.getFirstVisibleItemIndex()) + 1;
            if (((z && this.$targetPage > this.$this_with.getLastVisibleItemIndex()) || (!z && this.$targetPage < this.$this_with.getFirstVisibleItemIndex())) && java.lang.Math.abs(this.$targetPage - this.$this_with.getFirstVisibleItemIndex()) >= 3) {
                if (z) {
                    coerceAtMost = kotlin.ranges.RangesKt.coerceAtLeast(this.$targetPage - lastVisibleItemIndex, this.$this_with.getFirstVisibleItemIndex());
                } else {
                    coerceAtMost = kotlin.ranges.RangesKt.coerceAtMost(this.$targetPage + lastVisibleItemIndex, this.$this_with.getFirstVisibleItemIndex());
                }
                this.$this_with.snapToItem(scrollScope, coerceAtMost, 0);
            }
            int visibleItemsAverageSize = this.$this_with.getVisibleItemsAverageSize();
            int currentPage = this.this$0.getCurrentPage();
            float currentPageOffsetFraction = (((this.$targetPage * visibleItemsAverageSize) - (currentPage * visibleItemsAverageSize)) + this.$targetPageOffsetToSnappedPosition) - (visibleItemsAverageSize * this.this$0.getCurrentPageOffsetFraction());
            final kotlin.jvm.internal.Ref.FloatRef floatRef = new kotlin.jvm.internal.Ref.FloatRef();
            this.label = 1;
            if (androidx.compose.animation.core.SuspendAnimationKt.animate$default(0.0f, currentPageOffsetFraction, 0.0f, this.$animationSpec, new kotlin.jvm.functions.Function2<java.lang.Float, java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.foundation.pager.PagerState$animateScrollToPage$3$1.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Float f, java.lang.Float f2) {
                    invoke(f.floatValue(), f2.floatValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(float f, float f2) {
                    kotlin.jvm.internal.Ref.FloatRef.this.element += scrollScope.scrollBy(f - kotlin.jvm.internal.Ref.FloatRef.this.element);
                }
            }, this, 4, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }
}
