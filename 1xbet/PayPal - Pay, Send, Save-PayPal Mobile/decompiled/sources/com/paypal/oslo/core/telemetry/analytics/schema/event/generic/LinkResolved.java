package com.paypal.oslo.core.telemetry.analytics.schema.event.generic;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \u001e2\u00020\u0001:\u0004\u001f !\u001eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0017X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138%X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178%X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178%X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a\u0082\u0001\u0003\"#$"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/LinkResolved;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/GenericAnalyticsEvent;", "<init>", "()V", "Lcom/paypal/oslo/core/telemetry/analytics/AnalyticsTracker;", "analyticsTracker", "", "track", "(Lcom/paypal/oslo/core/telemetry/analytics/AnalyticsTracker;)V", "", "eventName", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/telemetry/analytics/event/EventType;", "eventType", "Lcom/paypal/oslo/core/telemetry/analytics/event/EventType;", "getEventType", "()Lcom/paypal/oslo/core/telemetry/analytics/event/EventType;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getUserIntent", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "userIntent", "", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "getScenarioContexts", "()Ljava/util/List;", "scenarioContexts", "getAdditionalContexts", "additionalContexts", "Companion", "Inbound", "Outbound", "Internal", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/LinkResolved$Inbound;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/LinkResolved$Internal;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/LinkResolved$Outbound;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class LinkResolved extends com.paypal.oslo.core.telemetry.analytics.schema.event.generic.GenericAnalyticsEvent {

    @java.lang.Deprecated
    public static final java.lang.String LINK_RESOLVED = "link_resolved";
    private final java.lang.String eventName;
    private final com.paypal.oslo.core.telemetry.analytics.event.EventType eventType;
    private static final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.LinkResolved.Companion Companion = new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.LinkResolved.Companion(null);
    public static final int $stable = 8;

    protected abstract java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> getAdditionalContexts();

    protected abstract java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> getScenarioContexts();

    protected abstract com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntent();

    private LinkResolved() {
        super(null);
        this.eventName = "link_resolved";
        this.eventType = com.paypal.oslo.core.telemetry.analytics.event.EventType.Activity;
    }

    @Override // com.paypal.oslo.core.telemetry.analytics.schema.event.generic.GenericAnalyticsEvent
    public java.lang.String getEventName() {
        return this.eventName;
    }

    @Override // com.paypal.oslo.core.telemetry.analytics.schema.event.generic.GenericAnalyticsEvent
    public com.paypal.oslo.core.telemetry.analytics.event.EventType getEventType() {
        return this.eventType;
    }

    @Override // com.paypal.oslo.core.telemetry.analytics.schema.event.generic.GenericAnalyticsEvent
    public void track(com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker analyticsTracker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsTracker, "");
        analyticsTracker.track(new com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent(getEventType(), kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{getUserIntent(), com.paypal.oslo.core.telemetry.analytics.schema.event.generic.GenericAnalyticsEventKt.metadataContext(this)}), (java.lang.Iterable) getScenarioContexts()), (java.lang.Iterable) getAdditionalContexts())));
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÄ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bHÄ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J@\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0015X\u0094\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0012R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0015X\u0095\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010\u0014R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\t0\b8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/LinkResolved$Inbound;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/LinkResolved;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "userIntent", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/TrafficSourceContext;", "trafficSource", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "error", "", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "additionalContexts", "<init>", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/TrafficSourceContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "component2", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/TrafficSourceContext;", "component3", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "component4", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/TrafficSourceContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;Ljava/util/List;)Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/LinkResolved$Inbound;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getUserIntent", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/TrafficSourceContext;", "getTrafficSource", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "getError", "Ljava/util/List;", "getAdditionalContexts", "getScenarioContexts", "scenarioContexts"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Inbound extends com.paypal.oslo.core.telemetry.analytics.schema.event.generic.LinkResolved {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> additionalContexts;
        private final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext error;
        private final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext trafficSource;
        private final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Inbound(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext trafficSourceContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext, java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntentContext, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trafficSourceContext, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.userIntent = userIntentContext;
            this.trafficSource = trafficSourceContext;
            this.error = errorContext;
            this.additionalContexts = list;
        }

        @Override // com.paypal.oslo.core.telemetry.analytics.schema.event.generic.LinkResolved
        protected final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntent() {
            return this.userIntent;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext getTrafficSource() {
            return this.trafficSource;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext getError() {
            return this.error;
        }

        public /* synthetic */ Inbound(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext trafficSourceContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(userIntentContext, trafficSourceContext, (i & 4) != 0 ? null : errorContext, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
        }

        @Override // com.paypal.oslo.core.telemetry.analytics.schema.event.generic.LinkResolved
        protected final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> getAdditionalContexts() {
            return this.additionalContexts;
        }

        @Override // com.paypal.oslo.core.telemetry.analytics.schema.event.generic.LinkResolved
        protected final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> getScenarioContexts() {
            return kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{this.trafficSource, this.error});
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext = this.userIntent;
            com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext trafficSourceContext = this.trafficSource;
            com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext = this.error;
            java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list = this.additionalContexts;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Inbound(userIntent=");
            sb.append(userIntentContext);
            sb.append(", trafficSource=");
            sb.append(trafficSourceContext);
            sb.append(", error=");
            sb.append(errorContext);
            sb.append(", additionalContexts=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.userIntent.hashCode();
            int hashCode2 = this.trafficSource.hashCode();
            com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext = this.error;
            return (((((hashCode * 31) + hashCode2) * 31) + (errorContext == null ? 0 : errorContext.hashCode())) * 31) + this.additionalContexts.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.telemetry.analytics.schema.event.generic.LinkResolved.Inbound)) {
                return false;
            }
            com.paypal.oslo.core.telemetry.analytics.schema.event.generic.LinkResolved.Inbound inbound = (com.paypal.oslo.core.telemetry.analytics.schema.event.generic.LinkResolved.Inbound) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.userIntent, inbound.userIntent) && kotlin.jvm.internal.Intrinsics.areEqual(this.trafficSource, inbound.trafficSource) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, inbound.error) && kotlin.jvm.internal.Intrinsics.areEqual(this.additionalContexts, inbound.additionalContexts);
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.LinkResolved.Inbound copy(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntent, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext trafficSource, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext error, java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> additionalContexts) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntent, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trafficSource, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalContexts, "");
            return new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.LinkResolved.Inbound(userIntent, trafficSource, error, additionalContexts);
        }

        protected final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> component4() {
            return this.additionalContexts;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext getError() {
            return this.error;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext getTrafficSource() {
            return this.trafficSource;
        }

        /* renamed from: component1, reason: from getter */
        protected final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntent() {
            return this.userIntent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.event.generic.LinkResolved.Inbound copy$default(com.paypal.oslo.core.telemetry.analytics.schema.event.generic.LinkResolved.Inbound inbound, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext trafficSourceContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                userIntentContext = inbound.userIntent;
            }
            if ((i & 2) != 0) {
                trafficSourceContext = inbound.trafficSource;
            }
            if ((i & 4) != 0) {
                errorContext = inbound.error;
            }
            if ((i & 8) != 0) {
                list = inbound.additionalContexts;
            }
            return inbound.copy(userIntentContext, trafficSourceContext, errorContext, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÄ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bHÄ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J@\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0015X\u0094\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0012R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0015X\u0095\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010\u0014R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\t0\b8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/LinkResolved$Outbound;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/LinkResolved;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "userIntent", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/TrafficDestinationContext;", "trafficDestination", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "error", "", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "additionalContexts", "<init>", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/TrafficDestinationContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "component2", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/TrafficDestinationContext;", "component3", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "component4", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/TrafficDestinationContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;Ljava/util/List;)Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/LinkResolved$Outbound;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getUserIntent", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/TrafficDestinationContext;", "getTrafficDestination", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "getError", "Ljava/util/List;", "getAdditionalContexts", "getScenarioContexts", "scenarioContexts"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Outbound extends com.paypal.oslo.core.telemetry.analytics.schema.event.generic.LinkResolved {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> additionalContexts;
        private final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext error;
        private final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficDestinationContext trafficDestination;
        private final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Outbound(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficDestinationContext trafficDestinationContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext, java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntentContext, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trafficDestinationContext, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.userIntent = userIntentContext;
            this.trafficDestination = trafficDestinationContext;
            this.error = errorContext;
            this.additionalContexts = list;
        }

        @Override // com.paypal.oslo.core.telemetry.analytics.schema.event.generic.LinkResolved
        protected final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntent() {
            return this.userIntent;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficDestinationContext getTrafficDestination() {
            return this.trafficDestination;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext getError() {
            return this.error;
        }

        public /* synthetic */ Outbound(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficDestinationContext trafficDestinationContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(userIntentContext, trafficDestinationContext, (i & 4) != 0 ? null : errorContext, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
        }

        @Override // com.paypal.oslo.core.telemetry.analytics.schema.event.generic.LinkResolved
        protected final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> getAdditionalContexts() {
            return this.additionalContexts;
        }

        @Override // com.paypal.oslo.core.telemetry.analytics.schema.event.generic.LinkResolved
        protected final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> getScenarioContexts() {
            return kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{this.trafficDestination, this.error});
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext = this.userIntent;
            com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficDestinationContext trafficDestinationContext = this.trafficDestination;
            com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext = this.error;
            java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list = this.additionalContexts;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Outbound(userIntent=");
            sb.append(userIntentContext);
            sb.append(", trafficDestination=");
            sb.append(trafficDestinationContext);
            sb.append(", error=");
            sb.append(errorContext);
            sb.append(", additionalContexts=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.userIntent.hashCode();
            int hashCode2 = this.trafficDestination.hashCode();
            com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext = this.error;
            return (((((hashCode * 31) + hashCode2) * 31) + (errorContext == null ? 0 : errorContext.hashCode())) * 31) + this.additionalContexts.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.telemetry.analytics.schema.event.generic.LinkResolved.Outbound)) {
                return false;
            }
            com.paypal.oslo.core.telemetry.analytics.schema.event.generic.LinkResolved.Outbound outbound = (com.paypal.oslo.core.telemetry.analytics.schema.event.generic.LinkResolved.Outbound) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.userIntent, outbound.userIntent) && kotlin.jvm.internal.Intrinsics.areEqual(this.trafficDestination, outbound.trafficDestination) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, outbound.error) && kotlin.jvm.internal.Intrinsics.areEqual(this.additionalContexts, outbound.additionalContexts);
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.LinkResolved.Outbound copy(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntent, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficDestinationContext trafficDestination, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext error, java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> additionalContexts) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntent, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trafficDestination, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalContexts, "");
            return new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.LinkResolved.Outbound(userIntent, trafficDestination, error, additionalContexts);
        }

        protected final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> component4() {
            return this.additionalContexts;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext getError() {
            return this.error;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficDestinationContext getTrafficDestination() {
            return this.trafficDestination;
        }

        /* renamed from: component1, reason: from getter */
        protected final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntent() {
            return this.userIntent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.event.generic.LinkResolved.Outbound copy$default(com.paypal.oslo.core.telemetry.analytics.schema.event.generic.LinkResolved.Outbound outbound, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficDestinationContext trafficDestinationContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                userIntentContext = outbound.userIntent;
            }
            if ((i & 2) != 0) {
                trafficDestinationContext = outbound.trafficDestination;
            }
            if ((i & 4) != 0) {
                errorContext = outbound.error;
            }
            if ((i & 8) != 0) {
                list = outbound.additionalContexts;
            }
            return outbound.copy(userIntentContext, trafficDestinationContext, errorContext, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÄ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bHÄ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J>\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0015X\u0094\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0012R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0015X\u0095\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010\u0014R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\t0\b8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/LinkResolved$Internal;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/LinkResolved;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "userIntent", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/NavigationContext;", "navigation", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "error", "", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "additionalContexts", "<init>", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/NavigationContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "component2", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/NavigationContext;", "component3", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "component4", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/NavigationContext;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;Ljava/util/List;)Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/LinkResolved$Internal;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getUserIntent", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/NavigationContext;", "getNavigation", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "getError", "Ljava/util/List;", "getAdditionalContexts", "getScenarioContexts", "scenarioContexts"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* data */ class Internal extends com.paypal.oslo.core.telemetry.analytics.schema.event.generic.LinkResolved {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> additionalContexts;
        private final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext error;
        private final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext navigation;
        private final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Internal(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext navigationContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext, java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntentContext, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationContext, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorContext, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.userIntent = userIntentContext;
            this.navigation = navigationContext;
            this.error = errorContext;
            this.additionalContexts = list;
        }

        @Override // com.paypal.oslo.core.telemetry.analytics.schema.event.generic.LinkResolved
        protected final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntent() {
            return this.userIntent;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext getNavigation() {
            return this.navigation;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext getError() {
            return this.error;
        }

        public /* synthetic */ Internal(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext navigationContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(userIntentContext, navigationContext, errorContext, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
        }

        @Override // com.paypal.oslo.core.telemetry.analytics.schema.event.generic.LinkResolved
        protected final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> getAdditionalContexts() {
            return this.additionalContexts;
        }

        @Override // com.paypal.oslo.core.telemetry.analytics.schema.event.generic.LinkResolved
        protected final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> getScenarioContexts() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{this.navigation, this.error});
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext = this.userIntent;
            com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext navigationContext = this.navigation;
            com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext = this.error;
            java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list = this.additionalContexts;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Internal(userIntent=");
            sb.append(userIntentContext);
            sb.append(", navigation=");
            sb.append(navigationContext);
            sb.append(", error=");
            sb.append(errorContext);
            sb.append(", additionalContexts=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.userIntent.hashCode() * 31) + this.navigation.hashCode()) * 31) + this.error.hashCode()) * 31) + this.additionalContexts.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.telemetry.analytics.schema.event.generic.LinkResolved.Internal)) {
                return false;
            }
            com.paypal.oslo.core.telemetry.analytics.schema.event.generic.LinkResolved.Internal internal2 = (com.paypal.oslo.core.telemetry.analytics.schema.event.generic.LinkResolved.Internal) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.userIntent, internal2.userIntent) && kotlin.jvm.internal.Intrinsics.areEqual(this.navigation, internal2.navigation) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, internal2.error) && kotlin.jvm.internal.Intrinsics.areEqual(this.additionalContexts, internal2.additionalContexts);
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.LinkResolved.Internal copy(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntent, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext navigation, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext error, java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> additionalContexts) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntent, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigation, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalContexts, "");
            return new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.LinkResolved.Internal(userIntent, navigation, error, additionalContexts);
        }

        protected final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> component4() {
            return this.additionalContexts;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext getError() {
            return this.error;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext getNavigation() {
            return this.navigation;
        }

        /* renamed from: component1, reason: from getter */
        protected final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntent() {
            return this.userIntent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.event.generic.LinkResolved.Internal copy$default(com.paypal.oslo.core.telemetry.analytics.schema.event.generic.LinkResolved.Internal internal2, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext navigationContext, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                userIntentContext = internal2.userIntent;
            }
            if ((i & 2) != 0) {
                navigationContext = internal2.navigation;
            }
            if ((i & 4) != 0) {
                errorContext = internal2.error;
            }
            if ((i & 8) != 0) {
                list = internal2.additionalContexts;
            }
            return internal2.copy(userIntentContext, navigationContext, errorContext, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/LinkResolved$Companion;", "", "<init>", "()V", "", "LINK_RESOLVED", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ LinkResolved(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
