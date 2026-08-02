package com.paypal.oslo.feature.cryptocurrency.ui.hub;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/CryptoHubPollDataFacade;", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/polling/PollCryptoHoldingsUseCase;", "pollCryptoHoldingsUseCase", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/polling/PollCryptoMarketPricesUseCase;", "pollCryptoMarketPricesUseCase", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/prices/FilterMarketPricesUseCase;", "filterMarketPricesUseCase", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/polling/PollCryptoHoldingsUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/polling/PollCryptoMarketPricesUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/prices/FilterMarketPricesUseCase;)V", "", "currencyCode", "", "immediate", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubPollingData;", "invoke", "(Ljava/lang/String;Z)Lkotlinx/coroutines/flow/Flow;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/polling/PollCryptoHoldingsUseCase;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/polling/PollCryptoMarketPricesUseCase;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/prices/FilterMarketPricesUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoHubPollDataFacade {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoMarketPricesUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoHoldingsUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.FilterMarketPricesUseCase getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public CryptoHubPollDataFacade(com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoHoldingsUseCase pollCryptoHoldingsUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoMarketPricesUseCase pollCryptoMarketPricesUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.FilterMarketPricesUseCase filterMarketPricesUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pollCryptoHoldingsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pollCryptoMarketPricesUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filterMarketPricesUseCase, "");
        this.getHighSpeedVideoFpsRangesFor = pollCryptoHoldingsUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = pollCryptoMarketPricesUseCase;
        this.getHighSpeedVideoFpsRanges = filterMarketPricesUseCase;
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow invoke$default(com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubPollDataFacade cryptoHubPollDataFacade, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return cryptoHubPollDataFacade.invoke(str, z);
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubPollingData> invoke(java.lang.String currencyCode, boolean immediate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        return kotlinx.coroutines.flow.FlowKt.flowCombine(this.getHighSpeedVideoFpsRangesFor.invoke(currencyCode, immediate), this.getHighResolutionOutputSizeshNQ4ISI.invoke(currencyCode, immediate), new com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubPollDataFacade$invoke$1(this, null));
    }
}
