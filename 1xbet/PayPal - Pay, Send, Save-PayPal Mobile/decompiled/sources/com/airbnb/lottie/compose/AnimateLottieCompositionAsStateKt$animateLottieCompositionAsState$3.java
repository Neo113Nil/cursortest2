package com.airbnb.lottie.compose;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3", f = "animateLottieCompositionAsState.kt", i = {}, l = {73, 78}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.airbnb.lottie.compose.LottieClipSpec Camera2StreamConfigurationMap;
    final /* synthetic */ com.airbnb.lottie.compose.LottieAnimatable getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ float getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.airbnb.lottie.LottieComposition getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.airbnb.lottie.compose.LottieCancellationBehavior getHighSpeedVideoSizes;
    final /* synthetic */ boolean getHighSpeedVideoSizesFor;
    final /* synthetic */ boolean getInputFormats;
    final /* synthetic */ boolean getInputSizeshNQ4ISI;
    final /* synthetic */ boolean getOutputFormats;
    final /* synthetic */ int getOutputMinFrameDuration;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getOutputMinFrameDurationlomOqCM;
    int getOutputSizes;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007a, code lost:
    
        if (com.airbnb.lottie.compose.LottieAnimatable.DefaultImpls.animate$default(r2, r18.getHighSpeedVideoFpsRangesFor, 0, r18.getOutputMinFrameDuration, r18.getOutputFormats, r18.getHighSpeedVideoFpsRanges, r18.Camera2StreamConfigurationMap, r2.getProgress(), false, r18.getHighSpeedVideoSizes, false, r18.getHighSpeedVideoSizesFor, r18, my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_KEY_INVALID, null) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003e, code lost:
    
        if (com.airbnb.lottie.compose.LottieAnimatableKt.resetToBeginning(r18.getHighResolutionOutputSizeshNQ4ISI, r18) != r1) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean booleanValue;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.getInputSizeshNQ4ISI) {
                booleanValue = ((java.lang.Boolean) this.getOutputMinFrameDurationlomOqCM.getValue()).booleanValue();
                if (!booleanValue && this.getInputFormats) {
                    this.getOutputSizes = 1;
                }
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
        this.getOutputMinFrameDurationlomOqCM.setValue(java.lang.Boolean.valueOf(this.getInputSizeshNQ4ISI));
        if (!this.getInputSizeshNQ4ISI) {
            return kotlin.Unit.INSTANCE;
        }
        com.airbnb.lottie.compose.LottieAnimatable lottieAnimatable = this.getHighResolutionOutputSizeshNQ4ISI;
        this.getOutputSizes = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3(this.getInputSizeshNQ4ISI, this.getInputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getOutputMinFrameDuration, this.getOutputFormats, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoSizesFor, this.getOutputMinFrameDurationlomOqCM, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3(boolean z, boolean z2, com.airbnb.lottie.compose.LottieAnimatable lottieAnimatable, com.airbnb.lottie.LottieComposition lottieComposition, int i, boolean z3, float f, com.airbnb.lottie.compose.LottieClipSpec lottieClipSpec, com.airbnb.lottie.compose.LottieCancellationBehavior lottieCancellationBehavior, boolean z4, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, kotlin.coroutines.Continuation<? super com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3> continuation) {
        super(2, continuation);
        this.getInputSizeshNQ4ISI = z;
        this.getInputFormats = z2;
        this.getHighResolutionOutputSizeshNQ4ISI = lottieAnimatable;
        this.getHighSpeedVideoFpsRangesFor = lottieComposition;
        this.getOutputMinFrameDuration = i;
        this.getOutputFormats = z3;
        this.getHighSpeedVideoFpsRanges = f;
        this.Camera2StreamConfigurationMap = lottieClipSpec;
        this.getHighSpeedVideoSizes = lottieCancellationBehavior;
        this.getHighSpeedVideoSizesFor = z4;
        this.getOutputMinFrameDurationlomOqCM = mutableState;
    }
}
