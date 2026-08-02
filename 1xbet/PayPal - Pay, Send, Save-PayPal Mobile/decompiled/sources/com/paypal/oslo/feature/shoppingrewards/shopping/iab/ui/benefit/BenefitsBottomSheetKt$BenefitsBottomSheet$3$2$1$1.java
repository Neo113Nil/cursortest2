package com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitsBottomSheetKt$BenefitsBottomSheet$3$2$1$1", f = "BenefitsBottomSheet.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE}, m = "invokeSuspend", n = {}, nl = {186}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class BenefitsBottomSheetKt$BenefitsBottomSheet$3$2$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitDetailsUiData> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.runtime.MutableState<com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitDetailsUiData> mutableState = this.getHighSpeedVideoFpsRanges;
            this.Camera2StreamConfigurationMap = 1;
            if (com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitsBottomSheetKt.handleDetailSheetDismiss(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitsBottomSheetKt$BenefitsBottomSheet$3$2$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitsBottomSheetKt$BenefitsBottomSheet$3$2$1$1.getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.MutableState.this);
                }
            }, this.getHighSpeedVideoSizes, this) == coroutine_suspended) {
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

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitsBottomSheetKt$BenefitsBottomSheet$3$2$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitsBottomSheetKt$BenefitsBottomSheet$3$2$1$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BenefitsBottomSheetKt$BenefitsBottomSheet$3$2$1$1(kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.MutableState<com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitDetailsUiData> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitsBottomSheetKt$BenefitsBottomSheet$3$2$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = function0;
        this.getHighSpeedVideoFpsRanges = mutableState;
    }
}
