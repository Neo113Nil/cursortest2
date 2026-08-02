package com.paypal.oslo.feature.bnplacquisition.ui.address.overview;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000b0\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewUiEffect;", "<init>", "()V", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewUiState;Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewEvent;)Larrow/core/Either;", "", "getName", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AddressOverviewReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiState, com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent, com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public AddressOverviewReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiState, com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiEffect>> reduce(com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiState state, com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent event) {
        arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiState, com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiEffect>> output;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiState.Loading)) {
            if (!(state instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiState.Success)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiState.Success success = (com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiState.Success) state;
            if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.LoadAddresses) {
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiState.Loading.INSTANCE, null, 2, null);
            } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.AddressSelected) {
                java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressItemUiModel> addresses = success.getUiModel().getAddresses();
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(addresses, 10));
                for (com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressItemUiModel addressItemUiModel : addresses) {
                    arrayList.add(com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressItemUiModel.copy$default(addressItemUiModel, null, null, null, kotlin.jvm.internal.Intrinsics.areEqual(addressItemUiModel.getId(), ((com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.AddressSelected) event).getAddressId()), null, 23, null));
                }
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success.copy(com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiModel.copy$default(success.getUiModel(), arrayList, ((com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.AddressSelected) event).getAddressId(), null, null, null, null, 60, null)), null, 2, null);
            } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.AddNewAddressPressed) {
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiEffect.NavigateToAddAddress.INSTANCE);
            } else if (!(event instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.DonePressed)) {
                output = event instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.ClosePressed ? com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiEffect.NavigateBack.INSTANCE) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
            } else {
                java.util.Iterator<T> it = success.getUiModel().getAddresses().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressItemUiModel) obj).getId(), success.getUiModel().getSelectedAddressId())) {
                        break;
                    }
                }
                com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressItemUiModel addressItemUiModel2 = (com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressItemUiModel) obj;
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiEffect.AddressUpdated(addressItemUiModel2 != null ? addressItemUiModel2.getAddress() : null));
            }
        } else {
            com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiState.Loading loading = (com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiState.Loading) state;
            if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.LoadAddresses) {
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(loading, null, 2, null);
            } else if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.AddressesFormatted) {
                output = com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiState.Success(((com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.AddressesFormatted) event).getUiModel()), null, 2, null);
            } else {
                output = event instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.ClosePressed ? com.paypal.oslo.core.mvi.ReducerHelperKt.output(loading, com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiEffect.NavigateBack.INSTANCE) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
            }
        }
        com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerUtilsKt.logBnplAcqReducerEvent(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, getName(), output.isLeft() ? com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerConstants.UNEXPECTED_EVENT : event.getName(), output.isLeft());
        return output;
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "AddressOverviewReducer";
    }
}
