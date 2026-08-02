package androidx.camera.camera2.compat.workaround;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection$submitStillCaptures$2", f = "CapturePipelineTorchCorrection.kt", i = {}, l = {86, 88, 89}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class CapturePipelineTorchCorrection$submitStillCaptures$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ java.util.List<kotlinx.coroutines.Deferred<java.lang.Void>> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0080, code lost:
    
        if (androidx.camera.camera2.impl.TorchControl.m120setTorchAsyncOup_wC0$camera_camera2$default(r5, androidx.camera.camera2.impl.TorchControl.TorchMode.INSTANCE.m132getUSED_AS_FLASHIRs_R8(), false, false, 6, null).join(r11) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0091, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (androidx.camera.camera2.impl.TorchControl.m120setTorchAsyncOup_wC0$camera_camera2$default(r5, androidx.camera.camera2.impl.TorchControl.TorchMode.INSTANCE.m130getOFFIRs_R8(), false, false, 6, null).join(r11) != r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0037, code lost:
    
        if (kotlinx.coroutines.AwaitKt.joinAll(r11.getHighSpeedVideoFpsRanges, r11) != r0) goto L14;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.camera.camera2.impl.TorchControl torchControl;
        androidx.camera.camera2.impl.TorchControl torchControl2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
        } else if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                    java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                }
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            torchControl2 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
            this.Camera2StreamConfigurationMap = 3;
        }
        androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
        }
        torchControl = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
        this.Camera2StreamConfigurationMap = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection$submitStillCaptures$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection$submitStillCaptures$2(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CapturePipelineTorchCorrection$submitStillCaptures$2(java.util.List<? extends kotlinx.coroutines.Deferred<java.lang.Void>> list, androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection capturePipelineTorchCorrection, kotlin.coroutines.Continuation<? super androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection$submitStillCaptures$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = list;
        this.getHighSpeedVideoSizes = capturePipelineTorchCorrection;
    }
}
