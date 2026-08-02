package com.paypal.oslo.feature.balance.analytics;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0005H\u0000¢\u0006\u0004\b\u0003\u0010\u0006\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0007H\u0000¢\u0006\u0004\b\u0003\u0010\b\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\tH\u0000¢\u0006\u0004\b\u0003\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0000H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0005H\u0000¢\u0006\u0004\b\f\u0010\u000e\u001a\u0013\u0010\u000f\u001a\u00020\u000b*\u00020\u0007H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0007H\u0000¢\u0006\u0004\b\f\u0010\u0010\u001a\u0013\u0010\u000f\u001a\u00020\u000b*\u00020\tH\u0000¢\u0006\u0004\b\u000f\u0010\u0011\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\u0011\u001a\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0005H\u0000¢\u0006\u0004\b\u0013\u0010\u0015\u001a\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0007H\u0000¢\u0006\u0004\b\u0013\u0010\u0016\u001a\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\tH\u0000¢\u0006\u0004\b\u0013\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/balance/analytics/ExternalFeatureClickedEvent;", "", "", "toContexts", "(Lcom/paypal/oslo/feature/balance/analytics/ExternalFeatureClickedEvent;)Ljava/util/List;", "Lcom/paypal/oslo/feature/balance/analytics/BalanceCardClickedEvent;", "(Lcom/paypal/oslo/feature/balance/analytics/BalanceCardClickedEvent;)Ljava/util/List;", "Lcom/paypal/oslo/feature/balance/analytics/BalanceCardEvent;", "(Lcom/paypal/oslo/feature/balance/analytics/BalanceCardEvent;)Ljava/util/List;", "Lcom/paypal/oslo/feature/balance/analytics/BalanceDashboardEvent;", "(Lcom/paypal/oslo/feature/balance/analytics/BalanceDashboardEvent;)Ljava/util/List;", "", "clicked", "(Lcom/paypal/oslo/feature/balance/analytics/ExternalFeatureClickedEvent;)V", "(Lcom/paypal/oslo/feature/balance/analytics/BalanceCardClickedEvent;)V", "appeared", "(Lcom/paypal/oslo/feature/balance/analytics/BalanceCardEvent;)V", "(Lcom/paypal/oslo/feature/balance/analytics/BalanceDashboardEvent;)V", "Lcom/paypal/oslo/core/telemetry/analytics/TrackableEvent;", "trackableEvent", "(Lcom/paypal/oslo/feature/balance/analytics/ExternalFeatureClickedEvent;)Lcom/paypal/oslo/core/telemetry/analytics/TrackableEvent;", "(Lcom/paypal/oslo/feature/balance/analytics/BalanceCardClickedEvent;)Lcom/paypal/oslo/core/telemetry/analytics/TrackableEvent;", "(Lcom/paypal/oslo/feature/balance/analytics/BalanceCardEvent;)Lcom/paypal/oslo/core/telemetry/analytics/TrackableEvent;", "(Lcom/paypal/oslo/feature/balance/analytics/BalanceDashboardEvent;)Lcom/paypal/oslo/core/telemetry/analytics/TrackableEvent;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AnalyticsActionsKt {
    public static final java.util.List<java.lang.Object> toContexts(com.paypal.oslo.feature.balance.analytics.ExternalFeatureClickedEvent externalFeatureClickedEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalFeatureClickedEvent, "");
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{externalFeatureClickedEvent.getUiContext(), externalFeatureClickedEvent.getUserIntent()});
    }

    public static final java.util.List<java.lang.Object> toContexts(com.paypal.oslo.feature.balance.analytics.BalanceCardClickedEvent balanceCardClickedEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceCardClickedEvent, "");
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{balanceCardClickedEvent.getUiContext(), balanceCardClickedEvent.getUserIntent()});
    }

    public static final java.util.List<java.lang.Object> toContexts(com.paypal.oslo.feature.balance.analytics.BalanceCardEvent balanceCardEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceCardEvent, "");
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{balanceCardEvent.getUiContext(), balanceCardEvent.getUserIntent()});
    }

    public static final java.util.List<java.lang.Object> toContexts(com.paypal.oslo.feature.balance.analytics.BalanceDashboardEvent balanceDashboardEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceDashboardEvent, "");
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{balanceDashboardEvent.getUiContext(), balanceDashboardEvent.getUserIntent()});
    }

    public static final void clicked(com.paypal.oslo.feature.balance.analytics.ExternalFeatureClickedEvent externalFeatureClickedEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalFeatureClickedEvent, "");
        com.paypal.oslo.feature.balance.AnalyticsTrackerKt.analyticsTracker.track(new com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent(com.paypal.oslo.core.telemetry.analytics.event.EventType.valueOf("Clicked"), toContexts(externalFeatureClickedEvent)));
    }

    public static final void clicked(com.paypal.oslo.feature.balance.analytics.BalanceCardClickedEvent balanceCardClickedEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceCardClickedEvent, "");
        com.paypal.oslo.feature.balance.AnalyticsTrackerKt.analyticsTracker.track(new com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent(com.paypal.oslo.core.telemetry.analytics.event.EventType.valueOf("Clicked"), toContexts(balanceCardClickedEvent)));
    }

    public static final void appeared(com.paypal.oslo.feature.balance.analytics.BalanceCardEvent balanceCardEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceCardEvent, "");
        com.paypal.oslo.feature.balance.AnalyticsTrackerKt.analyticsTracker.track(new com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent(com.paypal.oslo.core.telemetry.analytics.event.EventType.valueOf("Appeared"), toContexts(balanceCardEvent)));
    }

    public static final void clicked(com.paypal.oslo.feature.balance.analytics.BalanceCardEvent balanceCardEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceCardEvent, "");
        com.paypal.oslo.feature.balance.AnalyticsTrackerKt.analyticsTracker.track(new com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent(com.paypal.oslo.core.telemetry.analytics.event.EventType.valueOf("Clicked"), toContexts(balanceCardEvent)));
    }

    public static final void appeared(com.paypal.oslo.feature.balance.analytics.BalanceDashboardEvent balanceDashboardEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceDashboardEvent, "");
        com.paypal.oslo.feature.balance.AnalyticsTrackerKt.analyticsTracker.track(new com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent(com.paypal.oslo.core.telemetry.analytics.event.EventType.valueOf("Appeared"), toContexts(balanceDashboardEvent)));
    }

    public static final void clicked(com.paypal.oslo.feature.balance.analytics.BalanceDashboardEvent balanceDashboardEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceDashboardEvent, "");
        com.paypal.oslo.feature.balance.AnalyticsTrackerKt.analyticsTracker.track(new com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent(com.paypal.oslo.core.telemetry.analytics.event.EventType.valueOf("Clicked"), toContexts(balanceDashboardEvent)));
    }

    public static final com.paypal.oslo.core.telemetry.analytics.TrackableEvent trackableEvent(final com.paypal.oslo.feature.balance.analytics.ExternalFeatureClickedEvent externalFeatureClickedEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalFeatureClickedEvent, "");
        return new com.paypal.oslo.core.telemetry.analytics.TrackableEvent() { // from class: com.paypal.oslo.feature.balance.analytics.AnalyticsActionsKt$trackableEvent$1
            @Override // com.paypal.oslo.core.telemetry.analytics.TrackableEvent
            public final void track(com.paypal.oslo.core.telemetry.analytics.event.EventType eventType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "");
                if (com.paypal.oslo.feature.balance.analytics.AnalyticsActionsKt$trackableEvent$1.WhenMappings.$EnumSwitchMapping$0[eventType.ordinal()] == 1) {
                    com.paypal.oslo.feature.balance.analytics.AnalyticsActionsKt.clicked(com.paypal.oslo.feature.balance.analytics.ExternalFeatureClickedEvent.this);
                    return;
                }
                throw new java.lang.IllegalStateException("Event ExternalFeatureClickedEvent does not support event type $eventType".toString());
            }

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[com.paypal.oslo.core.telemetry.analytics.event.EventType.values().length];
                    try {
                        iArr[com.paypal.oslo.core.telemetry.analytics.event.EventType.Clicked.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }
        };
    }

    public static final com.paypal.oslo.core.telemetry.analytics.TrackableEvent trackableEvent(final com.paypal.oslo.feature.balance.analytics.BalanceCardClickedEvent balanceCardClickedEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceCardClickedEvent, "");
        return new com.paypal.oslo.core.telemetry.analytics.TrackableEvent() { // from class: com.paypal.oslo.feature.balance.analytics.AnalyticsActionsKt$trackableEvent$2
            @Override // com.paypal.oslo.core.telemetry.analytics.TrackableEvent
            public final void track(com.paypal.oslo.core.telemetry.analytics.event.EventType eventType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "");
                if (com.paypal.oslo.feature.balance.analytics.AnalyticsActionsKt$trackableEvent$2.WhenMappings.$EnumSwitchMapping$0[eventType.ordinal()] == 1) {
                    com.paypal.oslo.feature.balance.analytics.AnalyticsActionsKt.clicked(com.paypal.oslo.feature.balance.analytics.BalanceCardClickedEvent.this);
                    return;
                }
                throw new java.lang.IllegalStateException("Event BalanceCardClickedEvent does not support event type $eventType".toString());
            }

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[com.paypal.oslo.core.telemetry.analytics.event.EventType.values().length];
                    try {
                        iArr[com.paypal.oslo.core.telemetry.analytics.event.EventType.Clicked.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }
        };
    }

    public static final com.paypal.oslo.core.telemetry.analytics.TrackableEvent trackableEvent(final com.paypal.oslo.feature.balance.analytics.BalanceCardEvent balanceCardEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceCardEvent, "");
        return new com.paypal.oslo.core.telemetry.analytics.TrackableEvent() { // from class: com.paypal.oslo.feature.balance.analytics.AnalyticsActionsKt$trackableEvent$3
            @Override // com.paypal.oslo.core.telemetry.analytics.TrackableEvent
            public final void track(com.paypal.oslo.core.telemetry.analytics.event.EventType eventType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "");
                int i = com.paypal.oslo.feature.balance.analytics.AnalyticsActionsKt$trackableEvent$3.WhenMappings.$EnumSwitchMapping$0[eventType.ordinal()];
                if (i == 1) {
                    com.paypal.oslo.feature.balance.analytics.AnalyticsActionsKt.appeared(com.paypal.oslo.feature.balance.analytics.BalanceCardEvent.this);
                } else {
                    if (i == 2) {
                        com.paypal.oslo.feature.balance.analytics.AnalyticsActionsKt.clicked(com.paypal.oslo.feature.balance.analytics.BalanceCardEvent.this);
                        return;
                    }
                    throw new java.lang.IllegalStateException("Event BalanceCardEvent does not support event type $eventType".toString());
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
                        iArr[com.paypal.oslo.core.telemetry.analytics.event.EventType.Clicked.ordinal()] = 2;
                    } catch (java.lang.NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }
        };
    }

    public static final com.paypal.oslo.core.telemetry.analytics.TrackableEvent trackableEvent(final com.paypal.oslo.feature.balance.analytics.BalanceDashboardEvent balanceDashboardEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceDashboardEvent, "");
        return new com.paypal.oslo.core.telemetry.analytics.TrackableEvent() { // from class: com.paypal.oslo.feature.balance.analytics.AnalyticsActionsKt$trackableEvent$4
            @Override // com.paypal.oslo.core.telemetry.analytics.TrackableEvent
            public final void track(com.paypal.oslo.core.telemetry.analytics.event.EventType eventType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "");
                int i = com.paypal.oslo.feature.balance.analytics.AnalyticsActionsKt$trackableEvent$4.WhenMappings.$EnumSwitchMapping$0[eventType.ordinal()];
                if (i == 1) {
                    com.paypal.oslo.feature.balance.analytics.AnalyticsActionsKt.appeared(com.paypal.oslo.feature.balance.analytics.BalanceDashboardEvent.this);
                } else {
                    if (i == 2) {
                        com.paypal.oslo.feature.balance.analytics.AnalyticsActionsKt.clicked(com.paypal.oslo.feature.balance.analytics.BalanceDashboardEvent.this);
                        return;
                    }
                    throw new java.lang.IllegalStateException("Event BalanceDashboardEvent does not support event type $eventType".toString());
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
                        iArr[com.paypal.oslo.core.telemetry.analytics.event.EventType.Clicked.ordinal()] = 2;
                    } catch (java.lang.NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }
        };
    }
}
