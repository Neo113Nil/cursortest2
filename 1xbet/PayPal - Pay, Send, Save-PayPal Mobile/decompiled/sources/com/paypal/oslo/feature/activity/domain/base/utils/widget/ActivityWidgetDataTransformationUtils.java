package com.paypal.oslo.feature.activity.domain.base.utils.widget;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/utils/widget/ActivityWidgetDataTransformationUtils;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "items", "Lcom/paypal/oslo/feature/activity/api/widget/interfaces/IActivityWidgetDataTransformer;", "transformer", "", "applyFieldTransformations$activity_prodRelease", "(Ljava/util/List;Lcom/paypal/oslo/feature/activity/api/widget/interfaces/IActivityWidgetDataTransformer;)V", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/activity/api/widget/models/ActivityWidgetTransformationConfig;", "transformConfig", "applyTransformationsToTransaction$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;Lcom/paypal/oslo/feature/activity/api/widget/models/ActivityWidgetTransformationConfig;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityWidgetDataTransformationUtils {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.domain.base.utils.widget.ActivityWidgetDataTransformationUtils INSTANCE = new com.paypal.oslo.feature.activity.domain.base.utils.widget.ActivityWidgetDataTransformationUtils();

    private ActivityWidgetDataTransformationUtils() {
    }

    public final void applyFieldTransformations$activity_prodRelease(java.util.List<? extends com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> items, com.paypal.oslo.feature.activity.api.widget.interfaces.IActivityWidgetDataTransformer transformer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transformer, "");
        com.paypal.oslo.feature.activity.api.widget.models.ActivityWidgetTransformationConfig transformationConfig = transformer.getTransformationConfig();
        for (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem activityItem : items) {
            if (activityItem instanceof com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction) {
                INSTANCE.applyTransformationsToTransaction$activity_prodRelease(((com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction) activityItem).getData(), transformationConfig);
            }
        }
    }

    public final void applyTransformationsToTransaction$activity_prodRelease(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel data, com.paypal.oslo.feature.activity.api.widget.models.ActivityWidgetTransformationConfig transformConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transformConfig, "");
        java.lang.String id = data.getId();
        java.lang.String title = data.getTitle();
        com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection.Unknown activityMoneyMovementDirection = data.getActivityMoneyMovementDirection();
        if (activityMoneyMovementDirection == null) {
            activityMoneyMovementDirection = com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection.Unknown.INSTANCE;
        }
        com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection activityMoneyMovementDirection2 = activityMoneyMovementDirection;
        java.lang.String amount = data.getAmountInformation().getAmount();
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags activityFlags = data.getActivityFlags();
        com.paypal.oslo.feature.activity.api.widget.models.ActivityWidgetTransformContext activityWidgetTransformContext = new com.paypal.oslo.feature.activity.api.widget.models.ActivityWidgetTransformContext(id, title, activityMoneyMovementDirection2, amount, activityFlags != null ? activityFlags.isAnonymousContribution() : false);
        kotlin.jvm.functions.Function2<com.paypal.oslo.feature.activity.api.widget.models.ActivityWidgetTransformContext, java.lang.String, java.lang.String> titleTransform = transformConfig.getTitleTransform();
        if (titleTransform != null) {
            java.lang.String invoke = titleTransform.invoke(activityWidgetTransformContext, data.getTitle());
            if (!kotlin.text.StringsKt.isBlank(invoke)) {
                data.setTitle(invoke);
            }
        }
        kotlin.jvm.functions.Function2<com.paypal.oslo.feature.activity.api.widget.models.ActivityWidgetTransformContext, com.paypal.oslo.feature.activity.api.widget.models.ActivityAmountInfo, com.paypal.oslo.feature.activity.api.widget.models.ActivityAmountInfo> amountTransform = transformConfig.getAmountTransform();
        if (amountTransform != null) {
            java.lang.String amount2 = data.getAmountInformation().getAmount();
            com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection.Unknown activityMoneyMovementDirection3 = data.getActivityMoneyMovementDirection();
            if (activityMoneyMovementDirection3 == null) {
                activityMoneyMovementDirection3 = com.paypal.oslo.feature.activity.api.models.ActivityMoneyMovementDirection.Unknown.INSTANCE;
            }
            com.paypal.oslo.feature.activity.api.widget.models.ActivityAmountInfo invoke2 = amountTransform.invoke(activityWidgetTransformContext, new com.paypal.oslo.feature.activity.api.widget.models.ActivityAmountInfo(amount2, activityMoneyMovementDirection3));
            data.getAmountInformation().setAmount(invoke2.getAmount());
            data.setActivityMoneyMovementDirection(invoke2.getMoneyMovementDirection());
        }
        kotlin.jvm.functions.Function2<com.paypal.oslo.feature.activity.api.widget.models.ActivityWidgetTransformContext, com.paypal.oslo.feature.activity.api.models.ActivityAvatarType, com.paypal.oslo.feature.activity.api.models.ActivityAvatarType> avatarTransform = transformConfig.getAvatarTransform();
        if (avatarTransform != null) {
            data.getAvatar().setAvatarType(avatarTransform.invoke(activityWidgetTransformContext, data.getAvatar().getAvatarType()));
        }
    }
}
