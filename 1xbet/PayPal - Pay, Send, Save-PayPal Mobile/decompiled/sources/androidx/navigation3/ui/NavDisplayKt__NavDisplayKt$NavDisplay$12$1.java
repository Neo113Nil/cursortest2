package androidx.navigation3.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$12$1", f = "NavDisplay.kt", i = {}, l = {773, 793}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class NavDisplayKt__NavDisplayKt$NavDisplay$12$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.animation.core.Transition<androidx.navigation3.scene.Scene<T>> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.animation.core.SeekableTransitionState<androidx.navigation3.scene.Scene<T>> getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.navigation3.scene.Scene<T> getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (androidx.compose.animation.core.SeekableTransitionState.animateTo$default(r12.getHighSpeedVideoFpsRanges, r12.getHighSpeedVideoSizes, null, r12, 2, null) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c7, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c5, code lost:
    
        if (androidx.compose.animation.core.SuspendAnimationKt.animate$default(r4, r5, 0.0f, r7, new androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$12$1$$ExternalSyntheticLambda0(r13, r5, r1, r3), r12, 4, null) == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.Pair pair;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoFpsRangesFor;
            if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges.getCurrentState(), this.getHighSpeedVideoSizes)) {
                long totalDurationNanos = this.Camera2StreamConfigurationMap.getTotalDurationNanos() / 1000000;
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap.getTargetState(), this.getHighSpeedVideoSizes)) {
                    pair = kotlin.TuplesKt.to(kotlin.coroutines.jvm.internal.Boxing.boxFloat(1.0f), kotlin.coroutines.jvm.internal.Boxing.boxInt((int) ((1.0f - this.getHighSpeedVideoFpsRanges.getFraction()) * totalDurationNanos)));
                } else {
                    pair = kotlin.TuplesKt.to(kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.0f), kotlin.coroutines.jvm.internal.Boxing.boxInt((int) (this.getHighSpeedVideoFpsRanges.getFraction() * totalDurationNanos)));
                }
                final float floatValue = ((java.lang.Number) pair.component1()).floatValue();
                int intValue = ((java.lang.Number) pair.component2()).intValue();
                float fraction = this.getHighSpeedVideoFpsRanges.getFraction();
                androidx.compose.animation.core.TweenSpec tween$default = androidx.compose.animation.core.AnimationSpecKt.tween$default(intValue, 0, null, 6, null);
                final androidx.compose.animation.core.SeekableTransitionState<androidx.navigation3.scene.Scene<T>> seekableTransitionState = this.getHighSpeedVideoFpsRanges;
                final androidx.navigation3.scene.Scene<T> scene = this.getHighSpeedVideoSizes;
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

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(kotlinx.coroutines.CoroutineScope coroutineScope, float f, androidx.compose.animation.core.SeekableTransitionState seekableTransitionState, androidx.navigation3.scene.Scene scene, float f2) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$12$1$1$1(f2, f, seekableTransitionState, scene, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$12$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$12$1 navDisplayKt__NavDisplayKt$NavDisplay$12$1 = new androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$12$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
        navDisplayKt__NavDisplayKt$NavDisplay$12$1.getHighSpeedVideoFpsRangesFor = obj;
        return navDisplayKt__NavDisplayKt$NavDisplay$12$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavDisplayKt__NavDisplayKt$NavDisplay$12$1(androidx.compose.animation.core.SeekableTransitionState<androidx.navigation3.scene.Scene<T>> seekableTransitionState, androidx.navigation3.scene.Scene<T> scene, androidx.compose.animation.core.Transition<androidx.navigation3.scene.Scene<T>> transition, kotlin.coroutines.Continuation<? super androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$12$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = seekableTransitionState;
        this.getHighSpeedVideoSizes = scene;
        this.Camera2StreamConfigurationMap = transition;
    }
}
