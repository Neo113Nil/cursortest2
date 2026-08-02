package com.paypal.oslo.feature.identity.connect.shared.analytics;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJL\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u0010\u0019R\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectFlowCompletedEvent;", "", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;", "uiContext", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "userIntent", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/TrafficDestinationContext;", "trafficDestinationContext", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;", "businessFlowContext", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/NavigationContext;", "navigationContext", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/TrafficSourceContext;", "trafficSourceContext", "<init>", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/TrafficDestinationContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/NavigationContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/TrafficSourceContext;)V", "component1", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;", "component2", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "component3", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/TrafficDestinationContext;", "component4", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;", "component5", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/NavigationContext;", "component6", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/TrafficSourceContext;", "copy", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/TrafficDestinationContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/NavigationContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/TrafficSourceContext;)Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectFlowCompletedEvent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;", "getUiContext", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getUserIntent", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/TrafficDestinationContext;", "getTrafficDestinationContext", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;", "getBusinessFlowContext", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/NavigationContext;", "getNavigationContext", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/TrafficSourceContext;", "getTrafficSourceContext"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ConnectFlowCompletedEvent {
    public static final int $stable = ((((com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext.$stable) | com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext.$stable) | com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficDestinationContext.$stable) | com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable) | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.$stable;
    private final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext;
    private final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext navigationContext;
    private final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficDestinationContext trafficDestinationContext;
    private final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext trafficSourceContext;
    private final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uiContext;
    private final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntent;

    public ConnectFlowCompletedEvent(com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uIContext, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficDestinationContext trafficDestinationContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext navigationContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext trafficSourceContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uIContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntentContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trafficDestinationContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessFlowContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trafficSourceContext, "");
        this.uiContext = uIContext;
        this.userIntent = userIntentContext;
        this.trafficDestinationContext = trafficDestinationContext;
        this.businessFlowContext = businessFlowContext;
        this.navigationContext = navigationContext;
        this.trafficSourceContext = trafficSourceContext;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext getUiContext() {
        return this.uiContext;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntent() {
        return this.userIntent;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficDestinationContext getTrafficDestinationContext() {
        return this.trafficDestinationContext;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext getBusinessFlowContext() {
        return this.businessFlowContext;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext getNavigationContext() {
        return this.navigationContext;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext getTrafficSourceContext() {
        return this.trafficSourceContext;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uIContext = this.uiContext;
        com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext = this.userIntent;
        com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficDestinationContext trafficDestinationContext = this.trafficDestinationContext;
        com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext = this.businessFlowContext;
        com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext navigationContext = this.navigationContext;
        com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext trafficSourceContext = this.trafficSourceContext;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ConnectFlowCompletedEvent(uiContext=");
        sb.append(uIContext);
        sb.append(", userIntent=");
        sb.append(userIntentContext);
        sb.append(", trafficDestinationContext=");
        sb.append(trafficDestinationContext);
        sb.append(", businessFlowContext=");
        sb.append(businessFlowContext);
        sb.append(", navigationContext=");
        sb.append(navigationContext);
        sb.append(", trafficSourceContext=");
        sb.append(trafficSourceContext);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((this.uiContext.hashCode() * 31) + this.userIntent.hashCode()) * 31) + this.trafficDestinationContext.hashCode()) * 31) + this.businessFlowContext.hashCode()) * 31) + this.navigationContext.hashCode()) * 31) + this.trafficSourceContext.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectFlowCompletedEvent)) {
            return false;
        }
        com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectFlowCompletedEvent connectFlowCompletedEvent = (com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectFlowCompletedEvent) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.uiContext, connectFlowCompletedEvent.uiContext) && kotlin.jvm.internal.Intrinsics.areEqual(this.userIntent, connectFlowCompletedEvent.userIntent) && kotlin.jvm.internal.Intrinsics.areEqual(this.trafficDestinationContext, connectFlowCompletedEvent.trafficDestinationContext) && kotlin.jvm.internal.Intrinsics.areEqual(this.businessFlowContext, connectFlowCompletedEvent.businessFlowContext) && kotlin.jvm.internal.Intrinsics.areEqual(this.navigationContext, connectFlowCompletedEvent.navigationContext) && kotlin.jvm.internal.Intrinsics.areEqual(this.trafficSourceContext, connectFlowCompletedEvent.trafficSourceContext);
    }

    public final com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectFlowCompletedEvent copy(com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uiContext, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntent, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficDestinationContext trafficDestinationContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext navigationContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext trafficSourceContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trafficDestinationContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessFlowContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trafficSourceContext, "");
        return new com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectFlowCompletedEvent(uiContext, userIntent, trafficDestinationContext, businessFlowContext, navigationContext, trafficSourceContext);
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext getTrafficSourceContext() {
        return this.trafficSourceContext;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext getNavigationContext() {
        return this.navigationContext;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext getBusinessFlowContext() {
        return this.businessFlowContext;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficDestinationContext getTrafficDestinationContext() {
        return this.trafficDestinationContext;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntent() {
        return this.userIntent;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext getUiContext() {
        return this.uiContext;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectFlowCompletedEvent copy$default(com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectFlowCompletedEvent connectFlowCompletedEvent, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uIContext, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficDestinationContext trafficDestinationContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext navigationContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext trafficSourceContext, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            uIContext = connectFlowCompletedEvent.uiContext;
        }
        if ((i & 2) != 0) {
            userIntentContext = connectFlowCompletedEvent.userIntent;
        }
        com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext2 = userIntentContext;
        if ((i & 4) != 0) {
            trafficDestinationContext = connectFlowCompletedEvent.trafficDestinationContext;
        }
        com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficDestinationContext trafficDestinationContext2 = trafficDestinationContext;
        if ((i & 8) != 0) {
            businessFlowContext = connectFlowCompletedEvent.businessFlowContext;
        }
        com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext2 = businessFlowContext;
        if ((i & 16) != 0) {
            navigationContext = connectFlowCompletedEvent.navigationContext;
        }
        com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext navigationContext2 = navigationContext;
        if ((i & 32) != 0) {
            trafficSourceContext = connectFlowCompletedEvent.trafficSourceContext;
        }
        return connectFlowCompletedEvent.copy(uIContext, userIntentContext2, trafficDestinationContext2, businessFlowContext2, navigationContext2, trafficSourceContext);
    }
}
