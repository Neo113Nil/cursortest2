package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.StillCaptureRequestControl$propagateResultOrEnqueueRequest$1$1", f = "StillCaptureRequestControl.kt", i = {0, 0, 1}, l = {183, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE}, m = "invokeSuspend", n = {"isPending", "latestRequestControl", "$this$withLock_u24default$iv"}, s = {"L$0", "L$2", "L$0"}, v = 1)
/* loaded from: classes6.dex */
final class StillCaptureRequestControl$propagateResultOrEnqueueRequest$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.camera.camera2.impl.StillCaptureRequestControl.CaptureRequest Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.camera.camera2.impl.UseCaseCameraRequestControl getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ androidx.camera.camera2.impl.StillCaptureRequestControl getInputFormats;
    int getOutputMinFrameDuration;

    /* JADX WARN: Removed duplicated region for block: B:10:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.Ref.BooleanRef booleanRef;
        androidx.camera.camera2.impl.UseCaseCameraRequestControl useCaseCameraRequestControl;
        androidx.camera.camera2.impl.StillCaptureRequestControl stillCaptureRequestControl;
        androidx.camera.camera2.impl.StillCaptureRequestControl.CaptureRequest captureRequest;
        kotlinx.coroutines.sync.Mutex mutex;
        androidx.camera.camera2.impl.StillCaptureRequestControl stillCaptureRequestControl2;
        kotlinx.coroutines.sync.Mutex mutex2;
        androidx.camera.camera2.impl.StillCaptureRequestControl.CaptureRequest captureRequest2;
        java.util.LinkedList linkedList;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
            booleanRef.element = true;
            androidx.camera.camera2.impl.UseCaseCameraRequestControl camera2StreamConfigurationMap = this.getInputFormats.getCamera2StreamConfigurationMap();
            if (camera2StreamConfigurationMap != null) {
                androidx.camera.camera2.impl.UseCaseCameraRequestControl useCaseCameraRequestControl2 = this.getHighSpeedVideoSizes;
                androidx.camera.camera2.impl.StillCaptureRequestControl stillCaptureRequestControl3 = this.getInputFormats;
                androidx.camera.camera2.impl.StillCaptureRequestControl.CaptureRequest captureRequest3 = this.Camera2StreamConfigurationMap;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(useCaseCameraRequestControl2, camera2StreamConfigurationMap)) {
                    this.getHighSpeedVideoFpsRanges = booleanRef;
                    this.getHighSpeedVideoFpsRangesFor = captureRequest3;
                    this.getHighResolutionOutputSizeshNQ4ISI = camera2StreamConfigurationMap;
                    this.getHighSpeedVideoSizesFor = stillCaptureRequestControl3;
                    this.getOutputMinFrameDuration = 1;
                    java.lang.Object access$submitRequest = androidx.camera.camera2.impl.StillCaptureRequestControl.access$submitRequest(stillCaptureRequestControl3, captureRequest3, camera2StreamConfigurationMap, this);
                    if (access$submitRequest != coroutine_suspended) {
                        useCaseCameraRequestControl = camera2StreamConfigurationMap;
                        obj = access$submitRequest;
                        stillCaptureRequestControl = stillCaptureRequestControl3;
                        captureRequest = captureRequest3;
                    }
                    return coroutine_suspended;
                }
            }
            if (booleanRef.element) {
                mutex = this.getInputFormats.Camera2StreamConfigurationMap;
                stillCaptureRequestControl2 = this.getInputFormats;
                androidx.camera.camera2.impl.StillCaptureRequestControl.CaptureRequest captureRequest4 = this.Camera2StreamConfigurationMap;
                this.getHighSpeedVideoFpsRanges = mutex;
                this.getHighSpeedVideoFpsRangesFor = stillCaptureRequestControl2;
                this.getHighResolutionOutputSizeshNQ4ISI = captureRequest4;
                this.getHighSpeedVideoSizesFor = null;
                this.getOutputMinFrameDuration = 2;
                if (mutex.lock(null, this) != coroutine_suspended) {
                    mutex2 = mutex;
                    captureRequest2 = captureRequest4;
                    linkedList = stillCaptureRequestControl2.getHighSpeedVideoFpsRanges;
                    linkedList.add(captureRequest2);
                    mutex2.unlock(null);
                    androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                    if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                    }
                }
                return coroutine_suspended;
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            captureRequest2 = (androidx.camera.camera2.impl.StillCaptureRequestControl.CaptureRequest) this.getHighResolutionOutputSizeshNQ4ISI;
            stillCaptureRequestControl2 = (androidx.camera.camera2.impl.StillCaptureRequestControl) this.getHighSpeedVideoFpsRangesFor;
            mutex2 = (kotlinx.coroutines.sync.Mutex) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
            try {
                linkedList = stillCaptureRequestControl2.getHighSpeedVideoFpsRanges;
                linkedList.add(captureRequest2);
                mutex2.unlock(null);
                androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                    java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                }
                return kotlin.Unit.INSTANCE;
            } catch (java.lang.Throwable th) {
                mutex2.unlock(null);
                throw th;
            }
        }
        stillCaptureRequestControl = (androidx.camera.camera2.impl.StillCaptureRequestControl) this.getHighSpeedVideoSizesFor;
        useCaseCameraRequestControl = (androidx.camera.camera2.impl.UseCaseCameraRequestControl) this.getHighResolutionOutputSizeshNQ4ISI;
        captureRequest = (androidx.camera.camera2.impl.StillCaptureRequestControl.CaptureRequest) this.getHighSpeedVideoFpsRangesFor;
        booleanRef = (kotlin.jvm.internal.Ref.BooleanRef) this.getHighSpeedVideoFpsRanges;
        kotlin.ResultKt.throwOnFailure(obj);
        r9.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: androidx.camera.camera2.impl.StillCaptureRequestControl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return androidx.camera.camera2.impl.StillCaptureRequestControl.$r8$lambda$d94nr3kKLaWRlrxlGv5M4rvfiJA(androidx.camera.camera2.impl.StillCaptureRequestControl.this, r2, captureRequest, useCaseCameraRequestControl, (java.lang.Throwable) obj2);
            }
        });
        booleanRef.element = false;
        if (booleanRef.element) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.camera2.impl.StillCaptureRequestControl$propagateResultOrEnqueueRequest$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.impl.StillCaptureRequestControl$propagateResultOrEnqueueRequest$1$1(this.getInputFormats, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StillCaptureRequestControl$propagateResultOrEnqueueRequest$1$1(androidx.camera.camera2.impl.StillCaptureRequestControl stillCaptureRequestControl, androidx.camera.camera2.impl.UseCaseCameraRequestControl useCaseCameraRequestControl, androidx.camera.camera2.impl.StillCaptureRequestControl.CaptureRequest captureRequest, kotlin.coroutines.Continuation<? super androidx.camera.camera2.impl.StillCaptureRequestControl$propagateResultOrEnqueueRequest$1$1> continuation) {
        super(2, continuation);
        this.getInputFormats = stillCaptureRequestControl;
        this.getHighSpeedVideoSizes = useCaseCameraRequestControl;
        this.Camera2StreamConfigurationMap = captureRequest;
    }
}
