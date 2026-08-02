package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/NestedScrollScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", i = {}, l = {890}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class ScrollingLogic$doFlingAnimation$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.foundation.gestures.NestedScrollScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ long getHighResolutionOutputSizeshNQ4ISI;
    long getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.internal.Ref.LongRef getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    final /* synthetic */ androidx.compose.foundation.gestures.ScrollingLogic getInputFormats;
    private /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior;
        float Camera2StreamConfigurationMap;
        kotlin.jvm.internal.Ref.LongRef longRef;
        androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic2;
        long j;
        long highResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.foundation.gestures.NestedScrollScope nestedScrollScope = (androidx.compose.foundation.gestures.NestedScrollScope) this.getOutputMinFrameDuration;
            final androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic3 = this.getInputFormats;
            androidx.compose.foundation.gestures.ScrollScope scrollScope = new androidx.compose.foundation.gestures.ScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$reverseScope$1
                @Override // androidx.compose.foundation.gestures.ScrollScope
                public final float scrollBy(float pixels) {
                    kotlin.jvm.functions.Function0 function0;
                    if (java.lang.Math.abs(pixels) != 0.0f) {
                        function0 = androidx.compose.foundation.gestures.ScrollingLogic.this.getOutputMinFrameDuration;
                        if (!((java.lang.Boolean) function0.invoke()).booleanValue()) {
                            throw new androidx.compose.foundation.gestures.FlingCancellationException();
                        }
                    }
                    androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic4 = androidx.compose.foundation.gestures.ScrollingLogic.this;
                    return scrollingLogic4.reverseIfNeeded(scrollingLogic4.m1537toFloatk4lQ0M(nestedScrollScope.mo1491scrollByWithOverscrollOzD1aCk(scrollingLogic4.m1535reverseIfNeededMKHz9U(scrollingLogic4.m1538toOffsettuRUvjQ(pixels)), androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m7125getSideEffectWNlRxjI())));
                }
            };
            scrollingLogic = this.getInputFormats;
            kotlin.jvm.internal.Ref.LongRef longRef2 = this.getHighSpeedVideoSizes;
            long j2 = this.getHighResolutionOutputSizeshNQ4ISI;
            flingBehavior = scrollingLogic.getHighSpeedVideoFpsRanges;
            long j3 = longRef2.element;
            Camera2StreamConfigurationMap = scrollingLogic.Camera2StreamConfigurationMap(j2);
            float reverseIfNeeded = scrollingLogic.reverseIfNeeded(Camera2StreamConfigurationMap);
            this.getOutputMinFrameDuration = scrollingLogic;
            this.Camera2StreamConfigurationMap = scrollingLogic;
            this.getHighSpeedVideoFpsRangesFor = longRef2;
            this.getHighSpeedVideoFpsRanges = j3;
            this.getHighSpeedVideoSizesFor = 1;
            java.lang.Object performFling = flingBehavior.performFling(scrollScope, reverseIfNeeded, this);
            if (performFling == coroutine_suspended) {
                return coroutine_suspended;
            }
            longRef = longRef2;
            obj = performFling;
            scrollingLogic2 = scrollingLogic;
            j = j3;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.getHighSpeedVideoFpsRanges;
            longRef = (kotlin.jvm.internal.Ref.LongRef) this.getHighSpeedVideoFpsRangesFor;
            scrollingLogic = (androidx.compose.foundation.gestures.ScrollingLogic) this.Camera2StreamConfigurationMap;
            scrollingLogic2 = (androidx.compose.foundation.gestures.ScrollingLogic) this.getOutputMinFrameDuration;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        highResolutionOutputSizeshNQ4ISI = scrollingLogic.getHighResolutionOutputSizeshNQ4ISI(j, scrollingLogic2.reverseIfNeeded(((java.lang.Number) obj).floatValue()));
        longRef.element = highResolutionOutputSizeshNQ4ISI;
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(androidx.compose.foundation.gestures.NestedScrollScope nestedScrollScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2) create(nestedScrollScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2(this.getInputFormats, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        scrollingLogic$doFlingAnimation$2.getOutputMinFrameDuration = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollingLogic$doFlingAnimation$2(androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic, kotlin.jvm.internal.Ref.LongRef longRef, long j, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2> continuation) {
        super(2, continuation);
        this.getInputFormats = scrollingLogic;
        this.getHighSpeedVideoSizes = longRef;
        this.getHighResolutionOutputSizeshNQ4ISI = j;
    }
}
