package com.paypal.oslo.feature.settings.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/usecase/GetAppVersionUseCase;", "", "Lcom/paypal/oslo/feature/settings/domain/util/SettingsStringsProvider;", "settingsStringsProvider", "Lcom/paypal/oslo/core/appidentity/domain/AppInformation;", "appInformation", "<init>", "(Lcom/paypal/oslo/feature/settings/domain/util/SettingsStringsProvider;Lcom/paypal/oslo/core/appidentity/domain/AppInformation;)V", "", "invoke", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/settings/domain/util/SettingsStringsProvider;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/appidentity/domain/AppInformation;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GetAppVersionUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.core.appidentity.domain.AppInformation getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public GetAppVersionUseCase(com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider settingsStringsProvider, com.paypal.oslo.core.appidentity.domain.AppInformation appInformation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsStringsProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInformation, "");
        this.getHighSpeedVideoFpsRangesFor = settingsStringsProvider;
        this.getHighSpeedVideoFpsRanges = appInformation;
    }

    public final java.lang.String invoke() {
        return this.getHighSpeedVideoFpsRangesFor.getFooterStrings().getVersion(this.getHighSpeedVideoFpsRanges.getAppVersion());
    }
}
