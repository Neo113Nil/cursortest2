package com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupState;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupState;Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/setup/mvi/PushProvisioningSetupEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PushProvisioningSetupReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState, com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent, com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public PushProvisioningSetupReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "DebitPushProvisionSetupReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState, com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEffect>> reduce(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState state, com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState.Loading)) {
                if (!(state instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState.Error)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState.Error error = (com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState.Error) state;
                if (event instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.InitiatePushProvisioning) {
                    com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument = ((com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.InitiatePushProvisioning) event).getDebitInstrument();
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState.Loading(com.paypal.oslo.feature.debitcard.shared.util.DebitInstrumentCommonDataExtensionsKt.isPinUnset(debitInstrument), debitInstrument.getId(), 0), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.RetryPushProvisioning) {
                    com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument2 = ((com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.RetryPushProvisioning) event).getDebitInstrument();
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState.Loading(com.paypal.oslo.feature.debitcard.shared.util.DebitInstrumentCommonDataExtensionsKt.isPinUnset(debitInstrument2), debitInstrument2.getId(), error.getRetryCount() + 1), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.CloseButtonClicked) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEffect.NavigateBack.INSTANCE);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
            }
            com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState.Loading loading = (com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState.Loading) state;
            if ((event instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.InitiatePushProvisioning) || (event instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.InitiatedPushProvisioning)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(loading, null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.ProvisioningSuccess) {
                if (loading.getShouldLaunchPin()) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEffect.NavigateToDebitPinScreen(loading.getInstrumentId()));
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEffect.NavigateBackWithSuccessResult(false, 1, null));
            }
            if ((event instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.LaunchGoogleSetupWallet) || (event instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.ProvisioningCancelled)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEffect.NavigateBack.INSTANCE);
            }
            if (event instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.ProvisioningError) {
                com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.ProvisioningError provisioningError = (com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.ProvisioningError) event;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState.Error(provisioningError.getErrorType(), provisioningError.getErrorCode(), loading.getRetryCount()), null, 2, null);
            }
            if ((event instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.PinSetUpCompleted) || (event instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.PinSetUpFailed)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEffect.NavigateBackWithSuccessResult(kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.PinSetUpCompleted.INSTANCE)));
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
        }
        com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState.Initial initial = (com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState.Initial) state;
        if (event instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.InitiateGoogleWalletStatusCheck) {
            com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.InitiateGoogleWalletStatusCheck initiateGoogleWalletStatusCheck = (com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupEvent.InitiateGoogleWalletStatusCheck) event;
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState.Loading(com.paypal.oslo.feature.debitcard.shared.util.DebitInstrumentCommonDataExtensionsKt.isPinUnset(initiateGoogleWalletStatusCheck.getDebitInstrument()), initiateGoogleWalletStatusCheck.getDebitInstrument().getId(), 0, 4, null), null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
    }
}
