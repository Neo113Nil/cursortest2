package androidx.camera.camera2.impl;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0004\b\u0000\u0010\u0003*\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/Deferred;", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl$runOnSequentialList$submissionJob$1", f = "DeferredUseCaseCameraRequestControl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
public final class DeferredUseCaseCameraRequestControl$runOnSequentialList$submissionJob$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.util.List<? extends kotlinx.coroutines.Deferred<? extends T>>>, java.lang.Object> {
    final /* synthetic */ androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.camera.camera2.impl.UseCaseCameraRequestControl, java.util.List<kotlinx.coroutines.Deferred<T>>> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return this.getHighSpeedVideoSizes.invoke(androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl.access$getOrCreateImpl(this.getHighResolutionOutputSizeshNQ4ISI));
    }

    public final java.lang.Object invokeSuspend$$forInline(java.lang.Object obj) {
        return this.getHighSpeedVideoSizes.invoke(androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl.access$getOrCreateImpl(this.getHighResolutionOutputSizeshNQ4ISI));
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.util.List<? extends kotlinx.coroutines.Deferred<? extends T>>> continuation) {
        return ((androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl$runOnSequentialList$submissionJob$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl$runOnSequentialList$submissionJob$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DeferredUseCaseCameraRequestControl$runOnSequentialList$submissionJob$1(kotlin.jvm.functions.Function1<? super androidx.camera.camera2.impl.UseCaseCameraRequestControl, ? extends java.util.List<? extends kotlinx.coroutines.Deferred<? extends T>>> function1, androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl deferredUseCaseCameraRequestControl, kotlin.coroutines.Continuation<? super androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl$runOnSequentialList$submissionJob$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = function1;
        this.getHighResolutionOutputSizeshNQ4ISI = deferredUseCaseCameraRequestControl;
    }
}
