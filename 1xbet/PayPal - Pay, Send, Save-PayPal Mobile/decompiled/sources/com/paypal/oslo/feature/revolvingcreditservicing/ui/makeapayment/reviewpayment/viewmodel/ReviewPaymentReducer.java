package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentState;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentState$Ready;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$OnBackupPaymentMethodSelected;", "p0", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentState$Ready;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent$OnBackupPaymentMethodSelected;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ReviewPaymentReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ReviewPaymentReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "ReviewPaymentReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect>> reduce(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState state, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent event) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.uimodel.ReviewPaymentUiModel copy;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.uimodel.ReviewPaymentUiModel copy2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.uimodel.ReviewPaymentUiModel copy3;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.uimodel.ReviewPaymentUiModel copy4;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.uimodel.ReviewPaymentUiModel copy5;
        com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ReviewPaymentArgs copy6;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.uimodel.ReviewPaymentUiModel copy7;
        boolean z;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.uimodel.ReviewPaymentUiModel copy8;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.uimodel.ReviewPaymentUiModel copy9;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.Ready)) {
                if (!(state instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.Loading)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.Loading loading = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.Loading) state;
                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnBackPressed) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateBack.INSTANCE);
                }
                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentValidationFailed) {
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.ReadyInfo readyInfo = loading.getReadyInfo();
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.uimodel.ReviewPaymentUiModel uiModel = loading.getReadyInfo().getUiModel();
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentValidationFailed paymentValidationFailed = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentValidationFailed) event;
                    copy3 = uiModel.copy((r26 & 1) != 0 ? uiModel.paymentMethodName : null, (r26 & 2) != 0 ? uiModel.paymentDate : null, (r26 & 4) != 0 ? uiModel.paymentDateShort : null, (r26 & 8) != 0 ? uiModel.buttonText : null, (r26 & 16) != 0 ? uiModel.paymentMethodDetails : null, (r26 & 32) != 0 ? uiModel.paymentAmount : null, (r26 & 64) != 0 ? uiModel.termsAndConditionsUrl : null, (r26 & 128) != 0 ? uiModel.backupPaymentMethod : null, (r26 & 256) != 0 ? uiModel.warningMessage : null, (r26 & 512) != 0 ? uiModel.errorMessage : paymentValidationFailed.getErrorMessage(), (r26 & 1024) != 0 ? uiModel.errorPaymentMethod : paymentValidationFailed.getErrorPaymentMethod(), (r26 & 2048) != 0 ? uiModel.paymentType : null);
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.Ready(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.ReadyInfo.copy$default(readyInfo, copy3, null, null, false, 14, null)), null, 2, null);
                }
                if ((event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnChangeBankClick) || (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnChangeDateClick) || (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnAddBackupPaymentClick) || (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnBackupPaymentMethodSelected) || (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnPaymentMethodSelected) || (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnPayClick) || (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentValidationPassed) || (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnDateSelected) || (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnCalendarDismissed) || (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnViewCreated) || (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnTermsClick) || (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnViewUpdated) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnScheduledPaymentAfterDueDate.INSTANCE)) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(loading, null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentRequestError) {
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.ReadyInfo readyInfo2 = loading.getReadyInfo();
                    copy2 = r6.copy((r26 & 1) != 0 ? r6.paymentMethodName : null, (r26 & 2) != 0 ? r6.paymentDate : null, (r26 & 4) != 0 ? r6.paymentDateShort : null, (r26 & 8) != 0 ? r6.buttonText : null, (r26 & 16) != 0 ? r6.paymentMethodDetails : null, (r26 & 32) != 0 ? r6.paymentAmount : null, (r26 & 64) != 0 ? r6.termsAndConditionsUrl : null, (r26 & 128) != 0 ? r6.backupPaymentMethod : null, (r26 & 256) != 0 ? r6.warningMessage : null, (r26 & 512) != 0 ? r6.errorMessage : ((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentRequestError) event).getErrorMessage(), (r26 & 1024) != 0 ? r6.errorPaymentMethod : null, (r26 & 2048) != 0 ? loading.getReadyInfo().getUiModel().paymentType : null);
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.Ready(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.ReadyInfo.copy$default(readyInfo2, copy2, null, null, false, 14, null)), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentRequestSuccess) {
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.ReadyInfo readyInfo3 = loading.getReadyInfo();
                    copy = r4.copy((r26 & 1) != 0 ? r4.paymentMethodName : null, (r26 & 2) != 0 ? r4.paymentDate : null, (r26 & 4) != 0 ? r4.paymentDateShort : null, (r26 & 8) != 0 ? r4.buttonText : null, (r26 & 16) != 0 ? r4.paymentMethodDetails : null, (r26 & 32) != 0 ? r4.paymentAmount : null, (r26 & 64) != 0 ? r4.termsAndConditionsUrl : null, (r26 & 128) != 0 ? r4.backupPaymentMethod : null, (r26 & 256) != 0 ? r4.warningMessage : null, (r26 & 512) != 0 ? r4.errorMessage : null, (r26 & 1024) != 0 ? r4.errorPaymentMethod : null, (r26 & 2048) != 0 ? loading.getReadyInfo().getUiModel().paymentType : null);
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.Ready(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.ReadyInfo.copy$default(readyInfo3, copy, null, null, false, 14, null)), new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateToPaymentConfirmation(((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentRequestSuccess) event).getArgs()));
                }
                if (!(event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnPaymentCreated) && !(event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnPaymentFailed)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.Ready ready = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.Ready) state;
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnBackPressed) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateBack.INSTANCE);
            }
            if (!(event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnViewCreated) && !(event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnDateSelected)) {
                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnChangeBankClick) {
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.Ready ready2 = ready;
                    com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ReviewPaymentArgs args = ready.getReadyInfo().getArgs();
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready2, new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateToChangeBank(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ChooseWayToPayArgs(args.getCreditAccountId(), args.getCreditProductIdentifier(), args.getPaymentAmount(), args.getTermsAndConditionsUrl(), (java.util.List) args.getFundingInstruments(), args.getSelectedFundingInstrument(), true, false, args.getMaxDaysInFuture(), (java.time.LocalDate) null, 640, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
                }
                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnChangeDateClick) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.Ready(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.ReadyInfo.copy$default(ready.getReadyInfo(), null, null, null, true, 7, null)), null, 2, null);
                }
                if (!(event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnCalendarDismissed)) {
                    if (!(event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnViewUpdated)) {
                        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnAddBackupPaymentClick) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateToAddBackupPayment(ready.getReadyInfo().getArgs().getFundingInstruments()));
                        }
                        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnBackupPaymentMethodSelected) {
                            return getHighSpeedVideoFpsRangesFor(ready, (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnBackupPaymentMethodSelected) event);
                        }
                        if (!(event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnPaymentMethodSelected)) {
                            if (!(event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnPayClick)) {
                                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnScheduledPaymentAfterDueDate) {
                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.ShowAfterDueDateBottomSheet.INSTANCE);
                                }
                                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentValidationPassed) {
                                    com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.ReadyInfo readyInfo4 = ready.getReadyInfo();
                                    copy5 = r6.copy((r26 & 1) != 0 ? r6.paymentMethodName : null, (r26 & 2) != 0 ? r6.paymentDate : null, (r26 & 4) != 0 ? r6.paymentDateShort : null, (r26 & 8) != 0 ? r6.buttonText : null, (r26 & 16) != 0 ? r6.paymentMethodDetails : null, (r26 & 32) != 0 ? r6.paymentAmount : null, (r26 & 64) != 0 ? r6.termsAndConditionsUrl : null, (r26 & 128) != 0 ? r6.backupPaymentMethod : null, (r26 & 256) != 0 ? r6.warningMessage : null, (r26 & 512) != 0 ? r6.errorMessage : null, (r26 & 1024) != 0 ? r6.errorPaymentMethod : null, (r26 & 2048) != 0 ? ready.getReadyInfo().getUiModel().paymentType : null);
                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.Loading(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.ReadyInfo.copy$default(readyInfo4, copy5, null, null, false, 14, null)), null, 2, null);
                                }
                                if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentValidationFailed) {
                                    com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.ReadyInfo readyInfo5 = ready.getReadyInfo();
                                    com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.uimodel.ReviewPaymentUiModel uiModel2 = ready.getReadyInfo().getUiModel();
                                    com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentValidationFailed paymentValidationFailed2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentValidationFailed) event;
                                    copy4 = uiModel2.copy((r26 & 1) != 0 ? uiModel2.paymentMethodName : null, (r26 & 2) != 0 ? uiModel2.paymentDate : null, (r26 & 4) != 0 ? uiModel2.paymentDateShort : null, (r26 & 8) != 0 ? uiModel2.buttonText : null, (r26 & 16) != 0 ? uiModel2.paymentMethodDetails : null, (r26 & 32) != 0 ? uiModel2.paymentAmount : null, (r26 & 64) != 0 ? uiModel2.termsAndConditionsUrl : null, (r26 & 128) != 0 ? uiModel2.backupPaymentMethod : null, (r26 & 256) != 0 ? uiModel2.warningMessage : null, (r26 & 512) != 0 ? uiModel2.errorMessage : paymentValidationFailed2.getErrorMessage(), (r26 & 1024) != 0 ? uiModel2.errorPaymentMethod : paymentValidationFailed2.getErrorPaymentMethod(), (r26 & 2048) != 0 ? uiModel2.paymentType : null);
                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.Ready(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.ReadyInfo.copy$default(readyInfo5, copy4, null, null, false, 14, null)), null, 2, null);
                                }
                                if ((event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentRequestSuccess) || (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentRequestError) || (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnPaymentCreated) || (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnPaymentFailed)) {
                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(ready, event);
                                }
                                if (!(event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnTermsClick)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateToTermsAndConditions(((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnTermsClick) event).getTermsUrl()));
                            }
                        } else {
                            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnPaymentMethodSelected onPaymentMethodSelected = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnPaymentMethodSelected) event;
                            for (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument : ready.getReadyInfo().getArgs().getFundingInstruments()) {
                                if (kotlin.jvm.internal.Intrinsics.areEqual(fundingInstrument.getId(), onPaymentMethodSelected.getFundingInstrumentId())) {
                                    boolean z2 = fundingInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBalance;
                                    com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.ReadyInfo readyInfo6 = ready.getReadyInfo();
                                    copy6 = r6.copy((r20 & 1) != 0 ? r6.creditAccountId : null, (r20 & 2) != 0 ? r6.selectedFundingInstrument : fundingInstrument, (r20 & 4) != 0 ? r6.fundingInstruments : null, (r20 & 8) != 0 ? r6.backupPaymentMethod : z2 ? ready.getReadyInfo().getArgs().getBackupPaymentMethod() : null, (r20 & 16) != 0 ? r6.paymentAmount : null, (r20 & 32) != 0 ? r6.termsAndConditionsUrl : null, (r20 & 64) != 0 ? r6.creditProductIdentifier : null, (r20 & 128) != 0 ? r6.maxDaysInFuture : 0, (r20 & 256) != 0 ? ready.getReadyInfo().getArgs().dueDate : null);
                                    copy7 = r12.copy((r26 & 1) != 0 ? r12.paymentMethodName : null, (r26 & 2) != 0 ? r12.paymentDate : null, (r26 & 4) != 0 ? r12.paymentDateShort : null, (r26 & 8) != 0 ? r12.buttonText : null, (r26 & 16) != 0 ? r12.paymentMethodDetails : null, (r26 & 32) != 0 ? r12.paymentAmount : null, (r26 & 64) != 0 ? r12.termsAndConditionsUrl : null, (r26 & 128) != 0 ? r12.backupPaymentMethod : null, (r26 & 256) != 0 ? r12.warningMessage : null, (r26 & 512) != 0 ? r12.errorMessage : null, (r26 & 1024) != 0 ? r12.errorPaymentMethod : null, (r26 & 2048) != 0 ? ready.getReadyInfo().getUiModel().paymentType : null);
                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.Ready(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.ReadyInfo.copy$default(readyInfo6, copy7, copy6, null, false, 12, null)), null, 2, null);
                                }
                            }
                            throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    } else {
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnViewUpdated onViewUpdated = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnViewUpdated) event;
                        z = ((onViewUpdated.getArgs().getSelectedFundingInstrument() instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBalance) && (onViewUpdated.getUiModel().getPaymentType() == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType.SCHEDULED)) ? false : true;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.ReadyInfo readyInfo7 = ready.getReadyInfo();
                        com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ReviewPaymentArgs args2 = onViewUpdated.getArgs();
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.uimodel.ReviewPaymentUiModel uiModel3 = ready.getReadyInfo().getUiModel();
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString paymentMethodName = onViewUpdated.getUiModel().getPaymentMethodName();
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString paymentMethodDetails = onViewUpdated.getUiModel().getPaymentMethodDetails();
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString paymentDate = onViewUpdated.getUiModel().getPaymentDate();
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType paymentType = onViewUpdated.getUiModel().getPaymentType();
                        copy8 = uiModel3.copy((r26 & 1) != 0 ? uiModel3.paymentMethodName : paymentMethodName, (r26 & 2) != 0 ? uiModel3.paymentDate : paymentDate, (r26 & 4) != 0 ? uiModel3.paymentDateShort : null, (r26 & 8) != 0 ? uiModel3.buttonText : onViewUpdated.getUiModel().getButtonText(), (r26 & 16) != 0 ? uiModel3.paymentMethodDetails : paymentMethodDetails, (r26 & 32) != 0 ? uiModel3.paymentAmount : null, (r26 & 64) != 0 ? uiModel3.termsAndConditionsUrl : null, (r26 & 128) != 0 ? uiModel3.backupPaymentMethod : onViewUpdated.getUiModel().getBackupPaymentMethod(), (r26 & 256) != 0 ? uiModel3.warningMessage : onViewUpdated.getUiModel().getWarningMessage(), (r26 & 512) != 0 ? uiModel3.errorMessage : z ? null : ready.getReadyInfo().getUiModel().getErrorMessage(), (r26 & 1024) != 0 ? uiModel3.errorPaymentMethod : null, (r26 & 2048) != 0 ? uiModel3.paymentType : paymentType);
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.Ready(readyInfo7.copy(copy8, args2, onViewUpdated.getPaymentDate(), ready.getReadyInfo().getShowCalendarPicker())), null, 2, null);
                    }
                } else {
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnCalendarDismissed onCalendarDismissed = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnCalendarDismissed) event;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.ReadyInfo readyInfo8 = ready.getReadyInfo();
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.uimodel.ReviewPaymentUiModel uiModel4 = ready.getReadyInfo().getUiModel();
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString formattedDate = onCalendarDismissed.getFormattedDate();
                    if (formattedDate == null) {
                        formattedDate = ready.getReadyInfo().getUiModel().getPaymentDate();
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString = formattedDate;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString formattedDateShort = onCalendarDismissed.getFormattedDateShort();
                    if (formattedDateShort == null) {
                        formattedDateShort = ready.getReadyInfo().getUiModel().getPaymentDateShort();
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2 = formattedDateShort;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString buttonText = onCalendarDismissed.getButtonText();
                    if (buttonText == null) {
                        buttonText = ready.getReadyInfo().getUiModel().getButtonText();
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3 = buttonText;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType paymentType2 = onCalendarDismissed.getPaymentType();
                    if (paymentType2 == null) {
                        paymentType2 = ready.getReadyInfo().getUiModel().getPaymentType();
                    }
                    copy9 = uiModel4.copy((r26 & 1) != 0 ? uiModel4.paymentMethodName : null, (r26 & 2) != 0 ? uiModel4.paymentDate : uiString, (r26 & 4) != 0 ? uiModel4.paymentDateShort : uiString2, (r26 & 8) != 0 ? uiModel4.buttonText : uiString3, (r26 & 16) != 0 ? uiModel4.paymentMethodDetails : null, (r26 & 32) != 0 ? uiModel4.paymentAmount : null, (r26 & 64) != 0 ? uiModel4.termsAndConditionsUrl : null, (r26 & 128) != 0 ? uiModel4.backupPaymentMethod : null, (r26 & 256) != 0 ? uiModel4.warningMessage : null, (r26 & 512) != 0 ? uiModel4.errorMessage : null, (r26 & 1024) != 0 ? uiModel4.errorPaymentMethod : null, (r26 & 2048) != 0 ? uiModel4.paymentType : paymentType2);
                    java.time.LocalDate date = onCalendarDismissed.getDate();
                    if (date == null) {
                        date = ready.getReadyInfo().getPaymentDate();
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.Ready ready3 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.Ready(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.ReadyInfo.copy$default(readyInfo8, copy9, null, date, false, 2, null));
                    boolean z3 = ready.getReadyInfo().getArgs().getSelectedFundingInstrument() instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBalance;
                    boolean z4 = onCalendarDismissed.getPaymentType() == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType.SCHEDULED;
                    z = ready.getReadyInfo().getArgs().getBackupPaymentMethod() == null;
                    if (z3 && z4 && z) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready3, new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateToAddBackupPayment(ready.getReadyInfo().getArgs().getFundingInstruments()));
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(ready3, null, 2, null);
                }
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(ready, null, 2, null);
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.Initial initial = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.Initial) state;
        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnBackPressed) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(initial, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect.NavigateBack.INSTANCE);
        }
        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnViewCreated) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(initial, null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnViewUpdated) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnViewUpdated onViewUpdated2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnViewUpdated) event;
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.Ready(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.ReadyInfo(onViewUpdated2.getUiModel(), onViewUpdated2.getArgs(), null, false, 12, null)), null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
    }

    private static arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentUiEffect>> getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.Ready ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.OnBackupPaymentMethodSelected onBackupPaymentMethodSelected) {
        java.lang.Object m23436constructorimpl;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType bankAccountType;
        com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ReviewPaymentArgs copy;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.uimodel.ReviewPaymentUiModel copy2;
        java.lang.String bankId = onBackupPaymentMethodSelected.getBankId();
        java.lang.String iconThumbnail = onBackupPaymentMethodSelected.getIconThumbnail();
        java.lang.String bankName = onBackupPaymentMethodSelected.getBankName();
        java.lang.String bankAccountType2 = onBackupPaymentMethodSelected.getBankAccountType();
        if (bankAccountType2 != null) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                java.lang.String upperCase = bankAccountType2.toUpperCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType.valueOf(upperCase));
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                m23436constructorimpl = null;
            }
            bankAccountType = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType) m23436constructorimpl;
        } else {
            bankAccountType = null;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank fundingInstrumentBank = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank(bankId, iconThumbnail, bankName, bankAccountType, onBackupPaymentMethodSelected.getBankLastFour());
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.ReadyInfo readyInfo = ready.getReadyInfo();
        copy = r9.copy((r20 & 1) != 0 ? r9.creditAccountId : null, (r20 & 2) != 0 ? r9.selectedFundingInstrument : null, (r20 & 4) != 0 ? r9.fundingInstruments : null, (r20 & 8) != 0 ? r9.backupPaymentMethod : fundingInstrumentBank, (r20 & 16) != 0 ? r9.paymentAmount : null, (r20 & 32) != 0 ? r9.termsAndConditionsUrl : null, (r20 & 64) != 0 ? r9.creditProductIdentifier : null, (r20 & 128) != 0 ? r9.maxDaysInFuture : 0, (r20 & 256) != 0 ? ready.getReadyInfo().getArgs().dueDate : null);
        copy2 = r11.copy((r26 & 1) != 0 ? r11.paymentMethodName : null, (r26 & 2) != 0 ? r11.paymentDate : null, (r26 & 4) != 0 ? r11.paymentDateShort : null, (r26 & 8) != 0 ? r11.buttonText : null, (r26 & 16) != 0 ? r11.paymentMethodDetails : null, (r26 & 32) != 0 ? r11.paymentAmount : null, (r26 & 64) != 0 ? r11.termsAndConditionsUrl : null, (r26 & 128) != 0 ? r11.backupPaymentMethod : null, (r26 & 256) != 0 ? r11.warningMessage : null, (r26 & 512) != 0 ? r11.errorMessage : null, (r26 & 1024) != 0 ? r11.errorPaymentMethod : null, (r26 & 2048) != 0 ? ready.getReadyInfo().getUiModel().paymentType : null);
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.Ready(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.ReadyInfo.copy$default(readyInfo, copy2, copy, null, false, 12, null)), null, 2, null);
    }
}
