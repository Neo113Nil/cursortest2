package com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000b0\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionState;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionEvent;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionEffect;", "<init>", "()V", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionState;Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/mvi/AddressSelectionEvent;)Larrow/core/Either;", "", "getName", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressSelectionReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState, com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent, com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public AddressSelectionReducer() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ad, code lost:
    
        if (r14 == null) goto L38;
     */
    @Override // com.paypal.oslo.core.mvi.Reducer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState, com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEffect>> reduce(com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState state, com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent event) {
        java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress> addresses;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.DismissAddressSelection) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Initial.INSTANCE, null, 2, null);
        }
        if (state instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Initial) {
            return event instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.LoadAddresses ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Loading(0, 1, null), null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent((com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Initial) state, event);
        }
        if (!(state instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Loading)) {
            if (!(state instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Success)) {
                if (!(state instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Saving)) {
                    if (!(state instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Error)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Error error = (com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Error) state;
                    if (event instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.LoadAddresses) {
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Loading(error.getRetryCount() + 1), null, 2, null);
                    }
                    if (event instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.SaveAddress) {
                        com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionRetryType apiRetryType = error.getApiRetryType();
                        com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionRetryType.SaveAddress saveAddress = apiRetryType instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionRetryType.SaveAddress ? (com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionRetryType.SaveAddress) apiRetryType : null;
                        if (saveAddress == null) {
                            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "SaveAddress event received but current error is not from SaveAddress API call", null, null, null, 14, null);
                        } else {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Saving(saveAddress.getAddresses(), saveAddress.getSelectedIndex(), saveAddress.getDebitInstrumentId(), error.getRetryCount() + 1), null, 2, null);
                        }
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(error, event);
                }
                com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Saving saving = (com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Saving) state;
                if (event instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.LoadAddresses) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Loading(0, 1, null), null, 2, null);
                }
                if (event instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.SaveSuccessful) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Success(saving.getAddresses(), java.lang.Integer.valueOf(saving.getSelectedIndex()), saving.getDebitInstrumentId(), 0, 8, null), new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEffect.AddressSaved((com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress) kotlin.collections.CollectionsKt.getOrNull(saving.getAddresses(), saving.getSelectedIndex())));
                }
                if (event instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.SaveFailed) {
                    com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.SaveFailed saveFailed = (com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.SaveFailed) event;
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Error(saveFailed.getErrorCode(), saveFailed.getErrorType(), saving.getRetryCount(), new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionRetryType.SaveAddress(saving.getAddresses(), saving.getSelectedIndex(), saving.getDebitInstrumentId())), null, 2, null);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(saving, event);
            }
            com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Success success = (com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Success) state;
            if (event instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.LoadAddresses) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Loading(0, 1, null), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.AddressSelected) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Success.copy$default(success, null, java.lang.Integer.valueOf(((com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.AddressSelected) event).getIndex()), null, 0, 13, null), null, 2, null);
            }
            if (event instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.AddNewAddressClicked) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(success, com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEffect.NavigateToAddAddress.INSTANCE);
            }
            if (event instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.SaveAddress) {
                if (success.getSelectedIndex() != null) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Saving(success.getAddresses(), success.getSelectedIndex().intValue(), success.getDebitInstrumentId(), 0, 8, null), null, 2, null);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(success, null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(success, event);
        }
        com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Loading loading = (com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Loading) state;
        if (event instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.AddressesLoaded) {
            com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.AddressesLoaded addressesLoaded = (com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.AddressesLoaded) event;
            java.lang.String newlyAddedAddressId = addressesLoaded.getNewlyAddedAddressId();
            if (newlyAddedAddressId != null) {
                java.util.Iterator<T> it = addressesLoaded.getAddresses().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress) obj).getId(), newlyAddedAddressId)) {
                        break;
                    }
                }
                com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress debitCardAddress = (com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress) obj;
                if (debitCardAddress != null) {
                    java.util.List listOf = kotlin.collections.CollectionsKt.listOf(debitCardAddress);
                    java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress> addresses2 = addressesLoaded.getAddresses();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj2 : addresses2) {
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress) obj2).getId(), newlyAddedAddressId)) {
                            arrayList.add(obj2);
                        }
                    }
                    addresses = kotlin.collections.CollectionsKt.plus((java.util.Collection) listOf, (java.lang.Iterable) arrayList);
                } else {
                    addresses = null;
                }
            }
            addresses = addressesLoaded.getAddresses();
            java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress> list = addresses;
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Success(list, !list.isEmpty() ? 0 : null, addressesLoaded.getDebitInstrumentId(), 0, 8, null), null, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.LoadingFailed) {
            com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.LoadingFailed loadingFailed = (com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionEvent.LoadingFailed) event;
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionState.Error(loadingFailed.getErrorCode(), loadingFailed.getErrorType(), loading.getRetryCount(), new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionRetryType.ListAddresses(loadingFailed.getNewlyAddedAddressId())), null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(loading, event);
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "AddressSelectionReducer";
    }
}
