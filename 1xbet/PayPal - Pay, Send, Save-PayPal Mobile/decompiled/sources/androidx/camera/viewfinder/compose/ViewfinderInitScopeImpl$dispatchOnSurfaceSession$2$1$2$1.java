package androidx.camera.viewfinder.compose;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.viewfinder.compose.ViewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1", f = "Viewfinder.kt", i = {}, l = {325}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class ViewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.camera.viewfinder.core.ViewfinderSurfaceSessionScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.camera.viewfinder.core.impl.ViewfinderSurfaceSessionImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.camera.viewfinder.compose.ViewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1$receiver$1 viewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1$receiver$1 = new androidx.camera.viewfinder.compose.ViewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1$receiver$1((kotlinx.coroutines.CoroutineScope) this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
            kotlin.jvm.functions.Function2<androidx.camera.viewfinder.core.ViewfinderSurfaceSessionScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2 = this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRanges = 1;
            if (function2.invoke(viewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1$receiver$1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.viewfinder.compose.ViewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.camera.viewfinder.compose.ViewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1 viewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1 = new androidx.camera.viewfinder.compose.ViewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
        viewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return viewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ViewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1(kotlin.jvm.functions.Function2<? super androidx.camera.viewfinder.core.ViewfinderSurfaceSessionScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, androidx.camera.viewfinder.core.impl.ViewfinderSurfaceSessionImpl viewfinderSurfaceSessionImpl, kotlin.coroutines.Continuation<? super androidx.camera.viewfinder.compose.ViewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = function2;
        this.getHighSpeedVideoSizes = viewfinderSurfaceSessionImpl;
    }
}
