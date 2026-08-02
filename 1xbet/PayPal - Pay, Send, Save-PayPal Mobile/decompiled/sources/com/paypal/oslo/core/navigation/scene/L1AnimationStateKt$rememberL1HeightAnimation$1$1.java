package com.paypal.oslo.core.navigation.scene;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.navigation.scene.L1AnimationStateKt$rememberL1HeightAnimation$1$1", f = "L1AnimationState.kt", i = {0, 0, 0, 1, 1, 1, 2, 2}, l = {128, 137, 145}, m = "invokeSuspend", n = {"isTabSwitch", "heightChanged", "isExpanding", "isTabSwitch", "heightChanged", "isExpanding", "isTabSwitch", "heightChanged"}, nl = {135, 143, 152}, s = {"I$0", "I$1", "I$2", "I$0", "I$1", "I$2", "I$0", "I$1"}, v = 2)
/* loaded from: classes10.dex */
final class L1AnimationStateKt$rememberL1HeightAnimation$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.navigation.scene.L1TabState getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Float> getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    final /* synthetic */ float getInputFormats;
    int getInputSizeshNQ4ISI;
    int getOutputFormats;
    int getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00aa, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r19.Camera2StreamConfigurationMap, kotlin.coroutines.jvm.internal.Boxing.boxFloat(r19.getInputFormats), androidx.compose.animation.core.AnimationSpecKt.tween$default(500, 0, androidx.compose.animation.core.EasingKt.getFastOutSlowInEasing(), 2, null), null, null, r19, 12, null) != r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ca, code lost:
    
        if (r19.Camera2StreamConfigurationMap.snapTo(kotlin.coroutines.jvm.internal.Boxing.boxFloat(r19.getInputFormats), r19) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x011d, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r19.Camera2StreamConfigurationMap, kotlin.coroutines.jvm.internal.Boxing.boxFloat(r19.getInputFormats), androidx.compose.animation.core.AnimationSpecKt.tween$default(500, 0, androidx.compose.animation.core.EasingKt.getFastOutSlowInEasing(), 2, null), null, null, r19, 12, null) == r1) goto L46;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int i2 = (com.paypal.oslo.core.navigation.scene.L1AnimationStateKt.access$rememberL1HeightAnimation$lambda$1(this.getHighSpeedVideoFpsRanges) == null || kotlin.jvm.internal.Intrinsics.areEqual(com.paypal.oslo.core.navigation.scene.L1AnimationStateKt.access$rememberL1HeightAnimation$lambda$1(this.getHighSpeedVideoFpsRanges), this.getHighSpeedVideoFpsRangesFor)) ? 0 : 1;
            int i3 = (com.paypal.oslo.core.navigation.scene.L1AnimationStateKt.access$rememberL1HeightAnimation$lambda$4(this.getHighSpeedVideoSizes) == null || kotlin.jvm.internal.Intrinsics.areEqual(com.paypal.oslo.core.navigation.scene.L1AnimationStateKt.access$rememberL1HeightAnimation$lambda$4(this.getHighSpeedVideoSizes), this.getInputFormats)) ? 0 : 1;
            if (i2 != 0 && i3 != 0) {
                float f = this.getInputFormats;
                java.lang.Float access$rememberL1HeightAnimation$lambda$4 = com.paypal.oslo.core.navigation.scene.L1AnimationStateKt.access$rememberL1HeightAnimation$lambda$4(this.getHighSpeedVideoSizes);
                if (f > (access$rememberL1HeightAnimation$lambda$4 != null ? access$rememberL1HeightAnimation$lambda$4.floatValue() : 0.95f)) {
                    this.getHighResolutionOutputSizeshNQ4ISI.setTransitioning(true);
                    this.getOutputFormats = 1;
                    this.getOutputMinFrameDuration = 1;
                    this.getInputSizeshNQ4ISI = 1;
                    this.getHighSpeedVideoSizesFor = 1;
                } else {
                    this.getOutputFormats = 1;
                    this.getOutputMinFrameDuration = 1;
                    this.getInputSizeshNQ4ISI = 0;
                    this.getHighSpeedVideoSizesFor = 2;
                }
                return coroutine_suspended;
            }
            if (i3 != 0 || (this.getHighResolutionOutputSizeshNQ4ISI.isExpanded() && java.lang.Math.abs(this.Camera2StreamConfigurationMap.getValue().floatValue() - this.getInputFormats) > 0.001f)) {
                this.getHighResolutionOutputSizeshNQ4ISI.setTransitioning(true);
                this.getOutputFormats = i2;
                this.getOutputMinFrameDuration = i3;
                this.getHighSpeedVideoSizesFor = 3;
            }
        } else if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI.setTransitioning(false);
        } else if (i == 2) {
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            if (i != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI.setTransitioning(false);
            this.getHighResolutionOutputSizeshNQ4ISI.setContractingViaDrag(false);
        }
        this.getHighSpeedVideoFpsRanges.setValue(this.getHighSpeedVideoFpsRangesFor);
        this.getHighSpeedVideoSizes.setValue(kotlin.coroutines.jvm.internal.Boxing.boxFloat(this.getInputFormats));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.navigation.scene.L1AnimationStateKt$rememberL1HeightAnimation$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.navigation.scene.L1AnimationStateKt$rememberL1HeightAnimation$1$1(this.getHighSpeedVideoFpsRangesFor, this.getInputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    L1AnimationStateKt$rememberL1HeightAnimation$1$1(java.lang.String str, float f, com.paypal.oslo.core.navigation.scene.L1TabState l1TabState, androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable, androidx.compose.runtime.MutableState<java.lang.String> mutableState, androidx.compose.runtime.MutableState<java.lang.Float> mutableState2, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.navigation.scene.L1AnimationStateKt$rememberL1HeightAnimation$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getInputFormats = f;
        this.getHighResolutionOutputSizeshNQ4ISI = l1TabState;
        this.Camera2StreamConfigurationMap = animatable;
        this.getHighSpeedVideoFpsRanges = mutableState;
        this.getHighSpeedVideoSizes = mutableState2;
    }
}
