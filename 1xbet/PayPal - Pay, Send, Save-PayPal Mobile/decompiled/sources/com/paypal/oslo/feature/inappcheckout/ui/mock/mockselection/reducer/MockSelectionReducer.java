package com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.reducer;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/reducer/MockSelectionReducer;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$State;", "currentState", "Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Event;", "event", "reduce", "(Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$State;Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Event;)Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$State;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MockSelectionReducer {
    public static final int $stable = 0;

    @javax.inject.Inject
    public MockSelectionReducer() {
    }

    public final com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.State reduce(com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.State currentState, com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event event) {
        com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.State copy;
        com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.State copy2;
        com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.State copy3;
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario mockFiAfterRypCTAContingencyScenario;
        com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.State copy4;
        com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario mockInitializeNativeRypCheckoutScenario;
        com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.State copy5;
        com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.State copy6;
        com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.State copy7;
        com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.State copy8;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.LoadScenarios) {
            copy8 = currentState.copy((r26 & 1) != 0 ? currentState.selectedFlowType : null, (r26 & 2) != 0 ? currentState.baTokenValue : null, (r26 & 4) != 0 ? currentState.availableAuthScenarios : com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario.getEntries(), (r26 & 8) != 0 ? currentState.selectedAuthScenario : (com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario.getEntries()), (r26 & 16) != 0 ? currentState.availableInitializeNativeRypCheckoutScenarios : com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario.getEntries(), (r26 & 32) != 0 ? currentState.selectedInitializeNativeRypCheckoutScenario : (com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario.getEntries()), (r26 & 64) != 0 ? currentState.availableFiAfterCTAContingencyScenarios : com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario.getEntries(), (r26 & 128) != 0 ? currentState.selectedFiAfterCTAContingencyScenario : (com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario.getEntries()), (r26 & 256) != 0 ? currentState.availableAddCardScenarios : com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAddCardScenario.getEntries(), (r26 & 512) != 0 ? currentState.selectedAddCardScenario : (com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAddCardScenario) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAddCardScenario.getEntries()), (r26 & 1024) != 0 ? currentState.availableCtaScenarios : com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario.getEntries(), (r26 & 2048) != 0 ? currentState.selectedCtaScenario : (com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario.getEntries()));
            return copy8;
        }
        if (!(event instanceof com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectFlowType)) {
            if (!(event instanceof com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.UpdateBaToken)) {
                if (!(event instanceof com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectAuthScenario)) {
                    if (!(event instanceof com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectCtaScenario)) {
                        if (!(event instanceof com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectInitializeNativeRypCheckoutScenario)) {
                            if (!(event instanceof com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectAddCardScenario)) {
                                if (!(event instanceof com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectFiAfterCTAContingencyScenario)) {
                                    if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.ConfirmSelection) {
                                        return currentState;
                                    }
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                copy = currentState.copy((r26 & 1) != 0 ? currentState.selectedFlowType : null, (r26 & 2) != 0 ? currentState.baTokenValue : null, (r26 & 4) != 0 ? currentState.availableAuthScenarios : null, (r26 & 8) != 0 ? currentState.selectedAuthScenario : null, (r26 & 16) != 0 ? currentState.availableInitializeNativeRypCheckoutScenarios : null, (r26 & 32) != 0 ? currentState.selectedInitializeNativeRypCheckoutScenario : null, (r26 & 64) != 0 ? currentState.availableFiAfterCTAContingencyScenarios : null, (r26 & 128) != 0 ? currentState.selectedFiAfterCTAContingencyScenario : ((com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectFiAfterCTAContingencyScenario) event).getScenario(), (r26 & 256) != 0 ? currentState.availableAddCardScenarios : null, (r26 & 512) != 0 ? currentState.selectedAddCardScenario : null, (r26 & 1024) != 0 ? currentState.availableCtaScenarios : null, (r26 & 2048) != 0 ? currentState.selectedCtaScenario : null);
                                return copy;
                            }
                            copy2 = currentState.copy((r26 & 1) != 0 ? currentState.selectedFlowType : null, (r26 & 2) != 0 ? currentState.baTokenValue : null, (r26 & 4) != 0 ? currentState.availableAuthScenarios : null, (r26 & 8) != 0 ? currentState.selectedAuthScenario : null, (r26 & 16) != 0 ? currentState.availableInitializeNativeRypCheckoutScenarios : null, (r26 & 32) != 0 ? currentState.selectedInitializeNativeRypCheckoutScenario : null, (r26 & 64) != 0 ? currentState.availableFiAfterCTAContingencyScenarios : null, (r26 & 128) != 0 ? currentState.selectedFiAfterCTAContingencyScenario : null, (r26 & 256) != 0 ? currentState.availableAddCardScenarios : null, (r26 & 512) != 0 ? currentState.selectedAddCardScenario : ((com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectAddCardScenario) event).getScenario(), (r26 & 1024) != 0 ? currentState.availableCtaScenarios : null, (r26 & 2048) != 0 ? currentState.selectedCtaScenario : null);
                            return copy2;
                        }
                        copy3 = currentState.copy((r26 & 1) != 0 ? currentState.selectedFlowType : null, (r26 & 2) != 0 ? currentState.baTokenValue : null, (r26 & 4) != 0 ? currentState.availableAuthScenarios : null, (r26 & 8) != 0 ? currentState.selectedAuthScenario : null, (r26 & 16) != 0 ? currentState.availableInitializeNativeRypCheckoutScenarios : null, (r26 & 32) != 0 ? currentState.selectedInitializeNativeRypCheckoutScenario : ((com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectInitializeNativeRypCheckoutScenario) event).getScenario(), (r26 & 64) != 0 ? currentState.availableFiAfterCTAContingencyScenarios : null, (r26 & 128) != 0 ? currentState.selectedFiAfterCTAContingencyScenario : null, (r26 & 256) != 0 ? currentState.availableAddCardScenarios : null, (r26 & 512) != 0 ? currentState.selectedAddCardScenario : null, (r26 & 1024) != 0 ? currentState.availableCtaScenarios : null, (r26 & 2048) != 0 ? currentState.selectedCtaScenario : null);
                        return copy3;
                    }
                    com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectCtaScenario selectCtaScenario = (com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectCtaScenario) event;
                    com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario scenario = selectCtaScenario.getScenario();
                    com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario selectedAuthScenario = currentState.getSelectedAuthScenario();
                    int i = com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.reducer.MockSelectionReducer.WhenMappings.$EnumSwitchMapping$1[scenario.ordinal()];
                    if (i == 1) {
                        mockFiAfterRypCTAContingencyScenario = com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario.FI_AFTER_ADD_CARD_CONTINGENCY;
                    } else if (i == 2) {
                        int i2 = selectedAuthScenario == null ? -1 : com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.reducer.MockSelectionReducer.WhenMappings.$EnumSwitchMapping$0[selectedAuthScenario.ordinal()];
                        if (i2 == 1) {
                            mockFiAfterRypCTAContingencyScenario = com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario.FI_AFTER_RESELECT_FI_WITH_DISALLOWED;
                        } else if (i2 == 2) {
                            mockFiAfterRypCTAContingencyScenario = com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario.SINGLE_FI_AFTER_RETRY_FI_SELECTION_CONTINGENCY;
                        } else {
                            mockFiAfterRypCTAContingencyScenario = com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario.FI_AFTER_RETRY_FI_SELECTION_CONTINGENCY;
                        }
                    } else if (i == 3) {
                        mockFiAfterRypCTAContingencyScenario = com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario.FI_AFTER_CIT_AUTH_WITH_DISALLOWED;
                    } else {
                        mockFiAfterRypCTAContingencyScenario = i != 4 ? null : com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario.FI_AFTER_THREE_DS_WITH_DISALLOWED;
                    }
                    copy4 = currentState.copy((r26 & 1) != 0 ? currentState.selectedFlowType : null, (r26 & 2) != 0 ? currentState.baTokenValue : null, (r26 & 4) != 0 ? currentState.availableAuthScenarios : null, (r26 & 8) != 0 ? currentState.selectedAuthScenario : null, (r26 & 16) != 0 ? currentState.availableInitializeNativeRypCheckoutScenarios : null, (r26 & 32) != 0 ? currentState.selectedInitializeNativeRypCheckoutScenario : null, (r26 & 64) != 0 ? currentState.availableFiAfterCTAContingencyScenarios : null, (r26 & 128) != 0 ? currentState.selectedFiAfterCTAContingencyScenario : mockFiAfterRypCTAContingencyScenario, (r26 & 256) != 0 ? currentState.availableAddCardScenarios : null, (r26 & 512) != 0 ? currentState.selectedAddCardScenario : null, (r26 & 1024) != 0 ? currentState.availableCtaScenarios : null, (r26 & 2048) != 0 ? currentState.selectedCtaScenario : selectCtaScenario.getScenario());
                    return copy4;
                }
                com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectAuthScenario selectAuthScenario = (com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectAuthScenario) event;
                if (com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.reducer.MockSelectionReducer.WhenMappings.$EnumSwitchMapping$0[selectAuthScenario.getScenario().ordinal()] == 1) {
                    mockInitializeNativeRypCheckoutScenario = com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario.VALID_RESPONSE_WITH_RESELECT_FI;
                } else {
                    mockInitializeNativeRypCheckoutScenario = com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario.VALID_RESPONSE;
                }
                copy5 = currentState.copy((r26 & 1) != 0 ? currentState.selectedFlowType : null, (r26 & 2) != 0 ? currentState.baTokenValue : null, (r26 & 4) != 0 ? currentState.availableAuthScenarios : null, (r26 & 8) != 0 ? currentState.selectedAuthScenario : selectAuthScenario.getScenario(), (r26 & 16) != 0 ? currentState.availableInitializeNativeRypCheckoutScenarios : null, (r26 & 32) != 0 ? currentState.selectedInitializeNativeRypCheckoutScenario : mockInitializeNativeRypCheckoutScenario, (r26 & 64) != 0 ? currentState.availableFiAfterCTAContingencyScenarios : null, (r26 & 128) != 0 ? currentState.selectedFiAfterCTAContingencyScenario : null, (r26 & 256) != 0 ? currentState.availableAddCardScenarios : null, (r26 & 512) != 0 ? currentState.selectedAddCardScenario : null, (r26 & 1024) != 0 ? currentState.availableCtaScenarios : null, (r26 & 2048) != 0 ? currentState.selectedCtaScenario : com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario.VALID_CTA_RESPONSE);
                return copy5;
            }
            copy6 = currentState.copy((r26 & 1) != 0 ? currentState.selectedFlowType : null, (r26 & 2) != 0 ? currentState.baTokenValue : ((com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.UpdateBaToken) event).getToken(), (r26 & 4) != 0 ? currentState.availableAuthScenarios : null, (r26 & 8) != 0 ? currentState.selectedAuthScenario : null, (r26 & 16) != 0 ? currentState.availableInitializeNativeRypCheckoutScenarios : null, (r26 & 32) != 0 ? currentState.selectedInitializeNativeRypCheckoutScenario : null, (r26 & 64) != 0 ? currentState.availableFiAfterCTAContingencyScenarios : null, (r26 & 128) != 0 ? currentState.selectedFiAfterCTAContingencyScenario : null, (r26 & 256) != 0 ? currentState.availableAddCardScenarios : null, (r26 & 512) != 0 ? currentState.selectedAddCardScenario : null, (r26 & 1024) != 0 ? currentState.availableCtaScenarios : null, (r26 & 2048) != 0 ? currentState.selectedCtaScenario : null);
            return copy6;
        }
        copy7 = currentState.copy((r26 & 1) != 0 ? currentState.selectedFlowType : ((com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectFlowType) event).getFlowType(), (r26 & 2) != 0 ? currentState.baTokenValue : null, (r26 & 4) != 0 ? currentState.availableAuthScenarios : null, (r26 & 8) != 0 ? currentState.selectedAuthScenario : null, (r26 & 16) != 0 ? currentState.availableInitializeNativeRypCheckoutScenarios : null, (r26 & 32) != 0 ? currentState.selectedInitializeNativeRypCheckoutScenario : null, (r26 & 64) != 0 ? currentState.availableFiAfterCTAContingencyScenarios : null, (r26 & 128) != 0 ? currentState.selectedFiAfterCTAContingencyScenario : null, (r26 & 256) != 0 ? currentState.availableAddCardScenarios : null, (r26 & 512) != 0 ? currentState.selectedAddCardScenario : null, (r26 & 1024) != 0 ? currentState.availableCtaScenarios : null, (r26 & 2048) != 0 ? currentState.selectedCtaScenario : null);
        return copy7;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario.values().length];
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario.VALID_AUTH_RESPONSE_WITH_RESELECT_FI.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario.VALID_AUTH_RESPONSE_WITH_SINGLE_FI.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario.values().length];
            try {
                iArr2[com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario.CONTINGENCY_ADD_CARD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario.CONTINGENCY_RESELECT_FI.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario.CONTINGENCY_CIT_AUTH.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario.CONTINGENCY_THREE_DS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
