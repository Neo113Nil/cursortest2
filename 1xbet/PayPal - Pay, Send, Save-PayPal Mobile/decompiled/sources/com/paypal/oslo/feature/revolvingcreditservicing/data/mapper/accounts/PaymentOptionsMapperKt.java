package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Data;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/PaymentOptions;", "toDomain", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$Data;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/PaymentOptions;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaymentOptionsMapperKt {
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        if (r0 != null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentOptions toDomain(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Data data) {
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditOneTimePaymentConstraints onRevolvingCreditOneTimePaymentConstraints;
        java.util.Map emptyMap;
        java.util.ArrayList arrayList;
        java.lang.Object creditAccountId;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditBillingFragment revolvingCreditBillingFragment;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditBillingFragment.Billing billing;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAutopayFragment revolvingCreditAutopayFragment;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Payments payments;
        java.lang.Object oneTimePaymentTermsUrl;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment2;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment3;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.PaymentAmountOption> paymentAmountOptions;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditPaymentConstraint> revolvingCreditPaymentConstraints = data.getRevolvingCreditPaymentConstraints();
        java.lang.String str = null;
        if (revolvingCreditPaymentConstraints != null) {
            java.util.Iterator<T> it = revolvingCreditPaymentConstraints.iterator();
            while (it.hasNext()) {
                onRevolvingCreditOneTimePaymentConstraints = ((com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditPaymentConstraint) it.next()).getOnRevolvingCreditOneTimePaymentConstraints();
                if (onRevolvingCreditOneTimePaymentConstraints != null) {
                    break;
                }
            }
        }
        onRevolvingCreditOneTimePaymentConstraints = null;
        if (onRevolvingCreditOneTimePaymentConstraints != null && (paymentAmountOptions = onRevolvingCreditOneTimePaymentConstraints.getPaymentAmountOptions()) != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.PaymentAmountOption paymentAmountOption : paymentAmountOptions) {
                com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Amount amount = paymentAmountOption.getAmount();
                kotlin.Pair pair = amount != null ? kotlin.TuplesKt.to(paymentAmountOption.getType(), amount) : null;
                if (pair != null) {
                    arrayList2.add(pair);
                }
            }
            emptyMap = kotlin.collections.MapsKt.toMap(arrayList2);
        }
        emptyMap = kotlin.collections.MapsKt.emptyMap();
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditPayment> revolvingCreditPayments = data.getRevolvingCreditPayments();
        if (revolvingCreditPayments != null) {
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditPayment> list = revolvingCreditPayments;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList3.add(com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.payments.PaymentMapperKt.toRepaymentActivity(((com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditPayment) it2.next()).getRevolvingCreditPaymentsFragment()));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Amount amount2 = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Amount) emptyMap.get(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType.MINIMUM_PAYMENT_DUE);
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = (amount2 == null || (revolvingCreditMoneyFragment3 = amount2.getRevolvingCreditMoneyFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(revolvingCreditMoneyFragment3);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Amount amount3 = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Amount) emptyMap.get(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType.REMAINING_STATEMENT_BALANCE);
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2 = (amount3 == null || (revolvingCreditMoneyFragment2 = amount3.getRevolvingCreditMoneyFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(revolvingCreditMoneyFragment2);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Amount amount4 = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Amount) emptyMap.get(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOneTimePaymentAmountOptionType.CURRENT_BALANCE);
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount3 = (amount4 == null || (revolvingCreditMoneyFragment = amount4.getRevolvingCreditMoneyFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(revolvingCreditMoneyFragment);
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditEligiblePaymentFundingInstrument> revolvingCreditEligiblePaymentFundingInstruments = data.getRevolvingCreditEligiblePaymentFundingInstruments();
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> domain = revolvingCreditEligiblePaymentFundingInstruments != null ? com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.FundingInstrumentMapperKt.toDomain(revolvingCreditEligiblePaymentFundingInstruments) : null;
        if (domain == null) {
            domain = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> list2 = domain;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditServicingContent revolvingCreditServicingContent = data.getRevolvingCreditServicingContent();
        java.lang.String obj = (revolvingCreditServicingContent == null || (payments = revolvingCreditServicingContent.getPayments()) == null || (oneTimePaymentTermsUrl = payments.getOneTimePaymentTermsUrl()) == null) ? null : oneTimePaymentTermsUrl.toString();
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditAutopay revolvingCreditAutopay = data.getRevolvingCreditAutopay();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview = (revolvingCreditAutopay == null || (revolvingCreditAutopayFragment = revolvingCreditAutopay.getRevolvingCreditAutopayFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.autopay.AutopayOverviewMapperKt.toAutopayOverview(revolvingCreditAutopayFragment);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditAccount revolvingCreditAccount = data.getRevolvingCreditAccount();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing domain2 = (revolvingCreditAccount == null || (revolvingCreditBillingFragment = revolvingCreditAccount.getRevolvingCreditBillingFragment()) == null || (billing = revolvingCreditBillingFragment.getBilling()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.BillingMapperKt.toDomain(billing);
        int maxDaysInFuture = onRevolvingCreditOneTimePaymentConstraints != null ? onRevolvingCreditOneTimePaymentConstraints.getMaxDaysInFuture() : 90;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditAccount revolvingCreditAccount2 = data.getRevolvingCreditAccount();
        if (revolvingCreditAccount2 != null && (creditAccountId = revolvingCreditAccount2.getCreditAccountId()) != null) {
            str = creditAccountId.toString();
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentOptions(currencyAmount, currencyAmount2, currencyAmount3, list2, obj, autopayOverview, domain2, arrayList, maxDaysInFuture, str);
    }
}
