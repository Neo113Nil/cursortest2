package com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidTax;", "tax", "withAppliedTax", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidTax;)Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;", "taxedAmount"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetPaidFinanceOpsKt {
    public static final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney withAppliedTax(com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney, com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidTax getPaidTax) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPaidMoney, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPaidTax, "");
        return getPaidMoney.plus(getPaidMoney.times(getPaidTax.getValue()));
    }

    public static final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney taxedAmount(com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney, com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidTax getPaidTax) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPaidMoney, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPaidTax, "");
        return getPaidMoney.times(getPaidTax.getValue());
    }
}
