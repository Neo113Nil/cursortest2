package com.paypal.oslo.feature.subscriptions.analytics.shared;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0010\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJA\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/analytics/shared/SubscriptionsAnalyticsModule;", "", "", "moduleShownAction", "moduleName", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;", "subscriptionUserIntent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;)V", "", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "contexts", "", "horizontalPos", "verticalPos", "moduleAction", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ModuleAnalytics;", "moduleCtx", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/paypal/oslo/feature/subscriptions/analytics/shared/ModuleAnalytics;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;", "getSubscriptionUserIntent", "()Lcom/paypal/oslo/feature/subscriptions/api/analytics/SubscriptionsUserIntentContext;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public class SubscriptionsAnalyticsModule {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.String Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext subscriptionUserIntent;

    public SubscriptionsAnalyticsModule(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext subscriptionsUserIntentContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionsUserIntentContext, "");
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRangesFor = str2;
        this.subscriptionUserIntent = subscriptionsUserIntentContext;
    }

    public final com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext getSubscriptionUserIntent() {
        return this.subscriptionUserIntent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.analytics.shared.ModuleAnalytics moduleCtx$default(com.paypal.oslo.feature.subscriptions.analytics.shared.SubscriptionsAnalyticsModule subscriptionsAnalyticsModule, java.util.List list, java.lang.Integer num, java.lang.Integer num2, java.lang.String str, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: moduleCtx");
        }
        if ((i & 1) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            str = null;
        }
        return subscriptionsAnalyticsModule.moduleCtx(list, num, num2, str);
    }

    public final com.paypal.oslo.feature.subscriptions.analytics.shared.ModuleAnalytics moduleCtx(java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> contexts, java.lang.Integer horizontalPos, java.lang.Integer verticalPos, java.lang.String moduleAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contexts, "");
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module module = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(this.getHighSpeedVideoFpsRangesFor, 0, horizontalPos, verticalPos, 2, null);
        java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list = contexts;
        com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext subscriptionsUserIntentContext = this.subscriptionUserIntent;
        if (moduleAction == null) {
            moduleAction = this.Camera2StreamConfigurationMap;
        }
        return new com.paypal.oslo.feature.subscriptions.analytics.shared.ModuleAnalytics(module, kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext>) list, subscriptionsUserIntentContext.withAction(moduleAction)));
    }
}
