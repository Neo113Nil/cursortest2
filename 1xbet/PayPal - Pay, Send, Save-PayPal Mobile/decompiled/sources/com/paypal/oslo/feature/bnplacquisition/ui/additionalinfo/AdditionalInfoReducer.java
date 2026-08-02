package com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000b0\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiEffect;", "<init>", "()V", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiState;Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent;)Larrow/core/Either;", "", "getName", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdditionalInfoReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState, com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent, com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public AdditionalInfoReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState, com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiEffect>> reduce(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState state, com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent event) {
        com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel copy;
        com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel copy2;
        com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel copy3;
        com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel copy4;
        com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel copy5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (state instanceof com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Loading) {
            com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Loading loading = (com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Loading) state;
            return event instanceof com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Initialize ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(loading, null, 2, null) : event instanceof com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Initialized ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Success(((com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Initialized) event).getUiModel()), null, 2, null) : kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.BackPressed.INSTANCE) ? com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiEffect.NavigateBack.INSTANCE) : kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ClosePressed.INSTANCE) ? com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiEffect.CloseAcquisition.INSTANCE) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
        }
        if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Success)) {
            if (state instanceof com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Error) {
                com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Error error = (com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Error) state;
                return kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ErrorBackPressed.INSTANCE) ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Success(error.getData()), null, 2, null) : kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ClosePressed.INSTANCE) ? com.paypal.oslo.core.mvi.ReducerHelperKt.output(error, com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiEffect.CloseAcquisition.INSTANCE) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
            }
            if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Decline)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Decline decline = (com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Decline) state;
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.DeclineClosePressed.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ClosePressed.INSTANCE)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(decline, com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiEffect.CloseAcquisition.INSTANCE);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(decline, event);
        }
        com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Success success = (com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Success) state;
        if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.FieldValueChanged) {
            com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.FieldValueChanged fieldValueChanged = (com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.FieldValueChanged) event;
            copy5 = r7.copy((r26 & 1) != 0 ? r7.nationalIdentificationFieldRows : com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldExtensionsKt.updateFormFieldValueById(success.getData().getNationalIdentificationFieldRows(), fieldValueChanged.getFieldId(), fieldValueChanged.getValue()), (r26 & 2) != 0 ? r7.incomeFieldRows : com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldExtensionsKt.updateFormFieldValueById(success.getData().getIncomeFieldRows(), fieldValueChanged.getFieldId(), fieldValueChanged.getValue()), (r26 & 4) != 0 ? r7.formattedAmount : null, (r26 & 8) != 0 ? r7.selectedOfferId : null, (r26 & 16) != 0 ? r7.isLoading : false, (r26 & 32) != 0 ? r7.screenTitle : null, (r26 & 64) != 0 ? r7.screenDescription : null, (r26 & 128) != 0 ? r7.continueButtonText : null, (r26 & 256) != 0 ? r7.incomeGuidanceTitle : null, (r26 & 512) != 0 ? r7.incomeGuidanceBody : null, (r26 & 1024) != 0 ? r7.incomeGuidanceDoneButtonText : null, (r26 & 2048) != 0 ? success.getData().toolBarContent : null);
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success.copy(copy5), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.FieldValidated) {
            com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.FieldValidated fieldValidated = (com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.FieldValidated) event;
            copy4 = r7.copy((r26 & 1) != 0 ? r7.nationalIdentificationFieldRows : com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldExtensionsKt.updateFormFieldById(success.getData().getNationalIdentificationFieldRows(), fieldValidated.getFieldId(), fieldValidated.getValidatedModel()), (r26 & 2) != 0 ? r7.incomeFieldRows : com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldExtensionsKt.updateFormFieldById(success.getData().getIncomeFieldRows(), fieldValidated.getFieldId(), fieldValidated.getValidatedModel()), (r26 & 4) != 0 ? r7.formattedAmount : null, (r26 & 8) != 0 ? r7.selectedOfferId : null, (r26 & 16) != 0 ? r7.isLoading : false, (r26 & 32) != 0 ? r7.screenTitle : null, (r26 & 64) != 0 ? r7.screenDescription : null, (r26 & 128) != 0 ? r7.continueButtonText : null, (r26 & 256) != 0 ? r7.incomeGuidanceTitle : null, (r26 & 512) != 0 ? r7.incomeGuidanceBody : null, (r26 & 1024) != 0 ? r7.incomeGuidanceDoneButtonText : null, (r26 & 2048) != 0 ? success.getData().toolBarContent : null);
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success.copy(copy4), null, 2, null);
        }
        if ((event instanceof com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ValidateField) || (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.PasteValue)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success, null, 2, null);
        }
        if (!(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Continue)) {
            if (!(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ApiSuccess)) {
                if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ApiError) {
                    com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel errorContent = ((com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ApiError) event).getErrorContent();
                    copy = r5.copy((r26 & 1) != 0 ? r5.nationalIdentificationFieldRows : null, (r26 & 2) != 0 ? r5.incomeFieldRows : null, (r26 & 4) != 0 ? r5.formattedAmount : null, (r26 & 8) != 0 ? r5.selectedOfferId : null, (r26 & 16) != 0 ? r5.isLoading : false, (r26 & 32) != 0 ? r5.screenTitle : null, (r26 & 64) != 0 ? r5.screenDescription : null, (r26 & 128) != 0 ? r5.continueButtonText : null, (r26 & 256) != 0 ? r5.incomeGuidanceTitle : null, (r26 & 512) != 0 ? r5.incomeGuidanceBody : null, (r26 & 1024) != 0 ? r5.incomeGuidanceDoneButtonText : null, (r26 & 2048) != 0 ? success.getData().toolBarContent : null);
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Error(errorContent, copy), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ApplicationDeclined) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Decline(((com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ApplicationDeclined) event).getDeclineContent()), null, 2, null);
                }
                return kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.BackPressed.INSTANCE) ? com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiEffect.NavigateBack.INSTANCE) : kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ClosePressed.INSTANCE) ? com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiEffect.CloseAcquisition.INSTANCE) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
            }
            copy2 = r5.copy((r26 & 1) != 0 ? r5.nationalIdentificationFieldRows : null, (r26 & 2) != 0 ? r5.incomeFieldRows : null, (r26 & 4) != 0 ? r5.formattedAmount : null, (r26 & 8) != 0 ? r5.selectedOfferId : null, (r26 & 16) != 0 ? r5.isLoading : false, (r26 & 32) != 0 ? r5.screenTitle : null, (r26 & 64) != 0 ? r5.screenDescription : null, (r26 & 128) != 0 ? r5.continueButtonText : null, (r26 & 256) != 0 ? r5.incomeGuidanceTitle : null, (r26 & 512) != 0 ? r5.incomeGuidanceBody : null, (r26 & 1024) != 0 ? r5.incomeGuidanceDoneButtonText : null, (r26 & 2048) != 0 ? success.getData().toolBarContent : null);
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success.copy(copy2), new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiEffect.NavigateToReviewTerms(((com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ApiSuccess) event).getReviewTermsSuccess()));
        }
        com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Continue r1 = (com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Continue) event;
        if (!(r1 instanceof com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Continue.Valid)) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(r1, com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Continue.Pressed.INSTANCE)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success, null, 2, null);
            }
            if (!(r1 instanceof com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Continue.Invalid)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success.copy(((com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Continue.Invalid) r1).getUiModel()), null, 2, null);
        }
        copy3 = r5.copy((r26 & 1) != 0 ? r5.nationalIdentificationFieldRows : null, (r26 & 2) != 0 ? r5.incomeFieldRows : null, (r26 & 4) != 0 ? r5.formattedAmount : null, (r26 & 8) != 0 ? r5.selectedOfferId : null, (r26 & 16) != 0 ? r5.isLoading : true, (r26 & 32) != 0 ? r5.screenTitle : null, (r26 & 64) != 0 ? r5.screenDescription : null, (r26 & 128) != 0 ? r5.continueButtonText : null, (r26 & 256) != 0 ? r5.incomeGuidanceTitle : null, (r26 & 512) != 0 ? r5.incomeGuidanceBody : null, (r26 & 1024) != 0 ? r5.incomeGuidanceDoneButtonText : null, (r26 & 2048) != 0 ? success.getData().toolBarContent : null);
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success.copy(copy3), null, 2, null);
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "AdditionalInfoReducer";
    }
}
