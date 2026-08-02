package com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a/\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\f\u0010\r\u001a+\u0010\u0013\u001a\u00020\u00052\u001a\u0010\u0012\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00110\u000eH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\"(\u0010\u0017\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "intentId", "", "itemName", "moduleName", "", "trackPersonalInfoItemPressed", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Ljava/lang/String;Ljava/lang/String;)V", "errorCode", "errorDescription", "trackPersonalInfoFieldError", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "trackPersonalInfoPageError", "(Ljava/lang/String;Ljava/lang/String;)V", "", "Lkotlin/reflect/KClass;", "Lcom/paypal/oslo/core/i18n/domain/model/Field;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/personalinfo/analytics/FieldError;", "fieldErrors", "fireFieldErrorAnalytics", "(Ljava/util/Map;)V", "getHighSpeedVideoFpsRanges", "Ljava/util/Map;", "getHighSpeedVideoSizes"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PersonalInfoAnalyticsKt {
    private static final java.util.Map<kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, java.lang.String> getHighSpeedVideoFpsRanges = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.GivenName.class), com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ModuleFirstName), kotlin.TuplesKt.to(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.Surname.class), com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ModuleLastName), kotlin.TuplesKt.to(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.AddressLine1.class), com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ModuleAddressLine1), kotlin.TuplesKt.to(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.AddressLine2.class), com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ModuleAddressLine2), kotlin.TuplesKt.to(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.AdminArea1.class), "state"), kotlin.TuplesKt.to(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.AdminArea2.class), com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ModuleCity), kotlin.TuplesKt.to(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.i18n.domain.model.PostalCode.class), "postal_code"));

    public static /* synthetic */ void trackPersonalInfoItemPressed$default(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        trackPersonalInfoItemPressed(intentId, str, str2);
    }

    public static final void trackPersonalInfoItemPressed(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ScreenId), str2 != null ? new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(str2, 0, null, null, 14, null) : null, null, str != null ? new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(str, 0, 2, null) : null, 4, null), com.paypal.oslo.feature.oneonboarding.api.analytics.AccountCreationFlowAnalytics.INSTANCE.getAccountCreationUserIntent(), kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.oneonboarding.api.analytics.AccountCreationFlowAnalytics.INSTANCE.flowContext(intentId))).track(com.paypal.oslo.feature.oneonboarding.AnalyticsTrackerKt.analyticsTracker);
    }

    public static final void trackPersonalInfoFieldError(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ErrorShown(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ScreenId), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(str, 0, null, null, 14, null), null, null, 12, null), com.paypal.oslo.feature.oneonboarding.api.analytics.AccountCreationFlowAnalytics.INSTANCE.getAccountCreationUserIntent(), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext(str2, str3, "field", str)).track(com.paypal.oslo.feature.oneonboarding.AnalyticsTrackerKt.analyticsTracker);
    }

    public static final void trackPersonalInfoPageError(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ErrorShown(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ScreenId), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ModulePageError, 0, null, null, 14, null), null, null, 12, null), com.paypal.oslo.feature.oneonboarding.api.analytics.AccountCreationFlowAnalytics.INSTANCE.getAccountCreationUserIntent(), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext(str2, str, "page", com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ScreenId)).track(com.paypal.oslo.feature.oneonboarding.AnalyticsTrackerKt.analyticsTracker);
    }

    public static final void fireFieldErrorAnalytics(java.util.Map<kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.FieldError> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        for (java.util.Map.Entry<kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.FieldError> entry : map.entrySet()) {
            kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field> key = entry.getKey();
            com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.FieldError value = entry.getValue();
            java.lang.String str = getHighSpeedVideoFpsRanges.get(key);
            if (str != null) {
                trackPersonalInfoFieldError(str, value.getAnalyticsCode(), value.getMessage());
            }
        }
    }
}
