package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.compose.RememberLifecycleOwnerKt$rememberLifecycleOwner$2$1", f = "RememberLifecycleOwner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class RememberLifecycleOwnerKt$rememberLifecycleOwner$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.lifecycle.Lifecycle.State getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.view.compose.ComposeLifecycleOwner getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.view.compose.ComposeLifecycleOwner composeLifecycleOwner = this.getHighSpeedVideoFpsRangesFor;
        composeLifecycleOwner.Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges;
        composeLifecycleOwner.getHighSpeedVideoFpsRanges();
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.view.compose.RememberLifecycleOwnerKt$rememberLifecycleOwner$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.view.compose.RememberLifecycleOwnerKt$rememberLifecycleOwner$2$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RememberLifecycleOwnerKt$rememberLifecycleOwner$2$1(androidx.view.compose.ComposeLifecycleOwner composeLifecycleOwner, androidx.lifecycle.Lifecycle.State state, kotlin.coroutines.Continuation<? super androidx.view.compose.RememberLifecycleOwnerKt$rememberLifecycleOwner$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = composeLifecycleOwner;
        this.getHighSpeedVideoFpsRanges = state;
    }
}
