package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$submitParameters$1", f = "UseCaseCameraRequestControl.kt", i = {}, l = {365, 365}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class UseCaseCameraRequestControlImpl$submitParameters$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.camera.core.impl.Config.OptionPriority Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        if (((kotlinx.coroutines.Deferred) r8).await(r7) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r8 != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.access$setParametersInternal(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$submitParameters$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$submitParameters$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UseCaseCameraRequestControlImpl$submitParameters$1(androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl, androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type type, java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, ? extends java.lang.Object> map, androidx.camera.core.impl.Config.OptionPriority optionPriority, kotlin.coroutines.Continuation<? super androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$submitParameters$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = useCaseCameraRequestControlImpl;
        this.getHighSpeedVideoSizes = type;
        this.getHighSpeedVideoFpsRangesFor = map;
        this.Camera2StreamConfigurationMap = optionPriority;
    }
}
