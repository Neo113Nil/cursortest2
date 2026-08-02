package com.paypal.oslo.feature.oneonboarding.inventory.steps.cryptoterms.analytics;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/cryptoterms/analytics/CryptoTermsAnalytics;", "", "<init>", "()V", "", "url", "resolveLinkItemName$one_onboarding_prodRelease", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "intentId", "linkItemName", "", "trackLinkClick$one_onboarding_prodRelease", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Ljava/lang/String;)V", "SCREEN_ID_CRYPTO_TERMS", "Ljava/lang/String;", "ITEM_AGREE_AND_CONTINUE", "LINK_ITEM_ECOMMUNICATION_DELIVERY_POLICY", "LINK_ITEM_CRYPTO_TERMS", "LINK_ITEM_PRIVACY_STATEMENT", "LINK_ITEM_STATE_DISCLOSURE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CryptoTermsAnalytics {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.steps.cryptoterms.analytics.CryptoTermsAnalytics INSTANCE = new com.paypal.oslo.feature.oneonboarding.inventory.steps.cryptoterms.analytics.CryptoTermsAnalytics();
    public static final java.lang.String ITEM_AGREE_AND_CONTINUE = "agree_and_continue";
    public static final java.lang.String LINK_ITEM_CRYPTO_TERMS = "crypto_terms";
    public static final java.lang.String LINK_ITEM_ECOMMUNICATION_DELIVERY_POLICY = "ecommunication_delivery_policy";
    public static final java.lang.String LINK_ITEM_PRIVACY_STATEMENT = "privacy_statement";
    public static final java.lang.String LINK_ITEM_STATE_DISCLOSURE = "state_disclosure";
    public static final java.lang.String SCREEN_ID_CRYPTO_TERMS = "crypto_terms";

    private CryptoTermsAnalytics() {
    }

    public final java.lang.String resolveLinkItemName$one_onboarding_prodRelease(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        switch (url.hashCode()) {
            case -1824988938:
                if (url.equals("https://www.paypal.com/us/webapps/mpp/ua/cryptocurrencies-tnc")) {
                    return "crypto_terms";
                }
                return null;
            case -1285615894:
                if (url.equals(com.paypal.oslo.feature.oneonboarding.ui.util.UrlUtilsKt.StateDisclosure)) {
                    return LINK_ITEM_STATE_DISCLOSURE;
                }
                return null;
            case 331960030:
                if (url.equals(com.paypal.oslo.feature.oneonboarding.ui.util.UrlUtilsKt.PrivacyStatement)) {
                    return "privacy_statement";
                }
                return null;
            case 1544786308:
                if (url.equals("https://www.paypal.com/us/webapps/mpp/ua/esign-full")) {
                    return LINK_ITEM_ECOMMUNICATION_DELIVERY_POLICY;
                }
                return null;
            default:
                return null;
        }
    }

    public final void trackLinkClick$one_onboarding_prodRelease(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, java.lang.String linkItemName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkItemName, "");
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen("crypto_terms"), null, null, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(linkItemName, 0, 2, null), 6, null), com.paypal.oslo.feature.oneonboarding.analytics.ProvisioningAnalyticsKt.toProvisionUserIntent(intentId), null, 4, null).track(com.paypal.oslo.feature.oneonboarding.AnalyticsTrackerKt.analyticsTracker);
    }
}
