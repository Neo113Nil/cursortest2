package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.navigation.compose.NavHostKt$NavHost$28$1", f = "NavHost.kt", i = {}, l = {620}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class NavHostKt$NavHost$28$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.animation.core.SeekableTransitionState<androidx.view.NavBackStackEntry> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.State<java.util.List<androidx.view.NavBackStackEntry>> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableFloatState getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        float floatValue;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.view.NavBackStackEntry navBackStackEntry = (androidx.view.NavBackStackEntry) androidx.view.compose.NavHostKt.access$NavHost$lambda$38(this.getHighSpeedVideoFpsRanges).get(androidx.view.compose.NavHostKt.access$NavHost$lambda$38(this.getHighSpeedVideoFpsRanges).size() - 2);
            androidx.compose.animation.core.SeekableTransitionState<androidx.view.NavBackStackEntry> seekableTransitionState = this.getHighResolutionOutputSizeshNQ4ISI;
            floatValue = this.getHighSpeedVideoFpsRangesFor.getFloatValue();
            this.Camera2StreamConfigurationMap = 1;
            if (seekableTransitionState.seekTo(floatValue, navBackStackEntry, this) == coroutine_suspended) {
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
        return ((androidx.view.compose.NavHostKt$NavHost$28$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.view.compose.NavHostKt$NavHost$28$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    NavHostKt$NavHost$28$1(androidx.compose.animation.core.SeekableTransitionState<androidx.view.NavBackStackEntry> seekableTransitionState, androidx.compose.runtime.State<? extends java.util.List<androidx.view.NavBackStackEntry>> state, androidx.compose.runtime.MutableFloatState mutableFloatState, kotlin.coroutines.Continuation<? super androidx.view.compose.NavHostKt$NavHost$28$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = seekableTransitionState;
        this.getHighSpeedVideoFpsRanges = state;
        this.getHighSpeedVideoFpsRangesFor = mutableFloatState;
    }
}
