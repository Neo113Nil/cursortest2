package com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardEvent;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardState;Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ShowDebitCardReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState, com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent, com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ShowDebitCardReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "ShowDebitCardReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState, com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEffect>> reduce(com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState state, com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState.Loading)) {
                if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState.Success)) {
                    if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState.Error)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState.Error error = (com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState.Error) state;
                    if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.LoadShowCardDetails) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState.Loading(0, 1, null), null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.ErrorStateCtaClicked) {
                        int i = com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardReducer.WhenMappings.$EnumSwitchMapping$0[error.getErrorType().ordinal()];
                        if (i == 1 || i == 2) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState.Loading(error.getRetryCount() + 1), com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEffect.RetryLoadCardDetails.INSTANCE);
                        }
                        if (i == 3 || i == 4) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEffect.CloseBottomSheet.INSTANCE);
                        }
                        if (i != 5) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEffect.OpenSupportPage.INSTANCE);
                    }
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.debitcard.LoggerKt.log;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected event ");
                    sb.append(event);
                    sb.append(" in state ");
                    sb.append(error);
                    com.paypal.android.logger.Logger.d$default(logger, sb.toString(), null, null, 6, null);
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                }
                com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState.Success success = (com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState.Success) state;
                if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.LoadShowCardDetails) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState.Loading(0, 1, null), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.CopyButtonClicked) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEffect.ShowCopiedCardNumberConfirmationToast.INSTANCE);
                }
                com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.debitcard.LoggerKt.log;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unexpected event ");
                sb2.append(event);
                sb2.append(" in state ");
                sb2.append(success);
                com.paypal.android.logger.Logger.d$default(logger2, sb2.toString(), null, null, 6, null);
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState.Loading loading = (com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState.Loading) state;
            if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.ShowCardDetailsLoaded) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState.Success(((com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.ShowCardDetailsLoaded) event).getCardDetails()), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.ShowCardDetailsLoadFailed) {
                com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.ShowCardDetailsLoadFailed showCardDetailsLoadFailed = (com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.ShowCardDetailsLoadFailed) event;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState.Error(showCardDetailsLoadFailed.getErrorCode(), showCardDetailsLoadFailed.getErrorType(), showCardDetailsLoadFailed.getRetryCount()), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.LoadShowCardDetails) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState.Loading(loading.getRetryCount()), null, 2, null);
            }
            com.paypal.android.logger.Logger logger3 = com.paypal.oslo.feature.debitcard.LoggerKt.log;
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Unexpected event ");
            sb3.append(event);
            sb3.append(" in state ");
            sb3.append(loading);
            com.paypal.android.logger.Logger.d$default(logger3, sb3.toString(), null, null, 6, null);
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
        }
        com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState.Initial initial = (com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState.Initial) state;
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.LoadShowCardDetails) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState.Loading(0, 1, null), null, 2, null);
        }
        com.paypal.android.logger.Logger logger4 = com.paypal.oslo.feature.debitcard.LoggerKt.log;
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Unexpected event ");
        sb4.append(event);
        sb4.append(" in state ");
        sb4.append(initial);
        com.paypal.android.logger.Logger.d$default(logger4, sb4.toString(), null, null, 6, null);
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.values().length];
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.NO_NETWORK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.RECOVERABLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.FATAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.INELIGIBLE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.CONTACT_CUSTOMER_SERVICE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
