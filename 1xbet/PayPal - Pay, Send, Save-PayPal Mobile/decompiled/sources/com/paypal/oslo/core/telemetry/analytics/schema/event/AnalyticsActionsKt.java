package com.paypal.oslo.core.telemetry.analytics.schema.event;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0006\u001a\u0019\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\f\u001a\u00020\t*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/schema/event/ItemClickedEvent;", "", "", "toContexts", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/event/ItemClickedEvent;)Ljava/util/List;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/ModuleAppearedEvent;", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/event/ModuleAppearedEvent;)Ljava/util/List;", "Lcom/paypal/oslo/core/telemetry/analytics/AnalyticsTracker;", "analyticsTracker", "", "clicked", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/event/ItemClickedEvent;Lcom/paypal/oslo/core/telemetry/analytics/AnalyticsTracker;)V", "appeared", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/event/ModuleAppearedEvent;Lcom/paypal/oslo/core/telemetry/analytics/AnalyticsTracker;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AnalyticsActionsKt {
    public static final java.util.List<java.lang.Object> toContexts(com.paypal.oslo.core.telemetry.analytics.schema.event.ItemClickedEvent itemClickedEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemClickedEvent, "");
        return kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{itemClickedEvent.getUiContext(), itemClickedEvent.getUserIntent()}), (java.lang.Iterable) itemClickedEvent.getDomainContexts());
    }

    public static final java.util.List<java.lang.Object> toContexts(com.paypal.oslo.core.telemetry.analytics.schema.event.ModuleAppearedEvent moduleAppearedEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleAppearedEvent, "");
        return kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{moduleAppearedEvent.getUiContext(), moduleAppearedEvent.getUserIntent()}), (java.lang.Iterable) moduleAppearedEvent.getDomainContexts());
    }

    public static final void clicked(com.paypal.oslo.core.telemetry.analytics.schema.event.ItemClickedEvent itemClickedEvent, com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker analyticsTracker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemClickedEvent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsTracker, "");
        analyticsTracker.track(new com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent(com.paypal.oslo.core.telemetry.analytics.event.EventType.valueOf("Clicked"), toContexts(itemClickedEvent)));
    }

    public static final void appeared(com.paypal.oslo.core.telemetry.analytics.schema.event.ModuleAppearedEvent moduleAppearedEvent, com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker analyticsTracker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleAppearedEvent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsTracker, "");
        analyticsTracker.track(new com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent(com.paypal.oslo.core.telemetry.analytics.event.EventType.valueOf("Appeared"), toContexts(moduleAppearedEvent)));
    }
}
