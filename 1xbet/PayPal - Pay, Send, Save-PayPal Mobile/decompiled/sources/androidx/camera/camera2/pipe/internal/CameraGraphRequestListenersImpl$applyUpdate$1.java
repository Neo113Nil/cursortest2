package androidx.camera.camera2.pipe.internal;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Landroidx/camera/camera2/pipe/core/Token;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.internal.CameraGraphRequestListenersImpl$applyUpdate$1", f = "CameraGraphRequestListenersImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class CameraGraphRequestListenersImpl$applyUpdate$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.camera.camera2.pipe.core.Token, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.util.List<androidx.camera.camera2.pipe.Request.Listener> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.camera.camera2.pipe.internal.CameraGraphRequestListenersImpl getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.camera.camera2.pipe.graph.GraphProcessor graphProcessor;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            graphProcessor = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
            graphProcessor.updateRequestListeners(this.getHighSpeedVideoFpsRanges);
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.camera.camera2.pipe.core.Token token, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.camera2.pipe.internal.CameraGraphRequestListenersImpl$applyUpdate$1) create(token, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.pipe.internal.CameraGraphRequestListenersImpl$applyUpdate$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CameraGraphRequestListenersImpl$applyUpdate$1(androidx.camera.camera2.pipe.internal.CameraGraphRequestListenersImpl cameraGraphRequestListenersImpl, java.util.List<? extends androidx.camera.camera2.pipe.Request.Listener> list, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.internal.CameraGraphRequestListenersImpl$applyUpdate$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = cameraGraphRequestListenersImpl;
        this.getHighSpeedVideoFpsRanges = list;
    }
}
