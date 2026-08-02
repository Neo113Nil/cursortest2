package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "androidx/camera/camera2/impl/UseCaseThreads$confineLaunch$1"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.UseCaseCameraImpl$start$$inlined$confineLaunch$1", f = "UseCaseCamera.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
public final class UseCaseCameraImpl$start$$inlined$confineLaunch$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.camera.camera2.impl.UseCaseCameraImpl Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.atomicfu.AtomicBoolean atomicBoolean;
        androidx.camera.camera2.config.UseCaseGraphContext useCaseGraphContext;
        androidx.camera.camera2.config.UseCaseGraphContext useCaseGraphContext2;
        androidx.camera.camera2.config.UseCaseGraphContext useCaseGraphContext3;
        androidx.camera.camera2.adapter.SessionConfigAdapter highResolutionOutputSizeshNQ4ISI;
        androidx.camera.camera2.impl.UseCaseSurfaceManager highSpeedVideoSizes;
        androidx.camera.camera2.adapter.SessionConfigAdapter highResolutionOutputSizeshNQ4ISI2;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            atomicBoolean = this.Camera2StreamConfigurationMap.getInputSizeshNQ4ISI;
            if (!atomicBoolean.getValue()) {
                useCaseGraphContext = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
                androidx.camera.camera2.pipe.CameraGraph graph = useCaseGraphContext.getGraph();
                useCaseGraphContext2 = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
                useCaseGraphContext2.configureCameraStateListener();
                graph.start();
                useCaseGraphContext3 = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
                java.util.Map<androidx.camera.core.impl.DeferrableSurface, androidx.camera.camera2.pipe.StreamId> surfaceToStreamMap = useCaseGraphContext3.getSurfaceToStreamMap();
                androidx.camera.camera2.pipe.StreamId m135access$findStillCaptureStreamId4TVKcYk = androidx.camera.camera2.impl.UseCaseCameraImpl.m135access$findStillCaptureStreamId4TVKcYk(this.Camera2StreamConfigurationMap);
                androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                    java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                }
                highResolutionOutputSizeshNQ4ISI = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI();
                if (highResolutionOutputSizeshNQ4ISI.isSessionConfigValid()) {
                    highSpeedVideoSizes = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(highSpeedVideoSizes, "");
                    highResolutionOutputSizeshNQ4ISI2 = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(highResolutionOutputSizeshNQ4ISI2, "");
                    androidx.camera.camera2.impl.UseCaseSurfaceManager.setupAsync$default(highSpeedVideoSizes, graph, highResolutionOutputSizeshNQ4ISI2, surfaceToStreamMap, 0L, 8, null).invokeOnCompletion(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: androidx.camera.camera2.impl.UseCaseCameraImpl$start$1$3
                        @Override // kotlin.jvm.functions.Function1
                        public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                            java.lang.Throwable th2 = th;
                            if (th2 != null && !(th2 instanceof java.util.concurrent.CancellationException)) {
                                androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                                if (androidx.camera.core.Logger.isErrorEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                    java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                                }
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    });
                } else {
                    androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                    if (androidx.camera.core.Logger.isErrorEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                        java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                    }
                }
                androidx.camera.camera2.impl.UseCaseCameraImpl.m136access$setCaptureSessionRequestProcessor9O56998(this.Camera2StreamConfigurationMap, m135access$findStillCaptureStreamId4TVKcYk, graph);
            } else {
                androidx.camera.camera2.impl.Camera2Logger camera2Logger3 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                    java.lang.String unused3 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                }
            }
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.camera2.impl.UseCaseCameraImpl$start$$inlined$confineLaunch$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.impl.UseCaseCameraImpl$start$$inlined$confineLaunch$1(continuation, this.Camera2StreamConfigurationMap);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UseCaseCameraImpl$start$$inlined$confineLaunch$1(kotlin.coroutines.Continuation continuation, androidx.camera.camera2.impl.UseCaseCameraImpl useCaseCameraImpl) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = useCaseCameraImpl;
    }
}
