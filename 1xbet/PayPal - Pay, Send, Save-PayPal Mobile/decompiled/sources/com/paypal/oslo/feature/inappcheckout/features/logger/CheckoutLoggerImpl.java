package com.paypal.oslo.feature.inappcheckout.features.logger;

@kotlin.Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJS\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000ej\u0004\u0018\u0001`\u00102\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000ej\u0004\u0018\u0001`\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015Jk\u0010\u001a\u001a\u00020\u0013\"\f\b\u0000\u0010\u0018*\u00020\u0016*\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00018\u00002\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000ej\u0004\u0018\u0001`\u00102\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000ej\u0004\u0018\u0001`\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJi\u0010\u001d\u001a\u00020\u0013\"\f\b\u0000\u0010\u0018*\u00020\u0016*\u00020\u001c2\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000ej\u0004\u0018\u0001`\u00102\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000ej\u0004\u0018\u0001`\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJs\u0010\"\u001a\u00020\u0013\"\f\b\u0000\u0010\u0018*\u00020\u0016*\u00020\u001f2\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000ej\u0004\u0018\u0001`\u00102\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000ej\u0004\u0018\u0001`\u00102\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#JM\u0010%\u001a\u00020\u0013\"\f\b\u0000\u0010\u0018*\u00020\u0016*\u00020$2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00018\u00002\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000ej\u0004\u0018\u0001`\u0010H\u0016¢\u0006\u0004\b%\u0010&J+\u0010%\u001a\u00020\u00132\u0006\u0010(\u001a\u00020'2\u0012\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00020*0)\"\u00020*H\u0016¢\u0006\u0004\b%\u0010,J-\u00103\u001a\u00020\u00132\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\f2\f\u00102\u001a\b\u0012\u0004\u0012\u00020100H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\u000208H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020;2\u0006\u0010/\u001a\u00020\fH\u0016¢\u0006\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010>\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010D\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010B\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bD\u0010E"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLoggerImpl;", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "session", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLoggerHelper;", "loggerHelper", "Lcom/paypal/android/logger/Logger;", "logger", "Lcom/paypal/oslo/core/telemetry/analytics/AnalyticsTracker;", "tracker", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLoggerHelper;Lcom/paypal/android/logger/Logger;Lcom/paypal/oslo/core/telemetry/analytics/AnalyticsTracker;)V", "", "message", "", "", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/LogAttributes;", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "piiAttributes", "", "d", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "Lcom/paypal/android/logger/categories/LogCategory;", "Lcom/paypal/android/logger/categories/LogLevelTag$Info;", "T", "category", "i", "(Ljava/lang/String;Lcom/paypal/android/logger/categories/LogCategory;Ljava/util/Map;Ljava/util/Map;)V", "Lcom/paypal/android/logger/categories/LogLevelTag$Warn;", "w", "(Lcom/paypal/android/logger/categories/LogCategory;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "Lcom/paypal/android/logger/categories/LogLevelTag$Error;", "", "error", "e", "(Lcom/paypal/android/logger/categories/LogCategory;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Throwable;)V", "Lcom/paypal/android/logger/categories/LogLevelTag;", "logAnalyticsEvent", "(Ljava/lang/String;Lcom/paypal/android/logger/categories/LogCategory;Ljava/util/Map;)V", "Lcom/paypal/oslo/feature/inappcheckout/features/analytics/domain/CheckoutAnalyticsEvent;", "event", "", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/EventProperty;", "properties", "(Lcom/paypal/oslo/feature/inappcheckout/features/analytics/domain/CheckoutAnalyticsEvent;[Lcom/paypal/oslo/feature/inappcheckout/domain/model/EventProperty;)V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/operational/TransitionTypeCategory;", "transitionType", "action", "", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "contexts", "trackFlowTransition", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/operational/TransitionTypeCategory;Ljava/lang/String;Ljava/util/List;)V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;", "provideBusinessFlowContext", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/domain/MerchantContext;", "provideMerchantContext", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/domain/MerchantContext;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "provideUserIntentContext", "(Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLoggerHelper;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/android/logger/Logger;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/telemetry/analytics/AnalyticsTracker;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CheckoutLoggerImpl implements com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.android.logger.Logger getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLoggerHelper getHighSpeedVideoFpsRangesFor;

    public CheckoutLoggerImpl(com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLoggerHelper checkoutLoggerHelper, com.paypal.android.logger.Logger logger, com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker analyticsTracker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appSwitchSession, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutLoggerHelper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsTracker, "");
        this.getHighSpeedVideoSizes = appSwitchSession;
        this.getHighSpeedVideoFpsRangesFor = checkoutLoggerHelper;
        this.getHighResolutionOutputSizeshNQ4ISI = logger;
        this.getHighSpeedVideoFpsRanges = analyticsTracker;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger
    public final void d(java.lang.String message, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes, java.util.Map<java.lang.String, ? extends java.lang.Object> piiAttributes) {
        java.util.List list;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLoggerHelper checkoutLoggerHelper = this.getHighSpeedVideoFpsRangesFor;
        kotlin.Pair<java.lang.String, ? extends java.lang.Object>[][] pairArr = new kotlin.Pair[1][];
        kotlin.Pair<java.lang.String, ? extends java.lang.Object>[] pairArr2 = (attributes == null || (list = kotlin.collections.MapsKt.toList(attributes)) == null) ? null : (kotlin.Pair[]) list.toArray(new kotlin.Pair[0]);
        if (pairArr2 == null) {
            pairArr2 = new kotlin.Pair[0];
        }
        pairArr[0] = pairArr2;
        checkoutLoggerHelper.buildAttributes(pairArr);
        if (piiAttributes == null) {
            kotlin.collections.MapsKt.emptyMap();
        }
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger
    public final <T extends com.paypal.android.logger.categories.LogCategory & com.paypal.android.logger.categories.LogLevelTag.Info> void i(java.lang.String message, T category, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes, java.util.Map<java.lang.String, ? extends java.lang.Object> piiAttributes) {
        java.util.List list;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLoggerHelper checkoutLoggerHelper = this.getHighSpeedVideoFpsRangesFor;
        kotlin.Pair<java.lang.String, ? extends java.lang.Object>[][] pairArr = new kotlin.Pair[1][];
        kotlin.Pair<java.lang.String, ? extends java.lang.Object>[] pairArr2 = (attributes == null || (list = kotlin.collections.MapsKt.toList(attributes)) == null) ? null : (kotlin.Pair[]) list.toArray(new kotlin.Pair[0]);
        if (pairArr2 == null) {
            pairArr2 = new kotlin.Pair[0];
        }
        pairArr[0] = pairArr2;
        java.util.Map<java.lang.String, ? extends java.lang.Object> buildAttributes = checkoutLoggerHelper.buildAttributes(pairArr);
        if (category != null) {
            com.paypal.android.logger.Logger logger = this.getHighResolutionOutputSizeshNQ4ISI;
            if (piiAttributes == null) {
                piiAttributes = kotlin.collections.MapsKt.emptyMap();
            }
            com.paypal.android.logger.standardized.LoggerExtensionsKt.i(logger, category, message, buildAttributes, piiAttributes);
            return;
        }
        com.paypal.android.logger.Logger logger2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (piiAttributes == null) {
            piiAttributes = kotlin.collections.MapsKt.emptyMap();
        }
        logger2.i(message, buildAttributes, piiAttributes);
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger
    public final <T extends com.paypal.android.logger.categories.LogCategory & com.paypal.android.logger.categories.LogLevelTag.Warn> void w(T category, java.lang.String message, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes, java.util.Map<java.lang.String, ? extends java.lang.Object> piiAttributes) {
        java.util.List list;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(category, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLoggerHelper checkoutLoggerHelper = this.getHighSpeedVideoFpsRangesFor;
        kotlin.Pair<java.lang.String, ? extends java.lang.Object>[][] pairArr = new kotlin.Pair[1][];
        kotlin.Pair<java.lang.String, ? extends java.lang.Object>[] pairArr2 = (attributes == null || (list = kotlin.collections.MapsKt.toList(attributes)) == null) ? null : (kotlin.Pair[]) list.toArray(new kotlin.Pair[0]);
        if (pairArr2 == null) {
            pairArr2 = new kotlin.Pair[0];
        }
        pairArr[0] = pairArr2;
        java.util.Map<java.lang.String, java.lang.Object> buildAttributes = checkoutLoggerHelper.buildAttributes(pairArr);
        com.paypal.android.logger.Logger logger = this.getHighResolutionOutputSizeshNQ4ISI;
        if (piiAttributes == null) {
            piiAttributes = kotlin.collections.MapsKt.emptyMap();
        }
        com.paypal.android.logger.standardized.LoggerExtensionsKt.w(logger, category, message, buildAttributes, piiAttributes);
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger
    public final <T extends com.paypal.android.logger.categories.LogCategory & com.paypal.android.logger.categories.LogLevelTag.Error> void e(T category, java.lang.String message, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes, java.util.Map<java.lang.String, ? extends java.lang.Object> piiAttributes, java.lang.Throwable error) {
        java.util.List list;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(category, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLoggerHelper checkoutLoggerHelper = this.getHighSpeedVideoFpsRangesFor;
        kotlin.Pair<java.lang.String, ? extends java.lang.Object>[][] pairArr = new kotlin.Pair[1][];
        kotlin.Pair<java.lang.String, ? extends java.lang.Object>[] pairArr2 = (attributes == null || (list = kotlin.collections.MapsKt.toList(attributes)) == null) ? null : (kotlin.Pair[]) list.toArray(new kotlin.Pair[0]);
        if (pairArr2 == null) {
            pairArr2 = new kotlin.Pair[0];
        }
        pairArr[0] = pairArr2;
        com.paypal.android.logger.standardized.LoggerExtensionsKt.e$default(this.getHighResolutionOutputSizeshNQ4ISI, category, message, checkoutLoggerHelper.buildAttributes(pairArr), null, error, 8, null);
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger
    public final <T extends com.paypal.android.logger.categories.LogCategory & com.paypal.android.logger.categories.LogLevelTag> void logAnalyticsEvent(java.lang.String message, T category, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        java.util.List list;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLoggerHelper checkoutLoggerHelper = this.getHighSpeedVideoFpsRangesFor;
        kotlin.Pair<java.lang.String, ? extends java.lang.Object>[][] pairArr = new kotlin.Pair[1][];
        kotlin.Pair<java.lang.String, ? extends java.lang.Object>[] pairArr2 = (attributes == null || (list = kotlin.collections.MapsKt.toList(attributes)) == null) ? null : (kotlin.Pair[]) list.toArray(new kotlin.Pair[0]);
        if (pairArr2 == null) {
            pairArr2 = new kotlin.Pair[0];
        }
        pairArr[0] = pairArr2;
        java.util.Map<java.lang.String, java.lang.Object> buildAttributes = checkoutLoggerHelper.buildAttributes(pairArr);
        if (category == null) {
            d(message, buildAttributes, null);
            return;
        }
        if (category instanceof com.paypal.android.logger.categories.LogLevelTag.Info) {
            i(message, category, buildAttributes, null);
            return;
        }
        if (category instanceof com.paypal.android.logger.categories.LogLevelTag.Warn) {
            w(category, message, buildAttributes, null);
            return;
        }
        if (category instanceof com.paypal.android.logger.categories.LogLevelTag.Error) {
            e(category, message, buildAttributes, null, null);
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(category);
        sb.append(": ");
        sb.append(message);
        d(sb.toString(), buildAttributes, null);
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger
    public final void logAnalyticsEvent(com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsEvent event, com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty... properties) {
        java.lang.String str;
        java.lang.String str2;
        com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty xo_native_app_entry_point;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        com.paypal.oslo.core.telemetry.analytics.schema.event.generic.LinkResolved.Outbound outbound;
        com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty eventProperty;
        com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty eventProperty2;
        com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty eventProperty3;
        java.lang.String obj;
        com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty vault_setup_token_xo_product;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(properties, "");
        java.lang.String name2 = event.getName();
        if (name2.length() == 0) {
            java.lang.String exportedEventName = event.getExportedEventName();
            if (exportedEventName.length() == 0) {
                exportedEventName = com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient.UNKNOWN_EVENT;
            }
            name2 = exportedEventName;
        }
        java.lang.String str6 = name2;
        java.util.List mutableList = kotlin.collections.ArraysKt.toMutableList(properties);
        com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty[] eventPropertyArr = new com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty[6];
        eventPropertyArr[0] = com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.INSTANCE.getIN_APP_CHECKOUT_PRODUCT();
        eventPropertyArr[1] = com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.INSTANCE.getCHECKOUT_SPACE_KEY();
        eventPropertyArr[2] = com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.INSTANCE.getCHECKOUT_FEED_NAME();
        eventPropertyArr[3] = com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKeyKt.with(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.SessionId, this.getHighSpeedVideoSizes.getSessionId());
        com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey eventPropertyKey = com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.ContextId;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken checkoutToken = this.getHighSpeedVideoSizes.getCheckoutToken();
        if (checkoutToken == null || (str = checkoutToken.getValue()) == null) {
            str = "unknown";
        }
        eventPropertyArr[4] = com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKeyKt.withNonNull(eventPropertyKey, str);
        com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey eventPropertyKey2 = com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.AttemptId;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken checkoutToken2 = this.getHighSpeedVideoSizes.getCheckoutToken();
        if (checkoutToken2 == null || (str2 = checkoutToken2.getValue()) == null) {
            str2 = "unknown";
        }
        eventPropertyArr[5] = com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKeyKt.withNonNull(eventPropertyKey2, str2);
        mutableList.addAll(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) eventPropertyArr));
        mutableList.add(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKeyKt.with(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.EventName, str6));
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken checkoutToken3 = this.getHighSpeedVideoSizes.getCheckoutToken();
        if (checkoutToken3 != null) {
            if (checkoutToken3 instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.BAToken) {
                vault_setup_token_xo_product = com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.INSTANCE.getBILLING_XO_PRODUCT();
            } else if (checkoutToken3 instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ECToken) {
                vault_setup_token_xo_product = com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.INSTANCE.getEXPRESS_CHECKOUT_XO_PRODUCT();
            } else {
                if (!(checkoutToken3 instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.VaultSetupToken)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                vault_setup_token_xo_product = com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.INSTANCE.getVAULT_SETUP_TOKEN_XO_PRODUCT();
            }
            if (vault_setup_token_xo_product != null) {
                mutableList.add(vault_setup_token_xo_product);
            }
        }
        if (this.getHighSpeedVideoSizes.isNoMerchantUpgradePath()) {
            mutableList.add(com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.INSTANCE.getNO_MERCHANT_UPGRADE_PATH());
        } else {
            mutableList.add(com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.INSTANCE.getMERCHANT_UPGRADE_PATH());
        }
        if (this.getHighSpeedVideoSizes.isWebAppSdkIntegrationMethod()) {
            xo_native_app_entry_point = com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.INSTANCE.getXO_WEB_ENTRY_POINT();
        } else {
            xo_native_app_entry_point = com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty.INSTANCE.getXO_NATIVE_APP_ENTRY_POINT();
        }
        mutableList.add(xo_native_app_entry_point);
        android.net.Uri universalLinkUri = this.getHighSpeedVideoSizes.getUniversalLinkUri();
        if (universalLinkUri == null || (str3 = universalLinkUri.toString()) == null) {
            str3 = "unknown";
        }
        mutableList.add(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKeyKt.with(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.UniversalLink, str3));
        mutableList.add(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKeyKt.with(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.TriggerApp, this.getHighSpeedVideoSizes.getCamera2StreamConfigurationMap()));
        com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey eventPropertyKey3 = com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.Merchant;
        com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails getHighSpeedVideoSizes = this.getHighSpeedVideoSizes.getGetHighSpeedVideoSizes();
        if (getHighSpeedVideoSizes == null || (str4 = getHighSpeedVideoSizes.getName()) == null) {
            str4 = "unknown";
        }
        mutableList.add(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKeyKt.with(eventPropertyKey3, str4));
        com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey eventPropertyKey4 = com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.MerchantId;
        com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails getHighSpeedVideoSizes2 = this.getHighSpeedVideoSizes.getGetHighSpeedVideoSizes();
        if (getHighSpeedVideoSizes2 == null || (str5 = getHighSpeedVideoSizes2.getName()) == null) {
            str5 = "unknown";
        }
        mutableList.add(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKeyKt.with(eventPropertyKey4, str5));
        com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey eventPropertyKey5 = com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.FlowType;
        java.lang.String flowType = this.getHighSpeedVideoSizes.getFlowType();
        if (flowType == null) {
            flowType = "unknown";
        }
        mutableList.add(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKeyKt.with(eventPropertyKey5, flowType));
        com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey eventPropertyKey6 = com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.RcvrId;
        com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails getHighSpeedVideoSizes3 = this.getHighSpeedVideoSizes.getGetHighSpeedVideoSizes();
        mutableList.add(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKeyKt.with(eventPropertyKey6, getHighSpeedVideoSizes3 != null ? getHighSpeedVideoSizes3.getName() : null));
        mutableList.add(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKeyKt.with(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.SessionId, this.getHighSpeedVideoSizes.getSessionId()));
        com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty[] eventPropertyArr2 = (com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty[]) java.util.Arrays.copyOf(properties, properties.length);
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getSWITCH_TO_CONSUMER_APP_SUCCESS())) {
            outbound = this.getHighSpeedVideoFpsRangesFor.buildModuleShownEvent(event.getName(), com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.Loading.Screen.ID, com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.Actions.SWITCH_TO_CONSUMER_APP_SUCCESS, kotlin.collections.SetsKt.setOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{provideBusinessFlowContext(), provideMerchantContext()}));
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getINBOUND_LINK_RESOLVED())) {
            com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLoggerHelper checkoutLoggerHelper = this.getHighSpeedVideoFpsRangesFor;
            android.net.Uri universalLinkUri2 = this.getHighSpeedVideoSizes.getUniversalLinkUri();
            java.lang.String str7 = (universalLinkUri2 == null || (obj = universalLinkUri2.toString()) == null) ? "unknown" : obj;
            java.lang.String source = this.getHighSpeedVideoSizes.getSource();
            outbound = com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLoggerHelper.buildLinkResolvedInboundEvent$default(checkoutLoggerHelper, "link_resolved", str7, source == null ? "unknown" : source, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{provideBusinessFlowContext(), provideMerchantContext()}), null, 16, null);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.inappcheckout.features.analytics.domain.CheckoutAnalyticsImpressionEvent.INSTANCE.getOUTBOUND_LINK_RESOLVED())) {
            int length = eventPropertyArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    eventProperty = null;
                    break;
                }
                eventProperty = eventPropertyArr2[i];
                if (eventProperty.getKey() == com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.UserIntentAction) {
                    break;
                } else {
                    i++;
                }
            }
            java.lang.Object value = eventProperty != null ? eventProperty.getValue() : null;
            java.lang.String str8 = value instanceof java.lang.String ? (java.lang.String) value : null;
            if (str8 == null) {
                str8 = com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.Actions.UNIVERSAL_LINK_TO_MERCHANT_APP_SUCCEEDED;
            }
            int length2 = eventPropertyArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    eventProperty2 = null;
                    break;
                }
                eventProperty2 = eventPropertyArr2[i2];
                if (eventProperty2.getKey() == com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.ReturnUrl) {
                    break;
                } else {
                    i2++;
                }
            }
            java.lang.Object value2 = eventProperty2 != null ? eventProperty2.getValue() : null;
            java.lang.String str9 = value2 instanceof java.lang.String ? (java.lang.String) value2 : null;
            java.lang.String str10 = str9 != null ? str9 : "unknown";
            int length3 = eventPropertyArr2.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length3) {
                    eventProperty3 = null;
                    break;
                }
                eventProperty3 = eventPropertyArr2[i3];
                if (eventProperty3.getKey() == com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.ErrorDescription) {
                    break;
                } else {
                    i3++;
                }
            }
            java.lang.Object value3 = eventProperty3 != null ? eventProperty3.getValue() : null;
            outbound = this.getHighSpeedVideoFpsRangesFor.buildLinkResolvedOutboundEvent(str8, str10, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{provideBusinessFlowContext(), provideMerchantContext()}), value3 instanceof java.lang.String ? (java.lang.String) value3 : null);
        } else {
            outbound = null;
        }
        if (outbound != null) {
            outbound.track(this.getHighSpeedVideoFpsRanges);
        }
        if (outbound != null) {
            java.lang.String concat = "Tracked analytics event: ".concat(java.lang.String.valueOf(outbound.getEventName()));
            java.util.List<com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty> list = mutableList;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
            for (com.paypal.oslo.feature.inappcheckout.domain.model.EventProperty eventProperty4 : list) {
                kotlin.Pair pair = kotlin.TuplesKt.to(eventProperty4.getKey().getKeyName(), eventProperty4.getValue());
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            i(concat, null, linkedHashMap, null);
        }
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger
    public final void trackFlowTransition(com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeCategory transitionType, java.lang.String action, java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> contexts) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transitionType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contexts, "");
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        createListBuilder.add(provideBusinessFlowContext());
        createListBuilder.add(provideMerchantContext());
        createListBuilder.add(provideBusinessFlowContext());
        createListBuilder.addAll(contexts);
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.FlowTransitionEvent(provideUserIntentContext(action), new com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeContext(transitionType.getLogValue()), kotlin.collections.CollectionsKt.build(createListBuilder)).track(this.getHighSpeedVideoFpsRanges);
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger
    public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext provideBusinessFlowContext() {
        java.lang.String flowType = this.getHighSpeedVideoSizes.getFlowType();
        if (flowType == null) {
            flowType = "unknown";
        }
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext(flowType, this.getHighSpeedVideoSizes.getSessionId());
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger
    public final com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext provideMerchantContext() {
        java.lang.String str;
        com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails getHighSpeedVideoSizes = this.getHighSpeedVideoSizes.getGetHighSpeedVideoSizes();
        if (getHighSpeedVideoSizes == null || (str = getHighSpeedVideoSizes.getId()) == null) {
            str = "unknown";
        }
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext(str, "unknown");
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger
    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext provideUserIntentContext(java.lang.String action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.PRODUCT, com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.WEBVIEW_FEATURE, action);
    }
}
