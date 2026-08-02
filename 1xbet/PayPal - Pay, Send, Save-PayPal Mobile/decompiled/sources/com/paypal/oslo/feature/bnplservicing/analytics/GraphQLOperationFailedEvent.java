package com.paypal.oslo.feature.bnplservicing.analytics;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/analytics/GraphQLOperationFailedEvent;", "", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;", "uiContext", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "userIntentContext", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "errorContext", "<init>", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;)V", "component1", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;", "component2", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "component3", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "copy", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;)Lcom/paypal/oslo/feature/bnplservicing/analytics/GraphQLOperationFailedEvent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;", "getUiContext", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getUserIntentContext", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "getErrorContext"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class GraphQLOperationFailedEvent {
    public static final int $stable = (com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable) | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.$stable;
    private final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext;
    private final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uiContext;
    private final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext;

    public GraphQLOperationFailedEvent(com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uIContext, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uIContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntentContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorContext, "");
        this.uiContext = uIContext;
        this.userIntentContext = userIntentContext;
        this.errorContext = errorContext;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext getUiContext() {
        return this.uiContext;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntentContext() {
        return this.userIntentContext;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext getErrorContext() {
        return this.errorContext;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uIContext = this.uiContext;
        com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext = this.userIntentContext;
        com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext = this.errorContext;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GraphQLOperationFailedEvent(uiContext=");
        sb.append(uIContext);
        sb.append(", userIntentContext=");
        sb.append(userIntentContext);
        sb.append(", errorContext=");
        sb.append(errorContext);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.uiContext.hashCode() * 31) + this.userIntentContext.hashCode()) * 31) + this.errorContext.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.analytics.GraphQLOperationFailedEvent)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.analytics.GraphQLOperationFailedEvent graphQLOperationFailedEvent = (com.paypal.oslo.feature.bnplservicing.analytics.GraphQLOperationFailedEvent) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.uiContext, graphQLOperationFailedEvent.uiContext) && kotlin.jvm.internal.Intrinsics.areEqual(this.userIntentContext, graphQLOperationFailedEvent.userIntentContext) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorContext, graphQLOperationFailedEvent.errorContext);
    }

    public final com.paypal.oslo.feature.bnplservicing.analytics.GraphQLOperationFailedEvent copy(com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uiContext, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntentContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorContext, "");
        return new com.paypal.oslo.feature.bnplservicing.analytics.GraphQLOperationFailedEvent(uiContext, userIntentContext, errorContext);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext getErrorContext() {
        return this.errorContext;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntentContext() {
        return this.userIntentContext;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext getUiContext() {
        return this.uiContext;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.analytics.GraphQLOperationFailedEvent copy$default(com.paypal.oslo.feature.bnplservicing.analytics.GraphQLOperationFailedEvent graphQLOperationFailedEvent, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uIContext, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            uIContext = graphQLOperationFailedEvent.uiContext;
        }
        if ((i & 2) != 0) {
            userIntentContext = graphQLOperationFailedEvent.userIntentContext;
        }
        if ((i & 4) != 0) {
            errorContext = graphQLOperationFailedEvent.errorContext;
        }
        return graphQLOperationFailedEvent.copy(uIContext, userIntentContext, errorContext);
    }
}
