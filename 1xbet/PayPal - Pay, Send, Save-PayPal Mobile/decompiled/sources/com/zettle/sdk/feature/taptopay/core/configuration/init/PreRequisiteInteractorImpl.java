package com.zettle.sdk.feature.taptopay.core.configuration.init;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/configuration/init/PreRequisiteInteractorImpl;", "Lcom/zettle/sdk/feature/taptopay/core/configuration/init/PreRequisiteInteractor;", "Lcom/zettle/sdk/core/log/Loggable;", "Lcom/zettle/sdk/core/auth/merchant/MerchantConfig;", "p0", "Lcom/zettle/sdk/feature/taptopay/core/DeviceCapabilities;", "p1", "<init>", "(Lcom/zettle/sdk/core/auth/merchant/MerchantConfig;Lcom/zettle/sdk/feature/taptopay/core/DeviceCapabilities;)V", "Lcom/zettle/sdk/feature/taptopay/core/configuration/init/PreRequisiteInteractor$Result;", "validate", "()Lcom/zettle/sdk/feature/taptopay/core/configuration/init/PreRequisiteInteractor$Result;", "getHighSpeedVideoFpsRangesFor", "Lcom/zettle/sdk/feature/taptopay/core/DeviceCapabilities;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/core/auth/merchant/MerchantConfig;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final class PreRequisiteInteractorImpl implements com.zettle.sdk.feature.taptopay.core.configuration.init.PreRequisiteInteractor, com.zettle.sdk.core.log.Loggable {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.DeviceCapabilities getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.zettle.sdk.core.auth.merchant.MerchantConfig Camera2StreamConfigurationMap;

    public PreRequisiteInteractorImpl(com.zettle.sdk.core.auth.merchant.MerchantConfig merchantConfig, com.zettle.sdk.feature.taptopay.core.DeviceCapabilities deviceCapabilities) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceCapabilities, "");
        this.Camera2StreamConfigurationMap = merchantConfig;
        this.getHighSpeedVideoFpsRanges = deviceCapabilities;
    }

    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return com.zettle.sdk.core.log.Loggable.DefaultImpls.getLogTag(this);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.configuration.init.PreRequisiteInteractor
    public final com.zettle.sdk.feature.taptopay.core.configuration.init.PreRequisiteInteractor.Result validate() {
        com.zettle.sdk.feature.taptopay.core.DeviceCapabilities deviceCapabilities = this.getHighSpeedVideoFpsRanges;
        if (deviceCapabilities.getHasMinAndroidVersionAllowed() && deviceCapabilities.getHasNFCCapabilities() && deviceCapabilities.getHasGooglePlayServices()) {
            java.lang.Object mo23163getUserConfigd1pmJ48 = this.Camera2StreamConfigurationMap.mo23163getUserConfigd1pmJ48();
            if (kotlin.Result.m23441isFailureimpl(mo23163getUserConfigd1pmJ48)) {
                mo23163getUserConfigd1pmJ48 = null;
            }
            com.zettle.sdk.core.user.userconfig.UserConfig userConfig = (com.zettle.sdk.core.user.userconfig.UserConfig) mo23163getUserConfigd1pmJ48;
            if (userConfig != null) {
                if (!com.zettle.sdk.core.user.userconfig.UserConfigKt.supportedReaders(userConfig).contains("com.softspace.1")) {
                    return new com.zettle.sdk.feature.taptopay.core.configuration.init.PreRequisiteInteractor.Result.Failed(com.zettle.sdk.feature.taptopay.core.FailureReason.ReaderNotSupported.INSTANCE);
                }
                return com.zettle.sdk.feature.taptopay.core.configuration.init.PreRequisiteInteractor.Result.Success.INSTANCE;
            }
            return new com.zettle.sdk.feature.taptopay.core.configuration.init.PreRequisiteInteractor.Result.Failed(com.zettle.sdk.feature.taptopay.core.FailureReason.AuthStateNotSupported.INSTANCE);
        }
        return new com.zettle.sdk.feature.taptopay.core.configuration.init.PreRequisiteInteractor.Result.Failed(com.zettle.sdk.feature.taptopay.core.FailureReason.DeviceNotSupported.INSTANCE);
    }
}
