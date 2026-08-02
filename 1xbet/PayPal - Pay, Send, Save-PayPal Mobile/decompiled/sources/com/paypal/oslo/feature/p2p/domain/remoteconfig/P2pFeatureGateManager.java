package com.paypal.oslo.feature.p2p.domain.remoteconfig;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0004À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/remoteconfig/P2pFeatureGateManager;", "", "", "isCryptoPickerEnabled", "()Z", "isQrcFlowEnabled", "isContactSyncEnabled", "isPublicProfileEnabled", "isPpLinkEnabled", "isAddPaymentMethodEnabled", "isClaimMoneyDeeplinkEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface P2pFeatureGateManager {
    boolean isAddPaymentMethodEnabled();

    boolean isClaimMoneyDeeplinkEnabled();

    boolean isContactSyncEnabled();

    boolean isCryptoPickerEnabled();

    boolean isPpLinkEnabled();

    boolean isPublicProfileEnabled();

    boolean isQrcFlowEnabled();
}
