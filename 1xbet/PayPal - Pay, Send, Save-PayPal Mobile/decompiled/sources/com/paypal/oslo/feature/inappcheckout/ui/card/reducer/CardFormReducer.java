package com.paypal.oslo.feature.inappcheckout.ui.card.reducer;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/card/reducer/CardFormReducer;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$State;", "currentState", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event;", "event", "reduce", "(Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$State;Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$Event;)Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$State;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CardFormReducer {
    public static final int $stable = 0;

    @javax.inject.Inject
    public CardFormReducer() {
    }

    public final com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.State reduce(com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.State currentState, com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event event) {
        com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.State copy;
        com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.State copy2;
        com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.State copy3;
        com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.State copy4;
        com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.State copy5;
        com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.State copy6;
        com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.State copy7;
        com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.State copy8;
        com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.State copy9;
        com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.State copy10;
        com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.State copy11;
        com.paypal.oslo.feature.inappcheckout.domain.entity.CardholderName cardholder;
        com.paypal.oslo.feature.inappcheckout.domain.entity.CardholderName cardholder2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.Initialize) {
            com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.Initialize initialize = (com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.Initialize) event;
            kotlin.Pair<java.lang.Boolean, java.lang.String> determineBillingAddressState = com.paypal.oslo.feature.inappcheckout.ui.util.CardUtilsKt.determineBillingAddressState(initialize.getCardFormData(), initialize.isCardFormDataLoading());
            boolean booleanValue = determineBillingAddressState.component1().booleanValue();
            java.lang.String component2 = determineBillingAddressState.component2();
            com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType operationType = initialize.getOperationType();
            java.lang.String str = null;
            java.lang.String fiId = initialize.getOperationType() == com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType.UPDATE ? initialize.getFiId() : null;
            com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity cardFormData = initialize.getCardFormData();
            com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntity fiMetadata = initialize.getFiMetadata();
            com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails cardDetails = currentState.getCardDetails();
            com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity cardFormData2 = initialize.getCardFormData();
            java.lang.String givenName = (cardFormData2 == null || (cardholder2 = cardFormData2.getCardholder()) == null) ? null : cardholder2.getGivenName();
            if (givenName == null) {
                givenName = "";
            }
            com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity cardFormData3 = initialize.getCardFormData();
            if (cardFormData3 != null && (cardholder = cardFormData3.getCardholder()) != null) {
                str = cardholder.getSurname();
            }
            copy11 = currentState.copy((r28 & 1) != 0 ? currentState.operationType : operationType, (r28 & 2) != 0 ? currentState.fiId : fiId, (r28 & 4) != 0 ? currentState.cardDetails : com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails.copy$default(cardDetails, givenName, str == null ? "" : str, null, null, null, 28, null), (r28 & 8) != 0 ? currentState.billingAddress : null, (r28 & 16) != 0 ? currentState.cardFormDataResponse : cardFormData, (r28 & 32) != 0 ? currentState.fiMetadataResponse : fiMetadata, (r28 & 64) != 0 ? currentState.cardValidations : null, (r28 & 128) != 0 ? currentState.selectedAddressId : component2, (r28 & 256) != 0 ? currentState.isBillingAddressExpanded : booleanValue, (r28 & 512) != 0 ? currentState.isLoading : false, (r28 & 1024) != 0 ? currentState.isSaveButtonClicked : false, (r28 & 2048) != 0 ? currentState.error : null, (r28 & 4096) != 0 ? currentState.stateList : null);
            return copy11;
        }
        if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.UpdateUserInput) {
            com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.UserInput userInput = ((com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.UpdateUserInput) event).getUserInput();
            if (!(userInput instanceof com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.UserInput.CardDetailsInput)) {
                if (!(userInput instanceof com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.UserInput.BillingAddressInput)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                copy9 = currentState.copy((r28 & 1) != 0 ? currentState.operationType : null, (r28 & 2) != 0 ? currentState.fiId : null, (r28 & 4) != 0 ? currentState.cardDetails : null, (r28 & 8) != 0 ? currentState.billingAddress : ((com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.UserInput.BillingAddressInput) userInput).getBillingAddress(), (r28 & 16) != 0 ? currentState.cardFormDataResponse : null, (r28 & 32) != 0 ? currentState.fiMetadataResponse : null, (r28 & 64) != 0 ? currentState.cardValidations : null, (r28 & 128) != 0 ? currentState.selectedAddressId : null, (r28 & 256) != 0 ? currentState.isBillingAddressExpanded : false, (r28 & 512) != 0 ? currentState.isLoading : false, (r28 & 1024) != 0 ? currentState.isSaveButtonClicked : false, (r28 & 2048) != 0 ? currentState.error : null, (r28 & 4096) != 0 ? currentState.stateList : null);
                return copy9;
            }
            copy10 = currentState.copy((r28 & 1) != 0 ? currentState.operationType : null, (r28 & 2) != 0 ? currentState.fiId : null, (r28 & 4) != 0 ? currentState.cardDetails : ((com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.UserInput.CardDetailsInput) userInput).getCardDetails(), (r28 & 8) != 0 ? currentState.billingAddress : null, (r28 & 16) != 0 ? currentState.cardFormDataResponse : null, (r28 & 32) != 0 ? currentState.fiMetadataResponse : null, (r28 & 64) != 0 ? currentState.cardValidations : null, (r28 & 128) != 0 ? currentState.selectedAddressId : null, (r28 & 256) != 0 ? currentState.isBillingAddressExpanded : false, (r28 & 512) != 0 ? currentState.isLoading : false, (r28 & 1024) != 0 ? currentState.isSaveButtonClicked : false, (r28 & 2048) != 0 ? currentState.error : null, (r28 & 4096) != 0 ? currentState.stateList : null);
            return copy10;
        }
        if (!(event instanceof com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.AddressSelected)) {
            if (!(event instanceof com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.UpdateStateList)) {
                if (!(event instanceof com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.AddBillingAddressClicked)) {
                    if (!(event instanceof com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.CancelBillingAddressClicked)) {
                        if (!(event instanceof com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.SaveCardClicked)) {
                            if (!(event instanceof com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.OnSaveCardSuccess)) {
                                if (!(event instanceof com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.OnSaveCardFailure)) {
                                    if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.BackClicked) {
                                        return currentState;
                                    }
                                    if (!(event instanceof com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.SetCardValidations)) {
                                        throw new kotlin.NoWhenBranchMatchedException();
                                    }
                                    com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.SetCardValidations setCardValidations = (com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.SetCardValidations) event;
                                    com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition cardValidations = setCardValidations.getCardValidations();
                                    com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails cardDetails2 = currentState.getCardDetails();
                                    java.lang.String maskedCardNumber = setCardValidations.getMaskedCardNumber();
                                    if (maskedCardNumber == null) {
                                        maskedCardNumber = currentState.getCardDetails().getCardNumber();
                                    }
                                    copy = currentState.copy((r28 & 1) != 0 ? currentState.operationType : null, (r28 & 2) != 0 ? currentState.fiId : null, (r28 & 4) != 0 ? currentState.cardDetails : com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails.copy$default(cardDetails2, null, null, maskedCardNumber, null, null, 27, null), (r28 & 8) != 0 ? currentState.billingAddress : null, (r28 & 16) != 0 ? currentState.cardFormDataResponse : null, (r28 & 32) != 0 ? currentState.fiMetadataResponse : null, (r28 & 64) != 0 ? currentState.cardValidations : cardValidations, (r28 & 128) != 0 ? currentState.selectedAddressId : null, (r28 & 256) != 0 ? currentState.isBillingAddressExpanded : false, (r28 & 512) != 0 ? currentState.isLoading : false, (r28 & 1024) != 0 ? currentState.isSaveButtonClicked : false, (r28 & 2048) != 0 ? currentState.error : null, (r28 & 4096) != 0 ? currentState.stateList : null);
                                    return copy;
                                }
                                copy2 = currentState.copy((r28 & 1) != 0 ? currentState.operationType : null, (r28 & 2) != 0 ? currentState.fiId : null, (r28 & 4) != 0 ? currentState.cardDetails : null, (r28 & 8) != 0 ? currentState.billingAddress : null, (r28 & 16) != 0 ? currentState.cardFormDataResponse : null, (r28 & 32) != 0 ? currentState.fiMetadataResponse : null, (r28 & 64) != 0 ? currentState.cardValidations : null, (r28 & 128) != 0 ? currentState.selectedAddressId : null, (r28 & 256) != 0 ? currentState.isBillingAddressExpanded : false, (r28 & 512) != 0 ? currentState.isLoading : false, (r28 & 1024) != 0 ? currentState.isSaveButtonClicked : false, (r28 & 2048) != 0 ? currentState.error : ((com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.OnSaveCardFailure) event).getError(), (r28 & 4096) != 0 ? currentState.stateList : null);
                                return copy2;
                            }
                            copy3 = currentState.copy((r28 & 1) != 0 ? currentState.operationType : null, (r28 & 2) != 0 ? currentState.fiId : null, (r28 & 4) != 0 ? currentState.cardDetails : null, (r28 & 8) != 0 ? currentState.billingAddress : null, (r28 & 16) != 0 ? currentState.cardFormDataResponse : null, (r28 & 32) != 0 ? currentState.fiMetadataResponse : null, (r28 & 64) != 0 ? currentState.cardValidations : null, (r28 & 128) != 0 ? currentState.selectedAddressId : null, (r28 & 256) != 0 ? currentState.isBillingAddressExpanded : false, (r28 & 512) != 0 ? currentState.isLoading : false, (r28 & 1024) != 0 ? currentState.isSaveButtonClicked : false, (r28 & 2048) != 0 ? currentState.error : null, (r28 & 4096) != 0 ? currentState.stateList : null);
                            return copy3;
                        }
                        copy4 = currentState.copy((r28 & 1) != 0 ? currentState.operationType : null, (r28 & 2) != 0 ? currentState.fiId : null, (r28 & 4) != 0 ? currentState.cardDetails : null, (r28 & 8) != 0 ? currentState.billingAddress : null, (r28 & 16) != 0 ? currentState.cardFormDataResponse : null, (r28 & 32) != 0 ? currentState.fiMetadataResponse : null, (r28 & 64) != 0 ? currentState.cardValidations : null, (r28 & 128) != 0 ? currentState.selectedAddressId : null, (r28 & 256) != 0 ? currentState.isBillingAddressExpanded : false, (r28 & 512) != 0 ? currentState.isLoading : true, (r28 & 1024) != 0 ? currentState.isSaveButtonClicked : true, (r28 & 2048) != 0 ? currentState.error : null, (r28 & 4096) != 0 ? currentState.stateList : null);
                        return copy4;
                    }
                    copy5 = currentState.copy((r28 & 1) != 0 ? currentState.operationType : null, (r28 & 2) != 0 ? currentState.fiId : null, (r28 & 4) != 0 ? currentState.cardDetails : null, (r28 & 8) != 0 ? currentState.billingAddress : new com.paypal.oslo.feature.inappcheckout.domain.model.BillingAddress(null, null, null, null, null, 31, null), (r28 & 16) != 0 ? currentState.cardFormDataResponse : null, (r28 & 32) != 0 ? currentState.fiMetadataResponse : null, (r28 & 64) != 0 ? currentState.cardValidations : null, (r28 & 128) != 0 ? currentState.selectedAddressId : null, (r28 & 256) != 0 ? currentState.isBillingAddressExpanded : false, (r28 & 512) != 0 ? currentState.isLoading : false, (r28 & 1024) != 0 ? currentState.isSaveButtonClicked : false, (r28 & 2048) != 0 ? currentState.error : null, (r28 & 4096) != 0 ? currentState.stateList : null);
                    return copy5;
                }
                copy6 = currentState.copy((r28 & 1) != 0 ? currentState.operationType : null, (r28 & 2) != 0 ? currentState.fiId : null, (r28 & 4) != 0 ? currentState.cardDetails : null, (r28 & 8) != 0 ? currentState.billingAddress : null, (r28 & 16) != 0 ? currentState.cardFormDataResponse : null, (r28 & 32) != 0 ? currentState.fiMetadataResponse : null, (r28 & 64) != 0 ? currentState.cardValidations : null, (r28 & 128) != 0 ? currentState.selectedAddressId : null, (r28 & 256) != 0 ? currentState.isBillingAddressExpanded : true, (r28 & 512) != 0 ? currentState.isLoading : false, (r28 & 1024) != 0 ? currentState.isSaveButtonClicked : false, (r28 & 2048) != 0 ? currentState.error : null, (r28 & 4096) != 0 ? currentState.stateList : null);
                return copy6;
            }
            copy7 = currentState.copy((r28 & 1) != 0 ? currentState.operationType : null, (r28 & 2) != 0 ? currentState.fiId : null, (r28 & 4) != 0 ? currentState.cardDetails : null, (r28 & 8) != 0 ? currentState.billingAddress : null, (r28 & 16) != 0 ? currentState.cardFormDataResponse : null, (r28 & 32) != 0 ? currentState.fiMetadataResponse : null, (r28 & 64) != 0 ? currentState.cardValidations : null, (r28 & 128) != 0 ? currentState.selectedAddressId : null, (r28 & 256) != 0 ? currentState.isBillingAddressExpanded : false, (r28 & 512) != 0 ? currentState.isLoading : false, (r28 & 1024) != 0 ? currentState.isSaveButtonClicked : false, (r28 & 2048) != 0 ? currentState.error : null, (r28 & 4096) != 0 ? currentState.stateList : ((com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.UpdateStateList) event).getStateList());
            return copy7;
        }
        copy8 = currentState.copy((r28 & 1) != 0 ? currentState.operationType : null, (r28 & 2) != 0 ? currentState.fiId : null, (r28 & 4) != 0 ? currentState.cardDetails : null, (r28 & 8) != 0 ? currentState.billingAddress : null, (r28 & 16) != 0 ? currentState.cardFormDataResponse : null, (r28 & 32) != 0 ? currentState.fiMetadataResponse : null, (r28 & 64) != 0 ? currentState.cardValidations : null, (r28 & 128) != 0 ? currentState.selectedAddressId : ((com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.AddressSelected) event).getAddressId(), (r28 & 256) != 0 ? currentState.isBillingAddressExpanded : false, (r28 & 512) != 0 ? currentState.isLoading : false, (r28 & 1024) != 0 ? currentState.isSaveButtonClicked : false, (r28 & 2048) != 0 ? currentState.error : null, (r28 & 4096) != 0 ? currentState.stateList : null);
        return copy8;
    }
}
