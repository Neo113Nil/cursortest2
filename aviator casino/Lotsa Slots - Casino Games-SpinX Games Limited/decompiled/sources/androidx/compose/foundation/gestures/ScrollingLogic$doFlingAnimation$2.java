package androidx.compose.foundation.gestures;

/* compiled from: Scrollable.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", i = {}, l = {844}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class ScrollingLogic$doFlingAnimation$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.foundation.gestures.ScrollScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ long $available;
    final /* synthetic */ kotlin.jvm.internal.Ref.LongRef $result;
    long J$0;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    final /* synthetic */ androidx.compose.foundation.gestures.ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollingLogic$doFlingAnimation$2(androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic, kotlin.jvm.internal.Ref.LongRef longRef, long j, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2> continuation) {
        super(2, continuation);
        this.this$0 = scrollingLogic;
        this.$result = longRef;
        this.$available = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2(this.this$0, this.$result, this.$available, continuation);
        scrollingLogic$doFlingAnimation$2.L$0 = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(androidx.compose.foundation.gestures.ScrollScope scrollScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2) create(scrollScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior;
        kotlin.jvm.internal.Ref.LongRef longRef;
        androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic2;
        long j;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.foundation.gestures.ScrollScope scrollScope = (androidx.compose.foundation.gestures.ScrollScope) this.L$0;
            final androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic3 = this.this$0;
            final kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, androidx.compose.ui.geometry.Offset> function1 = new kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, androidx.compose.ui.geometry.Offset>() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$outerScopeScroll$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ androidx.compose.ui.geometry.Offset invoke(androidx.compose.ui.geometry.Offset offset) {
                    return androidx.compose.ui.geometry.Offset.m1860boximpl(m417invokeMKHz9U(offset.getPackedValue()));
                }

                /* renamed from: invoke-MK-Hz9U, reason: not valid java name */
                public final long m417invokeMKHz9U(long j2) {
                    androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic4 = androidx.compose.foundation.gestures.ScrollingLogic.this;
                    return scrollingLogic4.m409reverseIfNeededMKHz9U(scrollingLogic4.m405dispatchScroll3eAAhYA(scrollScope, scrollingLogic4.m409reverseIfNeededMKHz9U(j2), androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m3169getFlingWNlRxjI()));
                }
            };
            final androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic4 = this.this$0;
            androidx.compose.foundation.gestures.ScrollScope scrollScope2 = new androidx.compose.foundation.gestures.ScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$scope$1
                @Override // androidx.compose.foundation.gestures.ScrollScope
                public float scrollBy(float pixels) {
                    androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic5 = androidx.compose.foundation.gestures.ScrollingLogic.this;
                    return scrollingLogic5.m413toFloatk4lQ0M(function1.invoke(androidx.compose.ui.geometry.Offset.m1860boximpl(scrollingLogic5.m414toOffsettuRUvjQ(pixels))).getPackedValue());
                }
            };
            scrollingLogic = this.this$0;
            kotlin.jvm.internal.Ref.LongRef longRef2 = this.$result;
            long j2 = this.$available;
            flingBehavior = scrollingLogic.flingBehavior;
            long j3 = longRef2.element;
            float reverseIfNeeded = scrollingLogic.reverseIfNeeded(scrollingLogic.m412toFloatTH1AsA0(j2));
            this.L$0 = scrollingLogic;
            this.L$1 = scrollingLogic;
            this.L$2 = longRef2;
            this.J$0 = j3;
            this.label = 1;
            obj = flingBehavior.performFling(scrollScope2, reverseIfNeeded, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            longRef = longRef2;
            scrollingLogic2 = scrollingLogic;
            j = j3;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.J$0;
            longRef = (kotlin.jvm.internal.Ref.LongRef) this.L$2;
            scrollingLogic = (androidx.compose.foundation.gestures.ScrollingLogic) this.L$1;
            scrollingLogic2 = (androidx.compose.foundation.gestures.ScrollingLogic) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        longRef.element = scrollingLogic.m415updateQWom1Mo(j, scrollingLogic2.reverseIfNeeded(((java.lang.Number) obj).floatValue()));
        return kotlin.Unit.INSTANCE;
    }
}
