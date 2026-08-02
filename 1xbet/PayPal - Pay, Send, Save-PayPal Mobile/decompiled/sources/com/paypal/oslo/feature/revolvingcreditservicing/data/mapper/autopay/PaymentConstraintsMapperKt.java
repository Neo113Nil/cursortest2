package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.autopay;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$RevolvingCreditPaymentConstraint;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentConstraints;", "toDomain", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$RevolvingCreditPaymentConstraint;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentConstraints;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaymentConstraintsMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints toDomain(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.RevolvingCreditPaymentConstraint revolvingCreditPaymentConstraint) {
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditPaymentConstraint, "");
        if (revolvingCreditPaymentConstraint.getOnRevolvingCreditAutopayPaymentConstraints() == null) {
            return null;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditAutopayPaymentConstraints onRevolvingCreditAutopayPaymentConstraints = revolvingCreditPaymentConstraint.getOnRevolvingCreditAutopayPaymentConstraints();
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.PaymentAmountOption> paymentAmountOptions = onRevolvingCreditAutopayPaymentConstraints.getPaymentAmountOptions();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(paymentAmountOptions, 10));
        for (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.PaymentAmountOption paymentAmountOption : paymentAmountOptions) {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.autopay.PaymentOptionMapperKt.toPaymentOption(paymentAmountOption.getType());
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Amount amount = paymentAmountOption.getAmount();
            arrayList.add(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentAmountOption(paymentOption, (amount == null || (revolvingCreditMoneyFragment = amount.getRevolvingCreditMoneyFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(revolvingCreditMoneyFragment)));
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints(arrayList, com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(onRevolvingCreditAutopayPaymentConstraints.getMinimumCustomAmount().getRevolvingCreditMoneyFragment()));
    }
}
