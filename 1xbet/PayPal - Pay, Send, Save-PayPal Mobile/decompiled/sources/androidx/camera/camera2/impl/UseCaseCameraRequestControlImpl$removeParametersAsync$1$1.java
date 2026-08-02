package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Deferred;", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$removeParametersAsync$1$1", f = "UseCaseCameraRequestControl.kt", i = {}, l = {394}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class UseCaseCameraRequestControlImpl$removeParametersAsync$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<? extends kotlin.Unit>>, java.lang.Object> {
    final /* synthetic */ androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.util.List<android.hardware.camera2.CaptureRequest.Key<?>> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.Map map;
        java.util.Map map2;
        java.util.Map map3;
        androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.InfoBundle Camera2StreamConfigurationMap;
        java.lang.Object Camera2StreamConfigurationMap2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
        }
        map = this.Camera2StreamConfigurationMap.getOutputFormats;
        androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type type = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object obj2 = map.get(type);
        if (obj2 == null) {
            obj2 = new androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.InfoBundle(null, null, null, null, 15, null);
            map.put(type, obj2);
        }
        map2 = this.Camera2StreamConfigurationMap.getOutputFormats;
        map2.put(this.getHighResolutionOutputSizeshNQ4ISI, androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.access$withoutParameters(this.Camera2StreamConfigurationMap, (androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.InfoBundle) obj2, this.getHighSpeedVideoSizes));
        androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.Camera2StreamConfigurationMap;
        map3 = useCaseCameraRequestControlImpl.getOutputFormats;
        Camera2StreamConfigurationMap = androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.Camera2StreamConfigurationMap(map3);
        this.getHighSpeedVideoFpsRanges = 1;
        Camera2StreamConfigurationMap2 = useCaseCameraRequestControlImpl.Camera2StreamConfigurationMap(Camera2StreamConfigurationMap, null, this);
        return Camera2StreamConfigurationMap2 == coroutine_suspended ? coroutine_suspended : Camera2StreamConfigurationMap2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<? extends kotlin.Unit>> continuation) {
        return ((androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$removeParametersAsync$1$1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$removeParametersAsync$1$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UseCaseCameraRequestControlImpl$removeParametersAsync$1$1(androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl, androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type type, java.util.List<? extends android.hardware.camera2.CaptureRequest.Key<?>> list, kotlin.coroutines.Continuation<? super androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$removeParametersAsync$1$1> continuation) {
        super(1, continuation);
        this.Camera2StreamConfigurationMap = useCaseCameraRequestControlImpl;
        this.getHighResolutionOutputSizeshNQ4ISI = type;
        this.getHighSpeedVideoSizes = list;
    }
}
