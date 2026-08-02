package androidx.camera.camera2.pipe.graph;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "T", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "Landroidx/camera/camera2/pipe/core/Token;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.graph.CameraGraphImpl$useSessionIn$1", f = "CameraGraphImpl.kt", i = {}, l = {204}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class CameraGraphImpl$useSessionIn$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.camera.camera2.pipe.core.Token, kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.camera.camera2.pipe.graph.CameraGraphImpl getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, androidx.camera.camera2.pipe.CameraGraph.Session, kotlin.coroutines.Continuation<? super T>, java.lang.Object> getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.camera.camera2.pipe.graph.CameraGraphSessionImpl highSpeedVideoFpsRanges;
        java.lang.AutoCloseable autoCloseable;
        java.lang.Throwable th;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            highSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges((androidx.camera.camera2.pipe.core.Token) this.Camera2StreamConfigurationMap);
            androidx.camera.camera2.pipe.graph.CameraGraphSessionImpl cameraGraphSessionImpl = highSpeedVideoFpsRanges;
            try {
                androidx.camera.camera2.pipe.graph.CameraGraphImpl$useSessionIn$1$1$1 cameraGraphImpl$useSessionIn$1$1$1 = new androidx.camera.camera2.pipe.graph.CameraGraphImpl$useSessionIn$1$1$1(this.getHighSpeedVideoFpsRangesFor, cameraGraphSessionImpl, null);
                this.Camera2StreamConfigurationMap = cameraGraphSessionImpl;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(cameraGraphImpl$useSessionIn$1$1$1, this);
                if (coroutineScope == coroutine_suspended) {
                    return coroutine_suspended;
                }
                autoCloseable = cameraGraphSessionImpl;
                obj = coroutineScope;
            } catch (java.lang.Throwable th2) {
                autoCloseable = cameraGraphSessionImpl;
                th = th2;
                throw th;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            autoCloseable = (java.lang.AutoCloseable) this.Camera2StreamConfigurationMap;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
            } catch (java.lang.Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (java.lang.Throwable th4) {
                    kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable, th);
                    throw th4;
                }
            }
        }
        kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable, null);
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.camera.camera2.pipe.core.Token token, java.lang.Object obj) {
        return ((androidx.camera.camera2.pipe.graph.CameraGraphImpl$useSessionIn$1) create(token, (kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.camera.camera2.pipe.graph.CameraGraphImpl$useSessionIn$1 cameraGraphImpl$useSessionIn$1 = new androidx.camera.camera2.pipe.graph.CameraGraphImpl$useSessionIn$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
        cameraGraphImpl$useSessionIn$1.Camera2StreamConfigurationMap = obj;
        return cameraGraphImpl$useSessionIn$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CameraGraphImpl$useSessionIn$1(androidx.camera.camera2.pipe.graph.CameraGraphImpl cameraGraphImpl, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super androidx.camera.camera2.pipe.CameraGraph.Session, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.graph.CameraGraphImpl$useSessionIn$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = cameraGraphImpl;
        this.getHighSpeedVideoFpsRangesFor = function3;
    }
}
