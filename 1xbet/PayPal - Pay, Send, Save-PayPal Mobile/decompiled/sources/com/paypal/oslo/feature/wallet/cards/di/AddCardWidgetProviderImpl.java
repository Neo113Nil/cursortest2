package com.paypal.oslo.feature.wallet.cards.di;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003Ru\u0010\u000f\u001a]\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0006\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\u0006\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u0006\u0012\u000b\u0012\t\u0018\u00010\t¢\u0006\u0002\b\u0006\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\u0006\u0012\u000b\u0012\t\u0018\u00010\f¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\u000b0\u0004j\u0002`\r¢\u0006\u0002\b\u000e8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R)\u0010\u0014\u001a\u0011\u0012\u0004\u0012\u00020\t0\nj\u0002`\u0013¢\u0006\u0002\b\u000e8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/di/AddCardWidgetProviderImpl;", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/provider/AddCardWidgetProvider;", "<init>", "()V", "Lkotlin/Function6;", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "Lkotlin/ParameterName;", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardWidgetConfig;", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$Events;", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/provider/AddCardWidgetController;", "Lkotlin/Function0;", "", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$Slots;", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/provider/AddCardWidget;", "Landroidx/compose/runtime/Composable;", com.paypal.oslo.feature.debitcard.shared.analytics.PushProvisioningWidgetAnalytics.ACTION, "Lkotlin/jvm/functions/Function8;", "getWidget", "()Lkotlin/jvm/functions/Function8;", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/provider/AddCardWidgetControllerFactory;", "rememberController", "Lkotlin/jvm/functions/Function2;", "getRememberController", "()Lkotlin/jvm/functions/Function2;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AddCardWidgetProviderImpl implements com.paypal.oslo.feature.wallet.api.ui.cards.add.provider.AddCardWidgetProvider {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function8<com.paypal.oslo.core.navigation.AppNavigator, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardWidgetConfig, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Events, com.paypal.oslo.feature.wallet.api.ui.cards.add.provider.AddCardWidgetController, kotlin.jvm.functions.Function0<kotlin.Unit>, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Slots, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> widget = com.paypal.oslo.feature.wallet.cards.di.ComposableSingletons$AddCardWidgetProviderImplKt.INSTANCE.getLambda$141687790$wallet_prodRelease();
    private final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, com.paypal.oslo.feature.wallet.api.ui.cards.add.provider.AddCardWidgetController> rememberController = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.di.AddCardWidgetProviderImpl$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.wallet.cards.di.AddCardWidgetProviderImpl.m20973$r8$lambda$7ExDS2MGxOyFTWAGKMPYV9iUA8((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    };

    @javax.inject.Inject
    public AddCardWidgetProviderImpl() {
    }

    @Override // com.paypal.oslo.feature.wallet.api.ui.cards.add.provider.AddCardWidgetProvider
    public final kotlin.jvm.functions.Function8<com.paypal.oslo.core.navigation.AppNavigator, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardWidgetConfig, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Events, com.paypal.oslo.feature.wallet.api.ui.cards.add.provider.AddCardWidgetController, kotlin.jvm.functions.Function0<kotlin.Unit>, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Slots, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getWidget() {
        return this.widget;
    }

    @Override // com.paypal.oslo.feature.wallet.api.ui.cards.add.provider.AddCardWidgetProvider
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, com.paypal.oslo.feature.wallet.api.ui.cards.add.provider.AddCardWidgetController> getRememberController() {
        return this.rememberController;
    }

    /* renamed from: $r8$lambda$7ExDS2MGxOyFTWA-GKMPYV9iUA8, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.api.ui.cards.add.provider.AddCardWidgetController m20973$r8$lambda$7ExDS2MGxOyFTWAGKMPYV9iUA8(androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceGroup(-1254831910);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1254831910, i, -1, "com.paypal.oslo.feature.wallet.cards.di.AddCardWidgetProviderImpl.rememberController.<anonymous> (AddCardWidgetProviderImpl.kt:41)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new com.paypal.oslo.feature.wallet.cards.di.AddCardWidgetControllerImpl();
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.wallet.cards.di.AddCardWidgetControllerImpl addCardWidgetControllerImpl = (com.paypal.oslo.feature.wallet.cards.di.AddCardWidgetControllerImpl) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return addCardWidgetControllerImpl;
    }
}
