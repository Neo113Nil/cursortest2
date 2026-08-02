package com.paypal.oslo.feature.inappcheckout.ui.instantvault.reducer;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/reducer/InstantVaultReducer;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$State;", "currentState", "Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Event;", "event", "reduce", "(Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$State;Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$Event;)Lcom/paypal/oslo/feature/inappcheckout/ui/instantvault/contract/InstantVaultContract$State;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InstantVaultReducer {
    public static final int $stable = 0;

    @javax.inject.Inject
    public InstantVaultReducer() {
    }

    public final com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.State reduce(com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.State currentState, com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event event) {
        com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.State copy;
        com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.State copy2;
        com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.State copy3;
        com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.State copy4;
        com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.State copy5;
        com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.State copy6;
        com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.State copy7;
        com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.State copy8;
        com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.State copy9;
        com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.State copy10;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(event instanceof com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnContent)) {
            if (!(event instanceof com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnAgreeAndContinue)) {
                if (!(event instanceof com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnAuthorizeBACreationSuccess)) {
                    if (!(event instanceof com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnAuthorizeBACreationContingency)) {
                        if (!(event instanceof com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnAuthorizeBACreationFailure)) {
                            if (!(event instanceof com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnContingencyNotHandled)) {
                                if (!(event instanceof com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnContingencyError)) {
                                    if ((event instanceof com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.RetryLastOperation) || (event instanceof com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.ReturnToMerchant) || (event instanceof com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.HandleBackPress)) {
                                        return currentState;
                                    }
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                copy = currentState.copy((r20 & 1) != 0 ? currentState.initializeCheckoutEntity : null, (r20 & 2) != 0 ? currentState.buyerInfoEntity : null, (r20 & 4) != 0 ? currentState.fundingSelectionEntity : null, (r20 & 8) != 0 ? currentState.buyerInfoContingency : null, (r20 & 16) != 0 ? currentState.selectedInstrumentId : null, (r20 & 32) != 0 ? currentState.hasContingency : false, (r20 & 64) != 0 ? currentState.contingency : null, (r20 & 128) != 0 ? currentState.isButtonLoading : false, (r20 & 256) != 0 ? currentState.error : ((com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnContingencyError) event).getError());
                                return copy;
                            }
                            copy2 = currentState.copy((r20 & 1) != 0 ? currentState.initializeCheckoutEntity : null, (r20 & 2) != 0 ? currentState.buyerInfoEntity : null, (r20 & 4) != 0 ? currentState.fundingSelectionEntity : null, (r20 & 8) != 0 ? currentState.buyerInfoContingency : null, (r20 & 16) != 0 ? currentState.selectedInstrumentId : null, (r20 & 32) != 0 ? currentState.hasContingency : false, (r20 & 64) != 0 ? currentState.contingency : null, (r20 & 128) != 0 ? currentState.isButtonLoading : false, (r20 & 256) != 0 ? currentState.error : null);
                            return copy2;
                        }
                        copy3 = currentState.copy((r20 & 1) != 0 ? currentState.initializeCheckoutEntity : null, (r20 & 2) != 0 ? currentState.buyerInfoEntity : null, (r20 & 4) != 0 ? currentState.fundingSelectionEntity : null, (r20 & 8) != 0 ? currentState.buyerInfoContingency : null, (r20 & 16) != 0 ? currentState.selectedInstrumentId : null, (r20 & 32) != 0 ? currentState.hasContingency : false, (r20 & 64) != 0 ? currentState.contingency : null, (r20 & 128) != 0 ? currentState.isButtonLoading : false, (r20 & 256) != 0 ? currentState.error : ((com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnAuthorizeBACreationFailure) event).getEntity());
                        return copy3;
                    }
                    copy4 = currentState.copy((r20 & 1) != 0 ? currentState.initializeCheckoutEntity : null, (r20 & 2) != 0 ? currentState.buyerInfoEntity : null, (r20 & 4) != 0 ? currentState.fundingSelectionEntity : null, (r20 & 8) != 0 ? currentState.buyerInfoContingency : null, (r20 & 16) != 0 ? currentState.selectedInstrumentId : null, (r20 & 32) != 0 ? currentState.hasContingency : true, (r20 & 64) != 0 ? currentState.contingency : ((com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnAuthorizeBACreationContingency) event).getEntity(), (r20 & 128) != 0 ? currentState.isButtonLoading : false, (r20 & 256) != 0 ? currentState.error : null);
                    return copy4;
                }
                copy5 = currentState.copy((r20 & 1) != 0 ? currentState.initializeCheckoutEntity : null, (r20 & 2) != 0 ? currentState.buyerInfoEntity : null, (r20 & 4) != 0 ? currentState.fundingSelectionEntity : null, (r20 & 8) != 0 ? currentState.buyerInfoContingency : null, (r20 & 16) != 0 ? currentState.selectedInstrumentId : null, (r20 & 32) != 0 ? currentState.hasContingency : false, (r20 & 64) != 0 ? currentState.contingency : null, (r20 & 128) != 0 ? currentState.isButtonLoading : false, (r20 & 256) != 0 ? currentState.error : null);
                return copy5;
            }
            copy6 = currentState.copy((r20 & 1) != 0 ? currentState.initializeCheckoutEntity : null, (r20 & 2) != 0 ? currentState.buyerInfoEntity : null, (r20 & 4) != 0 ? currentState.fundingSelectionEntity : null, (r20 & 8) != 0 ? currentState.buyerInfoContingency : null, (r20 & 16) != 0 ? currentState.selectedInstrumentId : null, (r20 & 32) != 0 ? currentState.hasContingency : false, (r20 & 64) != 0 ? currentState.contingency : null, (r20 & 128) != 0 ? currentState.isButtonLoading : true, (r20 & 256) != 0 ? currentState.error : null);
            return copy6;
        }
        com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse response = ((com.paypal.oslo.feature.inappcheckout.ui.instantvault.contract.InstantVaultContract.Event.OnContent) event).getResponse();
        com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity = response.getBuyerInfoEntity();
        com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity fundingSelectionEntity = response.getFundingSelectionEntity();
        com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity = (com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity) com.paypal.oslo.feature.inappcheckout.extensions.InAppCheckoutExtensionsKt.firstOrNullIfEmpty(buyerInfoEntity != null ? buyerInfoEntity.getContingencies() : null);
        com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingency = fundingSelectionEntity != null ? fundingSelectionEntity.getContingency() : null;
        if (contingencyEntity != null) {
            com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeCheckoutEntity initializeCheckoutEntity = response.getInitializeCheckoutEntity();
            if (fundingSelectionEntity == null) {
                fundingSelectionEntity = currentState.getFundingSelectionEntity();
            }
            copy10 = currentState.copy((r20 & 1) != 0 ? currentState.initializeCheckoutEntity : initializeCheckoutEntity, (r20 & 2) != 0 ? currentState.buyerInfoEntity : buyerInfoEntity, (r20 & 4) != 0 ? currentState.fundingSelectionEntity : fundingSelectionEntity, (r20 & 8) != 0 ? currentState.buyerInfoContingency : contingencyEntity, (r20 & 16) != 0 ? currentState.selectedInstrumentId : null, (r20 & 32) != 0 ? currentState.hasContingency : true, (r20 & 64) != 0 ? currentState.contingency : null, (r20 & 128) != 0 ? currentState.isButtonLoading : false, (r20 & 256) != 0 ? currentState.error : null);
            return copy10;
        }
        if (contingency != null) {
            copy9 = currentState.copy((r20 & 1) != 0 ? currentState.initializeCheckoutEntity : response.getInitializeCheckoutEntity(), (r20 & 2) != 0 ? currentState.buyerInfoEntity : buyerInfoEntity, (r20 & 4) != 0 ? currentState.fundingSelectionEntity : fundingSelectionEntity, (r20 & 8) != 0 ? currentState.buyerInfoContingency : null, (r20 & 16) != 0 ? currentState.selectedInstrumentId : (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) fundingSelectionEntity.getConfig().getSelectedInstrumentIds()), (r20 & 32) != 0 ? currentState.hasContingency : true, (r20 & 64) != 0 ? currentState.contingency : contingency, (r20 & 128) != 0 ? currentState.isButtonLoading : false, (r20 & 256) != 0 ? currentState.error : null);
            return copy9;
        }
        if (fundingSelectionEntity != null) {
            copy8 = currentState.copy((r20 & 1) != 0 ? currentState.initializeCheckoutEntity : response.getInitializeCheckoutEntity(), (r20 & 2) != 0 ? currentState.buyerInfoEntity : buyerInfoEntity, (r20 & 4) != 0 ? currentState.fundingSelectionEntity : fundingSelectionEntity, (r20 & 8) != 0 ? currentState.buyerInfoContingency : null, (r20 & 16) != 0 ? currentState.selectedInstrumentId : (java.lang.String) com.paypal.oslo.feature.inappcheckout.extensions.InAppCheckoutExtensionsKt.firstOrNullIfEmpty(fundingSelectionEntity.getConfig().getSelectedInstrumentIds()), (r20 & 32) != 0 ? currentState.hasContingency : false, (r20 & 64) != 0 ? currentState.contingency : null, (r20 & 128) != 0 ? currentState.isButtonLoading : false, (r20 & 256) != 0 ? currentState.error : null);
            return copy8;
        }
        copy7 = currentState.copy((r20 & 1) != 0 ? currentState.initializeCheckoutEntity : null, (r20 & 2) != 0 ? currentState.buyerInfoEntity : null, (r20 & 4) != 0 ? currentState.fundingSelectionEntity : null, (r20 & 8) != 0 ? currentState.buyerInfoContingency : null, (r20 & 16) != 0 ? currentState.selectedInstrumentId : null, (r20 & 32) != 0 ? currentState.hasContingency : false, (r20 & 64) != 0 ? currentState.contingency : null, (r20 & 128) != 0 ? currentState.isButtonLoading : false, (r20 & 256) != 0 ? currentState.error : new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("INVALID_CONTENT", com.paypal.oslo.feature.inappcheckout.Constants.INVALID_CONTENT_DESCRIPTION, false, null, null, 24, null));
        return copy7;
    }
}
