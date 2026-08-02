package com.paypal.oslo.core.telemetry.analytics.schema.context;

@com.paypal.oslo.core.telemetry.analytics.annotations.ContextKey(key = "adjust")
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/schema/context/AdjustContext;", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "Lcom/paypal/oslo/core/telemetry/vendors/adjust/AdjustEventToken;", "eventToken", "<init>", "(Lcom/paypal/oslo/core/telemetry/vendors/adjust/AdjustEventToken;)V", "component1", "()Lcom/paypal/oslo/core/telemetry/vendors/adjust/AdjustEventToken;", "copy", "(Lcom/paypal/oslo/core/telemetry/vendors/adjust/AdjustEventToken;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/AdjustContext;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/telemetry/vendors/adjust/AdjustEventToken;", "getEventToken", "getEventToken$annotations", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdjustContext extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext {
    public static final int $stable = 0;
    private final com.paypal.oslo.core.telemetry.vendors.adjust.AdjustEventToken eventToken;

    @com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey(key = "event_token")
    public static /* synthetic */ void getEventToken$annotations() {
    }

    public AdjustContext(com.paypal.oslo.core.telemetry.vendors.adjust.AdjustEventToken adjustEventToken) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adjustEventToken, "");
        this.eventToken = adjustEventToken;
    }

    public final com.paypal.oslo.core.telemetry.vendors.adjust.AdjustEventToken getEventToken() {
        return this.eventToken;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.telemetry.vendors.adjust.AdjustEventToken adjustEventToken = this.eventToken;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AdjustContext(eventToken=");
        sb.append(adjustEventToken);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.eventToken.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.core.telemetry.analytics.schema.context.AdjustContext) && this.eventToken == ((com.paypal.oslo.core.telemetry.analytics.schema.context.AdjustContext) other).eventToken;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.AdjustContext copy(com.paypal.oslo.core.telemetry.vendors.adjust.AdjustEventToken eventToken) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventToken, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.AdjustContext(eventToken);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.telemetry.vendors.adjust.AdjustEventToken getEventToken() {
        return this.eventToken;
    }

    public static /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.context.AdjustContext copy$default(com.paypal.oslo.core.telemetry.analytics.schema.context.AdjustContext adjustContext, com.paypal.oslo.core.telemetry.vendors.adjust.AdjustEventToken adjustEventToken, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            adjustEventToken = adjustContext.eventToken;
        }
        return adjustContext.copy(adjustEventToken);
    }
}
