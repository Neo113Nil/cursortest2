package com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0086B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rewards/pyusd/GetPYUSDRewardsStatusUseCase;", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/preferences/CryptoPreferencesRepository;", "cryptoPreferencesRepository", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/preferences/CryptoPreferencesRepository;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/rewards/pyusd/PYUSDRewardsStatus;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/preferences/CryptoPreferencesRepository;", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GetPYUSDRewardsStatusUseCase {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.repository.preferences.CryptoPreferencesRepository getHighSpeedVideoSizes;
    private static final com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase.Companion Companion = new com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public GetPYUSDRewardsStatusUseCase(com.paypal.oslo.feature.cryptocurrency.domain.repository.preferences.CryptoPreferencesRepository cryptoPreferencesRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoPreferencesRepository, "");
        this.getHighSpeedVideoSizes = cryptoPreferencesRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.rewards.pyusd.PYUSDRewardsStatus>> continuation) {
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase$invoke$1 getPYUSDRewardsStatusUseCase$invoke$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase$invoke$1) {
            getPYUSDRewardsStatusUseCase$invoke$1 = (com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase$invoke$1) continuation;
            if ((getPYUSDRewardsStatusUseCase$invoke$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                getPYUSDRewardsStatusUseCase$invoke$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = getPYUSDRewardsStatusUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getPYUSDRewardsStatusUseCase$invoke$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.cryptocurrency.domain.repository.preferences.CryptoPreferencesRepository cryptoPreferencesRepository = this.getHighSpeedVideoSizes;
                    getPYUSDRewardsStatusUseCase$invoke$1.getHighSpeedVideoSizes = 1;
                    obj = cryptoPreferencesRepository.getCryptoPreferences("PYUSD", "REWARD_APY", getPYUSDRewardsStatusUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.CryptoPreference cryptoPreference = (com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.CryptoPreference) ((arrow.core.Either.Right) either).getValue();
                    com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference assetPreference = cryptoPreference.getAssetPreference();
                    boolean z = (assetPreference != null ? assetPreference.getStatus() : null) == com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference.Status.OPT_IN;
                    com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference assetPreference2 = cryptoPreference.getAssetPreference();
                    java.lang.String rate = assetPreference2 != null ? assetPreference2.getRate() : null;
                    if (rate == null) {
                        rate = "";
                    }
                    java.lang.String assetSymbol = cryptoPreference.getAssetSymbol();
                    com.paypal.oslo.feature.cryptocurrency.domain.model.preferences.AssetPreference assetPreference3 = cryptoPreference.getAssetPreference();
                    return new arrow.core.Either.Right(new com.paypal.oslo.feature.cryptocurrency.domain.model.rewards.pyusd.PYUSDRewardsStatus(z, rate, assetSymbol, assetPreference3 != null ? assetPreference3.getPreviouslyEnrolled() : false));
                }
                if (either instanceof arrow.core.Either.Left) {
                    return either;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        getPYUSDRewardsStatusUseCase$invoke$1 = new com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getPYUSDRewardsStatusUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getPYUSDRewardsStatusUseCase$invoke$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rewards/pyusd/GetPYUSDRewardsStatusUseCase$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
