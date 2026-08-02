package com.paypal.oslo.feature.moneymovement.api.amount.screen;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/amount/screen/AmountScreenCallbacks;", "", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/herocurrencysection/HeroCurrencySectionCallbacks;", "getHeroCurrencySectionCallbacks", "()Lcom/paypal/oslo/feature/moneymovement/api/amount/component/herocurrencysection/HeroCurrencySectionCallbacks;", "heroCurrencySectionCallbacks", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardCallbacks;", "getKeyboardCallbacks", "()Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardCallbacks;", "keyboardCallbacks", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/actionbuttongroup/ActionButtonGroupCallbacks;", "getActionButtonGroupCallbacks", "()Lcom/paypal/oslo/feature/moneymovement/api/amount/component/actionbuttongroup/ActionButtonGroupCallbacks;", "actionButtonGroupCallbacks"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface AmountScreenCallbacks {
    com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupCallbacks getActionButtonGroupCallbacks();

    com.paypal.oslo.feature.moneymovement.api.amount.component.herocurrencysection.HeroCurrencySectionCallbacks getHeroCurrencySectionCallbacks();

    com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardCallbacks getKeyboardCallbacks();
}
