package com.paypal.oslo.feature.identity.connect.shared.analytics;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJV\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010\u0017R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u0010\u001bR\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u0010\u001dR\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00108\u001a\u0004\b9\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectFlowFailedEvent;", "", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;", "uiContext", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "userIntent", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/TrafficDestinationContext;", "trafficDestinationContext", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;", "businessFlowContext", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/NavigationContext;", "navigationContext", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "errorContext", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/TrafficSourceContext;", "trafficSourceContext", "<init>", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/TrafficDestinationContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/NavigationContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/TrafficSourceContext;)V", "component1", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;", "component2", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "component3", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/TrafficDestinationContext;", "component4", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;", "component5", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/NavigationContext;", "component6", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "component7", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/TrafficSourceContext;", "copy", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/TrafficDestinationContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/NavigationContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/TrafficSourceContext;)Lcom/paypal/oslo/feature/identity/connect/shared/analytics/ConnectFlowFailedEvent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;", "getUiContext", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getUserIntent", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/TrafficDestinationContext;", "getTrafficDestinationContext", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;", "getBusinessFlowContext", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/NavigationContext;", "getNavigationContext", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "getErrorContext", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/TrafficSourceContext;", "getTrafficSourceContext"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ConnectFlowFailedEvent {
    public static final int $stable = (((((com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext.$stable) | com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext.$stable) | com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext.$stable) | com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficDestinationContext.$stable) | com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable) | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.$stable;
    private final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext;
    private final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext;
    private final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext navigationContext;
    private final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficDestinationContext trafficDestinationContext;
    private final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext trafficSourceContext;
    private final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uiContext;
    private final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntent;

    public ConnectFlowFailedEvent(com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uIContext, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficDestinationContext trafficDestinationContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext navigationContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext trafficSourceContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uIContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntentContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trafficDestinationContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessFlowContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trafficSourceContext, "");
        this.uiContext = uIContext;
        this.userIntent = userIntentContext;
        this.trafficDestinationContext = trafficDestinationContext;
        this.businessFlowContext = businessFlowContext;
        this.navigationContext = navigationContext;
        this.errorContext = errorContext;
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

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext getErrorContext() {
        return this.errorContext;
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
        com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext = this.errorContext;
        com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext trafficSourceContext = this.trafficSourceContext;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ConnectFlowFailedEvent(uiContext=");
        sb.append(uIContext);
        sb.append(", userIntent=");
        sb.append(userIntentContext);
        sb.append(", trafficDestinationContext=");
        sb.append(trafficDestinationContext);
        sb.append(", businessFlowContext=");
        sb.append(businessFlowContext);
        sb.append(", navigationContext=");
        sb.append(navigationContext);
        sb.append(", errorContext=");
        sb.append(errorContext);
        sb.append(", trafficSourceContext=");
        sb.append(trafficSourceContext);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((this.uiContext.hashCode() * 31) + this.userIntent.hashCode()) * 31) + this.trafficDestinationContext.hashCode()) * 31) + this.businessFlowContext.hashCode()) * 31) + this.navigationContext.hashCode()) * 31) + this.errorContext.hashCode()) * 31) + this.trafficSourceContext.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectFlowFailedEvent)) {
            return false;
        }
        com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectFlowFailedEvent connectFlowFailedEvent = (com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectFlowFailedEvent) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.uiContext, connectFlowFailedEvent.uiContext) && kotlin.jvm.internal.Intrinsics.areEqual(this.userIntent, connectFlowFailedEvent.userIntent) && kotlin.jvm.internal.Intrinsics.areEqual(this.trafficDestinationContext, connectFlowFailedEvent.trafficDestinationContext) && kotlin.jvm.internal.Intrinsics.areEqual(this.businessFlowContext, connectFlowFailedEvent.businessFlowContext) && kotlin.jvm.internal.Intrinsics.areEqual(this.navigationContext, connectFlowFailedEvent.navigationContext) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorContext, connectFlowFailedEvent.errorContext) && kotlin.jvm.internal.Intrinsics.areEqual(this.trafficSourceContext, connectFlowFailedEvent.trafficSourceContext);
    }

    public final com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectFlowFailedEvent copy(com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uiContext, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntent, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficDestinationContext trafficDestinationContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext navigationContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext trafficSourceContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trafficDestinationContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessFlowContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trafficSourceContext, "");
        return new com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectFlowFailedEvent(uiContext, userIntent, trafficDestinationContext, businessFlowContext, navigationContext, errorContext, trafficSourceContext);
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext getTrafficSourceContext() {
        return this.trafficSourceContext;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext getErrorContext() {
        return this.errorContext;
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

    public static /* synthetic */ com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectFlowFailedEvent copy$default(com.paypal.oslo.feature.identity.connect.shared.analytics.ConnectFlowFailedEvent connectFlowFailedEvent, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uIContext, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficDestinationContext trafficDestinationContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext navigationContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext trafficSourceContext, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            uIContext = connectFlowFailedEvent.uiContext;
        }
        if ((i & 2) != 0) {
            userIntentContext = connectFlowFailedEvent.userIntent;
        }
        com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext2 = userIntentContext;
        if ((i & 4) != 0) {
            trafficDestinationContext = connectFlowFailedEvent.trafficDestinationContext;
        }
        com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficDestinationContext trafficDestinationContext2 = trafficDestinationContext;
        if ((i & 8) != 0) {
            businessFlowContext = connectFlowFailedEvent.businessFlowContext;
        }
        com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext2 = businessFlowContext;
        if ((i & 16) != 0) {
            navigationContext = connectFlowFailedEvent.navigationContext;
        }
        com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext navigationContext2 = navigationContext;
        if ((i & 32) != 0) {
            errorContext = connectFlowFailedEvent.errorContext;
        }
        com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext2 = errorContext;
        if ((i & 64) != 0) {
            trafficSourceContext = connectFlowFailedEvent.trafficSourceContext;
        }
        return connectFlowFailedEvent.copy(uIContext, userIntentContext2, trafficDestinationContext2, businessFlowContext2, navigationContext2, errorContext2, trafficSourceContext);
    }
}
