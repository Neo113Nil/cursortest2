package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Deferred;", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$updateCamera2ConfigAsync$1$1", f = "UseCaseCameraRequestControl.kt", i = {}, l = {441}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class UseCaseCameraRequestControlImpl$updateCamera2ConfigAsync$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<? extends kotlin.Unit>>, java.lang.Object> {
    final /* synthetic */ java.util.Map<java.lang.String, java.lang.Object> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.camera.core.impl.Config getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.Map map;
        java.util.Map map2;
        androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.InfoBundle Camera2StreamConfigurationMap;
        java.lang.Object Camera2StreamConfigurationMap2;
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
        androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
        }
        map = this.getHighSpeedVideoFpsRanges.getOutputFormats;
        map.put(androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type.CAMERA2_CAMERA_CONTROL, new androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.InfoBundle(androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.Companion.access$extractCamera2ImplConfigBuilder(androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.INSTANCE, this.getHighSpeedVideoSizes), kotlin.collections.MapsKt.toMutableMap(this.Camera2StreamConfigurationMap), null, null, 12, null));
        androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.getHighSpeedVideoFpsRanges;
        map2 = useCaseCameraRequestControlImpl.getOutputFormats;
        Camera2StreamConfigurationMap = androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.Camera2StreamConfigurationMap(map2);
        this.getHighSpeedVideoFpsRangesFor = 1;
        Camera2StreamConfigurationMap2 = useCaseCameraRequestControlImpl.Camera2StreamConfigurationMap(Camera2StreamConfigurationMap, null, this);
        return Camera2StreamConfigurationMap2 == coroutine_suspended ? coroutine_suspended : Camera2StreamConfigurationMap2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<? extends kotlin.Unit>> continuation) {
        return ((androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$updateCamera2ConfigAsync$1$1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$updateCamera2ConfigAsync$1$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UseCaseCameraRequestControlImpl$updateCamera2ConfigAsync$1$1(androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl, androidx.camera.core.impl.Config config, java.util.Map<java.lang.String, ? extends java.lang.Object> map, kotlin.coroutines.Continuation<? super androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$updateCamera2ConfigAsync$1$1> continuation) {
        super(1, continuation);
        this.getHighSpeedVideoFpsRanges = useCaseCameraRequestControlImpl;
        this.getHighSpeedVideoSizes = config;
        this.Camera2StreamConfigurationMap = map;
    }
}
