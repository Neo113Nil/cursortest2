package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "androidx/camera/camera2/impl/UseCaseThreads$confineLaunch$1"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.LowLightBoostControl$setLowLightBoostAsync$$inlined$confineLaunch$1", f = "LowLightBoostControl.kt", i = {}, l = {201}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
public final class LowLightBoostControl$setLowLightBoostAsync$$inlined$confineLaunch$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.CompletableDeferred Camera2StreamConfigurationMap;
    final /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ boolean getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.camera.camera2.impl.LowLightBoostControl getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c7, code lost:
    
        if (r5.invokeOnCompletion(new androidx.camera.camera2.impl.LowLightBoostControl$setLowLightBoostAsync$2$1$2(r1, r2)) == null) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CompletableDeferred completableDeferred;
        androidx.camera.camera2.impl.State3AControl state3AControl;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.Deferred<java.lang.Boolean> checkFrameRateJob$camera_camera2 = this.getHighSpeedVideoFpsRangesFor.getCheckFrameRateJob$camera_camera2();
            if (checkFrameRateJob$camera_camera2 != null) {
                this.getHighSpeedVideoSizes = 1;
                obj = checkFrameRateJob$camera_camera2.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizesFor = this.getHighResolutionOutputSizeshNQ4ISI;
            if (!this.getHighResolutionOutputSizeshNQ4ISI) {
                androidx.camera.camera2.impl.LowLightBoostControl lowLightBoostControl = this.getHighSpeedVideoFpsRangesFor;
                lowLightBoostControl.getHighSpeedVideoFpsRangesFor(lowLightBoostControl.getOutputFormats, -1);
            }
            if (this.getHighSpeedVideoFpsRangesFor.getGetInputSizeshNQ4ISI() != null) {
                if (this.getHighResolutionOutputSizeshNQ4ISI) {
                    androidx.camera.camera2.impl.LowLightBoostControl lowLightBoostControl2 = this.getHighSpeedVideoFpsRangesFor;
                    lowLightBoostControl2.getHighSpeedVideoFpsRangesFor(lowLightBoostControl2.getOutputFormats, 0);
                }
                if (this.getHighSpeedVideoFpsRanges) {
                    this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor();
                } else {
                    completableDeferred = this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI;
                    if (completableDeferred != null) {
                        androidx.camera.camera2.adapter.CoroutineAdaptersKt.propagateTo(this.Camera2StreamConfigurationMap, completableDeferred);
                    }
                }
                this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI = this.Camera2StreamConfigurationMap;
                state3AControl = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
                androidx.camera.camera2.adapter.CoroutineAdaptersKt.propagateTo(state3AControl.setPreferredAeModeAsync(this.getHighResolutionOutputSizeshNQ4ISI ? kotlin.coroutines.jvm.internal.Boxing.boxInt(6) : null), this.Camera2StreamConfigurationMap);
                kotlinx.coroutines.CompletableDeferred completableDeferred2 = this.Camera2StreamConfigurationMap;
                final kotlinx.coroutines.CompletableDeferred completableDeferred3 = this.Camera2StreamConfigurationMap;
                final androidx.camera.camera2.impl.LowLightBoostControl lowLightBoostControl3 = this.getHighSpeedVideoFpsRangesFor;
            }
            androidx.camera.camera2.impl.LowLightBoostControl.access$createFailureResult(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, new androidx.camera.core.CameraControl.OperationCanceledException("Camera is not active."));
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (((java.lang.Boolean) obj).booleanValue()) {
            androidx.camera.camera2.impl.LowLightBoostControl lowLightBoostControl4 = this.getHighSpeedVideoFpsRangesFor;
            lowLightBoostControl4.getHighSpeedVideoFpsRangesFor(lowLightBoostControl4.getOutputFormats, -1);
            androidx.camera.camera2.impl.LowLightBoostControl.access$createFailureResult(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, new java.lang.IllegalStateException("Low Light Boost is disabled when expected frame rate range exceeds 30."));
            return kotlin.Unit.INSTANCE;
        }
        this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizesFor = this.getHighResolutionOutputSizeshNQ4ISI;
        if (!this.getHighResolutionOutputSizeshNQ4ISI) {
        }
        if (this.getHighSpeedVideoFpsRangesFor.getGetInputSizeshNQ4ISI() != null) {
        }
        androidx.camera.camera2.impl.LowLightBoostControl.access$createFailureResult(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, new androidx.camera.core.CameraControl.OperationCanceledException("Camera is not active."));
        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.camera2.impl.LowLightBoostControl$setLowLightBoostAsync$$inlined$confineLaunch$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.impl.LowLightBoostControl$setLowLightBoostAsync$$inlined$confineLaunch$1(continuation, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LowLightBoostControl$setLowLightBoostAsync$$inlined$confineLaunch$1(kotlin.coroutines.Continuation continuation, androidx.camera.camera2.impl.LowLightBoostControl lowLightBoostControl, kotlinx.coroutines.CompletableDeferred completableDeferred, boolean z, boolean z2) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = lowLightBoostControl;
        this.Camera2StreamConfigurationMap = completableDeferred;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoFpsRanges = z2;
    }
}
