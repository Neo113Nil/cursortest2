package com.paypal.oslo.feature.bnplservicing.ui.paylaterhub;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiState;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent;", "Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubUiState;Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PayLaterHubReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiState, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public PayLaterHubReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "PayLaterHubReducer";
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0232, code lost:
    
        if (r2 != null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02c7  */
    @Override // com.paypal.oslo.core.mvi.Reducer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiState, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect>> reduce(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiState state, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent event) {
        arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiState, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect>> output;
        arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiState, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect>> either;
        arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiState, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect>> output$default;
        com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiModel copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiState, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect>> either2 = null;
        if (!(state instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiState.InitialLoading)) {
            if (!(state instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiState.Content)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiState.Content content = (com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiState.Content) state;
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.BackPressed.INSTANCE)) {
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(content, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateBack.INSTANCE);
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.NavigateToAcquisition.INSTANCE)) {
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(content, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToAcquisition.INSTANCE);
            } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.NavigateToPlanDetails) {
                com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.NavigateToPlanDetails navigateToPlanDetails = (com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.NavigateToPlanDetails) event;
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(content, new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToPlanDetails(navigateToPlanDetails.getCreditAccountId(), navigateToPlanDetails.getSource()));
            } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.NavigateToPrequal) {
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(content, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToPrequal.INSTANCE);
            } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.NavigateToAllPlans) {
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(content, new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToAllPlans(((com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.NavigateToAllPlans) event).getNavigateToHistoryTab()));
            } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.NavigateToVirtualCardOverview) {
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(content, new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToVirtualCardOverview(((com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.NavigateToVirtualCardOverview) event).getCreditAccountId()));
            } else {
                output = event instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.CheckoutOfferURLClicked ? com.paypal.oslo.core.mvi.ReducerHelperKt.output(content, new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToWebView(((com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.CheckoutOfferURLClicked) event).getUrl())) : null;
            }
            if (output == null) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.LoadData.INSTANCE)) {
                    output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(content, null, 2, null);
                } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.RetrySection) {
                    output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(content.updateSectionState(((com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.RetrySection) event).getSection(), com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.SectionState.Loading.INSTANCE), null, 2, null);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.RefreshPlansSection.INSTANCE)) {
                    output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(content.updateSectionState(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection.PLANS, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.SectionState.Loading.INSTANCE), null, 2, null);
                } else {
                    output$default = kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.RefreshAllSections.INSTANCE) ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(content.updateSectionState(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection.ACQ, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.SectionState.Loading.INSTANCE).updateSectionState(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection.PLANS, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.SectionState.Loading.INSTANCE), null, 2, null) : null;
                }
                if (output$default == null) {
                    if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.DataLoaded) {
                        output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(content.copy(((com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.DataLoaded) event).getModel(), kotlin.collections.MapsKt.emptyMap()), null, 2, null);
                    } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PartialDataLoaded) {
                        com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PartialDataLoaded partialDataLoaded = (com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PartialDataLoaded) event;
                        output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(content.copy(partialDataLoaded.getModel(), partialDataLoaded.getSectionStates()), null, 2, null);
                    } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PrequalLoaded) {
                        com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PrequalLoaded prequalLoaded = (com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PrequalLoaded) event;
                        if (prequalLoaded.getPrequalSection() != null) {
                            copy = r7.copy((r20 & 1) != 0 ? r7.creditAccountId : null, (r20 & 2) != 0 ? r7.creditProductIdentifier : null, (r20 & 4) != 0 ? r7.toolbarTitle : null, (r20 & 8) != 0 ? r7.shopNowPayLaterSection : null, (r20 & 16) != 0 ? r7.prequalSection : prequalLoaded.getPrequalSection(), (r20 & 32) != 0 ? r7.acqSection : null, (r20 & 64) != 0 ? r7.plansSection : null, (r20 & 128) != 0 ? r7.unusedVirtualCardSection : null, (r20 & 256) != 0 ? content.getModel().checkoutSection : null);
                            output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiState.Content.copy$default(content, copy, null, 2, null).updateSectionState(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection.PREQUAL, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.SectionState.Success.INSTANCE), null, 2, null);
                        }
                        output$default = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(content.updateSectionState(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection.PREQUAL, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.SectionState.Success.INSTANCE), null, 2, null);
                    } else {
                        output$default = event instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PlansLoaded ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiState.Content.copy$default(content, ((com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PlansLoaded) event).getModel(), null, 2, null).updateSectionState(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection.PLANS, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.SectionState.Success.INSTANCE), null, 2, null) : null;
                    }
                    if (output$default == null) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PrequalError.INSTANCE)) {
                            either2 = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(content.updateSectionState(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection.PREQUAL, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.SectionState.Error.INSTANCE), null, 2, null);
                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PlansError.INSTANCE)) {
                            either2 = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(content.updateSectionState(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection.PLANS, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.SectionState.Error.INSTANCE), null, 2, null);
                        } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.ShowError) {
                            either2 = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(content.updateSectionState(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection.PREQUAL, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.SectionState.Error.INSTANCE).updateSectionState(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection.PLANS, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.SectionState.Error.INSTANCE), null, 2, null);
                        }
                        if (either2 != null) {
                            either = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(content, event);
                        } else {
                            output = either2;
                        }
                    }
                }
                either2 = output$default;
                if (either2 != null) {
                }
            }
            either = output;
        } else {
            com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiState.InitialLoading initialLoading = (com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiState.InitialLoading) state;
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.BackPressed.INSTANCE)) {
                either = com.paypal.oslo.core.mvi.ReducerHelperKt.output(initialLoading, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateBack.INSTANCE);
            } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.LoadData) {
                either = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(initialLoading, null, 2, null);
            } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.DataLoaded) {
                either = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiState.Content(((com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.DataLoaded) event).getModel(), kotlin.collections.MapsKt.emptyMap()), null, 2, null);
            } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PartialDataLoaded) {
                com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PartialDataLoaded partialDataLoaded2 = (com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.PartialDataLoaded) event;
                either = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiState.Content(partialDataLoaded2.getModel(), partialDataLoaded2.getSectionStates()), null, 2, null);
            } else if (event instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.ShowError) {
                either = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiState.Content(((com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent.ShowError) event).getModel(), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection.PREQUAL, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.SectionState.Error.INSTANCE), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubSection.PLANS, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.SectionState.Error.INSTANCE))), null, 2, null);
            } else {
                either = com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initialLoading, event);
            }
        }
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.bnplservicing.logger.BnplServLoggerUtilsKt.logBnplServReducerEvent$default(com.paypal.oslo.feature.bnplservicing.LoggerKt.log, getName(), event.getName(), false, 4, null);
            return either;
        }
        if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.bnplservicing.logger.BnplServLoggerUtilsKt.logBnplServReducerEvent(com.paypal.oslo.feature.bnplservicing.LoggerKt.log, getName(), event.getName(), true);
            return either;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
