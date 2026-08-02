package com.paypal.oslo.feature.packagetracking.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/usecase/GetUnlinkBannerSeenUseCase;", "", "Lcom/paypal/oslo/feature/packagetracking/domain/repository/SettingsRepository;", "settingsRepository", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/repository/SettingsRepository;)V", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "emailProvider", "", "invoke", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;)Ljava/lang/Boolean;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/packagetracking/domain/repository/SettingsRepository;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetUnlinkBannerSeenUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.packagetracking.domain.repository.SettingsRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public GetUnlinkBannerSeenUseCase(com.paypal.oslo.feature.packagetracking.domain.repository.SettingsRepository settingsRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsRepository, "");
        this.Camera2StreamConfigurationMap = settingsRepository;
    }

    public final java.lang.Boolean invoke(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
        return this.Camera2StreamConfigurationMap.getUserHasSeenUnlinkBySystemBanner(emailProvider);
    }
}
