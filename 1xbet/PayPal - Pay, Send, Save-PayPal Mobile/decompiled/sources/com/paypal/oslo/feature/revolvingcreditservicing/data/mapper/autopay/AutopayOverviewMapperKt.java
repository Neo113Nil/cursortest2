package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.autopay;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0007H\u0000¢\u0006\u0004\b\u0002\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditAutopayFragment;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/AutopayOverview;", "toAutopayOverview", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditAutopayFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/AutopayOverview;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/PaymentSummaryAutopayFragment;", "toPaymentSummaryAutopayOverview", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/PaymentSummaryAutopayFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/AutopayOverview;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$Data;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$Data;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/AutopayOverview;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AutopayOverviewMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview toAutopayOverview(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAutopayFragment revolvingCreditAutopayFragment) {
        java.util.ArrayList arrayList;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAutopayFragment.FundingInstrument> fundingInstruments;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAutopayFragment.CustomAmount customAmount;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAutopayPaymentAmountOptionType paymentAmountOptionType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditAutopayFragment, "");
        boolean z = revolvingCreditAutopayFragment.getOnRevolvingCreditAutopayEnrolled() != null;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAutopayFragment.OnRevolvingCreditAutopayUnenrolled onRevolvingCreditAutopayUnenrolled = revolvingCreditAutopayFragment.getOnRevolvingCreditAutopayUnenrolled();
        java.lang.Boolean valueOf = onRevolvingCreditAutopayUnenrolled != null ? java.lang.Boolean.valueOf(onRevolvingCreditAutopayUnenrolled.getEnrollmentEligible()) : null;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAutopayFragment.OnRevolvingCreditAutopayEnrolled onRevolvingCreditAutopayEnrolled = revolvingCreditAutopayFragment.getOnRevolvingCreditAutopayEnrolled();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption domain = (onRevolvingCreditAutopayEnrolled == null || (paymentAmountOptionType = onRevolvingCreditAutopayEnrolled.getPaymentAmountOptionType()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.autopay.AutopayPaymentAmountOptionTypeMapperKt.toDomain(paymentAmountOptionType);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAutopayFragment.OnRevolvingCreditAutopayEnrolled onRevolvingCreditAutopayEnrolled2 = revolvingCreditAutopayFragment.getOnRevolvingCreditAutopayEnrolled();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = (onRevolvingCreditAutopayEnrolled2 == null || (customAmount = onRevolvingCreditAutopayEnrolled2.getCustomAmount()) == null || (revolvingCreditMoneyFragment = customAmount.getRevolvingCreditMoneyFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(revolvingCreditMoneyFragment);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAutopayFragment.OnRevolvingCreditAutopayEnrolled onRevolvingCreditAutopayEnrolled3 = revolvingCreditAutopayFragment.getOnRevolvingCreditAutopayEnrolled();
        if (onRevolvingCreditAutopayEnrolled3 == null || (fundingInstruments = onRevolvingCreditAutopayEnrolled3.getFundingInstruments()) == null) {
            arrayList = null;
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator<T> it = fundingInstruments.iterator();
            while (it.hasNext()) {
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument domain2 = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.FundingInstrumentsMapperKt.toDomain((com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAutopayFragment.FundingInstrument) it.next());
                if (domain2 != null) {
                    arrayList2.add(domain2);
                }
            }
            arrayList = arrayList2;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAutopayFragment.OnRevolvingCreditAutopayEnrolled onRevolvingCreditAutopayEnrolled4 = revolvingCreditAutopayFragment.getOnRevolvingCreditAutopayEnrolled();
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview(z, valueOf, domain, currencyAmount, arrayList, com.paypal.oslo.feature.revolvingcreditservicing.utils.DateUtilKt.anyToInstantOrNull(onRevolvingCreditAutopayEnrolled4 != null ? onRevolvingCreditAutopayEnrolled4.getEffectiveDueTime() : null), null, null, null, null, null, null);
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview toPaymentSummaryAutopayOverview(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAutopayFragment paymentSummaryAutopayFragment) {
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAutopayFragment.CustomAmount customAmount;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAutopayPaymentAmountOptionType paymentAmountOptionType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentSummaryAutopayFragment, "");
        boolean z = paymentSummaryAutopayFragment.getOnRevolvingCreditAutopayEnrolled() != null;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAutopayFragment.OnRevolvingCreditAutopayUnenrolled onRevolvingCreditAutopayUnenrolled = paymentSummaryAutopayFragment.getOnRevolvingCreditAutopayUnenrolled();
        java.lang.Boolean valueOf = onRevolvingCreditAutopayUnenrolled != null ? java.lang.Boolean.valueOf(onRevolvingCreditAutopayUnenrolled.getEnrollmentEligible()) : null;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAutopayFragment.OnRevolvingCreditAutopayEnrolled onRevolvingCreditAutopayEnrolled = paymentSummaryAutopayFragment.getOnRevolvingCreditAutopayEnrolled();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption domain = (onRevolvingCreditAutopayEnrolled == null || (paymentAmountOptionType = onRevolvingCreditAutopayEnrolled.getPaymentAmountOptionType()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.autopay.AutopayPaymentAmountOptionTypeMapperKt.toDomain(paymentAmountOptionType);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAutopayFragment.OnRevolvingCreditAutopayEnrolled onRevolvingCreditAutopayEnrolled2 = paymentSummaryAutopayFragment.getOnRevolvingCreditAutopayEnrolled();
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview(z, valueOf, domain, (onRevolvingCreditAutopayEnrolled2 == null || (customAmount = onRevolvingCreditAutopayEnrolled2.getCustomAmount()) == null || (revolvingCreditMoneyFragment = customAmount.getRevolvingCreditMoneyFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(revolvingCreditMoneyFragment), null, null, null, null, null, null, null, null);
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview toAutopayOverview(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Data data) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.lang.Object creditAccountId;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Billing billing;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.CreditLines creditLines;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.CreditLine creditLine;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Payments payments;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.RevolvingCreditPaymentConstraint revolvingCreditPaymentConstraint;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Billing billing2;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.FundingInstrument> fundingInstruments;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.CustomAmount customAmount;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment2;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAutopayPaymentAmountOptionType paymentAmountOptionType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.RevolvingCreditAutopay revolvingCreditAutopay = data.getRevolvingCreditAutopay();
        java.lang.String str = null;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditAutopayEnrolled onRevolvingCreditAutopayEnrolled = revolvingCreditAutopay != null ? revolvingCreditAutopay.getOnRevolvingCreditAutopayEnrolled() : null;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.RevolvingCreditAutopay revolvingCreditAutopay2 = data.getRevolvingCreditAutopay();
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditAutopayUnenrolled onRevolvingCreditAutopayUnenrolled = revolvingCreditAutopay2 != null ? revolvingCreditAutopay2.getOnRevolvingCreditAutopayUnenrolled() : null;
        boolean z = onRevolvingCreditAutopayEnrolled != null;
        java.lang.Boolean valueOf = onRevolvingCreditAutopayUnenrolled != null ? java.lang.Boolean.valueOf(onRevolvingCreditAutopayUnenrolled.getEnrollmentEligible()) : null;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption domain = (onRevolvingCreditAutopayEnrolled == null || (paymentAmountOptionType = onRevolvingCreditAutopayEnrolled.getPaymentAmountOptionType()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.autopay.AutopayPaymentAmountOptionTypeMapperKt.toDomain(paymentAmountOptionType);
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = (onRevolvingCreditAutopayEnrolled == null || (customAmount = onRevolvingCreditAutopayEnrolled.getCustomAmount()) == null || (revolvingCreditMoneyFragment2 = customAmount.getRevolvingCreditMoneyFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(revolvingCreditMoneyFragment2);
        if (onRevolvingCreditAutopayEnrolled == null || (fundingInstruments = onRevolvingCreditAutopayEnrolled.getFundingInstruments()) == null) {
            arrayList = null;
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator<T> it = fundingInstruments.iterator();
            while (it.hasNext()) {
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument domain2 = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.FundingInstrumentsMapperKt.toDomain((com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.FundingInstrument) it.next());
                if (domain2 != null) {
                    arrayList3.add(domain2);
                }
            }
            arrayList = arrayList3;
        }
        java.time.Instant anyToInstantOrNull = com.paypal.oslo.feature.revolvingcreditservicing.utils.DateUtilKt.anyToInstantOrNull(onRevolvingCreditAutopayEnrolled != null ? onRevolvingCreditAutopayEnrolled.getEffectiveDueTime() : null);
        if (anyToInstantOrNull == null) {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.RevolvingCreditAccount revolvingCreditAccount = data.getRevolvingCreditAccount();
            anyToInstantOrNull = com.paypal.oslo.feature.revolvingcreditservicing.utils.DateUtilKt.anyToInstantOrNull((revolvingCreditAccount == null || (billing2 = revolvingCreditAccount.getBilling()) == null) ? null : billing2.getNextPaymentDueTime());
        }
        java.time.Instant instant = anyToInstantOrNull;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.RevolvingCreditPaymentConstraint> revolvingCreditPaymentConstraints = data.getRevolvingCreditPaymentConstraints();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints domain3 = (revolvingCreditPaymentConstraints == null || (revolvingCreditPaymentConstraint = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.RevolvingCreditPaymentConstraint) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) revolvingCreditPaymentConstraints)) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.autopay.PaymentConstraintsMapperKt.toDomain(revolvingCreditPaymentConstraint);
        java.lang.Boolean valueOf2 = onRevolvingCreditAutopayEnrolled != null ? java.lang.Boolean.valueOf(onRevolvingCreditAutopayEnrolled.getEffectiveInCurrentBillingCycle()) : null;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.RevolvingCreditEligiblePaymentFundingInstrument> revolvingCreditEligiblePaymentFundingInstruments = data.getRevolvingCreditEligiblePaymentFundingInstruments();
        if (revolvingCreditEligiblePaymentFundingInstruments != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.Iterator<T> it2 = revolvingCreditEligiblePaymentFundingInstruments.iterator();
            while (it2.hasNext()) {
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument domain4 = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.FundingInstrumentsMapperKt.toDomain((com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.RevolvingCreditEligiblePaymentFundingInstrument) it2.next());
                if (domain4 != null) {
                    arrayList4.add(domain4);
                }
            }
            arrayList2 = arrayList4;
        } else {
            arrayList2 = null;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.RevolvingCreditServicingContent revolvingCreditServicingContent = data.getRevolvingCreditServicingContent();
        java.lang.Object autopayTermsUrl = (revolvingCreditServicingContent == null || (payments = revolvingCreditServicingContent.getPayments()) == null) ? null : payments.getAutopayTermsUrl();
        java.lang.String str2 = autopayTermsUrl instanceof java.lang.String ? (java.lang.String) autopayTermsUrl : null;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.RevolvingCreditAccount revolvingCreditAccount2 = data.getRevolvingCreditAccount();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2 = (revolvingCreditAccount2 == null || (billing = revolvingCreditAccount2.getBilling()) == null || (creditLines = billing.getCreditLines()) == null || (creditLine = creditLines.getCreditLine()) == null || (revolvingCreditMoneyFragment = creditLine.getRevolvingCreditMoneyFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(revolvingCreditMoneyFragment);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.RevolvingCreditAccount revolvingCreditAccount3 = data.getRevolvingCreditAccount();
        if (revolvingCreditAccount3 != null && (creditAccountId = revolvingCreditAccount3.getCreditAccountId()) != null) {
            str = creditAccountId.toString();
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview(z, valueOf, domain, currencyAmount, arrayList, instant, domain3, valueOf2, arrayList2, str2, currencyAmount2, str);
    }
}
