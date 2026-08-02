package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;", "androidx/camera/camera2/impl/DeferredUseCaseCameraRequestControl$runOnSequentialSuspend$3"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl$awaitSurfaceSetup$$inlined$runOnSequentialSuspend$1", f = "DeferredUseCaseCameraRequestControl.kt", i = {}, l = {224}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
public final class DeferredUseCaseCameraRequestControl$awaitSurfaceSetup$$inlined$runOnSequentialSuspend$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl access$getOrCreateImpl = androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl.access$getOrCreateImpl(this.getHighSpeedVideoSizes);
        this.getHighSpeedVideoFpsRanges = 1;
        java.lang.Object awaitSurfaceSetup = access$getOrCreateImpl.awaitSurfaceSetup(this);
        return awaitSurfaceSetup == coroutine_suspended ? coroutine_suspended : awaitSurfaceSetup;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl$awaitSurfaceSetup$$inlined$runOnSequentialSuspend$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl$awaitSurfaceSetup$$inlined$runOnSequentialSuspend$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeferredUseCaseCameraRequestControl$awaitSurfaceSetup$$inlined$runOnSequentialSuspend$1(androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl deferredUseCaseCameraRequestControl, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = deferredUseCaseCameraRequestControl;
    }
}
