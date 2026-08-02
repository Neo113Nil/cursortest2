package com.paypal.oslo.feature.bnplacquisition.ui.repayments;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsUiState;Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RepaymentsReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public RepaymentsReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "RepaymentsReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect>> reduce(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState state, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent event) {
        arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect>> output;
        com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiModel copy;
        com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiModel copy2;
        java.lang.String selectedFundingInstrumentId;
        com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiModel copy3;
        com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiModel copy4;
        com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiModel copy5;
        com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiModel copy6;
        com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiModel copy7;
        com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiModel copy8;
        com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrument fundingInstrument;
        com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiModel copy9;
        com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiModel copy10;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState.Loading)) {
                if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState.Success)) {
                    if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState.Error)) {
                        if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState.Decline)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState.Decline decline = (com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState.Decline) state;
                        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.DeclineClosePressed.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.ClosePressed.INSTANCE)) {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(decline, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect.CloseAcquisition.INSTANCE);
                        } else {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(decline, event);
                        }
                    } else {
                        com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState.Error error = (com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState.Error) state;
                        if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.ErrorBackPressed) {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState.Success(error.getData()), null, 2, null);
                        } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.ClosePressed) {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect.ShowExitConfirmationModal.INSTANCE);
                        } else {
                            output = event instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.ConfirmExitPressed ? com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect.CloseAcquisition.INSTANCE) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                        }
                    }
                } else {
                    com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState.Success success = (com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState.Success) state;
                    if (!(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.AgreementClicked)) {
                        if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.FundingInstrumentSelected) {
                            java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrument> fundingInstruments = success.getData().getFundingInstruments();
                            copy8 = r5.copy((r44 & 1) != 0 ? r5.repaymentSchedule : null, (r44 & 2) != 0 ? r5.paymentAuthorizationLink : null, (r44 & 4) != 0 ? r5.fundingInstruments : null, (r44 & 8) != 0 ? r5.selectedIndex : java.lang.Integer.valueOf(((com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.FundingInstrumentSelected) event).getIndex()), (r44 & 16) != 0 ? r5.selectedFundingInstrumentId : (fundingInstruments == null || (fundingInstrument = (com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrument) kotlin.collections.CollectionsKt.getOrNull(fundingInstruments, ((com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.FundingInstrumentSelected) event).getIndex())) == null) ? null : fundingInstrument.getId(), (r44 & 32) != 0 ? r5.isAgreed : false, (r44 & 64) != 0 ? r5.showFundingInstrumentError : false, (r44 & 128) != 0 ? r5.showConsentError : false, (r44 & 256) != 0 ? r5.title : null, (r44 & 512) != 0 ? r5.subtitle : null, (r44 & 1024) != 0 ? r5.choosePaymentLabel : null, (r44 & 2048) != 0 ? r5.validationErrorText : null, (r44 & 4096) != 0 ? r5.disclaimerText : null, (r44 & 8192) != 0 ? r5.loanAgreementLink : null, (r44 & 16384) != 0 ? r5.continueButtonText : null, (r44 & 32768) != 0 ? r5.skipButtonText : null, (r44 & 65536) != 0 ? r5.linkDebitCardText : null, (r44 & 131072) != 0 ? r5.newlyAddedFiId : null, (r44 & 262144) != 0 ? r5.isRefreshing : false, (r44 & 524288) != 0 ? r5.apiLoadSuccessful : false, (r44 & 1048576) != 0 ? r5.exitConfirmationContent : null, (r44 & 2097152) != 0 ? r5.toolBarContent : null, (r44 & 4194304) != 0 ? r5.agreementText : null, (r44 & 8388608) != 0 ? r5.agreeToContinueErrorMessage : null, (r44 & 16777216) != 0 ? r5.showSkipOption : false, (r44 & 33554432) != 0 ? success.getData().showConsentCheckbox : false);
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success.copy(copy8), null, 2, null);
                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.LinkCardPressed.INSTANCE)) {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect.NavigateToLinkCard.INSTANCE);
                        } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.DisclaimerLinkPressed) {
                            com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.DisclaimerLinkPressed disclaimerLinkPressed = (com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.DisclaimerLinkPressed) event;
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect.OpenUrl(disclaimerLinkPressed.getUrl(), disclaimerLinkPressed.getHtml()));
                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.Continue.Pressed.INSTANCE)) {
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success, null, 2, null);
                        } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.Continue.Invalid) {
                            com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.Continue.Invalid invalid = (com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.Continue.Invalid) event;
                            copy7 = r5.copy((r44 & 1) != 0 ? r5.repaymentSchedule : null, (r44 & 2) != 0 ? r5.paymentAuthorizationLink : null, (r44 & 4) != 0 ? r5.fundingInstruments : null, (r44 & 8) != 0 ? r5.selectedIndex : null, (r44 & 16) != 0 ? r5.selectedFundingInstrumentId : null, (r44 & 32) != 0 ? r5.isAgreed : false, (r44 & 64) != 0 ? r5.showFundingInstrumentError : invalid.getShowFundingInstrumentError(), (r44 & 128) != 0 ? r5.showConsentError : invalid.getShowConsentError(), (r44 & 256) != 0 ? r5.title : null, (r44 & 512) != 0 ? r5.subtitle : null, (r44 & 1024) != 0 ? r5.choosePaymentLabel : null, (r44 & 2048) != 0 ? r5.validationErrorText : null, (r44 & 4096) != 0 ? r5.disclaimerText : null, (r44 & 8192) != 0 ? r5.loanAgreementLink : null, (r44 & 16384) != 0 ? r5.continueButtonText : null, (r44 & 32768) != 0 ? r5.skipButtonText : null, (r44 & 65536) != 0 ? r5.linkDebitCardText : null, (r44 & 131072) != 0 ? r5.newlyAddedFiId : null, (r44 & 262144) != 0 ? r5.isRefreshing : false, (r44 & 524288) != 0 ? r5.apiLoadSuccessful : false, (r44 & 1048576) != 0 ? r5.exitConfirmationContent : null, (r44 & 2097152) != 0 ? r5.toolBarContent : null, (r44 & 4194304) != 0 ? r5.agreementText : null, (r44 & 8388608) != 0 ? r5.agreeToContinueErrorMessage : null, (r44 & 16777216) != 0 ? r5.showSkipOption : false, (r44 & 33554432) != 0 ? success.getData().showConsentCheckbox : false);
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success.copy(copy7), null, 2, null);
                        } else if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.Continue.Valid.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.SkipPressed.INSTANCE)) {
                            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.ClosePressed.INSTANCE)) {
                                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect.ShowExitConfirmationModal.INSTANCE);
                            } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.ConfirmExitPressed.INSTANCE)) {
                                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect.CloseAcquisition.INSTANCE);
                            } else {
                                boolean z = event instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.OnAddFiSuccess;
                                if (!z && !(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.OnRefreshWithNewFi) && !kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.OnNewFiConsumed.INSTANCE) && !(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.OnFundingInstrumentsReloaded) && !kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.OnFundingInstrumentsReloadFailed.INSTANCE)) {
                                    output = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
                                } else if (!z) {
                                    if (!(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.OnRefreshWithNewFi)) {
                                        if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.OnNewFiConsumed.INSTANCE)) {
                                            if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.OnFundingInstrumentsReloaded) {
                                                java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrument> fundingInstruments2 = success.getData().getFundingInstruments();
                                                if (fundingInstruments2 == null) {
                                                    fundingInstruments2 = kotlin.collections.CollectionsKt.emptyList();
                                                }
                                                com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.OnFundingInstrumentsReloaded onFundingInstrumentsReloaded = (com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.OnFundingInstrumentsReloaded) event;
                                                java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrument> fundingInstruments3 = onFundingInstrumentsReloaded.getFundingInstruments();
                                                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(fundingInstruments3, 10));
                                                java.util.Iterator<T> it = fundingInstruments3.iterator();
                                                while (it.hasNext()) {
                                                    arrayList.add(((com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrument) it.next()).getId());
                                                }
                                                java.util.Set set = kotlin.collections.CollectionsKt.toSet(arrayList);
                                                java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrument> fundingInstruments4 = onFundingInstrumentsReloaded.getFundingInstruments();
                                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                                for (java.lang.Object obj : fundingInstruments2) {
                                                    if (!set.contains(((com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrument) obj).getId())) {
                                                        arrayList2.add(obj);
                                                    }
                                                }
                                                java.util.List plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) fundingInstruments4, (java.lang.Iterable) arrayList2);
                                                java.util.Iterator it2 = plus.iterator();
                                                int i = 0;
                                                while (true) {
                                                    if (!it2.hasNext()) {
                                                        i = -1;
                                                        break;
                                                    }
                                                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrument) it2.next()).getId(), onFundingInstrumentsReloaded.getNewlyAddedFiId())) {
                                                        break;
                                                    }
                                                    i++;
                                                }
                                                if (i >= 0) {
                                                    selectedFundingInstrumentId = onFundingInstrumentsReloaded.getNewlyAddedFiId();
                                                } else {
                                                    selectedFundingInstrumentId = success.getData().getSelectedFundingInstrumentId();
                                                }
                                                copy3 = r9.copy((r44 & 1) != 0 ? r9.repaymentSchedule : null, (r44 & 2) != 0 ? r9.paymentAuthorizationLink : null, (r44 & 4) != 0 ? r9.fundingInstruments : plus, (r44 & 8) != 0 ? r9.selectedIndex : i >= 0 ? java.lang.Integer.valueOf(i) : success.getData().getSelectedIndex(), (r44 & 16) != 0 ? r9.selectedFundingInstrumentId : selectedFundingInstrumentId, (r44 & 32) != 0 ? r9.isAgreed : false, (r44 & 64) != 0 ? r9.showFundingInstrumentError : false, (r44 & 128) != 0 ? r9.showConsentError : false, (r44 & 256) != 0 ? r9.title : null, (r44 & 512) != 0 ? r9.subtitle : null, (r44 & 1024) != 0 ? r9.choosePaymentLabel : null, (r44 & 2048) != 0 ? r9.validationErrorText : null, (r44 & 4096) != 0 ? r9.disclaimerText : null, (r44 & 8192) != 0 ? r9.loanAgreementLink : null, (r44 & 16384) != 0 ? r9.continueButtonText : null, (r44 & 32768) != 0 ? r9.skipButtonText : null, (r44 & 65536) != 0 ? r9.linkDebitCardText : null, (r44 & 131072) != 0 ? r9.newlyAddedFiId : null, (r44 & 262144) != 0 ? r9.isRefreshing : false, (r44 & 524288) != 0 ? r9.apiLoadSuccessful : false, (r44 & 1048576) != 0 ? r9.exitConfirmationContent : null, (r44 & 2097152) != 0 ? r9.toolBarContent : null, (r44 & 4194304) != 0 ? r9.agreementText : null, (r44 & 8388608) != 0 ? r9.agreeToContinueErrorMessage : null, (r44 & 16777216) != 0 ? r9.showSkipOption : false, (r44 & 33554432) != 0 ? success.getData().showConsentCheckbox : false);
                                                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success.copy(copy3), null, 2, null);
                                            } else if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.OnFundingInstrumentsReloadFailed.INSTANCE)) {
                                                output = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
                                            } else {
                                                copy2 = r5.copy((r44 & 1) != 0 ? r5.repaymentSchedule : null, (r44 & 2) != 0 ? r5.paymentAuthorizationLink : null, (r44 & 4) != 0 ? r5.fundingInstruments : null, (r44 & 8) != 0 ? r5.selectedIndex : null, (r44 & 16) != 0 ? r5.selectedFundingInstrumentId : null, (r44 & 32) != 0 ? r5.isAgreed : false, (r44 & 64) != 0 ? r5.showFundingInstrumentError : false, (r44 & 128) != 0 ? r5.showConsentError : false, (r44 & 256) != 0 ? r5.title : null, (r44 & 512) != 0 ? r5.subtitle : null, (r44 & 1024) != 0 ? r5.choosePaymentLabel : null, (r44 & 2048) != 0 ? r5.validationErrorText : null, (r44 & 4096) != 0 ? r5.disclaimerText : null, (r44 & 8192) != 0 ? r5.loanAgreementLink : null, (r44 & 16384) != 0 ? r5.continueButtonText : null, (r44 & 32768) != 0 ? r5.skipButtonText : null, (r44 & 65536) != 0 ? r5.linkDebitCardText : null, (r44 & 131072) != 0 ? r5.newlyAddedFiId : null, (r44 & 262144) != 0 ? r5.isRefreshing : false, (r44 & 524288) != 0 ? r5.apiLoadSuccessful : false, (r44 & 1048576) != 0 ? r5.exitConfirmationContent : null, (r44 & 2097152) != 0 ? r5.toolBarContent : null, (r44 & 4194304) != 0 ? r5.agreementText : null, (r44 & 8388608) != 0 ? r5.agreeToContinueErrorMessage : null, (r44 & 16777216) != 0 ? r5.showSkipOption : false, (r44 & 33554432) != 0 ? success.getData().showConsentCheckbox : false);
                                                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success.copy(copy2), null, 2, null);
                                            }
                                        } else {
                                            copy4 = r5.copy((r44 & 1) != 0 ? r5.repaymentSchedule : null, (r44 & 2) != 0 ? r5.paymentAuthorizationLink : null, (r44 & 4) != 0 ? r5.fundingInstruments : null, (r44 & 8) != 0 ? r5.selectedIndex : null, (r44 & 16) != 0 ? r5.selectedFundingInstrumentId : null, (r44 & 32) != 0 ? r5.isAgreed : false, (r44 & 64) != 0 ? r5.showFundingInstrumentError : false, (r44 & 128) != 0 ? r5.showConsentError : false, (r44 & 256) != 0 ? r5.title : null, (r44 & 512) != 0 ? r5.subtitle : null, (r44 & 1024) != 0 ? r5.choosePaymentLabel : null, (r44 & 2048) != 0 ? r5.validationErrorText : null, (r44 & 4096) != 0 ? r5.disclaimerText : null, (r44 & 8192) != 0 ? r5.loanAgreementLink : null, (r44 & 16384) != 0 ? r5.continueButtonText : null, (r44 & 32768) != 0 ? r5.skipButtonText : null, (r44 & 65536) != 0 ? r5.linkDebitCardText : null, (r44 & 131072) != 0 ? r5.newlyAddedFiId : null, (r44 & 262144) != 0 ? r5.isRefreshing : false, (r44 & 524288) != 0 ? r5.apiLoadSuccessful : false, (r44 & 1048576) != 0 ? r5.exitConfirmationContent : null, (r44 & 2097152) != 0 ? r5.toolBarContent : null, (r44 & 4194304) != 0 ? r5.agreementText : null, (r44 & 8388608) != 0 ? r5.agreeToContinueErrorMessage : null, (r44 & 16777216) != 0 ? r5.showSkipOption : false, (r44 & 33554432) != 0 ? success.getData().showConsentCheckbox : false);
                                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success.copy(copy4), null, 2, null);
                                        }
                                    } else {
                                        copy5 = r5.copy((r44 & 1) != 0 ? r5.repaymentSchedule : null, (r44 & 2) != 0 ? r5.paymentAuthorizationLink : null, (r44 & 4) != 0 ? r5.fundingInstruments : null, (r44 & 8) != 0 ? r5.selectedIndex : null, (r44 & 16) != 0 ? r5.selectedFundingInstrumentId : null, (r44 & 32) != 0 ? r5.isAgreed : false, (r44 & 64) != 0 ? r5.showFundingInstrumentError : false, (r44 & 128) != 0 ? r5.showConsentError : false, (r44 & 256) != 0 ? r5.title : null, (r44 & 512) != 0 ? r5.subtitle : null, (r44 & 1024) != 0 ? r5.choosePaymentLabel : null, (r44 & 2048) != 0 ? r5.validationErrorText : null, (r44 & 4096) != 0 ? r5.disclaimerText : null, (r44 & 8192) != 0 ? r5.loanAgreementLink : null, (r44 & 16384) != 0 ? r5.continueButtonText : null, (r44 & 32768) != 0 ? r5.skipButtonText : null, (r44 & 65536) != 0 ? r5.linkDebitCardText : null, (r44 & 131072) != 0 ? r5.newlyAddedFiId : null, (r44 & 262144) != 0 ? r5.isRefreshing : true, (r44 & 524288) != 0 ? r5.apiLoadSuccessful : false, (r44 & 1048576) != 0 ? r5.exitConfirmationContent : null, (r44 & 2097152) != 0 ? r5.toolBarContent : null, (r44 & 4194304) != 0 ? r5.agreementText : null, (r44 & 8388608) != 0 ? r5.agreeToContinueErrorMessage : null, (r44 & 16777216) != 0 ? r5.showSkipOption : false, (r44 & 33554432) != 0 ? success.getData().showConsentCheckbox : false);
                                        output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success.copy(copy5), null, 2, null);
                                    }
                                } else {
                                    copy6 = r5.copy((r44 & 1) != 0 ? r5.repaymentSchedule : null, (r44 & 2) != 0 ? r5.paymentAuthorizationLink : null, (r44 & 4) != 0 ? r5.fundingInstruments : null, (r44 & 8) != 0 ? r5.selectedIndex : null, (r44 & 16) != 0 ? r5.selectedFundingInstrumentId : null, (r44 & 32) != 0 ? r5.isAgreed : false, (r44 & 64) != 0 ? r5.showFundingInstrumentError : false, (r44 & 128) != 0 ? r5.showConsentError : false, (r44 & 256) != 0 ? r5.title : null, (r44 & 512) != 0 ? r5.subtitle : null, (r44 & 1024) != 0 ? r5.choosePaymentLabel : null, (r44 & 2048) != 0 ? r5.validationErrorText : null, (r44 & 4096) != 0 ? r5.disclaimerText : null, (r44 & 8192) != 0 ? r5.loanAgreementLink : null, (r44 & 16384) != 0 ? r5.continueButtonText : null, (r44 & 32768) != 0 ? r5.skipButtonText : null, (r44 & 65536) != 0 ? r5.linkDebitCardText : null, (r44 & 131072) != 0 ? r5.newlyAddedFiId : ((com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.OnAddFiSuccess) event).getNewFiId(), (r44 & 262144) != 0 ? r5.isRefreshing : false, (r44 & 524288) != 0 ? r5.apiLoadSuccessful : false, (r44 & 1048576) != 0 ? r5.exitConfirmationContent : null, (r44 & 2097152) != 0 ? r5.toolBarContent : null, (r44 & 4194304) != 0 ? r5.agreementText : null, (r44 & 8388608) != 0 ? r5.agreeToContinueErrorMessage : null, (r44 & 16777216) != 0 ? r5.showSkipOption : false, (r44 & 33554432) != 0 ? success.getData().showConsentCheckbox : false);
                                    output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success.copy(copy6), null, 2, null);
                                }
                            }
                        } else {
                            copy = r5.copy((r44 & 1) != 0 ? r5.repaymentSchedule : null, (r44 & 2) != 0 ? r5.paymentAuthorizationLink : null, (r44 & 4) != 0 ? r5.fundingInstruments : null, (r44 & 8) != 0 ? r5.selectedIndex : null, (r44 & 16) != 0 ? r5.selectedFundingInstrumentId : null, (r44 & 32) != 0 ? r5.isAgreed : false, (r44 & 64) != 0 ? r5.showFundingInstrumentError : false, (r44 & 128) != 0 ? r5.showConsentError : false, (r44 & 256) != 0 ? r5.title : null, (r44 & 512) != 0 ? r5.subtitle : null, (r44 & 1024) != 0 ? r5.choosePaymentLabel : null, (r44 & 2048) != 0 ? r5.validationErrorText : null, (r44 & 4096) != 0 ? r5.disclaimerText : null, (r44 & 8192) != 0 ? r5.loanAgreementLink : null, (r44 & 16384) != 0 ? r5.continueButtonText : null, (r44 & 32768) != 0 ? r5.skipButtonText : null, (r44 & 65536) != 0 ? r5.linkDebitCardText : null, (r44 & 131072) != 0 ? r5.newlyAddedFiId : null, (r44 & 262144) != 0 ? r5.isRefreshing : false, (r44 & 524288) != 0 ? r5.apiLoadSuccessful : false, (r44 & 1048576) != 0 ? r5.exitConfirmationContent : null, (r44 & 2097152) != 0 ? r5.toolBarContent : null, (r44 & 4194304) != 0 ? r5.agreementText : null, (r44 & 8388608) != 0 ? r5.agreeToContinueErrorMessage : null, (r44 & 16777216) != 0 ? r5.showSkipOption : false, (r44 & 33554432) != 0 ? success.getData().showConsentCheckbox : false);
                            output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState.Loading(copy), null, 2, null);
                        }
                    } else {
                        copy9 = r5.copy((r44 & 1) != 0 ? r5.repaymentSchedule : null, (r44 & 2) != 0 ? r5.paymentAuthorizationLink : null, (r44 & 4) != 0 ? r5.fundingInstruments : null, (r44 & 8) != 0 ? r5.selectedIndex : null, (r44 & 16) != 0 ? r5.selectedFundingInstrumentId : null, (r44 & 32) != 0 ? r5.isAgreed : ((com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.AgreementClicked) event).isChecked(), (r44 & 64) != 0 ? r5.showFundingInstrumentError : false, (r44 & 128) != 0 ? r5.showConsentError : false, (r44 & 256) != 0 ? r5.title : null, (r44 & 512) != 0 ? r5.subtitle : null, (r44 & 1024) != 0 ? r5.choosePaymentLabel : null, (r44 & 2048) != 0 ? r5.validationErrorText : null, (r44 & 4096) != 0 ? r5.disclaimerText : null, (r44 & 8192) != 0 ? r5.loanAgreementLink : null, (r44 & 16384) != 0 ? r5.continueButtonText : null, (r44 & 32768) != 0 ? r5.skipButtonText : null, (r44 & 65536) != 0 ? r5.linkDebitCardText : null, (r44 & 131072) != 0 ? r5.newlyAddedFiId : null, (r44 & 262144) != 0 ? r5.isRefreshing : false, (r44 & 524288) != 0 ? r5.apiLoadSuccessful : false, (r44 & 1048576) != 0 ? r5.exitConfirmationContent : null, (r44 & 2097152) != 0 ? r5.toolBarContent : null, (r44 & 4194304) != 0 ? r5.agreementText : null, (r44 & 8388608) != 0 ? r5.agreeToContinueErrorMessage : null, (r44 & 16777216) != 0 ? r5.showSkipOption : false, (r44 & 33554432) != 0 ? success.getData().showConsentCheckbox : false);
                        output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success.copy(copy9), null, 2, null);
                    }
                }
            } else {
                com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState.Loading loading = (com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState.Loading) state;
                if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.LoadDomainModel) {
                    output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState.Initial.INSTANCE, null, 2, null);
                } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.SwitchToSuccess) {
                    output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState.Success(((com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.SwitchToSuccess) event).getData()), null, 2, null);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.ClosePressed.INSTANCE)) {
                    output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect.ShowExitConfirmationModal.INSTANCE);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.ConfirmExitPressed.INSTANCE)) {
                    output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect.CloseAcquisition.INSTANCE);
                } else if (!(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.SubmitCreditApplicationSuccess)) {
                    if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.UpdateError) {
                        output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState.Error(((com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.UpdateError) event).getErrorContent(), loading.getModel()), null, 2, null);
                    } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.ApplicationDeclined) {
                        output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState.Decline(((com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.ApplicationDeclined) event).getDeclineContent()), null, 2, null);
                    } else {
                        output = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
                    }
                } else {
                    copy10 = r5.copy((r44 & 1) != 0 ? r5.repaymentSchedule : null, (r44 & 2) != 0 ? r5.paymentAuthorizationLink : null, (r44 & 4) != 0 ? r5.fundingInstruments : null, (r44 & 8) != 0 ? r5.selectedIndex : null, (r44 & 16) != 0 ? r5.selectedFundingInstrumentId : null, (r44 & 32) != 0 ? r5.isAgreed : false, (r44 & 64) != 0 ? r5.showFundingInstrumentError : false, (r44 & 128) != 0 ? r5.showConsentError : false, (r44 & 256) != 0 ? r5.title : null, (r44 & 512) != 0 ? r5.subtitle : null, (r44 & 1024) != 0 ? r5.choosePaymentLabel : null, (r44 & 2048) != 0 ? r5.validationErrorText : null, (r44 & 4096) != 0 ? r5.disclaimerText : null, (r44 & 8192) != 0 ? r5.loanAgreementLink : null, (r44 & 16384) != 0 ? r5.continueButtonText : null, (r44 & 32768) != 0 ? r5.skipButtonText : null, (r44 & 65536) != 0 ? r5.linkDebitCardText : null, (r44 & 131072) != 0 ? r5.newlyAddedFiId : null, (r44 & 262144) != 0 ? r5.isRefreshing : false, (r44 & 524288) != 0 ? r5.apiLoadSuccessful : true, (r44 & 1048576) != 0 ? r5.exitConfirmationContent : null, (r44 & 2097152) != 0 ? r5.toolBarContent : null, (r44 & 4194304) != 0 ? r5.agreementText : null, (r44 & 8388608) != 0 ? r5.agreeToContinueErrorMessage : null, (r44 & 16777216) != 0 ? r5.showSkipOption : false, (r44 & 33554432) != 0 ? loading.getModel().showConsentCheckbox : false);
                    output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading.copy(copy10), new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect.NavigateToVirtualCardOverviewScreen(((com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.SubmitCreditApplicationSuccess) event).getData()));
                }
            }
        } else {
            com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState.Initial initial = (com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState.Initial) state;
            if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.LoadDomainModel) {
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(initial, null, 2, null);
            } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.DomainModelLoaded) {
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiState.Success(((com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.DomainModelLoaded) event).getUiModel()), null, 2, null);
            } else {
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
            }
        }
        com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerUtilsKt.logBnplAcqReducerEvent(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, getName(), output.isLeft() ? com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerConstants.UNEXPECTED_EVENT : event.getName(), output.isLeft());
        return output;
    }
}
