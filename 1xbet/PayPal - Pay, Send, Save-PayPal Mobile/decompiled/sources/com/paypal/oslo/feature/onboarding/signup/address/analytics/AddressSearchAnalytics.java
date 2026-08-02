package com.paypal.oslo.feature.onboarding.signup.address.analytics;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016R\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016R\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0016R\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/address/analytics/AddressSearchAnalytics;", "", "<init>", "()V", "", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME, "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ScreenAppeared;", "trackScreenShown$onboarding_prodRelease", "(Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ScreenAppeared;", "errorDescription", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ErrorShown;", "trackError$onboarding_prodRelease", "(Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ErrorShown;", "", "index", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ItemPressed;", "trackAddressSelected$onboarding_prodRelease", "(ILjava/lang/String;)Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ItemPressed;", "trackAddManually$onboarding_prodRelease", "(Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ItemPressed;", "trackDismiss$onboarding_prodRelease", com.ingo.sdk.kotlin.common.analytics.IPropertyNames.ScreenName, "Ljava/lang/String;", "NavigationType", "ModuleDropdown", "ItemSelectAddress", "ItemAddManually", "ItemDismiss", "ErrorCode", "ErrorType", "ErrorSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddressSearchAnalytics {
    public static final int $stable = 0;
    public static final java.lang.String ErrorCode = "ADDRESS_SEARCH_ERROR";
    public static final java.lang.String ErrorSource = "address_search";
    public static final java.lang.String ErrorType = "page";
    public static final com.paypal.oslo.feature.onboarding.signup.address.analytics.AddressSearchAnalytics INSTANCE = new com.paypal.oslo.feature.onboarding.signup.address.analytics.AddressSearchAnalytics();
    public static final java.lang.String ItemAddManually = "add_manually";
    public static final java.lang.String ItemDismiss = "dismiss";
    public static final java.lang.String ItemSelectAddress = "select_address";
    public static final java.lang.String ModuleDropdown = "address_search_dropdown";
    public static final java.lang.String NavigationType = "modal";
    public static final java.lang.String ScreenName = "address_search";

    private AddressSearchAnalytics() {
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ScreenAppeared trackScreenShown$onboarding_prodRelease(java.lang.String flowName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowName, "");
        com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ScreenAppeared screenAppeared = new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ScreenAppeared(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen("address_search"), null, null, null, 14, null), com.paypal.oslo.feature.oneonboarding.api.analytics.AccountCreationFlowAnalytics.INSTANCE.getAccountCreationUserIntent(), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext(NavigationType, null, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext(flowName, null), null, 16, null);
        screenAppeared.track(com.paypal.oslo.feature.onboarding.AnalyticsTrackerKt.analyticsTracker);
        return screenAppeared;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ErrorShown trackError$onboarding_prodRelease(java.lang.String errorDescription) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDescription, "");
        com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ErrorShown errorShown = new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ErrorShown(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen("address_search"), null, null, null, 14, null), com.paypal.oslo.feature.oneonboarding.api.analytics.AccountCreationFlowAnalytics.INSTANCE.getAccountCreationUserIntent(), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext("ADDRESS_SEARCH_ERROR", errorDescription, "page", "address_search"));
        errorShown.track(com.paypal.oslo.feature.onboarding.AnalyticsTrackerKt.analyticsTracker);
        return errorShown;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed trackAddManually$onboarding_prodRelease(java.lang.String flowName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowName, "");
        com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed itemPressed = new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen("address_search"), null, null, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(ItemAddManually, 0, 2, null), 6, null), com.paypal.oslo.feature.oneonboarding.api.analytics.AccountCreationFlowAnalytics.INSTANCE.getAccountCreationUserIntent(), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext(flowName, null)));
        itemPressed.track(com.paypal.oslo.feature.onboarding.AnalyticsTrackerKt.analyticsTracker);
        return itemPressed;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed trackAddressSelected$onboarding_prodRelease(int index, java.lang.String flowName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowName, "");
        com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed itemPressed = new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen("address_search"), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("address_search_dropdown", 0, null, java.lang.Integer.valueOf(index), 6, null), null, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(ItemSelectAddress, 0, 2, null), 4, null), com.paypal.oslo.feature.oneonboarding.api.analytics.AccountCreationFlowAnalytics.INSTANCE.getAccountCreationUserIntent(), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext(flowName, null)));
        itemPressed.track(com.paypal.oslo.feature.onboarding.AnalyticsTrackerKt.analyticsTracker);
        return itemPressed;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed trackDismiss$onboarding_prodRelease(java.lang.String flowName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowName, "");
        com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed itemPressed = new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen("address_search"), null, null, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("dismiss", 0, 2, null), 6, null), com.paypal.oslo.feature.oneonboarding.api.analytics.AccountCreationFlowAnalytics.INSTANCE.getAccountCreationUserIntent(), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext(flowName, null)));
        itemPressed.track(com.paypal.oslo.feature.onboarding.AnalyticsTrackerKt.analyticsTracker);
        return itemPressed;
    }
}
