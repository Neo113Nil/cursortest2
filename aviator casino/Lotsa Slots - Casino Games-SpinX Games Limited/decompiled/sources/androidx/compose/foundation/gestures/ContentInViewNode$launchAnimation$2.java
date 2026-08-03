package androidx.compose.foundation.gestures;

/* compiled from: ContentInViewNode.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", f = "ContentInViewNode.kt", i = {}, l = {com.facebook.internal.FacebookRequestErrorClassification.EC_INVALID_TOKEN}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class ContentInViewNode$launchAnimation$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ androidx.compose.foundation.gestures.ContentInViewNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContentInViewNode$launchAnimation$2(androidx.compose.foundation.gestures.ContentInViewNode contentInViewNode, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2> continuation) {
        super(2, continuation);
        this.this$0 = contentInViewNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2 contentInViewNode$launchAnimation$2 = new androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2(this.this$0, continuation);
        contentInViewNode$launchAnimation$2.L$0 = obj;
        return contentInViewNode$launchAnimation$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.foundation.gestures.ScrollableState scrollableState;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        java.util.concurrent.CancellationException cancellationException = null;
        try {
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.Job job = kotlinx.coroutines.JobKt.getJob(((kotlinx.coroutines.CoroutineScope) this.L$0).getCoroutineContext());
                    this.this$0.isAnimationRunning = true;
                    scrollableState = this.this$0.scrollState;
                    this.label = 1;
                    if (androidx.compose.foundation.gestures.ScrollableState.CC.scroll$default(scrollableState, null, new androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2.AnonymousClass1(this.this$0, job, null), this, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                this.this$0.bringIntoViewRequests.resumeAndRemoveAll();
                this.this$0.isAnimationRunning = false;
                this.this$0.bringIntoViewRequests.cancelAndRemoveAll(null);
                this.this$0.trackingFocusedChild = false;
                return kotlin.Unit.INSTANCE;
            } catch (java.util.concurrent.CancellationException e) {
                cancellationException = e;
                throw cancellationException;
            }
        } catch (java.lang.Throwable th) {
            this.this$0.isAnimationRunning = false;
            this.this$0.bringIntoViewRequests.cancelAndRemoveAll(cancellationException);
            this.this$0.trackingFocusedChild = false;
            throw th;
        }
    }

    /* compiled from: ContentInViewNode.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", f = "ContentInViewNode.kt", i = {}, l = {195}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.foundation.gestures.ScrollScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.Job $animationJob;
        private /* synthetic */ java.lang.Object L$0;
        int label;
        final /* synthetic */ androidx.compose.foundation.gestures.ContentInViewNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.compose.foundation.gestures.ContentInViewNode contentInViewNode, kotlinx.coroutines.Job job, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2.AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = contentInViewNode;
            this.$animationJob = job;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2.AnonymousClass1 anonymousClass1 = new androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2.AnonymousClass1(this.this$0, this.$animationJob, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(androidx.compose.foundation.gestures.ScrollScope scrollScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2.AnonymousClass1) create(scrollScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            androidx.compose.foundation.gestures.UpdatableAnimationState updatableAnimationState;
            float calculateScrollDelta;
            androidx.compose.foundation.gestures.UpdatableAnimationState updatableAnimationState2;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                final androidx.compose.foundation.gestures.ScrollScope scrollScope = (androidx.compose.foundation.gestures.ScrollScope) this.L$0;
                updatableAnimationState = this.this$0.animationState;
                calculateScrollDelta = this.this$0.calculateScrollDelta();
                updatableAnimationState.setValue(calculateScrollDelta);
                updatableAnimationState2 = this.this$0.animationState;
                final androidx.compose.foundation.gestures.ContentInViewNode contentInViewNode = this.this$0;
                final kotlinx.coroutines.Job job = this.$animationJob;
                kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.foundation.gestures.ContentInViewNode.launchAnimation.2.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Float f) {
                        invoke(f.floatValue());
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(float f) {
                        boolean z;
                        z = androidx.compose.foundation.gestures.ContentInViewNode.this.reverseDirection;
                        float f2 = z ? 1.0f : -1.0f;
                        float scrollBy = f2 * scrollScope.scrollBy(f2 * f);
                        if (java.lang.Math.abs(scrollBy) < java.lang.Math.abs(f)) {
                            kotlinx.coroutines.JobKt__JobKt.cancel$default(job, "Scroll animation cancelled because scroll was not consumed (" + scrollBy + " < " + f + ')', null, 2, null);
                        }
                    }
                };
                final androidx.compose.foundation.gestures.ContentInViewNode contentInViewNode2 = this.this$0;
                this.label = 1;
                if (updatableAnimationState2.animateToZero(function1, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.gestures.ContentInViewNode.launchAnimation.2.1.2
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                        invoke2();
                        return kotlin.Unit.INSTANCE;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
                    
                        r2 = r1.getFocusedChildBounds();
                     */
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void invoke2() {
                        boolean z;
                        androidx.compose.foundation.gestures.UpdatableAnimationState updatableAnimationState3;
                        float calculateScrollDelta2;
                        androidx.compose.ui.geometry.Rect focusedChildBounds;
                        androidx.compose.ui.geometry.Rect invoke;
                        androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue bringIntoViewRequestPriorityQueue = androidx.compose.foundation.gestures.ContentInViewNode.this.bringIntoViewRequests;
                        androidx.compose.foundation.gestures.ContentInViewNode contentInViewNode3 = androidx.compose.foundation.gestures.ContentInViewNode.this;
                        while (bringIntoViewRequestPriorityQueue.requests.isNotEmpty() && ((invoke = ((androidx.compose.foundation.gestures.ContentInViewNode.Request) bringIntoViewRequestPriorityQueue.requests.last()).getCurrentBounds().invoke()) == null || androidx.compose.foundation.gestures.ContentInViewNode.m326isMaxVisibleO0kMr_c$default(contentInViewNode3, invoke, 0L, 1, null))) {
                            kotlinx.coroutines.CancellableContinuation<kotlin.Unit> continuation = ((androidx.compose.foundation.gestures.ContentInViewNode.Request) bringIntoViewRequestPriorityQueue.requests.removeAt(bringIntoViewRequestPriorityQueue.requests.getSize() - 1)).getContinuation();
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                            continuation.resumeWith(kotlin.Result.m10798constructorimpl(unit));
                        }
                        z = androidx.compose.foundation.gestures.ContentInViewNode.this.trackingFocusedChild;
                        if (z && focusedChildBounds != null && androidx.compose.foundation.gestures.ContentInViewNode.m326isMaxVisibleO0kMr_c$default(androidx.compose.foundation.gestures.ContentInViewNode.this, focusedChildBounds, 0L, 1, null)) {
                            androidx.compose.foundation.gestures.ContentInViewNode.this.trackingFocusedChild = false;
                        }
                        updatableAnimationState3 = androidx.compose.foundation.gestures.ContentInViewNode.this.animationState;
                        calculateScrollDelta2 = androidx.compose.foundation.gestures.ContentInViewNode.this.calculateScrollDelta();
                        updatableAnimationState3.setValue(calculateScrollDelta2);
                    }
                }, this) == coroutine_suspended) {
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
}
