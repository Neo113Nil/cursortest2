package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/Deferred;", "Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$issueSingleCaptureAsync$1$1", f = "UseCaseCameraRequestControl.kt", i = {}, l = {530}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class UseCaseCameraRequestControlImpl$issueSingleCaptureAsync$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super java.util.List<? extends kotlinx.coroutines.Deferred<? extends java.lang.Void>>>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ int getHighSpeedVideoFpsRanges;
    final /* synthetic */ int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.util.List<androidx.camera.core.impl.CaptureConfig> getHighSpeedVideoSizes;
    final /* synthetic */ androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.Map map;
        androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.InfoBundle Camera2StreamConfigurationMap;
        androidx.camera.camera2.impl.CapturePipeline Camera2StreamConfigurationMap2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            }
            if (androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.access$hasInvalidSurface(this.getInputFormats, this.getHighSpeedVideoSizes)) {
                androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.getInputFormats;
                androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes.size(), "Capture request failed due to invalid surface");
            }
            map = this.getInputFormats.getOutputFormats;
            Camera2StreamConfigurationMap = androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.Camera2StreamConfigurationMap(map);
            androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl2 = this.getInputFormats;
            java.util.List<androidx.camera.core.impl.CaptureConfig> list = this.getHighSpeedVideoSizes;
            int i2 = this.getHighSpeedVideoFpsRangesFor;
            int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i4 = this.getHighSpeedVideoFpsRanges;
            androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            }
            Camera2StreamConfigurationMap2 = useCaseCameraRequestControlImpl2.Camera2StreamConfigurationMap();
            androidx.camera.camera2.pipe.RequestTemplate requestTemplate = Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.checkNotNull(requestTemplate);
            int m686unboximpl = requestTemplate.m686unboximpl();
            androidx.camera.camera2.impl.Camera2ImplConfig build = Camera2StreamConfigurationMap.getCamera2StreamConfigurationMap().build();
            this.Camera2StreamConfigurationMap = 1;
            obj = Camera2StreamConfigurationMap2.mo73submitStillCapturesBvXKQx0(list, m686unboximpl, build, i2, i3, i4, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return (java.util.List) obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super java.util.List<? extends kotlinx.coroutines.Deferred<? extends java.lang.Void>>> continuation) {
        return ((androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$issueSingleCaptureAsync$1$1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$issueSingleCaptureAsync$1$1(this.getInputFormats, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UseCaseCameraRequestControlImpl$issueSingleCaptureAsync$1$1(androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl, java.util.List<androidx.camera.core.impl.CaptureConfig> list, int i, int i2, int i3, kotlin.coroutines.Continuation<? super androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$issueSingleCaptureAsync$1$1> continuation) {
        super(1, continuation);
        this.getInputFormats = useCaseCameraRequestControlImpl;
        this.getHighSpeedVideoSizes = list;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
        this.getHighSpeedVideoFpsRanges = i3;
    }
}
