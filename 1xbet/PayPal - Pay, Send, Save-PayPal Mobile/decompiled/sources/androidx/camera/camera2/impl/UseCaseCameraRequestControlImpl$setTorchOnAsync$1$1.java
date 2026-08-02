package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Deferred;", "Landroidx/camera/camera2/pipe/Result3A;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$setTorchOnAsync$1$1", f = "UseCaseCameraRequestControl.kt", i = {}, l = {com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.EarnFrameEnd}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class UseCaseCameraRequestControlImpl$setTorchOnAsync$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<? extends androidx.camera.camera2.pipe.Result3A>>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CompletableDeferred completableDeferred;
        androidx.camera.camera2.config.UseCaseGraphContext useCaseGraphContext;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                    java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                }
                useCaseGraphContext = this.getHighSpeedVideoSizes.getOutputMinFrameDurationlomOqCM;
                this.getHighSpeedVideoFpsRanges = 1;
                obj = useCaseGraphContext.getGraph().acquireSession(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            java.lang.AutoCloseable autoCloseable = (java.lang.AutoCloseable) obj;
            try {
                androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$setTorchOnAsync$1$1 useCaseCameraRequestControlImpl$setTorchOnAsync$1$1 = this;
                kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> torchOn = ((androidx.camera.camera2.pipe.CameraGraph.Session) autoCloseable).setTorchOn();
                kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable, null);
                return torchOn;
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
        return ((androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$setTorchOnAsync$1$1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$setTorchOnAsync$1$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UseCaseCameraRequestControlImpl$setTorchOnAsync$1$1(androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl, kotlin.coroutines.Continuation<? super androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$setTorchOnAsync$1$1> continuation) {
        super(1, continuation);
        this.getHighSpeedVideoSizes = useCaseCameraRequestControlImpl;
    }
}
