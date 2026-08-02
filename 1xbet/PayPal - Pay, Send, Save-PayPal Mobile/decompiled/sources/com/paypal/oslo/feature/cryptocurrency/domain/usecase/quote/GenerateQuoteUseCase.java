package com.paypal.oslo.feature.cryptocurrency.domain.usecase.quote;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JP\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bH\u0086B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/quote/GenerateQuoteUseCase;", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/quote/CryptoQuoteRepository;", "cryptoQuoteRepository", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/quote/CryptoQuoteRepository;)V", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/trade/CryptoTradeAction;", "action", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "fiatCurrencyCode", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FUNDING_OPTION_ID, "quoteFiatAmount", "quoteQuantity", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/quote/CryptoQuote;", "invoke", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/model/trade/CryptoTradeAction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/quote/CryptoQuoteRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GenerateQuoteUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.cryptocurrency.domain.repository.quote.CryptoQuoteRepository getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public GenerateQuoteUseCase(com.paypal.oslo.feature.cryptocurrency.domain.repository.quote.CryptoQuoteRepository cryptoQuoteRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoQuoteRepository, "");
        this.getHighSpeedVideoFpsRanges = cryptoQuoteRepository;
    }

    public final java.lang.Object invoke(com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction cryptoTradeAction, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.quote.CryptoQuote>> continuation) {
        return this.getHighSpeedVideoFpsRanges.generateQuote(cryptoTradeAction, str, str2, str3, str4, str5, continuation);
    }
}
