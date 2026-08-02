package com.paypal.oslo.feature.activity.domain.common.extensions;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a+\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\n\u001a\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\n"}, d2 = {"", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "dynamicConfiguration", "filterDetailUnSupportedAction", "(Ljava/util/List;Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;)Ljava/util/List;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;", "activityTransactionModel", "", "isXoomTransactionFlow", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;)Z", "isPackageTrackingFlow", "isPromotionalRewardsFlow"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityActionFilterExtensionsKt {
    public static final java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel> filterDetailUnSupportedAction(java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel> list, com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfiguration, "");
        java.util.Set<java.lang.String> detailSupportedActions = com.paypal.oslo.feature.activity.domain.usecase.common.extensions.DynamicConfigurationExtensionsKt.getDetailSupportedActions(dynamicConfiguration);
        if (detailSupportedActions.isEmpty()) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (detailSupportedActions.contains(((com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel) obj).getType().getRawValue())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final boolean isXoomTransactionFlow(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel) {
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerInfo activityPartnerInfo;
        return ((activityTransactionModel == null || (activityPartnerInfo = activityTransactionModel.getActivityPartnerInfo()) == null) ? null : activityPartnerInfo.getActivityPartnerTypeInfo()) == com.paypal.oslo.feature.activity.domain.ledger.models.ActivityPartnerTypeInfo.XOOM;
    }

    public static final boolean isPackageTrackingFlow(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityTransactionModel, "");
        return activityTransactionModel.getType() == com.paypal.oslo.api.graphql.schema.type.ActivityType.PACKAGE;
    }

    public static final boolean isPromotionalRewardsFlow(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityTransactionModel, "");
        return activityTransactionModel.getType() == com.paypal.oslo.api.graphql.schema.type.ActivityType.REWARDS;
    }
}
