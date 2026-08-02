package com.paypal.oslo.core.telemetry.analytics.schema.context.standard;

@com.paypal.oslo.core.telemetry.analytics.annotations.ContextKey(key = "traffic_destination")
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\bR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0015\u0012\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u0019\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/TrafficDestinationContext;", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "", "type", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/TrafficDestinationContext;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getType", "getType$annotations", "()V", "getId", "getId$annotations"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TrafficDestinationContext extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext {
    public static final int $stable = 0;
    private final java.lang.String id;
    private final java.lang.String type;

    @com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey(key = "id")
    public static /* synthetic */ void getId$annotations() {
    }

    @com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey(key = "type")
    public static /* synthetic */ void getType$annotations() {
    }

    public TrafficDestinationContext(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
        this.id = str2;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.type;
        java.lang.String str2 = this.id;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TrafficDestinationContext(type=");
        sb.append(str);
        sb.append(", id=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode();
        java.lang.String str = this.id;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficDestinationContext)) {
            return false;
        }
        com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficDestinationContext trafficDestinationContext = (com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficDestinationContext) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.type, trafficDestinationContext.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, trafficDestinationContext.id);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficDestinationContext copy(java.lang.String type, java.lang.String id) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficDestinationContext(type, id);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    public static /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficDestinationContext copy$default(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficDestinationContext trafficDestinationContext, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = trafficDestinationContext.type;
        }
        if ((i & 2) != 0) {
            str2 = trafficDestinationContext.id;
        }
        return trafficDestinationContext.copy(str, str2);
    }
}
