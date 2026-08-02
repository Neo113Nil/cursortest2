package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.StillCaptureRequestControl$reset$1", f = "StillCaptureRequestControl.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class StillCaptureRequestControl$reset$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.camera.camera2.impl.StillCaptureRequestControl getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.sync.Mutex mutex;
        androidx.camera.camera2.impl.StillCaptureRequestControl stillCaptureRequestControl;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        kotlinx.coroutines.CompletableDeferred<java.util.List<java.lang.Void>> result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutex = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
            androidx.camera.camera2.impl.StillCaptureRequestControl stillCaptureRequestControl2 = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRangesFor = mutex;
            this.Camera2StreamConfigurationMap = stillCaptureRequestControl2;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (mutex.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            stillCaptureRequestControl = stillCaptureRequestControl2;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stillCaptureRequestControl = (androidx.camera.camera2.impl.StillCaptureRequestControl) this.Camera2StreamConfigurationMap;
            mutex = (kotlinx.coroutines.sync.Mutex) this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        while (true) {
            try {
                linkedList = stillCaptureRequestControl.getHighSpeedVideoFpsRanges;
                if (!linkedList.isEmpty()) {
                    linkedList2 = stillCaptureRequestControl.getHighSpeedVideoFpsRanges;
                    androidx.camera.camera2.impl.StillCaptureRequestControl.CaptureRequest captureRequest = (androidx.camera.camera2.impl.StillCaptureRequestControl.CaptureRequest) linkedList2.poll();
                    if (captureRequest != null && (result = captureRequest.getResult()) != null) {
                        kotlin.coroutines.jvm.internal.Boxing.boxBoolean(result.completeExceptionally(new androidx.camera.core.ImageCaptureException(3, "Capture request is cancelled due to a reset", null)));
                    }
                } else {
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    mutex.unlock(null);
                    return kotlin.Unit.INSTANCE;
                }
            } catch (java.lang.Throwable th) {
                mutex.unlock(null);
                throw th;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.camera2.impl.StillCaptureRequestControl$reset$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.impl.StillCaptureRequestControl$reset$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StillCaptureRequestControl$reset$1(androidx.camera.camera2.impl.StillCaptureRequestControl stillCaptureRequestControl, kotlin.coroutines.Continuation<? super androidx.camera.camera2.impl.StillCaptureRequestControl$reset$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = stillCaptureRequestControl;
    }
}
