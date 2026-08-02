package com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract;", "", "<init>", "()V", "FlowType", "State", "Event", "Effect"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MockSelectionContract {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract();

    private MockSelectionContract() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$FlowType;", "", "<init>", "(Ljava/lang/String;I)V", "AUTH_FLOW", "DIRECT_API_FLOW"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FlowType {
        public static final com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.FlowType AUTH_FLOW;
        public static final com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.FlowType DIRECT_API_FLOW;
        private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.FlowType[] getHighResolutionOutputSizeshNQ4ISI;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

        private FlowType(java.lang.String str, int i) {
        }

        static {
            com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.FlowType flowType = new com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.FlowType("AUTH_FLOW", 0);
            AUTH_FLOW = flowType;
            com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.FlowType flowType2 = new com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.FlowType("DIRECT_API_FLOW", 1);
            DIRECT_API_FLOW = flowType2;
            com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.FlowType[] flowTypeArr = {flowType, flowType2};
            getHighResolutionOutputSizeshNQ4ISI = flowTypeArr;
            getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(flowTypeArr);
        }

        public static com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.FlowType[] values() {
            return (com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.FlowType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
        }

        public static com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.FlowType valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.FlowType) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.FlowType.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.FlowType> getEntries() {
            return getHighSpeedVideoFpsRanges;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B§\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u0006HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\u0006HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0012\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006HÆ\u0003¢\u0006\u0004\b&\u0010\u001dJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006HÆ\u0003¢\u0006\u0004\b)\u0010\u001dJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b*\u0010+J°\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00103\u001a\u000202HÖ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b5\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b9\u0010\u001bR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b;\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\b=\u0010\u001fR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b>\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\b@\u0010\"R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\bA\u0010\u001dR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010B\u001a\u0004\bC\u0010%R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010:\u001a\u0004\bD\u0010\u001dR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010E\u001a\u0004\bF\u0010(R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010:\u001a\u0004\bG\u0010\u001dR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010H\u001a\u0004\bI\u0010+"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$State;", "", "Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$FlowType;", "selectedFlowType", "", "baTokenValue", "", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockAuthScenario;", "availableAuthScenarios", "selectedAuthScenario", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockInitializeNativeRypCheckoutScenario;", "availableInitializeNativeRypCheckoutScenarios", "selectedInitializeNativeRypCheckoutScenario", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockFiAfterRypCTAContingencyScenario;", "availableFiAfterCTAContingencyScenarios", "selectedFiAfterCTAContingencyScenario", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockAddCardScenario;", "availableAddCardScenarios", "selectedAddCardScenario", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockCtaScenario;", "availableCtaScenarios", "selectedCtaScenario", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$FlowType;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockAuthScenario;Ljava/util/List;Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockInitializeNativeRypCheckoutScenario;Ljava/util/List;Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockFiAfterRypCTAContingencyScenario;Ljava/util/List;Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockAddCardScenario;Ljava/util/List;Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockCtaScenario;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$FlowType;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "component4", "()Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockAuthScenario;", "component5", "component6", "()Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockInitializeNativeRypCheckoutScenario;", "component7", "component8", "()Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockFiAfterRypCTAContingencyScenario;", "component9", "component10", "()Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockAddCardScenario;", "component11", "component12", "()Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockCtaScenario;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$FlowType;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockAuthScenario;Ljava/util/List;Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockInitializeNativeRypCheckoutScenario;Ljava/util/List;Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockFiAfterRypCTAContingencyScenario;Ljava/util/List;Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockAddCardScenario;Ljava/util/List;Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockCtaScenario;)Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$State;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$FlowType;", "getSelectedFlowType", "Ljava/lang/String;", "getBaTokenValue", "Ljava/util/List;", "getAvailableAuthScenarios", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockAuthScenario;", "getSelectedAuthScenario", "getAvailableInitializeNativeRypCheckoutScenarios", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockInitializeNativeRypCheckoutScenario;", "getSelectedInitializeNativeRypCheckoutScenario", "getAvailableFiAfterCTAContingencyScenarios", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockFiAfterRypCTAContingencyScenario;", "getSelectedFiAfterCTAContingencyScenario", "getAvailableAddCardScenarios", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockAddCardScenario;", "getSelectedAddCardScenario", "getAvailableCtaScenarios", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockCtaScenario;", "getSelectedCtaScenario"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class State {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAddCardScenario> availableAddCardScenarios;
        private final java.util.List<com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario> availableAuthScenarios;
        private final java.util.List<com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario> availableCtaScenarios;
        private final java.util.List<com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario> availableFiAfterCTAContingencyScenarios;
        private final java.util.List<com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario> availableInitializeNativeRypCheckoutScenarios;
        private final java.lang.String baTokenValue;
        private final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAddCardScenario selectedAddCardScenario;
        private final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario selectedAuthScenario;
        private final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario selectedCtaScenario;
        private final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario selectedFiAfterCTAContingencyScenario;
        private final com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.FlowType selectedFlowType;
        private final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario selectedInitializeNativeRypCheckoutScenario;

        /* JADX WARN: Multi-variable type inference failed */
        public State(com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.FlowType flowType, java.lang.String str, java.util.List<? extends com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario> list, com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario mockAuthScenario, java.util.List<? extends com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario> list2, com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario mockInitializeNativeRypCheckoutScenario, java.util.List<? extends com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario> list3, com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario mockFiAfterRypCTAContingencyScenario, java.util.List<? extends com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAddCardScenario> list4, com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAddCardScenario mockAddCardScenario, java.util.List<? extends com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario> list5, com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario mockCtaScenario) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list5, "");
            this.selectedFlowType = flowType;
            this.baTokenValue = str;
            this.availableAuthScenarios = list;
            this.selectedAuthScenario = mockAuthScenario;
            this.availableInitializeNativeRypCheckoutScenarios = list2;
            this.selectedInitializeNativeRypCheckoutScenario = mockInitializeNativeRypCheckoutScenario;
            this.availableFiAfterCTAContingencyScenarios = list3;
            this.selectedFiAfterCTAContingencyScenario = mockFiAfterRypCTAContingencyScenario;
            this.availableAddCardScenarios = list4;
            this.selectedAddCardScenario = mockAddCardScenario;
            this.availableCtaScenarios = list5;
            this.selectedCtaScenario = mockCtaScenario;
        }

        public /* synthetic */ State(com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.FlowType flowType, java.lang.String str, java.util.List list, com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario mockAuthScenario, java.util.List list2, com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario mockInitializeNativeRypCheckoutScenario, java.util.List list3, com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario mockFiAfterRypCTAContingencyScenario, java.util.List list4, com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAddCardScenario mockAddCardScenario, java.util.List list5, com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario mockCtaScenario, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.FlowType.DIRECT_API_FLOW : flowType, (i & 2) != 0 ? "BA-12345678901234" : str, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : mockAuthScenario, (i & 16) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i & 32) != 0 ? null : mockInitializeNativeRypCheckoutScenario, (i & 64) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list3, (i & 128) != 0 ? null : mockFiAfterRypCTAContingencyScenario, (i & 256) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list4, (i & 512) != 0 ? null : mockAddCardScenario, (i & 1024) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list5, (i & 2048) == 0 ? mockCtaScenario : null);
        }

        public final com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.FlowType getSelectedFlowType() {
            return this.selectedFlowType;
        }

        public final java.lang.String getBaTokenValue() {
            return this.baTokenValue;
        }

        public final java.util.List<com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario> getAvailableAuthScenarios() {
            return this.availableAuthScenarios;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario getSelectedAuthScenario() {
            return this.selectedAuthScenario;
        }

        public final java.util.List<com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario> getAvailableInitializeNativeRypCheckoutScenarios() {
            return this.availableInitializeNativeRypCheckoutScenarios;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario getSelectedInitializeNativeRypCheckoutScenario() {
            return this.selectedInitializeNativeRypCheckoutScenario;
        }

        public final java.util.List<com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario> getAvailableFiAfterCTAContingencyScenarios() {
            return this.availableFiAfterCTAContingencyScenarios;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario getSelectedFiAfterCTAContingencyScenario() {
            return this.selectedFiAfterCTAContingencyScenario;
        }

        public final java.util.List<com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAddCardScenario> getAvailableAddCardScenarios() {
            return this.availableAddCardScenarios;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAddCardScenario getSelectedAddCardScenario() {
            return this.selectedAddCardScenario;
        }

        public final java.util.List<com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario> getAvailableCtaScenarios() {
            return this.availableCtaScenarios;
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario getSelectedCtaScenario() {
            return this.selectedCtaScenario;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.FlowType flowType = this.selectedFlowType;
            java.lang.String str = this.baTokenValue;
            java.util.List<com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario> list = this.availableAuthScenarios;
            com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario mockAuthScenario = this.selectedAuthScenario;
            java.util.List<com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario> list2 = this.availableInitializeNativeRypCheckoutScenarios;
            com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario mockInitializeNativeRypCheckoutScenario = this.selectedInitializeNativeRypCheckoutScenario;
            java.util.List<com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario> list3 = this.availableFiAfterCTAContingencyScenarios;
            com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario mockFiAfterRypCTAContingencyScenario = this.selectedFiAfterCTAContingencyScenario;
            java.util.List<com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAddCardScenario> list4 = this.availableAddCardScenarios;
            com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAddCardScenario mockAddCardScenario = this.selectedAddCardScenario;
            java.util.List<com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario> list5 = this.availableCtaScenarios;
            com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario mockCtaScenario = this.selectedCtaScenario;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("State(selectedFlowType=");
            sb.append(flowType);
            sb.append(", baTokenValue=");
            sb.append(str);
            sb.append(", availableAuthScenarios=");
            sb.append(list);
            sb.append(", selectedAuthScenario=");
            sb.append(mockAuthScenario);
            sb.append(", availableInitializeNativeRypCheckoutScenarios=");
            sb.append(list2);
            sb.append(", selectedInitializeNativeRypCheckoutScenario=");
            sb.append(mockInitializeNativeRypCheckoutScenario);
            sb.append(", availableFiAfterCTAContingencyScenarios=");
            sb.append(list3);
            sb.append(", selectedFiAfterCTAContingencyScenario=");
            sb.append(mockFiAfterRypCTAContingencyScenario);
            sb.append(", availableAddCardScenarios=");
            sb.append(list4);
            sb.append(", selectedAddCardScenario=");
            sb.append(mockAddCardScenario);
            sb.append(", availableCtaScenarios=");
            sb.append(list5);
            sb.append(", selectedCtaScenario=");
            sb.append(mockCtaScenario);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.selectedFlowType.hashCode();
            int hashCode2 = this.baTokenValue.hashCode();
            int hashCode3 = this.availableAuthScenarios.hashCode();
            com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario mockAuthScenario = this.selectedAuthScenario;
            int hashCode4 = mockAuthScenario == null ? 0 : mockAuthScenario.hashCode();
            int hashCode5 = this.availableInitializeNativeRypCheckoutScenarios.hashCode();
            com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario mockInitializeNativeRypCheckoutScenario = this.selectedInitializeNativeRypCheckoutScenario;
            int hashCode6 = mockInitializeNativeRypCheckoutScenario == null ? 0 : mockInitializeNativeRypCheckoutScenario.hashCode();
            int hashCode7 = this.availableFiAfterCTAContingencyScenarios.hashCode();
            com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario mockFiAfterRypCTAContingencyScenario = this.selectedFiAfterCTAContingencyScenario;
            int hashCode8 = mockFiAfterRypCTAContingencyScenario == null ? 0 : mockFiAfterRypCTAContingencyScenario.hashCode();
            int hashCode9 = this.availableAddCardScenarios.hashCode();
            com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAddCardScenario mockAddCardScenario = this.selectedAddCardScenario;
            int hashCode10 = mockAddCardScenario == null ? 0 : mockAddCardScenario.hashCode();
            int hashCode11 = this.availableCtaScenarios.hashCode();
            com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario mockCtaScenario = this.selectedCtaScenario;
            return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + (mockCtaScenario != null ? mockCtaScenario.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.State)) {
                return false;
            }
            com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.State state = (com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.State) other;
            return this.selectedFlowType == state.selectedFlowType && kotlin.jvm.internal.Intrinsics.areEqual(this.baTokenValue, state.baTokenValue) && kotlin.jvm.internal.Intrinsics.areEqual(this.availableAuthScenarios, state.availableAuthScenarios) && this.selectedAuthScenario == state.selectedAuthScenario && kotlin.jvm.internal.Intrinsics.areEqual(this.availableInitializeNativeRypCheckoutScenarios, state.availableInitializeNativeRypCheckoutScenarios) && this.selectedInitializeNativeRypCheckoutScenario == state.selectedInitializeNativeRypCheckoutScenario && kotlin.jvm.internal.Intrinsics.areEqual(this.availableFiAfterCTAContingencyScenarios, state.availableFiAfterCTAContingencyScenarios) && this.selectedFiAfterCTAContingencyScenario == state.selectedFiAfterCTAContingencyScenario && kotlin.jvm.internal.Intrinsics.areEqual(this.availableAddCardScenarios, state.availableAddCardScenarios) && this.selectedAddCardScenario == state.selectedAddCardScenario && kotlin.jvm.internal.Intrinsics.areEqual(this.availableCtaScenarios, state.availableCtaScenarios) && this.selectedCtaScenario == state.selectedCtaScenario;
        }

        public final com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.State copy(com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.FlowType selectedFlowType, java.lang.String baTokenValue, java.util.List<? extends com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario> availableAuthScenarios, com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario selectedAuthScenario, java.util.List<? extends com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario> availableInitializeNativeRypCheckoutScenarios, com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario selectedInitializeNativeRypCheckoutScenario, java.util.List<? extends com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario> availableFiAfterCTAContingencyScenarios, com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario selectedFiAfterCTAContingencyScenario, java.util.List<? extends com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAddCardScenario> availableAddCardScenarios, com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAddCardScenario selectedAddCardScenario, java.util.List<? extends com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario> availableCtaScenarios, com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario selectedCtaScenario) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedFlowType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baTokenValue, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableAuthScenarios, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableInitializeNativeRypCheckoutScenarios, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableFiAfterCTAContingencyScenarios, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableAddCardScenarios, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableCtaScenarios, "");
            return new com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.State(selectedFlowType, baTokenValue, availableAuthScenarios, selectedAuthScenario, availableInitializeNativeRypCheckoutScenarios, selectedInitializeNativeRypCheckoutScenario, availableFiAfterCTAContingencyScenarios, selectedFiAfterCTAContingencyScenario, availableAddCardScenarios, selectedAddCardScenario, availableCtaScenarios, selectedCtaScenario);
        }

        public final java.util.List<com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAddCardScenario> component9() {
            return this.availableAddCardScenarios;
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario getSelectedFiAfterCTAContingencyScenario() {
            return this.selectedFiAfterCTAContingencyScenario;
        }

        public final java.util.List<com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario> component7() {
            return this.availableFiAfterCTAContingencyScenarios;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario getSelectedInitializeNativeRypCheckoutScenario() {
            return this.selectedInitializeNativeRypCheckoutScenario;
        }

        public final java.util.List<com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario> component5() {
            return this.availableInitializeNativeRypCheckoutScenarios;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario getSelectedAuthScenario() {
            return this.selectedAuthScenario;
        }

        public final java.util.List<com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario> component3() {
            return this.availableAuthScenarios;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getBaTokenValue() {
            return this.baTokenValue;
        }

        /* renamed from: component12, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario getSelectedCtaScenario() {
            return this.selectedCtaScenario;
        }

        public final java.util.List<com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario> component11() {
            return this.availableCtaScenarios;
        }

        /* renamed from: component10, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAddCardScenario getSelectedAddCardScenario() {
            return this.selectedAddCardScenario;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.FlowType getSelectedFlowType() {
            return this.selectedFlowType;
        }

        public State() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, my.com.softspace.ssfasstapsdk.SSFasstapSDK.CardScheme.ALL, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Event;", "", "LoadScenarios", "SelectFlowType", "UpdateBaToken", "SelectAuthScenario", "SelectInitializeNativeRypCheckoutScenario", "SelectAddCardScenario", "SelectCtaScenario", "SelectFiAfterCTAContingencyScenario", "ConfirmSelection", "Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Event$ConfirmSelection;", "Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Event$LoadScenarios;", "Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Event$SelectAddCardScenario;", "Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Event$SelectAuthScenario;", "Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Event$SelectCtaScenario;", "Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Event$SelectFiAfterCTAContingencyScenario;", "Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Event$SelectFlowType;", "Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Event$SelectInitializeNativeRypCheckoutScenario;", "Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Event$UpdateBaToken;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Event {

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Event$LoadScenarios;", "Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Event;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class LoadScenarios implements com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.LoadScenarios INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.LoadScenarios();

            public final int hashCode() {
                return 1255840102;
            }

            private LoadScenarios() {
            }

            public final java.lang.String toString() {
                return "LoadScenarios";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.LoadScenarios)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Event$SelectFlowType;", "Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Event;", "Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$FlowType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$FlowType;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$FlowType;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$FlowType;)Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Event$SelectFlowType;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$FlowType;", "getFlowType"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SelectFlowType implements com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.FlowType flowType;

            public SelectFlowType(com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.FlowType flowType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowType, "");
                this.flowType = flowType;
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.FlowType getFlowType() {
                return this.flowType;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.FlowType flowType = this.flowType;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectFlowType(flowType=");
                sb.append(flowType);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.flowType.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectFlowType) && this.flowType == ((com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectFlowType) other).flowType;
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectFlowType copy(com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.FlowType flowType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowType, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectFlowType(flowType);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.FlowType getFlowType() {
                return this.flowType;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectFlowType copy$default(com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectFlowType selectFlowType, com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.FlowType flowType, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    flowType = selectFlowType.flowType;
                }
                return selectFlowType.copy(flowType);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Event$UpdateBaToken;", "Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Event;", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Event$UpdateBaToken;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class UpdateBaToken implements com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event {
            public static final int $stable = 0;
            private final java.lang.String token;

            public UpdateBaToken(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.token = str;
            }

            public final java.lang.String getToken() {
                return this.token;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.token;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateBaToken(token=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.token.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.UpdateBaToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.token, ((com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.UpdateBaToken) other).token);
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.UpdateBaToken copy(java.lang.String token) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.UpdateBaToken(token);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getToken() {
                return this.token;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.UpdateBaToken copy$default(com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.UpdateBaToken updateBaToken, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = updateBaToken.token;
                }
                return updateBaToken.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Event$SelectAuthScenario;", "Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Event;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockAuthScenario;", com.datadog.android.rum.internal.startup.RumAppStartupTelemetryReporterImpl.KEY_SCENARIO, "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockAuthScenario;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockAuthScenario;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockAuthScenario;)Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Event$SelectAuthScenario;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockAuthScenario;", "getScenario"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SelectAuthScenario implements com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario scenario;

            public SelectAuthScenario(com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario mockAuthScenario) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mockAuthScenario, "");
                this.scenario = mockAuthScenario;
            }

            public final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario getScenario() {
                return this.scenario;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario mockAuthScenario = this.scenario;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectAuthScenario(scenario=");
                sb.append(mockAuthScenario);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.scenario.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectAuthScenario) && this.scenario == ((com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectAuthScenario) other).scenario;
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectAuthScenario copy(com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario scenario) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scenario, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectAuthScenario(scenario);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario getScenario() {
                return this.scenario;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectAuthScenario copy$default(com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectAuthScenario selectAuthScenario, com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAuthScenario mockAuthScenario, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    mockAuthScenario = selectAuthScenario.scenario;
                }
                return selectAuthScenario.copy(mockAuthScenario);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Event$SelectInitializeNativeRypCheckoutScenario;", "Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Event;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockInitializeNativeRypCheckoutScenario;", com.datadog.android.rum.internal.startup.RumAppStartupTelemetryReporterImpl.KEY_SCENARIO, "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockInitializeNativeRypCheckoutScenario;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockInitializeNativeRypCheckoutScenario;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockInitializeNativeRypCheckoutScenario;)Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Event$SelectInitializeNativeRypCheckoutScenario;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockInitializeNativeRypCheckoutScenario;", "getScenario"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SelectInitializeNativeRypCheckoutScenario implements com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario scenario;

            public SelectInitializeNativeRypCheckoutScenario(com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario mockInitializeNativeRypCheckoutScenario) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mockInitializeNativeRypCheckoutScenario, "");
                this.scenario = mockInitializeNativeRypCheckoutScenario;
            }

            public final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario getScenario() {
                return this.scenario;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario mockInitializeNativeRypCheckoutScenario = this.scenario;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectInitializeNativeRypCheckoutScenario(scenario=");
                sb.append(mockInitializeNativeRypCheckoutScenario);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.scenario.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectInitializeNativeRypCheckoutScenario) && this.scenario == ((com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectInitializeNativeRypCheckoutScenario) other).scenario;
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectInitializeNativeRypCheckoutScenario copy(com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario scenario) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scenario, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectInitializeNativeRypCheckoutScenario(scenario);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario getScenario() {
                return this.scenario;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectInitializeNativeRypCheckoutScenario copy$default(com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectInitializeNativeRypCheckoutScenario selectInitializeNativeRypCheckoutScenario, com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockInitializeNativeRypCheckoutScenario mockInitializeNativeRypCheckoutScenario, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    mockInitializeNativeRypCheckoutScenario = selectInitializeNativeRypCheckoutScenario.scenario;
                }
                return selectInitializeNativeRypCheckoutScenario.copy(mockInitializeNativeRypCheckoutScenario);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Event$SelectAddCardScenario;", "Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Event;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockAddCardScenario;", com.datadog.android.rum.internal.startup.RumAppStartupTelemetryReporterImpl.KEY_SCENARIO, "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockAddCardScenario;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockAddCardScenario;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockAddCardScenario;)Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Event$SelectAddCardScenario;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockAddCardScenario;", "getScenario"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SelectAddCardScenario implements com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAddCardScenario scenario;

            public SelectAddCardScenario(com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAddCardScenario mockAddCardScenario) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mockAddCardScenario, "");
                this.scenario = mockAddCardScenario;
            }

            public final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAddCardScenario getScenario() {
                return this.scenario;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAddCardScenario mockAddCardScenario = this.scenario;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectAddCardScenario(scenario=");
                sb.append(mockAddCardScenario);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.scenario.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectAddCardScenario) && this.scenario == ((com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectAddCardScenario) other).scenario;
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectAddCardScenario copy(com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAddCardScenario scenario) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scenario, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectAddCardScenario(scenario);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAddCardScenario getScenario() {
                return this.scenario;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectAddCardScenario copy$default(com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectAddCardScenario selectAddCardScenario, com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockAddCardScenario mockAddCardScenario, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    mockAddCardScenario = selectAddCardScenario.scenario;
                }
                return selectAddCardScenario.copy(mockAddCardScenario);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Event$SelectCtaScenario;", "Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Event;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockCtaScenario;", com.datadog.android.rum.internal.startup.RumAppStartupTelemetryReporterImpl.KEY_SCENARIO, "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockCtaScenario;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockCtaScenario;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockCtaScenario;)Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Event$SelectCtaScenario;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockCtaScenario;", "getScenario"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SelectCtaScenario implements com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario scenario;

            public SelectCtaScenario(com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario mockCtaScenario) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mockCtaScenario, "");
                this.scenario = mockCtaScenario;
            }

            public final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario getScenario() {
                return this.scenario;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario mockCtaScenario = this.scenario;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectCtaScenario(scenario=");
                sb.append(mockCtaScenario);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.scenario.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectCtaScenario) && this.scenario == ((com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectCtaScenario) other).scenario;
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectCtaScenario copy(com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario scenario) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scenario, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectCtaScenario(scenario);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario getScenario() {
                return this.scenario;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectCtaScenario copy$default(com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectCtaScenario selectCtaScenario, com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockCtaScenario mockCtaScenario, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    mockCtaScenario = selectCtaScenario.scenario;
                }
                return selectCtaScenario.copy(mockCtaScenario);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Event$SelectFiAfterCTAContingencyScenario;", "Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Event;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockFiAfterRypCTAContingencyScenario;", com.datadog.android.rum.internal.startup.RumAppStartupTelemetryReporterImpl.KEY_SCENARIO, "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockFiAfterRypCTAContingencyScenario;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockFiAfterRypCTAContingencyScenario;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockFiAfterRypCTAContingencyScenario;)Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Event$SelectFiAfterCTAContingencyScenario;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/mock/MockFiAfterRypCTAContingencyScenario;", "getScenario"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SelectFiAfterCTAContingencyScenario implements com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario scenario;

            public SelectFiAfterCTAContingencyScenario(com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario mockFiAfterRypCTAContingencyScenario) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mockFiAfterRypCTAContingencyScenario, "");
                this.scenario = mockFiAfterRypCTAContingencyScenario;
            }

            public final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario getScenario() {
                return this.scenario;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario mockFiAfterRypCTAContingencyScenario = this.scenario;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectFiAfterCTAContingencyScenario(scenario=");
                sb.append(mockFiAfterRypCTAContingencyScenario);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.scenario.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectFiAfterCTAContingencyScenario) && this.scenario == ((com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectFiAfterCTAContingencyScenario) other).scenario;
            }

            public final com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectFiAfterCTAContingencyScenario copy(com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario scenario) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scenario, "");
                return new com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectFiAfterCTAContingencyScenario(scenario);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario getScenario() {
                return this.scenario;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectFiAfterCTAContingencyScenario copy$default(com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.SelectFiAfterCTAContingencyScenario selectFiAfterCTAContingencyScenario, com.paypal.oslo.feature.inappcheckout.domain.model.mock.MockFiAfterRypCTAContingencyScenario mockFiAfterRypCTAContingencyScenario, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    mockFiAfterRypCTAContingencyScenario = selectFiAfterCTAContingencyScenario.scenario;
                }
                return selectFiAfterCTAContingencyScenario.copy(mockFiAfterRypCTAContingencyScenario);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Event$ConfirmSelection;", "Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Event;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ConfirmSelection implements com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.ConfirmSelection INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.ConfirmSelection();

            public final int hashCode() {
                return -131267261;
            }

            private ConfirmSelection() {
            }

            public final java.lang.String toString() {
                return "ConfirmSelection";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Event.ConfirmSelection)) {
                    return false;
                }
                return true;
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Effect;", "", "NavigateToOneShot", "Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Effect$NavigateToOneShot;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Effect {

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Effect$NavigateToOneShot;", "Lcom/paypal/oslo/feature/inappcheckout/ui/mock/mockselection/contract/MockSelectionContract$Effect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NavigateToOneShot implements com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Effect {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Effect.NavigateToOneShot INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Effect.NavigateToOneShot();

            public final int hashCode() {
                return 582844090;
            }

            private NavigateToOneShot() {
            }

            public final java.lang.String toString() {
                return "NavigateToOneShot";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.contract.MockSelectionContract.Effect.NavigateToOneShot)) {
                    return false;
                }
                return true;
            }
        }
    }
}
