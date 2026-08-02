package com.paypal.oslo.feature.shoppingrewards.rewards.common.utils;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/utils/TermsUrls;", "", "<init>", "()V", "", "DONOR_TERMS", "Ljava/lang/String;", "DELIVERY_POLICY", "", "donationTagUrls", "Ljava/util/Map;", "getDonationTagUrls", "()Ljava/util/Map;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TermsUrls {
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.common.utils.TermsUrls INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.common.utils.TermsUrls();
    public static final java.lang.String DONOR_TERMS = "https://www.paypal.com/webapps/mpp/givingfund/policies/donor-terms-of-service";
    public static final java.lang.String DELIVERY_POLICY = "https://www.paypal.com/us/webapps/mpp/givingfund/policies/donation-delivery-policy";
    private static final java.util.Map<java.lang.String, java.lang.String> donationTagUrls = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("donorTerms", DONOR_TERMS), kotlin.TuplesKt.to("deliveryPolicy", DELIVERY_POLICY));
    public static final int $stable = 8;

    private TermsUrls() {
    }

    public final java.util.Map<java.lang.String, java.lang.String> getDonationTagUrls() {
        return donationTagUrls;
    }
}
