package com.paypal.oslo.core.telemetry.compose;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/core/telemetry/compose/ScopeBuilder;", "", "<init>", "()V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "uiContext", "", com.paypal.oslo.feature.p2p.analytics.P2pReviewAnalytics.FEATURE_MODULE, "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;)V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;)V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "item", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;)V", "", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "context", "(Ljava/util/List;)V", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier$telemetry_release", "()Landroidx/compose/ui/Modifier;", "setModifier$telemetry_release", "(Landroidx/compose/ui/Modifier;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ScopeBuilder {
    public static final int $stable = 8;
    private androidx.compose.ui.Modifier modifier = androidx.compose.ui.Modifier.INSTANCE;

    /* renamed from: getModifier$telemetry_release, reason: from getter */
    public final androidx.compose.ui.Modifier getModifier() {
        return this.modifier;
    }

    public final void setModifier$telemetry_release(androidx.compose.ui.Modifier modifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        this.modifier = modifier;
    }

    public final void module(com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module uiContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiContext, "");
        this.modifier = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(this.modifier, uiContext);
    }

    public final void component(com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component component) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(component, "");
        this.modifier = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.component(this.modifier, component);
    }

    public final void item(com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        this.modifier = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(this.modifier, item);
    }

    public final void context(java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.modifier = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(this.modifier, context);
    }
}
