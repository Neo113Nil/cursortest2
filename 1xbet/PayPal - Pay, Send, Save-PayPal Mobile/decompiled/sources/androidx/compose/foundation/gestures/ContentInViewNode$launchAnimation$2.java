package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", f = "ContentInViewNode.kt", i = {}, l = {282}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class ContentInViewNode$launchAnimation$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.foundation.gestures.UpdatableAnimationState Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.gestures.ContentInViewNode getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ long getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.foundation.gestures.BringIntoViewSpec getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        try {
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.Job job = kotlinx.coroutines.JobKt.getJob(((kotlinx.coroutines.CoroutineScope) this.getOutputMinFrameDuration).getCoroutineContext());
                    this.getHighResolutionOutputSizeshNQ4ISI.getOutputMinFrameDuration = true;
                    scrollingLogic = this.getHighResolutionOutputSizeshNQ4ISI.getInputSizeshNQ4ISI;
                    this.getHighSpeedVideoFpsRangesFor = 1;
                    if (scrollingLogic.scroll(androidx.compose.foundation.MutatePriority.Default, new androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, job, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI.resumeAndRemoveAll();
                this.getHighResolutionOutputSizeshNQ4ISI.getOutputMinFrameDuration = false;
                this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI.cancelAndRemoveAll(null);
                this.getHighResolutionOutputSizeshNQ4ISI.getInputFormats = false;
                return kotlin.Unit.INSTANCE;
            } catch (java.util.concurrent.CancellationException e) {
                throw e;
            }
        } catch (java.lang.Throwable th) {
            this.getHighResolutionOutputSizeshNQ4ISI.getOutputMinFrameDuration = false;
            this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI.cancelAndRemoveAll((java.lang.Throwable) null);
            this.getHighResolutionOutputSizeshNQ4ISI.getInputFormats = false;
            throw th;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/NestedScrollScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", f = "ContentInViewNode.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.foundation.gestures.NestedScrollScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.Job Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.compose.foundation.gestures.UpdatableAnimationState getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ long getHighSpeedVideoFpsRanges;
        final /* synthetic */ androidx.compose.foundation.gestures.BringIntoViewSpec getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;
        private /* synthetic */ java.lang.Object getInputFormats;
        final /* synthetic */ androidx.compose.foundation.gestures.ContentInViewNode getOutputMinFrameDuration;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            float highSpeedVideoFpsRangesFor;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoSizes;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                final androidx.compose.foundation.gestures.NestedScrollScope nestedScrollScope = (androidx.compose.foundation.gestures.NestedScrollScope) this.getInputFormats;
                androidx.compose.foundation.gestures.UpdatableAnimationState updatableAnimationState = this.getHighResolutionOutputSizeshNQ4ISI;
                highSpeedVideoFpsRangesFor = this.getOutputMinFrameDuration.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
                updatableAnimationState.setValue(highSpeedVideoFpsRangesFor);
                final androidx.compose.foundation.gestures.UpdatableAnimationState updatableAnimationState2 = this.getHighResolutionOutputSizeshNQ4ISI;
                final androidx.compose.foundation.gestures.ContentInViewNode contentInViewNode = this.getOutputMinFrameDuration;
                final kotlinx.coroutines.Job job = this.Camera2StreamConfigurationMap;
                kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        kotlin.Unit highSpeedVideoFpsRanges;
                        highSpeedVideoFpsRanges = androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2.AnonymousClass1.getHighSpeedVideoFpsRanges(androidx.compose.foundation.gestures.ContentInViewNode.this, job, nestedScrollScope, ((java.lang.Float) obj2).floatValue());
                        return highSpeedVideoFpsRanges;
                    }
                };
                final androidx.compose.foundation.gestures.ContentInViewNode contentInViewNode2 = this.getOutputMinFrameDuration;
                final androidx.compose.foundation.gestures.UpdatableAnimationState updatableAnimationState3 = this.getHighResolutionOutputSizeshNQ4ISI;
                final androidx.compose.foundation.gestures.BringIntoViewSpec bringIntoViewSpec = this.getHighSpeedVideoFpsRangesFor;
                this.getHighSpeedVideoSizes = 1;
                if (updatableAnimationState2.animateToZero(function1, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit highSpeedVideoFpsRangesFor2;
                        highSpeedVideoFpsRangesFor2 = androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2.AnonymousClass1.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.gestures.ContentInViewNode.this, updatableAnimationState3, bringIntoViewSpec);
                        return highSpeedVideoFpsRangesFor2;
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.foundation.gestures.ContentInViewNode contentInViewNode, kotlinx.coroutines.Job job, androidx.compose.foundation.gestures.NestedScrollScope nestedScrollScope, float f) {
            boolean z;
            androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic;
            z = contentInViewNode.getHighSpeedVideoSizesFor;
            float f2 = z ? 1.0f : -1.0f;
            scrollingLogic = contentInViewNode.getInputSizeshNQ4ISI;
            float m1537toFloatk4lQ0M = f2 * scrollingLogic.m1537toFloatk4lQ0M(scrollingLogic.m1535reverseIfNeededMKHz9U(nestedScrollScope.mo1490scrollByOzD1aCk(scrollingLogic.m1535reverseIfNeededMKHz9U(scrollingLogic.m1538toOffsettuRUvjQ(f2 * f)), androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m7126getUserInputWNlRxjI())));
            if (java.lang.Math.abs(m1537toFloatk4lQ0M) < java.lang.Math.abs(f)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Scroll animation cancelled because scroll was not consumed (");
                sb.append(m1537toFloatk4lQ0M);
                sb.append(" < ");
                sb.append(f);
                sb.append(')');
                kotlinx.coroutines.JobKt__JobKt.cancel$default(job, sb.toString(), null, 2, null);
            }
            return kotlin.Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
        
            r4 = r10.getHighSpeedVideoSizes();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.gestures.ContentInViewNode contentInViewNode, androidx.compose.foundation.gestures.UpdatableAnimationState updatableAnimationState, androidx.compose.foundation.gestures.BringIntoViewSpec bringIntoViewSpec) {
            boolean z;
            float highSpeedVideoFpsRangesFor;
            androidx.compose.ui.geometry.Rect highSpeedVideoSizes;
            androidx.compose.ui.geometry.Rect invoke;
            androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue bringIntoViewRequestPriorityQueue = contentInViewNode.getHighResolutionOutputSizeshNQ4ISI;
            while (bringIntoViewRequestPriorityQueue.getHighResolutionOutputSizeshNQ4ISI.getSize() != 0 && ((invoke = ((androidx.compose.foundation.gestures.ContentInViewNode.Request) bringIntoViewRequestPriorityQueue.getHighResolutionOutputSizeshNQ4ISI.last()).getCurrentBounds().invoke()) == null || androidx.compose.foundation.gestures.ContentInViewNode.getHighSpeedVideoFpsRanges(contentInViewNode, invoke, 0L, 0L, 3))) {
                kotlinx.coroutines.CancellableContinuation<kotlin.Unit> continuation = ((androidx.compose.foundation.gestures.ContentInViewNode.Request) bringIntoViewRequestPriorityQueue.getHighResolutionOutputSizeshNQ4ISI.removeAt(bringIntoViewRequestPriorityQueue.getHighResolutionOutputSizeshNQ4ISI.getSize() - 1)).getContinuation();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                continuation.resumeWith(kotlin.Result.m23436constructorimpl(unit));
            }
            z = contentInViewNode.getInputFormats;
            if (z && highSpeedVideoSizes != null && androidx.compose.foundation.gestures.ContentInViewNode.getHighSpeedVideoFpsRanges(contentInViewNode, highSpeedVideoSizes, 0L, 0L, 3)) {
                contentInViewNode.getInputFormats = false;
            }
            highSpeedVideoFpsRangesFor = contentInViewNode.getHighSpeedVideoFpsRangesFor(bringIntoViewSpec, androidx.compose.ui.unit.IntOffset.INSTANCE.m8740getZeronOccac());
            updatableAnimationState.setValue(highSpeedVideoFpsRangesFor);
            return kotlin.Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
        public java.lang.Object invoke(androidx.compose.foundation.gestures.NestedScrollScope nestedScrollScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2.AnonymousClass1) create(nestedScrollScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2.AnonymousClass1 anonymousClass1 = new androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
            anonymousClass1.getInputFormats = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.compose.foundation.gestures.UpdatableAnimationState updatableAnimationState, androidx.compose.foundation.gestures.ContentInViewNode contentInViewNode, androidx.compose.foundation.gestures.BringIntoViewSpec bringIntoViewSpec, long j, kotlinx.coroutines.Job job, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = updatableAnimationState;
            this.getOutputMinFrameDuration = contentInViewNode;
            this.getHighSpeedVideoFpsRangesFor = bringIntoViewSpec;
            this.getHighSpeedVideoFpsRanges = j;
            this.Camera2StreamConfigurationMap = job;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2 contentInViewNode$launchAnimation$2 = new androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
        contentInViewNode$launchAnimation$2.getOutputMinFrameDuration = obj;
        return contentInViewNode$launchAnimation$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContentInViewNode$launchAnimation$2(androidx.compose.foundation.gestures.ContentInViewNode contentInViewNode, androidx.compose.foundation.gestures.UpdatableAnimationState updatableAnimationState, androidx.compose.foundation.gestures.BringIntoViewSpec bringIntoViewSpec, long j, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = contentInViewNode;
        this.Camera2StreamConfigurationMap = updatableAnimationState;
        this.getHighSpeedVideoSizes = bringIntoViewSpec;
        this.getHighSpeedVideoFpsRanges = j;
    }
}
