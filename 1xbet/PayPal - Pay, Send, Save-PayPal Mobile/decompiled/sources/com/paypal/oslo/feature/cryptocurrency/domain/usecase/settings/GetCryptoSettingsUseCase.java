package com.paypal.oslo.feature.cryptocurrency.domain.usecase.settings;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0086B¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0082@¢\u0006\u0004\b\u000e\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/settings/GetCryptoSettingsUseCase;", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;", "featureGateManager", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rewards/pyusd/GetPYUSDRewardsStatusUseCase;", "getPYUSDRewardsStatusUseCase", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rewards/pyusd/GetPYUSDRewardsStatusUseCase;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/settings/CryptoSettingsData;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/settings/PyusdRewardsSettings;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rewards/pyusd/GetPYUSDRewardsStatusUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GetCryptoSettingsUseCase {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public GetCryptoSettingsUseCase(com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager featureGateManager, com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase getPYUSDRewardsStatusUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPYUSDRewardsStatusUseCase, "");
        this.getHighResolutionOutputSizeshNQ4ISI = featureGateManager;
        this.getHighSpeedVideoFpsRangesFor = getPYUSDRewardsStatusUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.settings.CryptoSettingsData>> continuation) {
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.settings.GetCryptoSettingsUseCase$invoke$1 getCryptoSettingsUseCase$invoke$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.cryptocurrency.domain.usecase.settings.GetCryptoSettingsUseCase$invoke$1) {
            getCryptoSettingsUseCase$invoke$1 = (com.paypal.oslo.feature.cryptocurrency.domain.usecase.settings.GetCryptoSettingsUseCase$invoke$1) continuation;
            if ((getCryptoSettingsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                getCryptoSettingsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = getCryptoSettingsUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getCryptoSettingsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    getCryptoSettingsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = getHighResolutionOutputSizeshNQ4ISI(getCryptoSettingsUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return arrow.core.EitherKt.right(new com.paypal.oslo.feature.cryptocurrency.domain.model.settings.CryptoSettingsData(null, null, (com.paypal.oslo.feature.cryptocurrency.domain.model.settings.PyusdRewardsSettings) obj, 3, null));
            }
        }
        getCryptoSettingsUseCase$invoke$1 = new com.paypal.oslo.feature.cryptocurrency.domain.usecase.settings.GetCryptoSettingsUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getCryptoSettingsUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getCryptoSettingsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        return arrow.core.EitherKt.right(new com.paypal.oslo.feature.cryptocurrency.domain.model.settings.CryptoSettingsData(null, null, (com.paypal.oslo.feature.cryptocurrency.domain.model.settings.PyusdRewardsSettings) obj2, 3, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.domain.model.settings.PyusdRewardsSettings> continuation) {
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.settings.GetCryptoSettingsUseCase$getPyusdRewardsSettings$1 getCryptoSettingsUseCase$getPyusdRewardsSettings$1;
        int i;
        arrow.core.Either.Right right;
        if (continuation instanceof com.paypal.oslo.feature.cryptocurrency.domain.usecase.settings.GetCryptoSettingsUseCase$getPyusdRewardsSettings$1) {
            getCryptoSettingsUseCase$getPyusdRewardsSettings$1 = (com.paypal.oslo.feature.cryptocurrency.domain.usecase.settings.GetCryptoSettingsUseCase$getPyusdRewardsSettings$1) continuation;
            if ((getCryptoSettingsUseCase$getPyusdRewardsSettings$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                getCryptoSettingsUseCase$getPyusdRewardsSettings$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = getCryptoSettingsUseCase$getPyusdRewardsSettings$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getCryptoSettingsUseCase$getPyusdRewardsSettings$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!this.getHighResolutionOutputSizeshNQ4ISI.isPyusdRewardsEnabled()) {
                        return null;
                    }
                    com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase getPYUSDRewardsStatusUseCase = this.getHighSpeedVideoFpsRangesFor;
                    getCryptoSettingsUseCase$getPyusdRewardsSettings$1.Camera2StreamConfigurationMap = 1;
                    obj = getPYUSDRewardsStatusUseCase.invoke(getCryptoSettingsUseCase$getPyusdRewardsSettings$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                right = (arrow.core.Either) obj;
                if (!(right instanceof arrow.core.Either.Right)) {
                    right = new arrow.core.Either.Right(new com.paypal.oslo.feature.cryptocurrency.domain.model.settings.PyusdRewardsSettings(((com.paypal.oslo.feature.cryptocurrency.domain.model.rewards.pyusd.PYUSDRewardsStatus) ((arrow.core.Either.Right) right).getValue()).isOptIn()));
                } else if (!(right instanceof arrow.core.Either.Left)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return right.getOrNull();
            }
        }
        getCryptoSettingsUseCase$getPyusdRewardsSettings$1 = new com.paypal.oslo.feature.cryptocurrency.domain.usecase.settings.GetCryptoSettingsUseCase$getPyusdRewardsSettings$1(this, continuation);
        java.lang.Object obj2 = getCryptoSettingsUseCase$getPyusdRewardsSettings$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getCryptoSettingsUseCase$getPyusdRewardsSettings$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        right = (arrow.core.Either) obj2;
        if (!(right instanceof arrow.core.Either.Right)) {
        }
        return right.getOrNull();
    }
}
