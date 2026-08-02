package com.paypal.oslo.core.telemetry.analytics.schema.context.domain;

@com.paypal.oslo.core.telemetry.analytics.annotations.ContextKey(key = "auth")
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R \u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0013\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/schema/context/domain/AuthenticationContext;", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "", "type", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/domain/AuthenticationContext;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getType", "getType$annotations", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AuthenticationContext extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext {
    public static final int $stable = 0;
    private final java.lang.String type;

    @com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey(key = "type")
    public static /* synthetic */ void getType$annotations() {
    }

    public AuthenticationContext(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.type;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthenticationContext(type=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.type.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.core.telemetry.analytics.schema.context.domain.AuthenticationContext) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, ((com.paypal.oslo.core.telemetry.analytics.schema.context.domain.AuthenticationContext) other).type);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.domain.AuthenticationContext copy(java.lang.String type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.domain.AuthenticationContext(type);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    public static /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.context.domain.AuthenticationContext copy$default(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.AuthenticationContext authenticationContext, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = authenticationContext.type;
        }
        return authenticationContext.copy(str);
    }
}
