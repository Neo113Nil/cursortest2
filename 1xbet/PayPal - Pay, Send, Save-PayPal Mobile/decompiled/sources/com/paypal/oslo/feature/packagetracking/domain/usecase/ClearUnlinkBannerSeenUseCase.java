package com.paypal.oslo.feature.packagetracking.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/usecase/ClearUnlinkBannerSeenUseCase;", "", "Lcom/paypal/oslo/feature/packagetracking/domain/repository/SettingsRepository;", "settingsRepository", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/repository/SettingsRepository;)V", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "emailProvider", "", "invoke", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/packagetracking/domain/repository/SettingsRepository;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ClearUnlinkBannerSeenUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.packagetracking.domain.repository.SettingsRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public ClearUnlinkBannerSeenUseCase(com.paypal.oslo.feature.packagetracking.domain.repository.SettingsRepository settingsRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsRepository, "");
        this.getHighSpeedVideoFpsRangesFor = settingsRepository;
    }

    public final java.lang.Object invoke(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object removeUserHasSeenUnlinkBySystemBanner = this.getHighSpeedVideoFpsRangesFor.removeUserHasSeenUnlinkBySystemBanner(emailProvider, continuation);
        return removeUserHasSeenUnlinkBySystemBanner == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? removeUserHasSeenUnlinkBySystemBanner : kotlin.Unit.INSTANCE;
    }
}
