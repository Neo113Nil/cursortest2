package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Deferred;", "Landroidx/camera/camera2/pipe/Result3A;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$startFocusAndMeteringAsync$1$1", f = "UseCaseCameraRequestControl.kt", i = {}, l = {com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.EarnFrameEnd, 475}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class UseCaseCameraRequestControlImpl$startFocusAndMeteringAsync$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<? extends androidx.camera.camera2.pipe.Result3A>>, java.lang.Object> {
    final /* synthetic */ androidx.camera.camera2.pipe.Lock3ABehavior Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.camera.camera2.pipe.AeMode getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.util.List<android.hardware.camera2.params.MeteringRectangle> getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.util.List<android.hardware.camera2.params.MeteringRectangle> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.camera.camera2.pipe.Lock3ABehavior getHighSpeedVideoSizes;
    final /* synthetic */ java.util.List<android.hardware.camera2.params.MeteringRectangle> getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    final /* synthetic */ androidx.camera.camera2.pipe.Lock3ABehavior getInputSizeshNQ4ISI;
    long getOutputFormats;
    final /* synthetic */ long getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    int getValidOutputFormatsForInputhNQ4ISI;
    java.lang.Object isOutputSupportedFor;
    final /* synthetic */ androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl isOutputSupportedForhNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CompletableDeferred completableDeferred;
        androidx.camera.camera2.config.UseCaseGraphContext useCaseGraphContext;
        java.lang.Object acquireSession;
        androidx.camera.camera2.pipe.AeMode aeMode;
        long j;
        androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior;
        androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior2;
        androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior3;
        java.util.List<android.hardware.camera2.params.MeteringRectangle> list;
        java.util.List<android.hardware.camera2.params.MeteringRectangle> list2;
        java.util.List<android.hardware.camera2.params.MeteringRectangle> list3;
        java.lang.AutoCloseable autoCloseable;
        java.lang.AutoCloseable autoCloseable2;
        java.lang.Throwable th;
        java.lang.AutoCloseable autoCloseable3;
        androidx.camera.camera2.pipe.CameraGraph.Session session;
        java.lang.Object m385lock3AtS25XM$default;
        java.lang.Throwable th2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getValidOutputFormatsForInputhNQ4ISI;
        try {
            try {
                try {
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                        }
                        androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.isOutputSupportedForhNQ4ISI;
                        java.util.List<android.hardware.camera2.params.MeteringRectangle> list4 = this.getHighSpeedVideoFpsRangesFor;
                        java.util.List<android.hardware.camera2.params.MeteringRectangle> list5 = this.getHighSpeedVideoFpsRanges;
                        java.util.List<android.hardware.camera2.params.MeteringRectangle> list6 = this.getHighSpeedVideoSizesFor;
                        androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior4 = this.Camera2StreamConfigurationMap;
                        androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior5 = this.getHighSpeedVideoSizes;
                        androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior6 = this.getInputSizeshNQ4ISI;
                        androidx.camera.camera2.pipe.AeMode aeMode2 = this.getHighResolutionOutputSizeshNQ4ISI;
                        long j2 = this.getOutputMinFrameDuration;
                        useCaseGraphContext = useCaseCameraRequestControlImpl.getOutputMinFrameDurationlomOqCM;
                        this.getInputFormats = list4;
                        this.getOutputStallDurationlomOqCM = list5;
                        this.getOutputSizes = list6;
                        this.getOutputStallDuration = lock3ABehavior4;
                        this.getOutputSizeshNQ4ISI = lock3ABehavior5;
                        this.getOutputMinFrameDurationlomOqCM = lock3ABehavior6;
                        this.isOutputSupportedFor = aeMode2;
                        this.getOutputFormats = j2;
                        this.getValidOutputFormatsForInputhNQ4ISI = 1;
                        acquireSession = useCaseGraphContext.getGraph().acquireSession(this);
                        if (acquireSession != coroutine_suspended) {
                            aeMode = aeMode2;
                            j = j2;
                            lock3ABehavior = lock3ABehavior6;
                            lock3ABehavior2 = lock3ABehavior5;
                            lock3ABehavior3 = lock3ABehavior4;
                            list = list6;
                            list2 = list5;
                            list3 = list4;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        java.lang.AutoCloseable autoCloseable4 = (java.lang.AutoCloseable) this.getInputFormats;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            autoCloseable3 = autoCloseable4;
                            m385lock3AtS25XM$default = obj;
                        } catch (java.lang.Throwable th3) {
                            th2 = th3;
                            autoCloseable3 = autoCloseable4;
                            th = th2;
                            try {
                                throw th;
                            } catch (java.lang.Throwable th4) {
                                kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable3, th);
                                throw th4;
                            }
                        }
                        try {
                            kotlinx.coroutines.Deferred deferred = (kotlinx.coroutines.Deferred) m385lock3AtS25XM$default;
                            kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable3, null);
                            return deferred;
                        } catch (java.lang.Throwable th5) {
                            th2 = th5;
                            th = th2;
                            throw th;
                        }
                    }
                    long j3 = this.getOutputFormats;
                    androidx.camera.camera2.pipe.AeMode aeMode3 = (androidx.camera.camera2.pipe.AeMode) this.isOutputSupportedFor;
                    androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior7 = (androidx.camera.camera2.pipe.Lock3ABehavior) this.getOutputMinFrameDurationlomOqCM;
                    androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior8 = (androidx.camera.camera2.pipe.Lock3ABehavior) this.getOutputSizeshNQ4ISI;
                    androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior9 = (androidx.camera.camera2.pipe.Lock3ABehavior) this.getOutputStallDuration;
                    java.util.List<android.hardware.camera2.params.MeteringRectangle> list7 = (java.util.List) this.getOutputSizes;
                    java.util.List<android.hardware.camera2.params.MeteringRectangle> list8 = (java.util.List) this.getOutputStallDurationlomOqCM;
                    java.util.List<android.hardware.camera2.params.MeteringRectangle> list9 = (java.util.List) this.getInputFormats;
                    kotlin.ResultKt.throwOnFailure(obj);
                    aeMode = aeMode3;
                    j = j3;
                    acquireSession = obj;
                    lock3ABehavior = lock3ABehavior7;
                    list3 = list9;
                    lock3ABehavior2 = lock3ABehavior8;
                    list2 = list8;
                    lock3ABehavior3 = lock3ABehavior9;
                    list = list7;
                    m385lock3AtS25XM$default = androidx.camera.camera2.pipe.CameraGraph.Session.m385lock3AtS25XM$default(session, null, null, null, list3, list2, list, lock3ABehavior3, lock3ABehavior2, lock3ABehavior, aeMode, null, null, 0, j, j, this, 7175, null);
                    if (m385lock3AtS25XM$default != coroutine_suspended) {
                        autoCloseable3 = autoCloseable2;
                        kotlinx.coroutines.Deferred deferred2 = (kotlinx.coroutines.Deferred) m385lock3AtS25XM$default;
                        kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable3, null);
                        return deferred2;
                    }
                    return coroutine_suspended;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    th = th;
                    autoCloseable3 = autoCloseable2;
                    throw th;
                }
                session = (androidx.camera.camera2.pipe.CameraGraph.Session) autoCloseable;
                androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$startFocusAndMeteringAsync$1$1 useCaseCameraRequestControlImpl$startFocusAndMeteringAsync$1$1 = this;
                this.getInputFormats = autoCloseable;
                this.getOutputStallDurationlomOqCM = null;
                this.getOutputSizes = null;
                this.getOutputStallDuration = null;
                this.getOutputSizeshNQ4ISI = null;
                this.getOutputMinFrameDurationlomOqCM = null;
                this.isOutputSupportedFor = null;
                this.getValidOutputFormatsForInputhNQ4ISI = 2;
                autoCloseable2 = autoCloseable;
            } catch (java.lang.Throwable th7) {
                th = th7;
                autoCloseable2 = autoCloseable;
            }
            autoCloseable = (java.lang.AutoCloseable) acquireSession;
        } catch (java.util.concurrent.CancellationException e) {
            androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            }
            completableDeferred = androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.getHighSpeedVideoFpsRanges;
            return completableDeferred;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<? extends androidx.camera.camera2.pipe.Result3A>> continuation) {
        return ((androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$startFocusAndMeteringAsync$1$1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$startFocusAndMeteringAsync$1$1(this.isOutputSupportedForhNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getInputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDuration, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UseCaseCameraRequestControlImpl$startFocusAndMeteringAsync$1$1(androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl, java.util.List<android.hardware.camera2.params.MeteringRectangle> list, java.util.List<android.hardware.camera2.params.MeteringRectangle> list2, java.util.List<android.hardware.camera2.params.MeteringRectangle> list3, androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior, androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior2, androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior3, androidx.camera.camera2.pipe.AeMode aeMode, long j, kotlin.coroutines.Continuation<? super androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$startFocusAndMeteringAsync$1$1> continuation) {
        super(1, continuation);
        this.isOutputSupportedForhNQ4ISI = useCaseCameraRequestControlImpl;
        this.getHighSpeedVideoFpsRangesFor = list;
        this.getHighSpeedVideoFpsRanges = list2;
        this.getHighSpeedVideoSizesFor = list3;
        this.Camera2StreamConfigurationMap = lock3ABehavior;
        this.getHighSpeedVideoSizes = lock3ABehavior2;
        this.getInputSizeshNQ4ISI = lock3ABehavior3;
        this.getHighResolutionOutputSizeshNQ4ISI = aeMode;
        this.getOutputMinFrameDuration = j;
    }
}
