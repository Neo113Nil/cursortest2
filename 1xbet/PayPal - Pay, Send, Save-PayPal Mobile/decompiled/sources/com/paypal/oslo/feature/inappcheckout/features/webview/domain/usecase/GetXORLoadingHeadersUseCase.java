package com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/GetXORLoadingHeadersUseCase;", "", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/GetMerchantUpgradePathUseCase;", "getMerchantUpgradePath", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/GetPayerIdUseCase;", "getPayerIdUseCase", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/GetMerchantUpgradePathUseCase;Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/GetPayerIdUseCase;)V", "", "", "invoke", "()Ljava/util/Map;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/GetMerchantUpgradePathUseCase;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/GetPayerIdUseCase;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetXORLoadingHeadersUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.usecase.GetMerchantUpgradePathUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.usecase.GetPayerIdUseCase getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public GetXORLoadingHeadersUseCase(com.paypal.oslo.feature.inappcheckout.domain.usecase.GetMerchantUpgradePathUseCase getMerchantUpgradePathUseCase, com.paypal.oslo.feature.inappcheckout.domain.usecase.GetPayerIdUseCase getPayerIdUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getMerchantUpgradePathUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPayerIdUseCase, "");
        this.getHighSpeedVideoSizes = getMerchantUpgradePathUseCase;
        this.getHighSpeedVideoFpsRanges = getPayerIdUseCase;
    }

    public final java.util.Map<java.lang.String, java.lang.String> invoke() {
        java.lang.String str;
        com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.UpgradePath invoke = this.getHighSpeedVideoSizes.invoke();
        if (invoke instanceof com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.UpgradePath.MerchantUpgrade) {
            str = com.paypal.oslo.feature.inappcheckout.Constants.WEB_VIEW_HTTP_HEADER_VALUE_MERCHANT_UPGRADE;
        } else {
            if (!(invoke instanceof com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.UpgradePath.NoMerchantUpgrade)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            str = com.paypal.oslo.feature.inappcheckout.Constants.WEB_VIEW_HTTP_HEADER_VALUE_NO_MERCHANT_UPGRADE;
        }
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        createMapBuilder.put(com.paypal.oslo.feature.inappcheckout.Constants.WEB_VIEW_HTTP_HEADER_KEY_INTEGRATION_ARTIFACT, str);
        java.lang.String invoke2 = this.getHighSpeedVideoFpsRanges.invoke();
        if (invoke2 != null) {
            if (kotlin.text.StringsKt.isBlank(invoke2)) {
                invoke2 = null;
            }
            if (invoke2 != null) {
                createMapBuilder.put(com.paypal.oslo.feature.inappcheckout.Constants.X_PAY_PAL_PAYER_ID, invoke2);
            }
        }
        return kotlin.collections.MapsKt.build(createMapBuilder);
    }
}
