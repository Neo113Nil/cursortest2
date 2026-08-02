package com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class AddCardScreenKt$RegisterAddCardNavigationResults$1$1 extends kotlin.jvm.internal.AdaptedFunctionReference implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>, kotlin.coroutines.jvm.internal.SuspendFunction {
    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult scanCardNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenKt.access$RegisterAddCardNavigationResults$lambda$0$handleScannerResult((com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModel) this.receiver, scanCardNavResult, continuation);
    }

    AddCardScreenKt$RegisterAddCardNavigationResults$1$1(java.lang.Object obj) {
        super(2, obj, com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModel.class, "handleScannerResult", "handleScannerResult(Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult;)V", 4);
    }
}
