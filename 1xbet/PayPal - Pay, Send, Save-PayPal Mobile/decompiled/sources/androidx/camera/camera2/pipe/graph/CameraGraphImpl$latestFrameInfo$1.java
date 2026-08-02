package androidx.camera.camera2.pipe.graph;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Landroidx/camera/camera2/pipe/FrameInfo;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.graph.CameraGraphImpl$latestFrameInfo$1", f = "CameraGraphImpl.kt", i = {}, l = {143}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class CameraGraphImpl$latestFrameInfo$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super androidx.camera.camera2.pipe.FrameInfo>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.camera.camera2.pipe.graph.CameraGraphImpl getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighResolutionOutputSizeshNQ4ISI;
            final androidx.camera.camera2.pipe.graph.LatestFrameInfoListener latestFrameInfoListener = new androidx.camera.camera2.pipe.graph.LatestFrameInfoListener(new kotlin.jvm.functions.Function1() { // from class: androidx.camera.camera2.pipe.graph.CameraGraphImpl$latestFrameInfo$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return androidx.camera.camera2.pipe.graph.CameraGraphImpl$latestFrameInfo$1.getHighSpeedVideoFpsRanges(kotlinx.coroutines.channels.ProducerScope.this, (androidx.camera.camera2.pipe.FrameInfo) obj2);
                }
            });
            this.getHighSpeedVideoFpsRanges.getListeners().add(latestFrameInfoListener);
            final androidx.camera.camera2.pipe.graph.CameraGraphImpl cameraGraphImpl = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (kotlinx.coroutines.channels.ProduceKt.awaitClose(producerScope, new kotlin.jvm.functions.Function0() { // from class: androidx.camera.camera2.pipe.graph.CameraGraphImpl$latestFrameInfo$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.camera.camera2.pipe.graph.CameraGraphImpl$latestFrameInfo$1.getHighSpeedVideoFpsRangesFor(androidx.camera.camera2.pipe.graph.CameraGraphImpl.this, latestFrameInfoListener);
                }
            }, this) == coroutine_suspended) {
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

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.camera.camera2.pipe.graph.CameraGraphImpl cameraGraphImpl, androidx.camera.camera2.pipe.graph.LatestFrameInfoListener latestFrameInfoListener) {
        cameraGraphImpl.getListeners().remove(latestFrameInfoListener);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(kotlinx.coroutines.channels.ProducerScope producerScope, androidx.camera.camera2.pipe.FrameInfo frameInfo) {
        producerScope.mo9266trySendJP2dKIU(frameInfo);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super androidx.camera.camera2.pipe.FrameInfo> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.camera2.pipe.graph.CameraGraphImpl$latestFrameInfo$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.camera.camera2.pipe.graph.CameraGraphImpl$latestFrameInfo$1 cameraGraphImpl$latestFrameInfo$1 = new androidx.camera.camera2.pipe.graph.CameraGraphImpl$latestFrameInfo$1(this.getHighSpeedVideoFpsRanges, continuation);
        cameraGraphImpl$latestFrameInfo$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return cameraGraphImpl$latestFrameInfo$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraGraphImpl$latestFrameInfo$1(androidx.camera.camera2.pipe.graph.CameraGraphImpl cameraGraphImpl, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.graph.CameraGraphImpl$latestFrameInfo$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = cameraGraphImpl;
    }
}
