package com.paypal.oslo.feature.settings.domain.usecase;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r0\fH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/usecase/GetNotificationPreferencesUseCase;", "Lcom/paypal/oslo/feature/settings/domain/usecase/SectionUseCase;", "Lcom/paypal/oslo/feature/settings/domain/repository/ISettingsRepository;", "repository", "Lcom/paypal/oslo/feature/settings/domain/util/SettingsStringsProvider;", "settingsStringsProvider", "Lcom/paypal/oslo/feature/settings/featureflags/dynamicconfig/SettingsDynamicConfiguration;", "settingsDynamicConfiguration", "Lcom/paypal/oslo/core/remoteconfig/config/RemoteConfigConfig;", "remoteConfig", "<init>", "(Lcom/paypal/oslo/feature/settings/domain/repository/ISettingsRepository;Lcom/paypal/oslo/feature/settings/domain/util/SettingsStringsProvider;Lcom/paypal/oslo/feature/settings/featureflags/dynamicconfig/SettingsDynamicConfiguration;Lcom/paypal/oslo/core/remoteconfig/config/RemoteConfigConfig;)V", "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/settings/domain/error/SettingsError;", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsSectionUiData;", "invoke", "()Lkotlinx/coroutines/flow/Flow;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/settings/domain/repository/ISettingsRepository;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/settings/domain/util/SettingsStringsProvider;", "Lcom/paypal/oslo/feature/settings/featureflags/dynamicconfig/SettingsDynamicConfiguration;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/remoteconfig/config/RemoteConfigConfig;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GetNotificationPreferencesUseCase implements com.paypal.oslo.feature.settings.domain.usecase.SectionUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public GetNotificationPreferencesUseCase(com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository iSettingsRepository, com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider settingsStringsProvider, com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration settingsDynamicConfiguration, com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig remoteConfigConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iSettingsRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsStringsProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsDynamicConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remoteConfigConfig, "");
        this.getHighSpeedVideoFpsRangesFor = iSettingsRepository;
        this.Camera2StreamConfigurationMap = settingsStringsProvider;
        this.getHighResolutionOutputSizeshNQ4ISI = settingsDynamicConfiguration;
        this.getHighSpeedVideoFpsRanges = remoteConfigConfig;
    }

    @Override // com.paypal.oslo.feature.settings.domain.usecase.SectionUseCase
    public final kotlinx.coroutines.flow.Flow<arrow.core.Ior<com.paypal.oslo.feature.settings.domain.error.SettingsError, com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData>> invoke() {
        return kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.feature.settings.domain.usecase.GetNotificationPreferencesUseCase$invoke$1(this.getHighSpeedVideoFpsRangesFor.getNotificationPreferencesSettings(), this.Camera2StreamConfigurationMap.getNotificationPreferencesStrings(), this, null));
    }
}
