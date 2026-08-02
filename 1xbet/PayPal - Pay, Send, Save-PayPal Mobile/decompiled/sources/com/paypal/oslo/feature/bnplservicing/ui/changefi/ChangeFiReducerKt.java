package com.paypal.oslo.feature.bnplservicing.ui.changefi;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aA\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiState$Success;", "p0", "", "p1", "p2", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiState;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiEffect;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiUiState$Success;Ljava/lang/Boolean;Z)Larrow/core/Either;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ChangeFiReducerKt {
    private static final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect>> getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.Success success, java.lang.Boolean bool, boolean z) {
        java.lang.Object obj;
        com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.Success success2 = success;
        java.util.Iterator<T> it = success.getUiModel().getFundingInstruments().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel) obj).isSelected()) {
                break;
            }
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success2, new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.DismissChangeFiHalfSheet(bool, (com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel) obj, z, success.getUiModel().getFundingInstruments()));
    }

    public static final /* synthetic */ arrow.core.Either access$reduceErrorState(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState changeFiUiState, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent changeFiEvent) {
        if ((changeFiEvent instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnClose) || (changeFiEvent instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnDismiss)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(changeFiUiState, null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(changeFiUiState, changeFiEvent);
    }

    public static final /* synthetic */ arrow.core.Either access$reduceSuccessState(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.Success success, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent changeFiEvent) {
        com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetUiModel copy;
        com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetUiModel copy2;
        if (changeFiEvent instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnClose) {
            com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnClose onClose = (com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnClose) changeFiEvent;
            return getHighSpeedVideoFpsRanges(success, onClose.getNewFiAdded(), onClose.getPaymentUpdated());
        }
        if (changeFiEvent instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnDismiss) {
            return getHighSpeedVideoFpsRanges(success, ((com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnDismiss) changeFiEvent).getNewFiAdded(), false);
        }
        java.lang.Object obj = null;
        if (changeFiEvent instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnReset) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.Reset.INSTANCE, null, 2, null);
        }
        if (changeFiEvent instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnRefreshWithNewFi) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.Loading.INSTANCE, null, 2, null);
        }
        if (changeFiEvent instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnAddFiClicked) {
            com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnAddFiClicked onAddFiClicked = (com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnAddFiClicked) changeFiEvent;
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.NavigateToAddFundingInstrument(onAddFiClicked.getType(), onAddFiClicked.getNewFiAdded()));
        }
        if (changeFiEvent instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnConfirmClicked) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.UpdatingPaymentMethod(success.getUiModel()), null, 2, null);
        }
        if (changeFiEvent instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnAgreementLinkClicked) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.OpenAgreementLink(((com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnAgreementLinkClicked) changeFiEvent).getUrl()));
        }
        if (changeFiEvent instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnFiSelected) {
            if (success.getUiModel().getShouldSelectOnClick()) {
                java.util.Iterator<T> it = success.getUiModel().getFundingInstruments().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel) next).getFundingInstrument().getId(), ((com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnFiSelected) changeFiEvent).getFundingInstrument().getId())) {
                        obj = next;
                        break;
                    }
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.DismissChangeFiHalfSheet(((com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnFiSelected) changeFiEvent).getNewFiAdded(), (com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel) obj, false, success.getUiModel().getFundingInstruments(), 4, null));
            }
            java.util.List<com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel> fundingInstruments = success.getUiModel().getFundingInstruments();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(fundingInstruments, 10));
            for (com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrumentUiModel : fundingInstruments) {
                arrayList.add(new com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel(fundingInstrumentUiModel.getFundingInstrument(), fundingInstrumentUiModel.getTitle(), fundingInstrumentUiModel.getSubTitle(), kotlin.jvm.internal.Intrinsics.areEqual(fundingInstrumentUiModel.getFundingInstrument().getId(), ((com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnFiSelected) changeFiEvent).getFundingInstrument().getId()), null, 16, null));
            }
            copy2 = r15.copy((r26 & 1) != 0 ? r15.creditAccountId : null, (r26 & 2) != 0 ? r15.cpi : null, (r26 & 4) != 0 ? r15.content : null, (r26 & 8) != 0 ? r15.fundingInstruments : arrayList, (r26 & 16) != 0 ? r15.addFundingInstruments : null, (r26 & 32) != 0 ? r15.flowType : null, (r26 & 64) != 0 ? r15.showAgreementText : false, (r26 & 128) != 0 ? r15.agreementLink : null, (r26 & 256) != 0 ? r15.showButton : false, (r26 & 512) != 0 ? r15.newlyAddedFiIds : null, (r26 & 1024) != 0 ? r15.showIneligibleFiAlert : false, (r26 & 2048) != 0 ? success.getUiModel().missingFiError : false);
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.Success(copy2), null, 2, null);
        }
        if (!(changeFiEvent instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnMissingFundingInstrument)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, changeFiEvent);
        }
        copy = r5.copy((r26 & 1) != 0 ? r5.creditAccountId : null, (r26 & 2) != 0 ? r5.cpi : null, (r26 & 4) != 0 ? r5.content : null, (r26 & 8) != 0 ? r5.fundingInstruments : null, (r26 & 16) != 0 ? r5.addFundingInstruments : null, (r26 & 32) != 0 ? r5.flowType : null, (r26 & 64) != 0 ? r5.showAgreementText : false, (r26 & 128) != 0 ? r5.agreementLink : null, (r26 & 256) != 0 ? r5.showButton : false, (r26 & 512) != 0 ? r5.newlyAddedFiIds : null, (r26 & 1024) != 0 ? r5.showIneligibleFiAlert : false, (r26 & 2048) != 0 ? success.getUiModel().missingFiError : true);
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.Success(copy), null, 2, null);
    }

    public static final /* synthetic */ arrow.core.Either access$reduceUpdatingPaymentMethodState(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.UpdatingPaymentMethod updatingPaymentMethod, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent changeFiEvent) {
        if (changeFiEvent instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnUpdateFiSuccess) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(updatingPaymentMethod, null, 2, null);
        }
        if (changeFiEvent instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.ShowUpdatePaymentSuccess) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(updatingPaymentMethod, new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.NavigateToUpdatePaymentMethodSuccess(((com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.ShowUpdatePaymentSuccess) changeFiEvent).getUiModel()));
        }
        if (changeFiEvent instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnClose) {
            com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnClose onClose = (com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnClose) changeFiEvent;
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(updatingPaymentMethod, new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.DismissChangeFiHalfSheet(onClose.getNewFiAdded(), null, onClose.getPaymentUpdated(), null, 8, null));
        }
        if (changeFiEvent instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnDismiss) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(updatingPaymentMethod, new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiEffect.DismissChangeFiHalfSheet(((com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnDismiss) changeFiEvent).getNewFiAdded(), null, false, null, 8, null));
        }
        if (!(changeFiEvent instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnUpdateFiError)) {
            return changeFiEvent instanceof com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnReset ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.Reset.INSTANCE, null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(updatingPaymentMethod, changeFiEvent);
        }
        com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnUpdateFiError onUpdateFiError = (com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiEvent.OnUpdateFiError) changeFiEvent;
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiUiState.Error(onUpdateFiError.getCorrelationId(), onUpdateFiError.getCreditAccountId(), onUpdateFiError.getCreditProductIdentifier(), onUpdateFiError.getFundingInstrument()), null, 2, null);
    }
}
