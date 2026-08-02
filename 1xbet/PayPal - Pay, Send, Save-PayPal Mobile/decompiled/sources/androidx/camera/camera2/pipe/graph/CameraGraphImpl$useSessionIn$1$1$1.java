package androidx.camera.camera2.pipe.graph;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.graph.CameraGraphImpl$useSessionIn$1$1$1", f = "CameraGraphImpl.kt", i = {}, l = {204}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class CameraGraphImpl$useSessionIn$1$1$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, androidx.camera.camera2.pipe.CameraGraph.Session, kotlin.coroutines.Continuation<? super T>, java.lang.Object> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.camera.camera2.pipe.graph.CameraGraphSessionImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.Camera2StreamConfigurationMap;
        kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, androidx.camera.camera2.pipe.CameraGraph.Session, kotlin.coroutines.Continuation<? super T>, java.lang.Object> function3 = this.getHighSpeedVideoFpsRangesFor;
        androidx.camera.camera2.pipe.graph.CameraGraphSessionImpl cameraGraphSessionImpl = this.getHighSpeedVideoSizes;
        this.getHighSpeedVideoFpsRanges = 1;
        java.lang.Object invoke = function3.invoke(coroutineScope, cameraGraphSessionImpl, this);
        return invoke == coroutine_suspended ? coroutine_suspended : invoke;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Object obj) {
        return ((androidx.camera.camera2.pipe.graph.CameraGraphImpl$useSessionIn$1$1$1) create(coroutineScope, (kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.camera.camera2.pipe.graph.CameraGraphImpl$useSessionIn$1$1$1 cameraGraphImpl$useSessionIn$1$1$1 = new androidx.camera.camera2.pipe.graph.CameraGraphImpl$useSessionIn$1$1$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
        cameraGraphImpl$useSessionIn$1$1$1.Camera2StreamConfigurationMap = obj;
        return cameraGraphImpl$useSessionIn$1$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CameraGraphImpl$useSessionIn$1$1$1(kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super androidx.camera.camera2.pipe.CameraGraph.Session, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function3, androidx.camera.camera2.pipe.graph.CameraGraphSessionImpl cameraGraphSessionImpl, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.graph.CameraGraphImpl$useSessionIn$1$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = function3;
        this.getHighSpeedVideoSizes = cameraGraphSessionImpl;
    }
}
