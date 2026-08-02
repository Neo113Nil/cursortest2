package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditBillingFragment$Billing;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/Billing;", "toDomain", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditBillingFragment$Billing;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/Billing;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/PaymentSummaryAccountFragment$Billing;", "toPaymentSummaryDomain", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/PaymentSummaryAccountFragment$Billing;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/Billing;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BillingMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing toDomain(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditBillingFragment.Billing billing) {
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment2;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment3;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment4;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment5;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment6;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment7;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment8;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditBillingFragment.TemporaryCreditLine temporaryCreditLine;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment9;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditBillingFragment.CreditLine creditLine;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment10;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billing, "");
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditBillingFragment.CreditLines creditLines = billing.getCreditLines();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = null;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2 = (creditLines == null || (creditLine = creditLines.getCreditLine()) == null || (revolvingCreditMoneyFragment10 = creditLine.getRevolvingCreditMoneyFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(revolvingCreditMoneyFragment10);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditBillingFragment.CreditLines creditLines2 = billing.getCreditLines();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount3 = (creditLines2 == null || (temporaryCreditLine = creditLines2.getTemporaryCreditLine()) == null || (revolvingCreditMoneyFragment9 = temporaryCreditLine.getRevolvingCreditMoneyFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(revolvingCreditMoneyFragment9);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditBillingFragment.CurrentBalance currentBalance = billing.getCurrentBalance();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount4 = (currentBalance == null || (revolvingCreditMoneyFragment8 = currentBalance.getRevolvingCreditMoneyFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(revolvingCreditMoneyFragment8);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditBillingFragment.StatementBalance statementBalance = billing.getStatementBalance();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount5 = (statementBalance == null || (revolvingCreditMoneyFragment7 = statementBalance.getRevolvingCreditMoneyFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(revolvingCreditMoneyFragment7);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditBillingFragment.RemainingStatementBalance remainingStatementBalance = billing.getRemainingStatementBalance();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount6 = (remainingStatementBalance == null || (revolvingCreditMoneyFragment6 = remainingStatementBalance.getRevolvingCreditMoneyFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(revolvingCreditMoneyFragment6);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditBillingFragment.PastDueAmount pastDueAmount = billing.getPastDueAmount();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount7 = (pastDueAmount == null || (revolvingCreditMoneyFragment5 = pastDueAmount.getRevolvingCreditMoneyFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(revolvingCreditMoneyFragment5);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditBillingFragment.MinimumPaymentDue minimumPaymentDue = billing.getMinimumPaymentDue();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount8 = (minimumPaymentDue == null || (revolvingCreditMoneyFragment4 = minimumPaymentDue.getRevolvingCreditMoneyFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(revolvingCreditMoneyFragment4);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditBillingFragment.MinimumPaymentToAvoidInterest minimumPaymentToAvoidInterest = billing.getMinimumPaymentToAvoidInterest();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount9 = (minimumPaymentToAvoidInterest == null || (revolvingCreditMoneyFragment3 = minimumPaymentToAvoidInterest.getRevolvingCreditMoneyFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(revolvingCreditMoneyFragment3);
        java.time.Instant anyToInstantOrNull = com.paypal.oslo.feature.revolvingcreditservicing.utils.DateUtilKt.anyToInstantOrNull(java.lang.String.valueOf(billing.getNextPaymentDueTime()));
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditBillingFragment.OpenToBuy openToBuy = billing.getOpenToBuy();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount10 = (openToBuy == null || (revolvingCreditMoneyFragment2 = openToBuy.getRevolvingCreditMoneyFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(revolvingCreditMoneyFragment2);
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.PaymentStatus domain = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.payments.PaymentStatusMapperKt.toDomain(billing.getPaymentStatus());
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditBillingFragment.MaxRepayableAmount maxRepayableAmount = billing.getMaxRepayableAmount();
        if (maxRepayableAmount != null && (revolvingCreditMoneyFragment = maxRepayableAmount.getRevolvingCreditMoneyFragment()) != null) {
            currencyAmount = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(revolvingCreditMoneyFragment);
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing(null, currencyAmount2, currencyAmount3, currencyAmount4, currencyAmount5, currencyAmount6, currencyAmount7, currencyAmount8, currencyAmount9, anyToInstantOrNull, currencyAmount10, domain, null, currencyAmount);
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing toPaymentSummaryDomain(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment.Billing billing) {
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billing, "");
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment.CurrentBalance currentBalance = billing.getCurrentBalance();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = (currentBalance == null || (revolvingCreditMoneyFragment = currentBalance.getRevolvingCreditMoneyFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(revolvingCreditMoneyFragment);
        java.time.Instant anyToInstantOrNull = com.paypal.oslo.feature.revolvingcreditservicing.utils.DateUtilKt.anyToInstantOrNull(java.lang.String.valueOf(billing.getNextPaymentDueTime()));
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentStatus paymentStatus = billing.getPaymentStatus();
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing(null, null, null, currencyAmount, null, null, null, null, null, anyToInstantOrNull, null, paymentStatus != null ? com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.payments.PaymentStatusMapperKt.toDomain(paymentStatus) : null, null, null);
    }
}
