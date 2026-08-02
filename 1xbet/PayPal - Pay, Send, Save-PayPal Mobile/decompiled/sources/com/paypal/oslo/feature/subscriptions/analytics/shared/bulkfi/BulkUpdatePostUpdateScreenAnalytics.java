package com.paypal.oslo.feature.subscriptions.analytics.shared.bulkfi;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0003\u001c\u001d\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nR\u001a\u0010\r\u001a\u00020\f8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/analytics/shared/bulkfi/BulkUpdatePostUpdateScreenAnalytics;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/CommonScreenAnalytics;", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "changeButton", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;)Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ItemAnalytics;", "updateLaterButton", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext$BulkFi;", "subscriptionUserIntent", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext$BulkFi;", "getSubscriptionUserIntent", "()Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext$BulkFi;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/bulkfi/BulkUpdatePostUpdateScreenAnalytics$NeedsAttentionModule;", "needsAttentionModule", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/bulkfi/BulkUpdatePostUpdateScreenAnalytics$NeedsAttentionModule;", "getNeedsAttentionModule", "()Lcom/paypal/oslo/feature/subscriptions/analytics/shared/bulkfi/BulkUpdatePostUpdateScreenAnalytics$NeedsAttentionModule;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/bulkfi/BulkUpdatePostUpdateScreenAnalytics$SuccessfullyUpdatedModule;", "successfullyUpdatedModule", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/bulkfi/BulkUpdatePostUpdateScreenAnalytics$SuccessfullyUpdatedModule;", "getSuccessfullyUpdatedModule", "()Lcom/paypal/oslo/feature/subscriptions/analytics/shared/bulkfi/BulkUpdatePostUpdateScreenAnalytics$SuccessfullyUpdatedModule;", "Companion", "NeedsAttentionModule", "SuccessfullyUpdatedModule"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BulkUpdatePostUpdateScreenAnalytics extends com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics {
    public static final java.lang.String CHANGE_BUTTON = "change_button";
    public static final java.lang.String UPDATE_LATER_BUTTON = "update_later_button";
    private final com.paypal.oslo.feature.subscriptions.analytics.shared.bulkfi.BulkUpdatePostUpdateScreenAnalytics.NeedsAttentionModule needsAttentionModule;
    private final com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext.BulkFi subscriptionUserIntent;
    private final com.paypal.oslo.feature.subscriptions.analytics.shared.bulkfi.BulkUpdatePostUpdateScreenAnalytics.SuccessfullyUpdatedModule successfullyUpdatedModule;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkUpdatePostUpdateScreenAnalytics(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
        super(agreementType);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        this.subscriptionUserIntent = new com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext.BulkFi(com.paypal.oslo.feature.subscriptions.api.analytics.AnalyticsScreenNames.BULK_FI_POST_UPDATE, agreementType);
        this.needsAttentionModule = new com.paypal.oslo.feature.subscriptions.analytics.shared.bulkfi.BulkUpdatePostUpdateScreenAnalytics.NeedsAttentionModule(getSubscriptionUserIntent());
        this.successfullyUpdatedModule = new com.paypal.oslo.feature.subscriptions.analytics.shared.bulkfi.BulkUpdatePostUpdateScreenAnalytics.SuccessfullyUpdatedModule(getSubscriptionUserIntent());
    }

    @Override // com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics
    public final com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext.BulkFi getSubscriptionUserIntent() {
        return this.subscriptionUserIntent;
    }

    public final com.paypal.oslo.feature.subscriptions.analytics.shared.bulkfi.BulkUpdatePostUpdateScreenAnalytics.NeedsAttentionModule getNeedsAttentionModule() {
        return this.needsAttentionModule;
    }

    public final com.paypal.oslo.feature.subscriptions.analytics.shared.bulkfi.BulkUpdatePostUpdateScreenAnalytics.SuccessfullyUpdatedModule getSuccessfullyUpdatedModule() {
        return this.successfullyUpdatedModule;
    }

    public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics changeButton(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext flow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
        return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(getSubscriptionUserIntent().withAction(""), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(CHANGE_BUTTON, 0, 2, null), kotlin.collections.CollectionsKt.listOf(flow));
    }

    public final com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics updateLaterButton(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext flow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
        return new com.paypal.oslo.feature.subscriptions.analytics.shared.ItemAnalytics(getSubscriptionUserIntent().withAction(""), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(UPDATE_LATER_BUTTON, 0, 2, null), kotlin.collections.CollectionsKt.listOf(flow));
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/analytics/shared/bulkfi/BulkUpdatePostUpdateScreenAnalytics$NeedsAttentionModule;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/SubscriptionsAnalyticsModule;", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;", "intent", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;)V", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NeedsAttentionModule extends com.paypal.oslo.feature.subscriptions.analytics.shared.SubscriptionsAnalyticsModule {
        public static final java.lang.String NAME = "needs_attention";
        public static final java.lang.String SHOWN_ACTION = "needs_attention";
        public static final int $stable = 8;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NeedsAttentionModule(com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext subscriptionsUserIntentContext) {
            super("needs_attention", "needs_attention", subscriptionsUserIntentContext);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionsUserIntentContext, "");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/analytics/shared/bulkfi/BulkUpdatePostUpdateScreenAnalytics$SuccessfullyUpdatedModule;", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/SubscriptionsAnalyticsModule;", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;", "intent", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;)V", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SuccessfullyUpdatedModule extends com.paypal.oslo.feature.subscriptions.analytics.shared.SubscriptionsAnalyticsModule {
        public static final java.lang.String NAME = "successfully_updated";
        public static final java.lang.String SHOWN_ACTION = "successfully_updated";
        public static final int $stable = 8;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SuccessfullyUpdatedModule(com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext subscriptionsUserIntentContext) {
            super("successfully_updated", "successfully_updated", subscriptionsUserIntentContext);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionsUserIntentContext, "");
        }
    }
}
