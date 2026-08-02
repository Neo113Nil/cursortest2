package com.paypal.oslo.feature.merchantbanking.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/domain/usecase/GetMerchantArnFeatureFlagUseCase;", "", "Lcom/paypal/oslo/feature/merchantbanking/domain/remoteconfig/MerchantBankingFeatureGate;", "featureGate", "<init>", "(Lcom/paypal/oslo/feature/merchantbanking/domain/remoteconfig/MerchantBankingFeatureGate;)V", "", "invoke", "()Z", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/merchantbanking/domain/remoteconfig/MerchantBankingFeatureGate;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetMerchantArnFeatureFlagUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.merchantbanking.domain.remoteconfig.MerchantBankingFeatureGate getHighSpeedVideoSizes;

    @javax.inject.Inject
    public GetMerchantArnFeatureFlagUseCase(com.paypal.oslo.feature.merchantbanking.domain.remoteconfig.MerchantBankingFeatureGate merchantBankingFeatureGate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantBankingFeatureGate, "");
        this.getHighSpeedVideoSizes = merchantBankingFeatureGate;
    }

    public final boolean invoke() {
        return this.getHighSpeedVideoSizes.isMerchantArnEnabled();
    }
}
