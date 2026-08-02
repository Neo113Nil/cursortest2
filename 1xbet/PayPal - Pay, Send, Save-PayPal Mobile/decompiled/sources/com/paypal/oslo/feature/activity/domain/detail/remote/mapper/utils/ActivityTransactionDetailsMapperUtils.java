package com.paypal.oslo.feature.activity.domain.detail.remote.mapper.utils;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/remote/mapper/utils/ActivityTransactionDetailsMapperUtils;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityInsightFragment;", "activityInsight", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;", "input", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityInsightAction;", "getActionData$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityInsightFragment;Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityInsightAction;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityActionsFragment;", "activityAction", "", "appendingString", "getPathForWebViewNavigation$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityActionsFragment;Ljava/lang/String;)Ljava/lang/String;", "", "getResIdForCTA$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityActionsFragment;)Ljava/lang/Integer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityTransactionDetailsMapperUtils {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.domain.detail.remote.mapper.utils.ActivityTransactionDetailsMapperUtils INSTANCE = new com.paypal.oslo.feature.activity.domain.detail.remote.mapper.utils.ActivityTransactionDetailsMapperUtils();

    private ActivityTransactionDetailsMapperUtils() {
    }

    public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityInsightAction getActionData$activity_prodRelease(com.paypal.oslo.feature.activity.graphql.fragment.ActivityInsightFragment activityInsight, com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data input) {
        com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.RelatedActivity relatedActivity;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityInsight, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.api.graphql.schema.type.ActivityInsightType type = activityInsight.getType();
        java.lang.String linkedActivityId = activityInsight.getLinkedActivityId();
        java.util.List<com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.RelatedActivity> relatedActivities = input.getResult().getRelatedActivities();
        if (relatedActivities != null) {
            java.util.Iterator<T> it = relatedActivities.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.RelatedActivity) obj).getId(), linkedActivityId)) {
                    break;
                }
            }
            relatedActivity = (com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.RelatedActivity) obj;
        } else {
            relatedActivity = null;
        }
        int i = com.paypal.oslo.feature.activity.domain.detail.remote.mapper.utils.ActivityTransactionDetailsMapperUtils.WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if ((i == 1 || i == 2 || i == 3 || i == 4) && relatedActivity != null) {
            return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityInsightAction(relatedActivity.getId(), relatedActivity.getType().toString());
        }
        return null;
    }

    public static /* synthetic */ java.lang.String getPathForWebViewNavigation$activity_prodRelease$default(com.paypal.oslo.feature.activity.domain.detail.remote.mapper.utils.ActivityTransactionDetailsMapperUtils activityTransactionDetailsMapperUtils, com.paypal.oslo.feature.activity.graphql.fragment.ActivityActionsFragment activityActionsFragment, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return activityTransactionDetailsMapperUtils.getPathForWebViewNavigation$activity_prodRelease(activityActionsFragment, str);
    }

    public final java.lang.String getPathForWebViewNavigation$activity_prodRelease(com.paypal.oslo.feature.activity.graphql.fragment.ActivityActionsFragment activityAction, java.lang.String appendingString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appendingString, "");
        com.paypal.oslo.api.graphql.schema.type.ActivityActionType type = activityAction != null ? activityAction.getType() : null;
        int i = type == null ? -1 : com.paypal.oslo.feature.activity.domain.detail.remote.mapper.utils.ActivityTransactionDetailsMapperUtils.WhenMappings.$EnumSwitchMapping$1[type.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityWebViewConstants.KEY_WEBVIEW_CRYPTO_FAQ_PATH;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityWebViewConstants.KEY_WEBVIEW_HOLD_CRYPTO_FAQ_PATH;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityWebViewConstants.KEY_WEBVIEW_FAILED_CRYPTO_FAQ_PATH;
        }
        if (i != 4) {
            return null;
        }
        return com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityWebViewConstants.KEY_WEBVIEW_RESOLUTION_CENTER_PATH.concat(java.lang.String.valueOf(appendingString));
    }

    public final java.lang.Integer getResIdForCTA$activity_prodRelease(com.paypal.oslo.feature.activity.graphql.fragment.ActivityActionsFragment activityAction) {
        com.paypal.oslo.api.graphql.schema.type.ActivityActionType type = activityAction != null ? activityAction.getType() : null;
        int i = type == null ? -1 : com.paypal.oslo.feature.activity.domain.detail.remote.mapper.utils.ActivityTransactionDetailsMapperUtils.WhenMappings.$EnumSwitchMapping$1[type.ordinal()];
        if (i == 1) {
            return java.lang.Integer.valueOf(com.paypal.oslo.feature.activity.R.string.feature_activity_detail_crypto_faq_cta_text);
        }
        if (i == 2) {
            return java.lang.Integer.valueOf(com.paypal.oslo.feature.activity.R.string.feature_activity_detail_hold_crypto_faq_cta_text);
        }
        if (i == 3) {
            return java.lang.Integer.valueOf(com.paypal.oslo.feature.activity.R.string.feature_activity_detail_failed_crypto_faq_cta_text);
        }
        if (i == 4) {
            return java.lang.Integer.valueOf(com.paypal.oslo.feature.activity.R.string.feature_activity_detail_dispute_status_info_text);
        }
        if (i != 5) {
            return null;
        }
        return java.lang.Integer.valueOf(com.paypal.oslo.feature.activity.R.string.feature_activity_detail_tax_law_sheet_consent_more_about_this_tax_law);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.ActivityInsightType.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityInsightType.EARLY_REFUND.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityInsightType.ETA_INFO.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityInsightType.LINKED_ACTIVITY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ActivityInsightType.TAX_WITHHOLD.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.values().length];
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.CRYPTO_FAQ.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.HOLD_CRYPTO_FAQ.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.FAILED_CRYPTO_FAQ.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.VIEW_DISPUTE_STATUS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.ActivityActionType.LEARN_TAX_LAW.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
