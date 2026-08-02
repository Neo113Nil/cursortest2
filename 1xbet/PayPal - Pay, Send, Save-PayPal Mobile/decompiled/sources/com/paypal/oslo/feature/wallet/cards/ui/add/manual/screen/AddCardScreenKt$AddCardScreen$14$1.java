package com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class AddCardScreenKt$AddCardScreen$14$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction, kotlin.Unit> {
    public final void getHighSpeedVideoSizes(com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navAction, "");
        ((com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModel) this.receiver).handleHeaderNavAction(navAction);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction) {
        getHighSpeedVideoSizes(navAction);
        return kotlin.Unit.INSTANCE;
    }

    AddCardScreenKt$AddCardScreen$14$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModel.class, "handleHeaderNavAction", "handleHeaderNavAction(Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$NavAction;)V", 0);
    }
}
