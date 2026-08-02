package com.paypal.oslo.feature.cryptocurrency.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/data/repository/mock/MockCryptoQuoteRepository;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/quote/CryptoQuoteRepository;", "<init>", "()V", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/trade/CryptoTradeAction;", "action", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "fiatCurrencyCode", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FUNDING_OPTION_ID, "quoteFiatAmount", "quoteQuantity", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/quote/CryptoQuote;", "generateQuote", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/model/trade/CryptoTradeAction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MockCryptoQuoteRepository implements com.paypal.oslo.feature.cryptocurrency.domain.repository.quote.CryptoQuoteRepository {
    public static final int $stable = 0;

    @javax.inject.Inject
    public MockCryptoQuoteRepository() {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.cryptocurrency.LoggerKt.log, "Using Mock Crypto Quote Repository", null, null, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    @Override // com.paypal.oslo.feature.cryptocurrency.domain.repository.quote.CryptoQuoteRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object generateQuote(com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction cryptoTradeAction, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.quote.CryptoQuote>> continuation) {
        com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoQuoteRepository$generateQuote$1 mockCryptoQuoteRepository$generateQuote$1;
        int i;
        com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction cryptoTradeAction2;
        java.lang.String str6 = str;
        java.lang.String str7 = str2;
        java.lang.String str8 = str4;
        if (continuation instanceof com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoQuoteRepository$generateQuote$1) {
            mockCryptoQuoteRepository$generateQuote$1 = (com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoQuoteRepository$generateQuote$1) continuation;
            if ((mockCryptoQuoteRepository$generateQuote$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                mockCryptoQuoteRepository$generateQuote$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = mockCryptoQuoteRepository$generateQuote$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockCryptoQuoteRepository$generateQuote$1.getInputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.cryptocurrency.LoggerKt.log, "Generating cryptocurrency quote (mock)", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("action", cryptoTradeAction.name()), kotlin.TuplesKt.to(com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, str6), kotlin.TuplesKt.to("fiatCurrencyCode", str7), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FUNDING_OPTION_ID, str3), kotlin.TuplesKt.to("quoteFiatAmount", str8)), null, 4, null);
                    cryptoTradeAction2 = cryptoTradeAction;
                    mockCryptoQuoteRepository$generateQuote$1.Camera2StreamConfigurationMap = cryptoTradeAction2;
                    mockCryptoQuoteRepository$generateQuote$1.getHighSpeedVideoSizes = str6;
                    mockCryptoQuoteRepository$generateQuote$1.getHighSpeedVideoFpsRanges = str7;
                    mockCryptoQuoteRepository$generateQuote$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                    mockCryptoQuoteRepository$generateQuote$1.getHighResolutionOutputSizeshNQ4ISI = str8;
                    mockCryptoQuoteRepository$generateQuote$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str5);
                    mockCryptoQuoteRepository$generateQuote$1.getInputSizeshNQ4ISI = 1;
                    if (kotlinx.coroutines.DelayKt.delay(800L, mockCryptoQuoteRepository$generateQuote$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.String str9 = (java.lang.String) mockCryptoQuoteRepository$generateQuote$1.getHighResolutionOutputSizeshNQ4ISI;
                    str7 = (java.lang.String) mockCryptoQuoteRepository$generateQuote$1.getHighSpeedVideoFpsRanges;
                    java.lang.String str10 = (java.lang.String) mockCryptoQuoteRepository$generateQuote$1.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction cryptoTradeAction3 = (com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction) mockCryptoQuoteRepository$generateQuote$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    cryptoTradeAction2 = cryptoTradeAction3;
                    str8 = str9;
                    str6 = str10;
                }
                com.paypal.oslo.feature.cryptocurrency.domain.model.quote.CryptoQuote mockQuote = com.paypal.oslo.feature.cryptocurrency.data.repository.mock.model.CryptoBuyFlowMock.INSTANCE.getMockQuote(cryptoTradeAction2.name(), str6, str7, str8);
                com.paypal.oslo.feature.cryptocurrency.data.repository.mock.model.CryptoBuyFlowMock.INSTANCE.storeQuote(mockQuote);
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.cryptocurrency.LoggerKt.log, "Successfully generated mock quote", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("quoteId", mockQuote.getQuoteId()), kotlin.TuplesKt.to(com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, mockQuote.getAssetSymbol()), kotlin.TuplesKt.to("assetPrice", mockQuote.getAssetPrice().getValue()), kotlin.TuplesKt.to("quantity", mockQuote.getQuoteQuantity().getQuantity()), kotlin.TuplesKt.to("totalAmount", mockQuote.getTradeAmountBreakdown().getTotalAmount().getValue()), kotlin.TuplesKt.to("fee", mockQuote.getTradeAmountBreakdown().getTotalFee().getValue())), null, 4, null);
                return arrow.core.EitherKt.right(mockQuote);
            }
        }
        mockCryptoQuoteRepository$generateQuote$1 = new com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoQuoteRepository$generateQuote$1(this, continuation);
        java.lang.Object obj2 = mockCryptoQuoteRepository$generateQuote$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockCryptoQuoteRepository$generateQuote$1.getInputSizeshNQ4ISI;
        if (i != 0) {
        }
        com.paypal.oslo.feature.cryptocurrency.domain.model.quote.CryptoQuote mockQuote2 = com.paypal.oslo.feature.cryptocurrency.data.repository.mock.model.CryptoBuyFlowMock.INSTANCE.getMockQuote(cryptoTradeAction2.name(), str6, str7, str8);
        com.paypal.oslo.feature.cryptocurrency.data.repository.mock.model.CryptoBuyFlowMock.INSTANCE.storeQuote(mockQuote2);
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.cryptocurrency.LoggerKt.log, "Successfully generated mock quote", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("quoteId", mockQuote2.getQuoteId()), kotlin.TuplesKt.to(com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, mockQuote2.getAssetSymbol()), kotlin.TuplesKt.to("assetPrice", mockQuote2.getAssetPrice().getValue()), kotlin.TuplesKt.to("quantity", mockQuote2.getQuoteQuantity().getQuantity()), kotlin.TuplesKt.to("totalAmount", mockQuote2.getTradeAmountBreakdown().getTotalAmount().getValue()), kotlin.TuplesKt.to("fee", mockQuote2.getTradeAmountBreakdown().getTotalFee().getValue())), null, 4, null);
        return arrow.core.EitherKt.right(mockQuote2);
    }
}
