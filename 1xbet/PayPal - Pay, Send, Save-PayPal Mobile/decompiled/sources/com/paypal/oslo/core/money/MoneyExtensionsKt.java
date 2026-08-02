package com.paypal.oslo.core.money;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/core/money/Money;", "Lcom/paypal/oslo/core/money/Tax;", "tax", "withAppliedTax", "(Lcom/paypal/oslo/core/money/Money;Lcom/paypal/oslo/core/money/Tax;)Lcom/paypal/oslo/core/money/Money;", "taxedAmount"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MoneyExtensionsKt {
    public static final com.paypal.oslo.core.money.Money withAppliedTax(com.paypal.oslo.core.money.Money money, com.paypal.oslo.core.money.Tax tax) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tax, "");
        return money.plus(money.times(tax.getValue()));
    }

    public static final com.paypal.oslo.core.money.Money taxedAmount(com.paypal.oslo.core.money.Money money, com.paypal.oslo.core.money.Tax tax) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tax, "");
        return money.times(tax.getValue());
    }
}
