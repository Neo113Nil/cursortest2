package com.paypal.oslo.core.telemetry.analytics.schema.context.standard;

@com.paypal.oslo.core.telemetry.analytics.annotations.ContextKey(key = com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW)
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\bR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0015\u0012\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u0019\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "", "name", "attemptId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "getName$annotations", "()V", "getAttemptId", "getAttemptId$annotations"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BusinessFlowContext extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext {
    public static final int $stable = 0;
    private final java.lang.String attemptId;
    private final java.lang.String name;

    @com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey(key = "attempt_id")
    public static /* synthetic */ void getAttemptId$annotations() {
    }

    @com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey(key = "name")
    public static /* synthetic */ void getName$annotations() {
    }

    public BusinessFlowContext(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
        this.attemptId = str2;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getAttemptId() {
        return this.attemptId;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        java.lang.String str2 = this.attemptId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BusinessFlowContext(name=");
        sb.append(str);
        sb.append(", attemptId=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode();
        java.lang.String str = this.attemptId;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext)) {
            return false;
        }
        com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext = (com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, businessFlowContext.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.attemptId, businessFlowContext.attemptId);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext copy(java.lang.String name2, java.lang.String attemptId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext(name2, attemptId);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAttemptId() {
        return this.attemptId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public static /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext copy$default(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = businessFlowContext.name;
        }
        if ((i & 2) != 0) {
            str2 = businessFlowContext.attemptId;
        }
        return businessFlowContext.copy(str, str2);
    }
}
