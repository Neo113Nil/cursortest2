package com.paypal.oslo.feature.bnplacquisition.ui.address.add;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000b0\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddUiEffect;", "<init>", "()V", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddUiState;Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent;)Larrow/core/Either;", "", "getName", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AddressAddReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiState, com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent, com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public AddressAddReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiState, com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiEffect>> reduce(com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiState state, com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent event) {
        arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiState, com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiEffect>> output;
        java.lang.Object obj;
        java.lang.String scrollKey;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiEffect.ScrollToFirstError scrollToFirstError = null;
        if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiState.Loading)) {
            if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiState.Success)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiState.Success success = (com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiState.Success) state;
            if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.FetchAddressLayout) {
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiState.Loading.INSTANCE, null, 2, null);
            } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.FieldValueChanged) {
                com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.FieldValueChanged fieldValueChanged = (com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.FieldValueChanged) event;
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success.copy(success.getUiModel().updateFormFieldValueById(fieldValueChanged.getFieldId(), fieldValueChanged.getValue())), null, 2, null);
            } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.ValidateField) {
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success, null, 2, null);
            } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.FieldValidated) {
                com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.FieldValidated fieldValidated = (com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.FieldValidated) event;
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success.copy(success.getUiModel().updateFormFieldById(fieldValidated.getFieldId(), fieldValidated.getValidatedModel())), null, 2, null);
            } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.Save.Pressed) {
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success, null, 2, null);
            } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.Save.Valid) {
                com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.Save.Valid valid = (com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.Save.Valid) event;
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success.copy(valid.getUiModel()), new com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiEffect.AddressUpdated(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldExtensionsKt.toAddressI18n$default(valid.getUiModel().getAddressFieldRows(), null, 1, null)));
            } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.Save.Invalid) {
                com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.Save.Invalid invalid = (com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.Save.Invalid) event;
                java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldRow> addressFieldRows = invalid.getUiModel().getAddressFieldRows();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator<T> it = addressFieldRows.iterator();
                while (it.hasNext()) {
                    kotlin.collections.CollectionsKt.addAll(arrayList, ((com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldRow) it.next()).getList());
                }
                java.util.Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (((com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel) obj).isError()) {
                        break;
                    }
                }
                com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel formFieldModel = (com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel) obj;
                if (formFieldModel != null && (scrollKey = formFieldModel.getScrollKey()) != null) {
                    scrollToFirstError = new com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiEffect.ScrollToFirstError(scrollKey);
                }
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success.copy(invalid.getUiModel()), scrollToFirstError);
            } else {
                output = event instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.ClosePressed ? com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiEffect.NavigateBack.INSTANCE) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
            }
        } else {
            com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiState.Loading loading = (com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiState.Loading) state;
            if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.FetchAddressLayout) {
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(loading, null, 2, null);
            } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.AddressFieldsBuilt) {
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiState.Success(((com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.AddressFieldsBuilt) event).getUiModel()), null, 2, null);
            } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.ClosePressed) {
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiEffect.NavigateBack.INSTANCE);
            } else {
                output = event instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.LayoutFailedToLoad ? com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiEffect.LayoutFailedToLoad.INSTANCE) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
            }
        }
        com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerUtilsKt.logBnplAcqReducerEvent(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, getName(), output.isLeft() ? com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerConstants.UNEXPECTED_EVENT : event.getName(), output.isLeft());
        return output;
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "AddressAddReducer";
    }
}
