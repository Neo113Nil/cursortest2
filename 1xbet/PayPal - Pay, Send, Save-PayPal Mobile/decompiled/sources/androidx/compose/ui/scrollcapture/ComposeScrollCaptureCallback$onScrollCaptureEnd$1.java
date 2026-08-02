package androidx.compose.ui.scrollcapture;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1", f = "ComposeScrollCaptureCallback.android.kt", i = {}, l = {193}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class ComposeScrollCaptureCallback$onScrollCaptureEnd$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.Runnable getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.ui.scrollcapture.RelativeScroller relativeScroller;
        androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback.ScrollCaptureSessionListener scrollCaptureSessionListener;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            relativeScroller = this.getHighResolutionOutputSizeshNQ4ISI.getInputFormats;
            this.getHighSpeedVideoSizes = 1;
            java.lang.Object Camera2StreamConfigurationMap = relativeScroller.Camera2StreamConfigurationMap(0.0f - relativeScroller.getHighSpeedVideoFpsRangesFor, this);
            if (Camera2StreamConfigurationMap != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                Camera2StreamConfigurationMap = kotlin.Unit.INSTANCE;
            }
            if (Camera2StreamConfigurationMap == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        scrollCaptureSessionListener = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
        scrollCaptureSessionListener.onSessionEnded();
        this.getHighSpeedVideoFpsRanges.run();
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposeScrollCaptureCallback$onScrollCaptureEnd$1(androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback composeScrollCaptureCallback, java.lang.Runnable runnable, kotlin.coroutines.Continuation<? super androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = composeScrollCaptureCallback;
        this.getHighSpeedVideoFpsRanges = runnable;
    }
}
