package com.paypal.oslo.feature.settings.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f0\u000eH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/usecase/GetDataAndPrivacyUseCase;", "Lcom/paypal/oslo/feature/settings/domain/usecase/SectionUseCase;", "Lcom/paypal/oslo/feature/settings/domain/repository/ISettingsRepository;", "repository", "Lcom/paypal/oslo/feature/settings/domain/util/SettingsStringsProvider;", "settingsStringsProvider", "Lcom/paypal/oslo/feature/settings/featureflags/dynamicconfig/SettingsDynamicConfiguration;", "settingsDynamicConfiguration", "Lcom/paypal/oslo/core/remoteconfig/config/RemoteConfigConfig;", "remoteConfig", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "<init>", "(Lcom/paypal/oslo/feature/settings/domain/repository/ISettingsRepository;Lcom/paypal/oslo/feature/settings/domain/util/SettingsStringsProvider;Lcom/paypal/oslo/feature/settings/featureflags/dynamicconfig/SettingsDynamicConfiguration;Lcom/paypal/oslo/core/remoteconfig/config/RemoteConfigConfig;Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;)V", "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/settings/domain/error/SettingsError;", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsSectionUiData;", "invoke", "()Lkotlinx/coroutines/flow/Flow;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/settings/domain/repository/ISettingsRepository;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/settings/domain/util/SettingsStringsProvider;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/settings/featureflags/dynamicconfig/SettingsDynamicConfiguration;", "Lcom/paypal/oslo/core/remoteconfig/config/RemoteConfigConfig;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GetDataAndPrivacyUseCase implements com.paypal.oslo.feature.settings.domain.usecase.SectionUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public GetDataAndPrivacyUseCase(com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository iSettingsRepository, com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider settingsStringsProvider, com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration settingsDynamicConfiguration, com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig remoteConfigConfig, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iSettingsRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsStringsProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsDynamicConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remoteConfigConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        this.getHighResolutionOutputSizeshNQ4ISI = iSettingsRepository;
        this.Camera2StreamConfigurationMap = settingsStringsProvider;
        this.getHighSpeedVideoFpsRangesFor = settingsDynamicConfiguration;
        this.getHighSpeedVideoSizes = remoteConfigConfig;
        this.getHighSpeedVideoFpsRanges = featureGate;
    }

    @Override // com.paypal.oslo.feature.settings.domain.usecase.SectionUseCase
    public final kotlinx.coroutines.flow.Flow<arrow.core.Ior<com.paypal.oslo.feature.settings.domain.error.SettingsError, com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData>> invoke() {
        java.lang.Object value;
        com.paypal.oslo.feature.settings.domain.model.DataAndPrivacySettingsData dataAndPrivacySettings = this.getHighResolutionOutputSizeshNQ4ISI.getDataAndPrivacySettings();
        com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings dataAndPrivacyStrings = this.Camera2StreamConfigurationMap.getDataAndPrivacyStrings();
        arrow.core.Either<com.paypal.oslo.feature.settings.domain.error.SettingsError, java.lang.Boolean> isBiometricEnabled = this.getHighResolutionOutputSizeshNQ4ISI.isBiometricEnabled();
        boolean z = isBiometricEnabled instanceof arrow.core.Either.Left;
        java.lang.Object obj = java.lang.Boolean.FALSE;
        if (z) {
            value = obj;
        } else {
            if (!(isBiometricEnabled instanceof arrow.core.Either.Right)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            value = ((arrow.core.Either.Right) isBiometricEnabled).getValue();
        }
        boolean booleanValue = ((java.lang.Boolean) value).booleanValue();
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.settings.LoggerKt.log, "Biometric status retrieved for UI", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("isEnabled", java.lang.Boolean.valueOf(booleanValue)), kotlin.TuplesKt.to("hasError", java.lang.Boolean.valueOf(isBiometricEnabled.isLeft()))), null, 4, null);
        arrow.core.Either<com.paypal.oslo.feature.settings.domain.error.SettingsError, java.lang.Boolean> isLLSEnabled = this.getHighResolutionOutputSizeshNQ4ISI.isLLSEnabled();
        if (isLLSEnabled instanceof arrow.core.Either.Left) {
        } else {
            if (!(isLLSEnabled instanceof arrow.core.Either.Right)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            obj = ((arrow.core.Either.Right) isLLSEnabled).getValue();
        }
        com.paypal.oslo.feature.settings.domain.model.LLSState lLSState = new com.paypal.oslo.feature.settings.domain.model.LLSState(((java.lang.Boolean) obj).booleanValue(), isLLSEnabled.leftOrNull());
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.settings.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        pairArr[0] = kotlin.TuplesKt.to("isEnabled", java.lang.Boolean.valueOf(lLSState.isEnabled()));
        pairArr[1] = kotlin.TuplesKt.to("hasError", java.lang.Boolean.valueOf(lLSState.getError() != null));
        com.paypal.android.logger.Logger.d$default(logger, "LLS status retrieved for UI", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        return kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.feature.settings.domain.usecase.GetDataAndPrivacyUseCase$invoke$1(this, dataAndPrivacySettings, dataAndPrivacyStrings, booleanValue, isBiometricEnabled, lLSState, null));
    }
}
