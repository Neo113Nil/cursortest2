package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.UseCaseThreads$confineDeferredSuspend$1", f = "UseCaseThreads.kt", i = {}, l = {152}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
public final class UseCaseThreads$confineDeferredSuspend$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.CompletableDeferred<T> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<? extends T>>, java.lang.Object> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<? extends T>>, java.lang.Object> function1 = this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoSizes = 1;
            obj = function1.invoke(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        androidx.camera.camera2.adapter.CoroutineAdaptersKt.propagateTo((kotlinx.coroutines.Deferred) obj, this.Camera2StreamConfigurationMap);
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object invokeSuspend$$forInline(java.lang.Object obj) {
        androidx.camera.camera2.adapter.CoroutineAdaptersKt.propagateTo((kotlinx.coroutines.Deferred) this.getHighSpeedVideoFpsRangesFor.invoke(this), this.Camera2StreamConfigurationMap);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.camera2.impl.UseCaseThreads$confineDeferredSuspend$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.impl.UseCaseThreads$confineDeferredSuspend$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UseCaseThreads$confineDeferredSuspend$1(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<? extends T>>, ? extends java.lang.Object> function1, kotlinx.coroutines.CompletableDeferred<T> completableDeferred, kotlin.coroutines.Continuation<? super androidx.camera.camera2.impl.UseCaseThreads$confineDeferredSuspend$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.Camera2StreamConfigurationMap = completableDeferred;
    }
}
