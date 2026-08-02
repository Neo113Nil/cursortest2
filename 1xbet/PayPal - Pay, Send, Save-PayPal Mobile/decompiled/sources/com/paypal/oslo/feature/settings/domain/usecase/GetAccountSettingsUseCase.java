package com.paypal.oslo.feature.settings.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0012\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f0\u000eH\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0017\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/usecase/GetAccountSettingsUseCase;", "", "Lcom/paypal/oslo/feature/settings/domain/repository/ISettingsRepository;", "repository", "Lcom/paypal/oslo/feature/settings/domain/util/SettingsStringsProvider;", "settingsStringsProvider", "Lcom/paypal/oslo/feature/settings/featureflags/dynamicconfig/SettingsDynamicConfiguration;", "settingsDynamicConfiguration", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatAddressUseCase;", "formatAddressUseCase", "Lcom/paypal/oslo/core/i18n/domain/usecase/NameFormatUseCase;", "nameFormatUseCase", "<init>", "(Lcom/paypal/oslo/feature/settings/domain/repository/ISettingsRepository;Lcom/paypal/oslo/feature/settings/domain/util/SettingsStringsProvider;Lcom/paypal/oslo/feature/settings/featureflags/dynamicconfig/SettingsDynamicConfiguration;Lcom/paypal/oslo/core/i18n/domain/usecase/FormatAddressUseCase;Lcom/paypal/oslo/core/i18n/domain/usecase/NameFormatUseCase;)V", "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/settings/domain/error/SettingsError;", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsSectionUiData;", "invoke", "()Lkotlinx/coroutines/flow/Flow;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/settings/domain/repository/ISettingsRepository;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/settings/domain/util/SettingsStringsProvider;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/settings/featureflags/dynamicconfig/SettingsDynamicConfiguration;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatAddressUseCase;", "Lcom/paypal/oslo/core/i18n/domain/usecase/NameFormatUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GetAccountSettingsUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.NameFormatUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public GetAccountSettingsUseCase(com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository iSettingsRepository, com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider settingsStringsProvider, com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration settingsDynamicConfiguration, com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase formatAddressUseCase, com.paypal.oslo.core.i18n.domain.usecase.NameFormatUseCase nameFormatUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iSettingsRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsStringsProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsDynamicConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatAddressUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameFormatUseCase, "");
        this.getHighResolutionOutputSizeshNQ4ISI = iSettingsRepository;
        this.Camera2StreamConfigurationMap = settingsStringsProvider;
        this.getHighSpeedVideoSizes = settingsDynamicConfiguration;
        this.getHighSpeedVideoFpsRangesFor = formatAddressUseCase;
        this.getHighSpeedVideoFpsRanges = nameFormatUseCase;
    }

    public final kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.feature.settings.domain.error.SettingsError, com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData>> invoke() {
        return kotlinx.coroutines.flow.FlowKt.transformLatest(this.getHighResolutionOutputSizeshNQ4ISI.getAccountSettingsFromUserState(), new com.paypal.oslo.feature.settings.domain.usecase.GetAccountSettingsUseCase$invoke$1(this, this.Camera2StreamConfigurationMap.getAccountStrings(), null));
    }
}
