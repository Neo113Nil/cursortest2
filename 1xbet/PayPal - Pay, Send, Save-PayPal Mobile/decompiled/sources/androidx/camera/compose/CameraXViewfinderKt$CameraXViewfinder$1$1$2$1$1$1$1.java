package androidx.camera.compose;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$1$1$2$1$1$1$1", f = "CameraXViewfinder.kt", i = {}, l = {231}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class CameraXViewfinderKt$CameraXViewfinder$1$1$2$1$1$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Object>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ kotlinx.coroutines.Job getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.camera.viewfinder.core.ViewfinderSurfaceSessionScope getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.camera.core.SurfaceRequest getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.camera.compose.SurfaceRequestScope getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
            obj = androidx.camera.compose.SurfaceRequestScope.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges.getSurface(), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.coroutines.Job.DefaultImpls.cancel$default(this.getHighResolutionOutputSizeshNQ4ISI, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        return ((androidx.camera.core.SurfaceRequest.Result) obj).getResultCode() == 3 ? kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.getHighSpeedVideoFpsRangesFor.invalidate()) : kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
        return ((androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$1$1$2$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$1$1$2$1$1$1$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraXViewfinderKt$CameraXViewfinder$1$1$2$1$1$1$1(androidx.camera.compose.SurfaceRequestScope surfaceRequestScope, androidx.camera.core.SurfaceRequest surfaceRequest, androidx.camera.viewfinder.core.ViewfinderSurfaceSessionScope viewfinderSurfaceSessionScope, kotlinx.coroutines.Job job, kotlin.coroutines.Continuation<? super androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$1$1$2$1$1$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = surfaceRequestScope;
        this.getHighSpeedVideoFpsRangesFor = surfaceRequest;
        this.getHighSpeedVideoFpsRanges = viewfinderSurfaceSessionScope;
        this.getHighResolutionOutputSizeshNQ4ISI = job;
    }
}
