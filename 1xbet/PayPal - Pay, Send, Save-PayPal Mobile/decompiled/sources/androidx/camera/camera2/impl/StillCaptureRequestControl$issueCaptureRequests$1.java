package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.StillCaptureRequestControl$issueCaptureRequests$1", f = "StillCaptureRequestControl.kt", i = {0, 0, 1, 1, 2, 2}, l = {99, 100, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE}, m = "invokeSuspend", n = {"request", "requestControl", "request", "requestControl", "request", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"}, v = 1)
/* loaded from: classes6.dex */
final class StillCaptureRequestControl$issueCaptureRequests$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.CompletableDeferred<java.util.List<java.lang.Void>> Camera2StreamConfigurationMap;
    final /* synthetic */ int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.util.List<androidx.camera.core.impl.CaptureConfig> getHighSpeedVideoFpsRanges;
    final /* synthetic */ int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    final /* synthetic */ androidx.camera.camera2.impl.StillCaptureRequestControl getOutputMinFrameDuration;

    /* JADX WARN: Removed duplicated region for block: B:11:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.camera.camera2.impl.UseCaseCameraRequestControl getHighSpeedVideoFpsRangesFor;
        androidx.camera.camera2.impl.StillCaptureRequestControl.CaptureRequest captureRequest;
        androidx.camera.camera2.impl.StillCaptureRequestControl.CaptureRequest captureRequest2;
        kotlinx.coroutines.sync.Mutex mutex;
        androidx.camera.camera2.impl.StillCaptureRequestControl stillCaptureRequestControl;
        androidx.camera.camera2.impl.StillCaptureRequestControl stillCaptureRequestControl2;
        androidx.camera.camera2.impl.StillCaptureRequestControl.CaptureRequest captureRequest3;
        java.util.LinkedList linkedList;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.camera.camera2.impl.StillCaptureRequestControl.CaptureRequest captureRequest4 = new androidx.camera.camera2.impl.StillCaptureRequestControl.CaptureRequest(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap);
            getHighSpeedVideoFpsRangesFor = this.getOutputMinFrameDuration.getGetHighSpeedVideoFpsRangesFor();
            if (getHighSpeedVideoFpsRangesFor == null) {
                captureRequest = captureRequest4;
                mutex = this.getOutputMinFrameDuration.Camera2StreamConfigurationMap;
                androidx.camera.camera2.impl.StillCaptureRequestControl stillCaptureRequestControl3 = this.getOutputMinFrameDuration;
                this.getHighSpeedVideoSizes = captureRequest;
                this.getHighSpeedVideoSizesFor = mutex;
                this.getInputSizeshNQ4ISI = stillCaptureRequestControl3;
                this.getOutputFormats = 3;
                if (mutex.lock(null, this) != coroutine_suspended) {
                    stillCaptureRequestControl = stillCaptureRequestControl3;
                    linkedList = stillCaptureRequestControl.getHighSpeedVideoFpsRanges;
                    linkedList.add(captureRequest);
                    mutex.unlock(null);
                    androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                    if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            this.getHighSpeedVideoSizes = captureRequest4;
            this.getHighSpeedVideoSizesFor = getHighSpeedVideoFpsRangesFor;
            this.getOutputFormats = 1;
            java.lang.Object awaitSurfaceSetup = getHighSpeedVideoFpsRangesFor.awaitSurfaceSetup(this);
            if (awaitSurfaceSetup != coroutine_suspended) {
                captureRequest2 = captureRequest4;
                obj = awaitSurfaceSetup;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i == 2) {
                stillCaptureRequestControl2 = (androidx.camera.camera2.impl.StillCaptureRequestControl) this.getInputSizeshNQ4ISI;
                getHighSpeedVideoFpsRangesFor = (androidx.camera.camera2.impl.UseCaseCameraRequestControl) this.getHighSpeedVideoSizesFor;
                captureRequest3 = (androidx.camera.camera2.impl.StillCaptureRequestControl.CaptureRequest) this.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.Deferred deferred = (kotlinx.coroutines.Deferred) obj;
                if (getHighSpeedVideoFpsRangesFor != null) {
                    throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                }
                deferred.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: androidx.camera.camera2.impl.StillCaptureRequestControl$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return androidx.camera.camera2.impl.StillCaptureRequestControl.$r8$lambda$d94nr3kKLaWRlrxlGv5M4rvfiJA(androidx.camera.camera2.impl.StillCaptureRequestControl.this, deferred, captureRequest3, getHighSpeedVideoFpsRangesFor, (java.lang.Throwable) obj2);
                    }
                });
                return kotlin.Unit.INSTANCE;
            }
            if (i != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stillCaptureRequestControl = (androidx.camera.camera2.impl.StillCaptureRequestControl) this.getInputSizeshNQ4ISI;
            mutex = (kotlinx.coroutines.sync.Mutex) this.getHighSpeedVideoSizesFor;
            captureRequest = (androidx.camera.camera2.impl.StillCaptureRequestControl.CaptureRequest) this.getHighSpeedVideoSizes;
            kotlin.ResultKt.throwOnFailure(obj);
            try {
                linkedList = stillCaptureRequestControl.getHighSpeedVideoFpsRanges;
                linkedList.add(captureRequest);
                mutex.unlock(null);
                androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                    java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                }
                return kotlin.Unit.INSTANCE;
            } catch (java.lang.Throwable th) {
                mutex.unlock(null);
                throw th;
            }
        }
        getHighSpeedVideoFpsRangesFor = (androidx.camera.camera2.impl.UseCaseCameraRequestControl) this.getHighSpeedVideoSizesFor;
        captureRequest2 = (androidx.camera.camera2.impl.StillCaptureRequestControl.CaptureRequest) this.getHighSpeedVideoSizes;
        kotlin.ResultKt.throwOnFailure(obj);
        if (!((java.lang.Boolean) obj).booleanValue()) {
            captureRequest = captureRequest2;
            mutex = this.getOutputMinFrameDuration.Camera2StreamConfigurationMap;
            androidx.camera.camera2.impl.StillCaptureRequestControl stillCaptureRequestControl32 = this.getOutputMinFrameDuration;
            this.getHighSpeedVideoSizes = captureRequest;
            this.getHighSpeedVideoSizesFor = mutex;
            this.getInputSizeshNQ4ISI = stillCaptureRequestControl32;
            this.getOutputFormats = 3;
            if (mutex.lock(null, this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        androidx.camera.camera2.impl.StillCaptureRequestControl stillCaptureRequestControl4 = this.getOutputMinFrameDuration;
        if (getHighSpeedVideoFpsRangesFor == null) {
            throw new java.lang.IllegalArgumentException("Required value was null.".toString());
        }
        this.getHighSpeedVideoSizes = captureRequest2;
        this.getHighSpeedVideoSizesFor = getHighSpeedVideoFpsRangesFor;
        this.getInputSizeshNQ4ISI = stillCaptureRequestControl4;
        this.getOutputFormats = 2;
        java.lang.Object access$submitRequest = androidx.camera.camera2.impl.StillCaptureRequestControl.access$submitRequest(stillCaptureRequestControl4, captureRequest2, getHighSpeedVideoFpsRangesFor, this);
        if (access$submitRequest != coroutine_suspended) {
            stillCaptureRequestControl2 = stillCaptureRequestControl4;
            obj = access$submitRequest;
            captureRequest3 = captureRequest2;
            kotlinx.coroutines.Deferred deferred2 = (kotlinx.coroutines.Deferred) obj;
            if (getHighSpeedVideoFpsRangesFor != null) {
            }
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.camera2.impl.StillCaptureRequestControl$issueCaptureRequests$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.impl.StillCaptureRequestControl$issueCaptureRequests$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getOutputMinFrameDuration, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StillCaptureRequestControl$issueCaptureRequests$1(java.util.List<androidx.camera.core.impl.CaptureConfig> list, int i, int i2, kotlinx.coroutines.CompletableDeferred<java.util.List<java.lang.Void>> completableDeferred, androidx.camera.camera2.impl.StillCaptureRequestControl stillCaptureRequestControl, kotlin.coroutines.Continuation<? super androidx.camera.camera2.impl.StillCaptureRequestControl$issueCaptureRequests$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = list;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRangesFor = i2;
        this.Camera2StreamConfigurationMap = completableDeferred;
        this.getOutputMinFrameDuration = stillCaptureRequestControl;
    }
}
