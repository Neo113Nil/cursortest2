package androidx.camera.compose;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$1$1$2$1$1$1$cancellationWatcherJob$1", f = "CameraXViewfinder.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_QUESTION_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class CameraXViewfinderKt$CameraXViewfinder$1$1$2$1$1$1$cancellationWatcherJob$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.camera.core.SurfaceRequest getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.Camera2StreamConfigurationMap = 1;
                if (kotlinx.coroutines.DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            throw new kotlin.KotlinNothingValueException();
        } catch (java.util.concurrent.CancellationException e) {
            java.lang.String message = e.getMessage();
            if (message != null && kotlin.text.StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "Surface replaced", false, 2, (java.lang.Object) null)) {
                this.getHighSpeedVideoFpsRangesFor.invalidate();
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$1$1$2$1$1$1$cancellationWatcherJob$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$1$1$2$1$1$1$cancellationWatcherJob$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraXViewfinderKt$CameraXViewfinder$1$1$2$1$1$1$cancellationWatcherJob$1(androidx.camera.core.SurfaceRequest surfaceRequest, kotlin.coroutines.Continuation<? super androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$1$1$2$1$1$1$cancellationWatcherJob$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = surfaceRequest;
    }
}
