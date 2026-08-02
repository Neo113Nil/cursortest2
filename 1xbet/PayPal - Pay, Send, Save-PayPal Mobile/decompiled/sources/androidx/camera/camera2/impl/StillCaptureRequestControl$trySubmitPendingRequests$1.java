package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.StillCaptureRequestControl$trySubmitPendingRequests$1", f = "StillCaptureRequestControl.kt", i = {0, 1, 1, 2, 2, 2, 2}, l = {118, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE}, m = "invokeSuspend", n = {"requestControl", "requestControl", "$this$withLock_u24default$iv", "requestControl", "$this$withLock_u24default$iv", "request", "requestControl"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$3", "L$4"}, v = 1)
/* loaded from: classes6.dex */
final class StillCaptureRequestControl$trySubmitPendingRequests$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    final /* synthetic */ androidx.camera.camera2.impl.StillCaptureRequestControl getOutputMinFrameDuration;

    /* JADX WARN: Incorrect condition in loop: B:12:0x009e */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a0 A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:8:0x002a, B:9:0x00c4, B:11:0x0094, B:13:0x00a0, B:16:0x00ad, B:24:0x00cc), top: B:7:0x002a }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00c2 -> B:9:0x00c4). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.camera.camera2.impl.UseCaseCameraRequestControl useCaseCameraRequestControl;
        kotlinx.coroutines.sync.Mutex mutex;
        androidx.camera.camera2.impl.StillCaptureRequestControl stillCaptureRequestControl;
        kotlinx.coroutines.sync.Mutex mutex2;
        kotlinx.coroutines.sync.Mutex mutex3;
        androidx.camera.camera2.impl.UseCaseCameraRequestControl useCaseCameraRequestControl2;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.camera.camera2.impl.UseCaseCameraRequestControl camera2StreamConfigurationMap = this.getOutputMinFrameDuration.getCamera2StreamConfigurationMap();
            if (camera2StreamConfigurationMap == null) {
                return kotlin.Unit.INSTANCE;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizesFor = 1;
            java.lang.Object awaitSurfaceSetup = camera2StreamConfigurationMap.awaitSurfaceSetup(this);
            if (awaitSurfaceSetup != coroutine_suspended) {
                useCaseCameraRequestControl = camera2StreamConfigurationMap;
                obj = awaitSurfaceSetup;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i == 2) {
                stillCaptureRequestControl = (androidx.camera.camera2.impl.StillCaptureRequestControl) this.Camera2StreamConfigurationMap;
                mutex2 = (kotlinx.coroutines.sync.Mutex) this.getHighSpeedVideoFpsRanges;
                useCaseCameraRequestControl = (androidx.camera.camera2.impl.UseCaseCameraRequestControl) this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                mutex3 = mutex2;
                useCaseCameraRequestControl2 = useCaseCameraRequestControl;
                while (!linkedList.isEmpty()) {
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                return kotlin.Unit.INSTANCE;
            }
            if (i != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stillCaptureRequestControl = (androidx.camera.camera2.impl.StillCaptureRequestControl) this.getInputFormats;
            useCaseCameraRequestControl2 = (androidx.camera.camera2.impl.UseCaseCameraRequestControl) this.getHighSpeedVideoFpsRangesFor;
            androidx.camera.camera2.impl.StillCaptureRequestControl.CaptureRequest captureRequest = (androidx.camera.camera2.impl.StillCaptureRequestControl.CaptureRequest) this.getHighSpeedVideoSizes;
            androidx.camera.camera2.impl.StillCaptureRequestControl stillCaptureRequestControl2 = (androidx.camera.camera2.impl.StillCaptureRequestControl) this.Camera2StreamConfigurationMap;
            mutex3 = (kotlinx.coroutines.sync.Mutex) this.getHighSpeedVideoFpsRanges;
            androidx.camera.camera2.impl.UseCaseCameraRequestControl useCaseCameraRequestControl3 = (androidx.camera.camera2.impl.UseCaseCameraRequestControl) this.getHighResolutionOutputSizeshNQ4ISI;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
                r10.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: androidx.camera.camera2.impl.StillCaptureRequestControl$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return androidx.camera.camera2.impl.StillCaptureRequestControl.$r8$lambda$d94nr3kKLaWRlrxlGv5M4rvfiJA(androidx.camera.camera2.impl.StillCaptureRequestControl.this, r2, captureRequest, useCaseCameraRequestControl2, (java.lang.Throwable) obj2);
                    }
                });
                stillCaptureRequestControl = stillCaptureRequestControl2;
                useCaseCameraRequestControl2 = useCaseCameraRequestControl3;
                while (!linkedList.isEmpty()) {
                    linkedList2 = stillCaptureRequestControl.getHighSpeedVideoFpsRanges;
                    captureRequest = (androidx.camera.camera2.impl.StillCaptureRequestControl.CaptureRequest) linkedList2.poll();
                    if (captureRequest != null) {
                        this.getHighResolutionOutputSizeshNQ4ISI = useCaseCameraRequestControl2;
                        this.getHighSpeedVideoFpsRanges = mutex3;
                        this.Camera2StreamConfigurationMap = stillCaptureRequestControl;
                        this.getHighSpeedVideoSizes = captureRequest;
                        this.getHighSpeedVideoFpsRangesFor = useCaseCameraRequestControl2;
                        this.getInputFormats = stillCaptureRequestControl;
                        this.getHighSpeedVideoSizesFor = 3;
                        obj = androidx.camera.camera2.impl.StillCaptureRequestControl.access$submitRequest(stillCaptureRequestControl, captureRequest, useCaseCameraRequestControl2, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        stillCaptureRequestControl2 = stillCaptureRequestControl;
                        useCaseCameraRequestControl3 = useCaseCameraRequestControl2;
                        r10.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: androidx.camera.camera2.impl.StillCaptureRequestControl$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return androidx.camera.camera2.impl.StillCaptureRequestControl.$r8$lambda$d94nr3kKLaWRlrxlGv5M4rvfiJA(androidx.camera.camera2.impl.StillCaptureRequestControl.this, r2, captureRequest, useCaseCameraRequestControl2, (java.lang.Throwable) obj2);
                            }
                        });
                        stillCaptureRequestControl = stillCaptureRequestControl2;
                        useCaseCameraRequestControl2 = useCaseCameraRequestControl3;
                        while (!linkedList.isEmpty()) {
                        }
                    }
                }
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                return kotlin.Unit.INSTANCE;
            } finally {
                mutex3.unlock(null);
            }
        }
        androidx.camera.camera2.impl.UseCaseCameraRequestControl useCaseCameraRequestControl4 = (androidx.camera.camera2.impl.UseCaseCameraRequestControl) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.ResultKt.throwOnFailure(obj);
        useCaseCameraRequestControl = useCaseCameraRequestControl4;
        if (((java.lang.Boolean) obj).booleanValue()) {
            mutex = this.getOutputMinFrameDuration.Camera2StreamConfigurationMap;
            stillCaptureRequestControl = this.getOutputMinFrameDuration;
            this.getHighResolutionOutputSizeshNQ4ISI = useCaseCameraRequestControl;
            this.getHighSpeedVideoFpsRanges = mutex;
            this.Camera2StreamConfigurationMap = stillCaptureRequestControl;
            this.getHighSpeedVideoSizesFor = 2;
            if (mutex.lock(null, this) != coroutine_suspended) {
                mutex2 = mutex;
                mutex3 = mutex2;
                useCaseCameraRequestControl2 = useCaseCameraRequestControl;
                while (!linkedList.isEmpty()) {
                }
                kotlin.Unit unit22 = kotlin.Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.camera2.impl.StillCaptureRequestControl$trySubmitPendingRequests$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.impl.StillCaptureRequestControl$trySubmitPendingRequests$1(this.getOutputMinFrameDuration, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StillCaptureRequestControl$trySubmitPendingRequests$1(androidx.camera.camera2.impl.StillCaptureRequestControl stillCaptureRequestControl, kotlin.coroutines.Continuation<? super androidx.camera.camera2.impl.StillCaptureRequestControl$trySubmitPendingRequests$1> continuation) {
        super(2, continuation);
        this.getOutputMinFrameDuration = stillCaptureRequestControl;
    }
}
