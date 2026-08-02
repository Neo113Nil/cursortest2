package com.paypal.oslo.feature.cryptocurrency.data.repository.mock;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JL\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/data/repository/mock/MockCryptoFundingRepository;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/repository/funding/CryptoFundingRepository;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;", "featureGateManager", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;)V", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/trade/CryptoTradeAction;", "action", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "amount", "currencyCode", "quoteQuantity", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/FundingOption;", "evaluateEligibleFundingOptions", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/model/trade/CryptoTradeAction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MockCryptoFundingRepository implements com.paypal.oslo.feature.cryptocurrency.domain.repository.funding.CryptoFundingRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public MockCryptoFundingRepository(com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager featureGateManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
        this.getHighResolutionOutputSizeshNQ4ISI = featureGateManager;
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.cryptocurrency.LoggerKt.log, "Using Mock Crypto Funding Repository", null, null, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // com.paypal.oslo.feature.cryptocurrency.domain.repository.funding.CryptoFundingRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object evaluateEligibleFundingOptions(com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction cryptoTradeAction, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, ? extends java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingOption>>> continuation) {
        com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoFundingRepository$evaluateEligibleFundingOptions$1 mockCryptoFundingRepository$evaluateEligibleFundingOptions$1;
        int i;
        com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction cryptoTradeAction2;
        java.lang.String str5 = str2;
        java.lang.String str6 = str3;
        if (continuation instanceof com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoFundingRepository$evaluateEligibleFundingOptions$1) {
            mockCryptoFundingRepository$evaluateEligibleFundingOptions$1 = (com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoFundingRepository$evaluateEligibleFundingOptions$1) continuation;
            if ((mockCryptoFundingRepository$evaluateEligibleFundingOptions$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                mockCryptoFundingRepository$evaluateEligibleFundingOptions$1.getInputFormats -= 2147483648;
                java.lang.Object obj = mockCryptoFundingRepository$evaluateEligibleFundingOptions$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockCryptoFundingRepository$evaluateEligibleFundingOptions$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.cryptocurrency.LoggerKt.log, "Evaluating eligible funding options (mock)", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("action", cryptoTradeAction.name()), kotlin.TuplesKt.to(com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, str), kotlin.TuplesKt.to("amount", str5), kotlin.TuplesKt.to("currencyCode", str6)), null, 4, null);
                    cryptoTradeAction2 = cryptoTradeAction;
                    mockCryptoFundingRepository$evaluateEligibleFundingOptions$1.getHighSpeedVideoSizes = cryptoTradeAction2;
                    mockCryptoFundingRepository$evaluateEligibleFundingOptions$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    mockCryptoFundingRepository$evaluateEligibleFundingOptions$1.getHighSpeedVideoFpsRangesFor = str5;
                    mockCryptoFundingRepository$evaluateEligibleFundingOptions$1.getHighResolutionOutputSizeshNQ4ISI = str6;
                    mockCryptoFundingRepository$evaluateEligibleFundingOptions$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
                    mockCryptoFundingRepository$evaluateEligibleFundingOptions$1.getInputFormats = 1;
                    if (kotlinx.coroutines.DelayKt.delay(500L, mockCryptoFundingRepository$evaluateEligibleFundingOptions$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.String str7 = (java.lang.String) mockCryptoFundingRepository$evaluateEligibleFundingOptions$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.String str8 = (java.lang.String) mockCryptoFundingRepository$evaluateEligibleFundingOptions$1.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction cryptoTradeAction3 = (com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction) mockCryptoFundingRepository$evaluateEligibleFundingOptions$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    cryptoTradeAction2 = cryptoTradeAction3;
                    str6 = str7;
                    str5 = str8;
                }
                java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingOption> mockFundingOptions = com.paypal.oslo.feature.cryptocurrency.data.repository.mock.model.CryptoBuyFlowMock.INSTANCE.getMockFundingOptions(cryptoTradeAction2, str5, str6, this.getHighResolutionOutputSizeshNQ4ISI.isLoyaltyForCryptoEnabled());
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.cryptocurrency.LoggerKt.log, "Successfully retrieved mock funding options", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("optionCount", java.lang.Integer.valueOf(mockFundingOptions.size()))), null, 4, null);
                return arrow.core.EitherKt.right(mockFundingOptions);
            }
        }
        mockCryptoFundingRepository$evaluateEligibleFundingOptions$1 = new com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoFundingRepository$evaluateEligibleFundingOptions$1(this, continuation);
        java.lang.Object obj2 = mockCryptoFundingRepository$evaluateEligibleFundingOptions$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockCryptoFundingRepository$evaluateEligibleFundingOptions$1.getInputFormats;
        if (i != 0) {
        }
        java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingOption> mockFundingOptions2 = com.paypal.oslo.feature.cryptocurrency.data.repository.mock.model.CryptoBuyFlowMock.INSTANCE.getMockFundingOptions(cryptoTradeAction2, str5, str6, this.getHighResolutionOutputSizeshNQ4ISI.isLoyaltyForCryptoEnabled());
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.cryptocurrency.LoggerKt.log, "Successfully retrieved mock funding options", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("optionCount", java.lang.Integer.valueOf(mockFundingOptions2.size()))), null, 4, null);
        return arrow.core.EitherKt.right(mockFundingOptions2);
    }
}
