package com.paypal.oslo.feature.oneonboarding.inventory.views.address.analytics;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\n\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "intentId", "", "trackSuggestNormalizedAddressScreenShown", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;)V", "", "screenId", "itemName", "trackAddressItemPressed", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Ljava/lang/String;Ljava/lang/String;)V", "trackAddressSearchDismiss", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Ljava/lang/String;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddressSearchAnalyticsKt {
    public static final void trackAddressItemPressed(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(str), null, null, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(str2, 0, 2, null), 6, null), com.paypal.oslo.feature.oneonboarding.api.analytics.AccountCreationFlowAnalytics.INSTANCE.getAccountCreationUserIntent(), kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.oneonboarding.api.analytics.AccountCreationFlowAnalytics.INSTANCE.flowContext(intentId))).track(com.paypal.oslo.feature.oneonboarding.AnalyticsTrackerKt.analyticsTracker);
    }

    public static final void trackAddressSearchDismiss(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        trackAddressItemPressed(intentId, str, "dismiss");
    }

    public static final void trackSuggestNormalizedAddressScreenShown(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ScreenAppeared(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.oneonboarding.inventory.views.address.analytics.AddressSearchAnalytics.ScreenIdSuggestNormalizedAddress), null, null, null, 14, null), com.paypal.oslo.feature.oneonboarding.api.analytics.AccountCreationFlowAnalytics.INSTANCE.getAccountCreationUserIntent(), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext(com.paypal.oslo.feature.onboarding.signup.address.analytics.AddressSearchAnalytics.NavigationType, null, null), com.paypal.oslo.feature.oneonboarding.api.analytics.AccountCreationFlowAnalytics.INSTANCE.flowContext(intentId), null, 16, null).track(com.paypal.oslo.feature.oneonboarding.AnalyticsTrackerKt.analyticsTracker);
    }
}
