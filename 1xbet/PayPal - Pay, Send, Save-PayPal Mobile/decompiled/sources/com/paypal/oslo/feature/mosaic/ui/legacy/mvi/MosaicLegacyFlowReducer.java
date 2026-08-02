package com.paypal.oslo.feature.mosaic.ui.legacy.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/legacy/mvi/MosaicLegacyFlowReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/mosaic/ui/legacy/mvi/MosaicLegacyFlowUiState;", "Lcom/paypal/oslo/feature/mosaic/ui/legacy/mvi/MosaicLegacyFlowUiEvent;", "Lcom/paypal/oslo/feature/mosaic/ui/legacy/mvi/MosaicLegacyFlowUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/mosaic/ui/legacy/mvi/MosaicLegacyFlowUiState;Lcom/paypal/oslo/feature/mosaic/ui/legacy/mvi/MosaicLegacyFlowUiEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MosaicLegacyFlowReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiState, com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiEvent, com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public MosaicLegacyFlowReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "MosaicLegacyFlowReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiState, com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiEffect>> reduce(com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiState state, com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiEvent event) {
        com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiState.AdroitWebFlow adroitWebFlow;
        java.lang.String qualifiedIntentId;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiState.Loading)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(state, event);
        }
        if (event instanceof com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiEvent.EligibilityLoaded) {
            com.paypal.oslo.feature.mosaic.domain.model.MosaicEligibility eligibility = ((com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiEvent.EligibilityLoaded) event).getEligibility();
            if (!eligibility.isSupportedOnMosaic() || (qualifiedIntentId = eligibility.getQualifiedIntentId()) == null || qualifiedIntentId.length() == 0) {
                adroitWebFlow = com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiState.AdroitWebFlow.INSTANCE;
            } else if (eligibility.isNativeSupported()) {
                adroitWebFlow = com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiState.NativeFlow.INSTANCE;
            } else if (eligibility.isWebSupported()) {
                adroitWebFlow = new com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiState.MosaicWebFlow(eligibility.getQualifiedIntentId());
            } else {
                adroitWebFlow = com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiState.AdroitWebFlow.INSTANCE;
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(adroitWebFlow, null, 2, null);
        }
        if (!(event instanceof com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiEvent.EligibilityFailed)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.mosaic.ui.legacy.mvi.MosaicLegacyFlowUiState.AdroitWebFlow.INSTANCE, null, 2, null);
    }
}
