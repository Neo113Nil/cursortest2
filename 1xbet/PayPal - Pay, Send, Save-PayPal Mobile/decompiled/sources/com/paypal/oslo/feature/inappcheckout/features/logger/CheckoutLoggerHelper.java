package com.paypal.oslo.feature.inappcheckout.features.logger;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J_\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\u0002`\u000b2>\u0010\t\u001a \u0012\u001c\b\u0001\u0012\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00070\u00060\u0006\"\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00070\u0006¢\u0006\u0004\b\f\u0010\rJS\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\u0002`\u000b22\u0010\t\u001a\u001a\u0012\u0016\b\u0001\u0012\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00070\u0006\"\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0017\u0010\u0018JA\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001e\u0010\u001fJ9\u0010\"\u001a\u00020!2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLoggerHelper;", "", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "session", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;)V", "", "Lkotlin/Pair;", "", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/LogAttributes;", "buildAttributes", "([[Lkotlin/Pair;)Ljava/util/Map;", "buildIdentityAttributes", "([Lkotlin/Pair;)Ljava/util/Map;", "eventName", "screenName", "action", "", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "domainContexts", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ModuleAvailable;", "buildModuleShownEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ModuleAvailable;", "url", "sourceType", "", "errorMessage", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/LinkResolved$Inbound;", "buildLinkResolvedInboundEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/LinkResolved$Inbound;", "destinationUrl", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/LinkResolved$Outbound;", "buildLinkResolvedOutboundEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/LinkResolved$Outbound;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CheckoutLoggerHelper {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public CheckoutLoggerHelper(com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appSwitchSession, "");
        this.getHighSpeedVideoFpsRanges = appSwitchSession;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> buildAttributes(kotlin.Pair<java.lang.String, ? extends java.lang.Object>[]... attributes) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        android.net.Uri universalLinkUri = this.getHighSpeedVideoFpsRanges.getUniversalLinkUri();
        java.lang.String str4 = "unknown";
        if (universalLinkUri == null || (str = universalLinkUri.toString()) == null) {
            str = "unknown";
        }
        kotlin.Pair[] pairArr = new kotlin.Pair[8];
        pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.IS_TOKEN_SET_KEY, java.lang.Boolean.valueOf(this.getHighSpeedVideoFpsRanges.isTokenSet()));
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken checkoutToken = this.getHighSpeedVideoFpsRanges.getCheckoutToken();
        if (checkoutToken == null || (str2 = checkoutToken.getValue()) == null) {
            str2 = "unknown";
        }
        pairArr[1] = kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, str2);
        pairArr[2] = kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerMessages.UNIVERSAL_LINK, str);
        pairArr[3] = kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.ANALYTICS_SESSION_ID_KEY, this.getHighSpeedVideoFpsRanges.getSessionId());
        pairArr[4] = kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.INTEGRATION_TYPE_KEY, this.getHighSpeedVideoFpsRanges.getSdkIntegrationMethodOrNull());
        pairArr[5] = kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.TriggerApp.getKeyName(), this.getHighSpeedVideoFpsRanges.getCamera2StreamConfigurationMap());
        java.lang.String keyName = com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.ContextId.getKeyName();
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken checkoutToken2 = this.getHighSpeedVideoFpsRanges.getCheckoutToken();
        if (checkoutToken2 == null || (str3 = checkoutToken2.getValue()) == null) {
            str3 = "unknown";
        }
        pairArr[6] = kotlin.TuplesKt.to(keyName, str3);
        java.lang.String keyName2 = com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.AttemptId.getKeyName();
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken checkoutToken3 = this.getHighSpeedVideoFpsRanges.getCheckoutToken();
        if (checkoutToken3 != null && (value = checkoutToken3.getValue()) != null) {
            str4 = value;
        }
        pairArr[7] = kotlin.TuplesKt.to(keyName2, str4);
        return kotlin.collections.MapsKt.plus(kotlin.collections.MapsKt.mapOf(pairArr), kotlin.collections.MapsKt.toMap(kotlin.collections.ArraysKt.flatten(attributes)));
    }

    public final java.util.Map<java.lang.String, java.lang.Object> buildIdentityAttributes(kotlin.Pair<java.lang.String, ? extends java.lang.Object>... attributes) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String first;
        java.lang.Object second;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        kotlin.Pair[] pairArr = new kotlin.Pair[6];
        java.lang.String keyName = com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.Merchant.getKeyName();
        com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails getHighSpeedVideoSizes = this.getHighSpeedVideoFpsRanges.getGetHighSpeedVideoSizes();
        if (getHighSpeedVideoSizes == null || (str = getHighSpeedVideoSizes.getName()) == null) {
            str = "unknown";
        }
        kotlin.Pair pair = kotlin.TuplesKt.to(keyName, str);
        pairArr[0] = pair;
        java.lang.String keyName2 = com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.MerchantId.getKeyName();
        com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails getHighSpeedVideoSizes2 = this.getHighSpeedVideoFpsRanges.getGetHighSpeedVideoSizes();
        if (getHighSpeedVideoSizes2 == null || (str2 = getHighSpeedVideoSizes2.getName()) == null) {
            str2 = "unknown";
        }
        pairArr[1] = kotlin.TuplesKt.to(keyName2, str2);
        java.lang.String keyName3 = com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.FlowType.getKeyName();
        java.lang.String flowType = this.getHighSpeedVideoFpsRanges.getFlowType();
        pairArr[2] = kotlin.TuplesKt.to(keyName3, flowType != null ? flowType : "unknown");
        java.lang.String keyName4 = com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.RcvrId.getKeyName();
        com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails getHighSpeedVideoSizes3 = this.getHighSpeedVideoFpsRanges.getGetHighSpeedVideoSizes();
        pairArr[3] = kotlin.TuplesKt.to(keyName4, getHighSpeedVideoSizes3 != null ? getHighSpeedVideoSizes3.getName() : null);
        pairArr[4] = kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.SessionId.getKeyName(), this.getHighSpeedVideoFpsRanges.getSessionId());
        pairArr[5] = kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.domain.model.EventPropertyKey.FlowSource.getKeyName(), this.getHighSpeedVideoFpsRanges.getFlowType());
        java.util.Map mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(pairArr);
        if (attributes.length != 0) {
            for (kotlin.Pair<java.lang.String, ? extends java.lang.Object> pair2 : attributes) {
                if (pair2 != null && (first = pair2.getFirst()) != null && (second = pair2.getSecond()) != null && first.length() > 0) {
                    mutableMapOf.put(first, second.toString());
                }
            }
        }
        return kotlin.collections.MapsKt.toMap(mutableMapOf);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ModuleAvailable buildModuleShownEvent$default(com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLoggerHelper checkoutLoggerHelper, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Set set, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            set = kotlin.collections.SetsKt.emptySet();
        }
        return checkoutLoggerHelper.buildModuleShownEvent(str, str2, str3, set);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ModuleAvailable buildModuleShownEvent(java.lang.String eventName, java.lang.String screenName, java.lang.String action, java.util.Set<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> domainContexts) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domainContexts, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ModuleAvailable(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(screenName), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(eventName, 0, null, null, 12, null), null, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(eventName, 0), 4, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.PRODUCT, com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.WEBVIEW_FEATURE, action), kotlin.collections.CollectionsKt.toList(domainContexts));
    }

    public static /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.event.generic.LinkResolved.Inbound buildLinkResolvedInboundEvent$default(com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLoggerHelper checkoutLoggerHelper, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List list2 = list;
        if ((i & 16) != 0) {
            str4 = null;
        }
        return checkoutLoggerHelper.buildLinkResolvedInboundEvent(str, str2, str3, list2, str4);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.LinkResolved.Inbound buildLinkResolvedInboundEvent(java.lang.String action, java.lang.String url, java.lang.String sourceType, java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> domainContexts, java.lang.String errorMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domainContexts, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.LinkResolved.Inbound(new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.PRODUCT, com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.WEBVIEW_FEATURE, action), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext(sourceType, url), errorMessage != null ? new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext("INVALID_URL", errorMessage, "deep_link", "return_to_merchant_handler") : null, domainContexts);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.event.generic.LinkResolved.Outbound buildLinkResolvedOutboundEvent$default(com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLoggerHelper checkoutLoggerHelper, java.lang.String str, java.lang.String str2, java.util.List list, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        return checkoutLoggerHelper.buildLinkResolvedOutboundEvent(str, str2, list, str3);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.LinkResolved.Outbound buildLinkResolvedOutboundEvent(java.lang.String action, java.lang.String destinationUrl, java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> domainContexts, java.lang.String errorMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destinationUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domainContexts, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.LinkResolved.Outbound(new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.PRODUCT, com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.WEBVIEW_FEATURE, action), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficDestinationContext("external_app", destinationUrl), errorMessage != null ? new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext("INVALID_URL", errorMessage, "deep_link", "return_to_merchant_handler") : null, domainContexts);
    }
}
