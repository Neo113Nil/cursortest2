package com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/usecase/GenerateAffiliateUrlUseCase;", "", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "<init>", "(Lcom/paypal/oslo/core/userstore/UserStore;)V", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabOfferDetails;", "offerDetails", "", "sessionId", "invoke", "(Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabOfferDetails;Ljava/lang/String;)Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/userstore/UserStore;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GenerateAffiliateUrlUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public GenerateAffiliateUrlUseCase(com.paypal.oslo.core.userstore.UserStore userStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        this.Camera2StreamConfigurationMap = userStore;
    }

    public final java.lang.String invoke(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails offerDetails, java.lang.String sessionId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerDetails, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
        java.lang.String honeyStoreId = offerDetails.getHoneyStoreId();
        java.lang.String str = honeyStoreId;
        if (str == null || str.length() == 0) {
            return null;
        }
        com.paypal.oslo.core.userstore.model.UserState value = this.Camera2StreamConfigurationMap.getUserState().getValue();
        return com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.AffiliateUrlGenerator.INSTANCE.generateAffiliateUrl(honeyStoreId, offerDetails.getUrl(), sessionId, value instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded ? ((com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) value).getUser().getId() : null);
    }
}
