package com.paypal.oslo.feature.cryptocurrency.data.repository.mock;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/data/repository/mock/MockCryptoTradeRepository;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/trade/CryptoTradeRepository;", "<init>", "()V", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/trade/CryptoTradeAction;", "action", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FUNDING_OPTION_ID, "quoteId", "", "pyusdRewardsOptIn", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/trade/CryptoTradeExecution;", "executeTrade", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/model/trade/CryptoTradeAction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MockCryptoTradeRepository implements com.paypal.oslo.feature.cryptocurrency.domain.repository.trade.CryptoTradeRepository {
    public static final int $stable = 0;

    @javax.inject.Inject
    public MockCryptoTradeRepository() {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.cryptocurrency.LoggerKt.log, "Using Mock Crypto Trade Repository", null, null, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // com.paypal.oslo.feature.cryptocurrency.domain.repository.trade.CryptoTradeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object executeTrade(com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction cryptoTradeAction, java.lang.String str, java.lang.String str2, java.lang.Boolean bool, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeExecution>> continuation) {
        com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoTradeRepository$executeTrade$1 mockCryptoTradeRepository$executeTrade$1;
        int i;
        com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction cryptoTradeAction2;
        com.paypal.oslo.feature.cryptocurrency.domain.model.quote.CryptoQuote lastQuote;
        if (continuation instanceof com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoTradeRepository$executeTrade$1) {
            mockCryptoTradeRepository$executeTrade$1 = (com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoTradeRepository$executeTrade$1) continuation;
            if ((mockCryptoTradeRepository$executeTrade$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                mockCryptoTradeRepository$executeTrade$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = mockCryptoTradeRepository$executeTrade$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockCryptoTradeRepository$executeTrade$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.cryptocurrency.LoggerKt.log, "Executing cryptocurrency trade (mock)", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("action", cryptoTradeAction.name()), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FUNDING_OPTION_ID, str), kotlin.TuplesKt.to("quoteId", str2)), null, 4, null);
                    cryptoTradeAction2 = cryptoTradeAction;
                    mockCryptoTradeRepository$executeTrade$1.Camera2StreamConfigurationMap = cryptoTradeAction2;
                    mockCryptoTradeRepository$executeTrade$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    mockCryptoTradeRepository$executeTrade$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    mockCryptoTradeRepository$executeTrade$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bool);
                    mockCryptoTradeRepository$executeTrade$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (kotlinx.coroutines.DelayKt.delay(1000L, mockCryptoTradeRepository$executeTrade$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction cryptoTradeAction3 = (com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction) mockCryptoTradeRepository$executeTrade$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    cryptoTradeAction2 = cryptoTradeAction3;
                }
                lastQuote = com.paypal.oslo.feature.cryptocurrency.data.repository.mock.model.CryptoBuyFlowMock.INSTANCE.getLastQuote();
                if (lastQuote != null) {
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound.INSTANCE);
                }
                com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeExecution mockTradeExecution = com.paypal.oslo.feature.cryptocurrency.data.repository.mock.model.CryptoBuyFlowMock.INSTANCE.getMockTradeExecution(cryptoTradeAction2.name(), lastQuote);
                com.paypal.oslo.feature.cryptocurrency.data.repository.mock.model.CryptoBuyFlowMock.INSTANCE.clearQuote();
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.cryptocurrency.LoggerKt.log, "Successfully executed mock trade", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("tradeId", mockTradeExecution.getId()), kotlin.TuplesKt.to("status", mockTradeExecution.getStatus()), kotlin.TuplesKt.to("amountFulfilled", mockTradeExecution.getAmountFulfilled().getValue()), kotlin.TuplesKt.to("assetQuantity", mockTradeExecution.getAssetQuantityTruncated().getQuantity()), kotlin.TuplesKt.to(com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, mockTradeExecution.getAssetQuantityTruncated().getAssetSymbol()), kotlin.TuplesKt.to("paymentId", mockTradeExecution.getPaymentId())), null, 4, null);
                return arrow.core.EitherKt.right(mockTradeExecution);
            }
        }
        mockCryptoTradeRepository$executeTrade$1 = new com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoTradeRepository$executeTrade$1(this, continuation);
        java.lang.Object obj2 = mockCryptoTradeRepository$executeTrade$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockCryptoTradeRepository$executeTrade$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        lastQuote = com.paypal.oslo.feature.cryptocurrency.data.repository.mock.model.CryptoBuyFlowMock.INSTANCE.getLastQuote();
        if (lastQuote != null) {
        }
    }
}
