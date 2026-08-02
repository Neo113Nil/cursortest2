package com.paypal.oslo.core.commonui.components.containers;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.commonui.components.containers.DeckKt$AnimatedCardWrapper$6$1$1", f = "Deck.kt", i = {0, 1, 1, 2, 2, 2, 2}, l = {472, 476, 481}, m = "invokeSuspend", n = {"newDragX", "newDragX", "newDragY", "newDragX", "newDragY", "normalizedOffset", androidx.constraintlayout.motion.widget.Key.ROTATION}, nl = {475, 479, 482}, s = {"F$0", "F$0", "F$1", "F$0", "F$1", "F$2", "F$3"}, v = 2)
/* loaded from: classes10.dex */
final class DeckKt$AnimatedCardWrapper$6$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    float Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ float getHighSpeedVideoSizes;
    float getHighSpeedVideoSizesFor;
    int getInputFormats;
    float getOutputFormats;
    float getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0095, code lost:
    
        if (r8.getHighSpeedVideoFpsRangesFor.snapTo(kotlin.coroutines.jvm.internal.Boxing.boxFloat(r4), r8) != r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        if (r8.getHighResolutionOutputSizeshNQ4ISI.snapTo(kotlin.coroutines.jvm.internal.Boxing.boxFloat(r9), r8) != r0) goto L14;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        float floatValue;
        float f;
        float f2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            floatValue = this.getHighResolutionOutputSizeshNQ4ISI.getValue().floatValue() + this.getHighSpeedVideoSizes;
            this.Camera2StreamConfigurationMap = floatValue;
            this.getInputFormats = 1;
        } else if (i == 1) {
            float f3 = this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
            floatValue = f3;
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            f = this.getOutputMinFrameDuration;
            f2 = this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
            float coerceIn = kotlin.ranges.RangesKt.coerceIn(f2 / 100.0f, -1.0f, 1.0f);
            float f4 = 10.0f * coerceIn;
            this.Camera2StreamConfigurationMap = f2;
            this.getOutputMinFrameDuration = f;
            this.getHighSpeedVideoSizesFor = coerceIn;
            this.getOutputFormats = f4;
            this.getInputFormats = 3;
        }
        f = floatValue != 0.0f ? 50.0f : 0.0f;
        this.Camera2StreamConfigurationMap = floatValue;
        this.getOutputMinFrameDuration = f;
        this.getInputFormats = 2;
        if (this.getHighSpeedVideoFpsRanges.snapTo(kotlin.coroutines.jvm.internal.Boxing.boxFloat(f), this) != coroutine_suspended) {
            f2 = floatValue;
            float coerceIn2 = kotlin.ranges.RangesKt.coerceIn(f2 / 100.0f, -1.0f, 1.0f);
            float f42 = 10.0f * coerceIn2;
            this.Camera2StreamConfigurationMap = f2;
            this.getOutputMinFrameDuration = f;
            this.getHighSpeedVideoSizesFor = coerceIn2;
            this.getOutputFormats = f42;
            this.getInputFormats = 3;
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.commonui.components.containers.DeckKt$AnimatedCardWrapper$6$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.commonui.components.containers.DeckKt$AnimatedCardWrapper$6$1$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeckKt$AnimatedCardWrapper$6$1$1(androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable, float f, androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable2, androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable3, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.commonui.components.containers.DeckKt$AnimatedCardWrapper$6$1$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = animatable;
        this.getHighSpeedVideoSizes = f;
        this.getHighSpeedVideoFpsRanges = animatable2;
        this.getHighSpeedVideoFpsRangesFor = animatable3;
    }
}
