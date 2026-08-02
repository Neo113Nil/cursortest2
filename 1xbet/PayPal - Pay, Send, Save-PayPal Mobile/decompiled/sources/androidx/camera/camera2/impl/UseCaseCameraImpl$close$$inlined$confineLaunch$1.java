package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "androidx/camera/camera2/impl/UseCaseThreads$confineLaunch$1"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.UseCaseCameraImpl$close$$inlined$confineLaunch$1", f = "UseCaseCamera.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
public final class UseCaseCameraImpl$close$$inlined$confineLaunch$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.camera.camera2.impl.UseCaseCameraImpl getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.camera.core.impl.SessionProcessor sessionProcessor;
        androidx.camera.camera2.config.UseCaseGraphContext useCaseGraphContext;
        androidx.camera.camera2.impl.UseCaseSurfaceManager highSpeedVideoSizes;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            }
            sessionProcessor = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
            if (sessionProcessor != null) {
                sessionProcessor.setCaptureSessionRequestProcessor(null);
            }
            useCaseGraphContext = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
            useCaseGraphContext.closeGraph();
            highSpeedVideoSizes = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes();
            kotlinx.coroutines.Deferred<kotlin.Unit> stopAsync = highSpeedVideoSizes.stopAsync();
            this.Camera2StreamConfigurationMap = 1;
            if (stopAsync.await(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.camera2.impl.UseCaseCameraImpl$close$$inlined$confineLaunch$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.impl.UseCaseCameraImpl$close$$inlined$confineLaunch$1(continuation, this.getHighSpeedVideoFpsRanges);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UseCaseCameraImpl$close$$inlined$confineLaunch$1(kotlin.coroutines.Continuation continuation, androidx.camera.camera2.impl.UseCaseCameraImpl useCaseCameraImpl) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = useCaseCameraImpl;
    }
}
