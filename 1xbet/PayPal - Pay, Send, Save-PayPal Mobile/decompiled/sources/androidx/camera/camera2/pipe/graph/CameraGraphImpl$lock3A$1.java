package androidx.camera.camera2.pipe.graph;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Deferred;", "Landroidx/camera/camera2/pipe/Result3A;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.graph.CameraGraphImpl$lock3A$1", f = "CameraGraphImpl.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class CameraGraphImpl$lock3A$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<? extends androidx.camera.camera2.pipe.Result3A>>, java.lang.Object> {
    final /* synthetic */ java.util.List<android.hardware.camera2.params.MeteringRectangle> Camera2StreamConfigurationMap;
    final /* synthetic */ java.util.List<android.hardware.camera2.params.MeteringRectangle> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.camera.camera2.pipe.Lock3ABehavior getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.camera.camera2.pipe.Lock3ABehavior getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.camera.camera2.pipe.AeMode getHighSpeedVideoSizes;
    final /* synthetic */ int getHighSpeedVideoSizesFor;
    final /* synthetic */ androidx.camera.camera2.pipe.Lock3ABehavior getInputFormats;
    final /* synthetic */ java.util.List<android.hardware.camera2.params.MeteringRectangle> getInputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.camera.camera2.pipe.FrameMetadata, java.lang.Boolean> getOutputFormats;
    final /* synthetic */ long getOutputMinFrameDuration;
    final /* synthetic */ androidx.camera.camera2.pipe.graph.CameraGraphImpl getOutputMinFrameDurationlomOqCM;
    int getOutputSizes;
    final /* synthetic */ long getOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.camera.camera2.pipe.FrameMetadata, java.lang.Boolean> getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.camera.camera2.pipe.graph.Controller3A controller3A;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputSizes;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        controller3A = this.getOutputMinFrameDurationlomOqCM.getOutputStallDurationlomOqCM;
        this.getOutputSizes = 1;
        java.lang.Object m908lock3AQz1gx5w = controller3A.m908lock3AQz1gx5w(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getInputFormats, this.getHighSpeedVideoSizes, this.getOutputFormats, this.getOutputStallDurationlomOqCM, this.getHighSpeedVideoSizesFor, kotlin.coroutines.jvm.internal.Boxing.boxLong(this.getOutputMinFrameDuration), kotlin.coroutines.jvm.internal.Boxing.boxLong(this.getOutputSizeshNQ4ISI), this);
        return m908lock3AQz1gx5w == coroutine_suspended ? coroutine_suspended : m908lock3AQz1gx5w;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<? extends androidx.camera.camera2.pipe.Result3A>> continuation) {
        return ((androidx.camera.camera2.pipe.graph.CameraGraphImpl$lock3A$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.pipe.graph.CameraGraphImpl$lock3A$1(this.getOutputMinFrameDurationlomOqCM, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getInputFormats, this.getHighSpeedVideoSizes, this.getOutputFormats, this.getOutputStallDurationlomOqCM, this.getHighSpeedVideoSizesFor, this.getOutputMinFrameDuration, this.getOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CameraGraphImpl$lock3A$1(androidx.camera.camera2.pipe.graph.CameraGraphImpl cameraGraphImpl, java.util.List<android.hardware.camera2.params.MeteringRectangle> list, java.util.List<android.hardware.camera2.params.MeteringRectangle> list2, java.util.List<android.hardware.camera2.params.MeteringRectangle> list3, androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior, androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior2, androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior3, androidx.camera.camera2.pipe.AeMode aeMode, kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.FrameMetadata, java.lang.Boolean> function1, kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.FrameMetadata, java.lang.Boolean> function12, int i, long j, long j2, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.graph.CameraGraphImpl$lock3A$1> continuation) {
        super(2, continuation);
        this.getOutputMinFrameDurationlomOqCM = cameraGraphImpl;
        this.Camera2StreamConfigurationMap = list;
        this.getHighResolutionOutputSizeshNQ4ISI = list2;
        this.getInputSizeshNQ4ISI = list3;
        this.getHighSpeedVideoFpsRanges = lock3ABehavior;
        this.getHighSpeedVideoFpsRangesFor = lock3ABehavior2;
        this.getInputFormats = lock3ABehavior3;
        this.getHighSpeedVideoSizes = aeMode;
        this.getOutputFormats = function1;
        this.getOutputStallDurationlomOqCM = function12;
        this.getHighSpeedVideoSizesFor = i;
        this.getOutputMinFrameDuration = j;
        this.getOutputSizeshNQ4ISI = j2;
    }
}
