package androidx.compose.ui.scrollcapture;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1", f = "ComposeScrollCaptureCallback.android.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.graphics.Rect Camera2StreamConfigurationMap;
    final /* synthetic */ android.view.ScrollCaptureSession getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.util.function.Consumer<android.graphics.Rect> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = 1;
            obj = this.getHighSpeedVideoFpsRanges.aW_(this.getHighResolutionOutputSizeshNQ4ISI, androidx.compose.ui.graphics.RectHelper_androidKt.toComposeIntRect(this.Camera2StreamConfigurationMap), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.getHighSpeedVideoFpsRangesFor.accept(androidx.compose.ui.graphics.RectHelper_androidKt.toAndroidRect((androidx.compose.ui.unit.IntRect) obj));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1(androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback composeScrollCaptureCallback, android.view.ScrollCaptureSession scrollCaptureSession, android.graphics.Rect rect, java.util.function.Consumer<android.graphics.Rect> consumer, kotlin.coroutines.Continuation<? super androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = composeScrollCaptureCallback;
        this.getHighResolutionOutputSizeshNQ4ISI = scrollCaptureSession;
        this.Camera2StreamConfigurationMap = rect;
        this.getHighSpeedVideoFpsRangesFor = consumer;
    }
}
