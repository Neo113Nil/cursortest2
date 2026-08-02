package androidx.camera.camera2.pipe.framegraph;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;", "cameraGraphSession", "Landroidx/camera/camera2/pipe/CameraGraph$Session;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.framegraph.FrameGraphImpl$useSession$2", f = "FrameGraphImpl.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class FrameGraphImpl$useSession$2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, androidx.camera.camera2.pipe.CameraGraph.Session, kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, androidx.camera.camera2.pipe.FrameGraph.Session, kotlin.coroutines.Continuation<? super T>, java.lang.Object> Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.camera.camera2.pipe.framegraph.FrameGraphImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.AutoCloseable autoCloseable;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighResolutionOutputSizeshNQ4ISI;
            androidx.camera.camera2.pipe.FrameGraph.Session access$createSession = androidx.camera.camera2.pipe.framegraph.FrameGraphImpl.access$createSession(this.getHighSpeedVideoSizes, (androidx.camera.camera2.pipe.CameraGraph.Session) this.getHighSpeedVideoFpsRangesFor);
            kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, androidx.camera.camera2.pipe.FrameGraph.Session, kotlin.coroutines.Continuation<? super T>, java.lang.Object> function3 = this.Camera2StreamConfigurationMap;
            try {
                this.getHighResolutionOutputSizeshNQ4ISI = access$createSession;
                this.getHighSpeedVideoFpsRanges = 1;
                obj = function3.invoke(coroutineScope, access$createSession, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                autoCloseable = access$createSession;
            } catch (java.lang.Throwable th) {
                th = th;
                autoCloseable = access$createSession;
                throw th;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            autoCloseable = (java.lang.AutoCloseable) this.getHighResolutionOutputSizeshNQ4ISI;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
            } catch (java.lang.Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (java.lang.Throwable th3) {
                    kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable, th);
                    throw th3;
                }
            }
        }
        kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable, null);
        return obj;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.camera.camera2.pipe.CameraGraph.Session session, java.lang.Object obj) {
        androidx.camera.camera2.pipe.framegraph.FrameGraphImpl$useSession$2 frameGraphImpl$useSession$2 = new androidx.camera.camera2.pipe.framegraph.FrameGraphImpl$useSession$2(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, (kotlin.coroutines.Continuation) obj);
        frameGraphImpl$useSession$2.getHighResolutionOutputSizeshNQ4ISI = coroutineScope;
        frameGraphImpl$useSession$2.getHighSpeedVideoFpsRangesFor = session;
        return frameGraphImpl$useSession$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FrameGraphImpl$useSession$2(androidx.camera.camera2.pipe.framegraph.FrameGraphImpl frameGraphImpl, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super androidx.camera.camera2.pipe.FrameGraph.Session, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.framegraph.FrameGraphImpl$useSession$2> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoSizes = frameGraphImpl;
        this.Camera2StreamConfigurationMap = function3;
    }
}
