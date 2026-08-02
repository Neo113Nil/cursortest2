package com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\u0004À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManager;", "", "", "isTestFeatureEnabled", "()Z", "mockGraphqlEnabled", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "product", "isServicingKilledFor", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;)Z", "isPayPalPlusCbmcEnabled", "isPushToWalletEnabled", "cardActivationFeatureEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface FeatureGateManager {
    boolean cardActivationFeatureEnabled();

    boolean isPayPalPlusCbmcEnabled();

    boolean isPushToWalletEnabled();

    boolean isServicingKilledFor(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier product);

    boolean isTestFeatureEnabled();

    boolean mockGraphqlEnabled();
}
