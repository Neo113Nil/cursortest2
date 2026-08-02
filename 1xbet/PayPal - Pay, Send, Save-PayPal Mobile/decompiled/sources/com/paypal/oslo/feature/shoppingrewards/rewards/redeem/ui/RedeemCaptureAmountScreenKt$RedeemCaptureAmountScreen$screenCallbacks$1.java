package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/RedeemCaptureAmountScreenKt$RedeemCaptureAmountScreen$screenCallbacks$1;", "Lcom/paypal/oslo/feature/moneymovement/api/amount/screen/AmountScreenCallbacks;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/RedeemCaptureAmountScreenKt$RedeemCaptureAmountScreen$screenCallbacks$1$heroCurrencySectionCallbacks$1;", "heroCurrencySectionCallbacks", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/RedeemCaptureAmountScreenKt$RedeemCaptureAmountScreen$screenCallbacks$1$heroCurrencySectionCallbacks$1;", "getHeroCurrencySectionCallbacks", "()Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/RedeemCaptureAmountScreenKt$RedeemCaptureAmountScreen$screenCallbacks$1$heroCurrencySectionCallbacks$1;", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardCallbacks;", "keyboardCallbacks", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardCallbacks;", "getKeyboardCallbacks", "()Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardCallbacks;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/RedeemCaptureAmountScreenKt$RedeemCaptureAmountScreen$screenCallbacks$1$actionButtonGroupCallbacks$1;", "actionButtonGroupCallbacks", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/RedeemCaptureAmountScreenKt$RedeemCaptureAmountScreen$screenCallbacks$1$actionButtonGroupCallbacks$1;", "getActionButtonGroupCallbacks", "()Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/RedeemCaptureAmountScreenKt$RedeemCaptureAmountScreen$screenCallbacks$1$actionButtonGroupCallbacks$1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RedeemCaptureAmountScreenKt$RedeemCaptureAmountScreen$screenCallbacks$1 implements com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenCallbacks {
    private final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemCaptureAmountScreenKt$RedeemCaptureAmountScreen$screenCallbacks$1$actionButtonGroupCallbacks$1 actionButtonGroupCallbacks;
    private final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemCaptureAmountScreenKt$RedeemCaptureAmountScreen$screenCallbacks$1$heroCurrencySectionCallbacks$1 heroCurrencySectionCallbacks = new com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionCallbacks() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemCaptureAmountScreenKt$RedeemCaptureAmountScreen$screenCallbacks$1$heroCurrencySectionCallbacks$1
        private final java.lang.Void amountInputCallbacks;
        private final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemCaptureAmountScreenKt$RedeemCaptureAmountScreen$screenCallbacks$1$heroCurrencySectionCallbacks$1$crossBorderCallbacks$1 crossBorderCallbacks = new com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemCaptureAmountScreenKt$RedeemCaptureAmountScreen$screenCallbacks$1$heroCurrencySectionCallbacks$1$crossBorderCallbacks$1
            @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks
            public final void onPrimaryCurrencyClick() {
            }

            @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks
            public final void onPrimaryRowClick() {
            }

            @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks
            public final void onSecondaryCurrencyClick() {
            }

            @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks
            public final void onSecondaryRowClick() {
            }

            @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks
            public final void onSwapClick() {
            }

            @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks
            public final void onSecondaryTextFieldValueChange(androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textFieldValue, "");
            }

            @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks
            public final void onSecondaryAmountChange(com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount amount) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            }

            @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks
            public final void onPrimaryTextFieldValueChange(androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textFieldValue, "");
            }

            @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency.CrossBorderHeroCurrencyCallbacks
            public final void onPrimaryAmountChange(com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount amount) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            }
        };
        private final java.lang.Void currencyExchangeActionCallbacks;
        private final java.lang.Void currencyPickerCallbacks;

        @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionCallbacks
        public final /* bridge */ /* synthetic */ com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputCallbacks getAmountInputCallbacks() {
            return (com.paypal.oslo.feature.moneymovement.api.amount.component.amountinput.AmountInputCallbacks) getAmountInputCallbacks();
        }

        @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionCallbacks
        public final /* bridge */ /* synthetic */ com.paypal.oslo.feature.moneymovement.api.amount.component.currencyexchangeaction.CurrencyExchangeActionCallbacks getCurrencyExchangeActionCallbacks() {
            return (com.paypal.oslo.feature.moneymovement.api.amount.component.currencyexchangeaction.CurrencyExchangeActionCallbacks) getCurrencyExchangeActionCallbacks();
        }

        @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionCallbacks
        public final /* bridge */ /* synthetic */ com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerCallbacks getCurrencyPickerCallbacks() {
            return (com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerCallbacks) getCurrencyPickerCallbacks();
        }

        public final java.lang.Void getAmountInputCallbacks() {
            return this.amountInputCallbacks;
        }

        public final java.lang.Void getCurrencyPickerCallbacks() {
            return this.currencyPickerCallbacks;
        }

        @Override // com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionCallbacks
        public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemCaptureAmountScreenKt$RedeemCaptureAmountScreen$screenCallbacks$1$heroCurrencySectionCallbacks$1$crossBorderCallbacks$1 getCrossBorderCallbacks() {
            return this.crossBorderCallbacks;
        }

        public final java.lang.Void getCurrencyExchangeActionCallbacks() {
            return this.currencyExchangeActionCallbacks;
        }
    };
    private final com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks keyboardCallbacks;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemCaptureAmountScreenKt$RedeemCaptureAmountScreen$screenCallbacks$1$heroCurrencySectionCallbacks$1] */
    RedeemCaptureAmountScreenKt$RedeemCaptureAmountScreen$screenCallbacks$1(final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel redeemViewModel) {
        this.keyboardCallbacks = com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks.Companion.create$default(com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks.INSTANCE, null, null, null, null, null, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemCaptureAmountScreenKt$RedeemCaptureAmountScreen$screenCallbacks$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemCaptureAmountScreenKt$RedeemCaptureAmountScreen$screenCallbacks$1.$r8$lambda$zKWUhekZhoylq8Ce61XpViJOjZs(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel.this, (java.lang.String) obj);
            }
        }, 63, null);
        this.actionButtonGroupCallbacks = new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemCaptureAmountScreenKt$RedeemCaptureAmountScreen$screenCallbacks$1$actionButtonGroupCallbacks$1(redeemViewModel);
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenCallbacks
    public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemCaptureAmountScreenKt$RedeemCaptureAmountScreen$screenCallbacks$1$heroCurrencySectionCallbacks$1 getHeroCurrencySectionCallbacks() {
        return this.heroCurrencySectionCallbacks;
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenCallbacks
    public final com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks getKeyboardCallbacks() {
        return this.keyboardCallbacks;
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.amount.screen.AmountScreenCallbacks
    public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedeemCaptureAmountScreenKt$RedeemCaptureAmountScreen$screenCallbacks$1$actionButtonGroupCallbacks$1 getActionButtonGroupCallbacks() {
        return this.actionButtonGroupCallbacks;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zKWUhekZhoylq8Ce61XpViJOjZs(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel redeemViewModel, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        redeemViewModel.onAmountChange(str);
        return kotlin.Unit.INSTANCE;
    }
}
