package com.paypal.oslo.feature.activity.ui.common;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;", "activityActionModel", "", "isPrimaryActionFlow", "(Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;)Z", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;", "activityTransactionModel", "Lcom/paypal/oslo/feature/activity/domain/navigation/model/TransactionTileNavigationTypes$XoomTransactionNavigation;", "isXoomNavigationTypeIfApplicable", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;)Lcom/paypal/oslo/feature/activity/domain/navigation/model/TransactionTileNavigationTypes$XoomTransactionNavigation;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityActionExtensionsKt {
    public static final boolean isPrimaryActionFlow(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
        com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo activityActionsTransactionInfo;
        com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo activityActionsTransactionInfo2;
        com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo activityActionsTransactionInfo3;
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags activityFlags = null;
        boolean z = (activityActionModel != null ? activityActionModel.getType() : null) == com.paypal.oslo.api.graphql.schema.type.ActivityActionType.VIEW_INVOICE_RECEIPT;
        boolean z2 = ((activityActionModel == null || (activityActionsTransactionInfo3 = activityActionModel.getActivityActionsTransactionInfo()) == null) ? null : activityActionsTransactionInfo3.getActivityType()) == com.paypal.oslo.api.graphql.schema.type.ActivityType.INVOICE;
        com.paypal.oslo.api.graphql.schema.type.ActivityType activityType = (activityActionModel == null || (activityActionsTransactionInfo2 = activityActionModel.getActivityActionsTransactionInfo()) == null) ? null : activityActionsTransactionInfo2.getActivityType();
        if (activityActionModel != null && (activityActionsTransactionInfo = activityActionModel.getActivityActionsTransactionInfo()) != null) {
            activityFlags = activityActionsTransactionInfo.getActivityFlags();
        }
        return (com.paypal.oslo.feature.activity.domain.common.extensions.ActivityActionsExtensionsKt.isUPRInvoiceTransaction(activityType, activityFlags) || z2) && z;
    }

    public static final com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes.XoomTransactionNavigation isXoomNavigationTypeIfApplicable(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel) {
        if (activityTransactionModel == null || !com.paypal.oslo.feature.activity.domain.common.extensions.ActivityActionFilterExtensionsKt.isXoomTransactionFlow(activityTransactionModel)) {
            return null;
        }
        return new com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes.XoomTransactionNavigation(com.paypal.oslo.feature.activity.domain.common.extensions.ActivityExtensionsKt.toXoomTransactionDestinationKey(activityTransactionModel));
    }
}
