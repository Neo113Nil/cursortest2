package com.paypal.oslo.feature.checkcapture.analytics;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/analytics/CheckCaptureEvent;", "", "", "toContexts", "(Lcom/paypal/oslo/feature/checkcapture/analytics/CheckCaptureEvent;)Ljava/util/List;", "", "appeared", "(Lcom/paypal/oslo/feature/checkcapture/analytics/CheckCaptureEvent;)V", "clicked", "Lcom/paypal/oslo/core/telemetry/analytics/TrackableEvent;", "trackableEvent", "(Lcom/paypal/oslo/feature/checkcapture/analytics/CheckCaptureEvent;)Lcom/paypal/oslo/core/telemetry/analytics/TrackableEvent;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AnalyticsActionsKt {
    public static final java.util.List<java.lang.Object> toContexts(com.paypal.oslo.feature.checkcapture.analytics.CheckCaptureEvent checkCaptureEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkCaptureEvent, "");
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{checkCaptureEvent.getUiContext(), checkCaptureEvent.getUserIntent(), checkCaptureEvent.getFlow()});
    }

    public static final void appeared(com.paypal.oslo.feature.checkcapture.analytics.CheckCaptureEvent checkCaptureEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkCaptureEvent, "");
        com.paypal.oslo.feature.checkcapture.AnalyticsTrackerKt.analyticsTracker.track(new com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent(com.paypal.oslo.core.telemetry.analytics.event.EventType.valueOf("Appeared"), toContexts(checkCaptureEvent)));
    }

    public static final void clicked(com.paypal.oslo.feature.checkcapture.analytics.CheckCaptureEvent checkCaptureEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkCaptureEvent, "");
        com.paypal.oslo.feature.checkcapture.AnalyticsTrackerKt.analyticsTracker.track(new com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent(com.paypal.oslo.core.telemetry.analytics.event.EventType.valueOf("Clicked"), toContexts(checkCaptureEvent)));
    }

    public static final com.paypal.oslo.core.telemetry.analytics.TrackableEvent trackableEvent(final com.paypal.oslo.feature.checkcapture.analytics.CheckCaptureEvent checkCaptureEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkCaptureEvent, "");
        return new com.paypal.oslo.core.telemetry.analytics.TrackableEvent() { // from class: com.paypal.oslo.feature.checkcapture.analytics.AnalyticsActionsKt$trackableEvent$1
            @Override // com.paypal.oslo.core.telemetry.analytics.TrackableEvent
            public final void track(com.paypal.oslo.core.telemetry.analytics.event.EventType eventType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "");
                int i = com.paypal.oslo.feature.checkcapture.analytics.AnalyticsActionsKt$trackableEvent$1.WhenMappings.$EnumSwitchMapping$0[eventType.ordinal()];
                if (i == 1) {
                    com.paypal.oslo.feature.checkcapture.analytics.AnalyticsActionsKt.appeared(com.paypal.oslo.feature.checkcapture.analytics.CheckCaptureEvent.this);
                } else {
                    if (i == 2) {
                        com.paypal.oslo.feature.checkcapture.analytics.AnalyticsActionsKt.clicked(com.paypal.oslo.feature.checkcapture.analytics.CheckCaptureEvent.this);
                        return;
                    }
                    throw new java.lang.IllegalStateException("Event CheckCaptureEvent does not support event type $eventType".toString());
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
