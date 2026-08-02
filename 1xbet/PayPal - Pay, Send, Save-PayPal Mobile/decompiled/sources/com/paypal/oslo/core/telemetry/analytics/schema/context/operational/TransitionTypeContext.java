package com.paypal.oslo.core.telemetry.analytics.schema.context.operational;

@kotlin.Deprecated(message = "This context is added to validate P0 metrics and the new one shot pipeline.It will be removed post validation in live")
@com.paypal.oslo.core.telemetry.analytics.annotations.ContextKey(key = "transition_type")
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R \u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0013\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/schema/context/operational/TransitionTypeContext;", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "", "category", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/operational/TransitionTypeContext;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCategory", "getCategory$annotations", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TransitionTypeContext extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext {
    public static final int $stable = 0;
    private final java.lang.String category;

    @com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey(key = "category")
    public static /* synthetic */ void getCategory$annotations() {
    }

    public TransitionTypeContext(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.category = str;
    }

    public final java.lang.String getCategory() {
        return this.category;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.category;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TransitionTypeContext(category=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.category.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeContext) && kotlin.jvm.internal.Intrinsics.areEqual(this.category, ((com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeContext) other).category);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeContext copy(java.lang.String category) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(category, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeContext(category);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCategory() {
        return this.category;
    }

    public static /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeContext copy$default(com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeContext transitionTypeContext, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = transitionTypeContext.category;
        }
        return transitionTypeContext.copy(str);
    }
}
