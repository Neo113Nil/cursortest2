package com.paypal.oslo.feature.wallet.me.data.repository;

@kotlin.Metadata(d1 = {"\u0000¨\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\n\u001a\u00020\r*\u00020\fH\u0000¢\u0006\u0004\b\n\u0010\u000e\u001a\u0013\u0010\n\u001a\u00020\u0010*\u00020\u000fH\u0000¢\u0006\u0004\b\n\u0010\u0011\u001a\u0013\u0010\n\u001a\u00020\u0013*\u00020\u0012H\u0000¢\u0006\u0004\b\n\u0010\u0014\u001a\u0013\u0010\n\u001a\u00020\u0016*\u00020\u0015H\u0000¢\u0006\u0004\b\n\u0010\u0017\u001a\u0013\u0010\n\u001a\u00020\u0019*\u00020\u0018H\u0000¢\u0006\u0004\b\n\u0010\u001a\u001a\u0013\u0010\n\u001a\u00020\u001c*\u00020\u001bH\u0000¢\u0006\u0004\b\n\u0010\u001d\u001a\u0015\u0010 \u001a\u0004\u0018\u00010\u001f*\u00020\u001eH\u0000¢\u0006\u0004\b \u0010!\u001a\u0013\u0010 \u001a\u00020#*\u00020\"H\u0000¢\u0006\u0004\b \u0010$\u001a\u0013\u0010 \u001a\u00020&*\u00020%H\u0000¢\u0006\u0004\b \u0010'\u001a\u0019\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)*\u00020(H\u0000¢\u0006\u0004\b+\u0010,\u001a\u0015\u0010.\u001a\u0004\u0018\u00010**\u00020-H\u0000¢\u0006\u0004\b.\u0010/\u001a\u0013\u0010.\u001a\u000201*\u000200H\u0000¢\u0006\u0004\b.\u00102\u001a\u0013\u0010.\u001a\u000204*\u000203H\u0000¢\u0006\u0004\b.\u00105\u001a\u0013\u0010.\u001a\u000204*\u000206H\u0000¢\u0006\u0004\b.\u00107\u001a\u0013\u0010.\u001a\u000209*\u000208H\u0000¢\u0006\u0004\b.\u0010:\u001a\u0013\u0010.\u001a\u00020<*\u00020;H\u0000¢\u0006\u0004\b.\u0010=\u001a\u0017\u0010A\u001a\u00020@*\u00060>j\u0002`?H\u0000¢\u0006\u0004\bA\u0010B\u001a\u0013\u0010E\u001a\u00020D*\u00020CH\u0000¢\u0006\u0004\bE\u0010F\u001a\u0013\u0010E\u001a\u00020D*\u00020GH\u0000¢\u0006\u0004\bE\u0010H\u001a\u0013\u0010E\u001a\u00020D*\u00020IH\u0000¢\u0006\u0004\bE\u0010J\u001a\u0013\u0010E\u001a\u00020D*\u00020KH\u0000¢\u0006\u0004\bE\u0010L\u001a\u0013\u0010E\u001a\u00020D*\u00020MH\u0000¢\u0006\u0004\bE\u0010N\u001a\u0013\u0010E\u001a\u00020D*\u00020OH\u0000¢\u0006\u0004\bE\u0010P\u001a\u0013\u0010E\u001a\u00020D*\u00020QH\u0000¢\u0006\u0004\bE\u0010R\u001a\u0013\u0010E\u001a\u00020D*\u00020SH\u0000¢\u0006\u0004\bE\u0010T\u001a\u0013\u0010E\u001a\u00020D*\u00020UH\u0000¢\u0006\u0004\bE\u0010V\u001a\u0013\u0010E\u001a\u00020D*\u00020WH\u0000¢\u0006\u0004\bE\u0010X\u001a\u0017\u0010\\\u001a\u00020[*\u00060Yj\u0002`ZH\u0000¢\u0006\u0004\b\\\u0010]"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnBNPLComponent;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplProduct;", "asProduct", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnBNPLComponent;)Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplProduct;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$BnplProfilePresentation;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplOverview;", "asOverview", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$BnplProfilePresentation;)Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplOverview;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$Status;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus;", "asStatus", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$Status;)Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnBNPLProfileStatusDueOnSpecificDate;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus$DueOnSpecificDate;", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnBNPLProfileStatusDueOnSpecificDate;)Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus$DueOnSpecificDate;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnBNPLProfileStatusDueThisWeek;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus$DueThisWeek;", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnBNPLProfileStatusDueThisWeek;)Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus$DueThisWeek;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnBNPLProfileStatusDueToday;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus$DueToday;", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnBNPLProfileStatusDueToday;)Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus$DueToday;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnBNPLProfileStatusPending;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus$Pending;", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnBNPLProfileStatusPending;)Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus$Pending;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnBNPLProfileStatusPrequalified;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus$Prequalified;", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnBNPLProfileStatusPrequalified;)Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus$Prequalified;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnBNPLProfileStatusUnusedVirtualCard;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus$UnusedVirtualCard;", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnBNPLProfileStatusUnusedVirtualCard;)Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus$UnusedVirtualCard;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$NextBestAction;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplNextBestAction;", "asNextBestAction", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$NextBestAction;)Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplNextBestAction;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnBNPLApplyForPayLaterToGoPlan;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplNextBestAction$ApplyForPayLaterToGoPlan;", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnBNPLApplyForPayLaterToGoPlan;)Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplNextBestAction$ApplyForPayLaterToGoPlan;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnBNPLManageReadyToUsePlan;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplNextBestAction$ManageReadyToUsePlan;", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnBNPLManageReadyToUsePlan;)Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplNextBestAction$ManageReadyToUsePlan;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$Plans;", "", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan;", "asPlans", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$Plans;)Ljava/util/List;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$Item1;", "asPlan", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$Item1;)Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnBNPLOnTrackPlan;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$OnTrack;", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnBNPLOnTrackPlan;)Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$OnTrack;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnBNPLPastDuePlan;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$PastDue;", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnBNPLPastDuePlan;)Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$PastDue;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnBNPLDelinquentPlan;", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnBNPLDelinquentPlan;)Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$PastDue;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnBNPLPendingPlan;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$Pending;", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnBNPLPendingPlan;)Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$Pending;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnBNPLAlmostCompletePlan;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$AlmostComplete;", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnBNPLAlmostCompletePlan;)Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$AlmostComplete;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingPlanContextualLabel;", "Lcom/paypal/oslo/feature/wallet/graphql/type/BNPLServicingPlanContextualLabel;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$ContextualLabel;", "asContextualLabel", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingPlanContextualLabel;)Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan$ContextualLabel;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$AmountDue;", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "asMoney", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$AmountDue;)Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$CurrentBalanceAmount;", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$CurrentBalanceAmount;)Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$CurrentPaymentDue;", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$CurrentPaymentDue;)Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$NextPaymentDueAmount;", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$NextPaymentDueAmount;)Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OverdueAmount;", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OverdueAmount;)Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OverdueAmount1;", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OverdueAmount1;)Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$SpendingPower;", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$SpendingPower;)Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$TotalAmountDueThisWeek;", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$TotalAmountDueThisWeek;)Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$TotalAmountDueToday;", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$TotalAmountDueToday;)Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$TotalRemainingBalance;", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$TotalRemainingBalance;)Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;", "Lcom/paypal/oslo/feature/wallet/graphql/type/BNPLCreditProductIdentifier;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplProductId;", "asProductId", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;)Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplProductId;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class BnplComponentMapperKtKt {
    public static final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProduct asProduct(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.OnBNPLComponent onBNPLComponent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onBNPLComponent, "");
        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.BnplProfilePresentation bnplProfilePresentation = onBNPLComponent.getBnplProfilePresentation();
        if (bnplProfilePresentation != null) {
            return new com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProduct(true, asOverview(bnplProfilePresentation));
        }
        return null;
    }

    public static final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplOverview asOverview(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.BnplProfilePresentation bnplProfilePresentation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplProfilePresentation, "");
        if (bnplProfilePresentation.getPlans() == null) {
            return null;
        }
        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Status status = bnplProfilePresentation.getStatus();
        com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus asStatus = status != null ? asStatus(status) : null;
        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.NextBestAction nextBestAction = bnplProfilePresentation.getNextBestAction();
        return new com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplOverview(asMoney(bnplProfilePresentation.getPlans().getTotalRemainingBalance()), asPlans(bnplProfilePresentation.getPlans()), asStatus, nextBestAction != null ? asNextBestAction(nextBestAction) : null);
    }

    public static final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus asStatus(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Status status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        if (status.getOnBNPLProfileStatusDueOnSpecificDate() != null) {
            return asStatus(status.getOnBNPLProfileStatusDueOnSpecificDate());
        }
        if (status.getOnBNPLProfileStatusDueThisWeek() != null) {
            return asStatus(status.getOnBNPLProfileStatusDueThisWeek());
        }
        if (status.getOnBNPLProfileStatusDueToday() != null) {
            return asStatus(status.getOnBNPLProfileStatusDueToday());
        }
        if (status.getOnBNPLProfileStatusPending() != null) {
            return asStatus(status.getOnBNPLProfileStatusPending());
        }
        if (status.getOnBNPLProfileStatusPrequalified() != null) {
            return asStatus(status.getOnBNPLProfileStatusPrequalified());
        }
        if (status.getOnBNPLProfileStatusUnusedVirtualCard() != null) {
            return asStatus(status.getOnBNPLProfileStatusUnusedVirtualCard());
        }
        return null;
    }

    public static final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.DueOnSpecificDate asStatus(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.OnBNPLProfileStatusDueOnSpecificDate onBNPLProfileStatusDueOnSpecificDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onBNPLProfileStatusDueOnSpecificDate, "");
        com.paypal.oslo.feature.wallet.common.domain.model.Money asMoney = asMoney(onBNPLProfileStatusDueOnSpecificDate.getAmountDue());
        java.lang.Object dueDate = onBNPLProfileStatusDueOnSpecificDate.getDueDate();
        return new com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.DueOnSpecificDate(asMoney, dueDate != null ? dueDate.toString() : null);
    }

    public static final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.DueThisWeek asStatus(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.OnBNPLProfileStatusDueThisWeek onBNPLProfileStatusDueThisWeek) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onBNPLProfileStatusDueThisWeek, "");
        return new com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.DueThisWeek(asMoney(onBNPLProfileStatusDueThisWeek.getTotalAmountDueThisWeek()));
    }

    public static final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.DueToday asStatus(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.OnBNPLProfileStatusDueToday onBNPLProfileStatusDueToday) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onBNPLProfileStatusDueToday, "");
        return new com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.DueToday(asMoney(onBNPLProfileStatusDueToday.getTotalAmountDueToday()));
    }

    public static final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.Pending asStatus(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.OnBNPLProfileStatusPending onBNPLProfileStatusPending) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onBNPLProfileStatusPending, "");
        return new com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.Pending(onBNPLProfileStatusPending.getHasMultiplePendingPlans());
    }

    public static final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.Prequalified asStatus(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.OnBNPLProfileStatusPrequalified onBNPLProfileStatusPrequalified) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onBNPLProfileStatusPrequalified, "");
        return new com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.Prequalified(asMoney(onBNPLProfileStatusPrequalified.getSpendingPower()));
    }

    public static final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.UnusedVirtualCard asStatus(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.OnBNPLProfileStatusUnusedVirtualCard onBNPLProfileStatusUnusedVirtualCard) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onBNPLProfileStatusUnusedVirtualCard, "");
        return new com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.UnusedVirtualCard(onBNPLProfileStatusUnusedVirtualCard.getValidityDuration().toString());
    }

    public static final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplNextBestAction asNextBestAction(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.NextBestAction nextBestAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nextBestAction, "");
        if (nextBestAction.getOnBNPLApplyForPayLaterToGoPlan() != null) {
            return asNextBestAction(nextBestAction.getOnBNPLApplyForPayLaterToGoPlan());
        }
        if (nextBestAction.getOnBNPLManageReadyToUsePlan() != null) {
            return asNextBestAction(nextBestAction.getOnBNPLManageReadyToUsePlan());
        }
        return null;
    }

    public static final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplNextBestAction.ApplyForPayLaterToGoPlan asNextBestAction(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.OnBNPLApplyForPayLaterToGoPlan onBNPLApplyForPayLaterToGoPlan) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onBNPLApplyForPayLaterToGoPlan, "");
        java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier> eligibleCreditProductIdentifiers = onBNPLApplyForPayLaterToGoPlan.getEligibleCreditProductIdentifiers();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(eligibleCreditProductIdentifiers, 10));
        java.util.Iterator<T> it = eligibleCreditProductIdentifiers.iterator();
        while (it.hasNext()) {
            arrayList.add(asProductId((com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier) it.next()));
        }
        return new com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplNextBestAction.ApplyForPayLaterToGoPlan(arrayList);
    }

    public static final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplNextBestAction.ManageReadyToUsePlan asNextBestAction(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.OnBNPLManageReadyToUsePlan onBNPLManageReadyToUsePlan) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onBNPLManageReadyToUsePlan, "");
        return new com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplNextBestAction.ManageReadyToUsePlan(onBNPLManageReadyToUsePlan.getValidityDuration().toString());
    }

    public static final java.util.List<com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan> asPlans(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Plans plans) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plans, "");
        java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Item1> items = plans.getPage().getItems();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan asPlan = asPlan((com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Item1) it.next());
            if (asPlan != null) {
                arrayList.add(asPlan);
            }
        }
        return arrayList;
    }

    public static final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan asPlan(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Item1 item1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item1, "");
        if (item1.getOnBNPLOnTrackPlan() != null) {
            return asPlan(item1.getOnBNPLOnTrackPlan());
        }
        if (item1.getOnBNPLPastDuePlan() != null) {
            return asPlan(item1.getOnBNPLPastDuePlan());
        }
        if (item1.getOnBNPLDelinquentPlan() != null) {
            return asPlan(item1.getOnBNPLDelinquentPlan());
        }
        if (item1.getOnBNPLPendingPlan() != null) {
            return asPlan(item1.getOnBNPLPendingPlan());
        }
        if (item1.getOnBNPLAlmostCompletePlan() != null) {
            return asPlan(item1.getOnBNPLAlmostCompletePlan());
        }
        return null;
    }

    public static final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.OnTrack asPlan(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.OnBNPLOnTrackPlan onBNPLOnTrackPlan) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onBNPLOnTrackPlan, "");
        java.lang.String obj = onBNPLOnTrackPlan.getCreditAccountId().toString();
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanContextualLabel contextualLabel = onBNPLOnTrackPlan.getContextualLabel();
        com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel asContextualLabel = contextualLabel != null ? asContextualLabel(contextualLabel) : null;
        java.lang.Object merchantLogoUrl = onBNPLOnTrackPlan.getMerchantLogoUrl();
        java.lang.String obj2 = merchantLogoUrl != null ? merchantLogoUrl.toString() : null;
        java.lang.String merchantName = onBNPLOnTrackPlan.getMerchantName();
        java.lang.String name2 = onBNPLOnTrackPlan.getProduct().getName();
        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.CurrentPaymentDue currentPaymentDue = onBNPLOnTrackPlan.getCurrentPaymentDue();
        return new com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.OnTrack(obj, merchantName, name2, asMoney(onBNPLOnTrackPlan.getNextPaymentDueAmount()), onBNPLOnTrackPlan.getNextPaymentDueDate().toString(), onBNPLOnTrackPlan.isDueToday(), asContextualLabel, obj2, currentPaymentDue != null ? asMoney(currentPaymentDue) : null);
    }

    public static final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.PastDue asPlan(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.OnBNPLPastDuePlan onBNPLPastDuePlan) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onBNPLPastDuePlan, "");
        com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.PastDue.Type type = com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.PastDue.Type.PAST_DUE;
        java.lang.String obj = onBNPLPastDuePlan.getCreditAccountId().toString();
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanContextualLabel contextualLabel = onBNPLPastDuePlan.getContextualLabel();
        com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel asContextualLabel = contextualLabel != null ? asContextualLabel(contextualLabel) : null;
        java.lang.Object merchantLogoUrl = onBNPLPastDuePlan.getMerchantLogoUrl();
        return new com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.PastDue(type, obj, onBNPLPastDuePlan.getMerchantName(), onBNPLPastDuePlan.getProduct().getName(), asMoney(onBNPLPastDuePlan.getOverdueAmount()), asContextualLabel, merchantLogoUrl != null ? merchantLogoUrl.toString() : null);
    }

    public static final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.PastDue asPlan(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.OnBNPLDelinquentPlan onBNPLDelinquentPlan) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onBNPLDelinquentPlan, "");
        com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.PastDue.Type type = com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.PastDue.Type.DELINQUENT;
        java.lang.String obj = onBNPLDelinquentPlan.getCreditAccountId().toString();
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanContextualLabel contextualLabel = onBNPLDelinquentPlan.getContextualLabel();
        com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel asContextualLabel = contextualLabel != null ? asContextualLabel(contextualLabel) : null;
        java.lang.Object merchantLogoUrl = onBNPLDelinquentPlan.getMerchantLogoUrl();
        return new com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.PastDue(type, obj, onBNPLDelinquentPlan.getMerchantName(), onBNPLDelinquentPlan.getProduct().getName(), asMoney(onBNPLDelinquentPlan.getOverdueAmount()), asContextualLabel, merchantLogoUrl != null ? merchantLogoUrl.toString() : null);
    }

    public static final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.Pending asPlan(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.OnBNPLPendingPlan onBNPLPendingPlan) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onBNPLPendingPlan, "");
        java.lang.String obj = onBNPLPendingPlan.getCreditAccountId().toString();
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanContextualLabel contextualLabel = onBNPLPendingPlan.getContextualLabel();
        com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel asContextualLabel = contextualLabel != null ? asContextualLabel(contextualLabel) : null;
        java.lang.Object merchantLogoUrl = onBNPLPendingPlan.getMerchantLogoUrl();
        return new com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.Pending(obj, onBNPLPendingPlan.getMerchantName(), onBNPLPendingPlan.getProduct().getName(), asContextualLabel, merchantLogoUrl != null ? merchantLogoUrl.toString() : null);
    }

    public static final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.AlmostComplete asPlan(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.OnBNPLAlmostCompletePlan onBNPLAlmostCompletePlan) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onBNPLAlmostCompletePlan, "");
        java.lang.String obj = onBNPLAlmostCompletePlan.getCreditAccountId().toString();
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanContextualLabel contextualLabel = onBNPLAlmostCompletePlan.getContextualLabel();
        com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel asContextualLabel = contextualLabel != null ? asContextualLabel(contextualLabel) : null;
        java.lang.Object merchantLogoUrl = onBNPLAlmostCompletePlan.getMerchantLogoUrl();
        return new com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.AlmostComplete(obj, onBNPLAlmostCompletePlan.getMerchantName(), onBNPLAlmostCompletePlan.getProduct().getName(), asMoney(onBNPLAlmostCompletePlan.getCurrentBalanceAmount()), asContextualLabel, merchantLogoUrl != null ? merchantLogoUrl.toString() : null);
    }

    public static final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel asContextualLabel(com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanContextualLabel bNPLServicingPlanContextualLabel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bNPLServicingPlanContextualLabel, "");
        switch (com.paypal.oslo.feature.wallet.me.data.repository.BnplComponentMapperKtKt.WhenMappings.$EnumSwitchMapping$0[bNPLServicingPlanContextualLabel.ordinal()]) {
            case 1:
                return com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel.ALMOST_COMPLETE;
            case 2:
                return com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel.DELINQUENT;
            case 3:
                return com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel.HARDSHIP;
            case 4:
                return com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel.PAST_DUE;
            case 5:
                return com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel.PENDING;
            case 6:
                return com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel.PENDING_FRAUD;
            case 7:
                return com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel.SNOOZE_PENDING;
            default:
                return com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan.ContextualLabel.UNKNOWN;
        }
    }

    public static final com.paypal.oslo.feature.wallet.common.domain.model.Money asMoney(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.AmountDue amountDue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountDue, "");
        return new com.paypal.oslo.feature.wallet.common.domain.model.Money(amountDue.getOnMoney().getCurrencyCode().toString(), amountDue.getOnMoney().getValue());
    }

    public static final com.paypal.oslo.feature.wallet.common.domain.model.Money asMoney(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.CurrentBalanceAmount currentBalanceAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentBalanceAmount, "");
        return new com.paypal.oslo.feature.wallet.common.domain.model.Money(currentBalanceAmount.getOnMoney().getCurrencyCode().toString(), currentBalanceAmount.getOnMoney().getValue());
    }

    public static final com.paypal.oslo.feature.wallet.common.domain.model.Money asMoney(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.CurrentPaymentDue currentPaymentDue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentPaymentDue, "");
        return new com.paypal.oslo.feature.wallet.common.domain.model.Money(currentPaymentDue.getOnMoney().getCurrencyCode().toString(), currentPaymentDue.getOnMoney().getValue());
    }

    public static final com.paypal.oslo.feature.wallet.common.domain.model.Money asMoney(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.NextPaymentDueAmount nextPaymentDueAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nextPaymentDueAmount, "");
        return new com.paypal.oslo.feature.wallet.common.domain.model.Money(nextPaymentDueAmount.getOnMoney().getCurrencyCode().toString(), nextPaymentDueAmount.getOnMoney().getValue());
    }

    public static final com.paypal.oslo.feature.wallet.common.domain.model.Money asMoney(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.OverdueAmount overdueAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(overdueAmount, "");
        return new com.paypal.oslo.feature.wallet.common.domain.model.Money(overdueAmount.getOnMoney().getCurrencyCode().toString(), overdueAmount.getOnMoney().getValue());
    }

    public static final com.paypal.oslo.feature.wallet.common.domain.model.Money asMoney(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.OverdueAmount1 overdueAmount1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(overdueAmount1, "");
        return new com.paypal.oslo.feature.wallet.common.domain.model.Money(overdueAmount1.getOnMoney().getCurrencyCode().toString(), overdueAmount1.getOnMoney().getValue());
    }

    public static final com.paypal.oslo.feature.wallet.common.domain.model.Money asMoney(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.SpendingPower spendingPower) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spendingPower, "");
        return new com.paypal.oslo.feature.wallet.common.domain.model.Money(spendingPower.getOnMoney().getCurrencyCode().toString(), spendingPower.getOnMoney().getValue());
    }

    public static final com.paypal.oslo.feature.wallet.common.domain.model.Money asMoney(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.TotalAmountDueThisWeek totalAmountDueThisWeek) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAmountDueThisWeek, "");
        return new com.paypal.oslo.feature.wallet.common.domain.model.Money(totalAmountDueThisWeek.getOnMoney().getCurrencyCode().toString(), totalAmountDueThisWeek.getOnMoney().getValue());
    }

    public static final com.paypal.oslo.feature.wallet.common.domain.model.Money asMoney(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.TotalAmountDueToday totalAmountDueToday) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAmountDueToday, "");
        return new com.paypal.oslo.feature.wallet.common.domain.model.Money(totalAmountDueToday.getOnMoney().getCurrencyCode().toString(), totalAmountDueToday.getOnMoney().getValue());
    }

    public static final com.paypal.oslo.feature.wallet.common.domain.model.Money asMoney(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.TotalRemainingBalance totalRemainingBalance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalRemainingBalance, "");
        return new com.paypal.oslo.feature.wallet.common.domain.model.Money(totalRemainingBalance.getOnMoney().getCurrencyCode().toString(), totalRemainingBalance.getOnMoney().getValue());
    }

    public static final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProductId asProductId(com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier bNPLCreditProductIdentifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bNPLCreditProductIdentifier, "");
        switch (com.paypal.oslo.feature.wallet.me.data.repository.BnplComponentMapperKtKt.WhenMappings.$EnumSwitchMapping$1[bNPLCreditProductIdentifier.ordinal()]) {
            case 1:
                return com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProductId.PAY_LATER_AU;
            case 2:
                return com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProductId.PAY_LATER_DE;
            case 3:
                return com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProductId.PAY_LATER_FR;
            case 4:
                return com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProductId.PAY_LATER_GB;
            case 5:
                return com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProductId.PAY_LATER_LONG_TERM_AT;
            case 6:
                return com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProductId.PAY_LATER_LONG_TERM_ES;
            case 7:
                return com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProductId.PAY_LATER_LONG_TERM_FR;
            case 8:
                return com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProductId.PAY_LATER_LONG_TERM_IT;
            case 9:
                return com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProductId.PAY_LATER_LONG_TERM_US;
            case 10:
                return com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProductId.PAY_LATER_PAY_IN_1_AT;
            case 11:
                return com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProductId.PAY_LATER_PAY_IN_1_DE;
            case 12:
                return com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProductId.PAY_LATER_PAY_IN_1_GB;
            case 13:
                return com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProductId.PAY_LATER_SHORT_TERM_CA;
            case 14:
                return com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProductId.PAY_LATER_SHORT_TERM_ES;
            case 15:
                return com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProductId.PAY_LATER_SHORT_TERM_IT;
            case 16:
                return com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProductId.PAY_LATER_US;
            default:
                return com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplProductId.UNKNOWN;
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanContextualLabel.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanContextualLabel.ALMOST_COMPLETE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanContextualLabel.DELINQUENT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanContextualLabel.HARDSHIP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanContextualLabel.PAST_DUE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanContextualLabel.PENDING.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanContextualLabel.PENDING_FRAUD.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanContextualLabel.SNOOZE_PENDING.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier.values().length];
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier.PAY_LATER_AU.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier.PAY_LATER_DE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier.PAY_LATER_FR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier.PAY_LATER_GB.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier.PAY_LATER_LONG_TERM_AT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier.PAY_LATER_LONG_TERM_ES.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier.PAY_LATER_LONG_TERM_FR.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier.PAY_LATER_LONG_TERM_IT.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier.PAY_LATER_LONG_TERM_US.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier.PAY_LATER_PAY_IN_1_AT.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier.PAY_LATER_PAY_IN_1_DE.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier.PAY_LATER_PAY_IN_1_GB.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier.PAY_LATER_SHORT_TERM_CA.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier.PAY_LATER_SHORT_TERM_ES.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier.PAY_LATER_SHORT_TERM_IT.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier.PAY_LATER_US.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
