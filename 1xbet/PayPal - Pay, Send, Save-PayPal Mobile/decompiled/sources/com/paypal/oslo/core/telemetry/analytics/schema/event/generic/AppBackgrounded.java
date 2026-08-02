package com.paypal.oslo.core.telemetry.analytics.schema.event.generic;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u0000 +2\u00020\u0001:\u0001+B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0011R\u001a\u0010#\u001a\u00020\u001c8\u0017X\u0097D¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u001eR\u001a\u0010'\u001a\u00020&8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/AppBackgrounded;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/GenericAnalyticsEvent;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "userIntent", "", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "contexts", "<init>", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;Ljava/util/List;)V", "Lcom/paypal/oslo/core/telemetry/analytics/AnalyticsTracker;", "analyticsTracker", "", "track", "(Lcom/paypal/oslo/core/telemetry/analytics/AnalyticsTracker;)V", "component1", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;Ljava/util/List;)Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/AppBackgrounded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getUserIntent", "Ljava/util/List;", "getContexts", "eventName", "Ljava/lang/String;", "getEventName", "Lcom/paypal/oslo/core/telemetry/analytics/event/EventType;", "eventType", "Lcom/paypal/oslo/core/telemetry/analytics/event/EventType;", "getEventType", "()Lcom/paypal/oslo/core/telemetry/analytics/event/EventType;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AppBackgrounded extends com.paypal.oslo.core.telemetry.analytics.schema.event.generic.GenericAnalyticsEvent {

    @java.lang.Deprecated
    public static final java.lang.String APP_BACKGROUNDED = "app_backgrounded";
    private final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> contexts;
    private final java.lang.String eventName;
    private final com.paypal.oslo.core.telemetry.analytics.event.EventType eventType;
    private final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntent;
    private static final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.AppBackgrounded.Companion Companion = new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.AppBackgrounded.Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AppBackgrounded(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntentContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.userIntent = userIntentContext;
        this.contexts = list;
        this.eventName = APP_BACKGROUNDED;
        this.eventType = com.paypal.oslo.core.telemetry.analytics.event.EventType.Disappeared;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntent() {
        return this.userIntent;
    }

    public /* synthetic */ AppBackgrounded(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(userIntentContext, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    public final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> getContexts() {
        return this.contexts;
    }

    @Override // com.paypal.oslo.core.telemetry.analytics.schema.event.generic.GenericAnalyticsEvent
    public final java.lang.String getEventName() {
        return this.eventName;
    }

    @Override // com.paypal.oslo.core.telemetry.analytics.schema.event.generic.GenericAnalyticsEvent
    public final com.paypal.oslo.core.telemetry.analytics.event.EventType getEventType() {
        return this.eventType;
    }

    @Override // com.paypal.oslo.core.telemetry.analytics.schema.event.generic.GenericAnalyticsEvent
    public final void track(com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker analyticsTracker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsTracker, "");
        analyticsTracker.track(new com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent(getEventType(), kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{this.userIntent, com.paypal.oslo.core.telemetry.analytics.schema.event.generic.GenericAnalyticsEventKt.metadataContext(this)}), (java.lang.Iterable) this.contexts)));
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/AppBackgrounded$Companion;", "", "<init>", "()V", "", "APP_BACKGROUNDED", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext = this.userIntent;
        java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list = this.contexts;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AppBackgrounded(userIntent=");
        sb.append(userIntentContext);
        sb.append(", contexts=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.userIntent.hashCode() * 31) + this.contexts.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.telemetry.analytics.schema.event.generic.AppBackgrounded)) {
            return false;
        }
        com.paypal.oslo.core.telemetry.analytics.schema.event.generic.AppBackgrounded appBackgrounded = (com.paypal.oslo.core.telemetry.analytics.schema.event.generic.AppBackgrounded) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.userIntent, appBackgrounded.userIntent) && kotlin.jvm.internal.Intrinsics.areEqual(this.contexts, appBackgrounded.contexts);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.event.generic.AppBackgrounded copy(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntent, java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> contexts) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contexts, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.AppBackgrounded(userIntent, contexts);
    }

    public final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> component2() {
        return this.contexts;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntent() {
        return this.userIntent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.event.generic.AppBackgrounded copy$default(com.paypal.oslo.core.telemetry.analytics.schema.event.generic.AppBackgrounded appBackgrounded, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            userIntentContext = appBackgrounded.userIntent;
        }
        if ((i & 2) != 0) {
            list = appBackgrounded.contexts;
        }
        return appBackgrounded.copy(userIntentContext, list);
    }
}
