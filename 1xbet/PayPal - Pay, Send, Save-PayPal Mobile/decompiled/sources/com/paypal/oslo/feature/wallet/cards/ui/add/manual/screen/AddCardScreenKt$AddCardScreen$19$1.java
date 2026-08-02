package com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class AddCardScreenKt$AddCardScreen$19$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
    public final void Camera2StreamConfigurationMap() {
        ((com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModel) this.receiver).resetCardBrandSelectionGuidance();
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ kotlin.Unit invoke() {
        Camera2StreamConfigurationMap();
        return kotlin.Unit.INSTANCE;
    }

    AddCardScreenKt$AddCardScreen$19$1(java.lang.Object obj) {
        super(0, obj, com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModel.class, "resetCardBrandSelectionGuidance", "resetCardBrandSelectionGuidance()V", 0);
    }
}
