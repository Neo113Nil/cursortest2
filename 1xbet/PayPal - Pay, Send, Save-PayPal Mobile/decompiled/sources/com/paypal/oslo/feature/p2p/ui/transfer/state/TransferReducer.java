package com.paypal.oslo.feature.p2p.ui.transfer.state;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010JG\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferUiState;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferUiState;Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferEvent;)Larrow/core/Either;", "p0", "p1", "p2", "p3", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/p2p/ui/transfer/state/TransferUiState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TransferReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState, com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent, com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public TransferReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "TransferReducer";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState, com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiEffect>> reduce(com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState state, com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent event) {
        com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Success copy;
        com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Success copy2;
        com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Success copy3;
        java.lang.String str;
        com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Success copy4;
        com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Success copy5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        ?? r4 = 0;
        r4 = 0;
        r4 = 0;
        r4 = 0;
        if (!(state instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Initial)) {
            int i = 1;
            if (!(state instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Loading)) {
                if (!(state instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Success)) {
                    if (!(state instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Error)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Error error = (com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Error) state;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.InitializeTransferConfigurationAndStartTransferAttempt.INSTANCE)) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Loading(error.getCryptoPickerEnabled(), null, 2, null), null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.AmountChanged) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Initial(null, error.getCryptoPickerEnabled(), null, null, 13, null), null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.AmountFormatted) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Initial(((com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.AmountFormatted) event).getFormattedAmount(), error.getCryptoPickerEnabled(), null, null, 12, null), null, 2, null);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                }
                com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Success success = (com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Success) state;
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.InitializeTransferConfigurationAndStartTransferAttempt.INSTANCE)) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Loading(success.getCryptoPickerEnabled(), success.getAmount()), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.UpdateAmountAndIntent) {
                    com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.UpdateAmountAndIntent updateAmountAndIntent = (com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.UpdateAmountAndIntent) event;
                    copy4 = success.copy((r38 & 1) != 0 ? success.transferAttemptId : null, (r38 & 2) != 0 ? success.primaryCurrencyCode : null, (r38 & 4) != 0 ? success.cryptoCurrencyEnabled : false, (r38 & 8) != 0 ? success.supportedIntents : null, (r38 & 16) != 0 ? success.amount : null, (r38 & 32) != 0 ? success.recipientName : null, (r38 & 64) != 0 ? success.recipientAvatarUrl : null, (r38 & 128) != 0 ? success.sendCurrencyCode : null, (r38 & 256) != 0 ? success.receiveCurrencyCode : null, (r38 & 512) != 0 ? success.receiveAmount : null, (r38 & 1024) != 0 ? success.exchangeRate : null, (r38 & 2048) != 0 ? success.isLoadingReceiveAmount : false, (r38 & 4096) != 0 ? success.isUpdatingIntent : true, (r38 & 8192) != 0 ? success.cryptoPickerEnabled : false, (r38 & 16384) != 0 ? success.pendingAmount : updateAmountAndIntent.getAmount(), (r38 & 32768) != 0 ? success.pendingIntent : updateAmountAndIntent.getIntent(), (r38 & 65536) != 0 ? success.sendMoney : null, (r38 & 131072) != 0 ? success.receiveMoney : null, (r38 & 262144) != 0 ? success.shouldPreserveStateOnResume : false, (r38 & 524288) != 0 ? success.amountError : null);
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy4, null, 2, null);
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.UpdateAmountAndIntentCompleted.INSTANCE)) {
                    java.lang.String pendingAmount = success.getPendingAmount();
                    java.lang.String pendingIntent = success.getPendingIntent();
                    copy3 = success.copy((r38 & 1) != 0 ? success.transferAttemptId : null, (r38 & 2) != 0 ? success.primaryCurrencyCode : null, (r38 & 4) != 0 ? success.cryptoCurrencyEnabled : false, (r38 & 8) != 0 ? success.supportedIntents : null, (r38 & 16) != 0 ? success.amount : null, (r38 & 32) != 0 ? success.recipientName : null, (r38 & 64) != 0 ? success.recipientAvatarUrl : null, (r38 & 128) != 0 ? success.sendCurrencyCode : null, (r38 & 256) != 0 ? success.receiveCurrencyCode : null, (r38 & 512) != 0 ? success.receiveAmount : null, (r38 & 1024) != 0 ? success.exchangeRate : null, (r38 & 2048) != 0 ? success.isLoadingReceiveAmount : false, (r38 & 4096) != 0 ? success.isUpdatingIntent : false, (r38 & 8192) != 0 ? success.cryptoPickerEnabled : false, (r38 & 16384) != 0 ? success.pendingAmount : null, (r38 & 32768) != 0 ? success.pendingIntent : null, (r38 & 65536) != 0 ? success.sendMoney : null, (r38 & 131072) != 0 ? success.receiveMoney : null, (r38 & 262144) != 0 ? success.shouldPreserveStateOnResume : false, (r38 & 524288) != 0 ? success.amountError : null);
                    com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Success success2 = copy3;
                    java.lang.String str2 = pendingAmount;
                    if (str2 != null && str2.length() != 0 && (str = pendingIntent) != null && str.length() != 0) {
                        r4 = new com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiEffect.NavigateToReview(pendingAmount, pendingIntent);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success2, (com.paypal.oslo.core.mvi.UiEffect) r4);
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.UpdateAmountAndIntentFailed.INSTANCE)) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Error(null, success.getCryptoPickerEnabled(), 1, null), new com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiEffect.ShowError(r4, i, r4));
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.InvalidAmountSubmitted.INSTANCE)) {
                    if (event instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.AmountChanged) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success, null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.AmountFormatted) {
                        com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.AmountFormatted amountFormatted = (com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.AmountFormatted) event;
                        copy = success.copy((r38 & 1) != 0 ? success.transferAttemptId : null, (r38 & 2) != 0 ? success.primaryCurrencyCode : null, (r38 & 4) != 0 ? success.cryptoCurrencyEnabled : false, (r38 & 8) != 0 ? success.supportedIntents : null, (r38 & 16) != 0 ? success.amount : amountFormatted.getFormattedAmount(), (r38 & 32) != 0 ? success.recipientName : null, (r38 & 64) != 0 ? success.recipientAvatarUrl : null, (r38 & 128) != 0 ? success.sendCurrencyCode : null, (r38 & 256) != 0 ? success.receiveCurrencyCode : null, (r38 & 512) != 0 ? success.receiveAmount : null, (r38 & 1024) != 0 ? success.exchangeRate : null, (r38 & 2048) != 0 ? success.isLoadingReceiveAmount : false, (r38 & 4096) != 0 ? success.isUpdatingIntent : false, (r38 & 8192) != 0 ? success.cryptoPickerEnabled : false, (r38 & 16384) != 0 ? success.pendingAmount : null, (r38 & 32768) != 0 ? success.pendingIntent : null, (r38 & 65536) != 0 ? success.sendMoney : amountFormatted.getMoney(), (r38 & 131072) != 0 ? success.receiveMoney : null, (r38 & 262144) != 0 ? success.shouldPreserveStateOnResume : false, (r38 & 524288) != 0 ? success.amountError : null);
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy, null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.ResetTransferState) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Initial(null, success.getCryptoPickerEnabled(), null, null, 13, null), null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.NavigateToCurrencyPicker) {
                        return Camera2StreamConfigurationMap(success, success.getTransferAttemptId(), success.getAmount(), success.getPrimaryCurrencyCode());
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
                }
                copy2 = success.copy((r38 & 1) != 0 ? success.transferAttemptId : null, (r38 & 2) != 0 ? success.primaryCurrencyCode : null, (r38 & 4) != 0 ? success.cryptoCurrencyEnabled : false, (r38 & 8) != 0 ? success.supportedIntents : null, (r38 & 16) != 0 ? success.amount : null, (r38 & 32) != 0 ? success.recipientName : null, (r38 & 64) != 0 ? success.recipientAvatarUrl : null, (r38 & 128) != 0 ? success.sendCurrencyCode : null, (r38 & 256) != 0 ? success.receiveCurrencyCode : null, (r38 & 512) != 0 ? success.receiveAmount : null, (r38 & 1024) != 0 ? success.exchangeRate : null, (r38 & 2048) != 0 ? success.isLoadingReceiveAmount : false, (r38 & 4096) != 0 ? success.isUpdatingIntent : false, (r38 & 8192) != 0 ? success.cryptoPickerEnabled : false, (r38 & 16384) != 0 ? success.pendingAmount : null, (r38 & 32768) != 0 ? success.pendingIntent : null, (r38 & 65536) != 0 ? success.sendMoney : null, (r38 & 131072) != 0 ? success.receiveMoney : null, (r38 & 262144) != 0 ? success.shouldPreserveStateOnResume : false, (r38 & 524288) != 0 ? success.amountError : "Enter an amount more than 0");
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy2, null, 2, null);
            }
            com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Loading loading = (com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Loading) state;
            if (event instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.TransferAttemptStarted) {
                com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.TransferAttemptStarted transferAttemptStarted = (com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.TransferAttemptStarted) event;
                com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Success successState = transferAttemptStarted.getSuccessState();
                java.lang.String amount = transferAttemptStarted.getSuccessState().getAmount();
                if (amount.length() == 0) {
                    amount = loading.getAmount();
                }
                copy5 = successState.copy((r38 & 1) != 0 ? successState.transferAttemptId : null, (r38 & 2) != 0 ? successState.primaryCurrencyCode : null, (r38 & 4) != 0 ? successState.cryptoCurrencyEnabled : false, (r38 & 8) != 0 ? successState.supportedIntents : null, (r38 & 16) != 0 ? successState.amount : amount, (r38 & 32) != 0 ? successState.recipientName : null, (r38 & 64) != 0 ? successState.recipientAvatarUrl : null, (r38 & 128) != 0 ? successState.sendCurrencyCode : null, (r38 & 256) != 0 ? successState.receiveCurrencyCode : null, (r38 & 512) != 0 ? successState.receiveAmount : null, (r38 & 1024) != 0 ? successState.exchangeRate : null, (r38 & 2048) != 0 ? successState.isLoadingReceiveAmount : false, (r38 & 4096) != 0 ? successState.isUpdatingIntent : false, (r38 & 8192) != 0 ? successState.cryptoPickerEnabled : false, (r38 & 16384) != 0 ? successState.pendingAmount : null, (r38 & 32768) != 0 ? successState.pendingIntent : null, (r38 & 65536) != 0 ? successState.sendMoney : null, (r38 & 131072) != 0 ? successState.receiveMoney : null, (r38 & 262144) != 0 ? successState.shouldPreserveStateOnResume : false, (r38 & 524288) != 0 ? successState.amountError : null);
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy5, null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.TransferAttemptFailed) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Error(null, loading.getCryptoPickerEnabled(), 1, null), new com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiEffect.ShowError(r4, i, r4));
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
        }
        com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Initial initial = (com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Initial) state;
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.InitializeTransferConfigurationAndStartTransferAttempt.INSTANCE)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Loading(initial.getCryptoPickerEnabled(), initial.getAmount()), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.AmountChanged) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(initial, null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.AmountFormatted) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Initial.copy$default(initial, ((com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.AmountFormatted) event).getFormattedAmount(), false, null, null, 6, null), null, 2, null);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.InvalidAmountSubmitted.INSTANCE)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Initial.copy$default(initial, null, false, null, "Enter an amount more than 0", 7, null), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.SetTransferAttemptId) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Initial.copy$default(initial, null, false, ((com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.SetTransferAttemptId) event).getTransferAttemptId(), null, 11, null), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferEvent.NavigateToCurrencyPicker) {
            return Camera2StreamConfigurationMap(initial, initial.getTransferAttemptId(), initial.getAmount(), "USD");
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
    }

    private static arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState, com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiEffect>> Camera2StreamConfigurationMap(com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {
        com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Success copy;
        com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Success success = p0;
        com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination currencyPickerDestination = new com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination(p1, p2, p3, (java.util.List) null, false, (java.lang.String) null, false, 120, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        if (success instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Success) {
            copy = r12.copy((r38 & 1) != 0 ? r12.transferAttemptId : null, (r38 & 2) != 0 ? r12.primaryCurrencyCode : null, (r38 & 4) != 0 ? r12.cryptoCurrencyEnabled : false, (r38 & 8) != 0 ? r12.supportedIntents : null, (r38 & 16) != 0 ? r12.amount : null, (r38 & 32) != 0 ? r12.recipientName : null, (r38 & 64) != 0 ? r12.recipientAvatarUrl : null, (r38 & 128) != 0 ? r12.sendCurrencyCode : null, (r38 & 256) != 0 ? r12.receiveCurrencyCode : null, (r38 & 512) != 0 ? r12.receiveAmount : null, (r38 & 1024) != 0 ? r12.exchangeRate : null, (r38 & 2048) != 0 ? r12.isLoadingReceiveAmount : false, (r38 & 4096) != 0 ? r12.isUpdatingIntent : false, (r38 & 8192) != 0 ? r12.cryptoPickerEnabled : false, (r38 & 16384) != 0 ? r12.pendingAmount : null, (r38 & 32768) != 0 ? r12.pendingIntent : null, (r38 & 65536) != 0 ? r12.sendMoney : null, (r38 & 131072) != 0 ? r12.receiveMoney : null, (r38 & 262144) != 0 ? r12.shouldPreserveStateOnResume : true, (r38 & 524288) != 0 ? ((com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiState.Success) success).amountError : null);
            success = copy;
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiEffect.NavigateToCurrencyPicker(currencyPickerDestination));
    }
}
