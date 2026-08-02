package com.paypal.oslo.feature.taptopay.ui.paymode.cardselection;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.PayModeStackViewKt$PayModeStackView$2$1$2$1$1$1", f = "PayModeStackView.kt", i = {}, l = {241, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, 251}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class PayModeStackViewKt$PayModeStackView$2$1$2$1$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ float Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r9.getHighResolutionOutputSizeshNQ4ISI.snapTo(kotlin.coroutines.jvm.internal.Boxing.boxFloat(r9.Camera2StreamConfigurationMap), r9) != r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r9.getHighResolutionOutputSizeshNQ4ISI, kotlin.coroutines.jvm.internal.Boxing.boxFloat(r9.Camera2StreamConfigurationMap), androidx.compose.animation.core.AnimationSpecKt.tween$default(350, 0, androidx.compose.animation.core.EasingKt.getFastOutSlowInEasing(), 2, null), null, null, r9, 12, null) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean booleanValue;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            booleanValue = ((java.lang.Boolean) this.getHighSpeedVideoSizes.getValue()).booleanValue();
            if (booleanValue) {
                this.getHighSpeedVideoFpsRangesFor = 1;
            } else {
                this.getHighSpeedVideoFpsRangesFor = 2;
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.PayModeStackViewKt$PayModeStackView$2$1$2$1$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.PayModeStackViewKt$PayModeStackView$2$1$2$1$1$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayModeStackViewKt$PayModeStackView$2$1$2$1$1$1(androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable, float f, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.ui.paymode.cardselection.PayModeStackViewKt$PayModeStackView$2$1$2$1$1$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = animatable;
        this.Camera2StreamConfigurationMap = f;
        this.getHighSpeedVideoSizes = mutableState;
    }
}
