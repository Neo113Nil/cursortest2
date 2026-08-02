package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.navigation.compose.NavHostKt$NavHost$29$1$1$1", f = "NavHost.kt", i = {}, l = {642, 646}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class NavHostKt$NavHost$29$1$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.view.NavBackStackEntry Camera2StreamConfigurationMap;
    final /* synthetic */ float getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.animation.core.SeekableTransitionState<androidx.view.NavBackStackEntry> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (r11.getHighSpeedVideoFpsRanges.snapTo(r11.Camera2StreamConfigurationMap, r11) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        if (androidx.compose.animation.core.SeekableTransitionState.seekTo$default(r11.getHighSpeedVideoFpsRanges, r6, null, r11, 2, null) != r0) goto L14;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            float f = this.getHighResolutionOutputSizeshNQ4ISI;
            if (f > 0.0f) {
                this.getHighSpeedVideoSizes = 1;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI == 0.0f) {
            this.getHighSpeedVideoSizes = 2;
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.view.compose.NavHostKt$NavHost$29$1$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.view.compose.NavHostKt$NavHost$29$1$1$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavHostKt$NavHost$29$1$1$1(float f, androidx.compose.animation.core.SeekableTransitionState<androidx.view.NavBackStackEntry> seekableTransitionState, androidx.view.NavBackStackEntry navBackStackEntry, kotlin.coroutines.Continuation<? super androidx.view.compose.NavHostKt$NavHost$29$1$1$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = f;
        this.getHighSpeedVideoFpsRanges = seekableTransitionState;
        this.Camera2StreamConfigurationMap = navBackStackEntry;
    }
}
