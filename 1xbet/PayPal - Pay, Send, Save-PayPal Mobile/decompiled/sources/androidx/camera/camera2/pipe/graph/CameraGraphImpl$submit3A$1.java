package androidx.camera.camera2.pipe.graph;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Deferred;", "Landroidx/camera/camera2/pipe/Result3A;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.graph.CameraGraphImpl$submit3A$1", f = "CameraGraphImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class CameraGraphImpl$submit3A$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<? extends androidx.camera.camera2.pipe.Result3A>>, java.lang.Object> {
    final /* synthetic */ androidx.camera.camera2.pipe.AeMode Camera2StreamConfigurationMap;
    final /* synthetic */ java.util.List<android.hardware.camera2.params.MeteringRectangle> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.camera.camera2.pipe.AfMode getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.util.List<android.hardware.camera2.params.MeteringRectangle> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.camera.camera2.pipe.AwbMode getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    final /* synthetic */ androidx.camera.camera2.pipe.graph.CameraGraphImpl getInputFormats;
    final /* synthetic */ java.util.List<android.hardware.camera2.params.MeteringRectangle> getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.camera.camera2.pipe.graph.Controller3A controller3A;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizesFor == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            controller3A = this.getInputFormats.getOutputStallDurationlomOqCM;
            return controller3A.m910submit3AydBZfZg(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getOutputFormats);
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<? extends androidx.camera.camera2.pipe.Result3A>> continuation) {
        return ((androidx.camera.camera2.pipe.graph.CameraGraphImpl$submit3A$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.pipe.graph.CameraGraphImpl$submit3A$1(this.getInputFormats, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getOutputFormats, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraGraphImpl$submit3A$1(androidx.camera.camera2.pipe.graph.CameraGraphImpl cameraGraphImpl, androidx.camera.camera2.pipe.AeMode aeMode, androidx.camera.camera2.pipe.AfMode afMode, androidx.camera.camera2.pipe.AwbMode awbMode, java.util.List<android.hardware.camera2.params.MeteringRectangle> list, java.util.List<android.hardware.camera2.params.MeteringRectangle> list2, java.util.List<android.hardware.camera2.params.MeteringRectangle> list3, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.graph.CameraGraphImpl$submit3A$1> continuation) {
        super(2, continuation);
        this.getInputFormats = cameraGraphImpl;
        this.Camera2StreamConfigurationMap = aeMode;
        this.getHighSpeedVideoFpsRanges = afMode;
        this.getHighSpeedVideoSizes = awbMode;
        this.getHighResolutionOutputSizeshNQ4ISI = list;
        this.getHighSpeedVideoFpsRangesFor = list2;
        this.getOutputFormats = list3;
    }
}
