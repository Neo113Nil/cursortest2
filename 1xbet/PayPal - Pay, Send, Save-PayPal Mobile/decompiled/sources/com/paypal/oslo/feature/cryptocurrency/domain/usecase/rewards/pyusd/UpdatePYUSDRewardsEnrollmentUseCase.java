package com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rewards/pyusd/UpdatePYUSDRewardsEnrollmentUseCase;", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/preferences/CryptoPreferencesRepository;", "cryptoPreferencesRepository", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/preferences/CryptoPreferencesRepository;)V", "", "enroll", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/rewards/pyusd/PYUSDRewardsStatus;", "invoke", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/preferences/CryptoPreferencesRepository;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UpdatePYUSDRewardsEnrollmentUseCase {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.repository.preferences.CryptoPreferencesRepository getHighSpeedVideoFpsRanges;
    private static final com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.UpdatePYUSDRewardsEnrollmentUseCase.Companion Companion = new com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.UpdatePYUSDRewardsEnrollmentUseCase.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public UpdatePYUSDRewardsEnrollmentUseCase(com.paypal.oslo.feature.cryptocurrency.domain.repository.preferences.CryptoPreferencesRepository cryptoPreferencesRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoPreferencesRepository, "");
        this.getHighSpeedVideoFpsRanges = cryptoPreferencesRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.rewards.pyusd.PYUSDRewardsStatus>> continuation) {
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.UpdatePYUSDRewardsEnrollmentUseCase$invoke$1 updatePYUSDRewardsEnrollmentUseCase$invoke$1;
        int i;
        java.lang.String str;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.UpdatePYUSDRewardsEnrollmentUseCase$invoke$1) {
            updatePYUSDRewardsEnrollmentUseCase$invoke$1 = (com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.UpdatePYUSDRewardsEnrollmentUseCase$invoke$1) continuation;
            if ((updatePYUSDRewardsEnrollmentUseCase$invoke$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                updatePYUSDRewardsEnrollmentUseCase$invoke$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = updatePYUSDRewardsEnrollmentUseCase$invoke$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = updatePYUSDRewardsEnrollmentUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.cryptocurrency.domain.repository.preferences.CryptoPreferencesRepository cryptoPreferencesRepository = this.getHighSpeedVideoFpsRanges;
                    if (z) {
                        str = "OPT_IN";
                    } else {
                        if (z) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        str = "OPT_OUT";
                    }
                    updatePYUSDRewardsEnrollmentUseCase$invoke$1.getHighSpeedVideoSizes = z;
                    updatePYUSDRewardsEnrollmentUseCase$invoke$1.getHighSpeedVideoFpsRanges = 1;
                    obj = cryptoPreferencesRepository.updateCryptoCurrencyPreference("PYUSD", "REWARD_APY", str, updatePYUSDRewardsEnrollmentUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = updatePYUSDRewardsEnrollmentUseCase$invoke$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.CryptoPreference cryptoPreference = (com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.CryptoPreference) ((arrow.core.Either.Right) either).getValue();
                    com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference assetPreference = cryptoPreference.getAssetPreference();
                    boolean z3 = (assetPreference != null ? assetPreference.getStatus() : null) == com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference.Status.OPT_IN;
                    com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference assetPreference2 = cryptoPreference.getAssetPreference();
                    java.lang.String rate = assetPreference2 != null ? assetPreference2.getRate() : null;
                    if (rate == null) {
                        rate = "";
                    }
                    java.lang.String assetSymbol = cryptoPreference.getAssetSymbol();
                    com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference assetPreference3 = cryptoPreference.getAssetPreference();
                    return new arrow.core.Either.Right(new com.paypal.oslo.feature.cryptocurrency.domain.model.rewards.pyusd.PYUSDRewardsStatus(z3, rate, assetSymbol, assetPreference3 != null ? assetPreference3.getPreviouslyEnrolled() : false));
                }
                if (either instanceof arrow.core.Either.Left) {
                    return either;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        updatePYUSDRewardsEnrollmentUseCase$invoke$1 = new com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.UpdatePYUSDRewardsEnrollmentUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = updatePYUSDRewardsEnrollmentUseCase$invoke$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = updatePYUSDRewardsEnrollmentUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rewards/pyusd/UpdatePYUSDRewardsEnrollmentUseCase$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
