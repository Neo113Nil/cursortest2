package androidx.camera.camera2.impl;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl$runOnSequentialSuspend$3", f = "DeferredUseCaseCameraRequestControl.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
public final class DeferredUseCaseCameraRequestControl$runOnSequentialSuspend$3<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.camera.camera2.impl.UseCaseCameraRequestControl, kotlin.coroutines.Continuation<? super T>, java.lang.Object> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        kotlin.jvm.functions.Function2<androidx.camera.camera2.impl.UseCaseCameraRequestControl, kotlin.coroutines.Continuation<? super T>, java.lang.Object> function2 = this.Camera2StreamConfigurationMap;
        androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl access$getOrCreateImpl = androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl.access$getOrCreateImpl(this.getHighSpeedVideoFpsRanges);
        this.getHighSpeedVideoFpsRangesFor = 1;
        java.lang.Object invoke = function2.invoke(access$getOrCreateImpl, this);
        return invoke == coroutine_suspended ? coroutine_suspended : invoke;
    }

    public final java.lang.Object invokeSuspend$$forInline(java.lang.Object obj) {
        return this.Camera2StreamConfigurationMap.invoke(androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl.access$getOrCreateImpl(this.getHighSpeedVideoFpsRanges), this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super T> continuation) {
        return ((androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl$runOnSequentialSuspend$3) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl$runOnSequentialSuspend$3(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DeferredUseCaseCameraRequestControl$runOnSequentialSuspend$3(kotlin.jvm.functions.Function2<? super androidx.camera.camera2.impl.UseCaseCameraRequestControl, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl deferredUseCaseCameraRequestControl, kotlin.coroutines.Continuation<? super androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl$runOnSequentialSuspend$3> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = function2;
        this.getHighSpeedVideoFpsRanges = deferredUseCaseCameraRequestControl;
    }
}
