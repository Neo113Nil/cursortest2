package com.paypal.oslo.core.telemetry.analytics.annotations;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\u000e\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/annotations/AnalyticsTrackable;", "", "", "Lcom/paypal/oslo/core/telemetry/analytics/event/EventType;", "eventTypes", "()[Lcom/paypal/oslo/core/telemetry/analytics/event/EventType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.Deprecated(message = " Moving to Event Registry with fixed set of events model")
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.CLASS})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
/* loaded from: classes2.dex */
public @interface AnalyticsTrackable {
    com.paypal.oslo.core.telemetry.analytics.event.EventType[] eventTypes();
}
