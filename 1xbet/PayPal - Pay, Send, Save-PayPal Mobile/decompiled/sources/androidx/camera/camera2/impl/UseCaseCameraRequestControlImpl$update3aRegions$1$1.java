package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Deferred;", "Landroidx/camera/camera2/pipe/Result3A;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$update3aRegions$1$1", f = "UseCaseCameraRequestControl.kt", i = {}, l = {com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.EarnFrameEnd}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class UseCaseCameraRequestControlImpl$update3aRegions$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<? extends androidx.camera.camera2.pipe.Result3A>>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.util.List<android.hardware.camera2.params.MeteringRectangle> getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.util.List<android.hardware.camera2.params.MeteringRectangle> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.util.List<android.hardware.camera2.params.MeteringRectangle> getHighSpeedVideoSizes;
    java.lang.Object getInputFormats;
    final /* synthetic */ androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl getInputSizeshNQ4ISI;
    int getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CompletableDeferred completableDeferred;
        java.util.List<android.hardware.camera2.params.MeteringRectangle> list;
        androidx.camera.camera2.config.UseCaseGraphContext useCaseGraphContext;
        java.lang.Object acquireSession;
        java.util.List<android.hardware.camera2.params.MeteringRectangle> list2;
        java.util.List<android.hardware.camera2.params.MeteringRectangle> list3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                    java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                }
                androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.getInputSizeshNQ4ISI;
                java.util.List<android.hardware.camera2.params.MeteringRectangle> list4 = this.getHighSpeedVideoFpsRanges;
                list = this.getHighSpeedVideoFpsRangesFor;
                java.util.List<android.hardware.camera2.params.MeteringRectangle> list5 = this.getHighSpeedVideoSizes;
                useCaseGraphContext = useCaseCameraRequestControlImpl.getOutputMinFrameDurationlomOqCM;
                this.Camera2StreamConfigurationMap = list4;
                this.getHighResolutionOutputSizeshNQ4ISI = list;
                this.getInputFormats = list5;
                this.getOutputFormats = 1;
                acquireSession = useCaseGraphContext.getGraph().acquireSession(this);
                if (acquireSession == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list2 = list4;
                list3 = list5;
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list3 = (java.util.List) this.getInputFormats;
                java.util.List<android.hardware.camera2.params.MeteringRectangle> list6 = (java.util.List) this.getHighResolutionOutputSizeshNQ4ISI;
                list2 = (java.util.List) this.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                list = list6;
                acquireSession = obj;
            }
            java.lang.AutoCloseable autoCloseable = (java.lang.AutoCloseable) acquireSession;
            try {
                androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$update3aRegions$1$1 useCaseCameraRequestControlImpl$update3aRegions$1$1 = this;
                androidx.camera.camera2.pipe.CameraGraph.Session session = (androidx.camera.camera2.pipe.CameraGraph.Session) autoCloseable;
                if (list2 == null) {
                    list2 = kotlin.collections.ArraysKt.asList(androidx.camera.camera2.pipe.CameraGraph.Constants3A.INSTANCE.getMETERING_REGIONS_DEFAULT());
                }
                java.util.List<android.hardware.camera2.params.MeteringRectangle> list7 = list2;
                if (list == null) {
                    list = kotlin.collections.ArraysKt.asList(androidx.camera.camera2.pipe.CameraGraph.Constants3A.INSTANCE.getMETERING_REGIONS_DEFAULT());
                }
                java.util.List<android.hardware.camera2.params.MeteringRectangle> list8 = list;
                if (list3 == null) {
                    list3 = kotlin.collections.ArraysKt.asList(androidx.camera.camera2.pipe.CameraGraph.Constants3A.INSTANCE.getMETERING_REGIONS_DEFAULT());
                }
                kotlinx.coroutines.Deferred m276update3AydBZfZg$default = androidx.camera.camera2.pipe.CameraControls3A.m276update3AydBZfZg$default(session, null, null, null, list7, list8, list3, 7, null);
                kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable, null);
                return m276update3AydBZfZg$default;
            } finally {
            }
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
        return ((androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$update3aRegions$1$1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$update3aRegions$1$1(this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UseCaseCameraRequestControlImpl$update3aRegions$1$1(androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl, java.util.List<android.hardware.camera2.params.MeteringRectangle> list, java.util.List<android.hardware.camera2.params.MeteringRectangle> list2, java.util.List<android.hardware.camera2.params.MeteringRectangle> list3, kotlin.coroutines.Continuation<? super androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$update3aRegions$1$1> continuation) {
        super(1, continuation);
        this.getInputSizeshNQ4ISI = useCaseCameraRequestControlImpl;
        this.getHighSpeedVideoFpsRanges = list;
        this.getHighSpeedVideoFpsRangesFor = list2;
        this.getHighSpeedVideoSizes = list3;
    }
}
