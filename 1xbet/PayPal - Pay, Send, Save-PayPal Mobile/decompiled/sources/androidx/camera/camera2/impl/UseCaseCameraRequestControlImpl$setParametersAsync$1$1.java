package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Deferred;", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$setParametersAsync$1$1", f = "UseCaseCameraRequestControl.kt", i = {}, l = {351}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class UseCaseCameraRequestControlImpl$setParametersAsync$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<? extends kotlin.Unit>>, java.lang.Object> {
    final /* synthetic */ androidx.camera.core.impl.Config.OptionPriority Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoSizes = 1;
        java.lang.Object access$setParametersInternal = androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.access$setParametersInternal(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this);
        return access$setParametersInternal == coroutine_suspended ? coroutine_suspended : access$setParametersInternal;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<? extends kotlin.Unit>> continuation) {
        return ((androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$setParametersAsync$1$1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$setParametersAsync$1$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UseCaseCameraRequestControlImpl$setParametersAsync$1$1(androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl, androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type type, java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, ? extends java.lang.Object> map, androidx.camera.core.impl.Config.OptionPriority optionPriority, kotlin.coroutines.Continuation<? super androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$setParametersAsync$1$1> continuation) {
        super(1, continuation);
        this.getHighSpeedVideoFpsRanges = useCaseCameraRequestControlImpl;
        this.getHighResolutionOutputSizeshNQ4ISI = type;
        this.getHighSpeedVideoFpsRangesFor = map;
        this.Camera2StreamConfigurationMap = optionPriority;
    }
}
