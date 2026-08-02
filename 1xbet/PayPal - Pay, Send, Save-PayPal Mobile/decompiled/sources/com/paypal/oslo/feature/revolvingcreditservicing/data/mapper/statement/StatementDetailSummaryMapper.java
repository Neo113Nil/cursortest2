package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/mapper/statement/StatementDetailSummaryMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$Summary;", org.bouncycastle.i18n.ErrorBundle.SUMMARY_ENTRY, "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statement/StatementDetailSummary;", "toDomain", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$Summary;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statement/StatementDetailSummary;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class StatementDetailSummaryMapper {
    public static final int $stable = 0;

    @javax.inject.Inject
    public StatementDetailSummaryMapper() {
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetailSummary toDomain(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Summary summary) {
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(summary, "");
        java.time.Instant anyToInstantOrNull = com.paypal.oslo.feature.revolvingcreditservicing.utils.DateUtilKt.anyToInstantOrNull(summary.getClosingTime());
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(summary.getNewBalance().getRevolvingCreditMoneyFragment());
        java.time.Instant anyToInstantOrNull2 = com.paypal.oslo.feature.revolvingcreditservicing.utils.DateUtilKt.anyToInstantOrNull(summary.getPaymentDueTime());
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2 = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(summary.getMinimumPaymentDue().getRevolvingCreditMoneyFragment());
        if (anyToInstantOrNull == null || anyToInstantOrNull2 == null) {
            return null;
        }
        java.time.Instant anyToInstantOrNull3 = com.paypal.oslo.feature.revolvingcreditservicing.utils.DateUtilKt.anyToInstantOrNull(summary.getStartTime());
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount3 = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(summary.getPreviousBalance().getRevolvingCreditMoneyFragment());
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount4 = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(summary.getTotalPaymentCredits().getRevolvingCreditMoneyFragment());
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount5 = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(summary.getTotalPurchases().getRevolvingCreditMoneyFragment());
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount6 = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(summary.getTotalInterestFinanceChargesAndFees().getRevolvingCreditMoneyFragment());
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.AvoidInterestMinimumPayment avoidInterestMinimumPayment = summary.getAvoidInterestMinimumPayment();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount7 = (avoidInterestMinimumPayment == null || (revolvingCreditMoneyFragment = avoidInterestMinimumPayment.getRevolvingCreditMoneyFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(revolvingCreditMoneyFragment);
        java.lang.Object apr = summary.getApr();
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.StatementDetailSummary(anyToInstantOrNull3, anyToInstantOrNull, currencyAmount3, currencyAmount4, currencyAmount5, currencyAmount6, currencyAmount, anyToInstantOrNull2, currencyAmount2, currencyAmount7, null, apr instanceof java.lang.String ? (java.lang.String) apr : null);
    }
}
