package com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class AddCardScreenKt$RegisterAddCardNavigationResults$2$1 extends kotlin.jvm.internal.AdaptedFunctionReference implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.userprofile.api.navigation.result.AddressSavedNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>, kotlin.coroutines.jvm.internal.SuspendFunction {
    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.userprofile.api.navigation.result.AddressSavedNavResult addressSavedNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenKt.access$RegisterAddCardNavigationResults$lambda$1$handleAddAddressResult((com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModel) this.receiver, addressSavedNavResult, continuation);
    }

    AddCardScreenKt$RegisterAddCardNavigationResults$2$1(java.lang.Object obj) {
        super(2, obj, com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModel.class, "handleAddAddressResult", "handleAddAddressResult(Lcom/paypal/oslo/feature/userprofile/api/navigation/result/AddressSavedNavResult;)V", 4);
    }
}
