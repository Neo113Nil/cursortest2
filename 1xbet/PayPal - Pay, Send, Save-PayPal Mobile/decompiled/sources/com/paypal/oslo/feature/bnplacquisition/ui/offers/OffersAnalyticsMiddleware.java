package com.paypal.oslo.feature.bnplacquisition.ui.offers;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersAnalyticsMiddleware;", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersAnalyticsHelper;", "analyticsHelper", "Lcom/paypal/oslo/feature/bnplacquisition/ui/SessionStorage;", "sessionStorage", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersAnalyticsHelper;Lcom/paypal/oslo/feature/bnplacquisition/ui/SessionStorage;)V", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;", "input", "", "invoke", "(Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersAnalyticsHelper;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/bnplacquisition/ui/SessionStorage;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OffersAnalyticsMiddleware implements com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent> {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersAnalyticsHelper Camera2StreamConfigurationMap;

    public OffersAnalyticsMiddleware(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersAnalyticsHelper offersAnalyticsHelper, com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offersAnalyticsHelper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionStorage, "");
        this.Camera2StreamConfigurationMap = offersAnalyticsHelper;
        this.getHighSpeedVideoSizes = sessionStorage;
    }

    @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
    public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent> input) {
        java.lang.String analyticsComponentId;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent event = input.getEvent();
        java.lang.Object obj = null;
        if (!(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.OfferSelected)) {
            if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.Continue.Pressed) {
                com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState second = input.getStates().getSecond();
                com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Success success = second instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Success ? (com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Success) second : null;
                if (success != null) {
                    this.Camera2StreamConfigurationMap.trackItemPressed(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersAnalyticsConstants.INSTANCE.getCONTINUE_BUTTON().getName(), com.paypal.oslo.feature.bnplacquisition.analytics.BnplAcquisitionAnalyticsConstants.Flow.INSTANCE.fromSpecifier(this.getHighSpeedVideoSizes.getGetOutputMinFrameDuration()), this.getHighSpeedVideoSizes.getCamera2StreamConfigurationMap(), success.getUiModel().getRawTransactionAmount());
                    return;
                }
                return;
            }
            return;
        }
        com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.OfferSelected offerSelected = (com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.OfferSelected) event;
        com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState second2 = input.getStates().getSecond();
        com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Success success2 = second2 instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Success ? (com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiState.Success) second2 : null;
        if (success2 != null) {
            java.util.Iterator<T> it = success2.getUiModel().getOffers().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplacquisition.ui.offers.OfferItem) next).getId(), offerSelected.getOfferId())) {
                    obj = next;
                    break;
                }
            }
            com.paypal.oslo.feature.bnplacquisition.ui.offers.OfferItem offerItem = (com.paypal.oslo.feature.bnplacquisition.ui.offers.OfferItem) obj;
            if (offerItem == null || (analyticsComponentId = offerItem.getAnalyticsComponentId()) == null) {
                return;
            }
            this.Camera2StreamConfigurationMap.trackItemPressed(analyticsComponentId, com.paypal.oslo.feature.bnplacquisition.analytics.BnplAcquisitionAnalyticsConstants.Flow.INSTANCE.fromSpecifier(this.getHighSpeedVideoSizes.getGetOutputMinFrameDuration()), this.getHighSpeedVideoSizes.getCamera2StreamConfigurationMap(), success2.getUiModel().getRawTransactionAmount());
        }
    }
}
