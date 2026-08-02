package com.paypal.oslo.feature.p2p.ui.review.state;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0018\b\u0080\b\u0018\u00002\u00020\u0001B³\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120\n\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u001c\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\nHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u001c\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\nHÆ\u0003¢\u0006\u0004\b$\u0010!J\u0010\u0010%\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b%\u0010\u001dJ\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0019J\u0010\u0010'\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b'\u0010\u001dJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b(\u0010)J\u001c\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120\nHÆ\u0003¢\u0006\u0004\b*\u0010!J\u0010\u0010+\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b+\u0010\u001dJ¼\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120\n2\b\b\u0002\u0010\u0015\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020\u00062\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00103\u001a\u000202HÖ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b5\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b9\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b;\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\b=\u0010\u001fR&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010>\u001a\u0004\b?\u0010!R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010@\u001a\u0004\bA\u0010#R&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\bB\u0010!R\u001a\u0010\u000f\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\bC\u0010\u001dR\u001a\u0010\u0010\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00106\u001a\u0004\bD\u0010\u0019R\u001a\u0010\u0011\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010:\u001a\u0004\b\u0011\u0010\u001dR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010E\u001a\u0004\bF\u0010)R&\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010>\u001a\u0004\bG\u0010!R\u001a\u0010\u0015\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010:\u001a\u0004\bH\u0010\u001dR\u0011\u0010J\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\bI\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/state/PaymentMethodAccordionUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "name", "Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionData;", "planData", "", "hasAmexCard", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanCurrencyExchange;", "selectedPlanCurrencyExchange", "", "planCurrencyExchangeMap", "Lcom/paypal/oslo/feature/moneymovement/api/domain/SummaryDisclosureType;", "selectedPlanPaymentLinkDisclosure", "planPaymentLinkDisclosureMap", "hasForeignTaxDisclosure", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, "isAddPaymentMethodEnabled", "Lcom/paypal/oslo/feature/p2p/domain/model/FundingOption;", "selectedFundingOption", "fundingOptionMap", "hasFundingOptionsError", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionData;ZLcom/paypal/oslo/feature/p2p/domain/model/PlanCurrencyExchange;Ljava/util/Map;Lcom/paypal/oslo/feature/moneymovement/api/domain/SummaryDisclosureType;Ljava/util/Map;ZLjava/lang/String;ZLcom/paypal/oslo/feature/p2p/domain/model/FundingOption;Ljava/util/Map;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionData;", "component3", "()Z", "component4", "()Lcom/paypal/oslo/feature/p2p/domain/model/PlanCurrencyExchange;", "component5", "()Ljava/util/Map;", "component6", "()Lcom/paypal/oslo/feature/moneymovement/api/domain/SummaryDisclosureType;", "component7", "component8", "component9", "component10", "component11", "()Lcom/paypal/oslo/feature/p2p/domain/model/FundingOption;", "component12", "component13", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionData;ZLcom/paypal/oslo/feature/p2p/domain/model/PlanCurrencyExchange;Ljava/util/Map;Lcom/paypal/oslo/feature/moneymovement/api/domain/SummaryDisclosureType;Ljava/util/Map;ZLjava/lang/String;ZLcom/paypal/oslo/feature/p2p/domain/model/FundingOption;Ljava/util/Map;Z)Lcom/paypal/oslo/feature/p2p/ui/review/state/PaymentMethodAccordionUiState;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionData;", "getPlanData", "Z", "getHasAmexCard", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanCurrencyExchange;", "getSelectedPlanCurrencyExchange", "Ljava/util/Map;", "getPlanCurrencyExchangeMap", "Lcom/paypal/oslo/feature/moneymovement/api/domain/SummaryDisclosureType;", "getSelectedPlanPaymentLinkDisclosure", "getPlanPaymentLinkDisclosureMap", "getHasForeignTaxDisclosure", "getTransferAttemptId", "Lcom/paypal/oslo/feature/p2p/domain/model/FundingOption;", "getSelectedFundingOption", "getFundingOptionMap", "getHasFundingOptionsError", "getHasUnresolvedCvvContingency", "hasUnresolvedCvvContingency"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PaymentMethodAccordionUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 8;
    private final java.util.Map<java.lang.String, com.paypal.oslo.feature.p2p.domain.model.FundingOption> fundingOptionMap;
    private final boolean hasAmexCard;
    private final boolean hasForeignTaxDisclosure;
    private final boolean hasFundingOptionsError;
    private final boolean isAddPaymentMethodEnabled;
    private final java.lang.String name;
    private final java.util.Map<java.lang.String, com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange> planCurrencyExchangeMap;
    private final com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData planData;
    private final java.util.Map<java.lang.String, com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType> planPaymentLinkDisclosureMap;
    private final com.paypal.oslo.feature.p2p.domain.model.FundingOption selectedFundingOption;
    private final com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange selectedPlanCurrencyExchange;
    private final com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType selectedPlanPaymentLinkDisclosure;
    private final java.lang.String transferAttemptId;

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentMethodAccordionUiState(java.lang.String str, com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData planAccordionData, boolean z, com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange planCurrencyExchange, java.util.Map<java.lang.String, com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange> map, com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType summaryDisclosureType, java.util.Map<java.lang.String, ? extends com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType> map2, boolean z2, java.lang.String str2, boolean z3, com.paypal.oslo.feature.p2p.domain.model.FundingOption fundingOption, java.util.Map<java.lang.String, com.paypal.oslo.feature.p2p.domain.model.FundingOption> map3, boolean z4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planAccordionData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map3, "");
        this.name = str;
        this.planData = planAccordionData;
        this.hasAmexCard = z;
        this.selectedPlanCurrencyExchange = planCurrencyExchange;
        this.planCurrencyExchangeMap = map;
        this.selectedPlanPaymentLinkDisclosure = summaryDisclosureType;
        this.planPaymentLinkDisclosureMap = map2;
        this.hasForeignTaxDisclosure = z2;
        this.transferAttemptId = str2;
        this.isAddPaymentMethodEnabled = z3;
        this.selectedFundingOption = fundingOption;
        this.fundingOptionMap = map3;
        this.hasFundingOptionsError = z4;
    }

    public /* synthetic */ PaymentMethodAccordionUiState(java.lang.String str, com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData planAccordionData, boolean z, com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange planCurrencyExchange, java.util.Map map, com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType summaryDisclosureType, java.util.Map map2, boolean z2, java.lang.String str2, boolean z3, com.paypal.oslo.feature.p2p.domain.model.FundingOption fundingOption, java.util.Map map3, boolean z4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "PaymentMethodAccordionUiState" : str, (i & 2) != 0 ? com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.Companion.loading$default(com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.INSTANCE, false, 1, null) : planAccordionData, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : planCurrencyExchange, (i & 16) != 0 ? kotlin.collections.MapsKt.emptyMap() : map, (i & 32) != 0 ? null : summaryDisclosureType, (i & 64) != 0 ? kotlin.collections.MapsKt.emptyMap() : map2, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? "" : str2, (i & 512) != 0 ? false : z3, (i & 1024) == 0 ? fundingOption : null, (i & 2048) != 0 ? kotlin.collections.MapsKt.emptyMap() : map3, (i & 4096) == 0 ? z4 : false);
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public final java.lang.String getName() {
        return this.name;
    }

    public final com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData getPlanData() {
        return this.planData;
    }

    public final boolean getHasAmexCard() {
        return this.hasAmexCard;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange getSelectedPlanCurrencyExchange() {
        return this.selectedPlanCurrencyExchange;
    }

    public final java.util.Map<java.lang.String, com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange> getPlanCurrencyExchangeMap() {
        return this.planCurrencyExchangeMap;
    }

    public final com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType getSelectedPlanPaymentLinkDisclosure() {
        return this.selectedPlanPaymentLinkDisclosure;
    }

    public final java.util.Map<java.lang.String, com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType> getPlanPaymentLinkDisclosureMap() {
        return this.planPaymentLinkDisclosureMap;
    }

    public final boolean getHasForeignTaxDisclosure() {
        return this.hasForeignTaxDisclosure;
    }

    public final java.lang.String getTransferAttemptId() {
        return this.transferAttemptId;
    }

    public final boolean isAddPaymentMethodEnabled() {
        return this.isAddPaymentMethodEnabled;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.FundingOption getSelectedFundingOption() {
        return this.selectedFundingOption;
    }

    public final java.util.Map<java.lang.String, com.paypal.oslo.feature.p2p.domain.model.FundingOption> getFundingOptionMap() {
        return this.fundingOptionMap;
    }

    public final boolean getHasFundingOptionsError() {
        return this.hasFundingOptionsError;
    }

    public final boolean getHasUnresolvedCvvContingency() {
        return com.paypal.oslo.feature.p2p.ui.review.extensions.FundingOptionsExtensionsKt.hasUnresolvedCvvContingency(this.selectedFundingOption);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData planAccordionData = this.planData;
        boolean z = this.hasAmexCard;
        com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange planCurrencyExchange = this.selectedPlanCurrencyExchange;
        java.util.Map<java.lang.String, com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange> map = this.planCurrencyExchangeMap;
        com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType summaryDisclosureType = this.selectedPlanPaymentLinkDisclosure;
        java.util.Map<java.lang.String, com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType> map2 = this.planPaymentLinkDisclosureMap;
        boolean z2 = this.hasForeignTaxDisclosure;
        java.lang.String str2 = this.transferAttemptId;
        boolean z3 = this.isAddPaymentMethodEnabled;
        com.paypal.oslo.feature.p2p.domain.model.FundingOption fundingOption = this.selectedFundingOption;
        java.util.Map<java.lang.String, com.paypal.oslo.feature.p2p.domain.model.FundingOption> map3 = this.fundingOptionMap;
        boolean z4 = this.hasFundingOptionsError;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentMethodAccordionUiState(name=");
        sb.append(str);
        sb.append(", planData=");
        sb.append(planAccordionData);
        sb.append(", hasAmexCard=");
        sb.append(z);
        sb.append(", selectedPlanCurrencyExchange=");
        sb.append(planCurrencyExchange);
        sb.append(", planCurrencyExchangeMap=");
        sb.append(map);
        sb.append(", selectedPlanPaymentLinkDisclosure=");
        sb.append(summaryDisclosureType);
        sb.append(", planPaymentLinkDisclosureMap=");
        sb.append(map2);
        sb.append(", hasForeignTaxDisclosure=");
        sb.append(z2);
        sb.append(", transferAttemptId=");
        sb.append(str2);
        sb.append(", isAddPaymentMethodEnabled=");
        sb.append(z3);
        sb.append(", selectedFundingOption=");
        sb.append(fundingOption);
        sb.append(", fundingOptionMap=");
        sb.append(map3);
        sb.append(", hasFundingOptionsError=");
        sb.append(z4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode();
        int hashCode2 = this.planData.hashCode();
        int hashCode3 = java.lang.Boolean.hashCode(this.hasAmexCard);
        com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange planCurrencyExchange = this.selectedPlanCurrencyExchange;
        int hashCode4 = planCurrencyExchange == null ? 0 : planCurrencyExchange.hashCode();
        int hashCode5 = this.planCurrencyExchangeMap.hashCode();
        com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType summaryDisclosureType = this.selectedPlanPaymentLinkDisclosure;
        int hashCode6 = summaryDisclosureType == null ? 0 : summaryDisclosureType.hashCode();
        int hashCode7 = this.planPaymentLinkDisclosureMap.hashCode();
        int hashCode8 = java.lang.Boolean.hashCode(this.hasForeignTaxDisclosure);
        int hashCode9 = this.transferAttemptId.hashCode();
        int hashCode10 = java.lang.Boolean.hashCode(this.isAddPaymentMethodEnabled);
        com.paypal.oslo.feature.p2p.domain.model.FundingOption fundingOption = this.selectedFundingOption;
        return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (fundingOption != null ? fundingOption.hashCode() : 0)) * 31) + this.fundingOptionMap.hashCode()) * 31) + java.lang.Boolean.hashCode(this.hasFundingOptionsError);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodAccordionUiState)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodAccordionUiState paymentMethodAccordionUiState = (com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodAccordionUiState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, paymentMethodAccordionUiState.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.planData, paymentMethodAccordionUiState.planData) && this.hasAmexCard == paymentMethodAccordionUiState.hasAmexCard && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedPlanCurrencyExchange, paymentMethodAccordionUiState.selectedPlanCurrencyExchange) && kotlin.jvm.internal.Intrinsics.areEqual(this.planCurrencyExchangeMap, paymentMethodAccordionUiState.planCurrencyExchangeMap) && this.selectedPlanPaymentLinkDisclosure == paymentMethodAccordionUiState.selectedPlanPaymentLinkDisclosure && kotlin.jvm.internal.Intrinsics.areEqual(this.planPaymentLinkDisclosureMap, paymentMethodAccordionUiState.planPaymentLinkDisclosureMap) && this.hasForeignTaxDisclosure == paymentMethodAccordionUiState.hasForeignTaxDisclosure && kotlin.jvm.internal.Intrinsics.areEqual(this.transferAttemptId, paymentMethodAccordionUiState.transferAttemptId) && this.isAddPaymentMethodEnabled == paymentMethodAccordionUiState.isAddPaymentMethodEnabled && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedFundingOption, paymentMethodAccordionUiState.selectedFundingOption) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingOptionMap, paymentMethodAccordionUiState.fundingOptionMap) && this.hasFundingOptionsError == paymentMethodAccordionUiState.hasFundingOptionsError;
    }

    public final com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodAccordionUiState copy(java.lang.String name2, com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData planData, boolean hasAmexCard, com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange selectedPlanCurrencyExchange, java.util.Map<java.lang.String, com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange> planCurrencyExchangeMap, com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType selectedPlanPaymentLinkDisclosure, java.util.Map<java.lang.String, ? extends com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType> planPaymentLinkDisclosureMap, boolean hasForeignTaxDisclosure, java.lang.String transferAttemptId, boolean isAddPaymentMethodEnabled, com.paypal.oslo.feature.p2p.domain.model.FundingOption selectedFundingOption, java.util.Map<java.lang.String, com.paypal.oslo.feature.p2p.domain.model.FundingOption> fundingOptionMap, boolean hasFundingOptionsError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planCurrencyExchangeMap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planPaymentLinkDisclosureMap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferAttemptId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingOptionMap, "");
        return new com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodAccordionUiState(name2, planData, hasAmexCard, selectedPlanCurrencyExchange, planCurrencyExchangeMap, selectedPlanPaymentLinkDisclosure, planPaymentLinkDisclosureMap, hasForeignTaxDisclosure, transferAttemptId, isAddPaymentMethodEnabled, selectedFundingOption, fundingOptionMap, hasFundingOptionsError);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getTransferAttemptId() {
        return this.transferAttemptId;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getHasForeignTaxDisclosure() {
        return this.hasForeignTaxDisclosure;
    }

    public final java.util.Map<java.lang.String, com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType> component7() {
        return this.planPaymentLinkDisclosureMap;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType getSelectedPlanPaymentLinkDisclosure() {
        return this.selectedPlanPaymentLinkDisclosure;
    }

    public final java.util.Map<java.lang.String, com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange> component5() {
        return this.planCurrencyExchangeMap;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange getSelectedPlanCurrencyExchange() {
        return this.selectedPlanCurrencyExchange;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHasAmexCard() {
        return this.hasAmexCard;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData getPlanData() {
        return this.planData;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getHasFundingOptionsError() {
        return this.hasFundingOptionsError;
    }

    public final java.util.Map<java.lang.String, com.paypal.oslo.feature.p2p.domain.model.FundingOption> component12() {
        return this.fundingOptionMap;
    }

    /* renamed from: component11, reason: from getter */
    public final com.paypal.oslo.feature.p2p.domain.model.FundingOption getSelectedFundingOption() {
        return this.selectedFundingOption;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsAddPaymentMethodEnabled() {
        return this.isAddPaymentMethodEnabled;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public PaymentMethodAccordionUiState() {
        this(null, null, false, null, null, null, null, false, null, false, null, null, false, 8191, null);
    }
}
