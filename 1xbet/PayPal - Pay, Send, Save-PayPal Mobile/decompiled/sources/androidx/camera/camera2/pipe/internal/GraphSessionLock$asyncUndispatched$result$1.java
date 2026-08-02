package androidx.camera.camera2.pipe.internal;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.internal.GraphSessionLock$asyncUndispatched$result$1", f = "GraphSessionLock.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class GraphSessionLock$asyncUndispatched$result$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> getHighSpeedVideoFpsRangesFor;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoSizes;
        kotlinx.coroutines.CoroutineScopeKt.ensureActive(coroutineScope);
        kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> function2 = this.getHighSpeedVideoFpsRangesFor;
        this.getHighResolutionOutputSizeshNQ4ISI = 1;
        java.lang.Object invoke = function2.invoke(coroutineScope, this);
        return invoke == coroutine_suspended ? coroutine_suspended : invoke;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Object obj) {
        return ((androidx.camera.camera2.pipe.internal.GraphSessionLock$asyncUndispatched$result$1) create(coroutineScope, (kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.camera.camera2.pipe.internal.GraphSessionLock$asyncUndispatched$result$1 graphSessionLock$asyncUndispatched$result$1 = new androidx.camera.camera2.pipe.internal.GraphSessionLock$asyncUndispatched$result$1(this.getHighSpeedVideoFpsRangesFor, continuation);
        graphSessionLock$asyncUndispatched$result$1.getHighSpeedVideoSizes = obj;
        return graphSessionLock$asyncUndispatched$result$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    GraphSessionLock$asyncUndispatched$result$1(kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.internal.GraphSessionLock$asyncUndispatched$result$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = function2;
    }
}
