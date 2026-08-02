package com.paypal.oslo.feature.debitcard.shared.analytics;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a;\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a;\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\u0012\u001a7\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a7\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u0019\u0010\u001a"}, d2 = {"", "screenId", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "userIntent", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", com.paypal.oslo.feature.p2p.analytics.P2pReviewAnalytics.FEATURE_MODULE, "", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "domainContexts", "", "trackDebitCardScreen", "(Ljava/lang/String;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;Ljava/util/List;)V", "errorCode", "errorType", "trackDebitCardErrorScreen", "(Ljava/lang/String;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;)V", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/ErrorInfo;", "errorInfo", "(Ljava/lang/String;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/ErrorInfo;Ljava/lang/String;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;)V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "item", "trackDebitCardItemPressed", "(Ljava/lang/String;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;Ljava/util/List;)V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "trackDebitCardComponent", "(Ljava/lang/String;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;Ljava/util/List;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DebitCardScreenTrackerKt {
    public static /* synthetic */ void trackDebitCardScreen$default(java.lang.String str, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module module, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            module = null;
        }
        if ((i & 8) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        trackDebitCardScreen(str, userIntentContext, module, list);
    }

    public static final void trackDebitCardScreen(java.lang.String str, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module module, java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntentContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ScreenAvailable(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(str), module, null, null, 12, null), userIntentContext, new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext("state_change", null, null), null, list, 8, null).track(com.paypal.oslo.feature.debitcard.AnalyticsTrackerKt.analyticsTracker);
    }

    public static /* synthetic */ void trackDebitCardErrorScreen$default(java.lang.String str, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, java.lang.String str2, java.lang.String str3, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module module, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            module = null;
        }
        trackDebitCardErrorScreen(str, userIntentContext, str2, str3, module);
    }

    @kotlin.Deprecated(message = "Use the overload that accepts ErrorInfo instead of errorCode", replaceWith = @kotlin.ReplaceWith(expression = "trackDebitCardErrorScreen(screenId, userIntent, errorInfo, errorType, module)", imports = {}))
    public static final void trackDebitCardErrorScreen(java.lang.String str, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, java.lang.String str2, java.lang.String str3, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module module) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntentContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        java.lang.String str4 = str2;
        if (str4.length() == 0) {
            str4 = str3;
        }
        java.lang.String str5 = str4;
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ErrorShown(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(str), module, null, null, 12, null), userIntentContext, new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext(str5, str5, str3, "api_call")).track(com.paypal.oslo.feature.debitcard.AnalyticsTrackerKt.analyticsTracker);
    }

    public static /* synthetic */ void trackDebitCardErrorScreen$default(java.lang.String str, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, com.paypal.oslo.feature.debitcard.shared.domain.model.ErrorInfo errorInfo, java.lang.String str2, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module module, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            module = null;
        }
        trackDebitCardErrorScreen(str, userIntentContext, errorInfo, str2, module);
    }

    public static final void trackDebitCardErrorScreen(java.lang.String str, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, com.paypal.oslo.feature.debitcard.shared.domain.model.ErrorInfo errorInfo, java.lang.String str2, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module module) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntentContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String errorCode = errorInfo.getErrorCode();
        if (errorCode.length() == 0) {
            errorCode = str2;
        }
        java.lang.String str3 = errorCode;
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uIContext = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(str), module, null, null, 12, null);
        java.lang.String errorDescription = errorInfo.getErrorDescription();
        if (errorDescription == null) {
            errorDescription = str3;
        }
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ErrorShown(uIContext, userIntentContext, new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext(str3, errorDescription, str2, "api_call")).track(com.paypal.oslo.feature.debitcard.AnalyticsTrackerKt.analyticsTracker);
    }

    public static /* synthetic */ void trackDebitCardItemPressed$default(java.lang.String str, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        trackDebitCardItemPressed(str, item, userIntentContext, list);
    }

    public static final void trackDebitCardItemPressed(java.lang.String str, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntentContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(str), null, null, item, 6, null), userIntentContext, list).track(com.paypal.oslo.feature.debitcard.AnalyticsTrackerKt.analyticsTracker);
    }

    public static /* synthetic */ void trackDebitCardComponent$default(java.lang.String str, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component component, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        trackDebitCardComponent(str, component, userIntentContext, list);
    }

    public static final void trackDebitCardComponent(java.lang.String str, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component component, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(component, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntentContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ComponentAppeared(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(str), null, component, null, 10, null), userIntentContext, list).track(com.paypal.oslo.feature.debitcard.AnalyticsTrackerKt.analyticsTracker);
    }
}
