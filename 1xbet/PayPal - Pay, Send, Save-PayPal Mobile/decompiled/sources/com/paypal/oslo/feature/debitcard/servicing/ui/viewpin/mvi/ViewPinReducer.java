package com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0011B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinState;Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent;)Larrow/core/Either;", "InputStateHandler"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ViewPinReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState, com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent, com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ViewPinReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "ViewPinReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState, com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEffect>> reduce(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState state, com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Input)) {
            if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Processing)) {
                if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.DisplayPin)) {
                    if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Error)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Error error = (com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Error) state;
                    if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.RetryClicked) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Processing(error.getCvv(), error.getConfirmCvv(), error.getRetryCount() + 1), null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.BackClicked) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEffect.NavigateBack.INSTANCE);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                }
                com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.DisplayPin displayPin = (com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.DisplayPin) state;
                if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CountdownTimer) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.DisplayPin.copy$default(displayPin, null, ((com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CountdownTimer) event).getRemainingSeconds(), 1, null), null, 2, null);
                }
                if ((event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.BackClicked) || (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CountdownTimerExpired) || (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.DoneClicked)) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(displayPin, com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEffect.NavigateBack.INSTANCE);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(displayPin, event);
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Processing processing = (com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Processing) state;
            if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.VerificationSucceeded) {
                com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.VerificationSucceeded verificationSucceeded = (com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.VerificationSucceeded) event;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.DisplayPin(verificationSucceeded.getResult(), verificationSucceeded.getResult().getExpiresInSec()), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.VerificationFailed) {
                com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.VerificationFailed verificationFailed = (com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.VerificationFailed) event;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Error(verificationFailed.getErrorMessage(), verificationFailed.getErrorCode(), processing.getCvv(), processing.getConfirmCvv(), verificationFailed.getErrorType(), processing.getRetryCount()), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(processing, event);
        }
        com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Input input = (com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Input) state;
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CvvChanged) {
            com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinReducer.InputStateHandler inputStateHandler = com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinReducer.InputStateHandler.INSTANCE;
            return com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinReducer.InputStateHandler.Camera2StreamConfigurationMap(input, (com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CvvChanged) event);
        }
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.ConfirmCvvChanged) {
            com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinReducer.InputStateHandler inputStateHandler2 = com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinReducer.InputStateHandler.INSTANCE;
            return com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinReducer.InputStateHandler.getHighSpeedVideoSizes(input, (com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.ConfirmCvvChanged) event);
        }
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CvvValidated) {
            com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinReducer.InputStateHandler inputStateHandler3 = com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinReducer.InputStateHandler.INSTANCE;
            return com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinReducer.InputStateHandler.getHighSpeedVideoSizes(input, (com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CvvValidated) event);
        }
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.ConfirmCvvValidated) {
            com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinReducer.InputStateHandler inputStateHandler4 = com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinReducer.InputStateHandler.INSTANCE;
            return com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinReducer.InputStateHandler.getHighSpeedVideoFpsRangesFor(input, (com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.ConfirmCvvValidated) event);
        }
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.SubmitClicked) {
            com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinReducer.InputStateHandler inputStateHandler5 = com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinReducer.InputStateHandler.INSTANCE;
            return com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinReducer.InputStateHandler.getHighResolutionOutputSizeshNQ4ISI(input);
        }
        if (!(event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.BackClicked)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(input, event);
        }
        com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinReducer.InputStateHandler inputStateHandler6 = com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinReducer.InputStateHandler.INSTANCE;
        return com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinReducer.InputStateHandler.getHighSpeedVideoFpsRangesFor(input);
    }

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J5\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0013J5\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinReducer$InputStateHandler;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinState$Input;", "p0", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent$CvvChanged;", "p1", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEffect;", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinState$Input;Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent$CvvChanged;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent$ConfirmCvvChanged;", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinState$Input;Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent$ConfirmCvvChanged;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent$CvvValidated;", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinState$Input;Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent$CvvValidated;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent$ConfirmCvvValidated;", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinState$Input;Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinEvent$ConfirmCvvValidated;)Larrow/core/Either;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/viewpin/mvi/ViewPinState$Input;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class InputStateHandler {
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinReducer.InputStateHandler INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinReducer.InputStateHandler();

        private InputStateHandler() {
        }

        public static arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState, com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEffect>> Camera2StreamConfigurationMap(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Input p0, com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CvvChanged p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Input.copy$default(p0, p1.getCvv(), null, null, null, 0, 26, null), null, 2, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState, com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEffect>> getHighSpeedVideoSizes(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Input p0, com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.ConfirmCvvChanged p1) {
            boolean z;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            java.lang.Integer cvvErrorResId = p0.getCvvErrorResId();
            int i = com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_view_pin_cvv_verification_mismatch_error;
            if (cvvErrorResId == null || cvvErrorResId.intValue() != i) {
                java.lang.Integer cvvErrorResId2 = p0.getCvvErrorResId();
                int i2 = com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_view_pin_cvv_verification_empty_cvv_error;
                if (cvvErrorResId2 == null || cvvErrorResId2.intValue() != i2) {
                    z = false;
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Input.copy$default(p0, null, p1.getConfirmCvv(), !z ? null : p0.getCvvErrorResId(), null, 0, 17, null), null, 2, null);
                }
            }
            z = true;
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Input.copy$default(p0, null, p1.getConfirmCvv(), !z ? null : p0.getCvvErrorResId(), null, 0, 17, null), null, 2, null);
        }

        public static arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState, com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEffect>> getHighSpeedVideoSizes(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Input p0, com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.CvvValidated p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Input copy$default = com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Input.copy$default(p0, null, null, p1.getErrorMessageResId(), null, 0, 27, null);
            if (p1.isValid() && p0.getCvv().length() == 3) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(copy$default, com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEffect.FocusConfirmCvvField.INSTANCE);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(copy$default, null, 2, null);
        }

        public static arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState, com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEffect>> getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Input p0, com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent.ConfirmCvvValidated p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Input.copy$default(p0, null, null, null, p1.getErrorMessageResId(), 0, 23, null), null, 2, null);
        }

        public static arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState, com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEffect>> getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Input p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            boolean z = p0.getCvv().length() == 3 && p0.getCvvErrorResId() == null;
            boolean z2 = p0.getConfirmCvv().length() == 3 && kotlin.jvm.internal.Intrinsics.areEqual(p0.getConfirmCvv(), p0.getCvv()) && p0.getConfirmCvvErrorResId() == null;
            if (z && z2) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Processing(p0.getCvv(), p0.getConfirmCvv(), 0), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(p0, null, 2, null);
        }

        public static arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState, com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEffect>> getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Input p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(p0, com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEffect.NavigateBack.INSTANCE);
        }
    }
}
