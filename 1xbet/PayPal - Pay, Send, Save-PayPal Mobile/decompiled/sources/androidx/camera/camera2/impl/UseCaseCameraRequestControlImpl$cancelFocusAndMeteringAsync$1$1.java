package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Deferred;", "Landroidx/camera/camera2/pipe/Result3A;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$cancelFocusAndMeteringAsync$1$1", f = "UseCaseCameraRequestControl.kt", i = {}, l = {com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.EarnFrameEnd, 497, 497, 761}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class UseCaseCameraRequestControlImpl$cancelFocusAndMeteringAsync$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<? extends androidx.camera.camera2.pipe.Result3A>>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl getHighSpeedVideoFpsRanges;

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e4, code lost:
    
        if (r0.await(r20) != r13) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0070, code lost:
    
        if (r0 != r13) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d0  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v3 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CompletableDeferred completableDeferred;
        kotlinx.coroutines.CompletableDeferred completableDeferred2;
        kotlinx.coroutines.CompletableDeferred completableDeferred3;
        java.lang.Throwable th;
        java.lang.Throwable th2;
        androidx.camera.camera2.config.UseCaseGraphContext useCaseGraphContext;
        java.lang.Object acquireSession;
        java.lang.Throwable th3;
        androidx.camera.camera2.config.UseCaseGraphContext useCaseGraphContext2;
        java.lang.Object acquireSession2;
        java.lang.AutoCloseable autoCloseable;
        java.lang.AutoCloseable autoCloseable2;
        java.lang.Throwable th4;
        java.lang.Throwable th5;
        java.lang.AutoCloseable autoCloseable3;
        androidx.camera.camera2.pipe.CameraGraph.Session session;
        java.lang.Boolean boxBoolean;
        java.lang.Boolean boxBoolean2;
        java.lang.Boolean boxBoolean3;
        java.lang.Object unlock3A$default;
        java.lang.AutoCloseable autoCloseable4;
        java.lang.Throwable th6;
        java.lang.Throwable th7;
        java.lang.Throwable th8;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        ?? r14 = 4;
        try {
            try {
                try {
                } catch (java.util.concurrent.CancellationException e) {
                    e = e;
                    androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                    if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                        java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                    }
                    completableDeferred2 = androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.getHighSpeedVideoFpsRanges;
                    completableDeferred3 = completableDeferred2;
                    th = r14;
                    this.getHighResolutionOutputSizeshNQ4ISI = th;
                    this.Camera2StreamConfigurationMap = 3;
                    th2 = th;
                }
            } catch (java.util.concurrent.CancellationException e2) {
                androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                    java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                }
                completableDeferred = androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.getHighSpeedVideoFpsRanges;
                return completableDeferred;
            }
        } catch (java.util.concurrent.CancellationException e3) {
            e = e3;
            r14 = 0;
            androidx.camera.camera2.impl.Camera2Logger camera2Logger3 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            }
            completableDeferred2 = androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.getHighSpeedVideoFpsRanges;
            completableDeferred3 = completableDeferred2;
            th = r14;
            this.getHighResolutionOutputSizeshNQ4ISI = th;
            this.Camera2StreamConfigurationMap = 3;
            th2 = th;
        }
        try {
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.camera.camera2.impl.Camera2Logger camera2Logger4 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                    if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                        java.lang.String unused3 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                    }
                    useCaseGraphContext2 = this.getHighSpeedVideoFpsRanges.getOutputMinFrameDurationlomOqCM;
                    this.Camera2StreamConfigurationMap = 1;
                    acquireSession2 = useCaseGraphContext2.getGraph().acquireSession(this);
                } else if (i == 1) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    acquireSession2 = obj;
                } else if (i == 2) {
                    autoCloseable4 = (java.lang.AutoCloseable) this.getHighResolutionOutputSizeshNQ4ISI;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        unlock3A$default = obj;
                        th8 = null;
                        try {
                            completableDeferred3 = (kotlinx.coroutines.Deferred) unlock3A$default;
                            kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable4, th8);
                            th = th8;
                            this.getHighResolutionOutputSizeshNQ4ISI = th;
                            this.Camera2StreamConfigurationMap = 3;
                            th2 = th;
                        } catch (java.lang.Throwable th9) {
                            th7 = th9;
                            autoCloseable3 = autoCloseable4;
                            th6 = th8;
                            th5 = th7;
                            r14 = th6;
                            try {
                                throw th5;
                            } catch (java.lang.Throwable th10) {
                                kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable3, th5);
                                throw th10;
                            }
                        }
                    } catch (java.lang.Throwable th11) {
                        th7 = th11;
                        autoCloseable3 = autoCloseable4;
                        th6 = null;
                        th5 = th7;
                        r14 = th6;
                        throw th5;
                    }
                } else {
                    if (i == 3) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        th2 = null;
                        useCaseGraphContext = this.getHighSpeedVideoFpsRanges.getOutputMinFrameDurationlomOqCM;
                        this.Camera2StreamConfigurationMap = 4;
                        acquireSession = useCaseGraphContext.getGraph().acquireSession(this);
                        th3 = th2;
                        if (acquireSession == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        java.lang.AutoCloseable autoCloseable5 = (java.lang.AutoCloseable) acquireSession;
                        androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$cancelFocusAndMeteringAsync$1$1 useCaseCameraRequestControlImpl$cancelFocusAndMeteringAsync$1$1 = this;
                        kotlinx.coroutines.Deferred m276update3AydBZfZg$default = androidx.camera.camera2.pipe.CameraControls3A.m276update3AydBZfZg$default((androidx.camera.camera2.pipe.CameraGraph.Session) autoCloseable5, null, null, null, kotlin.collections.ArraysKt.asList(androidx.camera.camera2.pipe.CameraGraph.Constants3A.INSTANCE.getMETERING_REGIONS_DEFAULT()), kotlin.collections.ArraysKt.asList(androidx.camera.camera2.pipe.CameraGraph.Constants3A.INSTANCE.getMETERING_REGIONS_DEFAULT()), kotlin.collections.ArraysKt.asList(androidx.camera.camera2.pipe.CameraGraph.Constants3A.INSTANCE.getMETERING_REGIONS_DEFAULT()), 7, null);
                        kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable5, th3);
                        return m276update3AydBZfZg$default;
                    }
                    if (i != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    acquireSession = obj;
                    th3 = null;
                    java.lang.AutoCloseable autoCloseable52 = (java.lang.AutoCloseable) acquireSession;
                    try {
                        androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$cancelFocusAndMeteringAsync$1$1 useCaseCameraRequestControlImpl$cancelFocusAndMeteringAsync$1$12 = this;
                        kotlinx.coroutines.Deferred m276update3AydBZfZg$default2 = androidx.camera.camera2.pipe.CameraControls3A.m276update3AydBZfZg$default((androidx.camera.camera2.pipe.CameraGraph.Session) autoCloseable52, null, null, null, kotlin.collections.ArraysKt.asList(androidx.camera.camera2.pipe.CameraGraph.Constants3A.INSTANCE.getMETERING_REGIONS_DEFAULT()), kotlin.collections.ArraysKt.asList(androidx.camera.camera2.pipe.CameraGraph.Constants3A.INSTANCE.getMETERING_REGIONS_DEFAULT()), kotlin.collections.ArraysKt.asList(androidx.camera.camera2.pipe.CameraGraph.Constants3A.INSTANCE.getMETERING_REGIONS_DEFAULT()), 7, null);
                        kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable52, th3);
                        return m276update3AydBZfZg$default2;
                    } finally {
                    }
                }
                unlock3A$default = androidx.camera.camera2.pipe.CameraGraph.Session.unlock3A$default(session, boxBoolean, boxBoolean2, boxBoolean3, null, 0, 0L, this, 56, null);
                if (unlock3A$default != coroutine_suspended) {
                    autoCloseable4 = autoCloseable2;
                    th8 = th4;
                    completableDeferred3 = (kotlinx.coroutines.Deferred) unlock3A$default;
                    kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable4, th8);
                    th = th8;
                    this.getHighResolutionOutputSizeshNQ4ISI = th;
                    this.Camera2StreamConfigurationMap = 3;
                    th2 = th;
                }
                return coroutine_suspended;
            } catch (java.lang.Throwable th12) {
                th = th12;
                th5 = th;
                autoCloseable3 = autoCloseable2;
                r14 = th4;
                throw th5;
            }
            session = (androidx.camera.camera2.pipe.CameraGraph.Session) autoCloseable;
            androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$cancelFocusAndMeteringAsync$1$1 useCaseCameraRequestControlImpl$cancelFocusAndMeteringAsync$1$13 = this;
            boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
            boxBoolean2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
            boxBoolean3 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
            this.getHighResolutionOutputSizeshNQ4ISI = autoCloseable;
            this.Camera2StreamConfigurationMap = 2;
            autoCloseable2 = autoCloseable;
            th4 = null;
        } catch (java.lang.Throwable th13) {
            th = th13;
            autoCloseable2 = autoCloseable;
            th4 = null;
        }
        autoCloseable = (java.lang.AutoCloseable) acquireSession2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<? extends androidx.camera.camera2.pipe.Result3A>> continuation) {
        return ((androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$cancelFocusAndMeteringAsync$1$1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$cancelFocusAndMeteringAsync$1$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UseCaseCameraRequestControlImpl$cancelFocusAndMeteringAsync$1$1(androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl, kotlin.coroutines.Continuation<? super androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$cancelFocusAndMeteringAsync$1$1> continuation) {
        super(1, continuation);
        this.getHighSpeedVideoFpsRanges = useCaseCameraRequestControlImpl;
    }
}
