package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.statement;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$Activity;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/activities/TransactionActivity;", "toTransactionActivity", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$Activity;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/activities/TransactionActivity;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class StatementActivityMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity toTransactionActivity(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Activity activity) {
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Cashback cashback;
        java.lang.Object percent;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        java.lang.Object id = activity.getId();
        java.lang.String obj = id != null ? id.toString() : null;
        java.lang.String str = obj == null ? "" : obj;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType activityType = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.activity.ActivityTypeMapperKt.toActivityType(activity.getType());
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(activity.getAmount().getRevolvingCreditMoneyFragment());
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.DisplayLogo displayLogo = activity.getDisplayLogo();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage domain = (displayLogo == null || (revolvingCreditImageFragment = displayLogo.getRevolvingCreditImageFragment()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CreditImageMapperKt.toDomain(revolvingCreditImageFragment);
        java.time.Instant anyToInstantOrNull = com.paypal.oslo.feature.revolvingcreditservicing.utils.DateUtilKt.anyToInstantOrNull(activity.getTransactionTime().toString());
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Rewards rewards = activity.getRewards();
        java.lang.String obj2 = (rewards == null || (cashback = rewards.getCashback()) == null || (percent = cashback.getPercent()) == null) ? null : percent.toString();
        java.lang.String description = activity.getDescription();
        java.lang.Boolean settled = activity.getSettled();
        java.lang.String businessName = activity.getBusinessName();
        java.lang.Object transactionReferenceNumber = activity.getTransactionReferenceNumber();
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.TransactionActivity(str, activityType, currencyAmount, anyToInstantOrNull, domain, description, settled, obj2, businessName, transactionReferenceNumber != null ? transactionReferenceNumber.toString() : null);
    }
}
