package com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00112\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002\u0011\u0012B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinState;Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent;)Larrow/core/Either;", "Companion", "InputStateHandler"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitPinReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState, com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent, com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public DebitPinReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "DebitPinReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState, com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect>> reduce(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState state, com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Input)) {
            if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Processing)) {
                if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Success)) {
                    if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Error)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Error error = (com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Error) state;
                    if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.RetryClicked) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Processing(error.getPin(), error.getConfirmPin(), error.getRetryCount() + 1), null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.BackClicked) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect.NavigateBack.INSTANCE);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                }
                com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Success success = (com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Success) state;
                if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.BackClicked) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect.NavigateBackWithSuccess.INSTANCE);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Processing processing = (com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Processing) state;
            if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinCreationSucceeded) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Success(((com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinCreationSucceeded) event).getPin()), com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect.NavigateBackWithSuccess.INSTANCE);
            }
            if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinCreationFailed) {
                com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinCreationFailed pinCreationFailed = (com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinCreationFailed) event;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Error(pinCreationFailed.getErrorMessage(), pinCreationFailed.getErrorCode(), processing.getPin(), processing.getConfirmPin(), pinCreationFailed.getErrorType(), processing.getRetryCount()), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(processing, event);
        }
        com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Input input = (com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Input) state;
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinChanged) {
            com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinReducer.InputStateHandler inputStateHandler = com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinReducer.InputStateHandler.INSTANCE;
            return com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinReducer.InputStateHandler.Camera2StreamConfigurationMap(input, (com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinChanged) event);
        }
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.ConfirmPinChanged) {
            com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinReducer.InputStateHandler inputStateHandler2 = com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinReducer.InputStateHandler.INSTANCE;
            return com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinReducer.InputStateHandler.getHighSpeedVideoSizes(input, (com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.ConfirmPinChanged) event);
        }
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinValidated) {
            com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinReducer.InputStateHandler inputStateHandler3 = com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinReducer.InputStateHandler.INSTANCE;
            return com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinReducer.InputStateHandler.getHighSpeedVideoFpsRanges(input, (com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinValidated) event);
        }
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.ConfirmPinValidated) {
            com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinReducer.InputStateHandler inputStateHandler4 = com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinReducer.InputStateHandler.INSTANCE;
            return com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinReducer.InputStateHandler.getHighSpeedVideoFpsRanges(input, (com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.ConfirmPinValidated) event);
        }
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.SubmitClicked) {
            com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinReducer.InputStateHandler inputStateHandler5 = com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinReducer.InputStateHandler.INSTANCE;
            return com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinReducer.InputStateHandler.getHighSpeedVideoFpsRanges(input);
        }
        if (!(event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.BackClicked)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(input, event);
        }
        com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinReducer.InputStateHandler inputStateHandler6 = com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinReducer.InputStateHandler.INSTANCE;
        return com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinReducer.InputStateHandler.getHighSpeedVideoSizes(input);
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J5\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0015¢\u0006\u0004\b\u0013\u0010\u0016J-\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0017J-\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinReducer$InputStateHandler;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinState$Input;", "p0", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent$PinChanged;", "p1", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEffect;", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinState$Input;Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent$PinChanged;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent$ConfirmPinChanged;", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinState$Input;Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent$ConfirmPinChanged;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent$PinValidated;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinState$Input;Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent$PinValidated;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent$ConfirmPinValidated;", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinState$Input;Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinEvent$ConfirmPinValidated;)Larrow/core/Either;", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/debitpin/mvi/DebitPinState$Input;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class InputStateHandler {
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinReducer.InputStateHandler INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinReducer.InputStateHandler();

        private InputStateHandler() {
        }

        public static arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState, com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect>> Camera2StreamConfigurationMap(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Input p0, com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinChanged p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Input.copy$default(p0, p1.getPin(), null, null, null, 0, 26, null), null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState, com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect>> getHighSpeedVideoSizes(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Input p0, com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.ConfirmPinChanged p1) {
            boolean z;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            java.lang.Integer pinErrorResId = p0.getPinErrorResId();
            int i = com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_pin_error_mismatch;
            if (pinErrorResId == null || pinErrorResId.intValue() != i) {
                java.lang.Integer pinErrorResId2 = p0.getPinErrorResId();
                int i2 = com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_pin_error_empty_pin_field;
                if (pinErrorResId2 == null || pinErrorResId2.intValue() != i2) {
                    z = false;
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Input.copy$default(p0, null, p1.getConfirmPin(), !z ? null : p0.getPinErrorResId(), null, 0, 17, null), null, 2, null);
                }
            }
            z = true;
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Input.copy$default(p0, null, p1.getConfirmPin(), !z ? null : p0.getPinErrorResId(), null, 0, 17, null), null, 2, null);
        }

        public static arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState, com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect>> getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Input p0, com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.PinValidated p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Input copy$default = com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Input.copy$default(p0, null, null, p1.getErrorMessageResId(), null, 0, 27, null);
            if (p1.isValid() && p0.getPin().length() == 4) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(copy$default, com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect.FocusConfirmPinField.INSTANCE);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy$default, null, 2, null);
        }

        public static arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState, com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect>> getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Input p0, com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent.ConfirmPinValidated p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Input.copy$default(p0, null, null, null, p1.getErrorMessageResId(), 0, 23, null), null, 2, null);
        }

        public static arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState, com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect>> getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Input p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            boolean z = p0.getPin().length() == 4 && p0.getPinErrorResId() == null;
            boolean z2 = p0.getConfirmPin().length() == 4 && kotlin.jvm.internal.Intrinsics.areEqual(p0.getConfirmPin(), p0.getPin()) && p0.getConfirmPinErrorResId() == null;
            if (z && z2) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Processing(p0.getPin(), p0.getConfirmPin(), 0), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p0, null, 2, null);
        }

        public static arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState, com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect>> getHighSpeedVideoSizes(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Input p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect.NavigateBack.INSTANCE);
        }
    }
}
