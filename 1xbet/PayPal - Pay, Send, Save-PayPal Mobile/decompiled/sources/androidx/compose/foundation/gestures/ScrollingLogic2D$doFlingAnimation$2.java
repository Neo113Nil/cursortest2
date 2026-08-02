package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/NestedScrollScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic2D$doFlingAnimation$2", f = "Scrollable2D.kt", i = {}, l = {456}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class ScrollingLogic2D$doFlingAnimation$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.foundation.gestures.NestedScrollScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ long Camera2StreamConfigurationMap;
    long getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.foundation.gestures.ScrollingLogic2D getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.internal.Ref.LongRef getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior;
        float highSpeedVideoSizes;
        long j;
        kotlin.jvm.internal.Ref.LongRef longRef;
        long highResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.foundation.gestures.NestedScrollScope nestedScrollScope = (androidx.compose.foundation.gestures.NestedScrollScope) this.getInputSizeshNQ4ISI;
            final androidx.compose.foundation.gestures.ScrollingLogic2D scrollingLogic2D = this.getHighSpeedVideoFpsRangesFor;
            final long j2 = this.Camera2StreamConfigurationMap;
            androidx.compose.foundation.gestures.ScrollScope scrollScope = new androidx.compose.foundation.gestures.ScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic2D$doFlingAnimation$2$flingScope$1
                @Override // androidx.compose.foundation.gestures.ScrollScope
                public final float scrollBy(float pixels) {
                    long highSpeedVideoSizes2;
                    float highSpeedVideoFpsRangesFor;
                    kotlin.jvm.functions.Function0 function0;
                    highSpeedVideoSizes2 = androidx.compose.foundation.gestures.ScrollingLogic2D.getHighSpeedVideoSizes(pixels, j2);
                    if (!androidx.compose.ui.geometry.Offset.m5749equalsimpl0(highSpeedVideoSizes2, androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0())) {
                        function0 = androidx.compose.foundation.gestures.ScrollingLogic2D.this.getHighSpeedVideoFpsRangesFor;
                        if (!((java.lang.Boolean) function0.invoke()).booleanValue()) {
                            throw new androidx.compose.foundation.gestures.FlingCancellationException();
                        }
                    }
                    highSpeedVideoFpsRangesFor = androidx.compose.foundation.gestures.ScrollingLogic2D.getHighSpeedVideoFpsRangesFor(nestedScrollScope.mo1491scrollByWithOverscrollOzD1aCk(highSpeedVideoSizes2, androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m7125getSideEffectWNlRxjI()));
                    return highSpeedVideoFpsRangesFor;
                }
            };
            androidx.compose.foundation.gestures.ScrollingLogic2D scrollingLogic2D2 = this.getHighSpeedVideoFpsRangesFor;
            long j3 = this.Camera2StreamConfigurationMap;
            kotlin.jvm.internal.Ref.LongRef longRef2 = this.getHighSpeedVideoSizes;
            flingBehavior = scrollingLogic2D2.getHighResolutionOutputSizeshNQ4ISI;
            highSpeedVideoSizes = androidx.compose.foundation.gestures.Scrollable2DKt.getHighSpeedVideoSizes(j3);
            this.getInputSizeshNQ4ISI = longRef2;
            this.getHighResolutionOutputSizeshNQ4ISI = j3;
            this.getHighSpeedVideoFpsRanges = 1;
            obj = flingBehavior.performFling(scrollScope, highSpeedVideoSizes, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            j = j3;
            longRef = longRef2;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.getHighResolutionOutputSizeshNQ4ISI;
            longRef = (kotlin.jvm.internal.Ref.LongRef) this.getInputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.gestures.ScrollingLogic2D.getHighResolutionOutputSizeshNQ4ISI(((java.lang.Number) obj).floatValue(), j);
        longRef.element = highResolutionOutputSizeshNQ4ISI;
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(androidx.compose.foundation.gestures.NestedScrollScope nestedScrollScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.ScrollingLogic2D$doFlingAnimation$2) create(nestedScrollScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.ScrollingLogic2D$doFlingAnimation$2 scrollingLogic2D$doFlingAnimation$2 = new androidx.compose.foundation.gestures.ScrollingLogic2D$doFlingAnimation$2(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
        scrollingLogic2D$doFlingAnimation$2.getInputSizeshNQ4ISI = obj;
        return scrollingLogic2D$doFlingAnimation$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollingLogic2D$doFlingAnimation$2(androidx.compose.foundation.gestures.ScrollingLogic2D scrollingLogic2D, long j, kotlin.jvm.internal.Ref.LongRef longRef, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.ScrollingLogic2D$doFlingAnimation$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = scrollingLogic2D;
        this.Camera2StreamConfigurationMap = j;
        this.getHighSpeedVideoSizes = longRef;
    }
}
