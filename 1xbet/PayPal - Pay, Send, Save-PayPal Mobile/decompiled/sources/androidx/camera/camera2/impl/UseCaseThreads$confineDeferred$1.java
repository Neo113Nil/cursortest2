package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.UseCaseThreads$confineDeferred$1", f = "UseCaseThreads.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
public final class UseCaseThreads$confineDeferred$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlinx.coroutines.Deferred<T>> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlinx.coroutines.CompletableDeferred<T> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.camera.camera2.adapter.CoroutineAdaptersKt.propagateTo((kotlinx.coroutines.Deferred) this.Camera2StreamConfigurationMap.invoke(), this.getHighResolutionOutputSizeshNQ4ISI);
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object invokeSuspend$$forInline(java.lang.Object obj) {
        androidx.camera.camera2.adapter.CoroutineAdaptersKt.propagateTo((kotlinx.coroutines.Deferred) this.Camera2StreamConfigurationMap.invoke(), this.getHighResolutionOutputSizeshNQ4ISI);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.camera2.impl.UseCaseThreads$confineDeferred$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.impl.UseCaseThreads$confineDeferred$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UseCaseThreads$confineDeferred$1(kotlin.jvm.functions.Function0<? extends kotlinx.coroutines.Deferred<? extends T>> function0, kotlinx.coroutines.CompletableDeferred<T> completableDeferred, kotlin.coroutines.Continuation<? super androidx.camera.camera2.impl.UseCaseThreads$confineDeferred$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = function0;
        this.getHighResolutionOutputSizeshNQ4ISI = completableDeferred;
    }
}
