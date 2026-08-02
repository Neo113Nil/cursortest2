package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.UseCaseThreads$confineDeferredListSuspend$1", f = "UseCaseThreads.kt", i = {}, l = {179}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
public final class UseCaseThreads$confineDeferredListSuspend$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super java.util.List<? extends kotlinx.coroutines.Deferred<? extends T>>>, java.lang.Object> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.util.List<kotlinx.coroutines.CompletableDeferred<T>> getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super java.util.List<? extends kotlinx.coroutines.Deferred<? extends T>>>, java.lang.Object> function1 = this.Camera2StreamConfigurationMap;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
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
        java.util.List<kotlinx.coroutines.CompletableDeferred<T>> list = this.getHighSpeedVideoFpsRangesFor;
        int i2 = 0;
        for (java.lang.Object obj2 : (java.lang.Iterable) obj) {
            if (i2 < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            androidx.camera.camera2.adapter.CoroutineAdaptersKt.propagateTo((kotlinx.coroutines.Deferred) obj2, (kotlinx.coroutines.CompletableDeferred) list.get(i2));
            i2++;
        }
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object invokeSuspend$$forInline(java.lang.Object obj) {
        java.lang.Iterable iterable = (java.lang.Iterable) this.Camera2StreamConfigurationMap.invoke(this);
        java.util.List<kotlinx.coroutines.CompletableDeferred<T>> list = this.getHighSpeedVideoFpsRangesFor;
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
        return ((androidx.camera.camera2.impl.UseCaseThreads$confineDeferredListSuspend$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.impl.UseCaseThreads$confineDeferredListSuspend$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UseCaseThreads$confineDeferredListSuspend$1(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super java.util.List<? extends kotlinx.coroutines.Deferred<? extends T>>>, ? extends java.lang.Object> function1, java.util.List<? extends kotlinx.coroutines.CompletableDeferred<T>> list, kotlin.coroutines.Continuation<? super androidx.camera.camera2.impl.UseCaseThreads$confineDeferredListSuspend$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = function1;
        this.getHighSpeedVideoFpsRangesFor = list;
    }
}
