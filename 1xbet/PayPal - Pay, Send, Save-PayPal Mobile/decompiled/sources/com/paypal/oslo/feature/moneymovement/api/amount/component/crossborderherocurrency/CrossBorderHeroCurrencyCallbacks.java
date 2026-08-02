package com.paypal.oslo.feature.moneymovement.api.amount.component.crossborderherocurrency;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\tJ\u000f\u0010\r\u001a\u00020\u0004H&¢\u0006\u0004\b\r\u0010\tJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0012\u0010\u0011À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/amount/component/crossborderherocurrency/CrossBorderHeroCurrencyCallbacks;", "", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "amount", "", "onPrimaryAmountChange", "(Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;)V", "onSecondaryAmountChange", "onPrimaryCurrencyClick", "()V", "onSecondaryCurrencyClick", "onPrimaryRowClick", "onSecondaryRowClick", "onSwapClick", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValue", "onPrimaryTextFieldValueChange", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "onSecondaryTextFieldValueChange"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface CrossBorderHeroCurrencyCallbacks {
    void onPrimaryAmountChange(com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount amount);

    void onPrimaryCurrencyClick();

    void onPrimaryRowClick();

    void onPrimaryTextFieldValueChange(androidx.compose.ui.text.input.TextFieldValue textFieldValue);

    void onSecondaryAmountChange(com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount amount);

    void onSecondaryCurrencyClick();

    void onSecondaryRowClick();

    void onSecondaryTextFieldValueChange(androidx.compose.ui.text.input.TextFieldValue textFieldValue);

    void onSwapClick();
}
