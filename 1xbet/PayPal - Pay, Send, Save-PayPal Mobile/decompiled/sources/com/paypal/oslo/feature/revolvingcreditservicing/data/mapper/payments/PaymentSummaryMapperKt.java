package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.payments;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentsSummaryOverviewQuery$Data;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentsummary/PaymentSummaryOverview;", "toDomain", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentsSummaryOverviewQuery$Data;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentsummary/PaymentSummaryOverview;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaymentSummaryMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryOverview toDomain(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentsSummaryOverviewQuery.Data data) {
        java.util.ArrayList arrayList;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerServiceSummaryFragment revolvingCreditCustomerServiceSummaryFragment;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAutopayFragment paymentSummaryAutopayFragment;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment paymentSummaryAccountFragment;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment paymentSummaryAccountFragment2;
        java.lang.Object creditAccountId;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentsSummaryOverviewQuery.RevolvingCreditAccount revolvingCreditAccount = data.getRevolvingCreditAccount();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact customerServiceContact = null;
        java.lang.String obj = (revolvingCreditAccount == null || (paymentSummaryAccountFragment2 = revolvingCreditAccount.getPaymentSummaryAccountFragment()) == null || (creditAccountId = paymentSummaryAccountFragment2.getCreditAccountId()) == null) ? null : creditAccountId.toString();
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentsSummaryOverviewQuery.RevolvingCreditAccount revolvingCreditAccount2 = data.getRevolvingCreditAccount();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview accountOverview = (revolvingCreditAccount2 == null || (paymentSummaryAccountFragment = revolvingCreditAccount2.getPaymentSummaryAccountFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.AccountOverviewMapperKt.toAccountOverview(paymentSummaryAccountFragment);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentsSummaryOverviewQuery.RevolvingCreditAutopay revolvingCreditAutopay = data.getRevolvingCreditAutopay();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview paymentSummaryAutopayOverview = (revolvingCreditAutopay == null || (paymentSummaryAutopayFragment = revolvingCreditAutopay.getPaymentSummaryAutopayFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.autopay.AutopayOverviewMapperKt.toPaymentSummaryAutopayOverview(paymentSummaryAutopayFragment);
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentsSummaryOverviewQuery.RevolvingCreditPayment> revolvingCreditPayments = data.getRevolvingCreditPayments();
        if (revolvingCreditPayments != null) {
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentsSummaryOverviewQuery.RevolvingCreditPayment> list = revolvingCreditPayments;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.payments.PaymentMapperKt.toRepaymentActivity(((com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentsSummaryOverviewQuery.RevolvingCreditPayment) it.next()).getRevolvingCreditPaymentsFragment()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        java.util.List emptyList = arrayList == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentsSummaryOverviewQuery.RevolvingCreditServicingContent revolvingCreditServicingContent = data.getRevolvingCreditServicingContent();
        if (revolvingCreditServicingContent != null && (revolvingCreditCustomerServiceSummaryFragment = revolvingCreditServicingContent.getRevolvingCreditCustomerServiceSummaryFragment()) != null) {
            customerServiceContact = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CustomerServiceContactMapperKt.toCustomerServiceContact(revolvingCreditCustomerServiceSummaryFragment);
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryOverview(accountOverview, paymentSummaryAutopayOverview, emptyList, customerServiceContact, obj);
    }
}
