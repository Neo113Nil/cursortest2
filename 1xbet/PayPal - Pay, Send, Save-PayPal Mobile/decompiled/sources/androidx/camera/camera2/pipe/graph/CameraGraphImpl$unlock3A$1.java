package androidx.camera.camera2.pipe.graph;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Deferred;", "Landroidx/camera/camera2/pipe/Result3A;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.graph.CameraGraphImpl$unlock3A$1", f = "CameraGraphImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class CameraGraphImpl$unlock3A$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<? extends androidx.camera.camera2.pipe.Result3A>>, java.lang.Object> {
    final /* synthetic */ java.lang.Boolean Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.Boolean getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.Boolean getHighSpeedVideoFpsRanges;
    final /* synthetic */ long getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ int getHighSpeedVideoSizes;
    final /* synthetic */ androidx.camera.camera2.pipe.graph.CameraGraphImpl getInputFormats;
    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.camera.camera2.pipe.FrameMetadata, java.lang.Boolean> getInputSizeshNQ4ISI;
    int getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.camera.camera2.pipe.graph.Controller3A controller3A;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getOutputFormats == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            controller3A = this.getInputFormats.getOutputStallDurationlomOqCM;
            return controller3A.unlock3A(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizes, kotlin.coroutines.jvm.internal.Boxing.boxLong(this.getHighSpeedVideoFpsRangesFor));
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<? extends androidx.camera.camera2.pipe.Result3A>> continuation) {
        return ((androidx.camera.camera2.pipe.graph.CameraGraphImpl$unlock3A$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.pipe.graph.CameraGraphImpl$unlock3A$1(this.getInputFormats, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CameraGraphImpl$unlock3A$1(androidx.camera.camera2.pipe.graph.CameraGraphImpl cameraGraphImpl, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.FrameMetadata, java.lang.Boolean> function1, int i, long j, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.graph.CameraGraphImpl$unlock3A$1> continuation) {
        super(2, continuation);
        this.getInputFormats = cameraGraphImpl;
        this.Camera2StreamConfigurationMap = bool;
        this.getHighResolutionOutputSizeshNQ4ISI = bool2;
        this.getHighSpeedVideoFpsRanges = bool3;
        this.getInputSizeshNQ4ISI = function1;
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRangesFor = j;
    }
}
