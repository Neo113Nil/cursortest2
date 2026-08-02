package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.UseCaseThreads$confineDeferredList$1", f = "UseCaseThreads.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
public final class UseCaseThreads$confineDeferredList$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function0<java.util.List<kotlinx.coroutines.Deferred<T>>> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.util.List<kotlinx.coroutines.CompletableDeferred<T>> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.Iterable iterable = (java.lang.Iterable) this.getHighResolutionOutputSizeshNQ4ISI.invoke();
        java.util.List<kotlinx.coroutines.CompletableDeferred<T>> list = this.getHighSpeedVideoSizes;
        int i = 0;
        for (java.lang.Object obj2 : iterable) {
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            androidx.camera.camera2.adapter.CoroutineAdaptersKt.propagateTo((kotlinx.coroutines.Deferred) obj2, (kotlinx.coroutines.CompletableDeferred) list.get(i));
            i++;
        }
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object invokeSuspend$$forInline(java.lang.Object obj) {
        java.lang.Iterable iterable = (java.lang.Iterable) this.getHighResolutionOutputSizeshNQ4ISI.invoke();
        java.util.List<kotlinx.coroutines.CompletableDeferred<T>> list = this.getHighSpeedVideoSizes;
        int i = 0;
        for (java.lang.Object obj2 : iterable) {
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            androidx.camera.camera2.adapter.CoroutineAdaptersKt.propagateTo((kotlinx.coroutines.Deferred) obj2, (kotlinx.coroutines.CompletableDeferred) list.get(java.lang.Integer.valueOf(i).intValue()));
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            i++;
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.camera2.impl.UseCaseThreads$confineDeferredList$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.impl.UseCaseThreads$confineDeferredList$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UseCaseThreads$confineDeferredList$1(kotlin.jvm.functions.Function0<? extends java.util.List<? extends kotlinx.coroutines.Deferred<? extends T>>> function0, java.util.List<? extends kotlinx.coroutines.CompletableDeferred<T>> list, kotlin.coroutines.Continuation<? super androidx.camera.camera2.impl.UseCaseThreads$confineDeferredList$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
        this.getHighSpeedVideoSizes = list;
    }
}
