package androidx.camera.camera2.pipe.graph;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Landroidx/camera/camera2/pipe/FrameNumber;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.graph.CameraGraphImpl$latestFrameNumber$1", f = "CameraGraphImpl.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class CameraGraphImpl$latestFrameNumber$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super androidx.camera.camera2.pipe.FrameNumber>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.camera.camera2.pipe.graph.CameraGraphImpl getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoFpsRanges;
            final androidx.camera.camera2.pipe.graph.LatestFrameNumberListener latestFrameNumberListener = new androidx.camera.camera2.pipe.graph.LatestFrameNumberListener(new kotlin.jvm.functions.Function1() { // from class: androidx.camera.camera2.pipe.graph.CameraGraphImpl$latestFrameNumber$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return androidx.camera.camera2.pipe.graph.CameraGraphImpl$latestFrameNumber$1.Camera2StreamConfigurationMap(kotlinx.coroutines.channels.ProducerScope.this, (androidx.camera.camera2.pipe.FrameNumber) obj2);
                }
            });
            this.getHighResolutionOutputSizeshNQ4ISI.getListeners().add(latestFrameNumberListener);
            final androidx.camera.camera2.pipe.graph.CameraGraphImpl cameraGraphImpl = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (kotlinx.coroutines.channels.ProduceKt.awaitClose(producerScope, new kotlin.jvm.functions.Function0() { // from class: androidx.camera.camera2.pipe.graph.CameraGraphImpl$latestFrameNumber$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.camera.camera2.pipe.graph.CameraGraphImpl$latestFrameNumber$1.getHighSpeedVideoFpsRanges(androidx.camera.camera2.pipe.graph.CameraGraphImpl.this, latestFrameNumberListener);
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

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(kotlinx.coroutines.channels.ProducerScope producerScope, androidx.camera.camera2.pipe.FrameNumber frameNumber) {
        producerScope.mo9266trySendJP2dKIU(frameNumber);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(androidx.camera.camera2.pipe.graph.CameraGraphImpl cameraGraphImpl, androidx.camera.camera2.pipe.graph.LatestFrameNumberListener latestFrameNumberListener) {
        cameraGraphImpl.getListeners().remove(latestFrameNumberListener);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super androidx.camera.camera2.pipe.FrameNumber> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.camera2.pipe.graph.CameraGraphImpl$latestFrameNumber$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.camera.camera2.pipe.graph.CameraGraphImpl$latestFrameNumber$1 cameraGraphImpl$latestFrameNumber$1 = new androidx.camera.camera2.pipe.graph.CameraGraphImpl$latestFrameNumber$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        cameraGraphImpl$latestFrameNumber$1.getHighSpeedVideoFpsRanges = obj;
        return cameraGraphImpl$latestFrameNumber$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraGraphImpl$latestFrameNumber$1(androidx.camera.camera2.pipe.graph.CameraGraphImpl cameraGraphImpl, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.graph.CameraGraphImpl$latestFrameNumber$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = cameraGraphImpl;
    }
}
