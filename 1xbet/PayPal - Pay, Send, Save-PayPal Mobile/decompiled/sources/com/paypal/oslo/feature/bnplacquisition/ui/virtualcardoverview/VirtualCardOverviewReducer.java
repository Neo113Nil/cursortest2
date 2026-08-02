package com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000b0\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000b0\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewUiEffect;", "<init>", "()V", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewUiState;Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/VirtualCardOverviewEvent;)Larrow/core/Either;", "getHighSpeedVideoFpsRanges", "()Larrow/core/Either;", "", "getName", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class VirtualCardOverviewReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public VirtualCardOverviewReducer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect>> reduce(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState state, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent event) {
        arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect>> output;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        int i = 1;
        int i2 = 2;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        java.lang.Object[] objArr3 = 0;
        java.lang.Object[] objArr4 = 0;
        java.lang.Object[] objArr5 = 0;
        java.lang.Object[] objArr6 = 0;
        if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Loading)) {
            if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Success)) {
                if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Provisioning)) {
                    if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Error)) {
                        if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Decline)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Decline decline = (com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Decline) state;
                        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.DeclineClosePressed.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ClosePressed.INSTANCE)) {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(decline, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.CloseAcquisition.INSTANCE);
                        } else {
                            output = event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.RefreshScreen ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(decline, null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(decline, event);
                        }
                    } else {
                        com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Error error = (com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Error) state;
                        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ErrorRetryPressed.INSTANCE)) {
                            if (error.getLastFailedAction() == com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction.PREPARE_DIGITIZATION && error.getPreviousModel() != null) {
                                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Provisioning(error.getPreviousModel(), error.getLastFailedAction()), null, 2, null);
                            } else {
                                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Loading(error.getLastFailedAction()), null, 2, null);
                            }
                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.OpenWalletSettingsPressed.INSTANCE)) {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.OpenWalletSettings.INSTANCE);
                        } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ErrorBackPressed) {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Success(((com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ErrorBackPressed) event).getModel(), null, false, 6, null), null, 2, null);
                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ErrorClosePressed.INSTANCE)) {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.CloseAcquisition.INSTANCE);
                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ClosePressed.INSTANCE)) {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.ShowExitConfirmationModal.INSTANCE);
                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ConfirmExitPressed.INSTANCE)) {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.CloseAcquisition.INSTANCE);
                        } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.InvalidVirtualCardError) {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.CloseAcquisition.INSTANCE);
                        } else {
                            output = event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.RefreshScreen ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(error, null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                        }
                    }
                } else {
                    com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Provisioning provisioning = (com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Provisioning) state;
                    if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.PrepareDigitizationSuccess) {
                        output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(provisioning, new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.SendProvisioningMetaData(((com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.PrepareDigitizationSuccess) event).getIssuerTokenId(), provisioning.getUiModel()));
                    } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ProvisioningCompleted) {
                        output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Loading(objArr4 == true ? 1 : 0, i, objArr3 == true ? 1 : 0), new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.FetchProvisionedTokens(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.InStoreVCCDetailsMXLType.PROVISIONED_CARD_OVERVIEW));
                    } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.UpdateError) {
                        com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.UpdateError updateError = (com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.UpdateError) event;
                        output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Error(updateError.getErrorType(), updateError.getErrorContent(), updateError.getFailedAction(), provisioning.getUiModel()), null, 2, null);
                    } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ApplicationDeclined) {
                        output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Decline(((com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ApplicationDeclined) event).getDeclineContent()), null, 2, null);
                    } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ProvisioningFailed) {
                        output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(provisioning, null, 2, null);
                    } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ProvisioningCanceled) {
                        output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Loading(objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0), new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.FetchProvisionedTokens(null, 1, null));
                    } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.InvalidVirtualCardError) {
                        output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(provisioning, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.CloseAcquisition.INSTANCE);
                    } else {
                        output = event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.RefreshScreen ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(provisioning, null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(provisioning, event);
                    }
                }
            } else {
                com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Success success = (com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Success) state;
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ScreenLockCancelled.INSTANCE)) {
                    output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.CloseAcquisition.INSTANCE);
                } else if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.AddToWalletPressed.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.PayWithWalletPressed.INSTANCE) && !(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.WalletDataRetrieved) && !(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.NoActiveWalletError) && !(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ProvisioningCanceled) && !(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ProvisioningFailed)) {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ChangeAmountPressed.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.CancelPressed.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.DismissChangeAmountModal.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.DismissCancelModal.INSTANCE)) {
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ClosePressed.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ConfirmExitPressed.INSTANCE) && !(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.InvalidVirtualCardError)) {
                            if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.UpdateError) {
                                com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.UpdateError updateError2 = (com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.UpdateError) event;
                                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Error(updateError2.getErrorType(), updateError2.getErrorContent(), updateError2.getFailedAction(), success.getUiModel()), null, 2, null);
                            } else {
                                output = kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.RefreshScreen.INSTANCE) ? getHighSpeedVideoFpsRanges() : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
                            }
                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ClosePressed.INSTANCE)) {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.ShowExitConfirmationModal.INSTANCE);
                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ConfirmExitPressed.INSTANCE)) {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.CloseAcquisition.INSTANCE);
                        } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.InvalidVirtualCardError) {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.CloseAcquisition.INSTANCE);
                        } else {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
                        }
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ChangeAmountPressed.INSTANCE)) {
                        output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.ShowChangeAmountModal.INSTANCE);
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.CancelPressed.INSTANCE)) {
                        output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.ShowCancelModal.INSTANCE);
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.DismissChangeAmountModal.INSTANCE)) {
                        output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.DismissChangeAmountModal.INSTANCE);
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.DismissCancelModal.INSTANCE)) {
                        output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.DismissCancelModal.INSTANCE);
                    } else {
                        output = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
                    }
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.AddToWalletPressed.INSTANCE)) {
                    output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.AddToWallet.INSTANCE);
                } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.WalletDataRetrieved) {
                    output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Provisioning(success.getUiModel(), objArr6 == true ? 1 : 0, i2, objArr5 == true ? 1 : 0), null, 2, null);
                } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.NoActiveWalletError) {
                    output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.LaunchWalletSetup.INSTANCE);
                } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ProvisioningCanceled) {
                    output = getHighSpeedVideoFpsRanges();
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.PayWithWalletPressed.INSTANCE) || (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ProvisioningFailed)) {
                    output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success, null, 2, null);
                } else {
                    output = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
                }
            }
        } else {
            com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Loading loading = (com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Loading) state;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.CheckScreenLock.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ScreenLockCompleted.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ScreenLockCancelled.INSTANCE)) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.InitializeVirtualCardOverview.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.RefreshScreen.INSTANCE)) {
                    if ((event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.FetchProvisionedTokensSuccess) || (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.EvaluateEligibilityAndReplaceCardSuccess) || (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ProvisionedCardOverviewSuccess)) {
                        output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(loading, null, 2, null);
                    } else {
                        boolean z = event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.EvaluateEligibilityAndReplaceCardSuccessDomainModelLoaded;
                        if (!z && !(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ProvisionedCardOverviewSuccessDomainModelLoaded)) {
                            boolean z2 = event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.UpdateError;
                            if (!z2 && !(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ApplicationDeclined) && !(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.InvalidVirtualCardError)) {
                                output = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
                            } else if (z2) {
                                com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.UpdateError updateError3 = (com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.UpdateError) event;
                                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Error(updateError3.getErrorType(), updateError3.getErrorContent(), updateError3.getFailedAction(), null), null, 2, null);
                            } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ApplicationDeclined) {
                                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Decline(((com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ApplicationDeclined) event).getDeclineContent()), null, 2, null);
                            } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.InvalidVirtualCardError) {
                                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.CloseAcquisition.INSTANCE);
                            } else {
                                output = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
                            }
                        } else if (z) {
                            com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.EvaluateEligibilityAndReplaceCardSuccessDomainModelLoaded evaluateEligibilityAndReplaceCardSuccessDomainModelLoaded = (com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.EvaluateEligibilityAndReplaceCardSuccessDomainModelLoaded) event;
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Success(evaluateEligibilityAndReplaceCardSuccessDomainModelLoaded.getUiModel(), null, true, 2, null), evaluateEligibilityAndReplaceCardSuccessDomainModelLoaded.getShouldShowRelinkingToast() ? com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.ShowRelinkingSuccessToast.INSTANCE : null);
                        } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ProvisionedCardOverviewSuccessDomainModelLoaded) {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Success(((com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ProvisionedCardOverviewSuccessDomainModelLoaded) event).getUiModel(), null, true, 2, null), com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.ShowProvisionedSuccessToast.INSTANCE);
                        } else {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
                        }
                    }
                } else {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.InitializeVirtualCardOverview.INSTANCE) || (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.FetchProvisionedTokensSuccess) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.RefreshScreen.INSTANCE)) {
                        output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.FetchProvisionedTokens(null, 1, null));
                    }
                    output = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
                }
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.CheckScreenLock.INSTANCE)) {
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.NavigateToRequireScreenLock.INSTANCE);
            } else if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ScreenLockCompleted.INSTANCE)) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ScreenLockCancelled.INSTANCE)) {
                    output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.CloseAcquisition.INSTANCE);
                }
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
            } else {
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.FetchProvisionedTokens(null, 1, null));
            }
        }
        com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerUtilsKt.logBnplAcqReducerEvent(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, getName(), output.isLeft() ? com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerConstants.UNEXPECTED_EVENT : event.getName(), output.isLeft());
        return output;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect>> getHighSpeedVideoFpsRanges() {
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiState.Loading(null, 1, 0 == true ? 1 : 0), new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiEffect.FetchProvisionedTokens(null, 1, null));
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "VirtualCardOverviewReducer";
    }
}
