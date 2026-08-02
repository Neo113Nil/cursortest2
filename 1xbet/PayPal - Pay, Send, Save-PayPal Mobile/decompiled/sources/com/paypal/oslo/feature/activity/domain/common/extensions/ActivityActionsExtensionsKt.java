package com.paypal.oslo.feature.activity.domain.common.extensions;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\u000b\u001a\u0004\u0018\u00010\b*\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\u000f\u001a\u00020\u000e*\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ActivityType;", "Lcom/paypal/oslo/feature/activity/graphql/type/ActivityType;", "activityType", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityFlags;", "activityFlags", "", "isUPRInvoiceTransaction", "(Lcom/paypal/oslo/api/graphql/schema/type/ActivityType;Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityFlags;)Z", "", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;", "activityActionModel", "toUPRPurchaseInvoiceIdIfApplicable", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;)Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionsTransactionInfo;", "Lcom/paypal/oslo/feature/p2p/api/navigation/PayRequestDestination;", "toPayNavigationDestination", "(Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionsTransactionInfo;)Lcom/paypal/oslo/feature/p2p/api/navigation/PayRequestDestination;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityActionsExtensionsKt {
    public static final boolean isUPRInvoiceTransaction(com.paypal.oslo.api.graphql.schema.type.ActivityType activityType, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags activityFlags) {
        return activityFlags != null && activityFlags.isUprTransaction() && ((activityType == com.paypal.oslo.api.graphql.schema.type.ActivityType.INVOICE) || (activityType == com.paypal.oslo.api.graphql.schema.type.ActivityType.PAYMENT));
    }

    public static final java.lang.String toUPRPurchaseInvoiceIdIfApplicable(java.lang.String str, com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionModel, "");
        com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo activityActionsTransactionInfo = activityActionModel.getActivityActionsTransactionInfo();
        boolean z = false;
        boolean z2 = (activityActionsTransactionInfo != null ? activityActionsTransactionInfo.getActivityType() : null) == com.paypal.oslo.api.graphql.schema.type.ActivityType.PAYMENT;
        com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo activityActionsTransactionInfo2 = activityActionModel.getActivityActionsTransactionInfo();
        com.paypal.oslo.api.graphql.schema.type.ActivityType activityType = activityActionsTransactionInfo2 != null ? activityActionsTransactionInfo2.getActivityType() : null;
        com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo activityActionsTransactionInfo3 = activityActionModel.getActivityActionsTransactionInfo();
        boolean isUPRInvoiceTransaction = isUPRInvoiceTransaction(activityType, activityActionsTransactionInfo3 != null ? activityActionsTransactionInfo3.getActivityFlags() : null);
        java.lang.String str2 = str;
        if (str2 != null && !kotlin.text.StringsKt.isBlank(str2) && kotlin.text.StringsKt.contains((java.lang.CharSequence) str2, (java.lang.CharSequence) com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityInvoiceConstants.ZETTLE_NO_STORE_PREFIX, true)) {
            z = true;
        }
        return (isUPRInvoiceTransaction && z2 && z) ? kotlin.text.StringsKt.replace(str, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityInvoiceConstants.ZETTLE_NO_STORE_PREFIX, "", true) : str;
    }

    public static final com.paypal.oslo.feature.p2p.api.navigation.PayRequestDestination toPayNavigationDestination(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo activityActionsTransactionInfo) {
        java.lang.String transactionId = activityActionsTransactionInfo != null ? activityActionsTransactionInfo.getTransactionId() : null;
        if (transactionId == null) {
            transactionId = "";
        }
        return new com.paypal.oslo.feature.p2p.api.navigation.PayRequestDestination(transactionId);
    }
}
