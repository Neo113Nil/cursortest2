package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0006H\u0000¢\u0006\u0004\b\u0004\u0010\u0007\u001a\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\bH\u0000¢\u0006\u0004\b\u0004\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetCBMCServicingOverviewQuery$RevolvingCreditServicingContent;", "", "webBaseUrl", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/ContentUrls;", "toContentURLs", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetCBMCServicingOverviewQuery$RevolvingCreditServicingContent;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/ContentUrls;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditServicingContent;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditServicingContent;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/ContentUrls;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCUKServicingOverviewQuery$RevolvingCreditServicingContent;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCUKServicingOverviewQuery$RevolvingCreditServicingContent;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/ContentUrls;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ContentUrlMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrls toContentURLs(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.RevolvingCreditServicingContent revolvingCreditServicingContent, java.lang.String str) {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl;
        java.lang.Object creditDisclosuresUrl;
        java.lang.String obj;
        java.lang.Object benefitsUrl;
        java.lang.String obj2;
        java.lang.Object cardHolderTermsUrl;
        java.lang.String obj3;
        java.lang.Object privacyStatementUrl;
        java.lang.String obj4;
        java.lang.Object eSignConsentUrl;
        java.lang.String obj5;
        java.lang.Object paymentSecurityEntrypointUrl;
        java.lang.String obj6;
        java.lang.Object oneTimePaymentTermsUrl;
        java.lang.String obj7;
        java.lang.Object autopayTermsUrl;
        java.lang.String obj8;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditServicingContent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.Payments payments = revolvingCreditServicingContent.getPayments();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl2 = (payments == null || (autopayTermsUrl = payments.getAutopayTermsUrl()) == null || (obj8 = autopayTermsUrl.toString()) == null) ? null : new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl(obj8, false, (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlComponents) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.Payments payments2 = revolvingCreditServicingContent.getPayments();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl3 = (payments2 == null || (oneTimePaymentTermsUrl = payments2.getOneTimePaymentTermsUrl()) == null || (obj7 = oneTimePaymentTermsUrl.toString()) == null) ? null : new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl(obj7, false, (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlComponents) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.Payments payments3 = revolvingCreditServicingContent.getPayments();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl4 = (payments3 == null || (paymentSecurityEntrypointUrl = payments3.getPaymentSecurityEntrypointUrl()) == null || (obj6 = paymentSecurityEntrypointUrl.toString()) == null) ? null : new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl(obj6, false, (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlComponents) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.Legal legal = revolvingCreditServicingContent.getLegal();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl5 = (legal == null || (eSignConsentUrl = legal.getESignConsentUrl()) == null || (obj5 = eSignConsentUrl.toString()) == null) ? null : new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl(obj5, false, (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlComponents) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.Legal legal2 = revolvingCreditServicingContent.getLegal();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl6 = (legal2 == null || (privacyStatementUrl = legal2.getPrivacyStatementUrl()) == null || (obj4 = privacyStatementUrl.toString()) == null) ? null : new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl(obj4, false, (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlComponents) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.Card card = revolvingCreditServicingContent.getRevolvingCreditServicingContentFragment().getCard();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl7 = (card == null || (cardHolderTermsUrl = card.getCardHolderTermsUrl()) == null || (obj3 = cardHolderTermsUrl.toString()) == null) ? null : new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl(obj3, false, (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlComponents) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.Card card2 = revolvingCreditServicingContent.getRevolvingCreditServicingContentFragment().getCard();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl8 = (card2 == null || (benefitsUrl = card2.getBenefitsUrl()) == null || (obj2 = benefitsUrl.toString()) == null) ? null : new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl(obj2, false, (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlComponents) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.Legal legal3 = revolvingCreditServicingContent.getLegal();
        if (legal3 == null || (creditDisclosuresUrl = legal3.getCreditDisclosuresUrl()) == null || (obj = creditDisclosuresUrl.toString()) == null) {
            contentUrl = null;
        } else {
            if (!kotlin.text.StringsKt.startsWith$default(obj, "https://", false, 2, (java.lang.Object) null) && !kotlin.text.StringsKt.startsWith$default(obj, "http://", false, 2, (java.lang.Object) null)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(obj);
                obj = sb.toString();
            }
            contentUrl = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl(obj, false, (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlComponents) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrls(contentUrl2, contentUrl3, contentUrl4, null, null, contentUrl5, contentUrl6, null, contentUrl7, contentUrl8, contentUrl);
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrls toContentURLs(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingContent revolvingCreditServicingContent) {
        java.lang.Object benefitsUrl;
        java.lang.String obj;
        java.lang.Object cardHolderTermsUrl;
        java.lang.String obj2;
        java.lang.Object privacyStatementUrl;
        java.lang.String obj3;
        java.lang.Object eSignConsentUrl;
        java.lang.String obj4;
        java.lang.Object noInterestPromotionCurrentAccruedInterestExplanationUrl;
        java.lang.String obj5;
        java.lang.Object avoidInterestOnNextStatementGuideUrl;
        java.lang.String obj6;
        java.lang.Object paymentSecurityEntrypointUrl;
        java.lang.String obj7;
        java.lang.Object oneTimePaymentTermsUrl;
        java.lang.String obj8;
        java.lang.Object autopayTermsUrl;
        java.lang.String obj9;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditServicingContent, "");
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Payments payments = revolvingCreditServicingContent.getPayments();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl = null;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl2 = (payments == null || (autopayTermsUrl = payments.getAutopayTermsUrl()) == null || (obj9 = autopayTermsUrl.toString()) == null) ? null : new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl(obj9, false, (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlComponents) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Payments payments2 = revolvingCreditServicingContent.getPayments();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl3 = (payments2 == null || (oneTimePaymentTermsUrl = payments2.getOneTimePaymentTermsUrl()) == null || (obj8 = oneTimePaymentTermsUrl.toString()) == null) ? null : new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl(obj8, false, (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlComponents) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Payments payments3 = revolvingCreditServicingContent.getPayments();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl4 = (payments3 == null || (paymentSecurityEntrypointUrl = payments3.getPaymentSecurityEntrypointUrl()) == null || (obj7 = paymentSecurityEntrypointUrl.toString()) == null) ? null : new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl(obj7, false, (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlComponents) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Payments payments4 = revolvingCreditServicingContent.getPayments();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl5 = (payments4 == null || (avoidInterestOnNextStatementGuideUrl = payments4.getAvoidInterestOnNextStatementGuideUrl()) == null || (obj6 = avoidInterestOnNextStatementGuideUrl.toString()) == null) ? null : new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl(obj6, false, (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlComponents) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Payments payments5 = revolvingCreditServicingContent.getPayments();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl6 = (payments5 == null || (noInterestPromotionCurrentAccruedInterestExplanationUrl = payments5.getNoInterestPromotionCurrentAccruedInterestExplanationUrl()) == null || (obj5 = noInterestPromotionCurrentAccruedInterestExplanationUrl.toString()) == null) ? null : new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl(obj5, false, (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlComponents) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Legal legal = revolvingCreditServicingContent.getLegal();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl7 = (legal == null || (eSignConsentUrl = legal.getESignConsentUrl()) == null || (obj4 = eSignConsentUrl.toString()) == null) ? null : new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl(obj4, false, (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlComponents) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Legal legal2 = revolvingCreditServicingContent.getLegal();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl8 = (legal2 == null || (privacyStatementUrl = legal2.getPrivacyStatementUrl()) == null || (obj3 = privacyStatementUrl.toString()) == null) ? null : new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl(obj3, false, (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlComponents) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.Card card = revolvingCreditServicingContent.getRevolvingCreditServicingContentFragment().getCard();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl9 = (card == null || (cardHolderTermsUrl = card.getCardHolderTermsUrl()) == null || (obj2 = cardHolderTermsUrl.toString()) == null) ? null : new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl(obj2, false, (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlComponents) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.Card card2 = revolvingCreditServicingContent.getRevolvingCreditServicingContentFragment().getCard();
        if (card2 != null && (benefitsUrl = card2.getBenefitsUrl()) != null && (obj = benefitsUrl.toString()) != null) {
            contentUrl = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl(obj, false, (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlComponents) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrls(contentUrl2, contentUrl3, contentUrl4, contentUrl5, contentUrl6, contentUrl7, contentUrl8, null, contentUrl9, contentUrl, null);
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrls toContentURLs(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKServicingOverviewQuery.RevolvingCreditServicingContent revolvingCreditServicingContent) {
        java.lang.Object benefitsUrl;
        java.lang.String obj;
        java.lang.Object cardHolderTermsUrl;
        java.lang.String obj2;
        java.lang.Object privacyStatementUrl;
        java.lang.String obj3;
        java.lang.Object eSignConsentUrl;
        java.lang.String obj4;
        java.lang.Object oneTimePaymentTermsUrl;
        java.lang.String obj5;
        java.lang.Object autopayTermsUrl;
        java.lang.String obj6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditServicingContent, "");
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKServicingOverviewQuery.Payments payments = revolvingCreditServicingContent.getPayments();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl = null;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl2 = (payments == null || (autopayTermsUrl = payments.getAutopayTermsUrl()) == null || (obj6 = autopayTermsUrl.toString()) == null) ? null : new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl(obj6, false, (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlComponents) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKServicingOverviewQuery.Payments payments2 = revolvingCreditServicingContent.getPayments();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl3 = (payments2 == null || (oneTimePaymentTermsUrl = payments2.getOneTimePaymentTermsUrl()) == null || (obj5 = oneTimePaymentTermsUrl.toString()) == null) ? null : new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl(obj5, false, (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlComponents) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKServicingOverviewQuery.Legal legal = revolvingCreditServicingContent.getLegal();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl4 = (legal == null || (eSignConsentUrl = legal.getESignConsentUrl()) == null || (obj4 = eSignConsentUrl.toString()) == null) ? null : new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl(obj4, false, (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlComponents) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKServicingOverviewQuery.Legal legal2 = revolvingCreditServicingContent.getLegal();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl5 = (legal2 == null || (privacyStatementUrl = legal2.getPrivacyStatementUrl()) == null || (obj3 = privacyStatementUrl.toString()) == null) ? null : new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl(obj3, false, (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlComponents) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.Card card = revolvingCreditServicingContent.getRevolvingCreditServicingContentFragment().getCard();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl contentUrl6 = (card == null || (cardHolderTermsUrl = card.getCardHolderTermsUrl()) == null || (obj2 = cardHolderTermsUrl.toString()) == null) ? null : new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl(obj2, false, (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlComponents) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.Card card2 = revolvingCreditServicingContent.getRevolvingCreditServicingContentFragment().getCard();
        if (card2 != null && (benefitsUrl = card2.getBenefitsUrl()) != null && (obj = benefitsUrl.toString()) != null) {
            contentUrl = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrl(obj, false, (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrlComponents) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.ContentUrls(contentUrl2, contentUrl3, null, null, null, contentUrl4, contentUrl5, null, contentUrl6, contentUrl, null);
    }
}
