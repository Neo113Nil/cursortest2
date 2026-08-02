package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.pds.components.AccordionKt$ExpansionButton$1$1", f = "Accordion.kt", i = {}, l = {307, 309}, m = "invokeSuspend", n = {}, nl = {308, 310}, s = {}, v = 2)
/* loaded from: classes16.dex */
final class AccordionKt$ExpansionButton$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.animation.core.Easing Camera2StreamConfigurationMap;
    final /* synthetic */ int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.pds.core.Icon> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.animation.core.Easing getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ float getHighSpeedVideoSizes;
    final /* synthetic */ boolean getInputFormats;
    int getOutputFormats;
    final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r14.getOutputMinFrameDuration, kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.0f), androidx.compose.animation.core.AnimationSpecKt.tween$default(r14.getHighResolutionOutputSizeshNQ4ISI, 0, r14.Camera2StreamConfigurationMap, 2, null), null, null, r14, 12, null) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r14.getOutputMinFrameDuration, kotlin.coroutines.jvm.internal.Boxing.boxFloat(r14.getHighSpeedVideoSizes), androidx.compose.animation.core.AnimationSpecKt.tween$default(r14.getHighResolutionOutputSizeshNQ4ISI, 0, r14.getHighSpeedVideoFpsRangesFor, 2, null), null, null, r14, 12, null) != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getOutputFormats = 1;
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
        this.getHighSpeedVideoFpsRanges.setValue(this.getInputFormats ? com.paypal.pds.core.Icon.ChevronUp.INSTANCE : com.paypal.pds.core.Icon.ChevronDown.INSTANCE);
        this.getOutputFormats = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.pds.components.AccordionKt$ExpansionButton$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.pds.components.AccordionKt$ExpansionButton$1$1(this.getOutputMinFrameDuration, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getInputFormats, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccordionKt$ExpansionButton$1$1(androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable, float f, int i, androidx.compose.animation.core.Easing easing, boolean z, androidx.compose.animation.core.Easing easing2, androidx.compose.runtime.MutableState<com.paypal.pds.core.Icon> mutableState, kotlin.coroutines.Continuation<? super com.paypal.pds.components.AccordionKt$ExpansionButton$1$1> continuation) {
        super(2, continuation);
        this.getOutputMinFrameDuration = animatable;
        this.getHighSpeedVideoSizes = f;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRangesFor = easing;
        this.getInputFormats = z;
        this.Camera2StreamConfigurationMap = easing2;
        this.getHighSpeedVideoFpsRanges = mutableState;
    }
}
