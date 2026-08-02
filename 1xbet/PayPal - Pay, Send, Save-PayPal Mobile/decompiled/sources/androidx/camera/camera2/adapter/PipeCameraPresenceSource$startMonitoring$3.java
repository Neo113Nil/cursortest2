package androidx.camera.camera2.adapter;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Landroidx/camera/core/CameraIdentifier;", "e", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$3", f = "PipeCameraPresenceSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class PipeCameraPresenceSource$startMonitoring$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super java.util.List<? extends androidx.camera.core.CameraIdentifier>>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.camera.camera2.adapter.PipeCameraPresenceSource Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.Throwable th = (java.lang.Throwable) this.getHighSpeedVideoSizes;
            atomicBoolean = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
            if (atomicBoolean.get()) {
                this.Camera2StreamConfigurationMap.updateError(th);
            } else {
                kotlin.coroutines.jvm.internal.Boxing.boxInt(android.util.Log.d("PipePresenceSrc", "Ignoring error because monitoring is stopped."));
            }
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super java.util.List<? extends androidx.camera.core.CameraIdentifier>> flowCollector, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$3 pipeCameraPresenceSource$startMonitoring$3 = new androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$3(this.Camera2StreamConfigurationMap, continuation);
        pipeCameraPresenceSource$startMonitoring$3.getHighSpeedVideoSizes = th;
        return pipeCameraPresenceSource$startMonitoring$3.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PipeCameraPresenceSource$startMonitoring$3(androidx.camera.camera2.adapter.PipeCameraPresenceSource pipeCameraPresenceSource, kotlin.coroutines.Continuation<? super androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$3> continuation) {
        super(3, continuation);
        this.Camera2StreamConfigurationMap = pipeCameraPresenceSource;
    }
}
