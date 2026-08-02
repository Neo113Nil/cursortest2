package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Landroidx/camera/camera2/pipe/compat/CameraRequest;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager$queue$2", f = "Camera2DeviceManager.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class PruningCamera2DeviceManager$queue$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.camera.camera2.pipe.compat.CameraRequest, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.camera.camera2.pipe.compat.CameraRequest cameraRequest = (androidx.camera.camera2.pipe.compat.CameraRequest) this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager.access$process(this.getHighSpeedVideoSizes, cameraRequest, this) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.camera.camera2.pipe.compat.CameraRequest cameraRequest, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager$queue$2) create(cameraRequest, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager$queue$2 pruningCamera2DeviceManager$queue$2 = new androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager$queue$2(this.getHighSpeedVideoSizes, continuation);
        pruningCamera2DeviceManager$queue$2.getHighResolutionOutputSizeshNQ4ISI = obj;
        return pruningCamera2DeviceManager$queue$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PruningCamera2DeviceManager$queue$2(androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager pruningCamera2DeviceManager, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager$queue$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = pruningCamera2DeviceManager;
    }
}
