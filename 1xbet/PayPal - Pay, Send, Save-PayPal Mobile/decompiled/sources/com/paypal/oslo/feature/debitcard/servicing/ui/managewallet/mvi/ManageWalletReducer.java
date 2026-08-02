package com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState;Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletEvent;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState$PushProvisioningWidgetSuccess;", "p0", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/LoadingType;", "p1", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState$PushProvisioningWidgetSuccess;Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/LoadingType;)Larrow/core/Either;", "", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState$PushProvisioningWidgetSuccess;Z)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ManageWalletReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ManageWalletReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "ManageWalletReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEffect>> reduce(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState state, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Initial) {
            return event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.LoadWalletData ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Loading(null, null, null, null, 15, null), null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent((com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Initial) state, event);
        }
        if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Loading)) {
            if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.WalletInstrumentsSuccess)) {
                if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.PushProvisioningWidgetSuccess)) {
                    if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.WalletInstrumentsError)) {
                        if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.PushProvisioningWidgetError)) {
                            if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.LockUnlockError)) {
                                if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.RemoveWalletError)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.RemoveWalletError removeWalletError = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.RemoveWalletError) state;
                                if ((event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.BackClicked) || (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.ErrorCloseClicked)) {
                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(removeWalletError, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEffect.NavigateBack.INSTANCE);
                                }
                                if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.ErrorRetryClicked) {
                                    java.lang.Integer retryCount = removeWalletError.getRetryCount();
                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Loading(java.lang.Integer.valueOf((retryCount != null ? retryCount.intValue() : 0) + 1), null, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.LoadingType.Remove.INSTANCE, null, 10, null), null, 2, null);
                                }
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(removeWalletError, event);
                            }
                            com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.LockUnlockError lockUnlockError = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.LockUnlockError) state;
                            if ((event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.BackClicked) || (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.ErrorCloseClicked)) {
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(lockUnlockError, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEffect.NavigateBack.INSTANCE);
                            }
                            if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.ErrorRetryClicked) {
                                java.lang.Integer retryCount2 = lockUnlockError.getRetryCount();
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Loading(java.lang.Integer.valueOf((retryCount2 != null ? retryCount2.intValue() : 0) + 1), null, lockUnlockError.isLockOperation() ? com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.LoadingType.Lock.INSTANCE : com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.LoadingType.Unlock.INSTANCE, null, 10, null), null, 2, null);
                            }
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(lockUnlockError, event);
                        }
                        com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.PushProvisioningWidgetError pushProvisioningWidgetError = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.PushProvisioningWidgetError) state;
                        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.LoadWalletData) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Loading(pushProvisioningWidgetError.getRetryCount(), null, null, null, 14, null), null, 2, null);
                        }
                        if ((event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.BackClicked) || (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.ErrorCloseClicked)) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(pushProvisioningWidgetError, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEffect.NavigateBack.INSTANCE);
                        }
                        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.ErrorRetryClicked) {
                            java.lang.Integer retryCount3 = pushProvisioningWidgetError.getRetryCount();
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Loading(java.lang.Integer.valueOf((retryCount3 != null ? retryCount3.intValue() : 0) + 1), null, null, null, 14, null), null, 2, null);
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(pushProvisioningWidgetError, event);
                    }
                    com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.WalletInstrumentsError walletInstrumentsError = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.WalletInstrumentsError) state;
                    if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.LoadWalletData) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Loading(walletInstrumentsError.getRetryCount(), null, null, null, 14, null), null, 2, null);
                    }
                    if ((event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.BackClicked) || (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.ErrorCloseClicked)) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(walletInstrumentsError, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEffect.NavigateBack.INSTANCE);
                    }
                    if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.ErrorRetryClicked) {
                        java.lang.Integer retryCount4 = walletInstrumentsError.getRetryCount();
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Loading(java.lang.Integer.valueOf((retryCount4 != null ? retryCount4.intValue() : 0) + 1), null, null, null, 14, null), null, 2, null);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(walletInstrumentsError, event);
                }
                com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.PushProvisioningWidgetSuccess pushProvisioningWidgetSuccess = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.PushProvisioningWidgetSuccess) state;
                if ((event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.LoadWalletData) || (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.RefreshWalletData)) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Loading(pushProvisioningWidgetSuccess.getRetryCount(), null, null, pushProvisioningWidgetSuccess.getProvisionedTokenIds(), 6, null), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.LockWalletToggled) {
                    return getHighSpeedVideoFpsRanges(pushProvisioningWidgetSuccess, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.LoadingType.Lock.INSTANCE);
                }
                if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.UnlockWalletToggled) {
                    return getHighSpeedVideoFpsRanges(pushProvisioningWidgetSuccess, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.LoadingType.Unlock.INSTANCE);
                }
                if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.RemoveWalletClicked) {
                    return getHighSpeedVideoFpsRanges(pushProvisioningWidgetSuccess, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.LoadingType.Remove.INSTANCE);
                }
                if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletLockedSuccessfully) {
                    return Camera2StreamConfigurationMap(pushProvisioningWidgetSuccess, true);
                }
                if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletUnlockedSuccessfully) {
                    return Camera2StreamConfigurationMap(pushProvisioningWidgetSuccess, false);
                }
                if (!(event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletRemovedSuccessfully)) {
                    if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.LockWalletFailed) {
                        com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.LockWalletFailed lockWalletFailed = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.LockWalletFailed) event;
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.LockUnlockError(lockWalletFailed.getErrorType(), lockWalletFailed.getCardId(), true, lockWalletFailed.getErrorTag(), pushProvisioningWidgetSuccess.getRetryCount()), null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.UnlockWalletFailed) {
                        com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.UnlockWalletFailed unlockWalletFailed = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.UnlockWalletFailed) event;
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.LockUnlockError(unlockWalletFailed.getErrorType(), unlockWalletFailed.getCardId(), false, unlockWalletFailed.getErrorTag(), pushProvisioningWidgetSuccess.getRetryCount()), null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.RemoveWalletFailed) {
                        com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.RemoveWalletFailed removeWalletFailed = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.RemoveWalletFailed) event;
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.RemoveWalletError(removeWalletFailed.getErrorType(), removeWalletFailed.getCardId(), removeWalletFailed.getErrorTag(), pushProvisioningWidgetSuccess.getRetryCount()), null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.ProvisionedTokensLoaded) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.PushProvisioningWidgetSuccess.copy$default(pushProvisioningWidgetSuccess, null, ((com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.ProvisionedTokensLoaded) event).getTokenIds(), null, null, 13, null), null, 2, null);
                    }
                    if ((event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.BackClicked) || (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.ErrorCloseClicked)) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(pushProvisioningWidgetSuccess, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEffect.NavigateBack.INSTANCE);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(pushProvisioningWidgetSuccess, event);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Loading(pushProvisioningWidgetSuccess.getRetryCount(), null, null, pushProvisioningWidgetSuccess.getProvisionedTokenIds(), 6, null), com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEffect.ShowWalletRemovedToast.INSTANCE);
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.WalletInstrumentsSuccess walletInstrumentsSuccess = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.WalletInstrumentsSuccess) state;
            if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.PushProvisioningWidgetReady) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.PushProvisioningWidgetSuccess(walletInstrumentsSuccess.getWalletInstruments(), walletInstrumentsSuccess.getProvisionedTokenIds(), walletInstrumentsSuccess.getRetryCount(), com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.WidgetStatus.Ready.INSTANCE), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.PushProvisioningWidgetFailed) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.PushProvisioningWidgetSuccess(walletInstrumentsSuccess.getWalletInstruments(), walletInstrumentsSuccess.getProvisionedTokenIds(), walletInstrumentsSuccess.getRetryCount(), com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.WidgetStatus.Failed.INSTANCE), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.ProvisionedTokensLoaded) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.WalletInstrumentsSuccess.copy$default(walletInstrumentsSuccess, null, ((com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.ProvisionedTokensLoaded) event).getTokenIds(), null, 5, null), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.BackClicked) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(walletInstrumentsSuccess, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEffect.NavigateBack.INSTANCE);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(walletInstrumentsSuccess, event);
        }
        com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Loading loading = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Loading) state;
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletDataLoaded) {
            com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.WidgetStatus widgetStatus = loading.getWidgetStatus();
            if (widgetStatus instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.WidgetStatus.Failed) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.PushProvisioningWidgetSuccess(((com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletDataLoaded) event).getWalletInstruments(), loading.getProvisionedTokenIds(), loading.getRetryCount(), com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.WidgetStatus.Failed.INSTANCE), null, 2, null);
            }
            if (widgetStatus instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.WidgetStatus.Ready) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.PushProvisioningWidgetSuccess(((com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletDataLoaded) event).getWalletInstruments(), loading.getProvisionedTokenIds(), loading.getRetryCount(), com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.WidgetStatus.Ready.INSTANCE), null, 2, null);
            }
            if (!(widgetStatus instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.WidgetStatus.Loading)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.WalletInstrumentsSuccess(((com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletDataLoaded) event).getWalletInstruments(), loading.getProvisionedTokenIds(), loading.getRetryCount()), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletDataLoadFailed) {
            com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletDataLoadFailed walletDataLoadFailed = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletDataLoadFailed) event;
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.WalletInstrumentsError(walletDataLoadFailed.getErrorType(), walletDataLoadFailed.getErrorTag(), loading.getRetryCount()), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.PushProvisioningWidgetReady) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Loading.copy$default(loading, null, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.WidgetStatus.Ready.INSTANCE, null, null, 13, null), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.PushProvisioningWidgetFailed) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Loading.copy$default(loading, null, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.WidgetStatus.Failed.INSTANCE, null, null, 13, null), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletLockedSuccessfully) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEffect.ShowWalletLockedToast.INSTANCE);
        }
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletUnlockedSuccessfully) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEffect.ShowWalletUnlockedToast.INSTANCE);
        }
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.WalletRemovedSuccessfully) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEffect.ShowWalletRemovedToast.INSTANCE);
        }
        if ((event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.LoadWalletData) || (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.RefreshWalletData)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(loading, null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.ProvisionedTokensLoaded) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Loading.copy$default(loading, null, null, null, ((com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.ProvisionedTokensLoaded) event).getTokenIds(), 7, null), null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
    }

    private static arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEffect>> getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.PushProvisioningWidgetSuccess p0, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.LoadingType p1) {
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Loading(p0.getRetryCount(), null, p1, p0.getProvisionedTokenIds(), 2, null), null, 2, null);
    }

    private static arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEffect>> Camera2StreamConfigurationMap(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.PushProvisioningWidgetSuccess p0, boolean p1) {
        com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEffect.ShowWalletUnlockedToast showWalletUnlockedToast;
        com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Loading loading = new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Loading(p0.getRetryCount(), null, null, p0.getProvisionedTokenIds(), 6, null);
        if (p1) {
            showWalletUnlockedToast = com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEffect.ShowWalletLockedToast.INSTANCE;
        } else {
            showWalletUnlockedToast = com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEffect.ShowWalletUnlockedToast.INSTANCE;
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, showWalletUnlockedToast);
    }
}
