package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryOverView;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;", "toActivityHubArgs", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryOverView;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;)Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ActivityHubArgs;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AccountSummaryOverviewToActivityHubArgsMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs toActivityHubArgs(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSummaryOverView, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        java.lang.String creditAccountId = accountSummaryOverView.getCreditAccountId();
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity> repayments = accountSummaryOverView.getRepayments();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesPage activitiesOverview = accountSummaryOverView.getActivitiesOverview();
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity> creditActivities = activitiesOverview != null ? activitiesOverview.getCreditActivities() : null;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesPage activitiesOverview2 = accountSummaryOverView.getActivitiesOverview();
        boolean hasNextPage = activitiesOverview2 != null ? activitiesOverview2.getHasNextPage() : false;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesPage activitiesOverview3 = accountSummaryOverView.getActivitiesOverview();
        return new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs(creditProductIdentifier, creditAccountId, repayments, creditActivities, activitiesOverview3 != null ? activitiesOverview3.getNextOffset() : null, hasNextPage, accountSummaryOverView.getCustomerServiceContact());
    }
}
