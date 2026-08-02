package com.paypal.oslo.feature.p2p.analytics;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006J\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u000b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u000b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u000b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0017R\u0014\u0010 \u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b \u0010\u0017R\u0014\u0010!\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b!\u0010\u0017R\u0014\u0010\"\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\"\u0010\u0017R\u0014\u0010#\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b#\u0010\u0017R\u0014\u0010$\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b$\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/p2p/analytics/P2pReviewAnalytics;", "", "<init>", "()V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ModuleAppeared;", "contactModuleAppeared", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ModuleAppeared;", "paymentTypeModuleAppeared", "paymentMethodModuleAppeared", "", "p0", "", "p1", "Camera2StreamConfigurationMap", "(Ljava/lang/String;I)Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ModuleAppeared;", "moduleName", "moduleOrder", "itemName", "itemOrder", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ItemPressed;", "createItemPressedEvent", "(Ljava/lang/String;ILjava/lang/String;I)Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ItemPressed;", "SCREEN_REVIEW", "Ljava/lang/String;", "MODULE_CONTACT", "MODULE_PAYMENT_TYPE", "MODULE_PAYMENT_METHOD", "ORDER_CONTACT", com.visa.cbp.getEncExpo.warmup, "ORDER_PAYMENT_TYPE", "ORDER_PAYMENT_METHOD", "PRODUCT", "FEATURE_MODULE", "FEATURE_ITEM", "ACTION_VIEWED", "ACTION_CLICKED", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class P2pReviewAnalytics {
    public static final int $stable = 0;
    public static final java.lang.String ACTION_CLICKED = "clicked";
    public static final java.lang.String ACTION_VIEWED = "viewed";
    public static final java.lang.String FEATURE_ITEM = "item";
    public static final java.lang.String FEATURE_MODULE = "module";
    public static final com.paypal.oslo.feature.p2p.analytics.P2pReviewAnalytics INSTANCE = new com.paypal.oslo.feature.p2p.analytics.P2pReviewAnalytics();
    public static final java.lang.String MODULE_CONTACT = "contact_section";
    public static final java.lang.String MODULE_PAYMENT_METHOD = "payment_method_section";
    public static final java.lang.String MODULE_PAYMENT_TYPE = "payment_type_section";
    public static final int ORDER_CONTACT = 0;
    public static final int ORDER_PAYMENT_METHOD = 2;
    public static final int ORDER_PAYMENT_TYPE = 1;
    public static final java.lang.String PRODUCT = "oslo_auto_capture";
    public static final java.lang.String SCREEN_REVIEW = "review_screen";
    public static final java.lang.String UNKNOWN = "unknown";

    private P2pReviewAnalytics() {
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ModuleAppeared contactModuleAppeared() {
        return Camera2StreamConfigurationMap(MODULE_CONTACT, 0);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ModuleAppeared paymentTypeModuleAppeared() {
        return Camera2StreamConfigurationMap(MODULE_PAYMENT_TYPE, 1);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ModuleAppeared paymentMethodModuleAppeared() {
        return Camera2StreamConfigurationMap(MODULE_PAYMENT_METHOD, 2);
    }

    private static com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ModuleAppeared Camera2StreamConfigurationMap(java.lang.String p0, int p1) {
        return new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ModuleAppeared(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen("review_screen"), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(p0, p1, null, null, 12, null), null, null, 4, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("oslo_auto_capture", FEATURE_MODULE, "viewed"), null, 4, null);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed createItemPressedEvent(java.lang.String moduleName, int moduleOrder, java.lang.String itemName, int itemOrder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemName, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen("review_screen"), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(moduleName, moduleOrder, null, null, 12, null), null, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(itemName, itemOrder), 4, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("oslo_auto_capture", "item", "clicked"), null, 4, null);
    }
}
