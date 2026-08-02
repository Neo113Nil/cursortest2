package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class LifecycleCoroutineScopeImpl$register$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.view.LifecycleCoroutineScopeImpl getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoFpsRangesFor;
        if (this.getHighSpeedVideoFpsRanges.getLifecycle().getCamera2StreamConfigurationMap().compareTo(androidx.lifecycle.Lifecycle.State.INITIALIZED) < 0) {
            kotlinx.coroutines.JobKt__JobKt.cancel$default(coroutineScope.getCoroutineContext(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        } else {
            this.getHighSpeedVideoFpsRanges.getLifecycle().addObserver(this.getHighSpeedVideoFpsRanges);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.view.LifecycleCoroutineScopeImpl$register$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.view.LifecycleCoroutineScopeImpl$register$1 lifecycleCoroutineScopeImpl$register$1 = new androidx.view.LifecycleCoroutineScopeImpl$register$1(this.getHighSpeedVideoFpsRanges, continuation);
        lifecycleCoroutineScopeImpl$register$1.getHighSpeedVideoFpsRangesFor = obj;
        return lifecycleCoroutineScopeImpl$register$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LifecycleCoroutineScopeImpl$register$1(androidx.view.LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, kotlin.coroutines.Continuation<? super androidx.view.LifecycleCoroutineScopeImpl$register$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = lifecycleCoroutineScopeImpl;
    }
}
