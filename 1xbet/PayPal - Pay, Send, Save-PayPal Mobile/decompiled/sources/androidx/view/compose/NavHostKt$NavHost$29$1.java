package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.navigation.compose.NavHostKt$NavHost$29$1", f = "NavHost.kt", i = {}, l = {627, 634}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class NavHostKt$NavHost$29$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.animation.core.Transition<androidx.view.NavBackStackEntry> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.animation.core.SeekableTransitionState<androidx.view.NavBackStackEntry> getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.view.NavBackStackEntry getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (androidx.compose.animation.core.SeekableTransitionState.animateTo$default(r13.getHighSpeedVideoFpsRanges, r13.getHighSpeedVideoSizes, null, r13, 2, null) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007c, code lost:
    
        if (androidx.compose.animation.core.SuspendAnimationKt.animate$default(r5, 0.0f, 0.0f, r8, new androidx.view.compose.NavHostKt$NavHost$29$1$$ExternalSyntheticLambda0(r14, r1, r3), r13, 4, null) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoFpsRangesFor;
            if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges.getCurrentState(), this.getHighSpeedVideoSizes)) {
                long totalDurationNanos = this.Camera2StreamConfigurationMap.getTotalDurationNanos() / 1000000;
                float fraction = this.getHighSpeedVideoFpsRanges.getFraction();
                androidx.compose.animation.core.TweenSpec tween$default = androidx.compose.animation.core.AnimationSpecKt.tween$default((int) (this.getHighSpeedVideoFpsRanges.getFraction() * totalDurationNanos), 0, null, 6, null);
                final androidx.compose.animation.core.SeekableTransitionState<androidx.view.NavBackStackEntry> seekableTransitionState = this.getHighSpeedVideoFpsRanges;
                final androidx.view.NavBackStackEntry navBackStackEntry = this.getHighSpeedVideoSizes;
                this.getHighResolutionOutputSizeshNQ4ISI = 2;
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.animation.core.SeekableTransitionState seekableTransitionState, androidx.view.NavBackStackEntry navBackStackEntry, float f) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.view.compose.NavHostKt$NavHost$29$1$1$1(f, seekableTransitionState, navBackStackEntry, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.view.compose.NavHostKt$NavHost$29$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.view.compose.NavHostKt$NavHost$29$1 navHostKt$NavHost$29$1 = new androidx.view.compose.NavHostKt$NavHost$29$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
        navHostKt$NavHost$29$1.getHighSpeedVideoFpsRangesFor = obj;
        return navHostKt$NavHost$29$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavHostKt$NavHost$29$1(androidx.compose.animation.core.SeekableTransitionState<androidx.view.NavBackStackEntry> seekableTransitionState, androidx.view.NavBackStackEntry navBackStackEntry, androidx.compose.animation.core.Transition<androidx.view.NavBackStackEntry> transition, kotlin.coroutines.Continuation<? super androidx.view.compose.NavHostKt$NavHost$29$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = seekableTransitionState;
        this.getHighSpeedVideoSizes = navBackStackEntry;
        this.Camera2StreamConfigurationMap = transition;
    }
}
