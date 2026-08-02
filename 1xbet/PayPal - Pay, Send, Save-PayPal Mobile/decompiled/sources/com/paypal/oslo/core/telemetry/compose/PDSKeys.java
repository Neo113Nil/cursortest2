package com.paypal.oslo.core.telemetry.compose;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\tR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0012\u0010\tR&\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0007\u001a\u0004\b\u0016\u0010\tR&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0007\u0012\u0004\b\u001a\u0010\u0003\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/core/telemetry/compose/PDSKeys;", "", "<init>", "()V", "Lcom/paypal/pds/analytics/TypedKey;", "Landroidx/navigation3/runtime/NavKey;", "Screen", "Lcom/paypal/pds/analytics/TypedKey;", "getScreen", "()Lcom/paypal/pds/analytics/TypedKey;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", com.ingo.sdk.kotlin.common.analytics.IPropertyNames.Module, "getModule", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "Component", "getComponent", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "Item", "getItem", "", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "AnalyticsContext", "getAnalyticsContext", "", "Id", "getId", "getId$annotations"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PDSKeys {
    public static final int $stable = 0;
    public static final com.paypal.oslo.core.telemetry.compose.PDSKeys INSTANCE = new com.paypal.oslo.core.telemetry.compose.PDSKeys();
    private static final com.paypal.pds.analytics.TypedKey<androidx.navigation3.runtime.NavKey> Screen = new com.paypal.pds.analytics.TypedKey<>("screen", androidx.navigation3.runtime.NavKey.class);
    private static final com.paypal.pds.analytics.TypedKey<com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module> Module = new com.paypal.pds.analytics.TypedKey<>(com.paypal.oslo.feature.p2p.analytics.P2pReviewAnalytics.FEATURE_MODULE, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.class);
    private static final com.paypal.pds.analytics.TypedKey<com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component> Component = new com.paypal.pds.analytics.TypedKey<>(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.class);
    private static final com.paypal.pds.analytics.TypedKey<com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item> Item = new com.paypal.pds.analytics.TypedKey<>("item", com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.class);
    private static final com.paypal.pds.analytics.TypedKey<java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext>> AnalyticsContext = new com.paypal.pds.analytics.TypedKey<>("analytics_context", java.util.List.class);
    private static final com.paypal.pds.analytics.TypedKey<java.lang.String> Id = new com.paypal.pds.analytics.TypedKey<>("id", java.lang.String.class);

    @kotlin.Deprecated(message = "Replaced with module, component and item")
    public static /* synthetic */ void getId$annotations() {
    }

    private PDSKeys() {
    }

    public final com.paypal.pds.analytics.TypedKey<androidx.navigation3.runtime.NavKey> getScreen() {
        return Screen;
    }

    public final com.paypal.pds.analytics.TypedKey<com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module> getModule() {
        return Module;
    }

    public final com.paypal.pds.analytics.TypedKey<com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component> getComponent() {
        return Component;
    }

    public final com.paypal.pds.analytics.TypedKey<com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item> getItem() {
        return Item;
    }

    public final com.paypal.pds.analytics.TypedKey<java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext>> getAnalyticsContext() {
        return AnalyticsContext;
    }

    public final com.paypal.pds.analytics.TypedKey<java.lang.String> getId() {
        return Id;
    }
}
