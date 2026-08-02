package com.paypal.oslo.feature.p2p.ui.review.events;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\t\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentMethodAccordionEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "PlanDataUpdated", "PlanSelected", "Expanded", "Collapsed", "AddPaymentMethodClicked", "TransferAttemptIdUpdated", "AddFIFlowCompleted", "FundingOptionsUnavailable", "CvvSubmitted", "Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentMethodAccordionEvent$AddFIFlowCompleted;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentMethodAccordionEvent$AddPaymentMethodClicked;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentMethodAccordionEvent$Collapsed;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentMethodAccordionEvent$CvvSubmitted;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentMethodAccordionEvent$Expanded;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentMethodAccordionEvent$FundingOptionsUnavailable;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentMethodAccordionEvent$PlanDataUpdated;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentMethodAccordionEvent$PlanSelected;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentMethodAccordionEvent$TransferAttemptIdUpdated;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class PaymentMethodAccordionEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private PaymentMethodAccordionEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u001c\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\bHÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u0017J\u0094\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\b2\b\b\u0002\u0010\u0011\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010\u0019R&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010\u001bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b7\u0010\u001dR&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b8\u0010\u001bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\b:\u0010 R&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00104\u001a\u0004\b;\u0010\u001bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b<\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentMethodAccordionEvent$PlanDataUpdated;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentMethodAccordionEvent;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionData;", "planData", "", "hasAmexCard", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanCurrencyExchange;", "selectedPlanCurrencyExchange", "", "", "planCurrencyExchangeMap", "Lcom/paypal/oslo/feature/p2p/domain/model/FundingOption;", "selectedFundingOption", "fundingOptionMap", "Lcom/paypal/oslo/feature/moneymovement/api/domain/SummaryDisclosureType;", "selectedPlanPaymentLinkDisclosure", "planPaymentLinkDisclosureMap", "hasForeignTaxDisclosure", "<init>", "(Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionData;ZLcom/paypal/oslo/feature/p2p/domain/model/PlanCurrencyExchange;Ljava/util/Map;Lcom/paypal/oslo/feature/p2p/domain/model/FundingOption;Ljava/util/Map;Lcom/paypal/oslo/feature/moneymovement/api/domain/SummaryDisclosureType;Ljava/util/Map;Z)V", "component1", "()Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionData;", "component2", "()Z", "component3", "()Lcom/paypal/oslo/feature/p2p/domain/model/PlanCurrencyExchange;", "component4", "()Ljava/util/Map;", "component5", "()Lcom/paypal/oslo/feature/p2p/domain/model/FundingOption;", "component6", "component7", "()Lcom/paypal/oslo/feature/moneymovement/api/domain/SummaryDisclosureType;", "component8", "component9", "copy", "(Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionData;ZLcom/paypal/oslo/feature/p2p/domain/model/PlanCurrencyExchange;Ljava/util/Map;Lcom/paypal/oslo/feature/p2p/domain/model/FundingOption;Ljava/util/Map;Lcom/paypal/oslo/feature/moneymovement/api/domain/SummaryDisclosureType;Ljava/util/Map;Z)Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentMethodAccordionEvent$PlanDataUpdated;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionData;", "getPlanData", "Z", "getHasAmexCard", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanCurrencyExchange;", "getSelectedPlanCurrencyExchange", "Ljava/util/Map;", "getPlanCurrencyExchangeMap", "Lcom/paypal/oslo/feature/p2p/domain/model/FundingOption;", "getSelectedFundingOption", "getFundingOptionMap", "Lcom/paypal/oslo/feature/moneymovement/api/domain/SummaryDisclosureType;", "getSelectedPlanPaymentLinkDisclosure", "getPlanPaymentLinkDisclosureMap", "getHasForeignTaxDisclosure"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PlanDataUpdated extends com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent {
        public static final int $stable = 8;
        private final java.util.Map<java.lang.String, com.paypal.oslo.feature.p2p.domain.model.FundingOption> fundingOptionMap;
        private final boolean hasAmexCard;
        private final boolean hasForeignTaxDisclosure;
        private final java.util.Map<java.lang.String, com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange> planCurrencyExchangeMap;
        private final com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData planData;
        private final java.util.Map<java.lang.String, com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType> planPaymentLinkDisclosureMap;
        private final com.paypal.oslo.feature.p2p.domain.model.FundingOption selectedFundingOption;
        private final com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange selectedPlanCurrencyExchange;
        private final com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType selectedPlanPaymentLinkDisclosure;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public PlanDataUpdated(com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData planAccordionData, boolean z, com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange planCurrencyExchange, java.util.Map<java.lang.String, com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange> map, com.paypal.oslo.feature.p2p.domain.model.FundingOption fundingOption, java.util.Map<java.lang.String, com.paypal.oslo.feature.p2p.domain.model.FundingOption> map2, com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType summaryDisclosureType, java.util.Map<java.lang.String, ? extends com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType> map3, boolean z2) {
            super("PlanDataUpdated", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planAccordionData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map3, "");
            this.planData = planAccordionData;
            this.hasAmexCard = z;
            this.selectedPlanCurrencyExchange = planCurrencyExchange;
            this.planCurrencyExchangeMap = map;
            this.selectedFundingOption = fundingOption;
            this.fundingOptionMap = map2;
            this.selectedPlanPaymentLinkDisclosure = summaryDisclosureType;
            this.planPaymentLinkDisclosureMap = map3;
            this.hasForeignTaxDisclosure = z2;
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

        public /* synthetic */ PlanDataUpdated(com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData planAccordionData, boolean z, com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange planCurrencyExchange, java.util.Map map, com.paypal.oslo.feature.p2p.domain.model.FundingOption fundingOption, java.util.Map map2, com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType summaryDisclosureType, java.util.Map map3, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(planAccordionData, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : planCurrencyExchange, (i & 8) != 0 ? kotlin.collections.MapsKt.emptyMap() : map, (i & 16) != 0 ? null : fundingOption, (i & 32) != 0 ? kotlin.collections.MapsKt.emptyMap() : map2, (i & 64) == 0 ? summaryDisclosureType : null, (i & 128) != 0 ? kotlin.collections.MapsKt.emptyMap() : map3, (i & 256) == 0 ? z2 : false);
        }

        public final java.util.Map<java.lang.String, com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange> getPlanCurrencyExchangeMap() {
            return this.planCurrencyExchangeMap;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.FundingOption getSelectedFundingOption() {
            return this.selectedFundingOption;
        }

        public final java.util.Map<java.lang.String, com.paypal.oslo.feature.p2p.domain.model.FundingOption> getFundingOptionMap() {
            return this.fundingOptionMap;
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

        public final java.lang.String toString() {
            com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData planAccordionData = this.planData;
            boolean z = this.hasAmexCard;
            com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange planCurrencyExchange = this.selectedPlanCurrencyExchange;
            java.util.Map<java.lang.String, com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange> map = this.planCurrencyExchangeMap;
            com.paypal.oslo.feature.p2p.domain.model.FundingOption fundingOption = this.selectedFundingOption;
            java.util.Map<java.lang.String, com.paypal.oslo.feature.p2p.domain.model.FundingOption> map2 = this.fundingOptionMap;
            com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType summaryDisclosureType = this.selectedPlanPaymentLinkDisclosure;
            java.util.Map<java.lang.String, com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType> map3 = this.planPaymentLinkDisclosureMap;
            boolean z2 = this.hasForeignTaxDisclosure;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PlanDataUpdated(planData=");
            sb.append(planAccordionData);
            sb.append(", hasAmexCard=");
            sb.append(z);
            sb.append(", selectedPlanCurrencyExchange=");
            sb.append(planCurrencyExchange);
            sb.append(", planCurrencyExchangeMap=");
            sb.append(map);
            sb.append(", selectedFundingOption=");
            sb.append(fundingOption);
            sb.append(", fundingOptionMap=");
            sb.append(map2);
            sb.append(", selectedPlanPaymentLinkDisclosure=");
            sb.append(summaryDisclosureType);
            sb.append(", planPaymentLinkDisclosureMap=");
            sb.append(map3);
            sb.append(", hasForeignTaxDisclosure=");
            sb.append(z2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.planData.hashCode();
            int hashCode2 = java.lang.Boolean.hashCode(this.hasAmexCard);
            com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange planCurrencyExchange = this.selectedPlanCurrencyExchange;
            int hashCode3 = planCurrencyExchange == null ? 0 : planCurrencyExchange.hashCode();
            int hashCode4 = this.planCurrencyExchangeMap.hashCode();
            com.paypal.oslo.feature.p2p.domain.model.FundingOption fundingOption = this.selectedFundingOption;
            int hashCode5 = fundingOption == null ? 0 : fundingOption.hashCode();
            int hashCode6 = this.fundingOptionMap.hashCode();
            com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType summaryDisclosureType = this.selectedPlanPaymentLinkDisclosure;
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (summaryDisclosureType != null ? summaryDisclosureType.hashCode() : 0)) * 31) + this.planPaymentLinkDisclosureMap.hashCode()) * 31) + java.lang.Boolean.hashCode(this.hasForeignTaxDisclosure);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.PlanDataUpdated)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.PlanDataUpdated planDataUpdated = (com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.PlanDataUpdated) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.planData, planDataUpdated.planData) && this.hasAmexCard == planDataUpdated.hasAmexCard && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedPlanCurrencyExchange, planDataUpdated.selectedPlanCurrencyExchange) && kotlin.jvm.internal.Intrinsics.areEqual(this.planCurrencyExchangeMap, planDataUpdated.planCurrencyExchangeMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedFundingOption, planDataUpdated.selectedFundingOption) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingOptionMap, planDataUpdated.fundingOptionMap) && this.selectedPlanPaymentLinkDisclosure == planDataUpdated.selectedPlanPaymentLinkDisclosure && kotlin.jvm.internal.Intrinsics.areEqual(this.planPaymentLinkDisclosureMap, planDataUpdated.planPaymentLinkDisclosureMap) && this.hasForeignTaxDisclosure == planDataUpdated.hasForeignTaxDisclosure;
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.PlanDataUpdated copy(com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData planData, boolean hasAmexCard, com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange selectedPlanCurrencyExchange, java.util.Map<java.lang.String, com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange> planCurrencyExchangeMap, com.paypal.oslo.feature.p2p.domain.model.FundingOption selectedFundingOption, java.util.Map<java.lang.String, com.paypal.oslo.feature.p2p.domain.model.FundingOption> fundingOptionMap, com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType selectedPlanPaymentLinkDisclosure, java.util.Map<java.lang.String, ? extends com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType> planPaymentLinkDisclosureMap, boolean hasForeignTaxDisclosure) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planCurrencyExchangeMap, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingOptionMap, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planPaymentLinkDisclosureMap, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.PlanDataUpdated(planData, hasAmexCard, selectedPlanCurrencyExchange, planCurrencyExchangeMap, selectedFundingOption, fundingOptionMap, selectedPlanPaymentLinkDisclosure, planPaymentLinkDisclosureMap, hasForeignTaxDisclosure);
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getHasForeignTaxDisclosure() {
            return this.hasForeignTaxDisclosure;
        }

        public final java.util.Map<java.lang.String, com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType> component8() {
            return this.planPaymentLinkDisclosureMap;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType getSelectedPlanPaymentLinkDisclosure() {
            return this.selectedPlanPaymentLinkDisclosure;
        }

        public final java.util.Map<java.lang.String, com.paypal.oslo.feature.p2p.domain.model.FundingOption> component6() {
            return this.fundingOptionMap;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.FundingOption getSelectedFundingOption() {
            return this.selectedFundingOption;
        }

        public final java.util.Map<java.lang.String, com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange> component4() {
            return this.planCurrencyExchangeMap;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange getSelectedPlanCurrencyExchange() {
            return this.selectedPlanCurrencyExchange;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getHasAmexCard() {
            return this.hasAmexCard;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData getPlanData() {
            return this.planData;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentMethodAccordionEvent$PlanSelected;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentMethodAccordionEvent;", "", "planId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentMethodAccordionEvent$PlanSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPlanId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PlanSelected extends com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent {
        public static final int $stable = 0;
        private final java.lang.String planId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlanSelected(java.lang.String str) {
            super("PlanSelected", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.planId = str;
        }

        public final java.lang.String getPlanId() {
            return this.planId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.planId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PlanSelected(planId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.planId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.PlanSelected) && kotlin.jvm.internal.Intrinsics.areEqual(this.planId, ((com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.PlanSelected) other).planId);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.PlanSelected copy(java.lang.String planId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planId, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.PlanSelected(planId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPlanId() {
            return this.planId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.PlanSelected copy$default(com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.PlanSelected planSelected, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = planSelected.planId;
            }
            return planSelected.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentMethodAccordionEvent$Expanded;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentMethodAccordionEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Expanded extends com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.Expanded INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.Expanded();

        public final int hashCode() {
            return -1901989290;
        }

        private Expanded() {
            super("Expanded", null);
        }

        public final java.lang.String toString() {
            return "Expanded";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.Expanded)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentMethodAccordionEvent$Collapsed;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentMethodAccordionEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Collapsed extends com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.Collapsed INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.Collapsed();

        public final int hashCode() {
            return -1264336806;
        }

        private Collapsed() {
            super("Collapsed", null);
        }

        public final java.lang.String toString() {
            return "Collapsed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.Collapsed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentMethodAccordionEvent$AddPaymentMethodClicked;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentMethodAccordionEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddPaymentMethodClicked extends com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.AddPaymentMethodClicked INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.AddPaymentMethodClicked();

        public final int hashCode() {
            return 1005321892;
        }

        private AddPaymentMethodClicked() {
            super("AddPaymentMethodClicked", null);
        }

        public final java.lang.String toString() {
            return "AddPaymentMethodClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.AddPaymentMethodClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentMethodAccordionEvent$TransferAttemptIdUpdated;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentMethodAccordionEvent;", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentMethodAccordionEvent$TransferAttemptIdUpdated;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTransferAttemptId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransferAttemptIdUpdated extends com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent {
        public static final int $stable = 0;
        private final java.lang.String transferAttemptId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransferAttemptIdUpdated(java.lang.String str) {
            super("TransferAttemptIdUpdated", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.transferAttemptId = str;
        }

        public final java.lang.String getTransferAttemptId() {
            return this.transferAttemptId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.transferAttemptId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransferAttemptIdUpdated(transferAttemptId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.transferAttemptId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.TransferAttemptIdUpdated) && kotlin.jvm.internal.Intrinsics.areEqual(this.transferAttemptId, ((com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.TransferAttemptIdUpdated) other).transferAttemptId);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.TransferAttemptIdUpdated copy(java.lang.String transferAttemptId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferAttemptId, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.TransferAttemptIdUpdated(transferAttemptId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTransferAttemptId() {
            return this.transferAttemptId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.TransferAttemptIdUpdated copy$default(com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.TransferAttemptIdUpdated transferAttemptIdUpdated, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = transferAttemptIdUpdated.transferAttemptId;
            }
            return transferAttemptIdUpdated.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentMethodAccordionEvent$AddFIFlowCompleted;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentMethodAccordionEvent;", "", "", "preferredFundingInstrumentIds", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentMethodAccordionEvent$AddFIFlowCompleted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getPreferredFundingInstrumentIds"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddFIFlowCompleted extends com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent {
        public static final int $stable = 8;
        private final java.util.List<java.lang.String> preferredFundingInstrumentIds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddFIFlowCompleted(java.util.List<java.lang.String> list) {
            super("AddFIFlowCompleted", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.preferredFundingInstrumentIds = list;
        }

        public final java.util.List<java.lang.String> getPreferredFundingInstrumentIds() {
            return this.preferredFundingInstrumentIds;
        }

        public final java.lang.String toString() {
            java.util.List<java.lang.String> list = this.preferredFundingInstrumentIds;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddFIFlowCompleted(preferredFundingInstrumentIds=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.preferredFundingInstrumentIds.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.AddFIFlowCompleted) && kotlin.jvm.internal.Intrinsics.areEqual(this.preferredFundingInstrumentIds, ((com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.AddFIFlowCompleted) other).preferredFundingInstrumentIds);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.AddFIFlowCompleted copy(java.util.List<java.lang.String> preferredFundingInstrumentIds) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preferredFundingInstrumentIds, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.AddFIFlowCompleted(preferredFundingInstrumentIds);
        }

        public final java.util.List<java.lang.String> component1() {
            return this.preferredFundingInstrumentIds;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.AddFIFlowCompleted copy$default(com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.AddFIFlowCompleted addFIFlowCompleted, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = addFIFlowCompleted.preferredFundingInstrumentIds;
            }
            return addFIFlowCompleted.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentMethodAccordionEvent$FundingOptionsUnavailable;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentMethodAccordionEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FundingOptionsUnavailable extends com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.FundingOptionsUnavailable INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.FundingOptionsUnavailable();

        public final int hashCode() {
            return -1480921934;
        }

        private FundingOptionsUnavailable() {
            super("FundingOptionsUnavailable", null);
        }

        public final java.lang.String toString() {
            return "FundingOptionsUnavailable";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.FundingOptionsUnavailable)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentMethodAccordionEvent$CvvSubmitted;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentMethodAccordionEvent;", "", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentMethodAccordionEvent$CvvSubmitted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCvv"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CvvSubmitted extends com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent {
        public static final int $stable = 0;
        private final java.lang.String cvv;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CvvSubmitted(java.lang.String str) {
            super("CvvSubmitted", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.cvv = str;
        }

        public final java.lang.String getCvv() {
            return this.cvv;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.cvv;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CvvSubmitted(cvv=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.cvv.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.CvvSubmitted) && kotlin.jvm.internal.Intrinsics.areEqual(this.cvv, ((com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.CvvSubmitted) other).cvv);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.CvvSubmitted copy(java.lang.String cvv) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cvv, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.CvvSubmitted(cvv);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCvv() {
            return this.cvv;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.CvvSubmitted copy$default(com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.CvvSubmitted cvvSubmitted, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = cvvSubmitted.cvv;
            }
            return cvvSubmitted.copy(str);
        }
    }

    public /* synthetic */ PaymentMethodAccordionEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
