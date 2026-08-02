package androidx.camera.camera2.adapter;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.adapter.PipeCameraPresenceSource$fetchData$1$1", f = "PipeCameraPresenceSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class PipeCameraPresenceSource$fetchData$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.util.List<androidx.camera.core.CameraIdentifier>> Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.camera.camera2.adapter.PipeCameraPresenceSource getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.hardware.camera2.CameraManager cameraManager;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            try {
                cameraManager = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
                java.lang.String[] cameraIdList = cameraManager.getCameraIdList();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cameraIdList, "");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.String str : cameraIdList) {
                    androidx.camera.core.CameraIdentifier cameraIdentifier = null;
                    try {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(str);
                        cameraIdentifier = androidx.camera.core.CameraIdentifier.Factory.create$default(str, null, null, 6, null);
                    } catch (java.lang.IllegalArgumentException e) {
                        java.lang.IllegalArgumentException illegalArgumentException = e;
                    }
                    if (cameraIdentifier != null) {
                        arrayList.add(cameraIdentifier);
                    }
                }
                java.util.ArrayList arrayList2 = arrayList;
                this.getHighSpeedVideoSizes.updateData(arrayList2);
                this.Camera2StreamConfigurationMap.set(arrayList2);
            } catch (java.lang.Exception e2) {
                java.lang.Exception exc = e2;
                this.getHighSpeedVideoSizes.updateError(exc);
                this.Camera2StreamConfigurationMap.setException(exc);
            }
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.camera2.adapter.PipeCameraPresenceSource$fetchData$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.adapter.PipeCameraPresenceSource$fetchData$1$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PipeCameraPresenceSource$fetchData$1$1(androidx.camera.camera2.adapter.PipeCameraPresenceSource pipeCameraPresenceSource, androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.util.List<androidx.camera.core.CameraIdentifier>> completer, kotlin.coroutines.Continuation<? super androidx.camera.camera2.adapter.PipeCameraPresenceSource$fetchData$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = pipeCameraPresenceSource;
        this.Camera2StreamConfigurationMap = completer;
    }
}
