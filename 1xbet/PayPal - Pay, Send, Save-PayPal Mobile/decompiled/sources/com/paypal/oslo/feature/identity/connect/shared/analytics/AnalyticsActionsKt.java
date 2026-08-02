package com.paypal.oslo.feature.identity.connect.shared.analytics;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0005H\u0000¢\u0006\u0004\b\u0003\u0010\u0006\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0007H\u0000¢\u0006\u0004\b\u0003\u0010\b\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\tH\u0000¢\u0006\u0004\b\u0003\u0010\n\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u000bH\u0000¢\u0006\u0004\b\u0003\u0010\f\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\rH\u0000¢\u0006\u0004\b\u0003\u0010\u000e\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u000fH\u0000¢\u0006\u0004\b\u0003\u0010\u0010\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0011H\u0000¢\u0006\u0004\b\u0003\u0010\u0012\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0013H\u0000¢\u0006\u0004\b\u0003\u0010\u0014\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0000H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0018\u001a\u00020\u0015*\u00020\u0000H\u0000¢\u0006\u0004\b\u0018\u0010\u0017\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0005H\u0000¢\u0006\u0004\b\u0016\u0010\u0019\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0007H\u0000¢\u0006\u0004\b\u0016\u0010\u001a\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\tH\u0000¢\u0006\u0004\b\u0016\u0010\u001b\u001a\u0013\u0010\u0018\u001a\u00020\u0015*\u00020\tH\u0000¢\u0006\u0004\b\u0018\u0010\u001b\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u000bH\u0000¢\u0006\u0004\b\u0016\u0010\u001c\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\rH\u0000¢\u0006\u0004\b\u0016\u0010\u001d\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u000fH\u0000¢\u0006\u0004\b\u0016\u0010\u001e\u001a\u0013\u0010\u0018\u001a\u00020\u0015*\u00020\u000fH\u0000¢\u0006\u0004\b\u0018\u0010\u001e\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0011H\u0000¢\u0006\u0004\b\u0016\u0010\u001f\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0013H\u0000¢\u0006\u0004\b\u0016\u0010 \u001a\u0013\u0010\"\u001a\u00020!*\u00020\u0000H\u0000¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010\"\u001a\u00020!*\u00020\u0005H\u0000¢\u0006\u0004\b\"\u0010$\u001a\u0013\u0010\"\u001a\u00020!*\u00020\u0007H\u0000¢\u0006\u0004\b\"\u0010%\u001a\u0013\u0010\"\u001a\u00020!*\u00020\tH\u0000¢\u0006\u0004\b\"\u0010&\u001a\u0013\u0010\"\u001a\u00020!*\u00020\u000bH\u0000¢\u0006\u0004\b\"\u0010'\u001a\u0013\u0010\"\u001a\u00020!*\u00020\rH\u0000¢\u0006\u0004\b\"\u0010(\u001a\u0013\u0010\"\u001a\u00020!*\u00020\u000fH\u0000¢\u0006\u0004\b\"\u0010)\u001a\u0013\u0010\"\u001a\u00020!*\u00020\u0011H\u0000¢\u0006\u0004\b\"\u0010*\u001a\u0013\u0010\"\u001a\u00020!*\u00020\u0013H\u0000¢\u0006\u0004\b\"\u0010+"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectFlowInitializedEvent;", "", "", "toContexts", "(Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectFlowInitializedEvent;)Ljava/util/List;", "Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectApiCallStartedEvent;", "(Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectApiCallStartedEvent;)Ljava/util/List;", "Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectApiCallSucceededEvent;", "(Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectApiCallSucceededEvent;)Ljava/util/List;", "Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectApiCallFailedEvent;", "(Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectApiCallFailedEvent;)Ljava/util/List;", "Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectWebViewShownEvent;", "(Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectWebViewShownEvent;)Ljava/util/List;", "Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectWebViewPageLoadEvent;", "(Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectWebViewPageLoadEvent;)Ljava/util/List;", "Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectWebViewClosedEvent;", "(Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectWebViewClosedEvent;)Ljava/util/List;", "Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectFlowCompletedEvent;", "(Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectFlowCompletedEvent;)Ljava/util/List;", "Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectFlowFailedEvent;", "(Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectFlowFailedEvent;)Ljava/util/List;", "", "appeared", "(Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectFlowInitializedEvent;)V", "disappeared", "(Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectApiCallStartedEvent;)V", "(Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectApiCallSucceededEvent;)V", "(Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectApiCallFailedEvent;)V", "(Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectWebViewShownEvent;)V", "(Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectWebViewPageLoadEvent;)V", "(Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectWebViewClosedEvent;)V", "(Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectFlowCompletedEvent;)V", "(Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectFlowFailedEvent;)V", "Lcom/paypal/oslo/core/telemetry/analytics/TrackableEvent;", "trackableEvent", "(Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectFlowInitializedEvent;)Lcom/paypal/oslo/core/telemetry/analytics/TrackableEvent;", "(Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectApiCallStartedEvent;)Lcom/paypal/oslo/core/telemetry/analytics/TrackableEvent;", "(Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectApiCallSucceededEvent;)Lcom/paypal/oslo/core/telemetry/analytics/TrackableEvent;", "(Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectApiCallFailedEvent;)Lcom/paypal/oslo/core/telemetry/analytics/TrackableEvent;", "(Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectWebViewShownEvent;)Lcom/paypal/oslo/core/telemetry/analytics/TrackableEvent;", "(Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectWebViewPageLoadEvent;)Lcom/paypal/oslo/core/telemetry/analytics/TrackableEvent;", "(Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectWebViewClosedEvent;)Lcom/paypal/oslo/core/telemetry/analytics/TrackableEvent;", "(Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectFlowCompletedEvent;)Lcom/paypal/oslo/core/telemetry/analytics/TrackableEvent;", "(Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectFlowFailedEvent;)Lcom/paypal/oslo/core/telemetry/analytics/TrackableEvent;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AnalyticsActionsKt {
    public static final java.util.List<java.lang.Object> toContexts(com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectFlowInitializedEvent connectFlowInitializedEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectFlowInitializedEvent, "");
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{connectFlowInitializedEvent.getUiContext(), connectFlowInitializedEvent.getUserIntent(), connectFlowInitializedEvent.getBusinessFlowContext(), connectFlowInitializedEvent.getNavigationContext(), connectFlowInitializedEvent.getTrafficSourceContext()});
    }

    public static final java.util.List<java.lang.Object> toContexts(com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectApiCallStartedEvent connectApiCallStartedEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectApiCallStartedEvent, "");
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{connectApiCallStartedEvent.getUiContext(), connectApiCallStartedEvent.getUserIntent(), connectApiCallStartedEvent.getBusinessFlowContext(), connectApiCallStartedEvent.getNavigationContext(), connectApiCallStartedEvent.getAuthenticationContext(), connectApiCallStartedEvent.getTrafficSourceContext()});
    }

    public static final java.util.List<java.lang.Object> toContexts(com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectApiCallSucceededEvent connectApiCallSucceededEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectApiCallSucceededEvent, "");
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{connectApiCallSucceededEvent.getUiContext(), connectApiCallSucceededEvent.getUserIntent(), connectApiCallSucceededEvent.getBusinessFlowContext(), connectApiCallSucceededEvent.getNavigationContext(), connectApiCallSucceededEvent.getAuthenticationContext(), connectApiCallSucceededEvent.getTrafficSourceContext()});
    }

    public static final java.util.List<java.lang.Object> toContexts(com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectApiCallFailedEvent connectApiCallFailedEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectApiCallFailedEvent, "");
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{connectApiCallFailedEvent.getUiContext(), connectApiCallFailedEvent.getUserIntent(), connectApiCallFailedEvent.getTrafficDestinationContext(), connectApiCallFailedEvent.getBusinessFlowContext(), connectApiCallFailedEvent.getNavigationContext(), connectApiCallFailedEvent.getErrorContext(), connectApiCallFailedEvent.getAuthenticationContext(), connectApiCallFailedEvent.getTrafficSourceContext()});
    }

    public static final java.util.List<java.lang.Object> toContexts(com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectWebViewShownEvent connectWebViewShownEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectWebViewShownEvent, "");
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{connectWebViewShownEvent.getUiContext(), connectWebViewShownEvent.getUserIntent(), connectWebViewShownEvent.getBusinessFlowContext(), connectWebViewShownEvent.getNavigationContext(), connectWebViewShownEvent.getTrafficSourceContext()});
    }

    public static final java.util.List<java.lang.Object> toContexts(com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectWebViewPageLoadEvent connectWebViewPageLoadEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectWebViewPageLoadEvent, "");
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{connectWebViewPageLoadEvent.getUiContext(), connectWebViewPageLoadEvent.getUserIntent(), connectWebViewPageLoadEvent.getTrafficDestinationContext(), connectWebViewPageLoadEvent.getBusinessFlowContext(), connectWebViewPageLoadEvent.getNavigationContext(), connectWebViewPageLoadEvent.getTrafficSourceContext()});
    }

    public static final java.util.List<java.lang.Object> toContexts(com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectWebViewClosedEvent connectWebViewClosedEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectWebViewClosedEvent, "");
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{connectWebViewClosedEvent.getUiContext(), connectWebViewClosedEvent.getUserIntent(), connectWebViewClosedEvent.getTrafficDestinationContext(), connectWebViewClosedEvent.getBusinessFlowContext(), connectWebViewClosedEvent.getNavigationContext(), connectWebViewClosedEvent.getTrafficSourceContext()});
    }

    public static final java.util.List<java.lang.Object> toContexts(com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectFlowCompletedEvent connectFlowCompletedEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectFlowCompletedEvent, "");
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{connectFlowCompletedEvent.getUiContext(), connectFlowCompletedEvent.getUserIntent(), connectFlowCompletedEvent.getTrafficDestinationContext(), connectFlowCompletedEvent.getBusinessFlowContext(), connectFlowCompletedEvent.getNavigationContext(), connectFlowCompletedEvent.getTrafficSourceContext()});
    }

    public static final java.util.List<java.lang.Object> toContexts(com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectFlowFailedEvent connectFlowFailedEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectFlowFailedEvent, "");
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{connectFlowFailedEvent.getUiContext(), connectFlowFailedEvent.getUserIntent(), connectFlowFailedEvent.getTrafficDestinationContext(), connectFlowFailedEvent.getBusinessFlowContext(), connectFlowFailedEvent.getNavigationContext(), connectFlowFailedEvent.getErrorContext(), connectFlowFailedEvent.getTrafficSourceContext()});
    }

    public static final void appeared(com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectFlowInitializedEvent connectFlowInitializedEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectFlowInitializedEvent, "");
        com.paypal.oslo.feature.identity.connect.shared.AnalyticsTrackerKt.getAnalyticsTracker().track(new com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent(com.paypal.oslo.core.telemetry.analytics.event.EventType.valueOf("Appeared"), toContexts(connectFlowInitializedEvent)));
    }

    public static final void disappeared(com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectFlowInitializedEvent connectFlowInitializedEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectFlowInitializedEvent, "");
        com.paypal.oslo.feature.identity.connect.shared.AnalyticsTrackerKt.getAnalyticsTracker().track(new com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent(com.paypal.oslo.core.telemetry.analytics.event.EventType.valueOf("Disappeared"), toContexts(connectFlowInitializedEvent)));
    }

    public static final void appeared(com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectApiCallStartedEvent connectApiCallStartedEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectApiCallStartedEvent, "");
        com.paypal.oslo.feature.identity.connect.shared.AnalyticsTrackerKt.getAnalyticsTracker().track(new com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent(com.paypal.oslo.core.telemetry.analytics.event.EventType.valueOf("Appeared"), toContexts(connectApiCallStartedEvent)));
    }

    public static final void appeared(com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectApiCallSucceededEvent connectApiCallSucceededEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectApiCallSucceededEvent, "");
        com.paypal.oslo.feature.identity.connect.shared.AnalyticsTrackerKt.getAnalyticsTracker().track(new com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent(com.paypal.oslo.core.telemetry.analytics.event.EventType.valueOf("Appeared"), toContexts(connectApiCallSucceededEvent)));
    }

    public static final void appeared(com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectApiCallFailedEvent connectApiCallFailedEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectApiCallFailedEvent, "");
        com.paypal.oslo.feature.identity.connect.shared.AnalyticsTrackerKt.getAnalyticsTracker().track(new com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent(com.paypal.oslo.core.telemetry.analytics.event.EventType.valueOf("Appeared"), toContexts(connectApiCallFailedEvent)));
    }

    public static final void disappeared(com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectApiCallFailedEvent connectApiCallFailedEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectApiCallFailedEvent, "");
        com.paypal.oslo.feature.identity.connect.shared.AnalyticsTrackerKt.getAnalyticsTracker().track(new com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent(com.paypal.oslo.core.telemetry.analytics.event.EventType.valueOf("Disappeared"), toContexts(connectApiCallFailedEvent)));
    }

    public static final void appeared(com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectWebViewShownEvent connectWebViewShownEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectWebViewShownEvent, "");
        com.paypal.oslo.feature.identity.connect.shared.AnalyticsTrackerKt.getAnalyticsTracker().track(new com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent(com.paypal.oslo.core.telemetry.analytics.event.EventType.valueOf("Appeared"), toContexts(connectWebViewShownEvent)));
    }

    public static final void appeared(com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectWebViewPageLoadEvent connectWebViewPageLoadEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectWebViewPageLoadEvent, "");
        com.paypal.oslo.feature.identity.connect.shared.AnalyticsTrackerKt.getAnalyticsTracker().track(new com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent(com.paypal.oslo.core.telemetry.analytics.event.EventType.valueOf("Appeared"), toContexts(connectWebViewPageLoadEvent)));
    }

    public static final void appeared(com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectWebViewClosedEvent connectWebViewClosedEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectWebViewClosedEvent, "");
        com.paypal.oslo.feature.identity.connect.shared.AnalyticsTrackerKt.getAnalyticsTracker().track(new com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent(com.paypal.oslo.core.telemetry.analytics.event.EventType.valueOf("Appeared"), toContexts(connectWebViewClosedEvent)));
    }

    public static final void disappeared(com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectWebViewClosedEvent connectWebViewClosedEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectWebViewClosedEvent, "");
        com.paypal.oslo.feature.identity.connect.shared.AnalyticsTrackerKt.getAnalyticsTracker().track(new com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent(com.paypal.oslo.core.telemetry.analytics.event.EventType.valueOf("Disappeared"), toContexts(connectWebViewClosedEvent)));
    }

    public static final void appeared(com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectFlowCompletedEvent connectFlowCompletedEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectFlowCompletedEvent, "");
        com.paypal.oslo.feature.identity.connect.shared.AnalyticsTrackerKt.getAnalyticsTracker().track(new com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent(com.paypal.oslo.core.telemetry.analytics.event.EventType.valueOf("Appeared"), toContexts(connectFlowCompletedEvent)));
    }

    public static final void appeared(com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectFlowFailedEvent connectFlowFailedEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectFlowFailedEvent, "");
        com.paypal.oslo.feature.identity.connect.shared.AnalyticsTrackerKt.getAnalyticsTracker().track(new com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent(com.paypal.oslo.core.telemetry.analytics.event.EventType.valueOf("Appeared"), toContexts(connectFlowFailedEvent)));
    }

    public static final com.paypal.oslo.core.telemetry.analytics.TrackableEvent trackableEvent(final com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectFlowInitializedEvent connectFlowInitializedEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectFlowInitializedEvent, "");
        return new com.paypal.oslo.core.telemetry.analytics.TrackableEvent() { // from class: com.paypal.oslo.feature.identity.connect.shared.analytics.AnalyticsActionsKt$trackableEvent$1
            @Override // com.paypal.oslo.core.telemetry.analytics.TrackableEvent
            public final void track(com.paypal.oslo.core.telemetry.analytics.event.EventType eventType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "");
                int i = com.paypal.oslo.feature.identity.connect.shared.analytics.AnalyticsActionsKt$trackableEvent$1.WhenMappings.$EnumSwitchMapping$0[eventType.ordinal()];
                if (i == 1) {
                    com.paypal.oslo.feature.identity.connect.shared.analytics.AnalyticsActionsKt.appeared(com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectFlowInitializedEvent.this);
                } else {
                    if (i == 2) {
                        com.paypal.oslo.feature.identity.connect.shared.analytics.AnalyticsActionsKt.disappeared(com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectFlowInitializedEvent.this);
                        return;
                    }
                    throw new java.lang.IllegalStateException("Event ConnectFlowInitializedEvent does not support event type $eventType".toString());
                }
            }

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[com.paypal.oslo.core.telemetry.analytics.event.EventType.values().length];
                    try {
                        iArr[com.paypal.oslo.core.telemetry.analytics.event.EventType.Appeared.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    try {
                        iArr[com.paypal.oslo.core.telemetry.analytics.event.EventType.Disappeared.ordinal()] = 2;
                    } catch (java.lang.NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }
        };
    }

    public static final com.paypal.oslo.core.telemetry.analytics.TrackableEvent trackableEvent(final com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectApiCallStartedEvent connectApiCallStartedEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectApiCallStartedEvent, "");
        return new com.paypal.oslo.core.telemetry.analytics.TrackableEvent() { // from class: com.paypal.oslo.feature.identity.connect.shared.analytics.AnalyticsActionsKt$trackableEvent$2
            @Override // com.paypal.oslo.core.telemetry.analytics.TrackableEvent
            public final void track(com.paypal.oslo.core.telemetry.analytics.event.EventType eventType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "");
                if (com.paypal.oslo.feature.identity.connect.shared.analytics.AnalyticsActionsKt$trackableEvent$2.WhenMappings.$EnumSwitchMapping$0[eventType.ordinal()] == 1) {
                    com.paypal.oslo.feature.identity.connect.shared.analytics.AnalyticsActionsKt.appeared(com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectApiCallStartedEvent.this);
                    return;
                }
                throw new java.lang.IllegalStateException("Event ConnectApiCallStartedEvent does not support event type $eventType".toString());
            }

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[com.paypal.oslo.core.telemetry.analytics.event.EventType.values().length];
                    try {
                        iArr[com.paypal.oslo.core.telemetry.analytics.event.EventType.Appeared.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }
        };
    }

    public static final com.paypal.oslo.core.telemetry.analytics.TrackableEvent trackableEvent(final com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectApiCallSucceededEvent connectApiCallSucceededEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectApiCallSucceededEvent, "");
        return new com.paypal.oslo.core.telemetry.analytics.TrackableEvent() { // from class: com.paypal.oslo.feature.identity.connect.shared.analytics.AnalyticsActionsKt$trackableEvent$3
            @Override // com.paypal.oslo.core.telemetry.analytics.TrackableEvent
            public final void track(com.paypal.oslo.core.telemetry.analytics.event.EventType eventType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "");
                if (com.paypal.oslo.feature.identity.connect.shared.analytics.AnalyticsActionsKt$trackableEvent$3.WhenMappings.$EnumSwitchMapping$0[eventType.ordinal()] == 1) {
                    com.paypal.oslo.feature.identity.connect.shared.analytics.AnalyticsActionsKt.appeared(com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectApiCallSucceededEvent.this);
                    return;
                }
                throw new java.lang.IllegalStateException("Event ConnectApiCallSucceededEvent does not support event type $eventType".toString());
            }

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[com.paypal.oslo.core.telemetry.analytics.event.EventType.values().length];
                    try {
                        iArr[com.paypal.oslo.core.telemetry.analytics.event.EventType.Appeared.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }
        };
    }

    public static final com.paypal.oslo.core.telemetry.analytics.TrackableEvent trackableEvent(final com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectApiCallFailedEvent connectApiCallFailedEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectApiCallFailedEvent, "");
        return new com.paypal.oslo.core.telemetry.analytics.TrackableEvent() { // from class: com.paypal.oslo.feature.identity.connect.shared.analytics.AnalyticsActionsKt$trackableEvent$4
            @Override // com.paypal.oslo.core.telemetry.analytics.TrackableEvent
            public final void track(com.paypal.oslo.core.telemetry.analytics.event.EventType eventType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "");
                int i = com.paypal.oslo.feature.identity.connect.shared.analytics.AnalyticsActionsKt$trackableEvent$4.WhenMappings.$EnumSwitchMapping$0[eventType.ordinal()];
                if (i == 1) {
                    com.paypal.oslo.feature.identity.connect.shared.analytics.AnalyticsActionsKt.appeared(com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectApiCallFailedEvent.this);
                } else {
                    if (i == 2) {
                        com.paypal.oslo.feature.identity.connect.shared.analytics.AnalyticsActionsKt.disappeared(com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectApiCallFailedEvent.this);
                        return;
                    }
                    throw new java.lang.IllegalStateException("Event ConnectApiCallFailedEvent does not support event type $eventType".toString());
                }
            }

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[com.paypal.oslo.core.telemetry.analytics.event.EventType.values().length];
                    try {
                        iArr[com.paypal.oslo.core.telemetry.analytics.event.EventType.Appeared.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    try {
                        iArr[com.paypal.oslo.core.telemetry.analytics.event.EventType.Disappeared.ordinal()] = 2;
                    } catch (java.lang.NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }
        };
    }

    public static final com.paypal.oslo.core.telemetry.analytics.TrackableEvent trackableEvent(final com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectWebViewShownEvent connectWebViewShownEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectWebViewShownEvent, "");
        return new com.paypal.oslo.core.telemetry.analytics.TrackableEvent() { // from class: com.paypal.oslo.feature.identity.connect.shared.analytics.AnalyticsActionsKt$trackableEvent$5
            @Override // com.paypal.oslo.core.telemetry.analytics.TrackableEvent
            public final void track(com.paypal.oslo.core.telemetry.analytics.event.EventType eventType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "");
                if (com.paypal.oslo.feature.identity.connect.shared.analytics.AnalyticsActionsKt$trackableEvent$5.WhenMappings.$EnumSwitchMapping$0[eventType.ordinal()] == 1) {
                    com.paypal.oslo.feature.identity.connect.shared.analytics.AnalyticsActionsKt.appeared(com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectWebViewShownEvent.this);
                    return;
                }
                throw new java.lang.IllegalStateException("Event ConnectWebViewShownEvent does not support event type $eventType".toString());
            }

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[com.paypal.oslo.core.telemetry.analytics.event.EventType.values().length];
                    try {
                        iArr[com.paypal.oslo.core.telemetry.analytics.event.EventType.Appeared.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }
        };
    }

    public static final com.paypal.oslo.core.telemetry.analytics.TrackableEvent trackableEvent(final com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectWebViewPageLoadEvent connectWebViewPageLoadEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectWebViewPageLoadEvent, "");
        return new com.paypal.oslo.core.telemetry.analytics.TrackableEvent() { // from class: com.paypal.oslo.feature.identity.connect.shared.analytics.AnalyticsActionsKt$trackableEvent$6
            @Override // com.paypal.oslo.core.telemetry.analytics.TrackableEvent
            public final void track(com.paypal.oslo.core.telemetry.analytics.event.EventType eventType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "");
                if (com.paypal.oslo.feature.identity.connect.shared.analytics.AnalyticsActionsKt$trackableEvent$6.WhenMappings.$EnumSwitchMapping$0[eventType.ordinal()] == 1) {
                    com.paypal.oslo.feature.identity.connect.shared.analytics.AnalyticsActionsKt.appeared(com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectWebViewPageLoadEvent.this);
                    return;
                }
                throw new java.lang.IllegalStateException("Event ConnectWebViewPageLoadEvent does not support event type $eventType".toString());
            }

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[com.paypal.oslo.core.telemetry.analytics.event.EventType.values().length];
                    try {
                        iArr[com.paypal.oslo.core.telemetry.analytics.event.EventType.Appeared.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }
        };
    }

    public static final com.paypal.oslo.core.telemetry.analytics.TrackableEvent trackableEvent(final com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectWebViewClosedEvent connectWebViewClosedEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectWebViewClosedEvent, "");
        return new com.paypal.oslo.core.telemetry.analytics.TrackableEvent() { // from class: com.paypal.oslo.feature.identity.connect.shared.analytics.AnalyticsActionsKt$trackableEvent$7
            @Override // com.paypal.oslo.core.telemetry.analytics.TrackableEvent
            public final void track(com.paypal.oslo.core.telemetry.analytics.event.EventType eventType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "");
                int i = com.paypal.oslo.feature.identity.connect.shared.analytics.AnalyticsActionsKt$trackableEvent$7.WhenMappings.$EnumSwitchMapping$0[eventType.ordinal()];
                if (i == 1) {
                    com.paypal.oslo.feature.identity.connect.shared.analytics.AnalyticsActionsKt.appeared(com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectWebViewClosedEvent.this);
                } else {
                    if (i == 2) {
                        com.paypal.oslo.feature.identity.connect.shared.analytics.AnalyticsActionsKt.disappeared(com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectWebViewClosedEvent.this);
                        return;
                    }
                    throw new java.lang.IllegalStateException("Event ConnectWebViewClosedEvent does not support event type $eventType".toString());
                }
            }

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[com.paypal.oslo.core.telemetry.analytics.event.EventType.values().length];
                    try {
                        iArr[com.paypal.oslo.core.telemetry.analytics.event.EventType.Appeared.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    try {
                        iArr[com.paypal.oslo.core.telemetry.analytics.event.EventType.Disappeared.ordinal()] = 2;
                    } catch (java.lang.NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }
        };
    }

    public static final com.paypal.oslo.core.telemetry.analytics.TrackableEvent trackableEvent(final com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectFlowCompletedEvent connectFlowCompletedEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectFlowCompletedEvent, "");
        return new com.paypal.oslo.core.telemetry.analytics.TrackableEvent() { // from class: com.paypal.oslo.feature.identity.connect.shared.analytics.AnalyticsActionsKt$trackableEvent$8
            @Override // com.paypal.oslo.core.telemetry.analytics.TrackableEvent
            public final void track(com.paypal.oslo.core.telemetry.analytics.event.EventType eventType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "");
                if (com.paypal.oslo.feature.identity.connect.shared.analytics.AnalyticsActionsKt$trackableEvent$8.WhenMappings.$EnumSwitchMapping$0[eventType.ordinal()] == 1) {
                    com.paypal.oslo.feature.identity.connect.shared.analytics.AnalyticsActionsKt.appeared(com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectFlowCompletedEvent.this);
                    return;
                }
                throw new java.lang.IllegalStateException("Event ConnectFlowCompletedEvent does not support event type $eventType".toString());
            }

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[com.paypal.oslo.core.telemetry.analytics.event.EventType.values().length];
                    try {
                        iArr[com.paypal.oslo.core.telemetry.analytics.event.EventType.Appeared.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }
        };
    }

    public static final com.paypal.oslo.core.telemetry.analytics.TrackableEvent trackableEvent(final com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectFlowFailedEvent connectFlowFailedEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectFlowFailedEvent, "");
        return new com.paypal.oslo.core.telemetry.analytics.TrackableEvent() { // from class: com.paypal.oslo.feature.identity.connect.shared.analytics.AnalyticsActionsKt$trackableEvent$9
            @Override // com.paypal.oslo.core.telemetry.analytics.TrackableEvent
            public final void track(com.paypal.oslo.core.telemetry.analytics.event.EventType eventType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "");
                if (com.paypal.oslo.feature.identity.connect.shared.analytics.AnalyticsActionsKt$trackableEvent$9.WhenMappings.$EnumSwitchMapping$0[eventType.ordinal()] == 1) {
                    com.paypal.oslo.feature.identity.connect.shared.analytics.AnalyticsActionsKt.appeared(com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectFlowFailedEvent.this);
                    return;
                }
                throw new java.lang.IllegalStateException("Event ConnectFlowFailedEvent does not support event type $eventType".toString());
            }

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[com.paypal.oslo.core.telemetry.analytics.event.EventType.values().length];
                    try {
                        iArr[com.paypal.oslo.core.telemetry.analytics.event.EventType.Appeared.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }
        };
    }
}
