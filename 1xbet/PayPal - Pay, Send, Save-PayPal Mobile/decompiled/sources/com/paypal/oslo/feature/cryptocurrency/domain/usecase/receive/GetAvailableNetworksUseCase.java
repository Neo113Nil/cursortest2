package com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/receive/GetAvailableNetworksUseCase;", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/receive/CryptoReceiveRepository;", "cryptoReceiveRepository", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/receive/CryptoReceiveRepository;)V", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "Larrow/core/Either;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/receive/BlockchainNetwork;", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/receive/CryptoReceiveRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GetAvailableNetworksUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.cryptocurrency.domain.repository.receive.CryptoReceiveRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public GetAvailableNetworksUseCase(com.paypal.oslo.feature.cryptocurrency.domain.repository.receive.CryptoReceiveRepository cryptoReceiveRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoReceiveRepository, "");
        this.getHighSpeedVideoSizes = cryptoReceiveRepository;
    }

    public final java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, ? extends java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.receive.BlockchainNetwork>>> continuation) {
        return this.getHighSpeedVideoSizes.getAvailableNetworks(str, continuation);
    }
}
