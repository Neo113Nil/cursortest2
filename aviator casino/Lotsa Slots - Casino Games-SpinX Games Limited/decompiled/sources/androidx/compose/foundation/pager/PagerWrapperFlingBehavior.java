package androidx.compose.foundation.pager;

/* compiled from: Pager.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/pager/PagerWrapperFlingBehavior;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "originalFlingBehavior", "Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "pagerState", "Landroidx/compose/foundation/pager/PagerState;", "(Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;Landroidx/compose/foundation/pager/PagerState;)V", "getOriginalFlingBehavior", "()Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "getPagerState", "()Landroidx/compose/foundation/pager/PagerState;", "performFling", "", "Landroidx/compose/foundation/gestures/ScrollScope;", "initialVelocity", "(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PagerWrapperFlingBehavior implements androidx.compose.foundation.gestures.FlingBehavior {
    public static final int $stable = 0;
    private final androidx.compose.foundation.gestures.snapping.SnapFlingBehavior originalFlingBehavior;
    private final androidx.compose.foundation.pager.PagerState pagerState;

    public PagerWrapperFlingBehavior(androidx.compose.foundation.gestures.snapping.SnapFlingBehavior snapFlingBehavior, androidx.compose.foundation.pager.PagerState pagerState) {
        this.originalFlingBehavior = snapFlingBehavior;
        this.pagerState = pagerState;
    }

    public final androidx.compose.foundation.gestures.snapping.SnapFlingBehavior getOriginalFlingBehavior() {
        return this.originalFlingBehavior;
    }

    public final androidx.compose.foundation.pager.PagerState getPagerState() {
        return this.pagerState;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.foundation.gestures.FlingBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object performFling(androidx.compose.foundation.gestures.ScrollScope scrollScope, float f, kotlin.coroutines.Continuation<? super java.lang.Float> continuation) {
        androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1 pagerWrapperFlingBehavior$performFling$1;
        int i;
        if (continuation instanceof androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1) {
            pagerWrapperFlingBehavior$performFling$1 = (androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1) continuation;
            if ((pagerWrapperFlingBehavior$performFling$1.label & Integer.MIN_VALUE) != 0) {
                pagerWrapperFlingBehavior$performFling$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = pagerWrapperFlingBehavior$performFling$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pagerWrapperFlingBehavior$performFling$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.foundation.gestures.snapping.SnapFlingBehavior snapFlingBehavior = this.originalFlingBehavior;
                    kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$2$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Float f2) {
                            invoke(f2.floatValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(float f2) {
                            androidx.compose.foundation.pager.PagerWrapperFlingBehavior.this.getPagerState().setSnapRemainingScrollOffset$foundation_release(f2);
                        }
                    };
                    pagerWrapperFlingBehavior$performFling$1.label = 1;
                    obj = snapFlingBehavior.performFling(scrollScope, f, function1, pagerWrapperFlingBehavior$performFling$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxFloat(((java.lang.Number) obj).floatValue());
            }
        }
        pagerWrapperFlingBehavior$performFling$1 = new androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1(this, continuation);
        java.lang.Object obj2 = pagerWrapperFlingBehavior$performFling$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pagerWrapperFlingBehavior$performFling$1.label;
        if (i != 0) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxFloat(((java.lang.Number) obj2).floatValue());
    }
}
