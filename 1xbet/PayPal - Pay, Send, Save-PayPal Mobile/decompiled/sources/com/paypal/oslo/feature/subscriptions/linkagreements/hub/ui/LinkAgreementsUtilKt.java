package com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001aV\u0010\n\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042-\u0010\t\u001a)\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\u0007\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\u0007\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/domain/model/ConsumerAgreementMerchant;", "merchant", "", "source", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "", "onSuccess", "handleOnLinkMerchantClicked", "(Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/domain/model/ConsumerAgreementMerchant;Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;Lkotlin/jvm/functions/Function3;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LinkAgreementsUtilKt {
    public static final void handleOnLinkMerchantClicked(com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant consumerAgreementMerchant, java.lang.String str, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerAgreementMerchant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        java.lang.String websiteUrl = consumerAgreementMerchant.getWebsiteUrl();
        com.paypal.oslo.feature.subscriptions.LoggerKt.log.i("agreements link merchant clicked", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("merchantId", consumerAgreementMerchant.getId()), kotlin.TuplesKt.to("source", str)), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("merchantUrl", consumerAgreementMerchant.getWebsiteUrl())));
        if (websiteUrl == null) {
            com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorKt.log$default(new com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Business.DataNotFound(null, "Merchant websiteUrl is null", null, 5, null), "Cannot open merchant linking: websiteUrl is null", new com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.LinkAgreement(agreementType), null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("merchantId", consumerAgreementMerchant.getId()), kotlin.TuplesKt.to("merchantName", consumerAgreementMerchant.getName()), kotlin.TuplesKt.to("source", str)), null, 20, null);
        } else {
            function3.invoke(websiteUrl, str, consumerAgreementMerchant.getName());
        }
    }
}
