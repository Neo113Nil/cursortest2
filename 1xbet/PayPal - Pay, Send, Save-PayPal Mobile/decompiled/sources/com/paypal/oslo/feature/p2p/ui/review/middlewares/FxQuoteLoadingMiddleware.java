package com.paypal.oslo.feature.p2p.ui.review.middlewares;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/middlewares/FxQuoteLoadingMiddleware;", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "Lcom/paypal/oslo/feature/p2p/ui/review/state/CurrencyConversionUiState;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/CurrencyConversionEvent;", "Lcom/paypal/oslo/feature/p2p/ui/review/mappers/ExchangeRateToStringMapper;", "exchangeRateToStringMapper", "<init>", "(Lcom/paypal/oslo/feature/p2p/ui/review/mappers/ExchangeRateToStringMapper;)V", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;", "input", "", "invoke", "(Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/p2p/ui/review/mappers/ExchangeRateToStringMapper;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FxQuoteLoadingMiddleware implements com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState, com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent> {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.ui.review.mappers.ExchangeRateToStringMapper getHighSpeedVideoSizes;

    public FxQuoteLoadingMiddleware(com.paypal.oslo.feature.p2p.ui.review.mappers.ExchangeRateToStringMapper exchangeRateToStringMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exchangeRateToStringMapper, "");
        this.getHighSpeedVideoSizes = exchangeRateToStringMapper;
    }

    @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
    public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState, com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent> input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        if (input.getEvent() instanceof com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ShowConversionSheet) {
            com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState second = input.getStates().getSecond();
            com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent event = input.getEvent();
            kotlin.jvm.internal.Intrinsics.checkNotNull(event, "");
            com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ShowConversionSheet showConversionSheet = (com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ShowConversionSheet) event;
            if (second.getCachedFxQuote() != null) {
                java.lang.String senderAmount = showConversionSheet.getSenderAmount();
                kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent, kotlin.Unit> eventDispatcher = input.getEventDispatcher();
                com.paypal.oslo.feature.p2p.domain.model.FxQuote cachedFxQuote = second.getCachedFxQuote();
                if (cachedFxQuote != null) {
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.FX_QUOTE_CACHE_HIT, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("fxQuoteId", cachedFxQuote.getFxQuoteId()), kotlin.TuplesKt.to("route", "primary_cached")), null, 4, null);
                    eventDispatcher.invoke(new com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.FxQuoteLoaded(senderAmount, this.getHighSpeedVideoSizes.map(cachedFxQuote.getExchangeRate()), cachedFxQuote.getFxQuoteId()));
                    return;
                }
                return;
            }
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.FX_QUOTE_CACHE_MISS, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, second.getTransferAttemptId())), null, 4, null);
        }
    }
}
