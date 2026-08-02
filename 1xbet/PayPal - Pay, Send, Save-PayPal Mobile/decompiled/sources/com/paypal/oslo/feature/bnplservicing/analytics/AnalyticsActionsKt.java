package com.paypal.oslo.feature.bnplservicing.analytics;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0005H\u0000¢\u0006\u0004\b\u0003\u0010\u0006\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0007H\u0000¢\u0006\u0004\b\u0003\u0010\b\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\f\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\r\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0005H\u0000¢\u0006\u0004\b\u000f\u0010\u0011\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0007H\u0000¢\u0006\u0004\b\u000f\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/analytics/GraphQLOperationFailedEvent;", "", "", "toContexts", "(Lcom/paypal/oslo/feature/bnplservicing/analytics/GraphQLOperationFailedEvent;)Ljava/util/List;", "Lcom/paypal/oslo/feature/bnplservicing/analytics/GraphQLOperationSuccessEvent;", "(Lcom/paypal/oslo/feature/bnplservicing/analytics/GraphQLOperationSuccessEvent;)Ljava/util/List;", "Lcom/paypal/oslo/feature/bnplservicing/analytics/GraphQLOperationNullDataEvent;", "(Lcom/paypal/oslo/feature/bnplservicing/analytics/GraphQLOperationNullDataEvent;)Ljava/util/List;", "", com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY, "(Lcom/paypal/oslo/feature/bnplservicing/analytics/GraphQLOperationFailedEvent;)V", "(Lcom/paypal/oslo/feature/bnplservicing/analytics/GraphQLOperationSuccessEvent;)V", "(Lcom/paypal/oslo/feature/bnplservicing/analytics/GraphQLOperationNullDataEvent;)V", "Lcom/paypal/oslo/core/telemetry/analytics/TrackableEvent;", "trackableEvent", "(Lcom/paypal/oslo/feature/bnplservicing/analytics/GraphQLOperationFailedEvent;)Lcom/paypal/oslo/core/telemetry/analytics/TrackableEvent;", "(Lcom/paypal/oslo/feature/bnplservicing/analytics/GraphQLOperationSuccessEvent;)Lcom/paypal/oslo/core/telemetry/analytics/TrackableEvent;", "(Lcom/paypal/oslo/feature/bnplservicing/analytics/GraphQLOperationNullDataEvent;)Lcom/paypal/oslo/core/telemetry/analytics/TrackableEvent;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AnalyticsActionsKt {
    public static final java.util.List<java.lang.Object> toContexts(com.paypal.oslo.feature.bnplservicing.analytics.GraphQLOperationFailedEvent graphQLOperationFailedEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLOperationFailedEvent, "");
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{graphQLOperationFailedEvent.getUiContext(), graphQLOperationFailedEvent.getUserIntentContext(), graphQLOperationFailedEvent.getErrorContext()});
    }

    public static final java.util.List<java.lang.Object> toContexts(com.paypal.oslo.feature.bnplservicing.analytics.GraphQLOperationSuccessEvent graphQLOperationSuccessEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLOperationSuccessEvent, "");
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{graphQLOperationSuccessEvent.getUiContext(), graphQLOperationSuccessEvent.getUserIntentContext()});
    }

    public static final java.util.List<java.lang.Object> toContexts(com.paypal.oslo.feature.bnplservicing.analytics.GraphQLOperationNullDataEvent graphQLOperationNullDataEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLOperationNullDataEvent, "");
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{graphQLOperationNullDataEvent.getUiContext(), graphQLOperationNullDataEvent.getUserIntentContext(), graphQLOperationNullDataEvent.getErrorContext()});
    }

    public static final void available(com.paypal.oslo.feature.bnplservicing.analytics.GraphQLOperationFailedEvent graphQLOperationFailedEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLOperationFailedEvent, "");
        com.paypal.oslo.feature.bnplservicing.AnalyticsTrackerKt.analyticsTracker.track(new com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent(com.paypal.oslo.core.telemetry.analytics.event.EventType.valueOf("Available"), toContexts(graphQLOperationFailedEvent)));
    }

    public static final void available(com.paypal.oslo.feature.bnplservicing.analytics.GraphQLOperationSuccessEvent graphQLOperationSuccessEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLOperationSuccessEvent, "");
        com.paypal.oslo.feature.bnplservicing.AnalyticsTrackerKt.analyticsTracker.track(new com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent(com.paypal.oslo.core.telemetry.analytics.event.EventType.valueOf("Available"), toContexts(graphQLOperationSuccessEvent)));
    }

    public static final void available(com.paypal.oslo.feature.bnplservicing.analytics.GraphQLOperationNullDataEvent graphQLOperationNullDataEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLOperationNullDataEvent, "");
        com.paypal.oslo.feature.bnplservicing.AnalyticsTrackerKt.analyticsTracker.track(new com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent(com.paypal.oslo.core.telemetry.analytics.event.EventType.valueOf("Available"), toContexts(graphQLOperationNullDataEvent)));
    }

    public static final com.paypal.oslo.core.telemetry.analytics.TrackableEvent trackableEvent(final com.paypal.oslo.feature.bnplservicing.analytics.GraphQLOperationFailedEvent graphQLOperationFailedEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLOperationFailedEvent, "");
        return new com.paypal.oslo.core.telemetry.analytics.TrackableEvent() { // from class: com.paypal.oslo.feature.bnplservicing.analytics.AnalyticsActionsKt$trackableEvent$1
            @Override // com.paypal.oslo.core.telemetry.analytics.TrackableEvent
            public final void track(com.paypal.oslo.core.telemetry.analytics.event.EventType eventType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "");
                if (com.paypal.oslo.feature.bnplservicing.analytics.AnalyticsActionsKt$trackableEvent$1.WhenMappings.$EnumSwitchMapping$0[eventType.ordinal()] == 1) {
                    com.paypal.oslo.feature.bnplservicing.analytics.AnalyticsActionsKt.available(com.paypal.oslo.feature.bnplservicing.analytics.GraphQLOperationFailedEvent.this);
                    return;
                }
                throw new java.lang.IllegalStateException("Event GraphQLOperationFailedEvent does not support event type $eventType".toString());
            }

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[com.paypal.oslo.core.telemetry.analytics.event.EventType.values().length];
                    try {
                        iArr[com.paypal.oslo.core.telemetry.analytics.event.EventType.Available.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }
        };
    }

    public static final com.paypal.oslo.core.telemetry.analytics.TrackableEvent trackableEvent(final com.paypal.oslo.feature.bnplservicing.analytics.GraphQLOperationSuccessEvent graphQLOperationSuccessEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLOperationSuccessEvent, "");
        return new com.paypal.oslo.core.telemetry.analytics.TrackableEvent() { // from class: com.paypal.oslo.feature.bnplservicing.analytics.AnalyticsActionsKt$trackableEvent$2
            @Override // com.paypal.oslo.core.telemetry.analytics.TrackableEvent
            public final void track(com.paypal.oslo.core.telemetry.analytics.event.EventType eventType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "");
                if (com.paypal.oslo.feature.bnplservicing.analytics.AnalyticsActionsKt$trackableEvent$2.WhenMappings.$EnumSwitchMapping$0[eventType.ordinal()] == 1) {
                    com.paypal.oslo.feature.bnplservicing.analytics.AnalyticsActionsKt.available(com.paypal.oslo.feature.bnplservicing.analytics.GraphQLOperationSuccessEvent.this);
                    return;
                }
                throw new java.lang.IllegalStateException("Event GraphQLOperationSuccessEvent does not support event type $eventType".toString());
            }

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[com.paypal.oslo.core.telemetry.analytics.event.EventType.values().length];
                    try {
                        iArr[com.paypal.oslo.core.telemetry.analytics.event.EventType.Available.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }
        };
    }

    public static final com.paypal.oslo.core.telemetry.analytics.TrackableEvent trackableEvent(final com.paypal.oslo.feature.bnplservicing.analytics.GraphQLOperationNullDataEvent graphQLOperationNullDataEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLOperationNullDataEvent, "");
        return new com.paypal.oslo.core.telemetry.analytics.TrackableEvent() { // from class: com.paypal.oslo.feature.bnplservicing.analytics.AnalyticsActionsKt$trackableEvent$3
            @Override // com.paypal.oslo.core.telemetry.analytics.TrackableEvent
            public final void track(com.paypal.oslo.core.telemetry.analytics.event.EventType eventType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "");
                if (com.paypal.oslo.feature.bnplservicing.analytics.AnalyticsActionsKt$trackableEvent$3.WhenMappings.$EnumSwitchMapping$0[eventType.ordinal()] == 1) {
                    com.paypal.oslo.feature.bnplservicing.analytics.AnalyticsActionsKt.available(com.paypal.oslo.feature.bnplservicing.analytics.GraphQLOperationNullDataEvent.this);
                    return;
                }
                throw new java.lang.IllegalStateException("Event GraphQLOperationNullDataEvent does not support event type $eventType".toString());
            }

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[com.paypal.oslo.core.telemetry.analytics.event.EventType.values().length];
                    try {
                        iArr[com.paypal.oslo.core.telemetry.analytics.event.EventType.Available.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }
        };
    }
}
