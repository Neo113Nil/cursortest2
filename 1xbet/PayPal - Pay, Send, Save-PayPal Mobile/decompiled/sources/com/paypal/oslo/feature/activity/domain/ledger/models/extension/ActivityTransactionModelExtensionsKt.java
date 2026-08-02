package com.paypal.oslo.feature.activity.domain.ledger.models.extension;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\b\u001a\u00020\u0007*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\n\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\n\u0010\u0003\u001a#\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00002\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;", "toUPRActionModel", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;)Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;", "", "isMerchantPhysicalGoodsTransaction", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;)Z", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionsTransactionInfo;", "toActivityActionsTransactionInfo", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;)Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionsTransactionInfo;", "toInvoiceORUPRActionModel", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityActionType;", "Lcom/paypal/oslo/feature/activity/graphql/type/ActivityActionType;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.ACTION_TYPE_KEY, "toActivityActionModel", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;Lcom/paypal/oslo/api/graphql/schema/type/ActivityActionType;)Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityTransactionModelExtensionsKt {
    public static final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel toUPRActionModel(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel) {
        if (!com.paypal.oslo.feature.activity.domain.common.extensions.ActivityActionsExtensionsKt.isUPRInvoiceTransaction(activityTransactionModel != null ? activityTransactionModel.getType() : null, activityTransactionModel != null ? activityTransactionModel.getActivityFlags() : null) || activityTransactionModel == null) {
            return null;
        }
        return toActivityActionModel(activityTransactionModel, com.paypal.oslo.api.graphql.schema.type.ActivityActionType.VIEW_INVOICE_RECEIPT);
    }

    public static final boolean isMerchantPhysicalGoodsTransaction(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel) {
        java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityChannel> channels;
        java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityPurpose> purposes;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityTransactionModel, "");
        java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityStatus> orNull = new com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus.Completed(null, 1, null).getActivityStatuses().getOrNull();
        if (orNull == null) {
            orNull = kotlin.collections.CollectionsKt.emptyList();
        }
        return kotlin.collections.CollectionsKt.contains(orNull, activityTransactionModel.getActivityStatus()) && (channels = activityTransactionModel.getChannels()) != null && channels.contains(com.paypal.oslo.api.graphql.schema.type.ActivityChannel.CHECKOUT) && (purposes = activityTransactionModel.getPurposes()) != null && purposes.contains(com.paypal.oslo.api.graphql.schema.type.ActivityPurpose.PURCHASE_GOODS);
    }

    public static final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo toActivityActionsTransactionInfo(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel) {
        com.paypal.oslo.api.graphql.schema.type.ActivityType activityType;
        java.lang.String id = activityTransactionModel != null ? activityTransactionModel.getId() : null;
        java.lang.String groupId = activityTransactionModel != null ? activityTransactionModel.getGroupId() : null;
        java.lang.String invoiceId = activityTransactionModel != null ? activityTransactionModel.getInvoiceId() : null;
        if (activityTransactionModel == null || (activityType = activityTransactionModel.getType()) == null) {
            activityType = com.paypal.oslo.api.graphql.schema.type.ActivityType.UNKNOWN__;
        }
        return new com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo(id, groupId, invoiceId, activityType, activityTransactionModel != null ? activityTransactionModel.getActivityFlags() : null, activityTransactionModel != null ? activityTransactionModel.getAmountInformation() : null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, 448, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if (com.paypal.oslo.feature.activity.domain.common.extensions.ActivityActionsExtensionsKt.isUPRInvoiceTransaction(r3 != null ? r3.getType() : null, r3 != null ? r3.getActivityFlags() : null) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel toInvoiceORUPRActionModel(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel) {
        if ((activityTransactionModel != null ? activityTransactionModel.getType() : null) != com.paypal.oslo.api.graphql.schema.type.ActivityType.INVOICE) {
        }
        if (activityTransactionModel != null) {
            return toActivityActionModel(activityTransactionModel, com.paypal.oslo.api.graphql.schema.type.ActivityActionType.VIEW_INVOICE_RECEIPT);
        }
        return null;
    }

    public static final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel toActivityActionModel(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel, com.paypal.oslo.api.graphql.schema.type.ActivityActionType activityActionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionType, "");
        if (activityTransactionModel == null) {
            return null;
        }
        return new com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel(activityActionType, null, toActivityActionsTransactionInfo(activityTransactionModel));
    }
}
