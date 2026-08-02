package com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetState;Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardWidgetReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState, com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent, com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public DebitCardWidgetReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "DebitCardWidgetReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState, com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect>> reduce(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState state, com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent event) {
        java.lang.String formatToMonthDayYear;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Idle) {
            com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Idle idle = (com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Idle) state;
            return event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.Initialize ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(idle, null, 2, null) : event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.Loading ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Loading.INSTANCE, null, 2, null) : event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.Hide ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Hidden.INSTANCE, null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(idle, event);
        }
        if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Loading)) {
            if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Success)) {
                if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.EmptyState)) {
                    if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Error)) {
                        if (!(state instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Hidden)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Hidden hidden = (com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Hidden) state;
                        return event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.Initialize ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(hidden, null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(hidden, event);
                    }
                    com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Error error = (com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Error) state;
                    if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.Initialize) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(error, null, 2, null);
                    }
                    if ((event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.RetryButtonClicked) || (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.RefreshData)) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Loading.INSTANCE, null, 2, null);
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                }
                com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.EmptyState emptyState = (com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.EmptyState) state;
                if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.Initialize) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(emptyState, null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.RefreshData) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Loading.INSTANCE, null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.EmptyStateApplyButtonClicked) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(emptyState, new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToAcquisitionFlow(emptyState.getUiModel().getDestinationKey()));
                }
                if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.WidgetClicked) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(emptyState.getUiModel().getProductName().name(), "BUSINESS_DEBIT_CARD")) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(emptyState, new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToBDMCAcquisitionFlow(emptyState.getUiModel().getProductName()));
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(emptyState, event);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(emptyState, event);
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Success success = (com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Success) state;
            if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.Initialize) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success, null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.WidgetClicked) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToCardManagement(success.getProductName()));
            }
            if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.ActionButtonClicked) {
                com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Success success2 = success;
                java.lang.String debitInstrumentId = success.getDebitInstrumentId();
                com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName = success.getProductName();
                java.lang.String largeCardArtUrl = success.getLargeCardArtUrl();
                java.lang.String lastFourDigits = success.getLastFourDigits();
                boolean z = success.getPinStatus() == com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinStatus.SET;
                java.lang.String displayAddress = success.getDisplayAddress();
                com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState lifecycleState = success.getLifecycleState();
                java.lang.String billingAddressId = success.getBillingAddressId();
                java.lang.String estimatedArrivalDate = success.getEstimatedArrivalDate();
                formatToMonthDayYear = estimatedArrivalDate != null ? com.paypal.oslo.feature.debitcard.shared.util.DateFormattingExtensionsKt.formatToMonthDayYear(estimatedArrivalDate) : null;
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success2, new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToActivateCardFlow(new com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo(debitInstrumentId, productName, largeCardArtUrl, lastFourDigits, z, displayAddress, lifecycleState, billingAddressId, formatToMonthDayYear == null ? "" : formatToMonthDayYear, false, null, null, 3584, null)));
            }
            if (!(event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.DidntGetCardLinkClicked)) {
                return event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.RefreshData ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Loading.INSTANCE, null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Success success3 = success;
            java.lang.String debitInstrumentId2 = success.getDebitInstrumentId();
            com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName2 = success.getProductName();
            java.lang.String lastFourDigits2 = success.getLastFourDigits();
            java.lang.String displayAddress2 = success.getDisplayAddress();
            java.lang.String largeCardArtUrl2 = success.getLargeCardArtUrl();
            java.lang.String billingAddressId2 = success.getBillingAddressId();
            java.lang.String estimatedArrivalDate2 = success.getEstimatedArrivalDate();
            formatToMonthDayYear = estimatedArrivalDate2 != null ? com.paypal.oslo.feature.debitcard.shared.util.DateFormattingExtensionsKt.formatToMonthDayYear(estimatedArrivalDate2) : null;
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success3, new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToCardReplacementFlow(new com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo(debitInstrumentId2, productName2, lastFourDigits2, displayAddress2, largeCardArtUrl2, billingAddressId2, formatToMonthDayYear == null ? "" : formatToMonthDayYear, com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementFlowType.CARD_NOT_RECEIVED, false, 256, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
        }
        com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Loading loading = (com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Loading) state;
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.ShowCardEnrolledWidget) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(((com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.ShowCardEnrolledWidget) event).getUiState(), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.ShowCardAcquisitionWidget) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.EmptyState(((com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.ShowCardAcquisitionWidget) event).getUiModel()), null, 2, null);
        }
        return event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.Error ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Error.INSTANCE, null, 2, null) : event instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.Hide ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Hidden.INSTANCE, null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
    }
}
