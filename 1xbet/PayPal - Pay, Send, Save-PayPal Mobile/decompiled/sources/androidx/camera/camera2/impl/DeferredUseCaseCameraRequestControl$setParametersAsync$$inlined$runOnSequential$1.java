package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;", "androidx/camera/camera2/impl/DeferredUseCaseCameraRequestControl$runOnSequential$2"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl$setParametersAsync$$inlined$runOnSequential$1", f = "DeferredUseCaseCameraRequestControl.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
public final class DeferredUseCaseCameraRequestControl$setParametersAsync$$inlined$runOnSequential$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.camera.core.impl.Config.OptionPriority getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.util.Map getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoFpsRangesFor = 1;
        java.lang.Object await = androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl.access$getOrCreateImpl(this.Camera2StreamConfigurationMap).setParametersAsync(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges).await(this);
        return await == coroutine_suspended ? coroutine_suspended : await;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl$setParametersAsync$$inlined$runOnSequential$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl$setParametersAsync$$inlined$runOnSequential$1(this.Camera2StreamConfigurationMap, continuation, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeferredUseCaseCameraRequestControl$setParametersAsync$$inlined$runOnSequential$1(androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl deferredUseCaseCameraRequestControl, kotlin.coroutines.Continuation continuation, java.util.Map map, androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type type, androidx.camera.core.impl.Config.OptionPriority optionPriority) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = deferredUseCaseCameraRequestControl;
        this.getHighSpeedVideoSizes = map;
        this.getHighResolutionOutputSizeshNQ4ISI = type;
        this.getHighSpeedVideoFpsRanges = optionPriority;
    }
}
