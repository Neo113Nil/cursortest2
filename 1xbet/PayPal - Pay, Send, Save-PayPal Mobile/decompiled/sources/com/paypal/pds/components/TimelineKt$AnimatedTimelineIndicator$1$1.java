package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.pds.components.TimelineKt$AnimatedTimelineIndicator$1$1", f = "Timeline.kt", i = {}, l = {488, 497}, m = "invokeSuspend", n = {}, nl = {494, 502}, s = {}, v = 2)
/* loaded from: classes3.dex */
final class TimelineKt$AnimatedTimelineIndicator$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.pds.components.TimelineState> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.animation.core.Easing getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function0<kotlin.Unit>> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.animation.core.Easing getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.pds.components.TimelineState getInputFormats;
    int getInputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> getOutputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0077, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r14.getOutputFormats, kotlin.coroutines.jvm.internal.Boxing.boxFloat(1.0f), androidx.compose.animation.core.AnimationSpecKt.tween$default(300, 0, r14.getHighSpeedVideoSizes, 2, null), null, null, r14, 12, null) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0084, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r14.getOutputFormats, kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.8f), androidx.compose.animation.core.AnimationSpecKt.tween$default(150, 0, r14.getHighResolutionOutputSizeshNQ4ISI, 2, null), null, null, r14, 12, null) != r0) goto L14;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean booleanValue;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            booleanValue = ((java.lang.Boolean) this.getHighSpeedVideoFpsRangesFor.getValue()).booleanValue();
            if (!booleanValue) {
                this.Camera2StreamConfigurationMap.setValue(this.getInputFormats);
                this.getHighSpeedVideoFpsRangesFor.setValue(java.lang.Boolean.valueOf(true));
                return kotlin.Unit.INSTANCE;
            }
            this.getInputSizeshNQ4ISI = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                com.paypal.pds.components.TimelineKt.access$AnimatedTimelineIndicator$lambda$0(this.getHighSpeedVideoFpsRanges).invoke();
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.Camera2StreamConfigurationMap.setValue(this.getInputFormats);
        this.getInputSizeshNQ4ISI = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.pds.components.TimelineKt$AnimatedTimelineIndicator$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.pds.components.TimelineKt$AnimatedTimelineIndicator$1$1(this.getOutputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputFormats, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TimelineKt$AnimatedTimelineIndicator$1$1(androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable, androidx.compose.animation.core.Easing easing, com.paypal.pds.components.TimelineState timelineState, androidx.compose.animation.core.Easing easing2, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, androidx.compose.runtime.MutableState<com.paypal.pds.components.TimelineState> mutableState2, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function0<kotlin.Unit>> state, kotlin.coroutines.Continuation<? super com.paypal.pds.components.TimelineKt$AnimatedTimelineIndicator$1$1> continuation) {
        super(2, continuation);
        this.getOutputFormats = animatable;
        this.getHighResolutionOutputSizeshNQ4ISI = easing;
        this.getInputFormats = timelineState;
        this.getHighSpeedVideoSizes = easing2;
        this.getHighSpeedVideoFpsRangesFor = mutableState;
        this.Camera2StreamConfigurationMap = mutableState2;
        this.getHighSpeedVideoFpsRanges = state;
    }
}
