package com.paypal.oslo.feature.moneymovement.ui.shared;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/ui/shared/MoneyAmountFormatterViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/moneymovement/domain/util/MoneyAmountFormatter;", "formatter", "<init>", "(Lcom/paypal/oslo/feature/moneymovement/domain/util/MoneyAmountFormatter;)V", "Lcom/paypal/oslo/feature/moneymovement/domain/util/MoneyAmountFormatter;", "getFormatter", "()Lcom/paypal/oslo/feature/moneymovement/domain/util/MoneyAmountFormatter;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MoneyAmountFormatterViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter formatter;

    @javax.inject.Inject
    public MoneyAmountFormatterViewModel(com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter moneyAmountFormatter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyAmountFormatter, "");
        this.formatter = moneyAmountFormatter;
    }

    public final com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter getFormatter() {
        return this.formatter;
    }
}
