package androidx.camera.camera2.adapter;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "identifiers", "", "Landroidx/camera/core/CameraIdentifier;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$2", f = "PipeCameraPresenceSource.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class PipeCameraPresenceSource$startMonitoring$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.util.List<? extends androidx.camera.core.CameraIdentifier>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.camera.camera2.adapter.PipeCameraPresenceSource Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.internal.Ref.BooleanRef getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.List list = (java.util.List) this.getHighSpeedVideoFpsRanges;
            kotlin.collections.CollectionsKt.joinToString$default(list, null, null, null, 0, null, null, 63, null);
            atomicBoolean = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
            if (atomicBoolean.get()) {
                if (!this.getHighResolutionOutputSizeshNQ4ISI.element) {
                    this.Camera2StreamConfigurationMap.updateData(list);
                } else {
                    this.getHighSpeedVideoFpsRangesFor = 1;
                    if (androidx.concurrent.futures.ListenableFutureKt.await(this.Camera2StreamConfigurationMap.fetchData(), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                kotlin.coroutines.jvm.internal.Boxing.boxInt(android.util.Log.d("PipePresenceSrc", "Ignoring camera update because monitoring is stopped."));
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighResolutionOutputSizeshNQ4ISI.element = false;
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.util.List<? extends androidx.camera.core.CameraIdentifier> list, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$2) create(list, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$2 pipeCameraPresenceSource$startMonitoring$2 = new androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$2(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        pipeCameraPresenceSource$startMonitoring$2.getHighSpeedVideoFpsRanges = obj;
        return pipeCameraPresenceSource$startMonitoring$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PipeCameraPresenceSource$startMonitoring$2(androidx.camera.camera2.adapter.PipeCameraPresenceSource pipeCameraPresenceSource, kotlin.jvm.internal.Ref.BooleanRef booleanRef, kotlin.coroutines.Continuation<? super androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = pipeCameraPresenceSource;
        this.getHighResolutionOutputSizeshNQ4ISI = booleanRef;
    }
}
