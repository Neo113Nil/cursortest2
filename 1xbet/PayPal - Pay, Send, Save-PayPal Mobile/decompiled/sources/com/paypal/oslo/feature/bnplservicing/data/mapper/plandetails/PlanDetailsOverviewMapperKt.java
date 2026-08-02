package com.paypal.oslo.feature.bnplservicing.data.mapper.plandetails;

@kotlin.Metadata(d1 = {"\u0000è\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0002H\u0000\u001a\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0005H\u0002\u001a\u0014\u0010\u0006\u001a\u00020\u0007*\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0002\u001a\u0014\u0010\n\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\b\u001a\u00020\fH\u0002\u001a\u0014\u0010\r\u001a\u00020\u000e*\u00020\u00052\u0006\u0010\b\u001a\u00020\u000fH\u0002\u001a\u0014\u0010\u0010\u001a\u00020\u0011*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0012H\u0002\u001a\u0014\u0010\u0013\u001a\u00020\u0014*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0015H\u0002\u001a\u0014\u0010\u0016\u001a\u00020\u0017*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0018H\u0002\u001a\u0014\u0010\u0019\u001a\u00020\u001a*\u00020\u00052\u0006\u0010\b\u001a\u00020\u001bH\u0002\u001a\u0014\u0010\u001c\u001a\u00020\u001d*\u00020\u00052\u0006\u0010\b\u001a\u00020\u001eH\u0002\u001a\f\u0010\u001f\u001a\u00020 *\u00020\tH\u0002\u001a\f\u0010\u001f\u001a\u00020 *\u00020\fH\u0002\u001a\f\u0010\u001f\u001a\u00020 *\u00020\u000fH\u0002\u001a\f\u0010\u001f\u001a\u00020 *\u00020\u0012H\u0002\u001a\f\u0010\u001f\u001a\u00020 *\u00020\u0015H\u0002\u001a\f\u0010\u001f\u001a\u00020 *\u00020\u0018H\u0002\u001a\f\u0010\u001f\u001a\u00020 *\u00020\u001bH\u0002\u001a\f\u0010\u001f\u001a\u00020 *\u00020\u001eH\u0002\u001aÀ\u0001\u0010!\u001a\u00020\"2\b\u0010\b\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010$\u001a\u00020%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010#2\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(2\b\b\u0002\u0010*\u001a\u00020#2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010,2\n\b\u0002\u00100\u001a\u0004\u0018\u00010,2\n\b\u0002\u00101\u001a\u0004\u0018\u00010#2\n\b\u0002\u00102\u001a\u0004\u0018\u0001032\n\b\u0002\u00104\u001a\u0004\u0018\u0001052\b\b\u0002\u00106\u001a\u0002072\u0010\b\u0002\u00108\u001a\n\u0012\u0004\u0012\u000209\u0018\u00010(H\u0002\u001a\f\u0010:\u001a\u00020;*\u00020<H\u0002\u001a\f\u0010=\u001a\u00020)*\u00020>H\u0002\u001a\f\u0010?\u001a\u000209*\u00020@H\u0002\u001a\u0016\u0010A\u001a\u00020B*\u00020C2\b\b\u0002\u0010D\u001a\u000207H\u0002\u001a\f\u0010E\u001a\u00020F*\u00020GH\u0002\u001a\f\u0010H\u001a\u00020I*\u000205H\u0002\u001a\f\u0010J\u001a\u00020K*\u00020LH\u0002¨\u0006M"}, d2 = {"toPlanDetailsOverview", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PlanDetailsOverview;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplServicingPlanOverviewQuery$Data;", "toPlanDetails", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PlanDetails;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplServicingPlanOverviewQuery$BnplPlan;", "toAlmostCompletePlan", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/AlmostCompletePlan;", "fragment", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplServicingPlanOverviewQuery$OnBNPLAlmostCompletePlan;", "toCompletedPlan", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/CompletedPlan;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplServicingPlanOverviewQuery$OnBNPLCompletedPlan;", "toDelinquentPlan", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/DelinquentPlan;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplServicingPlanOverviewQuery$OnBNPLDelinquentPlan;", "toMaturedPlan", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/MaturedPlan;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplServicingPlanOverviewQuery$OnBNPLMaturedPlan;", "toOnTrackPlan", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/OnTrackPlan;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplServicingPlanOverviewQuery$OnBNPLOnTrackPlan;", "toPastDuePlan", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PastDuePlan;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplServicingPlanOverviewQuery$OnBNPLPastDuePlan;", "toPendingPlan", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PendingPlan;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplServicingPlanOverviewQuery$OnBNPLPendingPlan;", "toReadyToUsePlan", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/ReadyToUsePlan;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplServicingPlanOverviewQuery$OnBNPLReadyToUsePlan;", "toPlanCommonFields", "Lcom/paypal/oslo/feature/bnplservicing/data/mapper/plandetails/PlanCommonFields;", "parsePlanCore", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PlanCore;", "", "merchantName", "", "transactionId", "documents", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Document;", "purchaseDate", "purchaseAmount", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingMoneyFragment;", "loanFeeAmount", "totalCostOfCredit", "lateFee", "totalInterest", "apr", "virtualCard", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlanOverviewVirtualCardFragment;", "installmentSummary", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingInstallmentSummaryFragment;", "isInReviewForFraud", "", "facilitatorOrder", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/FacilitatorOrder;", "toVariantPolicy", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/VariantPolicy;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingVariantPolicyFragment;", "toDocument", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingDocumentFragment;", "toFacilitatorOrder", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingFacilitatorOrderFragment;", "toAutopay", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Autopay;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingAutopayFragment;", "ignoreAutopayChecks", "toPlanActivity", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PlanActivity;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingActivityFragment;", "toInstallmentSummary", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/InstallmentSummary;", "toRemainingInstallment", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/RemainingInstallment;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingInstallmentSummaryFragment$RemainingInstallment;", "bnpl-servicing_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PlanDetailsOverviewMapperKt {
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetailsOverview toPlanDetailsOverview(com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Data data) {
        com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.BnplPlan bnplPlan;
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.ReadyToUsePlan readyToUsePlan;
        java.util.ArrayList arrayList;
        boolean z;
        java.util.ArrayList arrayList2;
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingAutopayFragment bnplServicingAutopayFragment;
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment bnplServicingInstallmentSummaryFragment;
        boolean z2;
        java.util.ArrayList arrayList3;
        java.util.ArrayList arrayList4;
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingAutopayFragment bnplServicingAutopayFragment2;
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment bnplServicingInstallmentSummaryFragment2;
        boolean z3;
        java.util.ArrayList arrayList5;
        java.util.ArrayList arrayList6;
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment;
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingAutopayFragment bnplServicingAutopayFragment3;
        java.util.ArrayList arrayList7;
        java.util.ArrayList arrayList8;
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingAutopayFragment bnplServicingAutopayFragment4;
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment2;
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingAutopayFragment bnplServicingAutopayFragment5;
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingAutopayFragment.PaymentFundingInstrument paymentFundingInstrument;
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPaymentFundingInstrumentFragment bnplServicingPaymentFundingInstrumentFragment;
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment bnplServicingInstallmentSummaryFragment3;
        boolean z4;
        java.util.ArrayList arrayList9;
        java.util.ArrayList arrayList10;
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingAutopayFragment bnplServicingAutopayFragment6;
        java.util.ArrayList arrayList11;
        java.util.ArrayList arrayList12;
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingAutopayFragment bnplServicingAutopayFragment7;
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment3;
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingAutopayFragment bnplServicingAutopayFragment8;
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingAutopayFragment.PaymentFundingInstrument paymentFundingInstrument2;
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPaymentFundingInstrumentFragment bnplServicingPaymentFundingInstrumentFragment2;
        java.util.ArrayList arrayList13;
        java.util.ArrayList arrayList14;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money2;
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment4;
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment5;
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingAutopayFragment bnplServicingAutopayFragment9;
        if (data == null || (bnplPlan = data.getBnplPlan()) == null) {
            return null;
        }
        if (bnplPlan.getOnBNPLAlmostCompletePlan() == null) {
            if (bnplPlan.getOnBNPLCompletedPlan() == null) {
                if (bnplPlan.getOnBNPLDelinquentPlan() == null) {
                    if (bnplPlan.getOnBNPLMaturedPlan() == null) {
                        if (bnplPlan.getOnBNPLOnTrackPlan() == null) {
                            if (bnplPlan.getOnBNPLPastDuePlan() == null) {
                                if (bnplPlan.getOnBNPLPendingPlan() == null) {
                                    if (bnplPlan.getOnBNPLReadyToUsePlan() != null) {
                                        com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.OnBNPLReadyToUsePlan onBNPLReadyToUsePlan = bnplPlan.getOnBNPLReadyToUsePlan();
                                        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.VirtualCard virtualCardWithPurchaseAmount = com.paypal.oslo.feature.bnplservicing.data.mapper.common.VirtualCardMapperKt.toVirtualCardWithPurchaseAmount(onBNPLReadyToUsePlan.getVirtualCardReady().getBnplServicingPlanOverviewVirtualCardFragment(), com.paypal.oslo.feature.bnplservicing.data.mapper.common.MoneyMapperKt.toMoney(onBNPLReadyToUsePlan.getApprovedLoanAmount().getBnplServicingMoneyFragment()));
                                        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment bnplServicingInstallmentSummaryFragment4 = onBNPLReadyToUsePlan.getInstallmentSummary().getBnplServicingInstallmentSummaryFragment();
                                        java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.FacilitatorOrder7> facilitatorOrders = onBNPLReadyToUsePlan.getFacilitatorOrders();
                                        if (facilitatorOrders != null) {
                                            java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.FacilitatorOrder7> list = facilitatorOrders;
                                            java.util.ArrayList arrayList15 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                                            java.util.Iterator<T> it = list.iterator();
                                            while (it.hasNext()) {
                                                com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingFacilitatorOrderFragment bnplServicingFacilitatorOrderFragment = ((com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.FacilitatorOrder7) it.next()).getBnplServicingFacilitatorOrderFragment();
                                                arrayList15.add(new com.paypal.oslo.feature.bnplservicing.domain.model.common.FacilitatorOrder(bnplServicingFacilitatorOrderFragment.getId(), bnplServicingFacilitatorOrderFragment.getUrl().toString()));
                                            }
                                            arrayList = arrayList15;
                                        } else {
                                            arrayList = null;
                                        }
                                        readyToUsePlan = new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.ReadyToUsePlan(getHighSpeedVideoSizes(onBNPLReadyToUsePlan, null, null, null, null, null, null, null, null, null, null, null, bnplServicingInstallmentSummaryFragment4, false, arrayList, 12286), virtualCardWithPurchaseAmount);
                                    } else {
                                        readyToUsePlan = null;
                                    }
                                } else {
                                    com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.OnBNPLPendingPlan onBNPLPendingPlan = bnplPlan.getOnBNPLPendingPlan();
                                    java.lang.String merchantName = onBNPLPendingPlan.getMerchantName();
                                    java.lang.Object transactionId = onBNPLPendingPlan.getTransactionId();
                                    java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Document6> documents = onBNPLPendingPlan.getDocuments();
                                    java.util.ArrayList arrayList16 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(documents, 10));
                                    java.util.Iterator<T> it2 = documents.iterator();
                                    while (it2.hasNext()) {
                                        arrayList16.add(Camera2StreamConfigurationMap(((com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Document6) it2.next()).getBnplServicingDocumentFragment()));
                                    }
                                    java.util.ArrayList arrayList17 = arrayList16;
                                    java.lang.Object purchaseDate = onBNPLPendingPlan.getPurchaseDate();
                                    com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment6 = onBNPLPendingPlan.getPurchaseAmount().getBnplServicingMoneyFragment();
                                    com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.LoanFeeAmount6 loanFeeAmount = onBNPLPendingPlan.getLoanFeeAmount();
                                    com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment7 = loanFeeAmount != null ? loanFeeAmount.getBnplServicingMoneyFragment() : null;
                                    com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.TotalCostOfCredit6 totalCostOfCredit = onBNPLPendingPlan.getTotalCostOfCredit();
                                    com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment8 = totalCostOfCredit != null ? totalCostOfCredit.getBnplServicingMoneyFragment() : null;
                                    com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.LateFee6 lateFee = onBNPLPendingPlan.getLateFee();
                                    com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment9 = lateFee != null ? lateFee.getBnplServicingMoneyFragment() : null;
                                    com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.TotalInterest6 totalInterest = onBNPLPendingPlan.getTotalInterest();
                                    com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment10 = totalInterest != null ? totalInterest.getBnplServicingMoneyFragment() : null;
                                    java.lang.Object apr = onBNPLPendingPlan.getApr();
                                    com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.VirtualCard6 virtualCard = onBNPLPendingPlan.getVirtualCard();
                                    com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlanOverviewVirtualCardFragment bnplServicingPlanOverviewVirtualCardFragment = virtualCard != null ? virtualCard.getBnplServicingPlanOverviewVirtualCardFragment() : null;
                                    boolean isInReviewForFraud = onBNPLPendingPlan.isInReviewForFraud();
                                    java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.FacilitatorOrder6> facilitatorOrders2 = onBNPLPendingPlan.getFacilitatorOrders();
                                    if (facilitatorOrders2 != null) {
                                        java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.FacilitatorOrder6> list2 = facilitatorOrders2;
                                        java.util.ArrayList arrayList18 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                                        java.util.Iterator it3 = list2.iterator();
                                        while (it3.hasNext()) {
                                            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingFacilitatorOrderFragment bnplServicingFacilitatorOrderFragment2 = ((com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.FacilitatorOrder6) it3.next()).getBnplServicingFacilitatorOrderFragment();
                                            arrayList18.add(new com.paypal.oslo.feature.bnplservicing.domain.model.common.FacilitatorOrder(bnplServicingFacilitatorOrderFragment2.getId(), bnplServicingFacilitatorOrderFragment2.getUrl().toString()));
                                            it3 = it3;
                                            isInReviewForFraud = isInReviewForFraud;
                                        }
                                        z = isInReviewForFraud;
                                        arrayList2 = arrayList18;
                                    } else {
                                        z = isInReviewForFraud;
                                        arrayList2 = null;
                                    }
                                    com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanCore highSpeedVideoSizes = getHighSpeedVideoSizes(onBNPLPendingPlan, merchantName, transactionId, arrayList17, purchaseDate, bnplServicingMoneyFragment6, bnplServicingMoneyFragment7, bnplServicingMoneyFragment8, bnplServicingMoneyFragment9, bnplServicingMoneyFragment10, apr, bnplServicingPlanOverviewVirtualCardFragment, null, z, arrayList2, 4096);
                                    com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Autopay6 autopay = onBNPLPendingPlan.getAutopay();
                                    readyToUsePlan = new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PendingPlan(highSpeedVideoSizes, (autopay == null || (bnplServicingAutopayFragment = autopay.getBnplServicingAutopayFragment()) == null) ? null : getHighSpeedVideoFpsRanges(bnplServicingAutopayFragment, false), onBNPLPendingPlan.getTotalInstallmentsCount(), onBNPLPendingPlan.getTotalInstallmentsPaid());
                                }
                            } else {
                                com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.OnBNPLPastDuePlan onBNPLPastDuePlan = bnplPlan.getOnBNPLPastDuePlan();
                                java.lang.String merchantName2 = onBNPLPastDuePlan.getMerchantName();
                                java.lang.Object transactionId2 = onBNPLPastDuePlan.getTransactionId();
                                java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Document5> documents2 = onBNPLPastDuePlan.getDocuments();
                                java.util.ArrayList arrayList19 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(documents2, 10));
                                java.util.Iterator<T> it4 = documents2.iterator();
                                while (it4.hasNext()) {
                                    arrayList19.add(Camera2StreamConfigurationMap(((com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Document5) it4.next()).getBnplServicingDocumentFragment()));
                                }
                                java.util.ArrayList arrayList20 = arrayList19;
                                java.lang.Object purchaseDate2 = onBNPLPastDuePlan.getPurchaseDate();
                                com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment11 = onBNPLPastDuePlan.getPurchaseAmount().getBnplServicingMoneyFragment();
                                com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.LoanFeeAmount5 loanFeeAmount2 = onBNPLPastDuePlan.getLoanFeeAmount();
                                com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment12 = loanFeeAmount2 != null ? loanFeeAmount2.getBnplServicingMoneyFragment() : null;
                                com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.TotalCostOfCredit5 totalCostOfCredit2 = onBNPLPastDuePlan.getTotalCostOfCredit();
                                com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment13 = totalCostOfCredit2 != null ? totalCostOfCredit2.getBnplServicingMoneyFragment() : null;
                                com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.LateFee5 lateFee2 = onBNPLPastDuePlan.getLateFee();
                                com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment14 = lateFee2 != null ? lateFee2.getBnplServicingMoneyFragment() : null;
                                com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.TotalInterest5 totalInterest2 = onBNPLPastDuePlan.getTotalInterest();
                                com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment15 = totalInterest2 != null ? totalInterest2.getBnplServicingMoneyFragment() : null;
                                java.lang.Object apr2 = onBNPLPastDuePlan.getApr();
                                com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.VirtualCard5 virtualCard2 = onBNPLPastDuePlan.getVirtualCard();
                                com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlanOverviewVirtualCardFragment bnplServicingPlanOverviewVirtualCardFragment2 = virtualCard2 != null ? virtualCard2.getBnplServicingPlanOverviewVirtualCardFragment() : null;
                                boolean isInReviewForFraud2 = onBNPLPastDuePlan.isInReviewForFraud();
                                com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment bnplServicingInstallmentSummaryFragment5 = onBNPLPastDuePlan.getInstallmentSummary().getBnplServicingInstallmentSummaryFragment();
                                java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.FacilitatorOrder5> facilitatorOrders3 = onBNPLPastDuePlan.getFacilitatorOrders();
                                if (facilitatorOrders3 != null) {
                                    java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.FacilitatorOrder5> list3 = facilitatorOrders3;
                                    bnplServicingInstallmentSummaryFragment = bnplServicingInstallmentSummaryFragment5;
                                    z2 = isInReviewForFraud2;
                                    java.util.ArrayList arrayList21 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                                    for (java.util.Iterator it5 = list3.iterator(); it5.hasNext(); it5 = it5) {
                                        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingFacilitatorOrderFragment bnplServicingFacilitatorOrderFragment3 = ((com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.FacilitatorOrder5) it5.next()).getBnplServicingFacilitatorOrderFragment();
                                        arrayList21.add(new com.paypal.oslo.feature.bnplservicing.domain.model.common.FacilitatorOrder(bnplServicingFacilitatorOrderFragment3.getId(), bnplServicingFacilitatorOrderFragment3.getUrl().toString()));
                                    }
                                    arrayList3 = arrayList21;
                                } else {
                                    bnplServicingInstallmentSummaryFragment = bnplServicingInstallmentSummaryFragment5;
                                    z2 = isInReviewForFraud2;
                                    arrayList3 = null;
                                }
                                com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanCore highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(onBNPLPastDuePlan, merchantName2, transactionId2, arrayList20, purchaseDate2, bnplServicingMoneyFragment11, bnplServicingMoneyFragment12, bnplServicingMoneyFragment13, bnplServicingMoneyFragment14, bnplServicingMoneyFragment15, apr2, bnplServicingPlanOverviewVirtualCardFragment2, bnplServicingInstallmentSummaryFragment, z2, arrayList3);
                                com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money3 = com.paypal.oslo.feature.bnplservicing.data.mapper.common.MoneyMapperKt.toMoney(onBNPLPastDuePlan.getPaidAmount().getBnplServicingMoneyFragment());
                                com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money4 = com.paypal.oslo.feature.bnplservicing.data.mapper.common.MoneyMapperKt.toMoney(onBNPLPastDuePlan.getOverdueAmount().getBnplServicingMoneyFragment());
                                com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Autopay5 autopay2 = onBNPLPastDuePlan.getAutopay();
                                com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay highSpeedVideoFpsRanges = (autopay2 == null || (bnplServicingAutopayFragment2 = autopay2.getBnplServicingAutopayFragment()) == null) ? null : getHighSpeedVideoFpsRanges(bnplServicingAutopayFragment2, false);
                                int totalInstallmentsPaid = onBNPLPastDuePlan.getTotalInstallmentsPaid();
                                int totalInstallmentsCount = onBNPLPastDuePlan.getTotalInstallmentsCount();
                                int totalInstallmentsRemaining = onBNPLPastDuePlan.getTotalInstallmentsRemaining();
                                int totalInstallmentsOverdue = onBNPLPastDuePlan.getTotalInstallmentsOverdue();
                                boolean isMiniMirandaRequired = onBNPLPastDuePlan.isMiniMirandaRequired();
                                java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Activity5> activities = onBNPLPastDuePlan.getActivities();
                                if (activities != null) {
                                    java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Activity5> list4 = activities;
                                    java.util.ArrayList arrayList22 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list4, 10));
                                    java.util.Iterator<T> it6 = list4.iterator();
                                    while (it6.hasNext()) {
                                        arrayList22.add(getHighSpeedVideoSizes(((com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Activity5) it6.next()).getBnplServicingActivityFragment()));
                                    }
                                    arrayList4 = arrayList22;
                                } else {
                                    arrayList4 = null;
                                }
                                readyToUsePlan = new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PastDuePlan(highSpeedVideoFpsRangesFor, money3, money4, highSpeedVideoFpsRanges, totalInstallmentsPaid, totalInstallmentsCount, totalInstallmentsRemaining, totalInstallmentsOverdue, isMiniMirandaRequired, arrayList4);
                            }
                        } else {
                            com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.OnBNPLOnTrackPlan onBNPLOnTrackPlan = bnplPlan.getOnBNPLOnTrackPlan();
                            java.lang.String merchantName3 = onBNPLOnTrackPlan.getMerchantName();
                            java.lang.Object transactionId3 = onBNPLOnTrackPlan.getTransactionId();
                            java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Document4> documents3 = onBNPLOnTrackPlan.getDocuments();
                            java.util.ArrayList arrayList23 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(documents3, 10));
                            java.util.Iterator<T> it7 = documents3.iterator();
                            while (it7.hasNext()) {
                                arrayList23.add(Camera2StreamConfigurationMap(((com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Document4) it7.next()).getBnplServicingDocumentFragment()));
                            }
                            java.util.ArrayList arrayList24 = arrayList23;
                            java.lang.Object purchaseDate3 = onBNPLOnTrackPlan.getPurchaseDate();
                            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment16 = onBNPLOnTrackPlan.getPurchaseAmount().getBnplServicingMoneyFragment();
                            com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.LoanFeeAmount4 loanFeeAmount3 = onBNPLOnTrackPlan.getLoanFeeAmount();
                            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment17 = loanFeeAmount3 != null ? loanFeeAmount3.getBnplServicingMoneyFragment() : null;
                            com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.TotalCostOfCredit4 totalCostOfCredit3 = onBNPLOnTrackPlan.getTotalCostOfCredit();
                            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment18 = totalCostOfCredit3 != null ? totalCostOfCredit3.getBnplServicingMoneyFragment() : null;
                            com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.TotalInterest4 totalInterest3 = onBNPLOnTrackPlan.getTotalInterest();
                            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment19 = totalInterest3 != null ? totalInterest3.getBnplServicingMoneyFragment() : null;
                            com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.LateFee4 lateFee3 = onBNPLOnTrackPlan.getLateFee();
                            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment20 = lateFee3 != null ? lateFee3.getBnplServicingMoneyFragment() : null;
                            java.lang.Object apr3 = onBNPLOnTrackPlan.getApr();
                            com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.VirtualCard4 virtualCard3 = onBNPLOnTrackPlan.getVirtualCard();
                            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlanOverviewVirtualCardFragment bnplServicingPlanOverviewVirtualCardFragment3 = virtualCard3 != null ? virtualCard3.getBnplServicingPlanOverviewVirtualCardFragment() : null;
                            boolean isInReviewForFraud3 = onBNPLOnTrackPlan.isInReviewForFraud();
                            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment bnplServicingInstallmentSummaryFragment6 = onBNPLOnTrackPlan.getInstallmentSummary().getBnplServicingInstallmentSummaryFragment();
                            java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.FacilitatorOrder4> facilitatorOrders4 = onBNPLOnTrackPlan.getFacilitatorOrders();
                            if (facilitatorOrders4 != null) {
                                java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.FacilitatorOrder4> list5 = facilitatorOrders4;
                                bnplServicingInstallmentSummaryFragment2 = bnplServicingInstallmentSummaryFragment6;
                                z3 = isInReviewForFraud3;
                                java.util.ArrayList arrayList25 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list5, 10));
                                for (java.util.Iterator it8 = list5.iterator(); it8.hasNext(); it8 = it8) {
                                    com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingFacilitatorOrderFragment bnplServicingFacilitatorOrderFragment4 = ((com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.FacilitatorOrder4) it8.next()).getBnplServicingFacilitatorOrderFragment();
                                    arrayList25.add(new com.paypal.oslo.feature.bnplservicing.domain.model.common.FacilitatorOrder(bnplServicingFacilitatorOrderFragment4.getId(), bnplServicingFacilitatorOrderFragment4.getUrl().toString()));
                                }
                                arrayList5 = arrayList25;
                            } else {
                                bnplServicingInstallmentSummaryFragment2 = bnplServicingInstallmentSummaryFragment6;
                                z3 = isInReviewForFraud3;
                                arrayList5 = null;
                            }
                            com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanCore highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(onBNPLOnTrackPlan, merchantName3, transactionId3, arrayList24, purchaseDate3, bnplServicingMoneyFragment16, bnplServicingMoneyFragment17, bnplServicingMoneyFragment18, bnplServicingMoneyFragment20, bnplServicingMoneyFragment19, apr3, bnplServicingPlanOverviewVirtualCardFragment3, bnplServicingInstallmentSummaryFragment2, z3, arrayList5);
                            com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money5 = com.paypal.oslo.feature.bnplservicing.data.mapper.common.MoneyMapperKt.toMoney(onBNPLOnTrackPlan.getPaidAmount().getBnplServicingMoneyFragment());
                            com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money6 = com.paypal.oslo.feature.bnplservicing.data.mapper.common.MoneyMapperKt.toMoney(onBNPLOnTrackPlan.getTotalRemainingAmount().getBnplServicingMoneyFragment());
                            com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Autopay4 autopay3 = onBNPLOnTrackPlan.getAutopay();
                            com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay highSpeedVideoFpsRanges2 = (autopay3 == null || (bnplServicingAutopayFragment3 = autopay3.getBnplServicingAutopayFragment()) == null) ? null : getHighSpeedVideoFpsRanges(bnplServicingAutopayFragment3, false);
                            int totalInstallmentsPaid2 = onBNPLOnTrackPlan.getTotalInstallmentsPaid();
                            int totalInstallmentsCount2 = onBNPLOnTrackPlan.getTotalInstallmentsCount();
                            int totalInstallmentsRemaining2 = onBNPLOnTrackPlan.getTotalInstallmentsRemaining();
                            java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Activity4> activities2 = onBNPLOnTrackPlan.getActivities();
                            if (activities2 != null) {
                                java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Activity4> list6 = activities2;
                                java.util.ArrayList arrayList26 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list6, 10));
                                java.util.Iterator<T> it9 = list6.iterator();
                                while (it9.hasNext()) {
                                    arrayList26.add(getHighSpeedVideoSizes(((com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Activity4) it9.next()).getBnplServicingActivityFragment()));
                                }
                                arrayList6 = arrayList26;
                            } else {
                                arrayList6 = null;
                            }
                            boolean isDueToday = onBNPLOnTrackPlan.isDueToday();
                            com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.CurrentPaymentDue currentPaymentDue = onBNPLOnTrackPlan.getCurrentPaymentDue();
                            readyToUsePlan = new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.OnTrackPlan(highSpeedVideoFpsRangesFor2, money5, money6, highSpeedVideoFpsRanges2, totalInstallmentsPaid2, totalInstallmentsCount2, totalInstallmentsRemaining2, arrayList6, null, isDueToday, (currentPaymentDue == null || (bnplServicingMoneyFragment = currentPaymentDue.getBnplServicingMoneyFragment()) == null) ? null : com.paypal.oslo.feature.bnplservicing.data.mapper.common.MoneyMapperKt.toMoney(bnplServicingMoneyFragment), 256, null);
                        }
                    } else {
                        com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.OnBNPLMaturedPlan onBNPLMaturedPlan = bnplPlan.getOnBNPLMaturedPlan();
                        java.lang.String merchantName4 = onBNPLMaturedPlan.getMerchantName();
                        java.lang.Object transactionId4 = onBNPLMaturedPlan.getTransactionId();
                        java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Document3> documents4 = onBNPLMaturedPlan.getDocuments();
                        java.util.ArrayList arrayList27 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(documents4, 10));
                        java.util.Iterator<T> it10 = documents4.iterator();
                        while (it10.hasNext()) {
                            arrayList27.add(Camera2StreamConfigurationMap(((com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Document3) it10.next()).getBnplServicingDocumentFragment()));
                        }
                        java.util.ArrayList arrayList28 = arrayList27;
                        java.lang.Object purchaseDate4 = onBNPLMaturedPlan.getPurchaseDate();
                        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment21 = onBNPLMaturedPlan.getPurchaseAmount().getBnplServicingMoneyFragment();
                        com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.LoanFeeAmount3 loanFeeAmount4 = onBNPLMaturedPlan.getLoanFeeAmount();
                        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment22 = loanFeeAmount4 != null ? loanFeeAmount4.getBnplServicingMoneyFragment() : null;
                        com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.TotalCostOfCredit3 totalCostOfCredit4 = onBNPLMaturedPlan.getTotalCostOfCredit();
                        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment23 = totalCostOfCredit4 != null ? totalCostOfCredit4.getBnplServicingMoneyFragment() : null;
                        com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.VirtualCard3 virtualCard4 = onBNPLMaturedPlan.getVirtualCard();
                        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlanOverviewVirtualCardFragment bnplServicingPlanOverviewVirtualCardFragment4 = virtualCard4 != null ? virtualCard4.getBnplServicingPlanOverviewVirtualCardFragment() : null;
                        com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.LateFee3 lateFee4 = onBNPLMaturedPlan.getLateFee();
                        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment24 = lateFee4 != null ? lateFee4.getBnplServicingMoneyFragment() : null;
                        com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.TotalInterest3 totalInterest4 = onBNPLMaturedPlan.getTotalInterest();
                        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment25 = totalInterest4 != null ? totalInterest4.getBnplServicingMoneyFragment() : null;
                        java.lang.Object apr4 = onBNPLMaturedPlan.getApr();
                        java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.FacilitatorOrder3> facilitatorOrders5 = onBNPLMaturedPlan.getFacilitatorOrders();
                        if (facilitatorOrders5 != null) {
                            java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.FacilitatorOrder3> list7 = facilitatorOrders5;
                            java.util.ArrayList arrayList29 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list7, 10));
                            for (java.util.Iterator it11 = list7.iterator(); it11.hasNext(); it11 = it11) {
                                com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingFacilitatorOrderFragment bnplServicingFacilitatorOrderFragment5 = ((com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.FacilitatorOrder3) it11.next()).getBnplServicingFacilitatorOrderFragment();
                                arrayList29.add(new com.paypal.oslo.feature.bnplservicing.domain.model.common.FacilitatorOrder(bnplServicingFacilitatorOrderFragment5.getId(), bnplServicingFacilitatorOrderFragment5.getUrl().toString()));
                            }
                            arrayList7 = arrayList29;
                        } else {
                            arrayList7 = null;
                        }
                        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanCore highSpeedVideoSizes2 = getHighSpeedVideoSizes(onBNPLMaturedPlan, merchantName4, transactionId4, arrayList28, purchaseDate4, bnplServicingMoneyFragment21, bnplServicingMoneyFragment22, bnplServicingMoneyFragment23, bnplServicingMoneyFragment24, bnplServicingMoneyFragment25, apr4, bnplServicingPlanOverviewVirtualCardFragment4, null, false, arrayList7, 12288);
                        com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Autopay3 autopay4 = onBNPLMaturedPlan.getAutopay();
                        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument = (autopay4 == null || (bnplServicingAutopayFragment5 = autopay4.getBnplServicingAutopayFragment()) == null || (paymentFundingInstrument = bnplServicingAutopayFragment5.getPaymentFundingInstrument()) == null || (bnplServicingPaymentFundingInstrumentFragment = paymentFundingInstrument.getBnplServicingPaymentFundingInstrumentFragment()) == null) ? null : com.paypal.oslo.feature.bnplservicing.data.mapper.common.FundingInstrumentMapperKt.toFundingInstrument(bnplServicingPaymentFundingInstrumentFragment);
                        java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Activity3> activities3 = onBNPLMaturedPlan.getActivities();
                        if (activities3 != null) {
                            java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Activity3> list8 = activities3;
                            java.util.ArrayList arrayList30 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list8, 10));
                            java.util.Iterator<T> it12 = list8.iterator();
                            while (it12.hasNext()) {
                                arrayList30.add(getHighSpeedVideoSizes(((com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Activity3) it12.next()).getBnplServicingActivityFragment()));
                            }
                            arrayList8 = arrayList30;
                        } else {
                            arrayList8 = null;
                        }
                        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaidOffPlanType paidOffPlanType = onBNPLMaturedPlan.isRefundPending() ? com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaidOffPlanType.REFUND_PENDING : com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaidOffPlanType.MATURED;
                        java.lang.String obj = onBNPLMaturedPlan.getPlanCompletedDateTime().toString();
                        com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.RefundAmount1 refundAmount = onBNPLMaturedPlan.getRefundAmount();
                        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money7 = (refundAmount == null || (bnplServicingMoneyFragment2 = refundAmount.getBnplServicingMoneyFragment()) == null) ? null : com.paypal.oslo.feature.bnplservicing.data.mapper.common.MoneyMapperKt.toMoney(bnplServicingMoneyFragment2);
                        com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Autopay3 autopay5 = onBNPLMaturedPlan.getAutopay();
                        readyToUsePlan = new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.MaturedPlan(highSpeedVideoSizes2, fundingInstrument, arrayList8, paidOffPlanType, obj, money7, (autopay5 == null || (bnplServicingAutopayFragment4 = autopay5.getBnplServicingAutopayFragment()) == null) ? null : getHighSpeedVideoFpsRanges(bnplServicingAutopayFragment4, true));
                    }
                } else {
                    com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.OnBNPLDelinquentPlan onBNPLDelinquentPlan = bnplPlan.getOnBNPLDelinquentPlan();
                    java.lang.String merchantName5 = onBNPLDelinquentPlan.getMerchantName();
                    java.lang.Object transactionId5 = onBNPLDelinquentPlan.getTransactionId();
                    java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Document2> documents5 = onBNPLDelinquentPlan.getDocuments();
                    java.util.ArrayList arrayList31 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(documents5, 10));
                    java.util.Iterator<T> it13 = documents5.iterator();
                    while (it13.hasNext()) {
                        arrayList31.add(Camera2StreamConfigurationMap(((com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Document2) it13.next()).getBnplServicingDocumentFragment()));
                    }
                    java.util.ArrayList arrayList32 = arrayList31;
                    java.lang.Object purchaseDate5 = onBNPLDelinquentPlan.getPurchaseDate();
                    com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment26 = onBNPLDelinquentPlan.getPurchaseAmount().getBnplServicingMoneyFragment();
                    com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.LoanFeeAmount2 loanFeeAmount5 = onBNPLDelinquentPlan.getLoanFeeAmount();
                    com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment27 = loanFeeAmount5 != null ? loanFeeAmount5.getBnplServicingMoneyFragment() : null;
                    com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.TotalCostOfCredit2 totalCostOfCredit5 = onBNPLDelinquentPlan.getTotalCostOfCredit();
                    com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment28 = totalCostOfCredit5 != null ? totalCostOfCredit5.getBnplServicingMoneyFragment() : null;
                    com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.LateFee2 lateFee5 = onBNPLDelinquentPlan.getLateFee();
                    com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment29 = lateFee5 != null ? lateFee5.getBnplServicingMoneyFragment() : null;
                    com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.TotalInterest2 totalInterest5 = onBNPLDelinquentPlan.getTotalInterest();
                    com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment30 = totalInterest5 != null ? totalInterest5.getBnplServicingMoneyFragment() : null;
                    java.lang.Object apr5 = onBNPLDelinquentPlan.getApr();
                    com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.VirtualCard2 virtualCard5 = onBNPLDelinquentPlan.getVirtualCard();
                    com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlanOverviewVirtualCardFragment bnplServicingPlanOverviewVirtualCardFragment5 = virtualCard5 != null ? virtualCard5.getBnplServicingPlanOverviewVirtualCardFragment() : null;
                    com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment bnplServicingInstallmentSummaryFragment7 = onBNPLDelinquentPlan.getInstallmentSummary().getBnplServicingInstallmentSummaryFragment();
                    boolean isInReviewForFraud4 = onBNPLDelinquentPlan.isInReviewForFraud();
                    java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.FacilitatorOrder2> facilitatorOrders6 = onBNPLDelinquentPlan.getFacilitatorOrders();
                    if (facilitatorOrders6 != null) {
                        java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.FacilitatorOrder2> list9 = facilitatorOrders6;
                        bnplServicingInstallmentSummaryFragment3 = bnplServicingInstallmentSummaryFragment7;
                        z4 = isInReviewForFraud4;
                        java.util.ArrayList arrayList33 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list9, 10));
                        for (java.util.Iterator it14 = list9.iterator(); it14.hasNext(); it14 = it14) {
                            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingFacilitatorOrderFragment bnplServicingFacilitatorOrderFragment6 = ((com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.FacilitatorOrder2) it14.next()).getBnplServicingFacilitatorOrderFragment();
                            arrayList33.add(new com.paypal.oslo.feature.bnplservicing.domain.model.common.FacilitatorOrder(bnplServicingFacilitatorOrderFragment6.getId(), bnplServicingFacilitatorOrderFragment6.getUrl().toString()));
                        }
                        arrayList9 = arrayList33;
                    } else {
                        bnplServicingInstallmentSummaryFragment3 = bnplServicingInstallmentSummaryFragment7;
                        z4 = isInReviewForFraud4;
                        arrayList9 = null;
                    }
                    com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanCore highSpeedVideoFpsRangesFor3 = getHighSpeedVideoFpsRangesFor(onBNPLDelinquentPlan, merchantName5, transactionId5, arrayList32, purchaseDate5, bnplServicingMoneyFragment26, bnplServicingMoneyFragment27, bnplServicingMoneyFragment28, bnplServicingMoneyFragment29, bnplServicingMoneyFragment30, apr5, bnplServicingPlanOverviewVirtualCardFragment5, bnplServicingInstallmentSummaryFragment3, z4, arrayList9);
                    com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money8 = com.paypal.oslo.feature.bnplservicing.data.mapper.common.MoneyMapperKt.toMoney(onBNPLDelinquentPlan.getPaidAmount().getBnplServicingMoneyFragment());
                    com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money9 = com.paypal.oslo.feature.bnplservicing.data.mapper.common.MoneyMapperKt.toMoney(onBNPLDelinquentPlan.getOverdueAmount().getBnplServicingMoneyFragment());
                    com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Autopay2 autopay6 = onBNPLDelinquentPlan.getAutopay();
                    com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay highSpeedVideoFpsRanges3 = (autopay6 == null || (bnplServicingAutopayFragment6 = autopay6.getBnplServicingAutopayFragment()) == null) ? null : getHighSpeedVideoFpsRanges(bnplServicingAutopayFragment6, false);
                    int totalInstallmentsPaid3 = onBNPLDelinquentPlan.getTotalInstallmentsPaid();
                    int totalInstallmentsCount3 = onBNPLDelinquentPlan.getTotalInstallmentsCount();
                    int totalInstallmentsRemaining3 = onBNPLDelinquentPlan.getTotalInstallmentsRemaining();
                    int totalInstallmentsOverdue2 = onBNPLDelinquentPlan.getTotalInstallmentsOverdue();
                    boolean isMiniMirandaRequired2 = onBNPLDelinquentPlan.isMiniMirandaRequired();
                    java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Activity2> activities4 = onBNPLDelinquentPlan.getActivities();
                    if (activities4 != null) {
                        java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Activity2> list10 = activities4;
                        java.util.ArrayList arrayList34 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list10, 10));
                        java.util.Iterator<T> it15 = list10.iterator();
                        while (it15.hasNext()) {
                            arrayList34.add(getHighSpeedVideoSizes(((com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Activity2) it15.next()).getBnplServicingActivityFragment()));
                        }
                        arrayList10 = arrayList34;
                    } else {
                        arrayList10 = null;
                    }
                    readyToUsePlan = new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.DelinquentPlan(highSpeedVideoFpsRangesFor3, money8, money9, highSpeedVideoFpsRanges3, totalInstallmentsPaid3, totalInstallmentsCount3, totalInstallmentsRemaining3, totalInstallmentsOverdue2, isMiniMirandaRequired2, arrayList10);
                }
            } else {
                com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.OnBNPLCompletedPlan onBNPLCompletedPlan = bnplPlan.getOnBNPLCompletedPlan();
                java.lang.Object transactionId6 = onBNPLCompletedPlan.getTransactionId();
                java.lang.String merchantName6 = onBNPLCompletedPlan.getMerchantName();
                java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Document1> documents6 = onBNPLCompletedPlan.getDocuments();
                java.util.ArrayList arrayList35 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(documents6, 10));
                java.util.Iterator<T> it16 = documents6.iterator();
                while (it16.hasNext()) {
                    arrayList35.add(Camera2StreamConfigurationMap(((com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Document1) it16.next()).getBnplServicingDocumentFragment()));
                }
                java.util.ArrayList arrayList36 = arrayList35;
                java.lang.Object purchaseDate6 = onBNPLCompletedPlan.getPurchaseDate();
                com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment31 = onBNPLCompletedPlan.getPurchaseAmount().getBnplServicingMoneyFragment();
                com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.LoanFeeAmount1 loanFeeAmount6 = onBNPLCompletedPlan.getLoanFeeAmount();
                com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment32 = loanFeeAmount6 != null ? loanFeeAmount6.getBnplServicingMoneyFragment() : null;
                com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.TotalCostOfCredit1 totalCostOfCredit6 = onBNPLCompletedPlan.getTotalCostOfCredit();
                com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment33 = totalCostOfCredit6 != null ? totalCostOfCredit6.getBnplServicingMoneyFragment() : null;
                com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.LateFee1 lateFee6 = onBNPLCompletedPlan.getLateFee();
                com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment34 = lateFee6 != null ? lateFee6.getBnplServicingMoneyFragment() : null;
                com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.TotalInterest1 totalInterest6 = onBNPLCompletedPlan.getTotalInterest();
                com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment35 = totalInterest6 != null ? totalInterest6.getBnplServicingMoneyFragment() : null;
                java.lang.Object apr6 = onBNPLCompletedPlan.getApr();
                com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.VirtualCard1 virtualCard6 = onBNPLCompletedPlan.getVirtualCard();
                com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlanOverviewVirtualCardFragment bnplServicingPlanOverviewVirtualCardFragment6 = virtualCard6 != null ? virtualCard6.getBnplServicingPlanOverviewVirtualCardFragment() : null;
                java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.FacilitatorOrder1> facilitatorOrders7 = onBNPLCompletedPlan.getFacilitatorOrders();
                if (facilitatorOrders7 != null) {
                    java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.FacilitatorOrder1> list11 = facilitatorOrders7;
                    java.util.ArrayList arrayList37 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list11, 10));
                    for (java.util.Iterator it17 = list11.iterator(); it17.hasNext(); it17 = it17) {
                        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingFacilitatorOrderFragment bnplServicingFacilitatorOrderFragment7 = ((com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.FacilitatorOrder1) it17.next()).getBnplServicingFacilitatorOrderFragment();
                        arrayList37.add(new com.paypal.oslo.feature.bnplservicing.domain.model.common.FacilitatorOrder(bnplServicingFacilitatorOrderFragment7.getId(), bnplServicingFacilitatorOrderFragment7.getUrl().toString()));
                    }
                    arrayList11 = arrayList37;
                } else {
                    arrayList11 = null;
                }
                com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanCore highSpeedVideoSizes3 = getHighSpeedVideoSizes(onBNPLCompletedPlan, merchantName6, transactionId6, arrayList36, purchaseDate6, bnplServicingMoneyFragment31, bnplServicingMoneyFragment32, bnplServicingMoneyFragment33, bnplServicingMoneyFragment34, bnplServicingMoneyFragment35, apr6, bnplServicingPlanOverviewVirtualCardFragment6, null, false, arrayList11, 12288);
                com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Autopay1 autopay7 = onBNPLCompletedPlan.getAutopay();
                com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument2 = (autopay7 == null || (bnplServicingAutopayFragment8 = autopay7.getBnplServicingAutopayFragment()) == null || (paymentFundingInstrument2 = bnplServicingAutopayFragment8.getPaymentFundingInstrument()) == null || (bnplServicingPaymentFundingInstrumentFragment2 = paymentFundingInstrument2.getBnplServicingPaymentFundingInstrumentFragment()) == null) ? null : com.paypal.oslo.feature.bnplservicing.data.mapper.common.FundingInstrumentMapperKt.toFundingInstrument(bnplServicingPaymentFundingInstrumentFragment2);
                java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Activity1> activities5 = onBNPLCompletedPlan.getActivities();
                if (activities5 != null) {
                    java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Activity1> list12 = activities5;
                    java.util.ArrayList arrayList38 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list12, 10));
                    java.util.Iterator<T> it18 = list12.iterator();
                    while (it18.hasNext()) {
                        arrayList38.add(getHighSpeedVideoSizes(((com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Activity1) it18.next()).getBnplServicingActivityFragment()));
                    }
                    arrayList12 = arrayList38;
                } else {
                    arrayList12 = null;
                }
                com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaidOffPlanType paidOffPlanType2 = onBNPLCompletedPlan.isRefundPending() ? com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaidOffPlanType.REFUND_PENDING : com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaidOffPlanType.COMPLETED;
                com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.RefundAmount refundAmount2 = onBNPLCompletedPlan.getRefundAmount();
                com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money10 = (refundAmount2 == null || (bnplServicingMoneyFragment3 = refundAmount2.getBnplServicingMoneyFragment()) == null) ? null : com.paypal.oslo.feature.bnplservicing.data.mapper.common.MoneyMapperKt.toMoney(bnplServicingMoneyFragment3);
                int totalInstallmentsCount4 = onBNPLCompletedPlan.getTotalInstallmentsCount();
                int totalInstallmentsPaid4 = onBNPLCompletedPlan.getTotalInstallmentsPaid();
                boolean isRefundPending = onBNPLCompletedPlan.isRefundPending();
                com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Autopay1 autopay8 = onBNPLCompletedPlan.getAutopay();
                readyToUsePlan = new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.CompletedPlan(highSpeedVideoSizes3, fundingInstrument2, arrayList12, paidOffPlanType2, money10, totalInstallmentsCount4, totalInstallmentsPaid4, isRefundPending, (autopay8 == null || (bnplServicingAutopayFragment7 = autopay8.getBnplServicingAutopayFragment()) == null) ? null : getHighSpeedVideoFpsRanges(bnplServicingAutopayFragment7, true));
            }
        } else {
            com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.OnBNPLAlmostCompletePlan onBNPLAlmostCompletePlan = bnplPlan.getOnBNPLAlmostCompletePlan();
            java.lang.String merchantName7 = onBNPLAlmostCompletePlan.getMerchantName();
            java.lang.Object transactionId7 = onBNPLAlmostCompletePlan.getTransactionId();
            java.lang.Object purchaseDate7 = onBNPLAlmostCompletePlan.getPurchaseDate();
            java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Document> documents7 = onBNPLAlmostCompletePlan.getDocuments();
            java.util.ArrayList arrayList39 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(documents7, 10));
            java.util.Iterator<T> it19 = documents7.iterator();
            while (it19.hasNext()) {
                arrayList39.add(Camera2StreamConfigurationMap(((com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Document) it19.next()).getBnplServicingDocumentFragment()));
            }
            java.util.ArrayList arrayList40 = arrayList39;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment36 = onBNPLAlmostCompletePlan.getPurchaseAmount().getBnplServicingMoneyFragment();
            com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.LoanFeeAmount loanFeeAmount7 = onBNPLAlmostCompletePlan.getLoanFeeAmount();
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment37 = loanFeeAmount7 != null ? loanFeeAmount7.getBnplServicingMoneyFragment() : null;
            com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.TotalCostOfCredit totalCostOfCredit7 = onBNPLAlmostCompletePlan.getTotalCostOfCredit();
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment38 = totalCostOfCredit7 != null ? totalCostOfCredit7.getBnplServicingMoneyFragment() : null;
            com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.LateFee lateFee7 = onBNPLAlmostCompletePlan.getLateFee();
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment39 = lateFee7 != null ? lateFee7.getBnplServicingMoneyFragment() : null;
            com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.TotalInterest totalInterest7 = onBNPLAlmostCompletePlan.getTotalInterest();
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment40 = totalInterest7 != null ? totalInterest7.getBnplServicingMoneyFragment() : null;
            java.lang.Object apr7 = onBNPLAlmostCompletePlan.getApr();
            com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.VirtualCard virtualCard7 = onBNPLAlmostCompletePlan.getVirtualCard();
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlanOverviewVirtualCardFragment bnplServicingPlanOverviewVirtualCardFragment7 = virtualCard7 != null ? virtualCard7.getBnplServicingPlanOverviewVirtualCardFragment() : null;
            boolean isInReviewForFraud5 = onBNPLAlmostCompletePlan.isInReviewForFraud();
            java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.FacilitatorOrder> facilitatorOrders8 = onBNPLAlmostCompletePlan.getFacilitatorOrders();
            if (facilitatorOrders8 != null) {
                java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.FacilitatorOrder> list13 = facilitatorOrders8;
                java.util.ArrayList arrayList41 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list13, 10));
                java.util.Iterator<T> it20 = list13.iterator();
                while (it20.hasNext()) {
                    com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingFacilitatorOrderFragment bnplServicingFacilitatorOrderFragment8 = ((com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.FacilitatorOrder) it20.next()).getBnplServicingFacilitatorOrderFragment();
                    arrayList41.add(new com.paypal.oslo.feature.bnplservicing.domain.model.common.FacilitatorOrder(bnplServicingFacilitatorOrderFragment8.getId(), bnplServicingFacilitatorOrderFragment8.getUrl().toString()));
                }
                arrayList13 = arrayList41;
            } else {
                arrayList13 = null;
            }
            com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanCore highSpeedVideoSizes4 = getHighSpeedVideoSizes(onBNPLAlmostCompletePlan, merchantName7, transactionId7, arrayList40, purchaseDate7, bnplServicingMoneyFragment36, bnplServicingMoneyFragment37, bnplServicingMoneyFragment38, bnplServicingMoneyFragment39, bnplServicingMoneyFragment40, apr7, bnplServicingPlanOverviewVirtualCardFragment7, null, isInReviewForFraud5, arrayList13, 4096);
            com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Autopay autopay9 = onBNPLAlmostCompletePlan.getAutopay();
            com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay highSpeedVideoFpsRanges4 = (autopay9 == null || (bnplServicingAutopayFragment9 = autopay9.getBnplServicingAutopayFragment()) == null) ? null : getHighSpeedVideoFpsRanges(bnplServicingAutopayFragment9, false);
            java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Activity> activities6 = onBNPLAlmostCompletePlan.getActivities();
            if (activities6 != null) {
                java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Activity> list14 = activities6;
                java.util.ArrayList arrayList42 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list14, 10));
                java.util.Iterator<T> it21 = list14.iterator();
                while (it21.hasNext()) {
                    arrayList42.add(getHighSpeedVideoSizes(((com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.Activity) it21.next()).getBnplServicingActivityFragment()));
                }
                arrayList14 = arrayList42;
            } else {
                arrayList14 = null;
            }
            com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.FeeAmount feeAmount = onBNPLAlmostCompletePlan.getFeeAmount();
            if (feeAmount == null || (bnplServicingMoneyFragment5 = feeAmount.getBnplServicingMoneyFragment()) == null || (money = com.paypal.oslo.feature.bnplservicing.data.mapper.common.MoneyMapperKt.toMoney(bnplServicingMoneyFragment5)) == null) {
                money = new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money("", "0");
            }
            com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money11 = money;
            com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.AccruedInterest accruedInterest = onBNPLAlmostCompletePlan.getAccruedInterest();
            if (accruedInterest == null || (bnplServicingMoneyFragment4 = accruedInterest.getBnplServicingMoneyFragment()) == null || (money2 = com.paypal.oslo.feature.bnplservicing.data.mapper.common.MoneyMapperKt.toMoney(bnplServicingMoneyFragment4)) == null) {
                money2 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money("", "0");
            }
            readyToUsePlan = new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.AlmostCompletePlan(highSpeedVideoSizes4, highSpeedVideoFpsRanges4, arrayList14, money11, money2, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PendingBalanceType.INSTANCE.from(onBNPLAlmostCompletePlan.getPendingBalanceType()));
        }
        if (readyToUsePlan != null) {
            return new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetailsOverview(readyToUsePlan);
        }
        return null;
    }

    private static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanCore getHighSpeedVideoSizes(java.lang.Object obj, java.lang.String str, java.lang.Object obj2, java.util.List list, java.lang.Object obj3, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment2, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment3, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment4, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment5, java.lang.Object obj4, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlanOverviewVirtualCardFragment bnplServicingPlanOverviewVirtualCardFragment, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment bnplServicingInstallmentSummaryFragment, boolean z, java.util.List list2, int i) {
        return getHighSpeedVideoFpsRangesFor(obj, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : obj2, (i & 8) != 0 ? null : list, (i & 16) == 0 ? obj3 : "", (i & 32) != 0 ? null : bnplServicingMoneyFragment, (i & 64) != 0 ? null : bnplServicingMoneyFragment2, (i & 128) != 0 ? null : bnplServicingMoneyFragment3, (i & 256) != 0 ? null : bnplServicingMoneyFragment4, (i & 512) != 0 ? null : bnplServicingMoneyFragment5, (i & 1024) != 0 ? null : obj4, (i & 2048) != 0 ? null : bnplServicingPlanOverviewVirtualCardFragment, (i & 4096) != 0 ? null : bnplServicingInstallmentSummaryFragment, (i & 8192) != 0 ? false : z, (i & 16384) == 0 ? list2 : null);
    }

    private static final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanCore getHighSpeedVideoFpsRangesFor(java.lang.Object obj, java.lang.String str, java.lang.Object obj2, java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.common.Document> list, java.lang.Object obj3, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment2, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment3, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment4, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment5, java.lang.Object obj4, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlanOverviewVirtualCardFragment bnplServicingPlanOverviewVirtualCardFragment, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment bnplServicingInstallmentSummaryFragment, boolean z, java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.common.FacilitatorOrder> list2) {
        java.lang.String str2;
        com.paypal.oslo.feature.bnplservicing.data.mapper.plandetails.PlanCommonFields planCommonFields;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy variantPolicy;
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentSummary installmentSummary;
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingVariantPolicyFragment bnplServicingVariantPolicyFragment;
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment bnplServicingMoneyFragment6;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanStatus bNPLServicingPlanStatus;
        com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier creditProductIdentifier;
        if (!(obj instanceof com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.OnBNPLAlmostCompletePlan)) {
            if (!(obj instanceof com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.OnBNPLCompletedPlan)) {
                if (!(obj instanceof com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.OnBNPLDelinquentPlan)) {
                    if (!(obj instanceof com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.OnBNPLMaturedPlan)) {
                        if (!(obj instanceof com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.OnBNPLOnTrackPlan)) {
                            if (!(obj instanceof com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.OnBNPLPastDuePlan)) {
                                if (!(obj instanceof com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.OnBNPLPendingPlan)) {
                                    if (!(obj instanceof com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.OnBNPLReadyToUsePlan)) {
                                        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.bnplservicing.LoggerKt.log;
                                        if (obj == null || (str2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(obj.getClass()).getSimpleName()) == null) {
                                            str2 = "null";
                                        }
                                        com.paypal.oslo.feature.bnplservicing.logger.BnplServLoggerUtilsKt.logUnknownMapping(logger, str2);
                                        planCommonFields = null;
                                    } else {
                                        com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.OnBNPLReadyToUsePlan onBNPLReadyToUsePlan = (com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.OnBNPLReadyToUsePlan) obj;
                                        planCommonFields = new com.paypal.oslo.feature.bnplservicing.data.mapper.plandetails.PlanCommonFields(onBNPLReadyToUsePlan.getCountryCode().toString(), onBNPLReadyToUsePlan.getCreditAccountId().toString(), onBNPLReadyToUsePlan.getCurrencyCode().toString(), onBNPLReadyToUsePlan.getPlanStatus(), onBNPLReadyToUsePlan.getProduct().getBnplServicingProductFragment(), onBNPLReadyToUsePlan.getVariantPolicy().getBnplServicingVariantPolicyFragment(), null, 64, null);
                                    }
                                } else {
                                    com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.OnBNPLPendingPlan onBNPLPendingPlan = (com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.OnBNPLPendingPlan) obj;
                                    planCommonFields = new com.paypal.oslo.feature.bnplservicing.data.mapper.plandetails.PlanCommonFields(onBNPLPendingPlan.getCountryCode().toString(), onBNPLPendingPlan.getCreditAccountId().toString(), onBNPLPendingPlan.getCurrencyCode().toString(), onBNPLPendingPlan.getPlanStatus(), onBNPLPendingPlan.getProduct().getBnplServicingProductFragment(), onBNPLPendingPlan.getVariantPolicy().getBnplServicingVariantPolicyFragment(), null, 64, null);
                                }
                            } else {
                                com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.OnBNPLPastDuePlan onBNPLPastDuePlan = (com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.OnBNPLPastDuePlan) obj;
                                java.lang.String obj5 = onBNPLPastDuePlan.getCountryCode().toString();
                                java.lang.String obj6 = onBNPLPastDuePlan.getCreditAccountId().toString();
                                java.lang.String obj7 = onBNPLPastDuePlan.getCurrencyCode().toString();
                                com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanStatus planStatus = onBNPLPastDuePlan.getPlanStatus();
                                com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingProductFragment bnplServicingProductFragment = onBNPLPastDuePlan.getProduct().getBnplServicingProductFragment();
                                com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingVariantPolicyFragment bnplServicingVariantPolicyFragment2 = onBNPLPastDuePlan.getVariantPolicy().getBnplServicingVariantPolicyFragment();
                                com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.AdjustedAmount5 adjustedAmount = onBNPLPastDuePlan.getAdjustedAmount();
                                planCommonFields = new com.paypal.oslo.feature.bnplservicing.data.mapper.plandetails.PlanCommonFields(obj5, obj6, obj7, planStatus, bnplServicingProductFragment, bnplServicingVariantPolicyFragment2, adjustedAmount != null ? adjustedAmount.getBnplServicingMoneyFragment() : null);
                            }
                        } else {
                            com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.OnBNPLOnTrackPlan onBNPLOnTrackPlan = (com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.OnBNPLOnTrackPlan) obj;
                            java.lang.String obj8 = onBNPLOnTrackPlan.getCountryCode().toString();
                            java.lang.String obj9 = onBNPLOnTrackPlan.getCreditAccountId().toString();
                            java.lang.String obj10 = onBNPLOnTrackPlan.getCurrencyCode().toString();
                            com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanStatus planStatus2 = onBNPLOnTrackPlan.getPlanStatus();
                            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingProductFragment bnplServicingProductFragment2 = onBNPLOnTrackPlan.getProduct().getBnplServicingProductFragment();
                            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingVariantPolicyFragment bnplServicingVariantPolicyFragment3 = onBNPLOnTrackPlan.getVariantPolicy().getBnplServicingVariantPolicyFragment();
                            com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.AdjustedAmount4 adjustedAmount2 = onBNPLOnTrackPlan.getAdjustedAmount();
                            planCommonFields = new com.paypal.oslo.feature.bnplservicing.data.mapper.plandetails.PlanCommonFields(obj8, obj9, obj10, planStatus2, bnplServicingProductFragment2, bnplServicingVariantPolicyFragment3, adjustedAmount2 != null ? adjustedAmount2.getBnplServicingMoneyFragment() : null);
                        }
                    } else {
                        com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.OnBNPLMaturedPlan onBNPLMaturedPlan = (com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.OnBNPLMaturedPlan) obj;
                        java.lang.String obj11 = onBNPLMaturedPlan.getCountryCode().toString();
                        java.lang.String obj12 = onBNPLMaturedPlan.getCreditAccountId().toString();
                        java.lang.String obj13 = onBNPLMaturedPlan.getCurrencyCode().toString();
                        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanStatus planStatus3 = onBNPLMaturedPlan.getPlanStatus();
                        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingProductFragment bnplServicingProductFragment3 = onBNPLMaturedPlan.getProduct().getBnplServicingProductFragment();
                        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingVariantPolicyFragment bnplServicingVariantPolicyFragment4 = onBNPLMaturedPlan.getVariantPolicy().getBnplServicingVariantPolicyFragment();
                        com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.AdjustedAmount3 adjustedAmount3 = onBNPLMaturedPlan.getAdjustedAmount();
                        planCommonFields = new com.paypal.oslo.feature.bnplservicing.data.mapper.plandetails.PlanCommonFields(obj11, obj12, obj13, planStatus3, bnplServicingProductFragment3, bnplServicingVariantPolicyFragment4, adjustedAmount3 != null ? adjustedAmount3.getBnplServicingMoneyFragment() : null);
                    }
                } else {
                    com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.OnBNPLDelinquentPlan onBNPLDelinquentPlan = (com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.OnBNPLDelinquentPlan) obj;
                    java.lang.String obj14 = onBNPLDelinquentPlan.getCountryCode().toString();
                    java.lang.String obj15 = onBNPLDelinquentPlan.getCreditAccountId().toString();
                    java.lang.String obj16 = onBNPLDelinquentPlan.getCurrencyCode().toString();
                    com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanStatus planStatus4 = onBNPLDelinquentPlan.getPlanStatus();
                    com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingProductFragment bnplServicingProductFragment4 = onBNPLDelinquentPlan.getProduct().getBnplServicingProductFragment();
                    com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingVariantPolicyFragment bnplServicingVariantPolicyFragment5 = onBNPLDelinquentPlan.getVariantPolicy().getBnplServicingVariantPolicyFragment();
                    com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.AdjustedAmount2 adjustedAmount4 = onBNPLDelinquentPlan.getAdjustedAmount();
                    planCommonFields = new com.paypal.oslo.feature.bnplservicing.data.mapper.plandetails.PlanCommonFields(obj14, obj15, obj16, planStatus4, bnplServicingProductFragment4, bnplServicingVariantPolicyFragment5, adjustedAmount4 != null ? adjustedAmount4.getBnplServicingMoneyFragment() : null);
                }
            } else {
                com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.OnBNPLCompletedPlan onBNPLCompletedPlan = (com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.OnBNPLCompletedPlan) obj;
                java.lang.String obj17 = onBNPLCompletedPlan.getCountryCode().toString();
                java.lang.String obj18 = onBNPLCompletedPlan.getCreditAccountId().toString();
                java.lang.String obj19 = onBNPLCompletedPlan.getCurrencyCode().toString();
                com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanStatus planStatus5 = onBNPLCompletedPlan.getPlanStatus();
                com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingProductFragment bnplServicingProductFragment5 = onBNPLCompletedPlan.getProduct().getBnplServicingProductFragment();
                com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingVariantPolicyFragment bnplServicingVariantPolicyFragment6 = onBNPLCompletedPlan.getVariantPolicy().getBnplServicingVariantPolicyFragment();
                com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.AdjustedAmount1 adjustedAmount5 = onBNPLCompletedPlan.getAdjustedAmount();
                planCommonFields = new com.paypal.oslo.feature.bnplservicing.data.mapper.plandetails.PlanCommonFields(obj17, obj18, obj19, planStatus5, bnplServicingProductFragment5, bnplServicingVariantPolicyFragment6, adjustedAmount5 != null ? adjustedAmount5.getBnplServicingMoneyFragment() : null);
            }
        } else {
            com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.OnBNPLAlmostCompletePlan onBNPLAlmostCompletePlan = (com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.OnBNPLAlmostCompletePlan) obj;
            java.lang.String obj20 = onBNPLAlmostCompletePlan.getCountryCode().toString();
            java.lang.String obj21 = onBNPLAlmostCompletePlan.getCreditAccountId().toString();
            java.lang.String obj22 = onBNPLAlmostCompletePlan.getCurrencyCode().toString();
            com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanStatus planStatus6 = onBNPLAlmostCompletePlan.getPlanStatus();
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingProductFragment bnplServicingProductFragment6 = onBNPLAlmostCompletePlan.getProduct().getBnplServicingProductFragment();
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingVariantPolicyFragment bnplServicingVariantPolicyFragment7 = onBNPLAlmostCompletePlan.getVariantPolicy().getBnplServicingVariantPolicyFragment();
            com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery.AdjustedAmount adjustedAmount6 = onBNPLAlmostCompletePlan.getAdjustedAmount();
            planCommonFields = new com.paypal.oslo.feature.bnplservicing.data.mapper.plandetails.PlanCommonFields(obj20, obj21, obj22, planStatus6, bnplServicingProductFragment6, bnplServicingVariantPolicyFragment7, adjustedAmount6 != null ? adjustedAmount6.getBnplServicingMoneyFragment() : null);
        }
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingProductFragment bnplServicingProductFragment7 = planCommonFields != null ? planCommonFields.getHighSpeedVideoFpsRanges : null;
        java.lang.String name2 = bnplServicingProductFragment7 != null ? bnplServicingProductFragment7.getName() : null;
        java.lang.String str3 = "";
        java.lang.String str4 = name2 == null ? "" : name2;
        java.lang.String str5 = planCommonFields != null ? planCommonFields.Camera2StreamConfigurationMap : null;
        java.lang.String str6 = str5 == null ? "" : str5;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.Companion companion = com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.INSTANCE;
        java.lang.String name3 = (bnplServicingProductFragment7 == null || (creditProductIdentifier = bnplServicingProductFragment7.getCreditProductIdentifier()) == null) ? null : creditProductIdentifier.name();
        if (name3 == null) {
            name3 = "";
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier from = companion.from(name3);
        com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.Companion companion2 = com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.INSTANCE;
        java.lang.String name4 = (planCommonFields == null || (bNPLServicingPlanStatus = planCommonFields.getHighSpeedVideoSizes) == null) ? null : bNPLServicingPlanStatus.name();
        if (name4 == null) {
            name4 = "";
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus from2 = companion2.from(name4);
        java.lang.String str7 = planCommonFields != null ? planCommonFields.getHighSpeedVideoFpsRangesFor : null;
        java.lang.String str8 = str7 == null ? "" : str7;
        java.lang.String obj23 = obj2 != null ? obj2.toString() : null;
        java.lang.String obj24 = obj3.toString();
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money = bnplServicingMoneyFragment != null ? com.paypal.oslo.feature.bnplservicing.data.mapper.common.MoneyMapperKt.toMoney(bnplServicingMoneyFragment) : null;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money2 = bnplServicingMoneyFragment2 != null ? com.paypal.oslo.feature.bnplservicing.data.mapper.common.MoneyMapperKt.toMoney(bnplServicingMoneyFragment2) : null;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money3 = bnplServicingMoneyFragment3 != null ? com.paypal.oslo.feature.bnplservicing.data.mapper.common.MoneyMapperKt.toMoney(bnplServicingMoneyFragment3) : null;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money4 = (planCommonFields == null || (bnplServicingMoneyFragment6 = planCommonFields.getInputSizeshNQ4ISI) == null) ? null : com.paypal.oslo.feature.bnplservicing.data.mapper.common.MoneyMapperKt.toMoney(bnplServicingMoneyFragment6);
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money5 = bnplServicingMoneyFragment4 != null ? com.paypal.oslo.feature.bnplservicing.data.mapper.common.MoneyMapperKt.toMoney(bnplServicingMoneyFragment4) : null;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money6 = bnplServicingMoneyFragment5 != null ? com.paypal.oslo.feature.bnplservicing.data.mapper.common.MoneyMapperKt.toMoney(bnplServicingMoneyFragment5) : null;
        java.lang.String obj25 = obj4 != null ? obj4.toString() : null;
        if (planCommonFields == null || (bnplServicingVariantPolicyFragment = planCommonFields.getHighSpeedVideoSizesFor) == null) {
            variantPolicy = new com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy(com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat.UNKNOWN, com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel.UNKNOWN, com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.AutopayRequirement.UNKNOWN);
        } else {
            variantPolicy = new com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy(com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat.INSTANCE.from(bnplServicingVariantPolicyFragment.getInstrumentFormat().name()), com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel.INSTANCE.from(bnplServicingVariantPolicyFragment.getUsageChannel().name()), com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.AutopayRequirement.INSTANCE.from(bnplServicingVariantPolicyFragment.getAutopayRequirement().name()));
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy variantPolicy2 = variantPolicy;
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.VirtualCard virtualCard = bnplServicingPlanOverviewVirtualCardFragment != null ? com.paypal.oslo.feature.bnplservicing.data.mapper.common.VirtualCardMapperKt.toVirtualCard(bnplServicingPlanOverviewVirtualCardFragment) : null;
        if (bnplServicingInstallmentSummaryFragment != null) {
            int totalRemainingInstallmentsCount = bnplServicingInstallmentSummaryFragment.getTotalRemainingInstallmentsCount();
            java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment.RemainingInstallment> remainingInstallments = bnplServicingInstallmentSummaryFragment.getRemainingInstallments();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(remainingInstallments, 10));
            java.util.Iterator it = remainingInstallments.iterator();
            while (it.hasNext()) {
                com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment.RemainingInstallment remainingInstallment = (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingInstallmentSummaryFragment.RemainingInstallment) it.next();
                java.lang.Object dueDate = remainingInstallment.getDueDate();
                java.lang.String str9 = dueDate instanceof java.lang.String ? (java.lang.String) dueDate : null;
                if (str9 == null) {
                    str9 = str3;
                }
                java.lang.Object currencyCode = remainingInstallment.getAmount().getCurrencyCode();
                java.util.Iterator it2 = it;
                java.lang.String str10 = currencyCode instanceof java.lang.String ? (java.lang.String) currencyCode : null;
                if (str10 == null) {
                    str10 = str3;
                }
                java.lang.String str11 = str3;
                com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money7 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money(str10, remainingInstallment.getAmount().getValue());
                com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus.Companion companion3 = com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDerivedStatus.INSTANCE;
                com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanInstallmentDerivedStatus derivedStatus = remainingInstallment.getDerivedStatus();
                java.lang.String name5 = derivedStatus != null ? derivedStatus.name() : null;
                if (name5 == null) {
                    name5 = str11;
                }
                arrayList.add(new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.RemainingInstallment(str9, money7, companion3.from(name5)));
                it = it2;
                str3 = str11;
            }
            installmentSummary = new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentSummary(totalRemainingInstallmentsCount, arrayList);
        } else {
            installmentSummary = null;
        }
        return new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanCore(str4, str, str6, from, from2, str8, obj23, obj24, money, money2, money3, money4, money5, money6, obj25, list, variantPolicy2, virtualCard, installmentSummary, z, list2);
    }

    private static final com.paypal.oslo.feature.bnplservicing.domain.model.common.Document Camera2StreamConfigurationMap(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingDocumentFragment bnplServicingDocumentFragment) {
        java.lang.String name2 = bnplServicingDocumentFragment.getName();
        java.lang.String fileName = bnplServicingDocumentFragment.getFileName();
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingLinkFragment bnplServicingLinkFragment = bnplServicingDocumentFragment.getLink().getBnplServicingLinkFragment();
        java.lang.String relativePath = bnplServicingLinkFragment.getRelativePath();
        java.lang.Object staticUrl = bnplServicingLinkFragment.getStaticUrl();
        java.lang.String obj = staticUrl != null ? staticUrl.toString() : null;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingDocumentLinkType type = bnplServicingLinkFragment.getType();
        return new com.paypal.oslo.feature.bnplservicing.domain.model.common.Document(name2, fileName, new com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link(relativePath, obj, type != null ? com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Link.Type.INSTANCE.from(type.name()) : null), com.paypal.oslo.feature.bnplservicing.domain.model.common.Document.Type.INSTANCE.from(bnplServicingDocumentFragment.getType().name()));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingAutopayFragment bnplServicingAutopayFragment, boolean z) {
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay.AlertContext alertContext;
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay.ActionType actionType;
        if (!z) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(bnplServicingAutopayFragment.isFundingInstrumentValid(), java.lang.Boolean.FALSE)) {
                alertContext = com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay.AlertContext.INVALID_FI;
            } else if (!bnplServicingAutopayFragment.getEnabled()) {
                alertContext = com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay.AlertContext.AUTOPAY_OFF;
            }
            com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay.AlertContext alertContext2 = alertContext;
            if (!bnplServicingAutopayFragment.getEnabled()) {
                actionType = com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay.ActionType.MANAGE_AUTOPAY;
            } else {
                actionType = com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay.ActionType.CHANGE_AUTOPAY;
            }
            return new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay(bnplServicingAutopayFragment.getEnabled(), com.paypal.oslo.feature.bnplservicing.data.mapper.common.FundingInstrumentMapperKt.toFundingInstrument(bnplServicingAutopayFragment.getPaymentFundingInstrument().getBnplServicingPaymentFundingInstrumentFragment()), alertContext2, actionType, bnplServicingAutopayFragment.getETag().toString());
        }
        alertContext = null;
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay.AlertContext alertContext22 = alertContext;
        if (!bnplServicingAutopayFragment.getEnabled()) {
        }
        return new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay(bnplServicingAutopayFragment.getEnabled(), com.paypal.oslo.feature.bnplservicing.data.mapper.common.FundingInstrumentMapperKt.toFundingInstrument(bnplServicingAutopayFragment.getPaymentFundingInstrument().getBnplServicingPaymentFundingInstrumentFragment()), alertContext22, actionType, bnplServicingAutopayFragment.getETag().toString());
    }

    private static final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanActivity getHighSpeedVideoSizes(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingActivityFragment bnplServicingActivityFragment) {
        java.lang.String obj = bnplServicingActivityFragment.getTransactionDate().toString();
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanActivity.PlanActivityType from = com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanActivity.PlanActivityType.INSTANCE.from(bnplServicingActivityFragment.getType().name());
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanActivity.PlanActivitySubType.Companion companion = com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanActivity.PlanActivitySubType.INSTANCE;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivitySubType subType = bnplServicingActivityFragment.getSubType();
        return new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanActivity(obj, from, companion.from(subType != null ? subType.name() : null), bnplServicingActivityFragment.getSoftDescriptor(), com.paypal.oslo.feature.bnplservicing.data.mapper.common.MoneyMapperKt.toMoney(bnplServicingActivityFragment.getTransactionAmount().getBnplServicingMoneyFragment()));
    }
}
