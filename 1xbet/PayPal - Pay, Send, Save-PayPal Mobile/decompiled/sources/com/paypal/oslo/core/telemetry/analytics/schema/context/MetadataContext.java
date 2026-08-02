package com.paypal.oslo.core.telemetry.analytics.schema.context;

@com.paypal.oslo.core.telemetry.analytics.annotations.ContextKey(key = "metadata")
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\fR \u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0019\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\nR \u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001d\u0012\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001e\u0010\fR \u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u001d\u0012\u0004\b!\u0010\u001c\u001a\u0004\b \u0010\f"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/schema/context/MetadataContext;", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "Lcom/paypal/oslo/core/telemetry/analytics/event/EventType;", "eventType", "", "eventName", "eventTime", "<init>", "(Lcom/paypal/oslo/core/telemetry/analytics/event/EventType;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/core/telemetry/analytics/event/EventType;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/paypal/oslo/core/telemetry/analytics/event/EventType;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/MetadataContext;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/core/telemetry/analytics/event/EventType;", "getEventType", "getEventType$annotations", "()V", "Ljava/lang/String;", "getEventName", "getEventName$annotations", "getEventTime", "getEventTime$annotations"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MetadataContext extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext {
    public static final int $stable = 0;
    private final java.lang.String eventName;
    private final java.lang.String eventTime;
    private final com.paypal.oslo.core.telemetry.analytics.event.EventType eventType;

    @com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey(key = com.paypal.oslo.core.mvi.MviStateStore.ATTR_KEY_REDUCER_EVENT_NAME)
    public static /* synthetic */ void getEventName$annotations() {
    }

    @com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey(key = "event_time")
    public static /* synthetic */ void getEventTime$annotations() {
    }

    @com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey(key = com.paypal.oslo.feature.inappcheckout.features.javascript.MutationObserverConstants.EVENT_TYPE_KEY)
    public static /* synthetic */ void getEventType$annotations() {
    }

    public MetadataContext(com.paypal.oslo.core.telemetry.analytics.event.EventType eventType, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.eventType = eventType;
        this.eventName = str;
        this.eventTime = str2;
    }

    public final com.paypal.oslo.core.telemetry.analytics.event.EventType getEventType() {
        return this.eventType;
    }

    public final java.lang.String getEventName() {
        return this.eventName;
    }

    public final java.lang.String getEventTime() {
        return this.eventTime;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.telemetry.analytics.event.EventType eventType = this.eventType;
        java.lang.String str = this.eventName;
        java.lang.String str2 = this.eventTime;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MetadataContext(eventType=");
        sb.append(eventType);
        sb.append(", eventName=");
        sb.append(str);
        sb.append(", eventTime=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.eventType.hashCode() * 31) + this.eventName.hashCode()) * 31) + this.eventTime.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.telemetry.analytics.schema.context.MetadataContext)) {
            return false;
        }
        com.paypal.oslo.core.telemetry.analytics.schema.context.MetadataContext metadataContext = (com.paypal.oslo.core.telemetry.analytics.schema.context.MetadataContext) other;
        return this.eventType == metadataContext.eventType && kotlin.jvm.internal.Intrinsics.areEqual(this.eventName, metadataContext.eventName) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventTime, metadataContext.eventTime);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.MetadataContext copy(com.paypal.oslo.core.telemetry.analytics.event.EventType eventType, java.lang.String eventName, java.lang.String eventTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventTime, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.MetadataContext(eventType, eventName, eventTime);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getEventTime() {
        return this.eventTime;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getEventName() {
        return this.eventName;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.telemetry.analytics.event.EventType getEventType() {
        return this.eventType;
    }

    public static /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.context.MetadataContext copy$default(com.paypal.oslo.core.telemetry.analytics.schema.context.MetadataContext metadataContext, com.paypal.oslo.core.telemetry.analytics.event.EventType eventType, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            eventType = metadataContext.eventType;
        }
        if ((i & 2) != 0) {
            str = metadataContext.eventName;
        }
        if ((i & 4) != 0) {
            str2 = metadataContext.eventTime;
        }
        return metadataContext.copy(eventType, str, str2);
    }
}
